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
 * The class for the Base Workbook Chart Title Request.
 */
public class BaseWorkbookChartTitleRequest extends BaseRequest implements IBaseWorkbookChartTitleRequest {

    /**
     * The request for the WorkbookChartTitle
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseWorkbookChartTitleRequest(final String requestUrl,
            final IBaseClient client,
            final List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookChartTitle from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookChartTitle> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartTitle from the service
     * @return The WorkbookChartTitle from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChartTitle get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this WorkbookChartTitle with a source
     * @param sourceWorkbookChartTitle The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final WorkbookChartTitle sourceWorkbookChartTitle, final ICallback<WorkbookChartTitle> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartTitle);
    }

    /**
     * Patches this WorkbookChartTitle with a source
     * @param sourceWorkbookChartTitle The source object with updates
     * @return The updated WorkbookChartTitle
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChartTitle patch(final WorkbookChartTitle sourceWorkbookChartTitle) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartTitle);
    }

    /**
     * Creates a WorkbookChartTitle with a new object
     * @param newWorkbookChartTitle The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final WorkbookChartTitle newWorkbookChartTitle, final ICallback<WorkbookChartTitle> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartTitle);
    }

    /**
     * Creates a WorkbookChartTitle with a new object
     * @param newWorkbookChartTitle The new object to create
     * @return The created WorkbookChartTitle
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookChartTitle post(final WorkbookChartTitle newWorkbookChartTitle) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartTitle);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IWorkbookChartTitleRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookChartTitleRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IWorkbookChartTitleRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookChartTitleRequest)this;
     }

}
