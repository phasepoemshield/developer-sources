package zenith;

import com.mojang.blaze3d.platform.GlStateManager.AdvancementTabType4;
import com.mojang.blaze3d.platform.GlStateManager.AdvancementTabType5;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.util.Identifier;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.client.render.VertexFormat.LootPool96;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public class MinecraftClientHolder_4 {
   private static final net.minecraft.client.MinecraftClient lll11lIll1I1I = net.minecraft.client.MinecraftClient.getInstance();
   private static double lll1l1l1lI1II1l1l1;
   private static double I1lIIIlI1l1l1l1Il1;
   private static double lIlII1IIIII11Il1Il1111III;
   private static final Quaternionf Il1II1lI11lIl1lI1lllIIl1 = new Quaternionf();
   private static final Quaternionf IlII1l1I11l1II11l1Il11 = new Quaternionf();
   private static final MatrixStack l1IIIl1I1I1lI111lI = new MatrixStack();
   private static final Map<String, List<IGetSize>> IlIIl11l11111Ill11l = new HashMap<>();

   public static void StringHolder_8(Camera Camera) {
      net.minecraft.util.math.Vec3d Vec3d = Camera.getPos();
      lll1l1l1lI1II1l1l1 = Vec3d.x;
      I1lIIIlI1l1l1l1Il1 = Vec3d.y;
      lIlII1IIIII11Il1Il1111III = Vec3d.z;
      float f = Camera.getPitch();
      float f1 = Camera.getYaw();
      Il1II1lI11lIl1lI1lllIIl1.identity();
      Il1II1lI11lIl1lI1lllIIl1.rotateX((float)Math.toRadians((double)f));
      Il1II1lI11lIl1lI1lllIIl1.rotateY((float)Math.toRadians((double)(f1 + 180.0F)));
      IlII1l1I11l1II11l1Il11.identity();
      IlII1l1I11l1II11l1Il11.rotateY((float)Math.toRadians((double)(-f1)));
      IlII1l1I11l1II11l1Il11.rotateX((float)Math.toRadians((double)f));
   }

   @SafeVarargs
   public static void StringHolder_8(MatrixStack MatrixStack, float f, List<? extends IGetSize>... alist) {
      IlIIl11l11111Ill11l.clear();
      int i = 0;

      for (List list : alist) {
         if (list != null) {
            for (IGetSize i1lil1l1lllilll1lili1l1lil1i1 : list) {
               if (!i1lil1l1lllilll1lili1l1lil1i1.ll1IlIIll11II11II1111()) {
                  IlIIl11l11111Ill11l.computeIfAbsent(i1lil1l1lllilll1lili1l1lil1i1.Il1111l11l11I11lIIl1I11(), s -> new ArrayList<>())
                     .add(i1lil1l1lllilll1lili1l1lil1i1);
                  i++;
               }
            }
         }
      }

      if (i != 0) {
         lII111IlII1I11llIl1();
         net.minecraft.client.render.Tessellator Tessellator = net.minecraft.client.render.Tessellator.getInstance();

         for (Entry entry : IlIIl11l11111Ill11l.entrySet()) {
            Identifier Identifier = ZenithInternal063.ZenithInternal124((String)entry.getKey());
            if (Identifier != null) {
               RenderSystem.setShaderTexture(0, Identifier);
               List list1 = (List)entry.getValue();
               net.minecraft.client.render.BufferBuilder BufferBuilder = Tessellator.begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
               boolean flag = false;

               for (IGetSize i1lil1l1lllilll1lili1l1lil1i11 : list1) {
                  if (i1lil1l1lllilll1lili1l1lil1i11.GetPayloadLengthHandler(f) >= 0.001F) {
                     StringHolder_8(BufferBuilder, i1lil1l1lllilll1lili1l1lil1i11, f);
                     flag = true;
                  }
               }

               if (flag) {
                  net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
               }

               list1.clear();
            }
         }

         IlIIl11l11111Ill11l.clear();
         lII111I1lIlIIIl();
      }
   }

   public static void StringHolder_8(MatrixStack MatrixStack, List<SetColorHandler> list, float f, float f1) {
      if (!list.isEmpty()) {
         lII111IlII1I11llIl1();
         RenderSystem.setShaderTexture(0, StringHolder$Helper_4.III11II1I1II11lIlI1lIl111I1IIl.ll1IllI1lI1l().get());
         net.minecraft.client.render.Tessellator Tessellator = net.minecraft.client.render.Tessellator.getInstance();
         net.minecraft.client.render.BufferBuilder BufferBuilder = Tessellator.begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
         float f2 = f1 + 2.5F;
         boolean flag = false;

         for (SetColorHandler iliili1lliii1i1il1iilil1lil1li : list) {
            net.minecraft.util.math.Vec3d Vec3dxxx = iliili1lliii1i1il1iilil1lil1li.l11l1I1II11I1I1ll1l111II11I()
               .lerp(iliili1lliii1i1il1iilil1lil1li.Cameratweaks(), (double)f);
            net.minecraft.util.math.Vec3d Vec3dx = iliili1lliii1i1il1iilil1lil1li.I1IIIlI11Il1();
            double d0 = Vec3dx.length();
            float f3 = 1.0F - (float)iliili1lliii1i1il1iilil1lil1li.I1l11I1lllI1I1l1I1Ill1I1Il() / (float)iliili1lliii1i1il1iilil1lil1li.IllllllIl1Il();
            float f4 = Math.min(f3 / 0.15F, 1.0F);
            float f5 = f3 > 0.8F ? 1.0F - (f3 - 0.8F) / 0.2F : 1.0F;
            float f6 = f4 * f5;
            net.minecraft.util.math.Vec3d Vec3dxx = d0 > 0.001 ? Vec3dx.normalize() : new net.minecraft.util.math.Vec3d(0.0, 1.0, 0.0);
            float f7 = (float)Math.min(d0 / 0.2, 1.0);
            float f8 = Math.max(f7 * f6, 0.1F);
            byte b0 = 80;

            for (int i = 0; i < b0; i++) {
               float f9 = (float)i / (float)b0;
               if (!(f9 >= f8)) {
                  float f10 = f9 / f8;
                  float f11 = iliili1lliii1i1il1iilil1lil1li.getSize() * (1.0F - f10 * 0.5F) * 2.0F * f6;
                  float f12 = (float)Math.pow((double)(1.0F - f10), 0.4) * iliili1lliii1i1il1iilil1lil1li.GetPayloadLengthHandler(f) * f6 * 0.8F;
                  if (!(f12 < 0.01F)) {
                     net.minecraft.util.math.Vec3d Vec3dxxx = Vec3dxxx.subtract(Vec3dxx.multiply((double)(f10 * f8 * f2)));
                     float f13 = (float)Math.pow((double)(1.0F - f10), 1.2) * f6;
                     float f14 = f11 * (1.8F + f13 * 0.8F);
                     float f15 = f12 * 0.5F * f13;
                     if (f15 > 0.01F) {
                        StringHolder_8(BufferBuilder, Vec3dxxx, f14, f15, iliili1lliii1i1il1iilil1lil1li.l1IllIl1l1llIlI11I11Il1l1l1lI1());
                        flag = true;
                     }

                     StringHolder_8(BufferBuilder, Vec3dxxx, f11, f12, iliili1lliii1i1il1iilil1lil1li.l1IllIl1l1llIlI11I11Il1l1l1lI1());
                     flag = true;
                  }
               }
            }
         }

         if (flag) {
            net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         }

         lII111I1lIlIIIl();
      }
   }

   public static void EventBus(MatrixStack MatrixStack, List<StringHolder_7> list, float f, float f1) {
      if (!list.isEmpty()) {
         lII111IlII1I11llIl1();
         net.minecraft.client.render.Tessellator Tessellator = net.minecraft.client.render.Tessellator.getInstance();
         RenderSystem.setShaderTexture(0, StringHolder$Helper_4.lll1IllI1Il1lI1IIIIl1.ll1IllI1lI1l().get());
         net.minecraft.client.render.BufferBuilder BufferBuilderx = Tessellator.begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);

         for (StringHolder_7 i1lil1lliilli1lli1l : list) {
            if (!i1lil1lliilli1lli1l.ll1IlIIll11II11II1111()) {
               net.minecraft.util.math.Vec3d Vec3dxxxx = i1lil1lliilli1lli1l.l11l1I1II11I1I1ll1l111II11I()
                  .lerp(i1lil1lliilli1lli1l.Cameratweaks(), (double)f);
               float f2 = i1lil1lliilli1lli1l.GetPayloadLengthHandler(f);
               if (!(f2 < 0.005F)) {
                  StringHolder_8(
                     BufferBuilderx,
                     Vec3dxxxx,
                     i1lil1lliilli1lli1l.ZenithInternal033(f),
                     f2 * 0.22F,
                     i1lil1lliilli1lli1l.l1IllIl1l1llIlI11I11Il1l1l1lI1(),
                     0.0F
                  );
                  StringHolder_8(
                     BufferBuilderx,
                     Vec3dxxxx,
                     i1lil1lliilli1lli1l.WritingThread(f),
                     f2 * 0.48F,
                     i1lil1lliilli1lli1l.l1IllIl1l1llIlI11I11Il1l1l1lI1(),
                     0.0F
                  );
                  net.minecraft.util.math.Vec3d Vec3dx = i1lil1lliilli1lli1l.I1IIIlI11Il1();
                  double d0 = Vec3dx.length();
                  if (!(d0 <= 5.0E-4)) {
                     net.minecraft.util.math.Vec3d Vec3dxx = Vec3dx.normalize();
                     float f3 = i1lil1lliilli1lli1l.ZenithClient(f1);
                     byte b0 = 16;

                     for (int i = 1; i <= b0; i++) {
                        float f4 = (float)i / (float)b0;
                        float f5 = f2 * (float)Math.pow((double)(1.0F - f4), 1.45F) * 0.42F;
                        if (!(f5 < 0.01F)) {
                           net.minecraft.util.math.Vec3d Vec3dxxx = Vec3dxxxx.subtract(Vec3dxx.multiply((double)(f4 * f3)));
                           float f6 = i1lil1lliilli1lli1l.WritingThread(f) * (1.0F - f4 * 0.72F);
                           StringHolder_8(BufferBuilderx, Vec3dxxx, f6, f5, i1lil1lliilli1lli1l.l1IllIl1l1llIlI11I11Il1l1l1lI1(), 0.0F);
                        }
                     }
                  }
               }
            }
         }

         HashMapHolder.StringHolder_8(BufferBuilderx);
         RenderSystem.setShaderTexture(0, StringHolder$Helper_4.l1ll111lIlII.ll1IllI1lI1l().get());
         net.minecraft.client.render.BufferBuilder BufferBuilderx = Tessellator.begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);

         for (StringHolder_7 i1lil1lliilli1lli1l1 : list) {
            if (!i1lil1lliilli1lli1l1.ll1IlIIll11II11II1111()) {
               net.minecraft.util.math.Vec3d Vec3d = i1lil1lliilli1lli1l1.l11l1I1II11I1I1ll1l111II11I()
                  .lerp(i1lil1lliilli1lli1l1.Cameratweaks(), (double)f);
               float f7 = i1lil1lliilli1lli1l1.GetPayloadLengthHandler(f);
               if (!(f7 < 0.005F)) {
                  StringHolder_8(
                     BufferBuilderx,
                     Vec3d,
                     i1lil1lliilli1lli1l1.ThreadImpl(f),
                     f7,
                     i1lil1lliilli1lli1l1.l1IllIl1l1llIlI11I11Il1l1l1lI1().StringHolder_24(0.35F),
                     i1lil1lliilli1lli1l1.I1l1l1I1I11llII11l()
                  );
               }
            }
         }

         HashMapHolder.StringHolder_8(BufferBuilderx);
         lII111I1lIlIIIl();
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Vec3d Vec3d,
      float f,
      float f1,
      ByteBufferHolder il1iliilli1l1iill,
      float f5
   ) {
      lII111IlII1I11llIl1();
      RenderSystem.setShaderTexture(0, StringHolder$Helper_4.III11II1I1II11lIlI1lIl111I1IIl.ll1IllI1lI1l().get());
      net.minecraft.client.render.Tessellator Tessellator = net.minecraft.client.render.Tessellator.getInstance();
      net.minecraft.client.render.BufferBuilder BufferBuilder = Tessellator.begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
      double d0 = Vec3dxx.length();
      net.minecraft.util.math.Vec3d Vec3dx = d0 > 0.001 ? Vec3dxx.normalize() : new net.minecraft.util.math.Vec3d(0.0, 0.0, -1.0);
      byte b0 = 60;
      boolean flag = false;

      for (int i = 0; i < b0; i++) {
         float f2 = (float)i / (float)b0;
         float f3 = f1 * (1.0F - f2 * 0.7F) * 2.0F;
         float f4 = (float)Math.pow((double)(1.0F - f2), 0.5) * 0.9F;
         if (!(f4 < 0.01F) && !(f3 < 0.01F)) {
            net.minecraft.util.math.Vec3d Vec3dxx = Vec3dxxx.subtract(Vec3dx.multiply((double)(f2 * f)));
            StringHolder_8(BufferBuilder, Vec3dxx, f3 * 1.8F, f4 * 0.4F, il1iliilli1l1iill);
            StringHolder_8(BufferBuilder, Vec3dxx, f3, f4, il1iliilli1l1iill);
            flag = true;
         }
      }

      if (flag) {
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
      }

      lII111I1lIlIIIl();
   }

   private static void StringHolder_8(net.minecraft.client.render.BufferBuilder BufferBuilder, IGetSize i1lil1l1lllilll1lili1l1lil1i1, float f) {
      net.minecraft.util.math.Vec3d Vec3d = i1lil1l1lllilll1lili1l1lil1i1.l11l1I1II11I1I1ll1l111II11I()
         .lerp(i1lil1l1lllilll1lili1l1lil1i1.Cameratweaks(), (double)f);
      float f1 = (float)(Vec3d.x - lll1l1l1lI1II1l1l1);
      float f2 = (float)(Vec3d.y - I1lIIIlI1l1l1l1Il1);
      float f3 = (float)(Vec3d.z - lIlII1IIIII11Il1Il1111III);
      float f4 = i1lil1l1lllilll1lili1l1lil1i1.GetPayloadLengthHandler(f);
      if (!(f4 < 0.001F)) {
         float f5 = i1lil1l1lllilll1lili1l1lil1i1.getSize();
         ByteBufferHolder il1iliilli1l1iill = i1lil1l1lllilll1lili1l1lil1i1.l1IllIl1l1llIlI11I11Il1l1l1lI1();
         int i = (int)(f4 * (float)il1iliilli1l1iill.I11Ill1I1I1llll11Il1I1I()) << 24
            | il1iliilli1l1iill.IlIIlllIIIlllI1Il1Il11llI1lll() << 16
            | il1iliilli1l1iill.llI11I1ll11IlI() << 8
            | il1iliilli1l1iill.III11IllIIIIlII1Il1IIlI();
         l1IIIl1I1I1lI111lI.push();
         l1IIIl1I1I1lI111lI.multiply(Il1II1lI11lIl1lI1lllIIl1);
         l1IIIl1I1I1lI111lI.translate(f1, f2, f3);
         l1IIIl1I1I1lI111lI.multiply(IlII1l1I11l1II11l1Il11);
         float f6 = i1lil1l1lllilll1lili1l1lil1i1.I1l1l1I1I11llII11l();
         if (f6 != 0.0F) {
            l1IIIl1I1I1lI111lI.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(f6));
         }

         Matrix4f matrix4f = l1IIIl1I1I1lI111lI.peek().getPositionMatrix();
         BufferBuilder.vertex(matrix4f, 0.0F, -f5, 0.0F).texture(0.0F, 1.0F).color(i);
         BufferBuilder.vertex(matrix4f, -f5, -f5, 0.0F).texture(1.0F, 1.0F).color(i);
         BufferBuilder.vertex(matrix4f, -f5, 0.0F, 0.0F).texture(1.0F, 0.0F).color(i);
         BufferBuilder.vertex(matrix4f, 0.0F, 0.0F, 0.0F).texture(0.0F, 0.0F).color(i);
         l1IIIl1I1I1lI111lI.pop();
      }
   }

   private static void StringHolder_8(
      net.minecraft.client.render.BufferBuilder BufferBuilder, net.minecraft.util.math.Vec3d Vec3d, float f, float f1, ByteBufferHolder il1iliilli1l1iill
   ) {
      StringHolder_8(BufferBuilder, Vec3d, f, f1, il1iliilli1l1iill, 0.0F);
   }

   private static void StringHolder_8(
      net.minecraft.client.render.BufferBuilder BufferBuilder, net.minecraft.util.math.Vec3d Vec3d, float f, float f1, ByteBufferHolder il1iliilli1l1iill, float f2
   ) {
      if (!(f1 < 0.001F)) {
         float f3 = (float)(Vec3d.x - lll1l1l1lI1II1l1l1);
         float f4 = (float)(Vec3d.y - I1lIIIlI1l1l1l1Il1);
         float f5 = (float)(Vec3d.z - lIlII1IIIII11Il1Il1111III);
         int i = (int)(f1 * (float)il1iliilli1l1iill.I11Ill1I1I1llll11Il1I1I()) << 24
            | il1iliilli1l1iill.IlIIlllIIIlllI1Il1Il11llI1lll() << 16
            | il1iliilli1l1iill.llI11I1ll11IlI() << 8
            | il1iliilli1l1iill.III11IllIIIIlII1Il1IIlI();
         float f6 = f / 2.0F;
         l1IIIl1I1I1lI111lI.push();
         l1IIIl1I1I1lI111lI.multiply(Il1II1lI11lIl1lI1lllIIl1);
         l1IIIl1I1I1lI111lI.translate(f3, f4, f5);
         l1IIIl1I1I1lI111lI.multiply(IlII1l1I11l1II11l1Il11);
         if (f2 != 0.0F) {
            l1IIIl1I1I1lI111lI.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(f2));
         }

         Matrix4f matrix4f = l1IIIl1I1I1lI111lI.peek().getPositionMatrix();
         BufferBuilder.vertex(matrix4f, f6, -f6, 0.0F).texture(0.0F, 1.0F).color(i);
         BufferBuilder.vertex(matrix4f, -f6, -f6, 0.0F).texture(1.0F, 1.0F).color(i);
         BufferBuilder.vertex(matrix4f, -f6, f6, 0.0F).texture(1.0F, 0.0F).color(i);
         BufferBuilder.vertex(matrix4f, f6, f6, 0.0F).texture(0.0F, 0.0F).color(i);
         l1IIIl1I1I1lI111lI.pop();
      }
   }

   private static void lII111IlII1I11llIl1() {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(AdvancementTabType5.SRC_ALPHA, AdvancementTabType4.ONE);
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
   }

   private static void lII111I1lIlIIIl() {
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   }
}
