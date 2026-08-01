// Module: Aura
// Category: combat
// Original class: Aura
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.combat;

import java.util.List;
import net.minecraft.util.Hand;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ShieldItem;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.GrassBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.network.packet.Packet;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.network.ClientPlayerEntity;

@ModuleInfo(
   name = "Aura",
   category = Category.COMBAT,
   description = "Бьет таргета"
)
public final class Aura extends Module {
   public static final Aura ll1II1l1lII11IlII1 = new Aura();
   private final ModeSetting l11l111lIlIl1llI1Il1I1Il = new ModeSetting("module.aura.rotationMode", "module.aura.rotationMode.desc");
   private final ModeOption l1l1Il111I1 = new ModeOption(this.l11l111lIlIl1llI1Il1I1Il, "HolyWorld")
      .I1lII1lllll11IIlIIl1l11lII();
   private final ModeOption l1I11I1Il1IIll1IlllIllIl11l = new ModeOption(
      this.l11l111lIlIl1llI1Il1I1Il, "FunTime"
   );
   private final ModeOption Ill1I1I11IlI11lI11l = new ModeOption(
      this.l11l111lIlIl1llI1Il1I1Il, "SpokyTime"
   );
   private final ModeOption lI1l11Il111IIllIII1l1 = new ModeOption(
      this.l11l111lIlIl1llI1Il1I1Il, "module.aura.legit"
   );
   private final ModeOption I1l1Illl1l11 = new ModeOption(
      this.l11l111lIlIl1llI1Il1I1Il, "module.aura.snap"
   );
   private final ModeOption ll1Il11I1I1IlIl = new ModeOption(
      this.l11l111lIlIl1llI1Il1I1Il, "module.aura.hvh"
   );
   private final ModeSetting l1lllI1lIIII1l = new ModeSetting("module.aura.sprintMode", "module.aura.sprintMode.desc");
   private final ModeOption I1lllI1I1II11I = new ModeOption(
      this.l1lllI1lIIII1l, "module.aura.sprintHvh"
   );
   private final ModeOption Ill1I11IIIlllIIllII1lIl = new ModeOption(
         this.l1lllI1lIIII1l, "module.aura.sprintNormal"
      )
      .I1lII1lllll11IIlIIl1l11lII();
   private final ModeOption II1ll1I11l1lIl11111IlII = new ModeOption(
      this.l1lllI1lIIII1l, "module.aura.sprintLegit"
   );
   private final ModeOption II1I1I1lIIl1l1IllI1111l1lII = new ModeOption(
      this.l1lllI1lIIII1l, "module.aura.sprintNone"
   );
   private final ModeSetting I11I1llll11IIl1IIl1I1ll1I1I1l1 = new ModeSetting("module.aura.correction", "module.aura.correction.desc");
   private final ModeOption lIl1l1l11ll1lI1I1I = new ModeOption(
      this.I11I1llll11IIl1IIl1I1ll1I1I1l1, "module.aura.correctionFocus"
   );
   private final ModeOption l1IlI1llIllIIII11III11I1llI1I = new ModeOption(
         this.I11I1llll11IIl1IIl1I1ll1I1I1l1, "module.aura.correctionGood"
      )
      .I1lII1lllll11IIlIIl1l11lII();
   private final ModeOption IlIl1I1lII1IllllllIIlIIIll11 = new ModeOption(
      this.I11I1llll11IIl1IIl1I1ll1I1I1l1, "module.aura.correctionNone"
   );
   private final NumberSetting lll1I1lIlIlIl1I1lllllII11lI = new NumberSetting(
      "module.aura.distance", 3.0F, 0.5F, 6.0F, 0.1F, "module.aura.distance.desc", "b"
   );
   private final NumberSetting l1IlI1Ill1IlIIl1l1111l1lII1111 = new NumberSetting(
      "module.aura.distanceRotation", 0.1F, 0.0F, 6.0F, 0.1F, "module.aura.distanceRotation.desc", "b"
   );
   private final MultiBooleanSetting lII111l1lIIIl = new MultiBooleanSetting("module.aura.settings", "module.aura.settings.desc");
   private final MultiBooleanSetting$II1Il11l111II11IIl lI111IlI11 = new MultiBooleanSetting$II1Il11l111II11IIl(this.lII111l1lIIIl, "module.aura.shieldBreak", true);
   private final MultiBooleanSetting$II1Il11l111II11IIl III1lI1l1lIl = new MultiBooleanSetting$II1Il11l111II11IIl(this.lII111l1lIIIl, "module.aura.shielRealese", true);
   private final MultiBooleanSetting$II1Il11l111II11IIl l1I111I111l1 = new MultiBooleanSetting$II1Il11l111II11IIl(this.lII111l1lIIIl, "module.aura.eatUseAttack", true);
   private final MultiBooleanSetting$II1Il11l111II11IIl l1l1l11IllIIl1l1I1llI1l = new MultiBooleanSetting$II1Il11l111II11IIl(
      this.lII111l1lIIIl, "module.aura.attackIgnoreWals", true
   );
   private final ModeSetting l1Il111lIlI = new ModeSetting("module.aura.cooldownMode", "module.aura.cooldownMode.desc");
   private final ModeOption lI1lI1llIlll1Il1lII1I1l = new ModeOption(
      this.l1Il111lIlI, "module.aura.slowMode"
   );
   private final ModeOption ll1IlIIll11II11II1111 = new ModeOption(
         this.l1Il111lIlI, "module.aura.speedMode"
      )
      .I1lII1lllll11IIlIIl1l11lII();
   private final ModeOption l11Il1IlllIllI = new ModeOption(
      this.l1Il111lIlI, "module.aura.customMode"
   );
   private final NumberSetting l11l1I1II11I1I1ll1l111II11I = new NumberSetting(
      "module.aura.timeCooldown", 0.0F, -1.0F, 1.0F, 0.5F, "module.aura.timeCooldown.desc", "t", this.l11Il1IlllIllI::isSelected, null
   );
   private final NumberSetting I1IIIlI11Il1 = new NumberSetting(
      "module.aura.attackCooldown", 1.0F, 0.0F, 1.0F, 0.01F, "module.aura.attackCooldown.desc", "%", this.l11Il1IlllIllI::isSelected, null
   );
   private final ContainerSetting I1l11I1lllI1I1l1I1Ill1I1Il = new ContainerSetting(
      "module.aura.targetSettingWindow",
      "module.aura.targetWindow.desc",
      () -> true,
      MultiBooleanSetting.StringHolder_8(
         "module.aura.targetTypeSetting",
         "module.aura.targetTypeSetting.desc",
         List.of("module.aura.targetPlayers", "module.aura.noarmor", "module.aura.targetHostile", "module.aura.targetPeaceful")
      ),
      MultiBooleanSetting.StringHolder_8(
         "module.aura.targetSortSetting",
         "module.aura.targetSortSetting.desc",
         List.of("module.aura.targetFov", "module.aura.targetArmor", "module.aura.targetHp", "module.aura.targetDistance")
      ),
      new BooleanSetting("module.aura.safeTarget", "module.aura.safeTarget.desc", true)
   );
   private final BooleanSetting IlIlI1llII1IIlII1IIlIlIllIII = new BooleanSetting(
      "module.aura.onlyCrit", "module.aura.onlyCrit.desc", true
   );
   private final BooleanSetting IllllllIl1Il = new BooleanSetting(
      "module.aura.smartCrit", "module.aura.smartCrit.desc", false, this.IlIlI1llII1IIlII1IIlIlIllIII::Spider
   );
   private final BooleanSetting Il1111l11l11I11lIIl1I11 = new BooleanSetting(
      "module.aura.wallbypass", "module.aura.wallbypass.desc", true, () -> !this.l1l1l11IllIIl1l1I1llI1l.Spider()
   );
   private final doubleHolder_4 I1l1l1I1I11llII11l = new doubleHolder_4();
   private LivingEntity llIl11llIII1IIlI1 = null;
   private Slot l1IIl1IIl1lIlll = null;
   private LivingEntity I1I1l1llIl1lI = null;
   private final longHolder I1I1IIII1I1II1lll11l1l1lIIlI1 = new longHolder();
   private boolean I1IllI1l1lIIII = false;
   private boolean I11llllI1I1lIl1Ill1ll1IIII1 = false;
   private boolean IIlIl1I1IIII1I = false;
   private longHolder lllII1l1IlI1l;
   int ll11Il1II1III1lIll11ll11lIIl = 0;
   int l11llI1l1l11I1I11I = 0;

