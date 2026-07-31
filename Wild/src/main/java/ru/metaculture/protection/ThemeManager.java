package ru.metaculture.protection;

import java.awt.Color;
import java.io.File;
import net.minecraft.client.MinecraftClient;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class ThemeManager {
   public static MinecraftClient O00000000 = MinecraftClient.getInstance();
   private File O0000000000;
   private Theme O00000000000 = Theme.WILD;
   private Category O000000000000 = Category.Visuals;
   private boolean O0000000000000;
   private float O000000000000O;
   private float O00000000000O;
   private boolean O00000000000O0;
   private boolean O00000000000OO;
   public ColorSetting O000000000 = new ColorSetting("Custom Theme Color", Color.WHITE.getRGB());

   @Compile
   public void O00000000() {}

   public void O00000000(Theme o0000000OOO) {
      if (o0000000OOO != null) {
         this.O00000000000 = o0000000OOO;
      }
   }

   public void O00000000(Category o0000000OO0O0O) {
      if (o0000000OO0O0O != null) {
         this.O000000000000 = o0000000OO0O0O;
      }
   }

   public Theme O000000000() {
      return this.O00000000000;
   }

   public Category O0000000000() {
      return this.O000000000000;
   }

   public boolean O00000000000() {
      return this.O0000000000000;
   }

   public float O000000000000() {
      return this.O000000000000O;
   }

   public float O0000000000000() {
      return this.O00000000000O;
   }

   public void O00000000(float f, float g) {
      if (Float.isFinite(f) && Float.isFinite(g)) {
         if (!this.O0000000000000 || !(Math.abs(this.O000000000000O - f) < 0.5F) || !(Math.abs(this.O00000000000O - g) < 0.5F)) {
            this.O0000000000000 = true;
            this.O000000000000O = f;
            this.O00000000000O = g;
            this.O00000000000OO();
         }
      }
   }

   public boolean O000000000000O() {
      return this.O00000000000O0;
   }

   public boolean O00000000000O() {
      return this.O00000000000OO;
   }

   public void O00000000(boolean bl) {
      if (!this.O00000000000O0 || this.O00000000000OO != bl) {
         this.O00000000000O0 = true;
         this.O00000000000OO = bl;
         this.O00000000000OO();
      }
   }

   public ClickGui O00000000000O0() {
      return O00000000 != null && O00000000.currentScreen instanceof ModernClickGuiScreen var1 ? var1.O00000000() : null;
   }

   @Compile
   private void O00000000000OO() {}

   @Compile
   private void O0000000000O() {}

   private String O00000000(ColorSetting o0000000OOOO0O) {
      StringBuilder var2 = new StringBuilder();

      for (int var3 = 0; var3 < o0000000OOOO0O.O0000000000OO0.size(); var3++) {
         if (var3 > 0) {
            var2.append(',');
         }

         var2.append(o0000000OOOO0O.O0000000000OO0.get(var3));
      }

      return var2.toString();
   }

   private void O00000000(ColorSetting o0000000OOOO0O, String string) {
      o0000000OOOO0O.O0000000000OO0.clear();
      if (string != null && !string.isBlank()) {
         String[] var3 = string.split(",");

         for (String var7 : var3) {
            if (o0000000OOOO0O.O0000000000OO0.size() >= 8) {
               break;
            }

            try {
               o0000000OOOO0O.O0000000000OO0.add(Integer.parseInt(var7.trim()));
            } catch (NumberFormatException var9) {
            }
         }
      }
   }

   static {
      Loader.initialize();
   }
}
