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
 * The interface for the Base Workbook Chart Series Request.
 */
public interface IBaseWorkbookChartSeriesRequest extends IHttpRequest {

    /**
     * Gets the WorkbookChartSeries from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookChartSeries> callback);

    /**
     * Gets the WorkbookChartSeries from the service
     * @return The WorkbookChartSeries from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartSeries get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookChartSeries with a source
     * @param sourceWorkbookChartSeries The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final WorkbookChartSeries sourceWorkbookChartSeries, final ICallback<WorkbookChartSeries> callback);

    /**
     * Patches this WorkbookChartSeries with a source
     * @param sourceWorkbookChartSeries The source object with updates
     * @return The updated WorkbookChartSeries
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartSeries patch(final WorkbookChartSeries sourceWorkbookChartSeries) throws ClientException;

    /**
     * Posts a WorkbookChartSeries with a new object
     * @param newWorkbookChartSeries The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final WorkbookChartSeries newWorkbookChartSeries, final ICallback<WorkbookChartSeries> callback);

    /**
     * Posts a WorkbookChartSeries with a new object
     * @param newWorkbookChartSeries The new object to create
     * @return The created WorkbookChartSeries
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartSeries post(final WorkbookChartSeries newWorkbookChartSeries) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseWorkbookChartSeriesRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseWorkbookChartSeriesRequest expand(final String value);

}
