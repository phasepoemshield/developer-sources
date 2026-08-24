package kotakbaz.rain.module.modules.render

import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.ModeSetting

// $VF: Compiled from heavy
public object ItemPhysicModule : Module("ItemPhysic", RENDER, "Изменяет способ отображения предметов") {
   private const val MODE_PHYSICS: String = "Физика"
   private const val MODE_2D: String = "2Д"
   @JvmStatic
   private ModeSetting modeSetting = Module.mode$default(INSTANCE, "Режим", CollectionsKt.listOf("Физика", "2Д"), 0, null, 12, null);

   public fun is2DMode(): Boolean {
      return this.isEnabled() && modeSetting.getValue() == "2Д"
   }

   public fun isPhysicsMode(): Boolean {
      return this.isEnabled() && modeSetting.getValue() == "Физика"
   }
}
