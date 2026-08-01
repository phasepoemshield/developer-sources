package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import org.wild.module.api.Module;

public final class O00000OOOOOO0 {
   private final O0000O000000 O00000000;
   private final O00000OOOOOOO0 O000000000;
   private final O0000O0000OO00 O0000000000;

   public List<O00000OOOOOO> O00000000(
      O0000O000O0O0 o0000O000O0O0,
      O00000OOOOOOOO o00000OOOOOOOO,
      O0000O0000000 o0000O0000000,
      O0000O00000 o0000O00000,
      O0000O000OO o0000O000OO,
      float f,
      float g
   ) {
      ArrayList var8 = new ArrayList();
      boolean var9 = this.O00000000(o00000OOOOOOOO, o0000O00000, f, g);
      this.O00000000000(var8, o00000OOOOOOOO, o0000O00000);
      this.O00000000(var8, o00000OOOOOOOO, o0000O00000);
      this.O000000000(var8, o00000OOOOOOOO, o0000O00000);
      this.O000000000000(var8, o00000OOOOOOOO, o0000O00000);
      this.O0000000000(var8, o00000OOOOOOOO, o0000O00000);
      this.O0000000000000(var8, o00000OOOOOOOO, o0000O00000);
      this.O00000000000O0(var8, o00000OOOOOOOO, o0000O00000);
      if (o0000O000O0O0.O000000O0O0O0()) {
         this.O0000000000O(var8, o00000OOOOOOOO, o0000O00000);
         this.O000000000000O(var8, o00000OOOOOOOO, o0000O00000);
         this.O00000000000O(var8, o00000OOOOOOOO, o0000O00000);
         if (!var9) {
            this.O00000000(var8, o0000O000O0O0, o00000OOOOOOOO, o0000O00000, o0000O000OO);
         }

         return var8;
      } else {
         if (o0000O000O0O0.O00000000OO00()) {
            this.O0000000000O0(var8, o00000OOOOOOOO, o0000O00000);
            this.O00000000000OO(var8, o00000OOOOOOOO, o0000O00000);
         } else if (o0000O000O0O0.O00000000OO0()) {
            this.O00000000(var8, o0000O000O0O0, o00000OOOOOOOO, o0000O00000);
         } else if (!o0000O000O0O0.O00000000OO000()) {
            this.O00000000(var8, o0000O000O0O0, o0000O0000000, o00000OOOOOOOO, o0000O00000, f);
         }

         if (!var9) {
            this.O00000000(var8, o0000O000O0O0, o00000OOOOOOOO, o0000O00000, o0000O000OO);
         }

         return var8;
      }
   }

   private void O00000000(List<O00000OOOOOO> list, O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000, O0000O000OO o0000O000OO) {
      if (o0000O000O0O0.O000000O0O0O00()) {
         float var6 = o0000O00000.O000000000(20.0F);
         list.add(
            O00000OOOOOO.O00000000()
               .O00000000(0)
               .O00000000(o00000OOOOOOOO.O000000000O00O() + o0000O00000.O000000000O0() - o0000O00000.O000000000(16.0F) - var6)
               .O000000000(o00000OOOOOOOO.O000000000O0O() + o0000O00000.O000000000(20.0F))
               .O0000000000(var6)
               .O00000000000(var6)
               .O00000000(O0000O000O0O0::O000000000O0O)
               .O00000000()
         );
         O0000O0000000O var7 = O0000O0000000O.O00000000(o00000OOOOOOOO, o0000O00000);
         if (!o0000O000O0O0.O00000000OOO0().isEmpty()) {
            list.add(
               O00000OOOOOO.O00000000()
                  .O00000000(0)
                  .O00000000(var7.O00000000000O0())
                  .O000000000(var7.O0000000000000())
                  .O0000000000(var7.O00000000000OO())
                  .O00000000000(var7.O00000000000O())
                  .O00000000(O0000O000O0O0::O000000000O000)
                  .O00000000()
            );
         }

         list.add(
            O00000OOOOOO.O00000000()
               .O00000000(0)
               .O00000000(var7.O000000000000())
               .O000000000(var7.O0000000000000())
               .O0000000000(var7.O000000000000O())
               .O00000000000(var7.O00000000000O())
               .O00000000(O0000O000O0O0::O000000000O00)
               .O00000000()
         );
         float var8 = var7.O000000000();
         float var9 = var8 + var7.O00000000000();
         float var10 = o0000O000O0O0.O0000000000OOO();
         List var11 = o0000O000O0O0.O00000000(o0000O000OO);

         for (int var12 = 0; var12 < var11.size(); var12++) {
            int var13 = (Integer)var11.get(var12);
            O0000O0000000O.W330 var14 = var7.O00000000(var12, var10);
            if (!(var14.y() + var14.height() < var8) && !(var14.y() > var9)) {
               list.add(
                  O00000OOOOOO.O00000000()
                     .O00000000(0)
                     .O00000000(var14.x())
                     .O000000000(var14.y())
                     .O0000000000(var14.width())
                     .O00000000000(var14.height())
                     .O000000000000(var7.O00000000())
                     .O0000000000000(var8)
                     .O000000000000O(var7.O0000000000())
                     .O00000000000O(var9 - var8)
                     .O00000000(o0000O000O0O0x -> o0000O000O0O0x.O00000000(o0000O000OO.O000000000().get(var13).O000000000(), var13))
                     .O00000000()
               );
            }
         }
      }
   }

