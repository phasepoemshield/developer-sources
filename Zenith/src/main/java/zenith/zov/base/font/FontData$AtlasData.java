package zenith.zov.base.font;

import com.google.gson.annotations.SerializedName;

public final class FontData$AtlasData {
   @SerializedName("distanceRange")
   private float range;
   private float width;
   private float height;

   public float range() {
      return this.range;
   }

   public float width() {
      return this.width;
   }

   public float height() {
      return this.height;
   }
}
