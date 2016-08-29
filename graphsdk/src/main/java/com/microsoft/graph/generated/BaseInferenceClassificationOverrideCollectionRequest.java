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
 * The class for the Base Inference Classification Override Collection Request.
 */
public class BaseInferenceClassificationOverrideCollectionRequest extends BaseCollectionRequest<BaseInferenceClassificationOverrideCollectionResponse, IInferenceClassificationOverrideCollectionPage> implements IBaseInferenceClassificationOverrideCollectionRequest {

    /**
     * The request builder for this collection of InferenceClassificationOverride
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseInferenceClassificationOverrideCollectionRequest(final String requestUrl, IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseInferenceClassificationOverrideCollectionResponse.class, IInferenceClassificationOverrideCollectionPage.class);
    }

    public void get(final ICallback<IInferenceClassificationOverrideCollectionPage> callback) {
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

    public IInferenceClassificationOverrideCollectionPage get() throws ClientException {
        final BaseInferenceClassificationOverrideCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final InferenceClassificationOverride newInferenceClassificationOverride, final ICallback<InferenceClassificationOverride> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new InferenceClassificationOverrideRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newInferenceClassificationOverride, callback);
    }

    public InferenceClassificationOverride post(final InferenceClassificationOverride newInferenceClassificationOverride) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new InferenceClassificationOverrideRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest()
            .post(newInferenceClassificationOverride);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IInferenceClassificationOverrideCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (InferenceClassificationOverrideCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IInferenceClassificationOverrideCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (InferenceClassificationOverrideCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IInferenceClassificationOverrideCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (InferenceClassificationOverrideCollectionRequest)this;
    }

    public IInferenceClassificationOverrideCollectionPage buildFromResponse(final BaseInferenceClassificationOverrideCollectionResponse response) {
        final IInferenceClassificationOverrideCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new InferenceClassificationOverrideCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final InferenceClassificationOverrideCollectionPage page = new InferenceClassificationOverrideCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
