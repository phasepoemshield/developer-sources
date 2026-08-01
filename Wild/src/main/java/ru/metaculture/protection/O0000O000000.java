package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import org.wild.module.api.Module;

public final class O0000O000000 {
   public O0000O0000000 O00000000(O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      List var4 = o0000O000O0O0.O0000000000000();
      ArrayList var5 = new ArrayList(var4.size());
      float[] var6 = new float[]{0.0F, 0.0F};
      int var7 = 0;

      for (int var8 = 0; var8 < var4.size(); var8++) {
         Module var9 = (Module)var4.get(var8);
         O0000O000O000 var10 = O0000O000O0000.O00000000(var9);
         boolean var11 = var10 != null && var10.O00000000(var9, o0000O000O0O0);
         int var12 = var11 ? -1 : var7 % 2;
         float var13 = var11 ? Math.max(var6[0], var6[1]) : var6[var12];
         float var14 = var11 ? o00000OOOOOOOO.O000000000O0() : (var12 == 0 ? o00000OOOOOOOO.O000000000O0() : o00000OOOOOOOO.O000000000O00());
         float var15 = o00000OOOOOOOO.O0000000000OO0() + o0000O000O0O0.O0000000O00O() + var13;
         float var16 = var11 ? o0000O00000.O0000000000OO() * 2.0F + o0000O00000.O000000000000O() : o0000O00000.O0000000000OO();
         float var17 = o0000O000O0O0.O00000000(O0000O000O00O0.O00000000(var9));
         float var18 = this.O00000000(var9, o0000O00000, o0000O000O0O0) * var17;
         float var19 = this.O00000000(var9, var16, o0000O00000);
         float var20 = var19 + var18;
         var5.add(new O0000O00000000(var9, var14, var15, var16, var20, var18));
         if (var11) {
            float var21 = var13 + var20 + o0000O00000.O0000000000OOO();
            var6[0] = var21;
            var6[1] = var21;
         } else {
            var6[var12] += var20 + o0000O00000.O0000000000OOO();
            var7++;
         }
      }

      float var22 = Math.max(0.0F, Math.max(var6[0], var6[1]) - o0000O00000.O0000000000OOO());
      if (!var5.isEmpty()) {
         var22 += this.O00000000(o0000O00000, o00000OOOOOOOO, var22);
      }

      float var23 = Math.max(0.0F, var22 - o00000OOOOOOOO.O000000000O());
      return new O0000O0000000(var5, var23);
   }

   private float O00000000(O0000O00000 o0000O00000, O00000OOOOOOOO o00000OOOOOOOO, float f) {
      float var4 = Math.max(o0000O00000.O0000000000O0O(), o0000O00000.O0000000000OOO() * 2.0F);
      float var5 = o00000OOOOOOOO.O000000000O() - f;
      return var5 >= var4 ? 0.0F : var4;
   }

   public float O00000000(Module module, O0000O00000 o0000O00000, O0000O000O0O0 o0000O000O0O0) {
      O0000O000O000 var4 = O0000O000O0000.O00000000(module);
      if (var4 != null) {
         return var4.O00000000(module, o0000O00000, o0000O000O0O0);
      } else {
         float var5 = o0000O00000.O00000000(1.0F) + o0000O00000.O00000000(20.0F);
         List var6 = module.O0000000000000();

         for (int var7 = 0; var7 < var6.size(); var7++) {
            Setting var8 = (Setting)var6.get(var7);
            if (var8 instanceof O000000O0 var9) {
               var5 += o0000O00000.O00000000(var9.O0000000000());
            } else {
               float var12 = o0000O000O0O0.O00000000(O0000O000O00O0.O00000000000(var8));
               float var10 = this.O00000000(var8, o0000O00000, o0000O000O0O0);
               float var11 = this.O00000000(var8, o0000O000O0O0, o0000O00000);
               var5 += (var10 + var11) * var12;
               if (var7 < var6.size() - 1) {
                  var5 += o0000O00000.O00000000(12.0F) * var12;
               }
            }
         }

         return var5;
      }
   }

