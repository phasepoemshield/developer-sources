package zenith.zov.base.font;

import net.minecraft.text.Text;

public class Font {
   private MsdfFont font;
   private float size;

   public float height() {
      return MsdfRenderer.textLineOffset(this.font, this.size);
   }

   public float getStringHeight(String s) {
      float f = 0.0F;
      float f1 = 0.0F;

      for (char c0 : (s.isEmpty() ? " " : s).toCharArray()) {
         if (c0 == '\n') {
            f = f == 0.0F ? this.height() : f;
            f1 += f;
            f = 0.0F;
         } else {
            f = Math.max(this.height(), f);
         }
      }

      return f + f1;
   }

   public float width(String s) {
      return this.font.getWidth(s, this.size);
   }

   public float width(Text Text) {
      return this.font.getTextWidth(Text, this.size);
   }

   public MsdfFont getFont() {
      return this.font;
   }

   public float getSize() {
      return this.size;
   }

   public Font(MsdfFont msdffont, float f) {
      this.font = msdffont;
      this.size = f;
   }
}
