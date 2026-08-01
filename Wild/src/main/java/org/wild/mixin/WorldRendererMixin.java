package org.wild.mixin;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.block.enums.CameraSubmersionType;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.DefaultFramebufferSet;
import net.minecraft.client.render.FrameGraphBuilder;
import net.minecraft.client.render.FramePass;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.util.ObjectAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.Vec3d;
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
import ru.metaculture.protection.Event;
import ru.metaculture.protection.EventManager;
import ru.metaculture.protection.O0000000OO0000;
import ru.metaculture.protection.O0000000OO0O0;
import ru.metaculture.protection.O00000O0OO0O;
import ru.metaculture.protection.O0000O00O0O00;
import ru.metaculture.protection.O0000O00O0OOO0;
import ru.metaculture.protection.O0000O00OO000;
import ru.metaculture.protection.O0000O0O0O00;
import ru.metaculture.protection.Removals;
import ru.metaculture.protection.Stardust;
import ru.metaculture.protection.WorldTweaks;

@Mixin({WorldRenderer.class})
public class WorldRendererMixin {
   @Shadow
   @Final
   private DefaultFramebufferSet framebufferSet;
   @Shadow
   @Nullable
   private ClientWorld world;

   @Inject(
      method = {"renderSky"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderStardustSky(FrameGraphBuilder frameGraphBuilder, Camera camera, float f, GpuBufferSlice gpuBufferSlice, CallbackInfo callbackInfo) {
      if (Stardust.O0000000000O0()) {
         callbackInfo.cancel();
         if (this.world != null && camera != null) {
            CameraSubmersionType var6 = camera.getSubmersionType();
            if (var6 != CameraSubmersionType.POWDER_SNOW && var6 != CameraSubmersionType.LAVA && !this.wild$hasBlindnessOrDarkness(camera)) {
               FramePass var7 = frameGraphBuilder.createPass("wild_stardust_sky");
               this.framebufferSet.mainFramebuffer = var7.transfer(this.framebufferSet.mainFramebuffer);
               var7.setRenderer(() -> {
                  RenderSystem.setShaderFog(gpuBufferSlice);
                  O00000O0OO0O.O00000000(camera, f, Stardust.O0000000000O0O());
               });
            }
         }
      }
   }

   @Unique
   private boolean wild$hasBlindnessOrDarkness(Camera camera) {
      return !(camera.getFocusedEntity() instanceof LivingEntity var2)
         ? false
         : var2.hasStatusEffect(StatusEffects.BLINDNESS) || var2.hasStatusEffect(StatusEffects.DARKNESS);
   }

   @Inject(
      method = {"renderWeather"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$suppressWeather(FrameGraphBuilder frameGraphBuilder, Vec3d vec3d, float f, GpuBufferSlice gpuBufferSlice, CallbackInfo callbackInfo) {
      if (WorldTweaks.O0000000000O0() || Removals.O000000000("Погода (дождь/снег)")) {
         callbackInfo.cancel();
      }
   }

   @Inject(
      method = {"addWeatherParticlesAndSound"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$suppressWeatherFx(Camera camera, CallbackInfo callbackInfo) {
      if (Removals.O000000000("Погода (дождь/снег)")) {
         callbackInfo.cancel();
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   private void beginEntityCapture(
      ObjectAllocator objectAllocator,
      RenderTickCounter renderTickCounter,
      boolean bl,
      Camera camera,
      Matrix4f matrix4f,
      Matrix4f matrix4f2,
      GpuBufferSlice gpuBufferSlice,
      Vector4f vector4f,
      boolean bl2,
      CallbackInfo callbackInfo
   ) {
      O00000O0OO0O.O00000000(matrix4f, matrix4f2);
      O0000O00OO000.O00000000().O00000000((WorldRenderer)(Object)this, renderTickCounter, camera);
   }

   @Inject(
      method = {"render"},
      at = {@At("RETURN")}
   )
   private void publishWorldRenderEvent(
      ObjectAllocator objectAllocator,
      RenderTickCounter renderTickCounter,
      boolean bl,
      Camera camera,
      Matrix4f matrix4f,
      Matrix4f matrix4f2,
      GpuBufferSlice gpuBufferSlice,
      Vector4f vector4f,
      boolean bl2,
      CallbackInfo callbackInfo
   ) {
      MinecraftClient var11 = MinecraftClient.getInstance();
      if (!O0000O00O0O00.O00000000(var11)) {
         O0000O00OO000.O00000000().O0000000000O();
      } else {
         MatrixStack var12 = new MatrixStack();
         var12.multiplyPositionMatrix(new Matrix4f(matrix4f));
         EventManager.O00000000((Event)(new O0000000OO0000(var12, renderTickCounter.getTickProgress(true))));
         O0000O00OO000.O00000000().O0000000000O();
         GameRenderer var13 = var11.gameRenderer;
         if (var13 != null && camera != null) {
            O0000O00O0OOO0.W373 var14 = O0000O00O0OOO0.O00000000();
            O0000O0O0O00 var15 = null;

            try {
               var15 = O0000O0O0O00.O00000000(var11, renderTickCounter, camera, matrix4f, matrix4f2);
               float var16 = var15.O0000000000000();

               try {
                  EventManager.O00000000((Event)(new O0000000OO0O0(var11, var13, var15, var16)));
               } finally {
                  if (var15 != null) {
                     try {
                        var15.O00000000000O();
                     } finally {
                        var15.close();
                     }
                  }
               }
            } finally {
               O0000O00O0OOO0.O00000000(var14);
            }
         }
      }
   }
}
