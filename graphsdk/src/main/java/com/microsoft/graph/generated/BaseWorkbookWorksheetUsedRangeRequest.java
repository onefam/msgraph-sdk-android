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
 * The class for the Base Workbook Worksheet Used Range Request.
 */
public class BaseWorkbookWorksheetUsedRangeRequest extends BaseRequest implements IBaseWorkbookWorksheetUsedRangeRequest {

    /**
     * The request for this WorkbookWorksheetUsedRange
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookWorksheetUsedRangeRequest(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookRange.class);
    }

    /**
     * Gets the WorkbookRange
     *
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookRange> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookRange
     *
     * @return The WorkbookRange
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    public WorkbookRange get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IWorkbookWorksheetUsedRangeRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (WorkbookWorksheetUsedRangeRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IWorkbookWorksheetUsedRangeRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (WorkbookWorksheetUsedRangeRequest)this;
    }

}
