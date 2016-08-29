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
 * The interface for the Base Workbook Worksheet Request Builder.
 */
public interface IBaseWorkbookWorksheetRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     */
    IWorkbookWorksheetRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     */
    IWorkbookWorksheetRequest buildRequest(final List<Option> requestOptions);

    IWorkbookChartCollectionRequestBuilder getCharts();

    IWorkbookChartRequestBuilder getCharts(final String id);

    /**
     * Gets the request builder for WorkbookWorksheetProtection.
     */
    IWorkbookWorksheetProtectionRequestBuilder getProtection();

    IWorkbookTableCollectionRequestBuilder getTables();

    IWorkbookTableRequestBuilder getTables(final String id);
    IWorkbookWorksheetCellRequestBuilder getCell(final Integer row, final Integer column);
    IWorkbookWorksheetRangeRequestBuilder getRange();
    IWorkbookWorksheetRangeRequestBuilder getRange(final String address);
    IWorkbookWorksheetUsedRangeRequestBuilder getUsedRange();
    IWorkbookWorksheetUsedRangeRequestBuilder getUsedRange(final Boolean valuesOnly);

}
