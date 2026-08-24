package org.zenith.module;

import org.zenith.core.HudStatusPanel;
import org.zenith.event.EventPushOutOfBlocks;
import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.render.HandShaderManager;
import org.zenith.module.Module;
import org.zenith.core.ItemRegistry;
import org.zenith.ZenithClient;
import org.zenith.core.ItemSpec;
import org.zenith.core.TextScanner;
import org.zenith.render.RawShaderProgram;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;

import org.zenith.setting.BooleanSetting;
import org.zenith.setting.ModeSetting3;
import org.zenith.setting.NumberSetting;





import net.minecraft.client.MinecraftClient;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.util.Arm;

@ModuleInfo(
   name = "ShaderHand",
   category = Category.RENDER,
   description = ""
)
public final class ShaderHand extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final ShaderHand shaderHand = new ShaderHand();
   public static final float float181 = 0.72F;
   public static final float float182 = 0.72F;
   public static final float float183 = 0.28F;
   public static final float float184 = 0.22F;
   public final ModeSetting3 shaderMode2 = new ModeSetting3(
      "module.shaderHand.shaderMode", "module.shaderHand.shaderMode.desc", ShaderHand_Var159.keys()
   );
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

   public ShaderHand() {
   }

   public void ItemSpec(Runnable var1) {
      this.on23(var1, 0.0F);
   }

    public void on23(Runnable var1, float var2) {
        if (!HandShaderManager.isInitialized() || HandShaderManager.string38() == null) {
           var1.run();
        } else {
           try {
              this.TextScanner(var1);
           } catch (Exception exception) {
              exception.printStackTrace();
              Framebuffer framebuffer = minecraftClient3.getFramebuffer();
              if (framebuffer != null) {
                 framebuffer.beginWrite(true);
              }

              var1.run();
           }
        }
    }

   public void TextScanner(Runnable var1) {
      Framebuffer framebuffer = minecraftClient3.getFramebuffer();
      SimpleFramebuffer simpleframebuffer = HandShaderManager.string38();
      ShaderHand_Var159 llillll1i1i11iiii1ii11il_ii1il11l111ii11iil = this.float389();
      RawShaderProgram lliii11l1lllil = HandShaderManager.HudStatusPanel(llillll1i1i11iiii1ii11il_ii1il11l111ii11iil.string75);
      if (framebuffer == null || simpleframebuffer == null || lliii11l1lllil == null) {
         var1.run();
      } else {
         simpleframebuffer.beginWrite(true);
          RenderSystem.clearColor(0.0F, 0.0F, 0.0F, 0.0F);
          RenderSystem.clear(16640);
          simpleframebuffer.copyDepthFrom(framebuffer);
          var1.run();
          framebuffer.beginWrite(true);
          RenderSystem.enableBlend();
          RenderSystem.defaultBlendFunc();
          RenderSystem.disableDepthTest();
          RenderSystem.activeTexture(33984);
          RenderSystem.bindTexture(simpleframebuffer.getColorAttachment());
          RenderSystem.activeTexture(33985);
          RenderSystem.bindTexture(simpleframebuffer.getDepthAttachment());

         try {
            lliii11l1lllil.bind();
            this.on23(lliii11l1lllil, simpleframebuffer, llillll1i1i11iiii1ii11il_ii1il11l111ii11iil);
            HandShaderManager.var14336();
            lliii11l1lllil.unbind();
         } finally {
            lliii11l1lllil.unbind();
            RenderSystem.activeTexture(33984);
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableBlend();
            RenderSystem.enableDepthTest();
            if (minecraftClient3.getFramebuffer() != null) {
               minecraftClient3.getFramebuffer().beginWrite(true);
            }
         }
      }
   }

   public void on23(RawShaderProgram var1, SimpleFramebuffer var2, ShaderHand_Var159 var3) {
      int i = Math.max(1, var2.textureWidth);
      int j = Math.max(1, var2.textureHeight);
      float f = var3.boolean121 ? this.patternSpeed.getCurrent() : 1.0F;
      var1.ItemSpec("ColorTexture", 0);
      var1.ItemSpec("DepthTexture", 1);
      var1.on23("resolution", (float)i, (float)j);
      var1.on23("time", this.int472() * var3.float143);
      this.float388();
      var1.on23("handMotion", this.float186, this.float187);
      var1.on23("effectAlpha", Math.max(0.0F, Math.min(100.0F, this.effectAlpha.getCurrent())) / 100.0F);
      if (var3.boolean121) {
         var1.on23("speed", f, f);
      }

      if (var3.boolean121) {
         var1.on23("shift", this.shift.getCurrent());
      }
   }

   public float int472() {
      long i = System.nanoTime();
      if (this.long132 < 0L) {
         this.long132 = i;
         return this.float185;
      } else {
         float f = Math.min((float)(i - this.long132) / 1.0E9F, 0.1F);
         this.long132 = i;
         if (this.animation3.isEnabled()) {
            this.float185 = (this.float185 + f * Math.max(0.0F, this.timeSpeed4.getCurrent())) % 100000.0F;
         }

         return this.float185;
      }
   }

   public void float388() {
      this.float186 = minecraftClient3.player != null && minecraftClient3.player.getMainArm() == Arm.LEFT
         ? 0.28F
         : 0.72F;
      this.float187 = 0.22F;
   }

   public int ItemRegistry(SimpleFramebuffer var1) {
      int i = Math.max(1, var1.textureHeight);
      return Math.min(i, Math.max(1, (int)((float)i * 0.72F)));
   }

   public ShaderHand_Var159 float389() {
      return this.shaderMode2 == null
         ? ShaderHand_Var159.call451
         : ShaderHand_Var159.EventPushOutOfBlocks(this.shaderMode2.getIndex());
   }

   public boolean float390() {
      return this.float389().boolean121;
   }
}
