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
 * The class for the Base Workbook Range Border Item At Request Builder.
 */
public class BaseWorkbookRangeBorderItemAtRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeBorderItemAt
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookRangeBorderItemAtRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final Integer index) {
        super(requestUrl, client, requestOptions);
        mFunctionOptions.add(new FunctionOption("index", index));
    }

    /**
     * Creates the IWorkbookRangeBorderItemAtRequest
     *
     * @return The IWorkbookRangeBorderItemAtRequest instance
     */
    public IWorkbookRangeBorderItemAtRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeBorderItemAtRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookRangeBorderItemAtRequest instance
     */
    public IWorkbookRangeBorderItemAtRequest buildRequest(final List<Option> requestOptions) {
        WorkbookRangeBorderItemAtRequest request = new WorkbookRangeBorderItemAtRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : mFunctionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