   public float O00000000(Module module, float f, O0000O00000 o0000O00000) {
      String var4 = module.O00000000000OO == null ? "" : module.O00000000000OO;
      if (var4.isBlank()) {
         return o0000O00000.O0000000000OO0();
      } else {
         float var5 = Math.max(o0000O00000.O00000000(160.0F), f - o0000O00000.O00000000(90.0F));
         int var6 = O0000O00000OO.O00000000(FontRegistry.O00000000, var4, 10.0F, var5, 10).size();
         float var7 = o0000O00000.O00000000(54.0F) + Math.max(1, var6) * o0000O00000.O00000000(12.0F);
         return Math.max(o0000O00000.O0000000000OO0(), var7);
      }
   }

   public float O00000000(Setting o0000000OOO00O, O0000O00000 o0000O00000, O0000O000O0O0 o0000O000O0O0) {
      if (o0000000OOO00O instanceof NumberSetting) {
         return o0000O00000.O00000000(22.0F);
      } else if (o0000000OOO00O instanceof O000000O00) {
         return o0000O00000.O00000000(18.0F);
      } else if (o0000000OOO00O instanceof ColorSetting var11) {
         float var12 = o0000O000O0O0.O00000000(O0000O000O00O0.O00000000000O(var11));
         float var13 = o0000O00000.O00000000(16.0F);
         float var14 = o0000O00000.O00000000(186.0F);
         return var13 + var14 * var12;
      } else if (o0000000OOO00O instanceof O000000O0 var10) {
         return o0000O00000.O00000000(var10.O0000000000());
      } else if (o0000000OOO00O instanceof GroupSetting var4) {
         float var5 = o0000O00000.O0000000000OO() - o0000O00000.O00000000(32.0F);
         float var6 = var5 * 0.7F;
         int var7 = O0000O00000OO.O00000000(var4, var6, o0000O00000);
         float var8 = o0000O00000.O00000000(14.0F);
         float var9 = o0000O00000.O00000000(3.0F);
         return o0000O00000.O00000000(1.0F) + var7 * var8 + (var7 > 1 ? (var7 - 1) * var9 : 0.0F) + o0000O00000.O00000000(1.0F);
      } else {
         return o0000O00000.O00000000(14.0F);
      }
   }

   public float O00000000(Setting o0000000OOO00O, O0000O00000 o0000O00000) {
      if (o0000000OOO00O instanceof NumberSetting || o0000000OOO00O instanceof ColorSetting) {
         return o0000O00000.O00000000(22.0F);
      } else if (o0000000OOO00O instanceof O000000O00) {
         return o0000O00000.O00000000(18.0F);
      } else if (o0000000OOO00O instanceof O000000O0 var9) {
         return o0000O00000.O00000000(var9.O0000000000());
      } else if (o0000000OOO00O instanceof GroupSetting var3) {
         float var4 = o0000O00000.O0000000000OO() - o0000O00000.O00000000(32.0F);
         float var5 = var4 * 0.7F;
         int var6 = O0000O00000OO.O00000000(var3, var5, o0000O00000);
         float var7 = o0000O00000.O00000000(14.0F);
         float var8 = o0000O00000.O00000000(3.0F);
         return o0000O00000.O00000000(1.0F) + var6 * var7 + (var6 > 1 ? (var6 - 1) * var8 : 0.0F) + o0000O00000.O00000000(1.0F);
      } else {
         return o0000O00000.O00000000(14.0F);
      }
   }

   public float O00000000(Setting o0000000OOO00O, O0000O000O0O0 o0000O000O0O0, O0000O00000 o0000O00000) {
      if (o0000000OOO00O instanceof ModeSetting var4) {
         float var5 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000000(var4));
         if (var5 > 0.01F) {
            float var6 = o0000O00000.O00000000(6.0F) + var4.O00000000000.size() * o0000O00000.O00000000(18.0F) + o0000O00000.O00000000(4.0F);
            return var6 * var5;
         }
      }

      if (o0000000OOO00O instanceof O000000O00 var7) {
         float var8 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000000(var7));
         if (var8 > 0.01F) {
            return SettingsRenderer.O00000000(var7, o0000O00000) * var8;
         }
      }

      return 0.0F;
   }
}
