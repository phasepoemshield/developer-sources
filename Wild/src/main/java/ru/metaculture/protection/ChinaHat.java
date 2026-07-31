package ru.metaculture.protection;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.option.Perspective;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.MatrixStack.Entry;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "ChinaHat",
   O000000000 = "Добавляет над головой игроков декоративную шляпу в виде конуса, которая будет повторять цветовую схему выбранной темы.",
   O0000000000 = Category.Visuals
)
public final class ChinaHat extends Module {
   private static final int O000000000O = 256;
   private static final int O000000000O0 = 18;
   private static final float O000000000O00 = 0.0625F;
   private static final float O000000000O000 = (float) (Math.PI * 2);
   private static final float O000000000O00O = 0.296875F;
   private static final float O000000000O0O = (float)Math.sqrt(0.17626953F);
   private static final float O000000000O0O0 = O000000000O0O + 0.14F;
   private static final float O000000000O0OO = 0.286F;
   private static final float O000000000OO = -0.503125F;
   private static final float O000000000OO0 = -0.789125F;
   private static final float O000000000OO00 = O000000000O0O0 * 0.07F;
   private static final float O000000000OO0O = -0.769105F;
   private static final float O000000000OOO = 0.0F;
   private static final float O000000000OOO0 = 1.0F;
   private static final float O000000000OOOO = 2.0F;
   private static final O0000O000O0O00 O00000000O = new O0000O000O0O00(0.066F, 0.68F, 0.001F, 0.001F);
   private static final float[] O00000000O0 = new float[257];
   private static final float[] O00000000O00 = new float[257];
   private static final float[] O00000000O000 = new float[19];
   private static final float[] O00000000O0000 = new float[19];
   private static final int[] O00000000O000O = new int[]{16747247, 16754396, 8648959, 11141102, 16747247};
   private static final int[] O00000000O00O = new int[]{6750183, 6014975, 4688895, 11730932, 6750183};
   private static final int[] O00000000O00O0 = new int[]{16773227, 16751954, 16736157, 9304063, 16773227};
   private static final int[] O00000000O00OO = new int[]{11141048, 6485458, 8228095, 16755188, 11141048};
   private static final int[] O00000000O0O = new int[]{8257383, 3405823, 16773210, 16727538, 8257383};
   private static final int[] O00000000O0O0 = new int[]{16754632, 16769167, 11000063, 14067711, 16754632};
   private static final int[] O00000000O0O00 = new int[]{8033279, 11561983, 5963734, 16736142, 8033279};
   private static final int[] O00000000O0O0O = new int[]{16757594, 16739146, 16732041, 13995263, 16757594};
   private static final int[] O00000000O0OO = new int[]{14089215, 9169663, 9149951, 16777215, 14089215};
   private static final int[] O00000000O0OO0 = new int[]{16736109, 16770140, 6160312, 7179519, 16736109};
   private static final int[] O00000000O0OOO = new int[]{14001919, 16752603, 7733222, 16773260, 14001919};
   private static final int[] O00000000OO = new int[]{13172552, 16773466, 3732223, 16735457, 13172552};
   private final O0000O000O00O O00000000OO0 = new O0000O000O00O(0.0F);
   private final Matrix4f O00000000OO00 = new Matrix4f();
   private final Matrix3f O00000000OO000 = new Matrix3f();
   private final Quaternionf O00000000OO00O = new Quaternionf();
   private final ChinaHat.W135 O00000000OO0O = new ChinaHat.W135();

   public ChinaHat() {
      O00000O0O0OO0O.O00000000();
   }

   @Override
   public void O00000000() {
      this.O00000000OO0.O00000000(0.0F);
      super.O00000000();
   }

   @Override
   public void O000000000() {
      this.O00000000OO0.O00000000(0.0F);
      super.O000000000();
   }

