package ru.metaculture.protection;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.LockSupport;
import lombok.Generated;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public final class O000000O00OOOO implements MinecraftAccessor {
   private static final SecureRandom O0000000000 = new SecureRandom();
   private static final MinecraftClient O00000000000 = MinecraftClient.getInstance();
   public static long O00000000;
   public static int O000000000;
   private static final O0000O00O0 O000000000000 = new O0000O00O0();
   private static boolean O0000000000000;
   private static int O000000000000O;

   public static void O00000000() {
      O00000000++;
   }

   public static void O000000000() {
      O00000000 = 0L;
   }

   public static boolean O0000000000() {
      return O00000000 % 7L == 3L;
   }

   public static PlayerEntity O00000000000() {
      return O00000000000.player;
   }

   public static World O000000000000() {
      return O00000000000.world;
   }

   public static float O00000000(float f) {
      float var1 = 0.2F;
      return (float)(f + (O0000000000.nextGaussian() * 0.2F * 2.0 - 0.2F));
   }

   public static boolean O00000000(int i) {
      return O0000000000.nextInt(i + 1) >= 1.0F * (1.0F / Math.max((float)i, 1.0F));
   }

   public static boolean O0000000000000() {
      return O0000000000.nextInt(2) == 1;
   }

   public static float O00000000(float f, float g) {
      return O0000000000.nextFloat(f, g);
   }

   public static float O000000000000O() {
      return O00000000(0.0F, 1.0F);
   }

   public static int O00000000000O() {
      return O0000000000000() ? 1 : -1;
   }

   public static int O00000000000O0() {
      if (O00000000000.player == null) {
         return -1;
      } else {
         for (int var0 = 0; var0 < 9; var0++) {
            if (O00000000000.player.getInventory().getStack(var0).getItem() instanceof AxeItem) {
               return var0;
            }
         }

         return -1;
      }
   }

   public static Runnable[] O00000000(LivingEntity livingEntity, boolean bl) {
      Runnable[] var2 = new Runnable[]{() -> {}, () -> {}};
      if (bl && O00000000000.player != null) {
         if (livingEntity instanceof PlayerEntity var3) {
            if (!var3.isBlocking()) {
               return var2;
            }

            ItemStack var4 = var3.getMainHandStack();
            ItemStack var5 = var3.getOffHandStack();
            Item var6 = var4.isEmpty() ? null : var4.getItem();
            Item var7 = var5.isEmpty() ? null : var5.getItem();
            if (var6 == Items.SHIELD || var7 == Items.SHIELD) {
               int var9 = O00000000000.player.getInventory().getSelectedSlot();
               int var8;
               if ((var8 = O00000000000O0()) != -1 && var8 != var9) {
                  var2[0] = () -> {
                     if (O00000000000.getNetworkHandler() != null) {
                        O00000000000.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(var8));
                     }
                  };
                  var2[1] = () -> {
                     if (O00000000000.getNetworkHandler() != null) {
                        O00000000000.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(var9));
                     }
                  };
               }
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public static Runnable[] O00000000(boolean bl) {
      Runnable[] var1 = new Runnable[]{() -> {}, () -> {}};
      if (bl && O00000000000.player != null) {
         if (O00000000000.player.isBlocking()) {
            Hand var2 = O00000000000.player.getActiveHand();
            if (var2 == null) {
               return var1;
            }

            var1[0] = () -> O00000000000.getNetworkHandler().sendPacket(new PlayerActionC2SPacket(Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, Direction.DOWN));
            var1[1] = () -> O00000000000.getNetworkHandler()
               .sendPacket(new PlayerInteractItemC2SPacket(var2, 0, O00000000000.player.getYaw(), O00000000000.player.getPitch()));
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static Runnable[] O000000000(boolean bl) {
      Runnable[] var1 = new Runnable[]{() -> {}, () -> {}};
      if (bl && O00000000000.player != null) {
         if (O00000000000.player.isSprinting() && !O00000000000.player.isOnGround() && !O00000000000.player.isSubmergedIn(FluidTags.WATER)) {
            var1[0] = () -> {
               O00000000000.player.setSprinting(false);
               O00000000000.getNetworkHandler().sendPacket(new ClientCommandC2SPacket(O00000000000.player, Mode.STOP_SPRINTING));
            };
            var1[1] = () -> {
               O00000000000.player.setSprinting(true);
               O00000000000.getNetworkHandler().sendPacket(new ClientCommandC2SPacket(O00000000000.player, Mode.START_SPRINTING));
            };
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static boolean O0000000000(boolean bl) {
      if (!bl || O00000000000.player == null) {
         return true;
      } else if (O00000000000.player.isSwimming()) {
         return true;
      } else {
         if (!(O00000000000.player.fallDistance > 0.0)) {
            O000000000 = 2;
         }

         if (O000000000 > 0) {
            O000000000--;
         }

         if (O000000000 == 0 && O00000000000.player.fallDistance > 0.0) {
            return true;
         } else {
            boolean var1 = O00000000000.world.getBlockState(O00000000000.player.getBlockPos()).isOf(Blocks.COBWEB);
            boolean var2 = !O00000000000.player.isJumping() && (O00000000000.player.isTouchingWater() || O00000000000.player.isInLava())
               || O00000000000.player.isSubmergedIn(FluidTags.WATER)
               || O00000000000.player.isSubmergedIn(FluidTags.LAVA)
               || var1;
            return var2
               || !O00000000000.player.isJumping() && O00000000000.player.age > 6 && AttackAura.O00000000O00OO.O000000000("Умные криты")
               || O00000000000.player.isClimbing()
               || O00000000000.player.hasVehicle()
               || O00000000000.player.hasStatusEffect(StatusEffects.BLINDNESS)
               || O00000000000.player.hasStatusEffect(StatusEffects.LEVITATION)
               || O00000000000.player.hasStatusEffect(StatusEffects.SLOW_FALLING)
               || O00000000000.player.getAbilities().flying;
         }
      }
   }

   public static boolean O00000000(LivingEntity livingEntity, Runnable runnable, Runnable runnable2, Hand hand, boolean bl) {
      return O00000000(livingEntity, runnable, runnable2, hand, bl, null, false);
   }

   public static boolean O00000000(LivingEntity livingEntity, Runnable runnable, Runnable runnable2, Hand hand, boolean bl, Runnable runnable3) {
      return O000000O00OOOO.W33.O00000000(livingEntity, runnable, runnable2, hand, bl, runnable3);
   }

   public static void O00000000000OO() {
      O000000O00OOOO.W33.O00000000();
   }

   public static void O0000000000O() {
      O000000O00OOOO.W33.O000000000();
   }

   public static boolean O00000000(LivingEntity livingEntity) {
      return O000000O00OOOO.W33.O00000000(livingEntity);
   }

   static boolean O00000000(LivingEntity livingEntity, Runnable runnable, Runnable runnable2, Hand hand, boolean bl, Runnable runnable3, boolean bl2) {
      if (bl2 && !O000000000(livingEntity)) {
         return false;
      } else {
         if (runnable != null) {
            runnable.run();
         }

         boolean var7 = !bl2 || O000000000(livingEntity);
         if (var7 && livingEntity != null && O00000000000.interactionManager != null && O00000000000.player != null) {
            O00000000000.interactionManager.attackEntity(O00000000000.player, livingEntity);
            if (hand != null) {
               O00000000000.player.swingHand(hand);
            }

            if (bl) {
               O00000000();
            } else {
               O000000000();
            }

            O000000000000.O00000000();
         }

         if (runnable2 != null) {
            runnable2.run();
         }

         if (var7 && livingEntity != null && runnable3 != null) {
            runnable3.run();
         }

         return var7 && livingEntity != null;
      }
   }

   private static boolean O000000000(LivingEntity livingEntity) {
      return livingEntity != null
         && livingEntity == AttackAura.O00000000OO0
         && livingEntity.isAlive()
         && !livingEntity.isRemoved()
         && O00000000000.player != null
         && O00000000000.player.isAlive()
         && O00000000000.world != null
         && O00000000000.interactionManager != null;
   }

   public static long O0000000000O0() {
      if (O00000000000.player == null) {
         return 500L;
      } else {
         double var0 = O00000000000.player.getAttributeValue(EntityAttributes.ATTACK_SPEED);
         float var2 = 0.2F;
         long var3 = (long)(1.0 / var0 * 1000.0 * (1.0F - var2));
         if (AttackAura.O00000000O0000.O000000000("Динамичный")) {
            var3 += ThreadLocalRandom.current().nextLong(40L, 60L);
         } else {
            var3 += 30L;
         }

         return Math.max(var3, 400L);
      }
   }

   public static boolean O00000000(long l) {
      return O000000000000.O00000000((double)(O0000000000O0() + l));
   }

   public static boolean O0000000000O00() {
      return O00000000(0L);
   }

   public static boolean O000000000(long l) {
      return O000000000000.O00000000((double)l);
   }

   public static float O0000000000O0O() {
      return Math.min((float)O000000000000.O000000000() / (float)O0000000000O0(), 1.0F);
   }

   public static float O0000000000OO() {
      return (float)O000000000000.O000000000();
   }

   public static boolean O00000000(LivingEntity livingEntity, double d) {
      return livingEntity != null
         && O000000O0O00.O00000000(MathHelper.wrapDegrees(O00000000000.player.getYaw()), O00000000000.player.getPitch(), (float)d, livingEntity);
   }

   public static boolean O00000000(LivingEntity livingEntity, double d, boolean bl) {
      return livingEntity != null && O00000000000.player != null && O0000O00O00O0O.O00000000000()
         ? O000000O0O00.O0000000000(
            MathHelper.wrapDegrees(O0000O00O00O0O.O00000000(O00000000000.player.getYaw())),
            O0000O00O00O0O.O000000000(O00000000000.player.getPitch()),
            d,
            livingEntity,
            bl
         )
         : false;
   }

   public static boolean O00000000(LivingEntity livingEntity, boolean bl, boolean bl2, boolean bl3, long l, float[] fs) {
      if (bl2 && livingEntity != null && !O000000O0O.O00000000(livingEntity, fs[0], true)) {
         return false;
      } else if (!O00000000(l)) {
         return false;
      } else {
         boolean var7 = O0000000000(bl3);
         if (var7 && bl && !O00000000(livingEntity, fs[0])) {
            var7 = false;
         }

         return var7;
      }
   }

   public static boolean O00000000(LivingEntity livingEntity, boolean bl, boolean bl2, long l, float[] fs) {
      return O00000000(livingEntity, bl, true, bl2, l, fs);
   }

   public static boolean O00000000(LivingEntity livingEntity, float[] fs) {
      return livingEntity != null
         && O00000000(livingEntity, false, false, -80L, fs)
         && !O00000000000.player.isOnGround()
         && !O00000000000.player.isSubmergedIn(FluidTags.WATER)
         && O00000000000.player.getVelocity().y <= 0.0030162615090425808;
   }

   public static boolean O000000000(LivingEntity livingEntity, float[] fs) {
      return livingEntity != null
         && O00000000(livingEntity, false, false, -60L, fs)
         && !O00000000000.player.isOnGround()
         && !O00000000000.player.isSubmergedIn(FluidTags.WATER)
         && O00000000000.player.getVelocity().y <= 0.16477328182606651;
   }

   private static int O000000000O() {
      return 3;
   }

   public static void O0000000000OO0() {
      O0000000000000 = false;
      O000000000000O = 0;
   }

   public static void O00000000(LivingEntity livingEntity, boolean bl, boolean bl2, boolean bl3) {
      if (livingEntity == null || O000000000000O == 0 || !bl3 || livingEntity.hurtTime != 0) {
         O0000000000OO0();
      }

      if (bl3 && livingEntity != null && O000000000(O0000000000() ? 250L : 150L) && O00000000000.player.handSwinging) {
         if (!O0000000000000 && O000000000000O == 0 && livingEntity.hurtTime == 0) {
            O0000000000000 = true;
            O000000000000O = O000000000O();
         }

         if (O0000000000000 && O000000000000O > 0 && (!bl2 || O00000000(livingEntity, 6.0)) && O00000000(livingEntity, () -> {}, () -> {}, Hand.MAIN_HAND, bl)) {
            O000000000000O--;
         }
      }
   }

   @Generated
   private O000000O00OOOO() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   @Generated
   public static O0000O00O0 O0000000000OOO() {
      return O000000000000;
   }

   static final class W33 {
      private static final double O00000000 = 45.0;
      private static final double O000000000 = 49.2;
      private static final double O0000000000 = 4.5;
      private static final long O00000000000 = 250000L;
      private static final long O000000000000 = 120000L;
      private static final Object O0000000000000 = new Object();
      private static final Thread O000000000000O = new Thread(O000000O00OOOO.W33::O0000000000, "Wild Adaptive Tick Edge");
      private static volatile boolean O00000000000O;
      private static volatile boolean O00000000000O0;
      private static volatile long O00000000000OO;
      private static volatile LivingEntity O0000000000O;
      private static volatile Runnable O0000000000O0;
      private static volatile Runnable O0000000000O00;
      private static volatile Runnable O0000000000O0O;
      private static volatile Hand O0000000000OO;
      private static volatile boolean O0000000000OO0;

      private W33() {
      }

      static void O00000000() {
         if (!O00000000000O) {
            synchronized (O0000000000000) {
               if (!O00000000000O) {
                  O00000000000O = true;
                  O000000000000O.start();
               }
            }
         }
      }

      static boolean O00000000(LivingEntity livingEntity, Runnable runnable, Runnable runnable2, Hand hand, boolean bl, Runnable runnable3) {
         O00000000();
         long var6 = System.nanoTime();
         if (!TpsTracker.O000000000(var6)) {
            return O000000O00OOOO.O00000000(livingEntity, runnable, runnable2, hand, bl, runnable3, false);
         } else if (O00000000000O0 && O0000000000O == livingEntity) {
            return false;
         } else {
            double var8 = TpsTracker.O00000000000(var6);
            double var10 = TpsTracker.O0000000000(var6);
            if (!(var10 <= 4.5) && (!(var8 >= 45.0) || !(var8 <= 49.2))) {
               long var12 = TpsTracker.O00000000(var6, 45.0);
               if (var12 <= 250000L) {
                  return O000000O00OOOO.O00000000(livingEntity, runnable, runnable2, hand, bl, runnable3, true);
               } else {
                  O00000000(var6 + var12, livingEntity, runnable, runnable2, hand, bl, runnable3);
                  return false;
               }
            } else {
               return O000000O00OOOO.O00000000(livingEntity, runnable, runnable2, hand, bl, runnable3, true);
            }
         }
      }

      static boolean O00000000(LivingEntity livingEntity) {
         return O00000000000O0 && O0000000000O == livingEntity;
      }

      private static void O00000000(long l, LivingEntity livingEntity, Runnable runnable, Runnable runnable2, Hand hand, boolean bl, Runnable runnable3) {
         synchronized (O0000000000000) {
            O0000000000O = livingEntity;
            O0000000000O0 = runnable;
            O0000000000O00 = runnable2;
            O0000000000OO = hand;
            O0000000000OO0 = bl;
            O0000000000O0O = runnable3;
            O00000000000OO = l;
            O00000000000O0 = true;
         }

         LockSupport.unpark(O000000000000O);
      }

      static void O000000000() {
         synchronized (O0000000000000) {
            O00000000000O0 = false;
            O0000000000O = null;
            O0000000000O0 = null;
            O0000000000O00 = null;
            O0000000000O0O = null;
            O0000000000OO = null;
            O0000000000OO0 = false;
            O00000000000OO = 0L;
         }
      }

      private static void O0000000000() {
         while (true) {
            if (!O00000000000O0) {
               LockSupport.park();
            } else {
               long var0 = O00000000000OO;
               long var2 = var0 - System.nanoTime();
               if (var2 > 120000L) {
                  LockSupport.parkNanos(var2 - 120000L);
               } else {
                  long var4;
                  while ((var4 = System.nanoTime()) < var0 && O00000000000O0 && O00000000000OO == var0) {
                     Thread.onSpinWait();
                  }

                  if (var4 >= var0) {
                     O00000000(var0);
                  }
               }
            }
         }
      }

      private static void O00000000(long l) {
         LivingEntity var2;
         Runnable var3;
         Runnable var4;
         Runnable var5;
         Hand var6;
         boolean var7;
         synchronized (O0000000000000) {
            if (!O00000000000O0 || O00000000000OO != l) {
               return;
            }

            var2 = O0000000000O;
            var3 = O0000000000O0;
            var4 = O0000000000O00;
            var6 = O0000000000OO;
            var7 = O0000000000OO0;
            var5 = O0000000000O0O;
            O00000000000O0 = false;
            O0000000000O = null;
            O0000000000O0 = null;
            O0000000000O00 = null;
            O0000000000O0O = null;
            O0000000000OO = null;
            O0000000000OO0 = false;
            O00000000000OO = 0L;
         }

         try {
            O000000O00OOOO.O00000000(var2, var3, var4, var6, var7, var5, true);
         } catch (Throwable var10) {
         }
      }

      static {
         O000000000000O.setDaemon(true);
      }
   }
}