   private void O00000000(List<O00000OOOOOO> list, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      list.add(
         O00000OOOOOO.O00000000()
            .O00000000(0)
            .O00000000(SearchBarRenderer.O0000000000(o00000OOOOOOOO, o0000O00000))
            .O000000000(SearchBarRenderer.O00000000000(o00000OOOOOOOO, o0000O00000))
            .O0000000000(SearchBarRenderer.O0000000000(o0000O00000))
            .O00000000000(SearchBarRenderer.O00000000000(o0000O00000))
            .O00000000(o0000O000O0O0 -> {
               o0000O000O0O0.O00000000000O(false);
               o0000O000O0O0.O00000000((NumberSetting)null);
               o0000O000O0O0.O00000000(false);
               o0000O000O0O0.O000000000O0O0(!o0000O000O0O0.O000000O0O0OO());
            })
            .O00000000()
      );
   }

   private void O000000000(List<O00000OOOOOO> list, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      if (O00000O0OOO0O0.O00000000()) {
         list.add(
            O00000OOOOOO.O00000000()
               .O00000000(0)
               .O00000000(SearchBarRenderer.O00000000(o00000OOOOOOOO, o0000O00000))
               .O000000000(SearchBarRenderer.O000000000(o00000OOOOOOOO, o0000O00000))
               .O0000000000(SearchBarRenderer.O00000000(o0000O00000))
               .O00000000000(SearchBarRenderer.O000000000(o0000O00000))
               .O00000000(o0000O000O0O0 -> {
                  o0000O000O0O0.O00000000000O(false);
                  o0000O000O0O0.O00000000((NumberSetting)null);
                  o0000O000O0O0.O00000000(false);
                  o0000O000O0O0.O000000000O0O0(false);
                  o0000O000O0O0.O0000000000O();
               })
               .O00000000()
         );
      }
   }

   private void O0000000000(List<O00000OOOOOO> list, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      float var4 = O0000O0000OOO0.O0000000000(o00000OOOOOOOO, o0000O00000);
      float var5 = O0000O0000OOO0.O000000000000(o00000OOOOOOOO, o0000O00000);
      float var6 = O0000O0000OOO0.O000000000(o0000O00000);
      list.add(
         O00000OOOOOO.O00000000()
            .O00000000(0)
            .O00000000(var4)
            .O000000000(var5)
            .O0000000000(var6)
            .O00000000000(var6)
            .O00000000(O0000O000O0O0::O000000000000O)
            .O00000000()
      );
   }

   private void O00000000000(List<O00000OOOOOO> list, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      list.add(
         O00000OOOOOO.O00000000()
            .O00000000(0)
            .O00000000(O0000O0000OOO0.O00000000(o00000OOOOOOOO, o0000O00000))
            .O000000000(O0000O0000OOO0.O000000000(o00000OOOOOOOO, o0000O00000))
            .O0000000000(O0000O0000OOO0.O00000000(o0000O00000))
            .O00000000000(O0000O0000OOO0.O00000000(o0000O00000))
            .O00000000(o0000O000O0O0 -> o0000O000O0O0.O00000000(!o0000O000O0O0.O000000O0O0O00()))
            .O00000000()
      );
   }

   private void O000000000000(List<O00000OOOOOO> list, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      float var4 = O0000O0000OOO0.O0000000000(o00000OOOOOOOO, o0000O00000);
      float var5 = Math.round(o00000OOOOOOOO.O00000000000() + o0000O00000.O00000000(89.0F));
      Category[] var6 = Category.values();

      for (int var7 = 0; var7 < var6.length; var7++) {
         Category var8 = var6[var7];
         float var9 = var5 + var7 * o0000O00000.O00000000(56.0F);
         list.add(
            O00000OOOOOO.O00000000()
               .O00000000(0)
               .O00000000(var4)
               .O000000000(var9)
               .O0000000000(O0000O0000OOO0.O000000000(o0000O00000))
               .O00000000000(O0000O0000OOO0.O000000000(o0000O00000))
               .O00000000(o0000O000O0O0 -> o0000O000O0O0.O00000000(var8))
               .O00000000()
         );
      }
   }

   private void O0000000000000(List<O00000OOOOOO> list, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      float var4 = O0000O0000OOO0.O0000000000(o00000OOOOOOOO, o0000O00000);
      float var5 = O0000O0000OOO0.O00000000000(o00000OOOOOOOO, o0000O00000);
      float var6 = O0000O0000OOO0.O000000000(o0000O00000);
      list.add(
         O00000OOOOOO.O00000000()
            .O00000000(0)
            .O00000000(var4)
            .O000000000(var5)
            .O0000000000(var6)
            .O00000000000(var6)
            .O00000000(O0000O000O0O0::O000000000OO00)
            .O00000000()
      );
   }

   private void O000000000000O(List<O00000OOOOOO> list, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      list.add(
         O00000OOOOOO.O00000000()
            .O00000000(0)
            .O00000000(this.O0000000000.O0000000000000(o00000OOOOOOOO, o0000O00000))
            .O000000000(this.O0000000000.O000000000000O(o00000OOOOOOOO, o0000O00000))
            .O0000000000(this.O0000000000.O00000000000(o0000O00000))
            .O00000000000(this.O0000000000.O000000000000(o0000O00000))
            .O00000000(O0000O000O0O0::O000000000OO00)
            .O00000000()
      );
   }

