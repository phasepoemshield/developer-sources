package ru.metaculture.protection;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleAccess(
   O0000000000 = {"lichoday"}
)
@ModuleRegister(
   O00000000 = "ClanUpgrade",
   O0000000000 = Category.Misc,
   O000000000 = "Прокачивает за вас клан",
   O00000000000 = {O0000000OO0OOO.RISKY}
)
public class ClanUpgrade extends Module {
   private static final String O000000000O = "Факел";
   private static final String O000000000O0 = "Красной пылью";
   private static final Item[] O000000000O00 = new Item[]{Items.TORCH, Items.REDSTONE_TORCH};
   private static final Item[] O000000000O000 = new Item[]{Items.REDSTONE};
   private static final int O000000000O00O = 545;
   private static final int O000000000O0O = 1;
   private static final float O000000000O0O0 = -1170.1321F;
   private static final float O000000000O0OO = 90.0F;
   private static final float O000000000OO = 180.0F;
   private static final ClanUpgrade.W88[] O000000000OO0 = new ClanUpgrade.W88[]{
      new ClanUpgrade.W88(7, 1, true),
      new ClanUpgrade.W88(11, 0, true),
      new ClanUpgrade.W88(28, 0, false),
      new ClanUpgrade.W88(31, 0, true),
      new ClanUpgrade.W88(32, 0, false),
      new ClanUpgrade.W88(34, 0, true),
      new ClanUpgrade.W88(539, 0, false),
      new ClanUpgrade.W88(539, 1, false)
   };
   private final ModeSetting O000000000OO00 = new ModeSetting("Режим", "Красной пылью", "Факел", "Красной пылью");
   private final O000000OO O000000000OO0O = new O000000OO();
   private int O000000000OOO;
   private boolean O000000000OOO0;
   private boolean O000000000OOOO;

   public ClanUpgrade() {
      this.O00000000(new Setting[]{this.O000000000OO00});
   }

   @Override
   public void O00000000() {
      this.O000000000O0();
      super.O00000000();
   }

