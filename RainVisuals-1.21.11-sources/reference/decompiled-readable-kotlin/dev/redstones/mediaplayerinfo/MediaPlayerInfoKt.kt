package dev.redstones.mediaplayerinfo

import dev.redstones.mediaplayerinfo.impl.DummyMediaPlayerInfo
import dev.redstones.mediaplayerinfo.impl.linux.LinuxMediaPlayerInfo
import dev.redstones.mediaplayerinfo.impl.win.WindowsMediaPlayerInfo
import java.util.Locale

// $VF: Compiled from MediaPlayerInfo.kt
public final val systemMediaPlayerInfo: MediaPlayerInfo

fun {
   var var10000: java.lang.String = System.getProperty("os.name")
   var10000 = var10000.toLowerCase(Locale.ROOT)
   val var1: MediaPlayerInfo
   if (StringsKt.startsWith$default(var10000, "windows", false, 2, null)) {
      var1 = WindowsMediaPlayerInfo.INSTANCE
   } else {
      var10000 = System.getProperty("os.name")
      var10000 = var10000.toLowerCase(Locale.ROOT)
      var1 = if (var10000 == "linux") LinuxMediaPlayerInfo.INSTANCE else DummyMediaPlayerInfo.INSTANCE
   }

   systemMediaPlayerInfo = var1
}
