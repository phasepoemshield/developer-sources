// Module: FakeLag
// Category: combat
// Original class: Fakelag
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.combat;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.common.DisconnectS2CPacket;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket;
import net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.common.ResourcePackStatusC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSignC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.CommandExecutionC2SPacket;
import net.minecraft.component.DataComponentTypes;

@ModuleInfo(
   name = "FakeLag",
   description = "Delays outgoing packets near targets",
   category = Category.COMBAT
)
public final class Fakelag extends Module {
   public static final Fakelag I1lIIlI1I11I1ll1l11II1llI1lIl1 = new Fakelag();
   private static final List<String> Ill1I11IIIlII1 = List.of(
      "module.aura.targetPlayers", "module.aura.noarmor", "module.aura.targetHostile", "module.aura.targetPeaceful"
   );
   private final NumberSetting IIIll1I1lI1lllIIIIl1lI = new NumberSetting(
      "module.fakeLag.minRange", 2.0F, 0.0F, 10.0F, 0.1F, "module.fakeLag.minRange.desc", "b"
   );
   private final NumberSetting llll1I11IllIl1llII1IIlll1ll = new NumberSetting(
      "module.fakeLag.maxRange", 5.0F, 0.0F, 10.0F, 0.1F, "module.fakeLag.maxRange.desc", "b"
   );
   private final NumberSetting I1l1lII1l111 = new NumberSetting(
      "module.fakeLag.minDelay", 300.0F, 0.0F, 1000.0F, 25.0F, "module.fakeLag.minDelay.desc", "ms"
   );
   private final NumberSetting llIIll1II1l1IIll = new NumberSetting(
      "module.fakeLag.maxDelay", 600.0F, 0.0F, 1000.0F, 25.0F, "module.fakeLag.maxDelay.desc", "ms"
   );
   private final NumberSetting l1I1lI1111I1Il = new NumberSetting(
      "module.fakeLag.recoilTime", 250.0F, 0.0F, 1000.0F, 25.0F, "module.fakeLag.recoilTime.desc", "ms"
   );
   private final BooleanSetting lIlI11IlI1I1I11II111 = new BooleanSetting(
      "module.fakeLag.renderBox", "module.fakeLag.renderBox.desc", true
   );
   private final ModeSetting I1lllI1IlllIl11Ill1lIl1 = new ModeSetting("module.fakeLag.mode", "module.fakeLag.mode.desc");
   private final ModeOption llIl1111llIl1llIIIIIll = new ModeOption(
      this.I1lllI1IlllIl11Ill1lIl1, "module.fakeLag.mode.constant"
   );
   private final ModeOption l11l11II11I = new ModeOption(
         this.I1lllI1IlllIl11Ill1lIl1, "module.fakeLag.mode.dynamic"
      )
      .I1lII1lllll11IIlIIl1l11lII();
   private final MultiBooleanSetting lII1I1l1I11111l1llI1 = new MultiBooleanSetting("module.fakeLag.flushOn", "module.fakeLag.flushOn.desc");
   private final MultiBooleanSetting$II1Il11l111II11IIl IIlII1lII1 = new MultiBooleanSetting$II1Il11l111II11IIl(
      this.lII1I1l1I11111l1llI1, "module.fakeLag.flushEntityInteract", true
   );
   private final MultiBooleanSetting$II1Il11l111II11IIl lIl1IIl11I1Il1llIII1 = new MultiBooleanSetting$II1Il11l111II11IIl(
      this.lII1I1l1I11111l1llI1, "module.fakeLag.flushBlockInteract", true
   );
   private final MultiBooleanSetting$II1Il11l111II11IIl I11II1Il1IIIl = new MultiBooleanSetting$II1Il11l111II11IIl(
      this.lII1I1l1I11111l1llI1, "module.fakeLag.flushAction", true
   );
   private final Queue<Fakelag$II1Il11l111II11IIl> II11IIlIl1ll11IIIIl1I1lIlI = new ConcurrentLinkedQueue<>();
   private final longHolder lIl1I111II11 = new longHolder();
   private long IlIIII1l1IIIll11IIllI11ll = this.I111IIl1I111IIII();
   private boolean l1l11lIIIllIll1;
   private boolean l111l1IlI11llll11II;

