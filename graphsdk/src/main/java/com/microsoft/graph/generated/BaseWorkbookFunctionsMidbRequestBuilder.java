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
 * The class for the Base Workbook Functions Midb Request Builder.
 */
public class BaseWorkbookFunctionsMidbRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsMidb
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsMidbRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement text, final com.google.gson.JsonElement startNum, final com.google.gson.JsonElement numBytes) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("text", text);
        mBodyParams.put("startNum", startNum);
        mBodyParams.put("numBytes", numBytes);
    }

    /**
     * Creates the IWorkbookFunctionsMidbRequest
     *
     * @return The IWorkbookFunctionsMidbRequest instance
     */
    public IWorkbookFunctionsMidbRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsMidbRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsMidbRequest instance
     */
    public IWorkbookFunctionsMidbRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsMidbRequest request = new WorkbookFunctionsMidbRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("text")) {
            request.mBody.text = getParameter("text");
        }
        if (hasParameter("startNum")) {
            request.mBody.startNum = getParameter("startNum");
        }
        if (hasParameter("numBytes")) {
            request.mBody.numBytes = getParameter("numBytes");
        }
  
        return request;
    }
}
