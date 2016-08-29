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
 * The class for the Base Workbook Functions Replace BRequest Builder.
 */
public class BaseWorkbookFunctionsReplaceBRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsReplaceB
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsReplaceBRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement oldText, final com.google.gson.JsonElement startNum, final com.google.gson.JsonElement numBytes, final com.google.gson.JsonElement newText) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("oldText", oldText);
        mBodyParams.put("startNum", startNum);
        mBodyParams.put("numBytes", numBytes);
        mBodyParams.put("newText", newText);
    }

    /**
     * Creates the IWorkbookFunctionsReplaceBRequest
     *
     * @return The IWorkbookFunctionsReplaceBRequest instance
     */
    public IWorkbookFunctionsReplaceBRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsReplaceBRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsReplaceBRequest instance
     */
    public IWorkbookFunctionsReplaceBRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsReplaceBRequest request = new WorkbookFunctionsReplaceBRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("oldText")) {
            request.mBody.oldText = getParameter("oldText");
        }
        if (hasParameter("startNum")) {
            request.mBody.startNum = getParameter("startNum");
        }
        if (hasParameter("numBytes")) {
            request.mBody.numBytes = getParameter("numBytes");
        }
        if (hasParameter("newText")) {
            request.mBody.newText = getParameter("newText");
        }
  
        return request;
    }
}
