package com.example.joppa.sounddroid.com.example.joppa.sounddroid.soundcloud;

import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Jesper on 2015-10-20.
 */
public class Track {
    @SerializedName("title")
    private String mTitle;

    @SerializedName("stream_url")
    private String mStreamURL;

    @SerializedName("id")
    private int mID;

    @SerializedName("artwork_url")
    private String mArtworkURL;

    public String getArtworkURL(){
        return mArtworkURL;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getStreamURL() {
        return mStreamURL;
    }

    public int getID() {
        return mID;
    }

    public String getAvatarURL(){
        String avatarURL = mArtworkURL;
        if(avatarURL != null){
            avatarURL = mArtworkURL.replace("large", "small");
        }
        return avatarURL;
    }

}
