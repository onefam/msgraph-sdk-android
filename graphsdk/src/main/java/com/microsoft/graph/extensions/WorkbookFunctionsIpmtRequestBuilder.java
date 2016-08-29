// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Ipmt Request Builder.
 */
public class WorkbookFunctionsIpmtRequestBuilder extends BaseWorkbookFunctionsIpmtRequestBuilder implements IWorkbookFunctionsIpmtRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsIpmt
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public WorkbookFunctionsIpmtRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement per, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement fv, final com.google.gson.JsonElement type) {
        super(requestUrl, client, requestOptions, rate, per, nper, pv, fv, type);
    }
}
