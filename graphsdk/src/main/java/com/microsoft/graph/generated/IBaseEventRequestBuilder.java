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
 * The interface for the Base Event Request Builder.
 */
public interface IBaseEventRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     */
    IEventRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     */
    IEventRequest buildRequest(final List<Option> options);

    /**
     * Gets the request builder for Calendar.
     */
    ICalendarRequestBuilder getCalendar();

    IEventCollectionRequestBuilder getInstances();

    IEventRequestBuilder getInstances(final String id);

    IExtensionCollectionRequestBuilder getExtensions();

    IExtensionRequestBuilder getExtensions(final String id);

    IAttachmentCollectionRequestBuilder getAttachments();

    IAttachmentRequestBuilder getAttachments(final String id);
    IEventAcceptRequestBuilder getAccept(final String comment, final Boolean sendResponse);
    IEventDeclineRequestBuilder getDecline(final String comment, final Boolean sendResponse);
    IEventTentativelyAcceptRequestBuilder getTentativelyAccept(final String comment, final Boolean sendResponse);
    IEventSnoozeReminderRequestBuilder getSnoozeReminder(final DateTimeTimeZone newReminderTime);
    IEventDismissReminderRequestBuilder getDismissReminder();

}
