package ru.metaculture.protection;

public enum O000000O000O0 {
   LOW("Низкое"),
   MEDIUM("Баланс"),
   HIGH("Высокое"),
   ULTRA("Ультра");

   private final String O00000000;

   private O000000O000O0(String string2) {
      this.O00000000 = string2;
   }

   public String O00000000() {
      return this.O00000000;
   }

   public static String[] O000000000() {
      O000000O000O0[] var0 = values();
      String[] var1 = new String[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = var0[var2].O00000000;
      }

      return var1;
   }

   public static O000000O000O0 O00000000(int i) {
      O000000O000O0[] var1 = values();
      int var2 = Math.max(0, Math.min(var1.length - 1, i));
      return var1[var2];
   }

   public void O0000000000() {
      boolean var1 = this == LOW;
      boolean var2 = this == MEDIUM;
      boolean var3 = this == HIGH;
      boolean var4 = this == ULTRA;
      boolean var5 = var2 || var3 || var4;
      boolean var6 = var3 || var4;
      MenuModule.O000000000OO0O.O000000000(var5);
      MenuModule.O000000000OOO.O000000000(var6);
      MenuModule.O000000000OOO0.O000000000(var4);
      MenuModule.O000000000OOOO.O000000000(var6);
      MenuModule.O00000000O.O000000000(var5);
      MenuModule.O00000000O0.O000000000(var5);
      MenuModule.O00000000O00.O000000000(var6);
      MenuModule.O00000000O000.O000000000(var4);
      MenuModule.O00000000O0000.O000000000(var6);
      MenuModule.O00000000O000O.O000000000(var5);
      MenuModule.O00000000O00O.O000000000(var5);
      MenuModule.O00000000O00O0.O000000000(var5);
      MenuModule.O00000000O00OO.O000000000(var6);
      MenuModule.O00000000O0O.O000000000(var6);
      MenuModule.O00000000O0O0.O000000000(var5);
      MenuModule.O00000000O0O00.O000000000(var5);
      MenuModule.O00000000OO0O0.O00000000(var1 ? 12.0F : (var2 ? 26.0F : (var3 ? 42.0F : 58.0F)));
      MenuModule.O00000000OO0OO.O00000000(var1 ? 0.26F : (var2 ? 0.46F : (var3 ? 0.64F : 0.82F)));
      MenuModule.O00000000OOO.O00000000(var1 ? 0.06F : (var2 ? 0.16F : (var3 ? 0.27F : 0.36F)));
      MenuModule.O00000000OOO0.O00000000(var1 ? 0.18F : (var2 ? 0.26F : (var3 ? 0.36F : 0.48F)));
      MenuModule.O00000000OOO00.O00000000(var1 ? 1.05F : (var2 ? 1.55F : (var3 ? 2.15F : 2.8F)));
      MenuModule.O00000000OOO0O.O00000000(var1 ? 0.18F : (var2 ? 0.46F : (var3 ? 0.72F : 1.02F)));
      MenuModule.O00000000OOOO.O00000000(var1 ? 0.32F : (var2 ? 0.52F : (var3 ? 0.68F : 0.82F)));
      MenuModule.O00000000OOOO0.O00000000(var1 ? 0.2F : (var2 ? 0.34F : (var3 ? 0.46F : 0.58F)));
      MenuModule.O00000000OOOOO.O00000000(var1 ? 0.48F : (var2 ? 0.56F : (var3 ? 0.62F : 0.7F)));
      MenuModule.O0000000O.O00000000(var1 ? 0.32F : (var2 ? 0.48F : (var3 ? 0.62F : 0.78F)));
      MenuModule.O0000000O00.O000000000(var1);
      MenuModule.O0000000O0.O000000000(var1 || var2);
      MenuModule.O0000000O000.O000000000(var1);
      MenuModule.O0000000O0000.O000000000(var1);
   }
}
