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
 * The class for the Base Workbook Functions Hyperlink Request Builder.
 */
public class BaseWorkbookFunctionsHyperlinkRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsHyperlink
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsHyperlinkRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement linkLocation, final com.google.gson.JsonElement friendlyName) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("linkLocation", linkLocation);
        mBodyParams.put("friendlyName", friendlyName);
    }

    /**
     * Creates the IWorkbookFunctionsHyperlinkRequest
     *
     * @return The IWorkbookFunctionsHyperlinkRequest instance
     */
    public IWorkbookFunctionsHyperlinkRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsHyperlinkRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsHyperlinkRequest instance
     */
    public IWorkbookFunctionsHyperlinkRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsHyperlinkRequest request = new WorkbookFunctionsHyperlinkRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("linkLocation")) {
            request.mBody.linkLocation = getParameter("linkLocation");
        }
        if (hasParameter("friendlyName")) {
            request.mBody.friendlyName = getParameter("friendlyName");
        }
  
        return request;
    }
}
