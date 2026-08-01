package ru.metaculture.protection;

public final class O00000OOOO0 implements AutoCloseable {
   private final ShaderSourceBuilder O00000000;
   private O00000OOOO00O O000000000 = O00000OOOO00O.PREVIEW_ONLY;
   private String O0000000000 = "";
   private String O00000000000 = "";

   public O00000OOOO0(ShaderSourceBuilder o00000OOO00OOO) {
      this.O00000000 = o00000OOO00OOO;
      O00000OOOO0O00.O00000000().O00000000(o00000OOO00OOO);
   }

   public O00000OOOO00O O00000000() {
      return this.O000000000;
   }

   public void O00000000(O00000OOOO00O o00000OOOO00O) {
      if (o00000OOOO00O != null) {
         this.O000000000 = o00000OOOO00O;
      }
   }

   public void O00000000(O00000OOO0OO00 o00000OOO0OO00) {
      if (o00000OOO0OO00 != null && this.O00000000 != null) {
         O00000OOO00OO0 var2 = this.O00000000.O00000000(o00000OOO0OO00);
         this.O0000000000 = var2.hash();
         this.O00000000000 = var2.error() == null ? "" : var2.error();
         O00000OOOO0O00.O00000000().O00000000(this.O000000000, o00000OOO0OO00, var2);
         O00000OOOO0O0.O00000000().O00000000(this.O000000000, var2);
      }
   }

   public O00000OOO00OO0 O000000000(O00000OOO0OO00 o00000OOO0OO00) {
      if (o00000OOO0OO00 != null && this.O00000000 != null) {
         O00000OOO00OO0 var2 = this.O00000000.O00000000(o00000OOO0OO00);
         this.O0000000000 = var2.hash();
         this.O00000000000 = var2.error() == null ? "" : var2.error();
         return var2;
      } else {
         return null;
      }
   }

   public boolean O00000000(String string, O00000OOO0OO00 o00000OOO0OO00) {
      if (o00000OOO0OO00 != null && this.O00000000 != null) {
         String var3 = O00000OOOO0O00.O00000000000OO(string);
         if (var3.isBlank()) {
            this.O00000000000 = "Shader name is empty";
            return false;
         } else {
            O00000OOO00OO0 var4 = this.O00000000.O00000000(o00000OOO0OO00);
            this.O0000000000 = var4.hash();
            this.O00000000000 = var4.error() == null ? "" : var4.error();
            if (!this.O00000000000.isBlank()) {
               return false;
            } else {
               O00000OOOO0O00.O00000000().O00000000(var3, o00000OOO0OO00, var4);
               O00000OOOO0O0.O00000000().O00000000(var3, var4);
               return true;
            }
         }
      } else {
         return false;
      }
   }

   public void O00000000(O00000OOO0OO00 o00000OOO0OO00, float f, float g, float h, float i, int j, int k, float l, float m, ColorScheme o0000O000O0OO, float n) {
      if (o00000OOO0OO00 != null && o0000O000O0OO != null) {
         this.O00000000(o00000OOO0OO00);
         O00000OOOO00OO.O00000000(this.O000000000, f, g, h, i, j, k, l, m, o0000O000O0OO, n);
      }
   }

   public String O000000000() {
      return !this.O00000000000.isBlank() ? this.O00000000000 : O00000OOOO0O0.O00000000().O00000000(this.O000000000);
   }

   public String O0000000000() {
      return this.O0000000000 == null ? "" : this.O0000000000;
   }

   @Override
   public void close() {
      this.O0000000000 = "";
      this.O00000000000 = "";
   }
}
