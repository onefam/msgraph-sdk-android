// Template Source: Templates/Android/generated/BaseEntityCollectionRequestBuilder.java.tt
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
 * The class for the Base Contact Folder Collection Request Builder.
 */
public class BaseContactFolderCollectionRequestBuilder extends BaseRequestBuilder implements IBaseContactFolderCollectionRequestBuilder {

    /**
     * The request builder for this collection of ContactFolder
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseContactFolderCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options) {
        super(requestUrl, client, options);
    }

    public IContactFolderCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IContactFolderCollectionRequest buildRequest(final List<Option> options) {
        return new ContactFolderCollectionRequest(getRequestUrl(), getClient(), options);
    }

    public IContactFolderRequestBuilder byId(final String id) {
        return new ContactFolderRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
