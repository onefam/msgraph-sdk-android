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
 * The interface for the Base Message Request Builder.
 */
public interface IBaseMessageRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     */
    IMessageRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     */
    IMessageRequest buildRequest(final List<Option> requestOptions);

    IEventMessageRequestBuilder eventMessage();

    IExtensionCollectionRequestBuilder getExtensions();

    IExtensionRequestBuilder getExtensions(final String id);

    IAttachmentCollectionRequestBuilder getAttachments();

    IAttachmentRequestBuilder getAttachments(final String id);
    IMessageCopyRequestBuilder getCopy(final String destinationId);
    IMessageMoveRequestBuilder getMove(final String destinationId);
    IMessageCreateReplyRequestBuilder getCreateReply();
    IMessageCreateReplyAllRequestBuilder getCreateReplyAll();
    IMessageCreateForwardRequestBuilder getCreateForward();
    IMessageReplyRequestBuilder getReply(final String comment);
    IMessageReplyAllRequestBuilder getReplyAll(final String comment);
    IMessageForwardRequestBuilder getForward(final String comment, final List<Recipient> toRecipients);
    IMessageSendRequestBuilder getSend();

}
