package l;

import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;

public final class Helper259 {
   public static volatile Helper259 INSTANCE;
   private static final long SIGNS_MS = 980L;
   private static final long SMOKE_MS = 240L;
   private static final long APPEAR_MS = 220L;
   private static final long HOLD_MS = 1400L;
   private static final long DISPERSE_MS = 620L;
   private static final long TOTAL_MS = 3460L;
   private static final int DEFAULT_CLONES = 4;
   private static final double DEFAULT_RADIUS = 1.15;
   private final Cosmetic owner;
   private final Deque<Helper257> smoke = new ArrayDeque<>();
   private final List<Helper258> clones = new ArrayList<>();
   private final Identifier smokeTexture = Identifier.of("mre", "textures/oblok.png");
   private final Identifier shadowSoundId = Identifier.of("minecraft", "naruto_shadow_clones");
   private long startMs = -1L;
   private boolean smokeBurstDone;
   private boolean clonesSpawned;
   private Vec3d anchorPos = Vec3d.ZERO;
   private float anchorYaw;
   private boolean anchorSet;

   public Helper259(Cosmetic var1) {
      this.owner = var1;
      INSTANCE = this;
   }

   public static float method2657(PlayerEntity var0) {
      Helper259 var1 = INSTANCE;
      if (var1 != null && Cosmetic.mc.player != null && var0 != null) {
         if (Cosmetic.mc.player.getId() != var0.getId() || !var1.method2659()) {
            return 0.0F;
         } else {
            return Cosmetic.mc.options.getPerspective().isFirstPerson() ? 0.0F : var1.method2661(var1.method2660(System.currentTimeMillis()));
         }
      } else {
         return 0.0F;
      }
   }

   public void deactivate() {
      this.startMs = -1L;
      this.smokeBurstDone = false;
      this.clonesSpawned = false;
      this.anchorPos = Vec3d.ZERO;
      this.anchorYaw = 0.0F;
      this.anchorSet = false;
      this.smoke.clear();
      this.clones.clear();
   }

   public void onWorldRender(Event10 var1) {
      if (Cosmetic.mc.world != null && Cosmetic.mc.player != null && this.owner.method1877()) {
         if (this.owner.method1932().method2385("Теневые клоны")) {
            if (this.owner.method1875()) {
               this.method2658();
            }

            if (this.method2659()) {
               long var2 = System.currentTimeMillis();
               long var4 = this.method2660(var2);
               if (var4 >= 3460L) {
                  this.deactivate();
               } else {
                  if (!this.smokeBurstDone && var4 >= 980L) {
                     this.smokeBurstDone = true;
                     this.method2664(var2);
                  }

                  if (!this.clonesSpawned && var4 >= 1220L) {
                     this.clonesSpawned = true;
                     this.method2665(var2);
                  }

                  if (!Cosmetic.mc.options.getPerspective().isFirstPerson()) {
                     this.method2666(var1, var2);
                     this.method2667(var1, var2);
                  }
               }
            }
         }
      }
   }

   private void method2658() {
      this.startMs = System.currentTimeMillis();
      this.smokeBurstDone = false;
      this.clonesSpawned = false;
      this.smoke.clear();
      this.clones.clear();
      if (Cosmetic.mc.player != null) {
         this.anchorPos = Cosmetic.mc.player.getPos();
         this.anchorYaw = Cosmetic.mc.player.bodyYaw;
         this.anchorSet = true;
      } else {
         this.anchorPos = Vec3d.ZERO;
         this.anchorYaw = 0.0F;
         this.anchorSet = false;
      }

      try {
         Cosmetic.mc.getSoundManager().play(PositionedSoundInstance.master(SoundEvent.of(this.shadowSoundId), 1.0F));
      } catch (Throwable var2) {
      }
   }

   private boolean method2659() {
      return this.startMs > 0L;
   }

   private long method2660(long var1) {
      return Math.max(0L, var1 - this.startMs);
   }

   private float ease(float var1) {
      var1 = MathHelper.clamp(var1, 0.0F, 1.0F);
      return var1 * var1 * (3.0F - 2.0F * var1);
   }

