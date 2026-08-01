package fat.releon.mixins.player.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.systems.RenderSystem;
import fat.releon.teremok.impl.combat.Aura;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l.Helper124;
import l.Helper160;
import l.Helper212;
import l.Helper216;
import l.Cosmetic;
import l.Chams;
import l.Helper259;
import l.ShaderESP;
import l.Helper351;
import l.Helper440;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPart.Cuboid;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.MatrixStack.Entry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({LivingEntityRenderer.class})
public abstract class LivingEntityRendererMixin implements Helper160 {
   private static final Map<ModelPart, List<Cuboid>> CUBOID_CACHE = new ConcurrentHashMap<>();
   private static Field cuboidField;

   public LivingEntityRendererMixin() {
   }

   @Shadow
   @Nullable
   protected abstract RenderLayer getRenderLayer(LivingEntityRenderState var1, boolean var2, boolean var3, boolean var4);

   @Redirect(
      method = {"render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/LivingEntityRenderer;getRenderLayer(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;ZZZ)Lnet/minecraft/client/render/RenderLayer;"
      )
   )
   private RenderLayer renderHook(LivingEntityRenderer var1, LivingEntityRenderState var2, boolean var3, boolean var4, boolean var5) {
      Cosmetic var6 = Cosmetic.method1873();
      boolean var7 = var6 != null && var6.isState() && this.shouldRenderCosmeticFor(var2, var6);
      if (var7) {
         return !var2.invisibleToPlayer && !this.isLocalPlayerInvisible(var2)
            ? this.getRenderLayer(var2, var3, false, var5)
            : this.getRenderLayer(var2, true, false, var5);
      } else {
         if (!var4 && (var2.invisibleToPlayer || this.isLocalPlayerInvisible(var2))) {
            Helper440 var8 = new Helper440(-1);
            Helper124.method1026(var8);
            if (var8.method581()) {
               var4 = true;
            }
         }

         Chams var10 = Chams.method2439();
         if (!var4 && var10 != null && var2 instanceof PlayerEntityRenderState var9 && var10.isState() && var10.method2440(var9)) {
            var4 = true;
         }

         return this.getRenderLayer(var2, var3, var4, var5);
      }
   }

