package oxxxde

import java.util.Comparator
import java.util.Locale
import kotakbaz.rain.friend.FriendManager$FriendEntry

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
internal class ذّ<T> : Comparator {
   override final fun compare(a: T, b: T): Int {
      var var5: java.lang.String = (a as FriendManager$FriendEntry).name
      var var10000: Locale = Locale.ROOT
      val var10: java.lang.String = var5.toLowerCase(var10000)
      val var11: java.lang.Comparable = var10
      var5 = (b as FriendManager$FriendEntry).name
      var10000 = Locale.ROOT
      val var13: java.lang.String = var5.toLowerCase(var10000)
      ComparisonsKt.compareValues(var11, var13)
   }
}
