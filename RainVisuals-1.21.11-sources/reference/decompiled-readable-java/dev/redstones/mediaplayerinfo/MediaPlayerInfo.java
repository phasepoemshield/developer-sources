/*
 * Decompiled with CFR 0.152.
 */
package dev.redstones.mediaplayerinfo;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaPlayerInfoKt;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0007"}, d2={"Ldev/redstones/mediaplayerinfo/MediaPlayerInfo;", "", "", "Ldev/redstones/mediaplayerinfo/IMediaSession;", "getMediaSessions", "()Ljava/util/List;", "Instance", "MediaPlayerInfo"})
public interface MediaPlayerInfo {
    @NotNull
    public static final Instance Instance = dev.redstones.mediaplayerinfo.MediaPlayerInfo$Instance.$$INSTANCE;

    @NotNull
    public List<IMediaSession> getMediaSessions();

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0096\u0001\u00a2\u0006\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2={"Ldev/redstones/mediaplayerinfo/MediaPlayerInfo$Instance;", "Ldev/redstones/mediaplayerinfo/MediaPlayerInfo;", "<init>", "()V", "", "Ldev/redstones/mediaplayerinfo/IMediaSession;", "getMediaSessions", "()Ljava/util/List;", "MediaPlayerInfo"})
    public static final class Instance
    implements MediaPlayerInfo {
        private final /* synthetic */ MediaPlayerInfo $$delegate_0;
        static final /* synthetic */ Instance $$INSTANCE;

        @Override
        @NotNull
        public List<IMediaSession> getMediaSessions() {
            return this.$$delegate_0.getMediaSessions();
        }

        static {
            $$INSTANCE = new Instance();
        }

        private Instance() {
            this.$$delegate_0 = MediaPlayerInfoKt.getSystemMediaPlayerInfo();
        }
    }
}

