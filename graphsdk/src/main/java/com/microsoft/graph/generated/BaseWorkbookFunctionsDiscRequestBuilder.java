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
 * The class for the Base Workbook Functions Disc Request Builder.
 */
public class BaseWorkbookFunctionsDiscRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDisc
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsDiscRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement pr, final com.google.gson.JsonElement redemption, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("settlement", settlement);
        mBodyParams.put("maturity", maturity);
        mBodyParams.put("pr", pr);
        mBodyParams.put("redemption", redemption);
        mBodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsDiscRequest
     *
     * @return The IWorkbookFunctionsDiscRequest instance
     */
    public IWorkbookFunctionsDiscRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsDiscRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsDiscRequest instance
     */
    public IWorkbookFunctionsDiscRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsDiscRequest request = new WorkbookFunctionsDiscRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("settlement")) {
            request.mBody.settlement = getParameter("settlement");
        }
        if (hasParameter("maturity")) {
            request.mBody.maturity = getParameter("maturity");
        }
        if (hasParameter("pr")) {
            request.mBody.pr = getParameter("pr");
        }
        if (hasParameter("redemption")) {
            request.mBody.redemption = getParameter("redemption");
        }
        if (hasParameter("basis")) {
            request.mBody.basis = getParameter("basis");
        }
  
        return request;
    }
}
