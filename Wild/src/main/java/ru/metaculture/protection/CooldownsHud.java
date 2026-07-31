package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.CooldownUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import org.wild.mixin.acceser.ItemCooldownManagerAccessor;
import org.wild.mixin.acceser.ItemCooldownManagerEntryAccessor;

@O0000000OOO0(
   O00000000 = "CoolDownsHUD",
   O000000000 = "i"
)
public final class CooldownsHud extends HudElement {
   private static final CooldownsHud O00000000 = new CooldownsHud();
   private static final Map<Item, CooldownsHud.W143> O000000000OO0 = new ConcurrentHashMap<>();
   private static final List<CooldownsHud.W143> O000000000OO00 = new ArrayList<>(16);
   private static final List<CooldownsHud.W144> O000000000OO0O = new ArrayList<>(16);
   private static final O0000O00O0OO O000000000OOO = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OOO0 = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OOOO = new O0000O00O0OO();
   private final BooleanSetting O00000000O = new BooleanSetting("Показывать верхушку", true);
   private final BooleanSetting O00000000O0 = new BooleanSetting("Показывать иконки", true);

   private CooldownsHud() {
      this.O00000000(this.O00000000O);
      this.O00000000(this.O00000000O0);
      ru.metaculture.protection.O000000000O0O0.O00000000(this);
   }

   public static CooldownsHud O000000000() {
      return O00000000;
   }

   public static long O00000000(Item item) {
      return item == null ? 0L : O00000000(new ItemStack(item));
   }

   public static void O00000000(O0000000O000OO o0000000O000OO) {
      if (o0000000O000OO != null && !o0000000O000OO.O0000000000() && MinecraftAccessor.a_.player != null) {
         if (o0000000O000OO.O00000000000() instanceof CooldownUpdateS2CPacket var1) {
            Item var5 = (Item)Registries.ITEM.get(var1.cooldownGroup());
            if (var5 == null || var5 == Items.AIR) {
               return;
            }

            int var3 = var1.cooldown();
            if (var3 <= 0) {
               O000000000OO0.remove(var5);
            } else {
               CooldownsHud.W143 var4 = O000000000OO0.computeIfAbsent(var5, CooldownsHud.W143::new);
               var4.O00000000(O000000000(var5));
            }
         } else if (o0000000O000OO.O00000000000() instanceof PlayerRespawnS2CPacket) {
            O0000000000OOO();
         }
      }
   }

   public static void O00000000(RenderManager o0000O00OO0O0, DrawContext drawContext) {
      O00000000.O000000000(o0000O00OO0O0, drawContext);
   }

