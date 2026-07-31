package ru.metaculture.protection;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleAccess(
   O0000000000 = {"lichoday"}
)
@ModuleRegister(
   O00000000 = "AntiCrystal",
   O0000000000 = Category.Combat,
   O000000000 = "Перекрывает блоками опасные базы под кристаллы рядом с вами",
   O00000000000 = {O0000000OO0OOO.RISKY}
)
public class AntiCrystal extends Module {
   private final NumberSetting O000000000O = new NumberSetting("Radius", 4.2F, 2.0F, 6.0F, 0.1F, false);
   private final NumberSetting O000000000O0 = new NumberSetting("Delay", 55.0F, 0.0F, 220.0F, 5.0F, false);
   private final NumberSetting O000000000O00 = new NumberSetting("Reaction", 25.0F, 0.0F, 150.0F, 5.0F, false);
   private final NumberSetting O000000000O000 = new NumberSetting("Yaw Speed", 180.0F, 45.0F, 360.0F, 5.0F, false);
   private final NumberSetting O000000000O00O = new NumberSetting("Pitch Speed", 170.0F, 45.0F, 360.0F, 5.0F, false);
   private final BooleanSetting O000000000O0O = new BooleanSetting("Inventory Swap", true);
   private final BooleanSetting O000000000O0O0 = new BooleanSetting("Restore Slot", false);
   private final BooleanSetting O000000000O0OO = new BooleanSetting("Packet Trigger", true);
   private final BooleanSetting O000000000OO = new BooleanSetting("Rescan", true);
   private final ArrayDeque<AntiCrystal.W26> O000000000OO0 = new ArrayDeque<>();
   private final Set<Long> O000000000OO00 = new HashSet<>();
   private long O000000000OO0O;

