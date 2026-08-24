package org.zenith.module;

import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.core.UiAnimation;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.EventEntityCollision;

import org.zenith.setting.NumberSetting;





import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.Vec3d;

@ModuleInfo(
   name = "NoSweetSlow",
   category = Category.MOVEMENT,
   description = "Noweb"
)
public final class NoSweetSlow extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final NoSweetSlow noSweetSlow = new NoSweetSlow();
   public final NumberSetting speed5 = new NumberSetting(
      "module.noSweetSlow.speed", 1.5F, 0.8F, 1.8F, 0.05F, "module.noSweetSlow.speed.desc", "x"
   );

   public NoSweetSlow() {
   }

   @EventTarget
   public void UiAnimation(EventEntityCollision var1) {
      if (var1.AutoSprint() == Blocks.SWEET_BERRY_BUSH) {
         var1.setCancelled(true);
         minecraftClient3.player
            .slowMovement(
               minecraftClient3.world.getBlockState(var1.BoatHighJump()),
               new Vec3d((double)this.speed5.getCurrent(), 0.75, (double)this.speed5.getCurrent())
            );
      }
   }
}
