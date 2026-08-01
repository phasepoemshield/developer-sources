package l;

import java.lang.reflect.Method;

class Helper123 {
   private final Object source;
   private final Method target;
   private final byte priority;

   Helper123(Object var1, Method var2, byte var3) {
      this.source = var1;
      this.target = var2;
      this.priority = var3;
   }

   public Object method1013() {
      return this.source;
   }

   public Method method1014() {
      return this.target;
   }

   public byte method1015() {
      return this.priority;
   }
}
