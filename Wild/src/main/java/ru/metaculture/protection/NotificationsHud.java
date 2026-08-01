package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import lombok.Generated;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

@O0000000OOO0(
   O00000000 = "Notifications",
   O000000000 = "w"
)
public final class NotificationsHud extends HudElement {
   public static final String O00000000 = "Модули";
   public static final String O000000000OO0 = "Свап предметов";
   public static final String O000000000OO00 = "Эффекты";
   public static final String O000000000OO0O = "Низкое HP";
   public static final String O000000000OOO = "Предупреждения";
   public static final String O000000000OOO0 = "Поломка брони";
   private static final NotificationsHud O000000000OOOO = new NotificationsHud();
   private static final List<NotificationsHud.W152> O00000000O = new ArrayList<>();
   private static final Map<String, NotificationsHud.W153> O00000000O0 = new HashMap<>();
   private static final O0000O00O0OO O00000000O00 = new O0000O00O0OO();
   private static final float O00000000O000 = 40.0F;
   private static final float O00000000O0000 = 22.0F;
   private static final float O00000000O000O = 28.0F;
   private static final float O00000000O00O = 8.0F;
   private static final int O00000000O00O0 = 5;
   private static final float O00000000O00OO = 220.0F;
   private static final EquipmentSlot[] O00000000O0O = new EquipmentSlot[]{EquipmentSlot.FEET, EquipmentSlot.LEGS, EquipmentSlot.CHEST, EquipmentSlot.HEAD};
   private static final int[] O00000000O0O0 = new int[]{100, 100, 100, 100};
   private static final Item[] O00000000O0O00 = new Item[4];
   private static final String O00000000O0O0O = "Свапнул на » ";
   private static final String O00000000O0OO = "Скоро сломается » ";
   private static final Identifier O00000000O0OO0 = Identifier.of("minecraft", "textures/gui/sprites/hud/heart/full.png");
   private static float O00000000O0OOO = Float.NaN;
   private static boolean O00000000OO;
   private final GroupSetting O00000000OO0 = new GroupSetting(
      "Показывать",
      new BooleanSetting("Модули", true),
      new BooleanSetting("Свап предметов", true),
      new BooleanSetting("Эффекты", true),
      new BooleanSetting("Низкое HP", true),
      new BooleanSetting("Предупреждения", true),
      new BooleanSetting("Поломка брони", true)
   );

   private NotificationsHud() {
      this.O00000000(this.O00000000OO0);
      ru.metaculture.protection.O000000000O0O0.O00000000(this);
   }

   public static NotificationsHud O000000000() {
      return O000000000OOOO;
   }

   public static boolean O00000000000(String string) {
      return O000000000OOOO.O00000000OO0.O000000000(string);
   }

   public static void O0000000000OO0() {
      if (MinecraftAccessor.a_.player != null && MinecraftAccessor.a_.world != null) {
         if (O00000000000("Эффекты")) {
            O0000000000OOO();
         } else {
            O00000000O0.clear();
         }

         if (O00000000000("Низкое HP")) {
            O000000000O00();
         } else {
            O00000000OO = false;
         }

         if (O00000000000("Поломка брони")) {
            O000000000O();
         } else {
            O000000000O0();
         }
      } else {
         O00000000O0.clear();
         O00000000OO = false;
         O000000000O0();
      }
   }

   public static void O00000000(String string, String string2, long l) {
      O00000000(string, string2, l, "Предупреждения");
   }

   public static void O00000000(String string, String string2, long l, String string3) {
      if (O00000000000(string3)) {
         O00000000O.add(new NotificationsHud.W152(string, string2, l));
      }
   }

   public static void O00000000(ItemStack itemStack, String string, long l) {
      if (O00000000000("Свап предметов")) {
         String var4 = O000000000000(string);
         if ((var4 == null || var4.isEmpty()) && itemStack != null && !itemStack.isEmpty()) {
            var4 = O000000000000(itemStack.getName().getString());
         }

         if (var4 == null || var4.isEmpty()) {
            var4 = "предмет";
         }

         int var5 = O0000000000000(string);
         if (var5 == 0 && itemStack != null && itemStack.contains(DataComponentTypes.CUSTOM_NAME)) {
            var5 = O0000000000000(itemStack.getName().getString());
         }

         String var6 = "Свапнул на » " + var4;
         if (itemStack != null && !itemStack.isEmpty()) {
            O00000000O.add(new NotificationsHud.W152(itemStack.copy(), var6, "Свапнул на » ".length(), var5, l));
         } else {
            NotificationsHud.W152 var7 = new NotificationsHud.W152("i", var6, l);
            var7.O00000000000O = "Свапнул на » ".length();
            var7.O00000000000O0 = var5;
            O00000000O.add(var7);
         }
      }
   }

