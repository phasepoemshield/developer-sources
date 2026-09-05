package ru.metaculture.protection;

import java.util.Objects;

public final class nUVnuvUu {
   public final String UuUVuuUu;

   public nUVnuvUu(String var1) {
      this.UuUVuuUu = Objects.requireNonNull(var1, "id");
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         nUVnuvUu var2 = (nUVnuvUu)var1;
         return this.UuUVuuUu.equals(var2.UuUVuuUu);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.UuUVuuUu.hashCode();
   }

   @Override
   public String toString() {
      return "FontObject(" + this.UuUVuuUu + ")";
   }
}
