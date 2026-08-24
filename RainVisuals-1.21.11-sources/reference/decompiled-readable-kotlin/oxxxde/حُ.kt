package oxxxde

import kotakbaz.rain.friend.FriendManager$AddResult
import kotakbaz.rain.friend.FriendManager$RemoveResult

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
@JvmSynthetic
internal class حُ {
   @JvmStatic
   fun {
      var var0: IntArray = IntArray(FriendManager$AddResult.values().length)

      try {
         var0[FriendManager$AddResult.ADDED.ordinal()] = 1
      } catch (var9: NoSuchFieldError) {
      }

      try {
         var0[FriendManager$AddResult.ALREADY_ADDED.ordinal()] = 2
      } catch (var8: NoSuchFieldError) {
      }

      try {
         var0[FriendManager$AddResult.INVALID_NAME.ordinal()] = 3
      } catch (var7: NoSuchFieldError) {
      }

      try {
         var0[FriendManager$AddResult.SAVE_FAILED.ordinal()] = 4
      } catch (var6: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var0
      var0 = IntArray(FriendManager$RemoveResult.values().length)

      try {
         var0[FriendManager$RemoveResult.REMOVED.ordinal()] = 1
      } catch (var5: NoSuchFieldError) {
      }

      try {
         var0[FriendManager$RemoveResult.NOT_FOUND.ordinal()] = 2
      } catch (var4: NoSuchFieldError) {
      }

      try {
         var0[FriendManager$RemoveResult.INVALID_NAME.ordinal()] = 3
      } catch (var3: NoSuchFieldError) {
      }

      try {
         var0[FriendManager$RemoveResult.SAVE_FAILED.ordinal()] = 4
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$1 = var0
   }
}
