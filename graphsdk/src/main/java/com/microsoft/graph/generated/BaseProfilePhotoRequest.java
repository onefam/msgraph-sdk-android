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
 * The class for the Base Profile Photo Request.
 */
public class BaseProfilePhotoRequest extends BaseRequest implements IBaseProfilePhotoRequest {

    /**
     * The request for the ProfilePhoto
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseProfilePhotoRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> options,
            final Class responseClass) {
        super(requestUrl, client, options, responseClass);
    }

    /**
     * Gets the ProfilePhoto from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<ProfilePhoto> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ProfilePhoto from the service
     * @return The ProfilePhoto from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ProfilePhoto get() throws ClientException {
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
     * Patches this ProfilePhoto with a source
     * @param sourceProfilePhoto The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final ProfilePhoto sourceProfilePhoto, final ICallback<ProfilePhoto> callback) {
        send(HttpMethod.PATCH, callback, sourceProfilePhoto);
    }

    /**
     * Patches this ProfilePhoto with a source
     * @param sourceProfilePhoto The source object with updates
     * @return The updated ProfilePhoto
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ProfilePhoto patch(final ProfilePhoto sourceProfilePhoto) throws ClientException {
        return send(HttpMethod.PATCH, sourceProfilePhoto);
    }

    /**
     * Creates a ProfilePhoto with a new object
     * @param newProfilePhoto The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final ProfilePhoto newProfilePhoto, final ICallback<ProfilePhoto> callback) {
        send(HttpMethod.POST, callback, newProfilePhoto);
    }

    /**
     * Creates a ProfilePhoto with a new object
     * @param newProfilePhoto The new object to create
     * @return The created ProfilePhoto
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ProfilePhoto post(final ProfilePhoto newProfilePhoto) throws ClientException {
        return send(HttpMethod.POST, newProfilePhoto);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IProfilePhotoRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ProfilePhotoRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IProfilePhotoRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ProfilePhotoRequest)this;
     }

}
