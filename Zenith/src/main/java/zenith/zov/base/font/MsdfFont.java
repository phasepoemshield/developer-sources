package zenith.zov.base.font;

import java.util.Map;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.text.Text;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.VertexConsumer;
import org.joml.Matrix4f;
import zenith.ZenithInternal027;
import zenith.ZenithInternal076;

public final class MsdfFont implements ZenithInternal076 {
   private final String name;
   private final AbstractTexture texture;
   private final FontData$AtlasData atlas;
   private final FontData$MetricsData metrics;
   private final Map<Integer, MsdfGlyph> glyphs;
   private final Map<Integer, Map<Integer, Float>> kernings;

   private MsdfFont(
      String s,
      AbstractTexture AbstractTexture,
      FontData$AtlasData fontdata$atlasdata,
      FontData$MetricsData fontdata$metricsdata,
      Map<Integer, MsdfGlyph> map,
      Map<Integer, Map<Integer, Float>> map1
   ) {
      this.name = s;
      this.texture = AbstractTexture;
      this.atlas = fontdata$atlasdata;
      this.metrics = fontdata$metricsdata;
      this.glyphs = map;
      this.kernings = map1;
   }

   public int getTextureId() {
      return this.texture.getGlId();
   }

   public boolean hasGlyph(int i) {
      return this.glyphs.containsKey(i);
   }

   public void applyGlyphs(Matrix4f matrix4f, VertexConsumer VertexConsumer, String s, float f, float f1, float f2, float f3, float f4, float f5, int i) {
      this.texture.setFilter(true, true);
      int j = -1;
      boolean flag = false;

      for (int k = 0; k < s.length(); k++) {
         char c0 = s.charAt(k);
         if (flag) {
            flag = false;
         } else if (c0 == 167) {
            flag = true;
         } else {
            MsdfGlyph msdfglyph = this.glyphs.get(Integer.valueOf(c0));
            if (msdfglyph != null) {
               Map map = this.kernings.get(j);
               if (map != null) {
                  f3 += map.getOrDefault(Integer.valueOf(c0), 0.0F) * f;
               }

               f3 += msdfglyph.apply(matrix4f, VertexConsumer, f, f3, f4, f5, i) + f1 + f2;
               j = c0;
            }
         }
      }
   }

   public void applyGlyphs(
      Matrix4f matrix4f, VertexConsumer VertexConsumer, String s, float f, float f1, float f2, float f3, float f4, float f5, ZenithInternal027 i1li1li11i11l1111
   ) {
      this.texture.setFilter(true, true);
      int i = -1;
      boolean flag = false;

      for (int j = 0; j < s.length(); j++) {
         char c0 = s.charAt(j);
         if (flag) {
            flag = false;
         } else if (c0 == 167) {
            flag = true;
         } else {
            MsdfGlyph msdfglyph = this.glyphs.get(Integer.valueOf(c0));
            if (msdfglyph != null) {
               Map map = this.kernings.get(i);
               if (map != null) {
                  f3 += map.getOrDefault(Integer.valueOf(c0), 0.0F) * f;
               }

               f3 += msdfglyph.apply(matrix4f, VertexConsumer, f, f3, f4, f5, i1li1li11i11l1111) + f1 + f2;
               i = c0;
            }
         }
      }
   }

   public float getWidth(String s, float f) {
      int i = -1;
      float f1 = 0.0F;
      boolean flag = false;
      s = s.replace("ᴀ", "A")
         .replace("ʙ", "B")
         .replace("ᴄ", "C")
         .replace("ᴅ", "D")
         .replace("ᴇ", "E")
         .replace("ꜰ", "F")
         .replace("ɢ", "G")
         .replace("ʜ", "H")
         .replace("ɪ", "I")
         .replace("ᴊ", "J")
         .replace("ᴋ", "K")
         .replace("ʟ", "L")
         .replace("ᴍ", "M")
         .replace("ɴ", "N")
         .replace("ᴏ", "O")
         .replace("ᴘ", "P")
         .replace("ʀ", "R")
         .replace("ꜱ", "S")
         .replace("ᴛ", "T")
         .replace("ᴜ", "U")
         .replace("ᴠ", "V")
         .replace("ᴡ", "W")
         .replace("ʏ", "Y")
         .replace("ᴢ", "Z")
         .replace("ǫ", "Q")
         .replace("ʠ", "Q");

      for (int j = 0; j < s.length(); j++) {
         char c0 = s.charAt(j);
         if (flag) {
            flag = false;
         } else if (c0 == 167) {
            flag = true;
         } else {
            MsdfGlyph msdfglyph = this.glyphs.get(Integer.valueOf(c0));
            if (msdfglyph != null) {
               Map map = this.kernings.get(i);
               if (map != null) {
                  f1 += map.getOrDefault(Integer.valueOf(c0), 0.0F) * f;
               }

               f1 += msdfglyph.getWidth(f);
               i = c0;
            }
         }
      }

      return f1;
   }

