// Template Source: Templates/Android/generated/BaseEntityReferenceRequest.java.tt
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
 * The class for the Base Directory Object Reference Request.
 */
public class BaseDirectoryObjectReferenceRequest extends BaseRequest implements IBaseDirectoryObjectReferenceRequest {

    /**
     * The request for the DirectoryObject
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseDirectoryObjectReferenceRequest(String requestUrl, IBaseClient client, List<Option> options) {
        super(requestUrl, client, options, DirectoryObject.class);
    }

    public void delete(final ICallback<DirectoryObject> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public DirectoryObject delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

}