   private Aura() {
   }

   @EventTarget
   public void StringHolder_8(EventImpl_14 ill1i111i1l1) {
      if (ill1i111i1l1.Autobuy() instanceof ClientPlayerEntity) {
         this.llIl11llIII1IIlI1 = null;
         this.I1I1l1llIl1lI = null;
      }
   }

   @EventTarget
   public void StringHolder_8(PacketHolder_2 liililli11ii1i) {
   }

   @EventTarget
   public void StringHolder_8(EventImpl_20 l11il1i1iil1lll111l1111llliil) {
      if (this.llIl11llIII1IIlI1 != null) {
         if (this.II1lll1l1l1lII1l111() && this.I11llllI1I1lIl1Ill1ll1IIII1) {
            this.I1IllI1l1lIIII = false;
            this.I11llllI1I1lIl1Ill1ll1IIII1 = false;
            this.IIlIl1I1IIII1I = true;
         }
      }
   }

   @EventTarget
   public void Event(EventImpl_22 l11llilil1) {
      if (this.lllII1l1IlI1l == null) {
         this.lllII1l1IlI1l = new longHolder();
      }

      if (this.IIlIl1I1IIII1I) {
         if (this.I1lllI1I1II11I.isSelected()
            && ZenithClient.getInstance().SupplierHolder().I11I1llll11IIl1IIl1I1ll1I1I1l1()) {
            l11I1I1ll1Illll1I1l1111l1II.player.setSprinting(false);
            l11I1I1ll1Illll1I1l1111l1II.player.sendSprintingPacket();
         }

         ZenithInternal071.EventTarget(this.llIl11llIII1IIlI1);
      }
   }

