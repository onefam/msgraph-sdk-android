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
 * The class for the Base Workbook Functions Eo Month Request Builder.
 */
public class BaseWorkbookFunctionsEoMonthRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsEoMonth
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsEoMonthRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement startDate, final com.google.gson.JsonElement months) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("startDate", startDate);
        mBodyParams.put("months", months);
    }

    /**
     * Creates the IWorkbookFunctionsEoMonthRequest
     *
     * @return The IWorkbookFunctionsEoMonthRequest instance
     */
    public IWorkbookFunctionsEoMonthRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsEoMonthRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsEoMonthRequest instance
     */
    public IWorkbookFunctionsEoMonthRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsEoMonthRequest request = new WorkbookFunctionsEoMonthRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("startDate")) {
            request.mBody.startDate = getParameter("startDate");
        }
        if (hasParameter("months")) {
            request.mBody.months = getParameter("months");
        }
  
        return request;
    }
}
