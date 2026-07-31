package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import org.wild.module.api.Module;

public final class O0000O000O00 implements O0000O000O000 {
   private static final int O00000000 = 6;
   private static final int O000000000 = 3;
   private static List<O0000O000O00.W343> O0000000000;
   private final SettingsRenderer O00000000000 = new SettingsRenderer();
   private final O00000OOOOOOO0 O000000000000 = new O00000OOOOOOO0();
   private final TextSetting O0000000000000 = new TextSetting("AutoCraft Search", "");
   private final O0000O000O00O O000000000000O = new O0000O000O00O(0.0F);
   private final long[] O00000000000O = new long[9];
   private final Map<String, Long> O00000000000O0 = new HashMap<>();
   private String O00000000000OO = "minecraft:oak_log";
   private String O0000000000O = "";
   private boolean O0000000000O0;
   private long O0000000000O00;
   private long O0000000000O0O;
   private float O0000000000OO;
   private AutoCraft O0000000000OO0;
   private O0000O000O00.W344 O0000000000OOO;
   private O0000O00000 O000000000O;
   private float O000000000O0;
   private float O000000000O00;
   private float O000000000O000 = 1.0F;

   @Override
   public boolean O00000000(Module module) {
      return module instanceof AutoCraft;
   }

   @Override
   public boolean O00000000(Module module, O0000O000O0O0 o0000O000O0O0) {
      return false;
   }

   @Override
   public void O00000000(O0000O000O0O0 o0000O000O0O0) {
      this.O0000000000OO = 0.0F;
      this.O000000000000O.O00000000(0.0F);
   }

   @Override
   public float O00000000(Module module, O0000O00000 o0000O00000, O0000O000O0O0 o0000O000O0O0) {
      return o0000O00000.O00000000(238.0F);
   }