   public static void O00000000(String string, String string2) {
      if (O00000000000("Эффекты")) {
         O00000000O.add(new NotificationsHud.W152(O000000000000O(string), string2 + " » Скоро закончится", 2200L));
      }
   }

   public static void O000000000(String string, String string2) {
      if (O00000000000("Эффекты")) {
         O00000000O.add(new NotificationsHud.W152(O000000000000O(string), "Истёк » " + string2, 2200L));
      }
   }

   public static void O00000000(ItemStack itemStack, int i) {
      if (O00000000000("Поломка брони") && itemStack != null && !itemStack.isEmpty()) {
         String var2 = "Скоро сломается » " + i + "%";
         int var3 = O0000O000OO000.O0000000000(255, 70, 70, 255);
         O00000000O.add(new NotificationsHud.W152(itemStack.copy(), var2, "Скоро сломается » ".length(), var3, 2600L));
      }
   }

   public static void O00000000(String string, boolean bl) {
      if (O00000000000("Модули")) {
         for (NotificationsHud.W152 var3 : O00000000O) {
            if (var3.O00000000000() && var3.O0000000000000().equals(string)) {
               var3.O000000000(bl);
               var3.O00000000(System.currentTimeMillis());
               return;
            }
         }

         O00000000O.add(new NotificationsHud.W152(string, bl, 1000L));
      }
   }

   public static void O00000000(RenderManager o0000O00OO0O0) {
      O000000000OOOO.O000000000(o0000O00OO0O0);
   }

   private void O000000000(RenderManager o0000O00OO0O0) {
      if (MinecraftAccessor.a_.player != null) {
         boolean var2 = MinecraftAccessor.a_.currentScreen instanceof ChatScreen;
         O00000000O.removeIf(o00000000 -> {
            o00000000.O0000000000OO().O00000000();
            return o00000000.O0000000000() && o00000000.O0000000000OO().O000000000000() <= 0.01F;
         });
         O00000000O00.O00000000();
         O00000000O00.O00000000(O00000000O.isEmpty() && var2 ? 1.0 : 0.0, 0.22F, O0000O00O0OO0O.O0000000000O0O, false);
         float var3 = O00000000O00.O000000000000();
         float var4 = 38.0F;
         float var5 = 5.0F;
         float var6 = 28.0F;
         if (O00000000O.isEmpty()) {
            if (!(var3 <= 0.01F)) {
               String var23 = "Настройте позицию";
               float var24 = 24.0F;
               float var26 = TextMeasureCache.O00000000(FontRegistry.O00000000, var23, var24).O00000000;
               float var28 = var26 + 20.0F;
               int var30 = MinecraftAccessor.a_.getWindow().getFramebufferWidth();
               int var31 = MinecraftAccessor.a_.getWindow().getFramebufferHeight();
               float var32 = var31 / 2.0F + 140.0F;
               O00000OO000O.W219 var33 = this.O00000000(var4, var4, var32, var30, var31);
               float var34 = O00000000O0OOO - var28 * 0.5F;
               float var35 = var33.O0000000000;
               this.O00000000(var34, var35, var28, var4);
               float var36 = this.O000000000O0.O0000000000() * var3;
               int var37 = this.O000000000000(var36);
               float var20 = 12.0F;
               this.O00000000(o0000O00OO0O0, var34, var35, var28, var4, var20, var36);
               String var21 = O00000000(var23, var24, Math.max(0.0F, var28 - 20.0F));
               float var22 = TextMeasureCache.O00000000(FontRegistry.O00000000, var21, var24).O00000000;
               o0000O00OO0O0.O00000000(var34, var35, Math.max(1.0F, var28), Math.max(1.0F, var4), var20, var20, var20, var20);
               o0000O00OO0O0.O00000000(FontRegistry.O00000000, var34 + (var28 - var22) / 2.0F, var35 + var4 / 2.0F + 3.0F, var24, var21, var37);
               o0000O00OO0O0.O0000000000000();
               O00000OO000O.O00000000().O00000000(var33);
               O00000O0O00O.O00000000(
                  o0000O00OO0O0,
                  this,
                  var33,
                  O00000OO000O.O00000000(),
                  MinecraftAccessor.a_.getWindow().getScaledWidth(),
                  MinecraftAccessor.a_.getWindow().getScaledHeight()
               );
            }
         } else {
            float var7 = 0.0F;
            float var8 = 0.0F;

            for (NotificationsHud.W152 var10 : O00000000O) {
               float var11 = O00000000(var10, var6);
               if (var11 > var7) {
                  var7 = var11;
               }

               var8 += (var4 + var5) * var10.O0000000000OO().O000000000000();
            }

            int var25 = MinecraftAccessor.a_.getWindow().getFramebufferWidth();
            int var27 = MinecraftAccessor.a_.getWindow().getFramebufferHeight();
            float var29 = var27 / 2.0F + 140.0F;
            O00000OO000O.W219 var12 = this.O00000000(var8 > 0.0F ? var8 : var4, var4, var29, var25, var27);
            float var13 = var12.O0000000000;
            this.O00000000(O00000000O0OOO - var7 * 0.5F, var13, var7, Math.max(var4, var12.O000000000000));

            for (int var14 = O00000000O.size() - 1; var14 >= 0; var14--) {
               NotificationsHud.W152 var15 = O00000000O.get(var14);
               boolean var16 = !var15.O0000000000();
               var15.O0000000000OO().O00000000(var16 ? 1.0 : 0.0, 0.24F, O0000O00O0OO0O.O0000000000O0O, false);
               float var17 = var15.O0000000000OO().O000000000000();
               if (!(var17 <= 0.01F)) {
                  float var18 = O00000000(var15, var6);
                  float var19 = O00000000O0OOO - var18 * 0.5F;
                  this.O00000000(o0000O00OO0O0, var19, var13, var18, var4, var17, var15, var6);
                  var13 += (var4 + var5) * var17;
               }
            }

            O00000OO000O.O00000000().O00000000(var12);
            O00000O0O00O.O00000000(
               o0000O00OO0O0,
               this,
               var12,
               O00000OO000O.O00000000(),
               MinecraftAccessor.a_.getWindow().getScaledWidth(),
               MinecraftAccessor.a_.getWindow().getScaledHeight()
            );
         }
      }
   }

