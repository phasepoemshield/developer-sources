package zenith;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.BuiltBuffer;
import net.minecraft.client.render.VertexFormat.LootPool96;
import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;

public final class HashMapHolder implements ZenithInternal076 {
   public static HashMap<ZenithInternal104$Helper, ZenithInternal102$EventBus> lI11I11I1Il1IlI1IlI1lI = new HashMap<>();
   public static HashMap<Integer, ZenithInternal102$EventBus> ll1II1II111l11lI = new HashMap<>();
   static final Stack<floatHolder$Event_2> lI1lI11lI1l1111 = new Stack<>();
   private static final List<HeightHandler$Helper_5> llIII1IlIl = new ArrayList<>();
   private static final int l11Il1IllIl1ll1lIl = 5;
   private static final Set<ZenithInternal104$Helper> llIIlIlIIl1l1Il1l1I1lll = ConcurrentHashMap.newKeySet();
   private static final ExecutorService II1I111II = Executors.newSingleThreadExecutor();

   public static void lllIII11IIlll1IllIIl1lIl1II() {
      RenderSystem.disableScissor();
   }

   public static void StringHolder_8(
      net.minecraft.client.render.BufferBuilder BufferBuilder, Matrix4f matrix4f, float f, float f1, float f2, float f3, Color color, Color color1, Color color2, Color color3
   ) {
      BufferBuilder.vertex(matrix4f, f, f3, 0.0F).color(color.getRGB());
      BufferBuilder.vertex(matrix4f, f2, f3, 0.0F).color(color1.getRGB());
      BufferBuilder.vertex(matrix4f, f2, f1, 0.0F).color(color2.getRGB());
      BufferBuilder.vertex(matrix4f, f, f1, 0.0F).color(color3.getRGB());
   }

   public static boolean StringHolder_8(double d0, double d1, double d2, double d3, double d4, double d5) {
      return d0 >= d2 && d0 - d4 <= d2 && d1 >= d3 && d1 - d5 <= d3;
   }

   public static void StringHolder_8(MatrixStack MatrixStack, float f, float f1, float f2, float f3, int i, Color color) {
   }

