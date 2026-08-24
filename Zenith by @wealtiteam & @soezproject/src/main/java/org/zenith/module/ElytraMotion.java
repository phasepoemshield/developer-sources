package org.zenith.module;

import org.zenith.event.EventModifyMouseRotationInput;
import org.zenith.ZenithClient;
import org.zenith.setting.Setting;
import org.zenith.util.Item;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.util.CooldownTimer;
import org.zenith.module.Module;
import org.zenith.core.NbtItemSpec;
import org.zenith.core.ColorAnimator;
import org.zenith.core.ItemServiceBase;
import org.zenith.core.UiAnimation;
import org.zenith.util.ScreenUtils;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.EffectEngine;

import org.zenith.event.EventTick;
import org.zenith.event.EventTriggerKeyEvent;
import org.zenith.event.PacketEvent;
import org.zenith.event.PlayerMoveEvent;

import org.zenith.setting.ModeSetting3;
import org.zenith.setting.NumberSetting;





import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

@ModuleInfo(
   name = "ElytraMotion",
   description = "",
   category = Category.MOVEMENT
)
public final class ElytraMotion extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final ElytraMotion elytraMotion = new ElytraMotion();
   public final ModeSetting3 mode7 = new ModeSetting3(
      "module.elytraMotion.mode", "module.elytraMotion.mode.desc", "module.elytraMotion.mode.distance", "module.elytraMotion.mode.smart"
   );
   public final NumberSetting distance5 = new NumberSetting(
      "module.elytraMotion.distance", 0.1F, 0.1F, 4.0F, 1.0F, "module.elytraMotion.distance.desc", "b", () -> this.mode7.is(0), null
   );
   public boolean boolean46 = false;
   public final CooldownTimer zClass06726 = new CooldownTimer();

   public ElytraMotion() {
   }

   @Override
   public void onEnable() {
      this.boolean46 = false;
      super.onEnable();
   }

   @EventTarget
   public void ColorAnimator(EventTriggerKeyEvent var1) {
   }

   @EventTarget
   public void NbtItemSpec(EventTick var1) {
      if (!minecraftClient3.player.isGliding()) {
         this.boolean46 = false;
      } else {
         if (this.call199()) {
            if (EffectEngine.double67() != null) {
               this.boolean46 = true;
            } else if (this.zClass06726.EventModifyMouseRotationInput(300L) && !this.boolean46) {
               ScreenUtils.on23(Items.FIREWORK_ROCKET, Hand.OFF_HAND);
               this.zClass06726.reset();
            }
         } else {
            this.boolean46 = false;
         }
      }
   }

   public boolean call199() {
      Box box = ElytraTarget.elytraTarget.call084();
      if (box == null) {
         return false;
      } else {
         return this.mode7.is(0)
            ? minecraftClient3.player.squaredDistanceTo(box.getCenter())
               <= (double)(this.distance5.getCurrent() * this.distance5.getCurrent())
            : minecraftClient3.player.getBoundingBox().intersects(ElytraTarget.elytraTarget.call084());
      }
   }

   @EventTarget
   public void UiAnimation(PlayerMoveEvent var1) {
      if (this.boolean46) {
         var1.on23(Vec3d.ZERO);
      }
   }

   @EventTarget
   public void ItemServiceBase(PacketEvent var1) {
   }

   public boolean call126() {
      return this.boolean46;
   }
}
