package ru.metaculture.protection;

import java.util.Objects;

public final class FontObject {
   public final String O00000000;

   public FontObject(String string) {
      this.O00000000 = Objects.requireNonNull(string, "id");
   }

   @Override
   public boolean equals(Object object) {
      if (this == object) {
         return true;
      } else if (object != null && this.getClass() == object.getClass()) {
         FontObject var2 = (FontObject)object;
         return this.O00000000.equals(var2.O00000000);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.O00000000.hashCode();
   }

   @Override
   public String toString() {
      return "FontObject(" + this.O00000000 + ")";
   }
}
