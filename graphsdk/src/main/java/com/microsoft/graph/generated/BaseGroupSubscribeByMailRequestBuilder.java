// Template Source: Templates/Android/generated/BaseMethodRequestBuilder.java.tt
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
 * The class for the Base Group Subscribe By Mail Request Builder.
 */
public class BaseGroupSubscribeByMailRequestBuilder extends BaseGetMethodRequestBuilder {

    /**
     * The request builder for this GroupSubscribeByMail
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseGroupSubscribeByMailRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    /**
     * Creates the IGroupSubscribeByMailRequest
     *
     * @return The IGroupSubscribeByMailRequest instance
     */
    public IGroupSubscribeByMailRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IGroupSubscribeByMailRequest with specific options instead of the existing options
     *
     * @param options the options for the request
     * @return The IGroupSubscribeByMailRequest instance
     */
    public IGroupSubscribeByMailRequest buildRequest(final List<Option> options) {
        GroupSubscribeByMailRequest request = new GroupSubscribeByMailRequest(
            getRequestUrl(), 
            getClient(), 
            options
        );


      return request;
    }
}
