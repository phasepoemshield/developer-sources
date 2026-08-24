/*
 * Decompiled with CFR 0.152.
 */
package dev.redstones.mediaplayerinfo.impl.linux;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import dev.redstones.mediaplayerinfo.impl.linux.LinuxMediaSession;
import dev.redstones.mediaplayerinfo.impl.linux.dbus.Player;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.freedesktop.dbus.connections.impl.DBusConnection;
import org.freedesktop.dbus.connections.impl.DBusConnectionBuilder;
import org.freedesktop.dbus.interfaces.DBus;
import org.freedesktop.dbus.interfaces.Properties;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000\u00a2\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\n \u0010*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2={"Ldev/redstones/mediaplayerinfo/impl/linux/LinuxMediaPlayerInfo;", "Ldev/redstones/mediaplayerinfo/MediaPlayerInfo;", "<init>", "()V", "", "Ldev/redstones/mediaplayerinfo/IMediaSession;", "getMediaSessions", "()Ljava/util/List;", "T", "", "owner", "property", "getProperty$MediaPlayerInfo", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "getProperty", "Lorg/freedesktop/dbus/connections/impl/DBusConnection;", "kotlin.jvm.PlatformType", "conn", "Lorg/freedesktop/dbus/connections/impl/DBusConnection;", "Lorg/freedesktop/dbus/interfaces/DBus;", "dbus", "Lorg/freedesktop/dbus/interfaces/DBus;", "MediaPlayerInfo"})
public final class LinuxMediaPlayerInfo
implements MediaPlayerInfo {
    private static final DBusConnection conn;
    private static final DBus dbus;
    @NotNull
    public static final LinuxMediaPlayerInfo INSTANCE;

    /*
     * WARNING - void declaration
     */
    @Override
    @NotNull
    public List<IMediaSession> getMediaSessions() {
        void var4_4;
        Object it;
        void $this$mapTo$iv$iv;
        Object $this$filterTo$iv$iv;
        String[] stringArray = dbus.ListNames();
        Intrinsics.checkNotNullExpressionValue(stringArray, "ListNames(...)");
        Object $this$filter$iv = stringArray;
        boolean $i$f$filter = false;
        Object[] objectArray = $this$filter$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$filterTo = false;
        int n = ((void)$this$filterTo$iv$iv).length;
        for (int i = 0; i < n; ++i) {
            void element$iv$iv = $this$filterTo$iv$iv[i];
            String it2 = (String)element$iv$iv;
            boolean bl = false;
            Intrinsics.checkNotNull(it2);
            if (!StringsKt.startsWith$default(it2, "org.mpris.MediaPlayer2.", false, 2, null)) continue;
            destination$iv$iv.add(element$iv$iv);
        }
        Object $this$map$iv = (List)destination$iv$iv;
        boolean $i$f$map = false;
        $this$filterTo$iv$iv = $this$map$iv;
        destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            it = (String)item$iv$iv;
            Collection collection = destination$iv$iv;
            boolean bl = false;
            Player player = conn.getRemoteObject((String)it, "/org/mpris/MediaPlayer2", Player.class);
            Intrinsics.checkNotNullExpressionValue(player, "getRemoteObject(...)");
            Intrinsics.checkNotNull(it);
            collection.add(new LinuxMediaSession(player, StringsKt.removePrefix((String)it, (CharSequence)"org.mpris.MediaPlayer2.")));
        }
        $this$filter$iv = (List)destination$iv$iv;
        $i$f$filter = false;
        $this$filterTo$iv$iv = $this$filter$iv;
        destination$iv$iv = new ArrayList();
        $i$f$filterTo = false;
        Iterator iterator2 = $this$filterTo$iv$iv.iterator();
        while (iterator2.hasNext()) {
            void var7_10;
            Object element$iv$iv = iterator2.next();
            it = (LinuxMediaSession)element$iv$iv;
            boolean bl = false;
            boolean bl2 = !Intrinsics.areEqual(INSTANCE.getProperty$MediaPlayerInfo(((LinuxMediaSession)it).getOwner(), "PlaybackStatus"), "Stopped");
            if (!bl2) continue;
            var4_4.add(var7_10);
        }
        return (List)var4_4;
    }

    static {
        INSTANCE = new LinuxMediaPlayerInfo();
        conn = DBusConnectionBuilder.forSessionBus().build();
        dbus = conn.getRemoteObject("org.freedesktop.DBus", "/", DBus.class);
    }

    private LinuxMediaPlayerInfo() {
    }

    public final <T> T getProperty$MediaPlayerInfo(@NotNull String owner, @NotNull String property) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(property, "property");
        Properties properties = conn.getRemoteObject("org.mpris.MediaPlayer2." + owner, "/org/mpris/MediaPlayer2", Properties.class);
        return (T)properties.Get("org.mpris.MediaPlayer2.Player", property);
    }
}

