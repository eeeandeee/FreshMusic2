package com.example.ee.freshmusic;


public class SongItems {

    private String TrackId;
    private String Artistename;
    private int AlbumArt;

    public SongItems (String TrackTitle, String ArtisteName, int TrackCover ) {
        TrackId = TrackTitle;
        Artistename = ArtisteName;
        AlbumArt = TrackCover;

    }


    public String getArtisteName() {
        return Artistename;
    }
    /**
     * Get the TrackTitle for the track.
     */
    public String getTrackTitle() {
        return TrackId;
    }

    /**
     * Get the AlbumCover for the track.
     */
    public int TrackCover() {
         return AlbumArt;
    }
}