   private float method2661(long var1) {
      if (var1 <= 0L) {
         return 0.0F;
      } else if (var1 < 980L) {
         return this.ease((float)var1 / 980.0F);
      } else {
         long var3 = 1330L;
         if (var1 < var3) {
            return 1.0F;
         } else {
            long var5 = 520L;
            long var7 = var1 - var3;
            return var7 >= var5 ? 0.0F : 1.0F - this.ease((float)var7 / (float)var5);
         }
      }
   }

   private float method2662(long var1) {
      long var3 = 2840L;
      if (var1 < var3) {
         return 1.0F;
      } else {
         float var5 = (float)(var1 - var3) / 620.0F;
         return 1.0F - this.ease(MathHelper.clamp(var5, 0.0F, 1.0F));
      }
   }

   private float method2663(long var1) {
      long var3 = 1220L;
      long var5 = var3 + 220L;
      if (var1 <= var3) {
         return 0.0F;
      } else {
         return var1 >= var5 ? 1.0F : this.ease((float)(var1 - var3) / 220.0F);
      }
   }

   private void method2664(long var1) {
      Vec3d var3 = this.anchorSet ? this.anchorPos : Cosmetic.mc.player.getPos();

      for (int var4 = 0; var4 < 18; var4++) {
         double var5 = (Math.PI * 2) * (var4 / 18.0);
         double var7 = 0.18 + var4 % 6 * 0.06;
         double var9 = Math.cos(var5) * var7;
         double var11 = Math.sin(var5) * var7;
         double var13 = 0.04 + var4 % 4 * 0.06;
         float var15 = 0.48F + var4 % 6 * 0.08F;
         long var16 = 560L + var4 % 7 * 70L;
         this.smoke.add(new Helper257(var3.x + var9, var3.y + var13, var3.z + var11, var1, var16, var15, var15 * 1.5F));
      }

      for (int var18 = 0; var18 < 10; var18++) {
         double var19 = (Math.PI * 2) * (var18 / 10.0);
         double var20 = 0.54 + var18 % 3 * 0.12;
         double var21 = Math.cos(var19) * var20;
         double var22 = Math.sin(var19) * var20;
         double var23 = 0.1 + var18 % 3 * 0.08;
         float var24 = 0.78F + var18 % 4 * 0.1F;
         long var25 = 820L + var18 % 5 * 90L;
         this.smoke.add(new Helper257(var3.x + var21, var3.y + var23, var3.z + var22, var1, var25, var24, var24 * 1.8F));
      }
   }

   private void method2665(long var1) {
      if (Cosmetic.mc.player != null && Cosmetic.mc.world != null) {
         ClientPlayerEntity var3 = Cosmetic.mc.player;
         GameProfile var4 = var3.getGameProfile();
         this.clones.clear();

         for (int var5 = 0; var5 < 4; var5++) {
            OtherClientPlayerEntity var6 = new OtherClientPlayerEntity(Cosmetic.mc.world, var4);
            var6.setPose(EntityPose.STANDING);
            var6.setInvisible(false);
            double var7 = (Math.PI * 2) * (var5 / 4.0);
            double var9 = 1.15 + (var1 + var5 * 37L & 7L) / 7.0 * 0.35;
            this.clones
               .add(new Helper258(var6, Math.cos(var7) * var9, Math.sin(var7) * var9, (float)Math.toDegrees(var7) + 180.0F, var1 ^ var5 * 1315423911L));
         }
      }
   }

