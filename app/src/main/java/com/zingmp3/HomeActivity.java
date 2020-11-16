package com.zingmp3;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.zingmp3.playlist.Playlist;
import com.zingmp3.playlist.PlaylistApdapter;
import com.zingmp3.thuvien.Adapter;
import com.zingmp3.thuvien.ThuVien;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    ArrayList<ThuVien> thuVienList;
    ArrayList<Playlist> playlists;

    ListView lv_Playlist;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initThuVien();
        initPlaylist();
    }

    public void initThuVien() {
        RecyclerView rcv_thuvien = findViewById(R.id.rcv_thuvien);
        rcv_thuvien.setHasFixedSize(true);
        GridLayoutManager gird = new GridLayoutManager(this,2,GridLayoutManager.HORIZONTAL,false);
        rcv_thuvien.setLayoutManager(gird);

        thuVienList = new ArrayList<>();

        thuVienList.add(new ThuVien(R.drawable.ic_music, "Bài hát"));
        thuVienList.add(new ThuVien(R.drawable.ic_music, "Upload"));
        thuVienList.add(new ThuVien(R.drawable.ic_music, "MV"));
        thuVienList.add(new ThuVien(R.drawable.ic_music, "Trên thiết bị"));
        thuVienList.add(new ThuVien(R.drawable.ic_music, "Album"));
        thuVienList.add(new ThuVien(R.drawable.ic_music, "Nghệ sĩ"));
        Adapter tvAdapter = new Adapter(HomeActivity.this, R.layout.thuvien_item, thuVienList);
        rcv_thuvien.setAdapter(tvAdapter);

    }

    public void initPlaylist() {
        lv_Playlist = findViewById(R.id.playlist_lv);

        playlists = new ArrayList<>();
        playlists.add(new Playlist(R.drawable.playlist1, "HIT-MAKER: Nổi Bật!"));
        playlists.add(new Playlist(R.drawable.playlist1, "LA DI DA: Nghe Là Mê Say"));
        playlists.add(new Playlist(R.drawable.playlist1, "Cover Việt ngày nay"));
        playlists.add(new Playlist(R.drawable.playlist1, "BETTER: Thông Điệp Tình Yêu"));
        playlists.add(new Playlist(R.drawable.playlist1, "Thức Dậy Rap Thôi"));
        PlaylistApdapter plAdapter = new PlaylistApdapter(HomeActivity.this, R.layout.playlist_item, playlists);
        lv_Playlist.setAdapter(plAdapter);
    }
}