   private Fakelag() {
   }

   @Override
   public void onEnable() {
      this.II11IIlIl1ll11IIIIl1I1lIlI.clear();
      this.l1l11lIIIllIll1 = false;
      this.l111l1IlI11llll11II = false;
      this.IlIIII1l1IIIll11IIllI11ll = this.I111IIl1I111IIII();
      this.lIl1I111II11.reset();
      super.l11l1lII();
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      this.l1II1lIIl1ll1l();
      this.l1l11lIIIllIll1 = false;
      super.l1l1lI111l1II1Illl111l1l1ll1l();
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_22 l11llilil1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         this.l1l11lIIIllIll1 = this.EventImpl_24(l11I1I1ll1Illll1I1l1111l1II.player.getPos()) != null;
      } else {
         this.l1l11lIIIllIll1 = false;
         this.lllllIIll1Ill11l1111l1l11();
      }
   }

   @EventTarget
   public void EventBus(EventImpl_17 illli1llllii1ii111ili) {
      if (l11I1I1ll1Illll1I1l1111l1II.player == null || l11I1I1ll1Illll1I1l1111l1II.world == null) {
         this.lllllIIll1Ill11l1111l1l11();
      } else if (!this.II11IIlIl1ll11IIIIl1I1lIlI.isEmpty()) {
         if (this.IlI1Il111Il1I1I1I1lII() || !this.lIl1I111II11.HostnameVerifierImpl((long)this.l1I1lI1111I1Il.lll1lI1llll1IIllIIIII1lll())) {
            this.IlIll1l111II1I();
         } else if (this.IIIl1lllllIl1lIIIlI1lI()) {
            this.IllIlIII1I1IIIIll1ll();
         } else {
            if (this.ll1l111lI1IIll() || this.lIllllI1IlI1l11III1IIl()) {
               this.IlIll1l111II1I();
            }
         }
      }
   }

   @EventTarget
   public void EventTarget(EventImpl_34 ll1li1l111llllli1) {
      if (this.lIlI11IlI1I1I11II111.Spider() && l11I1I1ll1Illll1I1l1111l1II.player != null) {
         net.minecraft.util.math.Vec3d Vec3d = this.llIIlIllI1llI1l1();
         if (Vec3d != null) {
            ListHolder_2.StringHolder_8(
               l11I1I1ll1Illll1I1l1111l1II.player.getDimensions(l11I1I1ll1Illll1I1l1111l1II.player.getPose()).getBoxAt(Vec3d), -1, 1.0F
            );
         }
      }
   }

   @EventTarget
   public void StringHolder_8(PacketHolder ii1l11il1i1i) {
      if (ii1l11il1i1i.Swinganimation() != null) {
         if (ii1l11il1i1i.longHolder_8()) {
            this.Event(ii1l11il1i1i.Swinganimation());
         }
      }
   }

   @EventTarget(
      ZenithInternal095 = 3
   )
   public void StringHolder_8(PacketHolder_3 lllill11l1lll1iii1lli11ll1) {
      if (!lllill11l1lll1iii1lli11ll1.Event()
         && !this.l111l1IlI11llll11II
         && !Blink.IIIlII1Il1l111lI1.I1IllI11IIIllllI()
         && lllill11l1lll1iii1lli11ll1.Swinganimation() != null) {
         if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
            Packet Packet = lllill11l1lll1iii1lli11ll1.Swinganimation();
            if (this.IlI1Il111Il1I1I1I1lII()) {
               this.IlIll1l111II1I();
            } else if (!this.lIl1I111II11.HostnameVerifierImpl((long)this.l1I1lI1111I1Il.lll1lI1llll1IIllIIIII1lll())) {
               this.IlIll1l111II1I();
            } else if (this.IIIl1lllllIl1lIIIlI1lI()) {
               this.IllIlIII1I1IIIIll1ll();
            } else if (this.ZenithInternal028(Packet)) {
               this.lIlI1I1IlI1();
            } else if (this.ll1l111lI1IIll() || this.lIllllI1IlI1l11III1IIl()) {
               this.IlIll1l111II1I();
            } else if (!this.EventImpl_24(Packet)) {
               lllill11l1lll1iii1lli11ll1.ZenithInternal069();
               this.II11IIlIl1ll11IIIIl1I1lIlI.add(new Fakelag$II1Il11l111II11IIl(Packet, this.ZenithInternal095(Packet)));
            }
         } else {
            this.lllllIIll1Ill11l1111l1l11();
         }
      }
   }

   private void Event(Packet<?> Packet) {
      if (Packet instanceof DisconnectS2CPacket || Packet instanceof PlayerPositionLookS2CPacket) {
         this.lllllIIll1Ill11l1111l1l11();
         this.lIl1I111II11.reset();
      } else if (Packet instanceof HealthUpdateS2CPacket) {
         this.lIlI1I1IlI1();
      } else {
         if (Packet instanceof EntityVelocityUpdateS2CPacket EntityVelocityUpdateS2CPacket
            && l11I1I1ll1Illll1I1l1111l1II.player != null
            && EntityVelocityUpdateS2CPacket.getEntityId() == l11I1I1ll1Illll1I1l1111l1II.player.getId()
            && (EntityVelocityUpdateS2CPacket.getVelocityX() != 0.0 || EntityVelocityUpdateS2CPacket.getVelocityY() != 0.0 || EntityVelocityUpdateS2CPacket.getVelocityZ() != 0.0)) {
            this.lIlI1I1IlI1();
            return;
         }

         if (Packet instanceof ExplosionS2CPacket ExplosionS2CPacket) {
            ExplosionS2CPacket.playerKnockback().ifPresent(Vec3d -> {
               if (Vec3d.x != 0.0 || Vec3d.y != 0.0 || Vec3d.z != 0.0) {
                  this.lIlI1I1IlI1();
               }
            });
         }
      }
   }

   private boolean EventImpl_24(Packet<?> Packet) {
      return Packet instanceof ChatMessageC2SPacket || Packet instanceof CommandExecutionC2SPacket;
   }

   private boolean ZenithInternal028(Packet<?> Packet) {
      if (Packet instanceof ResourcePackStatusC2SPacket) {
         return true;
      } else if (!this.IIlII1lII1.Spider() || !(Packet instanceof PlayerInteractEntityC2SPacket) && !(Packet instanceof HandSwingC2SPacket)) {
         return !this.lIl1IIl11I1Il1llIII1.Spider() || !(Packet instanceof PlayerInteractBlockC2SPacket) && !(Packet instanceof UpdateSignC2SPacket)
            ? this.I11II1Il1IIIl.Spider() && Packet instanceof PlayerActionC2SPacket
            : true;
      } else {
         return true;
      }
   }

   private boolean IlI1Il111Il1I1I1I1lII() {
      return l11I1I1ll1Illll1I1l1111l1II.player == null
         || l11I1I1ll1Illll1I1l1111l1II.world == null
         || l11I1I1ll1Illll1I1l1111l1II.player.isDead()
         || l11I1I1ll1Illll1I1l1111l1II.player.isTouchingWater()
         || l11I1I1ll1Illll1I1l1111l1II.currentScreen != null;
   }

   private boolean lIllllI1IlI1l11III1IIl() {
      if (this.llIl1111llIl1llIIIIIll.isSelected()) {
         return false;
      } else if (this.l11l11II11I.isSelected() && this.l1l11lIIIllIll1) {
         net.minecraft.util.math.Vec3d Vec3d = this.llIIlIllI1llI1l1();
         if (Vec3d == null) {
            return false;
         } else if (l11I1I1ll1Illll1I1l1111l1II.player == null) {
            return true;
         } else {
            LivingEntity LivingEntity = this.ZenithInternal028(Vec3d);
            if (LivingEntity == null) {
               return true;
            } else {
               net.minecraft.util.math.Box Box = l11I1I1ll1Illll1I1l1111l1II.player
                  .getDimensions(l11I1I1ll1Illll1I1l1111l1II.player.getPose())
                  .getBoxAt(Vec3d);
               boolean flag = LivingEntity.getBoundingBox().intersects(Box);
               double d0 = LivingEntity.getPos().distanceTo(Vec3d);
               double d1 = LivingEntity.getPos().distanceTo(l11I1I1ll1Illll1I1l1111l1II.player.getPos());
               return d0 < d1 || flag;
            }
         }
      } else {
         return true;
      }
   }

   private LivingEntity EventImpl_24(net.minecraft.util.math.Vec3d Vec3d) {
      double d0 = (double)Math.min(this.IIIll1I1lI1lllIIIIl1lI.lll1lI1llll1IIllIIIII1lll(), this.llll1I11IllIl1llII1IIlll1ll.lll1lI1llll1IIllIIIII1lll());
      double d1 = (double)Math.max(this.IIIll1I1lI1lllIIIIl1lI.lll1lI1llll1IIllIIIII1lll(), this.llll1I11IllIl1llII1IIlll1ll.lll1lI1llll1IIllIIIII1lll());
      double d2 = d0 * d0;
      double d3 = d1 * d1;
      LivingEntity LivingEntityx = null;
      double d4 = Double.MAX_VALUE;

      for (LivingEntity LivingEntityx : this.EventImpl_21(Vec3d)) {
         if (!this.EventBus(LivingEntityx)) {
            double d5 = LivingEntityx.squaredDistanceTo(Vec3d);
            if (d5 >= d2 && d5 <= d3 && d5 < d4) {
               LivingEntityx = LivingEntityx;
               d4 = d5;
            }
         }
      }

      return LivingEntityx;
   }

   private LivingEntity ZenithInternal028(net.minecraft.util.math.Vec3d Vec3d) {
      double d0 = (double)Math.max(this.IIIll1I1lI1lllIIIIl1lI.lll1lI1llll1IIllIIIII1lll(), this.llll1I11IllIl1llII1IIlll1ll.lll1lI1llll1IIllIIIII1lll());
      double d1 = d0 * d0;
      LivingEntity LivingEntityx = null;
      double d2 = Double.MAX_VALUE;

      for (LivingEntity LivingEntityx : this.EventImpl_21(Vec3d)) {
         if (!this.EventBus(LivingEntityx)) {
            double d3 = LivingEntityx.getPos().squaredDistanceTo(Vec3d);
            if (d3 <= d1 && d3 < d2) {
               LivingEntityx = LivingEntityx;
               d2 = d3;
            }
         }
      }

      return LivingEntityx;
   }

   private Iterable<LivingEntity> EventImpl_21(net.minecraft.util.math.Vec3d Vec3d) {
      if (l11I1I1ll1Illll1I1l1111l1II.world == null) {
         return List.of();
      } else {
         double d0 = (double)Math.max(this.IIIll1I1lI1lllIIIIl1lI.lll1lI1llll1IIllIIIII1lll(), this.llll1I11IllIl1llII1IIlll1ll.lll1lI1llll1IIllIIIII1lll())
            + 2.0;
         net.minecraft.util.math.Box Box = new net.minecraft.util.math.Box(
            Vec3d.x - d0,
            Vec3d.y - d0,
            Vec3d.z - d0,
            Vec3d.x + d0,
            Vec3d.y + d0,
            Vec3d.z + d0
         );
         return l11I1I1ll1Illll1I1l1111l1II.world.getEntitiesByClass(LivingEntity.class, Box, LivingEntity -> true);
      }
   }

   private boolean EventBus(LivingEntity LivingEntity) {
      return LivingEntity instanceof ArmorStandEntity || !LivingEntityHolder.StringHolder_8(Ill1I11IIIlII1, LivingEntity);
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

   private net.minecraft.util.math.Vec3d llIIlIllI1llI1l1() {
      for (Fakelag$II1Il11l111II11IIl i1lli1li1ii1l1li1ilil$ii1il11l111ii11iil : this.II11IIlIl1ll11IIIIl1I1lIlI) {
         if (i1lli1li1ii1l1li1ilil$ii1il11l111ii11iil.I1II1lIl1I1Il1() != null) {
            return i1lli1li1ii1l1li1ilil$ii1il11l111ii11iil.I1II1lIl1I1Il1();
         }
      }

      return null;
   }

   private boolean IIIl1lllllIl1lIIIlI1lI() {
      Fakelag$II1Il11l111II11IIl i1lli1li1ii1l1li1ilil$ii1il11l111ii11iil = this.II11IIlIl1ll11IIIIl1I1lIlI.peek();
      return i1lli1li1ii1l1li1ilil$ii1il11l111ii11iil != null
         && System.currentTimeMillis() - i1lli1li1ii1l1li1ilil$ii1il11l111ii11iil.IlIllII1I1I1l1lI111IIlI() >= this.IlIIII1l1IIIll11IIllI11ll;
   }

   private long I111IIl1I111IIII() {
      int i = Math.round(Math.min(this.I1l1lII1l111.lll1lI1llll1IIllIIIII1lll(), this.llIIll1II1l1IIll.lll1lI1llll1IIllIIIII1lll()));
      int j = Math.round(Math.max(this.I1l1lII1l111.lll1lI1llll1IIllIIIII1lll(), this.llIIll1II1l1IIll.lll1lI1llll1IIllIIIII1lll()));
      return j <= i ? (long)i : (long)ThreadLocalRandom.current().nextInt(i, j + 1);
   }

   private boolean ll1l111lI1IIll() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.player.isUsingItem()) {
         ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getActiveItem();
         return ItemStack.contains(DataComponentTypes.FOOD)
            || ItemStack.isOf(Items.MILK_BUCKET)
            || ItemStack.isOf(Items.POTION)
            || ItemStack.isOf(Items.SPLASH_POTION)
            || ItemStack.isOf(Items.LINGERING_POTION);
      } else {
         return false;
      }
   }

   private void lIlI1I1IlI1() {
      this.l1II1lIIl1ll1l();
      this.lIl1I111II11.reset();
   }

   private void IlIll1l111II1I() {
      this.l1II1lIIl1ll1l();
   }

   private void IllIlIII1I1IIIIll1ll() {
      this.l1II1lIIl1ll1l();
      this.IlIIII1l1IIIll11IIllI11ll = this.I111IIl1I111IIII();
   }

   private void l1II1lIIl1ll1l() {
      if (!this.II11IIlIl1ll11IIIIl1I1lIlI.isEmpty() && l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler() != null) {
         this.l111l1IlI11llll11II = true;

         Fakelag$II1Il11l111II11IIl i1lli1li1ii1l1li1ilil$ii1il11l111ii11iil;
         try {
            while ((i1lli1li1ii1l1li1ilil$ii1il11l111ii11iil = this.II11IIlIl1ll11IIIIl1I1lIlI.poll()) != null) {
               l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendPacket(i1lli1li1ii1l1li1ilil$ii1il11l111ii11iil.lII1IIIIllI1lIlIllllIIII1I());
            }
         } finally {
            this.l111l1IlI11llll11II = false;
         }
      } else {
         this.II11IIlIl1ll11IIIIl1I1lIlI.clear();
      }
   }

   private void lllllIIll1Ill11l1111l1l11() {
      this.II11IIlIl1ll11IIIIl1I1lIlI.clear();
   }
}