   @EventTarget
   public void EventBus(EventImpl_30 ll1iil11ii) {
      if (l11I1I1ll1Illll1I1l1111l1II.player.isDead()) {
         this.llIl11llIII1IIlI1 = null;
      } else {
         this.IIlIl1I1IIII1I = false;
         this.llIl11llIII1IIlI1 = this.lI11l11111lI1lII();
         if (this.llIl11llIII1IIlI1 != null) {
            if (l11I1I1ll1Illll1I1l1111l1II.world.getEntityById(this.llIl11llIII1IIlI1.getId()) instanceof LivingEntity LivingEntity) {
               this.llIl11llIII1IIlI1 = LivingEntity;
            } else {
               this.llIl11llIII1IIlI1 = null;
            }

            this.I1I1l1llIl1lI = this.llIl11llIII1IIlI1;
         }

         this.I1IllI1l1lIIII = false;
         this.I11llllI1I1lIl1Ill1ll1IIII1 = false;
         if (this.llIl11llIII1IIlI1 != null) {
            this.I1IllI1l1lIIII = this.lIlII1II11II();
            this.I11llllI1I1lIl1Ill1ll1IIII1 = this.Ill111II1lI11IlII1llI111I1();
            floatHolder_6 il1ll111liili1ll11liil = this.lI1111I1l1l1llI();
            Slot Slot = ListHolder_5.StringHolder_8(
               l11I1I1ll1Illll1I1l1111l1II.player.playerScreenHandler, Slot -> Slotxx.getStack().getItem() instanceof AxeItem
            );
            boolean flag = this.lI111IlI11.Spider()
               && this.I1I1IIII1I1II1lll11l1l1lIIlI1.HostnameVerifierImpl(300L)
               && ZenithClient.getInstance().ModuleHolder().floatHolder_8()
               && Slot != null
               && ZenithInternal066.StringHolder_4(this.llIl11llIII1IIlI1);
            if (flag && l11I1I1ll1Illll1I1l1111l1II.player.getMainHandStack().getItem() instanceof AxeItem && this.II1lll1l1l1lII1l111()) {
               ZenithInternal071.EventTarget(this.llIl11llIII1IIlI1);
               this.I1I1IIII1I1II1lll11l1l1lIIlI1.reset();
               this.I1IllI1l1lIIII = false;
               this.I11llllI1I1lIl1Ill1ll1IIII1 = false;
            }

            this.StringHolder_8(il1ll111liili1ll11liil, this.I1IllI1l1lIIII || flag, this.I11llllI1I1lIl1Ill1ll1IIII1 || flag);
            if (flag) {
               if (!(l11I1I1ll1Illll1I1l1111l1II.player.getMainHandStack().getItem() instanceof AxeItem)
                  && ListHolder_8.Event(Aura.class)) {
                  if (!(l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler)) {
                     ListHolder_5.IIl1IlI1l11Il();
                  }

                  ListHolder_8.StringHolder_8(Aura.class, () -> {
                     if (!(l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler)) {
                        ListHolder_5.IIl1IlI1l11Il();
                     }

                     ListHolder_5.StringHolder_8(Slot, Hand.MAIN_HAND, true);
                  });
                  if (this.l1IIl1IIl1lIlll == null) {
                     this.l1IIl1IIl1lIlll = Slot;
                  }
               }
            } else if (this.l1IIl1IIl1lIlll != null && this.lI111IlI11.Spider() && !ZenithInternal066.StringHolder_4(this.llIl11llIII1IIlI1)) {
               if (!(l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler)) {
                  ListHolder_5.IIl1IlI1l11Il();
               }

               Slot Slotx = this.l1IIl1IIl1lIlll;
               ListHolder_8.StringHolder_8(Aura.class, () -> {
                  if (!(l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler)) {
                     ListHolder_5.IIl1IlI1l11Il();
                  }

                  ListHolder_5.StringHolder_8(Slotx, Hand.MAIN_HAND, true);
               });
               this.l1IIl1IIl1lIlll = null;
            }

            if (this.I1IllI1l1lIIII
               && this.III1lI1l1lIl.Spider()
               && l11I1I1ll1Illll1I1l1111l1II.player.isUsingItem()
               && l11I1I1ll1Illll1I1l1111l1II.player.getActiveItem().getItem() instanceof ShieldItem) {
               l11I1I1ll1Illll1I1l1111l1II.interactionManager.stopUsingItem(l11I1I1ll1Illll1I1l1111l1II.player);
            }
         }
      }
   }

