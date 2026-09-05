package org.zenith.module.render;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.module.ModuleInfo;
import org.zenith.module.ModuleManager;
import org.zenith.module.combat.*;
import org.zenith.module.movement.*;
import org.zenith.module.player.*;
import org.zenith.module.render.*;
import org.zenith.module.misc.*;

import com.mojang.blaze3d.textures.FilterMode;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.util.Arm;
import org.zenith.render.HandShaderManager;
import org.zenith.core.ShaderWrapper;
import org.zenith.setting.BooleanSetting;
import org.zenith.setting.ModeSetting;
import org.zenith.setting.NumberSetting;

@ModuleInfo(name = "ShaderHand", category = Category.RENDER, description = "")
public final class ShaderHand extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final ShaderHand shaderHand = new ShaderHand();
   public static final float float181 = 0.72F;
   public static final float float182 = 0.72F;
   public static final float float183 = 0.28F;
   public static final float float184 = 0.22F;
   public final ModeSetting shaderMode2 = new ModeSetting("module.shaderHand.shaderMode", "module.shaderHand.shaderMode.desc", ShaderHand.Option.keys());
   public final BooleanSetting animation3 = new BooleanSetting("module.shaderHand.animation", "module.shaderHand.animation.desc", true);
   public final NumberSetting timeSpeed4 = new NumberSetting(
      "module.shaderHand.timeSpeed", 1.0F, 0.0F, 5.0F, 0.05F, "module.shaderHand.timeSpeed.desc", "x", this.animation3::isEnabled, null
   );
   public final NumberSetting effectAlpha = new NumberSetting(
      "module.shaderHand.effectAlpha", 100.0F, 0.0F, 100.0F, 1.0F, "module.shaderHand.effectAlpha.desc", "%", null, null
   );
   public final NumberSetting patternSpeed = new NumberSetting(
      "module.shaderHand.patternSpeed", 1.0F, 0.0F, 5.0F, 0.05F, "module.shaderHand.patternSpeed.desc", "x", this::float390, null
   );
   public final NumberSetting shift = new NumberSetting(
      "module.shaderHand.shift", 1.6F, 0.0F, 24.0F, 0.1F, "module.shaderHand.shift.desc", "", this::float390, null
   );
   public long long132 = -1L;
   public float float185;
   public float float186 = 0.72F;
   public float float187 = 0.22F;

   /**
    * Composites the hand captured during the GUI phase back onto the main
    * framebuffer through the effect shader. Called right after the captured
    * hand pass has been drained, while HUD layers still draw on top.
    */
   public void compositeCapturedHand() {
      if (!HandShaderManager.isHandCaptured()) {
         return;
      }

      try {
         this.composite();
      } catch (Exception exception) {
         exception.printStackTrace();
      } finally {
         HandShaderManager.consumeCapture();
      }
   }

   private void composite() {
      Framebuffer framebuffer = minecraftClient3.getFramebuffer();
      SimpleFramebuffer simpleframebuffer = HandShaderManager.string38();
      if (framebuffer == null || simpleframebuffer == null) {
         return;
      }

      ShaderHand.Option llillll1i1i11iiii1ii11il_ii1il11l111ii11iil = this.float389();
      ShaderWrapper lliii11l1lllil = HandShaderManager.HudStatusPanel(llillll1i1i11iiii1ii11il_ii1il11l111ii11iil.string75);
      if (lliii11l1lllil == null) {
         return;
      }

      float f = llillll1i1i11iiii1ii11il_ii1il11l111ii11iil.boolean121 ? this.patternSpeed.getCurrent() : 1.0F;
      lliii11l1lllil.HudArmorPanel("resolution").set((float)Math.max(1, simpleframebuffer.textureWidth), (float)Math.max(1, simpleframebuffer.textureHeight));
      lliii11l1lllil.HudArmorPanel("time").set(this.int472() * llillll1i1i11iiii1ii11il_ii1il11l111ii11iil.float143);
      this.float388();
      lliii11l1lllil.HudArmorPanel("handMotion").set(this.float186, this.float187);
      lliii11l1lllil.HudArmorPanel("effectAlpha").set(Math.max(0.0F, Math.min(100.0F, this.effectAlpha.getCurrent())) / 100.0F);
      if (llillll1i1i11iiii1ii11il_ii1il11l111ii11iil.boolean121) {
         lliii11l1lllil.HudArmorPanel("speed").set(f, f);
         lliii11l1lllil.HudArmorPanel("shift").set(this.shift.getCurrent());
      }

      org.zenith.render.LegacyRenderBridge.enableBlend();
      org.zenith.render.LegacyRenderBridge.defaultBlendFunc();
      org.zenith.render.LegacyRenderBridge.disableDepthTest();
      org.zenith.render.LegacyRenderBridge.depthMask(false);
      org.zenith.render.LegacyRenderBridge.setNamedTexture("ColorTexture", simpleframebuffer.getColorAttachmentView(), FilterMode.LINEAR);
      org.zenith.render.LegacyRenderBridge.setNamedTexture("DepthTexture", simpleframebuffer.getDepthAttachmentView(), FilterMode.NEAREST);

      try {
         lliii11l1lllil.float251();
         HandShaderManager.var14336();
      } finally {
         org.zenith.render.LegacyRenderBridge.clearTexture();
         org.zenith.render.LegacyRenderBridge.defaultBlendFunc();
         org.zenith.render.LegacyRenderBridge.disableBlend();
         org.zenith.render.LegacyRenderBridge.depthMask(true);
         org.zenith.render.LegacyRenderBridge.enableDepthTest();
      }
   }

   public boolean isWorldReady() {
      return minecraftClient3.player != null && minecraftClient3.world != null;
   }

   public float int472() {
      long i = System.nanoTime();
      if (this.long132 < 0L) {
         this.long132 = i;
         return this.float185;
      }

      float f = Math.min((float)(i - this.long132) / 1.0E9F, 0.1F);
      this.long132 = i;
      if (this.animation3.isEnabled()) {
         this.float185 = (this.float185 + f * Math.max(0.0F, this.timeSpeed4.getCurrent())) % 100000.0F;
      }

      return this.float185;
   }

   public void float388() {
      this.float186 = minecraftClient3.player != null && minecraftClient3.player.getMainArm() == Arm.LEFT ? 0.28F : 0.72F;
      this.float187 = 0.22F;
   }

   public ShaderHand.Option float389() {
      return this.shaderMode2 == null ? ShaderHand.Option.call451 : ShaderHand.Option.EventPushOutOfBlocks(this.shaderMode2.getIndex());
   }

   public boolean float390() {
      return this.float389().boolean121;
   }


   public enum Option {
      call451("module.shaderHand.shader.aqua", "sirius_aqua", 0.6F, false),
      call479("module.shaderHand.shader.flow", "sirius_flow", 0.06F, false),
      call480("module.shaderHand.shader.smoke", "sirius_smoke", 3.0F, false),
      call481("module.shaderHand.shader.holyFuck", "sirius_holyfuck", 0.6F, true),
      call482("module.shaderHand.shader.gang", "sirius_gang", 0.6F, true),
      call483("module.shaderHand.shader.gamer", "sirius_gamer", 1.8F, false),
      call484("module.shaderHand.shader.galaxy", "sirius_galaxy", 0.06F, false),
      call485("module.shaderHand.shader.techno", "sirius_techno", 0.6F, false),
      call486("module.shaderHand.shader.golden", "sirius_golden", 0.6F, false),
      call487("module.shaderHand.shader.guiShader", "sirius_guishader", 1.2F, false),
      call488("module.shaderHand.shader.hidef", "sirius_hidef", 3.0F, false),
      call489("module.shaderHand.shader.homie", "sirius_homie", 0.06F, false),
      call490("module.shaderHand.shader.sheldon", "sirius_sheldon", 0.06F, false),
      call491("module.shaderHand.shader.smoky", "sirius_smoky", 0.06F, false),
      call492("module.shaderHand.shader.yippieOwns", "sirius_yippieowns", 6.0F, false),
      call493("module.shaderHand.shader.purple", "sirius_purple", 3.0F, false);

      public final String string74;
      public final String string75;
      public final float float143;
      public final boolean boolean121;

      Option(String var3, String var4, float var5, boolean var6) {
         this.string74 = var3;
         this.string75 = var4;
         this.float143 = var5;
         this.boolean121 = var6;
      }

      public static Option EventPushOutOfBlocks(int var0) {
         Option[] allillll1i1i11iiii1ii11il_ii1il11l111ii11iil = values();
         return var0 >= 0 && var0 < allillll1i1i11iiii1ii11il_ii1il11l111ii11iil.length ? allillll1i1i11iiii1ii11il_ii1il11l111ii11iil[var0] : call451;
      }

      public static String[] keys() {
         Option[] allillll1i1i11iiii1ii11il_ii1il11l111ii11iil = values();
         String[] astring = new String[allillll1i1i11iiii1ii11il_ii1il11l111ii11iil.length];

         for (int i = 0; i < allillll1i1i11iiii1ii11il_ii1il11l111ii11iil.length; i++) {
            astring[i] = allillll1i1i11iiii1ii11il_ii1il11l111ii11iil[i].string74;
         }

         return astring;
      }
   }
}