   public AntiCrystal() {
      this.O00000000(
         new Setting[]{
            this.O000000000O,
            this.O000000000O0,
            this.O000000000O00,
            this.O000000000O000,
            this.O000000000O00O,
            this.O000000000O0O,
            this.O000000000O0O0,
            this.O000000000O0OO,
            this.O000000000OO
         }
      );
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (this.O000000000O0OO.O0000000000()
         && !O0000O00O0000O.O00000000()
         && o0000000O000OO != null
         && o0000000O000OO.O000000000000().equals(O0000000O000OO.W24.RECEIVE)) {
         if (o0000000O000OO.O00000000000() instanceof BlockUpdateS2CPacket var2) {
            this.O00000000(var2.getPos(), var2.getState());
         } else if (o0000000O000OO.O00000000000() instanceof ChunkDeltaUpdateS2CPacket var3) {
            var3.visitUpdates(this::O00000000);
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (!O0000O00O0000O.O00000000() && O0000000000.interactionManager != null && O0000000000.getNetworkHandler() != null) {
         if (this.O000000000OO.O0000000000()) {
            this.O0000000000O0();
         }

         this.O0000000000O0O();
         long var2 = System.currentTimeMillis();
         if (!((float)(var2 - this.O000000000OO0O) < this.O000000000O0.O0000000000())) {
            AntiCrystal.W26 var4 = this.O00000000(var2);
            if (var4 != null) {
               int var5 = this.O0000000000O00();
               if (var5 >= 0) {
                  if (this.O00000000(var4.base(), var5)) {
                     this.O000000000OO0O = var2;
                     this.O000000000OO00.remove(var4.base().asLong());
                     this.O000000000OO0.remove(var4);
                  }
               }
            }
         }
      } else {
         this.O0000000000OO();
      }
   }

   @Override
   public void O000000000() {
      this.O0000000000OO();
      O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
      O000000O0O0O0.O0000000000000 = 0;
      O000000O0O0O0.O00000000000O0 = null;
      O000000O0O00O.O00000000 = false;
      super.O000000000();
   }

   private void O00000000(BlockPos blockPos, BlockState blockState) {
      if (blockPos != null && blockState != null && this.O00000000(blockState.getBlock()) && this.O0000000000(blockPos)) {
         this.O00000000(blockPos);
      }
   }

   private void O0000000000O0() {
      BlockPos var1 = O0000000000.player.getBlockPos();
      int var2 = MathHelper.ceil(this.O000000000O.O0000000000());

      for (int var3 = -var2; var3 <= var2; var3++) {
         for (int var4 = -2; var4 <= 2; var4++) {
            for (int var5 = -var2; var5 <= var2; var5++) {
               BlockPos var6 = var1.add(var3, var4, var5);
               if (this.O0000000000(var6) && this.O00000000(O0000000000.world.getBlockState(var6).getBlock())) {
                  this.O00000000(var6);
               }
            }
         }
      }
   }

   private void O00000000(BlockPos blockPos) {
      if (this.O00000000000(blockPos)) {
         long var2 = blockPos.asLong();
         if (this.O000000000OO00.add(var2)) {
            this.O000000000OO0.addLast(new AntiCrystal.W26(blockPos.toImmutable(), System.currentTimeMillis()));
         }
      }
   }

   private AntiCrystal.W26 O00000000(long l) {
      AntiCrystal.W26 var3 = null;
      double var4 = Double.MAX_VALUE;

      for (AntiCrystal.W26 var7 : this.O000000000OO0) {
         if (!((float)(l - var7.createdAt()) < this.O000000000O00.O0000000000()) && this.O00000000000(var7.base())) {
            double var8 = this.O000000000(var7.base());
            if (var8 < var4) {
               var4 = var8;
               var3 = var7;
            }
         }
      }

      return var3;
   }

   private double O000000000(BlockPos blockPos) {
      Vec3d var2 = blockPos.toCenterPos();
      Vec3d var3 = O0000000000.player.getPos();
      Vec3d var4 = var2.subtract(var3);
      double var5 = var4.length();
      Vec3d var7 = O0000000000.player.getVelocity();
      double var8 = 0.0;
      if (var7.horizontalLengthSquared() > 1.0E-5 && var4.horizontalLengthSquared() > 1.0E-5) {
         var8 = -var7.normalize().dotProduct(new Vec3d(var4.x, 0.0, var4.z).normalize()) * 0.42;
      }

      Vec3d var10 = O0000000000.player.getRotationVec(1.0F);
      double var11 = var4.lengthSquared() <= 1.0E-5 ? 0.0 : -var10.normalize().dotProduct(var4.normalize()) * 0.22;
      double var13 = Math.abs(var2.y - O0000000000.player.getY()) * 0.18;
      return var5 + var8 + var11 + var13;
   }

   private boolean O0000000000(BlockPos blockPos) {
      return blockPos != null && O0000000000.player != null
         ? O0000000000.player.squaredDistanceTo(blockPos.toCenterPos()) <= this.O000000000O.O0000000000() * this.O000000000O.O0000000000()
         : false;
   }

   private boolean O00000000000(BlockPos blockPos) {
      if (blockPos != null && O0000000000.world != null) {
         BlockState var2 = O0000000000.world.getBlockState(blockPos);
         BlockPos var3 = blockPos.up();
         return this.O00000000(var2.getBlock())
            && O0000000000.world.getBlockState(var3).isAir()
            && O0000000000.world.getOtherEntities(null, Box.of(var3.toCenterPos(), 0.86, 0.86, 0.86)).isEmpty();
      } else {
         return false;
      }
   }

   private boolean O00000000(BlockPos blockPos, int i) {
      int var3 = O0000000000.player.getInventory().getSelectedSlot();
      int var4 = this.O00000000(i, var3);
      if (var4 < 0) {
         return false;
      } else {
         this.O00000000(var4);
         Vec3d var5 = blockPos.toCenterPos().add(0.0, 0.5, 0.0);
         this.O00000000(var5);
         BlockHitResult var6 = new BlockHitResult(var5, Direction.UP, blockPos, false);
         O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var6);
         O0000000000.player.swingHand(Hand.MAIN_HAND);
         if (this.O000000000O0O0.O0000000000() && var3 != var4) {
            this.O00000000(var3);
         }

         return true;
      }
   }

   private int O00000000(int i, int j) {
      if (i >= 0 && i < 9) {
         return i;
      } else if (this.O000000000O0O.O0000000000() && i >= 9 && i <= 35) {
         int var3 = j >= 0 && j < 9 ? j : 0;
         O0000000000.interactionManager.clickSlot(O0000000000.player.currentScreenHandler.syncId, i, var3, SlotActionType.SWAP, O0000000000.player);
         return var3;
      } else {
         return -1;
      }
   }

   private void O00000000(int i) {
      if (i >= 0 && i <= 8 && i != O0000000000.player.getInventory().getSelectedSlot()) {
         O0000000000.player.getInventory().setSelectedSlot(i);
         O0000000000.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(i));
      }
   }

