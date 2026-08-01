package zenith;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.entity.ItemEntity;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.common.DisconnectS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.common.ResourcePackStatusC2SPacket;
import net.minecraft.network.packet.c2s.play.CommandExecutionC2SPacket;

@ModuleInfo(
   name = "Blink",
   description = "Queues outgoing packets until disabled",
   category = Category.COMBAT
)
public final class Blink extends Module {
   public static final Blink IIIlII1Il1l111lI1 = new Blink();
   private static final long l1IIlIIlI11lII1 = 1000L;
   private static final double lIlIlIII1I11l11II11ll1 = 1.5;
   private final NumberSetting II1I11IIl = new NumberSetting(
      "module.blink.packetsPerSecond", 283.0F, 1.0F, 500.0F, 1.0F, "module.blink.packetsPerSecond.desc", "pps"
   );
   private final Queue<Blink$II1Il11l111II11IIl> llIIIII1Il11llIllI1I1l1ll1lll = new ConcurrentLinkedQueue<>();
   private final Set<Integer> lll1I1lIl1l1III11l1IIII = new HashSet<>();
   private volatile boolean l111l1IlI11llll11II;
   private boolean IIl1llI1Il111I11I111II;
   private boolean I1l111ll1I;
   private long IlIIl1llI1lI1;
   private long IllllIll11lIlI1Il11lllII1IlI1;
   private double lIllI1lI1Ill1I;
   private net.minecraft.util.math.Vec3d IlI1Il111lIlIl11I;

   private Blink() {
   }

   @Override
   public void onEnable() {
      this.llIIIII1Il11llIllI1I1l1ll1lll.clear();
      this.I1Ill1Il1I1lIlIIIl11llI();
      if (!this.I1l111ll1I) {
         this.I1l111ll1I = true;
         super.l11l1lII();
      }
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      if (this.I1l111ll1I) {
         if (!this.llIIIII1Il11llIllI1I1l1ll1lll.isEmpty() && l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler() != null) {
            this.lIl11IllIlI1I1l();
            this.I11l1IIIllIl();
         } else {
            this.l11I1I11I1();
         }
      }
   }

   @EventTarget
   public void StringHolder_8(PacketHolder ii1l11il1i1i) {
      if (ii1l11il1i1i.longHolder_8() && ii1l11il1i1i.Swinganimation() != null) {
         if (l11I1I1ll1Illll1I1l1111l1II.player != null && !l11I1I1ll1Illll1I1l1111l1II.player.isDead()) {
            if (ii1l11il1i1i.Swinganimation() instanceof DisconnectS2CPacket || ii1l11il1i1i.Swinganimation() instanceof PlayerPositionLookS2CPacket) {
               this.lllllIIll1Ill11l1111l1l11();
               if (this.l111l1IlI11llll11II) {
                  this.l11I1I11I1();
               }
            }
         } else {
            this.lllllIIll1Ill11l1111l1l11();
            if (this.Spider()) {
               this.StringHolder_32(false);
            } else if (this.l111l1IlI11llll11II) {
               this.l11I1I11I1();
            }
         }
      }
   }

   @EventTarget
   public void EventBus(EventImpl_17 illli1llllii1ii111ili) {
      if (this.l111l1IlI11llll11II) {
         this.I11l1IIIllIl();
      }
   }

   @EventTarget(
      ZenithInternal095 = 0
   )
   public void StringHolder_8(PacketHolder_3 lllill11l1lll1iii1lli11ll1) {
      if (!lllill11l1lll1iii1lli11ll1.Event() && !this.IIl1llI1Il111I11I111II && lllill11l1lll1iii1lli11ll1.Swinganimation() != null) {
         Packet Packet = lllill11l1lll1iii1lli11ll1.Swinganimation();
         if (this.l111l1IlI11llll11II) {
            lllill11l1lll1iii1lli11ll1.ZenithInternal069();
            this.EventTarget(Packet);
         } else if (l11I1I1ll1Illll1I1l1111l1II.player == null || l11I1I1ll1Illll1I1l1111l1II.world == null) {
            this.lllllIIll1Ill11l1111l1l11();
         } else if (!this.EventBus(Packet)) {
            lllill11l1lll1iii1lli11ll1.ZenithInternal069();
            this.EventTarget(Packet);
         }
      }
   }

   public boolean I1IllI11IIIllllI() {
      return this.l111l1IlI11llll11II || this.IIl1llI1Il111I11I111II;
   }

