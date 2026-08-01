package fat.releon.mixins.client.screen.ingame;

import l.Helper124;
import l.Event14;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.DeathScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({DeathScreen.class})
public class DeathScreenMixin {
   @Shadow
   private int ticksSinceDeath;

   public DeathScreenMixin() {
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   public void render(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      Helper124.method1026(new Event14(this.ticksSinceDeath));
   }
}
