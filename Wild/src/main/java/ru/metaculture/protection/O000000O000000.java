package ru.metaculture.protection;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.wild.module.api.Module;

public final class O000000O000000 {
   private static final O000000O000000 O00000000 = new O000000O000000();
   private final List<O000000O000000.W25> O000000000 = new CopyOnWriteArrayList<>();

   private O000000O000000() {
      O00000OOOO0O00.O00000000().O00000000(this::O00000000);
      O00000OOOO0O00.O00000000().O000000000(this::O00000000);
   }

   public static O000000O000000 O00000000() {
      return O00000000;
   }

   public synchronized void O00000000(Module module, O000000O00000 o000000O00000) {
      this.O00000000((Object)module, o000000O00000);
   }

   public synchronized void O00000000(O0000000OOO00 o0000000OOO00, O000000O00000 o000000O00000) {
      this.O00000000((Object)o0000000OOO00, o000000O00000);
   }

   private void O00000000(Object object, O000000O00000 o000000O00000) {
      if (object != null && o000000O00000 != null) {
         this.O0000000000(object);
         O000000O000000.W25 var3 = new O000000O000000.W25(object, o000000O00000);
         this.O000000000.add(var3);
         this.O00000000(var3);
      }
   }

   public synchronized void O00000000(Module module) {
      this.O00000000((Object)module);
   }

   public synchronized void O00000000(O0000000OOO00 o0000000OOO00) {
      this.O00000000((Object)o0000000OOO00);
   }

   private void O00000000(Object object) {
      if (object != null) {
         this.O0000000000(object);
         O000000000();
      }
   }

   public void O000000000(Module module, O000000O00000 o000000O00000) {
      this.O000000000((Object)module, o000000O00000);
   }

   public void O000000000(O0000000OOO00 o0000000OOO00, O000000O00000 o000000O00000) {
      this.O000000000((Object)o0000000OOO00, o000000O00000);
   }

   private void O000000000(Object object, O000000O00000 o000000O00000) {
      if (object != null && o000000O00000 != null) {
         O000000O000000.W25 var3 = this.O000000000(object);
         if (var3 != null) {
            this.O00000000(var3);
         }

         ArrayList var4 = new ArrayList();

         for (Setting var6 : O00000000000(object)) {
            if (var6 != null && var6.O0000000000) {
               var4.add(var6);
            }
         }

         if (!var4.isEmpty()) {
            if (o000000O00000.O000000000000()) {
               String var7 = o000000O00000.O00000000000();
               if (var7 != null && !var7.isBlank() && !"None".equalsIgnoreCase(var7)) {
                  O00000OOOO0O.O00000000(var7, var4);
               }
            } else {
               O00000OOOO00O var8 = o000000O00000.O0000000000();
               if (var8 != null) {
                  O00000OOOO0O.O00000000(var8, var4);
               }
            }
         }
      }
   }

   private O000000O000000.W25 O000000000(Object object) {
      for (O000000O000000.W25 var3 : this.O000000000) {
         Object var4 = var3.O00000000.get();
         if (var4 == object) {
            return var3;
         }
      }

      return null;
   }

   private void O00000000(O00000OOOO00O o00000OOOO00O) {
      if (o00000OOOO00O != null) {
         for (O000000O000000.W25 var3 : this.O000000000) {
            O000000O00000 var4 = var3.O000000000;
            if (var4 != null && !var4.O000000000000() && var4.O0000000000() == o00000OOOO00O) {
               this.O00000000(var3);
            }
         }
      }
   }

   private void O00000000(String string) {
      if (string != null) {
         String var2 = O00000OOOO0O00.O00000000000OO(string);

         for (O000000O000000.W25 var4 : this.O000000000) {
            O000000O00000 var5 = var4.O000000000;
            if (var5 != null && var5.O000000000000()) {
               String var6 = var5.O00000000000();
               if (var6 != null && var2.equals(O00000OOOO0O00.O00000000000OO(var6))) {
                  this.O00000000(var4);
               }
            }
         }
      }
   }