   private boolean EventBus(Packet<?> Packet) {
      return Packet instanceof ChatMessageC2SPacket || Packet instanceof CommandExecutionC2SPacket || Packet instanceof ResourcePackStatusC2SPacket;
   }

   private void EventTarget(Packet<?> Packet) {
      this.llIIIII1Il11llIllI1I1l1ll1lll.add(new Blink$II1Il11l111II11IIl(Packet, this.ZenithInternal095(Packet)));
   }

   private void lIl11IllIlI1I1l() {
      this.l111l1IlI11llll11II = true;
      this.IIl1llI1Il111I11I111II = false;
      this.IllllIll11lIlI1Il11lllII1IlI1 = System.currentTimeMillis();
      this.IlIIl1llI1lI1 = 0L;
      this.lIllI1lI1Ill1I = Math.max(1.0, this.I1IlllII1ll1());
      this.IlI1Il111lIlIl11I = null;
      this.lll1I1lIl1l1III11l1IIII.clear();
   }

   private void I11l1IIIllIl() {
      if (this.l111l1IlI11llll11II) {
         if (l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler() == null || l11I1I1ll1Illll1I1l1111l1II.world == null) {
            this.l11I1I11I1();
         } else if (this.llIIIII1Il11llIllI1I1l1ll1lll.isEmpty()) {
            this.l11I1I11I1();
         } else {
            long i = System.currentTimeMillis();
            if (this.IlIIl1llI1lI1 > i) {
               this.IllllIll11lIlI1Il11lllII1IlI1 = i;
            } else {
               if (this.IlIIl1llI1lI1 != 0L) {
                  this.IlIIl1llI1lI1 = 0L;
                  this.IllllIll11lIlI1Il11lllII1IlI1 = i;
                  this.lIllI1lI1Ill1I = Math.max(this.lIllI1lI1Ill1I, 1.0);
               } else {
                  this.ByteBufferHolder_2(i);
               }

               while (this.lIllI1lI1Ill1I >= 1.0 && !this.llIIIII1Il11llIllI1I1l1ll1lll.isEmpty()) {
                  Blink$II1Il11l111II11IIl i1llll1l111ili11l11iiil1i1i11i$ii1il11l111ii11iil = this.llIIIII1Il11llIllI1I1l1ll1lll
                     .poll();
                  this.StringHolder_8(i1llll1l111ili11l11iiil1i1i11i$ii1il11l111ii11iil);
                  this.lIllI1lI1Ill1I--;
                  if (i1llll1l111ili11l11iiil1i1i11i$ii1il11l111ii11iil.I1II1lIl1I1Il1() != null
                     && this.Event(i1llll1l111ili11l11iiil1i1i11i$ii1il11l111ii11iil.I1II1lIl1I1Il1())) {
                     this.IlIIl1llI1lI1 = System.currentTimeMillis() + 200L;
                     this.IllllIll11lIlI1Il11lllII1IlI1 = System.currentTimeMillis();
                     this.lIllI1lI1Ill1I = 0.0;
                     break;
                  }
               }

               if (this.llIIIII1Il11llIllI1I1l1ll1lll.isEmpty()) {
                  this.l11I1I11I1();
               }
            }
         }
      }
   }

   private void ByteBufferHolder_2(long i) {
      long j = Math.max(0L, i - this.IllllIll11lIlI1Il11lllII1IlI1);
      this.IllllIll11lIlI1Il11lllII1IlI1 = i;
      this.lIllI1lI1Ill1I = this.lIllI1lI1Ill1I + this.ll1llIll1l1lllI1I1llI1II() * ((double)j / 1000.0);
      this.lIllI1lI1Ill1I = Math.min(this.lIllI1lI1Ill1I, this.ll1llIll1l1lllI1I1llI1II());
   }

   private double ll1llIll1l1lllI1I1llI1II() {
      return Math.max(1.0, (double)(this.II1I11IIl.lll1lI1llll1IIllIIIII1lll() * 2.0F));
   }

   private double I1IlllII1ll1() {
      return this.ll1llIll1l1lllI1I1llI1II() / 20.0;
   }

   private void StringHolder_8(Blink$II1Il11l111II11IIl i1llll1l111ili11l11iiil1i1i11i$ii1il11l111ii11iil) {
      if (l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler() != null) {
         this.IIl1llI1Il111I11I111II = true;

         try {
            l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendPacket(i1llll1l111ili11l11iiil1i1i11i$ii1il11l111ii11iil.lII1IIIIllI1lIlIllllIIII1I());
         } finally {
            this.IIl1llI1Il111I11I111II = false;
         }
      }
   }

