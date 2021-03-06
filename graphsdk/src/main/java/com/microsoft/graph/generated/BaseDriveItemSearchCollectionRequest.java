// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

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
 * The class for the Base Drive Item Search Collection Request.
 */
public class BaseDriveItemSearchCollectionRequest extends BaseCollectionRequest<BaseDriveItemSearchCollectionResponse, IDriveItemSearchCollectionPage> implements IBaseDriveItemSearchCollectionRequest {


    /**
     * The request for this DriveItemSearch
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseDriveItemSearchCollectionRequest(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options, BaseDriveItemSearchCollectionResponse.class, IDriveItemSearchCollectionPage.class);
    }


    public void get(final ICallback<IDriveItemSearchCollectionPage> callback) {
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

    public IDriveItemSearchCollectionPage get() throws ClientException {
        final BaseDriveItemSearchCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IDriveItemSearchCollectionPage buildFromResponse(final BaseDriveItemSearchCollectionResponse response) {
        final IDriveItemSearchCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DriveItemSearchCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, /* q */ null);
        } else {
            builder = null;
        }
        final IDriveItemSearchCollectionPage page = new DriveItemSearchCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IDriveItemSearchCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (IDriveItemSearchCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IDriveItemSearchCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value+""));
        return (IDriveItemSearchCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IDriveItemSearchCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (IDriveItemSearchCollectionRequest)this;
    }

}
