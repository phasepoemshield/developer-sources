package org.wild.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_10868;
import net.minecraft.class_276;
import net.minecraft.class_4184;
import net.minecraft.class_425;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import net.minecraft.class_7833;
import net.minecraft.class_9779;
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
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.NnUuNVvUvvNn;
import ru.metaculture.protection.NvNNnUUuNn;
import ru.metaculture.protection.O000c0oocoo;
import ru.metaculture.protection.UNuUVNun;
import ru.metaculture.protection.VNNUVUuN;
import ru.metaculture.protection.VUUUNuNNn;
import ru.metaculture.protection.VUUnVnVNNU;
import ru.metaculture.protection.VUnUUUVVnvVV;
import ru.metaculture.protection.VVnVVnvnNuUn;
import ru.metaculture.protection.VnNnNnvuvn;
import ru.metaculture.protection.VvNUnuUUuN;
import ru.metaculture.protection.VvuuVNVUn;
import ru.metaculture.protection.nVnnuvvNunnN;
import ru.metaculture.protection.nnuUunUnnV;
import ru.metaculture.protection.nuunuvU;
import ru.metaculture.protection.nuuvUNvn;
import ru.metaculture.protection.nvNVVNvnVunu;
import ru.metaculture.protection.oocOO0CCC0O;
import ru.metaculture.protection.uNVUuVuNNUvn;
import ru.metaculture.protection.uVuVNVuuN;
import ru.metaculture.protection.uuUnvvnNUU;
import ru.metaculture.protection.vVnvuVuVvnun;

@Mixin({class_757.class})
public abstract class GameRendererMixin implements O000c0oocoo {
   @Unique
   private float currentZoom = 1.0F;

