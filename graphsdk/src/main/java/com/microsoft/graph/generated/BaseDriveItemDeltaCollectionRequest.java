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
 * The class for the Base Drive Item Delta Collection Request.
 */
public class BaseDriveItemDeltaCollectionRequest extends BaseCollectionRequest<BaseDriveItemDeltaCollectionResponse, IDriveItemDeltaCollectionPage> implements IBaseDriveItemDeltaCollectionRequest {


    /**
     * The request for this DriveItemDelta
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseDriveItemDeltaCollectionRequest(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseDriveItemDeltaCollectionResponse.class, IDriveItemDeltaCollectionPage.class);
    }


    public void get(final ICallback<IDriveItemDeltaCollectionPage> callback) {
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

    public IDriveItemDeltaCollectionPage get() throws ClientException {
        final BaseDriveItemDeltaCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IDriveItemDeltaCollectionPage buildFromResponse(final BaseDriveItemDeltaCollectionResponse response) {
        final IDriveItemDeltaCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DriveItemDeltaCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, /* token */ null);
        } else {
            builder = null;
        }
        final IDriveItemDeltaCollectionPage page = new DriveItemDeltaCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IDriveItemDeltaCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (IDriveItemDeltaCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IDriveItemDeltaCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value+""));
        return (IDriveItemDeltaCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IDriveItemDeltaCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (IDriveItemDeltaCollectionRequest)this;
    }

}
