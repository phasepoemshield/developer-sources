package zenith.zov.base.font;

import com.google.gson.annotations.SerializedName;

public final class FontData$KerningData {
   @SerializedName("unicode1")
   private int leftChar;
   @SerializedName("unicode2")
   private int rightChar;
   private float advance;

   public int leftChar() {
      return this.leftChar;
   }

   public int rightChar() {
      return this.rightChar;
   }

   public float advance() {
      return this.advance;
   }
}
