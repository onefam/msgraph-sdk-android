// Template Source: Templates/Android/generated/BaseEntity.java.tt
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
 * The class for the Base Photo.
 */
public class BasePhoto implements IJsonBackedObject {

	@SerializedName("@odata.type")
	public String oDataType;

	public BasePhoto(){
		oDataType = "microsoft.graph.photo";
	}
	
    /**
     * The Camera Make.
     */
    @SerializedName("cameraMake")
    public String cameraMake;

    /**
     * The Camera Model.
     */
    @SerializedName("cameraModel")
    public String cameraModel;

    /**
     * The Exposure Denominator.
     */
    @SerializedName("exposureDenominator")
    public Double exposureDenominator;

    /**
     * The Exposure Numerator.
     */
    @SerializedName("exposureNumerator")
    public Double exposureNumerator;

    /**
     * The Focal Length.
     */
    @SerializedName("focalLength")
    public Double focalLength;

    /**
     * The FNumber.
     */
    @SerializedName("fNumber")
    public Double fNumber;

    /**
     * The Taken Date Time.
     */
    @SerializedName("takenDateTime")
    public java.util.Calendar takenDateTime;

    /**
     * The Iso.
     */
    @SerializedName("iso")
    public Integer iso;


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

    }
}
