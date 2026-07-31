package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.gui.screen.ChatScreen;
import org.wild.module.api.Module;

@O0000000OOO0(
   O00000000 = "KeyBindHUD",
   O000000000 = "q"
)
public final class KeybindHud extends HudElement {
   private static final KeybindHud O00000000 = new KeybindHud();
   private static final List<KeybindHud.W150> O000000000OO0 = new ArrayList<>(64);
   private static final Map<Module, KeybindHud.W150> O000000000OO00 = new IdentityHashMap<>(128);
   private static final Map<BooleanSetting, KeybindHud.W150> O000000000OO0O = new IdentityHashMap<>(64);
   private static final O0000O00O0OO O000000000OOO = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OOO0 = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OOOO = new O0000O00O0OO();
   private static final Map<String, O0000O00O0OO> O00000000O = new HashMap<>();
   private static final Map<BooleanSetting, O0000O00O0OO> O00000000O0 = new IdentityHashMap<>(64);
   private static final List<Module> O00000000O00 = new ArrayList<>(64);
   private static final List<BooleanSetting> O00000000O000 = new ArrayList<>(8);
   private static final float O00000000O0000 = 12.0F;
   private static final float O00000000O000O = 0.94F;
   private static final float O00000000O00O = 0.78F;
   private static final float O00000000O00O0 = 3.4F;
   private static final float O00000000O00OO = 3.5F;
   private static final float O00000000O0O = 1.1F;
   private final BooleanSetting O00000000O0O0 = new BooleanSetting("Отображать иконки", true);

   private KeybindHud() {
      this.O00000000((Setting)this.O00000000O0O0);
      ru.metaculture.protection.O000000000O0O0.O00000000(this);
   }

   public static void O00000000(RenderManager o0000O00OO0O0) {
      O00000000.O000000000(o0000O00OO0O0);
   }

   public static KeybindHud O000000000() {
      return O00000000;
   }

