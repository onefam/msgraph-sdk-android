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
 * The class for the Base Conversation Thread Collection Request.
 */
public class BaseConversationThreadCollectionRequest extends BaseCollectionRequest<BaseConversationThreadCollectionResponse, IConversationThreadCollectionPage> implements IBaseConversationThreadCollectionRequest {

    /**
     * The request builder for this collection of ConversationThread
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseConversationThreadCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseConversationThreadCollectionResponse.class, IConversationThreadCollectionPage.class);
    }

    public void get(final ICallback<IConversationThreadCollectionPage> callback) {
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

    public IConversationThreadCollectionPage get() throws ClientException {
        final BaseConversationThreadCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ConversationThread newConversationThread, final ICallback<ConversationThread> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ConversationThreadRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newConversationThread, callback);
    }

    public ConversationThread post(final ConversationThread newConversationThread) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ConversationThreadRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newConversationThread);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IConversationThreadCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (ConversationThreadCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IConversationThreadCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (ConversationThreadCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IConversationThreadCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (ConversationThreadCollectionRequest)this;
    }

    public IConversationThreadCollectionPage buildFromResponse(final BaseConversationThreadCollectionResponse response) {
        final IConversationThreadCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ConversationThreadCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ConversationThreadCollectionPage page = new ConversationThreadCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
