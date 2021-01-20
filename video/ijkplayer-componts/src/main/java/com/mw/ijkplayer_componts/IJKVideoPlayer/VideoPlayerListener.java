package com.mw.ijkplayer_componts.IJKVideoPlayer;

import tv.danmaku.ijk.media.player.IMediaPlayer;

/**
 * Author: wangkai(wangkai@tv365.net)
 * Date: 2018-10-08
 * Time: 17:56
 * Description:
 */
public interface VideoPlayerListener extends IMediaPlayer.OnBufferingUpdateListener, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnPreparedListener, IMediaPlayer.OnInfoListener, IMediaPlayer.OnVideoSizeChangedListener, IMediaPlayer.OnErrorListener, IMediaPlayer.OnSeekCompleteListener{
}
