package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import lombok.Generated;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public abstract class UNUuvUN implements O000c0oocoo {
   private final String UuUVuuUu;
   private final String C00OOC00oO;
   private final String uUnuvNvvNU;
   private final Map<String, Supplier<List<String>>> vVvUvVVuuNvV = new HashMap<>();

   public UNUuvUN(String var1, String var2, String var3) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
      this.uUnuvNvvNU = var3;
   }

   @Compile
   protected void UuUVuuUu(String var1, Supplier<List<String>> var2) {
      this.vVvUvVVuuNvV.put(var1.toLowerCase(), var2);
   }

   public List<String> UuUVuuUu(String[] var1) {
      if (var1.length == 2) {
         return this.vVvUvVVuuNvV.keySet().stream().filter(var1x -> var1x.startsWith(var1[1].toLowerCase())).toList();
      } else {
         if (var1.length == 3) {
            String var2 = var1[1].toLowerCase();
            if (this.vVvUvVVuuNvV.containsKey(var2)) {
               return this.vVvUvVVuuNvV.get(var2).get().stream().filter(var1x -> var1x.toLowerCase().startsWith(var1[2].toLowerCase())).toList();
            }
         }

         return new ArrayList<>();
      }
   }

   public abstract void C00OOC00oO(String[] var1);

   @Generated
   public String UuUVuuUu() {
      return this.UuUVuuUu;
   }

   @Generated
   public String C00OOC00oO() {
      return this.C00OOC00oO;
   }

   @Generated
   public String uUnuvNvvNU() {
      return this.uUnuvNvvNU;
   }

   static {
      Loader.initialize();
   }
}
