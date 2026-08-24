package org.zenith.module;

import org.zenith.core.ItemSpec;
import org.zenith.core.TextScanner;
import org.zenith.core.VisualSettingsStore;
import org.zenith.core.FileLogger;
import org.zenith.event.EventHookWorldRender;
import org.zenith.event.EventRender2;
import org.zenith.event.PacketReceiveEvent;
import org.zenith.event.PacketSendEvent;
import org.zenith.setting.Setting;
import org.zenith.util.Item;

import org.zenith.module.ModuleInfo;

import org.zenith.util.ArgbColor;
import org.zenith.module.Category;
import org.zenith.util.ColorUtils;
import org.zenith.render.HandShaderManager;
import org.zenith.module.Module;
import org.zenith.core.SimpleItemBuilder;
import org.zenith.ZenithClient;
import org.zenith.core.ColorAnimator;
import org.zenith.core.ItemServiceBase;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.render.RawShaderProgram;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.TrajectoryDataset;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;
import org.zenith.core.MovementSimulator;
import org.zenith.core.TargetInterpolator;

import org.zenith.setting.BooleanSetting;
import org.zenith.setting.ColorSetting;
import org.zenith.setting.ModeSetting3;
import org.zenith.setting.NumberSetting;





import net.minecraft.client.MinecraftClient;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.Consumer;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import org.lwjgl.opengl.GL20;

