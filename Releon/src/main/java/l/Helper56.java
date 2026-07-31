package l;

import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public final class Helper56 implements Helper160 {
   public static SoundEvent OPEN_GUI = SoundEvent.of(Identifier.of("minecraft:gui_open"));
   public static SoundEvent CLOSE_GUI = SoundEvent.of(Identifier.of("minecraft:gui_close"));
   public static SoundEvent ENABLE_MODULE = SoundEvent.of(Identifier.of("minecraft:module_enable"));
   public static SoundEvent DISABLE_MODULE = SoundEvent.of(Identifier.of("minecraft:module_disable"));
   public static SoundEvent CATEGORY_CLICK = SoundEvent.of(Identifier.of("minecraft:guicategory_select"));
   public static SoundEvent ORTHODOX = SoundEvent.of(Identifier.of("minecraft:kolokolnia_kill"));
   public static SoundEvent SOFT_NOTIFICATION = SoundEvent.of(Identifier.of("minecraft:soft_notification"));

   public static void init() {
      Registry.register(Registries.SOUND_EVENT, OPEN_GUI.id(), OPEN_GUI);
      Registry.register(Registries.SOUND_EVENT, CLOSE_GUI.id(), CLOSE_GUI);
      Registry.register(Registries.SOUND_EVENT, ENABLE_MODULE.id(), ENABLE_MODULE);
      Registry.register(Registries.SOUND_EVENT, DISABLE_MODULE.id(), DISABLE_MODULE);
      Registry.register(Registries.SOUND_EVENT, CATEGORY_CLICK.id(), CATEGORY_CLICK);
      Registry.register(Registries.SOUND_EVENT, ORTHODOX.id(), ORTHODOX);
      Registry.register(Registries.SOUND_EVENT, SOFT_NOTIFICATION.id(), SOFT_NOTIFICATION);
   }

   public static void method645(SoundEvent var0) {
      method646(var0, 1.0F, 1.0F);
   }

   public static void method646(SoundEvent var0, float var1, float var2) {
      if (!Helper38.method549() && var0 != null) {
         mc.getSoundManager().play(PositionedSoundInstance.master(var0, var2, var1));
      }
   }

   private Helper56() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
