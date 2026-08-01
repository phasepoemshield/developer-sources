package l;

import java.lang.reflect.Proxy;

class Helper231 {
   final int kind;
   final Object fixed;
   final Class<?> iface;

   Helper231(int var1, Object var2, Class<?> var3) {
      this.kind = var1;
      this.fixed = var2;
      this.iface = var3;
   }

   static Helper231 method2093(Object var0) {
      return new Helper231(0, var0, null);
   }

   static Helper231 method2094() {
      return new Helper231(1, null, null);
   }

   static Helper231 method2095() {
      return new Helper231(2, null, null);
   }

   static Helper231 method2096() {
      return new Helper231(3, null, null);
   }

   static Helper231 method2097(Class<?> var0) {
      return new Helper231(4, null, var0);
   }

   Object method2098(Object var1) {
      if (this.kind == 1) {
         return var1;
      } else if (this.kind == 2) {
         return false;
      } else if (this.kind == 3) {
         return 0;
      } else {
         return this.kind == 4 ? this.method2099(this.iface) : this.fixed;
      }
   }

   Object method2099(Class<?> var1) {
      try {
         return Proxy.newProxyInstance(var1.getClassLoader(), new Class[]{var1}, (var0, var1x, var2) -> {
            Class var3x = var1x.getReturnType();
            if (var3x == boolean.class || var3x == Boolean.class) {
               return false;
            } else if (var3x == int.class || var3x == Integer.class) {
               return 0;
            } else if (var3x == float.class || var3x == Float.class) {
               return 0.0F;
            } else {
               return var3x != double.class && var3x != Double.class ? null : 0.0;
            }
         });
      } catch (Throwable var3) {
         return null;
      }
   }
}
