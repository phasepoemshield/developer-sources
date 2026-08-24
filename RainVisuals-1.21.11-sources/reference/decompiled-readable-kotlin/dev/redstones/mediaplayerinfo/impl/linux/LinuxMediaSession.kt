package dev.redstones.mediaplayerinfo.impl.linux

import dev.redstones.mediaplayerinfo.IMediaSession
import dev.redstones.mediaplayerinfo.MediaInfo
import dev.redstones.mediaplayerinfo.impl.linux.dbus.Player
import java.net.URL
import org.freedesktop.dbus.DBusMap

// $VF: Compiled from LinuxMediaSession.kt
public class LinuxMediaSession(dbus: Player, owner: String) : IMediaSession {
   private final val dbus: Player
   public open val media: MediaInfo
   public open val owner: String

   public override fun playPause() {
      this.dbus.PlayPause()
   }

   private fun generateMediaInfo(): MediaInfo {
      val metadata: DBusMap = LinuxMediaPlayerInfo.INSTANCE.getProperty$MediaPlayerInfo(this.owner, "Metadata")
      val playing: Boolean = LinuxMediaPlayerInfo.INSTANCE.getProperty$MediaPlayerInfo(this.owner, "PlaybackStatus") == "Playing"
      val position: Long = (long)LinuxMediaPlayerInfo.INSTANCE.<java.lang.Number>getProperty$MediaPlayerInfo(this.owner, "Position").doubleValue() / 1000000
      var var10000: java.lang.String = (java.lang.String)metadata.get("mpris:length")
      val duration: Long = java.lang.Long.parseLong(var10000.toString()) / 1000000
      var10000 = metadata.get("xesam:title")
      val title: java.lang.String = var10000 as java.lang.String
      val artwork: Any = metadata.get("xesam:artist")
      if (artwork is java.lang.String) {
         var10000 = artwork as java.lang.String
      } else {
         var10000 = CollectionsKt.joinToString$default(artwork as java.util.List, ", ", null, null, 0, null, null, 62, null)
      }

      val artworkUrl: Any = metadata.get("mpris:artUrl")
      return MediaInfo(
         title,
         var10000,
         if (artworkUrl is java.lang.String) TextStreamsKt.readBytes(URL(artworkUrl as java.lang.String)) else ByteArray(0),
         position,
         duration,
         playing
      )
   }

   public override fun pause() {
      this.dbus.Pause()
   }

   public override fun play() {
      this.dbus.Play()
   }

   public override fun stop() {
      this.dbus.Stop()
   }

   public override fun next() {
      this.dbus.Next()
   }

   init {
      this.dbus = dbus
      this.owner = owner
      this.media = this.generateMediaInfo()
   }

   public override fun previous() {
      this.dbus.Previous()
   }
}
