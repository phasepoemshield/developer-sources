package sg.mx;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.animation.AnimationAlphaStack;
import ru.destra.gui.AccountMenuScreen;
import ru.destra.gui.ClickGuiScreen;
import ru.destra.gui.MainMenuScreen;
import ru.destra.gui.ScreenAnimationManager;
import ru.destra.gui.ScreenAnimationOffset;
import ru.destra.gui.ScreenManager;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(Screen.class)
public class ScreenMixin {
   @Unique
   private boolean destra$translatedScreenDrawables;
   @Unique
   private boolean destra$fadedScreenDrawables;
   private static final float Ья;
   private static final float Ь6;
   private static final float ЬЪ;

   @Inject(method = "init", at = @At("TAIL"))
   public void check(MinecraftClient var1, int var2, int var3, CallbackInfo var4) {
      Screen var5 = (Screen)this;
      ScreenAnimationManager.Ч(var5);
      if (var5 instanceof MainMenuScreen var6) {
         var6.initialize(var1, var2, var3);
      }

      if (var5 instanceof AccountMenuScreen var7) {
         var7.initialize(var1, var2, var3);
      }

      if (var5 instanceof ClickGuiScreen var8) {
         var8.initialize(var1, var2, var3);
      }
   }

   @Inject(method = "renderBackground", at = @At("HEAD"), cancellable = true)
   private void destra$renderStyledVanillaMenuBackground(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      Screen var6 = (Screen)this;
      if (ScreenManager.shouldDrawOverlay(var6)) {
         ScreenManager.renderOverlay(var6, var1);
         var5.cancel();
      }
   }

   @Inject(method = "render", at = @At(value = "INVOKE", target = "Ljava/util/List;iterator()Ljava/util/Iterator;"))
   private void destra$pushScreenDrawables(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      ScreenAnimationOffset var6 = ScreenAnimationManager.Ч((Screen)this);
      float var7 = var6.getX();
      if (!(var7 <= Ья) || !(var6.getY() >= Ь6)) {
         var1.getMatrices().push();
         var1.getMatrices().translate(0.0F, var7, 0.0F);
         this.destra$translatedScreenDrawables = true;
         float var8 = var6.getY();
         if (var8 < ЬЪ) {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var8);
            AnimationAlphaStack.push(var8);
            this.destra$fadedScreenDrawables = true;
         }
      }
   }

   @Inject(method = "render", at = @At("RETURN"))
   private void destra$popScreenDrawables(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (this.destra$translatedScreenDrawables) {
         if (this.destra$fadedScreenDrawables) {
            ((DrawContextAccessor)var1).getVertexConsumers().draw();
            AnimationAlphaStack.pop();
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            this.destra$fadedScreenDrawables = false;
         }

         var1.getMatrices().pop();
         this.destra$translatedScreenDrawables = false;
      }
   }

   static {
      VMBridge.identifyClass(ScreenMixin.class, "cRULSCOu");
   }
}
