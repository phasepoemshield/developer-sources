package oxxxde

import java.util.LinkedHashMap
import kotakbaz.rain.client.util.other.KeyMappings
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.modules.hud.container.Data$First
import kotakbaz.rain.module.modules.hud.container.Data$Leading
import kotakbaz.rain.module.modules.hud.container.Data$Second
import kotakbaz.rain.ui.mainmenu.RainMainMenuScreen$Btn
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object اؤ : RainMainMenuScreen$Btn("KeyBinds", "Отображает активные бинды", 200.0F, 200.0F, "r") {
   private final var visibleCount: Int
   @JvmStatic
   private Module[] visibleModules = arrayOfNulls(0);
   private final var visibleKeys: IntArray = IntArray(0)
   private final val map: LinkedHashMap<صه, تِ> = LinkedHashMap()

   protected override fun getCurrentData(): Map<صه, تِ> {
      val modules: java.util.List = خً.INSTANCE.modules
      this.ensureSnapshotCapacity(modules.size())
      var nextCount: Int = 0
      var changed: Boolean = false
      var moduleIndex: Int = 0

      while (moduleIndex < modules.size()) {
         val index: Module = modules.get(moduleIndex++) as Module
         if (index.isEnabled() && index.canBind() && index.canToggle() && index.getKey() != -1) {
            val key: Int = index.getKey()
            if (visibleModules[nextCount] != index || visibleKeys[nextCount] != key) {
               changed = true
            }

            visibleModules[nextCount] = index
            visibleKeys[nextCount] = key
            nextCount++
         }
      }

      if (nextCount != visibleCount) {
         changed = true
      }

      visibleCount = nextCount
      if (!changed) {
         return map
      } else {
         map.clear()
         var var9: Int = 0

         for (var10 in visibleCount..var9) {
            val var10000: Module = visibleModules[var9]
            if (visibleModules[var9] != null) {
               map.put(
                  Data$First(var10000.name, Data$Leading.Glyph(var10000.category.icon)),
                  Data$Second(KeyMappings.INSTANCE.getKey(visibleKeys[var9]), طغ.INSTANCE.VALUE_COLOR)
               )
            }
         }

         return map
      }
   }

   @Commando
   public fun onOverlayRender(event: ثآ) {
      this.renderContainer(event)
   }

   private fun ensureSnapshotCapacity(size: Int) {
      if (visibleModules.length < size) {
         visibleModules = arrayOfNulls(size)
         visibleKeys = IntArray(size)
         visibleCount = 0
      }
   }
}
