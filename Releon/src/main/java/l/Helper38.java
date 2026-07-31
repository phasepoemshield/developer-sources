package l;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.network.SequencedPacketCreator;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil.Type;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.Full;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.scoreboard.ReadableScoreboardScore;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.number.StyledNumberFormat;
import net.minecraft.text.MutableText;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.glfw.GLFW;

public final class Helper38 implements Helper160 {
   public static void method520(SequencedPacketCreator var0) {
      mc.interactionManager.sendSequencedPacket(mc.world, var0);
   }

   public static void method521(Hand var0) {
      method522(var0, Helper349.method3473());
   }

   public static void method522(Hand var0, Helper336 var1) {
      method520(var2 -> new PlayerInteractItemC2SPacket(var0, var2, var1.method3333(), var1.method3334()));
   }

   public static void method523(Entity var0) {
      mc.player.networkHandler.sendPacket(PlayerInteractEntityC2SPacket.interactAt(var0, false, Hand.MAIN_HAND, var0.getBoundingBox().getCenter()));
      mc.player.networkHandler.sendPacket(PlayerInteractEntityC2SPacket.interact(var0, false, Hand.MAIN_HAND));
   }

   public static void method524() {
      mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(mc.player, Mode.START_FALL_FLYING));
      mc.player.startGliding();
   }

   public static void method525(Packet<?> var0) {
      mc.getNetworkHandler().getConnection().send(var0, null);
   }

   public static void method526(double var0, Helper336 var2) {
      mc.player
         .networkHandler
         .sendPacket(
            new Full(
               mc.player.getX(),
               mc.player.getY() + var0,
               mc.player.getZ(),
               var2.method3333(),
               var2.method3334(),
               mc.player.isOnGround(),
               mc.player.horizontalCollision
            )
         );
   }

   public static String method527(LivingEntity var0) {
      return method528(method529(var0));
   }

   public static String method528(float var0) {
      return String.format("%.1f", var0).replace(",", ".").replace(".0", "");
   }

   public static float method529(LivingEntity var0) {
      float var1 = var0.getHealth() + var0.getAbsorptionAmount();
      if (var0 instanceof PlayerEntity var2) {
         String var3 = Helper128.server;
         switch (var3) {
            case "FunTime":
            case "ReallyWorld":
            case "GulPvP":
               ScoreboardObjective var5 = var2.getScoreboard().getObjectiveForSlot(ScoreboardDisplaySlot.BELOW_NAME);
               if (var5 != null) {
                  MutableText var6 = ReadableScoreboardScore.getFormattedScore(
                     var2.getScoreboard().getScore(var2, var5), var5.getNumberFormatOr(StyledNumberFormat.EMPTY)
                  );

                  try {
                     var1 = Float.parseFloat(Helper133.method1153(var6.getString()));
                  } catch (NumberFormatException var8) {
                  }
               }
         }
      }

      return MathHelper.clamp(var1, 0.0F, var0.getMaxHealth());
   }

   public static void method530() {
      if (mc.player.isSprinting()) {
         float var0 = mc.player.getYaw() * (float) (Math.PI / 180.0);
         mc.player.addVelocityInternal(new Vec3d(-MathHelper.sin(var0) * 0.2F, 0.0, MathHelper.cos(var0) * 0.2F));
      }

      mc.player.velocityDirty = true;
   }

   public static List<BlockPos> method531(BlockPos var0, float var1) {
      return method533(var0, var1, var1, true);
   }

   public static List<BlockPos> method532(BlockPos var0, float var1, float var2) {
      return method533(var0, var1, var2, true);
   }

   public static List<BlockPos> method533(BlockPos var0, float var1, float var2, boolean var3) {
      ArrayList var4 = new ArrayList();
      int var5 = var0.getX();
      int var6 = var0.getY();
      int var7 = var0.getZ();
      int var8 = var3 ? var6 - (int)var2 : var6;

      for (int var9 = var5 - (int)var1; var9 <= var5 + var1; var9++) {
         for (int var10 = var7 - (int)var1; var10 <= var7 + var1; var10++) {
            for (int var11 = var8; var11 <= var6 + var2; var11++) {
               var4.add(new BlockPos(var9, var11, var10));
            }
         }
      }

      return var4;
   }

   public static List<BlockPos> method534(BlockPos var0, BlockPos var1) {
      ArrayList var2 = new ArrayList();

      for (int var3 = var0.getX(); var3 <= var1.getX(); var3++) {
         for (int var4 = var0.getZ(); var4 <= var1.getZ(); var4++) {
            for (int var5 = var0.getY(); var5 <= var1.getY(); var5++) {
               var2.add(new BlockPos(var3, var5, var4));
            }
         }
      }

      return var2;
   }

   public static Type method535(int var0) {
      return var0 < 8 ? Type.MOUSE : Type.KEYSYM;
   }

   public static Stream<Entity> method536() {
      return StreamSupport.stream(mc.world.getEntities().spliterator(), false);
   }

   public static boolean method537(EntityPose var0, Vec3d var1) {
      return mc.player.getWorld().isSpaceEmpty(mc.player, mc.player.getDimensions(var0).getBoxAt(var1).contract(1.0E-7));
   }

   public static boolean method538(RegistryEntry<StatusEffect> var0) {
      return mc.player.getActiveStatusEffects().containsKey(var0);
   }

   public static boolean method539(Block var0) {
      return method540(mc.player.getBoundingBox().expand(-0.001), var0);
   }

   public static boolean method540(Box var0, Block var1) {
      return method542(var0, var1x -> mc.world.getBlockState(var1x).getBlock().equals(var1));
   }

   public static boolean method541(Box var0, List<Block> var1) {
      return method542(var0, var1x -> var1.contains(mc.world.getBlockState(var1x).getBlock()));
   }

   public static boolean method542(Box var0, Predicate<BlockPos> var1) {
      return BlockPos.stream(var0).anyMatch(var1);
   }

   public static boolean method543(Setting9 var0) {
      int var1 = var0.getKey();
      return mc.currentScreen == null && var0.method2701() && method545(method535(var1), var1);
   }

   public static boolean method544(KeyBinding var0) {
      return method545(var0.getDefaultKey().getCategory(), var0.getDefaultKey().getCode());
   }

   public static boolean method545(Type var0, int var1) {
      if (var1 != -1) {
         switch (var0) {
            case KEYSYM:
               return GLFW.glfwGetKey(mc.getWindow().getHandle(), var1) == 1;
            case MOUSE:
               return GLFW.glfwGetMouseButton(mc.getWindow().getHandle(), var1) == 1;
         }
      }

      return false;
   }

   public static boolean method546(BlockPos var0) {
      return method547(mc.world.getBlockState(var0));
   }

   public static boolean method547(BlockState var0) {
      return var0.isAir() || var0.getBlock().equals(Blocks.CAVE_AIR) || var0.getBlock().equals(Blocks.VOID_AIR);
   }

   public static boolean method548(Screen var0) {
      return var0 instanceof ChatScreen;
   }

   public static boolean method549() {
      return mc.player == null || mc.world == null;
   }

   public static HitResult method550(int var0, float var1, float var2) {
      return null;
   }

   public static boolean method551(boolean var0) {
      return var0;
   }

   private Helper38() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
