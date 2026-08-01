package l;

import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.EnderChestInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;

public class Helper66 implements Helper160 {
   public Helper66() {
   }

   public static void method685(Slot var0, int var1) {
      if (var0 != null) {
         method688(var0.id, var1, false, false);
      }
   }

   public static void method686(Slot var0, int var1, boolean var2) {
      method687(var0, var1, var2, false);
   }

   public static void method687(Slot var0, int var1, boolean var2, boolean var3) {
      if (var0 != null) {
         method688(var0.id, var1, var2, var3);
      }
   }

   public static void method688(int var0, int var1, boolean var2, boolean var3) {
      if (var0 != var1 && var0 != -1) {
         int var4 = Math.toIntExact(method720().count()) - 10;
         if (var0 >= var4 && var4 == 36) {
            if (var2) {
               Helper59.method657(() -> method703(var1, var0 - var4, SlotActionType.SWAP, false));
            } else {
               method703(var1, var0 - var4, SlotActionType.SWAP, false);
            }
         } else {
            if (var2) {
               Helper59.method657(() -> method689(var0, var1, var3));
            } else {
               method689(var0, var1, var3);
            }
         }
      }
   }

   public static void method689(int var0, int var1, boolean var2) {
      method703(var0, 0, SlotActionType.SWAP, false);
      method703(var1, 0, SlotActionType.SWAP, false);
      method703(var0, 0, SlotActionType.SWAP, false);
      if (var2) {
         method700();
      }
   }

   public static void method690(Slot var0, Hand var1, boolean var2) {
      method691(var0, var1, var2, false);
   }

   public static void method691(Slot var0, Hand var1, boolean var2, boolean var3) {
      if (var0 != null
         && var0.id != -1
         && (!var1.equals(Hand.OFF_HAND) || var0.inventory instanceof PlayerInventory || var0.inventory instanceof EnderChestInventory)) {
         int var4 = var1.equals(Hand.MAIN_HAND) ? mc.player.getInventory().selectedSlot : 40;
         if (var2) {
            Helper59.method657(() -> method692(var0, var4, var3));
         } else {
            method692(var0, var4, var3);
         }
      }
   }

   public static void method692(Slot var0, int var1, boolean var2) {
      method702(var0, var1, SlotActionType.SWAP, false);
      if (var2) {
         method700();
      }
   }

   public static void method693(Slot var0, String var1, boolean var2) {
      if (var0 == null) {
         Notifications.method1666().method1670(Formatting.RED + var1 + Formatting.RESET + " - не найден!", 3000L, Helper56.SOFT_NOTIFICATION);
      } else {
         if (var2) {
            Helper59.method657(() -> method699(var0, Helper349.method3473()));
         } else {
            method699(var0, Helper349.method3473());
         }
      }
   }

   public static void method694(Item var0) {
      method698(var0, Helper349.method3473(), false);
   }

