// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Range Border Collection Request.
 */
public class BaseWorkbookRangeBorderCollectionRequest extends BaseCollectionRequest<BaseWorkbookRangeBorderCollectionResponse, IWorkbookRangeBorderCollectionPage> implements IBaseWorkbookRangeBorderCollectionRequest {

    /**
     * The request builder for this collection of WorkbookRangeBorder
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseWorkbookRangeBorderCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseWorkbookRangeBorderCollectionResponse.class, IWorkbookRangeBorderCollectionPage.class);
    }

    public void get(final ICallback<IWorkbookRangeBorderCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IWorkbookRangeBorderCollectionPage get() throws ClientException {
        final BaseWorkbookRangeBorderCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WorkbookRangeBorder newWorkbookRangeBorder, final ICallback<WorkbookRangeBorder> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WorkbookRangeBorderRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newWorkbookRangeBorder, callback);
    }

    public WorkbookRangeBorder post(final WorkbookRangeBorder newWorkbookRangeBorder) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WorkbookRangeBorderRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newWorkbookRangeBorder);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IWorkbookRangeBorderCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (WorkbookRangeBorderCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IWorkbookRangeBorderCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (WorkbookRangeBorderCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IWorkbookRangeBorderCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (WorkbookRangeBorderCollectionRequest)this;
    }

    public IWorkbookRangeBorderCollectionPage buildFromResponse(final BaseWorkbookRangeBorderCollectionResponse response) {
        final IWorkbookRangeBorderCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WorkbookRangeBorderCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WorkbookRangeBorderCollectionPage page = new WorkbookRangeBorderCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
