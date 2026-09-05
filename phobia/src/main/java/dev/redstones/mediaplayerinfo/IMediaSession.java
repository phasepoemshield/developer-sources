/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package dev.redstones.mediaplayerinfo;

import dev.redstones.mediaplayerinfo.MediaInfo;
import kotlin.Metadata;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u000bH&J\b\u0010\u0010\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0011"}, d2={"Ldev/redstones/mediaplayerinfo/IMediaSession;", "", "media", "Ldev/redstones/mediaplayerinfo/MediaInfo;", "getMedia", "()Ldev/redstones/mediaplayerinfo/MediaInfo;", "owner", "", "getOwner", "()Ljava/lang/String;", "next", "", "pause", "play", "playPause", "previous", "stop", "MediaPlayerInfo"})
public interface IMediaSession {
    public String getOwner();

    public void playPause();

    public void pause();

    public void previous();

    public void stop();

    public MediaInfo getMedia();

    public void play();

    public void next();
}