   @Redirect(
      method = {"render(Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/render/entity/model/EntityModel;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;III)V"
      )
   )
   private void renderModelHook(
      EntityModel<?> var1,
      MatrixStack var2,
      VertexConsumer var3,
      int var4,
      int var5,
      int var6,
      @Local(ordinal = 0,argsOnly = true) LivingEntityRenderState var7,
      @Local(ordinal = 0,argsOnly = true) VertexConsumerProvider var8
   ) {
      if (ShaderESP.renderingEntityMask) {
         var1.render(var2, var3, var4, var5, -1);
      } else {
         Cosmetic var9 = Cosmetic.method1873();
         boolean var10 = false;
         if (var9 != null
            && var9.isState()
            && var7 instanceof PlayerEntityRenderState var11
            && mc.world != null
            && mc.world.getEntityById(var11.id) instanceof PlayerEntity var12
            && var9.method1878(var12)) {
            var10 = true;
         }

         if (!var10) {
            Helper440 var41 = new Helper440(var6);
            if (var7.invisibleToPlayer || this.isLocalPlayerInvisible(var7)) {
               Helper124.method1026(var41);
            }

            Chams var42 = Chams.method2439();
            boolean var43 = var7 instanceof PlayerEntityRenderState var14 && var42 != null && var42.isState() && var42.method2440(var14);
            boolean var44 = false;
            PlayerEntityModel var15 = null;
            float var16 = 0.0F;
            float var17 = 0.0F;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = 0.0F;
            float var21 = 0.0F;
            float var22 = 0.0F;
            float var23 = 0.0F;
            float var24 = 0.0F;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = 0.0F;
            if (mc != null
               && mc.player != null
               && var1 instanceof PlayerEntityModel var28
               && var7 instanceof PlayerEntityRenderState var29
               && var29.id == mc.player.getId()) {
               float var30 = Helper259.method2657(mc.player);
               if (var30 > 0.001F && !var29.isSwimming && !var29.isGliding && !var29.isUsingItem && !mc.options.getPerspective().isFirstPerson()) {
                  var15 = var28;
                  var16 = var28.rightArm.pitch;
                  var17 = var28.leftArm.pitch;
                  var18 = var28.rightArm.roll;
                  var19 = var28.leftArm.roll;
                  var20 = var28.rightArm.yaw;
                  var21 = var28.leftArm.yaw;
                  var22 = var28.head.pitch;
                  var23 = var28.head.yaw;
                  var24 = var28.head.roll;
                  var25 = var28.body.pitch;
                  var26 = var28.body.yaw;
                  var27 = var28.body.roll;
                  float var31 = mc.getRenderTickCounter().getTickDelta(false);
                  float var32 = mc.player.age + var31;
                  float var33 = MathHelper.sin(var32 * 7.2F) * 0.05F * var30;
                  float var34 = MathHelper.cos(var32 * 8.0F) * 0.035F * var30;
                  var28.body.pitch += 0.16F * var30;
                  var28.head.pitch += -0.08F * var30 + var34 * 0.2F;
                  float var35 = -0.85F * var30;
                  float var36 = 0.78F * var30;
                  float var37 = 0.62F * var30;
                  var28.rightArm.pitch += var35 + var33;
                  var28.leftArm.pitch += var35 - var33;
                  var28.rightArm.yaw -= var36;
                  var28.leftArm.yaw += var36;
                  var28.rightArm.roll += var37 + var34 * 0.25F;
                  var28.leftArm.roll -= var37 + var34 * 0.25F;
                  var2.push();
                  var2.translate(0.0F, 0.72F, 0.0F);
                  var2.multiply(RotationAxis.POSITIVE_X.rotation(0.14F * var30));
                  var2.translate(0.0F, -0.72F, 0.0F);
                  var44 = true;
               }
            }

            try {
               if (var43 && var7 instanceof PlayerEntityRenderState var45 && var1 instanceof PlayerEntityModel var47) {
                  this.renderBoxChams(var2, var47, var45, var42);
               } else {
                  var1.render(var2, var3, var4, var5, var41.method4626());
               }

               if (var7 instanceof PlayerEntityRenderState var46
                  && var1 instanceof PlayerEntityModel var48
                  && mc.world != null
                  && mc.world.getEntityById(var46.id) instanceof PlayerEntity var49) {
                  Helper216.method1862(var2, var8, var49, var48, Cosmetic.method1873());
               }
            } finally {
               if (var44) {
                  var2.pop();
               }

               if (var15 != null) {
                  var15.rightArm.pitch = var16;
                  var15.leftArm.pitch = var17;
                  var15.rightArm.roll = var18;
                  var15.leftArm.roll = var19;
                  var15.rightArm.yaw = var20;
                  var15.leftArm.yaw = var21;
                  var15.head.pitch = var22;
                  var15.head.yaw = var23;
                  var15.head.roll = var24;
                  var15.body.pitch = var25;
                  var15.body.yaw = var26;
                  var15.body.roll = var27;
               }
            }
         }
      }
   }

   private boolean isLocalPlayerInvisible(LivingEntityRenderState var1) {
      return mc != null && mc.player != null && var1 instanceof PlayerEntityRenderState var2 && var2.id == mc.player.getId() && mc.player.isInvisible();
   }

   private boolean shouldRenderCosmeticFor(LivingEntityRenderState var1, Cosmetic var2) {
      return mc != null
         && mc.world != null
         && var1 instanceof PlayerEntityRenderState var4
         && mc.world.getEntityById(var4.id) instanceof PlayerEntity var3
         && var2.method1878(var3);
   }

