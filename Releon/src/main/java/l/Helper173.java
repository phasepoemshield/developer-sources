package l;

class Helper173 implements Helper174 {
   final Helper175 this$0;
   private float widthLeft;
   private int length;

   public Helper173(Helper175 var1, float var2) {
      this.this$0 = var1;
      this.widthLeft = var2;
   }

   @Override
   public boolean method1466(int var1, char var2) {
      Helper100 var3 = this.this$0.method1470(var2);
      if (var3 != null) {
         this.widthLeft = this.widthLeft - var3.method917();
         if (this.widthLeft >= 0.0F) {
            this.length = var1 + 1;
            return true;
         }
      }

      return false;
   }

   public int method1467() {
      return this.length;
   }
}