   public ZenithInternal115 III1l1I1I1IlI() {
      return llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II();
   }

   public boolean II1lll1l1l1lII1l111() {
      return this.ZenithInternal095(II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1());
   }

   public boolean ZenithInternal095(floatHolder_6 il1ll111liili1ll11liil) {
      return this.EventTarget(il1ll111liili1ll11liil, this.llllllIllIIl1Il1lIlI1I1lIIl11l(), this.llIl11llIII1IIlI1.getBoundingBox())
         || this.EventTarget(il1ll111liili1ll11liil, this.llllllIllIIl1Il1lIlI1I1lIIl11l(), this.IllIlIl1l11l111lII1lIlIlIl1l1());
   }

   public boolean lIIlllI1lIIl1ll1l111II1Il() {
      ZenithInternal088.StringHolder_8(
         II1l111II1Il11II111llllIl1.ZenithInternal057().ll1ll1l11l1lllIIIIl1(),
         PlayerEntityHolder.FileHolder_2(1)
            .l1l111I11I1I
            .add(0.0, (double)l11I1I1ll1Illll1I1l1111l1II.player.getEyeHeight(l11I1I1ll1Illll1I1l1111l1II.player.getPose()), 0.0),
         this.IIlIIII11Il(),
         6.0,
         false
      );
      return this.II1lll1l1l1lII1l111();
   }

   private net.minecraft.util.math.Box IIlIIII11Il() {
      return this.llIl11llIII1IIlI1 instanceof PlayerEntity PlayerEntity
         ? PlayerEntityHolder.ZenithInternal095(PlayerEntity, 1).IlIIll1l1lllll1I
         : this.llIl11llIII1IIlI1.getBoundingBox();
   }

   public boolean EventTarget(floatHolder_6 il1ll111liili1ll11liil, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Box Box) {
      return this.I1Il11II1llIII()
         ? this.StringHolder_8(Box, Vec3d)
         : Elytratarget.Il1I1IIIl11I1IIlI.l1ll1111lllI1l() != null
               && !Elytratarget.Il1I1IIIl11I1IIlI.l1I1IllIIIlI11().Spider()
               && Elytratarget.Il1I1IIIl11I1IIlI
                     .l1ll1111lllI1l()
                     .getCenter()
                     .squaredDistanceTo(l11I1I1ll1Illll1I1l1111l1II.player.getBoundingBox().getCenter())
                  < 16.0
            || ZenithInternal088.StringHolder_8(il1ll111liili1ll11liil, Vec3d, Box, (double)this.I111lIlIl1111I1IIIIII11I(), !this.lIlIll11l1l());
   }

