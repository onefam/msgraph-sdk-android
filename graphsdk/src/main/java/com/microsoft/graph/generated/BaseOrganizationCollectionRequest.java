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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Organization Collection Request.
 */
public class BaseOrganizationCollectionRequest extends BaseCollectionRequest<BaseOrganizationCollectionResponse, IOrganizationCollectionPage> implements IBaseOrganizationCollectionRequest {

    /**
     * The request builder for this collection of Organization
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseOrganizationCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseOrganizationCollectionResponse.class, IOrganizationCollectionPage.class);
    }

    public void get(final ICallback<IOrganizationCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IOrganizationCollectionPage get() throws ClientException {
        final BaseOrganizationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Organization newOrganization, final ICallback<Organization> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new OrganizationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newOrganization, callback);
    }

    public Organization post(final Organization newOrganization) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new OrganizationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newOrganization);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IOrganizationCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (OrganizationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IOrganizationCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (OrganizationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IOrganizationCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (OrganizationCollectionRequest)this;
    }

    public IOrganizationCollectionPage buildFromResponse(final BaseOrganizationCollectionResponse response) {
        final IOrganizationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new OrganizationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final OrganizationCollectionPage page = new OrganizationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
