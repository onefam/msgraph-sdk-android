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
 * The class for the Base Workbook Table Collection Request.
 */
public class BaseWorkbookTableCollectionRequest extends BaseCollectionRequest<BaseWorkbookTableCollectionResponse, IWorkbookTableCollectionPage> implements IBaseWorkbookTableCollectionRequest {

    /**
     * The request builder for this collection of WorkbookTable
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseWorkbookTableCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseWorkbookTableCollectionResponse.class, IWorkbookTableCollectionPage.class);
    }

    public void get(final ICallback<IWorkbookTableCollectionPage> callback) {
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

    public IWorkbookTableCollectionPage get() throws ClientException {
        final BaseWorkbookTableCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WorkbookTable newWorkbookTable, final ICallback<WorkbookTable> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WorkbookTableRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newWorkbookTable, callback);
    }

    public WorkbookTable post(final WorkbookTable newWorkbookTable) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WorkbookTableRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newWorkbookTable);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IWorkbookTableCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (WorkbookTableCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IWorkbookTableCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (WorkbookTableCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IWorkbookTableCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (WorkbookTableCollectionRequest)this;
    }

    public IWorkbookTableCollectionPage buildFromResponse(final BaseWorkbookTableCollectionResponse response) {
        final IWorkbookTableCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WorkbookTableCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WorkbookTableCollectionPage page = new WorkbookTableCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