   private void renderBoxChams(MatrixStack var1, PlayerEntityModel var2, PlayerEntityRenderState var3, Chams var4) {
      PlayerEntity var5 = mc.world != null && mc.world.getEntityById(var3.id) instanceof PlayerEntity var6 ? var6 : null;
      if (var5 != null) {
         boolean var15 = !var4.method2444();
         float var16 = var4.method2445();
         int var8 = var4.method2446();

         for (int var9 = 0; var9 < var8; var9++) {
            float var10 = var9 * 0.012F;
            int var11 = Math.max(10, (int)(var4.method2447() / (1.0F + var9 * 1.5F)));
            int var12 = Math.max(5, (int)(var4.method2448() / (1.0F + var9 * 1.5F)));
            int var13 = var4.method2442(var5, var11);
            int var14 = var4.method2443(var5, var12);
            this.renderPart(var1, var2.head, var13, var14, var15, var16, var10);
            this.renderPart(var1, var2.body, var13, var14, var15, var16, var10);
            this.renderPart(var1, var2.rightArm, var13, var14, var15, var16, var10);
            this.renderPart(var1, var2.leftArm, var13, var14, var15, var16, var10);
            this.renderPart(var1, var2.rightLeg, var13, var14, var15, var16, var10);
            this.renderPart(var1, var2.leftLeg, var13, var14, var15, var16, var10);
         }
      }
   }

   private void renderPart(MatrixStack var1, ModelPart var2, int var3, int var4, boolean var5, float var6, float var7) {
      var1.push();
      var2.rotate(var1);
      Entry var8 = var1.peek();
      List<Cuboid> var9 = CUBOID_CACHE.get(var2);
      if (var9 == null && cuboidField != null) {
         try {
            var9 = (List<Cuboid>)cuboidField.get(var2);
            if (var9 != null && !var9.isEmpty()) {
               CUBOID_CACHE.put(var2, var9);
            }
         } catch (Exception var18) {
         }
      }

      if (var9 != null) {
         for (Cuboid var11 : var9) {
            float var12 = var11.minX / 16.0F - var7;
            float var13 = var11.minY / 16.0F - var7;
            float var14 = var11.minZ / 16.0F - var7;
            float var15 = var11.maxX / 16.0F + var7;
            float var16 = var11.maxY / 16.0F + var7;
            float var17 = var11.maxZ / 16.0F + var7;
            this.renderCuboid(var8, var12, var13, var14, var15, var16, var17, var3, var4, var5, var6);
         }
      }

      var1.pop();
   }

   private void renderCuboid(Entry var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, int var9, boolean var10, float var11) {
      int var12 = var8 >> 24 & 0xFF;
      int var13 = var8 >> 16 & 0xFF;
      int var14 = var8 >> 8 & 0xFF;
      int var15 = var8 & 0xFF;
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableCull();
      if (!var10) {
         RenderSystem.disableDepthTest();
      } else {
         RenderSystem.enableDepthTest();
         RenderSystem.depthFunc(519);
      }

      GL11.glEnable(32823);
      GL11.glPolygonOffset(-1.0F, -1.0F);
      RenderSystem.depthMask(false);
      if (!Helper212.method1816(var1, var2, var3, var4, var5, var6, var7, var9)) {
         this.renderFlatFill(var1, var2, var3, var4, var5, var6, var7, var9);
      }

      RenderSystem.depthMask(true);
      GL11.glPolygonOffset(-2.0F, -2.0F);
      GL11.glEnable(2848);
      GL11.glHint(3154, 4354);
      RenderSystem.setShader(ShaderProgramKeys.RENDERTYPE_LINES);
      RenderSystem.lineWidth(var11);
      BufferBuilder var16 = Tessellator.getInstance().begin(DrawMode.LINES, VertexFormats.LINES);
      this.drawEdge(var16, var1, var2, var3, var4, var5, var3, var4, var13, var14, var15, var12);
      this.drawEdge(var16, var1, var5, var3, var4, var5, var3, var7, var13, var14, var15, var12);
      this.drawEdge(var16, var1, var5, var3, var7, var2, var3, var7, var13, var14, var15, var12);
      this.drawEdge(var16, var1, var2, var3, var7, var2, var3, var4, var13, var14, var15, var12);
      this.drawEdge(var16, var1, var2, var6, var4, var5, var6, var4, var13, var14, var15, var12);
      this.drawEdge(var16, var1, var5, var6, var4, var5, var6, var7, var13, var14, var15, var12);
      this.drawEdge(var16, var1, var5, var6, var7, var2, var6, var7, var13, var14, var15, var12);
      this.drawEdge(var16, var1, var2, var6, var7, var2, var6, var4, var13, var14, var15, var12);
      this.drawEdge(var16, var1, var2, var3, var4, var2, var6, var4, var13, var14, var15, var12);
      this.drawEdge(var16, var1, var5, var3, var4, var5, var6, var4, var13, var14, var15, var12);
      this.drawEdge(var16, var1, var5, var3, var7, var5, var6, var7, var13, var14, var15, var12);
      this.drawEdge(var16, var1, var2, var3, var7, var2, var6, var7, var13, var14, var15, var12);
      BufferRenderer.drawWithGlobalProgram(var16.end());
      RenderSystem.lineWidth(1.0F);
      GL11.glDisable(2848);
      GL11.glDisable(32823);
      GL11.glPolygonOffset(0.0F, 0.0F);
      if (var10) {
         RenderSystem.depthFunc(515);
      } else {
         RenderSystem.enableDepthTest();
      }

      RenderSystem.enableCull();
      RenderSystem.disableBlend();
   }

