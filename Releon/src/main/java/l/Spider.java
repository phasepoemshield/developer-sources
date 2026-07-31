package l;

import java.util.Comparator;
import java.util.function.Predicate;
import net.minecraft.block.Blocks;
import net.minecraft.block.ButtonBlock;
import net.minecraft.block.CarpetBlock;
import net.minecraft.item.BannerItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;

public class Spider extends Helper242 {
   private final Helper339 stopWatch = new Helper339();
   private final Helper339 carpetStopWatch = new Helper339();
   private final Setting5 mode = new Setting5("Mode", "Select mode")
      .method2381("FunTime", "FunTimeButtons", "FunSky", "FunTimeFlags", "FunTimeMed", "Slime Block", "SpookyTime", "Water")
      .method2383("FunTime");
   private final Helper339 iceWatch = new Helper339();
   private int cooldown;
   private long lastBucketUse;
   private boolean hasWallContact;
   private long waterPlacedAt;
   private boolean waitingWaterPickup;
   private int buttonClimbLayer;

   public Spider() {
      super("Spider", Helper269.MOVEMENT);
      this.setup(new Helper264[]{this.mode});
   }

   @Override
   public void activate() {
      this.stopWatch.method3358();
      this.carpetStopWatch.method3358();
      this.buttonClimbLayer = 0;
   }

   @Override
   public void deactivate() {
      mc.options.jumpKey.setPressed(false);
      mc.options.sneakKey.setPressed(false);
      this.lastBucketUse = 0L;
      this.hasWallContact = false;
      this.waterPlacedAt = 0L;
      this.waitingWaterPickup = false;
      this.buttonClimbLayer = 0;
   }

   @Helper104
   public void method2452(Helper433 var1) {
      if (mc.player != null && mc.world != null) {
         if (this.mode.method2385("FunTimeButtons")) {
            this.method2456(var1);
         } else if (this.mode.method2385("FunTime")) {
            this.method2457(var1);
         } else if (this.mode.method2385("SpookyTime")) {
            this.method2468();
         } else if (this.mode.method2385("FunSky")) {
            this.hasWallContact = mc.player.horizontalCollision;
            this.method2467();
            if (!this.hasWallContact) {
               mc.options.sneakKey.setPressed(false);
            }
         }
      }
   }

