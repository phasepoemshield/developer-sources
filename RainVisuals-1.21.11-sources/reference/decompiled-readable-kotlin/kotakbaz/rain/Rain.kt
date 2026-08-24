package kotakbaz.rain

import kotakbaz.rain.config.ConfigManager
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.minecraft.client.MinecraftClient
import oxxxde.ثٌ

// $VF: Compiled from heavy
public object Rain {
   private const val SAVE_DEBOUNCE_NANOS: Long = 750000000L
   private final var savePending: Boolean
   private final var initialized: Boolean
   private final var stateRestored: Boolean
   private final var shutdownSnapshotSaved: Boolean
   private final var saveAfterNanos: Long

   @Synchronized
   public fun initialize() {
      if (!initialized) {
         initialized = true
         ConfigManager.INSTANCE.captureCleanRuntimeSnapshot()
         ClientLifecycleEvents.CLIENT_STARTED.register({ it: MinecraftClient ->
            INSTANCE.restoreCurrentState()
         })
         ClientLifecycleEvents.CLIENT_STOPPING.register({ it: MinecraftClient ->
            INSTANCE.saveCurrentState()
         })
         ClientTickEvents.END_CLIENT_TICK.register({ it: MinecraftClient ->
            INSTANCE.flushPendingSave()
         })
      }
   }

   @Synchronized
   public fun requestSave() {
      if (initialized && stateRestored && !shutdownSnapshotSaved) {
         savePending = true
         saveAfterNanos = System.nanoTime() + 750000000L
      }
   }

   private fun persistSnapshot(): Boolean {
      return ConfigManager.INSTANCE.unloadActiveCloudConfig() && ConfigManager.INSTANCE.save("AutoLoad") && ثٌ.INSTANCE.save()
   }

   @Synchronized
   public fun saveCurrentState(): Boolean {
      if (!initialized || !stateRestored) {
         return false
      } else if (shutdownSnapshotSaved) {
         return true
      } else {
         val saved: Boolean = this.persistSnapshot()
         if (saved) {
            savePending = false
            shutdownSnapshotSaved = true
         }

         return saved
      }
   }

   @Synchronized
   private fun restoreCurrentState() {
      if (!stateRestored) {
         val configRestored: java.lang.Iterable = ConfigManager.INSTANCE.getConfigNames()
         var var10000: Boolean
         if (configRestored is java.util.Collection && (configRestored as java.util.Collection).isEmpty()) {
            var10000 = false
         } else {
            val var4: java.util.Iterator = configRestored.iterator()

            while (true) {
               if (!var4.hasNext()) {
                  var10000 = false
                  break
               }

               if (StringsKt.equals(var4.next() as java.lang.String, "AutoLoad", true)) {
                  var10000 = true
                  break
               }
            }
         }

         val var8: Boolean = !var10000 || ConfigManager.INSTANCE.load("AutoLoad")
         ثٌ.load()
         stateRestored = var8
         savePending = false
      }
   }

   @Synchronized
   private fun flushPendingSave() {
      if (savePending && System.nanoTime() >= saveAfterNanos) {
         if (this.persistSnapshot()) {
            savePending = false
         } else {
            saveAfterNanos = System.nanoTime() + 750000000L
         }
      }
   }
}
