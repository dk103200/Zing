package com.zingmp3.playlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zingmp3.R;

import java.util.ArrayList;

public class PlaylistApdapter extends BaseAdapter {
    ArrayList<Playlist> playlists;
    Context context;
    int layout;

    public PlaylistApdapter( Context context, int layout, ArrayList<Playlist> playlists) {
        this.playlists = playlists;
        this.context = context;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return playlists.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null,true);

        TextView tvName = convertView.findViewById(R.id.playls_name);
        tvName.setText(playlists.get(position).getName());

        TextView tvDetail = convertView.findViewById(R.id.playls_detail);
        tvName.setText(playlists.get(position).getName());

        ImageView img = (ImageView) convertView.findViewById(R.id.playls_img);
        img.setImageResource(playlists.get(position).getImg());
        return convertView;
    }
}
