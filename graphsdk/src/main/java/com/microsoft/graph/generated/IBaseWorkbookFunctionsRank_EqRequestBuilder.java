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
 * The interface for the Base Workbook Functions Rank_Eq Request Builder.
 */
public interface IBaseWorkbookFunctionsRank_EqRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsRank_EqRequest
     *
     * @return The IWorkbookFunctionsRank_EqRequest instance
     */
    IWorkbookFunctionsRank_EqRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsRank_EqRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsRank_EqRequest instance
     */
    IWorkbookFunctionsRank_EqRequest buildRequest(final List<Option> requestOptions);
}
