package org.zenith.module;

import org.zenith.rotation.RotationMLStrategy2;
import org.zenith.util.Item;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.event.Event18;
import org.zenith.module.Module;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.StyledTextBuilder;

import org.zenith.event.Event08;
import org.zenith.event.EventTick;


import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;

@ModuleInfo(
   name = "ClanUpgrade",
   category = Category.PLAYER,
   description = "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u043e\u0435 \u0443\u043b\u0443\u0447\u0448\u0435\u043d\u0438\u0435 \u043a\u043b\u0430\u043d\u0430"
)
public final class ClanUpgrade extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final ClanUpgrade clanUpgrade = new ClanUpgrade();
   public static final float float16 = 90.0F;
   public static final float float17 = 0.0F;
   public float float18 = 0.0F;
   public float float19 = 0.0F;
   public boolean boolean43 = false;

   public ClanUpgrade() {
   }

   @EventTarget
   public void onUpdate(EventTick var1) {
      if (minecraftClient3.player != null && minecraftClient3.world != null && minecraftClient3.interactionManager != null) {
         ItemStack itemstack = minecraftClient3.player.getStackInHand(Hand.MAIN_HAND);
         if (itemstack.getItem() != Items.REDSTONE) {
            StyledTextBuilder.RotationMLStrategy2(
               "\u0412\u043e\u0437\u044c\u043c\u0438\u0442\u0435 \u0440\u0435\u0434\u0441\u0442\u043e\u0443\u043d \u0432 \u0440\u0443\u043a\u0443!"
            );
         } else {
            BlockPos blockpos = minecraftClient3.player.getBlockPos();
            BlockState blockstate = minecraftClient3.world.getBlockState(blockpos);
            if (!this.boolean43) {
               this.float18 = minecraftClient3.player.getPitch();
               this.float19 = minecraftClient3.player.getYaw();
               this.boolean43 = true;
            }

            minecraftClient3.player.setPitch(90.0F);
            minecraftClient3.player.setYaw(0.0F);
            if (blockstate.isAir()) {
               this.Event18(blockpos);
            } else if (blockstate.getBlock() == Blocks.REDSTONE_WIRE) {
               this.Event08(blockpos);
            }
         }
      }
   }

   public void Event18(BlockPos var1) {
      BlockPos blockpos = var1.down();
      BlockState blockstate = minecraftClient3.world.getBlockState(blockpos);
      if (blockstate.isSolid()) {
         Vec3d vec3d = new Vec3d((double)blockpos.getX() + 0.5, (double)blockpos.getY() + 1.0, (double)blockpos.getZ() + 0.5);
         BlockHitResult blockhitresult = new BlockHitResult(vec3d, Direction.UP, blockpos, false);
         minecraftClient3.interactionManager.interactBlock(minecraftClient3.player, Hand.MAIN_HAND, blockhitresult);
         minecraftClient3.player.swingHand(Hand.MAIN_HAND);
      }
   }

   public void Event08(BlockPos var1) {
      minecraftClient3.interactionManager.attackBlock(var1, Direction.UP);
      minecraftClient3.player.swingHand(Hand.MAIN_HAND);
   }

   @Override
   public void onDisable() {
      super.onDisable();
      if (this.boolean43 && minecraftClient3.player != null) {
         minecraftClient3.player.setPitch(this.float18);
         minecraftClient3.player.setYaw(this.float19);
         this.boolean43 = false;
      }
   }

   @Override
   public void onEnable() {
      super.onEnable();
      this.boolean43 = false;
      if (minecraftClient3.player != null) {
         this.float18 = minecraftClient3.player.getPitch();
         this.float19 = minecraftClient3.player.getYaw();
      }
   }
}
