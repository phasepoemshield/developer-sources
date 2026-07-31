package l;

public final class Helper78 extends Helper108<Helper170> {
   private Helper115 size;
   private Helper127 radius;
   private Helper172 color;
   private float smoothness;

   public Helper78() {
   }

   public Helper78 method818(Helper115 var1) {
      this.size = var1;
      return this;
   }

   public Helper78 method819(Helper127 var1) {
      this.radius = var1;
      return this;
   }

   public Helper78 method820(Helper172 var1) {
      this.color = var1;
      return this;
   }

   public Helper78 method821(float var1) {
      this.smoothness = var1;
      return this;
   }

   protected Helper170 method567() {
      return new Helper170(this.size, this.radius, this.color, this.smoothness);
   }

   @Override
   protected void method566() {
      this.size = Helper115.NONE;
      this.radius = Helper127.NO_ROUND;
      this.color = Helper172.TRANSPARENT;
      this.smoothness = 1.0F;
   }
}