   @Shadow
   public abstract float method_32796();

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   private void wild$coreRenderHead(class_9779 var1, boolean var2, CallbackInfo var3) {
      vVnvuVuVvnun.UuUVuuUu().vVvUvVVuuNvV();
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   private void wild$coreRenderTail(class_9779 var1, boolean var2, CallbackInfo var3) {
      vVnvuVuVvnun.UuUVuuUu().uNNnnnuuuN();
   }

   @Inject(
      method = {"getFov"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void onGetFov(class_4184 var1, float var2, boolean var3, CallbackInfoReturnable<Float> var4) {
      float var5 = nvNVVNvnVunu.nuunNvv ? nvNVVNvnVunu.uUVVvVVNvvn : 1.0F;
      if (this.currentZoom != var5) {
         this.currentZoom = this.currentZoom + (var5 - this.currentZoom) * 0.05F;
         if (Math.abs(this.currentZoom - var5) < 0.001F) {
            this.currentZoom = var5;
         }
      }

      float var6 = (Float)var4.getReturnValue();
      if (this.currentZoom < 1.0F) {
         var6 *= this.currentZoom;
      }

      if (VvNUnuUUuN.uNNnnnuuuN()) {
         var6 *= VvNUnuUUuN.UvUvUNuvNU();
      }

      var4.setReturnValue(var6);
   }

   @Inject(
      method = {"getBasicProjectionMatrix"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void getBasicProjectionMatrix(float var1, CallbackInfoReturnable<Matrix4f> var2) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
            if (a_ != null && a_.method_22683() != null) {
               int var3 = a_.method_22683().method_4489();
               int var4 = a_.method_22683().method_4506();
               if (var3 > 0 && var4 > 0 && !a_.method_22683().method_65966()) {
                  float var5 = (float)var3 / var4 + nnuUunUnnV.UuuNnUvUuv();
                  if (Float.isFinite(var5) && !(var5 <= 0.0F)) {
                     var2.cancel();
                     Matrix4f var6 = new Matrix4f().perspective(var1 * (float) (Math.PI / 180.0), var5, 0.05F, this.method_32796());
                     if (VvNUnuUUuN.uNNnnnuuuN()) {
                        var6.m01(var6.m01() + VvNUnuUUuN.NnUuNNU());
                        var6.m10(var6.m10() + VvNUnuUUuN.nNvNUVU());
                        var6.scale(VvNUnuUUuN.UnUNuUU(), VvNUnuUUuN.uUVuVvuNUvnu(), 1.0F);
                     }

                     var2.setReturnValue(var6);
                  }
               } else {
                  var2.setReturnValue(new Matrix4f().perspective(var1 * (float) (Math.PI / 180.0), 1.0F, 0.05F, this.method_32796()));
               }
            }
         }
      }
   }

   @Inject(
      method = {"renderWorld"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void skipWorldRenderWhenWindowInvalid(class_9779 var1, CallbackInfo var2) {
      VUnUUUVVnvVV.UuUVuuUu();
      VUUnVnVNNU.UuUVuuUu();
      if (VvNUnuUUuN.vNVuvnUUnuUn()) {
         VUnUUUVVnvVV.uUnuvNvvNU();
         Runtime.getRuntime().halt(0);
      }

      if (VvNUnuUUuN.uNNnnnuuuN() && VvNUnuUUuN.UvnvNVnnnnNU()) {
         var2.cancel();
      } else {
         if (a_ == null
            || a_.method_22683() == null
            || a_.method_22683().method_65966()
            || a_.method_22683().method_4489() <= 0
            || a_.method_22683().method_4506() <= 0) {
            var2.cancel();
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
   private void renderWorld(class_9779 var1, CallbackInfo var2) {
      if (a_ != null
         && a_.method_22683() != null
         && !a_.method_22683().method_65966()
         && a_.method_22683().method_4489() > 0
         && a_.method_22683().method_4506() > 0) {
         if (a_.field_1724 != null && a_.field_1687 != null) {
            class_4184 var3 = a_.field_1773.method_19418();
            class_4587 var4 = new class_4587();
            RenderSystem.getModelViewStack().pushMatrix().mul(var4.method_23760().method_23761());
            var4.method_22907(class_7833.field_40714.rotationDegrees(var3.method_19329()));
            var4.method_22907(class_7833.field_40716.rotationDegrees(var3.method_19330() + 180.0F));
            float var5 = a_.method_61966().method_60637(true);
            float var6 = ((GameRendererAccessor)a_.field_1773).invokeGetFov(var3, var5, true);
            VnNnNnvuvn.UuUVuuUu.set(a_.field_1773.method_22973(var6));
            VnNnNnvuvn.C00OOC00oO.set(RenderSystem.getModelViewMatrix());
            VnNnNnvuvn.uUnuvNvvNU.set(var4.method_23760().method_23761());
            RenderSystem.getModelViewStack().popMatrix();
         }
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   private void wild$renderMainMenuOverlay(class_9779 var1, boolean var2, CallbackInfo var3) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (a_ != null
            && a_.method_22683() != null
            && !a_.method_22683().method_65966()
            && a_.method_22683().method_4489() > 0
            && a_.method_22683().method_4506() > 0) {
            if (a_.field_1755 instanceof uNVUuVuNNUvn var4 && var4.UuUVuuUu()) {
               class_276 var34 = a_.method_1522();
               if (var34 != null && var34.method_30277() instanceof class_10868 var7) {
                  int var8 = var7.method_68427();
                  if (var8 > 0) {
                     int var9 = GL11.glGetInteger(36006);
                     int var10 = GL11.glGetInteger(36010);
                     int var11 = GL11.glGetInteger(36006);
                     nuuvUNvn.UuUVuuUu(var9);
                     VvuuVNVUn.NVnVnNnN var12 = VvuuVNVUn.UuUVuuUu();
                     boolean var13 = false;
                     int var14 = 0;

                     try {
                        var14 = NnUuNVvUvvNn.C00OOC00oO();
                        if (var14 == 0) {
                           VNNUVUuN.UuUVuuUu(var4, "raw-overlay", false, "temp fbo unavailable", null);
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
                           int var15 = (int)a_.field_1729.method_68879(a_.method_22683());
                           int var16 = (int)a_.field_1729.method_68883(a_.method_22683());
                           oocOO0CCC0O var17 = oocOO0CCC0O.UuUVuuUu();
                           boolean var18 = var17.UuUVuuUu(var4) && var17.UuUVuuUu(a_.method_22683().method_4489(), a_.method_22683().method_4506());

                           try {
                              var4.UuUVuuUu(var15, var16, var1.method_60636());
                              VNNUVUuN.UuUVuuUu(var4, "raw-overlay", true, "renderRawOverlay complete", null);
                           } finally {
                              if (var18) {
                                 var17.uUnuvNvvNU();
                              }
                           }
                        } else {
                           VNNUVUuN.UuUVuuUu(var4, "raw-overlay", false, "temp fbo incomplete", null);
                        }
                     } catch (Throwable var31) {
                        VUUUNuNNn.C00OOC00oO("raw-overlay", "threw: " + var31);
                        VNNUVUuN.UuUVuuUu(var4, "raw-overlay", false, "renderRawOverlay failed", var31);
                     } finally {
                        if (var14 != 0) {
                           GL30.glBindFramebuffer(36160, var14);
                           GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                        }

                        VvuuVNVUn.uUnuvNvvNU(var12);
                        VvuuVNVUn.UuUVuuUu(36009, var9);
                        VvuuVNVUn.UuUVuuUu(36008, var10);
                        VvuuVNVUn.UuUVuuUu(36160, var11);
                     }
                  }
               }
            }

            if (a_.method_18506() instanceof class_425 && !uVuVNVuuN.uVunuUNVVUUV) {
               this.wild$renderLoadingOverlayAfterGui();
            } else {
               NvNNnUUuNn.UuUVuuUu().vVvUvVVuuNvV();
            }

            if (a_.field_1755 != null && a_.field_1687 == null && !(a_.field_1755 instanceof uNVUuVuNNUvn)) {
               try {
                  VVnVVnvnNuUn.UuUVuuUu().UuUVuuUu(var1.method_60636());
               } catch (Throwable var29) {
                  VVnVVnvnNuUn.UuUVuuUu().uUnuvNvvNU();
               }
            } else {
               VVnVVnvnNuUn.UuUVuuUu().uUnuvNvvNU();
            }

            if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
               UNuUVNun var33 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(UNuUVNun.class);
               if (var33 != null) {
                  var33.UuuNnUvUuv();
               }

               nuunuvU var35 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(nuunuvU.class);
               if (var35 != null) {
                  var35.UuuNnUvUuv();
               }
            }
         }
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   private void wild$renderModernGuiComposite(class_9779 var1, boolean var2, CallbackInfo var3) {
      nVnnuvvNunnN.UuUVuuUu(a_, var1.method_60636());
   }

   @Unique
   private void wild$renderLoadingOverlayAfterGui() {
      class_276 var1 = a_.method_1522();
      if (var1 != null) {
         if (var1.method_30277() instanceof class_10868 var3) {
            int var4 = var3.method_68427();
            if (var4 > 0) {
               int var5 = GL11.glGetInteger(36006);
               int var6 = GL11.glGetInteger(36010);
               int var7 = GL11.glGetInteger(36006);
               VvuuVNVUn.NVnVnNnN var8 = VvuuVNVUn.UuUVuuUu();
               int var9 = 0;

               try {
                  var9 = NnUuNVvUvvNn.C00OOC00oO();
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
                     int var10 = (int)a_.field_1729.method_68879(a_.method_22683());
                     int var11 = (int)a_.field_1729.method_68883(a_.method_22683());
                     NvNNnUUuNn.UuUVuuUu().UuUVuuUu(a_, var10, var11);
                     return;
                  }
               } catch (Throwable var15) {
                  return;
               } finally {
                  if (var9 != 0) {
                     GL30.glBindFramebuffer(36160, var9);
                     GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                  }

                  VvuuVNVUn.uUnuvNvvNU(var8);
                  VvuuVNVUn.UuUVuuUu(36009, var5);
                  VvuuVNVUn.UuUVuuUu(36008, var6);
                  VvuuVNVUn.UuUVuuUu(36160, var7);
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
   private void cancelHurtCamera(class_4587 var1, float var2, CallbackInfo var3) {
      if (uuUnvvnNUU.UuUVuuUu("Тряска от урона")) {
         var3.cancel();
      }
   }
}
