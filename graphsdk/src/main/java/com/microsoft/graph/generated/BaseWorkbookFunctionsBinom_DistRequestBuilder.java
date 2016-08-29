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
 * The class for the Base Workbook Functions Binom_Dist Request Builder.
 */
public class BaseWorkbookFunctionsBinom_DistRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBinom_Dist
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsBinom_DistRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement numberS, final com.google.gson.JsonElement trials, final com.google.gson.JsonElement probabilityS, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("numberS", numberS);
        mBodyParams.put("trials", trials);
        mBodyParams.put("probabilityS", probabilityS);
        mBodyParams.put("cumulative", cumulative);
    }

    /**
     * Creates the IWorkbookFunctionsBinom_DistRequest
     *
     * @return The IWorkbookFunctionsBinom_DistRequest instance
     */
    public IWorkbookFunctionsBinom_DistRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBinom_DistRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsBinom_DistRequest instance
     */
    public IWorkbookFunctionsBinom_DistRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsBinom_DistRequest request = new WorkbookFunctionsBinom_DistRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("numberS")) {
            request.mBody.numberS = getParameter("numberS");
        }
        if (hasParameter("trials")) {
            request.mBody.trials = getParameter("trials");
        }
        if (hasParameter("probabilityS")) {
            request.mBody.probabilityS = getParameter("probabilityS");
        }
        if (hasParameter("cumulative")) {
            request.mBody.cumulative = getParameter("cumulative");
        }
  
        return request;
    }
}
