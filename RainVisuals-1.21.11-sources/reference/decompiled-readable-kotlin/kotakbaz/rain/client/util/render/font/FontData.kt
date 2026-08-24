package kotakbaz.rain.client.util.render.font

import com.google.gson.annotations.SerializedName
import org.jetbrains.annotations.NotNull
import oxxxde.ال
import oxxxde.تخ
import oxxxde.دح
import oxxxde.صك
import oxxxde.ظأ

// $VF: Compiled from heavy
public class FontData {
   private FontData.AtlasData atlas = FontData.AtlasData();
   private FontData.MetricsData metrics = FontData.MetricsData();

   @SerializedName("kerning")
   @NotNull
   public final var kernings: List<تخ>

   public final var glyphs: List<دح> = CollectionsKt.emptyList()

   public final var atlas: ال

   public final var metrics: صك

   // $VF: Compiled from heavy
   public class AtlasData {
      @SerializedName("distanceRange")
      public final var range: Float

      public final var width: Float
      public final var height: Float
   }

   // $VF: Compiled from heavy
   public class BoundsData {
      public final var left: Float
      public final var top: Float
      public final var right: Float
      public final var bottom: Float
   }

   // $VF: Compiled from heavy
   public class GlyphData {
      private FontData.BoundsData atlasBounds;
      public final var unicode: Int
      public final var advance: Float
      private FontData.BoundsData planeBounds;

      public final var planeBounds: ظأ?

      public final var atlasBounds: ظأ?
   }

   // $VF: Compiled from heavy
   public class MetricsData {
      public final var descender: Float
      public final var ascender: Float
      public final var lineHeight: Float

      public fun baselineHeight(): Float {
         return this.lineHeight + this.descender
      }
   }
}
