// Module: ElytraFly
// Category: movement
// Original class: Elytrafly
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.movement;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Items;
import net.minecraft.util.math.MathHelper;

@ModuleInfo(
   name = "ElytraFly",
   category = Category.MOVEMENT,
   description = ""
)
public final class Elytrafly extends Module {
   public static final Elytrafly l1IlIlIII11 = new Elytrafly();

   private Elytrafly() {
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      super.l1l1lI111l1II1Illl111l1l1ll1l();
   }

   @Override
   public void onEnable() {
      TextHolder.EventImpl_27("ElytraFly РАБОТАЕт ТОЛЬКО НА ВЕРСИИ 1.17.1 ЗАЙДИ С НЕЕ через виа фабрик");
      if (!l11I1I1ll1Illll1I1l1111l1II.player.isOnGround()) {
         TextHolder.EventImpl_27("ElytraFly РАБОТАЕт ТОЛЬКО НА ЗЕМЛЕ");
         this.StringHolder_11(false);
      } else {
         super.l11l1lII();
      }
   }

   @EventTarget
   public void EventImpl_13(EventImpl_22 l11llilil1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player.getEquippedStack(EquipmentSlot.CHEST).getItem().equals(Items.ELYTRA)) {
         l11I1I1ll1Illll1I1l1111l1II.player.setPitch(MathHelper.clamp(l11I1I1ll1Illll1I1l1111l1II.player.getPitch(), -30.0F, 30.0F));
         if (l11I1I1ll1Illll1I1l1111l1II.player.isOnGround()) {
            l11I1I1ll1Illll1I1l1111l1II.player.jump();
         } else {
            if (!l11I1I1ll1Illll1I1l1111l1II.player.isGliding()) {
               ZenithInternal066.lII1II11IIIII1();
            }

            if (l11I1I1ll1Illll1I1l1111l1II.player.isGliding()) {
               net.minecraft.util.math.Vec3d Vec3d = l11I1I1ll1Illll1I1l1111l1II.player.getPos();
               l11I1I1ll1Illll1I1l1111l1II.player.setVelocity(0.0, 0.0, 0.0);
               double d0 = 0.08;
               double d1 = -Math.sin(Math.toRadians((double)l11I1I1ll1Illll1I1l1111l1II.player.getYaw())) * d0;
               double d2 = Math.cos(Math.toRadians((double)l11I1I1ll1Illll1I1l1111l1II.player.getYaw())) * d0;
               l11I1I1ll1Illll1I1l1111l1II.player.setVelocity(d1, l11I1I1ll1Illll1I1l1111l1II.player.age % 2 == 0 ? 0.29 : 0.301, d2);
            }
         }
      }
   }

   @EventTarget
   public void StringHolder_8(EventImpl_32 ll1l11l11l1lli1) {
   }
}
