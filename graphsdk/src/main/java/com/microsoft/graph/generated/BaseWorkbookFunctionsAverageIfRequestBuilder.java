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
 * The class for the Base Workbook Functions Average If Request Builder.
 */
public class BaseWorkbookFunctionsAverageIfRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsAverageIf
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsAverageIfRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement range, final com.google.gson.JsonElement criteria, final com.google.gson.JsonElement averageRange) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("range", range);
        mBodyParams.put("criteria", criteria);
        mBodyParams.put("averageRange", averageRange);
    }

    /**
     * Creates the IWorkbookFunctionsAverageIfRequest
     *
     * @return The IWorkbookFunctionsAverageIfRequest instance
     */
    public IWorkbookFunctionsAverageIfRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsAverageIfRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsAverageIfRequest instance
     */
    public IWorkbookFunctionsAverageIfRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsAverageIfRequest request = new WorkbookFunctionsAverageIfRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("range")) {
            request.mBody.range = getParameter("range");
        }
        if (hasParameter("criteria")) {
            request.mBody.criteria = getParameter("criteria");
        }
        if (hasParameter("averageRange")) {
            request.mBody.averageRange = getParameter("averageRange");
        }
  
        return request;
    }
}
