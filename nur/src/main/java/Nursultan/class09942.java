package Nursultan;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import net.fabricmc.loader.impl.mapping.RuntimeMappingRegistry;

public class class09942 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public boolean N_init;
   public static Object y_0 = new class09942();
   public static Object y_1;
   public static Object y_2;

   private static void L(String var0, String var1, String var2) {
      try {
         RuntimeMappingRegistry.registerMethodMapping("intermediary", var0, var1, null, var2);
         RuntimeMappingRegistry.registerMethodMapping("mappingfinder", var0, var1, null, var2);
      } catch (NoClassDefFoundError var4) {
      }
   }

   private class09942() {
      this.u();
      this.N_0 = new HashMap();
      this.N_1 = new HashMap();
      this.N_2 = new HashMap();
   }

   static {
      i();
   }

   private static void i() {
      y_0 = null;
      y_1 = "mappingfinder";
      y_2 = "intermediary";
   }

   private static void u(String var0, String var1, String var2) {
      try {
         RuntimeMappingRegistry.registerFieldMapping("intermediary", var0, var1, null, var2);
         RuntimeMappingRegistry.registerFieldMapping("mappingfinder", var0, var1, null, var2);
      } catch (NoClassDefFoundError var4) {
      }
   }

   private void u() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_3 = false;
         this.N_4 = false;
      }
   }

   private static void y(String var0, Class<?> var1) {
      try {
         RuntimeMappingRegistry.registerClassMapping("intermediary", var0, var1.getName());
         RuntimeMappingRegistry.registerClassMapping("mappingfinder", var0, var1.getName());
      } catch (NoClassDefFoundError var3) {
      }
   }

   private void y(String var1, String var2, String var3) {
      if (var2 != null && !var2.isEmpty()) {
         ((Map)this.N_2).put(new class09939(var1, var2), var3);
         u(var1, var2, var3);
      }
   }

   private void N(String var1, String var2, String var3) {
      if (var2 != null && !var2.isEmpty()) {
         ((Map)this.N_1).put(new class09939(var1, var2), var3);
         L(var1, var2, var3);
      }
   }

   public synchronized class09942 N(String var1, Class<?> var2) {
      ((Map)this.N_0).put(var1, var2);
      y(var1, var2);

      for (Method var6 : var2.getDeclaredMethods()) {
         class09956 var7 = var6.getAnnotation(class09956.class);
         if (var7 != null) {
            this.N(var1, var7.N(), var6.getName());
            this.N(var1, var7.y(), var6.getName());
            this.N(var1, var6.getName(), var6.getName());
         }
      }

      for (Field var11 : var2.getDeclaredFields()) {
         class09956 var12 = var11.getAnnotation(class09956.class);
         if (var12 != null) {
            this.y(var1, var12.N(), var11.getName());
            this.y(var1, var12.y(), var11.getName());
            this.y(var1, var11.getName(), var11.getName());
         }
      }

      return this;
   }

   public synchronized String N(String var1, String var2, String var3, String var4, String var5) {
      this.N();
      String var6 = (String)((Map)this.N_1).get(new class09939(var2, var3));
      if (var6 != null) {
         return var6;
      } else {
         var6 = (String)((Map)this.N_1).get(new class09939(var2, var5));
         if (var6 != null) {
            return var6;
         } else {
            Class var7 = (Class)((Map)this.N_0).get(var2);
            return var7 != null ? class09951.N(var7, var5) : var3;
         }
      }
   }

   public synchronized String N(String var1, String var2) {
      this.N();
      String var3 = (String)((Map)this.N_2).get(new class09939(var1, var2));
      return var3 != null ? var3 : var2;
   }

   public synchronized void N() {
      if (!(Boolean)this.N_3) {
         if ((Boolean)this.N_4) {
            throw new IllegalStateException("Recursive mapping bootstrap");
         } else {
            this.N_4 = true;

            try {
               class09948.N(this);
               this.N_3 = true;
            } finally {
               this.N_4 = false;
            }
         }
      }
   }
}
