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
 * The class for the Base Workbook Functions Left Request Builder.
 */
public class BaseWorkbookFunctionsLeftRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsLeft
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsLeftRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement text, final com.google.gson.JsonElement numChars) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("text", text);
        mBodyParams.put("numChars", numChars);
    }

    /**
     * Creates the IWorkbookFunctionsLeftRequest
     *
     * @return The IWorkbookFunctionsLeftRequest instance
     */
    public IWorkbookFunctionsLeftRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsLeftRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsLeftRequest instance
     */
    public IWorkbookFunctionsLeftRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsLeftRequest request = new WorkbookFunctionsLeftRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("text")) {
            request.mBody.text = getParameter("text");
        }
        if (hasParameter("numChars")) {
            request.mBody.numChars = getParameter("numChars");
        }
  
        return request;
    }
}
