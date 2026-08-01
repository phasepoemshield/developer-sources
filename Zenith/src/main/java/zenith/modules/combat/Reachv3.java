// Module: ReachV3
// Category: combat
// Original class: Reachv3
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.combat;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.network.packet.s2c.play.EntityPositionSyncS2CPacket;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.common.DisconnectS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket;
import net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.network.packet.c2s.play.CommandExecutionC2SPacket;

@ModuleInfo(
   name = "ReachV3",
   description = "",
   category = Category.COMBAT
)
public final class Reachv3 extends Module {
   public static final Reachv3 Il11lIlllI111I1l1111 = new Reachv3();
   private final NumberSetting I1II11l1I11Illl11IIl1l1lIl1II = new NumberSetting(
      "module.backtrack.delay", 300.0F, 50.0F, 1000.0F, 50.0F, "module.backtrack.delay.desc", "ms"
   );
   private final BooleanSetting II1lIl1l1llI11II = new BooleanSetting(
      "module.backtrack.renderBox", "module.backtrack.renderBox.desc", true
   );
   private final Queue<Reachv3$II1Il11l111II11IIl> l111111I1IIIll11lI1 = new ConcurrentLinkedQueue<>();
   private net.minecraft.util.math.Vec3d lllIII11IIlll1IllIIl1lIl1II = null;
   private net.minecraft.util.math.Vec3d llIl1I11II1l = null;
   private longHolder IlI1I1l1l1llIl1l1l1l1ll = new longHolder();
   private final longHolder IIlIIll11ll1l11Il1l1I = new longHolder();
   private final longHolder l1llII1lll1I1II = new longHolder();
   private boolean I1Il1llI1l11 = false;
   private net.minecraft.util.math.Box lIlIIIl1Il1l1l = null;

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      this.I1Il1llI1l11 = true;
   }

   public void EventTarget(net.minecraft.util.math.Vec3d Vec3d) {
      if (Vec3d != null && !this.l111111I1IIIll11lI1.isEmpty()) {
         for (Reachv3$II1Il11l111II11IIl liiiiill1iililliil11illli1ll$ii1il11l111ii11iil : this.l111111I1IIIll11lI1) {
            liiiiill1iililliil11illli1ll$ii1il11l111ii11iil.setKeyCode(true);
            if (liiiiill1iililliil11illli1ll$ii1il11l111ii11iil.IllIIlIIll1l1lIIl1IIl() != null
               && liiiiill1iililliil11illli1ll$ii1il11l111ii11iil.IllIIlIIll1l1lIIl1IIl().equals(Vec3d)) {
               break;
            }
         }
      }
   }

   @EventTarget
   public void EventImpl_24(EventImpl_22 l11llilil1) {
      if (this.lI1IIllII11I() == null) {
         this.lllIII11IIlll1IllIIl1lIl1II = null;
         this.lIlIIIl1Il1l1l = null;
         this.llIl1I11II1l = null;
      } else {
         if (this.lllIII11IIlll1IllIIl1lIl1II == null || this.IlI1I1l1l1llIl1l1l1l1ll.HostnameVerifierImpl(1000L)) {
            this.lllIII11IIlll1IllIIl1lIl1II = this.lI1IIllII11I().getPos();
            this.llIl1I11II1l = this.lI1IIllII11I().getPos();
         }

         if (this.lllIII11IIlll1IllIIl1lIl1II != null) {
            this.lIlIIIl1Il1l1l = this.lI1IIllII11I().dimensions.getBoxAt(this.lllIII11IIlll1IllIIl1lIl1II);
         } else {
            this.lIlIIIl1Il1l1l = null;
         }
      }
   }

   private LivingEntity lI1IIllII11I() {
      return Triggerbot.l1lIIII11lI1Il1111IllII1II1lI.lI1IIllII11I() != null
         ? Triggerbot.l1lIIII11lI1Il1111IllII1II1lI.lI1IIllII11I()
         : Aura.ll1II1l1lII11IlII1.lI1IIllII11I();
   }

   @EventTarget
   public void StringHolder_8(EventImpl_9 iiiii1111111i11l1l1i1l1i1li1l) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && this.lI1IIllII11I() != null) {
         net.minecraft.util.math.Vec3d Vec3dx = l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F);
         net.minecraft.util.math.Box Box = l11I1I1ll1Illll1I1l1111l1II.player.getBoundingBox();
         Reachv3$II1Il11l111II11IIl liiiiill1iililliil11illli1ll$ii1il11l111ii11iilxxxx = null;
         Reachv3$II1Il11l111II11IIl liiiiill1iililliil11illli1ll$ii1il11l111ii11iilx = null;
         int i = 0;

         for (Reachv3$II1Il11l111II11IIl liiiiill1iililliil11illli1ll$ii1il11l111ii11iilxx : this.l111111I1IIIll11lI1) {
            if (liiiiill1iililliil11illli1ll$ii1il11l111ii11iilxx.IllIIlIIll1l1lIIl1IIl() != null
               && this.lI1IIllII11I()
                  .dimensions
                  .getBoxAt(liiiiill1iililliil11illli1ll$ii1il11l111ii11iilxx.IllIIlIIll1l1lIIl1IIl())
                  .intersects(l11I1I1ll1Illll1I1l1111l1II.player.getBoundingBox())) {
               liiiiill1iililliil11illli1ll$ii1il11l111ii11iilx = liiiiill1iililliil11illli1ll$ii1il11l111ii11iilxx;
               if (i > 0) {
                  break;
               }

               i++;
            }
         }

         if (liiiiill1iililliil11illli1ll$ii1il11l111ii11iilx != null) {
            liiiiill1iililliil11illli1ll$ii1il11l111ii11iilxxxx = liiiiill1iililliil11illli1ll$ii1il11l111ii11iilx;
         } else {
            double d1 = Double.POSITIVE_INFINITY;
            Reachv3$II1Il11l111II11IIl liiiiill1iililliil11illli1ll$ii1il11l111ii11iilxxx = null;

            for (Reachv3$II1Il11l111II11IIl liiiiill1iililliil11illli1ll$ii1il11l111ii11iilxxxx : this.l111111I1IIIll11lI1) {
               if (liiiiill1iililliil11illli1ll$ii1il11l111ii11iilxxxx.IllIIlIIll1l1lIIl1IIl() != null) {
                  double d0 = l11I1I1ll1Illll1I1l1111l1II.player.squaredDistanceTo(liiiiill1iililliil11illli1ll$ii1il11l111ii11iilxxxx.lIlI1ll1I1lIIII1);
                  if (d0 < d1) {
                     d1 = d0;
                     liiiiill1iililliil11illli1ll$ii1il11l111ii11iilxxx = liiiiill1iililliil11illli1ll$ii1il11l111ii11iilxxxx;
                  }
               }
            }

            liiiiill1iililliil11illli1ll$ii1il11l111ii11iilxxxx = liiiiill1iililliil11illli1ll$ii1il11l111ii11iilxxx;
         }

         net.minecraft.util.math.Vec3d Vec3dx = liiiiill1iililliil11illli1ll$ii1il11l111ii11iilxxxx != null
            ? liiiiill1iililliil11illli1ll$ii1il11l111ii11iilxxxx.IllIIlIIll1l1lIIl1IIl()
            : null;
         this.llIl1I11II1l = Vec3dx;
         this.EventTarget(Vec3dx);
      } else {
         this.llIl1I11II1l = null;
      }
   }

   @EventTarget
   public void EventTarget(EventImpl_34 ll1li1l111llllli1) {
      if (this.lIlIIIl1Il1l1l != null && this.II1lIl1l1llI11II.Spider()) {
         ListHolder_2.StringHolder_8(this.lIlIIIl1Il1l1l, -1, 1.0F);
      }
   }

   @EventTarget
   public void StringHolder_8(PacketHolder ii1l11il1i1i) {
      if (ii1l11il1i1i.longHolder_8()) {
         if (this.IlI1I1l1l1llIl1l1l1l1ll == null) {
            this.IlI1I1l1l1llIl1l1l1l1ll = new longHolder();
         }

         try {
            Packet Packet = ii1l11il1i1i.Swinganimation();
            if (Packet instanceof DisconnectS2CPacket || Packet instanceof PlayerPositionLookS2CPacket) {
               this.IIlIIll11ll1l11Il1l1I.reset();
               this.l1llII1lll1I1II.reset();
            }

            LivingEntity LivingEntity;
            LivingEntity = l11I1I1ll1Illll1I1l1111l1II.world == null ? null : this.lI1IIllII11I();
            label72:
            if (LivingEntity != null) {
               if (this.lllIII11IIlll1IllIIl1lIl1II == null) {
                  return;
               }

               if (Packet instanceof EntityPositionS2CPacket EntityPositionS2CPacket && EntityPositionS2CPacket.entityId() == LivingEntity.getId()) {
                  this.lllIII11IIlll1IllIIl1lIl1II = new net.minecraft.util.math.Vec3d(
                     EntityPositionS2CPacket.change().position().getX(),
                     EntityPositionS2CPacket.change().position().getY(),
                     EntityPositionS2CPacket.change().position().getZ()
                  );
                  this.IlI1I1l1l1llIl1l1l1l1ll.reset();
                  break label72;
               }

               if (Packet instanceof EntityPositionSyncS2CPacket EntityPositionSyncS2CPacket && EntityPositionSyncS2CPacket.id() == LivingEntity.getId()) {
                  this.lllIII11IIlll1IllIIl1lIl1II = EntityPositionSyncS2CPacket.values().position();
                  this.IlI1I1l1l1llIl1l1l1l1ll.reset();
                  break label72;
               }

               if (Packet instanceof EntityS2CPacket EntityS2CPacket
                  && EntityS2CPacket.getEntity(l11I1I1ll1Illll1I1l1111l1II.world) == LivingEntity
                  && this.lllIII11IIlll1IllIIl1lIl1II != null) {
                  this.lllIII11IIlll1IllIIl1lIl1II = this.lllIII11IIlll1IllIIl1lIl1II
                     .add(
                        (double)EntityS2CPacket.getDeltaX() / 4096.0, (double)EntityS2CPacket.getDeltaY() / 4096.0, (double)EntityS2CPacket.getDeltaZ() / 4096.0
                     );
                  this.IlI1I1l1l1llIl1l1l1l1ll.reset();
               }
            }

            if (this.l111111I1IIIll11lI1.isEmpty()
               && (
                  !this.IIlIIll11ll1l11Il1l1I.HostnameVerifierImpl(200L)
                     || l11I1I1ll1Illll1I1l1111l1II.world == null
                     || LivingEntity == null
                     || !this.l1llII1lll1I1II.HostnameVerifierImpl(200L)
               )) {
               return;
            }

            if (Packet instanceof ChatMessageC2SPacket
               || Packet instanceof HealthUpdateS2CPacket
               || Packet instanceof PlaySoundS2CPacket
               || Packet instanceof GameMessageS2CPacket
               || Packet instanceof CommandExecutionC2SPacket) {
               return;
            }

            ii1l11il1i1i.ZenithInternal069();
            net.minecraft.util.math.Vec3d Vec3d = this.StringHolder_8(Packet, LivingEntity) ? this.lllIII11IIlll1IllIIl1lIl1II : null;
            this.l111111I1IIIll11lI1.add(new Reachv3$II1Il11l111II11IIl(Packet, Vec3d));
         } catch (Exception exception) {
            exception.printStackTrace();
         }
      }
   }

   @EventTarget
   public void StringHolder_8(EventImpl_17 illli1llllii1ii111ili) {
      long i = System.currentTimeMillis();
      if (l11I1I1ll1Illll1I1l1111l1II.world == null || l11I1I1ll1Illll1I1l1111l1II.player == null) {
         this.l111111I1IIIll11lI1.clear();
      }

      try {
         this.l111111I1IIIll11lI1
            .removeIf(
               liiiiill1iililliil11illli1ll$ii1il11l111ii11iil -> {
                  boolean flag = (float)(i - liiiiill1iililliil11illli1ll$ii1il11l111ii11iil.I1lll1IlllI1l1IlIl11ll11())
                     >= this.I1II11l1I11Illl11IIl1l1lIl1II.lll1lI1llll1IIllIIIII1lll();
                  boolean flag1 = liiiiill1iililliil11illli1ll$ii1il11l111ii11iil.llIII11llIIl111Illl1IIIII();
                  if (!flag
                     && this.IIlIIll11ll1l11Il1l1I.HostnameVerifierImpl(200L)
                     && !flag1
                     && l11I1I1ll1Illll1I1l1111l1II.world != null
                     && this.lI1IIllII11I() != null) {
                     return false;
                  } else {
                     try {
                        liiiiill1iililliil11illli1ll$ii1il11l111ii11iil.Swinganimation().apply(l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler());
                     } catch (Throwable throwable) {
                        if (throwable instanceof ClassCastException) {
                           return true;
                        }

                        throwable.printStackTrace();
                     }

                     return true;
                  }
               }
            );
      } catch (Exception exception) {
         exception.printStackTrace();
      }

      if (this.I1Il1llI1l11) {
         this.I1Il1llI1l11 = false;
         super.l1l1lI111l1II1Illl111l1l1ll1l();
      }
   }

   private boolean StringHolder_8(Packet<?> Packet, Entity Entity) {
      if (Entity == null) {
         return false;
      } else {
         int i = Entity.getId();
         if (Packet instanceof EntityPositionS2CPacket EntityPositionS2CPacket) {
            return EntityPositionS2CPacket.entityId() == i;
         } else if (Packet instanceof EntityPositionSyncS2CPacket EntityPositionSyncS2CPacket) {
            return EntityPositionSyncS2CPacket.id() == i;
         } else {
            return Packet instanceof EntityS2CPacket EntityS2CPacket ? EntityS2CPacket.getEntity(l11I1I1ll1Illll1I1l1111l1II.world) == Entity : false;
         }
      }
   }

   public net.minecraft.util.math.Vec3d IlII1Ill() {
      return this.lllIII11IIlll1IllIIl1lIl1II;
   }

   public void ZenithInternal095(net.minecraft.util.math.Vec3d Vec3d) {
      this.lllIII11IIlll1IllIIl1lIl1II = Vec3d;
   }

   public net.minecraft.util.math.Vec3d IIIlIII1llI1I1ll11Il1lII() {
      return this.llIl1I11II1l;
   }
}
