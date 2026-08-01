package zenith;

import java.util.Comparator;
import net.minecraft.util.Hand;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.client.network.AbstractClientPlayerEntity;

@ModuleInfo(
   name = "ElytraTarget",
   description = "",
   category = Category.MOVEMENT
)
public final class Elytratarget extends Module {
   public static final Elytratarget Il1I1IIIl11I1IIlI = new Elytratarget();
   private PlayerEntity llI1I1Il1IlIIll1IIl111ll111I;
   private final longHolder IlI1l1lI1111lI111I1IIllllIIII = new longHolder();
   private final BooleanSetting ll1II1IIl11l1ll1lI1I1 = new BooleanSetting(
      "module.elytraTarget.autoFWSetting", "module.elytraTarget.autoFWSetting.desc", true
   );
   private final NumberSetting ll111IlI111lllIIIlIl = new NumberSetting(
      "module.elytraTarget.predictSetting", 3.0F, 0.0F, 6.0F, 1.0F, "module.elytraTarget.predictSetting.desc", "t"
   );
   private final BooleanSetting llIlIll11111lIllllIIlIII1 = new BooleanSetting(
      "module.elytraTarget.notScipBox", "module.elytraTarget.notScipBox.desc", true
   );
   private net.minecraft.util.math.Box ll11111lI11l11IlI = null;

   private Elytratarget() {
   }

   @Override
   public void onEnable() {
      super.l11l1lII();
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_34 ll1li1l111llllli1) {
      if (this.ll11111lI11l11IlI != null && this.ll111IlI111lllIIIlIl.lll1lI1llll1IIllIIIII1lll() != 0.0F) {
         ListHolder_2.StringHolder_8(
            this.ll11111lI11l11IlI,
            ZenithClient.getInstance().floatHolder_3().getClientColor(0).lllIlll1Ill111l111Il11II11lII(),
            1.0F
         );
      }
   }

   @EventTarget
   public void EventImpl_24(EventImpl_30 ll1iil11ii) {
      this.llI1I1Il1IlIIll1IIl111ll111I = this.l1lll11111I1l();
      if (this.llI1I1Il1IlIIll1IIl111ll111I == null && Aura.ll1II1l1lII11IlII1.lI1IIllII11I() instanceof PlayerEntity PlayerEntity) {
         this.llI1I1Il1IlIIll1IIl111ll111I = PlayerEntity;
      }

      if (this.llI1I1Il1IlIIll1IIl111ll111I != null && l11I1I1ll1Illll1I1l1111l1II.player.isGliding()) {
         this.ll11111lI11l11IlI = this.EventImpl_21(this.llI1I1Il1IlIIll1IIl111ll111I);
         floatHolder_6 il1ll111liili1ll11liil = ZenithInternal131.ZenithInternal070(
            this.ll11111lI11l11IlI
               .getCenter()
               .subtract(
                  l11I1I1ll1Illll1I1l1111l1II.player
                     .getPos()
                     .add(l11I1I1ll1Illll1I1l1111l1II.player.getVelocity())
                     .add(0.0, (double)l11I1I1ll1Illll1I1l1111l1II.player.getEyeHeight(l11I1I1ll1Illll1I1l1111l1II.player.getPose()), 0.0)
               )
         );
         II1ll1II1l11lI.StringHolder_8(
            new SupplierHolder(
               il1ll111liili1ll11liil,
               () -> llI1lIIIlII111I11l1lIIl11.StringHolder_8(Aura.ll1II1l1lII11IlII1.III1l1I1I1IlI(), il1ll111liili1ll11liil),
               Aura.ll1II1l1lII11IlII1.III1l1I1I1IlI()
            ),
            10,
            this
         );
         if (this.ll1II1IIl11l1ll1lI1I1.Spider() && !Elytramotion.I1111l1Illl1I111.II1lIIlll1llII1lI1II1Illl1l()) {
            double d0 = Math.hypot(
                  l11I1I1ll1Illll1I1l1111l1II.player.getY() - l11I1I1ll1Illll1I1l1111l1II.player.prevY,
                  Math.hypot(
                     l11I1I1ll1Illll1I1l1111l1II.player.getX() - l11I1I1ll1Illll1I1l1111l1II.player.prevX,
                     l11I1I1ll1Illll1I1l1111l1II.player.getZ() - l11I1I1ll1Illll1I1l1111l1II.player.prevZ
                  )
               )
               * 20.0;
            if (this.IlI1l1lI1111lI111I1IIllllIIII.HostnameVerifierImpl(400L)) {
               ListHolder_5.StringHolder_8(Items.FIREWORK_ROCKET, Hand.OFF_HAND);
               this.IlI1l1lI1111lI111I1IIllllIIII.reset();
            }
         }
      } else {
         this.ll11111lI11l11IlI = null;
      }
   }

   @EventTarget
   public void EventTarget(PacketHolder ii1l11il1i1i) {
      if (ii1l11il1i1i.Swinganimation() instanceof PlayerInteractEntityC2SPacket) {
      }
   }

   public net.minecraft.util.math.Box EventImpl_21(LivingEntity LivingEntity) {
      return LivingEntity instanceof PlayerEntity PlayerEntity
         ? PlayerEntityHolder.ZenithInternal095(PlayerEntity, (int)this.ll111IlI111lllIIIlIl.lll1lI1llll1IIllIIIII1lll()).IlIIll1l1lllll1I
         : LivingEntity.getBoundingBox();
   }

   public PlayerEntity l1lll11111I1l() {
      return l11I1I1ll1Illll1I1l1111l1II.world
         .getPlayers()
         .stream()
         .filter(
            AbstractClientPlayerEntity -> AbstractClientPlayerEntity != l11I1I1ll1Illll1I1l1111l1II.player
                  && l11I1I1ll1Illll1I1l1111l1II.player.canSee(AbstractClientPlayerEntity)
                  && AbstractClientPlayerEntity.isGliding()
                  && !ZenithClient.getInstance().StringHolder_26().EventBus(AbstractClientPlayerEntity)
         )
         .min(
            Comparator.comparingDouble(
               AbstractClientPlayerEntity -> (double)(
                     l11I1I1ll1Illll1I1l1111l1II.player.distanceTo(AbstractClientPlayerEntity)
                        - (float)(AbstractClientPlayerEntity == Aura.ll1II1l1lII11IlII1.I1IIl11I11l() ? 100 : 0)
                  )
            )
         )
         .orElse(null);
   }

   public boolean EventImpl_13(LivingEntity LivingEntity) {
      return false;
   }

   public BooleanSetting l1I1IllIIIlI11() {
      return this.llIlIll11111lIllllIIlIII1;
   }

   public net.minecraft.util.math.Box l1ll1111lllI1l() {
      return this.ll11111lI11l11IlI;
   }
}
