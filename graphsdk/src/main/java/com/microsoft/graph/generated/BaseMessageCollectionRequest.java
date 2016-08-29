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
 * The class for the Base Message Collection Request.
 */
public class BaseMessageCollectionRequest extends BaseCollectionRequest<BaseMessageCollectionResponse, IMessageCollectionPage> implements IBaseMessageCollectionRequest {

    /**
     * The request builder for this collection of Message
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseMessageCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseMessageCollectionResponse.class, IMessageCollectionPage.class);
    }

    public void get(final ICallback<IMessageCollectionPage> callback) {
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

    public IMessageCollectionPage get() throws ClientException {
        final BaseMessageCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Message newMessage, final ICallback<Message> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new MessageRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newMessage, callback);
    }

    public Message post(final Message newMessage) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new MessageRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newMessage);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IMessageCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (MessageCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IMessageCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (MessageCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IMessageCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (MessageCollectionRequest)this;
    }

    public IMessageCollectionPage buildFromResponse(final BaseMessageCollectionResponse response) {
        final IMessageCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new MessageCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final MessageCollectionPage page = new MessageCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