@ModuleInfo(
   name = "HandFire",
   category = Category.RENDER,
   description = "module.handFire.desc"
)
public final class HandFire extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final HandFire handFire = new HandFire();
   public static final int int102 = 1048576;
   public static final int int103 = 0; // TODO reconstructed
   public static final int int104 = 0; // TODO reconstructed
   public static final int[] val123 = new int[4];
   public static SimpleFramebuffer simpleFramebuffer3;
   public static SimpleFramebuffer simpleFramebuffer4;
   public static SimpleFramebuffer simpleFramebuffer5;
   public static SimpleFramebuffer simpleFramebuffer6;
   public static RawShaderProgram var053;
   public static RawShaderProgram var054;
   public static RawShaderProgram var055;
   public static boolean initialized;
   public static boolean boolean53;
   public static boolean boolean54;
   public static boolean boolean55;
   public static float float23;
   public static boolean boolean56;
   public static boolean boolean57;
   public static boolean boolean58;
   public static boolean boolean59;
   public static boolean boolean60;
   public static float float24;
   public static long long84;
   public static BufferAllocator bufferAllocator;
   public final int[] val010 = new int[4];
   public final ModeSetting3 palette = new ModeSetting3(
      "module.handFire.palette",
      "module.handFire.palette.desc",
      "module.handFire.palette.client",
      "module.handFire.palette.custom",
      "module.handFire.palette.rainbow"
   );
   public final ColorSetting primaryColor = new ColorSetting(
      "module.handFire.primaryColor", "module.handFire.primaryColor.desc", new ArgbColor(255, 84, 20), this::double53
   );
   public final ColorSetting secondaryColor = new ColorSetting(
      "module.handFire.secondaryColor", "module.handFire.secondaryColor.desc", new ArgbColor(255, 220, 80), this::double53
   );
   public final NumberSetting persistence = new NumberSetting(
      "module.handFire.persistence", 1.0F, 0.98F, 1.0F, 0.01F, "module.handFire.persistence.desc", ""
   );
   public final NumberSetting lift = new NumberSetting(
      "module.handFire.lift", 0.04F, 0.0F, 0.1F, 0.01F, "module.handFire.lift.desc", ""
   );
   public final NumberSetting turbulence = new NumberSetting(
      "module.handFire.turbulence", 0.12F, 0.0F, 0.25F, 0.01F, "module.handFire.turbulence.desc", ""
   );
   public final NumberSetting intensity = new NumberSetting(
      "module.handFire.intensity", 1.0F, 1.0F, 1.7F, 0.05F, "module.handFire.intensity.desc", "x"
   );
   public final NumberSetting alpha2 = new NumberSetting(
      "module.handFire.alpha", 0.86F, 0.1F, 1.0F, 0.01F, "module.handFire.alpha.desc", ""
   );
   public final NumberSetting vanillaHandAlpha = new NumberSetting(
      "module.handFire.vanillaHandAlpha", 255.0F, 0.0F, 255.0F, 1.0F, "module.handFire.vanillaHandAlpha.desc", ""
   );
   public final BooleanSetting drawUnderHand = new BooleanSetting(
      "module.handFire.drawUnderHand", "module.handFire.drawUnderHand.desc", false, () -> this.vanillaHandAlpha.getCurrent() > 0.0F
   );

   public HandFire() {
   }

   public boolean double156() {
      return this.isEnabled()
         && minecraftClient3.player != null
         && minecraftClient3.world != null
         && minecraftClient3.getWindow() != null;
   }

   public static float var03() {
      float f = float23;
      float23 = 1.0F;
      return f;
   }

   public static boolean zClass101() {
      return boolean53;
   }

   @Override
   public void onDisable() {
      super.onDisable();
      call078();
      double72();
   }

   public void zClass095() {
      if (this.double156() && !boolean53) {
         float361();
         if (initialized) {
            HandFire_Var159 l1ii1iilii1i11lill1lll_ii1il11l111ii11iil = HandFire_Var159.double54();
            if (l1ii1iilii1i11lill1lll_ii1il11l111ii11iil.int163() > 0 && l1ii1iilii1i11lill1lll_ii1il11l111ii11iil.int164() > 0) {
               try {
                  SimpleItemBuilder(l1ii1iilii1i11lill1lll_ii1il11l111ii11iil.int163(), l1ii1iilii1i11lill1lll_ii1il11l111ii11iil.int164());
                  if (double62()) {
                     Easing(simpleFramebuffer3);
                     Easing(simpleFramebuffer4);
                     boolean56 = true;
                     boolean57 = false;
                     boolean58 = false;
                     boolean59 = false;
                     float23 = 1.0F;
                     float24 = 0.0F;
                     return;
                  }
               } catch (Exception exception) {
                  UiAnimation(exception);
                  return;
               } finally {
                  Easing(l1ii1iilii1i11lill1lll_ii1il11l111ii11iil);
               }
            }
         }
      }
   }

   public void float360() {
      if (boolean56) {
         HandFire_Var159 l1ii1iilii1i11lill1lll_ii1il11l111ii11iil = HandFire_Var159.double54();

         try {
            if (this.drawUnderHand.isEnabled()) {
               if (boolean59) {
                  boolean197();
                  this.float362();
               }

               double73();
            } else if (boolean57 || boolean60) {
               if (boolean57) {
                  boolean197();
               }

               int i = this.float362();
               this.on23(l1ii1iilii1i11lill1lll_ii1il11l111ii11iil, i);
               double73();
            }
         } catch (Exception exception) {
            UiAnimation(exception);
         } finally {
            boolean56 = false;
            boolean57 = false;
            boolean58 = false;
            boolean59 = false;
            float23 = 1.0F;
            Easing(l1ii1iilii1i11lill1lll_ii1il11l111ii11iil);
         }
      }
   }

   public void on23(
      AbstractClientPlayerEntity var1,
      float var2,
      float var3,
      Hand var4,
      float var5,
      ItemStack var6,
      float var7,
      MatrixStack var8,
      VertexConsumerProvider var9,
      int var10,
      Consumer<VertexConsumerProvider> var11
   ) {
      if (this.double156() && !boolean53) {
         if (!boolean56) {
            this.zClass095();
         }

         float361();
         if (initialized && boolean56) {
            HandFire_Var159 l1ii1iilii1i11lill1lll_ii1il11l111ii11iil = HandFire_Var159.double54();
            if (l1ii1iilii1i11lill1lll_ii1il11l111ii11iil.int163() > 0 && l1ii1iilii1i11lill1lll_ii1il11l111ii11iil.int164() > 0) {
               float f = this.int451();
               float23 = f;
               float24 = Math.max(float24, 1.0F);

               try {
                  simpleFramebuffer3.beginWrite(false);
                  RenderSystem.viewport(0, 0, simpleFramebuffer3.textureWidth, simpleFramebuffer3.textureHeight);
                  RenderSystem.colorMask(true, true, true, true);
                  RenderSystem.depthMask(true);
                  RenderSystem.enableDepthTest();
                  boolean53 = true;
                  BufferAllocator bufferallocator = double63();

                  try {
                     Immediate immediate = VertexConsumerProvider.immediate(bufferallocator);
                     var11.accept(immediate);
                     immediate.draw();
                     boolean57 = true;
                     long84 = System.currentTimeMillis();
                  } finally {
                     bufferallocator.reset();
                     boolean53 = false;
                  }

                  if (this.drawUnderHand.isEnabled()) {
                     if (boolean58) {
                        boolean59 = true;
                     } else {
                        boolean197();
                        int i = this.float362();
                        this.on23(l1ii1iilii1i11lill1lll_ii1il11l111ii11iil, i);
                        boolean58 = true;
                        Easing(l1ii1iilii1i11lill1lll_ii1il11l111ii11iil);
                     }
                  }

                  if (f > 0.0F) {
                     on23(l1ii1iilii1i11lill1lll_ii1il11l111ii11iil);
                     var11.accept(var9);
                  }
               } catch (Exception exception) {
                  on23(l1ii1iilii1i11lill1lll_ii1il11l111ii11iil);
                  if (f > 0.0F) {
                     float23 = f;
                     var11.accept(var9);
                  }

                  UiAnimation(exception);
               } finally {
                  boolean53 = false;
                  Easing(l1ii1iilii1i11lill1lll_ii1il11l111ii11iil);
               }
            } else {
               var11.accept(var9);
            }
         } else {
            var11.accept(var9);
         }
      } else {
         var11.accept(var9);
      }
   }

   public static void float361() {
      if (!initialized) {
         try {
            var053 = new RawShaderProgram("hand", "hand_fire_mask", "smoke");
            var054 = new RawShaderProgram("hand", "hand_fire_accumulate", "smoke");
            var055 = new RawShaderProgram("hand", "hand_fire_composite", "smoke");
            initialized = true;
         } catch (Exception exception) {
            if (!boolean54) {
               System.err.println("Failed to initialize HandFire shaders");
               exception.printStackTrace();
               boolean54 = true;
            }

            initialized = false;
         }
      }
   }

   public static void boolean197() {
      simpleFramebuffer4.beginWrite(true);
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.disableBlend();
      var053.bind();
      var053.ItemSpec("SourceTex", 0);
      RenderSystem.activeTexture(33984);
      RenderSystem.bindTexture(simpleFramebuffer3.getColorAttachment());
      HandShaderManager.var14336();
      var053.unbind();
      RenderSystem.activeTexture(33984);
   }

   public int float362() {
      if (!boolean60) {
         Easing(simpleFramebuffer5);
         Easing(simpleFramebuffer6);
         boolean60 = true;
      }

      simpleFramebuffer6.beginWrite(true);
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.disableBlend();
      RenderSystem.colorMask(true, true, true, true);
      int[] aint = this.float363();
      var054.bind();
      var054.ItemSpec("PreviousTex", 0);
      var054.ItemSpec("HandTex", 1);
      var054.ItemSpec("MaskTex", 2);
      var054.on23("TexelSize", 1.0F / (float)simpleFramebuffer6.textureWidth, 1.0F / (float)simpleFramebuffer6.textureHeight);
      var054.on23("Time", float174());
      var054.on23("Decay", this.persistence.getCurrent());
      var054.on23("Intensity", this.intensity.getCurrent());
      var054.on23("Lift", this.lift.getCurrent());
      var054.on23("Turbulence", this.turbulence.getCurrent());
      var054.on23("Alpha", this.alpha2.getCurrent());
      var054.on23("EmitStrength", float24);
      on23(var054, "ColorHot", aint[0]);
      on23(var054, "ColorMid", aint[1]);
      on23(var054, "ColorEdge", aint[2]);
      on23(var054, "ColorSmoke", aint[3]);
      RenderSystem.activeTexture(33984);
      RenderSystem.bindTexture(simpleFramebuffer5.getColorAttachment());
      RenderSystem.activeTexture(33985);
      RenderSystem.bindTexture(simpleFramebuffer3.getColorAttachment());
      RenderSystem.activeTexture(33986);
      RenderSystem.bindTexture(simpleFramebuffer4.getColorAttachment());
      HandShaderManager.var14336();
      var054.unbind();
      SimpleFramebuffer simpleframebuffer = simpleFramebuffer5;
      simpleFramebuffer5 = simpleFramebuffer6;
      simpleFramebuffer6 = simpleframebuffer;
      RenderSystem.activeTexture(33984);
      return simpleFramebuffer5.getColorAttachment();
   }

   public void on23(HandFire_Var159 var1, int var2) {
      on23(var1);
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      var055.bind();
      var055.ItemSpec("FireTex", 0);
      var055.ItemSpec("HandTex", 1);
      var055.ItemSpec("MaskTex", 2);
      var055.on23("TexelSize", 1.0F / (float)var1.int163(), 1.0F / (float)var1.int164());
      var055.on23("Time", float174());
      var055.on23("Intensity", this.intensity.getCurrent());
      var055.on23("Alpha", this.alpha2.getCurrent());
      int[] aint = this.float363();
      on23(var055, "ColorHot", aint[0]);
      on23(var055, "ColorMid", aint[1]);
      on23(var055, "ColorEdge", aint[2]);
      RenderSystem.activeTexture(33984);
      RenderSystem.bindTexture(var2);
      RenderSystem.activeTexture(33985);
      RenderSystem.bindTexture(simpleFramebuffer3.getColorAttachment());
      RenderSystem.activeTexture(33986);
      RenderSystem.bindTexture(simpleFramebuffer4.getColorAttachment());
      HandShaderManager.var14336();
      var055.unbind();
      RenderSystem.activeTexture(33984);
   }

   public int[] float363() {
      if (this.palette.is(2)) {
         long l = System.currentTimeMillis() / 7L;
         this.val010[0] = Easing((l + 8L) % 360L, 255);
         this.val010[1] = Easing((l + 45L) % 360L, 255);
         this.val010[2] = Easing((l + 120L) % 360L, 255);
         this.val010[3] = Easing((l + 210L) % 360L, 185);
         return this.val010;
      } else if (this.palette.is(0)) {
         int k = ItemServiceBase(ZenithClient.on23().TextScanner().getClientColor(90).call001(), 255);
         this.val010[0] = Easing(k, int103, 0.0F);
         this.val010[1] = k;
         this.val010[2] = 0;
         this.val010[3] = ItemServiceBase(Easing(k, int104, 0.58F), 185);
         return this.val010;
      } else if (this.palette.is(1)) {
         int i = ItemServiceBase(this.primaryColor.getIntColor(), 255);
         int j = ColorUtils.on23(
               4, 90, new ArgbColor(i), new ArgbColor(ItemServiceBase(this.secondaryColor.getIntColor(), 255))
            )
            .call001();
         this.val010[0] = Easing(j, int103, 0.18F);
         this.val010[1] = j;
         this.val010[2] = 0;
         this.val010[3] = ItemServiceBase(Easing(j, int104, 0.58F), 185);
         return this.val010;
      } else {
         this.val010[0] = -1;
         this.val010[1] = -1;
         this.val010[2] = -1;
         this.val010[3] = -1;
         return this.val010;
      }
   }

   public static float float174() {
      return (float)(System.currentTimeMillis() % 100000L) / 1000.0F;
   }

   public static void SimpleItemBuilder(int var0, int var1) {
      if (simpleFramebuffer3 == null
         || simpleFramebuffer4 == null
         || simpleFramebuffer5 == null
         || simpleFramebuffer6 == null
         || simpleFramebuffer3.textureWidth != var0
         || simpleFramebuffer3.textureHeight != var1
         || simpleFramebuffer4.textureWidth != var0
         || simpleFramebuffer4.textureHeight != var1
         || simpleFramebuffer5.textureWidth != var0
         || simpleFramebuffer5.textureHeight != var1
         || simpleFramebuffer6.textureWidth != var0
         || simpleFramebuffer6.textureHeight != var1) {
         ColorAnimator(simpleFramebuffer3);
         ColorAnimator(simpleFramebuffer4);
         ColorAnimator(simpleFramebuffer5);
         ColorAnimator(simpleFramebuffer6);
         simpleFramebuffer3 = new SimpleFramebuffer(var0, var1, true);
         simpleFramebuffer4 = new SimpleFramebuffer(var0, var1, false);
         simpleFramebuffer5 = new SimpleFramebuffer(var0, var1, false);
         simpleFramebuffer6 = new SimpleFramebuffer(var0, var1, false);
         on23(simpleFramebuffer3);
         on23(simpleFramebuffer4);
         on23(simpleFramebuffer5);
         on23(simpleFramebuffer6);
         boolean60 = false;
      }
   }

   public static boolean double62() {
      return simpleFramebuffer3 != null && simpleFramebuffer4 != null && simpleFramebuffer5 != null && simpleFramebuffer6 != null;
   }

   public static void on23(SimpleFramebuffer var0) {
      if (var0 != null) {
         var0.setTexFilter(9729);
      }
   }

   public static void on23(HandFire_Var159 var0) {
      GlStateManager._glBindFramebuffer(36009, UiAnimation(var0));
      RenderSystem.viewport(var0.int161(), var0.int162(), var0.int163(), var0.int164());
   }

   public static int UiAnimation(HandFire_Var159 var0) {
      if (var0.int160() > 0) {
         return var0.int160();
      } else {
         Framebuffer framebuffer = minecraftClient3.getFramebuffer();
         return framebuffer != null && framebuffer.fbo > 0 ? framebuffer.fbo : 0;
      }
   }

   public static void Easing(SimpleFramebuffer var0) {
      if (var0 != null) {
         var0.setClearColor(0.0F, 0.0F, 0.0F, 0.0F);
         var0.clear();
      }
   }

   public static void Easing(HandFire_Var159 var0) {
      GlStateManager._glBindFramebuffer(36008, var0.int159());
      GlStateManager._glBindFramebuffer(36009, var0.int160());
      RenderSystem.viewport(var0.int161(), var0.int162(), var0.int163(), var0.int164());
      RenderSystem.colorMask(true, true, true, true);
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.activeTexture(33984);
      GL20.glUseProgram(0);
   }

   public static void on23(RawShaderProgram var0, String var1, int var2) {
      var0.on23(
         var1,
         ColorUtils.PacketReceiveEvent(var2),
         ColorUtils.PacketSendEvent(var2),
         ColorUtils.VisualSettingsStore(var2),
         ColorUtils.Item(var2)
      );
   }

   public static BufferAllocator double63() {
      if (bufferAllocator == null) {
         bufferAllocator = new BufferAllocator(1048576);
      }

      return bufferAllocator;
   }

   public static void double72() {
      if (bufferAllocator != null) {
         bufferAllocator.close();
         bufferAllocator = null;
      }
   }

   public static void ColorAnimator(SimpleFramebuffer var0) {
      if (var0 != null) {
         var0.delete();
      }
   }

   public static void UiAnimation(Exception var0) {
      if (!boolean55) {
         System.err.println("HandFire render failed");
         var0.printStackTrace();
         boolean55 = true;
      }
   }

   public static void double73() {
      if (float24 <= 0.001F && long84 > 0L && System.currentTimeMillis() - long84 > 2200L) {
         boolean60 = false;
         Easing(simpleFramebuffer5);
         Easing(simpleFramebuffer6);
      }
   }

   public static void call078() {
      boolean56 = false;
      boolean57 = false;
      boolean58 = false;
      boolean59 = false;
      boolean60 = false;
      float23 = 1.0F;
      float24 = 0.0F;
      long84 = 0L;
   }

   public float int451() {
      return Math.max(0.0F, Math.min(255.0F, this.vanillaHandAlpha.getCurrent())) / 255.0F;
   }

   public boolean double53() {
      return this.palette.is(1);
   }

   public static int Easing(long var0, int var2) {
      float f = (float)((var0 % 360L + 360L) % 360L) / 360.0F;
      return ArgbColor.FileLogger(f, 1.0F, 1.0F).EventHookWorldRender(var2).call001();
   }

   public static int Easing(int var0, int var1, float var2) {
      return ArgbColor.EventRender2(var0).Easing(ArgbColor.EventRender2(var1), var2).call001();
   }

   public static int ItemServiceBase(int var0, int var1) {
      return ArgbColor.EventRender2(var0).EventHookWorldRender(var1).call001();
   }
}