   private void method2666(Event10 var1, long var2) {
      if (!this.smoke.isEmpty()) {
         MatrixStack var4 = var1.method3708();
         float var5 = Cosmetic.mc.gameRenderer.getCamera().getYaw();
         float var6 = Cosmetic.mc.gameRenderer.getCamera().getPitch();
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.setShaderTexture(0, this.smokeTexture);
         RenderSystem.defaultBlendFunc();
         BufferBuilder var7 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         this.smoke.removeIf(var2x -> var2 - var2x.startMs >= var2x.lifeMs);

         for (Helper257 var9 : this.smoke) {
            float var10 = MathHelper.clamp((float)(var2 - var9.startMs) / (float)var9.lifeMs, 0.0F, 1.0F);
            float var11 = this.ease(MathHelper.clamp(var10 / 0.16F, 0.0F, 1.0F)) * (1.0F - this.ease(MathHelper.clamp((var10 - 0.22F) / 0.78F, 0.0F, 1.0F)));
            if (!(var11 <= 0.0F)) {
               float var12 = MathHelper.lerp(this.ease(var10), var9.scaleFrom, var9.scaleTo) * 0.82F;
               double var13 = Math.sin(var9.seed * 0.31 + (var2 - var9.startMs) * 0.0031) * 0.024;
               double var15 = Math.cos(var9.seed * 0.27 + (var2 - var9.startMs) * 0.00295) * 0.024;
               double var17 = 0.014 + var10 * 0.072;
               int var19 = MathHelper.clamp((int)(var11 * 220.0F), 0, 255);
               var4.push();
               var4.translate(var9.x + var13, var9.y + var17, var9.z + var15);
               var4.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var5));
               var4.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var6));
               var4.scale(var12, var12, var12);
               Matrix4f var20 = var4.peek().getPositionMatrix();
               var7.vertex(var20, -0.62F, -0.62F, 0.0F).texture(0.0F, 0.0F).color(255, 255, 255, var19);
               var7.vertex(var20, 0.62F, -0.62F, 0.0F).texture(1.0F, 0.0F).color(255, 255, 255, var19);
               var7.vertex(var20, 0.62F, 0.62F, 0.0F).texture(1.0F, 1.0F).color(255, 255, 255, var19);
               var7.vertex(var20, -0.62F, 0.62F, 0.0F).texture(0.0F, 1.0F).color(255, 255, 255, var19);
               var4.pop();
            }
         }

         BufferRenderer.drawWithGlobalProgram(var7.end());
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
      }
   }

   private void method2667(Event10 var1, long var2) {
      if (!this.clones.isEmpty() && Cosmetic.mc.player != null) {
         long var4 = this.method2660(var2);
         if (var4 >= 1220L) {
            float var6 = MathHelper.clamp(this.method2663(var4) * this.method2662(var4), 0.0F, 1.0F);
            if (!(var6 <= 0.001F)) {
               float var7 = var1.method3709();
               Vec3d var8 = this.anchorSet ? this.anchorPos : Cosmetic.mc.player.getLerpedPos(var7);
               float var9 = this.anchorSet
                  ? this.anchorYaw
                  : MathHelper.lerpAngleDegrees(var7, Cosmetic.mc.player.prevBodyYaw, Cosmetic.mc.player.bodyYaw);

               for (Helper258 var11 : this.clones) {
                  double var12 = Math.sin((var2 - this.startMs) * 0.0048 + (var11.seed & 1023L) * 0.01) * 0.045;
                  double var14 = Math.toRadians(var11.yawOff);
                  double var16 = var8.x + var11.offX + Math.cos(var14) * var12;
                  double var18 = var8.y;
                  double var20 = var8.z + var11.offZ + Math.sin(var14) * var12;
                  float var22 = var9 + var11.yawOff;
                  this.method2668(var11.entity, var16, var18, var20, var22);
                  this.method2669(var11.entity, var16, var18, var20, var22, var7, var1.method3708(), var6);
               }
            }
         }
      }
   }

   private void method2668(OtherClientPlayerEntity var1, double var2, double var4, double var6, float var8) {
      var1.setPos(var2, var4, var6);
      var1.prevX = var2;
      var1.prevY = var4;
      var1.prevZ = var6;
      var1.lastRenderX = var2;
      var1.lastRenderY = var4;
      var1.lastRenderZ = var6;
      var1.setYaw(var8);
      var1.prevYaw = var8;
      var1.bodyYaw = var8;
      var1.prevBodyYaw = var8;
      var1.setHeadYaw(var8);
      var1.prevHeadYaw = var8;
      var1.setPose(EntityPose.STANDING);
   }

   private void method2669(PlayerEntity var1, double var2, double var4, double var6, float var8, float var9, MatrixStack var10, float var11) {
      var10.push();
      var10.translate(var2, var4, var6);
      var10.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var8));
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_SRC_ALPHA);
      RenderSystem.enableDepthTest();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var11);
      EntityRenderer var12 = Cosmetic.mc.getEntityRenderDispatcher().getRenderer(var1);
      if (var12 != null) {
         int var13 = var12.getLight(var1, var9);
         Immediate var14 = Cosmetic.mc.getBufferBuilders().getEntityVertexConsumers();
         EntityRenderState var15 = var12.getAndUpdateRenderState(var1, var9);
         if (var15 != null) {
            var12.render(var15, var10, var14, var13);
         }

         var14.draw();
      }

      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableBlend();
      var10.pop();
   }
}