   private void O00000000000O(List<O00000OOOOOO> list, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      list.add(
         O00000OOOOOO.O00000000()
            .O00000000(0)
            .O00000000(O0000O0000OO00.O00000000(o00000OOOOOOOO, o0000O00000))
            .O000000000(O0000O0000OO00.O000000000(o00000OOOOOOOO, o0000O00000))
            .O0000000000(this.O0000000000.O00000000(o0000O00000))
            .O00000000000(O0000O0000OO00.O0000000000(o00000OOOOOOOO, o0000O00000))
            .O00000000(o0000O000O0O0 -> {})
            .O00000000()
      );
   }

   private void O00000000000O0(List<O00000OOOOOO> list, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      list.add(
         O00000OOOOOO.O00000000()
            .O00000000(0)
            .O00000000(o00000OOOOOOOO.O00000000000OO() + o0000O00000.O0000000000O0() - o0000O00000.O00000000(34.0F))
            .O000000000(o00000OOOOOOOO.O00000000000O())
            .O0000000000(o0000O00000.O00000000(34.0F))
            .O00000000000(o0000O00000.O0000000000O())
            .O00000000(O0000O000O0O0::O000000000O)
            .O00000000()
      );
      list.add(
         O00000OOOOOO.O00000000()
            .O00000000(0)
            .O00000000(o00000OOOOOOOO.O00000000000OO())
            .O000000000(o00000OOOOOOOO.O00000000000O())
            .O0000000000(o0000O00000.O0000000000O0())
            .O00000000000(o0000O00000.O0000000000O())
            .O00000000(o0000O000O0O0 -> {
               o0000O000O0O0.O00000000000O(true);
               o0000O000O0O0.O00000000000O0(false);
               o0000O000O0O0.O00000000((NumberSetting)null);
            })
            .O00000000()
      );
   }

   private void O00000000(
      List<O00000OOOOOO> list, O0000O000O0O0 o0000O000O0O0, O0000O0000000 o0000O0000000, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000, float f
   ) {
      float var7 = o00000OOOOOOOO.O0000000000O();
      float var8 = o00000OOOOOOOO.O0000000000O0();
      float var9 = o00000OOOOOOOO.O0000000000O00();
      float var10 = o0000O00000.O0000000000O00();
      float var11 = var8 + var10;

      for (O0000O00000000 var13 : o0000O0000000.O000000000()) {
         if (!(var13.O0000000000() >= var11) && !(var13.O0000000000() + var13.O000000000000() <= var8)) {
            if (o0000O000O0O0.O00000000O0O().contains(var13.O00000000())) {
               if (O0000O000O0000.O000000000(var13.O00000000())) {
                  O0000O000O0000.O00000000(list, o0000O000O0O0, var13, o0000O00000);
               } else {
                  this.O00000000(list, o0000O000O0O0, var13, o0000O00000, f, var7, var8, var9, var10);
               }
            }

            this.O00000000(list, var13, o0000O00000, var7, var8, var9, var10);
         }
      }
   }

