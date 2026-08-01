package sg.mx;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.animation.AnimationAlphaStack;
import ru.destra.gui.ScreenAnimationManager;
import ru.destra.gui.ScreenAnimationOffset;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(HandledScreen.class)
public abstract class BetterMinecraftHandledScreenMixin {
   @Shadow
   protected int x;
   @Shadow
   protected int y;
   @Shadow
   protected int backgroundWidth;
   @Shadow
   protected int backgroundHeight;
   @Unique
   private boolean destra$translatedHandledBackground;
   @Unique
   private boolean destra$translatedHandledContent;
   @Unique
   private boolean destra$fadedHandledBackground;
   @Unique
   private boolean destra$fadedHandledContent;
   private static final float шЯф;
   private static final float шЯД;
   private static final float шЯт;
   private static final float шЯЖ;
   private static final float шЯк;
   private static final float шЯ必;

   @Inject(method = "renderBackground", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screen/ingame/HandledScreen;drawBackground(Lnet/minecraft/client/gui/DrawContext;FII)V"))
   private void destra$pushHandledBackground(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      ScreenAnimationOffset var6 = ScreenAnimationManager.Ч((HandledScreen<?>)this);
      float var7 = var6.getX();
      if (!(var7 <= шЯф) || !(var6.getY() >= шЯД)) {
         var1.getMatrices().push();
         var1.getMatrices().translate(0.0F, var7, 0.0F);
         this.destra$translatedHandledBackground = true;
         float var8 = var6.getY();
         if (var8 < шЯт) {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var8);
            AnimationAlphaStack.push(var8);
            this.destra$fadedHandledBackground = true;
         }
      }
   }

   @Inject(method = "renderBackground", at = @At("RETURN"))
   private void destra$popHandledBackground(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (this.destra$translatedHandledBackground) {
         if (this.destra$fadedHandledBackground) {
            ((DrawContextAccessor)var1).getVertexConsumers().draw();
            AnimationAlphaStack.pop();
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            this.destra$fadedHandledBackground = false;
         }

         var1.getMatrices().pop();
         this.destra$translatedHandledBackground = false;
      }
   }

   @Inject(
      method = "render",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screen/Screen;render(Lnet/minecraft/client/gui/DrawContext;IIF)V", shift = Shift.AFTER)
   )
   private void destra$pushHandledContent(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      ScreenAnimationOffset var6 = ScreenAnimationManager.Ч((HandledScreen<?>)this);
      float var7 = var6.getX();
      if (!(var7 <= шЯЖ) || !(var6.getY() >= шЯк)) {
         var1.getMatrices().push();
         var1.getMatrices().translate(0.0F, var7, 0.0F);
         this.destra$translatedHandledContent = true;
         float var8 = var6.getY();
         if (var8 < шЯ必) {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var8);
            AnimationAlphaStack.push(var8);
            this.destra$fadedHandledContent = true;
         }
      }
   }

   @Inject(method = "render", at = @At("RETURN"))
   private void destra$popHandledContent(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (this.destra$translatedHandledContent) {
         if (this.destra$fadedHandledContent) {
            ((DrawContextAccessor)var1).getVertexConsumers().draw();
            AnimationAlphaStack.pop();
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            this.destra$fadedHandledContent = false;
         }

         var1.getMatrices().pop();
         this.destra$translatedHandledContent = false;
      }
   }

   @ModifyVariable(method = "mouseClicked", at = @At("HEAD"), ordinal = 1, argsOnly = true)
   private double destra$offsetHandledClickY(double var1) {
      return ScreenAnimationManager.Ч((HandledScreen<?>)this, var1);
   }

   @ModifyVariable(method = "mouseReleased", at = @At("HEAD"), ordinal = 1, argsOnly = true)
   private double destra$offsetHandledReleaseY(double var1) {
      return ScreenAnimationManager.Ч((HandledScreen<?>)this, var1);
   }

   @ModifyVariable(method = "mouseDragged", at = @At("HEAD"), ordinal = 1, argsOnly = true)
   private double destra$offsetHandledDragY(double var1) {
      return ScreenAnimationManager.Ч((HandledScreen<?>)this, var1);
   }

   @ModifyVariable(method = "mouseScrolled", at = @At("HEAD"), ordinal = 1, argsOnly = true)
   private double destra$offsetHandledScrollY(double var1) {
      return ScreenAnimationManager.Ч((HandledScreen<?>)this, var1);
   }

   @Inject(method = "close", at = @At("HEAD"), cancellable = true)
   private void destra$delayHandledClose(CallbackInfo var1) {
      HandledScreen var2 = (HandledScreen)this;
      if (!ScreenAnimationManager.isSuppressingClose()) {
         if (ScreenAnimationManager.Ч(var2)) {
            var1.cancel();
         }
      }
   }

   static {
      VMBridge.identifyClass(BetterMinecraftHandledScreenMixin.class, "nE1Zj1VG");
   }
}
