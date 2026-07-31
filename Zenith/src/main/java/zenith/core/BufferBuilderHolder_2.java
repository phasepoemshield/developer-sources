package zenith;

import zenith.hud.*;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.render.VertexFormat.LootPool96;
import org.joml.Matrix4f;

public class BufferBuilderHolder_2 {
   private net.minecraft.client.render.BufferBuilder Ill1IlI1IlIll1l11I1lIllI1lI;
   private float IlI1Il1II11l;
   private float l11lIlllIII1Il1Il;
   private float III1lIIIl11;
   private float l11l1Illl1IlllI1lIlIl111;
   private float II1IllIIlIIII11III11IIll1l11;
   private boolean IIlI11Il11l;

   public void EventBus(floatHolder_5 iil11iill1il1l1llilll1l1i1i1) {
      this.StringHolder_8(iil11iill1il1l1llilll1l1i1i1, 0.8F);
   }

   public void StringHolder_8(floatHolder_5 iil11iill1il1l1llilll1l1i1i1, float f) {
      float f1 = iil11iill1il1l1llilll1l1i1i1.I1lIIlI1I11I1ll1l11II1llI1lIl1();
      float f2 = iil11iill1il1l1llilll1l1i1i1.llll1I11IllIl1llII1IIlll1ll();
      float f3 = iil11iill1il1l1llilll1l1i1i1.Ill1I11IIIlII1();
      float f4 = iil11iill1il1l1llilll1l1i1i1.IIIll1I1lI1lllIIIIl1lI();
      if (this.IIlI11Il11l) {
         if (f1 == this.IlI1Il1II11l
            && f2 == this.l11lIlllIII1Il1Il
            && f3 == this.III1lIIIl11
            && f4 == this.l11l1Illl1IlllI1lIlIl111
            && f == this.II1IllIIlIIII11III11IIll1l11) {
            return;
         }

         this.flush();
      }

      this.IlI1Il1II11l = f1;
      this.l11lIlllIII1Il1Il = f2;
      this.III1lIIIl11 = f3;
      this.l11l1Illl1IlllI1lIlIl111 = f4;
      this.II1IllIIlIIII11III11IIll1l11 = f;
      ListHolder i1li1111liiiiliili1iiiliii1i = floatHolder_8.Ill1l1lI11Ill;
      i1li1111liiiiliili1iiiliii1i.IlllIllllII();
      i1li1111liiiiliili1iiiliii1i.CloudFriendInfo("Radius").set(f1, f2, f3, f4);
      i1li1111liiiiliili1iiiliii1i.CloudFriendInfo("Smoothness").set(f);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      this.Ill1IlI1IlIll1l11I1lIllI1lI = RenderSystem.renderThreadTesselator().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
      this.IIlI11Il11l = true;
   }

   public void EventBus(Matrix4f matrix4f, float f, float f1, float f2, float f3, ByteBufferHolder il1iliilli1l1iill) {
      float f4 = this.II1IllIIlIIII11III11IIll1l11;
      float f5 = -f4 / 2.0F + f4 * 2.0F;
      float f6 = f4 / 2.0F + f4;
      float f7 = f - f5 / 2.0F;
      float f8 = f1 - f6 / 2.0F;
      float f9 = f2 + f5;
      float f10 = f3 + f6;
      int i = il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII();
      this.Ill1IlI1IlIll1l11I1lIllI1lI.vertex(matrix4f, f7, f8, 0.0F).texture(f2, f3).color(i);
      this.Ill1IlI1IlIll1l11I1lIllI1lI.vertex(matrix4f, f7, f8 + f10, 0.0F).texture(f2, f3).color(i);
      this.Ill1IlI1IlIll1l11I1lIllI1lI.vertex(matrix4f, f7 + f9, f8 + f10, 0.0F).texture(f2, f3).color(i);
      this.Ill1IlI1IlIll1l11I1lIllI1lI.vertex(matrix4f, f7 + f9, f8, 0.0F).texture(f2, f3).color(i);
   }

   public void flush() {
      if (this.IIlI11Il11l) {
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(this.Ill1IlI1IlIll1l11I1lIllI1lI.end());
         RenderSystem.disableBlend();
         this.Ill1IlI1IlIll1l11I1lIllI1lI = null;
         this.IIlI11Il11l = false;
      }
   }

   public boolean lIl1I1I111llll11() {
      return this.IIlI11Il11l;
   }
}
