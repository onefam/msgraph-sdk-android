// Template Source: Templates/Android/generated/IBaseEntityRequestBuilder.java.tt
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
 * The interface for the Base Drive Request Builder.
 */
public interface IBaseDriveRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     */
    IDriveRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     */
    IDriveRequest buildRequest(final List<Option> options);

    IDriveItemCollectionRequestBuilder getItems();

    IDriveItemRequestBuilder getItems(final String id);

    IDriveItemCollectionRequestBuilder getSpecial();

    IDriveItemRequestBuilder getSpecial(final String id);

    /**
     * Gets the request builder for DriveItem.
     */
    IDriveItemRequestBuilder getRoot();

    IDriveRecentCollectionRequestBuilder getRecent();

    IDriveSharedWithMeCollectionRequestBuilder getSharedWithMe();

}