   private int O0000000000O00() {
      int var1 = -1;
      int var2 = Integer.MIN_VALUE;

      for (int var3 = 0; var3 < 36; var3++) {
         ItemStack var4 = O0000000000.player.getInventory().getStack(var3);
         if (this.O00000000(var4)) {
            int var5 = this.O00000000(var4, var3);
            if (var5 > var2) {
               var2 = var5;
               var1 = var3;
            }
         }
      }

      return var1;
   }

   private boolean O00000000(ItemStack itemStack) {
      if (itemStack != null && !itemStack.isEmpty() && itemStack.getItem() instanceof BlockItem var2) {
         Block var5 = var2.getBlock();
         if (var5 != Blocks.AIR && var5 != Blocks.SAND && var5 != Blocks.RED_SAND && var5 != Blocks.GRAVEL && var5 != Blocks.ANVIL) {
            BlockState var4 = var5.getDefaultState();
            return var4.isSolidBlock(O0000000000.world, BlockPos.ORIGIN);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private int O00000000(ItemStack itemStack, int i) {
      Block var3 = ((BlockItem)itemStack.getItem()).getBlock();
      int var4 = i < 9 ? 1000 : 0;
      if (var3 == Blocks.OBSIDIAN) {
         var4 += 80;
      } else if (var3 == Blocks.COBBLESTONE || var3 == Blocks.STONE || var3 == Blocks.DEEPSLATE) {
         var4 += 65;
      } else if (var3 == Blocks.NETHERRACK || var3 == Blocks.DIRT) {
         var4 += 40;
      }

      return var4 + Math.min(64, itemStack.getCount());
   }

   private void O00000000(Vec3d vec3d) {
      Vec3d var2 = vec3d.subtract(O0000000000.player.getEyePos());
      float var3 = (float)Math.toDegrees(Math.atan2(-var2.x, var2.z));
      float var4 = (float)(-Math.toDegrees(Math.atan2(var2.y, Math.hypot(var2.x, var2.z))));
      O000000O0O0O0.O00000000(
         new O000000O0O00OO(var3, MathHelper.clamp(var4, -90.0F, 90.0F)),
         this.O000000000O000.O0000000000(),
         this.O000000000O00O.O0000000000(),
         this.O000000000O000.O0000000000(),
         this.O000000000O00O.O0000000000(),
         2,
         16,
         false
      );
   }

   private boolean O00000000(Block block) {
      return block == Blocks.OBSIDIAN || block == Blocks.BEDROCK;
   }

   private void O0000000000O0O() {
      Iterator var1 = this.O000000000OO0.iterator();
      long var2 = System.currentTimeMillis();

      while (var1.hasNext()) {
         AntiCrystal.W26 var4 = (AntiCrystal.W26)var1.next();
         if (var2 - var4.createdAt() > 2500L || !this.O00000000000(var4.base())) {
            this.O000000000OO00.remove(var4.base().asLong());
            var1.remove();
         }
      }
   }

   private void O0000000000OO() {
      this.O000000000OO0.clear();
      this.O000000000OO00.clear();
   }

   record W26(BlockPos base, long createdAt) {
   }
}
