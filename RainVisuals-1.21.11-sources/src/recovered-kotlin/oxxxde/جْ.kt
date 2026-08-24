package oxxxde

import kotakbaz.rain.client.waypoint.WayPointManager
import kotakbaz.rain.ui.menu.PointsCategoryComponent$InputField

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
@JvmSynthetic
internal class جْ {
   @JvmStatic
   fun {
      var var0: IntArray = IntArray(WayPointManager.RenameResult.values().length)

      try {
         var0[WayPointManager.RenameResult.RENAMED.ordinal()] = 1
      } catch (var11: NoSuchFieldError) {
      }

      try {
         var0[WayPointManager.RenameResult.UNCHANGED.ordinal()] = 2
      } catch (var10: NoSuchFieldError) {
      }

      try {
         var0[WayPointManager.RenameResult.NOT_FOUND.ordinal()] = 3
      } catch (var9: NoSuchFieldError) {
      }

      try {
         var0[WayPointManager.RenameResult.ALREADY_EXISTS.ordinal()] = 4
      } catch (var8: NoSuchFieldError) {
      }

      try {
         var0[WayPointManager.RenameResult.INVALID_NAME.ordinal()] = 5
      } catch (var7: NoSuchFieldError) {
      }

      try {
         var0[WayPointManager.RenameResult.SAVE_FAILED.ordinal()] = 6
      } catch (var6: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var0
      var0 = IntArray(PointsCategoryComponent$InputField.values().length)

      try {
         var0[PointsCategoryComponent$InputField.NAME.ordinal()] = 1
      } catch (var5: NoSuchFieldError) {
      }

      try {
         var0[PointsCategoryComponent$InputField.X.ordinal()] = 2
      } catch (var4: NoSuchFieldError) {
      }

      try {
         var0[PointsCategoryComponent$InputField.Y.ordinal()] = 3
      } catch (var3: NoSuchFieldError) {
      }

      try {
         var0[PointsCategoryComponent$InputField.Z.ordinal()] = 4
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$1 = var0
   }
}