   @Override
   public void O000000000() {
      this.O000000000OO0O.O00000000();
      this.O0000000000OOO();
      this.O000000000O0();
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null && O0000000000.getNetworkHandler() != null) {
         Item[] var2 = this.O0000000000O0();
         if (!this.O00000000(var2)) {
            ChatUtil.O00000000("§c[ClanUpgrade] §fНет предметов для режима: " + this.O000000000OO00.O0000000000());
            this.O000000000O();
         } else {
            BlockPos var3 = O0000000000.player.getBlockPos().down();
            BlockState var4 = O0000000000.world.getBlockState(var3);
            if (!var4.isReplaceable() && var4.getFluidState().isEmpty()) {
               this.O0000000000O00();
               if (!this.O0000000000O0O()) {
                  this.O0000000000OO0();
               } else {
                  this.O0000000000OO();
                  this.O00000000(var3, var3.up());
                  this.O000000000OOO++;
                  if (this.O000000000OOO >= 545) {
                     this.O000000000OOO = 0;
                     this.O000000000OOO0 = false;
                     this.O000000000OOOO = false;
                  }
               }
            } else {
               this.O0000000000OO0();
            }
         }
      }
   }

   private Item[] O0000000000O0() {
      return this.O000000000OO00.O000000000("Факел") ? O000000000O00 : O000000000O000;
   }

   private boolean O00000000(Item[] items) {
      ItemStack var2 = O0000000000.player.getInventory().getStack(1);
      if (this.O00000000(var2, items)) {
         this.O000000000(1);
         return true;
      } else {
         int var3 = this.O000000000(items);
         if (var3 == -1) {
            return false;
         } else {
            this.O00000000(var3);
            this.O000000000(1);
            return this.O00000000(O0000000000.player.getInventory().getStack(1), items);
         }
      }
   }

   private int O000000000(Item[] items) {
      for (int var2 = 0; var2 < 36; var2++) {
         if (var2 != 1 && this.O00000000(O0000000000.player.getInventory().getStack(var2), items)) {
            return var2;
         }
      }

      return -1;
   }

   private boolean O00000000(ItemStack itemStack, Item[] items) {
      if (itemStack != null && !itemStack.isEmpty()) {
         for (Item var6 : items) {
            if (itemStack.isOf(var6)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private void O00000000(int i) {
      if (i != 1) {
         int var2 = i < 9 ? 36 + i : i;
         O0000000000.interactionManager.clickSlot(O0000000000.player.playerScreenHandler.syncId, var2, 1, SlotActionType.SWAP, O0000000000.player);
      }
   }

   private void O000000000(int i) {
      if (i >= 0 && i <= 8) {
         if (O0000000000.player.getInventory().getSelectedSlot() != i) {
            O0000000000.player.getInventory().setSelectedSlot(i);
            O0000000000.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(i));
         }
      }
   }

   private void O0000000000O00() {
      this.O000000000OO0O.O00000000(new O000000O0O00OO(-1170.1321F, 90.0F), 180.0F, 180.0F, 1, 15);
   }

   private boolean O0000000000O0O() {
      float var1 = Math.abs(MathHelper.wrapDegrees(-1170.1321F - O0000000000.player.getYaw()));
      float var2 = Math.abs(90.0F - O0000000000.player.getPitch());
      return var1 <= 1.0F && var2 <= 1.0F;
   }

   private void O00000000(BlockPos blockPos, BlockPos blockPos2) {
      for (ClanUpgrade.W88 var6 : O000000000OO0) {
         if (var6.tick == this.O000000000OOO) {
            if (var6.button == 1) {
               this.O000000000OOOO = var6.press;
               O0000000000.options.useKey.setPressed(this.O000000000OOOO);
               if (var6.press) {
                  this.O00000000(blockPos);
               }
            } else if (var6.button == 0) {
               this.O000000000OOO0 = var6.press;
               O0000000000.options.attackKey.setPressed(this.O000000000OOO0);
               if (var6.press) {
                  this.O000000000(blockPos2);
               } else {
                  O0000000000.interactionManager.cancelBlockBreaking();
               }
            }
         }
      }
   }

   private void O00000000(BlockPos blockPos) {
      if (this.O00000000(O0000000000.player.getMainHandStack(), this.O0000000000O0())) {
         Vec3d var2 = new Vec3d(blockPos.getX() + 0.5, blockPos.getY() + 1.0, blockPos.getZ() + 0.5);
         BlockHitResult var3 = new BlockHitResult(var2, Direction.UP, blockPos, false);
         ActionResult var4 = O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var3);
         if (var4 != ActionResult.PASS && var4 != ActionResult.FAIL) {
            O0000000000.player.swingHand(Hand.MAIN_HAND);
         } else {
            var4 = O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
            if (var4 != ActionResult.PASS && var4 != ActionResult.FAIL) {
               O0000000000.player.swingHand(Hand.MAIN_HAND);
            }
         }
      }
   }

   private void O000000000(BlockPos blockPos) {
      BlockState var2 = O0000000000.world.getBlockState(blockPos);
      if (this.O00000000(var2) || !var2.isReplaceable()) {
         O0000000000.interactionManager.attackBlock(blockPos, Direction.UP);
         O0000000000.player.swingHand(Hand.MAIN_HAND);
      }
   }

   private void O0000000000OO() {
      this.O000000000(1);
      O0000000000.options.forwardKey.setPressed(false);
      O0000000000.options.backKey.setPressed(false);
      O0000000000.options.leftKey.setPressed(false);
      O0000000000.options.rightKey.setPressed(false);
      O0000000000.options.jumpKey.setPressed(false);
      O0000000000.options.sneakKey.setPressed(false);
      O0000000000.options.sprintKey.setPressed(false);
      O0000000000.options.useKey.setPressed(this.O000000000OOOO);
      O0000000000.options.attackKey.setPressed(this.O000000000OOO0);
      if (O0000000000.player.isSprinting()) {
         O0000000000.player.setSprinting(false);
      }
   }

   private void O0000000000OO0() {
      this.O000000000OOO0 = false;
      this.O000000000OOOO = false;
      this.O0000000000OO();
   }

   private void O0000000000OOO() {
      if (O0000000000.options != null) {
         O0000000000.options.forwardKey.setPressed(false);
         O0000000000.options.backKey.setPressed(false);
         O0000000000.options.leftKey.setPressed(false);
         O0000000000.options.rightKey.setPressed(false);
         O0000000000.options.jumpKey.setPressed(false);
         O0000000000.options.sneakKey.setPressed(false);
         O0000000000.options.sprintKey.setPressed(false);
         O0000000000.options.useKey.setPressed(false);
         O0000000000.options.attackKey.setPressed(false);
      }
   }

   private boolean O00000000(BlockState blockState) {
      Block var2 = blockState.getBlock();
      return var2 == Blocks.REDSTONE_WIRE
         || var2 == Blocks.TORCH
         || var2 == Blocks.WALL_TORCH
         || var2 == Blocks.REDSTONE_TORCH
         || var2 == Blocks.REDSTONE_WALL_TORCH;
   }

   private void O000000000O() {
      if (this.O0000000000000) {
         this.a_();
      }
   }

   private void O000000000O0() {
      this.O000000000OOO = 0;
      this.O000000000OOO0 = false;
      this.O000000000OOOO = false;
   }

   record W88(int tick, int button, boolean press) {
   }
}
