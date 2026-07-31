package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.Settings;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalXZ;
import java.util.List;
import lombok.Generated;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "CreeperFarm",
   O0000000000 = Category.Misc,
   O000000000 = "Автоматический фарм криперов"
)
public class CreeperFarm extends Module {
   private static BlockPos O000000000O;
   private static BlockPos O000000000O0;
   private static final double O000000000O00 = 3.5;
   private static final double O000000000O000 = 15.0;
   private static final double O000000000O00O = 4.0;
   private static final long O000000000O0O = 500L;
   private CreeperFarm.W92 O000000000O0O0 = CreeperFarm.W92.SEARCH;
   private final O0000O00O0 O000000000O0OO = new O0000O00O0();
   private BlockPos[] O000000000OO;
   private int O000000000OO0 = 0;

   public static void O0000000000O0() {
      O000000000O = null;
      O000000000O0 = null;
   }

   @Override
   public void O00000000() {
      if (O0000000000.player != null && O0000000000.world != null) {
         Settings var1 = BaritoneAPI.getSettings();
         var1.allowPlace.value = false;
         var1.allowBreak.value = false;
         var1.legitMine.value = true;
         this.O0000000000OO0();
         this.O000000000OO0 = 0;
         this.O000000000O0O0 = CreeperFarm.W92.SEARCH;
         this.O000000000O0OO.O00000000();
         super.O00000000();
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null && O000000000O != null && O000000000O0 != null) {
         IBaritone var2 = BaritoneAPI.getProvider().getPrimaryBaritone();
         if (PlayerHelper.O0000000000O0()) {
            var2.getPathingBehavior().cancelEverything();
         } else {
            CreeperEntity var3 = this.O000000000O();
            if (var3 != null) {
               Vec3d var9 = O0000000000.player.getPos().subtract(var3.getPos()).normalize();
               Vec3d var11 = O0000000000.player.getPos().add(var9.multiply(15.0));
               this.O000000000O0O0 = CreeperFarm.W92.RETREAT;
               this.O00000000(var2, var11);
               this.O00000000(var11);
            } else {
               ItemEntity var4 = this.O0000000000OO();
               if (var4 != null) {
                  this.O000000000O0O0 = CreeperFarm.W92.LOOTING;
                  Vec3d var10 = var4.getPos();
                  this.O00000000(var2, var10);
                  this.O00000000(var10);
               } else {
                  CreeperEntity var5 = this.O000000000O0();
                  if (var5 != null) {
                     double var6 = O0000000000.player.distanceTo(var5);
                     if (var6 <= 3.5) {
                        this.O000000000O0O0 = CreeperFarm.W92.ATTACK;
                        var2.getPathingBehavior().cancelEverything();
                        if (this.O000000000O0OO.O00000000(500.0)) {
                           O0000000000.interactionManager.attackEntity(O0000000000.player, var5);
                           O0000000000.player.swingHand(Hand.MAIN_HAND);
                           this.O000000000O0OO.O00000000();
                        }
                     } else {
                        this.O000000000O0O0 = CreeperFarm.W92.APPROACH;
                        Vec3d var8 = var5.getPos();
                        this.O00000000(var2, var8);
                        this.O00000000(var8);
                     }
                  } else {
                     this.O00000000(var2);
                  }
               }
            }
         }
      }
   }

   private ItemEntity O0000000000OO() {
      ItemEntity var1 = this.O00000000(Items.GUNPOWDER);
      if (var1 == null) {
         var1 = this.O00000000(Items.EXPERIENCE_BOTTLE);
      }

      if (var1 != null) {
         List var2 = O0000000000.world.getEntitiesByClass(CreeperEntity.class, var1.getBoundingBox().expand(4.0), creeperEntity -> true);
         if (var2.isEmpty()) {
            return var1;
         }
      }

      return null;
   }

   private void O00000000(IBaritone iBaritone) {
      if (this.O000000000OO != null && this.O000000000OO.length != 0) {
         BlockPos var2 = this.O000000000OO[this.O000000000OO0];
         double var3 = O0000000000.player.squaredDistanceTo(var2.getX() + 0.5, var2.getY(), var2.getZ() + 0.5);
         if (var3 < 2.0) {
            this.O000000000OO0 = (this.O000000000OO0 + 1) % this.O000000000OO.length;
            var2 = this.O000000000OO[this.O000000000OO0];
         }

         this.O000000000O0O0 = CreeperFarm.W92.PATROL;
         iBaritone.getCustomGoalProcess().setGoalAndPath(new GoalBlock(var2));
         this.O00000000(new Vec3d(var2.getX() + 0.5, var2.getY(), var2.getZ() + 0.5));
      }
   }