   private boolean I1Il11II1llIII() {
      return Wallbypass.l1Il11ll111I1IIl1Il1lll1l.lI1lIl1l11ll111Il11Il();
   }

   private boolean lIlIll11l1l() {
      return this.l1l1l11IllIIl1l1I1llI1l.Spider() || this.I1Il11II1llIII();
   }

   private float I111lIlIl1111I1IIIIII11I() {
      return this.I1Il11II1llIII()
         ? Wallbypass.l1Il11ll111I1IIl1Il1lll1l.I111lIlIl1111I1IIIIII11I()
         : this.lll1I1lIlIlIl1I1lllllII11lI.lll1lI1llll1IIllIIIII1lll();
   }

   private boolean StringHolder_8(net.minecraft.util.math.Box Box, net.minecraft.util.math.Vec3d Vec3d) {
      net.minecraft.util.math.Vec3d Vec3dx = new net.minecraft.util.math.Vec3d(
         MathHelper.clamp(Vec3dx.x, Box.minX, Box.maxX),
         MathHelper.clamp(Vec3dx.y, Box.minY, Box.maxY),
         MathHelper.clamp(Vec3dx.z, Box.minZ, Box.maxZ)
      );
      return Vec3dx.isInRange(Vec3dx, (double)this.I111lIlIl1111I1IIIIII11I());
   }

