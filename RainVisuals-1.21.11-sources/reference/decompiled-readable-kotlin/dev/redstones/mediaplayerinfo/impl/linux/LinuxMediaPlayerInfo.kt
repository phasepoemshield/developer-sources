package dev.redstones.mediaplayerinfo.impl.linux

import dev.redstones.mediaplayerinfo.IMediaSession
import dev.redstones.mediaplayerinfo.MediaPlayerInfo
import dev.redstones.mediaplayerinfo.impl.linux.dbus.Player
import java.util.ArrayList
import org.freedesktop.dbus.connections.impl.DBusConnection
import org.freedesktop.dbus.connections.impl.DBusConnectionBuilder
import org.freedesktop.dbus.interfaces.DBus
import org.freedesktop.dbus.interfaces.Properties

// $VF: Compiled from LinuxMediaPlayerInfo.kt
public object LinuxMediaPlayerInfo : MediaPlayerInfo {
   private final val conn: DBusConnection = DBusConnectionBuilder.forSessionBus().build()
   private final val dbus: DBus = conn.getRemoteObject("org.freedesktop.DBus", "/", DBus.class) as DBus

   public override fun getMediaSessions(): List<IMediaSession> {
      val var10000: Array<java.lang.String> = dbus.ListNames()
      val `$this$filterTo$iv$iv`: Array<Any> = var10000
      var `destination$iv$iv`: java.util.Collection = ArrayList()

      for (it in `$this$filterTo$iv$iv`) {
         val var9: java.lang.String = it as java.lang.String
         if (StringsKt.startsWith$default(var9, "org.mpris.MediaPlayer2.", false, 2, null)) {
            `destination$iv$iv`.add(it)
         }
      }

      val var16: java.lang.Iterable = `destination$iv$iv` as java.util.List
      `destination$iv$iv` = ArrayList(CollectionsKt.collectionSizeOrDefault(`destination$iv$iv` as java.util.List, 10))

      for (var24 in var16) {
         val var26: java.lang.String = var24 as java.lang.String
         var var10002: Player = conn.getRemoteObject(var24 as java.lang.String, "/org/mpris/MediaPlayer2", Player.class)
         var10002 = var10002
         `destination$iv$iv`.add(LinuxMediaSession(var10002, StringsKt.removePrefix(var26, "org.mpris.MediaPlayer2.")))
      }

      val var17: java.lang.Iterable = `destination$iv$iv` as java.util.List
      `destination$iv$iv` = ArrayList()

      for (var25 in var17) {
         if (!(INSTANCE.getProperty$MediaPlayerInfo((var25 as LinuxMediaSession).owner, "PlaybackStatus") == "Stopped")) {
            `destination$iv$iv`.add(var25)
         }
      }

      return `destination$iv$iv` as MutableList<IMediaSession>
   }

   internal fun <T> getProperty(owner: String, property: String): Any {
      return (T)conn.getRemoteObject("org.mpris.MediaPlayer2.$owner", "/org/mpris/MediaPlayer2", Properties.class)
         .Get("org.mpris.MediaPlayer2.Player", property)
      }
}
