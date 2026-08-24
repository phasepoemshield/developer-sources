package oxxxde

import java.util.Comparator
import java.util.Locale
import kotakbaz.rain.client.figura.FiguraAvatarInstaller$AvatarEntry

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
internal class ثد<T> : Comparator {
   override final fun compare(b: T, a: T): Int {
      var var10000: java.lang.String = (a as FiguraAvatarInstaller$AvatarEntry).name()
      var10000 = var10000.toLowerCase(Locale.ROOT)
      val var9: java.lang.Comparable = var10000
      val var10: java.lang.String = (b as FiguraAvatarInstaller$AvatarEntry).name()
      val var11: java.lang.String = var10.toLowerCase(Locale.ROOT)
      ComparisonsKt.compareValues(var9, var11)
   }
}
