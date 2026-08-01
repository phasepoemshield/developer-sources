package ru.metaculture.protection;

public final class O00000OOO0O000 {
   private String O00000000 = "";
   private String O000000000 = "";
   private String O0000000000 = "";
   private String O00000000000 = "Custom";
   private String O000000000000 = "local";
   private String O0000000000000 = "Host Rectangle";
   private String O000000000000O = "";
   private long O00000000000O;
   private long O00000000000O0;
   private boolean O00000000000OO;

   public O00000OOO0O000() {
      long var1 = System.currentTimeMillis();
      this.O00000000000O = var1;
      this.O00000000000O0 = var1;
   }

   public O00000OOO0O000 O00000000() {
      O00000OOO0O000 var1 = new O00000OOO0O000();
      var1.O00000000(this);
      return var1;
   }

   public void O00000000(O00000OOO0O000 o00000OOO0O000) {
      if (o00000OOO0O000 != null) {
         this.O00000000 = o00000OOO0O000.O00000000;
         this.O000000000 = o00000OOO0O000.O000000000;
         this.O0000000000 = o00000OOO0O000.O0000000000;
         this.O00000000000 = o00000OOO0O000.O00000000000;
         this.O000000000000 = o00000OOO0O000.O000000000000;
         this.O0000000000000 = o00000OOO0O000.O0000000000000;
         this.O000000000000O = o00000OOO0O000.O000000000000O;
         this.O00000000000O = o00000OOO0O000.O00000000000O;
         this.O00000000000O0 = o00000OOO0O000.O00000000000O0;
         this.O00000000000OO = o00000OOO0O000.O00000000000OO;
      }
   }

   public String O000000000() {
      return this.O00000000;
   }

   public void O00000000(String string) {
      this.O00000000 = O00000000000O(string);
   }

   public String O0000000000() {
      return this.O000000000;
   }

   public void O000000000(String string) {
      this.O000000000 = O00000000000O(string);
   }

   public String O00000000000() {
      return this.O0000000000;
   }

   public void O0000000000(String string) {
      this.O0000000000 = O00000000000O(string);
   }

   public String O000000000000() {
      return this.O00000000000;
   }

   public void O00000000000(String string) {
      String var2 = O00000000000O(string);
      this.O00000000000 = var2.isBlank() ? "Custom" : var2;
   }

   public String O0000000000000() {
      return this.O000000000000;
   }

   public void O000000000000(String string) {
      String var2 = O00000000000O(string);
      this.O000000000000 = var2.isBlank() ? "local" : var2;
   }

   public String O000000000000O() {
      return this.O0000000000000;
   }

   public void O0000000000000(String string) {
      String var2 = O00000000000O(string);
      if (!"Inset Shape".equals(var2) && !"Full Quad".equals(var2)) {
         this.O0000000000000 = "Host Rectangle";
      } else {
         this.O0000000000000 = var2;
      }
   }

   public String O00000000000O() {
      return this.O000000000000O;
   }

   public void O000000000000O(String string) {
      this.O000000000000O = O00000000000O(string);
   }

   public long O00000000000O0() {
      return this.O00000000000O;
   }

   public void O00000000(long l) {
      this.O00000000000O = Math.max(0L, l);
   }

   public long O00000000000OO() {
      return this.O00000000000O0;
   }

   public void O000000000(long l) {
      this.O00000000000O0 = Math.max(0L, l);
   }

   public boolean O0000000000O() {
      return this.O00000000000OO;
   }

   public void O00000000(boolean bl) {
      this.O00000000000OO = bl;
   }

   public void O00000000(String string, String string2) {
      long var3 = System.currentTimeMillis();
      if (this.O00000000000O <= 0L) {
         this.O00000000000O = var3;
      }

      if (this.O00000000000O0 <= 0L) {
         this.O00000000000O0 = var3;
      }

      if (this.O00000000.isBlank()) {
         this.O00000000(string);
      }

      if (this.O000000000.isBlank()) {
         this.O000000000(string2);
      }

      if (this.O00000000000.isBlank()) {
         this.O00000000000 = "Custom";
      }

      if (this.O000000000000.isBlank()) {
         this.O000000000000 = "local";
      }

      if (this.O0000000000000.isBlank()) {
         this.O0000000000000 = "Host Rectangle";
      }
   }

   private static String O00000000000O(String string) {
      if (string == null) {
         return "";
      } else {
         String var1 = string.trim().replaceAll("\\s+", " ");
         return var1.length() > 128 ? var1.substring(0, 128) : var1;
      }
   }
}
