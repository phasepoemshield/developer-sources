package org.zenith.module;

import org.zenith.core.EnchantItemSpec;
import org.zenith.core.HudPreviewItem;
import org.zenith.core.CloudRouter;
import org.zenith.ZenithClient;
import org.zenith.util.Item;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.core.ColorAnimator;
import org.zenith.core.UiAnimation;
import org.zenith.core.TextScanner;
import org.zenith.rotation.Rotation;
import org.zenith.rotation.RotationTask;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.EffectEngine;

import org.zenith.event.Event26;
import org.zenith.event.EventTick;
import org.zenith.event.MovementInputEvent;


import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

@ModuleInfo(
   name = "ElytraFly",
   category = Category.MOVEMENT,
   description = "\u0412\u0437\u043b\u0435\u0442\u0430\u0435\u0442 \u0432\u0432\u0435\u0440\u0445 \u0441 \u044d\u043b\u0438\u0442\u0440\u043e\u0439 (HW) - Ported"
)
public final class ElytraFly extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final ElytraFly elytraFly = new ElytraFly();
   boolean val121 = false;

   public ElytraFly() {
   }

   @Override
   public void onDisable() {
      this.val121 = false;
      super.onDisable();
   }

   @EventTarget
   public void TextScanner(MovementInputEvent var1) {
      if (minecraftClient3.player != null) {
         ItemStack itemstack = minecraftClient3.player.getEquippedStack(EquipmentSlot.CHEST);
         if (itemstack.isOf(Items.ELYTRA)) {
            if (minecraftClient3.player.isOnGround()) {
               var1.EnchantItemSpec(true);
               this.val121 = true;
            } else if (!minecraftClient3.player.isGliding()) {
               if (!this.val121) {
                  EffectEngine.double65();
               } else {
                  this.val121 = false;
               }
            } else {
               this.val121 = false;
            }
         }
      }
   }

   @EventTarget
   public void ColorAnimator(Event26 var1) {
      val003.CloudRouter()
         .on23(
            new RotationTask(
               new Rotation(minecraftClient3.player.getYaw(), 0.0F),
               () -> new Rotation(minecraftClient3.player.getYaw(), 0.0F),
               val001.HudPreviewItem()
            ),
            2,
            this
         );
   }

   @EventTarget
   public void UiAnimation(EventTick var1) {
      if (minecraftClient3.player != null && minecraftClient3.world != null) {
         ItemStack itemstack = minecraftClient3.player.getEquippedStack(EquipmentSlot.CHEST);
         if (itemstack.isOf(Items.ELYTRA)) {
            if (minecraftClient3.player.isGliding()) {
               minecraftClient3.player
                  .setVelocity(
                     minecraftClient3.player.getVelocity().x,
                     minecraftClient3.player.getVelocity().y + 0.0305,
                     minecraftClient3.player.getVelocity().z
                  );
            }
         }
      }
   }
}
