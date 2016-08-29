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
 * The class for the Base Conversation Request.
 */
public class BaseConversationRequest extends BaseRequest implements IBaseConversationRequest {

    /**
     * The request for the Conversation
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseConversationRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the Conversation from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<Conversation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Conversation from the service
     * @return The Conversation from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Conversation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this Conversation with a source
     * @param sourceConversation The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final Conversation sourceConversation, final ICallback<Conversation> callback) {
        send(HttpMethod.PATCH, callback, sourceConversation);
    }

    /**
     * Patches this Conversation with a source
     * @param sourceConversation The source object with updates
     * @return The updated Conversation
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Conversation patch(final Conversation sourceConversation) throws ClientException {
        return send(HttpMethod.PATCH, sourceConversation);
    }

    /**
     * Creates a Conversation with a new object
     * @param newConversation The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final Conversation newConversation, final ICallback<Conversation> callback) {
        send(HttpMethod.POST, callback, newConversation);
    }

    /**
     * Creates a Conversation with a new object
     * @param newConversation The new object to create
     * @return The created Conversation
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Conversation post(final Conversation newConversation) throws ClientException {
        return send(HttpMethod.POST, newConversation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IConversationRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ConversationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IConversationRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ConversationRequest)this;
     }

}