   public static void method695(int var0, int var1, SlotActionType var2) {
      if (var0 != -1 && mc.interactionManager != null && mc.player != null) {
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, var0, var1, var2, mc.player);
      }
   }

   public static void method696(int var0) {
      if (mc.player != null && mc.getNetworkHandler() != null) {
         if (mc.player.getInventory().selectedSlot != var0) {
            mc.player.getInventory().selectedSlot = var0;
         }
      }
   }

   public static void method697(Item var0, String var1, boolean var2) {
      float var3 = Helper189.method1625(var0);
      if (var3 > 0.0F) {
         String var5 = Helper147.method1235(var3, 0.1) + "с";
         Notifications.method1666()
            .method1670(Formatting.RED + var0.getName().getString() + Formatting.RESET + " - в кд еще " + var5, 2000L, Helper56.SOFT_NOTIFICATION);
      } else {
         Slot var4 = method707(var2x -> var2x.getStack().getItem().equals(var0) && method722(var2x.getStack().getName()).contains(var1.toLowerCase()));
         if (var4 == null) {
            Notifications.method1666()
               .method1670(Formatting.RED + var0.getName().getString() + Formatting.RESET + " - не найден!", 2000L, Helper56.SOFT_NOTIFICATION);
         } else {
            if (var2) {
               Helper59.method657(() -> method699(var4, Helper349.method3473()));
            } else {
               method699(var4, Helper349.method3473());
            }
         }
      }
   }

   public static void method698(Item var0, Helper336 var1, boolean var2) {
      float var3 = Helper189.method1625(var0);
      if (var3 > 0.0F) {
         String var5 = Helper147.method1235(var3, 0.1) + "с";
         Notifications.method1666()
            .method1670(Formatting.RED + var0.getName().getString() + Formatting.RESET + " - в кд еще " + var5, 2000L, Helper56.SOFT_NOTIFICATION);
      } else {
         Slot var4 = method705(var0);
         if (var4 == null) {
            Notifications.method1666()
               .method1670(Formatting.RED + var0.getName().getString() + Formatting.RESET + " - не найден!", 2000L, Helper56.SOFT_NOTIFICATION);
         } else {
            if (var2) {
               Helper59.method657(() -> method699(var4, var1));
            } else {
               method699(var4, var1);
            }
         }
      }
   }

   public static void method699(Slot var0, Helper336 var1) {
      method690(var0, Hand.MAIN_HAND, false);
      Helper38.method521(Hand.MAIN_HAND);
      method691(var0, Hand.MAIN_HAND, false, true);
   }

   public static void method700() {
      ScreenHandler var0 = mc.player.currentScreenHandler;
      ItemStack var1 = Registries.ITEM.get(Helper147.method1227(0, 100)).getDefaultStack();
      mc.player
         .networkHandler
         .sendPacket(new ClickSlotC2SPacket(var0.syncId, var0.getRevision(), 0, 0, SlotActionType.PICKUP_ALL, var1, Int2ObjectMaps.singleton(0, var1)));
   }

   public static void method701(boolean var0) {
      if (var0) {
         mc.player.networkHandler.sendPacket(new CloseHandledScreenC2SPacket(mc.player.currentScreenHandler.syncId));
      } else {
         mc.player.closeHandledScreen();
      }
   }

   public static void method702(Slot var0, int var1, SlotActionType var2, boolean var3) {
      if (var0 != null) {
         method703(var0.id, var1, var2, var3);
      }
   }

   public static void method703(int var0, int var1, SlotActionType var2, boolean var3) {
      method704(mc.player.currentScreenHandler.syncId, var0, var1, var2, var3);
   }

   public static void method704(int var0, int var1, int var2, SlotActionType var3, boolean var4) {
      mc.interactionManager.clickSlot(var0, var1, var2, var3, mc.player);
      if (var4) {
         mc.player.currentScreenHandler.onSlotClick(var1, var2, var3, mc.player);
      }
   }

   public static Slot method705(Item var0) {
      return method706(var0, var0x -> true);
   }

   public static Slot method706(Item var0, Predicate<Slot> var1) {
      return method709(var0, Comparator.comparingInt(var0x -> 0), var1);
   }

   public static Slot method707(Predicate<Slot> var0) {
      return method720().filter(var0).findFirst().orElse(null);
   }

   public static Slot method708(Predicate<Slot> var0, Comparator<Slot> var1) {
      return method720().filter(var0).max(var1).orElse(null);
   }

   public static Slot method709(Item var0, Comparator<Slot> var1, Predicate<Slot> var2) {
      return method720().filter(var1x -> var1x.getStack().getItem().equals(var0)).filter(var2).max(var1).orElse(null);
   }

   public static Slot method710() {
      return method720()
         .filter(var0 -> var0.getStack().get(DataComponentTypes.FOOD) != null && !var0.getStack().get(DataComponentTypes.FOOD).canAlwaysEat())
         .max(Comparator.comparingDouble(var0 -> var0.getStack().get(DataComponentTypes.FOOD).saturation()))
         .orElse(null);
   }

   public static Slot method711(List<Item> var0) {
      return method720().filter(var1 -> var0.contains(var1.getStack().getItem())).findFirst().orElse(null);
   }

   public static Slot method712(RegistryEntry<StatusEffect> var0) {
      return method720().filter(var1 -> {
         PotionContentsComponent var2 = var1.getStack().get(DataComponentTypes.POTION_CONTENTS);
         return var2 == null ? false : StreamSupport.stream(var2.getEffects().spliterator(), false).anyMatch(var1x -> var1x.getEffectType().equals(var0));
      }).findFirst().orElse(null);
   }

   public static Slot method713(StatusEffectCategory var0) {
      return method720()
         .filter(
            var1 -> {
               ItemStack var2 = var1.getStack();
               PotionContentsComponent var3 = var2.get(DataComponentTypes.POTION_CONTENTS);
               if (var2.getItem().equals(Items.SPLASH_POTION) && var3 != null) {
                  StatusEffectCategory var4 = var0.equals(StatusEffectCategory.BENEFICIAL) ? StatusEffectCategory.HARMFUL : StatusEffectCategory.BENEFICIAL;
                  long var5 = StreamSupport.stream(var3.getEffects().spliterator(), false)
                     .filter(var1x -> var1x.getEffectType().value().getCategory().equals(var0))
                     .count();
                  long var7 = StreamSupport.stream(var3.getEffects().spliterator(), false)
                     .filter(var1x -> var1x.getEffectType().value().getCategory().equals(var4))
                     .count();
                  return var5 >= var7;
               } else {
                  return false;
               }
            }
         )
         .findFirst()
         .orElse(null);
   }

   public static int method714(Item var0) {
      return IntStream.range(0, 45)
         .filter(var1 -> Objects.requireNonNull(mc.player).getInventory().getStack(var1).getItem().equals(var0))
         .map(var0x -> mc.player.getInventory().getStack(var0x).getCount())
         .sum();
   }

   public static int method715(List<Item> var0) {
      return IntStream.range(0, 9).filter(var1 -> var0.contains(mc.player.getInventory().getStack(var1).getItem())).findFirst().orElse(-1);
   }

   public static int method716(IntPredicate var0) {
      return IntStream.range(0, 9).filter(var0).findFirst().orElse(-1);
   }

   public static int method717(Predicate<Slot> var0) {
      return method720().filter(var0).mapToInt(var0x -> var0x.getStack().getCount()).sum();
   }

   public static Slot method718() {
      long var0 = method720().count();
      int var2 = var0 == 46L ? 10 : 9;
      return method720().toList().get(Math.toIntExact(var0 - var2 + mc.player.getInventory().selectedSlot));
   }

   public static boolean method719() {
      return method720().toList().size() != 46;
   }

   public static Stream<Slot> method720() {
      return mc.player.currentScreenHandler.slots.stream();
   }

   public static void method721() {
      Slot var0 = method705(Items.COMPASS);
      if (var0 != null) {
         mc.player.getInventory().selectedSlot = var0.id < 9 ? var0.id : 0;
         method691(var0, Hand.MAIN_HAND, false, true);
      }
   }

   public static String method722(Text var0) {
      if (var0 == null) {
         return "";
      } else {
         String var1 = var0.getString();
         return var1 == null ? "" : var1.replaceAll("В§[0-9a-fk-or]", "").toLowerCase();
      }
   }
}
