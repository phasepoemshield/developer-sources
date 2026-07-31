package ru.metaculture.protection;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;

@O0000000OOO0(
   O00000000 = "ArmorHUD",
   O000000000 = "w"
)
public final class ArmorHud extends HudElement {
   private static final ArmorHud O00000000 = new ArmorHud();
   private static final O0000O00O0OO O000000000OO0 = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OO00 = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OO0O = new O0000O00O0OO();
   private static final ItemStack[] O000000000OOO = new ItemStack[4];
   private static final O00000O0O0000[] O000000000OOO0 = new O00000O0O0000[4];
   private final BooleanSetting O000000000OOOO = new BooleanSetting("Показывать в процентах", true);
   private final ModeSetting O00000000O = new ModeSetting("Ориентация", "Горизонтально", "Горизонтально", "Вертикально");

   private ArmorHud() {
      this.O00000000(this.O000000000OOOO);
      this.O00000000(this.O00000000O);
      ru.metaculture.protection.O000000000O0O0.O00000000(this);
   }

   public static ArmorHud O000000000() {
      return O00000000;
   }

   public static void O00000000(RenderManager o0000O00OO0O0, DrawContext drawContext) {
      O00000000.O000000000(o0000O00OO0O0, drawContext);
   }

   public void O000000000(RenderManager o0000O00OO0O0, DrawContext drawContext) {
      if (MinecraftAccessor.a_.player != null) {
         O000000000OOO[0] = MinecraftAccessor.a_.player.getEquippedStack(EquipmentSlot.HEAD);
         O000000000OOO[1] = MinecraftAccessor.a_.player.getEquippedStack(EquipmentSlot.CHEST);
         O000000000OOO[2] = MinecraftAccessor.a_.player.getEquippedStack(EquipmentSlot.LEGS);
         O000000000OOO[3] = MinecraftAccessor.a_.player.getEquippedStack(EquipmentSlot.FEET);
         int var3 = 0;

         for (int var4 = 0; var4 < 4; var4++) {
            ItemStack var5 = O000000000OOO[var4];
            if (var5 != null && !var5.isEmpty()) {
               O000000000OOO[var3++] = var5;
            }
         }

         boolean var63 = var3 > 0;
         boolean var64 = var63 || MinecraftAccessor.a_.currentScreen instanceof ChatScreen;
         O000000000OO0.O00000000();
         O000000000OO0.O00000000(var64 ? 1.0 : 0.0, 0.22F, O0000O00O0OO0O.O0000000000O0O, false);
         float var6 = O000000000OO0.O000000000000();
         if (!(var6 <= 0.01F)) {
            float var7 = MinecraftAccessor.a_.getWindow().getFramebufferWidth();
            float var8 = MinecraftAccessor.a_.getWindow().getFramebufferHeight();
            float var9 = 7.0F;
            boolean var10 = this.O00000000O.O000000000("Вертикально");
            float var11 = var10 ? 56.0F : 42.0F;
            float var12 = 54.0F;
            float var13 = 5.0F;
            int var14 = var63 ? var3 : 4;
            float var15 = var10 ? var11 : var14 * var11 + (var14 - 1) * var13;
            float var16 = var10 ? var14 * var12 + (var14 - 1) * var13 : var12;
            float var17 = var15 + var9 * 2.0F;
            float var18 = var16 + var9 * 2.0F;
            O000000000OO00.O00000000();
            O000000000OO0O.O00000000();
            O000000000OO00.O00000000(var17, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
            O000000000OO0O.O00000000(var18, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
            float var19 = O000000000OO00.O000000000000();
            float var20 = O000000000OO0O.O000000000000();
            float var21 = var7 * 0.5F + 96.0F;
            float var22 = var8 - var20 - 12.0F;
            O00000OO000O.W219 var23 = O00000OO000O.O00000000().O00000000("hud_armor", var21, var22, var19, var20);
            float var24 = var23.O000000000;
            float var25 = var23.O0000000000;
            float var26 = var23.O00000000000;
            float var27 = var23.O000000000000;
            this.O00000000(var24, var25, var26, var27);
            float var28 = var26 / Math.max(1.0F, var19);
            float var29 = var27 / Math.max(1.0F, var20);
            float var30 = Math.min(var28, var29);
            float var31 = var11 * var28;
            float var32 = var12 * var29;
            float var33 = var13 * (var10 ? var29 : var28);
            float var34 = var15 * var28;
            float var35 = var16 * var29;
            float var36 = var6 * this.O000000000O0.O0000000000();
            float var37 = this.O00000000000OO(var36);
            int var38 = (int)(255.0F * var36);
            int var39 = this.O00000000(var36);
            int var40 = this.O00000000000(var36);
            int var41 = this.O00000000000OO() ? O0000O000OO000.O0000000000(255, 255, 255, (int)(5.0F * var37)) : this.O000000000(var37);
            float var42 = 10.0F;
            this.O00000000(o0000O00OO0O0, var24, var25, var26, var27, var42, var36);
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O00000000(var24, var25, var26, var27, var42, var42, var42, var42);

            try {
               float var43 = var24 + (var26 - var34) * 0.5F;
               float var44 = var25 + (var27 - var35) * 0.5F;

               for (int var45 = 0; var45 < var14; var45++) {
                  float var46 = var10 ? var43 : var43 + var45 * (var31 + var33);
                  float var47 = var10 ? var44 + var45 * (var32 + var33) : var44;
                  if (!this.O0000000000O() && !this.O0000000000O0() && !this.O0000000000O00()) {
                     o0000O00OO0O0.O00000000(var46, var47, var31, var32, 6.0F * var30, var41);
                  } else {
                     this.O000000000(o0000O00OO0O0, var46, var47, var31, var32, 6.0F * var30, var36);
                  }
               }

               if (var63) {
                  o0000O00OO0O0.O0000000000();
               }

               for (int var65 = 0; var65 < var14 && var63; var65++) {
                  float var66 = var10 ? var43 : var43 + var65 * (var31 + var33);
                  float var67 = var10 ? var44 + var65 * (var32 + var33) : var44;
                  ItemStack var48 = O000000000OOO[var65];
                  float var49 = 1.5F * var30;
                  float var50 = 16.0F * var49;
                  float var51 = var66 + (var31 - var50) * 0.5F;
                  float var52 = var67 + 8.0F * var29;
                  ItemRenderUtil.O00000000(
                     o0000O00OO0O0,
                     var48,
                     ItemRenderUtil.O00000000(var51),
                     ItemRenderUtil.O00000000(var52),
                     ItemRenderUtil.O0000000000(var49),
                     var65,
                     true,
                     var65
                  );
                  if (var48.isDamageable()) {
                     int var53 = var48.getMaxDamage();
                     int var54 = var53 - var48.getDamage();
                     boolean var55 = this.O000000000OOOO.O0000000000();
                     float var56 = var53 <= 0 ? 1.0F : (float)var54 / var53;
                     String var57 = var55 ? (int)(var56 * 100.0F) + "%" : var54 + "/" + var53;
                     int var58 = var56 <= 0.2F ? O0000O000OO000.O0000000000(255, 85, 85, var38) : this.O00000000000O(var36);
                     float var59 = 16.0F * var30;
                     O000000000OOO0[var65].O00000000(var57, var54);
                     O000000000OOO0[var65]
                        .O00000000(
                           o0000O00OO0O0,
                           FontRegistry.O00000000000,
                           var66,
                           var67,
                           var31,
                           var32,
                           4.0F * var30,
                           var66 + var31 * 0.5F,
                           var67 + var32 - 6.0F * var29,
                           var59,
                           var58
                        );
                  }
               }
            } finally {
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O0000000000000();
            }

            O00000OO000O.O00000000().O00000000(var23);
            O00000O0O00O.O00000000(
               o0000O00OO0O0,
               this,
               var23,
               O00000OO000O.O00000000(),
               MinecraftAccessor.a_.getWindow().getScaledWidth(),
               MinecraftAccessor.a_.getWindow().getScaledHeight()
            );
         }
      }
   }

   static {
      for (int var0 = 0; var0 < O000000000OOO0.length; var0++) {
         O000000000OOO0[var0] = new O00000O0O0000();
      }
   }
}