   public float getTextWidth(Text Text, float f) {
      return this.getTextWidthWithVanillaFallback(Text, f);
   }

   private float getTextWidthWithVanillaFallback(Text Text, float f) {
      TextRenderer TextRenderer = l11I1I1ll1Illll1I1l1111l1II.textRenderer;
      float f1 = 0.0F;

      for (FormattedTextProcessor$TextSegment formattedtextprocessor$textsegment : FormattedTextProcessor.processText(Text, -1)) {
         f1 += this.getWidthWithVanillaFallback(formattedtextprocessor$textsegment.text(), f, TextRenderer);
      }

      return f1;
   }

   private float getWidthWithVanillaFallback(String s, float f, TextRenderer TextRenderer) {
      s = this.normalizeTextForMsdf(s);
      StringBuilder stringbuilder = new StringBuilder();
      boolean flag = false;
      boolean flag1 = false;
      float f1 = 0.0F;
      int i = 0;

      while (i < s.length()) {
         int j = s.codePointAt(i);
         int k = i + Character.charCount(j);
         if (j == 167) {
            i = this.skipFormattingCode(s, k);
         } else {
            boolean flag2 = this.canRenderWithMsdf(j);
            if (flag && flag1 != flag2) {
               f1 += this.getRunWidth(stringbuilder.toString(), flag1, f, TextRenderer);
               stringbuilder.setLength(0);
            }

            stringbuilder.append(s, i, k);
            flag = true;
            flag1 = flag2;
            i = k;
         }
      }

      if (flag) {
         f1 += this.getRunWidth(stringbuilder.toString(), flag1, f, TextRenderer);
      }

      return f1;
   }

   private float getRunWidth(String s, boolean flag, float f, TextRenderer TextRenderer) {
      return flag ? this.getWidth(s, f) : (float)TextRenderer.getWidth(s) * this.vanillaTextScale(TextRenderer, f);
   }

   private float vanillaTextScale(TextRenderer TextRenderer, float f) {
      return f / Math.max(1.0F, 9.0F);
   }

   private boolean canRenderWithMsdf(int i) {
      return i <= 65535 && this.hasGlyph(i);
   }

   private int skipFormattingCode(String s, int i) {
      return i >= s.length() ? i : i + Character.charCount(s.codePointAt(i));
   }

   private String normalizeTextForMsdf(String s) {
      return s.replace("ᴀ", "A")
         .replace("ʙ", "B")
         .replace("ᴄ", "C")
         .replace("ᴅ", "D")
         .replace("ᴇ", "E")
         .replace("ꜰ", "F")
         .replace("ɢ", "G")
         .replace("ʜ", "H")
         .replace("ɪ", "I")
         .replace("ᴊ", "J")
         .replace("ᴋ", "K")
         .replace("ʟ", "L")
         .replace("ᴍ", "M")
         .replace("ɴ", "N")
         .replace("ᴏ", "O")
         .replace("ᴘ", "P")
         .replace("ʀ", "R")
         .replace("ꜱ", "S")
         .replace("ᴛ", "T")
         .replace("ᴜ", "U")
         .replace("ᴠ", "V")
         .replace("ᴡ", "W")
         .replace("ʏ", "Y")
         .replace("ᴢ", "Z")
         .replace("ǫ", "Q")
         .replace("ʠ", "Q");
   }

   public Font getFont(float f) {
      return new Font(this, f);
   }

   public static MsdfFont$Builder builder() {
      return new MsdfFont$Builder();
   }

   public String getName() {
      return this.name;
   }

   public FontData$AtlasData getAtlas() {
      return this.atlas;
   }

   public FontData$MetricsData getMetrics() {
      return this.metrics;
   }
}