   private void O000000000(RenderManager o0000O00OO0O0, DrawContext drawContext) {
      if (MinecraftAccessor.a_.player != null && MinecraftAccessor.a_.world != null) {
         O0000000000OO0();
         O000000000OO00.clear();
         O000000000OO0O.clear();
         Iterator var3 = O000000000OO0.entrySet().iterator();

         while (var3.hasNext()) {
            CooldownsHud.W143 var4 = (CooldownsHud.W143)((Entry)var3.next()).getValue();
            boolean var5 = var4.O0000000000000 > 0L;
            var4.O00000000000.O00000000();
            var4.O00000000000.O00000000(var5 ? 1.0 : 0.0, 0.15F, O0000O00O0OO0O.O0000000000O0O, false);
            if (!var5 && !(var4.O00000000000.O000000000000() > 0.01F)) {
               var3.remove();
            } else {
               O000000000OO00.add(var4);
            }
         }

         O000000000OO00.sort(
            Comparator.<CooldownsHud.W143>comparingLong(o00000000 -> -o00000000.O0000000000000).thenComparing(o00000000 -> o00000000.O0000000000)
         );
         boolean var83 = !O000000000OO00.isEmpty() || MinecraftAccessor.a_.currentScreen instanceof ChatScreen;
         O000000000OOO.O00000000();
         O000000000OOO.O00000000(var83 ? 1.0 : 0.0, 0.22F, O0000O00O0OO0O.O0000000000O0O, false);
         float var84 = O000000000OOO.O000000000000();
         if (!(var84 <= 0.01F)) {
            boolean var85 = this.O00000000O.O0000000000();
            boolean var6 = this.O00000000O0.O0000000000();
            boolean var7 = HudModule.O0000000000O00();
            O00000OO0OO0O.W239 var8 = var7 ? O00000OO0OO0O.O00000000("HUD_CoolDowns") : null;
            float var9 = 24.0F;
            float var10 = var7 ? var8.O00000000000O : 7.0F;
            float var11 = var85 ? (var7 ? var8.O00000000000OO : 32.0F) : 0.0F;
            float var12 = var7 ? var8.O0000000000O : 22.0F;
            float var13 = var7 ? var8.O00000000000O0 : 5.0F;
            float var14 = var7 ? var8.O0000000000O0 : 28.0F;
            String var15 = "Cooldowns";
            float var16 = TextMeasureCache.O000000000(FontRegistry.O00000000000, var15, var14);
            float var17 = var85 ? var16 + 46.0F : 0.0F;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = 0.0F;

            for (CooldownsHud.W143 var22 : O000000000OO00) {
               float var23 = var22.O00000000000.O000000000000();
               if (!(var23 <= 0.01F)) {
                  String var24 = O0000000000O0((float)var22.O0000000000000 / 1000.0F);
                  var18 = Math.max(var18, TextMeasureCache.O000000000(FontRegistry.O00000000, var22.O0000000000, var9));
                  var19 = Math.max(var19, TextMeasureCache.O000000000(FontRegistry.O00000000, var24, var9));
                  var20 += var12 * var23;
               }
            }

            float var86 = var6 ? 22.0F : 0.0F;
            float var87 = var18 + var86 + 24.0F;
            float var88 = var19 + 20.0F + (var7 ? var8.O0000000000O0O : 0.0F);
            float var89 = O000000000OO00.isEmpty() ? 0.0F : var87 + var13 + var88;
            float var25 = Math.max(var17, var89) + var10 * 2.0F;
            var25 = Math.max(var25, var85 ? 104.0F : 74.0F);
            if (var89 > 0.0F) {
               float var26 = var25 - var10 * 2.0F;
               var87 = Math.max(40.0F, var26 - var13 - var88);
            }

            float var91 = var10 + var11 + (var85 && var20 > 0.01F ? var13 : 0.0F) + var20 + var10;
            O000000000OOO0.O00000000();
            O000000000OOOO.O00000000();
            O000000000OOO0.O00000000(var25, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
            O000000000OOOO.O00000000(var91, 0.18F, O0000O00O0OO0O.O0000000000O0O, false);
            float var27 = O000000000OOO0.O000000000000();
            float var28 = O000000000OOOO.O000000000000();
            float var29 = MinecraftAccessor.a_.getWindow().getFramebufferWidth();
            O00000OO000O.W219 var30 = O00000OO000O.O00000000().O00000000("HUD_CoolDowns", Math.max(10.0F, var29 - var27 - 10.0F), 140.0F, var27, var28);
            float var31 = var30.O000000000;
            float var32 = var30.O0000000000;
            float var33 = var30.O00000000000;
            float var34 = var30.O000000000000;
            this.O00000000(var31, var32, var33, var34);
            float var35 = var33 / Math.max(1.0F, var27);
            float var36 = var34 / Math.max(1.0F, var28);
            float var37 = Math.min(var35, var36);
            float var38 = var10 * var35;
            float var39 = var10 * var36;
            float var40 = var11 * var36;
            float var41 = var12 * var36;
            float var42 = var13 * var35;
            float var43 = var13 * var36;
            float var44 = var9 * var37;
            float var45 = var87 * var35;
            float var46 = var88 * var35;
            float var47 = var33 - var38 * 2.0F;
            float var48 = var84 * this.O000000000O0.O0000000000();
            int var49 = this.O00000000(var48);
            int var50 = this.O000000000(var48);
            int var51 = this.O0000000000(var48);
            int var52 = this.O00000000000(var48);
            int var53 = this.O000000000000(var48);
            int var54 = this.O00000000000O(var48);
            float var55 = var7 ? var8.O00000000 : 14.0F;
            float var56 = var7 ? var8.O000000000 : 11.0F;
            float var57 = var7 ? var8.O00000000000 : 7.0F;
            float var58 = var7 ? var8.O000000000000 : 7.0F;
            float var59 = var7 ? var8.O0000000000OO : 1.9F;
            this.O00000000(o0000O00OO0O0, var31, var32, var33, var34, var55, var48);
            if (var85) {
               if (this.O0000000000O()) {
                  this.O00000000(o0000O00OO0O0, var31 + var38, var32 + var39, var47, var40, var56, var48);
               } else if (var7) {
                  o0000O00OO0O0.O00000000(var31 + var38, var32 + var39, var47, var40, var56, var50);
               } else {
                  o0000O00OO0O0.O00000000(var31 + var38, var32 + var39, var47, var40, 11.0F, 11.0F, 4.0F, 4.0F, var50);
               }

               float var60 = var7 ? var31 + var8.O0000000000OO0.O00000000 * var35 : var31 + var38 + 10.0F * var35;
               float var61 = var7 ? var32 + var8.O0000000000OO0.O000000000 * var36 : var32 + var39 + var40 * 0.5F + 6.0F * var36;
               o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var60, var61, var14 * var37, var15, var53);
               float var62 = 22.0F * var36;
               float var63 = var31 + var38 + var47 - 10.0F * var35 - var62;
               float var64 = var32 + var39 + (var40 - var62) * 0.5F;
               float var65 = (var7 ? var8.O0000000000O00 : var9) * var37;
               float var66 = TextMeasureCache.O000000000(FontRegistry.O000000000000, "g", var65);
               float var67 = var7
                  ? (var8.O0000000000OOO.O0000000000 ? var31 + var33 : var31) + var8.O0000000000OOO.O00000000 * var35
                  : var63 + (var62 - var66) * 0.8F;
               float var68 = var7 ? var32 + var8.O0000000000OOO.O000000000 * var36 : var64 + var62 * 0.55F + 5.5F * var36;
               o0000O00OO0O0.O00000000(FontRegistry.O000000000000, var67, var68, var65, "g", var54);
            }

            float var92 = var32 + var39 + var40 + (var85 && var20 > 0.01F ? var43 : 0.0F);
            float var93 = var31 + var38 + (var7 ? var8.O000000000O.O00000000 * var35 : 0.0F);
            float var94 = var92 + (var7 ? var8.O000000000O.O000000000 * var36 : 0.0F);
            float var95 = var31 + var38 + var45 + var42 + (var7 ? var8.O000000000O0.O00000000 * var35 : 0.0F);
            float var96 = var92 + (var7 ? var8.O000000000O0.O000000000 * var36 : 0.0F);
            float var97 = var20 * var36;
            if (var97 > 0.01F && this.O00000000000O()) {
               if (this.O0000000000O()) {
                  this.O000000000(o0000O00OO0O0, var93, var94, var45, var97, var57, var48);
                  this.O000000000(o0000O00OO0O0, var95, var96, var46, var97, var58, var48);
               } else if (var7) {
                  o0000O00OO0O0.O00000000(var93, var94, var45, var97, var57, var51);
                  o0000O00OO0O0.O00000000(var95, var96, var46, var97, var58, var51);
               } else {
                  o0000O00OO0O0.O00000000(var93, var94, var45, var97, var85 ? 4.0F : 11.0F, var85 ? 4.0F : 11.0F, 4.0F, 11.0F, var51);
                  o0000O00OO0O0.O00000000(var95, var96, var46, var97, 4.0F, var85 ? 4.0F : 11.0F, 11.0F, 4.0F, var51);
               }
            }

            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O00000000(var31, var32, var33, var34, var55, var55, var55, var55);

            try {
               float var98 = var94;
               float var99 = var96;

               for (int var100 = 0; var100 < O000000000OO00.size(); var100++) {
                  CooldownsHud.W143 var69 = O000000000OO00.get(var100);
                  float var70 = var69.O00000000000.O000000000000();
                  if (!(var70 <= 0.01F)) {
                     String var71 = O0000000000O0((float)var69.O0000000000000 / 1000.0F);
                     int var72 = (int)(255.0F * var48 * var70);
                     int var73 = O0000O000OO000.O00000000(this.O000000000000(1.0F), var72);
                     int var74 = O0000O000OO000.O00000000(this.O00000000000O(1.0F), var72);
                     float var75 = (1.0F - var70) * 8.0F * var35;
                     float var76 = var93 + 10.0F * var35 - var75;
                     if (var59 > 0.05F) {
                        o0000O00OO0O0.O00000000(
                           var76, var98 + (var41 - 8.0F * var36) * 0.5F, var59 * var35, 8.0F * var36, Math.max(0.7F, var59 * 0.5F) * var35, var74
                        );
                     }

                     var76 += 8.0F * var35;
                     if (var6) {
                        float var77 = 0.9F * var37;
                        float var78 = 16.0F * var77;
                        float var79 = var98 + (var41 - var78) * 0.5F;
                        O000000000OO0O.add(new CooldownsHud.W144(var69.O000000000, var76, var79, var77, var100));
                        var76 += 20.0F * var35;
                     }

                     o0000O00OO0O0.O00000000(FontRegistry.O00000000, var76, var98 + var41 * 0.5F + 4.0F * var36, var44, var69.O0000000000, var73);
                     var69.O000000000000.O00000000(var71, var69.O0000000000000);
                     float var104 = var95 + var46 * 0.5F + var75;
                     float var105 = var99 + var41 * 0.5F + 4.0F * var36;
                     var69.O000000000000
                        .O00000000(
                           o0000O00OO0O0, FontRegistry.O00000000, var95, var99, var46, var41, Math.min(var58, var41 * 0.5F), var104, var105, var44, var74
                        );
                     var98 += var41 * var70;
                     var99 += var41 * var70;
                  }
               }

               if (!O000000000OO0O.isEmpty()) {
                  o0000O00OO0O0.O0000000000();

                  for (CooldownsHud.W144 var102 : O000000000OO0O) {
                     ItemRenderUtil.O00000000(
                        o0000O00OO0O0,
                        var102.stack,
                        ItemRenderUtil.O00000000(var102.x),
                        ItemRenderUtil.O00000000(var102.y),
                        ItemRenderUtil.O0000000000(var102.scale),
                        var102.seed,
                        false,
                        var102.seed
                     );
                  }
               }
            } finally {
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O0000000000000();
            }

            O00000OO000O.O00000000().O00000000(var30);
            O00000O0O00O.O00000000(
               o0000O00OO0O0,
               this,
               var30,
               O00000OO000O.O00000000(),
               MinecraftAccessor.a_.getWindow().getScaledWidth(),
               MinecraftAccessor.a_.getWindow().getScaledHeight()
            );
         }
      } else {
         O0000000000OOO();
         O000000000OOO.O0000000000000(0.0);
         O000000000OO00.clear();
         O000000000OO0O.clear();
      }
   }

