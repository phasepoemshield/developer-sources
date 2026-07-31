package ru.metaculture.protection;

import lombok.Generated;

public final class O0000O000O0OOO {
   private final Theme O00000000;
   private final O0000O00000 O000000000;
   private final ColorScheme O0000000000;
   private final O0000O000OO O00000000000;

   public boolean O00000000() {
      if (this.O0000000000 != null && this.O0000000000.O000000000O000()) {
         return true;
      } else {
         return this.O00000000000 == null ? false : this.O00000000000.O0000000000(this.O00000000);
      }
   }

   public boolean O000000000() {
      return this.O00000000();
   }

   @Generated
   O0000O000O0OOO(Theme o0000000OOO, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, O0000O000OO o0000O000OO) {
      this.O00000000 = o0000000OOO;
      this.O000000000 = o0000O00000;
      this.O0000000000 = o0000O000O0OO;
      this.O00000000000 = o0000O000OO;
   }

   @Generated
   public static O0000O000O0OOO.W349 O0000000000() {
      return new O0000O000O0OOO.W349();
   }

   @Generated
   public Theme O00000000000() {
      return this.O00000000;
   }

   @Generated
   public O0000O00000 O000000000000() {
      return this.O000000000;
   }

   @Generated
   public ColorScheme O0000000000000() {
      return this.O0000000000;
   }

   @Generated
   public O0000O000OO O000000000000O() {
      return this.O00000000000;
   }

   @Generated
   @Override
   public boolean equals(Object object) {
      if (object == this) {
         return true;
      } else if (!(object instanceof O0000O000O0OOO var2)) {
         return false;
      } else {
         Theme var3 = this.O00000000000();
         Theme var4 = var2.O00000000000();
         if (var3 == null) {
            if (var4 != null) {
               return false;
            }
         } else if (!var3.equals(var4)) {
            return false;
         }

         O0000O00000 var5 = this.O000000000000();
         O0000O00000 var6 = var2.O000000000000();
         if (var5 == null ? var6 == null : var5.equals(var6)) {
            ColorScheme var7 = this.O0000000000000();
            ColorScheme var8 = var2.O0000000000000();
            if (var7 == null ? var8 == null : var7.equals(var8)) {
               O0000O000OO var9 = this.O000000000000O();
               O0000O000OO var10 = var2.O000000000000O();
               if (var9 == null) {
                  if (var10 != null) {
                     return false;
                  }
               } else if (!var9.equals(var10)) {
                  return false;
               }

               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      Theme var3 = this.O00000000000();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      O0000O00000 var4 = this.O000000000000();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      ColorScheme var5 = this.O0000000000000();
      var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
      O0000O000OO var6 = this.O000000000000O();
      return var2 * 59 + (var6 == null ? 43 : var6.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "ThemeContext(theme="
         + this.O00000000000()
         + ", metrics="
         + this.O000000000000()
         + ", colors="
         + this.O0000000000000()
         + ", palette="
         + this.O000000000000O()
         + ")";
   }

   @Generated
   public static class W349 {
      @Generated
      private Theme O00000000;
      @Generated
      private O0000O00000 O000000000;
      @Generated
      private ColorScheme O0000000000;
      @Generated
      private O0000O000OO O00000000000;

      @Generated
      W349() {
      }

      @Generated
      public O0000O000O0OOO.W349 O00000000(Theme o0000000OOO) {
         this.O00000000 = o0000000OOO;
         return this;
      }

      @Generated
      public O0000O000O0OOO.W349 O00000000(O0000O00000 o0000O00000) {
         this.O000000000 = o0000O00000;
         return this;
      }

      @Generated
      public O0000O000O0OOO.W349 O00000000(ColorScheme o0000O000O0OO) {
         this.O0000000000 = o0000O000O0OO;
         return this;
      }

      @Generated
      public O0000O000O0OOO.W349 O00000000(O0000O000OO o0000O000OO) {
         this.O00000000000 = o0000O000OO;
         return this;
      }

      @Generated
      public O0000O000O0OOO O00000000() {
         return new O0000O000O0OOO(this.O00000000, this.O000000000, this.O0000000000, this.O00000000000);
      }

      @Generated
      @Override
      public String toString() {
         return "ThemeContext.ThemeContextBuilder(theme="
            + this.O00000000
            + ", metrics="
            + this.O000000000
            + ", colors="
            + this.O0000000000
            + ", palette="
            + this.O00000000000
            + ")";
      }
   }
}
