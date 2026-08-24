package kotakbaz.rain.ui.menu

import oxxxde.بل
import oxxxde.در

// $VF: Compiled from heavy
private data class ConfigSettingsPopup(configName: String, bounds: بل) {
   private ConfigSettingsPopupBounds bounds;
   public final val configName: String

   public final val bounds: بل

   public override fun toString(): String {
      return "ConfigSettingsPopup(configName=${this.configName}, bounds=${this.bounds})"
   }

   public fun copy(configName: String = ..., bounds: بل = ...): در {
      return ConfigSettingsPopup(configName, bounds)
   }

   public override fun hashCode(): Int {
      return this.configName.hashCode() * 31 + this.bounds.hashCode()
   }

   public operator fun component2(): بل {
      return this.bounds
   }

   public operator fun component1(): String {
      return this.configName
   }

   init {
      this.configName = configName
      this.bounds = bounds
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is ConfigSettingsPopup
            && this.configName == (other as ConfigSettingsPopup).configName
            && this.bounds == (other as ConfigSettingsPopup).bounds
         }
   }
}
