package dev.redstones.mediaplayerinfo

// $VF: Compiled from MediaPlayerInfo.kt
public interface MediaPlayerInfo {
   @JvmStatic
   MediaPlayerInfo.Instance Instance = MediaPlayerInfo.Instance.$$INSTANCE;

   public abstract fun getMediaSessions(): List<IMediaSession> {
   }

   // $VF: Compiled from MediaPlayerInfo.kt
   public companion object Instance : MediaPlayerInfo {
      public override fun getMediaSessions(): List<IMediaSession> {
         return this.$$delegate_0.getMediaSessions()
      }
   }
}