   private O00000OO000O.W219 O00000000(float f, float g, float h, int i, int j) {
      if (!Float.isFinite(O00000000O0OOO)) {
         O00000OO000O.W223 var6 = O00000OO000O.O00000000().O000000000000().get("HUD_Notifications");
         if (var6 != null && i > 0) {
            O00000000O0OOO = var6.nx() * i + 110.0F;
         } else {
            O00000000O0OOO = i * 0.5F;
         }
      }

      float var8 = O00000000O0OOO - 110.0F;
      O00000OO000O.W219 var7 = O00000OO000O.O00000000().O00000000("HUD_Notifications", var8, h, 220.0F, f > 0.0F ? f : g);
      O00000000O0OOO = var7.O000000000 + var7.O00000000000 * 0.5F;
      return var7;
   }

   private static float O00000000(NotificationsHud.W152 o00000000, float f) {
      float var2 = TextMeasureCache.O00000000(FontRegistry.O00000000, o00000000.O0000000000000(), f).O00000000;
      return o00000000.O00000000000() ? var2 + 20.0F + 5.0F + 40.0F : var2 + 20.0F + 5.0F + 28.0F;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, NotificationsHud.W152 o00000000, float k) {
      float var9 = this.O000000000O0.O0000000000() * j;
      int var10 = (int)(255.0F * var9);
      int var11 = this.O00000000(var9);
      int var12 = this.O00000000000(var9);
      int var13 = this.O000000000000(var9);
      int var14 = this.O000000000000O(var9);
      float var15 = 14.0F;
      float var16 = 0.8F + 0.2F * j;
      o0000O00OO0O0.O00000000(var16, f + h / 2.0F, g + i / 2.0F);
      boolean var34 = false /* VF: Semaphore variable */;

      try {
         var34 = true;
         this.O00000000(o0000O00OO0O0, f, g, h, i, var15, var9);
         o0000O00OO0O0.O00000000(f, g, Math.max(1.0F, h), Math.max(1.0F, i), var15, var15, var15, var15);

         try {
            if (o00000000.O00000000000()) {
               o00000000.O0000000000OO0().O00000000();
               o00000000.O0000000000OO0().O00000000(o00000000.O000000000000O() ? 1.0 : 0.0, 0.15F, O0000O00O0OO0O.O0000000000O0O, false);
               float var39 = o00000000.O0000000000OO0().O000000000000();
               float var40 = f + 10.0F;
               float var44 = f + h - 10.0F;
               float var48 = Math.max(0.0F, var44 - var40);
               float var52 = Math.min(40.0F, var48);
               float var54 = Math.min(22.0F, Math.max(8.0F, i - 8.0F));
               float var23 = var44 - var52;
               float var24 = g + i / 2.0F - var54 / 2.0F;
               if (var52 >= 8.0F) {
                  if (!this.O0000000000O0() && !this.O0000000000O00()) {
                     if (!this.O00000000(var23, var24, var52, var54, var54 / 2.0F, true, var9, 2)) {
                        o0000O00OO0O0.O00000000(var23, var24, var52, var54, var54 / 2.0F, var11);
                     }
                  } else {
                     this.O000000000(o0000O00OO0O0, var23, var24, var52, var54, var54 / 2.0F, var9);
                  }

                  if (var39 > 0.01F) {
                     float var25 = 3.0F;
                     float var26 = Math.max(1.0F, var52 - var25 * 2.0F);
                     float var27 = Math.max(1.0F, var54 - var25 * 2.0F);
                     float var28 = Math.max(Math.min(var27, var26), var26 * var39);
                     float var29 = var27 / 2.0F;
                     o0000O00OO0O0.O00000000(var23 + var25, var24 + var25, var26, var27, var29, var29, var29, var29);
                     o0000O00OO0O0.O000000000(var23 + var25, var24 + var25, var28, var27, var29, this.O00000000000O(var9), this.O00000000000O0(var9));
                     o0000O00OO0O0.O0000000000000();
                  }

                  float var55 = Math.max(1.0F, Math.min(var54 - 4.0F, var52 - 4.0F) / 2.0F);
                  float var56 = var23 + 2.0F + var55 + Math.max(0.0F, var52 - var54) * var39;
                  float var58 = var24 + var54 / 2.0F;
                  boolean var60 = O00000OO000O.O00000000().O00000000000O0()
                     && O00000000(O00000OO000O.O00000000().O000000000000O(), O00000OO000O.O00000000().O00000000000O(), var23, var24, var52, var54);
                  if (!this.O0000000000O0() && !this.O0000000000O00()) {
                     if (!this.O00000000(var56 - var55, var58 - var55, var55 * 2.0F, var55 * 2.0F, var55, var60, var9, var60 ? 2 : 1)) {
                        o0000O00OO0O0.O000000000(var56, var58, var55, 0.0F, 360.0F, O0000O000OO000.O0000000000(255, 255, 255, var10));
                     }
                  } else {
                     this.O000000000(o0000O00OO0O0, var56 - var55, var58 - var55, var55 * 2.0F, var55 * 2.0F, var55, var9);
                  }
               }

               float var57 = Math.max(0.0F, var23 - 5.0F - var40);
               String var59 = O00000000(o00000000.O0000000000000(), k, var57);
               if (!var59.isEmpty()) {
                  o0000O00OO0O0.O00000000(FontRegistry.O00000000, var40, O00000000(g, i), k, var59, var13);
               }
            } else {
               float var17 = f + 10.0F;
               float var18 = g + i * 0.5F;
               if (o00000000.O00000000()) {
                  float var19 = Math.max(0.65F, (i - 10.0F) / 20.0F);
                  float var20 = 16.0F * var19;
                  float var21 = var17 + (28.0F - var20) * 0.5F;
                  float var22 = var18 - var20 * 0.5F;
                  o0000O00OO0O0.O0000000000();
                  ItemRenderUtil.O00000000(o0000O00OO0O0, o00000000.O00000000000O(), var21, var22, var19, o00000000.O00000000000O0(), false, 0);
               } else if (o00000000.O000000000()) {
                  float var41 = Math.max(14.0F, (i - 10.0F) * 0.62F);
                  float var45 = var17 + (28.0F - var41) * 0.5F;
                  float var49 = var18 - var41 * 0.5F;
                  O00000000(o0000O00OO0O0, o00000000.O00000000000OO(), var45, var49, var41, var9);
               } else {
                  int var42 = O0000O000OO000.O00000000(var14, (int)(O0000O000OO000.O00000000(var14) * j));
                  String var46 = o00000000.O000000000000();
                  float var50 = O00000000(g, i);
                  if (var46.contains("on")) {
                     o0000O00OO0O0.O00000000(FontRegistry.O000000000000, var17, var50, 28.0F, "n", var42);
                  } else if (var46.contains("off")) {
                     o0000O00OO0O0.O00000000(FontRegistry.O000000000000, var17, var50, 28.0F, "l", var42);
                  } else if (var46.contains("warn") || var46.contains("gg")) {
                     o0000O00OO0O0.O00000000(FontRegistry.O0000000000000, var17, var50 - 2.0F, 24.0F, var46.contains("warn") ? "i" : "y", var42);
                  } else if (var46.contains("cfg")) {
                     o0000O00OO0O0.O00000000(FontRegistry.O0000000000, var17, var50 - 2.0F, 22.0F, "G", var42);
                  } else {
                     o0000O00OO0O0.O00000000(FontRegistry.O0000000000, var17, var50, 28.0F, var46, var42);
                  }
               }

               float var43 = var17 + 28.0F + 5.0F;
               float var47 = Math.max(0.0F, f + h - 10.0F - var43);
               String var51 = O00000000(o00000000.O0000000000000(), k, var47);
               int var53 = Math.min(o00000000.O0000000000O(), var51.length());
               O00000000(o0000O00OO0O0, var43, O00000000(g, i), k, var51, var13, var53, o00000000.O0000000000O0(), var9);
            }
         } finally {
            o0000O00OO0O0.O0000000000000();
         }

         var34 = false;
      } finally {
         if (var34) {
            o0000O00OO0O0.O00000000000O();
         }
      }

      o0000O00OO0O0.O00000000000O();
   }

