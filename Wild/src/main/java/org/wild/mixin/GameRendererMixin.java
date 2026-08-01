package org.wild.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gui.screen.SplashOverlay;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.wild.mixin.acceser.GameRendererAccessor;
import ru.metaculture.protection.AspectRatio;
import ru.metaculture.protection.BlurRenderer;
import ru.metaculture.protection.GlowESP;
import ru.metaculture.protection.Hands;
import ru.metaculture.protection.MinecraftAccessor;
import ru.metaculture.protection.O0000000000OO0;
import ru.metaculture.protection.O0000000000OOO;
import ru.metaculture.protection.O00000000OO0OO;
import ru.metaculture.protection.O00000OO0OO0OO;
import ru.metaculture.protection.O00000OO0OOOO;
import ru.metaculture.protection.O0000O000OOOOO;
import ru.metaculture.protection.O0000O00O0OOO0;
import ru.metaculture.protection.O0000O00OO00O0;
import ru.metaculture.protection.O0000O00OO0OO;
import ru.metaculture.protection.O0000O0O000OOO;
import ru.metaculture.protection.O0000O0O00O0;
import ru.metaculture.protection.O0000O0O00O00;
import ru.metaculture.protection.PlayerHelper;
import ru.metaculture.protection.ProtectionHandler;
import ru.metaculture.protection.Removals;
import ru.metaculture.protection.UnHook;
import ru.metaculture.protection.WildClient;

@Mixin({GameRenderer.class})
public abstract class GameRendererMixin implements MinecraftAccessor {
   @Unique
   private float currentZoom = 1.0F;

