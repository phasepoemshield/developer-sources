package zenith;

import zenith.hud.*;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.Consumer;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.util.DefaultSkinHelper;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexFormat.LootPool96;
import org.joml.Matrix4f;

public final class floatHolder_8 implements ZenithInternal151 {
   public static final float lIIIIIIll = 0.8F;
   public static ListHolder l1l111I11II1II = new ListHolder(
      ZenithClient.StringHolder_10("rectangle/data"), net.minecraft.client.render.VertexFormats.POSITION_COLOR
   );
   public static ListHolder Ill1l1lI11Ill = new ListHolder(
      ZenithClient.StringHolder_10("batch_rectangle/data"), net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR
   );
   private static ListHolder lIllI11ll1 = new ListHolder(
      ZenithClient.StringHolder_10("squircle/data"), net.minecraft.client.render.VertexFormats.POSITION_COLOR
   );
   private static ListHolder I1Il1l1IlllII1llI11I1II1 = new ListHolder(
      ZenithClient.StringHolder_10("texture/data"), net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR
   );
   private static ListHolder ll1l11IlII = new ListHolder(
      ZenithClient.StringHolder_10("squircle_texture/data"), net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR
   );
   private static ListHolder llIlllIII1I1Il1Il1I1II111 = new ListHolder(
      ZenithClient.StringHolder_10("border/data"), net.minecraft.client.render.VertexFormats.POSITION_COLOR
   );
   private static ListHolder I1lII1I1Illl11Il1Il11lI1ll11ll = new ListHolder(
      ZenithClient.StringHolder_10("corner/data"), net.minecraft.client.render.VertexFormats.POSITION_COLOR
   );
   private static ListHolder lIlIl1lIIll1l = new ListHolder(
      ZenithClient.StringHolder_10("arc_border/data"), net.minecraft.client.render.VertexFormats.POSITION_COLOR
   );
   private static ListHolder I1l1lIl1IlIllI = new ListHolder(
      ZenithClient.StringHolder_10("liquidglass/data"), net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR
   );
   private static ListHolder I1l1Il1l1II = new ListHolder(
      ZenithClient.StringHolder_10("loading/data"), net.minecraft.client.render.VertexFormats.POSITION_COLOR
   );
   private static ListHolder II11lllI11I1llIIIl11IIIl11l = new ListHolder(
      ZenithClient.StringHolder_10("gradient_rectangle/data"), net.minecraft.client.render.VertexFormats.POSITION_COLOR
   );
   public static boolean IIIl1ll1l1Il1II11Ill1Il1l1I = true;

   public static void ll1IlIl1IIIIl11l() {
      l1l111I11II1II = new ListHolder(
         ZenithClient.StringHolder_10("rectangle/data"), net.minecraft.client.render.VertexFormats.POSITION_COLOR
      );
      Ill1l1lI11Ill = new ListHolder(
         ZenithClient.StringHolder_10("batch_rectangle/data"), net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR
      );
      lIllI11ll1 = new ListHolder(
         ZenithClient.StringHolder_10("squircle/data"), net.minecraft.client.render.VertexFormats.POSITION_COLOR
      );
      ll1l11IlII = new ListHolder(
         ZenithClient.StringHolder_10("squircle_texture/data"), net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR
      );
      I1Il1l1IlllII1llI11I1II1 = new ListHolder(
         ZenithClient.StringHolder_10("texture/data"), net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR
      );
      llIlllIII1I1Il1Il1I1II111 = new ListHolder(
         ZenithClient.StringHolder_10("border/data"), net.minecraft.client.render.VertexFormats.POSITION_COLOR
      );
      I1lII1I1Illl11Il1Il11lI1ll11ll = new ListHolder(
         ZenithClient.StringHolder_10("corner/data"), net.minecraft.client.render.VertexFormats.POSITION_COLOR
      );
      lIlIl1lIIll1l = new ListHolder(
         ZenithClient.StringHolder_10("arc_border/data"), net.minecraft.client.render.VertexFormats.POSITION_COLOR
      );
      I1l1Il1l1II = new ListHolder(
         ZenithClient.StringHolder_10("loading/data"), net.minecraft.client.render.VertexFormats.POSITION_COLOR
      );
      II11lllI11I1llIIIl11IIIl11l = new ListHolder(
         ZenithClient.StringHolder_10("gradient_rectangle/data"), net.minecraft.client.render.VertexFormats.POSITION_COLOR
      );
      I1l1lIl1IlIllI = new ListHolder(
         ZenithClient.StringHolder_10("liquidglass/data"), net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR
      );
   }

   private static boolean StringHolder_8(MatrixStack MatrixStack, Consumer<MatrixStack> consumer) {
      return ListHolder_4.StringHolder_8(MatrixStack.peek().getPositionMatrix(), consumer);
   }

   private static boolean EventBus(MatrixStack MatrixStack, Consumer<MatrixStack> consumer) {
      return ListHolder_4.EventBus(MatrixStack.peek().getPositionMatrix(), consumer);
   }

