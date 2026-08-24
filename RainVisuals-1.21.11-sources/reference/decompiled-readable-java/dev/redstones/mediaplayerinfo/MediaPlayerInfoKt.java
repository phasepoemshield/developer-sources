/*
 * Decompiled with CFR 0.152.
 */
package dev.redstones.mediaplayerinfo;

import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import dev.redstones.mediaplayerinfo.impl.DummyMediaPlayerInfo;
import dev.redstones.mediaplayerinfo.impl.linux.LinuxMediaPlayerInfo;
import dev.redstones.mediaplayerinfo.impl.win.WindowsMediaPlayerInfo;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0001\u001a\u00020\u00008\u0006\u00a2\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0005"}, d2={"Ldev/redstones/mediaplayerinfo/MediaPlayerInfo;", "systemMediaPlayerInfo", "Ldev/redstones/mediaplayerinfo/MediaPlayerInfo;", "getSystemMediaPlayerInfo", "()Ldev/redstones/mediaplayerinfo/MediaPlayerInfo;", "MediaPlayerInfo"})
public final class MediaPlayerInfoKt {
    @NotNull
    private static final MediaPlayerInfo systemMediaPlayerInfo;

    static {
        MediaPlayerInfo mediaPlayerInfo;
        String string = System.getProperty("os.name");
        Intrinsics.checkNotNullExpressionValue(string, "getProperty(...)");
        String string2 = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        if (StringsKt.startsWith$default(string2, "windows", false, 2, null)) {
            mediaPlayerInfo = WindowsMediaPlayerInfo.INSTANCE;
        } else {
            String string3 = System.getProperty("os.name");
            Intrinsics.checkNotNullExpressionValue(string3, "getProperty(...)");
            String string4 = string3.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(string4, "toLowerCase(...)");
            mediaPlayerInfo = Intrinsics.areEqual(string4, "linux") ? (MediaPlayerInfo)LinuxMediaPlayerInfo.INSTANCE : (MediaPlayerInfo)DummyMediaPlayerInfo.INSTANCE;
        }
        systemMediaPlayerInfo = mediaPlayerInfo;
    }

    @NotNull
    public static final MediaPlayerInfo getSystemMediaPlayerInfo() {
        return systemMediaPlayerInfo;
    }
}

