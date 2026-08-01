package zenith.zov.utility.mixin.screen;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import zenith.ZenithInternal089;

@Mixin({Screen.class})
public class MixinScreen implements ZenithInternal089 {
   @Unique
   private long startTime = System.currentTimeMillis();
   @Shadow
   @Nullable
   protected MinecraftClient client;

   @Unique
   public long getStartTime() {
      return this.startTime;
   }

   @Unique
   @Override
   public long zenithDLC$callGetStartTime() {
      return this.startTime;
   }
}
