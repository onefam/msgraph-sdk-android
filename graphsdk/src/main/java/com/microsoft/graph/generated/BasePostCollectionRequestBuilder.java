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
 * The class for the Base Post Collection Request Builder.
 */
public class BasePostCollectionRequestBuilder extends BaseRequestBuilder implements IBasePostCollectionRequestBuilder {

    /**
     * The request builder for this collection of ConversationThread
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BasePostCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    public IPostCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IPostCollectionRequest buildRequest(final List<Option> options) {
        return new PostCollectionRequest(getRequestUrl(), getClient(), options);
    }

    public IPostRequestBuilder byId(final String id) {
        return new PostRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
