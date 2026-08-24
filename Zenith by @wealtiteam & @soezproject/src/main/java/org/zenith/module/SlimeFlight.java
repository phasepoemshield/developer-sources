package org.zenith.module;

import org.zenith.ZenithClient;
import org.zenith.util.Item;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.core.Easing;
import org.zenith.util.ScreenUtils;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.MediaTrackInfo;

import org.zenith.event.EventTick;
import org.zenith.event.PlayerMoveEvent;


import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

@ModuleInfo(
   name = "SlimeFlight",
   category = Category.MOVEMENT,
   description = ""
)
public final class SlimeFlight extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   int val327;
   public static final SlimeFlight slimeFlight = new SlimeFlight();
   boolean val328 = false;

   public SlimeFlight() {
   }

   @EventTarget
   public void onUpdate(EventTick var1) {
      if (this.val328) {
         minecraftClient3.player.setPitch(60.0F);
         this.val328 = false;
      }
   }

   public Block MediaTrackInfo(BlockPos var1) {
      return minecraftClient3.world.getBlockState(var1).getBlock();
   }

   @EventTarget
   public void Easing(PlayerMoveEvent var1) {
      BlockPos blockpos = new BlockPos(
         minecraftClient3.player.getBlockX() + 1, minecraftClient3.player.getBlockY(), minecraftClient3.player.getBlockZ()
      );
      BlockPos blockpos1 = new BlockPos(
         minecraftClient3.player.getBlockX(), minecraftClient3.player.getBlockY(), minecraftClient3.player.getBlockZ() + 1
      );
      BlockPos blockpos2 = new BlockPos(
         minecraftClient3.player.getBlockX() - 1, minecraftClient3.player.getBlockY(), minecraftClient3.player.getBlockZ()
      );
      BlockPos blockpos3 = new BlockPos(
         minecraftClient3.player.getBlockX(), minecraftClient3.player.getBlockY(), minecraftClient3.player.getBlockZ() - 1
      );
      int i = ScreenUtils.on23(
         var0 -> minecraftClient3.player.getInventory().getStack(var0).getItem() == Items.SLIME_BLOCK
      );
      HitResult hitresult = minecraftClient3.crosshairTarget;
      if (minecraftClient3.player.horizontalCollision) {
         if (this.MediaTrackInfo(blockpos) == Blocks.SLIME_BLOCK
            || this.MediaTrackInfo(blockpos1) == Blocks.SLIME_BLOCK
            || this.MediaTrackInfo(blockpos2) == Blocks.SLIME_BLOCK
            || this.MediaTrackInfo(blockpos3) == Blocks.SLIME_BLOCK) {
            if (!(minecraftClient3.player.getVelocity().y <= -1.0)) {
               if (hitresult instanceof BlockHitResult blockhitresult) {
                  Direction direction = blockhitresult.getSide();
                  if (this.MediaTrackInfo(blockhitresult.getBlockPos()) == Blocks.AIR) {
                     return;
                  }

                  BlockHitResult blockhitresult1 = new BlockHitResult(blockhitresult.getPos(), direction, blockhitresult.getBlockPos(), true);
                  minecraftClient3.player.getInventory().selectedSlot = i;
                  this.val328 = true;
                  if (this.val327 >= 1) {
                     minecraftClient3.interactionManager.interactBlock(minecraftClient3.player, Hand.MAIN_HAND, blockhitresult1);
                     minecraftClient3.player
                        .setVelocity(minecraftClient3.player.getVelocity().x, 0.62, minecraftClient3.player.getVelocity().z);
                     minecraftClient3.player.swingHand(Hand.MAIN_HAND);
                     this.val327 = 0;
                  } else {
                     this.val327++;
                  }
               }
            }
         }
      }
   }
}