   private static float O00000000(float f, float g) {
      return f + g * 0.5F + 5.0F;
   }

   private static void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, String string, int i, int j, int k, float l) {
      if (string != null && !string.isEmpty()) {
         if (k != 0 && j > 0 && j < string.length()) {
            String var9 = string.substring(0, j);
            String var10 = string.substring(j);
            if (!var9.isEmpty()) {
               o0000O00OO0O0.O00000000(FontRegistry.O00000000, f, g, h, var9, i);
            }

            float var11 = var9.isEmpty() ? 0.0F : TextMeasureCache.O00000000(FontRegistry.O00000000, var9, h).O00000000;
            int var12 = O0000O000OO000.O00000000(k, Math.round(O0000O000OO000.O00000000(k) * l));
            if (!var10.isEmpty()) {
               o0000O00OO0O0.O00000000(FontRegistry.O00000000, f + var11, g, h, var10, var12);
            }
         } else {
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, f, g, h, string, i);
         }
      }
   }

   private static String O00000000(String string, float f, float g) {
      if (string != null && !string.isEmpty() && !(g <= 1.0F)) {
         if (TextMeasureCache.O00000000(FontRegistry.O00000000, string, f).O00000000 <= g) {
            return string;
         } else {
            String var3 = "...";
            if (TextMeasureCache.O00000000(FontRegistry.O00000000, var3, f).O00000000 > g) {
               return "";
            } else {
               for (int var4 = string.length(); var4 > 0; var4--) {
                  String var5 = string.substring(0, var4).trim() + var3;
                  if (TextMeasureCache.O00000000(FontRegistry.O00000000, var5, f).O00000000 <= g) {
                     return var5;
                  }
               }

               return var3;
            }
         }
      } else {
         return "";
      }
   }

   private static boolean O00000000(float f, float g, float h, float i, float j, float k) {
      return f >= h && f <= h + j && g >= i && g <= i + k;
   }

   private static void O0000000000OOO() {
      HashSet var0 = new HashSet();

      for (StatusEffectInstance var2 : MinecraftAccessor.a_.player.getStatusEffects()) {
         if (!Removals.O00000000(var2.getEffectType())) {
            String var3 = var2.getEffectType().getIdAsString();
            var0.add(var3);
            NotificationsHud.W153 var4 = O00000000O0.computeIfAbsent(var3, string -> new NotificationsHud.W153());
            var4.O00000000 = O000000000000(I18n.translate(var2.getTranslationKey(), new Object[0]));
            if (var2.isInfinite()) {
               var4.O00000000();
            } else {
               int var5 = Math.max(0, (int)Math.ceil(var2.getDuration() / 20.0));
               O00000000(var3, var4.O00000000, var5, var4);
            }
         }
      }

      Iterator var6 = O00000000O0.entrySet().iterator();

      while (var6.hasNext()) {
         Entry var7 = (Entry)var6.next();
         if (!var0.contains(var7.getKey())) {
            String var8 = ((NotificationsHud.W153)var7.getValue()).O00000000;
            if (var8 != null && !var8.isEmpty()) {
               O000000000((String)var7.getKey(), var8);
            }

            var6.remove();
         }
      }
   }

   private static void O00000000(String string, String string2, int i, NotificationsHud.W153 o000000000) {
      if (i > 5) {
         o000000000.O00000000();
      } else {
         if (i >= 1 && !o000000000.O000000000) {
            o000000000.O000000000 = true;
            O00000000(string, string2);
         }
      }
   }

   private static void O000000000O() {
      for (int var0 = 0; var0 < O00000000O0O.length; var0++) {
         ItemStack var1 = MinecraftAccessor.a_.player.getEquippedStack(O00000000O0O[var0]);
         if (var1 != null && !var1.isEmpty() && var1.isDamageable()) {
            if (O00000000O0O00[var0] != var1.getItem()) {
               O00000000O0O00[var0] = var1.getItem();
               O00000000O0O0[var0] = 100;
            }

            int var2 = var1.getMaxDamage();
            if (var2 > 0) {
               int var3 = var2 - var1.getDamage();
               int var4 = (int)Math.floor(var3 * 100.0 / var2);
               if (var4 > 30) {
                  O00000000O0O0[var0] = 100;
               } else {
                  int var5 = var4 <= 10 ? 10 : (var4 <= 20 ? 20 : 30);
                  if (var5 < O00000000O0O0[var0]) {
                     O00000000O0O0[var0] = var5;
                     O00000000(var1, var4);
                  }
               }
            }
         } else {
            O00000000O0O0[var0] = 100;
            O00000000O0O00[var0] = null;
         }
      }
   }

   private static void O000000000O0() {
      for (int var0 = 0; var0 < O00000000O0O0.length; var0++) {
         O00000000O0O0[var0] = 100;
         O00000000O0O00[var0] = null;
      }
   }

   private static void O000000000O00() {
      float var0 = MinecraftAccessor.a_.player.getHealth() + MinecraftAccessor.a_.player.getAbsorptionAmount();
      if (var0 <= 8.0F && var0 > 0.0F && !O00000000OO) {
         if (O00000000000("Низкое HP")) {
            O00000000O.add(new NotificationsHud.W152(O00000000O0OO0, "Низкое HP » " + String.format("%.1f", var0), 2500L));
         }

         O00000000OO = true;
      } else {
         if (var0 > 10.0F) {
            O00000000OO = false;
         }
      }
   }

   private static String O000000000000(String string) {
      return string != null && !string.isEmpty() ? string.replaceAll("(?i)\\u0412?\\u00A7[0-9A-FK-OR]", "").replace("§", "").replace(' ', ' ').trim() : "";
   }

   private static int O0000000000000(String string) {
      if (string != null && !string.isEmpty()) {
         Integer var1 = null;

         for (int var2 = 0; var2 < string.length(); var2++) {
            char var3 = string.charAt(var2);
            if (var3 == 167 || var3 == '&') {
               if (var2 + 1 >= string.length()) {
                  break;
               }

               if ((string.charAt(var2 + 1) == 'x' || string.charAt(var2 + 1) == 'X') && var2 + 13 < string.length()) {
                  Integer var6 = O00000000(string, var2 + 2);
                  if (var6 != null) {
                     var1 = var6;
                  }

                  var2 += 13;
               } else {
                  Formatting var4 = Formatting.byCode(string.charAt(var2 + 1));
                  if (var4 != null) {
                     if (var4 == Formatting.RESET) {
                        var1 = null;
                     } else {
                        Integer var5 = var4.getColorValue();
                        if (var5 != null) {
                           var1 = 0xFF000000 | var5;
                        }
                     }
                  }
               }
            }
         }

         return var1 == null ? 0 : var1;
      } else {
         return 0;
      }
   }

   private static Integer O00000000(String string, int i) {
      int var2 = 0;
      int var3 = 0;

      for (int var4 = i; var4 < string.length() && var3 < 6; var4++) {
         char var5 = string.charAt(var4);
         if (var5 == 167 || var5 == '&') {
            if (++var4 >= string.length()) {
               return null;
            }

            var5 = string.charAt(var4);
         }

         int var6 = O00000000(var5);
         if (var6 < 0) {
            return null;
         }

         var2 = var2 << 4 | var6;
         var3++;
      }

      return var3 == 6 ? 0xFF000000 | var2 : null;
   }

   private static int O00000000(char c) {
      if (c >= '0' && c <= '9') {
         return c - 48;
      } else if (c >= 'a' && c <= 'f') {
         return c - 97 + 10;
      } else {
         return c >= 65 && c <= 70 ? c - 65 + 10 : -1;
      }
   }

   private static Identifier O000000000000O(String string) {
      if (string != null && !string.isEmpty()) {
         int var1 = string.indexOf(58);
         String var2 = var1 > 0 ? string.substring(0, var1) : "minecraft";
         String var3 = var1 > 0 && var1 + 1 < string.length() ? string.substring(var1 + 1) : string;
         return Identifier.of(var2, "textures/mob_effect/" + var3 + ".png");
      } else {
         return Identifier.of("minecraft", "textures/mob_effect/strength.png");
      }
   }

   private static void O00000000(RenderManager o0000O00OO0O0, Identifier identifier, float f, float g, float h, float i) {
      if (o0000O00OO0O0 != null && identifier != null && MinecraftAccessor.a_ != null && MinecraftAccessor.a_.getTextureManager() != null) {
         AbstractTexture var6 = MinecraftAccessor.a_.getTextureManager().getTexture(identifier);
         if (var6 != null && var6.getGlTexture() instanceof GlTexture var7 && var7.getGlId() > 0) {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O000000000000(i);
            o0000O00OO0O0.O00000000(var7.getGlId(), f, g, h, h, 0.0F, 0.0F, 1.0F, 1.0F);
            o0000O00OO0O0.O00000000000OO();
         }
      }
   }

   public static class W152 {
      private boolean O00000000;
      private String O000000000;
      private String O0000000000;
      private boolean O00000000000;
      private ItemStack O000000000000;
      private int O0000000000000;
      private Identifier O000000000000O;
      int O00000000000O;
      int O00000000000O0;
      private long O00000000000OO;
      private long O0000000000O;
      private O0000O00O0OO O0000000000O0 = new O0000O00O0OO();
      private O0000O00O0OO O0000000000O00 = new O0000O00O0OO();

      public W152(String string, String string2, long l) {
         this.O00000000 = false;
         this.O000000000 = string;
         this.O0000000000 = string2;
         this.O0000000000O = l;
         this.O00000000000OO = System.currentTimeMillis();
      }

      public W152(ItemStack itemStack, String string, int i, int j, long l) {
         this.O00000000 = false;
         this.O000000000000 = itemStack;
         this.O0000000000000 = itemStack.hashCode();
         this.O0000000000 = string;
         this.O00000000000O = i;
         this.O00000000000O0 = j;
         this.O0000000000O = l;
         this.O00000000000OO = System.currentTimeMillis();
      }

      public W152(Identifier identifier, String string, long l) {
         this.O00000000 = false;
         this.O000000000000O = identifier;
         this.O0000000000 = string;
         this.O0000000000O = l;
         this.O00000000000OO = System.currentTimeMillis();
      }

      public boolean O00000000() {
         return this.O000000000000 != null && !this.O000000000000.isEmpty();
      }

      public boolean O000000000() {
         return this.O000000000000O != null;
      }

      public W152(String string, boolean bl, long l) {
         this.O00000000 = true;
         this.O0000000000 = string;
         this.O00000000000 = bl;
         this.O0000000000O = l;
         this.O00000000000OO = System.currentTimeMillis();
         this.O0000000000O00.O0000000000000(bl ? 1.0 : 0.0);
      }

      public boolean O0000000000() {
         return System.currentTimeMillis() - this.O00000000000OO > this.O0000000000O;
      }

      @Generated
      public boolean O00000000000() {
         return this.O00000000;
      }

      @Generated
      public String O000000000000() {
         return this.O000000000;
      }

      @Generated
      public String O0000000000000() {
         return this.O0000000000;
      }

      @Generated
      public boolean O000000000000O() {
         return this.O00000000000;
      }

      @Generated
      public ItemStack O00000000000O() {
         return this.O000000000000;
      }

      @Generated
      public int O00000000000O0() {
         return this.O0000000000000;
      }

      @Generated
      public Identifier O00000000000OO() {
         return this.O000000000000O;
      }

      @Generated
      public int O0000000000O() {
         return this.O00000000000O;
      }

      @Generated
      public int O0000000000O0() {
         return this.O00000000000O0;
      }

      @Generated
      public long O0000000000O00() {
         return this.O00000000000OO;
      }

      @Generated
      public long O0000000000O0O() {
         return this.O0000000000O;
      }

      @Generated
      public O0000O00O0OO O0000000000OO() {
         return this.O0000000000O0;
      }

      @Generated
      public O0000O00O0OO O0000000000OO0() {
         return this.O0000000000O00;
      }

      @Generated
      public void O00000000(boolean bl) {
         this.O00000000 = bl;
      }

      @Generated
      public void O00000000(String string) {
         this.O000000000 = string;
      }

      @Generated
      public void O000000000(String string) {
         this.O0000000000 = string;
      }

      @Generated
      public void O000000000(boolean bl) {
         this.O00000000000 = bl;
      }

      @Generated
      public void O00000000(ItemStack itemStack) {
         this.O000000000000 = itemStack;
      }

      @Generated
      public void O00000000(int i) {
         this.O0000000000000 = i;
      }

      @Generated
      public void O00000000(Identifier identifier) {
         this.O000000000000O = identifier;
      }

      @Generated
      public void O000000000(int i) {
         this.O00000000000O = i;
      }

      @Generated
      public void O0000000000(int i) {
         this.O00000000000O0 = i;
      }

      @Generated
      public void O00000000(long l) {
         this.O00000000000OO = l;
      }

      @Generated
      public void O000000000(long l) {
         this.O0000000000O = l;
      }

      @Generated
      public void O00000000(O0000O00O0OO o0000O00O0OO) {
         this.O0000000000O0 = o0000O00O0OO;
      }

      @Generated
      public void O000000000(O0000O00O0OO o0000O00O0OO) {
         this.O0000000000O00 = o0000O00O0OO;
      }

      @Generated
      @Override
      public boolean equals(Object object) {
         if (object == this) {
            return true;
         } else if (!(object instanceof NotificationsHud.W152 var2)) {
            return false;
         } else if (!var2.O00000000(this)) {
            return false;
         } else if (this.O00000000000() != var2.O00000000000()) {
            return false;
         } else if (this.O000000000000O() != var2.O000000000000O()) {
            return false;
         } else if (this.O00000000000O0() != var2.O00000000000O0()) {
            return false;
         } else if (this.O0000000000O() != var2.O0000000000O()) {
            return false;
         } else if (this.O0000000000O0() != var2.O0000000000O0()) {
            return false;
         } else if (this.O0000000000O00() != var2.O0000000000O00()) {
            return false;
         } else if (this.O0000000000O0O() != var2.O0000000000O0O()) {
            return false;
         } else {
            String var3 = this.O000000000000();
            String var4 = var2.O000000000000();
            if (var3 == null) {
               if (var4 != null) {
                  return false;
               }
            } else if (!var3.equals(var4)) {
               return false;
            }

            String var5 = this.O0000000000000();
            String var6 = var2.O0000000000000();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               ItemStack var7 = this.O00000000000O();
               ItemStack var8 = var2.O00000000000O();
               if (var7 == null ? var8 == null : var7.equals(var8)) {
                  Identifier var9 = this.O00000000000OO();
                  Identifier var10 = var2.O00000000000OO();
                  if (var9 == null ? var10 == null : var9.equals(var10)) {
                     O0000O00O0OO var11 = this.O0000000000OO();
                     O0000O00O0OO var12 = var2.O0000000000OO();
                     if (var11 == null ? var12 == null : var11.equals(var12)) {
                        O0000O00O0OO var13 = this.O0000000000OO0();
                        O0000O00O0OO var14 = var2.O0000000000OO0();
                        return var13 == null ? var14 == null : var13.equals(var14);
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      }

      @Generated
      protected boolean O00000000(Object object) {
         return object instanceof NotificationsHud.W152;
      }

      @Generated
      @Override
      public int hashCode() {
         byte var1 = 59;
         int var2 = 1;
         var2 = var2 * 59 + (this.O00000000000() ? 79 : 97);
         var2 = var2 * 59 + (this.O000000000000O() ? 79 : 97);
         var2 = var2 * 59 + this.O00000000000O0();
         var2 = var2 * 59 + this.O0000000000O();
         var2 = var2 * 59 + this.O0000000000O0();
         long var3 = this.O0000000000O00();
         var2 = var2 * 59 + (int)(var3 >>> 32 ^ var3);
         long var5 = this.O0000000000O0O();
         var2 = var2 * 59 + (int)(var5 >>> 32 ^ var5);
         String var7 = this.O000000000000();
         var2 = var2 * 59 + (var7 == null ? 43 : var7.hashCode());
         String var8 = this.O0000000000000();
         var2 = var2 * 59 + (var8 == null ? 43 : var8.hashCode());
         ItemStack var9 = this.O00000000000O();
         var2 = var2 * 59 + (var9 == null ? 43 : var9.hashCode());
         Identifier var10 = this.O00000000000OO();
         var2 = var2 * 59 + (var10 == null ? 43 : var10.hashCode());
         O0000O00O0OO var11 = this.O0000000000OO();
         var2 = var2 * 59 + (var11 == null ? 43 : var11.hashCode());
         O0000O00O0OO var12 = this.O0000000000OO0();
         return var2 * 59 + (var12 == null ? 43 : var12.hashCode());
      }

      @Generated
      @Override
      public String toString() {
         return "NotificationsHUD.Notification(isToggle="
            + this.O00000000000()
            + ", icon="
            + this.O000000000000()
            + ", text="
            + this.O0000000000000()
            + ", toggleState="
            + this.O000000000000O()
            + ", itemStack="
            + this.O00000000000O()
            + ", itemSeed="
            + this.O00000000000O0()
            + ", textureIconId="
            + this.O00000000000OO()
            + ", highlightStart="
            + this.O0000000000O()
            + ", highlightColor="
            + this.O0000000000O0()
            + ", createTime="
            + this.O0000000000O00()
            + ", duration="
            + this.O0000000000O0O()
            + ", animation="
            + this.O0000000000OO()
            + ", toggleAnim="
            + this.O0000000000OO0()
            + ")";
      }
   }

   static final class W153 {
      String O00000000 = "";
      boolean O000000000;

      void O00000000() {
         this.O000000000 = false;
      }
   }
}