   public static void O00000000(
      PlayerEntityRenderState playerEntityRenderState,
      PlayerEntityModel playerEntityModel,
      MatrixStack matrixStack,
      VertexConsumerProvider vertexConsumerProvider,
      int i
   ) {
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         ChinaHat var5 = WildClient.O00000000.O000000000.O00000000(ChinaHat.class);
         if (var5 != null) {
            var5.O00000000(playerEntityRenderState, playerEntityModel, matrixStack, vertexConsumerProvider);
         }
      }
   }

   private void O00000000(
      PlayerEntityRenderState playerEntityRenderState,
      PlayerEntityModel playerEntityModel,
      MatrixStack matrixStack,
      VertexConsumerProvider vertexConsumerProvider
   ) {
      if (this.O0000000000000
         && O0000000000 != null
         && O0000000000.world != null
         && O0000000000.player != null
         && playerEntityRenderState != null
         && playerEntityModel != null
         && matrixStack != null
         && vertexConsumerProvider != null) {
         if (playerEntityRenderState.id == O0000000000.player.getId()) {
            if (O0000000000.options.getPerspective() != Perspective.FIRST_PERSON) {
               if (!playerEntityRenderState.spectator && !playerEntityRenderState.invisible && !playerEntityRenderState.invisibleToPlayer) {
                  float var5 = this.O00000000OO0.O00000000(1.0F, O00000000O);
                  if (!(var5 <= 0.001F)) {
                     this.O00000000OO0O.O00000000(playerEntityRenderState.age);
                     Entry var6 = matrixStack.peek();
                     this.O00000000OO00.set(var6.getPositionMatrix());
                     this.O00000000OO000.set(var6.getNormalMatrix());

                     try {
                        this.O00000000(playerEntityModel.head, matrixStack);
                        Entry var7 = matrixStack.peek();
                        Matrix4f var8 = var7.getPositionMatrix();
                        Matrix3f var9 = var7.getNormalMatrix();
                        VertexConsumer var10 = vertexConsumerProvider.getBuffer(O00000O0O0OO0O.O000000000());
                        this.O00000000(var10, var8, var9, var5);
                        this.O00000000(var10, var8, var9, var5, false);
                        this.O000000000(var10, var8, var9, var5);
                        VertexConsumer var11 = vertexConsumerProvider.getBuffer(O00000O0O0OO0O.O0000000000());
                        this.O0000000000(var11, var8, var9, var5);
                        this.O00000000(var11, var8, var9, var5, true);
                        this.O00000000000(var11, var8, var9, var5);
                     } finally {
                        var6.getPositionMatrix().set(this.O00000000OO00);
                        var6.getNormalMatrix().set(this.O00000000OO000);
                     }
                  }
               }
            }
         }
      }
   }

   private void O00000000(ModelPart modelPart, MatrixStack matrixStack) {
      matrixStack.translate(modelPart.originX * 0.0625F, modelPart.originY * 0.0625F, modelPart.originZ * 0.0625F);
      if (modelPart.pitch != 0.0F || modelPart.yaw != 0.0F || modelPart.roll != 0.0F) {
         this.O00000000OO00O.rotationZYX(modelPart.roll, modelPart.yaw, modelPart.pitch);
         matrixStack.multiply(this.O00000000OO00O);
      }

      if (modelPart.xScale != 1.0F || modelPart.yScale != 1.0F || modelPart.zScale != 1.0F) {
         matrixStack.scale(modelPart.xScale, modelPart.yScale, modelPart.zScale);
      }
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, Matrix3f matrix3f, float f) {
      int var5 = this.O00000000OO0O.O00000000;
      int var6 = this.O00000000OO0O.O000000000;
      int var7 = O000000000(var5);
      int var8 = O0000000000(var5);
      int var9 = O00000000000(var5);
      int var10 = O000000000(var6);
      int var11 = O0000000000(var6);
      int var12 = O00000000000(var6);
      float var13 = f;

      for (int var14 = 0; var14 < 256; var14++) {
         int var15 = var14 + 1;
         float var16 = var14 / 256.0F;
         float var17 = var15 / 256.0F;
         float var18 = O00000000O00[var14];
         float var19 = O00000000O0[var14];
         float var20 = O00000000O00[var15];
         float var21 = O00000000O0[var15];
         this.O00000000(
            vertexConsumer,
            matrix4f,
            matrix3f,
            var18 * O000000000OO00,
            -0.769105F,
            var19 * O000000000OO00,
            var18 * 0.286F,
            -O000000000O0O0,
            var19 * 0.286F,
            var16,
            0.035F,
            var7,
            var8,
            var9,
            var13 * 0.58F,
            var20 * O000000000OO00,
            -0.769105F,
            var21 * O000000000OO00,
            var20 * 0.286F,
            -O000000000O0O0,
            var21 * 0.286F,
            var17,
            0.035F,
            var7,
            var8,
            var9,
            var13 * 0.58F,
            var20 * O000000000O0O0,
            -0.503125F,
            var21 * O000000000O0O0,
            var20 * 0.286F,
            -O000000000O0O0,
            var21 * 0.286F,
            var17,
            0.985F,
            var10,
            var11,
            var12,
            var13,
            var18 * O000000000O0O0,
            -0.503125F,
            var19 * O000000000O0O0,
            var18 * 0.286F,
            -O000000000O0O0,
            var19 * 0.286F,
            var16,
            0.985F,
            var10,
            var11,
            var12,
            var13
         );
      }
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, Matrix3f matrix3f, float f, boolean bl) {
      int var6 = this.O00000000OO0O.O00000000;
      int var7 = this.O00000000OO0O.O000000000;
      int var8 = O000000000(var6);
      int var9 = O0000000000(var6);
      int var10 = O00000000000(var6);
      int var11 = O000000000(var7);
      int var12 = O0000000000(var7);
      int var13 = O00000000000(var7);
      float var14 = bl ? 0.055F : 0.085F;
      float var15 = bl ? 0.235F : 0.155F;
      float var16 = O000000000O0O0 * var14;
      float var17 = O000000000O0O0 * var15;
      float var18 = -0.789125F + 0.286F * var14;
      float var19 = -0.789125F + 0.286F * var15;
      float var20 = bl ? 2.0F : 1.0F;
      float var21 = f * (bl ? 0.42F : 0.68F);

      for (int var22 = 0; var22 < 256; var22++) {
         int var23 = var22 + 1;
         float var24 = var22 / 256.0F;
         float var25 = var23 / 256.0F;
         float var26 = O00000000O00[var22];
         float var27 = O00000000O0[var22];
         float var28 = O00000000O00[var23];
         float var29 = O00000000O0[var23];
         this.O00000000(
            vertexConsumer,
            matrix4f,
            matrix3f,
            var26 * var16,
            var18,
            var27 * var16,
            var26 * 0.286F,
            -O000000000O0O0,
            var27 * 0.286F,
            var24,
            var20 + 0.055F,
            var8,
            var9,
            var10,
            var21 * 0.48F,
            var28 * var16,
            var18,
            var29 * var16,
            var28 * 0.286F,
            -O000000000O0O0,
            var29 * 0.286F,
            var25,
            var20 + 0.055F,
            var8,
            var9,
            var10,
            var21 * 0.48F,
            var28 * var17,
            var19,
            var29 * var17,
            var28 * 0.286F,
            -O000000000O0O0,
            var29 * 0.286F,
            var25,
            var20 + 0.82F,
            var11,
            var12,
            var13,
            var21,
            var26 * var17,
            var19,
            var27 * var17,
            var26 * 0.286F,
            -O000000000O0O0,
            var27 * 0.286F,
            var24,
            var20 + 0.82F,
            var11,
            var12,
            var13,
            var21
         );
      }
   }

   private void O000000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, Matrix3f matrix3f, float f) {
      int var5 = this.O00000000OO0O.O00000000;
      int var6 = this.O00000000OO0O.O000000000;
      int var7 = O000000000(var5);
      int var8 = O0000000000(var5);
      int var9 = O00000000000(var5);
      int var10 = O000000000(var6);
      int var11 = O0000000000(var6);
      int var12 = O00000000000(var6);
      float var13 = O000000000O0O0 * 0.972F;
      float var14 = O000000000O0O0 * 1.052F;
      float var15 = -0.500625F;
      float var16 = f;

      for (int var17 = 0; var17 < 256; var17++) {
         int var18 = var17 + 1;
         float var19 = var17 / 256.0F;
         float var20 = var18 / 256.0F;
         float var21 = O00000000O00[var17];
         float var22 = O00000000O0[var17];
         float var23 = O00000000O00[var18];
         float var24 = O00000000O0[var18];
         this.O00000000(
            vertexConsumer,
            matrix4f,
            matrix3f,
            var21 * var13,
            var15,
            var22 * var13,
            0.0F,
            -1.0F,
            0.0F,
            var19,
            1.1800001F,
            var7,
            var8,
            var9,
            var16 * 0.2F,
            var23 * var13,
            var15,
            var24 * var13,
            0.0F,
            -1.0F,
            0.0F,
            var20,
            1.1800001F,
            var7,
            var8,
            var9,
            var16 * 0.2F,
            var23 * var14,
            var15,
            var24 * var14,
            var23,
            -0.045F,
            var24,
            var20,
            1.9200001F,
            var10,
            var11,
            var12,
            var16,
            var21 * var14,
            var15,
            var22 * var14,
            var21,
            -0.045F,
            var22,
            var19,
            1.9200001F,
            var10,
            var11,
            var12,
            var16
         );
      }
   }

   private void O0000000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, Matrix3f matrix3f, float f) {
      int var5 = this.O00000000OO0O.O00000000;
      int var6 = this.O00000000OO0O.O000000000;
      int var7 = O000000000(var5);
      int var8 = O0000000000(var5);
      int var9 = O00000000000(var5);
      int var10 = O000000000(var6);
      int var11 = O0000000000(var6);
      int var12 = O00000000000(var6);
      float var13 = O000000000O0O0 * 1.072F;
      float var14 = O000000000OO00 * 1.36F;
      float var15 = -0.77210504F;
      float var16 = -0.504625F;
      float var17 = f * 0.38F;

      for (int var18 = 0; var18 < 256; var18++) {
         int var19 = var18 + 1;
         float var20 = var18 / 256.0F;
         float var21 = var19 / 256.0F;
         float var22 = O00000000O00[var18];
         float var23 = O00000000O0[var18];
         float var24 = O00000000O00[var19];
         float var25 = O00000000O0[var19];
         this.O00000000(
            vertexConsumer,
            matrix4f,
            matrix3f,
            var22 * var14,
            var15,
            var23 * var14,
            var22 * 0.286F,
            -var13,
            var23 * 0.286F,
            var20,
            2.035F,
            var7,
            var8,
            var9,
            var17 * 0.1F,
            var24 * var14,
            var15,
            var25 * var14,
            var24 * 0.286F,
            -var13,
            var25 * 0.286F,
            var21,
            2.035F,
            var7,
            var8,
            var9,
            var17 * 0.1F,
            var24 * var13,
            var16,
            var25 * var13,
            var24 * 0.286F,
            -var13,
            var25 * 0.286F,
            var21,
            2.325F,
            var10,
            var11,
            var12,
            var17,
            var22 * var13,
            var16,
            var23 * var13,
            var22 * 0.286F,
            -var13,
            var23 * 0.286F,
            var20,
            2.325F,
            var10,
            var11,
            var12,
            var17
         );
      }
   }

   private void O00000000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, Matrix3f matrix3f, float f) {
      int var5 = this.O00000000OO0O.O00000000;
      int var6 = this.O00000000OO0O.O000000000;
      int var7 = O000000000(var5);
      int var8 = O0000000000(var5);
      int var9 = O00000000000(var5);
      int var10 = O000000000(var6);
      int var11 = O0000000000(var6);
      int var12 = O00000000000(var6);
      float var13 = O000000000O0O0 * 0.97F;
      float var14 = O000000000O0O0 * 1.075F;
      float var15 = O000000000O0O0 * 1.02F;
      float var16 = O000000000O0O0 * 0.44F;
      float var17 = 0.122F;
      float var18 = -0.500125F;
      float var19 = f * 0.94F;
      float var20 = f * 0.34F;

      for (int var21 = 0; var21 < 256; var21++) {
         int var22 = var21 + 1;
         float var23 = var21 / 256.0F;
         float var24 = var22 / 256.0F;
         float var25 = O00000000O00[var21];
         float var26 = O00000000O0[var21];
         float var27 = O00000000O00[var22];
         float var28 = O00000000O0[var22];
         this.O00000000(
            vertexConsumer,
            matrix4f,
            matrix3f,
            var25 * var13,
            var18 - 0.0015F,
            var26 * var13,
            0.0F,
            -1.0F,
            0.0F,
            var23,
            2.02F,
            var7,
            var8,
            var9,
            var19 * 0.42F,
            var27 * var13,
            var18 - 0.0015F,
            var28 * var13,
            0.0F,
            -1.0F,
            0.0F,
            var24,
            2.02F,
            var7,
            var8,
            var9,
            var19 * 0.42F,
            var27 * var14,
            var18 - 0.0015F,
            var28 * var14,
            var27,
            -0.045F,
            var28,
            var24,
            2.72F,
            var10,
            var11,
            var12,
            var19,
            var25 * var14,
            var18 - 0.0015F,
            var26 * var14,
            var25,
            -0.045F,
            var26,
            var23,
            2.72F,
            var10,
            var11,
            var12,
            var19
         );

         for (int var29 = 0; var29 < 18; var29++) {
            float var30 = O00000000O0000[var29];
            float var31 = O00000000O000[var29];
            float var33 = var15 + var30 * var16;
            float var34 = var18 + var31 * var17;
            float var35 = var25 * var30;
            float var36 = var26 * var30;
            float var37 = var27 * var30;
            float var38 = var28 * var30;
            this.O00000000(
               vertexConsumer,
               matrix4f,
               matrix3f,
               var25 * var15,
               var18,
               var26 * var15,
               var25,
               0.0F,
               var26,
               var23,
               2.035F,
               var7,
               var8,
               var9,
               var20,
               var27 * var15,
               var18,
               var28 * var15,
               var27,
               0.0F,
               var28,
               var24,
               2.035F,
               var7,
               var8,
               var9,
               var20,
               var27 * var33,
               var34,
               var28 * var33,
               var37,
               var31,
               var38,
               var24,
               2.995F,
               var10,
               var11,
               var12,
               var20 * 0.18F,
               var25 * var33,
               var34,
               var26 * var33,
               var35,
               var31,
               var36,
               var23,
               2.995F,
               var10,
               var11,
               var12,
               var20 * 0.18F
            );
         }
      }
   }

   private void O00000000(
      VertexConsumer vertexConsumer,
      Matrix4f matrix4f,
      Matrix3f matrix3f,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      int n,
      int o,
      int p,
      float q,
      float r,
      float s,
      float t,
      float u,
      float v,
      float w,
      float x,
      float y,
      int z,
      int aa,
      int ab,
      float ac,
      float ad,
      float ae,
      float af,
      float ag,
      float ah,
      float ai,
      float aj,
      float ak,
      int al,
      int am,
      int an,
      float ao
   ) {
      O00000000(vertexConsumer, matrix4f, matrix3f, f, g, h, i, j, k, l, m, n, o, p, q);
      O00000000(vertexConsumer, matrix4f, matrix3f, r, s, t, u, v, w, x, y, z, aa, ab, ac);
      O00000000(vertexConsumer, matrix4f, matrix3f, ad, ae, af, ag, ah, ai, aj, ak, al, am, an, ao);
   }

   private void O00000000(
      VertexConsumer vertexConsumer,
      Matrix4f matrix4f,
      Matrix3f matrix3f,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      int n,
      int o,
      int p,
      float q,
      float r,
      float s,
      float t,
      float u,
      float v,
      float w,
      float x,
      float y,
      int z,
      int aa,
      int ab,
      float ac,
      float ad,
      float ae,
      float af,
      float ag,
      float ah,
      float ai,
      float aj,
      float ak,
      int al,
      int am,
      int an,
      float ao,
      float ap,
      float aq,
      float ar,
      float as,
      float at,
      float au,
      float av,
      float aw,
      int ax,
      int ay,
      int az,
      float ba
   ) {
      this.O00000000(
         vertexConsumer,
         matrix4f,
         matrix3f,
         f,
         g,
         h,
         i,
         j,
         k,
         l,
         m,
         n,
         o,
         p,
         q,
         r,
         s,
         t,
         u,
         v,
         w,
         x,
         y,
         z,
         aa,
         ab,
         ac,
         ad,
         ae,
         af,
         ag,
         ah,
         ai,
         aj,
         ak,
         al,
         am,
         an,
         ao
      );
      this.O00000000(
         vertexConsumer,
         matrix4f,
         matrix3f,
         f,
         g,
         h,
         i,
         j,
         k,
         l,
         m,
         n,
         o,
         p,
         q,
         ad,
         ae,
         af,
         ag,
         ah,
         ai,
         aj,
         ak,
         al,
         am,
         an,
         ao,
         ap,
         aq,
         ar,
         as,
         at,
         au,
         av,
         aw,
         ax,
         ay,
         az,
         ba
      );
   }

   private static void O00000000(
      VertexConsumer vertexConsumer,
      Matrix4f matrix4f,
      Matrix3f matrix3f,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      int n,
      int o,
      int p,
      float q
   ) {
      float var15 = matrix4f.m00() * f + matrix4f.m10() * g + matrix4f.m20() * h + matrix4f.m30();
      float var16 = matrix4f.m01() * f + matrix4f.m11() * g + matrix4f.m21() * h + matrix4f.m31();
      float var17 = matrix4f.m02() * f + matrix4f.m12() * g + matrix4f.m22() * h + matrix4f.m32();
      float var18 = matrix3f.m00() * i + matrix3f.m10() * j + matrix3f.m20() * k;
      float var19 = matrix3f.m01() * i + matrix3f.m11() * j + matrix3f.m21() * k;
      float var20 = matrix3f.m02() * i + matrix3f.m12() * j + matrix3f.m22() * k;
      float var21 = O00000000(var18 * var18 + var19 * var19 + var20 * var20);
      vertexConsumer.vertex(var15, var16, var17)
         .texture(l, m)
         .color(n, o, p, O00000000(Math.round(O00000000(q, 0.0F, 1.0F) * 255.0F)))
         .normal(var18 * var21, var19 * var21, var20 * var21);
   }

   private static float O00000000(float f) {
      return f <= 1.0E-6F ? 1.0F : (float)(1.0 / Math.sqrt(f));
   }

   private static float O00000000(float f, float g, float h) {
      if (f < g) {
         return g;
      } else {
         return f > h ? h : f;
      }
   }

   private static int O00000000(int i) {
      if (i < 0) {
         return 0;
      } else {
         return i > 255 ? 255 : i;
      }
   }

   private static int O000000000(int i) {
      return i >> 16 & 0xFF;
   }

   private static int O0000000000(int i) {
      return i >> 8 & 0xFF;
   }

   private static int O00000000000(int i) {
      return i & 0xFF;
   }

   static int O00000000(int i, float f) {
      float var2 = O00000000(f, 0.0F, 1.0F);
      int var3 = O000000000(i);
      int var4 = O0000000000(i);
      int var5 = O00000000000(i);
      int var6 = Math.min(255, Math.round(var3 + (255 - var3) * var2));
      int var7 = Math.min(255, Math.round(var4 + (255 - var4) * var2));
      int var8 = Math.min(255, Math.round(var5 + (255 - var5) * var2));
      return var6 << 16 | var7 << 8 | var8;
   }

   private static int O00000000(int i, int j, float f) {
      float var3 = O00000000(f, 0.0F, 1.0F);
      int var4 = Math.round(O000000000(i) + (O000000000(j) - O000000000(i)) * var3);
      int var5 = Math.round(O0000000000(i) + (O0000000000(j) - O0000000000(i)) * var3);
      int var6 = Math.round(O00000000000(i) + (O00000000000(j) - O00000000000(i)) * var3);
      return var4 << 16 | var5 << 8 | var6;
   }

   static int O00000000(int[] is, float f) {
      float var2 = f - (float)Math.floor(f);
      float var3 = var2 * (is.length - 1);
      int var4 = Math.min(is.length - 2, Math.max(0, (int)Math.floor(var3)));
      return O00000000(is[var4] & 16777215, is[var4 + 1] & 16777215, var3 - var4);
   }

   static int[] O00000000(Theme o0000000OOO) {
      return switch (o0000000OOO) {
         case ASTOLFO_RAINBOW -> O00000000O000O;
         case LAGUNE_RAINBOW -> O00000000O00O;
         case HALF_RAINBOW -> O00000000O00O0;
         case AURORA_RAINBOW -> O00000000O00OO;
         case NEON_RAINBOW -> O00000000O0O;
         case BLOSSOM_RAINBOW -> O00000000O0O0;
         case ABYSS_RAINBOW -> O00000000O0O00;
         case SUNSET_RAINBOW -> O00000000O0O0O;
         case GLACIER_RAINBOW -> O00000000O0OO;
         case CHROMA_RAINBOW -> O00000000O0OO0;
         case DREAM_RAINBOW -> O00000000O0OOO;
         case TOXIC_RAINBOW -> O00000000OO;
         default -> null;
      };
   }

   static {
      for (int var0 = 0; var0 <= 256; var0++) {
         float var1 = (float) (Math.PI * 2) * var0 / 256.0F;
         O00000000O0[var0] = (float)Math.sin(var1);
         O00000000O00[var0] = (float)Math.cos(var1);
      }

      for (int var2 = 0; var2 <= 18; var2++) {
         float var3 = (float) (Math.PI * 2) * var2 / 18.0F;
         O00000000O000[var2] = (float)Math.sin(var3);
         O00000000O0000[var2] = (float)Math.cos(var3);
      }
   }

   static final class W135 {
      int O00000000;
      int O000000000;

      void O00000000(float f) {
         Theme var2 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.WILD;
         int[] var3 = ChinaHat.O00000000(var2);
         if (var3 != null) {
            float var4 = f * 0.0062F;
            this.O000000000 = ChinaHat.O00000000(var3, var4);
            this.O00000000 = ChinaHat.O00000000(ChinaHat.O00000000(var3, var4 + 0.34F), 0.14F);
         } else if (var2 == Theme.WILD) {
            this.O00000000 = 9348607;
            this.O000000000 = 6061311;
         } else {
            int var5 = var2.O00000000().getRGB() & 16777215;
            this.O00000000 = ChinaHat.O00000000(var5, 0.18F);
            this.O000000000 = var5;
         }
      }
   }
}
