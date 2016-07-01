// Template Source: Templates/Android/generated/BaseEntityRequestBuilder.java.tt
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
 * The class for the Base Directory Role Request Builder.
 */
public class BaseDirectoryRoleRequestBuilder extends BaseRequestBuilder implements IBaseDirectoryRoleRequestBuilder {

    /**
     * The request builder for the DirectoryRole
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseDirectoryRoleRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    /**
     * Creates the request
     */
    public IDirectoryRoleRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
     */
    public IDirectoryRoleRequest buildRequest(final List<Option> options) {
        return new DirectoryRoleRequest(getRequestUrl(), getClient(), options);
    }

    public IDirectoryObjectCollectionWithReferencesRequestBuilder getMembers() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder getMembers(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id, getClient(), null);
    }
}
