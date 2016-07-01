// Template Source: Templates/Android/extensions/EntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Subscription Collection Request Builder.
 */
public class SubscriptionCollectionRequestBuilder extends BaseSubscriptionCollectionRequestBuilder implements ISubscriptionCollectionRequestBuilder {

    /**
     * The request builder for this collection of Subscription
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public SubscriptionCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }
}
