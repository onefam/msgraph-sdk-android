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

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Event.
 */
public class BaseEvent extends OutlookItem implements IJsonBackedObject {


	public BaseEvent(){
		oDataType = "microsoft.graph.event";
	}
	
    /**
     * The Original Start Time Zone.
     */
    @SerializedName("originalStartTimeZone")
    public String originalStartTimeZone;

    /**
     * The Original End Time Zone.
     */
    @SerializedName("originalEndTimeZone")
    public String originalEndTimeZone;

    /**
     * The Response Status.
     */
    @SerializedName("responseStatus")
    public ResponseStatus responseStatus;

    /**
     * The ICal UId.
     */
    @SerializedName("iCalUId")
    public String iCalUId;

    /**
     * The Reminder Minutes Before Start.
     */
    @SerializedName("reminderMinutesBeforeStart")
    public Integer reminderMinutesBeforeStart;

    /**
     * The Is Reminder On.
     */
    @SerializedName("isReminderOn")
    public Boolean isReminderOn;

    /**
     * The Has Attachments.
     */
    @SerializedName("hasAttachments")
    public Boolean hasAttachments;

    /**
     * The Subject.
     */
    @SerializedName("subject")
    public String subject;

    /**
     * The Body.
     */
    @SerializedName("body")
    public ItemBody body;

    /**
     * The Body Preview.
     */
    @SerializedName("bodyPreview")
    public String bodyPreview;

    /**
     * The Importance.
     */
    @SerializedName("importance")
    public Importance importance;

    /**
     * The Sensitivity.
     */
    @SerializedName("sensitivity")
    public Sensitivity sensitivity;

    /**
     * The Start.
     */
    @SerializedName("start")
    public DateTimeTimeZone start;

    /**
     * The Original Start.
     */
    @SerializedName("originalStart")
    public java.util.Calendar originalStart;

    /**
     * The End.
     */
    @SerializedName("end")
    public DateTimeTimeZone end;

    /**
     * The Location.
     */
    @SerializedName("location")
    public Location location;

    /**
     * The Is All Day.
     */
    @SerializedName("isAllDay")
    public Boolean isAllDay;

    /**
     * The Is Cancelled.
     */
    @SerializedName("isCancelled")
    public Boolean isCancelled;

    /**
     * The Is Organizer.
     */
    @SerializedName("isOrganizer")
    public Boolean isOrganizer;

    /**
     * The Recurrence.
     */
    @SerializedName("recurrence")
    public PatternedRecurrence recurrence;

    /**
     * The Response Requested.
     */
    @SerializedName("responseRequested")
    public Boolean responseRequested;

    /**
     * The Series Master Id.
     */
    @SerializedName("seriesMasterId")
    public String seriesMasterId;

    /**
     * The Show As.
     */
    @SerializedName("showAs")
    public FreeBusyStatus showAs;

    /**
     * The Type.
     */
    @SerializedName("type")
    public EventType type;

    /**
     * The Attendees.
     */
    @SerializedName("attendees")
    public List<Attendee> attendees;

    /**
     * The Organizer.
     */
    @SerializedName("organizer")
    public Recipient organizer;

    /**
     * The Web Link.
     */
    @SerializedName("webLink")
    public String webLink;

    /**
     * The Calendar.
     */
    @SerializedName("calendar")
    public Calendar calendar;

    /**
     * The Instances.
     */
    public transient EventCollectionPage instances;

    /**
     * The Attachments.
     */
    public transient AttachmentCollectionPage attachments;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;


        if (json.has("instances")) {
            final BaseEventCollectionResponse response = new BaseEventCollectionResponse();
            if (json.has("instances@odata.nextLink")) {
                response.nextLink = json.get("instances@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("instances").toString(), JsonObject[].class);
            final Event[] array = new Event[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Event.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            instances = new EventCollectionPage(response, null);
        }

        if (json.has("attachments")) {
            final BaseAttachmentCollectionResponse response = new BaseAttachmentCollectionResponse();
            if (json.has("attachments@odata.nextLink")) {
                response.nextLink = json.get("attachments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("attachments").toString(), JsonObject[].class);
            final Attachment[] array = new Attachment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Attachment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            attachments = new AttachmentCollectionPage(response, null);
        }
    }
}