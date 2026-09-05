/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.freedesktop.dbus.annotations.DBusInterfaceName
 *  org.freedesktop.dbus.annotations.DBusProperties
 *  org.freedesktop.dbus.annotations.DBusProperty
 *  org.freedesktop.dbus.annotations.DBusProperty$Access
 *  org.freedesktop.dbus.interfaces.DBusInterface
 */
package dev.redstones.mediaplayerinfo.impl.linux.dbus;

import dev.redstones.mediaplayerinfo.impl.linux.dbus.Player$PropertyMetadataType;
import kotlin.Metadata;
import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.annotations.DBusProperties;
import org.freedesktop.dbus.annotations.DBusProperty;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusProperties(value={@DBusProperty(name="Metadata", type=Player$PropertyMetadataType.class, access=DBusProperty.Access.READ), @DBusProperty(name="PlaybackStatus", type=String.class, access=DBusProperty.Access.READ), @DBusProperty(name="LoopStatus", type=String.class, access=DBusProperty.Access.READ_WRITE), @DBusProperty(name="Volume", type=double.class, access=DBusProperty.Access.READ_WRITE), @DBusProperty(name="Shuffle", type=double.class, access=DBusProperty.Access.READ_WRITE), @DBusProperty(name="Position", type=Integer.class, access=DBusProperty.Access.READ), @DBusProperty(name="Rate", type=double.class, access=DBusProperty.Access.READ_WRITE), @DBusProperty(name="MinimumRate", type=double.class, access=DBusProperty.Access.READ_WRITE), @DBusProperty(name="MaximumRate", type=double.class, access=DBusProperty.Access.READ_WRITE), @DBusProperty(name="CanControl", type=boolean.class, access=DBusProperty.Access.READ), @DBusProperty(name="CanPlay", type=boolean.class, access=DBusProperty.Access.READ), @DBusProperty(name="CanPause", type=boolean.class, access=DBusProperty.Access.READ), @DBusProperty(name="CanSeek", type=boolean.class, access=DBusProperty.Access.READ)})
@DBusInterfaceName(value="org.mpris.MediaPlayer2.Player")
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u0001\tJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2={"Ldev/redstones/mediaplayerinfo/impl/linux/dbus/Player;", "Lorg/freedesktop/dbus/interfaces/DBusInterface;", "Next", "", "Pause", "Play", "PlayPause", "Previous", "Stop", "PropertyMetadataType", "MediaPlayerInfo"})
public interface Player
extends DBusInterface {
    public void Previous();

    public void PlayPause();

    public void Stop();

    public void Pause();

    public void Next();

    public void Play();
}