   private static void EventBus(float f, float f1, float f2, float f3, boolean flag) {
      net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
      byte b0 = -1;
      float f4 = flag ? 0.0F : 1.0F;
      float f5 = flag ? 1.0F : 0.0F;
      BufferBuilder.vertex(f, f1, 0.0F).texture(0.0F, f5).color(-1);
      BufferBuilder.vertex(f, f1 + f3, 0.0F).texture(0.0F, f4).color(-1);
      BufferBuilder.vertex(f + f2, f1 + f3, 0.0F).texture(1.0F, f4).color(-1);
      BufferBuilder.vertex(f + f2, f1, 0.0F).texture(1.0F, f5).color(-1);
      net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack, net.minecraft.util.math.Vec2f Vec2f, net.minecraft.util.math.Vec2f Vec2f, ByteBufferHolder il1iliilli1l1iill
   ) {
      if (!StringHolder_8(MatrixStack, MatrixStack -> StringHolder_8(MatrixStackx, Vec2fx, Vec2f, il1iliilli1l1iill))) {
         MatrixStack.push();

         try {
            Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
            RenderSystem.lineWidth(1.0F);
            I1lIIl1lI1IlI11I1llIll11();
            net.minecraft.client.render.BufferBuilder BufferBuilder = RenderSystem.renderThreadTesselator().begin(LootPool96.DEBUG_LINE_STRIP, net.minecraft.client.render.VertexFormats.POSITION_COLOR);
            BufferBuilder.vertex(matrix4f, Vec2fx.x, Vec2fx.y, 0.0F)
               .color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
            BufferBuilder.vertex(matrix4f, Vec2f.x, Vec2f.y, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
            net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
            II111l1llI1l1111IlIllI1l1Il1();
         } finally {
            RenderSystem.disableBlend();
            RenderSystem.lineWidth(1.0F);
            MatrixStack.pop();
         }
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      net.minecraft.util.math.Vec2f Vec2f,
      net.minecraft.util.math.Vec2f Vec2f,
      net.minecraft.util.math.Vec2f Vec2f,
      net.minecraft.util.math.Vec2f Vec2f,
      ByteBufferHolder il1iliilli1l1iill,
      int i
   ) {
      if (!StringHolder_8(MatrixStack, MatrixStack -> StringHolder_8(MatrixStackx, Vec2fxxx, Vec2fxx, Vec2fx, Vec2f, il1iliilli1l1iill, i))
         )
       {
         MatrixStack.push();

         try {
            Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
            RenderSystem.lineWidth(1.0F);
            I1lIIl1lI1IlI11I1llIll11();
            net.minecraft.client.render.BufferBuilder BufferBuilder = RenderSystem.renderThreadTesselator().begin(LootPool96.DEBUG_LINE_STRIP, net.minecraft.client.render.VertexFormats.POSITION_COLOR);

            for (int j = 0; j <= i; j++) {
               float f = (float)j / (float)i;
               float f1 = (float)doubleHolder_3.StringHolder_8(
                  (double)f, (double)Vec2fxxx.x, (double)Vec2fxx.x, (double)Vec2fx.x, (double)Vec2f.x
               );
               float f2 = (float)doubleHolder_3.StringHolder_8(
                  (double)f, (double)Vec2fxxx.y, (double)Vec2fxx.y, (double)Vec2fx.y, (double)Vec2f.y
               );
               BufferBuilder.vertex(matrix4f, f1, f2, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
            }

            net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
            II111l1llI1l1111IlIllI1l1Il1();
         } finally {
            RenderSystem.disableBlend();
            RenderSystem.lineWidth(1.0F);
            MatrixStack.pop();
         }
      }
   }

   private static float EventBus(float f, float f1, float f2, float f3, float f4) {
      float f5 = 1.0F - f;
      float f6 = f * f;
      float f7 = f5 * f5;
      return f7 * f5 * f1 + 3.0F * f7 * f * f2 + 3.0F * f5 * f6 * f3 + f6 * f * f4;
   }

   public static void StringHolder_8(MatrixStack MatrixStack, float f, float f1, float f2, float f3, ByteBufferHolder il1iliilli1l1iill) {
      if (!ListHolder_4.StringHolder_8(MatrixStack.peek().getPositionMatrix(), f, f1, f2, f3, il1iliilli1l1iill)) {
         MatrixStack.push();
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         I1lIIl1lI1IlI11I1llIll11();
         net.minecraft.client.render.BufferBuilder BufferBuilder = RenderSystem.renderThreadTesselator().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_COLOR);
         BufferBuilder.vertex(matrix4f, f, f1 + f3, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f + f2, f1 + f3, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f + f2, f1, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f, f1, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         II111l1llI1l1111IlIllI1l1Il1();
         MatrixStack.pop();
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill,
      float f4,
      float f5,
      ByteBufferHolder il1iliilli1l1iill1,
      float f6,
      boolean flag,
      float f7,
      float f8,
      float f9
   ) {
      StringHolder_8(
         MatrixStack.peek().getPositionMatrix(),
         f,
         f1,
         f2,
         f3,
         iil11iill1il1l1llilll1l1i1i1,
         il1iliilli1l1iill,
         f4,
         f5,
         il1iliilli1l1iill1,
         f6,
         flag,
         f7,
         f8,
         f9
      );
   }

   public static void StringHolder_8(
      Matrix4f matrix4f,
      float f,
      float f1,
      float f2,
      float f3,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill,
      float f4,
      float f5,
      ByteBufferHolder il1iliilli1l1iill1,
      float f6,
      boolean flag,
      float f7,
      float f8,
      float f9
   ) {
      I1lIIl1lI1IlI11I1llIll11();
      RenderSystem.disableCull();
      RenderSystem.setShaderTexture(
         0, ZenithClient.getInstance().GetDisplayNameHandler().I11I11II1I111llIIII11llIIl1l1l().getColorAttachment()
      );
      I1l1lIl1IlIllI.IlllIllllII();
      I1l1lIl1IlIllI.CloudFriendInfo("GlobalAlpha").set(f4);
      I1l1lIl1IlIllI.CloudFriendInfo("Size").set(f2, f3);
      I1l1lIl1IlIllI.CloudFriendInfo("Radius")
         .set(
            iil11iill1il1l1llilll1l1i1i1.I1lIIlI1I11I1ll1l11II1llI1lIl1(),
            iil11iill1il1l1llilll1l1i1i1.llll1I11IllIl1llII1IIlll1ll(),
            iil11iill1il1l1llilll1l1i1i1.Ill1I11IIIlII1(),
            iil11iill1il1l1llilll1l1i1i1.IIIll1I1lI1lllIIIIl1lI()
         );
      I1l1lIl1IlIllI.CloudFriendInfo("Smoothness").set(1.0F);
      I1l1lIl1IlIllI.CloudFriendInfo("FresnelPower").set(f5);
      I1l1lIl1IlIllI.CloudFriendInfo("FresnelColor")
         .set(
            (float)il1iliilli1l1iill1.IlIIlllIIIlllI1Il1Il11llI1lll() / 255.0F,
            (float)il1iliilli1l1iill1.llI11I1ll11IlI() / 255.0F,
            (float)il1iliilli1l1iill1.III11IllIIIIlII1Il1IIlI() / 255.0F
         );
      I1l1lIl1IlIllI.CloudFriendInfo("FresnelAlpha").set((float)il1iliilli1l1iill1.I11Ill1I1I1llll11Il1I1I() / 255.0F);
      I1l1lIl1IlIllI.CloudFriendInfo("BaseAlpha").set(f6);
      I1l1lIl1IlIllI.CloudFriendInfo("FresnelInvert").set(flag ? 1 : 0);
      I1l1lIl1IlIllI.CloudFriendInfo("FresnelMix").set(f7);
      I1l1lIl1IlIllI.CloudFriendInfo("DistortStrength").set(f8);
      I1l1lIl1IlIllI.CloudFriendInfo("Time").set((float)(System.currentTimeMillis() % 1000000L) / 1000.0F);
      ByteBufferHolder il1iliilli1l1iill2 = Interface.ll11lIl1IlIl1lI1.lI1I1l1l1I11Il1lI1lll11ll11IlI();
      I1l1lIl1IlIllI.CloudFriendInfo("GlareColor")
         .set(
            (float)il1iliilli1l1iill2.IlIIlllIIIlllI1Il1Il11llI1lll() / 255.0F,
            (float)il1iliilli1l1iill2.llI11I1ll11IlI() / 255.0F,
            (float)il1iliilli1l1iill2.III11IllIIIIlII1Il1IIlI() / 255.0F
         );
      I1l1lIl1IlIllI.CloudFriendInfo("GlareAlpha").set((float)il1iliilli1l1iill2.I11Ill1I1I1llll11Il1I1I() / 255.0F);
      I1l1lIl1IlIllI.CloudFriendInfo("GlareSpeed").set(Interface.ll11lIl1IlIl1lI1.lllI1lIIII11l11l1());
      I1l1lIl1IlIllI.CloudFriendInfo("CornerSmoothness").set(f9);
      int i = lI1I1l1IlIlIIIIlIIllIIII.getScaledWidth();
      int j = lI1I1l1IlIlIIIIlIIllIIII.getScaledHeight();
      float f10 = f / (float)i;
      float f11 = ((float)j - f1 - f3) / (float)j;
      float f12 = f2 / (float)i;
      float f13 = f3 / (float)j;
      net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
      BufferBuilder.vertex(matrix4f, f, f1, 0.0F).texture(f10, f11 + f13).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
      BufferBuilder.vertex(matrix4f, f, f1 + f3, 0.0F).texture(f10, f11).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
      BufferBuilder.vertex(matrix4f, f + f2, f1 + f3, 0.0F).texture(f10 + f12, f11).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
      BufferBuilder.vertex(matrix4f, f + f2, f1, 0.0F).texture(f10 + f12, f11 + f13).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
      net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
      RenderSystem.setShaderTexture(0, 0);
      RenderSystem.enableCull();
      II111l1llI1l1111IlIllI1l1Il1();
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      float f5,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      StringHolder_8(MatrixStack.peek().getPositionMatrix(), f, f1, f2, f3, f4, f5, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
   }

   public static void StringHolder_8(
      Matrix4f matrix4f,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      float f5,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      iil11iill1il1l1llilll1l1i1i1 = new floatHolder_5(
         iil11iill1il1l1llilll1l1i1i1.I1lIIlI1I11I1ll1l11II1llI1lIl1() * f4 / 2.0F,
         iil11iill1il1l1llilll1l1i1i1.Ill1I11IIIlII1() * f4 / 2.0F,
         iil11iill1il1l1llilll1l1i1i1.IIIll1I1lI1lllIIIIl1lI() * f4 / 2.0F,
         iil11iill1il1l1llilll1l1i1i1.llll1I11IllIl1llII1IIlll1ll() * f4 / 2.0F
      );
      float f6 = 1.5F;
      StringHolder_8(
         matrix4f,
         f - f6,
         f1 - f6,
         f2 + f6 * 2.0F,
         f3 + f6 * 2.0F,
         iil11iill1il1l1llilll1l1i1i1,
         il1iliilli1l1iill,
         (float)il1iliilli1l1iill.I11Ill1I1I1llll11Il1I1I() / 255.0F,
         f3 == 240.0F ? 100.0F : 50.0F,
         il1iliilli1l1iill.EventImpl_36(255),
         1.0F,
         true,
         0.0F,
         f5,
         f4
      );
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill,
      boolean flag
   ) {
      iil11iill1il1l1llilll1l1i1i1 = new floatHolder_5(
         iil11iill1il1l1llilll1l1i1i1.I1lIIlI1I11I1ll1l11II1llI1lIl1() * f4 / 2.0F,
         iil11iill1il1l1llilll1l1i1i1.Ill1I11IIIlII1() * f4 / 2.0F,
         iil11iill1il1l1llilll1l1i1i1.IIIll1I1lI1lllIIIIl1lI() * f4 / 2.0F,
         iil11iill1il1l1llilll1l1i1i1.llll1I11IllIl1llII1IIlll1ll() * f4 / 2.0F
      );
      StringHolder_8(
         MatrixStack,
         f,
         f1,
         f2,
         f3,
         iil11iill1il1l1llilll1l1i1i1,
         il1iliilli1l1iill,
         (float)il1iliilli1l1iill.I11Ill1I1I1llll11Il1I1I() / 255.0F,
         f3 == 240.0F ? 100.0F : 50.0F,
         il1iliilli1l1iill.EventImpl_36(255),
         1.0F,
         true,
         0.0F,
         0.08F,
         f4
      );
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      if (!EventBus(MatrixStack, MatrixStack -> StringHolder_8(MatrixStackx, f, f1, f2, f3, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill))) {
         MatrixStack.push();
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         float f5 = 0.8F;
         lIllI11ll1.IlllIllllII();
         lIllI11ll1.CloudFriendInfo("Size").set(f2, f3);
         lIllI11ll1.CloudFriendInfo("Radius")
            .set(
               iil11iill1il1l1llilll1l1i1i1.I1lIIlI1I11I1ll1l11II1llI1lIl1() * f4 / 2.0F,
               iil11iill1il1l1llilll1l1i1i1.llll1I11IllIl1llII1IIlll1ll() * f4 / 2.0F,
               iil11iill1il1l1llilll1l1i1i1.Ill1I11IIIlII1() * f4 / 2.0F,
               iil11iill1il1l1llilll1l1i1i1.IIIll1I1lI1lllIIIIl1lI() * f4 / 2.0F
            );
         lIllI11ll1.CloudFriendInfo("Smoothness").set(f5);
         lIllI11ll1.CloudFriendInfo("CornerSmoothness").set(f4);
         I1lIIl1lI1IlI11I1llIll11();
         float f6 = -f5 / 2.0F + f5 * 2.0F;
         float f7 = f5 / 2.0F + f5;
         float f8 = f - f6 / 2.0F;
         float f9 = f1 - f7 / 2.0F;
         float f10 = f2 + f6;
         float f11 = f3 + f7;
         net.minecraft.client.render.BufferBuilder BufferBuilder = RenderSystem.renderThreadTesselator().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_COLOR);
         BufferBuilder.vertex(matrix4f, f8, f9, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f8, f9 + f11, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f8 + f10, f9 + f11, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f8 + f10, f9, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         II111l1llI1l1111IlIllI1l1Il1();
         MatrixStack.pop();
      }
   }

   public static void EventBus(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      if (!StringHolder_8(MatrixStack, MatrixStack -> EventBus(MatrixStackx, f, f1, f2, f3, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill))) {
         MatrixStack.push();
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         float f5 = 0.8F;
         I1l1Il1l1II.IlllIllllII();
         I1l1Il1l1II.CloudFriendInfo("Size").set(f2, f3);
         I1l1Il1l1II.CloudFriendInfo("Radius")
            .set(
               iil11iill1il1l1llilll1l1i1i1.I1lIIlI1I11I1ll1l11II1llI1lIl1(),
               iil11iill1il1l1llilll1l1i1i1.llll1I11IllIl1llII1IIlll1ll(),
               iil11iill1il1l1llilll1l1i1i1.Ill1I11IIIlII1(),
               iil11iill1il1l1llilll1l1i1i1.IIIll1I1lI1lllIIIIl1lI()
            );
         I1l1Il1l1II.CloudFriendInfo("Smoothness").set(f5);
         I1l1Il1l1II.CloudFriendInfo("Progress").set(f4);
         I1l1Il1l1II.CloudFriendInfo("StripeWidth").set(0.0F);
         I1l1Il1l1II.CloudFriendInfo("Fade").set(0.5F);
         I1lIIl1lI1IlI11I1llIll11();
         float f6 = -f5 / 2.0F + f5 * 2.0F;
         float f7 = f5 / 2.0F + f5;
         float f8 = f - f6 / 2.0F;
         float f9 = f1 - f7 / 2.0F;
         float f10 = f2 + f6;
         float f11 = f3 + f7;
         net.minecraft.client.render.BufferBuilder BufferBuilder = RenderSystem.renderThreadTesselator().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_COLOR);
         BufferBuilder.vertex(matrix4f, f8, f9, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f8, f9 + f11, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f8 + f10, f9 + f11, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f8 + f10, f9, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         II111l1llI1l1111IlIllI1l1Il1();
         MatrixStack.pop();
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      if (!ListHolder_4.EventTarget(MatrixStack.peek().getPositionMatrix(), f, f1, f2, f3, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill)) {
         MatrixStack.push();
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         float f4 = 0.8F;
         l1l111I11II1II.IlllIllllII();
         l1l111I11II1II.CloudFriendInfo("Size").set(f2, f3);
         l1l111I11II1II.CloudFriendInfo("Radius")
            .set(
               iil11iill1il1l1llilll1l1i1i1.I1lIIlI1I11I1ll1l11II1llI1lIl1(),
               iil11iill1il1l1llilll1l1i1i1.llll1I11IllIl1llII1IIlll1ll(),
               iil11iill1il1l1llilll1l1i1i1.Ill1I11IIIlII1(),
               iil11iill1il1l1llilll1l1i1i1.IIIll1I1lI1lllIIIIl1lI()
            );
         l1l111I11II1II.CloudFriendInfo("Smoothness").set(f4);
         I1lIIl1lI1IlI11I1llIll11();
         float f5 = -f4 / 2.0F + f4 * 2.0F;
         float f6 = f4 / 2.0F + f4;
         float f7 = f - f5 / 2.0F;
         float f8 = f1 - f6 / 2.0F;
         float f9 = f2 + f5;
         float f10 = f3 + f6;
         net.minecraft.client.render.BufferBuilder BufferBuilder = RenderSystem.renderThreadTesselator().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_COLOR);
         BufferBuilder.vertex(matrix4f, f7, f8, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f7, f8 + f10, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f7 + f9, f8 + f10, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f7 + f9, f8, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         II111l1llI1l1111IlIllI1l1Il1();
         MatrixStack.pop();
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill1,
      ByteBufferHolder il1iliilli1l1iill2,
      ByteBufferHolder il1iliilli1l1iill3
   ) {
      if (!EventBus(
         MatrixStack,
         MatrixStack -> StringHolder_8(
               MatrixStackx, f, f1, f2, f3, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill, il1iliilli1l1iill1, il1iliilli1l1iill2, il1iliilli1l1iill3
            )
      )) {
         MatrixStack.push();
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         float f4 = 0.8F;
         II11lllI11I1llIIIl11IIIl11l.IlllIllllII();
         II11lllI11I1llIIIl11IIIl11l.CloudFriendInfo("Size").set(f2, f3);
         II11lllI11I1llIIIl11IIIl11l.CloudFriendInfo("Radius")
            .set(
               iil11iill1il1l1llilll1l1i1i1.I1lIIlI1I11I1ll1l11II1llI1lIl1(),
               iil11iill1il1l1llilll1l1i1i1.llll1I11IllIl1llII1IIlll1ll(),
               iil11iill1il1l1llilll1l1i1i1.Ill1I11IIIlII1(),
               iil11iill1il1l1llilll1l1i1i1.IIIll1I1lI1lllIIIIl1lI()
            );
         II11lllI11I1llIIIl11IIIl11l.CloudFriendInfo("Smoothness").set(f4);
         II11lllI11I1llIIIl11IIIl11l.CloudFriendInfo("TopLeftColor")
            .set(
               (float)il1iliilli1l1iill.IlIIlllIIIlllI1Il1Il11llI1lll() / 255.0F,
               (float)il1iliilli1l1iill.llI11I1ll11IlI() / 255.0F,
               (float)il1iliilli1l1iill.III11IllIIIIlII1Il1IIlI() / 255.0F,
               (float)il1iliilli1l1iill.I11Ill1I1I1llll11Il1I1I() / 255.0F
            );
         II11lllI11I1llIIIl11IIIl11l.CloudFriendInfo("BottomLeftColor")
            .set(
               (float)il1iliilli1l1iill1.IlIIlllIIIlllI1Il1Il11llI1lll() / 255.0F,
               (float)il1iliilli1l1iill1.llI11I1ll11IlI() / 255.0F,
               (float)il1iliilli1l1iill1.III11IllIIIIlII1Il1IIlI() / 255.0F,
               (float)il1iliilli1l1iill1.I11Ill1I1I1llll11Il1I1I() / 255.0F
            );
         II11lllI11I1llIIIl11IIIl11l.CloudFriendInfo("BottomRightColor")
            .set(
               (float)il1iliilli1l1iill2.IlIIlllIIIlllI1Il1Il11llI1lll() / 255.0F,
               (float)il1iliilli1l1iill2.llI11I1ll11IlI() / 255.0F,
               (float)il1iliilli1l1iill2.III11IllIIIIlII1Il1IIlI() / 255.0F,
               (float)il1iliilli1l1iill2.I11Ill1I1I1llll11Il1I1I() / 255.0F
            );
         II11lllI11I1llIIIl11IIIl11l.CloudFriendInfo("TopRightColor")
            .set(
               (float)il1iliilli1l1iill3.IlIIlllIIIlllI1Il1Il11llI1lll() / 255.0F,
               (float)il1iliilli1l1iill3.llI11I1ll11IlI() / 255.0F,
               (float)il1iliilli1l1iill3.III11IllIIIIlII1Il1IIlI() / 255.0F,
               (float)il1iliilli1l1iill3.I11Ill1I1I1llll11Il1I1I() / 255.0F
            );
         I1lIIl1lI1IlI11I1llIll11();
         float f5 = -f4 / 2.0F + f4 * 2.0F;
         float f6 = f4 / 2.0F + f4;
         float f7 = f - f5 / 2.0F;
         float f8 = f1 - f6 / 2.0F;
         float f9 = f2 + f5;
         float f10 = f3 + f6;
         net.minecraft.client.render.BufferBuilder BufferBuilder = RenderSystem.renderThreadTesselator().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_COLOR);
         BufferBuilder.vertex(matrix4f, f7, f8, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f7, f8 + f10, 0.0F).color(il1iliilli1l1iill1.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f7 + f9, f8 + f10, 0.0F).color(il1iliilli1l1iill2.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f7 + f9, f8, 0.0F).color(il1iliilli1l1iill3.lllIlll1Ill111l111Il11II11lII());
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         II111l1llI1l1111IlIllI1l1Il1();
         MatrixStack.pop();
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ZenithInternal027 i1li1li11i11l1111
   ) {
      StringHolder_8(
         MatrixStack,
         f,
         f1,
         f2,
         f3,
         iil11iill1il1l1llilll1l1i1i1,
         i1li1li11i11l1111.IlIIII1l1IIIll11IIllI11ll(),
         i1li1li11i11l1111.l1l11lIIIllIll1(),
         i1li1li11i11l1111.ll1IIIIIIl11l(),
         i1li1li11i11l1111.IIIlIllI1l1Il111IIII()
      );
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ZenithInternal027 i1li1li11i11l1111
   ) {
      StringHolder_8(
         MatrixStack,
         f,
         f1,
         f2,
         f3,
         f4,
         iil11iill1il1l1llilll1l1i1i1,
         i1li1li11i11l1111.IlIIII1l1IIIll11IIllI11ll(),
         i1li1li11i11l1111.l1l11lIIIllIll1(),
         i1li1li11i11l1111.ll1IIIIIIl11l(),
         i1li1li11i11l1111.IIIlIllI1l1Il111IIII()
      );
   }

   public static void EventTarget(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      StringHolder_8(
         MatrixStack, f, f1, f2, f3, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill, il1iliilli1l1iill, il1iliilli1l1iill, il1iliilli1l1iill
      );
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill1,
      ByteBufferHolder il1iliilli1l1iill2,
      ByteBufferHolder il1iliilli1l1iill3
   ) {
      if (!StringHolder_8(
         MatrixStack,
         MatrixStack -> StringHolder_8(
               MatrixStackx, f, f1, f2, f3, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill, il1iliilli1l1iill1, il1iliilli1l1iill2, il1iliilli1l1iill3
            )
      )) {
         MatrixStack.push();
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         float f5 = 0.4F;
         float f6 = 0.4F;
         if ((double)f4 >= 0.15) {
            f5 = 0.6F;
            f6 = f5;
         }

         llIlllIII1I1Il1Il1I1II111.IlllIllllII();
         llIlllIII1I1Il1Il1I1II111.CloudFriendInfo("Size").set(f2, f3);
         llIlllIII1I1Il1Il1I1II111.CloudFriendInfo("Radius")
            .set(
               iil11iill1il1l1llilll1l1i1i1.I1lIIlI1I11I1ll1l11II1llI1lIl1(),
               iil11iill1il1l1llilll1l1i1i1.llll1I11IllIl1llII1IIlll1ll(),
               iil11iill1il1l1llilll1l1i1i1.Ill1I11IIIlII1(),
               iil11iill1il1l1llilll1l1i1i1.IIIll1I1lI1lllIIIIl1lI()
            );
         llIlllIII1I1Il1Il1I1II111.CloudFriendInfo("Smoothness").set(f5, f6);
         llIlllIII1I1Il1Il1I1II111.CloudFriendInfo("Thickness").set(f4);
         I1lIIl1lI1IlI11I1llIll11();
         float f7 = -f6 / 2.0F + f6 * 2.0F;
         float f8 = f6 / 2.0F + f6;
         float f9 = f - f7 / 2.0F;
         float f10 = f1 - f8 / 2.0F;
         float f11 = f2 + f7;
         float f12 = f3 + f8;
         net.minecraft.client.render.BufferBuilder BufferBuilder = RenderSystem.renderThreadTesselator().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_COLOR);
         BufferBuilder.vertex(matrix4f, f9, f10, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f9, f10 + f12, 0.0F).color(il1iliilli1l1iill1.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f9 + f11, f10 + f12, 0.0F).color(il1iliilli1l1iill2.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f9 + f11, f10, 0.0F).color(il1iliilli1l1iill3.lllIlll1Ill111l111Il11II11lII());
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         II111l1llI1l1111IlIllI1l1Il1();
         MatrixStack.pop();
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack, float f, float f1, float f2, float f3, float f4, float f5, float f6, ZenithInternal027 i1li1li11i11l1111
   ) {
      StringHolder_8(
         MatrixStack,
         f,
         f1,
         f2,
         f3,
         f4,
         f5,
         f6,
         i1li1li11i11l1111.IlIIII1l1IIIll11IIllI11ll(),
         i1li1li11i11l1111.l1l11lIIIllIll1(),
         i1li1li11i11l1111.ll1IIIIIIl11l(),
         i1li1li11i11l1111.IIIlIllI1l1Il111IIII()
      );
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack, float f, float f1, float f2, float f3, float f4, float f5, float f6, ByteBufferHolder il1iliilli1l1iill
   ) {
      StringHolder_8(MatrixStack, f, f1, f2, f3, f4, f5, f6, il1iliilli1l1iill, il1iliilli1l1iill, il1iliilli1l1iill, il1iliilli1l1iill);
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      float f5,
      float f6,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill1,
      ByteBufferHolder il1iliilli1l1iill2,
      ByteBufferHolder il1iliilli1l1iill3
   ) {
      if (!StringHolder_8(
         MatrixStack,
         MatrixStack -> StringHolder_8(MatrixStackx, f, f1, f2, f3, f4, f5, f6, il1iliilli1l1iill, il1iliilli1l1iill1, il1iliilli1l1iill2, il1iliilli1l1iill3)
      )) {
         MatrixStack.push();
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         float f7 = 0.4F;
         float f8 = 0.4F;
         float f9 = Math.max(0.0F, Math.min(360.0F, f5));
         float f10 = Math.max(0.0F, Math.min(1.0F, f6));
         lIlIl1lIIll1l.IlllIllllII();
         lIlIl1lIIll1l.CloudFriendInfo("Size").set(f2, f3);
         lIlIl1lIIll1l.CloudFriendInfo("Smoothness").set(f7, f8);
         lIlIl1lIIll1l.CloudFriendInfo("Thickness").set(f4);
         lIlIl1lIIll1l.CloudFriendInfo("ArcDegrees").set(f9);
         lIlIl1lIIll1l.CloudFriendInfo("CapRoundness").set(f10);
         I1lIIl1lI1IlI11I1llIll11();
         float f11 = -f8 / 2.0F + f8 * 2.0F;
         float f12 = f8 / 2.0F + f8;
         float f13 = f - f11 / 2.0F;
         float f14 = f1 - f12 / 2.0F;
         float f15 = f2 + f11;
         float f16 = f3 + f12;
         net.minecraft.client.render.BufferBuilder BufferBuilder = RenderSystem.renderThreadTesselator().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_COLOR);
         BufferBuilder.vertex(matrix4f, f13, f14, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f13, f14 + f16, 0.0F).color(il1iliilli1l1iill1.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f13 + f15, f14 + f16, 0.0F).color(il1iliilli1l1iill2.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f13 + f15, f14, 0.0F).color(il1iliilli1l1iill3.lllIlll1Ill111l111Il11II11lII());
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         II111l1llI1l1111IlIllI1l1Il1();
         MatrixStack.pop();
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      float f5,
      ByteBufferHolder il1iliilli1l1iill,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1
   ) {
      f -= 0.3F;
      f1 -= 0.3F;
      f2 += 0.6F;
      f3 += 0.6F;
      StringHolder_8(MatrixStack, f, f1, f5, f5, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill, 0.0F);
      StringHolder_8(MatrixStack, f + f2 - f5, f1, f5, f5, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill, 1.0F);
      StringHolder_8(MatrixStack, f, f1 + f3 - f5, f5, f5, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill, 2.0F);
      StringHolder_8(MatrixStack, f + f2 - f5, f1 + f3 - f5, f5, f5, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill, 3.0F);
   }

   public static void EventBus(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      float f5,
      ByteBufferHolder il1iliilli1l1iill,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1
   ) {
      if (Interface.ll11lIl1IlIl1lI1.I1Il1lIIlIll1I111IlII()) {
         f -= 0.3F;
         f1 -= 0.3F;
         f2 += 0.6F;
         f3 += 0.6F;
         StringHolder_8(MatrixStack, f, f1, f5, f5, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill, 0.0F);
         StringHolder_8(MatrixStack, f + f2 - f5, f1, f5, f5, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill, 1.0F);
         StringHolder_8(MatrixStack, f, f1 + f3 - f5, f5, f5, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill, 2.0F);
         StringHolder_8(MatrixStack, f + f2 - f5, f1 + f3 - f5, f5, f5, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill, 3.0F);
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill,
      float f5
   ) {
      if (!StringHolder_8(MatrixStack, MatrixStack -> StringHolder_8(MatrixStackx, f, f1, f2, f3, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill, f5))
         )
       {
         MatrixStack.push();
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         float f6 = 0.8F;
         float f7 = 1.0F;
         I1lII1I1Illl11Il1Il11lI1ll11ll.IlllIllllII();
         I1lII1I1Illl11Il1Il11lI1ll11ll.CloudFriendInfo("Size").set(f2, f3);
         I1lII1I1Illl11Il1Il11lI1ll11ll.CloudFriendInfo("Radius")
            .set(
               iil11iill1il1l1llilll1l1i1i1.I1lIIlI1I11I1ll1l11II1llI1lIl1(),
               iil11iill1il1l1llilll1l1i1i1.llll1I11IllIl1llII1IIlll1ll(),
               iil11iill1il1l1llilll1l1i1i1.Ill1I11IIIlII1(),
               iil11iill1il1l1llilll1l1i1i1.IIIll1I1lI1lllIIIIl1lI()
            );
         I1lII1I1Illl11Il1Il11lI1ll11ll.CloudFriendInfo("Smoothness").set(f6, f7);
         I1lII1I1Illl11Il1Il11lI1ll11ll.CloudFriendInfo("Thickness").set(f4);
         I1lII1I1Illl11Il1Il11lI1ll11ll.CloudFriendInfo("CornerIndex").set(f5);
         I1lIIl1lI1IlI11I1llIll11();
         float f8 = -f7 / 2.0F + f7 * 2.0F;
         float f9 = f7 / 2.0F + f7;
         float f10 = f - f8 / 2.0F;
         float f11 = f1 - f9 / 2.0F;
         float f12 = f2 + f8;
         float f13 = f3 + f9;
         net.minecraft.client.render.BufferBuilder BufferBuilder = RenderSystem.renderThreadTesselator().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_COLOR);
         BufferBuilder.vertex(matrix4f, f10, f11, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f10, f11 + f13, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f10 + f12, f11 + f13, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f10 + f12, f11, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         II111l1llI1l1111IlIllI1l1Il1();
         MatrixStack.pop();
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack, Identifier Identifier, float f, float f1, float f2, float f3, ByteBufferHolder il1iliilli1l1iill
   ) {
      if (!StringHolder_8(MatrixStack, MatrixStack -> StringHolder_8(MatrixStackx, Identifier, f, f1, f2, f3, il1iliilli1l1iill))) {
         MatrixStack.push();
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
         RenderSystem.setShaderTexture(0, Identifier);
         I1lIIl1lI1IlI11I1llIll11();
         net.minecraft.client.render.BufferBuilder BufferBuilder = RenderSystem.renderThreadTesselator().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
         BufferBuilder.vertex(matrix4f, f, f1, 0.0F).texture(0.0F, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f, f1 + f3, 0.0F).texture(0.0F, 1.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f + f2, f1 + f3, 0.0F).texture(1.0F, 1.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f + f2, f1, 0.0F).texture(1.0F, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         II111l1llI1l1111IlIllI1l1Il1();
         RenderSystem.setShaderTexture(0, 0);
         MatrixStack.pop();
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack, Identifier Identifier, float f, float f1, float f2, float f3, ZenithInternal027 i1li1li11i11l1111
   ) {
      if (!StringHolder_8(MatrixStack, MatrixStack -> StringHolder_8(MatrixStackx, Identifier, f, f1, f2, f3, i1li1li11i11l1111))) {
         MatrixStack.push();
         StringHolder_8(MatrixStack.peek().getPositionMatrix(), Identifier, f, f1, f2, f3, i1li1li11i11l1111);
         MatrixStack.pop();
      }
   }

   public static void StringHolder_8(Matrix4f matrix4f, Identifier Identifier, float f, float f1, float f2, float f3, ZenithInternal027 i1li1li11i11l1111) {
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      RenderSystem.setShaderTexture(0, Identifier);
      I1lIIl1lI1IlI11I1llIll11();
      net.minecraft.client.render.BufferBuilder BufferBuilder = RenderSystem.renderThreadTesselator().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
      BufferBuilder.vertex(matrix4f, f, f1, 0.0F)
         .texture(0.0F, 0.0F)
         .color(i1li1li11i11l1111.IlIIII1l1IIIll11IIllI11ll().lllIlll1Ill111l111Il11II11lII());
      BufferBuilder.vertex(matrix4f, f, f1 + f3, 0.0F)
         .texture(0.0F, 1.0F)
         .color(i1li1li11i11l1111.l1l11lIIIllIll1().lllIlll1Ill111l111Il11II11lII());
      BufferBuilder.vertex(matrix4f, f + f2, f1 + f3, 0.0F)
         .texture(1.0F, 1.0F)
         .color(i1li1li11i11l1111.ll1IIIIIIl11l().lllIlll1Ill111l111Il11II11lII());
      BufferBuilder.vertex(matrix4f, f + f2, f1, 0.0F)
         .texture(1.0F, 0.0F)
         .color(i1li1li11i11l1111.IIIlIllI1l1Il111IIII().lllIlll1Ill111l111Il11II11lII());
      net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
      II111l1llI1l1111IlIllI1l1Il1();
      RenderSystem.setShaderTexture(0, 0);
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      Identifier Identifier,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      float f5,
      float f6,
      float f7,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      if (!StringHolder_8(MatrixStack, MatrixStack -> StringHolder_8(MatrixStackx, Identifier, f, f1, f2, f3, f4, f5, f6, f7, il1iliilli1l1iill))) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         MatrixStack.push();
         int i = il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII();
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         float f8 = f + f2;
         float f9 = f1 + f3;
         RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
         RenderSystem.setShaderTexture(0, Identifier);
         net.minecraft.client.render.BufferBuilder BufferBuilder = RenderSystem.renderThreadTesselator().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
         BufferBuilder.vertex(matrix4f, f, f1, 0.0F).texture(f4, f6).color(i);
         BufferBuilder.vertex(matrix4f, f, f9, 0.0F).texture(f4, f7).color(i);
         BufferBuilder.vertex(matrix4f, f8, f9, 0.0F).texture(f5, f7).color(i);
         BufferBuilder.vertex(matrix4f, f8, f1, 0.0F).texture(f5, f6).color(i);
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         II111l1llI1l1111IlIllI1l1Il1();
         RenderSystem.setShaderTexture(0, 0);
         MatrixStack.pop();
         RenderSystem.disableBlend();
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      IdentifierHolder_2 ll1111lliii1iiilll111ii1i11,
      float f,
      float f1,
      float f2,
      float f3,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      StringHolder_8(MatrixStack, ll1111lliii1iiilll111ii1i11.II11IIlIl1ll11IIIIl1I1lIlI(), f, f1, f2, f3, 0.0F, 1.0F, 0.0F, 1.0F, il1iliilli1l1iill);
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack, VertexConsumerProvider VertexConsumerProvider, float f, float f1, float f2, float f3, ByteBufferHolder il1iliilli1l1iill
   ) {
      if (!ListHolder_4.StringHolder_8(MatrixStack.peek().getPositionMatrix(), f, f1, f2, f3, il1iliilli1l1iill)) {
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         VertexConsumer VertexConsumer = VertexConsumerProvider.getBuffer(RenderLayer.getGui());
         int i = il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII();
         VertexConsumer.vertex(matrix4f, f, f1 + f3, 0.0F).color(i);
         VertexConsumer.vertex(matrix4f, f + f2, f1 + f3, 0.0F).color(i);
         VertexConsumer.vertex(matrix4f, f + f2, f1, 0.0F).color(i);
         VertexConsumer.vertex(matrix4f, f, f1, 0.0F).color(i);
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack, VertexConsumerProvider VertexConsumerProvider, Identifier Identifier, float f, float f1, float f2, float f3, ByteBufferHolder il1iliilli1l1iill
   ) {
      if (!StringHolder_8(MatrixStack, MatrixStack -> StringHolder_8(MatrixStackx, VertexConsumerProvider, Identifier, f, f1, f2, f3, il1iliilli1l1iill))) {
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         VertexConsumer VertexConsumer = VertexConsumerProvider.getBuffer(RenderLayer.getGuiTextured(Identifier));
         int i = il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII();
         VertexConsumer.vertex(matrix4f, f, f1, 0.0F).texture(0.0F, 0.0F).color(i);
         VertexConsumer.vertex(matrix4f, f, f1 + f3, 0.0F).texture(0.0F, 1.0F).color(i);
         VertexConsumer.vertex(matrix4f, f + f2, f1 + f3, 0.0F).texture(1.0F, 1.0F).color(i);
         VertexConsumer.vertex(matrix4f, f + f2, f1, 0.0F).texture(1.0F, 0.0F).color(i);
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack, VertexConsumerProvider VertexConsumerProvider, Identifier Identifier, float f, float f1, float f2, float f3, ZenithInternal027 i1li1li11i11l1111
   ) {
      if (!StringHolder_8(MatrixStack, MatrixStack -> StringHolder_8(MatrixStackx, VertexConsumerProvider, Identifier, f, f1, f2, f3, i1li1li11i11l1111))) {
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         VertexConsumer VertexConsumer = VertexConsumerProvider.getBuffer(RenderLayer.getGuiTextured(Identifier));
         VertexConsumer.vertex(matrix4f, f, f1, 0.0F)
            .texture(0.0F, 0.0F)
            .color(i1li1li11i11l1111.IlIIII1l1IIIll11IIllI11ll().lllIlll1Ill111l111Il11II11lII());
         VertexConsumer.vertex(matrix4f, f, f1 + f3, 0.0F)
            .texture(0.0F, 1.0F)
            .color(i1li1li11i11l1111.l1l11lIIIllIll1().lllIlll1Ill111l111Il11II11lII());
         VertexConsumer.vertex(matrix4f, f + f2, f1 + f3, 0.0F)
            .texture(1.0F, 1.0F)
            .color(i1li1li11i11l1111.ll1IIIIIIl11l().lllIlll1Ill111l111Il11II11lII());
         VertexConsumer.vertex(matrix4f, f + f2, f1, 0.0F)
            .texture(1.0F, 0.0F)
            .color(i1li1li11i11l1111.IIIlIllI1l1Il111IIII().lllIlll1Ill111l111Il11II11lII());
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      VertexConsumerProvider VertexConsumerProvider,
      Identifier Identifier,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      float f5,
      float f6,
      float f7,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      if (!StringHolder_8(
         MatrixStack, MatrixStack -> StringHolder_8(MatrixStackx, VertexConsumerProvider, Identifier, f, f1, f2, f3, f4, f5, f6, f7, il1iliilli1l1iill)
      )) {
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         float f8 = f + f2;
         float f9 = f1 + f3;
         int i = il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII();
         VertexConsumer VertexConsumer = VertexConsumerProvider.getBuffer(RenderLayer.getGuiTextured(Identifier));
         VertexConsumer.vertex(matrix4f, f, f1, 0.0F).texture(f4, f6).color(i);
         VertexConsumer.vertex(matrix4f, f, f9, 0.0F).texture(f4, f7).color(i);
         VertexConsumer.vertex(matrix4f, f8, f9, 0.0F).texture(f5, f7).color(i);
         VertexConsumer.vertex(matrix4f, f8, f1, 0.0F).texture(f5, f6).color(i);
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      VertexConsumerProvider VertexConsumerProvider,
      IdentifierHolder_2 ll1111lliii1iiilll111ii1i11,
      float f,
      float f1,
      float f2,
      float f3,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      StringHolder_8(
         MatrixStack, VertexConsumerProvider, ll1111lliii1iiilll111ii1i11.II11IIlIl1ll11IIIIl1I1lIlI(), f, f1, f2, f3, 0.0F, 1.0F, 0.0F, 1.0F, il1iliilli1l1iill
      );
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      VertexConsumerProvider VertexConsumerProvider,
      float f,
      float f1,
      float f2,
      float f3,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      StringHolder_8(MatrixStack, f, f1, f2, f3, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      VertexConsumerProvider VertexConsumerProvider,
      float f,
      float f1,
      float f2,
      float f3,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ZenithInternal027 i1li1li11i11l1111
   ) {
      StringHolder_8(MatrixStack, f, f1, f2, f3, iil11iill1il1l1llilll1l1i1i1, i1li1li11i11l1111);
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      VertexConsumerProvider VertexConsumerProvider,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ZenithInternal027 i1li1li11i11l1111
   ) {
      StringHolder_8(MatrixStack, f, f1, f2, f3, f4, iil11iill1il1l1llilll1l1i1i1, i1li1li11i11l1111);
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      VertexConsumerProvider VertexConsumerProvider,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      EventTarget(MatrixStack, f, f1, f2, f3, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
   }

   public static void EventBus(
      MatrixStack MatrixStack,
      VertexConsumerProvider VertexConsumerProvider,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      StringHolder_8(MatrixStack, f, f1, f2, f3, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack, Identifier Identifier, float f, float f1, float f2, float f3, floatHolder_5 iil11iill1il1l1llilll1l1i1i1
   ) {
      StringHolder_8(MatrixStack, Identifier, f, f1, f2, f3, iil11iill1il1l1llilll1l1i1i1, ByteBufferHolder.ll1lIllll111I1lIIl1lIl);
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      Identifier Identifier,
      float f,
      float f1,
      float f2,
      float f3,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill1,
      ByteBufferHolder il1iliilli1l1iill2,
      ByteBufferHolder il1iliilli1l1iill3
   ) {
      if (!StringHolder_8(
         MatrixStack,
         MatrixStack -> StringHolder_8(
               MatrixStackx,
               Identifier,
               f,
               f1,
               f2,
               f3,
               iil11iill1il1l1llilll1l1i1i1,
               il1iliilli1l1iill,
               il1iliilli1l1iill1,
               il1iliilli1l1iill2,
               il1iliilli1l1iill3
            )
      )) {
         MatrixStack.push();
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         float f4 = 0.8F;
         I1Il1l1IlllII1llI11I1II1.IlllIllllII();
         RenderSystem.setShaderTexture(0, Identifier);
         I1Il1l1IlllII1llI11I1II1.CloudFriendInfo("Size").set(f2, f3);
         I1Il1l1IlllII1llI11I1II1.CloudFriendInfo("Radius")
            .set(
               iil11iill1il1l1llilll1l1i1i1.I1lIIlI1I11I1ll1l11II1llI1lIl1() * 2.0F,
               iil11iill1il1l1llilll1l1i1i1.llll1I11IllIl1llII1IIlll1ll() * 2.0F,
               iil11iill1il1l1llilll1l1i1i1.Ill1I11IIIlII1() * 2.0F,
               iil11iill1il1l1llilll1l1i1i1.IIIll1I1lI1lllIIIIl1lI() * 2.0F
            );
         I1Il1l1IlllII1llI11I1II1.CloudFriendInfo("Smoothness").set(f4);
         I1lIIl1lI1IlI11I1llIll11();
         float f5 = -f4 / 2.0F + f4 * 2.0F;
         float f6 = f4 / 2.0F + f4;
         float f7 = f - f5 / 2.0F;
         float f8 = f1 - f6 / 2.0F;
         float f9 = f2 + f5;
         float f10 = f3 + f6;
         net.minecraft.client.render.BufferBuilder BufferBuilder = RenderSystem.renderThreadTesselator().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
         BufferBuilder.vertex(matrix4f, f7, f8, 0.0F).texture(0.0F, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f7, f8 + f10, 0.0F).texture(0.0F, 1.0F).color(il1iliilli1l1iill1.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f7 + f9, f8 + f10, 0.0F).texture(1.0F, 1.0F).color(il1iliilli1l1iill2.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f7 + f9, f8, 0.0F).texture(1.0F, 0.0F).color(il1iliilli1l1iill3.lllIlll1Ill111l111Il11II11lII());
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         II111l1llI1l1111IlIllI1l1Il1();
         RenderSystem.setShaderTexture(0, 0);
         MatrixStack.pop();
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      Identifier Identifier,
      float f,
      float f1,
      float f2,
      float f3,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      StringHolder_8(
         MatrixStack, Identifier, f, f1, f2, f3, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill, il1iliilli1l1iill, il1iliilli1l1iill, il1iliilli1l1iill
      );
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      Identifier Identifier,
      float f,
      float f1,
      float f2,
      float f3,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ZenithInternal027 i1li1li11i11l1111
   ) {
      StringHolder_8(
         MatrixStack,
         Identifier,
         f,
         f1,
         f2,
         f3,
         iil11iill1il1l1llilll1l1i1i1,
         i1li1li11i11l1111.IlIIII1l1IIIll11IIllI11ll(),
         i1li1li11i11l1111.l1l11lIIIllIll1(),
         i1li1li11i11l1111.ll1IIIIIIl11l(),
         i1li1li11i11l1111.IIIlIllI1l1Il111IIII()
      );
   }

   public static void ZenithInternal095(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      if (!EventBus(MatrixStack, MatrixStack -> ZenithInternal095(MatrixStackx, f, f1, f2, f3, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill))) {
         MatrixStack.push();
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         l1l111I11II1II.IlllIllllII();
         l1l111I11II1II.CloudFriendInfo("Size").set(f2, f3);
         l1l111I11II1II.CloudFriendInfo("Radius")
            .set(
               iil11iill1il1l1llilll1l1i1i1.I1lIIlI1I11I1ll1l11II1llI1lIl1() * 3.0F,
               iil11iill1il1l1llilll1l1i1i1.llll1I11IllIl1llII1IIlll1ll() * 3.0F,
               iil11iill1il1l1llilll1l1i1i1.Ill1I11IIIlII1() * 3.0F,
               iil11iill1il1l1llilll1l1i1i1.IIIll1I1lI1lllIIIIl1lI() * 3.0F
            );
         l1l111I11II1II.CloudFriendInfo("Smoothness").set(f4);
         I1lIIl1lI1IlI11I1llIll11();
         float f5 = -f4 / 2.0F + f4 * 2.0F;
         float f6 = f4 / 2.0F + f4;
         float f7 = f - f5 / 2.0F;
         float f8 = f1 - f6 / 2.0F;
         float f9 = f2 + f5;
         float f10 = f3 + f6;
         net.minecraft.client.render.BufferBuilder BufferBuilder = RenderSystem.renderThreadTesselator().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_COLOR);
         BufferBuilder.vertex(matrix4f, f7, f8, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f7, f8 + f10, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f7 + f9, f8 + f10, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f7 + f9, f8, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         II111l1llI1l1111IlIllI1l1Il1();
         MatrixStack.pop();
      }
   }

   public static void Event(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      StringHolder_8(
         MatrixStack,
         f,
         f1,
         f2,
         f3,
         f4,
         iil11iill1il1l1llilll1l1i1i1,
         il1iliilli1l1iill,
         (Interface.ll11lIl1IlIl1lI1.lI11l1I1l11() || Interface.ll11lIl1IlIl1lI1.lII1ll11II1ll1I1l111Il1lI()) && IIIl1ll1l1Il1II11Ill1Il1l1I,
         Interface.ll11lIl1IlIl1lI1.Il11II1l1111lIIlllI1I1llII()
      );
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill,
      boolean flag,
      boolean flag1
   ) {
      Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
      if (!ListHolder_4.StringHolder_8(matrix4f, f, f1, f2, f3, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill, flag, flag1)) {
         if (flag1 && Interface.ll11lIl1IlIl1lI1.l1I11llIIl111llI1IIIll11lI11I()) {
            StringHolder_8(
               matrix4f,
               f,
               f1,
               f2,
               f3,
               Interface.ll11lIl1IlIl1lI1.l1IIl1llllIII(),
               floatHolder_5.StringHolder_30(Interface.lIl111ll1l111lIIlIlI1I1())
            );
         }

         if (flag) {
            StringHolder_8(
               matrix4f, f, f1, f2, f3, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill, Interface.ll11lIl1IlIl1lI1.lII1ll11II1ll1I1l111Il1lI()
            );
         }

         if (flag1 && !Interface.ll11lIl1IlIl1lI1.l1I11llIIl111llI1IIIll11lI11I()) {
            StringHolder_8(
               matrix4f,
               f,
               f1,
               f2,
               f3,
               Interface.ll11lIl1IlIl1lI1.l1IIl1llllIII(),
               floatHolder_5.StringHolder_30(Interface.lIl111ll1l111lIIlIlI1I1())
            );
         }
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack, float f, float f1, float f2, float f3, int i, floatHolder_5 iil11iill1il1l1llilll1l1i1i1
   ) {
      HashMapHolder.StringHolder_8(
         MatrixStack,
         f,
         f1,
         f2,
         f3,
         i,
         iil11iill1il1l1llilll1l1i1i1,
         ZenithClient.getInstance().floatHolder_3().getGlowColor()
      );
   }

   public static void StringHolder_8(
      Matrix4f matrix4f, float f, float f1, float f2, float f3, int i, floatHolder_5 iil11iill1il1l1llilll1l1i1i1
   ) {
      HashMapHolder.StringHolder_8(
         matrix4f,
         f,
         f1,
         f2,
         f3,
         i,
         iil11iill1il1l1llilll1l1i1i1,
         ZenithClient.getInstance().floatHolder_3().getGlowColor()
      );
   }

   public static void StringHolder_8(
      Matrix4f matrix4f,
      float f,
      float f1,
      float f2,
      float f3,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill,
      boolean flag
   ) {
      if (ZenithClient.getInstance().ZenithInternal141().getBlurPower() != 0.0F) {
         if (flag) {
            StringHolder_8(matrix4f, f, f1, f2, f3, 10.0F, 0.08F, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
         } else {
            ZenithClient.getInstance()
               .GetDisplayNameHandler()
               .StringHolder_8(matrix4f, f, f1, f2, f3, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
         }
      }
   }

   public static void EventImpl_24(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
      ZenithClient.getInstance()
         .GetDisplayNameHandler()
         .EventBus(matrix4f, f, f1, f2, f3, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
   }

   public static void ZenithInternal028(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
      ZenithClient.getInstance()
         .GetDisplayNameHandler()
         .StringHolder_8(matrix4f, f, f1, f2, f3, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack, net.minecraft.client.render.BufferBuilder BufferBuilder, double d0, double d1, double d2, double d3, double d4, ByteBufferHolder il1iliilli1l1iill
   ) {
      Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
      BufferBuilder.vertex(matrix4f, (float)d0, (float)(d1 + d4), (float)d2)
         .texture(0.0F, 1.0F)
         .color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
      BufferBuilder.vertex(matrix4f, (float)(d0 + d3), (float)(d1 + d4), (float)d2)
         .texture(1.0F, 1.0F)
         .color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
      BufferBuilder.vertex(matrix4f, (float)(d0 + d3), (float)d1, (float)d2)
         .texture(1.0F, 0.0F)
         .color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
      BufferBuilder.vertex(matrix4f, (float)d0, (float)d1, (float)d2)
         .texture(0.0F, 0.0F)
         .color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack, Identifier Identifier, double d0, double d1, double d2, double d3, double d4, ByteBufferHolder il1iliilli1l1iill
   ) {
      if (!StringHolder_8(MatrixStack, MatrixStack -> StringHolder_8(MatrixStackx, Identifier, d0, d1, d2, d3, d4, il1iliilli1l1iill))) {
         RenderSystem.setShaderTexture(0, Identifier);
         net.minecraft.client.render.BufferBuilder BufferBuilder = RenderSystem.renderThreadTesselator().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         BufferBuilder.vertex(matrix4f, (float)d0, (float)(d1 + d4), (float)d2)
            .texture(0.0F, 1.0F)
            .color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, (float)(d0 + d3), (float)(d1 + d4), (float)d2)
            .texture(1.0F, 1.0F)
            .color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, (float)(d0 + d3), (float)d1, (float)d2)
            .texture(1.0F, 0.0F)
            .color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, (float)d0, (float)d1, (float)d2)
            .texture(0.0F, 0.0F)
            .color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      Identifier Identifier,
      float f,
      float f1,
      float f2,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      StringHolder_8(MatrixStack, Identifier, f, f1, f2, f2, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill, 0.125F, 0.125F, 0.25F, 0.25F);
   }

   public static void EventBus(
      MatrixStack MatrixStack,
      Identifier Identifier,
      float f,
      float f1,
      float f2,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      if (Identifier == DefaultSkinHelper.getSteve().texture()) {
         StringHolder_8(MatrixStack, Identifier, f, f1, f2, f2, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill, 0.125F, 0.125F, 0.25F, 0.25F);
      } else {
         StringHolder_8(MatrixStack, Identifier, f, f1, f2, f2, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill, 0.0F, 0.0F, 1.0F, 1.0F);
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      Identifier Identifier,
      float f,
      float f1,
      float f2,
      float f3,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill,
      float f4,
      float f5,
      float f6,
      float f7
   ) {
      if (!StringHolder_8(
         MatrixStack, MatrixStack -> StringHolder_8(MatrixStackx, Identifier, f, f1, f2, f3, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill, f4, f5, f6, f7)
      )) {
         MatrixStack.push();
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         float f8 = 0.8F;
         I1Il1l1IlllII1llI11I1II1.IlllIllllII();
         RenderSystem.setShaderTexture(0, Identifier);
         I1Il1l1IlllII1llI11I1II1.CloudFriendInfo("Size").set(f2, f3);
         I1Il1l1IlllII1llI11I1II1.CloudFriendInfo("Radius")
            .set(
               iil11iill1il1l1llilll1l1i1i1.I1lIIlI1I11I1ll1l11II1llI1lIl1(),
               iil11iill1il1l1llilll1l1i1i1.llll1I11IllIl1llII1IIlll1ll(),
               iil11iill1il1l1llilll1l1i1i1.Ill1I11IIIlII1(),
               iil11iill1il1l1llilll1l1i1i1.IIIll1I1lI1lllIIIIl1lI()
            );
         I1Il1l1IlllII1llI11I1II1.CloudFriendInfo("Smoothness").set(f8);
         I1lIIl1lI1IlI11I1llIll11();
         float f9 = -f8 / 2.0F + f8 * 2.0F;
         float f10 = f8 / 2.0F + f8;
         float f11 = f - f9 / 2.0F;
         float f12 = f1 - f10 / 2.0F;
         float f13 = f2 + f9;
         float f14 = f3 + f10;
         net.minecraft.client.render.BufferBuilder BufferBuilder = RenderSystem.renderThreadTesselator().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
         BufferBuilder.vertex(matrix4f, f11, f12, 0.0F).texture(f4, f5).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f11, f12 + f14, 0.0F).texture(f4, f7).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f11 + f13, f12 + f14, 0.0F).texture(f6, f7).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         BufferBuilder.vertex(matrix4f, f11 + f13, f12, 0.0F).texture(f6, f5).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         II111l1llI1l1111IlIllI1l1Il1();
         RenderSystem.setShaderTexture(0, 0);
         MatrixStack.pop();
      }
   }

   public static void I1lIIl1lI1IlI11I1llIll11() {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
   }

   public static void II111l1llI1l1111IlIllI1l1Il1() {
      RenderSystem.disableBlend();
   }

   private floatHolder_8() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
