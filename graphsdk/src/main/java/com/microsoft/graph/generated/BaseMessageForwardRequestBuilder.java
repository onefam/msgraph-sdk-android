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
 * The class for the Base Message Forward Request Builder.
 */
public class BaseMessageForwardRequestBuilder extends BasePostMethodRequestBuilder {

    /**
     * The request builder for this MessageForward
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseMessageForwardRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options, final String comment, final List<Recipient> toRecipients) {
        super(requestUrl, client, options);
        mBodyParams.put("comment", comment);
        mBodyParams.put("toRecipients", toRecipients);
    }

    /**
     * Creates the IMessageForwardRequest
     *
     * @return The IMessageForwardRequest instance
     */
    public IMessageForwardRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IMessageForwardRequest with specific options instead of the existing options
     *
     * @param options the options for the request
     * @return The IMessageForwardRequest instance
     */
    public IMessageForwardRequest buildRequest(final List<Option> options) {
        MessageForwardRequest request = new MessageForwardRequest(
                getRequestUrl(),
                getClient(),
                options
        );

        if (hasParameter("comment")) {
            request.mBody.comment = getParameter("comment");
        }
        if (hasParameter("toRecipients")) {
            request.mBody.toRecipients = getParameter("toRecipients");
        }

        return request;
    }
}
