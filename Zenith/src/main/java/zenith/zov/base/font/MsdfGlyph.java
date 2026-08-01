package zenith.zov.base.font;

import net.minecraft.client.render.VertexConsumer;
import org.joml.Matrix4f;
import zenith.ZenithInternal027;

public final class MsdfGlyph {
   private final int code;
   private final float minU;
   private final float maxU;
   private final float minV;
   private final float maxV;
   private final float advance;
   private final float topPosition;
   private final float width;
   private final float height;

   public MsdfGlyph(FontData$GlyphData fontdata$glyphdata, float f, float f1) {
      this.code = fontdata$glyphdata.unicode();
      this.advance = fontdata$glyphdata.advance();
      FontData$BoundsData fontdata$boundsdata = fontdata$glyphdata.atlasBounds();
      if (fontdata$boundsdata != null) {
         this.minU = fontdata$boundsdata.left() / f;
         this.maxU = fontdata$boundsdata.right() / f;
         this.minV = 1.0F - fontdata$boundsdata.isFinished() / f1;
         this.maxV = 1.0F - fontdata$boundsdata.bottom() / f1;
      } else {
         this.minU = this.maxU = this.minV = this.maxV = 0.0F;
      }

      FontData$BoundsData fontdata$boundsdata1 = fontdata$glyphdata.planeBounds();
      if (fontdata$boundsdata1 != null) {
         this.width = fontdata$boundsdata1.right() - fontdata$boundsdata1.left();
         this.height = fontdata$boundsdata1.isFinished() - fontdata$boundsdata1.bottom();
         this.topPosition = fontdata$boundsdata1.isFinished();
      } else {
         this.width = this.height = this.topPosition = 0.0F;
      }
   }

   public float apply(Matrix4f matrix4f, VertexConsumer VertexConsumer, float f, float f1, float f2, float f3, int i) {
      f2 -= this.topPosition * f;
      float f4 = this.width * f;
      float f5 = this.height * f;
      VertexConsumer.vertex(matrix4f, f1, f2, f3).texture(this.minU, this.minV).color(i);
      VertexConsumer.vertex(matrix4f, f1, f2 + f5, f3).texture(this.minU, this.maxV).color(i);
      VertexConsumer.vertex(matrix4f, f1 + f4, f2 + f5, f3).texture(this.maxU, this.maxV).color(i);
      VertexConsumer.vertex(matrix4f, f1 + f4, f2, f3).texture(this.maxU, this.minV).color(i);
      return this.advance * f;
   }

   public float apply(Matrix4f matrix4f, VertexConsumer VertexConsumer, float f, float f1, float f2, float f3, ZenithInternal027 i1li1li11i11l1111) {
      f2 -= this.topPosition * f;
      float f4 = this.width * f;
      float f5 = this.height * f;
      VertexConsumer.vertex(matrix4f, f1, f2, f3)
         .texture(this.minU, this.minV)
         .color(i1li1li11i11l1111.IlIIII1l1IIIll11IIllI11ll().lllIlll1Ill111l111Il11II11lII());
      VertexConsumer.vertex(matrix4f, f1, f2 + f5, f3)
         .texture(this.minU, this.maxV)
         .color(i1li1li11i11l1111.l1l11lIIIllIll1().lllIlll1Ill111l111Il11II11lII());
      VertexConsumer.vertex(matrix4f, f1 + f4, f2 + f5, f3)
         .texture(this.maxU, this.maxV)
         .color(i1li1li11i11l1111.ll1IIIIIIl11l().lllIlll1Ill111l111Il11II11lII());
      VertexConsumer.vertex(matrix4f, f1 + f4, f2, f3)
         .texture(this.maxU, this.minV)
         .color(i1li1li11i11l1111.IIIlIllI1l1Il111IIII().lllIlll1Ill111l111Il11II11lII());
      return this.advance * f;
   }

   public float getWidth(float f) {
      return this.advance * f;
   }

   public int getCharCode() {
      return this.code;
   }
}
