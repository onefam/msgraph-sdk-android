// Template Source: Templates/Android/generated/BaseClient.java.tt
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
 * The class for the Base Graph Service Client.
 */
public class BaseGraphServiceClient extends BaseClient implements IBaseGraphServiceClient {

    /**
     * The default endpoint for the Microsoft Graph Service
     */
    public static final String DEFAULT_GRAPH_ENDPOINT = "https://graph.microsoft.com/v1.0";

    /**
     * The current endpoint
     */
    private String mEndpoint;

    @Override
    public String getServiceRoot() {
        if (mEndpoint == null) {
            mEndpoint = DEFAULT_GRAPH_ENDPOINT;
        }
        return mEndpoint;
    }

    @Override
    public void setServiceRoot(String value) {
        mEndpoint = value;
    }

    /**
     * Gets the collection of DirectoryObjects objects.
     *
     * @return The request builder for the collection of DirectoryObjects objects
     */
    public IDirectoryObjectCollectionRequestBuilder getDirectoryObjects() {
        return new DirectoryObjectCollectionRequestBuilder(getServiceRoot() + "/directoryObjects", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single DirectoryObjects.
     *
     * @param id The id of the DirectoryObjects to retrieve.
     * @return The request builder for the DirectoryObjects object
     */
    public IDirectoryObjectRequestBuilder getDirectoryObjects(final String id) {
        return new DirectoryObjectRequestBuilder(getServiceRoot() + "/directoryObjects/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Devices objects.
     *
     * @return The request builder for the collection of Devices objects
     */
    public IDeviceCollectionRequestBuilder getDevices() {
        return new DeviceCollectionRequestBuilder(getServiceRoot() + "/devices", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Devices.
     *
     * @param id The id of the Devices to retrieve.
     * @return The request builder for the Devices object
     */
    public IDeviceRequestBuilder getDevices(final String id) {
        return new DeviceRequestBuilder(getServiceRoot() + "/devices/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Groups objects.
     *
     * @return The request builder for the collection of Groups objects
     */
    public IGroupCollectionRequestBuilder getGroups() {
        return new GroupCollectionRequestBuilder(getServiceRoot() + "/groups", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Groups.
     *
     * @param id The id of the Groups to retrieve.
     * @return The request builder for the Groups object
     */
    public IGroupRequestBuilder getGroups(final String id) {
        return new GroupRequestBuilder(getServiceRoot() + "/groups/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of DirectoryRoles objects.
     *
     * @return The request builder for the collection of DirectoryRoles objects
     */
    public IDirectoryRoleCollectionRequestBuilder getDirectoryRoles() {
        return new DirectoryRoleCollectionRequestBuilder(getServiceRoot() + "/directoryRoles", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single DirectoryRoles.
     *
     * @param id The id of the DirectoryRoles to retrieve.
     * @return The request builder for the DirectoryRoles object
     */
    public IDirectoryRoleRequestBuilder getDirectoryRoles(final String id) {
        return new DirectoryRoleRequestBuilder(getServiceRoot() + "/directoryRoles/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of DirectoryRoleTemplates objects.
     *
     * @return The request builder for the collection of DirectoryRoleTemplates objects
     */
    public IDirectoryRoleTemplateCollectionRequestBuilder getDirectoryRoleTemplates() {
        return new DirectoryRoleTemplateCollectionRequestBuilder(getServiceRoot() + "/directoryRoleTemplates", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single DirectoryRoleTemplates.
     *
     * @param id The id of the DirectoryRoleTemplates to retrieve.
     * @return The request builder for the DirectoryRoleTemplates object
     */
    public IDirectoryRoleTemplateRequestBuilder getDirectoryRoleTemplates(final String id) {
        return new DirectoryRoleTemplateRequestBuilder(getServiceRoot() + "/directoryRoleTemplates/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Organization objects.
     *
     * @return The request builder for the collection of Organization objects
     */
    public IOrganizationCollectionRequestBuilder getOrganization() {
        return new OrganizationCollectionRequestBuilder(getServiceRoot() + "/organization", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Organization.
     *
     * @param id The id of the Organization to retrieve.
     * @return The request builder for the Organization object
     */
    public IOrganizationRequestBuilder getOrganization(final String id) {
        return new OrganizationRequestBuilder(getServiceRoot() + "/organization/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of SubscribedSkus objects.
     *
     * @return The request builder for the collection of SubscribedSkus objects
     */
    public ISubscribedSkuCollectionRequestBuilder getSubscribedSkus() {
        return new SubscribedSkuCollectionRequestBuilder(getServiceRoot() + "/subscribedSkus", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single SubscribedSkus.
     *
     * @param id The id of the SubscribedSkus to retrieve.
     * @return The request builder for the SubscribedSkus object
     */
    public ISubscribedSkuRequestBuilder getSubscribedSkus(final String id) {
        return new SubscribedSkuRequestBuilder(getServiceRoot() + "/subscribedSkus/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Users objects.
     *
     * @return The request builder for the collection of Users objects
     */
    public IUserCollectionRequestBuilder getUsers() {
        return new UserCollectionRequestBuilder(getServiceRoot() + "/users", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Users.
     *
     * @param id The id of the Users to retrieve.
     * @return The request builder for the Users object
     */
    public IUserRequestBuilder getUsers(final String id) {
        return new UserRequestBuilder(getServiceRoot() + "/users/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Drives objects.
     *
     * @return The request builder for the collection of Drives objects
     */
    public IDriveCollectionRequestBuilder getDrives() {
        return new DriveCollectionRequestBuilder(getServiceRoot() + "/drives", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Drives.
     *
     * @param id The id of the Drives to retrieve.
     * @return The request builder for the Drives object
     */
    public IDriveRequestBuilder getDrives(final String id) {
        return new DriveRequestBuilder(getServiceRoot() + "/drives/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets the collection of Subscriptions objects.
     *
     * @return The request builder for the collection of Subscriptions objects
     */
    public ISubscriptionCollectionRequestBuilder getSubscriptions() {
        return new SubscriptionCollectionRequestBuilder(getServiceRoot() + "/subscriptions", (IGraphServiceClient)this, null);
    }

    /**
     * Gets a single Subscriptions.
     *
     * @param id The id of the Subscriptions to retrieve.
     * @return The request builder for the Subscriptions object
     */
    public ISubscriptionRequestBuilder getSubscriptions(final String id) {
        return new SubscriptionRequestBuilder(getServiceRoot() + "/subscriptions/" + id, (IGraphServiceClient)this, null);
    }

    /**
     * Gets GraphServiceRequestBuilder.
     *
     * @return the User.
     */
    public IUserRequestBuilder getMe() {
        return new UserRequestBuilder(getServiceRoot() + "/me", (IGraphServiceClient)this, null);
    }

    /**
     * Gets GraphServiceRequestBuilder.
     *
     * @return the Drive.
     */
    public IDriveRequestBuilder getDrive() {
        return new DriveRequestBuilder(getServiceRoot() + "/drive", (IGraphServiceClient)this, null);
    }
}