   private void renderFlatFill(Entry var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      int var9 = var8 >> 24 & 0xFF;
      int var10 = var8 >> 16 & 0xFF;
      int var11 = var8 >> 8 & 0xFF;
      int var12 = var8 & 0xFF;
      Matrix4f var13 = var1.getPositionMatrix();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      BufferBuilder var14 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
      var14.vertex(var13, var2, var3, var4).color(var10, var11, var12, var9);
      var14.vertex(var13, var5, var3, var4).color(var10, var11, var12, var9);
      var14.vertex(var13, var5, var3, var7).color(var10, var11, var12, var9);
      var14.vertex(var13, var2, var3, var7).color(var10, var11, var12, var9);
      var14.vertex(var13, var2, var6, var4).color(var10, var11, var12, var9);
      var14.vertex(var13, var2, var6, var7).color(var10, var11, var12, var9);
      var14.vertex(var13, var5, var6, var7).color(var10, var11, var12, var9);
      var14.vertex(var13, var5, var6, var4).color(var10, var11, var12, var9);
      var14.vertex(var13, var2, var3, var4).color(var10, var11, var12, var9);
      var14.vertex(var13, var2, var6, var4).color(var10, var11, var12, var9);
      var14.vertex(var13, var5, var6, var4).color(var10, var11, var12, var9);
      var14.vertex(var13, var5, var3, var4).color(var10, var11, var12, var9);
      var14.vertex(var13, var2, var3, var7).color(var10, var11, var12, var9);
      var14.vertex(var13, var5, var3, var7).color(var10, var11, var12, var9);
      var14.vertex(var13, var5, var6, var7).color(var10, var11, var12, var9);
      var14.vertex(var13, var2, var6, var7).color(var10, var11, var12, var9);
      var14.vertex(var13, var2, var3, var4).color(var10, var11, var12, var9);
      var14.vertex(var13, var2, var3, var7).color(var10, var11, var12, var9);
      var14.vertex(var13, var2, var6, var7).color(var10, var11, var12, var9);
      var14.vertex(var13, var2, var6, var4).color(var10, var11, var12, var9);
      var14.vertex(var13, var5, var3, var4).color(var10, var11, var12, var9);
      var14.vertex(var13, var5, var6, var4).color(var10, var11, var12, var9);
      var14.vertex(var13, var5, var6, var7).color(var10, var11, var12, var9);
      var14.vertex(var13, var5, var3, var7).color(var10, var11, var12, var9);
      BufferRenderer.drawWithGlobalProgram(var14.end());
   }

