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

   public fun <T : رف<*>> settingOnServer(setting: Any, token: String, extra: () -> Boolean = ...): Any {
      setting.addVisibleCondition(this.onlyOnServer(token, extra))
      return (T)setting
   }

   public fun <T : رف<*>> settingOnFuntime(setting: Any, extra: () -> Boolean = ...): Any {
      setting.addVisibleCondition(this.onlyOnFuntime(extra))
      return (T)setting
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

   public fun <T : دِ> moduleOnServer(module: Any, token: String, extra: () -> Boolean = ...): Any {
      val condition: Function0 = this.onlyOnServer(token, extra)
      module.addVisibleInGuiCondition(condition)
      module.addAvailabilityCondition(condition)
      return (T)module
   }

   public fun <T : دِ> moduleOnFuntime(module: Any, extra: () -> Boolean = ...): Any {
      val condition: Function0 = this.onlyOnFuntime(extra)
      module.addVisibleInGuiCondition(condition)
      module.addAvailabilityCondition(condition)
      return (T)module
   }
}