   private void O0000000000OO0() {
      if (O000000000O != null && O000000000O0 != null) {
         int var1 = Math.min(O000000000O.getX(), O000000000O0.getX());
         int var2 = Math.max(O000000000O.getX(), O000000000O0.getX());
         int var3 = Math.min(O000000000O.getZ(), O000000000O0.getZ());
         int var4 = Math.max(O000000000O.getZ(), O000000000O0.getZ());
         int var5 = (int)O0000000000.player.getY();
         this.O000000000OO = new BlockPos[]{
            new BlockPos(var1, var5, var3), new BlockPos(var2, var5, var3), new BlockPos(var2, var5, var4), new BlockPos(var1, var5, var4)
         };
      }
   }

   private void O00000000(IBaritone iBaritone, Vec3d vec3d) {
      iBaritone.getCustomGoalProcess().setGoalAndPath(new GoalXZ((int)vec3d.x, (int)vec3d.z));
   }

   private void O00000000(Vec3d vec3d) {
      if (vec3d != null) {
         double var2 = vec3d.x - O0000000000.player.getX();
         double var4 = vec3d.z - O0000000000.player.getZ();
         float var6 = Math.abs(var2) > Math.abs(var4) ? (var2 > 0.0 ? -90.0F : 90.0F) : (var4 > 0.0 ? 0.0F : 180.0F);
         float var7 = var6 + (float)(Math.random() * 4.0 - 2.0);
      }
   }

   private void O0000000000OOO() {
      BlockPos var1 = BlockPos.ofFloored(
         O0000000000.player.getX(), O0000000000.player.getY() + O0000000000.player.getStandingEyeHeight(), O0000000000.player.getZ()
      );
      if ((
            O0000000000.world.getBlockState(var1).getBlock() instanceof TrapdoorBlock
               || O0000000000.world.getBlockState(var1.up()).getBlock() instanceof TrapdoorBlock
         )
         && O0000000000.player.isOnGround()) {
      }
   }

   private CreeperEntity O000000000O() {
      for (CreeperEntity var3 : O0000000000.world
         .getEntitiesByClass(CreeperEntity.class, O0000000000.player.getBoundingBox().expand(15.0), creeperEntity -> true)) {
         if (var3.isAlive() && var3.getFuseSpeed() > 0) {
            return var3;
         }
      }

      return null;
   }

   private CreeperEntity O000000000O0() {
      Box var1 = Box.enclosing(O000000000O, O000000000O0).expand(1.0);
      List var2 = O0000000000.world.getEntitiesByClass(CreeperEntity.class, var1, creeperEntity -> true);
      CreeperEntity var3 = null;
      double var4 = Double.MAX_VALUE;

      for (CreeperEntity var7 : (List<CreeperEntity>)var2) {
         if (var7.isAlive()) {
            double var8 = O0000000000.player.distanceTo(var7);
            if (var8 < var4) {
               var4 = var8;
               var3 = var7;
            }
         }
      }

      return var3;
   }

   private ItemEntity O00000000(Item item) {
      Box var2 = Box.enclosing(O000000000O, O000000000O0).expand(1.0);
      List var3 = O0000000000.world.getEntitiesByClass(ItemEntity.class, var2, itemEntity -> true);
      ItemEntity var4 = null;
      double var5 = Double.MAX_VALUE;

      for (ItemEntity var8 : (List<ItemEntity>)var3) {
         if (var8.isAlive() && var8.getStack().getItem() == item) {
            double var9 = O0000000000.player.distanceTo(var8);
            if (var9 < var5) {
               var5 = var9;
               var4 = var8;
            }
         }
      }

      return var4;
   }

   @Override
   public void O000000000() {
      BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
      Settings var1 = BaritoneAPI.getSettings();
      var1.allowPlace.value = true;
      var1.allowBreak.value = true;
      var1.legitMine.value = false;
      super.O000000000();
   }

   @Generated
   public static BlockPos O0000000000O00() {
      return O000000000O;
   }

   @Generated
   public static void O00000000(BlockPos blockPos) {
      O000000000O = blockPos;
   }

   @Generated
   public static BlockPos O0000000000O0O() {
      return O000000000O0;
   }

   @Generated
   public static void O000000000(BlockPos blockPos) {
      O000000000O0 = blockPos;
   }

   static enum W92 {
      SEARCH,
      APPROACH,
      ATTACK,
      RETREAT,
      PATROL,
      LOOTING;
   }
}