   @Helper104
   public void method2453(Event11 var1) {
      if (this.mode.method2385("Jump")) {
         if (mc.player.age % 2 == 0) {
            mc.player.setOnGround(true);
            if (mc.player.age % 4 == 0) {
               Vec3d var14 = mc.player.getVelocity();
               mc.player.setVelocity(var14.x, 0.42, var14.z);
            } else {
               mc.player.jump();
            }
         }
      } else if (!this.mode.method2385("FunTime")) {
         if (System.currentTimeMillis() < 0L) {
            mc.options.jumpKey.setPressed(mc.options.forwardKey.isPressed());
            this.method2464();
            if (!mc.player.horizontalCollision) {
               return;
            }

            if (!this.stopWatch.method3356(110.0)) {
               return;
            }

            int var2 = Helper66.method716(var1x -> this.method2488(mc.player.getInventory().getStack(var1x)));
            if (var2 == -1 && !this.method2462()) {
               Notifications.method1666().method1668("Нужны Рычаги ", 3000L);
               this.setState(false);
            } else {
               if (var2 == -1 || this.method2459(var2)) {
                  mc.player.setOnGround(true);
                  mc.player.jump();
                  Vec3d var3 = mc.player.getVelocity();
               }

               mc.player.fallDistance = 0.0F;
               this.stopWatch.method3358();
            }
         }

         if (this.mode.method2385("Water")) {
            if (!mc.player.horizontalCollision || !this.stopWatch.method3356(110.0)) {
               return;
            }

            int var9 = this.findHotbarSlot(Items.WATER_BUCKET);
            if (var9 == -1) {
               return;
            }

            this.method2496(var9);
            mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
            this.stopWatch.method3358();
         }

         if (this.mode.method2385("Slime Block")) {
            BlockPos var10 = mc.player.getBlockPos();
            BlockPos[] var15 = new BlockPos[]{var10.east(), var10.west(), var10.north(), var10.south()};
            boolean var4 = false;
            BlockPos[] var5 = var15;
            int var6 = var15.length;
            int var7 = 0;

            while (true) {
               if (var7 < var6) {
                  BlockPos var8 = var5[var7];
                  if (mc.world.getBlockState(var8).getBlock() != Blocks.SLIME_BLOCK) {
                     var7++;
                     continue;
                  }

                  var4 = true;
               }

               if (!var4 || !mc.player.horizontalCollision || mc.player.getVelocity().y <= -1.0) {
                  return;
               }

               if (mc.crosshairTarget instanceof BlockHitResult var16) {
                  BlockPos var18 = var16.getBlockPos();
                  if (mc.world.getBlockState(var18).getBlock() == Blocks.AIR) {
                     return;
                  }

                  var7 = Helper66.method716(var0 -> mc.player.getInventory().getStack(var0).getItem() == Items.SLIME_BLOCK);
                  if (var7 != -1) {
                     mc.player.getInventory().selectedSlot = var7;
                     mc.player.setPitch(54.0F);
                     mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var16);
                     mc.player.swingHand(Hand.MAIN_HAND);
                     if (this.cooldown >= 1) {
                        mc.player.setVelocity(mc.player.getVelocity().x, 0.63, mc.player.getVelocity().z);
                        this.cooldown = 0;
                     } else {
                        this.cooldown++;
                     }
                  }
               }
               break;
            }
         }

         if (this.mode.method2385("Ice Walk")) {
            mc.player.setPitch(90.0F);
            int var11 = this.method2474();
            if (var11 == -1) {
               return;
            }

            this.method2491(var11);
         }

         if (this.mode.method2385("FunTimeMed")) {
            if (!mc.player.horizontalCollision) {
               return;
            }

            if (!this.stopWatch.method3356(1.0)) {
               return;
            }

            mc.player.setOnGround(true);
            mc.player.jump();
            int var12 = this.method2484(Items.LIGHTNING_ROD);
            if (var12 != -1) {
               this.method2476(var12);
               mc.player.fallDistance = 0.0F;
               this.stopWatch.method3358();
            } else {
               Notifications.method1666().method1668("Нужен громоотвод", 3000L);
            }
         }

         if (this.mode.method2385("FunTimeFlags")) {
            if (!this.stopWatch.method3356(50.0)) {
               return;
            }

            if (!this.method2481()) {
               return;
            }

            int var13 = this.method2486();
            if (var13 != -1) {
               if (!this.method2478(var13)) {
                  return;
               }

               mc.player.setPitch(90.0F);
               mc.player.fallDistance = 0.0F;
               mc.player.setOnGround(true);
               mc.player.verticalCollision = true;
               mc.player.jump();
               this.stopWatch.method3358();
            } else {
               Notifications.method1666().method1668("Нужен громоотвод", 3000L);
            }
         }

         if (this.mode.method2385("Grief Carpet")) {
            this.method2490();
         }
      }
   }

   private void method2454(int var1) {
      int var2 = mc.player.getInventory().selectedSlot;
      mc.player.getInventory().selectedSlot = var1;
      mc.player.setPitch(75.0F);
      BlockHitResult var3 = this.method2495(mc.player.getYaw(), 75.0F, 4.5);
      if (var3.getType() == Type.BLOCK) {
         mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var3);
      }

      mc.player.getInventory().selectedSlot = var2;
   }

   private void method2455(int var1) {
      int var2 = mc.player.getInventory().selectedSlot;
      float var3 = mc.player.getYaw();
      float var4 = mc.player.getPitch();
      mc.player.getInventory().selectedSlot = var1;
      Direction var5 = this.method2463();
      BlockPos var6 = mc.player.getBlockPos();
      Direction var7 = var5.getOpposite();
      Direction var8 = var5.rotateYClockwise();

      for (int var9 = 2; var9 >= 0; var9--) {
         for (int var10 = -1; var10 <= 1; var10++) {
            BlockPos var11 = var6.offset(var5).offset(var8, var10).up(var9);
            if (!mc.world.getBlockState(var11).isAir()) {
               Vec3d var12 = Vec3d.ofCenter(var11).add(Vec3d.of(var7.getVector()).multiply(0.5));
               this.method2493(var12);
               BlockHitResult var13 = new BlockHitResult(var12, var7, var11, false);
               mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var13);
               mc.player.swingHand(Hand.MAIN_HAND);
            }
         }
      }

      mc.player.setYaw(var3);
      mc.player.setPitch(var4);
      mc.player.getInventory().selectedSlot = var2;
   }

   private boolean method2456(Helper433 var1) {
      mc.options.jumpKey.setPressed(mc.options.forwardKey.isPressed());
      if (!mc.player.horizontalCollision) {
         return true;
      } else {
         int var2 = Helper66.method716(var1x -> this.method2488(mc.player.getInventory().getStack(var1x)));
         boolean var3 = this.method2462();
         if (var2 == -1 && !var3) {
            Notifications.method1666().method1668("Need button", 3000L);
            this.setState(false);
            return true;
         } else if (!this.stopWatch.method3356(180.0)) {
            return true;
         } else {
            var1.method4520(true);
            mc.player.setOnGround(true);
            mc.player.jump();
            mc.player.fallDistance = 0.0F;
            if (var3) {
               this.method2461(var1);
            } else if (var2 != -1) {
               this.method2460(var1, var2);
            }

            this.stopWatch.method3358();
            return true;
         }
      }
   }

   private void method2457(Helper433 var1) {
      if (mc.player.horizontalCollision) {
         int var2 = this.method2484(Items.LEVER);
         if (var2 == -1) {
            Notifications.method1666().method1668("Рычаги не найдены", 3000L);
            this.setState(false);
         } else if (this.stopWatch.method3356(150.0)) {
            if (mc.player.horizontalCollision) {
               var1.method4520(true);
               mc.player.setOnGround(true);
               mc.player.jump();
               mc.player.fallDistance = 0.0F;
               this.method2458(var1, var2);
               this.stopWatch.method3358();
            }
         }
      }
   }

   private void method2458(Helper433 var1, int var2) {
      int var3 = mc.player.getInventory().selectedSlot;
      mc.player.getInventory().selectedSlot = var2;
      float var4 = this.method2466(this.method2463());
      float var5 = 70.0F;
      mc.player.setYaw(var4);
      mc.player.setPitch(var5);
      var1.method4518(var4);
      var1.method4519(var5);
      BlockHitResult var6 = this.method2495(var4, var5, 4.0);
      if (var6.getType() == Type.BLOCK) {
         mc.player.swingHand(Hand.MAIN_HAND);
         mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var6);
      }

      mc.player.getInventory().selectedSlot = var3;
      mc.player.fallDistance = 0.0F;
   }

   private boolean method2459(int var1) {
      int var2 = mc.player.getInventory().selectedSlot;
      float var3 = mc.player.getYaw();
      float var4 = mc.player.getPitch();
      mc.player.getInventory().selectedSlot = var1;
      Direction var5 = this.method2463();
      Direction var6 = var5.getOpposite();
      BlockPos var7 = mc.player.getBlockPos();

      for (int var8 = 1; var8 >= 0; var8--) {
         BlockPos var9 = var7.offset(var5).up(var8);
         BlockPos var10 = var9.offset(var6);
         if (!mc.world.getBlockState(var9).isAir()) {
            if (mc.world.getBlockState(var10).getBlock() instanceof ButtonBlock) {
               mc.player.setYaw(var3);
               mc.player.setPitch(var4);
               mc.player.getInventory().selectedSlot = var2;
               return true;
            }

            if (mc.world.getBlockState(var10).isReplaceable()) {
               Vec3d var11 = Vec3d.ofCenter(var9).add(Vec3d.of(var6.getVector()).multiply(0.5));
               this.method2493(var11);
               BlockHitResult var12 = new BlockHitResult(var11, var6, var9, false);
               ActionResult var13 = mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var12);
               if (var13.isAccepted()) {
                  mc.player.swingHand(Hand.MAIN_HAND);
                  mc.player.setYaw(var3);
                  mc.player.setPitch(var4);
                  mc.player.getInventory().selectedSlot = var2;
                  return true;
               }
            }
         }
      }

      mc.player.setYaw(var3);
      mc.player.setPitch(var4);
      mc.player.getInventory().selectedSlot = var2;
      return false;
   }

   private boolean method2460(Helper433 var1, int var2) {
      int var3 = mc.player.getInventory().selectedSlot;
      mc.player.getInventory().selectedSlot = var2;
      Direction var4 = this.method2463();
      Direction var5 = var4.getOpposite();
      BlockPos var6 = mc.player.getBlockPos();
      boolean var7 = false;

      for (int var8 = 0; var8 <= 2; var8++) {
         int var9 = (this.buttonClimbLayer + var8) % 3;
         BlockPos var10 = var6.offset(var4).up(var9);
         BlockPos var11 = var10.offset(var5);
         if (!mc.world.getBlockState(var10).isAir()) {
            if (mc.world.getBlockState(var11).getBlock() instanceof ButtonBlock) {
               Vec3d var15 = Vec3d.ofCenter(var10).add(Vec3d.of(var5.getVector()).multiply(0.5));
               this.method2493(var15);
               var1.method4518(mc.player.getYaw());
               var1.method4519(mc.player.getPitch());
               this.buttonClimbLayer = (var9 + 1) % 3;
               var7 = true;
               break;
            }

            if (mc.world.getBlockState(var11).isReplaceable()) {
               Vec3d var12 = Vec3d.ofCenter(var10).add(Vec3d.of(var5.getVector()).multiply(0.5));
               this.method2493(var12);
               var1.method4518(mc.player.getYaw());
               var1.method4519(mc.player.getPitch());
               BlockHitResult var13 = new BlockHitResult(var12, var5, var10, false);
               mc.player.swingHand(Hand.MAIN_HAND);
               ActionResult var14 = mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var13);
               if (var14.isAccepted()) {
                  var7 = true;
                  this.buttonClimbLayer = (var9 + 1) % 3;
                  break;
               }
            }
         }
      }

      mc.player.getInventory().selectedSlot = var3;
      mc.player.fallDistance = 0.0F;
      return var7;
   }

   private boolean method2461(Helper433 var1) {
      Direction var2 = this.method2463();
      Direction var3 = var2.getOpposite();
      BlockPos var4 = mc.player.getBlockPos();

      for (int var5 = 0; var5 <= 2; var5++) {
         int var6 = (this.buttonClimbLayer + var5) % 3;
         BlockPos var7 = var4.offset(var2).up(var6);
         BlockPos var8 = var7.offset(var3);
         if (mc.world.getBlockState(var8).getBlock() instanceof ButtonBlock) {
            Vec3d var9 = Vec3d.ofCenter(var7).add(Vec3d.of(var3.getVector()).multiply(0.5));
            this.method2493(var9);
            var1.method4518(mc.player.getYaw());
            var1.method4519(mc.player.getPitch());
            this.buttonClimbLayer = (var6 + 1) % 3;
            return true;
         }
      }

      return false;
   }

   private boolean method2462() {
      Direction var1 = this.method2463();
      Direction var2 = var1.getOpposite();
      BlockPos var3 = mc.player.getBlockPos();

      for (int var4 = 1; var4 >= 0; var4--) {
         BlockPos var5 = var3.offset(var1).up(var4);
         BlockPos var6 = var5.offset(var2);
         if (!mc.world.getBlockState(var5).isAir() && mc.world.getBlockState(var6).getBlock() instanceof ButtonBlock) {
            return true;
         }
      }

      return false;
   }

   private Direction method2463() {
      Direction var1 = mc.player.getHorizontalFacing();
      BlockPos var2 = mc.player.getBlockPos();
      if (!mc.world.getBlockState(var2.offset(var1)).isAir()) {
         return var1;
      } else {
         for (Direction var4 : net.minecraft.util.math.Direction.Type.HORIZONTAL) {
            if (!mc.world.getBlockState(var2.offset(var4)).isAir()) {
               return var4;
            }
         }

         return var1;
      }
   }

   private void method2464() {
      this.method2465(this.method2463());
   }

   private void method2465(Direction var1) {
      float var2 = this.method2466(var1);
      mc.player.setYaw(var2);
      mc.player.setPitch(0.0F);
      mc.player.prevYaw = var2;
      mc.player.prevPitch = 0.0F;
      mc.player.setHeadYaw(var2);
      mc.player.prevHeadYaw = var2;
      mc.player.setBodyYaw(var2);
   }

   private float method2466(Direction var1) {
      return switch (var1) {
         case NORTH -> 180.0F;
         case SOUTH -> 0.0F;
         case WEST -> 90.0F;
         case EAST -> -90.0F;
         default -> mc.player.getYaw();
      };
   }

   private void method2467() {
      int var1 = this.findHotbarSlot(Items.WATER_BUCKET);
      if (var1 != -1) {
         if (mc.player.isTouchingWater()) {
            mc.player.setVelocity(mc.player.getVelocity().x, 0.46, mc.player.getVelocity().z);
         } else if (mc.player.isOnGround()) {
            this.lastBucketUse = 0L;
            this.stopWatch.method3358();
         } else if (this.stopWatch.method3356(120.0)) {
            if (!this.hasWallContact) {
               mc.options.jumpKey.setPressed(false);
               mc.options.sneakKey.setPressed(false);
            } else {
               long var2 = System.currentTimeMillis();
               if (var2 - this.lastBucketUse >= this.method2470()) {
                  mc.options.jumpKey.setPressed(true);
                  this.method2469(var1);
                  mc.options.sneakKey.setPressed(true);
                  this.lastBucketUse = var2;
               }
            }
         }
      }
   }

   private void method2468() {
      int var1 = this.findHotbarSlot(Items.WATER_BUCKET);
      if (var1 != -1) {
         if (mc.player.horizontalCollision && this.stopWatch.method3356(150.0)) {
            this.method2496(var1);
            mc.player.setVelocity(mc.player.getVelocity().x, 0.29F, mc.player.getVelocity().z);
            this.stopWatch.method3358();
         }
      }
   }

   private void method2469(int var1) {
      int var2 = mc.player.getInventory().selectedSlot;
      mc.player.getInventory().selectedSlot = var1;
      float var3 = mc.player.getPitch();
      mc.player.setPitch(-90.0F);
      mc.player.networkHandler.sendPacket(new PlayerInteractItemC2SPacket(Hand.MAIN_HAND, 0, mc.player.getYaw(), mc.player.getPitch()));
      mc.player.setVelocity(mc.player.getVelocity().x, 0.45, mc.player.getVelocity().z);
      mc.player.setPitch(var3);
      mc.player.getInventory().selectedSlot = var2;
   }

   private long method2470() {
      double var1 = this.method2471();
      if (var1 < 5.0) {
         return 450L;
      } else {
         return var1 < 20.0 ? 550L : 650L;
      }
   }

   private double method2471() {
      double var1 = mc.player.getY();

      for (double var3 = var1; var3 > mc.world.getBottomY(); var3 -= 0.1) {
         BlockPos var5 = BlockPos.ofFloored(mc.player.getX(), var3, mc.player.getZ());
         if (!mc.world.getBlockState(var5).isAir()) {
            return Math.max(var1 - (var3 + 1.0), 0.0);
         }
      }

      return 0.0;
   }

   private void method2472(Slot var1) {
      Helper66.method691(var1, Hand.MAIN_HAND, false, true);
      Helper66.method700();
      mc.player.setPitch(75.0F);
      BlockHitResult var2 = this.method2495(mc.player.getYaw(), 75.0F, 4.5);
      if (var2.getType() == Type.BLOCK) {
         mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var2);
      }

      Helper66.method691(var1, Hand.MAIN_HAND, false, true);
   }

   private Slot method2473() {
      return Helper66.method720()
         .sorted(Comparator.comparing(var0 -> var0.equals(Helper66.method718())))
         .filter(var0 -> var0.getStack().getItem() == Items.LILY_PAD)
         .findFirst()
         .orElse(null);
   }

   private int method2474() {
      return Helper66.method716(var0 -> {
         Item var1 = mc.player.getInventory().getStack(var0).getItem();
         return var1 == Items.ICE || var1 == Items.PACKED_ICE || var1 == Items.BLUE_ICE || var1 == Items.SOUL_SAND;
      });
   }

   private void method2475(int var1) {
      BlockPos var2 = mc.player.getBlockPos().down();
      if (mc.world.getBlockState(var2).isReplaceable()) {
         int var3 = mc.player.getInventory().selectedSlot;
         mc.player.getInventory().selectedSlot = var1;
         mc.player.setPitch(80.0F);
         BlockHitResult var4 = this.method2495(mc.player.getYaw(), 80.0F, 4.5);
         mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var4);
         mc.player.swingHand(Hand.MAIN_HAND);
         mc.player.getInventory().selectedSlot = var3;
      }
   }

   private void method2476(int var1) {
      int var2 = mc.player.getInventory().selectedSlot;
      mc.player.getInventory().selectedSlot = var1;
      BlockPos var3 = mc.player.getBlockPos();

      for (int var4 = 1; var4 <= 2; var4++) {
         BlockPos var5 = var3.up(var4);
         if (mc.world.getBlockState(var5).isAir()) {
            this.method2477(var5);
         }
      }

      mc.player.getInventory().selectedSlot = var2;
   }

   private void method2477(BlockPos var1) {
      if (mc.world.getBlockState(var1).isAir()) {
         Vec3d var2 = new Vec3d(var1.getX() + 0.5, var1.getY() + 0.5, var1.getZ() + 0.5);
         BlockHitResult var3 = new BlockHitResult(var2, Direction.UP, var1.down(), false);
         mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var3);
         mc.player.swingHand(Hand.MAIN_HAND);
      }
   }

   private boolean method2478(int var1) {
      int var2 = mc.player.getInventory().selectedSlot;
      float var3 = mc.player.getYaw();
      float var4 = mc.player.getPitch();
      mc.player.getInventory().selectedSlot = var1;
      BlockPos var5 = mc.player.getBlockPos();
      if (!mc.world.getBlockState(var5).isReplaceable()) {
         mc.player.getInventory().selectedSlot = var2;
         return false;
      } else {
         BlockHitResult var6 = this.method2482(var5);
         if (var6 == null) {
            mc.player.getInventory().selectedSlot = var2;
            return false;
         } else {
            this.method2492(var6.getBlockPos());
            ActionResult var7 = mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var6);
            if (var7.isAccepted()) {
               mc.player.swingHand(Hand.MAIN_HAND);
            }

            mc.player.setYaw(var3);
            mc.player.setPitch(var4);
            mc.player.getInventory().selectedSlot = var2;
            return var7.isAccepted();
         }
      }
   }

   private void method2479(int var1) {
      int var2 = mc.player.getInventory().selectedSlot;
      mc.player.getInventory().selectedSlot = var1;
      mc.player.setPitch(80.0F);
      Direction var3 = mc.player.getHorizontalFacing();

      float var4 = switch (var3) {
         case NORTH -> 180.0F;
         case SOUTH -> 0.0F;
         case WEST -> 90.0F;
         case EAST -> 270.0F;
         default -> mc.player.getYaw();
      };
      mc.player.setYaw(var4);
      BlockHitResult var5 = this.method2495(var4, 80.0F, 4.5);
      if (var5.getType() == Type.BLOCK) {
         mc.player.swingHand(Hand.MAIN_HAND);
         mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var5);
      }

      mc.player.getInventory().selectedSlot = var2;
   }

   private boolean method2480(int var1) {
      int var2 = mc.player.getInventory().selectedSlot;
      float var3 = mc.player.getYaw();
      float var4 = mc.player.getPitch();
      mc.player.getInventory().selectedSlot = var1;
      BlockPos var5 = mc.player.getBlockPos();
      if (!mc.world.getBlockState(var5).isReplaceable()) {
         mc.player.getInventory().selectedSlot = var2;
         return false;
      } else {
         BlockHitResult var6 = this.method2482(var5);
         if (var6 == null) {
            mc.player.getInventory().selectedSlot = var2;
            return false;
         } else {
            this.method2492(var6.getBlockPos());
            ActionResult var7 = mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var6);
            if (var7.isAccepted()) {
               mc.player.swingHand(Hand.MAIN_HAND);
            }

            mc.player.setYaw(var3);
            mc.player.setPitch(var4);
            mc.player.getInventory().selectedSlot = var2;
            return var7.isAccepted();
         }
      }
   }

   private boolean method2481() {
      if (!(mc.player.getVelocity().y < -0.12) && !(mc.player.fallDistance > 0.0F)) {
         BlockPos var1 = mc.player.getBlockPos();
         return !mc.world.getBlockState(var1).isReplaceable() ? false : this.method2482(var1) != null;
      } else {
         return false;
      }
   }

   private BlockHitResult method2482(BlockPos var1) {
      Direction[] var2 = new Direction[]{Direction.DOWN, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST};

      for (Direction var6 : var2) {
         BlockPos var7 = var1.offset(var6);
         if (!mc.world.getBlockState(var7).isAir()) {
            Vec3d var8 = Vec3d.ofCenter(var7).add(Vec3d.of(var6.getVector()).multiply(0.5));
            return new BlockHitResult(var8, var6.getOpposite(), var7, false);
         }
      }

      return null;
   }

   private int findHotbarSlot(Item var1) {
      for (int var2 = 0; var2 < 9; var2++) {
         if (mc.player.getInventory().getStack(var2).getItem() == var1) {
            return var2;
         }
      }

      return -1;
   }

   private int findHotbarSlot(Predicate<ItemStack> var1) {
      for (int var2 = 0; var2 < 9; var2++) {
         if (var1.test(mc.player.getInventory().getStack(var2))) {
            return var2;
         }
      }

      return -1;
   }

   private int findInventorySlot(Item var1) {
      for (int var2 = 9; var2 < 36; var2++) {
         if (mc.player.getInventory().getStack(var2).getItem() == var1) {
            return var2;
         }
      }

      return -1;
   }

   private int method2483(Predicate<ItemStack> var1) {
      for (int var2 = 9; var2 < 36; var2++) {
         if (var1.test(mc.player.getInventory().getStack(var2))) {
            return var2;
         }
      }

      return -1;
   }

   private int method2484(Item var1) {
      int var2 = this.findHotbarSlot(var1);
      if (var2 != -1) {
         return var2;
      } else {
         int var3 = this.findInventorySlot(var1);
         if (var3 == -1) {
            return -1;
         } else {
            int var4 = mc.player.getInventory().selectedSlot;
            mc.interactionManager.clickSlot(mc.player.playerScreenHandler.syncId, var3, var4, SlotActionType.SWAP, mc.player);
            return var4;
         }
      }
   }

   private int method2485(Predicate<ItemStack> var1) {
      int var2 = this.findHotbarSlot(var1);
      if (var2 != -1) {
         return var2;
      } else {
         int var3 = this.method2483(var1);
         if (var3 == -1) {
            return -1;
         } else {
            int var4 = mc.player.getInventory().selectedSlot;
            mc.interactionManager.clickSlot(mc.player.playerScreenHandler.syncId, var3, var4, SlotActionType.SWAP, mc.player);
            return var4;
         }
      }
   }

   private int method2486() {
      int var1 = this.findHotbarSlot(this::method2487);
      return var1 != -1 ? var1 : this.findHotbarSlot(this::method2489);
   }

   private boolean method2487(ItemStack var1) {
      return !var1.isEmpty() && var1.getItem() instanceof BannerItem;
   }

   private boolean method2488(ItemStack var1) {
      return !var1.isEmpty() && var1.getItem() instanceof BlockItem var2 && var2.getBlock() instanceof ButtonBlock;
   }

   private boolean method2489(ItemStack var1) {
      return !var1.isEmpty() && var1.getItem() instanceof BlockItem var2
         ? var2.getBlock().getDefaultState().getCollisionShape(mc.world, mc.player.getBlockPos()).isEmpty()
         : false;
   }

   private void method2490() {
      int var1 = Helper66.method716(var0 -> {
         ItemStack var1x = mc.player.getInventory().getStack(var0);
         return !var1x.isEmpty() && var1x.getItem() instanceof BlockItem var2x && var2x.getBlock() instanceof CarpetBlock;
      });
      if (var1 != -1) {
         BlockPos var2 = mc.player.getBlockPos();
         BlockPos var3 = var2.down();
         if (!mc.player.isOnGround() && mc.world.getBlockState(var2).isAir() && !mc.world.getBlockState(var3).isAir() && this.carpetStopWatch.method3356(1.0)) {
            int var4 = mc.player.getInventory().selectedSlot;
            float var5 = mc.player.getYaw();
            float var6 = mc.player.getPitch();
            mc.player.getInventory().selectedSlot = var1;
            this.method2494(var3, Direction.UP);
            mc.player.setYaw(var5);
            mc.player.setPitch(var6);
            mc.player.getInventory().selectedSlot = var4;
            this.carpetStopWatch.method3358();
         }

         BlockPos var7 = mc.player.getBlockPos().down();
         if (mc.player.isOnGround() && mc.world.getBlockState(var7).getBlock() instanceof CarpetBlock) {
            mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(Action.ABORT_DESTROY_BLOCK, var7, Direction.UP));
            mc.player.jump();
            Vec3d var8 = mc.player.getVelocity();
            mc.player.setVelocity(var8.x, 0.4, var8.z);
         }
      }
   }

   private void method2491(int var1) {
      BlockPos var2 = mc.player.getBlockPos().down();
      BlockPos var3 = var2.down();
      if (mc.world.getBlockState(var2).isReplaceable()) {
         if (!mc.world.getBlockState(var3).isAir()) {
            int var4 = mc.player.getInventory().selectedSlot;
            mc.player.getInventory().selectedSlot = var1;
            mc.player.setPitch(90.0F);
            Vec3d var5 = new Vec3d(var3.getX() + 0.5, var3.getY() + 1.0, var3.getZ() + 0.5);
            BlockHitResult var6 = new BlockHitResult(var5, Direction.UP, var3, false);
            mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var6);
            mc.player.getInventory().selectedSlot = var4;
         }
      }
   }

   private void method2492(BlockPos var1) {
      this.method2493(Vec3d.ofCenter(var1));
   }

   private void method2493(Vec3d var1) {
      Vec3d var2 = mc.player.getEyePos();
      double var3 = var1.x - var2.x;
      double var5 = var1.y - var2.y;
      double var7 = var1.z - var2.z;
      double var9 = Math.sqrt(var3 * var3 + var7 * var7);
      float var11 = (float)Math.toDegrees(Math.atan2(var7, var3)) - 90.0F;
      float var12 = (float)(-Math.toDegrees(Math.atan2(var5, var9)));
      mc.player.setYaw(var11);
      mc.player.setPitch(var12);
      mc.player.prevYaw = var11;
      mc.player.prevPitch = var12;
      mc.player.setHeadYaw(var11);
      mc.player.prevHeadYaw = var11;
      mc.player.setBodyYaw(var11);
   }

   private void method2494(BlockPos var1, Direction var2) {
      this.method2492(var1);
      Vec3d var3 = Vec3d.ofCenter(var1);
      BlockHitResult var4 = new BlockHitResult(var3, var2, var1, false);
      mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var4);
      mc.player.swingHand(Hand.MAIN_HAND);
   }

   private BlockHitResult method2495(float var1, float var2, double var3) {
      Vec3d var5 = mc.player.getEyePos();
      Vec3d var6 = Vec3d.fromPolar(var2, var1).normalize();
      Vec3d var7 = var5.add(var6.multiply(var3));
      RaycastContext var8 = new RaycastContext(var5, var7, ShapeType.OUTLINE, FluidHandling.NONE, mc.player);
      return mc.world.raycast(var8);
   }

   private void method2496(int var1) {
      int var2 = mc.player.getInventory().selectedSlot;
      if (var1 != var2) {
         mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(var1));
      }

      mc.player.networkHandler.sendPacket(new PlayerInteractItemC2SPacket(Hand.MAIN_HAND, 0, mc.player.getYaw(), mc.player.getPitch()));
      if (var1 != var2) {
         mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(var2));
      }
   }

   public void method2497(int var1) {
      this.cooldown = var1;
   }

   public void method2498(long var1) {
      this.lastBucketUse = var1;
   }

   public void method2499(boolean var1) {
      this.hasWallContact = var1;
   }

   public void method2500(long var1) {
      this.waterPlacedAt = var1;
   }

   public void method2501(boolean var1) {
      this.waitingWaterPickup = var1;
   }

   public void method2502(int var1) {
      this.buttonClimbLayer = var1;
   }

   public Helper339 method2503() {
      return this.stopWatch;
   }

   public Helper339 method2504() {
      return this.carpetStopWatch;
   }

   public Setting5 method2505() {
      return this.mode;
   }

   public Helper339 method2506() {
      return this.iceWatch;
   }

   public int method2507() {
      return this.cooldown;
   }

   public long method2508() {
      return this.lastBucketUse;
   }

   public boolean method2509() {
      return this.hasWallContact;
   }

   public long method2510() {
      return this.waterPlacedAt;
   }

   public boolean method2511() {
      return this.waitingWaterPickup;
   }

   public int method2512() {
      return this.buttonClimbLayer;
   }
}
