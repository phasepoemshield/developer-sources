package ru.metaculture.protection;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@O0000000OOO0(
   O00000000 = "InventoryHUD",
   O000000000 = "w"
)
public final class InventoryHud extends HudElement {
   private static final InventoryHud O00000000 = new InventoryHud();
   private static final O0000O00O0OO O000000000OO0 = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OO00 = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OO0O = new O0000O00O0OO();
   private static final O0000O00O0OO[] O000000000OOO = new O0000O00O0OO[27];
   private static final Item[] O000000000OOO0 = new Item[27];
   private final BooleanSetting O000000000OOOO = new BooleanSetting("Показывать верхушку", true);
   private final BooleanSetting O00000000O = new BooleanSetting("Фон слотов", true);

   private InventoryHud() {
      this.O00000000(this.O000000000OOOO);
      this.O00000000(this.O00000000O);
      ru.metaculture.protection.O000000000O0O0.O00000000(this);
   }

   public static void O00000000(RenderManager o0000O00OO0O0, DrawContext drawContext) {
      O00000000.O000000000(o0000O00OO0O0, drawContext);
   }

   public static InventoryHud O000000000() {
      return O00000000;
   }

   public void O000000000(RenderManager o0000O00OO0O0, DrawContext drawContext) {
      if (MinecraftAccessor.a_.player != null) {
         boolean var3 = false;

         for (int var4 = 9; var4 < 36; var4++) {
            ItemStack var5 = MinecraftAccessor.a_.player.getInventory().getStack(var4);
            if (!var5.isEmpty()) {
               var3 = true;
               break;
            }
         }

         boolean var79 = !var3 && !(MinecraftAccessor.a_.currentScreen instanceof ChatScreen);
         boolean var80 = !var79;
         O000000000OO0.O00000000();
         O000000000OO0.O00000000(var80 ? 1.0 : 0.0, 0.22F, O0000O00O0OO0O.O0000000000O0O, false);
         float var6 = O000000000OO0.O000000000000();
         if (!(var6 <= 0.01F)) {
            boolean var7 = this.O000000000OOOO.O0000000000();
            boolean var8 = HudModule.O0000000000O00();
            O00000OO0OO0O.W239 var9 = var8 ? O00000OO0OO0O.O000000000() : null;
            float var10 = 24.0F;
            float var11 = var8 ? var9.O00000000000O : 7.0F;
            float var12 = var7 ? (var8 ? var9.O00000000000OO : 32.0F) : 0.0F;
            float var13 = var7 ? (var8 ? var9.O00000000000O0 : 5.0F) : 0.0F;
            float var14 = 22.0F;
            float var15 = var8 ? var9.O00000000000O : 7.0F;
            float var16 = 9.0F * var14;
            float var17 = 3.0F * var14;
            String var18 = "Inventory";
            float var19 = TextMeasureCache.O00000000(FontRegistry.O00000000000, var18, var8 ? var9.O0000000000O0 : 26.0F).O00000000;
            float var20 = var16 + var15 * 2.0F;
            float var21 = var17 + var15 * 2.0F;
            float var22 = var20 + var11 * 2.0F;
            if (var7) {
               float var23 = var19 + 22.0F + var15 * 2.0F + (var8 ? var9.O0000000000O00 : 24.0F);
               var22 = Math.max(var22, var23 + var11 * 2.0F);
            }

            float var81 = var11 + var12 + var13 + var21 + var11;
            O000000000OO00.O00000000();
            O000000000OO0O.O00000000();
            O000000000OO00.O00000000(var22, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
            O000000000OO0O.O00000000(var81, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
            float var24 = O000000000OO00.O000000000000();
            float var25 = O000000000OO0O.O000000000000();
            float var26 = MinecraftAccessor.a_.getWindow().getFramebufferWidth();
            float var27 = Math.max(10.0F, var26 - var24 - 10.0F);
            float var28 = 10.0F;
            O00000OO000O.W219 var29 = O00000OO000O.O00000000().O00000000("HUD_Inventory", var27, var28, var24, var25);
            float var30 = var29.O000000000;
            float var31 = var29.O0000000000;
            float var32 = var29.O00000000000;
            float var33 = var29.O000000000000;
            this.O00000000(var30, var31, var32, var33);
            float var34 = var32 / Math.max(1.0F, var24);
            float var35 = var33 / Math.max(1.0F, var25);
            float var36 = Math.min(var34, var35);
            float var37 = var11 * var34;
            float var38 = var11 * var35;
            float var39 = var7 ? var12 * var35 : 0.0F;
            float var40 = var13 * var35;
            float var41 = var14 * var36;
            float var42 = var6 * this.O000000000O0.O0000000000();
            float var43 = this.O00000000000OO(var42);
            int var44 = (int)(255.0F * var42);
            int var45 = this.O000000000(var42);
            int var46 = this.O0000000000(var42);
            int var47 = this.O000000000000(var42);
            int var48 = this.O000000000000O(var42);
            int var49 = this.O00000000000OO() ? O0000O000OO000.O0000000000(255, 255, 255, (int)(5.0F * var43)) : this.O000000000(var43);
            float var50 = var8 ? var9.O00000000 : 14.0F;
            float var51 = var8 ? var9.O000000000 : 11.0F;
            float var52 = var8 ? var9.O0000000000 : 9.0F;
            float var53 = var8 ? var9.O000000000000O : 4.0F;
            float var54 = var32 - var37 * 2.0F;
            this.O00000000(o0000O00OO0O0, var30, var31, var32, var33, var50, var42);
            if (var7) {
               if (this.O0000000000O() || this.O0000000000O0() || this.O0000000000O00()) {
                  this.O00000000(o0000O00OO0O0, var30 + var37, var31 + var38, var54, var39, var51, var42);
               } else if (var8) {
                  o0000O00OO0O0.O00000000(var30 + var37, var31 + var38, var54, var39, var51, var45);
               } else {
                  o0000O00OO0O0.O00000000(var30 + var37, var31 + var38, var54, var39, 11.0F, 11.0F, 4.0F, 4.0F, var45);
               }

               float var55 = var8 ? var30 + var9.O0000000000OO0.O00000000 * var34 : var30 + var37 + 10.0F * var34;
               float var56 = var8 ? var31 + var9.O0000000000OO0.O000000000 * var35 : var31 + var38 + var39 / 2.0F + 6.0F * var35;
               o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var55, var56, (var8 ? var9.O0000000000O0 : 26.0F) * var36, var18, var47);
               float var57 = 22.0F * var35;
               float var58 = var30 + var37 + var54 - 10.0F * var34 - var57;
               float var59 = var31 + var38 + (var39 - var57) / 2.0F;
               float var60 = (var8 ? var9.O0000000000O00 : var10 + 4.0F) * var36;
               float var61 = TextMeasureCache.O00000000(FontRegistry.O000000000000, "h", var60).O00000000;
               float var62 = var8
                  ? (var9.O0000000000OOO.O0000000000 ? var30 + var32 : var30) + var9.O0000000000OOO.O00000000 * var34
                  : var58 + (var57 - var61) / 2.0F;
               float var63 = var8 ? var31 + var9.O0000000000OOO.O000000000 * var35 : var59 + var57 / 2.0F + 7.0F * var35;
               o0000O00OO0O0.O00000000(FontRegistry.O000000000000, var62, var63, var60, "h", var48);
            }

            float var82 = var31 + var38 + var39 + var40;
            if (!var7) {
               var82 = var31 + var38;
            }

            float var84 = var30 + var37 + (var8 ? var9.O000000000O.O00000000 * var34 : 0.0F);
            var82 += var8 ? var9.O000000000O.O000000000 * var35 : 0.0F;
            float var85 = var21 * var35;
            if (this.O0000000000O() || this.O0000000000O0() || this.O0000000000O00()) {
               this.O000000000(o0000O00OO0O0, var84, var82, var54, var85, var52, var42);
            } else if (var8) {
               o0000O00OO0O0.O00000000(var84, var82, var54, var85, var52, var46);
            } else {
               o0000O00OO0O0.O00000000(var84, var82, var54, var85, var7 ? 4.0F : 11.0F, var7 ? 4.0F : 11.0F, 11.0F, 11.0F, var46);
            }

            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O00000000(var30, var31, var32, var33, var50, var50, var50, var50);

            try {
               float var86 = var84 + (var54 - 9.0F * var41) / 2.0F;
               float var87 = var82 + (var85 - 3.0F * var41) / 2.0F;

               for (int var88 = 0; var88 < 3; var88++) {
                  for (int var90 = 0; var90 < 9; var90++) {
                     float var92 = var86 + var90 * var41;
                     float var94 = var87 + var88 * var41;
                     if (this.O00000000O.O0000000000()) {
                        if (!this.O0000000000O() && !this.O0000000000O0() && !this.O0000000000O00()) {
                           o0000O00OO0O0.O00000000(var92 + 1.0F, var94 + 1.0F, var41 - 2.0F, var41 - 2.0F, var53 * var36, var49);
                        } else {
                           this.O000000000(o0000O00OO0O0, var92 + 1.0F, var94 + 1.0F, var41 - 2.0F, var41 - 2.0F, var53 * var36, var42);
                        }
                     }
                  }
               }

               o0000O00OO0O0.O0000000000();
               int var89 = 9;

               for (int var91 = 0; var91 < 3; var91++) {
                  for (int var93 = 0; var93 < 9; var93++) {
                     float var95 = var86 + var93 * var41;
                     float var64 = var87 + var91 * var41;
                     ItemStack var65 = MinecraftAccessor.a_.player.getInventory().getStack(var89);
                     int var66 = var89 - 9;
                     O0000O00O0OO var67 = O000000000OOO[var66];
                     var67.O00000000();
                     boolean var68 = !var65.isEmpty();
                     Item var69 = var68 ? var65.getItem() : null;
                     if (var68 && O000000000OOO0[var66] != var69) {
                        var67.O0000000000000(0.0);
                     }

                     var67.O00000000(var68 ? 1.0 : 0.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
                     O000000000OOO0[var66] = var69;
                     if (var68 && var67.O000000000000() > 0.01F) {
                        float var70 = var67.O000000000000();
                        float var71 = 0.4F + 0.6F * var70;
                        float var72 = var36 * var71;
                        float var73 = 16.0F * var72;
                        float var74 = var95 + (var41 - var73) / 2.0F;
                        float var75 = var64 + (var41 - var73) / 2.0F;
                        ItemRenderUtil.O00000000(
                           o0000O00OO0O0,
                           var65,
                           ItemRenderUtil.O00000000(var74),
                           ItemRenderUtil.O00000000(var75),
                           ItemRenderUtil.O0000000000(var72),
                           0,
                           true,
                           var66
                        );
                     }

                     var89++;
                  }
               }
            } finally {
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O0000000000000();
            }

            O00000OO000O.O00000000().O00000000(var29);
            O00000O0O00O.O00000000(
               o0000O00OO0O0,
               this,
               var29,
               O00000OO000O.O00000000(),
               MinecraftAccessor.a_.getWindow().getScaledWidth(),
               MinecraftAccessor.a_.getWindow().getScaledHeight()
            );
         }
      }
   }

   static {
      for (int var0 = 0; var0 < O000000000OOO.length; var0++) {
         O000000000OOO[var0] = new O0000O00O0OO();
      }
   }
}
