package zenith;

import net.minecraft.util.Hand;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityPose;

public final class ZenithInternal071 implements ZenithInternal140 {
   public static void EventTarget(Entity Entity) {
      l11I1I1ll1Illll1I1l1111l1II.interactionManager.attackEntity(l11I1I1ll1Illll1I1l1111l1II.player, Entity);
      l11I1I1ll1Illll1I1l1111l1II.player.swingHand(Hand.MAIN_HAND);
   }

   public static boolean DrawContextImpl() {
      return l11I1I1ll1Illll1I1l1111l1II.player.hasStatusEffect(StatusEffects.BLINDNESS)
         || l11I1I1ll1Illll1I1l1111l1II.player.hasStatusEffect(StatusEffects.LEVITATION)
         || ZenithInternal066.EventImpl_24(Blocks.COBWEB)
         || l11I1I1ll1Illll1I1l1111l1II.player.isSubmergedInWater()
         || l11I1I1ll1Illll1I1l1111l1II.player.isSwimming()
         || l11I1I1ll1Illll1I1l1111l1II.player.isInLava()
         || l11I1I1ll1Illll1I1l1111l1II.player.isClimbing()
         || !ZenithInternal066.StringHolder_8(EntityPose.STANDING) && l11I1I1ll1Illll1I1l1111l1II.player.isInSneakingPose()
         || l11I1I1ll1Illll1I1l1111l1II.player.getAbilities().flying;
   }

   public static boolean StringHolder_8(PlayerEntityHolder lll111ll1i1l11l1) {
      return lll111ll1i1l11l1.EventTarget(StatusEffects.BLINDNESS)
         || lll111ll1i1l11l1.EventTarget(StatusEffects.LEVITATION)
         || ZenithInternal066.StringHolder_8(lll111ll1i1l11l1.IlIIll1l1lllll1I, Blocks.COBWEB)
         || lll111ll1i1l11l1.l1111IIIllI1l1()
         || lll111ll1i1l11l1.I111lllIII
         || lll111ll1i1l11l1.Il1lIll11l1Il()
         || lll111ll1i1l11l1.l1l1IIllI1IlIIlIII1l()
         || !ZenithInternal066.StringHolder_8(EntityPose.STANDING) && l11I1I1ll1Illll1I1l1111l1II.player.isInSneakingPose()
         || l11I1I1ll1Illll1I1l1111l1II.player.getAbilities().flying;
   }

   public static boolean IdentifierHolder_2() {
      boolean flag = l11I1I1ll1Illll1I1l1111l1II.player.fallDistance > (ZenithInternal143() ? doubleHolder_3.ZenithInternal028(0.15F, 0.7F) : 0.0F)
         && ((double)l11I1I1ll1Illll1I1l1111l1II.player.fallDistance < 0.08 || !PlayerEntityHolder.FileHolder_2(1).I11II1ll1I1lll1l);
      return !l11I1I1ll1Illll1I1l1111l1II.player.isOnGround() && flag
         || Criticals.ll1llII11IIlIl1I1l1I1l1l.Spider() && Criticals.ll1llII11IIlIl1I1l1I1l1l.l111l1IllIlI1l1();
   }

   private static boolean ZenithInternal027() {
      return l11I1I1ll1Illll1I1l1111l1II.player.isOnGround()
         || l11I1I1ll1Illll1I1l1111l1II.player.fallDistance < 0.12F
         || l11I1I1ll1Illll1I1l1111l1II.player.isSwimming();
   }

   private static boolean ZenithInternal143() {
      return false;
   }

   public static boolean EventBus(PlayerEntityHolder lll111ll1i1l11l1) {
      boolean flag = lll111ll1i1l11l1.lllIlI1II > 0.0F
         && ((double)lll111ll1i1l11l1.lllIlI1II < 0.08 || !PlayerEntityHolder.FileHolder_2(2).I11II1ll1I1lll1l);
      return !lll111ll1i1l11l1.I11II1ll1I1lll1l && flag
         || Criticals.ll1llII11IIlIl1I1l1I1l1l.Spider() && Criticals.ll1llII11IIlIl1I1l1I1l1l.l111l1IllIlI1l1();
   }

   private ZenithInternal071() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
