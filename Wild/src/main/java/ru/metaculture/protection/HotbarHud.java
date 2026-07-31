package ru.metaculture.protection;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;

@O0000000OOO0(
   O00000000 = "HotBar",
   O000000000 = "W"
)
public final class HotbarHud extends HudElement {
   private static final HotbarHud O000000000OO0 = new HotbarHud();
   private static float O000000000OO00 = 0.0F;
   private static final O0000O00O0OO O000000000OO0O = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OOO = new O0000O00O0OO();
   private static String O000000000OOO0 = "";
   private static long O000000000OOOO;
   public final GroupSetting O00000000 = new GroupSetting(
      "Элементы статуса",
      new BooleanSetting("Здоровье", true),
      new BooleanSetting("Голод", true),
      new BooleanSetting("Броня", true),
      new BooleanSetting("Воздух", true),
      new BooleanSetting("Поглощение", true)
   );

   private HotbarHud() {
      ru.metaculture.protection.O000000000O0O0.O00000000(this);
      this.O00000000(this.O00000000);
   }

   public static HotbarHud O000000000() {
      return O000000000OO0;
   }

   public static void O00000000(RenderManager o0000O00OO0O0, DrawContext drawContext) {
      O000000000OO0.O000000000(o0000O00OO0O0, drawContext);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O000000000(RenderManager o0000O00OO0O0, DrawContext drawContext) {
      if (MinecraftAccessor.a_ != null && MinecraftAccessor.a_.player != null && MinecraftAccessor.a_.world != null) {
         if (MinecraftAccessor.a_.getWindow() != null) {
            O000000000OO0O.O00000000();
            O000000000OO0O.O00000000(1.0, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
            float var3 = O000000000OO0O.O000000000000();
            if (!(var3 <= 0.01F)) {
               PlayerInventory var4 = MinecraftAccessor.a_.player.getInventory();
               if (var4 != null) {
                  ItemStack var5 = var4.getStack(var4.getSelectedSlot());
                  String var6 = var5 != null && !var5.isEmpty() ? var5.getName().getString() : "";
                  String var7 = var6.isEmpty() ? "" : var4.getSelectedSlot() + ":" + var5.getItem().toString() + ":" + var6;
                  long var8 = System.currentTimeMillis();
                  if (!var7.equals(O000000000OOO0)) {
                     O000000000OOO0 = var7;
                     O000000000OOOO = var7.isEmpty() ? 0L : var8 + 2200L;
                  }

                  O000000000OOO.O00000000();
                  O000000000OOO.O00000000(!var6.isEmpty() && var8 <= O000000000OOOO ? 1.0 : 0.0, 0.18, O0000O00O0OO0O.O0000000000O0O, true);
                  float var10 = Math.max(0.0F, Math.min(1.0F, O000000000OOO.O000000000000()));
                  float var11 = MinecraftAccessor.a_.getWindow().getFramebufferWidth();
                  float var12 = MinecraftAccessor.a_.getWindow().getFramebufferHeight();
                  if (!(var11 <= 0.0F) && !(var12 <= 0.0F)) {
                     float var13 = 42.0F;
                     float var14 = 5.0F;
                     float var15 = 1.75F;
                     float var16 = 16.0F * var15;
                     float var17 = 7.0F;
                     float var18 = var13 * 9.0F + var14 * 8.0F + var17 * 2.0F;
                     float var19 = var13 + var17 * 2.0F;
                     float var20 = (var11 - var18) / 2.0F;
                     float var21 = var12 - var19 - 3.0F;
                     O00000OO000O.W219 var22 = O00000OO000O.O00000000().O00000000("HUD_HotBar", var20, var21, var18, var19);
                     float var23 = Math.min(var22.O00000000000 / Math.max(1.0F, var18), var22.O000000000000 / Math.max(1.0F, var19));
                     float var24 = this.O0000000000O0(var23) + this.O0000000000O00(var23) + this.O00000000(var23, var10);
                     HudModule.W166 var25 = HudModule.O00000000(
                        "HUD_HotBar", var22.O000000000, var22.O0000000000 - var24, var22.O00000000000, var22.O000000000000 + var24, 8.0F
                     );
                     float var26 = var25.O000000000;
                     float var27 = var25.O0000000000 + var24;
                     float var28 = var22.O00000000000;
                     float var29 = var22.O000000000000;
                     this.O00000000(var26, var27, var28, var29);
                     float var30 = var28 / Math.max(1.0F, var18);
                     float var31 = var29 / Math.max(1.0F, var19);
                     float var32 = Math.min(var30, var31);
                     float var33 = var13 * var30;
                     float var34 = var14 * var30;
                     float var35 = var17 * var30;
                     float var36 = var17 * var31;
                     float var37 = var16 * var32;
                     float var38 = var15 * var32;
                     float var39 = var4.getSelectedSlot() * (var33 + var34);
                     O000000000OO00 = O000000000OO00 + (var39 - O000000000OO00) * 0.25F;
                     float var40 = var3 * this.O000000000O0.O0000000000();
                     float var41 = this.O00000000000OO(var40);
                     int var42 = (int)(255.0F * var40);
                     int var43 = this.O00000000(var40);
                     int var44 = this.O00000000000(var40);
                     int var45 = this.O00000000000O(var40);
                     int var46 = this.O00000000000O0(var40);
                     int var47 = this.O00000000000OO() ? O0000O000OO000.O0000000000(255, 255, 255, (int)(5.0F * var41)) : this.O000000000(var41);
                     float var48 = 12.0F * var32;
                     boolean var49 = this.O0000000000O();
                     if (var49) {
                        O00000OOOO00O0.O00000000();
                     }

                     try {
                        this.O00000000(o0000O00OO0O0, var26, var27, var28, var29, var48, var40);

                        for (int var50 = 0; var50 < 9; var50++) {
                           float var51 = var26 + var35 + var50 * (var33 + var34);
                           float var52 = var50 == 0 ? 8.0F * var32 : 4.0F * var32;
                           float var53 = var50 == 8 ? 8.0F * var32 : 4.0F * var32;
                           if (!this.O0000000000O0() && !this.O0000000000O00()) {
                              if (!var49
                                 || !this.O00000000(
                                    var51, var27 + var36, var33, var33, Math.min(var52, var53), 2.8F * var32, 6.0F * var32, 0.86F, 2, true, var40
                                 )) {
                                 o0000O00OO0O0.O00000000(var51, var27 + var36, var33, var33, var52, var53, var53, var52, var47);
                              }
                           } else {
                              this.O000000000(o0000O00OO0O0, var51, var27 + var36, var33, var33, Math.min(var52, var53), var40);
                           }
                        }
                     } finally {
                        if (var49) {
                           O00000OOOO00O0.O0000000000();
                        }
                     }

                     float var87 = var26 + var35 + O000000000OO00;
                     float var88 = var27 + var36;
                     o0000O00OO0O0.O00000000(
                        var87 + 3.0F * var30,
                        var88 + var33 - Math.max(2.0F, 2.0F * var31),
                        var33 - 4.0F * var30,
                        Math.max(1.0F, 2.0F * var31),
                        Math.max(0.5F, 0.8F * var32),
                        O0000O000OO000.O00000000(var46, (int)(140.0F * var40))
                     );
                     o0000O00OO0O0.O0000000000();
                     o0000O00OO0O0.O00000000(var26, var27, var28, var29, var48, var48, var48, var48);

                     try {
                        for (int var89 = 0; var89 < 9; var89++) {
                           ItemStack var91 = var4.getStack(var89);
                           float var54 = var26 + var35 + var89 * (var33 + var34);
                           float var55 = var54 + (var33 - var37) * 0.5F;
                           float var56 = var27 + var36 + (var33 - var37) * 0.5F;
                           if (var91 != null && !var91.isEmpty()) {
                              ItemRenderUtil.O00000000(
                                 o0000O00OO0O0,
                                 var91,
                                 ItemRenderUtil.O00000000(var55),
                                 ItemRenderUtil.O00000000(var56),
                                 ItemRenderUtil.O0000000000(var38),
                                 var89,
                                 true,
                                 var89
                              );
                           }

                           String var57 = String.valueOf(var89 + 1);
                           float var58 = 22.0F * var32;
                           int var59 = var89 == var4.getSelectedSlot()
                              ? O0000O000OO000.O0000000000(255, 255, 255, (int)(245.0F * var40))
                              : O0000O000OO000.O00000000(this.O0000000000000(1.0F), (int)(175.0F * var40));
                           float var60 = var54 + 4.0F * var30;
                           float var61 = var27 + var36 + var33 - var58 * var31 - 8.0F;
                           o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var60, var61, var58, var57, var59);
                        }
                     } finally {
                        o0000O00OO0O0.O0000000000();
                        o0000O00OO0O0.O0000000000000();
                     }

                     ItemStack var90 = NoSlow.O00000000(MinecraftAccessor.a_.player.getOffHandStack());
                     if (var90 != null && !var90.isEmpty()) {
                        float var92 = MinecraftAccessor.a_.player.getMainArm() == Arm.RIGHT ? var26 - var29 - 5.0F * var30 : var26 + var28 + 5.0F * var30;
                        if (var49) {
                           O00000OOOO00O0.O00000000();
                        }

                        boolean var74 = false /* VF: Semaphore variable */;

                        try {
                           var74 = true;
                           if (this.O0000000000O0() || this.O0000000000O00()) {
                              this.O00000000(o0000O00OO0O0, var92, var27, var29, var29, var48, var40);
                              this.O000000000(o0000O00OO0O0, var92 + var35, var27 + var36, var33, var33, 8.0F * var32, var40);
                              var74 = false;
                           } else if (var49) {
                              if (!this.O00000000(var92, var27, var29, var29, var48, false, var40, 1)) {
                                 o0000O00OO0O0.O00000000(var92, var27, var29, var29, var48, var43);
                              }

                              if (!this.O00000000(var92 + var35, var27 + var36, var33, var33, 8.0F * var32, 2.8F * var32, 6.0F * var32, 0.86F, 2, true, var40)) {
                                 o0000O00OO0O0.O00000000(var92 + var35, var27 + var36, var33, var33, 8.0F * var32, var47);
                                 var74 = false;
                              } else {
                                 var74 = false;
                              }
                           } else {
                              if (this.O00000000000()) {
                                 o0000O00OO0O0.O00000000(var92, var27, var29, var29, var48, this.O0000000000O0O() ? 6.0F : 4.0F, 1.0F, this.O0000000000O(var40));
                              }

                              if (this.O00000000000OO()) {
                                 o0000O00OO0O0.O00000000(23.0F);
                                 o0000O00OO0O0.O00000000(var92, var27, var29, var29, var48, var40);
                              }

                              o0000O00OO0O0.O00000000(var92, var27, var29, var29, var48, var43);
                              if (this.O000000000000()) {
                                 o0000O00OO0O0.O00000000(var92, var27, var29, var29, var48, var44, this.O0000000000());
                              }

                              o0000O00OO0O0.O00000000(var92 + var35, var27 + var36, var33, var33, 8.0F * var32, var47);
                              var74 = false;
                           }
                        } finally {
                           if (var74) {
                              if (var49) {
                                 O00000OOOO00O0.O0000000000();
                              }
                           }
                        }

                        if (var49) {
                           O00000OOOO00O0.O0000000000();
                        }

                        float var95 = var92 + var35 + (var33 - var37) * 0.5F;
                        float var98 = var27 + var36 + (var33 - var37) * 0.5F;
                        o0000O00OO0O0.O0000000000();
                        o0000O00OO0O0.O00000000(var92, var27, var29, var29, var48, var48, var48, var48);
                        boolean var69 = false /* VF: Semaphore variable */;

                        try {
                           var69 = true;
                           ItemRenderUtil.O00000000(
                              o0000O00OO0O0,
                              var90,
                              ItemRenderUtil.O00000000(var95),
                              ItemRenderUtil.O00000000(var98),
                              ItemRenderUtil.O0000000000(var38),
                              0,
                              true,
                              0
                           );
                           var69 = false;
                        } finally {
                           if (var69) {
                              o0000O00OO0O0.O0000000000();
                              o0000O00OO0O0.O0000000000000();
                           }
                        }

                        o0000O00OO0O0.O0000000000();
                        o0000O00OO0O0.O0000000000000();
                     }

                     O00000O0O000O.O00000000().O00000000(o0000O00OO0O0, this, var26, var27, var28, var30, var31, var40);
                     if (MinecraftAccessor.a_.player.experienceLevel > 0) {
                        String var93 = String.valueOf(MinecraftAccessor.a_.player.experienceLevel);
                        float var96 = 12.0F * var32;
                        float var99 = 8.0F * var32;
                        float var101 = 26.0F * var32;
                        float var103 = TextMeasureCache.O00000000(FontRegistry.O00000000000, var93, var101).O00000000;
                        int var105 = O0000O000OO000.O00000000(var45, var42);
                        int var107 = this.O000000000(var40);
                        float var109 = this.O0000000000O0(var32);
                        float var111 = Math.max(34.0F * var32, var103 + 16.0F * var32);
                        float var63 = var26 + (var28 - var111) * 0.5F;
                        float var64 = var27 - var109 - var99 - var96;
                        if (var49) {
                           if (!this.O00000000(var63, var64, var111, var96, var96 * 0.5F, 2.4F * var32, 5.5F * var32, 0.82F, 1, false, var40)) {
                              o0000O00OO0O0.O00000000(var63, var64, var111, var96, var96 * 0.5F, var107);
                           }
                        } else if (this.O0000000000O0() || this.O0000000000O00()) {
                           this.O000000000(o0000O00OO0O0, var63, var64, var111, var96, var96 * 0.5F, var40);
                        }

                        o0000O00OO0O0.O00000000(
                           FontRegistry.O00000000000, var63 + (var111 - var103) * 0.5F, var64 + var96 * 0.5F + 3.7F * var32, var101, var93, var105
                        );
                     }

                     if (var10 > 0.01F && !var6.isEmpty()) {
                        float var94 = var40 * var10;
                        float var97 = 16.0F * var32;
                        float var100 = 32.0F * var32;
                        float var102 = 4.0F * var32;
                        float var104 = Math.clamp(var28 * 0.72F, 20.0F * var32, 190.0F * var32);
                        String var106 = this.O00000000(var6, var100, var104);
                        float var108 = TextMeasureCache.O000000000(FontRegistry.O00000000, var106, var100);
                        float var110 = Math.max(54.0F * var32, var108 + 20.0F * var32);
                        float var112 = this.O0000000000O0(var32);
                        float var62 = this.O0000000000O00(var32);
                        float var113 = var26 + (var28 - var110) * 0.5F;
                        float var114 = var27 - var112 - var62 - var102 - var97;
                        o0000O00OO0O0.O00000000(
                           FontRegistry.O00000000,
                           var113 + (var110 - var108) * 0.5F,
                           var114 + var97 * 0.5F + 1.05F * var32,
                           var100,
                           var106,
                           O0000O000OO000.O00000000(this.O000000000000(1.0F), (int)(255.0F * var94))
                        );
                     }

                     HudModule.O00000000("HUD_HotBar", var26, var27 - var24, var28, var29 + var24);
                     O00000OO000O.O00000000().O00000000(var22);
                     O00000O0O00O.O00000000(
                        o0000O00OO0O0,
                        this,
                        var22,
                        O00000OO000O.O00000000(),
                        MinecraftAccessor.a_.getWindow().getScaledWidth(),
                        MinecraftAccessor.a_.getWindow().getScaledHeight()
                     );
                  }
               }
            }
         }
      }
   }

   private float O0000000000O0(float f) {
      if (MinecraftAccessor.a_ != null && MinecraftAccessor.a_.player != null) {
         boolean var2 = this.O00000000.O000000000("Здоровье");
         boolean var3 = this.O00000000.O000000000("Голод");
         boolean var4 = this.O00000000.O000000000("Броня") && MinecraftAccessor.a_.player.getArmor() > 0;
         boolean var5 = this.O00000000.O000000000("Воздух") && MinecraftAccessor.a_.player.getAir() < MinecraftAccessor.a_.player.getMaxAir();
         float var6 = 12.0F * f;
         float var7 = 4.0F * f;
         int var8 = 0;
         if (var2 || var3) {
            var8++;
         }

         if (var4 || var5) {
            var8++;
         }

         return var8 == 0 ? 0.0F : var8 * var6 + var8 * var7;
      } else {
         return 0.0F;
      }
   }

   private float O0000000000O00(float f) {
      return MinecraftAccessor.a_ != null && MinecraftAccessor.a_.player != null && MinecraftAccessor.a_.player.experienceLevel > 0 ? 16.0F * f : 0.0F;
   }

   private float O00000000(float f, float g) {
      return g > 0.01F ? 20.0F * f : 0.0F;
   }

   private String O00000000(String string, float f, float g) {
      if (string != null && !string.isEmpty()) {
         if (TextMeasureCache.O000000000(FontRegistry.O00000000, string, f) <= g) {
            return string;
         } else {
            String var4 = "...";
            float var5 = TextMeasureCache.O000000000(FontRegistry.O00000000, var4, f);
            if (var5 >= g) {
               return var4;
            } else {
               int var6 = 0;
               int var7 = string.length();

               while (var6 < var7) {
                  int var8 = var6 + var7 + 1 >>> 1;
                  String var9 = string.substring(0, var8).trim();
                  float var10 = TextMeasureCache.O000000000(FontRegistry.O00000000, var9, f) + var5;
                  if (var10 <= g) {
                     var6 = var8;
                  } else {
                     var7 = var8 - 1;
                  }
               }

               String var11 = string.substring(0, Math.max(0, var6)).trim();
               return var11.isEmpty() ? var4 : var11 + var4;
            }
         }
      } else {
         return "";
      }
   }
}
