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
 * The class for the Base Drive Item Delta Collection Request Builder.
 */
public class BaseDriveItemDeltaCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IBaseDriveItemDeltaCollectionRequestBuilder {

    /**
     * The request builder for this collection of DriveItem
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseDriveItemDeltaCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final String token) {
        super(requestUrl, client, requestOptions);
        mFunctionOptions.add(new FunctionOption("token", token));
      }
    /**
     * The request builder for this collection of DriveItem
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseDriveItemDeltaCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IDriveItemDeltaCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDriveItemDeltaCollectionRequest buildRequest(final List<Option> requestOptions) {
        DriveItemDeltaCollectionRequest request = new DriveItemDeltaCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : mFunctionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
