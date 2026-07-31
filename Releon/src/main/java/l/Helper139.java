package l;

class Helper139 {
   public int x;
   public int y;
   public int width;
   public int height;

   Helper139() {
   }

   public void method1206(double var1, double var3, double var5, double var7) {
      this.x = Math.max(0, (int)Math.round(var1));
      this.y = Math.max(0, (int)Math.round(var3));
      this.width = Math.max(0, (int)Math.round(var5));
      this.height = Math.max(0, (int)Math.round(var7));
   }

   public void method1207(Helper139 var1) {
      int var2 = Math.max(this.x, var1.x);
      int var3 = Math.max(this.y, var1.y);
      int var4 = Math.min(this.x + this.width, var1.x + var1.width);
      int var5 = Math.min(this.y + this.height, var1.y + var1.height);
      this.x = var2;
      this.y = var3;
      this.width = Math.max(0, var4 - var2);
      this.height = Math.max(0, var5 - var3);
   }

   Helper139 method1208() {
      Helper139 var1 = new Helper139();
      var1.method1206(this.x, this.y, this.width, this.height);
      return var1;
   }
}
