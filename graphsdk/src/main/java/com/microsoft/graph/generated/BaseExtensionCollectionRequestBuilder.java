// Template Source: Templates/Android/generated/BaseEntityCollectionRequestBuilder.java.tt
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
 * The class for the Base Extension Collection Request Builder.
 */
public class BaseExtensionCollectionRequestBuilder extends BaseRequestBuilder implements IBaseExtensionCollectionRequestBuilder {

    /**
     * The request builder for this collection of Post
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseExtensionCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    public IExtensionCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IExtensionCollectionRequest buildRequest(final List<Option> options) {
        return new ExtensionCollectionRequest(getRequestUrl(), getClient(), options);
    }

    public IExtensionRequestBuilder byId(final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