   private void O00000000(List<O00000OOOOOO> list, O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         AutoBuy var5 = WildClient.O00000000.O000000000.O00000000(AutoBuy.class);
         if (var5 != null && O0000O000O0000.O000000000(var5)) {
            O0000O000O0000.O00000000(list, o0000O000O0O0, O0000O000O0000.O00000000(var5, o00000OOOOOOOO, o0000O00000), o0000O00000);
         }
      }
   }

   private void O00000000000OO(List<O00000OOOOOO> list, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      list.add(
         O00000OOOOOO.O00000000()
            .O00000000(0)
            .O00000000(o00000OOOOOOOO.O0000000000O())
            .O000000000(o00000OOOOOOOO.O0000000000O0())
            .O0000000000(o00000OOOOOOOO.O0000000000O00())
            .O00000000000(o0000O00000.O0000000000O00())
            .O00000000(o0000O000O0O0 -> {})
            .O00000000()
      );
   }

   private void O0000000000O(List<O00000OOOOOO> list, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      list.add(
         O00000OOOOOO.O00000000()
            .O00000000(0)
            .O00000000(this.O0000000000.O00000000000(o00000OOOOOOOO, o0000O00000))
            .O000000000(this.O0000000000.O000000000000(o00000OOOOOOOO, o0000O00000))
            .O0000000000(this.O0000000000.O000000000(o0000O00000))
            .O00000000000(this.O0000000000.O0000000000(o0000O00000))
            .O00000000(O0000O000O0O0::O00000000000O0)
            .O00000000()
      );
   }

   private void O0000000000O0(List<O00000OOOOOO> list, O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      list.add(
         O00000OOOOOO.O00000000()
            .O00000000(0)
            .O00000000(O0000O0000O00.O00000000(o00000OOOOOOOO, o0000O00000))
            .O000000000(O0000O0000O00.O00000000000(o00000OOOOOOOO, o0000O00000))
            .O0000000000(O0000O0000O00.O00000000(o0000O00000))
            .O00000000000(O0000O0000O00.O00000000000(o0000O00000))
            .O00000000(o0000O000O0O0 -> O00000000OO0OO.O00000000().O00000000000OO())
            .O00000000()
      );
      list.add(
         O00000OOOOOO.O00000000()
            .O00000000(0)
            .O00000000(O0000O0000O00.O000000000(o00000OOOOOOOO, o0000O00000))
            .O000000000(O0000O0000O00.O00000000000(o00000OOOOOOOO, o0000O00000))
            .O0000000000(O0000O0000O00.O000000000(o0000O00000))
            .O00000000000(O0000O0000O00.O00000000000(o0000O00000))
            .O00000000(o0000O000O0O0 -> O00000000OO0OO.O00000000().O0000000000O())
            .O00000000()
      );
      list.add(
         O00000OOOOOO.O00000000()
            .O00000000(0)
            .O00000000(O0000O0000O00.O0000000000(o00000OOOOOOOO, o0000O00000))
            .O000000000(O0000O0000O00.O00000000000(o00000OOOOOOOO, o0000O00000))
            .O0000000000(O0000O0000O00.O0000000000(o0000O00000))
            .O00000000000(O0000O0000O00.O00000000000(o0000O00000))
            .O00000000(o0000O000O0O0 -> O00000000OO0OO.O00000000().O0000000000O0O())
            .O00000000()
      );
   }

   private void O00000000(List<O00000OOOOOO> list, O0000O00000000 o0000O00000000, O0000O00000 o0000O00000, float f, float g, float h, float i) {
      Module var8 = o0000O00000000.O00000000();
      float var9 = this.O00000000.O00000000(var8, o0000O00000000.O00000000000(), o0000O00000);
      float var10 = o0000O00000000.O0000000000() + o0000O00000.O00000000(16.0F);
      float var11 = o0000O00000000.O000000000() + o0000O00000000.O00000000000() - o0000O00000.O00000000(16.0F) - o0000O00000.O00000000(24.0F);
      float var12 = var11 - o0000O00000.O00000000(22.0F);
      boolean var13 = O0000O000O0000.O000000000(var8) || !var8.O0000000000000().isEmpty();
      if (var13) {
         list.add(
            this.O00000000(
                  O00000OOOOOO.O00000000()
                     .O00000000(0)
                     .O00000000(var12 - o0000O00000.O00000000(3.0F))
                     .O000000000(var10 - o0000O00000.O00000000(3.0F))
                     .O0000000000(o0000O00000.O00000000(20.0F))
                     .O00000000000(o0000O00000.O00000000(20.0F))
                     .O00000000(o0000O000O0O0 -> o0000O000O0O0.O00000000(var8)),
                  f,
                  g,
                  h,
                  i
               )
               .O00000000()
         );
      }

      list.add(
         this.O00000000(
               O00000OOOOOO.O00000000()
                  .O00000000(2)
                  .O00000000(o0000O00000000.O000000000())
                  .O000000000(o0000O00000000.O0000000000())
                  .O0000000000(o0000O00000000.O00000000000())
                  .O00000000000(var9)
                  .O00000000(o0000O000O0O0 -> o0000O000O0O0.O000000000(var8)),
               f,
               g,
               h,
               i
            )
            .O00000000()
      );
      if (var13) {
         list.add(
            this.O00000000(
                  O00000OOOOOO.O00000000()
                     .O00000000(1)
                     .O00000000(o0000O00000000.O000000000())
                     .O000000000(o0000O00000000.O0000000000())
                     .O0000000000(o0000O00000000.O00000000000())
                     .O00000000000(var9)
                     .O00000000(o0000O000O0O0 -> o0000O000O0O0.O00000000(var8)),
                  f,
                  g,
                  h,
                  i
               )
               .O00000000()
         );
      }

      list.add(
         this.O00000000(
               O00000OOOOOO.O00000000()
                  .O00000000(0)
                  .O00000000(o0000O00000000.O000000000())
                  .O000000000(o0000O00000000.O0000000000())
                  .O0000000000(o0000O00000000.O00000000000())
                  .O00000000000(var9)
                  .O00000000(o0000O000O0O0 -> var8.a_()),
               f,
               g,
               h,
               i
            )
            .O00000000()
      );
   }

   private void O00000000(
      List<O00000OOOOOO> list, O0000O000O0O0 o0000O000O0O0, O0000O00000000 o0000O00000000, O0000O00000 o0000O00000, float f, float g, float h, float i, float j
   ) {
      float var10 = o0000O00000000.O000000000() + o0000O00000.O00000000(16.0F);
      float var11 = o0000O00000000.O0000000000()
         + this.O00000000.O00000000(o0000O00000000.O00000000(), o0000O00000000.O00000000000(), o0000O00000)
         + o0000O00000.O00000000(10.0F);
      float var12 = o0000O00000000.O00000000000() - o0000O00000.O00000000(32.0F);

      for (Setting var14 : o0000O00000000.O00000000().O0000000000000()) {
         if (var14 instanceof O000000O0 var57) {
            var11 += o0000O00000.O00000000(var57.O0000000000());
         } else {
            float var15 = o0000O000O0O0.O00000000(O0000O000O00O0.O00000000000(var14));
            float var16 = this.O00000000.O00000000(var14, o0000O00000, o0000O000O0O0);
            float var17 = this.O00000000.O00000000(var14, o0000O000O0O0, o0000O00000);
            if (var15 < 0.5F) {
               var11 += (var16 + var17 + o0000O00000.O00000000(12.0F)) * var15;
            } else {
               float var18 = (1.0F - var15) * o0000O00000.O00000000(8.0F);
               if (var14 instanceof ColorSetting var19 && o0000O000O0O0.O0000000OOOOOO() == var19) {
                  float var61 = o0000O00000.O00000000(16.0F);
                  list.add(
                     this.O00000000(
                           O00000OOOOOO.O00000000()
                              .O00000000(0)
                              .O00000000(SettingsRenderer.O000000000(var10, var12, o0000O00000))
                              .O000000000(SettingsRenderer.O00000000000(var11 + var18, o0000O00000))
                              .O0000000000(SettingsRenderer.O000000000000(o0000O00000))
                              .O00000000000(SettingsRenderer.O000000000000(o0000O00000))
                              .O00000000(o0000O000O0O0x -> this.O000000000.O00000000(o0000O000O0O0x, var14, f, var10, var12)),
                           g,
                           h,
                           i,
                           j
                        )
                        .O00000000()
                  );
                  float var63 = o0000O000O0O0.O000000O0000();
                  float var26 = o0000O000O0O0.O000000O00000();
                  float var27 = o0000O000O0O0.O000000O000000();
                  float var28 = o0000O000O0O0.O000000O00000O();
                  if (var27 > 1.0F && var28 > 1.0F) {
                     list.add(
                        this.O00000000(
                              O00000OOOOOO.O00000000()
                                 .O00000000(0)
                                 .O00000000(var63)
                                 .O000000000(var26)
                                 .O0000000000(var27)
                                 .O00000000000(var28)
                                 .O00000000(
                                    o0000O000O0O0x -> this.O000000000.O00000000(o0000O000O0O0x, var19, o0000O000O0O0x.O0000000O(), o0000O000O0O0x.O0000000O0())
                                 ),
                              g,
                              h,
                              i,
                              j
                           )
                           .O00000000()
                     );
                  }

                  float var29 = o0000O000O0O0.O000000O0000O();
                  float var30 = o0000O000O0O0.O000000O0000O0();
                  float var31 = o0000O000O0O0.O000000O0000OO();
                  float var32 = o0000O000O0O0.O000000O000O();
                  if (var31 > 1.0F && var32 > 1.0F) {
                     list.add(
                        this.O00000000(
                              O00000OOOOOO.O00000000()
                                 .O00000000(0)
                                 .O00000000(var29)
                                 .O000000000(var30)
                                 .O0000000000(var31)
                                 .O00000000000(var32)
                                 .O00000000(
                                    o0000O000O0O0x -> this.O000000000
                                       .O000000000(o0000O000O0O0x, var19, o0000O000O0O0x.O0000000O(), o0000O000O0O0x.O0000000O0())
                                 ),
                              g,
                              h,
                              i,
                              j
                           )
                           .O00000000()
                     );
                  }

                  float var33 = o0000O000O0O0.O000000O000O0();
                  float var34 = o0000O000O0O0.O000000O000O00();
                  float var35 = o0000O000O0O0.O000000O000O0O();
                  float var36 = o0000O000O0O0.O000000O000OO();
                  if (var35 > 1.0F && var36 > 1.0F) {
                     list.add(
                        this.O00000000(
                              O00000OOOOOO.O00000000()
                                 .O00000000(0)
                                 .O00000000(var33)
                                 .O000000000(var34)
                                 .O0000000000(var35)
                                 .O00000000000(var36)
                                 .O00000000(o0000O000O0O0x -> this.O000000000.O00000000(o0000O000O0O0x, var19, o0000O000O0O0x.O0000000O())),
                              g,
                              h,
                              i,
                              j
                           )
                           .O00000000()
                     );
                  }

                  float var37 = o0000O000O0O0.O000000O000OO0();
                  float var38 = o0000O000O0O0.O000000O000OOO();
                  float var39 = o0000O000O0O0.O000000O00O();
                  float var40 = o0000O000O0O0.O000000O00O0();
                  if (var39 > 1.0F && var40 > 1.0F) {
                     list.add(
                        this.O00000000(
                              O00000OOOOOO.O00000000()
                                 .O00000000(0)
                                 .O00000000(var37)
                                 .O000000000(var38)
                                 .O0000000000(var39)
                                 .O00000000000(var40)
                                 .O00000000(o0000O000O0O0x -> this.O000000000.O000000000(o0000O000O0O0x, var19, o0000O000O0O0x.O0000000O())),
                              g,
                              h,
                              i,
                              j
                           )
                           .O00000000()
                     );
                  }

                  float var41 = o0000O000O0O0.O000000O00O00();
                  float var42 = o0000O000O0O0.O000000O00O000();
                  float var43 = o0000O000O0O0.O000000O00O00O();
                  float var44 = o0000O000O0O0.O000000O00O0O();
                  if (var43 > 1.0F && var44 > 1.0F) {
                     list.add(
                        this.O00000000(
                              O00000OOOOOO.O00000000()
                                 .O00000000(0)
                                 .O00000000(var41)
                                 .O000000000(var42)
                                 .O0000000000(var43)
                                 .O00000000000(var44)
                                 .O00000000(o0000O000O0O0x -> this.O000000000.O00000000(o0000O000O0O0x, var19, o0000O000O0O0x.O0000000O(), false)),
                              g,
                              h,
                              i,
                              j
                           )
                           .O00000000()
                     );
                     list.add(
                        this.O00000000(
                              O00000OOOOOO.O00000000()
                                 .O00000000(1)
                                 .O00000000(var41)
                                 .O000000000(var42)
                                 .O0000000000(var43)
                                 .O00000000000(var44)
                                 .O00000000(o0000O000O0O0x -> this.O000000000.O00000000(o0000O000O0O0x, var19, o0000O000O0O0x.O0000000O(), true)),
                              g,
                              h,
                              i,
                              j
                           )
                           .O00000000()
                     );
                  }

                  float var45 = o0000O000O0O0.O000000O00OO00();
                  float var46 = o0000O000O0O0.O000000O00O0OO();
                  float var47 = o0000O000O0O0.O000000O00OO0O();
                  float var48 = o0000O000O0O0.O000000O00OO0();
                  if (var47 > 1.0F && var48 > 1.0F) {
                     list.add(
                        this.O00000000(
                              O00000OOOOOO.O00000000()
                                 .O00000000(0)
                                 .O00000000(var45)
                                 .O000000000(var46)
                                 .O0000000000(var47)
                                 .O00000000000(var48)
                                 .O00000000(o0000O000O0O0x -> {
                                    var19.O00000000(o0000O000O0O0x.O000000000(var19));
                                    o0000O000O0O0x.O000000000OO0();
                                    o0000O000O0O0x.O00000000O000O();
                                 }),
                              g,
                              h,
                              i,
                              j
                           )
                           .O00000000()
                     );
                  }

                  float var49 = o0000O000O0O0.O000000O00OOO();
                  float var50 = o0000O000O0O0.O000000O00OOO0();
                  float var51 = o0000O000O0O0.O000000O00OOOO();
                  float var52 = o0000O000O0O0.O000000O0O();
                  if (var51 > 1.0F && var52 > 1.0F) {
                     list.add(
                        this.O00000000(
                              O00000OOOOOO.O00000000()
                                 .O00000000(0)
                                 .O00000000(var49)
                                 .O000000000(var50)
                                 .O0000000000(var51)
                                 .O00000000000(var52)
                                 .O00000000(o0000O000O0O0x -> {
                                    o0000O000O0O0x.O0000000000000((ColorSetting)null);
                                    o0000O000O0O0x.O000000000000O("");
                                    o0000O000O0O0x.O000000000000(var19);
                                    o0000O000O0O0x.O0000000000000(String.format("%06X", var19.O00000000000O0() & 16777215));
                                 }),
                              g,
                              h,
                              i,
                              j
                           )
                           .O00000000()
                     );
                  }

                  float var53 = o0000O000O0O0.O000000O0O0();
                  float var54 = o0000O000O0O0.O000000O0O00();
                  float var55 = o0000O000O0O0.O000000O0O000();
                  float var56 = o0000O000O0O0.O000000O0O0000();
                  if (var55 > 1.0F && var56 > 1.0F) {
                     list.add(
                        this.O00000000(
                              O00000OOOOOO.O00000000()
                                 .O00000000(0)
                                 .O00000000(var53)
                                 .O000000000(var54)
                                 .O0000000000(var55)
                                 .O00000000000(var56)
                                 .O00000000(o0000O000O0O0x -> {
                                    o0000O000O0O0x.O000000000000((ColorSetting)null);
                                    o0000O000O0O0x.O0000000000000("");
                                    o0000O000O0O0x.O0000000000000(var19);
                                    o0000O000O0O0x.O000000000000O(Integer.toString(Math.round(var19.O0000000000OO * 100.0F)));
                                 }),
                              g,
                              h,
                              i,
                              j
                           )
                           .O00000000()
                     );
                  }
               } else if (var14 instanceof GroupSetting var20) {
                  this.O00000000(list, var20, var10, var11 + var18, var12, var16, o0000O00000, g, h, i, j);
               } else if (var14 instanceof O000000O00 var21) {
                  float var24 = SettingsRenderer.O00000000(var21, var10, var12, o0000O00000);
                  float var25 = SettingsRenderer.O000000000(var11 + var18, o0000O00000);
                  list.add(
                     this.O00000000(
                           O00000OOOOOO.O00000000()
                              .O00000000(0)
                              .O00000000(var24)
                              .O000000000(var25)
                              .O0000000000(SettingsRenderer.O00000000(var21, var12, o0000O00000))
                              .O00000000000(SettingsRenderer.O000000000(o0000O00000))
                              .O00000000(o0000O000O0O0x -> o0000O000O0O0x.O00000000(var21)),
                           g,
                           h,
                           i,
                           j
                        )
                        .O00000000()
                  );
                  if (var21.O000000000000) {
                     this.O00000000(list, var21, var10, var11 + var18, var12, o0000O00000, g, h, i, j);
                  }
               } else if (var14 instanceof ModeSetting var22) {
                  float var58 = SettingsRenderer.O00000000(var22, var10, var12, o0000O00000);
                  float var62 = SettingsRenderer.O00000000(var11 + var18, o0000O00000);
                  list.add(
                     this.O00000000(
                           O00000OOOOOO.O00000000()
                              .O00000000(0)
                              .O00000000(var58)
                              .O000000000(var62)
                              .O0000000000(SettingsRenderer.O00000000(var22, var12, o0000O00000))
                              .O00000000000(SettingsRenderer.O00000000(o0000O00000))
                              .O00000000(o0000O000O0O0x -> o0000O000O0O0x.O00000000(var22)),
                           g,
                           h,
                           i,
                           j
                        )
                        .O00000000()
                  );
                  if (var22.O00000000000O0) {
                     this.O00000000(list, var22, var10, var11 + var18, var12, o0000O00000, g, h, i, j);
                  }
               } else if (var14 instanceof BooleanSetting var23) {
                  float var59 = SettingsRenderer.O00000000000(o0000O00000);
                  list.add(
                     this.O00000000(
                           O00000OOOOOO.O00000000()
                              .O00000000(0)
                              .O00000000(SettingsRenderer.O00000000(var10, var12, o0000O00000))
                              .O000000000(SettingsRenderer.O0000000000(var11 + var18, o0000O00000))
                              .O0000000000(var59)
                              .O00000000000(var59)
                              .O00000000(o0000O000O0O0x -> this.O000000000.O00000000(o0000O000O0O0x, var14, f, var10, var12)),
                           g,
                           h,
                           i,
                           j
                        )
                        .O00000000()
                  );
                  list.add(
                     this.O00000000(
                           O00000OOOOOO.O00000000()
                              .O00000000(2)
                              .O00000000(var10)
                              .O000000000(var11 + var18 - o0000O00000.O00000000(2.0F))
                              .O0000000000(var12)
                              .O00000000000(var16 + o0000O00000.O00000000(4.0F))
                              .O00000000(o0000O000O0O0x -> o0000O000O0O0x.O00000000(var23)),
                           g,
                           h,
                           i,
                           j
                        )
                        .O00000000()
                  );
                  list.add(
                     this.O00000000(
                           O00000OOOOOO.O00000000()
                              .O00000000(1)
                              .O00000000(var10)
                              .O000000000(var11 + var18 - o0000O00000.O00000000(2.0F))
                              .O0000000000(var12)
                              .O00000000000(var16 + o0000O00000.O00000000(4.0F))
                              .O00000000(o0000O000O0O0x -> {
                                 if (var23.O0000000000000 != -1) {
                                    var23.O000000000000O = !var23.O000000000000O;
                                    o0000O000O0O0x.O00000000O000O();
                                 }
                              }),
                           g,
                           h,
                           i,
                           j
                        )
                        .O00000000()
                  );
               } else if (var14 instanceof ColorSetting) {
                  float var60 = SettingsRenderer.O000000000000(o0000O00000);
                  list.add(
                     this.O00000000(
                           O00000OOOOOO.O00000000()
                              .O00000000(0)
                              .O00000000(SettingsRenderer.O000000000(var10, var12, o0000O00000))
                              .O000000000(SettingsRenderer.O00000000000(var11 + var18, o0000O00000))
                              .O0000000000(var60)
                              .O00000000000(var60)
                              .O00000000(o0000O000O0O0x -> this.O000000000.O00000000(o0000O000O0O0x, var14, f, var10, var12)),
                           g,
                           h,
                           i,
                           j
                        )
                        .O00000000()
                  );
               } else if (var14 instanceof NumberSetting) {
                  list.add(
                     this.O00000000(
                           O00000OOOOOO.O00000000()
                              .O00000000(0)
                              .O00000000(var10)
                              .O000000000(var11 + var18 + o0000O00000.O00000000(3.0F))
                              .O0000000000(var12)
                              .O00000000000(o0000O00000.O00000000(26.0F))
                              .O00000000(o0000O000O0O0x -> this.O000000000.O00000000(o0000O000O0O0x, var14, f, var10, var12)),
                           g,
                           h,
                           i,
                           j
                        )
                        .O00000000()
                  );
               } else {
                  list.add(
                     this.O00000000(
                           O00000OOOOOO.O00000000()
                              .O00000000(0)
                              .O00000000(var10)
                              .O000000000(var11 + var18 - o0000O00000.O00000000(2.0F))
                              .O0000000000(var12)
                              .O00000000000(var16 + o0000O00000.O00000000(4.0F))
                              .O00000000(o0000O000O0O0x -> this.O000000000.O00000000(o0000O000O0O0x, var14, f, var10, var12)),
                           g,
                           h,
                           i,
                           j
                        )
                        .O00000000()
                  );
               }

               var11 += (var16 + var17 + o0000O00000.O00000000(12.0F)) * var15;
            }
         }
      }
   }

   private void O00000000(
      List<O00000OOOOOO> list, GroupSetting o0000000OOOOOO, float f, float g, float h, float i, O0000O00000 o0000O00000, float j, float k, float l, float m
   ) {
      float var12 = h * 0.7F;
      float var13 = f + h - var12;
      float var14 = o0000O00000.O00000000(3.0F);
      float var15 = o0000O00000.O00000000(14.0F);
      float var16 = o0000O00000.O00000000(3.0F);
      float var17 = 0.0F;
      int var18 = 0;

      for (int var19 = 0; var19 < o0000000OOOOOO.O00000000000.size(); var19++) {
         BooleanSetting var21 = o0000000OOOOOO.O00000000000.get(var19);
         float var22 = O0000O00000OO.O00000000(FontRegistry.O00000000, O0000O00000OO.O00000000(var21), 8.0F);
         float var23 = Math.max(o0000O00000.O00000000(18.0F), var22 + o0000O00000.O00000000(8.0F));
         if (var17 > 0.0F && var17 + var23 > var12) {
            var18++;
            var17 = 0.0F;
         }

         float var24 = var13 + var17;
         float var25 = g + o0000O00000.O00000000(1.0F) + var18 * (var15 + var16);
         list.add(
            this.O00000000(
                  O00000OOOOOO.O00000000()
                     .O00000000(0)
                     .O00000000(var24)
                     .O000000000(var25 - o0000O00000.O00000000(1.0F))
                     .O0000000000(var23)
                     .O00000000000(var15 + o0000O00000.O00000000(2.0F))
                     .O00000000(o0000O000O0O0 -> {
                        var21.O000000000(!var21.O00000000000());
                        o0000O000O0O0.O00000000O000O();
                     }),
                  j,
                  k,
                  l,
                  m
               )
               .O00000000()
         );
         list.add(
            this.O00000000(
                  O00000OOOOOO.O00000000()
                     .O00000000(2)
                     .O00000000(var24)
                     .O000000000(var25 - o0000O00000.O00000000(1.0F))
                     .O0000000000(var23)
                     .O00000000000(var15 + o0000O00000.O00000000(2.0F))
                     .O00000000(o0000O000O0O0 -> o0000O000O0O0.O00000000(var21)),
                  j,
                  k,
                  l,
                  m
               )
               .O00000000()
         );
         list.add(
            this.O00000000(
                  O00000OOOOOO.O00000000()
                     .O00000000(1)
                     .O00000000(var24)
                     .O000000000(var25 - o0000O00000.O00000000(1.0F))
                     .O0000000000(var23)
                     .O00000000000(var15 + o0000O00000.O00000000(2.0F))
                     .O00000000(o0000O000O0O0 -> {
                        if (var21.O0000000000000 != -1) {
                           var21.O000000000000O = !var21.O000000000000O;
                           o0000O000O0O0.O00000000O000O();
                        }
                     }),
                  j,
                  k,
                  l,
                  m
               )
               .O00000000()
         );
         var17 += var23 + var14;
      }
   }

   private void O00000000(
      List<O00000OOOOOO> list, ModeSetting o0000000OOOOO0, float f, float g, float h, O0000O00000 o0000O00000, float i, float j, float k, float l
   ) {
      float var11 = SettingsRenderer.O00000000(h);
      float var12 = SettingsRenderer.O00000000(f, h);
      float var13 = g + o0000O00000.O00000000(14.0F) + o0000O00000.O00000000(4.0F);
      float var14 = o0000O00000.O00000000(18.0F);

      for (int var15 = 0; var15 < o0000000OOOOO0.O00000000000.size(); var15++) {
         int var16 = var15;
         float var17 = var13 + o0000O00000.O00000000(2.0F) + var15 * var14;
         list.add(
            this.O00000000(
                  O00000OOOOOO.O00000000()
                     .O00000000(0)
                     .O00000000(var12)
                     .O000000000(var17)
                     .O0000000000(var11)
                     .O00000000000(var14)
                     .O00000000(o0000O000O0O0 -> o0000O000O0O0.O00000000(o0000000OOOOO0, var16)),
                  i,
                  j,
                  k,
                  l
               )
               .O00000000()
         );
      }
   }

   private void O00000000(
      List<O00000OOOOOO> list, O000000O00 o000000O00, float f, float g, float h, O0000O00000 o0000O00000, float i, float j, float k, float l
   ) {
      o000000O00.O0000000000();
      float var11 = SettingsRenderer.O000000000(h);
      float var12 = SettingsRenderer.O000000000(f, h);
      float var13 = g + o0000O00000.O00000000(18.0F) + o0000O00000.O00000000(5.0F);
      float var14 = SettingsRenderer.O0000000000(o0000O00000);
      float var15 = o0000O00000.O00000000(4.0F);

      for (int var16 = 0; var16 < o000000O00.O00000000000.size(); var16++) {
         int var17 = var16;
         float var18 = var13 + var15 + var16 * var14;
         list.add(
            this.O00000000(
                  O00000OOOOOO.O00000000()
                     .O00000000(0)
                     .O00000000(var12)
                     .O000000000(var18)
                     .O0000000000(var11)
                     .O00000000000(var14)
                     .O00000000(o0000O000O0O0 -> o0000O000O0O0.O00000000(o000000O00, var17)),
                  i,
                  j,
                  k,
                  l
               )
               .O00000000()
         );
      }
   }

   private O00000OOOOOO.W325 O00000000(O00000OOOOOO.W325 o00000000, float f, float g, float h, float i) {
      return o00000000.O000000000000(f).O0000000000000(g).O000000000000O(h).O00000000000O(i);
   }

   private boolean O00000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000, float f, float g) {
      return O0000O00000OO.O00000000(f, g, o00000OOOOOOOO.O00000000(), o00000OOOOOOOO.O000000000(), o0000O00000.O00000000000(), o0000O00000.O000000000000());
   }

   @Generated
   public O00000OOOOOO0(O0000O000000 o0000O000000, O00000OOOOOOO0 o00000OOOOOOO0, O0000O0000OO00 o0000O0000OO00) {
      this.O00000000 = o0000O000000;
      this.O000000000 = o00000OOOOOOO0;
      this.O0000000000 = o0000O0000OO00;
   }
}
