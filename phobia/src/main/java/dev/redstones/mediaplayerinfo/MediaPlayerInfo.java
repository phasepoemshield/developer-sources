/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package dev.redstones.mediaplayerinfo;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo$Instance;
import java.util.List;
import kotlin.Metadata;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a8\u0006\u0006"}, d2={"Ldev/redstones/mediaplayerinfo/MediaPlayerInfo;", "", "getMediaSessions", "", "Ldev/redstones/mediaplayerinfo/IMediaSession;", "Instance", "MediaPlayerInfo"})
public interface MediaPlayerInfo {
    public static final MediaPlayerInfo$Instance Instance = MediaPlayerInfo$Instance.$$INSTANCE;

    public List<IMediaSession> getMediaSessions();
}

