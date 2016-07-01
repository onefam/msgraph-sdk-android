// Template Source: Templates/Android/generated/BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
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

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Group Collection Page.
 */
public class BaseGroupCollectionPage extends BaseCollectionPage<Group, IGroupCollectionRequestBuilder> implements IBaseGroupCollectionPage {

    /**
     * A collection page for Group.
     *
     * @param response The serialized BaseGroupCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public BaseGroupCollectionPage(final BaseGroupCollectionResponse response, final IGroupCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
