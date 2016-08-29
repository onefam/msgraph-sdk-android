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
 * The class for the Base Workbook Chart Add Request Builder.
 */
public class BaseWorkbookChartAddRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookChartAdd
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookChartAddRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final String type, final com.google.gson.JsonElement sourceData, final String seriesBy) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("type", type);
        mBodyParams.put("sourceData", sourceData);
        mBodyParams.put("seriesBy", seriesBy);
    }

    /**
     * Creates the IWorkbookChartAddRequest
     *
     * @return The IWorkbookChartAddRequest instance
     */
    public IWorkbookChartAddRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookChartAddRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookChartAddRequest instance
     */
    public IWorkbookChartAddRequest buildRequest(final List<Option> requestOptions) {
        WorkbookChartAddRequest request = new WorkbookChartAddRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("type")) {
            request.mBody.type = getParameter("type");
        }
        if (hasParameter("sourceData")) {
            request.mBody.sourceData = getParameter("sourceData");
        }
        if (hasParameter("seriesBy")) {
            request.mBody.seriesBy = getParameter("seriesBy");
        }
  
        return request;
    }
}
