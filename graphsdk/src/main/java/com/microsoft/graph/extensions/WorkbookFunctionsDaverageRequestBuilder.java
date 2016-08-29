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
 * The class for the Workbook Functions Daverage Request Builder.
 */
public class WorkbookFunctionsDaverageRequestBuilder extends BaseWorkbookFunctionsDaverageRequestBuilder implements IWorkbookFunctionsDaverageRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDaverage
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public WorkbookFunctionsDaverageRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement database, final com.google.gson.JsonElement field, final com.google.gson.JsonElement criteria) {
        super(requestUrl, client, requestOptions, database, field, criteria);
    }
}
