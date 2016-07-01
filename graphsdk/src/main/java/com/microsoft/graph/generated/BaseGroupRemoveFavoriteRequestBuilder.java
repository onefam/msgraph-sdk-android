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
 * The class for the Base Group Remove Favorite Request Builder.
 */
public class BaseGroupRemoveFavoriteRequestBuilder extends BaseGetMethodRequestBuilder {

    /**
     * The request builder for this GroupRemoveFavorite
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseGroupRemoveFavoriteRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    /**
     * Creates the IGroupRemoveFavoriteRequest
     *
     * @return The IGroupRemoveFavoriteRequest instance
     */
    public IGroupRemoveFavoriteRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IGroupRemoveFavoriteRequest with specific options instead of the existing options
     *
     * @param options the options for the request
     * @return The IGroupRemoveFavoriteRequest instance
     */
    public IGroupRemoveFavoriteRequest buildRequest(final List<Option> options) {
        GroupRemoveFavoriteRequest request = new GroupRemoveFavoriteRequest(
            getRequestUrl(), 
            getClient(), 
            options
        );


      return request;
    }
}
