package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

@O0000000OOO0(
   O00000000 = "ServerHelper",
   O000000000 = "w"
)
public final class ServerHelperHud extends HudElement {
   private static final ServerHelperHud O00000000 = new ServerHelperHud();
   private static final MinecraftClient O000000000OO0 = MinecraftClient.getInstance();
   private static final O0000O00O0OO O000000000OO00 = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OO0O = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OOO = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OOO0 = new O0000O00O0OO();
   private static final Map<String, O0000O00O0OO> O000000000OOOO = new HashMap<>();
   static final Map<Item, ItemStack> O00000000O = new HashMap<>();
   private static boolean O00000000O0;
   private final BooleanSetting O00000000O00 = new BooleanSetting("Отображать бинды", true);
   private final List<ServerHelperHud.W159> O00000000O000 = new ArrayList<>(12);
   private final List<ServerHelperHud.W159> O00000000O0000 = new ArrayList<>(12);
   private final List<ServerHelperHud.W158> O00000000O000O = new ArrayList<>(12);

   private ServerHelperHud() {
      this.O00000000(this.O00000000O00);
      ru.metaculture.protection.O000000000O0O0.O00000000(this);
   }

   private void O00000000(List<ServerHelperHud.W159> list, Item item, int i) {
      this.O00000000(list, item.getTranslationKey(), item, itemStack -> itemStack.isOf(item), i);
   }

   private void O00000000(List<ServerHelperHud.W159> list, String string, Item item, Predicate<ItemStack> predicate, int i) {
      boolean var6 = i != -1 && i != 0;
      String var7 = "";
      if (var6) {
         String var8 = i > 0 ? InputUtil.fromKeyCode(i, -1).getTranslationKey() : "";
         var7 = ServerHelper.O000000000O.O00000000(i, var8);
      }

      list.add(new ServerHelperHud.W159(string, item, predicate, var7, var6));
   }

   private List<ServerHelperHud.W159> O0000000000OO0() {
      this.O00000000O000.clear();
      List var1 = this.O00000000O000;
      ServerHelper var2 = ServerHelper.O000000000O;
      if (var2 == null) {
         return var1;
      } else {
         if (var2.O000000000O0.O000000000("FunTime")) {
            this.O00000000(
               var1, "ft_disorientation", Items.ENDER_EYE, var2.O00000000(O000000OOOO00::O000000000OO0, "Дезориентация"), var2.O000000000O00O.O0000000000()
            );
            this.O00000000(var1, "ft_light_dust", Items.SUGAR, var2.O00000000(O000000OOOO00::O000000000OO, "Явная пыль"), var2.O000000000O0O.O0000000000());
            this.O00000000(var1, "ft_trap", Items.NETHERITE_SCRAP, var2.O00000000(O000000OOOO00::O000000000OO00, "Трапка"), var2.O000000000OO.O0000000000());
            this.O00000000(
               var1,
               "ft_freezing_snowball",
               Items.SNOWBALL,
               var2.O00000000(O000000OOOO00::O00000000O0OO0, "Снежок заморозка"),
               var2.O000000000OO0.O0000000000()
            );
            this.O00000000(
               var1, "ft_gods_aura", Items.PHANTOM_MEMBRANE, var2.O00000000(O000000OOOO00::O00000000O0OOO, "Божья аура"), var2.O000000000O0O0.O0000000000()
            );
            this.O00000000(var1, "ft_plast", Items.DRIED_KELP, var2.O00000000(O000000OOOO00::O000000000OOO, "Пласт"), var2.O000000000O0OO.O0000000000());
            this.O00000000(
               var1,
               "ft_potion_assassin",
               Items.SPLASH_POTION,
               var2.O00000000(O000000OOOO00::O000000000O0, "Зелье Ассасина"),
               var2.O000000000OO00.O0000000000()
            );
            this.O00000000(
               var1,
               "ft_potion_paladin",
               Items.SPLASH_POTION,
               var2.O00000000(O000000OOOO00::O000000000O0O, "Зелье Паладина", "Зелье Палладина"),
               var2.O000000000OO0O.O0000000000()
            );
            this.O00000000(
               var1, "ft_potion_sleep", Items.SPLASH_POTION, var2.O00000000(O000000OOOO00::O000000000O0OO, "Снотворное"), var2.O000000000OOO.O0000000000()
            );
            this.O00000000(
               var1, "ft_potion_wrath", Items.SPLASH_POTION, var2.O00000000(O000000OOOO00::O000000000O00, "Зелье Гнева"), var2.O000000000OOO0.O0000000000()
            );
            this.O00000000(
               var1,
               "ft_potion_holy_water",
               Items.SPLASH_POTION,
               var2.O00000000(O000000OOOO00::O000000000O00O, "Святая вода"),
               var2.O000000000OOOO.O0000000000()
            );
            this.O00000000(
               var1, "ft_potion_radiation", Items.SPLASH_POTION, var2.O00000000(O000000OOOO00::O000000000O0O0, "Зелье Радиации"), var2.O00000000O.O0000000000()
            );
            this.O00000000(
               var1, "ft_potion_hlopushka", Items.SPLASH_POTION, var2.O00000000(O000000OOOO00::O000000000O000, "Хлопушка"), var2.O00000000O0.O0000000000()
            );
         } else if (var2.O000000000O0.O000000000("HolyWorld")) {
            this.O00000000(var1, "hw_trap", Items.POPPED_CHORUS_FRUIT, O000000OOOO000::O00000000, var2.O00000000O00.O0000000000());
            this.O00000000(var1, "hw_freezing_snowball", Items.SNOWBALL, O000000OOOO000::O000000000, var2.O00000000O000.O0000000000());
            this.O00000000(var1, "hw_stan", Items.NETHER_STAR, O000000OOOO000::O0000000000, var2.O00000000O0000.O0000000000());
            this.O00000000(var1, "hw_explosive_trap", Items.PRISMARINE_SHARD, O000000OOOO000::O00000000000, var2.O00000000O000O.O0000000000());
         }

         this.O00000000(
            var1, "utility_shulker", Items.SHULKER_BOX, itemStack -> itemStack.getItem().toString().contains("shulker_box"), var2.O00000000O00O.O0000000000()
         );
         this.O00000000(var1, Items.WIND_CHARGE, var2.O00000000O00O0.O0000000000());
         this.O00000000(var1, Items.CHORUS_FRUIT, var2.O00000000O0O0.O0000000000());
         return var1;
      }
   }

