package org.zenith.module;

import org.zenith.config.ConfigJsonUtil;
import org.zenith.core.ItemSpec;
import org.zenith.core.TextScanner;
import org.zenith.core.MediaTrackInfo;
import org.zenith.core.VisualSettingsStore;
import org.zenith.core.FileLogger;
import org.zenith.event.PacketReceiveEvent;
import org.zenith.event.PacketSendEvent;
import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.util.ArgbColor;
import org.zenith.module.Category;
import org.zenith.util.ColorUtils;
import org.zenith.render.HandShaderManager;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.EnchantItemSpec;
import org.zenith.core.ItemServiceBase;
import org.zenith.core.UiAnimation;
import org.zenith.render.RawShaderProgram;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.config.CosmeticManager;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;

import org.zenith.event.Event12;
import org.zenith.event.PreventActionEvent;

import org.zenith.setting.BooleanSetting;
import org.zenith.setting.ColorSetting;
import org.zenith.setting.ModeSetting;
import org.zenith.setting.ModeSetting_Var159;
import org.zenith.setting.ModeSetting3;
import org.zenith.setting.NumberSetting;





import net.minecraft.client.MinecraftClient;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.GlUniform;
import net.minecraft.client.gl.ShaderLoader;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.gl.ShaderLoader.LoadException;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.option.Perspective;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.util.Identifier;
import org.lwjgl.opengl.GL11;

