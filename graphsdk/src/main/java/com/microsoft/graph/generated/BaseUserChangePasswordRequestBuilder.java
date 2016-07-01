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
 * The class for the Base User Change Password Request Builder.
 */
public class BaseUserChangePasswordRequestBuilder extends BasePostMethodRequestBuilder {

    /**
     * The request builder for this UserChangePassword
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseUserChangePasswordRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options, final String currentPassword, final String newPassword) {
        super(requestUrl, client, options);
        mBodyParams.put("currentPassword", currentPassword);
          mBodyParams.put("newPassword", newPassword);
      }

    /**
     * Creates the IUserChangePasswordRequest
     *
     * @return The IUserChangePasswordRequest instance
     */
    public IUserChangePasswordRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IUserChangePasswordRequest with specific options instead of the existing options
     *
     * @param options the options for the request
     * @return The IUserChangePasswordRequest instance
     */
    public IUserChangePasswordRequest buildRequest(final List<Option> options) {
        UserChangePasswordRequest request = new UserChangePasswordRequest(
            getRequestUrl(), 
            getClient(), 
            options
        );

        if (hasParameter("currentPassword")) {
            request.mBody.currentPassword = getParameter("currentPassword");
        }
          if (hasParameter("newPassword")) {
            request.mBody.newPassword = getParameter("newPassword");
        }
  
      return request;
    }
}
