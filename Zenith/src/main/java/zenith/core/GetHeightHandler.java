package zenith;

public class GetHeightHandler {
   // $VF: renamed from: x float
   float field_235;
   // $VF: renamed from: y float
   float field_236;
   float width;
   float height;

   public boolean byteHolder(double d0, double d1) {
      return doubleHolder_3.StringHolder_8(d0, d1, (double)this.field_235, (double)this.field_236, (double)this.width, (double)this.height);
   }

   public GetHeightHandler(float f, float f1, float f2, float f3) {
      this.field_235 = f;
      this.field_236 = f1;
      this.width = f2;
      this.height = f3;
   }

   public float getX() {
      return this.field_235;
   }

   public float getY() {
      return this.field_236;
   }

   public float getWidth() {
      return this.width;
   }

   public float getHeight() {
      return this.height;
   }

   public void setX(float f) {
      this.field_235 = f;
   }

   public void setY(float f) {
      this.field_236 = f;
   }

   public void setWidth(float f) {
      this.width = f;
   }

   public void setHeight(float f) {
      this.height = f;
   }

   @Override
   public boolean equals(Object object) {
      if (object == this) {
         return true;
      } else if (!(object instanceof GetHeightHandler l1l1ii11lllll)) {
         return false;
      } else if (!l1l1ii11lllll.EventTarget(this)) {
         return false;
      } else if (Float.compare(this.getX(), l1l1ii11lllll.getX()) != 0) {
         return false;
      } else if (Float.compare(this.getY(), l1l1ii11lllll.getY()) != 0) {
         return false;
      } else {
         return Float.compare(this.getWidth(), l1l1ii11lllll.getWidth()) != 0 ? false : Float.compare(this.getHeight(), l1l1ii11lllll.getHeight()) == 0;
      }
   }

   protected boolean EventTarget(Object object) {
      return object instanceof GetHeightHandler;
   }

   @Override
   public int hashCode() {
      byte b0 = 59;
      int i = 1;
      i = i * 59 + Float.floatToIntBits(this.getX());
      i = i * 59 + Float.floatToIntBits(this.getY());
      i = i * 59 + Float.floatToIntBits(this.getWidth());
      return i * 59 + Float.floatToIntBits(this.getHeight());
   }

   @Override
   public String toString() {
      return "ChangeRect(x=" + this.getX() + ", y=" + this.getY() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ")";
   }
}
