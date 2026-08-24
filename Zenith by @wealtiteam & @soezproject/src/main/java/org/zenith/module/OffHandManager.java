package org.zenith.module;

import org.zenith.core.Easing;
import org.zenith.event.EventModifyMouseRotationInput;
import org.zenith.ZenithClient;
import org.zenith.setting.Setting;
import org.zenith.util.Item;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Aura;
import org.zenith.module.Category;
import org.zenith.util.CooldownTimer;
import org.zenith.module.Module;
import org.zenith.core.ItemRegistry;
import org.zenith.core.NbtEditor;
import org.zenith.core.ColorAnimator;
import org.zenith.core.UiAnimation;
import org.zenith.util.ScreenUtils;
import org.zenith.util.TaskScheduler;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.EventTick;
import org.zenith.event.MovementInputEvent;

import org.zenith.setting.ModeSetting3;




import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import java.util.Comparator;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Hand;

@ModuleInfo(
   name = "OffHandManager",
   category = Category.COMBAT,
   description = ""
)
public final class OffHandManager extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final OffHandManager offHandManager = new OffHandManager();
   public final ModeSetting3 swapHealMode = new ModeSetting3(
      "module.offhand.swapHealMode",
      "module.offhand.swapHealMode.desc",
      "module.offhand.mode.mythic",
      "module.offhand.mode.legendary",
      "module.offhand.mode.talisman",
      "module.offhand.mode.none"
   );
   public final ModeSetting3 swapEnemyMode = new ModeSetting3(
      "module.offhand.swapEnemyMode",
      "module.offhand.swapEnemyMode.desc",
      "module.offhand.mode.cerberus",
      "module.offhand.mode.mythic",
      "module.offhand.mode.legendary",
      "module.offhand.mode.talisman",
      "module.offhand.mode.none"
   );
   public final CooldownTimer zClass06730 = new CooldownTimer();

   public OffHandManager() {
   }

   public void reset() {
      this.zClass06730.reset();
   }

   @EventTarget
   public void ItemRegistry(MovementInputEvent var1) {
      LivingEntity livingentity = Aura.aura.zClass054();
      if (this.int393()) {
         Slot slot;
         if (!this.swapEnemyMode.is(4) && livingentity != null && this.ColorAnimator(livingentity)) {
            slot = this.UiAnimation(this.swapEnemyMode);
         } else if (minecraftClient3.player.isUsingItem() && !this.swapHealMode.is(3)) {
            slot = this.UiAnimation(this.swapHealMode);
            if (slot == null) {
               return;
            }

            if (!minecraftClient3.player.getOffHandStack().equals(slot.getStack())
               && TaskScheduler.Easing(AutoTotem.class)
               && TaskScheduler.Easing(AutoSwap.class)
               && TaskScheduler.Easing(OffHandManager.class)) {
               TaskScheduler.on23(OffHandManager.class, () -> {
                  if (TaskScheduler.Easing(AutoTotem.class)) {
                     ScreenUtils.on23(slot, Hand.OFF_HAND, true);
                  }
               });
            }
         } else {
            slot = null;
         }

         if (slot != null
            && TaskScheduler.Easing(AutoTotem.class)
            && TaskScheduler.Easing(AutoSwap.class)
            && TaskScheduler.Easing(OffHandManager.class)) {
            TaskScheduler.on23(OffHandManager.class, () -> {
               if (TaskScheduler.Easing(AutoTotem.class)) {
                  ScreenUtils.on23(slot, Hand.OFF_HAND, true);
               }
            });
         }
      }
   }

   public boolean int393() {
      return this.zClass06730.EventModifyMouseRotationInput(1000L);
   }

   public Slot UiAnimation(ModeSetting3 var1) {
      try {
         if (var1.get().equals("module.offhand.mode.talisman")) {
            return ScreenUtils.on23(
               minecraftClient3.player.playerScreenHandler,
               Items.TOTEM_OF_UNDYING,
               Comparator.<Slot, Boolean>comparing(var0 -> !var0.getStack().hasEnchantments()).thenComparing((var0, var1x) -> {
                  NbtComponent nbtcomponent = var0.getStack().get(DataComponentTypes.CUSTOM_DATA);
                  NbtComponent nbtcomponent1 = var1x.getStack().get(DataComponentTypes.CUSTOM_DATA);
                  if (nbtcomponent == null && nbtcomponent1 != null) {
                     return -1;
                  } else if (nbtcomponent != null && nbtcomponent1 == null) {
                     return 1;
                  } else if (nbtcomponent == null) {
                     return 0;
                  } else {
                     boolean flag = nbtcomponent.contains("sphereEffect");
                     boolean flag1 = nbtcomponent1.contains("sphereEffect");
                     if (flag && !flag1) {
                        return 1;
                     } else if (!flag && flag1) {
                        return -1;
                     } else if (!flag) {
                        return 0;
                     } else {
                        String s1 = nbtcomponent.getNbt().get("sphereEffect").toString();
                        String s2 = nbtcomponent1.getNbt().get("sphereEffect").toString();
                        return Integer.compare(s2.length(), s1.length());
                     }
                  }
               }).thenComparingInt(var0 -> var0.id).reversed(),
               var0 -> true
            );
         } else {
            String s = this.EventTick(var1.get());
            return ScreenUtils.on23(Items.PLAYER_HEAD, var1x -> {
               if (!var1x.getStack().isEmpty()) {
                  NbtComponent nbtcomponent = var1x.getStack().get(DataComponentTypes.CUSTOM_DATA);
                  if (nbtcomponent != null && nbtcomponent.getNbt().contains("SkullOwner") && nbtcomponent.getNbt().get("SkullOwner").toString().contains(s)) {
                     return true;
                  }
               }

               return false;
            });
         }
      } catch (Exception exception) {
         exception.printStackTrace();
         return null;
      }
   }

   public String EventTick(String var1) {
      return switch (var1) {
         case "module.offhand.mode.cerberus" -> "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjA5NWE3ZmQ5MGRhYTFiYmU3MDY5MDg5NzQwZTA1ZDBiZmM2NjI5NmVlM2M0MGVlNzFhNGUwYTY2MTZiMmJiYyJ9fX0=";
         case "module.offhand.mode.mythic" -> "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmFmZjJlYjQ5OGU1YzZhMDQ0ODRmMGM5Zjc4NWI0NDg0NzlhYjIxM2RmOTVlYzkxMTc2YTMwOGExMmFkZDcwIn19fQ==";
         case "module.offhand.mode.legendary" -> "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGM5MzY1NjQyYzZlZGRjZmVkZjViNWUxNGUyYmM3MTI1N2Q5ZTRhMzM2M2QxMjNjNmYzM2M1NWNhZmJmNmQifX19";
         default -> throw new RuntimeException("Unknown key: " + var1);
      };
   }

   public boolean ColorAnimator(LivingEntity var1) {
      if (var1.isUsingItem()) {
         return true;
      } else {
         return var1.getMainHandStack().getItem() instanceof SwordItem
            ? false
            : var1.getOffHandStack().getItem() != Items.PLAYER_HEAD || this.NbtEditor(var1.getOffHandStack());
      }
   }

   public boolean NbtEditor(ItemStack var1) {
      NbtComponent nbtcomponent = var1.get(DataComponentTypes.CUSTOM_DATA);
      return nbtcomponent != null
         && nbtcomponent.getNbt().contains("SkullOwner")
         && nbtcomponent.getNbt()
            .get("SkullOwner")
            .toString()
            .contains(
               "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGM5MzY1NjQyYzZlZGRjZmVkZjViNWUxNGUyYmM3MTI1N2Q5ZTRhMzM2M2QxMjNjNmYzM2M1NWNhZmJmNmQifX19"
            );
   }
}
