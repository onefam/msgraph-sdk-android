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
 * The class for the Base Workbook Functions Chi Sq_Inv Request Builder.
 */
public class BaseWorkbookFunctionsChiSq_InvRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsChiSq_Inv
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsChiSq_InvRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement probability, final com.google.gson.JsonElement degFreedom) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("probability", probability);
        mBodyParams.put("degFreedom", degFreedom);
    }

    /**
     * Creates the IWorkbookFunctionsChiSq_InvRequest
     *
     * @return The IWorkbookFunctionsChiSq_InvRequest instance
     */
    public IWorkbookFunctionsChiSq_InvRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsChiSq_InvRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsChiSq_InvRequest instance
     */
    public IWorkbookFunctionsChiSq_InvRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsChiSq_InvRequest request = new WorkbookFunctionsChiSq_InvRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("probability")) {
            request.mBody.probability = getParameter("probability");
        }
        if (hasParameter("degFreedom")) {
            request.mBody.degFreedom = getParameter("degFreedom");
        }
  
        return request;
    }
}
