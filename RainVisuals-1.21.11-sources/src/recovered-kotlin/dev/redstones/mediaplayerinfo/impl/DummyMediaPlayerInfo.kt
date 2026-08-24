package dev.redstones.mediaplayerinfo.impl

import dev.redstones.mediaplayerinfo.IMediaSession
import dev.redstones.mediaplayerinfo.MediaPlayerInfo

// $VF: Compiled from DummyMediaPlayerInfo.kt
public object DummyMediaPlayerInfo : MediaPlayerInfo {
   public override fun getMediaSessions(): List<IMediaSession> {
      return CollectionsKt.emptyList()
   }
}
