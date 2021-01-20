package com.mw.mwvideo;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.mw.easylib.NeedOptimized.ActivityMiddleSetting;
import com.mw.ijkplayer_componts.IJKVideoPlayer.VideoPlayerIJK;


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
        _videoView.setListener(null);
        box.addView(_videoView);
        _videoView.start();
    }
}