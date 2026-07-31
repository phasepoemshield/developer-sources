package zenith.zov.base.font;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class FontData {
   private FontData$AtlasData atlas;
   private FontData$MetricsData metrics;
   private List<FontData$GlyphData> glyphs;
   @SerializedName("kerning")
   private List<FontData$KerningData> kernings;

   public FontData$AtlasData atlas() {
      return this.atlas;
   }

   public FontData$MetricsData metrics() {
      return this.metrics;
   }

   public List<FontData$GlyphData> glyphs() {
      return this.glyphs;
   }

   public List<FontData$KerningData> kernings() {
      return this.kernings;
   }
}
