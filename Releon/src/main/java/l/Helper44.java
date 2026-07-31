package l;

public final class Helper44 extends Helper108<Helper58> {
   private Helper115 size;
   private Helper127 radius;
   private Helper172 color;
   private float smoothness;
   private float blurRadius;

   public Helper44() {
   }

   public Helper44 method585(Helper115 var1) {
      this.size = var1;
      return this;
   }

   public Helper44 method586(Helper127 var1) {
      this.radius = var1;
      return this;
   }

   public Helper44 method587(Helper172 var1) {
      this.color = var1;
      return this;
   }

   public Helper44 method588(float var1) {
      this.smoothness = var1;
      return this;
   }

   public Helper44 method589(float var1) {
      this.blurRadius = var1;
      return this;
   }

   protected Helper58 method567() {
      return new Helper58(this.size, this.radius, this.color, this.smoothness, this.blurRadius);
   }

   @Override
   protected void method566() {
      this.size = Helper115.NONE;
      this.radius = Helper127.NO_ROUND;
      this.color = Helper172.WHITE;
      this.smoothness = 1.0F;
      this.blurRadius = 0.0F;
   }
}