   public void O000000000(RenderManager o0000O00OO0O0) {
      if (MinecraftAccessor.a_.player != null && WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         boolean var2 = this.O00000000O0O0.O0000000000();
         boolean var3 = HudModule.O0000000000O00();
         O00000OO0OO0O.W239 var4 = var3 ? O00000OO0OO0O.O00000000() : null;
         float var5 = 22.0F;
         float var6 = var3 ? var4.O00000000000O : 7.0F;
         float var7 = var3 ? var4.O00000000000OO : 32.0F;
         float var8 = var3 ? var4.O0000000000O : 22.0F;
         float var9 = var3 ? var4.O00000000000O0 : 5.0F;
         float var10 = var3 ? var4.O0000000000O0 : 28.0F;
         float var11 = var3 ? var4.O0000000000O00 : var5;
         float var12 = var3 ? var4.O0000000000OO : 1.9F;
         O000000000OO0.clear();
         O00000000O00.clear();

         for (Module var14 : WildClient.O00000000.O000000000.O000000000()) {
            if (!"Menu".equals(var14.O00000000000) && var14.O000000000000 != -1) {
               O0000O00O0OO var15 = O00000000O.computeIfAbsent(var14.O00000000000, string -> new O0000O00O0OO());
               var15.O00000000();
               var15.O00000000(var14.O0000000000000 ? 1.0 : 0.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
               if (var15.O000000000000() > 0.001F || var14.O0000000000000) {
                  KeybindHud.W150 var16 = O000000000OO00.computeIfAbsent(var14, KeybindHud.W150::new);
                  var16.O00000000(var14, var15, var2, var5);
                  O00000000O00.add(var14);
               }
            }
         }

         O00000000O00.sort((module, module2) -> Float.compare(O000000000OO00.get(module2).O00000000000O, O000000000OO00.get(module).O00000000000O));

         for (Module var107 : O00000000O00) {
            O000000000OO0.add(O000000000OO00.get(var107));

            for (BooleanSetting var111 : O00000000(var107)) {
               O0000O00O0OO var17 = O00000000O0.computeIfAbsent(var111, o0000000OOO0O0 -> new O0000O00O0OO());
               var17.O00000000();
               var17.O00000000(var107.O0000000000000 ? 1.0 : 0.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
               if (var17.O000000000000() > 0.001F || var107.O0000000000000) {
                  KeybindHud.W150 var18 = O000000000OO0O.computeIfAbsent(var111, o0000000OOO0O0 -> new KeybindHud.W150(var107, o0000000OOO0O0));
                  var18.O00000000(var111, var17, var5);
                  O000000000OO0.add(var18);
               }
            }
         }

         boolean var106 = !O000000000OO0.isEmpty() || MinecraftAccessor.a_.currentScreen instanceof ChatScreen;
         O000000000OOO.O00000000();
         O000000000OOO.O00000000(var106 ? 1.0 : 0.0, 0.22F, O0000O00O0OO0O.O0000000000O0O, false);
         float var108 = O000000000OOO.O000000000000();
         if (!(var108 <= 0.01F)) {
            float var110 = MinecraftAccessor.a_.getWindow().getFramebufferWidth();
            String var112 = "Binds";
            float var113 = TextMeasureCache.O000000000(FontRegistry.O00000000000, var112, var10);
            float var114 = 0.0F;
            float var19 = 0.0F;
            float var20 = 0.0F;

            for (KeybindHud.W150 var22 : O000000000OO0) {
               var114 = Math.max(var114, var22.O00000000000O);
               var19 = Math.max(var19, var22.O00000000000O0);
               var20 += (var22.O00000000() ? var8 * 0.78F : var8) * var22.O00000000000.O000000000000();
            }

            float var115 = var114 + 24.0F;
            float var117 = var19 + 20.0F + (var3 ? var4.O0000000000O0O : 0.0F);
            float var23 = var115 + var9 + var117;
            float var24 = var23 + var6 * 2.0F;
            float var25 = var113 + var11 + 34.0F;
            var24 = Math.max(var24, var25 + var6 * 2.0F);
            var23 = var24 - var6 * 2.0F;
            var115 = var23 - var9 - var117;
            boolean var26 = var20 > 0.01F;
            float var27 = var6 + var7 + (var26 ? var9 : 0.0F) + var20 + var6;
            O000000000OOO0.O00000000();
            O000000000OOOO.O00000000();
            O000000000OOO0.O00000000(var24, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
            O000000000OOOO.O00000000(var27, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
            float var28 = O000000000OOO0.O000000000000();
            float var29 = O000000000OOOO.O000000000000();
            float var30 = Math.max(10.0F, var110 - var28 - 10.0F);
            float var31 = 10.0F;
            O00000OO000O.W219 var32 = O00000OO000O.O00000000().O00000000("HUD_HotKeys", var30, var31, var28, var29);
            float var33 = var32.O000000000;
            float var34 = var32.O0000000000;
            float var35 = var32.O00000000000;
            float var36 = var32.O000000000000;
            this.O00000000(var33, var34, var35, var36);
            float var37 = var35 / Math.max(1.0F, var28);
            float var38 = var36 / Math.max(1.0F, var29);
            float var39 = Math.min(var37, var38);
            float var40 = var6 * var37;
            float var41 = var6 * var38;
            float var42 = var7 * var38;
            float var43 = var8 * var38;
            float var44 = var5 * var39;
            float var45 = var115 * var37;
            float var46 = var117 * var37;
            float var47 = var9 * var37;
            float var48 = var108 * this.O000000000O0.O0000000000();
            int var49 = this.O00000000(var48);
            int var50 = this.O000000000(var48);
            int var51 = this.O0000000000(var48);
            int var52 = this.O00000000000(var48);
            int var53 = this.O000000000000(var48);
            int var54 = this.O00000000000O(var48);
            float var55 = var3 ? var4.O00000000 : 14.0F;
            float var56 = var3 ? var4.O000000000 : 11.0F;
            float var57 = var3 ? var4.O0000000000 : 7.0F;
            float var58 = var3 ? var4.O00000000000 : var57;
            float var59 = var3 ? var4.O000000000000 : var57;
            float var60 = var35 - var40 * 2.0F;
            this.O00000000(o0000O00OO0O0, var33, var34, var35, var36, var55, var48);
            if (this.O0000000000O0() || this.O0000000000O00()) {
               this.O000000000(o0000O00OO0O0, var33 + var40, var34 + var41, var60, var42, var56, var48);
            } else if (this.O0000000000O()) {
               if (!this.O00000000(var33 + var40, var34 + var41, var60, var42, var56, false, var48, 1)) {
                  o0000O00OO0O0.O00000000(var33 + var40, var34 + var41, var60, var42, var56, var50);
               }
            } else if (var3) {
               o0000O00OO0O0.O00000000(var33 + var40, var34 + var41, var60, var42, var56, var50);
            } else {
               o0000O00OO0O0.O00000000(var33 + var40, var34 + var41, var60, var42, 11.0F, 11.0F, 4.0F, 4.0F, var50);
            }

            float var61 = var3 ? var33 + var4.O0000000000OO0.O00000000 * var37 : var33 + var40 + 10.0F * var37;
            float var62 = var3 ? var34 + var4.O0000000000OO0.O000000000 * var38 : O00000000(var34 + var41, var42, 28.0F * var39);
            o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var61, var62, var10 * var39, var112, var53);
            float var63 = Math.max(17.0F * var39, 20.0F * var38);
            float var64 = var33 + var40 + var60 - 10.0F * var37 - var63;
            float var65 = var34 + var41 + (var42 - var63) * 0.5F;
            float var66 = var11 * var39;
            float var67 = TextMeasureCache.O000000000(FontRegistry.O00000000000O, "q", var66);
            float var68 = var3
               ? (var4.O0000000000OOO.O0000000000 ? var33 + var35 : var33) + var4.O0000000000OOO.O00000000 * var37
               : var64 + (var63 - var67) * 0.5F - 1.5F;
            float var69 = var3 ? var34 + var4.O0000000000OOO.O000000000 * var38 + 1.5F * var38 : O00000000(var65, var63, var66) + 1.5F * var38;
            float var70 = var3 ? var68 - 6.0F * var37 : var64;
            float var71 = var3 ? var69 - var63 * 0.72F : var65;
            if (this.O0000000000O0() || this.O0000000000O00()) {
               this.O000000000(o0000O00OO0O0, var70, var71, var63, var63, Math.max(5.0F, var63 * 0.3F), var48);
            } else if (this.O0000000000O()) {
               boolean var72 = O00000OO000O.O00000000().O00000000000O0()
                  && O00000000(O00000OO000O.O00000000().O000000000000O(), O00000OO000O.O00000000().O00000000000O(), var70, var71, var63, var63);
               this.O00000000(var70, var71, var63, var63, Math.max(5.0F, var63 * 0.3F), var72, var48, var72 ? 2 : 1);
            }

            o0000O00OO0O0.O00000000(FontRegistry.O00000000000O, var68, var69, var66, "q", var54);
            float var120 = var34 + var41 + var42 + (var26 ? var9 * var38 : 0.0F);
            float var73 = var20 * var38;
            float var74 = var33 + var40 + (var3 ? var4.O000000000O.O00000000 * var37 : 0.0F);
            float var75 = var120 + (var3 ? var4.O000000000O.O000000000 * var38 : 0.0F);
            float var76 = var33 + var40 + var45 + var47 + (var3 ? var4.O000000000O0.O00000000 * var37 : 0.0F);
            float var77 = var120 + (var3 ? var4.O000000000O0.O000000000 * var38 : 0.0F);
            if (var73 > 0.01F && (this.O00000000000O() || this.O0000000000O0() || this.O0000000000O00())) {
               if (this.O0000000000O0() || this.O0000000000O00()) {
                  this.O000000000(o0000O00OO0O0, var74, var75, var45, var73, var58, var48);
                  this.O000000000(o0000O00OO0O0, var76, var77, var46, var73, var59, var48);
               } else if (this.O0000000000O()) {
                  if (!this.O00000000(var74, var75, var45, var73, var58, true, var48, 2)) {
                     o0000O00OO0O0.O00000000(var74, var75, var45, var73, var58, var51);
                  }

                  if (!this.O00000000(var76, var77, var46, var73, var59, true, var48, 2)) {
                     o0000O00OO0O0.O00000000(var76, var77, var46, var73, var59, var51);
                  }
               } else if (var3) {
                  o0000O00OO0O0.O00000000(var74, var75, var45, var73, var58, var51);
                  o0000O00OO0O0.O00000000(var76, var77, var46, var73, var59, var51);
               } else {
                  o0000O00OO0O0.O00000000(var74, var75, var45, var73, 4.0F, 4.0F, 4.0F, 11.0F, var51);
                  o0000O00OO0O0.O00000000(var76, var77, var46, var73, 4.0F, 4.0F, 11.0F, 4.0F, var51);
               }
            }

            o0000O00OO0O0.O00000000(var33, var34, var35, var36, var55, var55, var55, var55);
            float var78 = var75;
            float var79 = var77;

            for (KeybindHud.W150 var81 : O000000000OO0) {
               float var82 = var81.O00000000000.O000000000000();
               if (!(var82 <= 0.01F)) {
                  boolean var83 = var81.O00000000();
                  float var84 = var83 ? var81.O0000000000.O000000000000() : 1.0F;
                  float var85 = var83 ? 0.42F + 0.58F * var84 : 1.0F;
                  int var86 = (int)(255.0F * var48 * var82 * var85);
                  int var87 = O0000O000OO000.O00000000(this.O000000000000(1.0F), var86);
                  int var88 = O0000O000OO000.O00000000(this.O00000000000O(1.0F), var86);
                  int var89 = var83 ? O0000O000OO000.O00000000000(var87, var88, (double)var84) : var88;
                  float var90 = var83 ? var44 * 0.94F : var44;
                  float var91 = var83 ? var43 * 0.78F : var43;
                  float var92 = (1.0F - var82) * 8.0F * var37;
                  float var93 = var74 + 10.0F * var37 - var92 + (var83 ? 12.0F * var37 : 0.0F);
                  if (var83) {
                     float var94 = var74 + 10.0F * var37 - var92 + var12 * var37 * 0.2F;
                     float var95 = var78 + var91 * 0.5F;
                     float var96 = Math.max(2.0F * var37, var93 - var94);
                     float var97 = Math.min(3.4F * var37, var96 * 0.05F);
                     float var98 = Math.max(1.0F, 1.1F * var37);
                     float var99 = var94 + var97;
                     float var100 = var95 - var97;
                     o0000O00OO0O0.O00000000(var99, var100, var97, 90.0F, 0.25F, var98, var89);
                     float var101 = var93 - 3.5F * var37;
                     if (var101 > var99 + 0.5F) {
                        o0000O00OO0O0.O00000000(var99, var95 - var98 * 0.5F, var101 - var99, var98, var98 * 0.5F, var89);
                     }
                  } else {
                     if (var12 > 0.05F) {
                        o0000O00OO0O0.O00000000(
                           var93, var78 + (var91 - 8.0F * var38) * 0.5F, var12 * var37, 8.0F * var38, Math.max(0.7F, var12 * 0.5F) * var37, var88
                        );
                     }

                     var93 += 8.0F * var37;
                  }

                  float var121 = O00000000(var78, var91, var90);
                  if (!var83 && var2 && var81.O000000000000O != null) {
                     o0000O00OO0O0.O00000000(FontRegistry.O00000000000O, var93, var121, var90, var81.O000000000000O, var87);
                     var93 += var81.O00000000000OO * var39 + 6.0F * var37;
                  }

                  o0000O00OO0O0.O00000000(FontRegistry.O00000000, var93, var121, var90, var81.O000000000000, var87);
                  float var122 = TextMeasureCache.O000000000(FontRegistry.O00000000, var81.O0000000000000, var90);
                  float var123 = var76 + (var46 - var122) * 0.5F + var92;
                  float var124 = var3 ? var79 + var91 * 0.5F + 4.0F * var38 : var121;
                  if (var83 && var84 > 0.02F) {
                     float var125 = 0.5F + 0.5F * (float)Math.sin(System.currentTimeMillis() / 540.0);
                     float var126 = var90 * 1.45F;
                     float var127 = var122 + 13.0F * var37;
                     float var128 = var123 + var122 * 0.5F;
                     if (var3) {
                        float var10000 = var79 + var91 * 0.5F;
                     } else {
                        float var129 = var78 + var91 * 0.5F;
                     }

                     int var103 = Math.max(0, Math.min(255, (int)(var48 * var82 * var84 * (32.0F + 30.0F * var125))));
                     int var104 = O0000O000OO000.O00000000(this.O00000000000O(1.0F), var103);
                  }

                  o0000O00OO0O0.O00000000(FontRegistry.O00000000, var123, var124, var90, var81.O0000000000000, var83 ? var89 : var88);
                  var78 += var91 * var82;
                  var79 += var91 * var82;
               }
            }

            o0000O00OO0O0.O0000000000000();
            O00000OO000O.O00000000().O00000000(var32);
            O00000O0O00O.O00000000(
               o0000O00OO0O0,
               this,
               var32,
               O00000OO000O.O00000000(),
               MinecraftAccessor.a_.getWindow().getScaledWidth(),
               MinecraftAccessor.a_.getWindow().getScaledHeight()
            );
         }
      }
   }

   private static float O00000000(float f, float g, float h) {
      return f + g * 0.5F + h * 0.18F;
   }

   private static List<BooleanSetting> O00000000(Module module) {
      O00000000O000.clear();

      for (Setting var2 : module.O0000000000O()) {
         if (var2 instanceof BooleanSetting var3) {
            if (var3.O0000000000000 != -1) {
               O00000000O000.add(var3);
            }
         } else if (var2 instanceof GroupSetting var4) {
            for (BooleanSetting var6 : var4.O00000000000) {
               if (var6.O0000000000000 != -1) {
                  O00000000O000.add(var6);
               }
            }
         }
      }

      return O00000000O000;
   }

   private static boolean O00000000(float f, float g, float h, float i, float j, float k) {
      return f >= h && f <= h + j && g >= i && g <= i + k;
   }

   static final class W150 {
      private final Module O00000000;
      private final BooleanSetting O000000000;
      final O0000O00O0OO O0000000000 = new O0000O00O0OO();
      O0000O00O0OO O00000000000;
      String O000000000000 = "";
      String O0000000000000 = "";
      String O000000000000O;
      float O00000000000O;
      float O00000000000O0;
      float O00000000000OO;
      private int O0000000000O = Integer.MIN_VALUE;
      private boolean O0000000000O0;

      private W150(Module module) {
         this.O00000000 = module;
         this.O000000000 = null;
      }

      W150(Module module, BooleanSetting o0000000OOO0O0) {
         this.O00000000 = module;
         this.O000000000 = o0000000OOO0O0;
      }

      boolean O00000000() {
         return this.O000000000 != null;
      }

      void O00000000(Module module, O0000O00O0OO o0000O00O0OO, boolean bl, float f) {
         this.O00000000000 = o0000O00O0OO;
         if (!module.O00000000000.equals(this.O000000000000)) {
            this.O000000000000 = module.O00000000000;
         }

         if (module.O000000000000 != this.O0000000000O) {
            this.O0000000000O = module.O000000000000;
            String var5 = O0000O000OO0O0.O00000000(module.O000000000000).toUpperCase();
            if (!var5.equals(this.O0000000000000)) {
               this.O0000000000000 = var5;
               this.O00000000000O0 = TextMeasureCache.O000000000(FontRegistry.O00000000, this.O0000000000000, f);
            }
         }

         String var6 = bl && module.O00000000000O != null ? module.O00000000000O.O00000000() : null;
         if (var6 == null) {
            this.O000000000000O = null;
            this.O00000000000OO = 0.0F;
            this.O00000000000O = TextMeasureCache.O000000000(FontRegistry.O00000000, this.O000000000000, f);
         } else {
            if (!var6.equals(this.O000000000000O)) {
               this.O000000000000O = var6;
               this.O00000000000OO = TextMeasureCache.O000000000(FontRegistry.O00000000000O, this.O000000000000O, f);
            }

            this.O00000000000O = TextMeasureCache.O000000000(FontRegistry.O00000000, this.O000000000000, f) + this.O00000000000OO + 6.0F;
         }
      }

      void O00000000(BooleanSetting o0000000OOO0O0, O0000O00O0OO o0000O00O0OO, float f) {
         this.O00000000000 = o0000O00O0OO;
         this.O0000000000.O00000000();
         this.O0000000000.O00000000(o0000000OOO0O0.O0000000000() ? 1.0 : 0.0, 0.26, O0000O00O0OO0O.O0000000000O0O, false);
         float var4 = f * 0.94F;
         if (!o0000000OOO0O0.O00000000.equals(this.O000000000000)) {
            this.O000000000000 = o0000000OOO0O0.O00000000;
            this.O00000000000O = TextMeasureCache.O000000000(FontRegistry.O00000000, this.O000000000000, var4) + 12.0F;
         }

         if (o0000000OOO0O0.O0000000000000 != this.O0000000000O || o0000000OOO0O0.O000000000000O != this.O0000000000O0) {
            this.O0000000000O = o0000000OOO0O0.O0000000000000;
            this.O0000000000O0 = o0000000OOO0O0.O000000000000O;
            String var5 = O0000O000OO0O0.O00000000(o0000000OOO0O0.O0000000000000).toUpperCase();
            String var6 = this.O0000000000O0 ? "[HOLD] + " + var5 : var5;
            if (!var6.equals(this.O0000000000000)) {
               this.O0000000000000 = var6;
               this.O00000000000O0 = TextMeasureCache.O000000000(FontRegistry.O00000000, this.O0000000000000, var4);
            }
         }

         this.O000000000000O = null;
         this.O00000000000OO = 0.0F;
      }
   }
}