   private void drawEdge(
      BufferBuilder var1, Entry var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12
   ) {
      float var13 = var6 - var3;
      float var14 = var7 - var4;
      float var15 = var8 - var5;
      float var16 = (float)Math.sqrt(var13 * var13 + var14 * var14 + var15 * var15);
      if (var16 != 0.0F) {
         Vector3f var17 = var2.transformNormal(var13 / var16, var14 / var16, var15 / var16, new Vector3f());
         Matrix4f var18 = var2.getPositionMatrix();
         var1.vertex(var18, var3, var4, var5).color(var9, var10, var11, var12).normal(var17.x, var17.y, var17.z);
         var1.vertex(var18, var6, var7, var8).color(var9, var10, var11, var12).normal(var17.x, var17.y, var17.z);
      }
   }

   @Inject(
      method = {"updateRenderState(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;F)V"},
      at = {@At("TAIL")}
   )
   private void releon$forceVisibleForCosmetic(LivingEntity var1, LivingEntityRenderState var2, float var3, CallbackInfo var4) {
      Cosmetic var5 = Cosmetic.method1873();
      if (var5 != null && var5.isState() && mc.world != null && mc.player != null) {
         if (var1 instanceof PlayerEntity var6) {
            if (var5.method1878(var6)) {
               var2.invisibleToPlayer = false;
            }
         }
      }
   }

   @ModifyExpressionValue(
      method = {"updateRenderState(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;F)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/util/math/MathHelper;lerpAngleDegrees(FFF)F"
      )}
   )
   private float lerpAngleDegreesHook(float var1, @Local(ordinal = 0,argsOnly = true) LivingEntity var2, @Local(ordinal = 0,argsOnly = true) float var3) {
      Helper351 var4 = Helper351.INSTANCE;
      Aura var5 = Aura.getInstance();
      if (var2.equals(mc.player)
         && var4.method3495().method3333() != mc.player.getYaw()
         && var4.method3489().method3333() != mc.player.getYaw()
         && !(mc.currentScreen instanceof HandledScreen)) {
         boolean var6 = Aura.fakeRotate;
         float var7 = var6 ? var4.method3490().method3333() : var4.method3495().method3333();
         float var8 = var6 ? var4.method3489().method3333() : var4.method3483().method3333();
         if (Aura.getInstance().getTarget() == null) {
            var7 = var4.method3495().method3333();
            var8 = var4.method3483().method3333();
         }

         return MathHelper.lerp(var3, var7, var8);
      } else {
         return var1;
      }
   }

   @ModifyExpressionValue(
      method = {"updateRenderState(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/client/render/entity/state/LivingEntityRenderState;F)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;getLerpedPitch(F)F"
      )}
   )
   private float getLerpedPitchHook(float var1, @Local(ordinal = 0,argsOnly = true) LivingEntity var2, @Local(ordinal = 0,argsOnly = true) float var3) {
      Helper351 var4 = Helper351.INSTANCE;
      Aura var5 = Aura.getInstance();
      if (var2.equals(mc.player)
         && var4.method3495().method3334() != mc.player.getPitch()
         && var4.method3489().method3334() != mc.player.getPitch()
         && !(mc.currentScreen instanceof HandledScreen)) {
         boolean var6 = Aura.fakeRotate;
         float var7 = var6 ? var4.method3490().method3334() : var4.method3495().method3334();
         float var8 = var6 ? var4.method3489().method3334() : var4.method3483().method3334();
         if (Aura.getInstance().getTarget() == null) {
            var7 = var4.method3495().method3334();
            var8 = var4.method3483().method3334();
         }

         return MathHelper.lerp(var3, var7, var8);
      } else {
         return var1;
      }
   }

   static {
      try {
         for (Field var3 : ModelPart.class.getDeclaredFields()) {
            if (List.class.isAssignableFrom(var3.getType())) {
               var3.setAccessible(true);
               cuboidField = var3;
               break;
            }
         }
      } catch (Exception var4) {
      }
   }
}
