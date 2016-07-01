// Template Source: Templates/Android/generated/IBaseEntityRequest.java.tt
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
 * The interface for the Base Conversation Request.
 */
public interface IBaseConversationRequest extends IHttpRequest {

    /**
     * Gets the Conversation from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<Conversation> callback);

    /**
     * Gets the Conversation from the service
     * @return The Conversation from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Conversation get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Conversation with a source
     * @param sourceConversation The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final Conversation sourceConversation, final ICallback<Conversation> callback);

    /**
     * Patches this Conversation with a source
     * @param sourceConversation The source object with updates
     * @return The updated Conversation
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Conversation patch(final Conversation sourceConversation) throws ClientException;

    /**
     * Posts a Conversation with a new object
     * @param newConversation The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final Conversation newConversation, final ICallback<Conversation> callback);

    /**
     * Posts a Conversation with a new object
     * @param newConversation The new object to create
     * @return The created Conversation
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Conversation post(final Conversation newConversation) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseConversationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseConversationRequest expand(final String value);

}