   @Shadow
   public abstract float getFarPlaneDistance();

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   private void wild$coreRenderHead(RenderTickCounter renderTickCounter, boolean bl, CallbackInfo callbackInfo) {
      O00000000OO0OO.O00000000().O00000000000();
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   private void wild$coreRenderTail(RenderTickCounter renderTickCounter, boolean bl, CallbackInfo callbackInfo) {
      O00000000OO0OO.O00000000().O000000000000();
   }

   @Inject(
      method = {"getFov"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void onGetFov(Camera camera, float f, boolean bl, CallbackInfoReturnable<Float> callbackInfoReturnable) {
      float var5 = PlayerHelper.O00000000O0000 ? PlayerHelper.O00000000O000O : 1.0F;
      if (this.currentZoom != var5) {
         this.currentZoom = this.currentZoom + (var5 - this.currentZoom) * 0.05F;
         if (Math.abs(this.currentZoom - var5) < 0.001F) {
            this.currentZoom = var5;
         }
      }

      float var6 = (Float)callbackInfoReturnable.getReturnValue();
      if (this.currentZoom < 1.0F) {
         var6 *= this.currentZoom;
      }

      if (O0000000000OO0.O000000000000()) {
         var6 *= O0000000000OO0.O000000000OO();
      }

      callbackInfoReturnable.setReturnValue(var6);
   }

   @Inject(
      method = {"getBasicProjectionMatrix"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void getBasicProjectionMatrix(float f, CallbackInfoReturnable<Matrix4f> callbackInfoReturnable) {
      if (a_ != null && a_.getWindow() != null) {
         int var3 = a_.getWindow().getFramebufferWidth();
         int var4 = a_.getWindow().getFramebufferHeight();
         if (var3 > 0 && var4 > 0 && !a_.getWindow().hasZeroWidthOrHeight()) {
            float var5 = (float)var3 / var4 + AspectRatio.O0000000000O0();
            if (Float.isFinite(var5) && !(var5 <= 0.0F)) {
               callbackInfoReturnable.cancel();
               Matrix4f var6 = new Matrix4f().perspective(f * (float) (Math.PI / 180.0), var5, 0.05F, this.getFarPlaneDistance());
               if (O0000000000OO0.O000000000000()) {
                  var6.m01(var6.m01() + O0000000000OO0.O000000000O00O());
                  var6.m10(var6.m10() + O0000000000OO0.O000000000O0O());
                  var6.scale(O0000000000OO0.O000000000O0O0(), O0000000000OO0.O000000000O0OO(), 1.0F);
               }

               callbackInfoReturnable.setReturnValue(var6);
            }
         } else {
            callbackInfoReturnable.setReturnValue(new Matrix4f().perspective(f * (float) (Math.PI / 180.0), 1.0F, 0.05F, this.getFarPlaneDistance()));
         }
      }
   }

   @Inject(
      method = {"renderWorld"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void skipWorldRenderWhenWindowInvalid(RenderTickCounter renderTickCounter, CallbackInfo callbackInfo) {
      O0000000000OOO.O00000000();
      ProtectionHandler.O00000000();
      if (O0000000000OO0.O0000000000OO()) {
         O0000000000OOO.O0000000000();
         Runtime.getRuntime();
         boolean var10001 = false;
      }

      if (O0000000000OO0.O000000000000() && O0000000000OO0.O0000000000OO0()) {
         callbackInfo.cancel();
      } else {
         if (a_ == null
            || a_.getWindow() == null
            || a_.getWindow().hasZeroWidthOrHeight()
            || a_.getWindow().getFramebufferWidth() <= 0
            || a_.getWindow().getFramebufferHeight() <= 0) {
            callbackInfo.cancel();
         }
      }
   }

   @Inject(
      method = {"renderWorld"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/WorldRenderer;render(Lnet/minecraft/client/util/ObjectAllocator;Lnet/minecraft/client/render/RenderTickCounter;ZLnet/minecraft/client/render/Camera;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Vector4f;Z)V",
         shift = Shift.AFTER
      )}
   )
   private void renderWorld(RenderTickCounter renderTickCounter, CallbackInfo callbackInfo) {
      if (a_ != null
         && a_.getWindow() != null
         && !a_.getWindow().hasZeroWidthOrHeight()
         && a_.getWindow().getFramebufferWidth() > 0
         && a_.getWindow().getFramebufferHeight() > 0) {
         if (a_.player != null && a_.world != null) {
            Camera var3 = a_.gameRenderer.getCamera();
            MatrixStack var4 = new MatrixStack();
            RenderSystem.getModelViewStack().pushMatrix().mul(var4.peek().getPositionMatrix());
            var4.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var3.getPitch()));
            var4.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var3.getYaw() + 180.0F));
            float var5 = a_.getRenderTickCounter().getTickProgress(true);
            float var6 = ((GameRendererAccessor)a_.gameRenderer).invokeGetFov(var3, var5, true);
            O0000O000OOOOO.O00000000.set(a_.gameRenderer.getBasicProjectionMatrix(var6));
            O0000O000OOOOO.O000000000.set(RenderSystem.getModelViewMatrix());
            O0000O000OOOOO.O0000000000.set(var4.peek().getPositionMatrix());
            RenderSystem.getModelViewStack().popMatrix();
         }
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   private void wild$renderMainMenuOverlay(RenderTickCounter renderTickCounter, boolean bl, CallbackInfo callbackInfo) {
      if (a_ != null
         && a_.getWindow() != null
         && !a_.getWindow().hasZeroWidthOrHeight()
         && a_.getWindow().getFramebufferWidth() > 0
         && a_.getWindow().getFramebufferHeight() > 0) {
         if (a_.currentScreen instanceof O00000OO0OOOO var4 && var4.O00000000()) {
            Framebuffer var37 = a_.getFramebuffer();
            if (var37 != null && var37.getColorAttachment() instanceof GlTexture var7) {
               int var8 = var7.getGlId();
               if (var8 > 0) {
                  int var9 = GL11.glGetInteger(36006);
                  int var10 = GL11.glGetInteger(36010);
                  int var11 = GL11.glGetInteger(36006);
                  O0000O00OO00O0.O00000000(var9);
                  O0000O00O0OOO0.W373 var12 = O0000O00O0OOO0.O00000000();
                  boolean var13 = false;
                  int var14 = 0;

                  try {
                     var14 = O0000O0O000OOO.O000000000();
                     if (var14 == 0) {
                        O0000O00OO0OO.O00000000(var4, "raw-overlay", false, "temp fbo unavailable", null);
                        return;
                     }

                     GL30.glBindFramebuffer(36160, var14);
                     GL30.glFramebufferTexture2D(36160, 36064, 3553, var8, 0);
                     GL11.glDrawBuffer(36064);
                     var13 = GL30.glCheckFramebufferStatus(36160) == 36053;
                     if (var13) {
                        GL11.glColorMask(true, true, true, true);
                        GL11.glDisable(2929);
                        GL11.glDisable(2884);
                        GL11.glEnable(3042);
                        int var15 = (int)a_.mouse.getScaledX(a_.getWindow());
                        int var16 = (int)a_.mouse.getScaledY(a_.getWindow());
                        BlurRenderer var17 = BlurRenderer.O00000000();
                        boolean var18 = var17.O00000000(var4) && var17.O00000000(a_.getWindow().getFramebufferWidth(), a_.getWindow().getFramebufferHeight());

                        try {
                           var4.O00000000(var15, var16, renderTickCounter.getDynamicDeltaTicks());
                           O0000O00OO0OO.O00000000(var4, "raw-overlay", true, "renderRawOverlay complete", null);
                        } finally {
                           if (var18) {
                              var17.O0000000000();
                           }
                        }
                     } else {
                        O0000O00OO0OO.O00000000(var4, "raw-overlay", false, "temp fbo incomplete", null);
                     }
                  } catch (Throwable var34) {
                     O0000O00OO0OO.O00000000(var4, "raw-overlay", false, "renderRawOverlay failed", var34);
                  } finally {
                     if (var14 != 0) {
                        GL30.glBindFramebuffer(36160, var14);
                        GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                     }

                     O0000O00O0OOO0.O00000000(var12);
                     O0000O00O0OOO0.O00000000(36009, var9);
                     O0000O00O0OOO0.O00000000(36008, var10);
                     O0000O00O0OOO0.O00000000(36160, var11);
                  }
               }
            }
         }

         if (a_.getOverlay() instanceof SplashOverlay && !UnHook.O000000000O0) {
            this.wild$renderLoadingOverlayAfterGui();
         } else {
            O00000OO0OO0OO.O00000000().O00000000000();
         }

         if (a_.currentScreen != null && a_.world == null && !(a_.currentScreen instanceof O00000OO0OOOO)) {
            try {
               O0000O0O00O00.O00000000().O00000000(renderTickCounter.getDynamicDeltaTicks());
            } catch (Throwable var32) {
               O0000O0O00O00.O00000000().O0000000000();
            }
         } else {
            O0000O0O00O00.O00000000().O0000000000();
         }

         try {
            O0000O0O00O0.O00000000().O00000000(renderTickCounter.getDynamicDeltaTicks());
         } catch (Throwable var31) {
            O0000O0O00O0.O00000000().O000000000();
         }

         if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
            GlowESP var36 = WildClient.O00000000.O000000000.O00000000(GlowESP.class);
            if (var36 != null) {
               var36.O0000000000O0();
            }

            Hands var38 = WildClient.O00000000.O000000000.O00000000(Hands.class);
            if (var38 != null) {
               var38.O0000000000O0();
            }
         }
      }
   }

   @Unique
   private void wild$renderLoadingOverlayAfterGui() {
      Framebuffer var1 = a_.getFramebuffer();
      if (var1 != null) {
         if (var1.getColorAttachment() instanceof GlTexture var3) {
            int var4 = var3.getGlId();
            if (var4 > 0) {
               int var5 = GL11.glGetInteger(36006);
               int var6 = GL11.glGetInteger(36010);
               int var7 = GL11.glGetInteger(36006);
               O0000O00O0OOO0.W373 var8 = O0000O00O0OOO0.O00000000();
               int var9 = 0;

               try {
                  var9 = O0000O0O000OOO.O000000000();
                  if (var9 == 0) {
                     return;
                  }

                  GL30.glBindFramebuffer(36160, var9);
                  GL30.glFramebufferTexture2D(36160, 36064, 3553, var4, 0);
                  GL11.glDrawBuffer(36064);
                  if (GL30.glCheckFramebufferStatus(36160) == 36053) {
                     GL11.glColorMask(true, true, true, true);
                     GL11.glDisable(2929);
                     GL11.glDisable(2884);
                     GL11.glEnable(3042);
                     int var10 = (int)a_.mouse.getScaledX(a_.getWindow());
                     int var11 = (int)a_.mouse.getScaledY(a_.getWindow());
                     O00000OO0OO0OO.O00000000().O00000000(a_, var10, var11);
                     return;
                  }
               } catch (Throwable var15) {
                  return;
               } finally {
                  if (var9 != 0) {
                     GL30.glBindFramebuffer(36160, var9);
                     GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                  }

                  O0000O00O0OOO0.O00000000(var8);
                  O0000O00O0OOO0.O00000000(36009, var5);
                  O0000O00O0OOO0.O00000000(36008, var6);
                  O0000O00O0OOO0.O00000000(36160, var7);
               }
            }
         }
      }
   }

   @Inject(
      method = {"tiltViewWhenHurt"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void cancelHurtCamera(MatrixStack matrixStack, float f, CallbackInfo callbackInfo) {
      if (Removals.O00000000("Тряска от урона")) {
         callbackInfo.cancel();
      }
   }
}
