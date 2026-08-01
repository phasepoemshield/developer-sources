package l;

public class Helper127 {
   private final float radius1;
   private final float radius2;
   private final float radius3;
   private final float radius4;
   public static final Helper127 NO_ROUND = new Helper127(0.0F, 0.0F, 0.0F, 0.0F);

   public Helper127(double var1, double var3, double var5, double var7) {
      this((float)var1, (float)var3, (float)var5, (float)var7);
   }

   public Helper127(double var1) {
      this(var1, var1, var1, var1);
   }

   public Helper127(float var1) {
      this(var1, var1, var1, var1);
   }

   public Helper127(float var1, float var2, float var3, float var4) {
      this.radius1 = var1;
      this.radius2 = var2;
      this.radius3 = var3;
      this.radius4 = var4;
   }

   public float method1039() {
      return this.radius1;
   }

   public float method1040() {
      return this.radius2;
   }

   public float method1041() {
      return this.radius3;
   }

   public float method1042() {
      return this.radius4;
   }
}