   private static String O0000000000O0(float f) {
      int var1 = Math.max(0, Math.round(f * 10.0F));
      return var1 / 10 + "." + var1 % 10 + "s";
   }

   private static void O0000000000OO0() {
      if (MinecraftAccessor.a_.player == null) {
         O0000000000OOO();
      } else {
         for (CooldownsHud.W143 var1 : O000000000OO0.values()) {
            var1.O0000000000000 = 0L;
         }

         ItemCooldownManager var9 = MinecraftAccessor.a_.player.getItemCooldownManager();
         ItemCooldownManagerAccessor var10 = (ItemCooldownManagerAccessor)var9;
         int var2 = var10.wild$getTick();

         for (Entry var4 : var10.wild$getEntries().entrySet()) {
            long var5 = O00000000(var4.getValue(), var2);
            if (var5 > 0L) {
               Item var7 = (Item)Registries.ITEM.get((Identifier)var4.getKey());
               if (var7 != null && var7 != Items.AIR) {
                  CooldownsHud.W143 var8 = O000000000OO0.computeIfAbsent(var7, CooldownsHud.W143::new);
                  var8.O00000000(O000000000(var7));
                  var8.O0000000000000 = Math.max(var8.O0000000000000, var5);
               }
            }
         }
      }
   }

   private static long O00000000(ItemStack itemStack) {
      if (MinecraftAccessor.a_.player != null && itemStack != null && !itemStack.isEmpty()) {
         ItemCooldownManager var1 = MinecraftAccessor.a_.player.getItemCooldownManager();
         ItemCooldownManagerAccessor var2 = (ItemCooldownManagerAccessor)var1;
         Object var3 = var2.wild$getEntries().get(var1.getGroup(itemStack));
         return var3 == null ? 0L : O00000000(var3, var2.wild$getTick());
      } else {
         return 0L;
      }
   }

