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
 * The class for the Base Workbook Functions Is Number Request Builder.
 */
public class BaseWorkbookFunctionsIsNumberRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsIsNumber
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsIsNumberRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement value) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("value", value);
    }

    /**
     * Creates the IWorkbookFunctionsIsNumberRequest
     *
     * @return The IWorkbookFunctionsIsNumberRequest instance
     */
    public IWorkbookFunctionsIsNumberRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsIsNumberRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsIsNumberRequest instance
     */
    public IWorkbookFunctionsIsNumberRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsIsNumberRequest request = new WorkbookFunctionsIsNumberRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("value")) {
            request.mBody.value = getParameter("value");
        }
  
        return request;
    }
}