   @Override
   public void O00000000(Module module, O0000O000O0O0 o0000O000O0O0, O0000O000O0O00 o0000O000O0O00, O0000O000O0O00 o0000O000O0O002) {
      o0000O000O0O0.O000000000("autocraft:panel", o0000O000O0O0.O00000000O0O().contains(module) ? 1.0F : 0.0F, o0000O000O0O00);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void O00000000(
      RenderManager o0000O00OO0O0, DrawContext drawContext, O0000O000O0O0 o0000O000O0O0, O0000O00000000 o0000O00000000, O0000O000O0OOO o0000O000O0OOO
   ) {
      if (o0000O00000000.O00000000() instanceof AutoCraft var6) {
         O0000O00000 var16 = o0000O000O0OOO.O000000000000();
         ColorScheme var8 = o0000O000O0OOO.O0000000000000();
         O0000O000O00.W344 var9 = this.O00000000(o0000O00000000, var16);
         this.O0000000000OO0 = var6;
         this.O0000000000OOO = var9;
         this.O000000000O = var16;
         this.O000000000O0 = this.O000000000(var16);
         this.O000000000O00 = var16.O00000000(3.0F);
         float var10 = Math.max(0.05F, o0000O000O0O0.O00000000("autocraft:panel"));
         this.O000000000O000 = !o0000O000O0O0.O00000000OOOOO() && o0000O000O0O0.O00000000O0O().contains(var6) ? var10 : 0.0F;
         float var11 = this.O000000000000O.O00000000(this.O0000000000OO, O0000O000O00O.W345.O00000000());
         o0000O00OO0O0.O000000000000(var10);
         boolean var14 = false /* VF: Semaphore variable */;

         try {
            var14 = true;
            this.O00000000(o0000O00OO0O0, var9, var16, var8);
            this.O00000000(o0000O00OO0O0, drawContext, o0000O000O0O0, var6, var9, var16, var8);
            this.O00000000(o0000O00OO0O0, drawContext, o0000O000O0O0, var6, var9, var16, var8, var11);
            this.O00000000(o0000O00OO0O0, o0000O000O0O0, var6, var9, var16, o0000O000O0OOO);
            this.O00000000(o0000O00OO0O0, drawContext, o0000O000O0O0, var9, var16);
            var14 = false;
         } finally {
            if (var14) {
               o0000O00OO0O0.O00000000000OO();
            }
         }

         o0000O00OO0O0.O00000000000OO();
      }
   }

   @Override
   public void O00000000(List<O00000OOOOOO> list, O0000O000O0O0 o0000O000O0O0, O0000O00000000 o0000O00000000, O0000O00000 o0000O00000) {
      if (o0000O00000000.O00000000() instanceof AutoCraft var5) {
         O0000O000O00.W344 var21 = this.O00000000(o0000O00000000, o0000O00000);
         this.O0000000000OO0 = var5;
         this.O0000000000OOO = var21;
         this.O000000000O = o0000O00000;
         this.O000000000O0 = this.O000000000(o0000O00000);
         this.O000000000O00 = o0000O00000.O00000000(3.0F);
         float var7 = this.O000000000(o0000O00000);
         float var8 = o0000O00000.O00000000(3.0F);

         for (int var9 = 0; var9 < 9; var9++) {
            int var10 = var9;
            int var11 = var9 / 3;
            int var12 = var9 % 3;
            float var13 = var21.gridX() + var12 * (var7 + var8);
            float var14 = var21.gridY() + var11 * (var7 + var8);
            list.add(
               O00000OOOOOO.O00000000().O00000000(0).O00000000(var13).O000000000(var14).O0000000000(var7).O00000000000(var7).O00000000(o0000O000O0O0x -> {
                  if (!this.O00000000000OO.isBlank()) {
                     var5.O000000000O.O00000000(var10, this.O00000000000OO);
                     this.O00000000(var10);
                     o0000O000O0O0x.O00000000O000O();
                  }
               }).O00000000()
            );
            list.add(
               O00000OOOOOO.O00000000().O00000000(1).O00000000(var13).O000000000(var14).O0000000000(var7).O00000000000(var7).O00000000(o0000O000O0O0x -> {
                  var5.O000000000O.O000000000(var10);
                  this.O00000000(var10);
                  o0000O000O0O0x.O00000000O000O();
               }).O00000000()
            );
         }

         list.add(
            O00000OOOOOO.O00000000()
               .O00000000(0)
               .O00000000(var21.clearX())
               .O000000000(var21.clearY())
               .O0000000000(var21.clearW())
               .O00000000000(o0000O00000.O00000000(14.0F))
               .O00000000(o0000O000O0O0x -> {
                  var5.O000000000O.O0000000000();
                  this.O0000000000O00 = System.currentTimeMillis();

                  for (int var3 = 0; var3 < this.O00000000000O.length; var3++) {
                     this.O00000000(var3);
                  }

                  o0000O000O0O0x.O00000000O000O();
               })
               .O00000000()
         );
         list.add(
            O00000OOOOOO.O00000000()
               .O00000000(0)
               .O00000000(var21.searchX())
               .O000000000(var21.searchY())
               .O0000000000(var21.searchW())
               .O00000000000(var21.searchH())
               .O00000000(o0000O000O0O0x -> {
                  o0000O000O0O0x.O00000000000O(false);
                  o0000O000O0O0x.O00000000(this.O0000000000000);
               })
               .O00000000()
         );
         float var22 = this.O000000000000O.O000000000();
         List var23 = O00000000(this.O0000000000000.O000000000000);
         int var24 = this.O00000000(var21, o0000O00000);
         float var25 = this.O00000000(o0000O00000);
         float var26 = o0000O00000.O00000000(3.0F);
         float var27 = var21.catalogY() + var22;

         for (int var15 = 0; var15 < var23.size(); var15++) {
            O0000O000O00.W343 var16 = (O0000O000O00.W343)var23.get(var15);
            int var17 = var15 / var24;
            int var18 = var15 % var24;
            float var19 = var21.catalogX() + var18 * (var25 + var26);
            float var20 = var27 + var17 * (var25 + var26);
            if (!(var20 + var25 < var21.catalogY()) && !(var20 > var21.catalogY() + var21.catalogH())) {
               list.add(
                  O00000OOOOOO.O00000000()
                     .O00000000(0)
                     .O00000000(var19)
                     .O000000000(var20)
                     .O0000000000(var25)
                     .O00000000000(var25)
                     .O000000000000(var21.catalogX())
                     .O0000000000000(var21.catalogY())
                     .O000000000000O(var21.catalogW())
                     .O00000000000O(var21.catalogH())
                     .O00000000(o0000O000O0O0x -> {
                        this.O00000000000OO = var16.id();
                        this.O0000000000O = var16.id();
                        this.O0000000000(var16.id());
                        o0000O000O0O0x.O00000000000O(false);
                        o0000O000O0O0x.O00000000((NumberSetting)null);
                     })
                     .O00000000()
               );
            }
         }

         float var28 = this.O000000000(var21, o0000O00000);
         float var29 = this.O0000000000(var21, o0000O00000);
         float var30 = this.O00000000000(var21, o0000O00000);
         list.add(
            O00000OOOOOO.O00000000()
               .O00000000(0)
               .O00000000(var28)
               .O000000000(var29 - o0000O00000.O00000000(2.0F))
               .O0000000000(var30)
               .O00000000000(o0000O00000.O00000000(18.0F))
               .O00000000(o0000O000O0O0x -> {
                  o0000O000O0O0x.O00000000000O(false);
                  o0000O000O0O0x.O00000000(var5.O000000000O0);
               })
               .O00000000()
         );
         float var31 = var29 + o0000O00000.O00000000(24.0F);
         list.add(
            O00000OOOOOO.O00000000()
               .O00000000(0)
               .O00000000(var28)
               .O000000000(var31 + o0000O00000.O00000000(3.0F))
               .O0000000000(var30)
               .O00000000000(o0000O00000.O00000000(26.0F))
               .O00000000(o0000O000O0O0x -> this.O000000000000.O00000000(o0000O000O0O0x, var5.O000000000O00, o0000O000O0O0x.O0000000O(), var28, var30))
               .O00000000()
         );
         list.add(
            O00000OOOOOO.O00000000()
               .O00000000(0)
               .O00000000(this.O000000000000(var21, o0000O00000) - o0000O00000.O00000000(3.0F))
               .O000000000(var21.catalogY())
               .O0000000000(o0000O00000.O00000000(9.0F))
               .O00000000000(var21.catalogH())
               .O00000000(o0000O000O0O0x -> {
                  this.O0000000000O0 = true;
                  this.O00000000(var5, var21, o0000O00000, o0000O000O0O0x.O0000000O0());
               })
               .O00000000()
         );
      }
   }

   @Override
   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, O0000O0000000 o0000O0000000, O0000O00000 o0000O00000, float f, float g, double d) {
      for (O0000O00000000 var9 : o0000O0000000.O000000000()) {
         if (var9.O00000000() instanceof AutoCraft var10) {
            O0000O000O00.W344 var13 = this.O00000000(var9, o0000O00000);
            if (O0000O00000OO.O00000000(f, g, var13.catalogX(), var13.catalogY(), var13.catalogW() + o0000O00000.O00000000(8.0F), var13.catalogH())) {
               float var12 = this.O00000000(var10, var13, o0000O00000);
               this.O0000000000OO = this.O00000000(this.O0000000000OO + (float)d * o0000O00000.O00000000(28.0F), -var12, 0.0F);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, float f, float g) {
      if (this.O0000000000O0) {
         this.O00000000(this.O0000000000OO0, this.O0000000000OOO, this.O000000000O, g);
         return true;
      } else if (this.O0000000000OO0 != null && this.O0000000000OOO != null) {
         String var4 = !this.O0000000000O.isBlank() ? this.O0000000000O : this.O00000000000OO;
         if (var4.isBlank()) {
            return false;
         } else {
            int var5 = this.O00000000(f, g);
            if (var5 == -1) {
               return !this.O0000000000O.isBlank();
            } else {
               if (!var4.equals(this.O0000000000OO0.O000000000O.O00000000(var5))) {
                  this.O0000000000OO0.O000000000O.O00000000(var5, var4);
                  this.O00000000(var5);
                  o0000O000O0O0.O00000000O000O();
               }

               return true;
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean O0000000000(O0000O000O0O0 o0000O000O0O0) {
      if (this.O0000000000O0) {
         this.O0000000000O0 = false;
         return true;
      } else if (this.O0000000000O.isBlank()) {
         return false;
      } else {
         if (this.O0000000000OO0 != null && this.O0000000000OOO != null) {
            int var2 = this.O00000000(o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0());
            if (var2 != -1 && !this.O0000000000O.equals(this.O0000000000OO0.O000000000O.O00000000(var2))) {
               this.O0000000000OO0.O000000000O.O00000000(var2, this.O0000000000O);
               this.O00000000(var2);
               o0000O000O0O0.O00000000O000O();
            }
         }

         this.O0000000000O = "";
         return true;
      }
   }

   @Override
   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, int i) {
      TextSetting var3 = o0000O000O0O0.O0000000OOO000();
      if (var3 == this.O0000000000000 || this.O0000000000OO0 != null && var3 == this.O0000000000OO0.O000000000O0) {
         if (i == 256 || i == 257) {
            o0000O000O0O0.O00000000((NumberSetting)null);
            return true;
         } else if (i == 259 && !var3.O000000000000.isEmpty()) {
            var3.O000000000000 = var3.O000000000000.substring(0, var3.O000000000000.length() - 1);
            if (var3 == this.O0000000000000) {
               this.O000000000();
               this.O0000000000();
            } else {
               o0000O000O0O0.O00000000O000O();
            }

            return true;
         } else if (var3 == this.O0000000000000 && i == 261 && !this.O0000000000000.O000000000000.isEmpty()) {
            this.O0000000000000.O000000000000 = "";
            this.O000000000();
            this.O0000000000();
            return true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, char c) {
      TextSetting var3 = o0000O000O0O0.O0000000OOO000();
      if (var3 == this.O0000000000000 || this.O0000000000OO0 != null && var3 == this.O0000000000OO0.O000000000O0) {
         if (!Character.isISOControl(c)) {
            if (var3 == this.O0000000000000 && this.O0000000000000.O000000000000.length() < 64) {
               this.O0000000000000.O000000000000 = this.O0000000000000.O000000000000 + c;
               this.O000000000();
               this.O0000000000();
            } else if (Character.isDigit(c) && var3.O000000000000.length() < var3.O000000000000O) {
               var3.O000000000000 = var3.O000000000000 + c;
               o0000O000O0O0.O00000000O000O();
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O000O00.W344 o000000000, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO) {
      int var5 = ColorScheme.O00000000(o0000O000O0OO.O0000000000O(), ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 34), 0.16F);
      int var6 = ColorScheme.O00000000(o0000O000O0OO.O0000000000OO(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 150), 0.24F);
      o0000O00OO0O0.O00000000(
         o000000000.leftX(),
         o000000000.panelY(),
         o000000000.leftW(),
         o000000000.panelH(),
         o0000O00000.O00000000(6.0F),
         o0000O00000.O00000000(7.0F),
         o0000O00000.O00000000(1.0F),
         ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 13)
      );
      o0000O00OO0O0.O00000000(o000000000.leftX(), o000000000.panelY(), o000000000.leftW(), o000000000.panelH(), o0000O00000.O00000000(6.0F), var5);
      o0000O00OO0O0.O00000000(o000000000.leftX(), o000000000.panelY(), o000000000.leftW(), o000000000.panelH(), o0000O00000.O00000000(6.0F), var6, 0.7F);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         o000000000.leftX() + o0000O00000.O00000000(12.0F),
         o000000000.panelY() + o0000O00000.O00000000(8.0F),
         o0000O00000.O00000000(12.0F),
         10.0F,
         "Рецепт крафта",
         O0000O00000OO.O00000000(o0000O000O0OO)
      );
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      DrawContext drawContext,
      O0000O000O0O0 o0000O000O0O0,
      AutoCraft o000000OO00OO0,
      O0000O000O00.W344 o000000000,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO
   ) {
      float var8 = this.O000000000(o0000O00000);
      float var9 = o0000O00000.O00000000(3.0F);

      for (int var10 = 0; var10 < 9; var10++) {
         int var11 = var10 / 3;
         int var12 = var10 % 3;
         float var13 = o000000000.gridX() + var12 * (var8 + var9);
         float var14 = o000000000.gridY() + var11 * (var8 + var9);
         boolean var15 = o000000OO00OO0.O000000000O.O00000000(var10).equals(this.O00000000000OO);
         float var16 = o0000O000O0O0.O00000000(
            "autocraft:slot:hover:" + var10, O0000O00000OO.O00000000(o0000O000O0O0, var13, var14, var8, var8) ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO()
         );
         float var17 = this.O00000000(this.O00000000000O[var10], 430L);
         float var18 = 1.0F + var16 * 0.035F + var17 * 0.08F;
         o0000O00OO0O0.O00000000(var18, var13 + var8 * 0.5F, var14 + var8 * 0.5F);

         try {
            if (var17 > 0.01F) {
               o0000O00OO0O0.O00000000(
                  var13,
                  var14,
                  var8,
                  var8,
                  o0000O00000.O00000000(3.0F),
                  o0000O00000.O00000000(8.0F) * var17,
                  o0000O00000.O00000000(1.0F),
                  ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(80.0F * var17))
               );
            }

            int var19 = var15
               ? ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), Math.round(46.0F + 24.0F * var16 + 38.0F * var17))
               : ColorScheme.O00000000(o0000O000O0OO.O00000000000OO(), o0000O000O0OO.O0000000000O0(), var16);
            int var20 = !var15 && !(var17 > 0.01F)
               ? o0000O000O0OO.O0000000000O0O()
               : ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), o0000O000O0OO.O000000000O0(), Math.max(var16, var17));
            o0000O00OO0O0.O00000000(var13, var14, var8, var8, o0000O00000.O00000000(3.0F), var19);
            o0000O00OO0O0.O00000000(var13, var14, var8, var8, o0000O00000.O00000000(3.0F), var20, !var15 && !(var17 > 0.01F) ? 0.55F : 0.95F);
            ItemStack var21 = this.O000000000(o000000OO00OO0.O000000000O.O00000000(var10));
            if (!var21.isEmpty()) {
               this.O00000000(
                  o0000O00OO0O0,
                  drawContext,
                  var21,
                  var13 + var8 * 0.23F,
                  var14 + var8 * 0.18F,
                  var8 * 0.54F,
                  o000000000.leftX(),
                  o000000000.panelY(),
                  o000000000.leftW(),
                  o000000000.panelH()
               );
            }
         } finally {
            o0000O00OO0O0.O00000000000O0();
         }
      }

      float var25 = o0000O000O0O0.O00000000(
         "autocraft:clear:hover",
         O0000O00000OO.O00000000(o0000O000O0O0, o000000000.clearX(), o000000000.clearY(), o000000000.clearW(), o0000O00000.O00000000(14.0F)) ? 1.0F : 0.0F,
         O0000O000O0O00.O00000000000OO()
      );
      float var26 = this.O00000000(this.O0000000000O00, 450L);
      o0000O00OO0O0.O00000000(
         o000000000.clearX(),
         o000000000.clearY(),
         o000000000.clearW(),
         o0000O00000.O00000000(14.0F),
         o0000O00000.O00000000(3.0F),
         ColorScheme.O00000000(o0000O000O0OO.O0000000000O(), ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 64), Math.max(var25, var26))
      );
      o0000O00OO0O0.O00000000(
         o000000000.clearX(),
         o000000000.clearY(),
         o000000000.clearW(),
         o0000O00000.O00000000(14.0F),
         o0000O00000.O00000000(3.0F),
         ColorScheme.O00000000(o0000O000O0OO.O0000000000O00(), o0000O000O0OO.O000000000O0(), Math.max(var25, var26)),
         0.5F + var26 * 0.4F
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         o000000000.clearX() + o000000000.clearW() * 0.5F,
         o000000000.clearY(),
         o0000O00000.O00000000(14.0F),
         7.0F,
         "Очистить",
         O0000O00000OO.O00000000(o0000O000O0OO),
         "c"
      );
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(
      RenderManager o0000O00OO0O0,
      DrawContext drawContext,
      O0000O000O0O0 o0000O000O0O0,
      AutoCraft o000000OO00OO0,
      O0000O000O00.W344 o000000000,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      float f
   ) {
      List var9 = O00000000(this.O0000000000000.O000000000000);
      float var10 = o0000O000O0O0.O00000000(
         "autocraft:search:focus", o0000O000O0O0.O0000000OOO000() == this.O0000000000000 ? 1.0F : 0.0F, O0000O000O0O00.O00000000000O()
      );
      float var11 = o0000O000O0O0.O00000000("autocraft:search:query", this.O0000000000000.O000000000000.isBlank() ? 0.0F : 1.0F, O0000O000O0O00.O00000000000O());
      float var12 = this.O00000000(this.O0000000000O0O, 360L);
      int var13 = ColorScheme.O00000000(
         o0000O000O0OO.O0000000000O0(), ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 58), Math.max(var11 * 0.45F, var10 * 0.7F)
      );
      int var14 = ColorScheme.O00000000(o0000O000O0OO.O0000000000OO(), o0000O000O0OO.O000000000O0(), Math.max(var10, var12));
      o0000O00OO0O0.O00000000(o000000000.searchX(), o000000000.searchY(), o000000000.searchW(), o000000000.searchH(), o0000O00000.O00000000(4.0F), var13);
      o0000O00OO0O0.O00000000(
         o000000000.searchX(),
         o000000000.searchY(),
         o000000000.searchW(),
         o000000000.searchH(),
         o0000O00000.O00000000(4.0F),
         var14,
         0.55F + var10 * 0.25F + var12 * 0.35F
      );
      if (var10 > 0.01F || var12 > 0.01F) {
         o0000O00OO0O0.O00000000(
            o000000000.searchX(),
            o000000000.searchY(),
            o000000000.searchW(),
            o000000000.searchH(),
            o0000O00000.O00000000(4.0F),
            o0000O00000.O00000000(8.0F) * Math.max(var10, var12),
            o0000O00000.O00000000(1.0F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(32.0F * Math.max(var10, var12)))
         );
      }

      String var15 = this.O0000000000000.O000000000000.isBlank()
         ? "Поиск"
         : this.O0000000000000.O000000000000 + (o0000O000O0O0.O0000000OOO000() == this.O0000000000000 ? "|" : "");
      int var16 = this.O0000000000000.O000000000000.isBlank() ? O0000O00000OO.O0000000000(o0000O000O0OO) : O0000O00000OO.O00000000(o0000O000O0OO);
      String var17 = this.O0000000000000.O000000000000.isBlank() ? "" : Integer.toString(var9.size());
      float var18 = var17.isBlank() ? 0.0F : O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000, var17, 8.0F) + o0000O00000.O00000000(12.0F);
      String var19 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, var15, 8.0F, o000000000.searchW() - o0000O00000.O00000000(12.0F) - var18);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         o000000000.searchX() + o0000O00000.O00000000(6.0F),
         o000000000.searchY(),
         o000000000.searchH(),
         8.0F,
         var19,
         var16
      );
      if (!var17.isBlank()) {
         o0000O00OO0O0.O00000000(
            o000000000.searchX() + o000000000.searchW() - var18 - o0000O00000.O00000000(4.0F),
            o000000000.searchY() + o0000O00000.O00000000(4.0F),
            var18,
            o000000000.searchH() - o0000O00000.O00000000(8.0F),
            o0000O00000.O00000000(4.0F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 55)
         );
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000000,
            o000000000.searchX() + o000000000.searchW() - var18 * 0.5F - o0000O00000.O00000000(4.0F),
            o000000000.searchY(),
            o000000000.searchH(),
            8.0F,
            var17,
            o0000O000O0OO.O000000000O0(),
            "c"
         );
      }

      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000(
         Math.round(o000000000.catalogX()), Math.round(o000000000.catalogY()), Math.round(o000000000.catalogW()), Math.round(o000000000.catalogH())
      );

      try {
         if (var9.isEmpty()) {
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000,
               o000000000.catalogX() + o000000000.catalogW() * 0.5F,
               o000000000.catalogY() + o000000000.catalogH() * 0.5F - o0000O00000.O00000000(5.0F),
               o0000O00000.O00000000(10.0F),
               8.0F,
               "Нет совпадений",
               O0000O00000OO.O0000000000(o0000O000O0OO),
               "c"
            );
            return;
         }

         int var20 = this.O00000000(o000000000, o0000O00000);
         float var21 = this.O00000000(o0000O00000);
         float var22 = o0000O00000.O00000000(3.0F);
         float var23 = o000000000.catalogY() + f;

         for (int var24 = 0; var24 < var9.size(); var24++) {
            O0000O000O00.W343 var25 = (O0000O000O00.W343)var9.get(var24);
            int var26 = var24 / var20;
            int var27 = var24 % var20;
            float var28 = o000000000.catalogX() + var27 * (var21 + var22);
            float var29 = var23 + var26 * (var21 + var22);
            if (!(var29 + var21 < o000000000.catalogY()) && !(var29 > o000000000.catalogY() + o000000000.catalogH())) {
               boolean var30 = var25.id().equals(this.O00000000000OO);
               float var31 = o0000O000O0O0.O00000000(
                  "autocraft:catalog:hover:" + var25.id(),
                  O0000O00000OO.O00000000(o0000O000O0O0, var28, var29, var21, var21) ? 1.0F : 0.0F,
                  O0000O000O0O00.O00000000000OO()
               );
               float var32 = o0000O000O0O0.O00000000("autocraft:catalog:selected:" + var25.id(), var30 ? 1.0F : 0.0F, O0000O000O0O00.O00000000000O());
               float var33 = this.O00000000(this.O00000000000O0.getOrDefault(var25.id(), 0L), 430L);
               float var34 = 1.0F + var31 * 0.04F + var33 * 0.1F;
               o0000O00OO0O0.O00000000(var34, var28 + var21 * 0.5F, var29 + var21 * 0.5F);
               boolean var41 = false /* VF: Semaphore variable */;

               try {
                  var41 = true;
                  if (var33 > 0.01F) {
                     o0000O00OO0O0.O00000000(
                        var28,
                        var29,
                        var21,
                        var21,
                        o0000O00000.O00000000(3.0F),
                        o0000O00000.O00000000(7.0F) * var33,
                        o0000O00000.O00000000(1.0F),
                        ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(72.0F * var33))
                     );
                  }

                  o0000O00OO0O0.O00000000(
                     var28,
                     var29,
                     var21,
                     var21,
                     o0000O00000.O00000000(3.0F),
                     ColorScheme.O00000000(
                        o0000O000O0OO.O0000000000O(), ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 72), Math.max(var32, var31 * 0.45F)
                     )
                  );
                  o0000O00OO0O0.O00000000(
                     var28,
                     var29,
                     var21,
                     var21,
                     o0000O00000.O00000000(3.0F),
                     ColorScheme.O00000000(o0000O000O0OO.O0000000000O00(), o0000O000O0OO.O000000000O0(), Math.max(var32, var33)),
                     !(var32 > 0.01F) && !(var33 > 0.01F) ? 0.45F : 0.9F
                  );
                  this.O00000000(
                     o0000O00OO0O0,
                     drawContext,
                     var25.stack(),
                     var28 + var21 * 0.16F,
                     var29 + var21 * 0.16F,
                     var21 * 0.68F,
                     o000000000.catalogX(),
                     o000000000.catalogY(),
                     o000000000.catalogW(),
                     o000000000.catalogH()
                  );
                  var41 = false;
               } finally {
                  if (var41) {
                     o0000O00OO0O0.O00000000000O0();
                  }
               }

               o0000O00OO0O0.O00000000000O0();
            }
         }
      } finally {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      }

      this.O00000000(o0000O00OO0O0, o000000OO00OO0, o000000000, o0000O00000, o0000O000O0OO, f);
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, AutoCraft o000000OO00OO0, O0000O000O00.W344 o000000000, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f
   ) {
      float var7 = this.O00000000(o000000OO00OO0, o000000000, o0000O00000);
      float var8 = o0000O00000.O00000000(3.0F);
      float var9 = this.O000000000000(o000000000, o0000O00000);
      float var10 = o000000000.catalogY();
      float var11 = o000000000.catalogH();
      o0000O00OO0O0.O00000000(var9, var10, var8, var11, var8 * 0.5F, o0000O000O0OO.O0000000000O());
      float var12 = var7 <= 0.0F ? var11 : Math.max(o0000O00000.O00000000(16.0F), var11 * (var11 / (var11 + var7)));
      float var13 = var7 <= 0.0F ? 0.0F : this.O00000000(-f / var7, 0.0F, 1.0F);
      float var14 = var10 + (var11 - var12) * var13;
      o0000O00OO0O0.O00000000(var9, var14, var8, var12, var8 * 0.5F, ColorScheme.O00000000(o0000O000O0OO.O0000000000OO0(), o0000O000O0OO.O000000000O0(), 0.45F));
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      AutoCraft o000000OO00OO0,
      O0000O000O00.W344 o000000000,
      O0000O00000 o0000O00000,
      O0000O000O0OOO o0000O000O0OOO
   ) {
      float var7 = this.O000000000(o000000000, o0000O00000);
      float var8 = this.O0000000000(o000000000, o0000O00000);
      float var9 = this.O00000000000(o000000000, o0000O00000);
      this.O00000000000.O00000000(o0000O00OO0O0, o0000O000O0O0, o000000OO00OO0.O000000000O0, var7, var8, var9, o0000O000O0OOO);
      this.O00000000000.O00000000(o0000O00OO0O0, o0000O000O0O0, o000000OO00OO0.O000000000O00, var7, var8 + o0000O00000.O00000000(24.0F), var9, o0000O000O0OOO);
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, DrawContext drawContext, O0000O000O0O0 o0000O000O0O0, O0000O000O00.W344 o000000000, O0000O00000 o0000O00000
   ) {
      if (!this.O0000000000O.isBlank()) {
         ItemStack var6 = this.O000000000(this.O0000000000O);
         if (!var6.isEmpty()) {
            float var7 = o0000O00000.O00000000(18.0F);
            this.O00000000(
               o0000O00OO0O0,
               drawContext,
               var6,
               o0000O000O0O0.O0000000O() - var7 * 0.5F,
               o0000O000O0O0.O0000000O0() - var7 * 0.5F,
               var7,
               o000000000.x() - o0000O00000.O00000000(20.0F),
               o000000000.y() - o0000O00000.O00000000(20.0F),
               o000000000.width() + o0000O00000.O00000000(40.0F),
               o000000000.height() + o0000O00000.O00000000(80.0F)
            );
         }
      }
   }

   private O0000O000O00.W344 O00000000(O0000O00000000 o0000O00000000, O0000O00000 o0000O00000) {
      float var3 = o0000O00000.O0000000000OO0();
      float var4 = o0000O00000000.O000000000() + o0000O00000.O00000000(14.0F);
      float var5 = o0000O00000000.O0000000000() + var3 + o0000O00000.O00000000(8.0F);
      float var6 = o0000O00000000.O00000000000() - o0000O00000.O00000000(28.0F);
      float var7 = o0000O00000.O00000000(12.0F);
      float var8 = o0000O00000.O00000000(14.0F);
      float var9 = this.O00000000(o0000O00000);
      float var10 = o0000O00000.O00000000(3.0F);
      float var11 = var9 * 6.0F + var10 * 5.0F;
      float var12 = var9 * 3.0F + var10 * 2.0F;
      float var13 = this.O000000000(o0000O00000);
      float var14 = o0000O00000.O00000000(3.0F);
      float var15 = var13 * 3.0F + var14 * 2.0F;
      float var16 = var15 + var8 + var11 + o0000O00000.O00000000(8.0F);
      float var18 = o0000O00000.O00000000(162.0F);
      float var20 = var4 + var7;
      float var21 = var20 + var15 + var8;
      float var25 = var5 + var7 + o0000O00000.O00000000(14.0F);
      float var26 = var6 - var7 * 2.0F;
      float var27 = o0000O00000.O00000000(18.0F);
      float var28 = var25 + var27 + o0000O00000.O00000000(8.0F);
      float var31 = var28 + var15 + o0000O00000.O00000000(6.0F);
      return new O0000O000O00.W344(
         var4,
         var5,
         var6,
         var18,
         var4,
         var21,
         var6,
         var11,
         var5,
         var18,
         var20,
         var28,
         var20,
         var31,
         var15,
         var20,
         var25,
         var26,
         var27,
         var21,
         var28,
         var11,
         var12
      );
   }

   private static List<O0000O000O00.W343> O00000000(String string) {
      String var1 = string == null ? "" : string.trim().toLowerCase(Locale.ROOT);
      if (var1.isEmpty()) {
         return O00000000();
      } else {
         ArrayList var2 = new ArrayList();

         for (O0000O000O00.W343 var4 : O00000000()) {
            if (var4.id().toLowerCase(Locale.ROOT).contains(var1) || var4.label().toLowerCase(Locale.ROOT).contains(var1)) {
               var2.add(var4);
            }
         }

         return var2;
      }
   }

   private static List<O0000O000O00.W343> O00000000() {
      if (O0000000000 != null) {
         return O0000000000;
      } else {
         ArrayList var0 = new ArrayList();

         for (Item var2 : Registries.ITEM) {
            if (var2 != Items.AIR) {
               Identifier var3 = Registries.ITEM.getId(var2);
               if (var3 != null && "minecraft".equals(var3.getNamespace())) {
                  ItemStack var4 = var2.getDefaultStack();
                  var0.add(new O0000O000O00.W343(var3.toString(), var4.getName().getString(), var4));
               }
            }
         }

         var0.sort(Comparator.comparing(O0000O000O00.W343::label, String.CASE_INSENSITIVE_ORDER));
         O0000000000 = List.copyOf(var0);
         return O0000000000;
      }
   }

   private ItemStack O000000000(String string) {
      Identifier var2 = Identifier.tryParse(string == null ? "" : string);
      if (var2 == null) {
         return ItemStack.EMPTY;
      } else {
         Item var3 = (Item)Registries.ITEM.get(var2);
         return var3 == Items.AIR ? ItemStack.EMPTY : var3.getDefaultStack();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(
      RenderManager o0000O00OO0O0, DrawContext drawContext, ItemStack itemStack, float f, float g, float h, float i, float j, float k, float l
   ) {
      if (!(this.O000000000O000 < 0.15F)) {
         if (drawContext != null && itemStack != null && !itemStack.isEmpty()) {
            MinecraftClient var11 = MinecraftClient.getInstance();
            if (var11 != null && var11.getWindow() != null) {
               float[] var12 = o0000O00OO0O0.O0000000000O0();
               float var13 = var12[0] * f + var12[1] * g + var12[2];
               float var14 = var12[3] * f + var12[4] * g + var12[5];
               float var15 = var12[0] * (f + h) + var12[1] * g + var12[2];
               float var16 = var12[3] * (f + h) + var12[4] * g + var12[5];
               float var17 = var12[0] * i + var12[1] * j + var12[2];
               float var18 = var12[3] * i + var12[4] * j + var12[5];
               float var19 = var12[0] * (i + k) + var12[1] * j + var12[2];
               float var20 = var12[3] * (i + k) + var12[4] * j + var12[5];
               float var21 = var12[0] * (i + k) + var12[1] * (j + l) + var12[2];
               float var22 = var12[3] * (i + k) + var12[4] * (j + l) + var12[5];
               float var23 = var12[0] * i + var12[1] * (j + l) + var12[2];
               float var24 = var12[3] * i + var12[4] * (j + l) + var12[5];
               float var25 = Math.min(Math.min(var17, var19), Math.min(var21, var23));
               float var26 = Math.min(Math.min(var18, var20), Math.min(var22, var24));
               float var27 = Math.max(Math.max(var17, var19), Math.max(var21, var23));
               float var28 = Math.max(Math.max(var18, var20), Math.max(var22, var24));
               float var29 = Math.max(1.0F, (float)Math.hypot(var15 - var13, var16 - var14));
               float var30 = var11.getWindow().getScaleFactor();
               o0000O00OO0O0.O0000000000();
               drawContext.enableScissor(
                  (int)Math.floor(var25 / var30), (int)Math.floor(var26 / var30), (int)Math.ceil(var27 / var30), (int)Math.ceil(var28 / var30)
               );
               drawContext.getMatrices().pushMatrix();
               boolean var33 = false /* VF: Semaphore variable */;

               try {
                  var33 = true;
                  drawContext.getMatrices().identity();
                  drawContext.getMatrices().translate(var13 / var30, var14 / var30);
                  drawContext.getMatrices().scale(var29 / 16.0F / var30, var29 / 16.0F / var30);
                  drawContext.drawItem(itemStack, 0, 0);
                  var33 = false;
               } finally {
                  if (var33) {
                     drawContext.getMatrices().popMatrix();
                     drawContext.disableScissor();
                  }
               }

               drawContext.getMatrices().popMatrix();
               drawContext.disableScissor();
            }
         }
      }
   }

   private float O00000000(AutoCraft o000000OO00OO0, O0000O000O00.W344 o000000000, O0000O00000 o0000O00000) {
      int var4 = this.O00000000(o000000000, o0000O00000);
      int var5 = Math.max(1, (O00000000(this.O0000000000000.O000000000000).size() + var4 - 1) / var4);
      float var6 = var5 * this.O00000000(o0000O00000) + Math.max(0, var5 - 1) * o0000O00000.O00000000(3.0F);
      return Math.max(0.0F, var6 - o000000000.catalogH());
   }

   private int O00000000(O0000O000O00.W344 o000000000, O0000O00000 o0000O00000) {
      return 6;
   }

   private float O00000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(28.0F);
   }

   private float O000000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(24.0F);
   }

   private float O000000000(O0000O000O00.W344 o000000000, O0000O00000 o0000O00000) {
      return o000000000.x() + o0000O00000.O00000000(12.0F);
   }

   private float O0000000000(O0000O000O00.W344 o000000000, O0000O00000 o0000O00000) {
      return o000000000.panelY() + o000000000.panelH() + o0000O00000.O00000000(10.0F);
   }

   private float O00000000000(O0000O000O00.W344 o000000000, O0000O00000 o0000O00000) {
      return o000000000.width() - o0000O00000.O00000000(24.0F);
   }

   private float O000000000000(O0000O000O00.W344 o000000000, O0000O00000 o0000O00000) {
      return o000000000.catalogX() + o000000000.catalogW() + o0000O00000.O00000000(3.0F);
   }

   private void O00000000(AutoCraft o000000OO00OO0, O0000O000O00.W344 o000000000, O0000O00000 o0000O00000, float f) {
      if (o000000OO00OO0 != null && o000000000 != null && o0000O00000 != null) {
         float var5 = this.O00000000(o000000OO00OO0, o000000000, o0000O00000);
         if (var5 <= 0.0F) {
            this.O0000000000OO = 0.0F;
            this.O000000000000O.O00000000(0.0F);
         } else {
            float var6 = this.O00000000((f - o000000000.catalogY()) / Math.max(1.0F, o000000000.catalogH()), 0.0F, 1.0F);
            this.O0000000000OO = -var5 * var6;
            this.O000000000000O.O00000000(this.O0000000000OO);
         }
      }
   }

   private void O000000000() {
      this.O0000000000OO = 0.0F;
      this.O000000000000O.O00000000(0.0F);
   }

   private void O00000000(int i) {
      if (i >= 0 && i < this.O00000000000O.length) {
         this.O00000000000O[i] = System.currentTimeMillis();
      }
   }

   private void O0000000000(String string) {
      if (string != null && !string.isBlank()) {
         this.O00000000000O0.put(string, System.currentTimeMillis());
      }
   }

   private void O0000000000() {
      this.O0000000000O0O = System.currentTimeMillis();
   }

   private float O00000000(long l, long m) {
      if (l > 0L && m > 0L) {
         float var5 = (float)(System.currentTimeMillis() - l);
         if (var5 >= (float)m) {
            return 0.0F;
         } else {
            float var6 = 1.0F - var5 / (float)m;
            return var6 * var6;
         }
      } else {
         return 0.0F;
      }
   }

   private int O00000000(float f, float g) {
      for (int var3 = 0; var3 < 9; var3++) {
         int var4 = var3 / 3;
         int var5 = var3 % 3;
         float var6 = this.O0000000000OOO.gridX() + var5 * (this.O000000000O0 + this.O000000000O00);
         float var7 = this.O0000000000OOO.gridY() + var4 * (this.O000000000O0 + this.O000000000O00);
         if (f >= var6 && g >= var7 && f < var6 + this.O000000000O0 && g < var7 + this.O000000000O0) {
            return var3;
         }
      }

      return -1;
   }

   private float O00000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }

   record W343(String id, String label, ItemStack stack) {
   }

   record W344(
      float x,
      float y,
      float width,
      float height,
      float leftX,
      float rightX,
      float leftW,
      float rightW,
      float panelY,
      float panelH,
      float gridX,
      float gridY,
      float clearX,
      float clearY,
      float clearW,
      float searchX,
      float searchY,
      float searchW,
      float searchH,
      float catalogX,
      float catalogY,
      float catalogW,
      float catalogH
   ) {
   }
}
