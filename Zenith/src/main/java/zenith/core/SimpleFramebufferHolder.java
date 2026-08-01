package zenith;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.ShaderLoader;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.gl.ShaderLoader.CopyNameLootFunction52;
import net.minecraft.client.render.VertexFormat.LootPool96;
import org.joml.Matrix4f;
import zenith.zov.base.font.ResourceProvider;

public class SimpleFramebufferHolder implements ZenithInternal076 {
   private SimpleFramebuffer lIll111I1111l1IlII1llIII;
   private SimpleFramebuffer Il1lIIIIlI1I1IllI1;
   private SimpleFramebuffer lIII111lllI1lI;
   private final Queue<HeightHandler> IlIlI1III1I1I11Il1l111 = new LinkedList<>();
   private ShaderProgramKey l11lll11I1llIl;
   private ShaderProgramKey Il1IlIIl1lI111lll1l1IlIll;
   private ShaderProgramKey IlII11I1lI1Ill1Ill1l1l;
   private int l11l11IIllIl11 = 0;
   private int lI1II11lIlI = 0;
   private static final int ll11lIIlII = 4;
   private boolean IIlllIIIlI1l = true;

   public SimpleFramebufferHolder() {
      EventBus.StringHolder_8(this);
   }

   @EventTarget(
      ZenithInternal095 = 0
   )
   public void EventTarget(EventImpl_37 llllii1liii1i1ll1liiil) {
      if (l11I1I1ll1Illll1I1l1111l1II.getShaderLoader() != null
         && (
            ZenithClient.getInstance().ZenithInternal141().getBlurPower() != 0.0F
               || Interface.ll11lIl1IlIl1lI1.lII1ll11II1ll1I1l111Il1lI()
         )) {
         net.minecraft.client.gl.Framebuffer Framebuffer = l11I1I1ll1Illll1I1l1111l1II.getFramebuffer();
         this.StringHolder_8(Framebuffer);
         if (this.l11l11IIllIl11 % 3 == 0) {
            this.lIll111I1111l1IlII1llIII.clear();
            this.StringHolder_8(this.lIll111I1111l1IlII1llIII, llllii1liii1i1ll1liiil.Predictions().matrices.peek().getPositionMatrix());
            this.l11l11IIllIl11 = 0;
         }
      }
   }

   @EventTarget(
      ZenithInternal095 = 4
   )
   public void Event(EventImpl_37 llllii1liii1i1ll1liiil) {
      if (l11I1I1ll1Illll1I1l1111l1II.world != null
         && l11I1I1ll1Illll1I1l1111l1II.getShaderLoader() != null
         && ZenithClient.getInstance().ZenithInternal141().getBlurPower() != 0.0F
         && this.IIlllIIIlI1l) {
         net.minecraft.client.gl.Framebuffer Framebuffer = l11I1I1ll1Illll1I1l1111l1II.getFramebuffer();
         this.EventBus(Framebuffer);
         if (this.lI1II11lIlI % 10 == 0) {
            this.Il1lIIIIlI1I1IllI1.clear();
            this.StringHolder_8(this.Il1lIIIIlI1I1IllI1, llllii1liii1i1ll1liiil.Predictions().matrices.peek().getPositionMatrix());
            this.lI1II11lIlI = 0;
         }
      }
   }

   private void StringHolder_8(net.minecraft.client.gl.Framebuffer Framebuffer, Matrix4f matrix4f) {
      net.minecraft.client.gl.Framebuffer Framebufferx = l11I1I1ll1Illll1I1l1111l1II.getFramebuffer();
      this.EventTarget(Framebufferx);
      if (this.l11lll11I1llIl == null) {
         this.l11lll11I1llIl = new ShaderProgramKey(
            ResourceProvider.getShaderIdentifier("kawase_blur/data"), net.minecraft.client.render.VertexFormats.POSITION_COLOR, Defines.EMPTY
         );
      }

      if (!this.StringHolder_8(this.l11lll11I1llIl)) {
         l11I1I1ll1Illll1I1l1111l1II.getFramebuffer().beginWrite(false);
      } else {
         float f = ZenithClient.getInstance().ZenithInternal141().getBlurPower();
         float f1 = 1.0F / (float)Framebufferx.textureWidth;
         float f2 = 1.0F / (float)Framebufferx.textureHeight;
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableCull();

         try {
            if (!this.StringHolder_8(Framebufferx.getColorAttachment(), Framebufferx, matrix4f, f1, f2, f / 10.0F)) {
               return;
            }

            if (!this.StringHolder_8(Framebufferx.getColorAttachment(), this.lIII111lllI1lI, matrix4f, f1, f2, 2.0F * f / 10.0F)) {
               return;
            }

            if (!this.StringHolder_8(this.lIII111lllI1lI.getColorAttachment(), Framebufferx, matrix4f, f1, f2, 3.0F * f / 10.0F)) {
               return;
            }

            if (this.StringHolder_8(Framebufferx.getColorAttachment(), this.lIII111lllI1lI, matrix4f, f1, f2, 4.0F * f / 10.0F)) {
               this.StringHolder_8(this.lIII111lllI1lI.getColorAttachment(), Framebufferx, matrix4f, f1, f2, 4.0F * f / 10.0F);
               return;
            }
         } finally {
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
            l11I1I1ll1Illll1I1l1111l1II.getFramebuffer().beginWrite(false);
         }
      }
   }

