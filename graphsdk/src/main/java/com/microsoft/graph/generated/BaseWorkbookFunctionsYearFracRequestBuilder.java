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
 * The class for the Base Workbook Functions Year Frac Request Builder.
 */
public class BaseWorkbookFunctionsYearFracRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsYearFrac
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsYearFracRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement startDate, final com.google.gson.JsonElement endDate, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("startDate", startDate);
        mBodyParams.put("endDate", endDate);
        mBodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsYearFracRequest
     *
     * @return The IWorkbookFunctionsYearFracRequest instance
     */
    public IWorkbookFunctionsYearFracRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsYearFracRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsYearFracRequest instance
     */
    public IWorkbookFunctionsYearFracRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsYearFracRequest request = new WorkbookFunctionsYearFracRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("startDate")) {
            request.mBody.startDate = getParameter("startDate");
        }
        if (hasParameter("endDate")) {
            request.mBody.endDate = getParameter("endDate");
        }
        if (hasParameter("basis")) {
            request.mBody.basis = getParameter("basis");
        }
  
        return request;
    }
}
