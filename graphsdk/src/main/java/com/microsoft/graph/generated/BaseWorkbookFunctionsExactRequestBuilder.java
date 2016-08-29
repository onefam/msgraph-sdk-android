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
 * The class for the Base Workbook Functions Exact Request Builder.
 */
public class BaseWorkbookFunctionsExactRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsExact
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsExactRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement text1, final com.google.gson.JsonElement text2) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("text1", text1);
        mBodyParams.put("text2", text2);
    }

    /**
     * Creates the IWorkbookFunctionsExactRequest
     *
     * @return The IWorkbookFunctionsExactRequest instance
     */
    public IWorkbookFunctionsExactRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsExactRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsExactRequest instance
     */
    public IWorkbookFunctionsExactRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsExactRequest request = new WorkbookFunctionsExactRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("text1")) {
            request.mBody.text1 = getParameter("text1");
        }
        if (hasParameter("text2")) {
            request.mBody.text2 = getParameter("text2");
        }
  
        return request;
    }
}
