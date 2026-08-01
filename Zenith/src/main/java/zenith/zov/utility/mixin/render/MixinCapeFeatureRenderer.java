package zenith.zov.utility.mixin.render;

import java.util.List;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.client.render.entity.feature.CapeFeatureRenderer;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.ZenithInternal018;
import zenith.ZenithClient;
import zenith.ListHolder_9;
import zenith.booleanHolder$Helper_3;
import zenith.floatHolder$EventTarget;
import zenith.Cape;

@Mixin({CapeFeatureRenderer.class})
public class MixinCapeFeatureRenderer {
   @Unique
   private final int PART_COUNT = ListHolder_9.IlIIl1lll1ll();

   @Inject(
      method = {"render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/state/PlayerEntityRenderState;FF)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRender(MatrixStack MatrixStack, VertexConsumerProvider VertexConsumerProvider, int i, PlayerEntityRenderState PlayerEntityRenderState, float f1, float f2, CallbackInfo callbackinfo) {
      try {
         MinecraftClient MinecraftClient = MinecraftClient.getInstance();
         if (!Cape.l1l1IlllllI111l1II1IIIl1.Spider() || MinecraftClient.player == null) {
            return;
         }

         if (MinecraftClient.player.getId() == PlayerEntityRenderState.id
            || ZenithClient.getInstance().StringHolder_26().StringHolder_15(PlayerEntityRenderState.name)) {
            callbackinfo.cancel();
            ListHolder_9 lii1ii1lll1i1lll1llill11i11l = ZenithInternal018.StringHolder_6(PlayerEntityRenderState.id);
            if (lii1ii1lll1i1lll1llill11i11l == null) {
               return;
            }

            if (lii1ii1lll1i1lll1llill11i11l.IIII1II1IIll1I1l1l1111lII().size() < 2) {
               return;
            }

            if (MinecraftClient.getResourceManager()
               .getResource(
                  Identifier.of("zenith", "capes/cape" + Cape.l1l1IlllllI111l1II1IIIl1.IlIl1II11l1III1IlIIl1l1II.getIndex() + ".png")
               )
               .isEmpty()) {
               return;
            }

            float f = MinecraftClient.getRenderTickCounter().getTickDelta(true);
            this.renderSimulationCape(MatrixStack, VertexConsumerProvider, i, PlayerEntityRenderState, lii1ii1lll1i1lll1llill11i11l, f);
         }
      } catch (Exception exception) {
         System.out.println("EBALLL Cape ");
         exception.printStackTrace();
      }
   }

   @Unique
   private void renderSimulationCape(
      MatrixStack MatrixStack, VertexConsumerProvider VertexConsumerProvider, int i, PlayerEntityRenderState PlayerEntityRenderState, ListHolder_9 lii1ii1lll1i1lll1llill11i11l, float f
   ) {
      List list = lii1ii1lll1i1lll1llill11i11l.IIII1II1IIll1I1l1l1111lII();
      if (list.size() >= 2) {
         RenderLayer RenderLayer = RenderLayer.getEntityTranslucent(
            Identifier.of("zenith", "capes/cape" + Cape.l1l1IlllllI111l1II1IIIl1.IlIl1II11l1III1IlIIl1l1II.getIndex() + ".png")
         );
         VertexConsumer VertexConsumer = VertexConsumerProvider.getBuffer(RenderLayer);
         Matrix4f matrix4f = null;

         for (int j = 0; j < this.PART_COUNT; j++) {
            this.modifyPoseStackSimulation(MatrixStack, PlayerEntityRenderState, j, lii1ii1lll1i1lll1llill11i11l, f);
            Matrix4f matrix4f1 = MatrixStack.peek().getPositionMatrix();
            if (matrix4f == null) {
               matrix4f = new Matrix4f(matrix4f1);
            }

            if (j == 0) {
               this.addTopVertex(VertexConsumer, matrix4f1, matrix4f, 0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.06F, j, i);
            }

            if (j == this.PART_COUNT - 1) {
               this.addBottomVertex(
                  VertexConsumer,
                  matrix4f1,
                  matrix4f1,
                  0.3F,
                  (float)(j + 1) * (0.96F / (float)this.PART_COUNT),
                  0.0F,
                  -0.3F,
                  (float)(j + 1) * (0.96F / (float)this.PART_COUNT),
                  -0.06F,
                  j,
                  i
               );
            }

            this.addLeftVertex(
               VertexConsumer,
               matrix4f1,
               matrix4f,
               -0.3F,
               (float)(j + 1) * (0.96F / (float)this.PART_COUNT),
               0.0F,
               -0.3F,
               (float)j * (0.96F / (float)this.PART_COUNT),
               -0.06F,
               j,
               i
            );
            this.addRightVertex(
               VertexConsumer,
               matrix4f1,
               matrix4f,
               0.3F,
               (float)(j + 1) * (0.96F / (float)this.PART_COUNT),
               0.0F,
               0.3F,
               (float)j * (0.96F / (float)this.PART_COUNT),
               -0.06F,
               j,
               i
            );
            this.addBackVertex(
               VertexConsumer,
               matrix4f1,
               matrix4f,
               0.3F,
               (float)(j + 1) * (0.96F / (float)this.PART_COUNT),
               -0.06F,
               -0.3F,
               (float)j * (0.96F / (float)this.PART_COUNT),
               -0.06F,
               j,
               i
            );
            this.addFrontVertex(
               VertexConsumer,
               matrix4f,
               matrix4f1,
               0.3F,
               (float)(j + 1) * (0.96F / (float)this.PART_COUNT),
               0.0F,
               -0.3F,
               (float)j * (0.96F / (float)this.PART_COUNT),
               0.0F,
               j,
               i
            );
            matrix4f = new Matrix4f(matrix4f1);
            MatrixStack.pop();
         }
      }
   }

   @Unique
   private void modifyPoseStackSimulation(
      MatrixStack MatrixStack, PlayerEntityRenderState PlayerEntityRenderState, int i, ListHolder_9 lii1ii1lll1i1lll1llill11i11l, float f
   ) {
      MatrixStack.push();
      MatrixStack.translate(0.0, 0.0, 0.125);
      booleanHolder$Helper_3 lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx = lii1ii1lll1i1lll1llill11i11l.IIII1II1IIll1I1l1l1111lII()
         .get(0);
      booleanHolder$Helper_3 lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx = lii1ii1lll1i1lll1llill11i11l.IIII1II1IIll1I1l1l1111lII()
         .get(i);
      float f1 = lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.SocketFactoryHolder_3(f)
         - lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.SocketFactoryHolder_3(f);
      if (f1 > 0.0F) {
         f1 = 0.0F;
      }

      float f2 = lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.SocketFactoryHolder_2(f)
         - (float)i
         - lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.SocketFactoryHolder_2(f);
      float f3 = lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.SocketFactoryHolder(f)
         - lii1ii1lll1i1lll1llill11i11l$ii1il11l111ii11iilx.SocketFactoryHolder(f);
      float f4 = this.getRotation(f, i, lii1ii1lll1i1lll1llill11i11l);
      float f5 = 0.0F;
      if (PlayerEntityRenderState.isInSneakingPose) {
         f5 += 25.0F;
         MatrixStack.translate(0.0, 0.15, 0.0);
      }

      float f6 = this.getNaturalWindSwing(i, false) * Cape.l1l1IlllllI111l1II1IIIl1.Il11lI1lI1IIIII11I1();
      MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(6.0F + f5 + f6));
      MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180.0F));
      MatrixStack.translate(-f3 / (float)this.PART_COUNT, f2 / (float)this.PART_COUNT, f1 / (float)this.PART_COUNT);
      MatrixStack.translate(0.0, 0.03, -0.03);
      MatrixStack.translate(0.0, (double)((float)i * 1.0F / (float)this.PART_COUNT), 0.0);
      MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-f4));
      MatrixStack.translate(0.0, (double)((float)(-i) * 1.0F / (float)this.PART_COUNT), 0.0);
      MatrixStack.translate(0.0, -0.03, 0.03);
   }

   @Unique
   private float getRotation(float f, int i, ListHolder_9 lii1ii1lll1i1lll1llill11i11l) {
      if (i == this.PART_COUNT - 1) {
         return this.getRotation(f, i - 1, lii1ii1lll1i1lll1llill11i11l);
      } else {
         floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1xx = lii1ii1lll1i1lll1llill11i11l.Illll1Illl1lll111II1lIIl
            .get(i)
            .ZenithInternal086(f);
         floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1x = lii1ii1lll1i1lll1llill11i11l.Illll1Illl1lll111II1lIIl
            .get(i + 1)
            .ZenithInternal086(f);
         floatHolder$EventTarget lii1ii1lll1i1lll1llill11i11l$illi1l1l1xx = lii1ii1lll1i1lll1llill11i11l$illi1l1l1x.ZenithInternal095(
            lii1ii1lll1i1lll1llill11i11l$illi1l1l1xx
         );
         return (float)(
            Math.toDegrees(Math.atan2((double)lii1ii1lll1i1lll1llill11i11l$illi1l1l1xx.field_171, (double)lii1ii1lll1i1lll1llill11i11l$illi1l1l1xx.field_172))
               + 180.0
         );
      }
   }

   @Unique
   private float getNaturalWindSwing(int i, boolean flag) {
      long j = System.currentTimeMillis() / (long)(flag ? 9 : 3) % 360L;
      float f = (float)(i + 1) / (float)this.PART_COUNT;
      return (float)(Math.sin(Math.toRadians((double)(f * 360.0F - (float)j))) * 3.0);
   }

   @Unique
   private void addBackVertex(
      VertexConsumer VertexConsumer, Matrix4f matrix4f, Matrix4f matrix4f1, float f, float f1, float f2, float f3, float f4, float f5, int i, int j
   ) {
      short short1 = 255;
      short short2 = 255;
      short short3 = 255;
      short short4 = 255;
      float f6 = 0.015625F;
      float f7 = 0.171875F;
      float f8 = 0.03125F;
      float f9 = 0.53125F;
      float f10 = f9 - f8;
      float f11 = f10 / (float)this.PART_COUNT;
      float f12 = f8 + f11 * (float)(i + 1);
      float f13 = f8 + f11 * (float)i;
      if (f < f3) {
         float f14 = f;
         f = f3;
         f3 = f14;
      }

      if (f1 < f4) {
         float f15 = f1;
         f1 = f4;
         f4 = f15;
         Matrix4f matrix4f2 = matrix4f;
         matrix4f = matrix4f1;
         matrix4f1 = matrix4f2;
      }

      VertexConsumer.vertex(matrix4f1, f, f4, f2)
         .color(short1, short2, short3, short4)
         .texture(f7, f13)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(j)
         .normal(0.0F, 0.0F, -1.0F);
      VertexConsumer.vertex(matrix4f1, f3, f4, f2)
         .color(short1, short2, short3, short4)
         .texture(f6, f13)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(j)
         .normal(0.0F, 0.0F, -1.0F);
      VertexConsumer.vertex(matrix4f, f3, f1, f5)
         .color(short1, short2, short3, short4)
         .texture(f6, f12)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(j)
         .normal(0.0F, 0.0F, -1.0F);
      VertexConsumer.vertex(matrix4f, f, f1, f5)
         .color(short1, short2, short3, short4)
         .texture(f7, f12)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(j)
         .normal(0.0F, 0.0F, -1.0F);
   }

   @Unique
   private void addFrontVertex(
      VertexConsumer VertexConsumer, Matrix4f matrix4f, Matrix4f matrix4f1, float f, float f1, float f2, float f3, float f4, float f5, int i, int j
   ) {
      short short1 = 255;
      short short2 = 255;
      short short3 = 255;
      short short4 = 255;
      float f6 = 0.1875F;
      float f7 = 0.34375F;
      float f8 = 0.03125F;
      float f9 = 0.53125F;
      float f10 = f9 - f8;
      float f11 = f10 / (float)this.PART_COUNT;
      float f12 = f8 + f11 * (float)(i + 1);
      float f13 = f8 + f11 * (float)i;
      if (f < f3) {
         float f14 = f;
         f = f3;
         f3 = f14;
      }

      if (f1 < f4) {
         float f15 = f1;
         f1 = f4;
         f4 = f15;
         Matrix4f matrix4f2 = matrix4f;
         matrix4f = matrix4f1;
         matrix4f1 = matrix4f2;
      }

      VertexConsumer.vertex(matrix4f1, f, f1, f2)
         .color(short1, short2, short3, short4)
         .texture(f7, f12)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(j)
         .normal(0.0F, 0.0F, 1.0F);
      VertexConsumer.vertex(matrix4f1, f3, f1, f2)
         .color(short1, short2, short3, short4)
         .texture(f6, f12)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(j)
         .normal(0.0F, 0.0F, 1.0F);
      VertexConsumer.vertex(matrix4f, f3, f4, f5)
         .color(short1, short2, short3, short4)
         .texture(f6, f13)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(j)
         .normal(0.0F, 0.0F, 1.0F);
      VertexConsumer.vertex(matrix4f, f, f4, f5)
         .color(short1, short2, short3, short4)
         .texture(f7, f13)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(j)
         .normal(0.0F, 0.0F, 1.0F);
   }

   @Unique
   private void addLeftVertex(
      VertexConsumer VertexConsumer, Matrix4f matrix4f, Matrix4f matrix4f1, float f, float f1, float f2, float f3, float f4, float f5, int i, int j
   ) {
      short short1 = 255;
      short short2 = 255;
      short short3 = 255;
      short short4 = 255;
      float f6 = 0.0F;
      float f7 = 0.015625F;
      float f8 = 0.03125F;
      float f9 = 0.53125F;
      float f10 = f9 - f8;
      float f11 = f10 / (float)this.PART_COUNT;
      float f12 = f8 + f11 * (float)(i + 1);
      float f13 = f8 + f11 * (float)i;
      if (f < f3) {
         f3 = f;
      }

      if (f1 < f4) {
         float f14 = f1;
         f1 = f4;
         f4 = f14;
      }

      VertexConsumer.vertex(matrix4f, f3, f1, f2)
         .color(short1, short2, short3, short4)
         .texture(f7, f12)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(j)
         .normal(-1.0F, 0.0F, 0.0F);
      VertexConsumer.vertex(matrix4f, f3, f1, f5)
         .color(short1, short2, short3, short4)
         .texture(f6, f12)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(j)
         .normal(-1.0F, 0.0F, 0.0F);
      VertexConsumer.vertex(matrix4f1, f3, f4, f5)
         .color(short1, short2, short3, short4)
         .texture(f6, f13)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(j)
         .normal(-1.0F, 0.0F, 0.0F);
      VertexConsumer.vertex(matrix4f1, f3, f4, f2)
         .color(short1, short2, short3, short4)
         .texture(f7, f13)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(j)
         .normal(-1.0F, 0.0F, 0.0F);
   }

   @Unique
   private void addRightVertex(
      VertexConsumer VertexConsumer, Matrix4f matrix4f, Matrix4f matrix4f1, float f, float f1, float f2, float f3, float f4, float f5, int i, int j
   ) {
      short short1 = 255;
      short short2 = 255;
      short short3 = 255;
      short short4 = 255;
      float f6 = 0.171875F;
      float f7 = 0.1875F;
      float f8 = 0.03125F;
      float f9 = 0.53125F;
      float f10 = f9 - f8;
      float f11 = f10 / (float)this.PART_COUNT;
      float f12 = f8 + f11 * (float)(i + 1);
      float f13 = f8 + f11 * (float)i;
      if (f < f3) {
         f3 = f;
      }

      if (f1 < f4) {
         float f14 = f1;
         f1 = f4;
         f4 = f14;
      }

      VertexConsumer.vertex(matrix4f, f3, f1, f5)
         .color(short1, short2, short3, short4)
         .texture(f6, f12)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(j)
         .normal(1.0F, 0.0F, 0.0F);
      VertexConsumer.vertex(matrix4f, f3, f1, f2)
         .color(short1, short2, short3, short4)
         .texture(f7, f12)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(j)
         .normal(1.0F, 0.0F, 0.0F);
      VertexConsumer.vertex(matrix4f1, f3, f4, f2)
         .color(short1, short2, short3, short4)
         .texture(f7, f13)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(j)
         .normal(1.0F, 0.0F, 0.0F);
      VertexConsumer.vertex(matrix4f1, f3, f4, f5)
         .color(short1, short2, short3, short4)
         .texture(f6, f13)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(j)
         .normal(1.0F, 0.0F, 0.0F);
   }

   @Unique
   private void addTopVertex(
      VertexConsumer VertexConsumer, Matrix4f matrix4f, Matrix4f matrix4f1, float f, float f1, float f2, float f3, float f4, float f5, int j, int i
   ) {
      short short1 = 255;
      short short2 = 255;
      short short3 = 255;
      short short4 = 255;
      float f6 = 0.015625F;
      float f7 = 0.171875F;
      float f8 = 0.0F;
      float f9 = 0.03125F;
      if (f < f3) {
         float f10 = f;
         f = f3;
         f3 = f10;
      }

      if (f1 < f4) {
         float f11 = f1;
         f1 = f4;
         f4 = f11;
      }

      VertexConsumer.vertex(matrix4f1, f, f4, f2)
         .color(short1, short2, short3, short4)
         .texture(f7, f9)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(i)
         .normal(0.0F, 1.0F, 0.0F);
      VertexConsumer.vertex(matrix4f1, f3, f4, f2)
         .color(short1, short2, short3, short4)
         .texture(f6, f9)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(i)
         .normal(0.0F, 1.0F, 0.0F);
      VertexConsumer.vertex(matrix4f, f3, f1, f5)
         .color(short1, short2, short3, short4)
         .texture(f6, f8)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(i)
         .normal(0.0F, 1.0F, 0.0F);
      VertexConsumer.vertex(matrix4f, f, f1, f5)
         .color(short1, short2, short3, short4)
         .texture(f7, f8)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(i)
         .normal(0.0F, 1.0F, 0.0F);
   }

   @Unique
   private void addBottomVertex(
      VertexConsumer VertexConsumer, Matrix4f matrix4f, Matrix4f matrix4f1, float f, float f1, float f2, float f3, float f4, float f5, int j, int i
   ) {
      short short1 = 255;
      short short2 = 255;
      short short3 = 255;
      short short4 = 255;
      float f6 = 0.171875F;
      float f7 = 0.328125F;
      float f8 = 0.0F;
      float f9 = 0.03125F;
      if (f < f3) {
         float f10 = f;
         f = f3;
         f3 = f10;
      }

      if (f1 < f4) {
         float f11 = f1;
         f1 = f4;
         f4 = f11;
      }

      VertexConsumer.vertex(matrix4f1, f, f4, f5)
         .color(short1, short2, short3, short4)
         .texture(f7, f8)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(i)
         .normal(0.0F, -1.0F, 0.0F);
      VertexConsumer.vertex(matrix4f1, f3, f4, f5)
         .color(short1, short2, short3, short4)
         .texture(f6, f8)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(i)
         .normal(0.0F, -1.0F, 0.0F);
      VertexConsumer.vertex(matrix4f, f3, f1, f2)
         .color(short1, short2, short3, short4)
         .texture(f6, f9)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(i)
         .normal(0.0F, -1.0F, 0.0F);
      VertexConsumer.vertex(matrix4f, f, f1, f2)
         .color(short1, short2, short3, short4)
         .texture(f7, f9)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(i)
         .normal(0.0F, -1.0F, 0.0F);
   }
}
