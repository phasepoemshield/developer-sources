package l;

class Helper131 {
   final int red;
   final int green;
   final int blue;
   final int alpha;

   public int method1074() {
      return this.red;
   }

   public int method1075() {
      return this.green;
   }

   public int method1076() {
      return this.blue;
   }

   public int method1077() {
      return this.alpha;
   }

   public Helper131(int var1, int var2, int var3, int var4) {
      this.red = var1;
      this.green = var2;
      this.blue = var3;
      this.alpha = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Helper131 var2)) {
         return false;
      } else if (!var2.method1078(this)) {
         return false;
      } else if (this.method1074() != var2.method1074()) {
         return false;
      } else if (this.method1075() != var2.method1075()) {
         return false;
      } else {
         return this.method1076() != var2.method1076() ? false : this.method1077() == var2.method1077();
      }
   }

   protected boolean method1078(Object var1) {
      return var1 instanceof Helper131;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + this.method1074();
      var2 = var2 * 59 + this.method1075();
      var2 = var2 * 59 + this.method1076();
      return var2 * 59 + this.method1077();
   }
}