   private static long O00000000(Object object, int i) {
      int var2 = ((ItemCooldownManagerEntryAccessor)object).wild$getEndTick() - i;
      return var2 > 0 ? var2 * 50L : 0L;
   }

   private static void O0000000000OOO() {
      if (!O000000000OO0.isEmpty()) {
         O000000000OO0.clear();
      }
   }

   static ItemStack O000000000(Item item) {
      if (MinecraftAccessor.a_.player != null) {
         for (int var1 = 0; var1 < 36; var1++) {
            ItemStack var2 = MinecraftAccessor.a_.player.getInventory().getStack(var1);
            if (!var2.isEmpty() && var2.isOf(item)) {
               return var2.copy();
            }
         }

         ItemStack var3 = MinecraftAccessor.a_.player.getOffHandStack();
         if (!var3.isEmpty() && var3.isOf(item)) {
            return var3.copy();
         }
      }

      if (item == Items.ENDER_PEARL) {
         ItemStack var4 = ClickPearl.O0000000000O0();
         if (!var4.isEmpty()) {
            return var4;
         }
      }

      return new ItemStack(item);
   }

   static String O00000000(ItemStack itemStack, Item item) {
      String var2 = itemStack.getName().getString();
      if (var2 != null && !var2.isBlank()) {
         return var2;
      } else {
         Identifier var3 = Registries.ITEM.getId(item);
         String var4 = var3.getPath().replace('_', ' ');
         StringBuilder var5 = new StringBuilder();

         for (String var9 : var4.split(" ")) {
            if (!var9.isEmpty()) {
               var5.append(Character.toUpperCase(var9.charAt(0))).append(var9.substring(1)).append(" ");
            }
         }

         return var5.toString().trim();
      }
   }

   static class W143 {
      final Item O00000000;
      ItemStack O000000000;
      String O0000000000;
      final O0000O00O0OO O00000000000 = new O0000O00O0OO();
      final O00000O0O0000 O000000000000 = new O00000O0O0000();
      long O0000000000000;

      W143(Item item) {
         this.O00000000 = item;
         this.O00000000(CooldownsHud.O000000000(item));
         this.O00000000000.O0000000000000(0.0);
      }

      void O00000000(ItemStack itemStack) {
         this.O000000000 = itemStack;
         this.O0000000000 = CooldownsHud.O00000000(itemStack, this.O00000000);
      }
   }

   record W144(ItemStack stack, float x, float y, float scale, int seed) {
   }
}
