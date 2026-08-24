package org.zenith.render;

import org.zenith.module.Module;

import org.zenith.ZenithClient;
import org.zenith.core.UiAnimation;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;

import org.zenith.module.ShaderFog;

import org.zenith.event.EventHookPacketProcess;
import org.zenith.event.EventInteractBlock;

import org.zenith.utility.mixin.accessors.PostEffectProcessorAccessor;














import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.GlUniform;
import net.minecraft.client.gl.PostEffectPass;
import net.minecraft.client.gl.PostEffectProcessor;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.PostEffectProcessor.FramebufferSet;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.DefaultFramebufferSet;
import net.minecraft.client.render.FrameGraphBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;

public final class ShaderPostProcess {
   public static final Identifier[] val484 = {
      Identifier.of("zenith", "shader_fog_gradient"),
      Identifier.of("zenith", "shader_fog_galaxy"),
      Identifier.of("zenith", "shader_fog_aqua"),
      Identifier.of("zenith", "shader_fog_purple"),
      Identifier.of("zenith", "shader_fog_overcast")
   };
   public static long long132;
   public static float float185;

   public ShaderPostProcess() {
   }

   public static boolean on23(FrameGraphBuilder var0, int var1, int var2, FramebufferSet var3, Camera var4) {
      ShaderFog li111l1l1i1l1 = ShaderFog.shaderFog;
      if (li111l1l1i1l1.double156()) {
         PostEffectProcessor posteffectprocessor = MinecraftClient.getInstance()
            .getShaderLoader()
            .loadPostEffect(EventHookPacketProcess(li111l1l1i1l1.call224()), DefaultFramebufferSet.MAIN_ONLY);
         if (posteffectprocessor == null) {
            return false;
         } else {
            on23(posteffectprocessor, var1, var2, var4, EventInteractBlock(li111l1l1i1l1.call179()));
            posteffectprocessor.render(var0, var1, var2, var3);
            return true;
         }
      } else {
         long132 = -1L;
         return false;
      }
   }

   public static Identifier EventHookPacketProcess(int var0) {
      int i = Math.clamp((long)var0, 0, val484.length - 1);
      return val484[i];
   }

   public static void on23(PostEffectProcessor var0, int var1, int var2, Camera var3, float var4) {
      ShaderFog li111l1l1i1l1 = ShaderFog.shaderFog;
      float f = (float)var1 / Math.max((float)var2, 1.0F);
      float f1 = MinecraftClient.getInstance().options.getFov().getValue().floatValue();
      float f2 = (float)Math.tan(Math.toRadians((double)f1) * 0.5);
      float f3 = (float)Math.toRadians((double)var3.getPitch());
      float f4 = (float)(Math.PI - Math.toRadians((double)var3.getYaw()));

      for (PostEffectPass posteffectpass : ((PostEffectProcessorAccessor)var0).getPasses()) {
         ShaderProgram shaderprogram = posteffectpass.getProgram();
         UiAnimation(shaderprogram, "FirstColor", li111l1l1i1l1.call225());
         UiAnimation(shaderprogram, "SecondColor", li111l1l1i1l1.call226());
         UiAnimation(shaderprogram, "PurpleColor", li111l1l1i1l1.call227());
         UiAnimation(shaderprogram, "Intensity", li111l1l1i1l1.call223());
         UiAnimation(shaderprogram, "time", var4);
         on23(shaderprogram, var1, var2);
         on23(shaderprogram, "CameraPosition", var3.getPos());
         on23(shaderprogram, f3, f4, f2, f);
      }
   }

   public static float EventInteractBlock(float var0) {
      long i = System.nanoTime();
      if (long132 < 0L) {
         long132 = i;
         return float185;
      } else {
         float f = Math.min((float)(i - long132) / 1.0E9F, 0.1F);
         long132 = i;
         float185 = (float185 + f * Math.max(0.0F, var0)) % 10000.0F;
         return float185;
      }
   }

   public static void UiAnimation(ShaderProgram var0, String var1, float var2) {
      GlUniform gluniform = var0.getUniform(var1);
      if (gluniform != null) {
         gluniform.set(var2);
      }
   }

   public static void on23(ShaderProgram var0, int var1, int var2) {
      GlUniform gluniform = var0.getUniform("resolution");
      if (gluniform != null) {
         gluniform.set((float)var1, (float)var2);
      }
   }

   public static void on23(ShaderProgram var0, String var1, Vec3d var2) {
      GlUniform gluniform = var0.getUniform(var1);
      if (gluniform != null) {
         gluniform.set((float)var2.x, (float)var2.y, (float)var2.z);
      }
   }

   public static void on23(ShaderProgram var0, float var1, float var2, float var3, float var4) {
      UiAnimation(var0, "SkyPitch", var1);
      UiAnimation(var0, "SkyYaw", var2);
      UiAnimation(var0, "TanHalfFov", var3);
      UiAnimation(var0, "Aspect", var4);
   }

   public static void UiAnimation(ShaderProgram var0, String var1, int var2) {
      GlUniform gluniform = var0.getUniform(var1);
      if (gluniform != null) {
         gluniform.set(
            (float)(var2 >> 16 & 0xFF) / 255.0F, (float)(var2 >> 8 & 0xFF) / 255.0F, (float)(var2 & 0xFF) / 255.0F, (float)(var2 >> 24 & 0xFF) / 255.0F
         );
      }
   }
}
