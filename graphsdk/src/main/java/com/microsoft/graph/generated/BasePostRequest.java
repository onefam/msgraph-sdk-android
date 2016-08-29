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
 * The class for the Base Post Request.
 */
public class BasePostRequest extends BaseRequest implements IBasePostRequest {

    /**
     * The request for the Post
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BasePostRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the Post from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<Post> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Post from the service
     * @return The Post from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Post get() throws ClientException {
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
     * Patches this Post with a source
     * @param sourcePost The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final Post sourcePost, final ICallback<Post> callback) {
        send(HttpMethod.PATCH, callback, sourcePost);
    }

    /**
     * Patches this Post with a source
     * @param sourcePost The source object with updates
     * @return The updated Post
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Post patch(final Post sourcePost) throws ClientException {
        return send(HttpMethod.PATCH, sourcePost);
    }

    /**
     * Creates a Post with a new object
     * @param newPost The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final Post newPost, final ICallback<Post> callback) {
        send(HttpMethod.POST, callback, newPost);
    }

    /**
     * Creates a Post with a new object
     * @param newPost The new object to create
     * @return The created Post
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Post post(final Post newPost) throws ClientException {
        return send(HttpMethod.POST, newPost);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IPostRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (PostRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IPostRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (PostRequest)this;
     }

}
