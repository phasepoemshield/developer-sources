package oxxxde

import kotlin.jvm.functions.Function0

// $VF: Compiled from heavy
public object اُ {
   private const val DEBUG_SERVER: String = "176.100.37.54"
   private const val MODULE_RESTRICTIONS_ENABLED: Boolean = true

   public fun onlyOnServer(token: String, extra: () -> Boolean = { 
         true
      }): () -> Boolean {
      return { 
         ضه.INSTANCE.isCurrentServerMatching(`$token`) && `$extra`()
      }
   }

   fun <T extends رف<?>> settingOnServer(extra: T, token: java.lang.String, setting: () -> java.lang.Boolean): T {
      setting.addVisibleCondition(this.onlyOnServer(token, extra))
      setting
   }

   fun <T extends رف<?>> settingOnFuntime(extra: T, setting: () -> java.lang.Boolean): T {
      setting.addVisibleCondition(this.onlyOnFuntime(extra))
      setting
   }

   public fun isActive(): Boolean {
      return ضه.INSTANCE.isFunTimeContext() || رغ.debugMode && ضه.INSTANCE.isCurrentServerMatching("176.100.37.54")
   }

   public fun onlyOnFuntime(extra: () -> Boolean = { 
         true
      }): () -> Boolean {
      return { 
         INSTANCE.isActive() && `$extra`()
      }
   }

   fun <T extends دِ> moduleOnServer(module: T, extra: java.lang.String, token: () -> java.lang.Boolean): T {
      val condition: Function0 = this.onlyOnServer(token, extra)
      module.addVisibleInGuiCondition(condition)
      module.addAvailabilityCondition(condition)
      module
   }

   fun <T extends دِ> moduleOnFuntime(module: T, extra: () -> java.lang.Boolean): T {
      val condition: Function0 = this.onlyOnFuntime(extra)
      module.addVisibleInGuiCondition(condition)
      module.addAvailabilityCondition(condition)
      module
   }
}
