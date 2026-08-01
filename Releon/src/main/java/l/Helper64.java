package l;

public final class Helper64 extends Helper108<Helper125> {
   private Helper115 size;
   private Helper127 radius;
   private Helper172 color;
   private float thickness;
   private float internalSmoothness;
   private float externalSmoothness;

   public Helper64() {
   }

   public Helper64 method679(Helper115 var1) {
      this.size = var1;
      return this;
   }

   public Helper64 method680(Helper127 var1) {
      this.radius = var1;
      return this;
   }

   public Helper64 method681(Helper172 var1) {
      this.color = var1;
      return this;
   }

   public Helper64 method682(float var1) {
      this.thickness = var1;
      return this;
   }

   public Helper64 method683(float var1, float var2) {
      this.internalSmoothness = var1;
      this.externalSmoothness = var2;
      return this;
   }

   protected Helper125 method567() {
      return new Helper125(this.size, this.radius, this.color, this.thickness, this.internalSmoothness, this.externalSmoothness);
   }

   @Override
   protected void method566() {
      this.size = Helper115.NONE;
      this.radius = Helper127.NO_ROUND;
      this.color = Helper172.TRANSPARENT;
      this.thickness = 0.0F;
      this.internalSmoothness = 1.0F;
      this.externalSmoothness = 1.0F;
   }
}
