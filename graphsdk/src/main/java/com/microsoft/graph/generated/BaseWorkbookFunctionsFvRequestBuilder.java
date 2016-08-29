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
 * The class for the Base Workbook Functions Fv Request Builder.
 */
public class BaseWorkbookFunctionsFvRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFv
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsFvRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pmt, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement type) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("rate", rate);
        mBodyParams.put("nper", nper);
        mBodyParams.put("pmt", pmt);
        mBodyParams.put("pv", pv);
        mBodyParams.put("type", type);
    }

    /**
     * Creates the IWorkbookFunctionsFvRequest
     *
     * @return The IWorkbookFunctionsFvRequest instance
     */
    public IWorkbookFunctionsFvRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsFvRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsFvRequest instance
     */
    public IWorkbookFunctionsFvRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsFvRequest request = new WorkbookFunctionsFvRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("rate")) {
            request.mBody.rate = getParameter("rate");
        }
        if (hasParameter("nper")) {
            request.mBody.nper = getParameter("nper");
        }
        if (hasParameter("pmt")) {
            request.mBody.pmt = getParameter("pmt");
        }
        if (hasParameter("pv")) {
            request.mBody.pv = getParameter("pv");
        }
        if (hasParameter("type")) {
            request.mBody.type = getParameter("type");
        }
  
        return request;
    }
}