   public static void EventBus(net.minecraft.client.gui.DrawContext DrawContext) {
      MatrixStack MatrixStack = DrawContext.getMatrices();
      Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
      if (!llIII1IlIl.isEmpty()) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_COLOR);
         llIII1IlIl.forEach(
            li1illlill$l1lll11l1l -> EventBus(
                  matrix4f,
                  BufferBuilder,
                  li1illlill$l1lll11l1l.l1I1111IIlI111I1lIIl11ll1,
                  li1illlill$l1lll11l1l.I1I1l1I111lIl1ll1,
                  li1illlill$l1lll11l1l.IlI111llI1l11Il11l1II11II,
                  li1illlill$l1lll11l1l.l1l1llllll1l1lI1,
                  li1illlill$l1lll11l1l.IllllllI1ll1111l1
               )
         );
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         RenderSystem.disableBlend();
         llIII1IlIl.clear();
      }
   }

   public static void StringHolder_8(float f, float f1, float f2, float f3, int i) {
      llIII1IlIl.add(new HeightHandler$Helper_5(f, f1, f2, f3, PatternHolder.EventBus(i, RenderSystem.getShaderColor()[3])));
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      double d0,
      double d1,
      double d2,
      double d3,
      float f,
      float f1,
      double d4,
      double d5,
      double d6,
      double d7,
      int i,
      int j,
      int k,
      int l
   ) {
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
      StringHolder_8(BufferBuilder, MatrixStack, d0, d1, d2, d3, f, f1, d4, d5, d6, d7, i, j, k, l);
      net.minecraft.client.render.BufferRenderer.draw(BufferBuilder.end());
   }

   public static void StringHolder_8(Matrix4f matrix4f, net.minecraft.client.render.BufferBuilder BufferBuilder, float f, float f1, float f2, float f3) {
      BufferBuilder.vertex(matrix4f, f, f1, 0.0F);
      BufferBuilder.vertex(matrix4f, f, f1 + f3, 0.0F);
      BufferBuilder.vertex(matrix4f, f + f2, f1 + f3, 0.0F);
      BufferBuilder.vertex(matrix4f, f + f2, f1, 0.0F);
   }

   public static void EventBus(Matrix4f matrix4f, net.minecraft.client.render.BufferBuilder BufferBuilder, float f, float f1, float f2, float f3, int i) {
      BufferBuilder.vertex(matrix4f, f, f1, 0.0F).color(i);
      BufferBuilder.vertex(matrix4f, f, f1 + f3, 0.0F).color(i);
      BufferBuilder.vertex(matrix4f, f + f2, f1 + f3, 0.0F).color(i);
      BufferBuilder.vertex(matrix4f, f + f2, f1, 0.0F).color(i);
   }

   public static void StringHolder_8(Matrix4f matrix4f, float f, float f1, float f2, float f3, int i) {
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
      BufferBuilder.vertex(matrix4f, f, f1 + f3, 0.0F).texture(0.0F, 0.0F).color(i);
      BufferBuilder.vertex(matrix4f, f + f2, f1 + f3, 0.0F).texture(0.0F, 1.0F).color(i);
      BufferBuilder.vertex(matrix4f, f + f2, f1, 0.0F).texture(1.0F, 1.0F).color(i);
      BufferBuilder.vertex(matrix4f, f, f1, 0.0F).texture(1.0F, 0.0F).color(i);
      net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
   }

   public static void EventTarget(Matrix4f matrix4f, net.minecraft.client.render.BufferBuilder BufferBuilder, float f, float f1, float f2, float f3, int i) {
      BufferBuilder.vertex(matrix4f, f, f1 + f3, 0.0F).texture(0.0F, 0.0F).color(i);
      BufferBuilder.vertex(matrix4f, f + f2, f1 + f3, 0.0F).texture(0.0F, 1.0F).color(i);
      BufferBuilder.vertex(matrix4f, f + f2, f1, 0.0F).texture(1.0F, 1.0F).color(i);
      BufferBuilder.vertex(matrix4f, f, f1, 0.0F).texture(1.0F, 0.0F).color(i);
   }

   private static ZenithInternal104$Helper StringHolder_8(float f, float f1, int i, floatHolder_5 iil11iill1il1l1llilll1l1i1i1) {
      int j = Math.max(1, Math.round(f));
      int k = Math.max(1, Math.round(f1));
      int l = Math.max(1, j - i * 2);
      int i1 = Math.max(1, k - i * 2);
      floatHolder_5 iil11iill1il1l1llilll1l1i1i11 = StringHolder_8(l, i1, iil11iill1il1l1llilll1l1i1i1);
      return new ZenithInternal104$Helper(
         j,
         k,
         i,
         Math.round(iil11iill1il1l1llilll1l1i1i11.I1lIIlI1I11I1ll1l11II1llI1lIl1()),
         Math.round(iil11iill1il1l1llilll1l1i1i11.Ill1I11IIIlII1()),
         Math.round(iil11iill1il1l1llilll1l1i1i11.IIIll1I1lI1lllIIIIl1lI()),
         Math.round(iil11iill1il1l1llilll1l1i1i11.llll1I11IllIl1llII1IIlll1ll())
      );
   }

   private static ZenithInternal104$Helper StringHolder_8(ZenithInternal104$Helper li1illlill$ii1il11l111ii11iil) {
      ZenithInternal104$Helper li1illlill$ii1il11l111ii11iilx = null;
      int i = Integer.MAX_VALUE;

      for (ZenithInternal104$Helper li1illlill$ii1il11l111ii11iilxx : lI11I11I1Il1IlI1IlI1lI.keySet()) {
         int j = StringHolder_8(li1illlill$ii1il11l111ii11iilxx, li1illlill$ii1il11l111ii11iil);
         if (j < i) {
            i = j;
            li1illlill$ii1il11l111ii11iilx = li1illlill$ii1il11l111ii11iilxx;
         }
      }

      return li1illlill$ii1il11l111ii11iilx;
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      float f,
      float f1,
      float f2,
      float f3,
      int i,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ZenithInternal027 i1li1li11i11l1111
   ) {
      StringHolder_8(MatrixStack.peek().getPositionMatrix(), f, f1, f2, f3, i, iil11iill1il1l1llilll1l1i1i1, i1li1li11i11l1111);
   }

   public static void StringHolder_8(
      Matrix4f matrix4f,
      float f,
      float f1,
      float f2,
      float f3,
      int i,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ZenithInternal027 i1li1li11i11l1111
   ) {
      f2 += (float)(i * 2);
      f3 += (float)(i * 2);
      f -= (float)i;
      f1 -= (float)i;
      ZenithInternal104$Helper li1illlill$ii1il11l111ii11iilx = StringHolder_8(f2, f3, i, iil11iill1il1l1llilll1l1i1i1);
      ZenithInternal102$EventBus li1illlill$l1i1illlili = lI11I11I1Il1IlI1IlI1lI.get(li1illlill$ii1il11l111ii11iilx);
      ZenithInternal104$Helper li1illlill$ii1il11l111ii11iilx = li1illlill$ii1il11l111ii11iilx;
      if (li1illlill$l1i1illlili == null) {
         li1illlill$ii1il11l111ii11iilx = StringHolder_8(li1illlill$ii1il11l111ii11iilx);
         if (li1illlill$ii1il11l111ii11iilx != null) {
            li1illlill$l1i1illlili = lI11I11I1Il1IlI1IlI1lI.get(li1illlill$ii1il11l111ii11iilx);
         }
      }

      if (li1illlill$l1i1illlili == null
         || StringHolder_8(li1illlill$ii1il11l111ii11iilx, li1illlill$ii1il11l111ii11iilx) >= 5
         || li1illlill$ii1il11l111ii11iilx.Il11IIllIl1lII1lIl11ll != li1illlill$ii1il11l111ii11iilx.Il11IIllIl1lII1lIl11ll) {
         EventBus(li1illlill$ii1il11l111ii11iilx);
      }

      if (li1illlill$l1i1illlili != null) {
         li1illlill$l1i1illlili.reset();
         floatHolder_8.StringHolder_8(matrix4f, li1illlill$l1i1illlili.I11I1IlI.ll1llII11IIlIl1I1l1I1l1l(), f, f1, f2, f3, i1li1li11i11l1111);
      }
   }

   private static void EventBus(ZenithInternal104$Helper li1illlill$ii1il11l111ii11iil) {
      if (!lI11I11I1Il1IlI1IlI1lI.containsKey(li1illlill$ii1il11l111ii11iil) && llIIlIlIIl1l1Il1l1I1lll.add(li1illlill$ii1il11l111ii11iil)) {
         II1I111II.execute(
            () -> {
               try {
                  BufferedImage bufferedimage = EventTarget(li1illlill$ii1il11l111ii11iil);
                  BufferedImage bufferedimage1 = li1illlill$ii1il11l111ii11iil.IIlIIll11ll1l11Il1l1I() > 0
                     ? new floatHolder_13((float)li1illlill$ii1il11l111ii11iil.IIlIIll11ll1l11Il1l1I()).StringHolder_8(bufferedimage, null)
                     : bufferedimage;
                  l11I1I1ll1Illll1I1l1111l1II.execute(() -> {
                     try {
                        if (!lI11I11I1Il1IlI1IlI1lI.containsKey(li1illlill$ii1il11l111ii11iil)) {
                           lI11I11I1Il1IlI1IlI1lI.put(li1illlill$ii1il11l111ii11iil, new ZenithInternal102$EventBus(bufferedimage1));
                        }
                     } finally {
                        llIIlIlIIl1l1Il1l1I1lll.remove(li1illlill$ii1il11l111ii11iil);
                     }
                  });
               } catch (Exception exception) {
                  llIIlIlIIl1l1Il1l1I1lll.remove(li1illlill$ii1il11l111ii11iil);
                  exception.printStackTrace();
               }
            }
         );
      }
   }

   private static BufferedImage EventTarget(ZenithInternal104$Helper li1illlill$ii1il11l111ii11iil) {
      BufferedImage bufferedimage = new BufferedImage(li1illlill$ii1il11l111ii11iil.Il1ll1llllIl(), li1illlill$ii1il11l111ii11iil.I111IIlI1Ill1IIlll(), 2);
      int[] aint = new int[li1illlill$ii1il11l111ii11iil.Il1ll1llllIl() * li1illlill$ii1il11l111ii11iil.I111IIlI1Ill1IIlll()];
      int i = Math.max(1, li1illlill$ii1il11l111ii11iil.Il1ll1llllIl() - li1illlill$ii1il11l111ii11iil.IIlIIll11ll1l11Il1l1I() * 2);
      int j = Math.max(1, li1illlill$ii1il11l111ii11iil.I111IIlI1Ill1IIlll() - li1illlill$ii1il11l111ii11iil.IIlIIll11ll1l11Il1l1I() * 2);
      float f = (float)i * 0.5F;
      float f1 = (float)j * 0.5F;
      float f2 = Math.max(0.0F, f - 1.0F);
      float f3 = Math.max(0.0F, f1 - 1.0F);

      for (int k = 0; k < li1illlill$ii1il11l111ii11iil.I111IIlI1Ill1IIlll(); k++) {
         float f4 = (float)k + 0.5F - (float)li1illlill$ii1il11l111ii11iil.IIlIIll11ll1l11Il1l1I();

         for (int l = 0; l < li1illlill$ii1il11l111ii11iil.Il1ll1llllIl(); l++) {
            float f5 = (float)l + 0.5F - (float)li1illlill$ii1il11l111ii11iil.IIlIIll11ll1l11Il1l1I();
            float f6 = f - f5;
            float f7 = f1 - f4;
            float f8 = StringHolder_8(
               f6,
               f7,
               f2,
               f3,
               (float)li1illlill$ii1il11l111ii11iil.l1llII1lll1I1II(),
               (float)li1illlill$ii1il11l111ii11iil.Il1IIl1II1I1Il11l1lIIll11(),
               (float)li1illlill$ii1il11l111ii11iil.I1Il1llI1l11(),
               (float)li1illlill$ii1il11l111ii11iil.lIlIIIl1Il1l1l()
            );
            float f9 = 1.0F - StringHolder_4(0.0F, 1.0F, f8);
            if (!(f9 <= 0.0F)) {
               int i1 = MathHelper.clamp(Math.round(f9 * 255.0F), 0, 255);
               aint[k * li1illlill$ii1il11l111ii11iil.Il1ll1llllIl() + l] = i1 << 24 | 16777215;
            }
         }
      }

      bufferedimage.setRGB(
         0,
         0,
         li1illlill$ii1il11l111ii11iil.Il1ll1llllIl(),
         li1illlill$ii1il11l111ii11iil.I111IIlI1Ill1IIlll(),
         aint,
         0,
         li1illlill$ii1il11l111ii11iil.Il1ll1llllIl()
      );
      return bufferedimage;
   }

   private static floatHolder_5 StringHolder_8(int i, int j, floatHolder_5 iil11iill1il1l1llilll1l1i1i1) {
      float f = Math.max(0.0F, (float)i * 0.5F - 1.0F);
      float f1 = Math.max(0.0F, (float)j * 0.5F - 1.0F);
      return new floatHolder_5(
         byteHolder(iil11iill1il1l1llilll1l1i1i1.I1lIIlI1I11I1ll1l11II1llI1lIl1(), f, f1),
         byteHolder(iil11iill1il1l1llilll1l1i1i1.Ill1I11IIIlII1(), f, f1),
         byteHolder(iil11iill1il1l1llilll1l1i1i1.IIIll1I1lI1lllIIIIl1lI(), f, f1),
         byteHolder(iil11iill1il1l1llilll1l1i1i1.llll1I11IllIl1llII1IIlll1ll(), f, f1)
      );
   }

   private static float byteHolder(float f, float f1, float f2) {
      return Math.max(0.0F, Math.min(f, Math.min(f1, f2)));
   }

   private static int StringHolder_8(
      ZenithInternal104$Helper li1illlill$ii1il11l111ii11iil, ZenithInternal104$Helper li1illlill$ii1il11l111ii11iil
   ) {
      return li1illlill$ii1il11l111ii11iil != null && li1illlill$ii1il11l111ii11iilx != null
         ? Math.abs(li1illlill$ii1il11l111ii11iil.Il1ll1llllIl() - li1illlill$ii1il11l111ii11iilx.Il1ll1llllIl())
            + Math.abs(li1illlill$ii1il11l111ii11iil.I111IIlI1Ill1IIlll() - li1illlill$ii1il11l111ii11iilx.I111IIlI1Ill1IIlll())
            + Math.abs(li1illlill$ii1il11l111ii11iil.IIlIIll11ll1l11Il1l1I() - li1illlill$ii1il11l111ii11iilx.IIlIIll11ll1l11Il1l1I())
            + Math.abs(li1illlill$ii1il11l111ii11iil.l1llII1lll1I1II() - li1illlill$ii1il11l111ii11iilx.l1llII1lll1I1II())
            + Math.abs(li1illlill$ii1il11l111ii11iil.I1Il1llI1l11() - li1illlill$ii1il11l111ii11iilx.I1Il1llI1l11())
            + Math.abs(li1illlill$ii1il11l111ii11iil.lIlIIIl1Il1l1l() - li1illlill$ii1il11l111ii11iilx.lIlIIIl1Il1l1l())
            + Math.abs(li1illlill$ii1il11l111ii11iil.Il1IIl1II1I1Il11l1lIIll11() - li1illlill$ii1il11l111ii11iilx.Il1IIl1II1I1Il11l1lIIll11())
         : Integer.MAX_VALUE;
   }

   private static float StringHolder_8(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7) {
      float f8 = f > 0.0F ? f4 : f6;
      float f9 = f > 0.0F ? f5 : f7;
      float f10 = f1 > 0.0F ? f8 : f9;
      float f11 = Math.abs(f) - f2 + f10;
      float f12 = Math.abs(f1) - f3 + f10;
      return Math.min(Math.max(f11, f12), 0.0F) + (float)Math.hypot((double)Math.max(f11, 0.0F), (double)Math.max(f12, 0.0F)) - f10;
   }

   private static float StringHolder_4(float f, float f1, float f2) {
      if (f == f1) {
         return f2 < f ? 0.0F : 1.0F;
      } else {
         float f3 = MathHelper.clamp((f2 - f) / (f1 - f), 0.0F, 1.0F);
         return f3 * f3 * (3.0F - 2.0F * f3);
      }
   }

   public static void StringHolder_8(ZenithInternal116 liil1iilli1llll1llilii, BufferedImage bufferedimage) {
      try {
         ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
         ImageIO.write(bufferedimage, "png", bytearrayoutputstream);
         byte[] abyte = bytearrayoutputstream.toByteArray();
         EventBus(liil1iilli1llll1llilii, abyte);
      } catch (Exception exception) {
      }
   }

   public static void StringHolder_8(ZenithInternal116 liil1iilli1llll1llilii, byte[] abyte) {
      try {
         ByteBuffer bytebuffer = BufferUtils.createByteBuffer(abyte.length).put(abyte);
         bytebuffer.flip();
         NativeImageBackedTexture NativeImageBackedTexture = new NativeImageBackedTexture(NativeImage.read(bytebuffer));
         l11I1I1ll1Illll1I1l1111l1II.getTextureManager().registerTexture(liil1iilli1llll1llilii.ll1llII11IIlIl1I1l1I1l1l(), NativeImageBackedTexture);
      } catch (Exception exception) {
      }
   }

   public static void EventBus(ZenithInternal116 liil1iilli1llll1llilii, byte[] abyte) {
      try {
         ByteBuffer bytebuffer = BufferUtils.createByteBuffer(abyte.length).put(abyte);
         bytebuffer.flip();
         NativeImageBackedTexture NativeImageBackedTexture = new NativeImageBackedTexture(NativeImage.read(bytebuffer));
         l11I1I1ll1Illll1I1l1111l1II.execute(
            () -> l11I1I1ll1Illll1I1l1111l1II.getTextureManager().registerTexture(liil1iilli1llll1llilii.ll1llII11IIlIl1I1l1I1l1l(), NativeImageBackedTexture)
         );
      } catch (Exception exception) {
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack, double d0, double d1, double d2, double d3, float f, float f1, double d4, double d5, double d6, double d7
   ) {
      double d8 = d0 + d2;
      double d9 = d1 + d3;
      double d10 = 0.0;
      Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE);
      BufferBuilder.vertex(matrix4f, (float)d0, (float)d9, (float)d10).texture(f / (float)d6, (f1 + (float)d5) / (float)d7);
      BufferBuilder.vertex(matrix4f, (float)d8, (float)d9, (float)d10).texture((f + (float)d4) / (float)d6, (f1 + (float)d5) / (float)d7);
      BufferBuilder.vertex(matrix4f, (float)d8, (float)d1, (float)d10).texture((f + (float)d4) / (float)d6, f1 / (float)d7);
      BufferBuilder.vertex(matrix4f, (float)d0, (float)d1, (float)d10).texture(f / (float)d6, (f1 + 0.0F) / (float)d7);
      net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack,
      double d0,
      double d1,
      double d2,
      double d3,
      float f,
      float f1,
      double d4,
      double d5,
      double d6,
      double d7,
      Color color,
      Color color1,
      Color color2,
      Color color3
   ) {
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
      StringHolder_8(BufferBuilder, MatrixStack, d0, d1, d2, d3, f, f1, d4, d5, d6, d7, color, color1, color2, color3);
      net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
   }

   public static void StringHolder_8(
      net.minecraft.client.render.BufferBuilder BufferBuilder,
      MatrixStack MatrixStack,
      double d0,
      double d1,
      double d2,
      double d3,
      float f,
      float f1,
      double d4,
      double d5,
      double d6,
      double d7,
      int i,
      int j,
      int k,
      int l
   ) {
      double d8 = d0 + d2;
      double d9 = d1 + d3;
      double d10 = 0.0;
      Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
      BufferBuilder.vertex(matrix4f, (float)d0, (float)d9, (float)d10).texture(f / (float)d6, (f1 + (float)d5) / (float)d7).color(i);
      BufferBuilder.vertex(matrix4f, (float)d8, (float)d9, (float)d10)
         .texture((f + (float)d4) / (float)d6, (f1 + (float)d5) / (float)d7)
         .color(j);
      BufferBuilder.vertex(matrix4f, (float)d8, (float)d1, (float)d10).texture((f + (float)d4) / (float)d6, f1 / (float)d7).color(k);
      BufferBuilder.vertex(matrix4f, (float)d0, (float)d1, (float)d10).texture(f / (float)d6, (f1 + 0.0F) / (float)d7).color(l);
   }

   public static void StringHolder_8(
      net.minecraft.client.render.BufferBuilder BufferBuilder,
      MatrixStack MatrixStack,
      double d0,
      double d1,
      double d2,
      double d3,
      float f,
      float f1,
      double d4,
      double d5,
      double d6,
      double d7,
      Color color,
      Color color1,
      Color color2,
      Color color3
   ) {
      double d8 = d0 + d2;
      double d9 = d1 + d3;
      double d10 = 0.0;
      Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
      BufferBuilder.vertex(matrix4f, (float)d0, (float)d9, (float)d10).texture(f / (float)d6, (f1 + (float)d5) / (float)d7).color(color.getRGB());
      BufferBuilder.vertex(matrix4f, (float)d8, (float)d9, (float)d10)
         .texture((f + (float)d4) / (float)d6, (f1 + (float)d5) / (float)d7)
         .color(color1.getRGB());
      BufferBuilder.vertex(matrix4f, (float)d8, (float)d1, (float)d10)
         .texture((f + (float)d4) / (float)d6, f1 / (float)d7)
         .color(color2.getRGB());
      BufferBuilder.vertex(matrix4f, (float)d0, (float)d1, (float)d10).texture(f / (float)d6, (f1 + 0.0F) / (float)d7).color(color3.getRGB());
   }

   public static void llIl1I11II1l() {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static void StringHolder_8(MatrixStack MatrixStack, float f, float f1, float f2, float f3, float f4, boolean flag, boolean flag1, int i) {
   }

   public static void StringHolder_8(MatrixStack MatrixStack, float f, float f1, float f2, Color color) {
   }

   public static void EventBus(MatrixStack MatrixStack, float f, float f1, float f2, float f3, float f4, boolean flag, boolean flag1, int i) {
      if (flag1) {
         StringHolder_8(MatrixStack, f - f2 * f3, f1, f + f2 * f3 - (f - f2 * f3), f2, 10, StringHolder_8(new Color(i), 140));
      }

      MatrixStack.push();
      llIl1I11II1l();
      Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_COLOR);
      BufferBuilder.vertex(matrix4f, f, f1, 0.0F).color(i);
      BufferBuilder.vertex(matrix4f, f - f2 * f3, f1 + f2, 0.0F).color(i);
      BufferBuilder.vertex(matrix4f, f, f1 + f2 - f4, 0.0F).color(i);
      BufferBuilder.vertex(matrix4f, f, f1, 0.0F).color(i);
      i = EventBus(new Color(i), 0.8F).getRGB();
      BufferBuilder.vertex(matrix4f, f, f1, 0.0F).color(i);
      BufferBuilder.vertex(matrix4f, f, f1 + f2 - f4, 0.0F).color(i);
      BufferBuilder.vertex(matrix4f, f + f2 * f3, f1 + f2, 0.0F).color(i);
      BufferBuilder.vertex(matrix4f, f, f1, 0.0F).color(i);
      if (flag) {
         i = EventBus(new Color(i), 0.6F).getRGB();
         BufferBuilder.vertex(matrix4f, f - f2 * f3, f1 + f2, 0.0F).color(i);
         BufferBuilder.vertex(matrix4f, f + f2 * f3, f1 + f2, 0.0F).color(i);
         BufferBuilder.vertex(matrix4f, f, f1 + f2 - f4, 0.0F).color(i);
         BufferBuilder.vertex(matrix4f, f - f2 * f3, f1 + f2, 0.0F).color(i);
      }

      net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
      IlI1I1l1l1llIl1l1l1l1ll();
      MatrixStack.pop();
   }

   public static void IlI1I1l1l1llIl1l1l1l1ll() {
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static float ZenithInternal128(float f, float f1, float f2) {
      boolean flag = f > f1;
      if (f2 < 0.0F) {
         f2 = 0.0F;
      } else if (f2 > 1.0F) {
         f2 = 1.0F;
      }

      float f3 = Math.max(f, f1) - Math.min(f, f1);
      float f4 = f3 * f2;
      return f1 + (flag ? f4 : -f4);
   }

   public static Color StringHolder_8(Color color, int i) {
      return new Color(color.getRed(), color.getGreen(), color.getBlue(), MathHelper.clamp(i, 0, 255));
   }

   public static Color StringHolder_8(Color color, Color color1, double d0, double d1) {
      int i = (int)(((double)System.currentTimeMillis() / d0 + d1) % 360.0);
      i = (i >= 180 ? 360 - i : i) * 2;
      return StringHolder_8(color, color1, (float)i / 360.0F);
   }

   public static Color StringHolder_8(boolean flag, int i) {
      float f = flag ? 3500.0F : 3000.0F;
      float f1 = (float)(System.currentTimeMillis() % (long)((int)f) + (long)i);
      if (f1 > f) {
         f1 -= f;
      }

      f1 /= f;
      if (f1 > 0.5F) {
         f1 = 0.5F - (f1 - 0.5F);
      }

      f1 += 0.5F;
      return Color.getHSBColor(f1, 0.4F, 1.0F);
   }

   public static Color StringHolder_8(int i, float f, float f1) {
      double d0 = Math.ceil((double)((float)(System.currentTimeMillis() + (long)i) / 16.0F));
      d0 %= 360.0;
      return Color.getHSBColor((float)(d0 / 360.0), f, f1);
   }

   public static Color ZenithInternal042(int i, int j) {
      int k = (int)((System.currentTimeMillis() / (long)i + (long)j) % 360L);
      int l;
      return Color.getHSBColor((double)((float)((double)(l = k % 360) / 360.0)) < 0.5 ? -((float)((double)l / 360.0)) : (float)((double)l / 360.0), 0.5F, 1.0F);
   }

   public static Color StringHolder_8(Color color) {
      float[] afloat = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
      float f = 0.84F;
      float f1 = afloat[0] - f;
      return new Color(Color.HSBtoRGB(f1, afloat[1], afloat[2]));
   }

   public static Color StringHolder_8(Color color, float f) {
      f = Math.min(1.0F, Math.max(0.0F, f));
      return new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)((float)color.getAlpha() * f));
   }

   public static int StringHolder_8(int i, float f) {
      f = Math.min(1.0F, Math.max(0.0F, f));
      Color color = new Color(i);
      return new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)((float)color.getAlpha() * f)).getRGB();
   }

   public static Color EventBus(Color color, float f) {
      return new Color(
         Math.max((int)((float)color.getRed() * f), 0),
         Math.max((int)((float)color.getGreen() * f), 0),
         Math.max((int)((float)color.getBlue() * f), 0),
         color.getAlpha()
      );
   }

   public static Color StringHolder_8(int i, int j, float f, float f1, float f2) {
      int k = (int)((System.currentTimeMillis() / (long)i + (long)j) % 360L);
      float f3 = (float)k / 360.0F;
      Color color = new Color(Color.HSBtoRGB(f3, f, f1));
      return new Color(color.getRed(), color.getGreen(), color.getBlue(), Math.max(0, Math.min(255, (int)(f2 * 255.0F))));
   }

   public static Color StringHolder_8(int i, int j, Color color, Color color1, boolean flag) {
      int k = (int)((System.currentTimeMillis() / (long)i + (long)j) % 360L);
      k = (k >= 180 ? 360 - k : k) * 2;
      return flag ? EventBus(color, color1, (float)k / 360.0F) : StringHolder_8(color, color1, (float)k / 360.0F);
   }

   public static Color StringHolder_8(Color color, Color color1, float f) {
      f = Math.min(1.0F, Math.max(0.0F, f));
      return new Color(
         StringHolder_8(color.getRed(), color1.getRed(), (double)f),
         StringHolder_8(color.getGreen(), color1.getGreen(), (double)f),
         StringHolder_8(color.getBlue(), color1.getBlue(), (double)f),
         StringHolder_8(color.getAlpha(), color1.getAlpha(), (double)f)
      );
   }

   public static Color EventBus(Color color, Color color1, float f) {
      f = Math.min(1.0F, Math.max(0.0F, f));
      float[] afloat = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
      float[] afloat1 = Color.RGBtoHSB(color1.getRed(), color1.getGreen(), color1.getBlue(), null);
      Color color2 = Color.getHSBColor(
         EventBus(afloat[0], afloat1[0], (double)f), EventBus(afloat[1], afloat1[1], (double)f), EventBus(afloat[2], afloat1[2], (double)f)
      );
      return new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), StringHolder_8(color.getAlpha(), color1.getAlpha(), (double)f));
   }

   public static double byteHolder_2(double d0, double d1, double d2) {
      return d0 + (d1 - d0) * d2;
   }

   public static float EventBus(float f, float f1, double d0) {
      return (float)byteHolder_2((double)f, (double)f1, (double)((float)d0));
   }

   public static int StringHolder_8(int i, int j, double d0) {
      return (int)byteHolder_2((double)i, (double)j, (double)((float)d0));
   }

   public static net.minecraft.client.render.BufferBuilder StringHolder_8(MatrixStack MatrixStack, float f, float f1, float f2, float f3) {
      llIl1I11II1l();
      Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
      net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION);
      StringHolder_8(BufferBuilder, matrix4f, f, f1, f + f2, f1 + f3);
      return BufferBuilder;
   }

   public static void StringHolder_8(net.minecraft.client.render.BufferBuilder BufferBuilder, Matrix4f matrix4f, float f, float f1, float f2, float f3) {
      BufferBuilder.vertex(matrix4f, f, f1, 0.0F);
      BufferBuilder.vertex(matrix4f, f, f3, 0.0F);
      BufferBuilder.vertex(matrix4f, f2, f3, 0.0F);
      BufferBuilder.vertex(matrix4f, f2, f1, 0.0F);
   }

   public static boolean EventBus(Color color) {
      return ByteBufferHolder_2((float)color.getRed() / 255.0F, (float)color.getGreen() / 255.0F, (float)color.getBlue() / 255.0F);
   }

   public static boolean ByteBufferHolder_2(float f, float f1, float f2) {
      return StringHolder_8(f, f1, f2, 0.0F, 0.0F, 0.0F) < StringHolder_8(f, f1, f2, 1.0F, 1.0F, 1.0F);
   }

   public static float StringHolder_8(float f, float f1, float f2, float f3, float f4, float f5) {
      float f6 = f3 - f;
      float f7 = f4 - f1;
      float f8 = f5 - f2;
      return (float)Math.sqrt((double)(f6 * f6 + f7 * f7 + f8 * f8));
   }

   public static Color StringHolder_8(Color color, Color color1, float f, boolean flag) {
      if (!flag) {
         return (double)f >= 0.95 ? color1 : color;
      } else {
         int i = color1.getRed() - color.getRed();
         int j = color1.getGreen() - color.getGreen();
         int k = color1.getBlue() - color.getBlue();
         int l = color1.getAlpha() - color.getAlpha();
         return new Color(
            EventImpl_19(color.getRed() + (int)((float)i * f)),
            EventImpl_19(color.getGreen() + (int)((float)j * f)),
            EventImpl_19(color.getBlue() + (int)((float)k * f)),
            EventImpl_19(color.getAlpha() + (int)((float)l * f))
         );
      }
   }

   private static int EventImpl_19(int i) {
      return i > 255 ? 255 : Math.max(i, 0);
   }

   public static void StringHolder_8(net.minecraft.client.render.BufferBuilder BufferBuilder) {
      BuiltBuffer BuiltBuffer = BufferBuilder.endNullable();
      if (BuiltBuffer != null) {
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BuiltBuffer);
      }
   }

   private HashMapHolder() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
