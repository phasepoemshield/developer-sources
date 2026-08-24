package org.zenith.module;

import org.zenith.config.ConfigJsonUtil;
import org.zenith.core.SimpleItemBuilder;
import org.zenith.core.ItemRegistry;
import org.zenith.event.EventModifyMouseRotationInput;
import org.zenith.setting.Setting;
import org.zenith.util.Item;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.util.CooldownTimer;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.ColorAnimator;
import org.zenith.util.ScreenUtils;
import org.zenith.util.TaskScheduler;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.EffectEngine;

import org.zenith.event.Event26;
import org.zenith.event.EventUpdateHealth2;
import org.zenith.event.PacketEvent;

import org.zenith.setting.ModeSetting;
import org.zenith.setting.ModeSetting3;
import org.zenith.setting.NumberSetting;





import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import java.util.Comparator;
import java.util.List;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.entity.vehicle.TntMinecartEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Hand;

@ModuleInfo(
   name = "AutoTotem",
   category = Category.COMBAT,
   description = "\u041f\u0440\u0438 \u0443\u0441\u043b\u043e\u0432\u0438\u044f\u0445 \u0431\u0435\u0440\u0435\u0442 \u0442\u043e\u0442\u0435\u043c \u0432 \u0440\u0443\u043a\u0443"
)
public final class AutoTotem extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final AutoTotem autoTotem = new AutoTotem();
   public final NumberSetting healthSetting = new NumberSetting(
      "module.autoTotem.healthSetting", 4.0F, 2.0F, 20.0F, 0.5F, "module.autoTotem.healthSetting.desc", "hp"
   );
   public final NumberSetting time2 = new NumberSetting(
      "module.autoTotem.time", 300.0F, 0.0F, 2000.0F, 100.0F, "module.autoTotem.time.desc", "ms"
   );
   public final NumberSetting elytraHealthSetting = new NumberSetting(
      "module.autoTotem.elytraHealthSetting", 4.0F, 2.0F, 20.0F, 0.5F, "module.autoTotem.elytraHealthSetting.desc", "hp"
   );
   public final ModeSetting modeSetting3 = ModeSetting.on23(
      "module.autoTotem.triggerSetting",
      "module.autoTotem.triggerSetting.desc",
      List.of("module.autoTotem.triggerCrystal", "module.autoTotem.triggerTNT", "module.autoTotem.trident", "module.autoTotem.minecartTNT")
   );
   public final NumberSetting tNTRangeSetting = new NumberSetting(
      "module.autoTotem.TNTRangeSetting",
      8.0F,
      0.0F,
      50.0F,
      4.0F,
      "module.autoTotem.TNTRangeSetting.desc",
      "b",
      () -> this.modeSetting3.ConfigJsonUtil(1),
      null
   );
   public final NumberSetting tridentRangeSetting = new NumberSetting(
      "module.autoTotem.tridentRangeSetting",
      8.0F,
      0.0F,
      50.0F,
      4.0F,
      "module.autoTotem.tridentRangeSetting.desc",
      "b",
      () -> this.modeSetting3.ConfigJsonUtil(2),
      null
   );
   public Slot slot = null;
   public final CooldownTimer zClass06711 = new CooldownTimer();
   public CooldownTimer zClass06712 = new CooldownTimer();

   public AutoTotem() {
   }

   @EventTarget
   public void ColorAnimator(PacketEvent var1) {
   }

   @EventTarget
   public void on23(EventUpdateHealth2 var1) {
      this.call186();
   }

   @EventTarget
   public void ColorAnimator(Event26 var1) {
      this.call186();
   }

   public void call186() {
      if (this.zClass06712 == null) {
         this.zClass06712 = new CooldownTimer();
      }

      if (this.call118()) {
         if (!this.zClass06712.EventModifyMouseRotationInput(400L)) {
            return;
         }

         this.zClass06711.reset();
         ItemStack itemstack = minecraftClient3.player.getOffHandStack();
         Slot slot = ScreenUtils.on23(
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
                  boolean flag1 = nbtcomponent.contains("sphereEffect");
                  boolean flag2 = nbtcomponent1.contains("sphereEffect");
                  if (flag1 && !flag2) {
                     return 1;
                  } else if (!flag1 && flag2) {
                     return -1;
                  } else if (!flag1) {
                     return 0;
                  } else {
                     String s = nbtcomponent.getNbt().get("sphereEffect").toString();
                     String s1 = nbtcomponent1.getNbt().get("sphereEffect").toString();
                     return Integer.compare(s1.length(), s.length());
                  }
               }
            }).thenComparing(Comparator.comparingInt(var0 -> var0.id)),
            var0 -> true
         );
         if (slot == null) {
            return;
         }

         boolean flag = itemstack != slot.getStack();
         if (flag && TaskScheduler.ItemRegistry(AutoTotem.class)) {
            if (!InventorySetting.inventorySetting.string104()) {
               TaskScheduler.on23(AutoTotem.class, () -> {
               }, 100);
               if (!(minecraftClient3.player.currentScreenHandler instanceof PlayerScreenHandler)) {
                  ScreenUtils.closeScreen();
               }

               this.zClass06712.reset();
               ScreenUtils.on23(slot, Hand.OFF_HAND, true);
            } else {
               TaskScheduler.on23(AutoTotem.class, () -> {
                  try {
                     if (!(minecraftClient3.player.currentScreenHandler instanceof PlayerScreenHandler)) {
                        ScreenUtils.closeScreen();
                     }
                  } catch (Exception exception) {
                     exception.printStackTrace();
                  }

                  this.zClass06712.reset();
                  ScreenUtils.on23(slot, Hand.OFF_HAND, true);
               }, 100);
            }

            this.slot = slot;
         }
      } else if (this.slot != null
         && this.zClass06711.EventModifyMouseRotationInput((long)this.time2.getCurrent())
         && TaskScheduler.ItemRegistry(AutoTotem.class)) {
         Slot slot1 = this.slot;
         this.slot = null;
         TaskScheduler.on23(AutoTotem.class, () -> {
            if (!(minecraftClient3.player.currentScreenHandler instanceof PlayerScreenHandler)) {
               ScreenUtils.closeScreen();
            }

            ScreenUtils.on23(slot1, Hand.OFF_HAND, true);
         }, 100);
      }
   }

   public boolean call118() {
      if (EffectEngine.double69()) {
         return false;
      } else if (this.isEnabled() && ScreenUtils.SimpleItemBuilder(Items.TOTEM_OF_UNDYING) != null) {
         boolean flag = minecraftClient3.player.getEquippedStack(EquipmentSlot.CHEST).getItem().equals(Items.ELYTRA);
         float f = minecraftClient3.player.getHealth() + minecraftClient3.player.getAbsorptionAmount();
         if (minecraftClient3.player.getItemCooldownManager().isCoolingDown(Items.TOTEM_OF_UNDYING.getDefaultStack())) {
            return false;
         } else if (f < (flag ? this.elytraHealthSetting.getCurrent() : this.healthSetting.getCurrent())) {
            return true;
         } else if (this.modeSetting3.ConfigJsonUtil(0)
            && EffectEngine.double66()
               .anyMatch(
                  var0 -> var0 instanceof EndCrystalEntity
                        && minecraftClient3.player.squaredDistanceTo(var0) < 25.0
                        && var0.getY() > minecraftClient3.player.getEyeY()
               )) {
            return true;
         } else {
            return this.modeSetting3.ConfigJsonUtil(2)
                  && EffectEngine.double66()
                     .anyMatch(
                        var1x -> var1x instanceof TridentEntity
                              && minecraftClient3.player.squaredDistanceTo(var1x) < (double)this.tridentRangeSetting.getCurrent()
                     )
               ? true
               : this.modeSetting3.ConfigJsonUtil(1)
                  && EffectEngine.double66()
                     .anyMatch(
                        var1x -> (var1x instanceof TntEntity || var1x instanceof TntMinecartEntity && this.modeSetting3.ConfigJsonUtil(3))
                              && minecraftClient3.player.squaredDistanceTo(var1x)
                                 < (double)(this.tNTRangeSetting.getCurrent() * this.tNTRangeSetting.getCurrent())
                     );
         }
      } else {
         return false;
      }
   }

   public NumberSetting float307() {
      return this.healthSetting;
   }

   public NumberSetting call397() {
      return this.time2;
   }

   public NumberSetting call398() {
      return this.elytraHealthSetting;
   }

   public ModeSetting call399() {
      return this.modeSetting3;
   }

   public NumberSetting call400() {
      return this.tNTRangeSetting;
   }

   public NumberSetting call401() {
      return this.tridentRangeSetting;
   }

   public Slot call402() {
      return this.slot;
   }

   public CooldownTimer string35() {
      return this.zClass06711;
   }

   public CooldownTimer float71() {
      return this.zClass06712;
   }
}
