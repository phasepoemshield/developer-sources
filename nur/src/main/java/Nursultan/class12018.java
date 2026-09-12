package Nursultan;

import java.util.Objects;

public record class12018(String key) {

   @Override
   public boolean equals(Object var1) {
      if (var1 instanceof class12018 var3) {
         class12018 var10000 = var3;

         try {
            var5 = var10000.N();
         } catch (Throwable var4) {
            throw new MatchException(var4.toString(), var4);
         }

         String var2 = var5;
         return Objects.equals(this.key, var2);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.key);
   }

   public String y(String var1) {
      return var1 + "." + this.key;
   }

   public String N() {
      return this.key;
   }

   public class12018 N(String var1) {
      return new class12018(this.key + "." + var1);
   }

   public class12018 N(class12018 var1) {
      return new class12018(this.key + "." + var1.key);
   }
}
