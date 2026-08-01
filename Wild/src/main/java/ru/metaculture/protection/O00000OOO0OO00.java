package ru.metaculture.protection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public final class O00000OOO0OO00 {
   private final Map<String, O00000OOO0OO0O> O00000000 = new LinkedHashMap<>();
   private final List<O00000OOO0OO0> O000000000 = new ArrayList<>();
   private final O00000OOO0O000 O0000000000 = new O00000OOO0O000();
   private int O00000000000;
   private String O000000000000 = "preview";

   public O00000OOO0O000 O00000000() {
      return this.O0000000000;
   }

   public void O00000000(O00000OOO0O000 o00000OOO0O000) {
      this.O0000000000.O00000000(o00000OOO0O000);
      this.O00000000000++;
   }

   public String O000000000() {
      return this.O000000000000;
   }

   public void O00000000(String string) {
      if (string != null && !string.isBlank() && !this.O000000000000.equals(string)) {
         this.O000000000000 = string;
         this.O00000000000++;
      }
   }

   public O00000OOO0OO0O O00000000(String string, float f, float g, O00000OOO0OOO o00000OOO0OOO) {
      String var5 = O0000000000000(string);
      O00000OOO0OO0O var6 = new O00000OOO0OO0O(var5, string, f, g);
      O00000OOO0O00O var7 = o00000OOO0OOO.O00000000(string);
      if (var7 != null) {
         var6.O00000000(var7.O00000000000());
      }

      this.O00000000.put(var5, var6);
      this.O00000000000++;
      return var6;
   }

   public void O00000000(O00000OOO0OO0O o00000OOO0OO0O, O00000OOO0OOO o00000OOO0OOO) {
      Objects.requireNonNull(o00000OOO0OO0O, "node");
      O00000OOO0O00O var3 = o00000OOO0OOO.O00000000(o00000OOO0OO0O.O000000000());
      if (var3 != null) {
         o00000OOO0OO0O.O00000000(var3.O00000000000());
      }

      this.O00000000.put(o00000OOO0OO0O.O00000000(), o00000OOO0OO0O);
      this.O00000000000++;
   }

   public boolean O000000000(String string) {
      O00000OOO0OO0O var2 = this.O00000000.remove(string);
      if (var2 == null) {
         return false;
      } else {
         this.O000000000.removeIf(o00000OOO0OO0 -> o00000OOO0OO0.O00000000().equals(string) || o00000OOO0OO0.O0000000000().equals(string));
         this.O00000000000++;
         return true;
      }
   }

   public boolean O00000000(String string, String string2, String string3, String string4, O00000OOO0OOO o00000OOO0OOO) {
      O00000OOO0OO0O var6 = this.O00000000.get(string);
      O00000OOO0OO0O var7 = this.O00000000.get(string3);
      if (var6 != null && var7 != null && var6 != var7) {
         O00000OOO0O00O var8 = o00000OOO0OOO.O00000000(var6.O000000000());
         O00000OOO0O00O var9 = o00000OOO0OOO.O00000000(var7.O000000000());
         if (var8 != null && var9 != null) {
            O00000OOO0O0OO var10 = var8.O000000000(string2);
            O00000OOO0O0OO var11 = var9.O00000000(string4);
            if (var10 == null || var11 == null || var10.type() != var11.type()) {
               return false;
            } else if (this.O0000000000(string, string3)) {
               return false;
            } else {
               this.O000000000.removeIf(o00000OOO0OO0 -> o00000OOO0OO0.O0000000000().equals(string3) && o00000OOO0OO0.O00000000000().equals(string4));
               this.O000000000.add(new O00000OOO0OO0(string, string2, string3, string4));
               this.O00000000000++;
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean O00000000(String string, String string2) {
      boolean var3 = this.O000000000.removeIf(o00000OOO0OO0 -> o00000OOO0OO0.O0000000000().equals(string) && o00000OOO0OO0.O00000000000().equals(string2));
      if (var3) {
         this.O00000000000++;
      }

      return var3;
   }

   public Collection<O00000OOO0OO0O> O0000000000() {
      return this.O00000000.values();
   }

   public List<O00000OOO0OO0> O00000000000() {
      return this.O000000000;
   }

   public O00000OOO0OO0O O0000000000(String string) {
      return this.O00000000.get(string);
   }

   public O00000OOO0OO0 O000000000(String string, String string2) {
      for (O00000OOO0OO0 var4 : this.O000000000) {
         if (var4.O0000000000().equals(string) && var4.O00000000000().equals(string2)) {
            return var4;
         }
      }

      return null;
   }

   public List<O00000OOO0OO0> O00000000000(String string) {
      ArrayList var2 = new ArrayList();

      for (O00000OOO0OO0 var4 : this.O000000000) {
         if (var4.O00000000().equals(string)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public O00000OOO0OO00 O000000000000(String string) {
      O00000OOO0OO00 var2 = new O00000OOO0OO00();
      var2.O000000000000 = this.O000000000000;
      var2.O0000000000.O00000000(this.O0000000000);
      if (string != null && this.O00000000.containsKey(string)) {
         LinkedHashSet var3 = new LinkedHashSet();
         ArrayDeque var4 = new ArrayDeque();
         var4.push(string);

         while (!var4.isEmpty()) {
            String var5 = (String)var4.pop();
            if (var3.add(var5)) {
               for (O00000OOO0OO0 var7 : this.O000000000) {
                  if (var7.O0000000000().equals(var5)) {
                     var4.push(var7.O00000000());
                  }
               }
            }
         }

         for (String var11 : (LinkedHashSet<String>)var3) {
            O00000OOO0OO0O var13 = this.O00000000.get(var11);
            if (var13 != null) {
               O00000OOO0OO0O var8 = new O00000OOO0OO0O(var13.O00000000(), var13.O000000000(), var13.O0000000000(), var13.O00000000000());
               var8.O00000000(var13.O000000000000());
               var8.O0000000000000().putAll(var13.O0000000000000());
               var8.O000000000000O().putAll(var13.O000000000000O());
               var2.O00000000.put(var8.O00000000(), var8);
            }
         }

         for (O00000OOO0OO0 var12 : this.O000000000) {
            if (var3.contains(var12.O00000000()) && var3.contains(var12.O0000000000())) {
               var2.O000000000.add(new O00000OOO0OO0(var12.O00000000(), var12.O000000000(), var12.O0000000000(), var12.O00000000000()));
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public int O000000000000() {
      return this.O00000000000;
   }

   public void O0000000000000() {
      this.O00000000000++;
   }

   public void O000000000000O() {
      this.O00000000.clear();
      this.O000000000.clear();
      this.O00000000000++;
   }

   public boolean O0000000000(String string, String string2) {
      if (string.equals(string2)) {
         return true;
      } else {
         LinkedHashSet var3 = new LinkedHashSet();
         ArrayDeque var4 = new ArrayDeque();
         var4.push(string2);

         while (!var4.isEmpty()) {
            String var5 = (String)var4.pop();
            if (var3.add(var5)) {
               if (var5.equals(string)) {
                  return true;
               }

               for (O00000OOO0OO0 var7 : this.O000000000) {
                  if (var7.O00000000().equals(var5)) {
                     var4.push(var7.O0000000000());
                  }
               }
            }
         }

         return false;
      }
   }

   private static String O0000000000000(String string) {
      String var1 = string != null && !string.isBlank() ? string.toLowerCase().replaceAll("[^a-z0-9]+", "_") : "node";
      return var1 + "_" + UUID.randomUUID().toString().replace("-", "").substring(0, 10);
   }
}
