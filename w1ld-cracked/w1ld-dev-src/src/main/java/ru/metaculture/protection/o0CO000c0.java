package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class o0CO000c0 {
   private final List<UNUuvUN> UuUVuuUu = new ArrayList<>();

   public o0CO000c0() {
      this.UuUVuuUu(new vVNUUnuU(this));
      this.UuUVuuUu(new uNvUVUNvuUVV());
      this.UuUVuuUu(new nvNUVUNNnu());
      this.UuUVuuUu(new cCcc00OoCo());
      this.UuUVuuUu(new WWwwwWvvvv());
      this.UuUVuuUu(new nunUNvuvuNu());
      this.UuUVuuUu(new uVnNnVVNuUNU());
      this.UuUVuuUu(new nVNVuUvVuU());
      this.UuUVuuUu(new NUNnuuv());
      this.UuUVuuUu(new oO0OcCC0OCO());
      this.UuUVuuUu(new VvuuvuNVvvU());
      this.UuUVuuUu(new vnVUUVVVUUNU());
      this.UuUVuuUu(new nVuVnuNVNv());
      this.UuUVuuUu(new nNuUuVUuvu());
      this.UuUVuuUu(new nNuuUUuvVU());
      this.UuUVuuUu(new UvVnvNvnNUu());
      this.UuUVuuUu(new VVUuNVVnNVUV());
      this.UuUVuuUu(new uVnUnvnUn());
      this.UuUVuuUu(new UuuNvUuUnu());
   }

   @Compile
   public void UuUVuuUu(UNUuvUN var1) {
      this.UuUVuuUu.add(var1);
      NUvnVVNvvu.UuUVuuUu(var1);
   }

   @Compile
   public void UuUVuuUu(String var1) {
      String var2 = NVnVnNnN.UuUVuuUu.VVnVNnunVvu();
      if (var1.startsWith(var2)) {
         String[] var3 = var1.substring(var2.length()).split(" ");
         String var4 = var3[0];
         if (var4.equalsIgnoreCase("ah.search")) {
            var4 = "ahsearch";
         }

         String[] var5 = new String[var3.length - 1];
         System.arraycopy(var3, 1, var5, 0, var5.length);

         for (UNUuvUN var7 : this.UuUVuuUu) {
            if (var7 != null && var7.UuUVuuUu().equalsIgnoreCase(var4)) {
               var7.C00OOC00oO(var5);
               return;
            }
         }

         vVnvuVVUunuv.UuUVuuUu("§cНеизвестная команда. Напиши §7.help §cдля списка.");
      }
   }

   public List<UNUuvUN> UuUVuuUu() {
      return this.UuUVuuUu;
   }

   static {
      Loader.initialize();
   }
}
