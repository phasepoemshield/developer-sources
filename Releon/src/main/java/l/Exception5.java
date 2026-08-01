package l;

public final class Exception5 extends RuntimeException {
   private final String message;
   private final String moduleName;

   public Exception5(String var1, String var2) {
      this.message = var1;
      this.moduleName = var2;
   }

   @Override
   public String getMessage() {
      return this.message;
   }

   public String method2323() {
      return this.moduleName;
   }

   @Override
   public String toString() {
      return "ModuleException(message=" + this.getMessage() + ", moduleName=" + this.method2323() + ")";
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Exception5 var2)) {
         return false;
      } else if (!var2.method2324(this)) {
         return false;
      } else if (!super.equals(var1)) {
         return false;
      } else {
         String var3 = this.getMessage();
         String var4 = var2.getMessage();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            String var5 = this.method2323();
            String var6 = var2.method2323();
            return var5 == null ? var6 == null : var5.equals(var6);
         } else {
            return false;
         }
      }
   }

   protected boolean method2324(Object var1) {
      return var1 instanceof Exception5;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = super.hashCode();
      String var3 = this.getMessage();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      String var4 = this.method2323();
      return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
   }
}
