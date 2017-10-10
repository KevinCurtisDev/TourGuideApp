package com.example.android.tourguideapp;

/**
 * Created by kevincurtis on 13/06/2017.
 */

public class Descriptions {

    /** Description of activity*/
    private String mDescribe;
    private String mLocation;
    private String mTimes;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this activity */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Descriptions object.
     *
     * @param describe is the word in a language that the user is already familiar with
     *                           (such as English)
     */
    public Descriptions(String describe, String location) {
        mDescribe = describe;
        mLocation = location;
    }


    /**
     * Create a new Word object.
     *
     * @param describe is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Descriptions(String describe, String location, int imageResourceId) {
        mDescribe = describe;
        mLocation = location;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDescribe;
    }

    public String getLocation() {
        return mLocation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
