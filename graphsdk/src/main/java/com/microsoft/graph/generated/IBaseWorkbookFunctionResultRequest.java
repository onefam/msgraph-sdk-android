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
 * The interface for the Base Workbook Function Result Request.
 */
public interface IBaseWorkbookFunctionResultRequest extends IHttpRequest {

    /**
     * Gets the WorkbookFunctionResult from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookFunctionResult> callback);

    /**
     * Gets the WorkbookFunctionResult from the service
     * @return The WorkbookFunctionResult from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookFunctionResult get() throws ClientException;

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
     * Patches this WorkbookFunctionResult with a source
     * @param sourceWorkbookFunctionResult The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final WorkbookFunctionResult sourceWorkbookFunctionResult, final ICallback<WorkbookFunctionResult> callback);

    /**
     * Patches this WorkbookFunctionResult with a source
     * @param sourceWorkbookFunctionResult The source object with updates
     * @return The updated WorkbookFunctionResult
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookFunctionResult patch(final WorkbookFunctionResult sourceWorkbookFunctionResult) throws ClientException;

    /**
     * Posts a WorkbookFunctionResult with a new object
     * @param newWorkbookFunctionResult The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final WorkbookFunctionResult newWorkbookFunctionResult, final ICallback<WorkbookFunctionResult> callback);

    /**
     * Posts a WorkbookFunctionResult with a new object
     * @param newWorkbookFunctionResult The new object to create
     * @return The created WorkbookFunctionResult
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookFunctionResult post(final WorkbookFunctionResult newWorkbookFunctionResult) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseWorkbookFunctionResultRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseWorkbookFunctionResultRequest expand(final String value);

}