   private boolean StringHolder_8(int i, net.minecraft.client.gl.Framebuffer Framebuffer, Matrix4f matrix4f, float f, float f1, float f2) {
      Framebuffer.beginWrite(false);
      RenderSystem.setShaderTexture(0, i);
      ShaderProgram ShaderProgram = RenderSystem.setShader(this.l11lll11I1llIl);
      if (ShaderProgram == null) {
         RenderSystem.setShaderTexture(0, 0);
         l11I1I1ll1Illll1I1l1111l1II.getFramebuffer().beginWrite(false);
         return false;
      } else {
         ShaderProgram.getUniform("Resolution").set(f, f1);
         ShaderProgram.getUniform("Offset").set(f2);
         net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_COLOR);
         HashMapHolder.EventBus(matrix4f, BufferBuilder, 0.0F, 0.0F, (float)Framebuffer.textureWidth, (float)Framebuffer.textureHeight, -1);
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         RenderSystem.setShaderTexture(0, 0);
         return true;
      }
   }

   public void StringHolder_8(
      Matrix4f matrix4f, float f, float f1, float f2, float f3, floatHolder_5 iil11iill1il1l1llilll1l1i1i1, ByteBufferHolder il1iliilli1l1iill
   ) {
      this.StringHolder_8(this.lIll111I1111l1IlII1llIII, matrix4f, f, f1, f2, f3, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
   }

   public void ListHolder_6(List<HeightHandler$Helper> list) {
      this.StringHolder_8(this.lIll111I1111l1IlII1llIII, list);
   }

   public void EventBus(
      Matrix4f matrix4f, float f, float f1, float f2, float f3, floatHolder_5 iil11iill1il1l1llilll1l1i1i1, ByteBufferHolder il1iliilli1l1iill
   ) {
      this.IIlllIIIlI1l = true;
      net.minecraft.client.gl.Framebuffer Framebuffer = l11I1I1ll1Illll1I1l1111l1II.getFramebuffer();
      this.EventBus(Framebuffer);
      this.StringHolder_8(this.Il1lIIIIlI1I1IllI1, matrix4f, f, f1, f2, f3, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
   }

   private void StringHolder_8(
      net.minecraft.client.gl.Framebuffer Framebuffer,
      Matrix4f matrix4f,
      float f,
      float f1,
      float f2,
      float f3,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      if (Framebuffer != null) {
         if (this.Il1IlIIl1lI111lll1l1IlIll == null) {
            this.Il1IlIIl1lI111lll1l1IlIll = new ShaderProgramKey(
               ResourceProvider.getShaderIdentifier("wtf/data"), net.minecraft.client.render.VertexFormats.POSITION_COLOR, Defines.EMPTY
            );
         }

         if (this.StringHolder_8(this.Il1IlIIl1lI111lll1l1IlIll)) {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableCull();

            try {
               RenderSystem.setShaderTexture(0, Framebuffer.getColorAttachment());
               ShaderProgram ShaderProgram = RenderSystem.setShader(this.Il1IlIIl1lI111lll1l1IlIll);
               if (ShaderProgram != null) {
                  ShaderProgram.getUniform("Size").set(f2, f3);
                  ShaderProgram.getUniform("Radius")
                     .set(
                        iil11iill1il1l1llilll1l1i1i1.I1lIIlI1I11I1ll1l11II1llI1lIl1(),
                        iil11iill1il1l1llilll1l1i1i1.llll1I11IllIl1llII1IIlll1ll(),
                        iil11iill1il1l1llilll1l1i1i1.Ill1I11IIIlII1(),
                        iil11iill1il1l1llilll1l1i1i1.IIIll1I1lI1lllIIIIl1lI()
                     );
                  ShaderProgram.getUniform("Smoothness").set(0.01F);
                  net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance()
                     .begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_COLOR);
                  BufferBuilder.vertex(matrix4f, f, f1, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
                  BufferBuilder.vertex(matrix4f, f, f1 + f3, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
                  BufferBuilder.vertex(matrix4f, f + f2, f1 + f3, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
                  BufferBuilder.vertex(matrix4f, f + f2, f1, 0.0F).color(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII());
                  net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
                  return;
               }
            } finally {
               RenderSystem.setShaderTexture(0, 0);
               RenderSystem.enableCull();
               RenderSystem.disableBlend();
            }
         }
      }
   }

   private void StringHolder_8(net.minecraft.client.gl.Framebuffer Framebuffer, List<HeightHandler$Helper> list) {
      if (Framebuffer != null && !list.isEmpty()) {
         if (this.IlII11I1lI1Ill1Ill1l1l == null) {
            this.IlII11I1lI1Ill1Ill1l1l = new ShaderProgramKey(
               ResourceProvider.getShaderIdentifier("batch_wtf/data"), net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR, Defines.EMPTY
            );
         }

         if (!this.StringHolder_8(this.IlII11I1lI1Ill1Ill1l1l)) {
            for (HeightHandler$Helper i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil : list) {
               this.StringHolder_8(
                  Framebuffer,
                  i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.Illl1IllIIlI1ll1lIIlI1Ill11I,
                  i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.Ill1III1IIll1l111I1I,
                  i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.IlIlllII1l1Ill1I1Il1ll,
                  i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.IIllll1lll1,
                  i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.IIlllI,
                  i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.lllIlIIlIl,
                  i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.I1lllII11Ill1Il11llIlIll1I1lI
               );
            }
         } else {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableCull();
            RenderSystem.setShaderTexture(0, Framebuffer.getColorAttachment());

            try {
               int i = 0;

               while (i < list.size()) {
                  floatHolder_5 iil11iill1il1l1llilll1l1i1i1 = ((HeightHandler$Helper)list.get(i)).lllIlIIlIl;
                  int j = i + 1;

                  while (
                     j < list.size()
                        && this.StringHolder_8(iil11iill1il1l1llilll1l1i1i1, ((HeightHandler$Helper)list.get(j)).lllIlIIlIl)
                  ) {
                     j++;
                  }

                  this.StringHolder_8(list, i, j, iil11iill1il1l1llilll1l1i1i1);
                  i = j;
               }
            } finally {
               RenderSystem.setShaderTexture(0, 0);
               RenderSystem.enableCull();
               RenderSystem.disableBlend();
            }
         }
      }
   }

   private void StringHolder_8(
      List<HeightHandler$Helper> list, int i, int j, floatHolder_5 iil11iill1il1l1llilll1l1i1i1
   ) {
      ShaderProgram ShaderProgram = RenderSystem.setShader(this.IlII11I1lI1Ill1Ill1l1l);
      if (ShaderProgram != null) {
         ShaderProgram.getUniform("Radius")
            .set(
               iil11iill1il1l1llilll1l1i1i1.I1lIIlI1I11I1ll1l11II1llI1lIl1(),
               iil11iill1il1l1llilll1l1i1i1.llll1I11IllIl1llII1IIlll1ll(),
               iil11iill1il1l1llilll1l1i1i1.Ill1I11IIIlII1(),
               iil11iill1il1l1llilll1l1i1i1.IIIll1I1lI1lllIIIIl1lI()
            );
         ShaderProgram.getUniform("Smoothness").set(0.01F);
         net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);

         for (int k = i; k < j; k++) {
            this.StringHolder_8(BufferBuilder, (HeightHandler$Helper)list.get(k));
         }

         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
      }
   }

   private void StringHolder_8(net.minecraft.client.render.BufferBuilder BufferBuilder, HeightHandler$Helper i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil) {
      int i = i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.I1lllII11Ill1Il11llIlIll1I1lI.lllIlll1Ill111l111Il11II11lII();
      float f = i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.Ill1III1IIll1l111I1I + i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.IIllll1lll1;
      float f1 = i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.IlIlllII1l1Ill1I1Il1ll + i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.IIlllI;
      BufferBuilder.vertex(
            i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.Illl1IllIIlI1ll1lIIlI1Ill11I,
            i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.Ill1III1IIll1l111I1I,
            i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.IlIlllII1l1Ill1I1Il1ll,
            0.0F
         )
         .texture(i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.IIllll1lll1, i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.IIlllI)
         .color(i);
      BufferBuilder.vertex(
            i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.Illl1IllIIlI1ll1lIIlI1Ill11I,
            i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.Ill1III1IIll1l111I1I,
            f1,
            0.0F
         )
         .texture(i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.IIllll1lll1, i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.IIlllI)
         .color(i);
      BufferBuilder.vertex(i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.Illl1IllIIlI1ll1lIIlI1Ill11I, f, f1, 0.0F)
         .texture(i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.IIllll1lll1, i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.IIlllI)
         .color(i);
      BufferBuilder.vertex(
            i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.Illl1IllIIlI1ll1lIIlI1Ill11I,
            f,
            i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.IlIlllII1l1Ill1I1Il1ll,
            0.0F
         )
         .texture(i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.IIllll1lll1, i11l1l11ll1i1lill1i1l11il$ii1il11l111ii11iil.IIlllI)
         .color(i);
   }

   private boolean StringHolder_8(floatHolder_5 iil11iill1il1l1llilll1l1i1i1, floatHolder_5 iil11iill1il1l1llilll1l1i1i11) {
      return iil11iill1il1l1llilll1l1i1i1.I1lIIlI1I11I1ll1l11II1llI1lIl1() == iil11iill1il1l1llilll1l1i1i11.I1lIIlI1I11I1ll1l11II1llI1lIl1()
         && iil11iill1il1l1llilll1l1i1i1.llll1I11IllIl1llII1IIlll1ll() == iil11iill1il1l1llilll1l1i1i11.llll1I11IllIl1llII1IIlll1ll()
         && iil11iill1il1l1llilll1l1i1i1.Ill1I11IIIlII1() == iil11iill1il1l1llilll1l1i1i11.Ill1I11IIIlII1()
         && iil11iill1il1l1llilll1l1i1i1.IIIll1I1lI1lllIIIIl1lI() == iil11iill1il1l1llilll1l1i1i11.IIIll1I1lI1lllIIIIl1lI();
   }

   private boolean StringHolder_8(ShaderProgramKey ShaderProgramKey) {
      ShaderLoader ShaderLoader = l11I1I1ll1Illll1I1l1111l1II.getShaderLoader();
      if (ShaderLoader != null && ShaderProgramKey != null) {
         try {
            return ShaderLoader.getProgramToLoad(ShaderProgramKey) != null;
         } catch (CopyNameLootFunction52 CopyNameLootFunction52) {
            return false;
         }
      } else {
         return false;
      }
   }

   private void StringHolder_8(net.minecraft.client.gl.Framebuffer Framebuffer) {
      if (this.lIll111I1111l1IlII1llIII == null) {
         this.lIll111I1111l1IlII1llIII = new SimpleFramebuffer(Framebuffer.textureWidth, Framebuffer.textureHeight, false);
      }

      if (this.lIll111I1111l1IlII1llIII.textureWidth != Framebuffer.textureWidth || this.lIll111I1111l1IlII1llIII.textureHeight != Framebuffer.textureHeight) {
         this.lIll111I1111l1IlII1llIII.resize(Framebuffer.textureWidth, Framebuffer.textureHeight);
      }
   }

   private void EventBus(net.minecraft.client.gl.Framebuffer Framebuffer) {
      if (this.Il1lIIIIlI1I1IllI1 == null) {
         this.Il1lIIIIlI1I1IllI1 = new SimpleFramebuffer(Framebuffer.textureWidth, Framebuffer.textureHeight, false);
      }

      if (this.Il1lIIIIlI1I1IllI1.textureWidth != Framebuffer.textureWidth || this.Il1lIIIIlI1I1IllI1.textureHeight != Framebuffer.textureHeight) {
         this.Il1lIIIIlI1I1IllI1.resize(Framebuffer.textureWidth, Framebuffer.textureHeight);
      }
   }

   private void EventTarget(net.minecraft.client.gl.Framebuffer Framebuffer) {
      if (this.lIII111lllI1lI == null) {
         this.lIII111lllI1lI = new SimpleFramebuffer(Framebuffer.textureWidth, Framebuffer.textureHeight, false);
      }

      if (this.lIII111lllI1lI.textureWidth != Framebuffer.textureWidth || this.lIII111lllI1lI.textureHeight != Framebuffer.textureHeight) {
         this.lIII111lllI1lI.resize(Framebuffer.textureWidth, Framebuffer.textureHeight);
      }
   }

   public void Ill111IlIll1l1l1l1l1l() {
      this.l11l11IIllIl11 = 3;
      this.lI1II11lIlI = 10;
   }

   public void lll11III11l1lIl1I11lII11Il() {
      this.l11l11IIllIl11++;
      this.lI1II11lIlI++;
   }

   public SimpleFramebuffer I11I11II1I111llIIII11llIIl1l1l() {
      return this.lIll111I1111l1IlII1llIII;
   }
}
