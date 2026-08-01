package ru.metaculture.protection;

import net.minecraft.client.gui.widget.SliderWidget;
import net.minecraft.text.Text;

public final class O00000OO00 extends SliderWidget {
   private final AutoBuy O00000000;

   public O00000OO00(AutoBuy o000000OO00O0O, int i, int j, int k, int l) {
      super(i, j, k, l, O00000000(o000000OO00O0O), O000000000(o000000OO00O0O));
      this.O00000000 = o000000OO00O0O;
   }

   protected void updateMessage() {
      this.setMessage(O00000000(this.O00000000));
   }

   protected void applyValue() {
      this.O00000000.O000000000O0O0.O00000000(O00000000(this.O00000000, this.value));
      this.updateMessage();
   }

   public void O00000000() {
      this.value = O000000000(this.O00000000);
      this.updateMessage();
   }

   private static Text O00000000(AutoBuy o000000OO00O0O) {
      return Text.literal("Discount: " + Math.round(o000000OO00O0O.O000000000O0O0.O0000000000()) + "%");
   }

   private static double O000000000(AutoBuy o000000OO00O0O) {
      float var1 = o000000OO00O0O.O000000000O0O0.O000000000000;
      float var2 = o000000OO00O0O.O000000000O0O0.O0000000000000;
      return var2 <= var1 ? 0.0 : Math.max(0.0, Math.min(1.0, (double)((o000000OO00O0O.O000000000O0O0.O0000000000() - var1) / (var2 - var1))));
   }

   private static float O00000000(AutoBuy o000000OO00O0O, double d) {
      double var3 = Math.max(0.0, Math.min(1.0, d));
      float var5 = o000000OO00O0O.O000000000O0O0.O000000000000;
      float var6 = o000000OO00O0O.O000000000O0O0.O0000000000000;
      float var7 = (float)(var5 + var3 * (var6 - var5));
      float var8 = o000000OO00O0O.O000000000O0O0.O000000000000O;
      if (var8 > 0.0F) {
         var7 = Math.round(var7 / var8) * var8;
      }

      return Math.max(var5, Math.min(var6, var7));
   }
}