   private synchronized void O0000000000(Object object) {
      for (O000000O000000.W25 var3 : this.O000000000) {
         Object var4 = var3.O00000000.get();
         if (var4 == null) {
            this.O000000000.remove(var3);
         } else if (var4 == object) {
            if (!var3.O0000000000.isEmpty()) {
               O000000000(var4, var3.O0000000000);
            }

            this.O000000000.remove(var3);
         }
      }
   }

   private synchronized void O00000000(O000000O000000.W25 o00000000) {
      Object var2 = o00000000.O00000000.get();
      if (var2 == null) {
         this.O000000000.remove(o00000000);
      } else {
         String var3;
         List var4;
         if (o00000000.O000000000.O000000000000()) {
            String var5 = o00000000.O000000000.O00000000000();
            if (var5 == null || var5.isBlank() || "None".equalsIgnoreCase(var5)) {
               O00000000(var2, o00000000);
               o00000000.O00000000000 = "";
               o00000000.O000000000000 = "";
               return;
            }

            var3 = O00000OOOO0O.O0000000000(var5);
            var4 = O00000OOOO0O.O0000000000000(var5);
            String var6 = "name:" + O00000OOOO0O00.O00000000000OO(var5);
            if (Objects.equals(o00000000.O00000000000, var3) && Objects.equals(o00000000.O000000000000, var6)) {
               return;
            }

            o00000000.O000000000000 = var6;
         } else {
            O00000OOOO00O var7 = o00000000.O000000000.O0000000000();
            if (var7 == null) {
               O00000000(var2, o00000000);
               o00000000.O00000000000 = "";
               o00000000.O000000000000 = "";
               return;
            }

            var3 = O00000OOOO0O.O0000000000(var7);
            var4 = O00000OOOO0O.O0000000000000(var7);
            String var9 = "target:" + var7.O00000000();
            if (Objects.equals(o00000000.O00000000000, var3) && Objects.equals(o00000000.O000000000000, var9)) {
               return;
            }

            o00000000.O000000000000 = var9;
         }

         o00000000.O00000000000 = var3 == null ? "" : var3;
         O00000000(var2, o00000000);
         if (var4 != null && !var4.isEmpty()) {
            for (Setting var10 : (List<Setting>)var4) {
               if (var10 != null) {
                  var10.O0000000000 = true;
               }
            }

            o00000000.O0000000000.addAll(var4);
            O00000000(var2, var4);
            O000000000();
         }
      }
   }

   private static void O00000000(Object object, O000000O000000.W25 o00000000) {
      if (!o00000000.O0000000000.isEmpty()) {
         O000000000(object, o00000000.O0000000000);
         o00000000.O0000000000.clear();
         O000000000();
      }
   }

   private static List<Setting> O00000000000(Object object) {
      if (object instanceof Module var2) {
         return var2.O0000000000O();
      } else {
         return object instanceof O0000000OOO00 var1 ? var1.O00000000() : List.of();
      }
   }

   private static void O00000000(Object object, List<Setting> list) {
      if (object instanceof Module var2) {
         var2.O00000000(list.toArray(new Setting[0]));
      } else if (object instanceof O0000000OOO00 var3) {
         var3.O00000000(list.toArray(new Setting[0]));
      }
   }

   private static void O000000000(Object object, List<Setting> list) {
      if (object instanceof Module var2) {
         var2.O00000000(list);
      } else if (object instanceof O0000000OOO00 var3) {
         var3.O00000000(list);
      }
   }

   private static void O000000000() {
      try {
         if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null) {
            ClickGui var0 = WildClient.O00000000.O0000000000O.O00000000000O0();
            if (var0 != null) {
               var0.O000000000000O();
            }
         }
      } catch (Throwable var1) {
      }
   }

   static final class W25 {
      final WeakReference<Object> O00000000;
      final O000000O00000 O000000000;
      final List<Setting> O0000000000 = new ArrayList<>();
      String O00000000000 = "";
      String O000000000000 = "";

      W25(Object object, O000000O00000 o000000O00000) {
         this.O00000000 = new WeakReference<>(object);
         this.O000000000 = o000000O00000;
      }
   }
}
