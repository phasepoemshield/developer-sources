package zenith;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.player.PlayerEntity;

public final class LivingEntityHolder implements ZenithInternal140 {
   private static final doubleHolder_4 lIllI1I1I1l = new doubleHolder_4();
   private static LivingEntity lI1lIIl1ll1I1I1lII111IIIIll1I;

   public static LivingEntity StringHolder_8(
      Iterable<Entity> iterable, float f, boolean flag, List<String> list, List<String> list1, Predicate<LivingEntity> predicate, boolean flag1
   ) {
      if (flag1 && lI1lIIl1ll1I1I1lII111IIIIll1I != null && StringHolder_8(list, lI1lIIl1ll1I1I1lII111IIIIll1I, f, flag, predicate)) {
         return lI1lIIl1ll1I1I1lII111IIIIll1I;
      } else {
         ArrayList arraylist = new ArrayList();

         for (Entity Entity : iterable) {
            if (Entity instanceof LivingEntity) {
               LivingEntity LivingEntity = (LivingEntity)Entity;
               if (StringHolder_8(list, Entity, f, flag, predicate)) {
                  arraylist.add(LivingEntity);
               }
            }
         }

         arraylist.sort(StringHolder_8(Comparator.comparing(LivingEntity -> true), list1));
         lI1lIIl1ll1I1I1lII111IIIIll1I = arraylist.isEmpty() ? null : (LivingEntity)arraylist.getFirst();
         return lI1lIIl1ll1I1I1lII111IIIIll1I;
      }
   }

   public static Comparator<LivingEntity> StringHolder_8(Comparator<LivingEntity> comparator, List<String> list) {
      comparator = comparator.thenComparing(
         (LivingEntity, LivingEntity) -> Boolean.compare(!(LivingEntity instanceof PlayerEntity), !(LivingEntityx instanceof PlayerEntity))
      );
      if (list.contains("module.aura.targetFov")) {
         comparator = comparator.thenComparingDouble(LivingEntityHolder::ByteBufferHolder_2);
      }

      if (list.contains("module.aura.targetArmor")) {
         comparator = comparator.thenComparing(Comparator.<LivingEntity>comparingDouble(ZenithInternal066::byteHolder).reversed());
      }

      if (list.contains("module.aura.targetHp")) {
         comparator = comparator.thenComparingDouble(ZenithInternal066::byteHolder_2);
      }

      if (list.contains("module.aura.targetDistance")) {
         comparator = comparator.thenComparingDouble(l11I1I1ll1Illll1I1l1111l1II.player::squaredDistanceTo);
      }

      return comparator;
   }

   private static double ByteBufferHolder_2(LivingEntity LivingEntity) {
      if (l11I1I1ll1Illll1I1l1111l1II.player == null) {
         return Double.MAX_VALUE;
      } else {
         floatHolder_6 il1ll111liili1ll11liil = new floatHolder_6(
            l11I1I1ll1Illll1I1l1111l1II.player.getYaw(), l11I1I1ll1Illll1I1l1111l1II.player.getPitch()
         );
         net.minecraft.util.math.Vec3d Vec3d = l11I1I1ll1Illll1I1l1111l1II.player.getEyePos();
         floatHolder_6 il1ll111liili1ll11liil1 = floatHolder_6.EventImpl_21(LivingEntity.getBoundingBox().getCenter(), Vec3d);
         return (double)il1ll111liili1ll11liil.ZenithInternal070(il1ll111liili1ll11liil1);
      }
   }

   public static boolean StringHolder_8(List<String> list, Entity Entity, float f, boolean flag, Predicate<LivingEntity> predicate) {
      if (Entity instanceof LivingEntity LivingEntity && StringHolder_8(list, LivingEntity) && predicate.test((LivingEntity)Entity)) {
         return lIllI1I1I1l.StringHolder_8(LivingEntity, f, flag);
      }

      return false;
   }

   public static LivingEntity StringHolder_8(Iterable<Entity> iterable, float f, boolean flag, List<String> list, List<String> list1, boolean flag1) {
      return StringHolder_8(iterable, f, flag, list, list1, LivingEntity -> true, flag1);
   }

   public static boolean StringHolder_8(List<String> list, LivingEntity LivingEntity) {
      if (ConnectThread(LivingEntity)) {
         return false;
      } else if (CallableImpl(LivingEntity)) {
         return false;
      } else {
         return longHolder_5(LivingEntity) ? false : EventBus(list, LivingEntity);
      }
   }

   private static boolean ConnectThread(LivingEntity LivingEntity) {
      return LivingEntity == l11I1I1ll1Illll1I1l1111l1II.player;
   }

   private static boolean CallableImpl(LivingEntity LivingEntity) {
      return !LivingEntity.isAlive() || LivingEntity.getHealth() <= 0.0F;
   }

   private static boolean longHolder_5(LivingEntity LivingEntity) {
      if (LivingEntity instanceof PlayerEntity PlayerEntity && Antibot.IlI1ll1l11IlllI111lIlIll111llI.EventImpl_24(PlayerEntity)) {
         return true;
      }

      return false;
   }

   private static boolean EventBus(List<String> list, LivingEntity LivingEntity) {
      if (LivingEntity instanceof PlayerEntity PlayerEntity) {
         if (floatHolder_3.SecureRandomHolder_2(PlayerEntity.getId())) {
            return false;
         } else if (ZenithClient.getInstance()
            .StringHolder_26()
            .StringHolder_15(PlayerEntity.getGameProfile().getName())) {
            return false;
         } else {
            return ZenithInternal066.byteHolder(PlayerEntity) == 0.0F
               ? list.contains("module.aura.noarmor")
               : list.contains("module.aura.targetPlayers");
         }
      } else if (LivingEntity instanceof MobEntity) {
         return list.contains("module.aura.targetHostile");
      } else {
         return LivingEntity instanceof AnimalEntity ? list.contains("module.aura.targetPeaceful") : !(LivingEntity instanceof ArmorStandEntity);
      }
   }

   private LivingEntityHolder() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