   public static ServerHelperHud O000000000() {
      return O00000000;
   }

   public static void O00000000(RenderManager o0000O00OO0O0, DrawContext drawContext) {
      O00000000.O000000000(o0000O00OO0O0, drawContext);
   }

   private void O000000000(RenderManager o0000O00OO0O0, DrawContext drawContext) {
      if (O000000000OO0.player != null) {
         List var3 = this.O0000000000OO0();
         this.O00000000O0000.clear();
         List var4 = this.O00000000O0000;

         for (ServerHelperHud.W159 var6 : (List<ServerHelperHud.W159>)var3) {
            O0000O00O0OO var7 = O000000000OOOO.computeIfAbsent(var6.O00000000, string -> new O0000O00O0OO());
            var7.O00000000();
            var7.O00000000(var6.O000000000000 ? 1.0 : 0.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
            if (var7.O000000000000() > 0.001F || var6.O000000000000) {
               var4.add(var6);
            }
         }

         boolean var64 = O000000000OO0.currentScreen instanceof ChatScreen;
         boolean var65 = !var4.isEmpty() || var64;
         O000000000OO00.O00000000();
         O000000000OO0O.O00000000();
         O000000000OO00.O00000000(var65 ? 1.0 : 0.0, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
         if (var65) {
            if (!O00000000O0) {
               O000000000OO0O.O0000000000000(-10.0);
            }

            O000000000OO0O.O00000000(0.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
         } else {
            if (O00000000O0) {
               O000000000OO0O.O0000000000000(0.0);
            }

            O000000000OO0O.O00000000(10.0, 0.2F, O0000O00O0OO0O.O0000000000O0O, false);
         }

         O00000000O0 = var65;
         float var66 = O000000000OO00.O000000000000();
         if (!(var66 <= 0.01F)) {
            float var8 = 7.0F;
            float var9 = 46.0F;
            float var10 = 5.0F;
            float var11 = 0.0F;
            boolean var12 = true;

            for (ServerHelperHud.W159 var14 : (List<ServerHelperHud.W159>)var4) {
               float var15 = O000000000OOOO.get(var14.O00000000).O000000000000();
               if (!(var15 <= 0.01F)) {
                  if (!var12) {
                     var11 += var10 * var15;
                  }

                  var11 += var9 * var15;
                  var12 = false;
               }
            }

            if (var4.isEmpty()) {
               var11 = var9;
            }

            float var68 = var11 + var8 * 2.0F;
            float var69 = var9 + var8 * 2.0F;
            O000000000OOO.O00000000();
            O000000000OOO0.O00000000();
            O000000000OOO.O00000000(var68, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
            O000000000OOO0.O00000000(var69, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
            float var70 = O000000000OOO.O000000000000();
            float var16 = O000000000OOO0.O000000000000();
            float var17 = O000000000OO0.getWindow().getFramebufferWidth();
            float var18 = O000000000OO0.getWindow().getFramebufferHeight();
            float var19 = (var17 - var70) / 2.0F;
            float var20 = var18 - var16 - 60.0F;
            O00000OO000O.W219 var21 = O00000OO000O.O00000000().O00000000("HUD_ServerHelper", var19, var20, var70, var16);
            float var22 = var21.O000000000 + O000000000OO0O.O000000000000();
            float var23 = var21.O0000000000;
            float var24 = var21.O00000000000;
            float var25 = var21.O000000000000;
            this.O00000000(var22, var23, var24, var25);
            float var26 = var24 / Math.max(1.0F, var70);
            float var27 = var25 / Math.max(1.0F, var16);
            float var28 = Math.min(var26, var27);
            float var29 = var9 * var28;
            float var30 = var10 * var26;
            float var31 = var11 * var26;
            float var32 = var66 * this.O000000000O0.O0000000000();
            float var33 = this.O00000000000OO(var32);
            int var34 = this.O00000000(var32);
            int var35 = this.O00000000000(var32);
            boolean var36 = this.O0000000000O();
            float var37 = 14.0F;
            this.O00000000(o0000O00OO0O0, var22, var23, var24, var25, var37, var32);
            o0000O00OO0O0.O00000000(var22, var23, var24, var25, var37, var37, var37, var37);
            float var38 = var23 + (var25 - var29) / 2.0F;
            float var39 = var22 + (var24 - var31) / 2.0F;
            this.O00000000O000O.clear();
            var12 = true;

            for (ServerHelperHud.W159 var41 : (List<ServerHelperHud.W159>)var4) {
               float var42 = O000000000OOOO.get(var41.O00000000).O000000000000();
               if (!(var42 <= 0.01F)) {
                  if (!var12) {
                     var39 += var30 * var42;
                  }

                  var12 = false;
                  int var44 = (int)(255.0F * var32 * var42);
                  int var45 = this.O00000000000OO() ? O0000O000OO000.O0000000000(255, 255, 255, (int)(5.0F * var33 * var42)) : this.O000000000(var33 * var42);
                  float var46 = (1.0F - var42) * 8.0F * var27;
                  float var47 = var38 + var46;
                  if (!var36 && !this.O0000000000O0() && !this.O0000000000O00()) {
                     o0000O00OO0O0.O00000000(var39, var47, var29, var29, 6.0F * var28, var45);
                  } else {
                     this.O000000000(o0000O00OO0O0, var39, var47, var29, var29, 6.0F * var28, var32 * var42);
                  }

                  int var48 = this.O00000000(var41);
                  ItemStack var49 = this.O000000000(var41);
                  if (this.O00000000O00.O0000000000()) {
                     int var50 = this.O0000000000000(var32 * var42);
                     o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var39 + 4.0F * var26, var47 + 12.0F * var27, 16.0F * var28, var41.O00000000000, var50);
                  }

                  float var78 = 1.3F * var28;
                  float var51 = 16.0F * var78;
                  float var52 = var39 + (var29 - var51) / 2.0F;
                  float var53 = var47 + (var29 - var51) / 2.0F;
                  String var54 = String.valueOf(var48);
                  int var55 = var48 > 0 ? O0000O000OO000.O0000000000(200, 200, 200, var44) : O0000O000OO000.O0000000000(255, 60, 60, var44);
                  float var56 = (this.O00000000O00.O0000000000() ? 18.0F : 23.0F) * var28;
                  float var57 = TextMeasureCache.O00000000(FontRegistry.O00000000000, var54, var56).O00000000;
                  float var58 = this.O00000000O00.O0000000000() ? 4.0F : 5.0F;
                  long var59 = CooldownsHud.O00000000(var41.O000000000);
                  String var61 = var59 > 0L ? O00000000(var59) : "";
                  float var62 = O00000000(var61, 20.0F * var28, var29 - 6.0F * var26, var28);
                  float var63 = var61.isEmpty() ? 0.0F : TextMeasureCache.O000000000(FontRegistry.O00000000000, var61, var62);
                  this.O00000000O000O
                     .add(
                        new ServerHelperHud.W158(
                           var49,
                           var39,
                           var47,
                           var29,
                           6.0F * var28,
                           var52,
                           var53,
                           var78,
                           var32 * var42,
                           var39 + var29 - var57 - 4.0F * var26,
                           var47 + var29 - var58 * var27,
                           var56,
                           var54,
                           var55,
                           var61,
                           var39 + (var29 - var63) * 0.5F,
                           var47 + var29 * 0.5F + 5.0F * var28,
                           var62,
                           O0000O000OO000.O00000000(this.O000000000000O(var32 * var42), var44)
                        )
                     );
                  var39 += var29 * var42;
               }
            }

            o0000O00OO0O0.O0000000000();

            for (int var71 = 0; var71 < this.O00000000O000O.size(); var71++) {
               ServerHelperHud.W158 var74 = this.O00000000O000O.get(var71);
               if (var74.alpha >= 0.35F) {
                  ItemRenderUtil.O00000000(o0000O00OO0O0, var74.stack, var74.itemX, var74.itemY, var74.itemScale, var71, false, 0);
               }
            }

            o0000O00OO0O0.O0000000000();

            for (ServerHelperHud.W158 var75 : this.O00000000O000O) {
               if (var75.hasCooldown()) {
                  o0000O00OO0O0.O0000000000(var75.slotX, var75.slotY, var75.slotSize, var75.slotSize, 8.0F * var75.itemScale);
                  o0000O00OO0O0.O000000000(var75.slotX, var75.slotY, var75.slotSize, var75.slotSize, var75.slotRadius, var75.alpha);
                  o0000O00OO0O0.O00000000(
                     var75.slotX,
                     var75.slotY,
                     var75.slotSize,
                     var75.slotSize,
                     var75.slotRadius,
                     O0000O000OO000.O0000000000(0, 0, 0, (int)(116.0F * var75.alpha))
                  );
               }
            }

            for (ServerHelperHud.W158 var76 : this.O00000000O000O) {
               if (var76.hasCooldown()) {
                  int var77 = O0000O000OO000.O0000000000(0, 0, 0, (int)(130.0F * var76.alpha));
                  o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var76.cooldownX + 1.0F, var76.cooldownY + 1.0F, var76.cooldownFont, var76.cooldown, var77);
                  o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var76.cooldownX, var76.cooldownY, var76.cooldownFont, var76.cooldown, var76.cooldownColor);
               } else {
                  o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var76.countX, var76.countY, var76.countFont, var76.count, var76.countColor);
               }
            }

            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
            O00000OO000O.O00000000().O00000000(var21);
            O00000O0O00O.O00000000(
               o0000O00OO0O0, this, var21, O00000OO000O.O00000000(), O000000000OO0.getWindow().getScaledWidth(), O000000000OO0.getWindow().getScaledHeight()
            );
         }
      }
   }

   private int O00000000(ServerHelperHud.W159 o000000000) {
      if (O000000000OO0.player == null) {
         return 0;
      } else {
         int var2 = 0;

         for (int var3 = 0; var3 < O000000000OO0.player.getInventory().size(); var3++) {
            ItemStack var4 = O000000000OO0.player.getInventory().getStack(var3);
            if (!var4.isEmpty() && o000000000.O00000000(var4)) {
               var2 += var4.getCount();
            }
         }

         return var2;
      }
   }

   private ItemStack O000000000(ServerHelperHud.W159 o000000000) {
      if (o000000000.O00000000.startsWith("ft_potion_")) {
         return o000000000.O0000000000000;
      } else {
         if (O000000000OO0.player != null) {
            for (int var2 = 0; var2 < O000000000OO0.player.getInventory().size(); var2++) {
               ItemStack var3 = O000000000OO0.player.getInventory().getStack(var2);
               if (!var3.isEmpty() && o000000000.O00000000(var3)) {
                  return var3;
               }
            }
         }

         return o000000000.O0000000000000;
      }
   }

   private static String O00000000(long l) {
      int var2 = Math.max(1, (int)Math.ceil(l / 1000.0));
      return var2 + "сек";
   }

   private static float O00000000(String string, float f, float g, float h) {
      if (string != null && !string.isEmpty()) {
         float var4 = TextMeasureCache.O000000000(FontRegistry.O00000000000, string, f);
         return var4 <= g ? f : Math.max(12.0F * h, f * g / Math.max(1.0F, var4));
      } else {
         return f;
      }
   }

   record W158(
      ItemStack stack,
      float slotX,
      float slotY,
      float slotSize,
      float slotRadius,
      float itemX,
      float itemY,
      float itemScale,
      float alpha,
      float countX,
      float countY,
      float countFont,
      String count,
      int countColor,
      String cooldown,
      float cooldownX,
      float cooldownY,
      float cooldownFont,
      int cooldownColor
   ) {

      boolean hasCooldown() {
         return this.cooldown != null && !this.cooldown.isEmpty();
      }
   }

   static class W159 {
      final String O00000000;
      final Item O000000000;
      final Predicate<ItemStack> O0000000000;
      final String O00000000000;
      final boolean O000000000000;
      final ItemStack O0000000000000;

      W159(String string, Item item, Predicate<ItemStack> predicate, String string2, boolean bl) {
         this.O00000000 = string;
         this.O000000000 = item;
         this.O0000000000 = predicate;
         this.O00000000000 = string2;
         this.O000000000000 = bl;
         this.O0000000000000 = ServerHelperHud.O00000000O.computeIfAbsent(item, ItemStack::new);
      }

      boolean O00000000(ItemStack itemStack) {
         try {
            return this.O0000000000.test(itemStack);
         } catch (Throwable var3) {
            return false;
         }
      }
   }
}
