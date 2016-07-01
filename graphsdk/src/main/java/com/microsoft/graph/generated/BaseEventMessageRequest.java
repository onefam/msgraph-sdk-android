// Template Source: Templates/Android/generated/BaseEntityRequest.java.tt
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
 * The class for the Base Event Message Request.
 */
public class BaseEventMessageRequest extends BaseRequest implements IBaseEventMessageRequest {

    /**
     * The request for the EventMessage
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseEventMessageRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> options,
            final Class responseClass) {
        super(requestUrl, client, options, responseClass);
    }

    /**
     * Gets the EventMessage from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<EventMessage> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EventMessage from the service
     * @return The EventMessage from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public EventMessage get() throws ClientException {
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
     * Patches this EventMessage with a source
     * @param sourceEventMessage The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final EventMessage sourceEventMessage, final ICallback<EventMessage> callback) {
        send(HttpMethod.PATCH, callback, sourceEventMessage);
    }

    /**
     * Patches this EventMessage with a source
     * @param sourceEventMessage The source object with updates
     * @return The updated EventMessage
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public EventMessage patch(final EventMessage sourceEventMessage) throws ClientException {
        return send(HttpMethod.PATCH, sourceEventMessage);
    }

    /**
     * Creates a EventMessage with a new object
     * @param newEventMessage The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final EventMessage newEventMessage, final ICallback<EventMessage> callback) {
        send(HttpMethod.POST, callback, newEventMessage);
    }

    /**
     * Creates a EventMessage with a new object
     * @param newEventMessage The new object to create
     * @return The created EventMessage
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public EventMessage post(final EventMessage newEventMessage) throws ClientException {
        return send(HttpMethod.POST, newEventMessage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IEventMessageRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (EventMessageRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IEventMessageRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (EventMessageRequest)this;
     }

}
