package com.example.ee.freshmusic;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;


public class SongListAdapter extends ArrayAdapter<SongItems> {

    SongClickListener songClickListener;


    public SongListAdapter(Activity context, ArrayList<SongItems> words, SongClickListener songClickListener) {
    // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
    // the second argument is used when the ArrayAdapter is populating a single TextView.
    // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
    // going to use this second argument, so it can be any value. Here, we used 0.
    super(context, 0, words);

        this.songClickListener = songClickListener;


    }
        @Override
        public View getView(final  int position, View convertView, ViewGroup parent) {
            // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.activity_playlists, parent, false);

                listItemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        songClickListener.songClicked(position);
                    }
                });
            }
            //passing the ID into TextView and Image View respectively
            SongItems currentSong = getItem(position);
            TextView Artiste = (TextView) listItemView.findViewById(R.id.ArtisteName);
            Artiste.setText(currentSong.getArtisteName());
            TextView SongId = (TextView) listItemView.findViewById(R.id.TrackId);
                       SongId.setText(currentSong.getTrackTitle());
            ImageView AlbumCover = (ImageView) listItemView.findViewById(R.id.AlbumCover);
            AlbumCover.setImageResource(currentSong.TrackCover());



            // Return the whole list item layout (containing 2 TextViews and an ImageView)
            // so that it can be shown in the ListView
            return listItemView;

}

    interface SongClickListener {

        public void songClicked(int position);
    }
}
