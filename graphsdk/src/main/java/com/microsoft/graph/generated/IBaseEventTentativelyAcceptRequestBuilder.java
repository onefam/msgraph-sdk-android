// Template Source: Templates/Android/generated/IBaseMethodRequestBuilder.java.tt
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
 * The interface for the Base Event Tentatively Accept Request Builder.
 */
public interface IBaseEventTentativelyAcceptRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IEventTentativelyAcceptRequest
     *
     * @return The IEventTentativelyAcceptRequest instance
     */
    IEventTentativelyAcceptRequest buildRequest();

    /**
     * Creates the IEventTentativelyAcceptRequest with specific options instead of the existing options
     *
     * @param options the options for the request
     * @return The IEventTentativelyAcceptRequest instance
     */
    IEventTentativelyAcceptRequest buildRequest(final List<Option> options);
}
