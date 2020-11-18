package com.zingmp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.zingmp3.playlist.Playlist;
import com.zingmp3.playlist.PlaylistApdapter;
import com.zingmp3.thuvien.Adapter;
import com.zingmp3.thuvien.ThuVien;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class PersonalActivity extends AppCompatActivity {
    ArrayList<ThuVien> thuVienList;
    ArrayList<Playlist> playlists;

    ListView lv_Playlist;
    CircleImageView img_sign;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        img_sign = (CircleImageView) findViewById(R.id.img_sign);
        img_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSign();
            }
        });

        initThuVien();
        initPlaylist();
    }

    public void initThuVien() {
        RecyclerView rcv_thuvien = findViewById(R.id.rcv_thuvien);
        rcv_thuvien.setHasFixedSize(true);
        GridLayoutManager gird = new GridLayoutManager(this,2,GridLayoutManager.HORIZONTAL,false);
        rcv_thuvien.setLayoutManager(gird);

        thuVienList = new ArrayList<>();

        thuVienList.add(new ThuVien(R.drawable.ic_album, "Bài hát",R.color.song));
        thuVienList.add(new ThuVien(R.drawable.ic_download, "Trên thiết bị",R.color.device));
        thuVienList.add(new ThuVien(R.drawable.ic_cloud_computing, "Upload",R.color.upload));
        thuVienList.add(new ThuVien(R.drawable.ic_song, "Album",R.color.album));
        thuVienList.add(new ThuVien(R.drawable.ic_mv, "MV",R.color.mv));

        thuVienList.add(new ThuVien(R.drawable.ic_microphone, "Nghệ sĩ",R.color.singer));
        Adapter tvAdapter = new Adapter(PersonalActivity.this, R.layout.thuvien_item, thuVienList);
        rcv_thuvien.setAdapter(tvAdapter);

    }

    public void initPlaylist() {
        lv_Playlist = findViewById(R.id.playlist_lv);

        playlists = new ArrayList<>();
        playlists.add(new Playlist(R.drawable.playlist1, "HIT-MAKER: Nổi Bật!"));
        playlists.add(new Playlist(R.drawable.playlist2, "LA DI DA: Nghe Là Mê Say"));
        playlists.add(new Playlist(R.drawable.playlist3, "Cover Việt ngày nay"));
        playlists.add(new Playlist(R.drawable.playlist4, "BETTER: Thông Điệp Tình Yêu"));
        playlists.add(new Playlist(R.drawable.playlist5, "Thức Dậy Rap Thôi"));
        PlaylistApdapter plAdapter = new PlaylistApdapter(PersonalActivity.this, R.layout.playlist_item, playlists);
        lv_Playlist.setAdapter(plAdapter);
    }
    public void openSign(){
        Intent myIntent = new Intent(PersonalActivity.this , LoginActivity.class);
        startActivity(myIntent);
    }
}