@ModuleInfo(
   name = "Chams",
   category = Category.RENDER,
   description = "module.chams.desc"
)
public final class Chams extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final Chams chams = new Chams();
   public static final ShaderProgramKey shaderProgramKey = new ShaderProgramKey(
      Identifier.of("zenith", "core/chams_entity/data"), VertexFormats.POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL, Defines.EMPTY
   );
   public static final RenderLayer renderLayer = boolean139();
   public static final Object object4 = new Object();
   public static final int[] val522 = new int[4];
   public static SimpleFramebuffer simpleFramebuffer;
   public static SimpleFramebuffer simpleFramebuffer2;
   public static long long80 = Long.MIN_VALUE;
   public static RawShaderProgram var05;
   public static RawShaderProgram var052;
   public static boolean boolean38;
   public static boolean boolean39;
   public static boolean boolean40;
   public final ModeSetting targets = new ModeSetting(
      "module.chams.targets",
      "module.chams.targets.desc",
      ModeSetting_Var159.UiAnimation("module.chams.players", true),
      ModeSetting_Var159.UiAnimation("module.chams.self", false),
      ModeSetting_Var159.UiAnimation("module.chams.friends", true)
   );
   public final ModeSetting3 colorMode = new ModeSetting3(
      "module.chams.colorMode", "module.chams.colorMode.desc", "module.chams.color.rainbow", "module.chams.color.client", "module.chams.color.custom"
   );
   public final BooleanSetting secondColor = new BooleanSetting(
      "module.chams.secondColor", "module.chams.secondColor.desc", false, this::float161
   );
   public final ColorSetting customColor = new ColorSetting(
      "module.chams.customColor", "module.chams.customColor.desc", ArgbColor.var11934, this::float161
   );
   public final ColorSetting customSecondColor = new ColorSetting(
      "module.chams.customSecondColor",
      "module.chams.customSecondColor.desc",
      new ArgbColor(170, 120, 255),
      () -> this.float161() && this.secondColor.isEnabled()
   );
   public final NumberSetting colorTransfer = new NumberSetting(
      "module.chams.colorTransfer", 0.3F, 0.0F, 1.0F, 0.01F, "module.chams.colorTransfer.desc", ""
   );
   public final BooleanSetting blur = new BooleanSetting("module.chams.blur", "module.chams.blur.desc", true);
   public final NumberSetting blurIterations = new NumberSetting(
      "module.chams.blurIterations", 4.0F, 1.0F, 8.0F, 1.0F, "module.chams.blurIterations.desc", "", this.blur::isEnabled, null
   );
   public final NumberSetting blurOffset = new NumberSetting(
      "module.chams.blurOffset", 2.0F, 0.2F, 8.0F, 0.1F, "module.chams.blurOffset.desc", "", this.blur::isEnabled, null
   );
   public final NumberSetting blurStrength = new NumberSetting(
      "module.chams.blurStrength", 1.25F, 0.0F, 20.0F, 0.05F, "module.chams.blurStrength.desc", "", this.blur::isEnabled, null
   );
   public final NumberSetting brightness = new NumberSetting(
      "module.chams.brightness", 1.0F, 1.0F, 3.0F, 0.05F, "module.chams.brightness.desc", ""
   );
   public final BooleanSetting mirror = new BooleanSetting("module.chams.mirror", "module.chams.mirror.desc", false);
   public final BooleanSetting throughWalls = new BooleanSetting("module.chams.throughWalls", "module.chams.throughWalls.desc", false);
   public final NumberSetting alpha = new NumberSetting("module.chams.alpha", 1.0F, 0.98F, 1.0F, 0.01F, "module.chams.alpha.desc", "");
   public final NumberSetting speed = new NumberSetting(
      "module.chams.speed", 1.15F, 0.2F, 3.0F, 0.05F, "module.chams.speed.desc", ""
   );
   public final NumberSetting fresnel = new NumberSetting(
      "module.chams.fresnel", 1.8F, 0.2F, 4.0F, 0.1F, "module.chams.fresnel.desc", ""
   );

   public Chams() {
   }

   @Override
   public void onDisable() {
      super.onDisable();
      synchronized (object4) {
         UiAnimation(simpleFramebuffer);
         UiAnimation(simpleFramebuffer2);
         simpleFramebuffer = null;
         simpleFramebuffer2 = null;
         long80 = Long.MIN_VALUE;
      }

      float172();
   }

   public void int399() {
      this.float170();
   }

   public boolean on23(LivingEntityRenderState var1) {
      if (this.isEnabled()
         && minecraftClient3.player != null
         && minecraftClient3.world != null
         && var1 instanceof PlayerEntityRenderState playerentityrenderstate) {
         return minecraftClient3.world.getEntityById(playerentityrenderstate.id) instanceof AbstractClientPlayerEntity abstractclientplayerentity
            ? this.ItemServiceBase(abstractclientplayerentity)
            : false;
      } else {
         return false;
      }
   }

   public RenderLayer int400() {
      return renderLayer;
   }

   public boolean int401() {
      return this.float284() && this.float285();
   }

   public int PreventActionEvent(int var1) {
      int i = Math.clamp((long)Math.round(this.alpha.getCurrent() * 255.0F), 0, 255);
      return i << 24 | var1 & 16777215;
   }

   public int Event12(int var1) {
      int[] aint = this.zClass022Var159();
      int i = aint.length > 0 ? aint[0] : var1;
      return this.PreventActionEvent(i);
   }

   public boolean int402() {
      return this.throughWalls.isEnabled();
   }

   public static Chams_Var159 getChamsVar159() {
      return Chams_Var159.call094();
   }

   public boolean float284() {
      if (!boolean39) {
         ShaderLoader shaderloader = minecraftClient3.getShaderLoader();
         if (shaderloader == null) {
            boolean40 = false;
         } else {
            try {
               boolean40 = shaderloader.getProgramToLoad(shaderProgramKey) != null;
            } catch (LoadException loadexception) {
               boolean40 = false;
            }
         }

         boolean39 = true;
      }

      return boolean40;
   }

   public boolean float285() {
      synchronized (object4) {
         if (long80 == Long.MIN_VALUE) {
            return false;
         } else {
            int i = simpleFramebuffer != null ? simpleFramebuffer.getColorAttachment() : 0;
            return i > 0;
         }
      }
   }

   public boolean ItemServiceBase(AbstractClientPlayerEntity var1) {
      if (!var1.isAlive() || var1.isSpectator()) {
         return false;
      } else if (var1 == minecraftClient3.player) {
         return this.call405() && minecraftClient3.options.getPerspective() != Perspective.FIRST_PERSON;
      } else if (!this.float286()) {
         return false;
      } else {
         return !this.float160() && ZenithClient.on23().MediaTrackInfo().UiAnimation(var1)
            ? false
            : !AntiBot.antiBot.isEnabled() || !AntiBot.antiBot.ItemSpec(var1);
      }
   }

   public boolean float286() {
      return this.targets.ConfigJsonUtil(0);
   }

   public boolean call405() {
      return this.targets.ConfigJsonUtil(1);
   }

   public boolean float160() {
      return this.targets.ConfigJsonUtil(2);
   }

   public boolean float161() {
      return this.colorMode.is(2);
   }

   public static RenderLayer boolean139() {
      return new Chams_1(
         "zenith_chams_glass",
         VertexFormats.POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL,
         DrawMode.QUADS,
         1536,
         true,
         false,
         () -> {
            Chams l1ill111l1ll1illlil11 = chams;
            if (l1ill111l1ll1illlil11 != null) {
               RenderSystem.enableBlend();
               RenderSystem.defaultBlendFunc();
               RenderSystem.disableCull();
               RenderSystem.enableDepthTest();
               RenderSystem.depthMask(true);
               ShaderProgram shaderprogram = RenderSystem.setShader(shaderProgramKey);
               if (shaderprogram == null) {
                  boolean40 = false;
               } else {
                  boolean40 = true;
                  boolean39 = true;
                  int i = l1ill111l1ll1illlil11.float171();
                  if (i > 0) {
                     RenderSystem.setShaderTexture(0, i);
                     int[] aint = l1ill111l1ll1illlil11.zClass022Var159();
                     int j = aint[0];
                     int k = aint[1];
                     on23(shaderprogram, "iTime", l1ill111l1ll1illlil11.float174());
                     on23(shaderprogram, "PrimaryColor", j);
                     on23(shaderprogram, "SecondaryColor", k);
                     on23(shaderprogram, "AlphaMul", l1ill111l1ll1illlil11.alpha.getCurrent());
                     on23(shaderprogram, "FresnelPower", l1ill111l1ll1illlil11.fresnel.getCurrent());
                     on23(shaderprogram, "Freq", l1ill111l1ll1illlil11.float175());
                     on23(shaderprogram, "ColorTransfer", l1ill111l1ll1illlil11.colorTransfer.getCurrent());
                     on23(shaderprogram, "Brightness", l1ill111l1ll1illlil11.brightness.getCurrent());
                     on23(shaderprogram, "MirrorEnabled", l1ill111l1ll1illlil11.mirror.isEnabled() ? 1.0F : 0.0F);
                     on23(
                        shaderprogram,
                        (float)minecraftClient3.getWindow().getFramebufferWidth(),
                        (float)minecraftClient3.getWindow().getFramebufferHeight()
                     );
                  }
               }
            }
         },
         () -> {
            RenderSystem.setShaderTexture(0, 0);
            RenderSystem.enableCull();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableBlend();
         }
      );
   }

   public void float170() {
      if (minecraftClient3.world != null
         && minecraftClient3.getWindow() != null
         && minecraftClient3.getFramebuffer() != null) {
         synchronized (object4) {
            Chams_Var159 l1ill111l1ll1illlil11_ii1il11l111ii11iil = getChamsVar159();

            try {
               int i = minecraftClient3.getFramebuffer().fbo;
               if (i <= 0) {
                  return;
               }

               int j = Math.max(1, minecraftClient3.getFramebuffer().textureWidth);
               int k = Math.max(1, minecraftClient3.getFramebuffer().textureHeight);
               this.EnchantItemSpec(j, k);
               if (simpleFramebuffer == null) {
                  return;
               }

               long l = this.float173();
               if (long80 == l) {
                  return;
               }

               if (simpleFramebuffer.fbo > 0) {
                  GlStateManager._glBindFramebuffer(36008, i);
                  GlStateManager._glBindFramebuffer(36009, simpleFramebuffer.fbo);
                  GL11.glReadBuffer(36064);
                  GL11.glDrawBuffer(36064);
                  GlStateManager._glBlitFrameBuffer(0, 0, j, k, 0, 0, simpleFramebuffer.textureWidth, simpleFramebuffer.textureHeight, 16384, 9728);
                  if (this.blur.isEnabled()) {
                     this.int294();
                  }

                  long80 = l;
                  return;
               }
            } finally {
               l1ill111l1ll1illlil11_ii1il11l111ii11iil.vec3d16();
            }
         }
      }
   }

   public int float171() {
      synchronized (object4) {
         return simpleFramebuffer == null ? 0 : simpleFramebuffer.getColorAttachment();
      }
   }

   public void EnchantItemSpec(int var1, int var2) {
      if (simpleFramebuffer == null
         || simpleFramebuffer2 == null
         || simpleFramebuffer.textureWidth != var1
         || simpleFramebuffer.textureHeight != var2
         || simpleFramebuffer2.textureWidth != var1
         || simpleFramebuffer2.textureHeight != var2) {
         UiAnimation(simpleFramebuffer);
         UiAnimation(simpleFramebuffer2);
         simpleFramebuffer = new SimpleFramebuffer(var1, var2, false);
         simpleFramebuffer2 = new SimpleFramebuffer(var1, var2, false);
         on23(simpleFramebuffer);
         on23(simpleFramebuffer2);
         long80 = Long.MIN_VALUE;
      }
   }

   public static void on23(SimpleFramebuffer var0) {
      if (var0 != null) {
         var0.setTexFilter(9729);
      }
   }

   public void int294() {
      if (simpleFramebuffer != null && simpleFramebuffer2 != null && int295()) {
         int i = Math.clamp((long)Math.round(this.blurIterations.getCurrent()), 1, 8);
         float f = Math.max(0.0F, this.blurStrength.getCurrent());
         float f1 = Math.max(0.05F, this.blurOffset.getCurrent()) * (0.35F + f * 0.08F);
         SimpleFramebuffer simpleframebuffer = simpleFramebuffer;
         SimpleFramebuffer simpleframebuffer1 = simpleFramebuffer2;

         for (int j = 0; j < i; j++) {
            this.on23(var05, simpleframebuffer, simpleframebuffer1, f1);
            SimpleFramebuffer simpleframebuffer2 = simpleframebuffer;
            simpleframebuffer = simpleframebuffer1;
            simpleframebuffer1 = simpleframebuffer2;
         }

         for (int k = 0; k < i; k++) {
            this.on23(var052, simpleframebuffer, simpleframebuffer1, f1);
            SimpleFramebuffer simpleframebuffer3 = simpleframebuffer;
            simpleframebuffer = simpleframebuffer1;
            simpleframebuffer1 = simpleframebuffer3;
         }

         if (simpleframebuffer != simpleFramebuffer) {
            this.on23(var052, simpleframebuffer, simpleFramebuffer, 0.0F);
         }
      }
   }

   public void on23(RawShaderProgram var1, SimpleFramebuffer var2, SimpleFramebuffer var3, float var4) {
      if (var1 != null && var2 != null && var3 != null) {
         var3.beginWrite(true);
         var1.bind();
         var1.ItemSpec("image", 0);
         var1.on23("offset", var4);
         var1.on23("resolution", 1.0F / Math.max(1.0F, (float)var3.textureWidth), 1.0F / Math.max(1.0F, (float)var3.textureHeight));
         RenderSystem.activeTexture(33984);
         RenderSystem.bindTexture(var2.getColorAttachment());
         HandShaderManager.var14336();
         var1.unbind();
      }
   }

   public static boolean int295() {
      if (var05 != null && var052 != null) {
         return true;
      } else if (boolean38) {
         return false;
      } else {
         try {
            var05 = new RawShaderProgram("kawase_down", "fragment", "vertex");
            var052 = new RawShaderProgram("kawase_up", "fragment", "vertex");
            return true;
         } catch (RuntimeException runtimeexception) {
            float172();
            boolean38 = true;
            return false;
         }
      }
   }

   public static void float172() {
      if (var05 != null) {
         var05.delete();
         var05 = null;
      }

      if (var052 != null) {
         var052.delete();
         var052 = null;
      }

      boolean38 = false;
   }

   public long float173() {
      if (minecraftClient3.world == null) {
         return Long.MIN_VALUE;
      } else {
         long i = minecraftClient3.world.getTime();
         int j = Float.floatToIntBits(minecraftClient3.getRenderTickCounter().getTickDelta(false));
         return i << 32 ^ (long)j & 4294967295L;
      }
   }

   public float float174() {
      if (minecraftClient3.world == null) {
         return 0.0F;
      } else {
         float f = minecraftClient3.getRenderTickCounter().getTickDelta(false);
         return ((float)minecraftClient3.world.getTime() + f) * 0.05F * this.speed.getCurrent();
      }
   }

   public float float175() {
      return 0.0018F + this.speed.getCurrent() * 0.0025F;
   }

   public int[] zClass022Var159() {
      if (this.colorMode.is(0)) {
         long j1 = System.currentTimeMillis() / 8L;
         int k = CosmeticManager(j1 % 360L);
         int l = CosmeticManager((j1 + 90L) % 360L);
         return new int[]{k, l};
      } else if (this.colorMode.is(1)) {
         int i1 = ZenithClient.on23().TextScanner().getClientColor(0).call001();
         int k1 = ZenithClient.on23().TextScanner().getClientColor(180).call001();
         return new int[]{i1, k1};
      } else {
         int i = this.customColor.getIntColor();
         int j = this.secondColor.isEnabled() ? this.customSecondColor.getIntColor() : i;
         return new int[]{i, j};
      }
   }

   public static int CosmeticManager(long var0) {
      float f = (float)((var0 % 360L + 360L) % 360L) / 360.0F;
      return ArgbColor.FileLogger(f, 1.0F, 1.0F).call001();
   }

   public static void on23(ShaderProgram var0, String var1, float var2) {
      GlUniform gluniform = var0.getUniform(var1);
      if (gluniform != null) {
         gluniform.set(var2);
      }
   }

   public static void on23(ShaderProgram var0, float var1, float var2) {
      GlUniform gluniform = var0.getUniform("ScreenSize");
      if (gluniform != null) {
         gluniform.set(var1, var2);
      }
   }

   public static void on23(ShaderProgram var0, String var1, int var2) {
      GlUniform gluniform = var0.getUniform(var1);
      if (gluniform != null) {
         gluniform.set(
            ColorUtils.PacketReceiveEvent(var2),
            ColorUtils.PacketSendEvent(var2),
            ColorUtils.VisualSettingsStore(var2)
         );
      }
   }

   public static void UiAnimation(SimpleFramebuffer var0) {
      if (var0 != null) {
         var0.delete();
      }
   }
}
