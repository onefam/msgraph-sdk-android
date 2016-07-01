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
 * The class for the Base Conversation Thread Collection Page.
 */
public class BaseConversationThreadCollectionPage extends BaseCollectionPage<ConversationThread, IConversationThreadCollectionRequestBuilder> implements IBaseConversationThreadCollectionPage {

    /**
     * A collection page for ConversationThread.
     *
     * @param response The serialized BaseConversationThreadCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public BaseConversationThreadCollectionPage(final BaseConversationThreadCollectionResponse response, final IConversationThreadCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
