package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class MultiSelectSetting extends Setting {
   public List<String> O00000000000;
   public boolean O000000000000;
   public String O0000000000000;
   public List<String> O000000000000O = new ArrayList<>();
   private Supplier<List<String>> O00000000000O0;
   protected List<String> O00000000000O = new ArrayList<>();

   public MultiSelectSetting(String string, String... strings) {
      this.O00000000 = string;
      this.O00000000000 = Arrays.asList(strings);
      this.O0000000000000 = this.O0000000000000;
      this.O00000000000();
   }

   public MultiSelectSetting(String string, Supplier<List<String>> supplier) {
      this.O00000000 = string;
      this.O00000000000O0 = supplier;
      this.O00000000000 = new ArrayList<>();
      this.O0000000000();
      this.O00000000000();
   }

   public MultiSelectSetting O00000000(Supplier<Boolean> supplier) {
      this.O000000000 = supplier;
      return this;
   }

   public MultiSelectSetting O000000000(Supplier<List<String>> supplier) {
      this.O00000000000O0 = supplier;
      this.O0000000000();
      return this;
   }

   public List<String> O0000000000() {
      if (this.O00000000000O0 == null) {
         return this.O00000000000 == null ? Collections.emptyList() : this.O00000000000;
      } else {
         List var1;
         try {
            var1 = this.O00000000000O0.get();
         } catch (Throwable var5) {
            var1 = Collections.emptyList();
         }

         ArrayList var2 = new ArrayList();
         if (var1 != null) {
            for (String var4 : (List<String>)var1) {
               if (var4 != null && !var4.isBlank() && !var2.contains(var4)) {
                  var2.add(var4);
               }
            }
         }

         this.O00000000000 = var2;
         if (this.O000000000000O != null) {
            this.O000000000000O.removeIf(string -> string == null || !var2.contains(string));
         } else {
            this.O000000000000O = new ArrayList<>();
         }

         return this.O00000000000;
      }
   }

   protected void O00000000000() {
      this.O00000000000O = this.O000000000000O == null ? new ArrayList<>() : new ArrayList<>(this.O000000000000O);
   }

   @Override
   public void O000000000() {
      this.O0000000000();
      this.O000000000000 = false;
      this.O000000000000O = new ArrayList<>();
      if (this.O00000000000O != null) {
         for (String var2 : this.O00000000000O) {
            if (var2 != null && this.O00000000000 != null && this.O00000000000.contains(var2)) {
               this.O000000000000O.add(var2);
            }
         }
      }
   }

   public String O000000000000() {
      this.O0000000000();
      StringBuilder var1 = new StringBuilder();

      for (int var2 = 0; var2 < this.O00000000000.size(); var2++) {
         var1.append(this.O00000000000.get(var2));
         if (var2 == 2 && this.O00000000000.size() > 3) {
            var1.append("...");
            break;
         }

         if (var2 < this.O00000000000.size() - 1) {
            var1.append(", ");
         }
      }

      return var1.toString();
   }

   public boolean O000000000(String string) {
      this.O0000000000();
      return this.O000000000000O.contains(string);
   }
}
