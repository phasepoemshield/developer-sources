package dev.redstones.mediaplayerinfo.impl.win

import dev.redstones.mediaplayerinfo.IMediaSession
import dev.redstones.mediaplayerinfo.MediaInfo

// $VF: Compiled from WindowsMediaSession.kt
public class WindowsMediaSession(media: MediaInfo, owner: String, index: Int) : IMediaSession {
   public open val media: MediaInfo
   public open val owner: String
   private final val index: Int

   public external override fun next() {
   }

   public external override fun pause() {
   }

   public external override fun previous() {
   }

   public external override fun playPause() {
   }

   init {
      this.media = media
      this.owner = owner
      this.index = index
   }

   public external override fun stop() {
   }

   public external override fun play() {
   }
}
