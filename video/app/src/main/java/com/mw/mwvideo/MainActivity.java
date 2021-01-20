package com.mw.mwvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.mw.easylib.NeedOptimized.ActivityMiddleSetting;
import com.mw.mwvideo.IJKVideoPlayer.VideoPlayerIJK;

public class MainActivity extends ActivityMiddleSetting {
    private VideoPlayerIJK _videoView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void startAppTask() {
        super.startAppTask();
        LinearLayout box=findViewById(R.id.tv_box);
        _videoView=new VideoPlayerIJK(this);
        _videoView.setVideoPath("http://ivi.bupt.edu.cn/hls/cctv6hd.m3u8");
        box.addView(_videoView);
        _videoView.start();
    }
}