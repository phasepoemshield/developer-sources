package org.wild.mixin;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_1294;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_5636;
import net.minecraft.class_638;
import net.minecraft.class_757;
import net.minecraft.class_761;
import net.minecraft.class_9779;
import net.minecraft.class_9909;
import net.minecraft.class_9916;
import net.minecraft.class_9922;
import net.minecraft.class_9960;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.NUvnVVNvvu;
import ru.metaculture.protection.NVuUUNU;
import ru.metaculture.protection.NvnVUnVuVU;
import ru.metaculture.protection.VUVnuvunnvuV;
import ru.metaculture.protection.VunUNUNVUnv;
import ru.metaculture.protection.VvuuVNVUn;
import ru.metaculture.protection.VvuuvuVVvvn;
import ru.metaculture.protection.nNNnNvVVv;
import ru.metaculture.protection.nuVUnVnVvV;
import ru.metaculture.protection.uUnnuUn;
import ru.metaculture.protection.uuUnvvnNUU;
import ru.metaculture.protection.uvNUnUVNnUnN;
import ru.metaculture.protection.uvvnVuvvvvUn;
import ru.metaculture.protection.vVUuUUNUVUN;

@Mixin({class_761.class})
public class WorldRendererMixin {
   @Shadow
   @Final
   private class_9960 field_53081;
   @Shadow
   @Nullable
   private class_638 field_4085;

   @Inject(
      method = {"renderSky"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderStardustSky(class_9909 var1, class_4184 var2, float var3, GpuBufferSlice var4, CallbackInfo var5) {
      if (NvnVUnVuVU.UuuNnUvUuv()) {
         var5.cancel();
         if (this.field_4085 != null && var2 != null) {
            class_5636 var6 = var2.method_19334();
            if (var6 != class_5636.field_27887 && var6 != class_5636.field_27885 && !this.wild$hasBlindnessOrDarkness(var2)) {
               class_9916 var7 = var1.method_61911("wild_stardust_sky");
               this.field_53081.field_53091 = var7.method_61933(this.field_53081.field_53091);
               var7.method_61929(() -> {
                  RenderSystem.setShaderFog(var4);
                  vVUuUUNUVUN.UuUVuuUu(var2, var3, NvnVUnVuVU.UnUNVVVNuv());
               });
            }
         }
      }
   }

   @Unique
   private boolean wild$hasBlindnessOrDarkness(class_4184 var1) {
      return !(var1.method_19331() instanceof class_1309 var2) ? false : var2.method_6059(class_1294.field_5919) || var2.method_6059(class_1294.field_38092);
   }

   @Inject(
      method = {"renderWeather"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$suppressWeather(class_9909 var1, class_243 var2, float var3, GpuBufferSlice var4, CallbackInfo var5) {
      if (uvNUnUVNnUnN.UuuNnUvUuv() || uuUnvvnNUU.C00OOC00oO("Погода (дождь/снег)")) {
         var5.cancel();
      }
   }

   @Inject(
      method = {"addWeatherParticlesAndSound"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$suppressWeatherFx(class_4184 var1, CallbackInfo var2) {
      if (uuUnvvnNUU.C00OOC00oO("Погода (дождь/снег)")) {
         var2.cancel();
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   private void beginEntityCapture(
      class_9922 var1,
      class_9779 var2,
      boolean var3,
      class_4184 var4,
      Matrix4f var5,
      Matrix4f var6,
      GpuBufferSlice var7,
      Vector4f var8,
      boolean var9,
      CallbackInfo var10
   ) {
      uvvnVuvvvvUn.UuuNnUvUuv();
      NVuUUNU.UuUVuuUu(var6);
      vVUuUUNUVUN.UuUVuuUu(var5, var6);
      nuVUnVnVvV.UuUVuuUu().UuUVuuUu((class_761)this, var2, var4);
   }

   @Inject(
      method = {"render"},
      at = {@At("RETURN")}
   )
   private void publishWorldRenderEvent(
      class_9922 var1,
      class_9779 var2,
      boolean var3,
      class_4184 var4,
      Matrix4f var5,
      Matrix4f var6,
      GpuBufferSlice var7,
      Vector4f var8,
      boolean var9,
      CallbackInfo var10
   ) {
      class_310 var11 = class_310.method_1551();
      if (!nNNnNvVVv.UuUVuuUu(var11)) {
         nuVUnVnVvV.UuUVuuUu().nvUVNnuu();
      } else {
         class_4587 var12 = new class_4587();
         var12.method_34425(new Matrix4f(var5));
         NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)(new VvuuvuVVvvn(var12, var2.method_60637(true))));
         nuVUnVnVvV.UuUVuuUu().nvUVNnuu();
         class_757 var13 = var11.field_1773;
         if (var13 != null && var4 != null) {
            VvuuVNVUn.NVnVnNnN var14 = VvuuVNVUn.UuUVuuUu();
            VUVnuvunnvuV var15 = null;

            try {
               var15 = VUVnuvunnvuV.UuUVuuUu(var11, var2, var4, var5, var6);
               float var16 = var15.nuUnNvnuUu();

               try {
                  NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)(new uUnnuUn(var11, var13, var15, var16)));
               } finally {
                  if (var15 != null) {
                     try {
                        var15.vNUvnnVnUvu();
                     } finally {
                        var15.close();
                     }
                  }
               }
            } finally {
               VvuuVNVUn.uUnuvNvvNU(var14);
               if (uvvnVuvvvvUn.nUUVuvU()) {
                  VvuuVNVUn.vVvUvVVuuNvV(var14);
               }
            }
         }
      }
   }
}
