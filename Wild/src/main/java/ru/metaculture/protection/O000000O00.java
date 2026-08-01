package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Supplier;

public class O000000O00 extends MultiSelectSetting {
   public static final String O00000000000O0 = "None";
   private static final List<O000000O00> O0000000000O = new CopyOnWriteArrayList<>();
   public final O00000OOOO00O O00000000000OO;
   private final Supplier<List<String>> O0000000000O0;

   public O000000O00(String string, O00000OOOO00O o00000OOOO00O) {
      this(string, o00000OOOO00O, () -> O00000OOOO0O00.O00000000().O00000000000OO(o00000OOOO00O));
   }

   public O000000O00(String string, O00000OOOO00O o00000OOOO00O, Supplier<List<String>> supplier) {
      super(string, "None");
      this.O00000000000OO = o00000OOOO00O;
      this.O0000000000O0 = supplier;
      this.O000000000000O = new ArrayList<>();
      this.O000000000000O.add("None");
      this.O0000000000();
      this.O00000000000();
      O0000000000O.add(this);
   }

   public static void O00000000(O00000OOOO00O o00000OOOO00O, String string) {
      if (o00000OOOO00O != null && string != null && !string.isBlank()) {
         for (O000000O00 var3 : O0000000000O) {
            if (var3.O00000000000OO == o00000OOOO00O) {
               var3.O0000000000(string);
            }
         }
      }
   }

   public static void O00000000(O00000OOOO00O o00000OOOO00O) {
      if (o00000OOOO00O != null) {
         for (O000000O00 var2 : O0000000000O) {
            if (var2.O00000000000OO == o00000OOOO00O) {
               var2.O0000000000("None");
            }
         }
      }
   }

   public O000000O00 O0000000000(Supplier<Boolean> supplier) {
      this.O000000000 = supplier;
      return this;
   }

   @Override
   public List<String> O0000000000() {
      List var1;
      try {
         var1 = this.O0000000000O0 == null ? Collections.emptyList() : this.O0000000000O0.get();
      } catch (Throwable var5) {
         var1 = Collections.emptyList();
      }

      ArrayList var2 = new ArrayList();
      var2.add("None");
      if (var1 != null) {
         for (String var4 : (List<String>)var1) {
            if (var4 != null && !var4.isBlank() && !O00000000(var2, var4)) {
               var2.add(var4.trim());
            }
         }
      }

      if (var2.size() > 2) {
         var2.subList(1, var2.size()).sort((string, string2) -> {
            int var2x = O0000000000000((String)string);
            int var3 = O0000000000000((String)string2);
            return var2x != var3 ? Integer.compare(var2x, var3) : ((String)string).compareToIgnoreCase((String)string2);
         });
      }

      this.O00000000000 = var2;
      if (this.O000000000000O == null) {
         this.O000000000000O = new ArrayList<>();
      }

      if (this.O000000000000O.isEmpty()) {
         this.O000000000000O.add("None");
      } else {
         String var6 = this.O000000000000O.get(this.O000000000000O.size() - 1);
         this.O000000000000O.clear();
         this.O000000000000O.add(O00000000000(var6));
      }

      return this.O00000000000;
   }

   public String O000000000000O() {
      this.O0000000000();
      return this.O000000000000O.isEmpty() ? "None" : this.O000000000000O.get(this.O000000000000O.size() - 1);
   }

   public String O00000000000O() {
      String var1 = this.O000000000000O();
      return O000000000000(var1) ? "None" : var1;
   }

   public void O0000000000(String string) {
      if (this.O000000000000O == null) {
         this.O000000000000O = new ArrayList<>();
      }

      this.O000000000000O.clear();
      this.O000000000000O.add(O00000000000(string));
      this.O0000000000();
   }

   public void O00000000(int i) {
      this.O0000000000();
      if (i >= 0 && i < this.O00000000000.size()) {
         this.O0000000000(this.O00000000000.get(i));
      }
   }

   public int O00000000000O0() {
      String var1 = this.O000000000000O();

      for (int var2 = 0; var2 < this.O00000000000.size(); var2++) {
         if (this.O00000000000.get(var2).equalsIgnoreCase(var1)) {
            return var2;
         }
      }

      return -1;
   }

   public boolean O00000000000OO() {
      String var1 = this.O000000000000O();
      return !O000000000000(var1) && !O00000000(this.O00000000000, var1);
   }

   public String O0000000000O0() {
      return this.O0000000000O0O();
   }

   public boolean O0000000000O00() {
      return O000000000000(this.O000000000000O());
   }

   public String O0000000000O0O() {
      String var1 = this.O000000000000O();
      if (O000000000000(var1)) {
         return "";
      } else {
         return O00000OOOO0O00.O00000000().O000000000000(var1) ? var1 : "";
      }
   }

   public String O0000000000OO() {
      if (this.O00000000000OO != null && this.O00000000000OO != O00000OOOO00O.PREVIEW_ONLY) {
         try {
            O00000OOOOO00 var1 = O00000OOOOO000.O00000000().O0000000000(this.O00000000000OO);
            if (var1 != null && O00000OOOO0O00.O00000000().O000000000000(var1.O000000000())) {
               return var1.O000000000();
            }
         } catch (Throwable var2) {
         }

         return "";
      } else {
         return "";
      }
   }

   @Override
   public boolean O000000000(String string) {
      return string != null && string.equalsIgnoreCase(this.O000000000000O());
   }

   private static String O00000000000(String string) {
      return string != null && !string.isBlank() && !O000000000000(string) ? string.trim() : "None";
   }

   private static boolean O000000000000(String string) {
      return string == null || string.isBlank() || "None".equalsIgnoreCase(string.trim());
   }

   private static int O0000000000000(String string) {
      O00000OOOO0O00.W313 var1 = O00000OOOO0O00.O00000000().O0000000000000(string);

      return switch (var1) {
         case PRESET -> 0;
         case USER -> 1;
         case IMPORTED -> 2;
         case RUNTIME -> 3;
      };
   }

   private static boolean O00000000(List<String> list, String string) {
      if (list != null && string != null) {
         for (String var3 : list) {
            if (var3 != null && var3.equalsIgnoreCase(string.trim())) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }
}
