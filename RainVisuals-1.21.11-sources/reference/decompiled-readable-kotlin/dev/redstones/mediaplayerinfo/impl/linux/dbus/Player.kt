package dev.redstones.mediaplayerinfo.impl.linux.dbus

import org.freedesktop.dbus.TypeRef
import org.freedesktop.dbus.annotations.DBusInterfaceName
import org.freedesktop.dbus.annotations.DBusProperties
import org.freedesktop.dbus.annotations.DBusProperty
import org.freedesktop.dbus.interfaces.DBusInterface
import org.freedesktop.dbus.types.Variant

// $VF: Compiled from Player.kt
@DBusInterfaceName("org.mpris.MediaPlayer2.Player")
@DBusProperties([@DBusProperty(name = "Metadata", type = Player.PropertyMetadataType::class, access = DBusProperty.Access.READ), @DBusProperty(name = "PlaybackStatus", type = java.lang.String::class, access = DBusProperty.Access.READ), @DBusProperty(name = "LoopStatus", type = java.lang.String::class, access = DBusProperty.Access.READ_WRITE), @DBusProperty(name = "Volume", type = Double::class, access = DBusProperty.Access.READ_WRITE), @DBusProperty(name = "Shuffle", type = Double::class, access = DBusProperty.Access.READ_WRITE), @DBusProperty(name = "Position", type = Int::class, access = DBusProperty.Access.READ), @DBusProperty(name = "Rate", type = Double::class, access = DBusProperty.Access.READ_WRITE), @DBusProperty(name = "MinimumRate", type = Double::class, access = DBusProperty.Access.READ_WRITE), @DBusProperty(name = "MaximumRate", type = Double::class, access = DBusProperty.Access.READ_WRITE), @DBusProperty(name = "CanControl", type = Boolean::class, access = DBusProperty.Access.READ), @DBusProperty(name = "CanPlay", type = Boolean::class, access = DBusProperty.Access.READ), @DBusProperty(name = "CanPause", type = Boolean::class, access = DBusProperty.Access.READ), @DBusProperty(name = "CanSeek", type = Boolean::class, access = DBusProperty.Access.READ)])
public interface Player : DBusInterface {
   public abstract fun Previous() {
   }

   public abstract fun Next() {
   }

   public abstract fun Play() {
   }

   public abstract fun Pause() {
   }

   public abstract fun PlayPause() {
   }

   public abstract fun Stop() {
   }

   // $VF: Compiled from Player.kt
   public interface PropertyMetadataType : TypeRef<java.util.Map<java.lang.String, ? extends Variant<?>>>
}
