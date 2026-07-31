package ru.metaculture.protection;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import net.minecraft.util.math.MathHelper;

public final class RotationLabScreen extends Screen {
   private static final int O00000000 = -234156525;
   private static final int O000000000 = -1441326300;
   private static final int O0000000000 = -1446152;
   private static final int O00000000000 = -7366230;
   private static final int O000000000000 = -45462;
   private static final int O0000000000000 = -1;
   private static final int O000000000000O = -2142256137;
   private final RotationLab O00000000000O;
   private final List<O000000OO000.W45> O00000000000O0 = new ArrayList<>();
   private final List<O000000OO000.W46> O00000000000OO = new ArrayList<>();
   private RotationLabScreen.W352 O0000000000O;
   private long O0000000000O0;
   private int O0000000000O00 = -1;
   private double O0000000000O0O;
   private double O0000000000OO;
   private float O0000000000OO0;
   private float O0000000000OOO;
   private boolean O000000000O;

   public RotationLabScreen(RotationLab o00000O000OO0O) {
      super(Text.literal("RotationLab"));
      this.O00000000000O = o00000O000OO0O;
   }

   public boolean shouldPause() {
      return false;
   }

   public void render(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
      context.fill(0, 0, this.width, this.height, -234156525);
      if (this.O0000000000O == null) {
         this.O00000000(mouseX, mouseY);
      }

      this.O00000000(deltaTicks);
      this.O000000000(mouseX, mouseY);
      if (this.O00000000000O.O0000000000O0O() && this.O0000000000O != null && this.O00000000000(mouseX, mouseY)) {
         this.O0000000000(mouseX, mouseY);
         this.O00000000(mouseX, mouseY);
      }

      this.O000000000(context);
      this.O0000000000(context);
      this.O00000000(context);
      super.render(context, mouseX, mouseY, deltaTicks);
   }

