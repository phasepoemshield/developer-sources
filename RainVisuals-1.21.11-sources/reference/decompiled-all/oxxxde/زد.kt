package oxxxde

import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.sound.SoundEvent
import net.minecraft.util.Identifier

// $VF: Compiled from RainSoundEvents.kt
public object زد {
   @JvmStatic
   private SoundEvent SLIDER = زد.INSTANCE.register("slider");
   @JvmStatic
   private SoundEvent BELL = زد.INSTANCE.register("bell");
   @JvmStatic
   private SoundEvent MODULE_DISABLE = زد.INSTANCE.register("module_disable");
   @JvmStatic
   private SoundEvent POP = زد.INSTANCE.register("pop");
   @JvmStatic
   private SoundEvent MODULE_ENABLE = INSTANCE.register("module_enable");
   @JvmStatic
   private SoundEvent VK = INSTANCE.register("vk");
   @JvmStatic
   private SoundEvent BUBBLE = INSTANCE.register("bubble");
   @JvmStatic
   private SoundEvent BONK = INSTANCE.register("bonk");
   @JvmStatic
   private SoundEvent UWU = INSTANCE.register("uwu");

   fun register(path: java.lang.String): SoundEvent {
      var var10000: Identifier = Identifier.of("rain", path)
      var10000 = (Identifier)Registry.register(Registries.SOUND_EVENT, var10000, SoundEvent.of(var10000))
      var10000 as SoundEvent
   }

   public fun register() {
   }

   fun getBONK(): SoundEvent {
      BONK
   }

   fun getBELL(): SoundEvent {
      BELL
   }

   fun getSLIDER(): SoundEvent {
      SLIDER
   }

   fun getBUBBLE(): SoundEvent {
      BUBBLE
   }

   fun getVK(): SoundEvent {
      VK
   }

   fun getMODULE_DISABLE(): SoundEvent {
      MODULE_DISABLE
   }

   fun getUWU(): SoundEvent {
      UWU
   }

   fun getPOP(): SoundEvent {
      POP
   }

   fun getMODULE_ENABLE(): SoundEvent {
      MODULE_ENABLE
   }
}