   private boolean Event(net.minecraft.util.math.Vec3d Vec3d) {
      net.minecraft.util.math.Vec3d Vec3dx = this.IlI1Il111lIlIl11I == null ? Vec3dx : this.IlI1Il111lIlIl11I;
      this.IlI1Il111lIlIl11I = Vec3dx;
      return this.EventBus(Vec3dx, Vec3dx);
   }

   private boolean EventBus(net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d) {
      if (l11I1I1ll1Illll1I1l1111l1II.world == null) {
         return false;
      } else {
         net.minecraft.util.math.Box Box = new net.minecraft.util.math.Box(
               Math.min(Vec3dx.x, Vec3d.x),
               Math.min(Vec3dx.y, Vec3d.y),
               Math.min(Vec3dx.z, Vec3d.z),
               Math.max(Vec3dx.x, Vec3d.x),
               Math.max(Vec3dx.y, Vec3d.y),
               Math.max(Vec3dx.z, Vec3d.z)
            )
            .expand(1.5);
         boolean flag = false;
         double d0 = 2.25;

         for (ItemEntity ItemEntity : l11I1I1ll1Illll1I1l1111l1II.world
            .getEntitiesByClass(ItemEntity.class, Box, ItemEntity -> !ItemEntityx.isRemoved())) {
            if (!this.lll1I1lIl1l1III11l1IIII.contains(ItemEntity.getId())
               && this.StringHolder_8(ItemEntity.getPos(), Vec3dx, Vec3d) <= d0) {
               this.lll1I1lIl1l1III11l1IIII.add(ItemEntity.getId());
               flag = true;
            }
         }

         return flag;
      }
   }

   private double StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d) {
      double d0 = Vec3d.x - Vec3dx.x;
      double d1 = Vec3d.y - Vec3dx.y;
      double d2 = Vec3d.z - Vec3dx.z;
      double d3 = d0 * d0 + d1 * d1 + d2 * d2;
      if (d3 <= 1.0E-6) {
         return Vec3dxx.squaredDistanceTo(Vec3d);
      } else {
         double d4 = (
               (Vec3dxx.x - Vec3dx.x) * d0
                  + (Vec3dxx.y - Vec3dx.y) * d1
                  + (Vec3dxx.z - Vec3dx.z) * d2
            )
            / d3;
         d4 = Math.max(0.0, Math.min(1.0, d4));
         double d5 = Vec3dx.x + d0 * d4;
         double d6 = Vec3dx.y + d1 * d4;
         double d7 = Vec3dx.z + d2 * d4;
         double d8 = Vec3dxx.x - d5;
         double d9 = Vec3dxx.y - d6;
         double d10 = Vec3dxx.z - d7;
         return d8 * d8 + d9 * d9 + d10 * d10;
      }
   }

   private net.minecraft.util.math.Vec3d ZenithInternal095(Packet<?> Packet) {
      if (Packet instanceof PlayerMoveC2SPacket PlayerMoveC2SPacket && l11I1I1ll1Illll1I1l1111l1II.player != null) {
         double d0 = PlayerMoveC2SPacket.getX(Double.NaN);
         double d1 = PlayerMoveC2SPacket.getY(Double.NaN);
         double d2 = PlayerMoveC2SPacket.getZ(Double.NaN);
         if (!Double.isNaN(d0) && !Double.isNaN(d1) && !Double.isNaN(d2)) {
            return new net.minecraft.util.math.Vec3d(d0, d1, d2);
         }

         return null;
      }

      return null;
   }

   private void l11I1I11I1() {
      this.lllllIIll1Ill11l1111l1l11();
      this.I1Ill1Il1I1lIlIIIl11llI();
      if (this.I1l111ll1I) {
         this.I1l111ll1I = false;
         super.l1l1lI111l1II1Illl111l1l1ll1l();
      }
   }

   private void lllllIIll1Ill11l1111l1l11() {
      this.llIIIII1Il11llIllI1I1l1ll1lll.clear();
   }

   private void I1Ill1Il1I1lIlIIIl11llI() {
      this.l111l1IlI11llll11II = false;
      this.IIl1llI1Il111I11I111II = false;
      this.IlIIl1llI1lI1 = 0L;
      this.IllllIll11lIlI1Il11lllII1IlI1 = 0L;
      this.lIllI1lI1Ill1I = 0.0;
      this.IlI1Il111lIlIl11I = null;
      this.lll1I1lIl1l1III11l1IIII.clear();
   }
}