   public boolean mouseClicked(double mouseX, double mouseY, int button) {
      if (button == 0 && this.O0000000000O != null && this.O00000000000(mouseX, mouseY)) {
         this.O0000000000(mouseX, mouseY);
         this.O00000000(mouseX, mouseY);
         return true;
      } else {
         return super.mouseClicked(mouseX, mouseY, button);
      }
   }

   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      if (keyCode == 82) {
         this.O000000000();
         return true;
      } else if (keyCode != 68 && keyCode != 261) {
         return super.keyPressed(keyCode, scanCode, modifiers);
      } else {
         this.O00000000000O.O000000000O();
         return true;
      }
   }

   public void close() {
      if (!this.O000000000O) {
         this.O00000000();
         this.O00000000000O.O00000000(this);
      }

      super.close();
   }

   public void O00000000() {
      if (!this.O000000000O) {
         this.O000000000O = true;
         this.O0000000000();
      }
   }

   public void O000000000() {
      this.O00000000000O0.clear();
      this.O00000000000OO.clear();
      this.O0000000000O = null;
      this.O0000000000O00 = -1;
   }

   private void O00000000(double d, double e) {
      if (this.O00000000000O0.size() >= this.O00000000000O.O0000000000OOO()) {
         this.close();
      } else {
         String var5 = this.O00000000000();
         double var6 = Math.max(80.0, (double)(this.width * this.O00000000000O.O0000000000OO0()));
         double var8 = Math.max(60.0, (double)(this.height * this.O00000000000O.O0000000000OO0()));
         double var10 = (this.width - var6) * 0.5;
         double var12 = (this.height - var8) * 0.5;
         double var14 = this.width * 0.5;
         double var16 = this.height * 0.5;

         double var22 = switch (var5) {
            case "Micro", "Idle" -> 22.0;
            case "Vertical" -> 70.0;
            case "Attack" -> 120.0;
            default -> 95.0;
         };
         int var24 = 0;

         double var18;
         double var20;
         do {
            if ("Vertical".equals(var5)) {
               var18 = ThreadLocalRandom.current().nextDouble(-24.0, 24.0);
               var20 = this.O000000000000(var22, var8 * 0.42);
            } else if ("Diagonal".equals(var5)) {
               var18 = this.O000000000000(var22 * 0.65, var6 * 0.45);
               var20 = this.O000000000000(var22 * 0.45, var8 * 0.4);
            } else if (!"Micro".equals(var5) && !"Idle".equals(var5)) {
               var18 = this.O000000000000(var22, var6 * 0.48);
               var20 = this.O000000000000(12.0, var8 * 0.36);
            } else {
               var18 = this.O000000000000(12.0, 58.0);
               var20 = this.O000000000000(8.0, 42.0);
            }

            this.O0000000000O = new RotationLabScreen.W352(
               MathHelper.clamp(d + var18, var10, var10 + var6), MathHelper.clamp(e + var20, var12, var12 + var8), this.O00000000000O.O0000000000OO(), var5
            );
         } while (this.O00000000(d, e, this.O0000000000O.O00000000, this.O0000000000O.O000000000) < var22 && ++var24 < 12);

         if (var24 >= 12) {
            this.O0000000000O.O00000000 = MathHelper.clamp(var14 + var18, var10, var10 + var6);
            this.O0000000000O.O000000000 = MathHelper.clamp(var16 + var20, var12, var12 + var8);
         }

         if ("Tracking".equals(var5)) {
            this.O0000000000O.O0000000000 = ThreadLocalRandom.current().nextDouble(-1.15, 1.15);
            this.O0000000000O.O00000000000 = ThreadLocalRandom.current().nextDouble(-0.85, 0.85);
         }

         this.O0000000000O0O = d;
         this.O0000000000OO = e;
         this.O0000000000O0 = System.currentTimeMillis();
         this.O0000000000O00 = -1;
         this.O0000000000OO0 = 0.0F;
         this.O0000000000OOO = 0.0F;
         this.O00000000000OO.clear();
      }
   }

   private void O00000000(float f) {
      if (this.O0000000000O != null && "Tracking".equals(this.O0000000000O.O0000000000000)) {
         double var2 = Math.max(0.35, (double)f);
         this.O0000000000O.O00000000 = this.O0000000000O.O00000000 + this.O0000000000O.O0000000000 * var2;
         this.O0000000000O.O000000000 = this.O0000000000O.O000000000 + this.O0000000000O.O00000000000 * var2;
         double var4 = this.O0000000000O.O000000000000 + 18.0;
         if (this.O0000000000O.O00000000 < var4 || this.O0000000000O.O00000000 > this.width - var4) {
            this.O0000000000O.O0000000000 = -this.O0000000000O.O0000000000;
         }

         if (this.O0000000000O.O000000000 < var4 || this.O0000000000O.O000000000 > this.height - var4) {
            this.O0000000000O.O00000000000 = -this.O0000000000O.O00000000000;
         }

         this.O0000000000O.O00000000 = MathHelper.clamp(this.O0000000000O.O00000000, var4, this.width - var4);
         this.O0000000000O.O000000000 = MathHelper.clamp(this.O0000000000O.O000000000, var4, this.height - var4);
      }
   }

   private void O000000000(double d, double e) {
      if (this.O0000000000O != null) {
         int var5 = (int)((System.currentTimeMillis() - this.O0000000000O0) / 50L);
         if (var5 != this.O0000000000O00) {
            this.O0000000000O00 = var5;
            float var6 = this.O00000000(d - this.O0000000000O0O);
            float var7 = this.O000000000(e - this.O0000000000OO);
            float var8 = this.O00000000(this.O0000000000O.O00000000 - this.O0000000000O0O);
            float var9 = this.O000000000(this.O0000000000O.O000000000 - this.O0000000000OO);
            float var10 = (float)Math.max(0.001, Math.hypot(var8, var9));
            O000000OO000.W46 var11 = new O000000OO000.W46();
            var11.O00000000 = var5;
            var11.O000000000 = var6;
            var11.O0000000000 = var7;
            var11.O00000000000 = var6 - this.O0000000000OO0;
            var11.O000000000000 = var7 - this.O0000000000OOO;
            var11.O0000000000000 = Math.abs(var11.O00000000000);
            var11.O000000000000O = Math.abs(var11.O000000000000);
            var11.O00000000000O = (float)MathHelper.clamp(Math.hypot(var6, var7) / var10, 0.0, 1.35);
            this.O00000000000OO.add(var11);
            this.O0000000000OO0 = var6;
            this.O0000000000OOO = var7;
            if (var5 > 120) {
               this.O00000000(d, e);
            }
         }
      }
   }

   private void O0000000000(double d, double e) {
      if (this.O0000000000O != null && this.O00000000000OO.size() >= 2) {
         O000000OO000.W45 var5 = new O000000OO000.W45();
         var5.O00000000 = this.O0000000000O.O0000000000000;
         var5.O000000000 = System.currentTimeMillis();
         var5.O0000000000 = this.O00000000(this.O0000000000O.O00000000 - this.O0000000000O0O);
         var5.O00000000000 = this.O000000000(this.O0000000000O.O000000000 - this.O0000000000OO);
         O000000OO000.W46 var6 = this.O00000000000OO.get(this.O00000000000OO.size() - 1);
         var5.O000000000000 = var6.O000000000;
         var5.O0000000000000 = var6.O0000000000;
         var5.O00000000000O0 = var6.O00000000 + 1;
         var5.O0000000000O0 = new ArrayList<>(this.O00000000000OO);
         var5.O000000000000O = this.O00000000(var5);
         var5.O00000000000O = this.O000000000(var5);
         var5.O00000000000OO = this.O0000000000(var5);
         double var7 = this.O00000000(d, e, this.O0000000000O.O00000000, this.O0000000000O.O000000000);
         float var9 = 1.0F - (float)MathHelper.clamp(var7 / Math.max(1.0, this.O0000000000O.O000000000000 * 1.8), 0.0, 1.0);
         float var10 = MathHelper.clamp(this.O00000000000OO.size() / 6.0F, 0.0F, 1.0F);
         var5.O0000000000O = MathHelper.clamp(var9 * 0.75F + var10 * 0.25F, 0.0F, 1.0F);
         this.O00000000000O0.add(var5);
      }
   }

   private float O00000000(O000000OO000.W45 o00000000) {
      float var2 = o00000000.O0000000000;
      float var3 = 0.0F;

      for (O000000OO000.W46 var5 : o00000000.O0000000000O0) {
         var3 = Math.max(var3, Math.abs(var5.O000000000) - Math.abs(var2));
      }

      return Math.max(0.0F, var3);
   }

   private float O000000000(O000000OO000.W45 o00000000) {
      float var2 = o00000000.O00000000000;
      float var3 = 0.0F;

      for (O000000OO000.W46 var5 : o00000000.O0000000000O0) {
         var3 = Math.max(var3, Math.abs(var5.O0000000000) - Math.abs(var2));
      }

      return Math.max(0.0F, var3);
   }

   private int O0000000000(O000000OO000.W45 o00000000) {
      int var2 = 0;

      for (int var3 = o00000000.O0000000000O0.size() - 1; var3 >= 0; var3--) {
         O000000OO000.W46 var4 = o00000000.O0000000000O0.get(var3);
         float var5 = Math.abs(o00000000.O0000000000 - var4.O000000000);
         float var6 = Math.abs(o00000000.O00000000000 - var4.O0000000000);
         if (!(var5 <= 1.5F) || !(var6 <= 1.5F)) {
            break;
         }

         var2++;
      }

      return var2;
   }

   private void O0000000000() {
      if (!this.O00000000000O0.isEmpty()) {
         Path var1 = O000000OO0000.O00000000(this.O00000000000O.O0000000000O0());
         O000000OO000 var2 = O000000OO0000.O00000000(var1);
         if (var2 == null) {
            var2 = new O000000OO000();
            var2.O000000000 = System.currentTimeMillis();
            var2.O00000000000 = O000000OO0000.O000000000(this.O00000000000O.O0000000000O0());
         }

         var2.O0000000000 = System.currentTimeMillis();
         var2.O0000000000000.addAll(this.O00000000000O0);
         O000000OO0000.O00000000(var1, var2);
         ChatUtil.O00000000("[RotationLab] Saved " + this.O00000000000O0.size() + " patterns to " + var1.getFileName());
      }
   }

   private boolean O00000000000(double d, double e) {
      return this.O00000000(d, e, this.O0000000000O.O00000000, this.O0000000000O.O000000000) <= this.O0000000000O.O000000000000;
   }

   private String O00000000000() {
      String var1 = this.O00000000000O.O0000000000O00();
      if (!"Mixed".equals(var1)) {
         return var1;
      } else {
         String[] var2 = new String[]{"Flick", "Tracking", "Micro", "Vertical", "Diagonal", "Attack"};
         return var2[ThreadLocalRandom.current().nextInt(var2.length)];
      }
   }

   private double O000000000000(double d, double e) {
      double var5 = ThreadLocalRandom.current().nextDouble(d, Math.max(d + 1.0, e));
      return ThreadLocalRandom.current().nextBoolean() ? var5 : -var5;
   }

   private float O00000000(double d) {
      return (float)(d / Math.max(1.0, (double)this.width) * 95.0);
   }

   private float O000000000(double d) {
      return (float)(d / Math.max(1.0, (double)this.height) * 70.0);
   }

   private double O00000000(double d, double e, double f, double g) {
      return Math.hypot(d - f, e - g);
   }

   private void O00000000(DrawContext drawContext) {
      byte var2 = 12;
      byte var3 = 12;
      short var4 = 222;
      byte var5 = 74;
      drawContext.fill(var2 - 6, var3 - 6, var2 + var4, var3 + var5, -1441326300);
      drawContext.drawTextWithShadow(this.textRenderer, "RotationLab", var2, var3, -1446152);
      drawContext.drawTextWithShadow(this.textRenderer, "asset: " + O000000OO0000.O000000000(this.O00000000000O.O0000000000O0()), var2, var3 + 14, -7366230);
      drawContext.drawTextWithShadow(this.textRenderer, "mode: " + this.O00000000000O.O0000000000O00().toLowerCase(Locale.ROOT), var2, var3 + 28, -7366230);
      drawContext.drawTextWithShadow(
         this.textRenderer, "patterns: " + this.O00000000000O0.size() + " / " + this.O00000000000O.O0000000000OOO(), var2, var3 + 42, -7366230
      );
      drawContext.drawTextWithShadow(this.textRenderer, "R reset  D delete  Esc save", var2, var3 + 56, -7366230);
   }

   private void O000000000(DrawContext drawContext) {
      if (this.O00000000000OO.size() >= 2) {
         for (int var2 = Math.max(1, this.O00000000000OO.size() - 20); var2 < this.O00000000000OO.size(); var2++) {
            O000000OO000.W46 var3 = this.O00000000000OO.get(var2 - 1);
            O000000OO000.W46 var4 = this.O00000000000OO.get(var2);
            int var5 = (int)(this.O0000000000O0O + var3.O000000000 / 95.0F * this.width);
            int var6 = (int)(this.O0000000000OO + var3.O0000000000 / 70.0F * this.height);
            int var7 = (int)(this.O0000000000O0O + var4.O000000000 / 95.0F * this.width);
            int var8 = (int)(this.O0000000000OO + var4.O0000000000 / 70.0F * this.height);
            this.O00000000(drawContext, var5, var6, var7, var8, -2142256137);
         }
      }
   }

   private void O0000000000(DrawContext drawContext) {
      if (this.O0000000000O != null) {
         this.O00000000(drawContext, (int)this.O0000000000O.O00000000, (int)this.O0000000000O.O000000000, this.O0000000000O.O000000000000 + 4, 956255850);
         this.O00000000(drawContext, (int)this.O0000000000O.O00000000, (int)this.O0000000000O.O000000000, this.O0000000000O.O000000000000, -45462);
         this.O00000000(drawContext, (int)this.O0000000000O.O00000000, (int)this.O0000000000O.O000000000, Math.max(2, this.O0000000000O.O000000000000 / 4), -1);
         drawContext.drawTextWithShadow(
            this.textRenderer,
            this.O0000000000O.O0000000000000,
            (int)this.O0000000000O.O00000000 + this.O0000000000O.O000000000000 + 8,
            (int)this.O0000000000O.O000000000 - 4,
            -1446152
         );
      }
   }

   private void O00000000(DrawContext drawContext, int i, int j, int k, int l) {
      int var6 = k * k;

      for (int var7 = -k; var7 <= k; var7++) {
         int var8 = (int)Math.sqrt(Math.max(0, var6 - var7 * var7));
         drawContext.fill(i - var8, j + var7, i + var8 + 1, j + var7 + 1, l);
      }
   }

   private void O00000000(DrawContext drawContext, int i, int j, int k, int l, int m) {
      int var7 = Math.abs(k - i);
      int var8 = Math.abs(l - j);
      int var9 = i < k ? 1 : -1;
      int var10 = j < l ? 1 : -1;
      int var11 = var7 - var8;

      while (true) {
         drawContext.fill(i - 1, j - 1, i + 2, j + 2, m);
         if (i == k && j == l) {
            return;
         }

         int var12 = var11 * 2;
         if (var12 > -var8) {
            var11 -= var8;
            i += var9;
         }

         if (var12 < var7) {
            var11 += var7;
            j += var10;
         }
      }
   }

   static final class W352 {
      double O00000000;
      double O000000000;
      double O0000000000;
      double O00000000000;
      final int O000000000000;
      final String O0000000000000;

      W352(double d, double e, int i, String string) {
         this.O00000000 = d;
         this.O000000000 = e;
         this.O000000000000 = i;
         this.O0000000000000 = string;
      }
   }
}
