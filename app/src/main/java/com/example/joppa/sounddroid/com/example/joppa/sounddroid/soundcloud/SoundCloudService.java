package com.example.joppa.sounddroid.com.example.joppa.sounddroid.soundcloud;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Jesper on 2015-10-20.
 */
public interface SoundCloudService {

    static final String CLIENT_ID = "0828618b4ccd433a18bd10faded49cf3";

    @GET("/tracks?client_id="+CLIENT_ID+"&limit=50")
    public void searchSongs(@Query("q") String query, Callback<List<Track>> cb);

    @GET("/tracks?client_id="+CLIENT_ID+"&limit=50")
    public void getMostRecentSongs(@Query("created_at[from]")String date, Callback<List<Track>> cb);
}