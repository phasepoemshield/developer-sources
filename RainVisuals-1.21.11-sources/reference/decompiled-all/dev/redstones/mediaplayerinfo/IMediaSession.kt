package dev.redstones.mediaplayerinfo

// $VF: Compiled from IMediaSession.kt
public interface IMediaSession {
   public abstract fun stop() {
   }

   public abstract fun play() {
   }

   public abstract fun pause() {
   }

   public abstract fun playPause() {
   }

   public abstract fun previous() {
   }

   public val owner: String

   public abstract fun next() {
   }

   public val media: MediaInfo
}
