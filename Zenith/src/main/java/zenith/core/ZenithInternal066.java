package zenith;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import net.minecraft.util.Hand;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.network.packet.Packet;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.entity.EntityPose;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.MutableText;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.client.network.SequencedPacketCreator;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ReadableScoreboardScore;
import net.minecraft.scoreboard.number.StyledNumberFormat;
import net.minecraft.util.ActionResult.IronGolemFlowerFeatureRenderer0;
import net.minecraft.util.ActionResult.IronGolemFlowerFeatureRenderer1;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.PostEffectPass0;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.GlUniform9;
import org.lwjgl.glfw.GLFW;

public final class ZenithInternal066 implements ZenithInternal140 {
   public static void StringHolder_8(SequencedPacketCreator SequencedPacketCreator) {
      l11I1I1ll1Illll1I1l1111l1II.interactionManager.sendSequencedPacket(l11I1I1ll1Illll1I1l1111l1II.world, SequencedPacketCreator);
   }

   public static void lII1II11IIIII1() {
      l11I1I1ll1Illll1I1l1111l1II.player.networkHandler.sendPacket(new ClientCommandC2SPacket(l11I1I1ll1Illll1I1l1111l1II.player, GlUniform9.START_FALL_FLYING));
      l11I1I1ll1Illll1I1l1111l1II.player.startGliding();
   }

   public static void byteHolder(Packet<?> Packet) {
      System.out.println(Packet);
      l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().getConnection().send(Packet, null);
   }

   public static List<BlockPos> StringHolder_8(BlockPos BlockPos, float f) {
      return StringHolder_8(BlockPos, f, f, true);
   }

   public static List<BlockPos> StringHolder_8(BlockPos BlockPos, float f, float f1) {
      return StringHolder_8(BlockPos, f, f1, true);
   }

   public static List<BlockPos> StringHolder_8(BlockPos BlockPos, float f, float f1, boolean flag) {
      ArrayList arraylist = new ArrayList();
      int i = BlockPos.getX();
      int j = BlockPos.getY();
      int k = BlockPos.getZ();
      int l = flag ? j - (int)f1 : j;

      for (int i1 = i - (int)f; (float)i1 <= (float)i + f; i1++) {
         for (int j1 = k - (int)f; (float)j1 <= (float)k + f; j1++) {
            for (int k1 = l; (float)k1 <= (float)j + f1; k1++) {
               arraylist.add(new BlockPos(i1, k1, j1));
            }
         }
      }

      return arraylist;
   }

   public static List<BlockPos> EventImpl_24(BlockPos BlockPos, BlockPos BlockPos) {
      ArrayList arraylist = new ArrayList();

      for (int i = BlockPos.getX(); i <= BlockPosx.getX(); i++) {
         for (int j = BlockPos.getZ(); j <= BlockPosx.getZ(); j++) {
            for (int k = BlockPos.getY(); k <= BlockPosx.getY(); k++) {
               arraylist.add(new BlockPos(i, k, j));
            }
         }
      }

      return arraylist;
   }

   public static net.minecraft.client.util.InputUtil.class_307 GetSettingsHandler(int i) {
      return i < 8 ? net.minecraft.client.util.InputUtil.class_307.MOUSE : net.minecraft.client.util.InputUtil.class_307.KEYSYM;
   }

   public static Stream<Entity> l1IlIIllIIl1I1IlII1ll1III1I11() {
      return StreamSupport.stream(l11I1I1ll1Illll1I1l1111l1II.world.getEntities().spliterator(), false);
   }

   public static boolean StringHolder_8(EntityPose EntityPose) {
      return l11I1I1ll1Illll1I1l1111l1II.player
         .getWorld()
         .isSpaceEmpty(
            l11I1I1ll1Illll1I1l1111l1II.player,
            l11I1I1ll1Illll1I1l1111l1II.player
               .getDimensions(EntityPose)
               .getBoxAt(l11I1I1ll1Illll1I1l1111l1II.player.getPos())
               .contract(1.0E-7)
         );
   }

   public static boolean StringHolder_8(RegistryEntry<StatusEffect> RegistryEntry) {
      return l11I1I1ll1Illll1I1l1111l1II.player.getActiveStatusEffects().containsKey(RegistryEntry);
   }