   public net.minecraft.util.math.Vec3d llllllIllIIl1Il1lIlI1I1lIIl11l() {
      return l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F);
   }

   @EventTarget
   public void StringHolder_8(PacketHolder ii1l11il1i1i) {
      if (ii1l11il1i1i.longHolder_8()) {
         Packet Packet = ii1l11il1i1i.Swinganimation();
         if (Packet instanceof PlayerPositionLookS2CPacket) {
            this.ll11Il1II1III1lIll11ll11lIIl = 3;
         }
      }
   }

   public floatHolder_6 lI1111I1l1l1llI() {
      net.minecraft.util.math.Vec3d Vec3dx = l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F);
      if (this.llIl11llIII1IIlI1 instanceof PlayerEntity PlayerEntity) {
         net.minecraft.util.math.Box Box = Reachv3.Il11lIlllI111I1l1111.Spider()
               && Reachv3.Il11lIlllI111I1l1111.IlII1Ill() != null
            ? this.llIl11llIII1IIlI1.dimensions.getBoxAt(Reachv3.Il11lIlllI111I1l1111.IlII1Ill())
            : PlayerEntityHolder.ZenithInternal095(PlayerEntity, 1).IlIIll1l1lllll1I;
         floatHolder_6 il1ll111liili1ll11liil = ZenithInternal131.ZenithInternal070(
            this.StringHolder_8(Box, 0.5F)
               .subtract(
                  PlayerEntityHolder.FileHolder_2(2)
                     .l1l111I11I1I
                     .add(0.0, (double)l11I1I1ll1Illll1I1l1111l1II.player.getEyeHeight(l11I1I1ll1Illll1I1l1111l1II.player.getPose()), 0.0)
               )
         );
         if (this.ZenithInternal095(il1ll111liili1ll11liil) || !this.I11llllI1I1lIl1Ill1ll1IIII1) {
            return il1ll111liili1ll11liil;
         }
      }

      net.minecraft.util.math.Vec3d Vec3dx = this.I1l1l1I1I11llII11l
         .StringHolder_8(
            Vec3dx, this.IllIlIl1l11l111lII1lIlIlIl1l1(), this.I111lIlIl1111I1IIIIII11I(), new net.minecraft.util.math.Vec3d(0.0, 0.0, 0.0), this.lIlIll11l1l()
         );
      return ZenithInternal131.ZenithInternal070(Vec3dx.subtract(Vec3dx));
   }

   public net.minecraft.util.math.Vec3d StringHolder_8(net.minecraft.util.math.Box Box, float f) {
      return new net.minecraft.util.math.Vec3d(
         MathHelper.lerp(0.5, Box.minX, Box.maxX),
         MathHelper.lerp((double)f, Box.minY, Box.maxY),
         MathHelper.lerp(0.5, Box.minZ, Box.maxZ)
      );
   }

   public net.minecraft.util.math.Box IllIlIl1l11l111lII1lIlIlIl1l1() {
      if (this.llIl11llIII1IIlI1 instanceof PlayerEntity PlayerEntity) {
         return Elytratarget.Il1I1IIIl11I1IIlI.Spider()
               && !Elytratarget.Il1I1IIIl11I1IIlI.l1I1IllIIIlI11().Spider()
               && Elytratarget.Il1I1IIIl11I1IIlI.l1ll1111lllI1l() != null
            ? Elytratarget.Il1I1IIIl11I1IIlI.l1ll1111lllI1l()
            : this.llIl11llIII1IIlI1.getBoundingBox();
      } else {
         return this.llIl11llIII1IIlI1.getBoundingBox();
      }
   }

   public void StringHolder_8(floatHolder_6 il1ll111liili1ll11liil, boolean flag1, boolean flag) {
      if (this.Ill1I1I11IlI11lI11l.isSelected() || this.l1I11I1Il1IIll1IlllIllIl11l.isSelected()) {
         II1ll1II1l11lI.StringHolder_8(
            new SupplierHolder(
               il1ll111liili1ll11liil,
               () -> llI1lIIIlII111I11l1lIIl11.StringHolder_8(llI1lIIIlII111I11l1lIIl11.Il1Il1llIIl1lIlII11l11ll(), il1ll111liili1ll11liil),
               llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II()
            ),
            1,
            this
         );
      } else if (!this.lI1l11Il111IIllIII1l1.isSelected() && !this.l1l1Il111I1.isSelected()) {
         if (flag && this.I1l1Illl1l11.isSelected() || this.ll1Il11I1I1IlIl.isSelected()) {
            II1ll1II1l11lI.StringHolder_8(
               new SupplierHolder(
                  il1ll111liili1ll11liil,
                  () -> llI1lIIIlII111I11l1lIIl11.StringHolder_8(llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II(), il1ll111liili1ll11liil),
                  llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II()
               ),
               3,
               this
            );
         }
      } else {
         II1ll1II1l11lI.StringHolder_8(
            new SupplierHolder(
               il1ll111liili1ll11liil,
               () -> llI1lIIIlII111I11l1lIIl11.StringHolder_8(llI1lIIIlII111I11l1lIIl11.Il1Il1llIIl1lIlII11l11ll(), il1ll111liili1ll11liil),
               llI1lIIIlII111I11l1lIIl11.Il1Il1llIIl1lIlII11l11ll()
            ),
            1,
            this
         );
      }
   }

   @EventTarget
   public void EventTarget(PlayerInputHolder ili11i1il11) {
      if (this.lIl1l1l11ll1lI1I1I.isSelected() && this.llIl11llIII1IIlI1 != null) {
         PlayerEntityHolder lll111ll1i1l11l1 = PlayerEntityHolder.FileHolder_2(1);
         net.minecraft.util.math.Box Box = Reachv3.Il11lIlllI111I1l1111.Spider()
               && Reachv3.Il11lIlllI111I1l1111.IIIlIII1llI1I1ll11Il1lII() != null
            ? this.llIl11llIII1IIlI1.dimensions.getBoxAt(Reachv3.Il11lIlllI111I1l1111.IIIlIII1llI1I1ll11Il1lII())
            : (
               this.llIl11llIII1IIlI1 instanceof PlayerEntity
                  ? PlayerEntityHolder.ZenithInternal095((PlayerEntity)this.llIl11llIII1IIlI1, 2).IlIIll1l1lllll1I
                  : this.llIl11llIII1IIlI1.getBoundingBox()
            );
         floatHolder_6 il1ll111liili1ll11liil = ZenithInternal131.ZenithInternal070(
            Box.getCenter().subtract(lll111ll1i1l11l1.l1l111I11I1I)
         );
         ZenithInternal047.StringHolder_8(
            ili11i1il11, II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1().AutoBrewing(), il1ll111liili1ll11liil.AutoBrewing()
         );
      } else if (this.l1IlI1llIllIIII11III11I1llI1I.isSelected() || this.llIl11llIII1IIlI1 == null) {
         ZenithInternal047.StringHolder_8(
            ili11i1il11, II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1().AutoBrewing(), l11I1I1ll1Illll1I1l1111l1II.player.getYaw()
         );
      }

      if (this.llIl11llIII1IIlI1 != null && !this.IIlIl1I1IIII1I && !l11I1I1ll1Illll1I1l1111l1II.player.isOnGround() && this.lIlII1II11II()) {
         this.ZenithInternal095(ili11i1il11);
      }
   }

   @EventTarget(
      ZenithInternal095 = 0
   )
   public void StringHolder_8(ZenithInternal055 il1ii11111lil1l1llllllli11i) {
      if (this.IIlIl1I1IIII1I) {
         il1ii11111lil1l1llllllli11i.ZenithInternal069();
      }
   }

   private boolean lIlII1II11II() {
      return this.ZenithInternal086(1);
   }

   private boolean ZenithInternal086(int i) {
      PlayerEntityHolder lll111ll1i1l11l1 = PlayerEntityHolder.FileHolder_2(i);
      if (ZenithInternal066.StringHolder_4(this.llIl11llIII1IIlI1)) {
         return false;
      } else if (l11I1I1ll1Illll1I1l1111l1II.player.isUsingItem()
         && (!this.III1lI1l1lIl.Spider() || !(l11I1I1ll1Illll1I1l1111l1II.player.getActiveItem().getItem() instanceof ShieldItem))
         && !this.l1I111I111l1.Spider()) {
         return false;
      } else {
         return !this.IlIlI1llII1IIlII1IIlIlIllIII.Spider()
               || ZenithInternal071.StringHolder_8(lll111ll1i1l11l1)
               || ZenithInternal071.EventBus(lll111ll1i1l11l1)
               || this.IllllllIl1Il.Spider() && !l11I1I1ll1Illll1I1l1111l1II.options.jumpKey.isPressed()
            ? this.StringHolder_8(1.0F, !this.lIllI1I1I1())
            : false;
      }
   }

   public boolean lIllI1I1I1() {
      if (l11I1I1ll1Illll1I1l1111l1II.player.isGliding() || ZenithInternal071.DrawContextImpl()) {
         return false;
      } else {
         return !this.IlIlI1llII1IIlII1IIlIlIllIII.Spider()
            ? false
            : !this.IllllllIl1Il.Spider() || l11I1I1ll1Illll1I1l1111l1II.options.jumpKey.isPressed();
      }
   }

   private boolean Ill111II1lI11IlII1llI111I1() {
      if (this.ll11Il1II1III1lIll11ll11lIIl > 0) {
         this.ll11Il1II1III1lIll11ll11lIIl--;
         return false;
      } else if (ZenithInternal066.StringHolder_4(this.llIl11llIII1IIlI1)) {
         return false;
      } else if (l11I1I1ll1Illll1I1l1111l1II.player.isUsingItem() && !this.l1I111I111l1.Spider()) {
         return false;
      } else {
         return !this.lIllI1I1I1()
               || ZenithInternal071.IdentifierHolder_2()
                  && (!l11I1I1ll1Illll1I1l1111l1II.player.lastSprinting || this.II1I1I1lIIl1l1IllI1111l1lII.isSelected() || this.I1lllI1I1II11I.isSelected())
            ? this.StringHolder_8(0.0F, !this.lIllI1I1I1() || this.I1IllI1l1lIIII) && this.lllII1l1IlI1l.HostnameVerifierImpl(1L)
            : false;
      }
   }

   public boolean StringHolder_8(float f, boolean flag) {
      if (this.l1Il111lIlI.ClearHeadersHandler(1)) {
         return !ZenithInternal071.DrawContextImpl() && !l11I1I1ll1Illll1I1l1111l1II.player.isOnGround()
            ? (double)l11I1I1ll1Illll1I1l1111l1II.player.getAttackCooldownProgress(0.5F) > 0.9
            : l11I1I1ll1Illll1I1l1111l1II.player.getAttackCooldownProgress(0.5F) >= 1.0F;
      } else {
         if (!this.lI1lI1llIlll1Il1lII1I1l.isSelected()) {
            flag = false;
         }

         float f1 = this.l11Il1IlllIllI.isSelected() ? this.l11l1I1II11I1I1ll1l111II11I.lll1lI1llll1IIllIIIII1lll() : 1.0F;
         float f2 = this.l11Il1IlllIllI.isSelected() ? this.I1IIIlI11Il1.lll1lI1llll1IIllIIIII1lll() : 1.0F;
         return flag && !l11I1I1ll1Illll1I1l1111l1II.player.isSubmergedInWater()
            ? l11I1I1ll1Illll1I1l1111l1II.player.getAttackCooldownProgress(0.0F + f) == 1.0F
            : l11I1I1ll1Illll1I1l1111l1II.player.getAttackCooldownProgress(f1 + f) >= f2;
      }
   }

   @Override
   public void onEnable() {
      super.l11l1lII();
   }

   public void ZenithInternal095(PlayerInputHolder ili11i1il11) {
      if (this.lI11ll11ll1l11II1l111()) {
         boolean flag = l11I1I1ll1Illll1I1l1111l1II.options.sprintKey.isPressed();
         boolean flag1 = l11I1I1ll1Illll1I1l1111l1II.options.forwardKey.isPressed();
         if (this.II1ll1I11l1lIl11111IlII.isSelected()) {
            flag = false;
            if (l11I1I1ll1Illll1I1l1111l1II.player.isSprinting()) {
               flag1 = false;
            }
         }

         if (this.Ill1I11IIIlllIIllII1lIl.isSelected()) {
            if (l11I1I1ll1Illll1I1l1111l1II.player.isSprinting()) {
               l11I1I1ll1Illll1I1l1111l1II.player.setSprinting(false);
            }

            flag = false;
         }

         if (!flag) {
            l11I1I1ll1Illll1I1l1111l1II.options.sprintKey.setPressed(false);
            ili11i1il11.FinishThread(false);
         }

         if (!flag1) {
            ili11i1il11.ZenithInternal061(false);
         }
      }
   }

   @EventTarget
   public void StringHolder_8(booleanHolder_3 il11lill1lil1l1iill) {
      if (this.llIl11llIII1IIlI1 != null
         && !this.IIlIl1I1IIII1I
         && !l11I1I1ll1Illll1I1l1111l1II.player.isOnGround()
         && this.lIlII1II11II()
         && this.Ill1I11IIIlllIIllII1lIl.isSelected()) {
         il11lill1lil1l1iill.longHolder_3(false);
      }
   }

   public boolean lI11ll11ll1l11II1l111() {
      return !this.II1I1I1lIIl1l1IllI1111l1lII.isSelected() && !ZenithInternal071.DrawContextImpl();
   }

   private LivingEntity lI11l11111lI1lII() {
      return LivingEntityHolder.StringHolder_8(
         l11I1I1ll1Illll1I1l1111l1II.world.getEntities(),
         this.I111lIlIl1111I1IIIIII11I() + this.l1IlI1Ill1IlIIl1l1111l1lII1111.lll1lI1llll1IIllIIIII1lll(),
         this.lIlIll11l1l(),
         ((MultiBooleanSetting)this.I1l11I1lllI1I1l1I1Ill1I1Il.getSettings().get(0)).lIIll1ll11111I1llII111IllI1ll(),
         ((MultiBooleanSetting)this.I1l11I1lllI1I1l1I1Ill1I1Il.getSettings().get(1)).lIIll1ll11111I1llII111IllI1ll(),
         ((BooleanSetting)this.I1l11I1lllI1I1l1I1Ill1I1Il.getSettings().get(2)).Spider()
      );
   }

   public LivingEntity lI1IIllII11I() {
      return this.Spider() ? this.llIl11llIII1IIlI1 : null;
   }

   public boolean StringHolder_8(BlockHitResult BlockHitResult) {
      if (BlockHitResult != null && this.Il1111l11l11I11lIIl1I11.Spider()) {
         BlockState BlockState = l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockHitResult.getBlockPos());
         return !(BlockState.getBlock() instanceof StairsBlock)
            && BlockState.getBlock() != Blocks.KELP
            && BlockState.getBlock() != Blocks.KELP_PLANT
            && BlockState.getBlock() != Blocks.TALL_SEAGRASS
            && BlockState.getBlock() != Blocks.TALL_GRASS
            && !(BlockState.getBlock() instanceof GrassBlock)
            && !(BlockState.getBlock() instanceof TrapdoorBlock)
            && BlockState.getBlock() != Blocks.COBWEB
            && !(BlockState.getBlock() instanceof DoorBlock);
      } else {
         return true;
      }
   }

   public LivingEntity I1IIl11I11l() {
      return this.I1I1l1llIl1lI;
   }

   public boolean IIl111I1I11Il() {
      return this.I1IllI1l1lIIII;
   }

   public boolean ll1llIllIl11() {
      return this.I11llllI1I1lIl1Ill1ll1IIII1;
   }

   public longHolder llII1I11ll1I1lI1IIIll1l1I1lI1() {
      return this.lllII1l1IlI1l;
   }
}
