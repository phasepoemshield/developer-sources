package dev.redstones.mediaplayerinfo.impl.win

import dev.redstones.mediaplayerinfo.IMediaSession
import dev.redstones.mediaplayerinfo.MediaPlayerInfo
import java.io.File
import java.io.InputStream
import java.nio.file.Files

// $VF: Compiled from WindowsMediaPlayerInfo.kt
public object WindowsMediaPlayerInfo : MediaPlayerInfo {
   public external override fun getMediaSessions(): List<IMediaSession> {
   }

   @JvmStatic
   fun {
      val dllFile: File = Files.createTempDirectory("mediaplayerinfo-").resolve("MediaPlayerInfo.dll").toFile()
      val var10001: InputStream = INSTANCE.getClass().getResourceAsStream("/mediaplayerinfo/natives/win/MediaPlayerInfo.dll")
      val var1: ByteArray = var10001.readAllBytes()
      FilesKt.writeBytes(dllFile, var1)
      System.load(dllFile.getCanonicalPath())
   }
}