   public static boolean EventImpl_24(Block Block) {
      return StringHolder_8(l11I1I1ll1Illll1I1l1111l1II.player.getBoundingBox().expand(-0.001), Block);
   }

   public static void StringHolder_8(BlockHitResult BlockHitResult, Hand Hand) {
      if (l11I1I1ll1Illll1I1l1111l1II.interactionManager.interactBlock(l11I1I1ll1Illll1I1l1111l1II.player, Hand, BlockHitResult) instanceof IronGolemFlowerFeatureRenderer0 IronGolemFlowerFeatureRenderer0) {
         if (IronGolemFlowerFeatureRenderer0.swingSource() == IronGolemFlowerFeatureRenderer1.CLIENT) {
            l11I1I1ll1Illll1I1l1111l1II.player.swingHand(Hand);
         }
      }
   }

   public static boolean StringHolder_8(net.minecraft.util.math.Box Box, Block Block) {
      return StringHolder_8(
         Box, (Predicate<BlockPos>)(BlockPos -> l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPos).getBlock().equals(Block))
      );
   }

   public static boolean StringHolder_8(net.minecraft.util.math.Box Box, List<Block> list) {
      return StringHolder_8(
         Box, (Predicate<BlockPos>)(BlockPos -> list.contains(l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPos).getBlock()))
      );
   }

   public static FireworkRocketEntity llI1I11llIIl1lIII1I11IlllI() {
      for (Entity Entity : l11I1I1ll1Illll1I1l1111l1II.world.getEntities()) {
         if (Entity instanceof FireworkRocketEntity FireworkRocketEntity && FireworkRocketEntity.shooter == l11I1I1ll1Illll1I1l1111l1II.player) {
            return FireworkRocketEntity;
         }
      }

      return null;
   }

   public static int lllll1I1l1lIIIllII1IIIl11I() {
      int i = 0;

      while (l11I1I1ll1Illll1I1l1111l1II.player.getAttackCooldownProgress((float)i) < 0.9F && i < 20) {
         i++;
      }

      return i;
   }

   public static boolean StringHolder_8(net.minecraft.util.math.Box Box, Predicate<BlockPos> predicate) {
      return BlockPos.stream(Box).anyMatch(predicate);
   }

   public static boolean StringHolder_8(net.minecraft.client.util.InputUtil.class_306 class_306) {
      return StringHolder_8(class_306.getCategory(), class_306.getCode());
   }

   public static boolean StringHolder_8(BindSetting iii11ll1iiiiiill1lil) {
      int i = iii11ll1iiiiiill1lil.Elytramotion();
      return l11I1I1ll1Illll1I1l1111l1II.currentScreen == null && iii11ll1iiiiiill1lil.isVisible() && StringHolder_8(GetSettingsHandler(i), i);
   }

   public static boolean StringHolder_8(net.minecraft.client.util.InputUtil.class_307 class_307, int i) {
      if (i != -1) {
         switch (class_307) {
            case KEYSYM:
               return GLFW.glfwGetKey(l11I1I1ll1Illll1I1l1111l1II.getWindow().getHandle(), i) == 1;
            case MOUSE:
               return GLFW.glfwGetMouseButton(l11I1I1ll1Illll1I1l1111l1II.getWindow().getHandle(), i) == 1;
         }
      }

      return false;
   }

   public static boolean ZenithInternal072(BlockPos BlockPos) {
      return EventTarget(l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPos));
   }

   public static boolean EventTarget(BlockState BlockState) {
      return BlockState.isAir() || BlockState.getBlock().equals(Blocks.CAVE_AIR) || BlockState.getBlock().equals(Blocks.VOID_AIR);
   }

   public static boolean EventBus(Screen Screen) {
      return Screen instanceof net.minecraft.client.gui.screen.ChatScreen;
   }

   public static boolean lII1IlIll11() {
      return l11I1I1ll1Illll1I1l1111l1II.player == null || l11I1I1ll1Illll1I1l1111l1II.world == null;
   }

   public static void EventBus(Hand Hand) {
      if (l11I1I1ll1Illll1I1l1111l1II.interactionManager.interactItem(l11I1I1ll1Illll1I1l1111l1II.player, Hand) instanceof IronGolemFlowerFeatureRenderer0 IronGolemFlowerFeatureRenderer0
         && IronGolemFlowerFeatureRenderer0.swingSource() == IronGolemFlowerFeatureRenderer1.CLIENT) {
         l11I1I1ll1Illll1I1l1111l1II.player.swingHand(Hand);
      }
   }

   public static float byteHolder_2(LivingEntity LivingEntity) {
      float f = LivingEntity.getHealth() + LivingEntity.getAbsorptionAmount();
      if (LivingEntity instanceof PlayerEntity PlayerEntity) {
         String s = ZenithClient.getInstance().SupplierHolder().getServer();
         switch (s) {
            case "FunTime":
            case "ReallyWorld":
               net.minecraft.scoreboard.ScoreboardObjective ScoreboardObjective = PlayerEntity.getScoreboard().getObjectiveForSlot(ScoreboardDisplaySlot.BELOW_NAME);
               if (ScoreboardObjective != null) {
                  MutableText MutableText = ReadableScoreboardScore.getFormattedScore(
                     PlayerEntity.getScoreboard().getScore(PlayerEntity, ScoreboardObjective), ScoreboardObjective.getNumberFormatOr(StyledNumberFormat.EMPTY)
                  );

                  try {
                     f = Float.parseFloat(PatternHolder.ArmorHud(MutableText.getString()));
                  } catch (NumberFormatException numberformatexception) {
                  }
               }
         }
      }

      return f;
   }

   public static float byteHolder(LivingEntity LivingEntity) {
      return LivingEntity instanceof PlayerEntity PlayerEntity
         ? (float)PlayerEntity.inventory.armor.stream().filter(ItemStack -> !ItemStack.isEmpty()).count()
         : (float)LivingEntity.getArmor();
   }

   public static boolean StringHolder_4(LivingEntity LivingEntity) {
      floatHolder_6 il1ll111liili1ll11liil = floatHolder_6.longHolder_3(
         l11I1I1ll1Illll1I1l1111l1II.player.getBoundingBox().getCenter().subtract(LivingEntity.getEyePos())
      );
      boolean flag = LivingEntity.isUsingItem() && LivingEntity.getActiveItem().getItem().equals(Items.SHIELD);
      boolean flag1 = Math.abs(MathHelper.wrapDegrees(LivingEntity.getYaw() - il1ll111liili1ll11liil.AutoBrewing())) < 60.0F;
      return flag && flag1;
   }

   public static String ZenithInternal128(LivingEntity LivingEntity) {
      return GetSocketHandler(byteHolder_2(LivingEntity));
   }

   public static String GetSocketHandler(float f) {
      return String.format("%.1f", f).replace(",", ".").replace(".0", "");
   }

   public static void StringHolder_8(double d0, floatHolder_6 il1ll111liili1ll11liil) {
      byteHolder(
         new PostEffectPass0(
            l11I1I1ll1Illll1I1l1111l1II.player.getX(),
            l11I1I1ll1Illll1I1l1111l1II.player.getY() + d0,
            l11I1I1ll1Illll1I1l1111l1II.player.getZ(),
            il1ll111liili1ll11liil.AutoBrewing(),
            il1ll111liili1ll11liil.Basefinder(),
            l11I1I1ll1Illll1I1l1111l1II.player.isOnGround(),
            l11I1I1ll1Illll1I1l1111l1II.player.horizontalCollision
         )
      );
   }

   public static BlockPosHolder$Helper ZenithInternal056(BlockPos BlockPos) {
      if (l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPos.add(0, -1, 0)).isSolid()) {
         return new BlockPosHolder$Helper(BlockPos.add(0, -1, 0), Direction.UP);
      } else if (l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPos.add(-1, 0, 0)).isSolid()) {
         return new BlockPosHolder$Helper(BlockPos.add(-1, 0, 0), Direction.EAST);
      } else if (l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPos.add(1, 0, 0)).isSolid()) {
         return new BlockPosHolder$Helper(BlockPos.add(1, 0, 0), Direction.WEST);
      } else if (l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPos.add(0, 0, 1)).isSolid()) {
         return new BlockPosHolder$Helper(BlockPos.add(0, 0, 1), Direction.NORTH);
      } else {
         return l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPos.add(0, 0, -1)).isSolid()
            ? new BlockPosHolder$Helper(BlockPos.add(0, 0, -1), Direction.SOUTH)
            : null;
      }
   }

   private ZenithInternal066() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
