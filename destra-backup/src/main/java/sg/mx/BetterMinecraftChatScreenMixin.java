package sg.mx;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.animation.AnimationAlphaStack;
import ru.destra.gui.ScreenAnimationManager;
import ru.destra.gui.ScreenAnimationOffset;
import ru.dreamix.fabricloader.VMBridge;

@Mixin(ChatScreen.class)
public abstract class BetterMinecraftChatScreenMixin {
   @Unique
   private boolean destra$translatedChatScreen;
   @Unique
   private boolean destra$fadedChatScreen;
   private static final float Ор;
   private static final float О诶;

   @Inject(method = "render", at = @At("HEAD"))
   private void destra$pushChatScreen(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      this.destra$translatedChatScreen = false;
      this.destra$fadedChatScreen = false;
      ScreenAnimationOffset var6 = ScreenAnimationManager.Ч((ChatScreen)this);
      float var7 = var6.getX();
      float var8 = var6.getY();
      boolean var9 = Math.abs(var7) > Ор;
      boolean var10 = var8 < О诶;
      if (var9 || var10) {
         var1.getMatrices().push();
         if (var9) {
            var1.getMatrices().translate(0.0F, var7, 0.0F);
         }

         this.destra$translatedChatScreen = true;
         if (var10) {
            ((DrawContextAccessor)var1).getVertexConsumers().draw();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var8);
            AnimationAlphaStack.push(var8);
            this.destra$fadedChatScreen = true;
         }
      }
   }

   @Inject(method = "render", at = @At("RETURN"))
   private void destra$popChatScreen(DrawContext var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (this.destra$translatedChatScreen) {
         if (this.destra$fadedChatScreen) {
            ((DrawContextAccessor)var1).getVertexConsumers().draw();
            AnimationAlphaStack.pop();
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            this.destra$fadedChatScreen = false;
         }

         var1.getMatrices().pop();
         this.destra$translatedChatScreen = false;
      }
   }

   static {
      VMBridge.identifyClass(BetterMinecraftChatScreenMixin.class, "NqGnMVTW");
   }
}
