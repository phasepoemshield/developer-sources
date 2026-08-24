package org.zenith.module;

import org.zenith.core.FileLogger;
import org.zenith.ZenithClient;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.util.MovementUtils;
import org.zenith.core.UiAnimation;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.EffectEngine;

import org.zenith.event.EventEntityCollision;


import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.Vec3d;

@ModuleInfo(
   name = "NoWeb",
   category = Category.MOVEMENT,
   description = "Noweb"
)
public final class NoWeb extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final NoWeb noWeb = new NoWeb();

   public NoWeb() {
   }

   @EventTarget
   public void UiAnimation(EventEntityCollision var1) {
      if (var1.AutoSprint() == Blocks.COBWEB) {
         if (EffectEngine.on23(minecraftClient3.options.jumpKey.getDefaultKey())) {
            minecraftClient3.player.setVelocity(new Vec3d(0.0, 1.0, 0.0));
         } else if (EffectEngine.on23(minecraftClient3.options.sneakKey.getDefaultKey())) {
            minecraftClient3.player.setVelocity(new Vec3d(0.0, -3.0, 0.0));
         }

         if (minecraftClient3.player.input.movementForward != 0.0F || minecraftClient3.player.input.movementSideways != 0.0F) {
            double[] adouble = MovementUtils.FileLogger(0.62F);
            minecraftClient3.player.setVelocity(new Vec3d(adouble[0], minecraftClient3.player.getVelocity().y, adouble[1]));
         }
      }
   }
}
