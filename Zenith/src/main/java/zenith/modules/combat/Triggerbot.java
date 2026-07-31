// Module: TriggerBot
// Category: combat
// Original class: Triggerbot
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.combat;

import java.util.List;
import net.minecraft.util.Hand;
import net.minecraft.entity.LivingEntity;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ShieldItem;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.network.ClientPlayerEntity;

@ModuleInfo(
   name = "TriggerBot",
   category = Category.COMBAT,
   description = "Бьет таргета"
)
public final class Triggerbot extends Module {
   public static final Triggerbot l1lIIII11lI1Il1111IllII1II1lI = new Triggerbot();
   private final ModeSetting IlIlI1lIllIl1l1I1IIIlllI11 = new ModeSetting("module.aura.sprintMode", "module.aura.sprintMode.desc");
   private final ModeOption l1lI1IIllIIl = new ModeOption(
      this.IlIlI1lIllIl1l1I1IIIlllI11, "module.aura.sprintHvh"
   );
   private final ModeOption llI11II11lI1IllIllIIIIIlI1l1l = new ModeOption(
         this.IlIlI1lIllIl1l1I1IIIlllI11, "module.aura.sprintNormal"
      )
      .I1lII1lllll11IIlIIl1l11lII();
   private final ModeOption I1l1IIlll11l1llIlI = new ModeOption(
      this.IlIlI1lIllIl1l1I1IIIlllI11, "module.aura.sprintLegit"
   );
   private final ModeOption I1III1lI1l11lllIII11Il1IlIIl1I = new ModeOption(
      this.IlIlI1lIllIl1l1I1IIIlllI11, "module.aura.sprintNone"
   );
   private final NumberSetting l1l11IlII = new NumberSetting("module.aura.distance", 3.0F, 0.5F, 6.0F, 0.1F, "module.aura.distance.desc", "b");
   private final MultiBooleanSetting lII1lIlI11l1IIl111I1l1I1Illll = new MultiBooleanSetting("module.aura.settings", "module.aura.settings.desc");
   private final MultiBooleanSetting$II1Il11l111II11IIl IIII1l1IlII1I11l11l = new MultiBooleanSetting$II1Il11l111II11IIl(
      this.lII1lIlI11l1IIl111I1l1I1Illll, "module.aura.shieldBreak", true
   );
   private final MultiBooleanSetting$II1Il11l111II11IIl ll11ll1llIlIlIIII11l = new MultiBooleanSetting$II1Il11l111II11IIl(
      this.lII1lIlI11l1IIl111I1l1I1Illll, "module.aura.shielRealese", true
   );
   private final MultiBooleanSetting$II1Il11l111II11IIl l1111lI1l1I1Illl1Il1Ill1IllII = new MultiBooleanSetting$II1Il11l111II11IIl(
      this.lII1lIlI11l1IIl111I1l1I1Illll, "module.aura.eatUseAttack", true
   );
   private final MultiBooleanSetting$II1Il11l111II11IIl I1IIIII1IIlI111Il1II11111I = new MultiBooleanSetting$II1Il11l111II11IIl(
      this.lII1lIlI11l1IIl111I1l1I1Illll, "module.aura.attackIgnoreWals", true
   );
   private final ModeSetting lll11ll1Ill1IllIllIllIIIll = new ModeSetting("module.aura.cooldownMode", "module.aura.cooldownMode.desc");
   private final ModeOption l1111I1lIl1lllll11IlII1111lI = new ModeOption(
      this.lll11ll1Ill1IllIllIllIIIll, "module.aura.slowMode"
   );
   private final ModeOption IlI1l1lIIIlllI = new ModeOption(
         this.lll11ll1Ill1IllIllIllIIIll, "module.aura.speedMode"
      )
      .I1lII1lllll11IIlIIl1l11lII();
   private final ModeOption IIlI111l1llIIl111 = new ModeOption(
      this.lll11ll1Ill1IllIllIllIIIll, "module.aura.customMode"
   );
   private final NumberSetting Il11ll1lllll1l = new NumberSetting(
      "module.aura.timeCooldown", 0.0F, -1.0F, 1.0F, 0.5F, "module.aura.timeCooldown.desc", "t", this.IIlI111l1llIIl111::isSelected, null
   );
   private final NumberSetting IlII11l1l111ll1l1l1l1I11IIlI = new NumberSetting(
      "module.aura.attackCooldown", 1.0F, 0.0F, 1.0F, 0.01F, "module.aura.attackCooldown.desc", "%", this.IIlI111l1llIIl111::isSelected, null
   );
   private final BooleanSetting IllIlIl1I1 = new BooleanSetting("module.aura.randomDelay", "module.aura.randomDelay.desc", false);
   private final ContainerSetting lI1llIlIlllIllIlIIllIll1lI11 = new ContainerSetting(
      "Настройки цели",
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
      new BooleanSetting("module.aura.safeTarget", "module.aura.safeTarget.desc", false)
   );
   private final BooleanSetting l1Il1I1II1IllIl1lIll1111l1lll = new BooleanSetting(
      "module.aura.onlyCrit", "module.aura.onlyCrit.desc", true
   );
   private final BooleanSetting IlllIlIIlI111Il1IIlIl = new BooleanSetting(
      "module.aura.smartCrit", "module.aura.smartCrit.desc", false, this.l1Il1I1II1IllIl1lIll1111l1lll::Spider
   );
   private LivingEntity llIl11llIII1IIlI1 = null;
   private Slot l1IIl1IIl1lIlll = null;
   private LivingEntity I1I1l1llIl1lI = null;
   private final longHolder II1IIII11II1l1l1ll11111 = new longHolder();
   private boolean I1IllI1l1lIIII = false;
   private boolean I11llllI1I1lIl1Ill1ll1IIII1 = false;
   private boolean IIlIl1I1IIII1I = false;
   private longHolder lllII1l1IlI1l;
   int Illll1I1lllI1IIlll1IllIIIl1 = 0;
   int l1IIIlIIl11II1 = 0;

   private Triggerbot() {
   }

   @EventTarget
   public void StringHolder_8(EventImpl_14 ill1i111i1l1) {
      if (ill1i111i1l1.Autobuy() instanceof ClientPlayerEntity) {
         this.llIl11llIII1IIlI1 = null;
         this.I1I1l1llIl1lI = null;
      }
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
         if (this.l1lI1IIllIIl.isSelected() && ZenithClient.getInstance().SupplierHolder().I11I1llll11IIl1IIl1I1ll1I1I1l1()) {
            l11I1I1ll1Illll1I1l1111l1II.player.setSprinting(false);
            l11I1I1ll1Illll1I1l1111l1II.player.sendSprintingPacket();
         }

         ZenithInternal071.EventTarget(this.llIl11llIII1IIlI1);
         this.Illll1I1lllI1IIlll1IllIIIl1 = l11I1I1ll1Illll1I1l1111l1II.player.age - this.l1IIIlIIl11II1;
         this.l1IIIlIIl11II1 = l11I1I1ll1Illll1I1l1111l1II.player.age;
      }
   }

   @EventTarget
   public void EventBus(EventImpl_30 ll1iil11ii) {
      if (l11I1I1ll1Illll1I1l1111l1II.player.isDead()) {
         this.llIl11llIII1IIlI1 = null;
      } else {
         this.IIlIl1I1IIII1I = false;
         this.llIl11llIII1IIlI1 = this.lI11l11111lI1lII();
         if (l11I1I1ll1Illll1I1l1111l1II.targetedEntity instanceof LivingEntity LivingEntityx
            && LivingEntityHolder.StringHolder_8(
               ((MultiBooleanSetting)this.lI1llIlIlllIllIlIIllIll1lI11.getSettings().get(0)).lIIll1ll11111I1llII111IllI1ll(), LivingEntityx
            )) {
            this.llIl11llIII1IIlI1 = LivingEntityx;
         }

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
            Slot Slot = ListHolder_5.StringHolder_8(
               l11I1I1ll1Illll1I1l1111l1II.player.playerScreenHandler, Slot -> Slotxx.getStack().getItem() instanceof AxeItem
            );
            boolean flag = this.IIII1l1IlII1I11l11l.Spider()
               && this.II1IIII11II1l1l1ll11111.HostnameVerifierImpl(300L)
               && ZenithClient.getInstance().ModuleHolder().Event(Triggerbot.class)
               && Slot != null
               && ZenithInternal066.StringHolder_4(this.llIl11llIII1IIlI1);
            if (flag) {
               if (l11I1I1ll1Illll1I1l1111l1II.player.getMainHandStack().getItem() instanceof AxeItem) {
                  if (this.II1lll1l1l1lII1l111()) {
                     ZenithInternal071.EventTarget(this.llIl11llIII1IIlI1);
                     this.II1IIII11II1l1l1ll11111.reset();
                     this.I1IllI1l1lIIII = false;
                     this.I11llllI1I1lIl1Ill1ll1IIII1 = false;
                  }
               } else if (ListHolder_8.Event(Triggerbot.class)) {
                  ListHolder_8.StringHolder_8(Triggerbot.class, () -> {
                     if (!(l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler)) {
                        ListHolder_5.IIl1IlI1l11Il();
                     }

                     ListHolder_5.StringHolder_8(Slot, Hand.MAIN_HAND, true);
                  });
                  if (this.l1IIl1IIl1lIlll == null) {
                     this.l1IIl1IIl1lIlll = Slot;
                  }
               }
            } else if (this.l1IIl1IIl1lIlll != null && ListHolder_8.Event(Triggerbot.class)) {
               Slot Slotx = this.l1IIl1IIl1lIlll;
               this.l1IIl1IIl1lIlll = null;
               ListHolder_8.StringHolder_8(Triggerbot.class, () -> {
                  if (!(l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler)) {
                     ListHolder_5.IIl1IlI1l11Il();
                  }

                  ListHolder_5.StringHolder_8(Slotx, Hand.MAIN_HAND, true);
               });
            }

            if (this.I1IllI1l1lIIII
               && this.ll11ll1llIlIlIIII11l.Spider()
               && l11I1I1ll1Illll1I1l1111l1II.player.isUsingItem()
               && l11I1I1ll1Illll1I1l1111l1II.player.getActiveItem().getItem() instanceof ShieldItem) {
               l11I1I1ll1Illll1I1l1111l1II.interactionManager.stopUsingItem(l11I1I1ll1Illll1I1l1111l1II.player);
            }
         }
      }
   }

   public boolean II1lll1l1l1lII1l111() {
      return this.ZenithInternal095(II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1());
   }

   public boolean ZenithInternal095(floatHolder_6 il1ll111liili1ll11liil) {
      return this.EventTarget(il1ll111liili1ll11liil, this.llllllIllIIl1Il1lIlI1I1lIIl11l(), this.llIl11llIII1IIlI1.getBoundingBox())
         || this.EventTarget(il1ll111liili1ll11liil, this.llllllIllIIl1Il1lIlI1I1lIIl11l(), this.IllIlIl1l11l111lII1lIlIlIl1l1());
   }

   public boolean EventTarget(floatHolder_6 il1ll111liili1ll11liil, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Box Box) {
      return ZenithInternal088.StringHolder_8(
         il1ll111liili1ll11liil, Vec3d, Box, (double)this.l1l11IlII.lll1lI1llll1IIllIIIII1lll(), !this.I1IIIII1IIlI111Il1II11111I.Spider()
      );
   }

   public net.minecraft.util.math.Vec3d llllllIllIIl1Il1lIlI1I1lIIl11l() {
      return l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F);
   }

   public net.minecraft.util.math.Vec3d StringHolder_8(net.minecraft.util.math.Box Box, float f) {
      return new net.minecraft.util.math.Vec3d(
         MathHelper.lerp(0.5, Box.minX, Box.maxX),
         MathHelper.lerp((double)f, Box.minY, Box.maxY),
         MathHelper.lerp(0.5, Box.minZ, Box.maxZ)
      );
   }

   public net.minecraft.util.math.Box IllIlIl1l11l111lII1lIlIlIl1l1() {
      return this.llIl11llIII1IIlI1.getBoundingBox();
   }

   @EventTarget
   public void EventTarget(PlayerInputHolder ili11i1il11) {
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
         && (!this.ll11ll1llIlIlIIII11l.Spider() || !(l11I1I1ll1Illll1I1l1111l1II.player.getActiveItem().getItem() instanceof ShieldItem))
         && !this.l1111lI1l1I1Illl1Il1Ill1IllII.Spider()) {
         return false;
      } else {
         return !this.l1Il1I1II1IllIl1lIll1111l1lll.Spider()
               || ZenithInternal071.StringHolder_8(lll111ll1i1l11l1)
               || ZenithInternal071.EventBus(lll111ll1i1l11l1)
               || this.IlllIlIIlI111Il1IIlIl.Spider() && !l11I1I1ll1Illll1I1l1111l1II.options.jumpKey.isPressed()
            ? this.StringHolder_8(1.0F, !this.lIllI1I1I1())
            : false;
      }
   }

   public boolean lIllI1I1I1() {
      if (l11I1I1ll1Illll1I1l1111l1II.player.isGliding() || ZenithInternal071.DrawContextImpl()) {
         return false;
      } else {
         return !this.l1Il1I1II1IllIl1lIll1111l1lll.Spider()
            ? false
            : !this.IlllIlIIlI111Il1IIlIl.Spider() || l11I1I1ll1Illll1I1l1111l1II.options.jumpKey.isPressed();
      }
   }

   public boolean Ill111II1lI11IlII1llI111I1() {
      if (ZenithInternal066.StringHolder_4(this.llIl11llIII1IIlI1)) {
         return false;
      } else if (l11I1I1ll1Illll1I1l1111l1II.player.isUsingItem() && !this.l1111lI1l1I1Illl1Il1Ill1IllII.Spider()) {
         return false;
      } else if (!this.lIllI1I1I1()
         || ZenithInternal071.IdentifierHolder_2()
            && (
               !ZenithClient.getInstance().SupplierHolder().I11I1llll11IIl1IIl1I1ll1I1I1l1()
                  || this.I1III1lI1l11lllIII11Il1IlIIl1I.isSelected()
                  || this.l1lI1IIllIIl.isSelected()
            )) {
         if (this.IllIlIl1I1.Spider()) {
            long i = (long)(l11I1I1ll1Illll1I1l1111l1II.player.age - this.l1IIIlIIl11II1);
            if (doubleHolder_3.ZenithInternal101((float)i, (float)this.Illll1I1lllI1IIlll1IllIIIl1) == 0.0F) {
               return false;
            }
         }

         return this.StringHolder_8(0.0F, !this.lIllI1I1I1() || this.I1IllI1l1lIIII) && this.lllII1l1IlI1l.HostnameVerifierImpl(1L);
      } else {
         return false;
      }
   }

   public boolean StringHolder_8(float f, boolean flag) {
      if (this.lll11ll1Ill1IllIllIllIIIll.ClearHeadersHandler(1)) {
         return !ZenithInternal071.DrawContextImpl() && !l11I1I1ll1Illll1I1l1111l1II.player.isOnGround()
            ? (double)l11I1I1ll1Illll1I1l1111l1II.player.getAttackCooldownProgress(0.5F) > 0.9
            : l11I1I1ll1Illll1I1l1111l1II.player.getAttackCooldownProgress(0.5F) >= 1.0F;
      } else {
         if (!this.l1111I1lIl1lllll11IlII1111lI.isSelected()) {
            flag = false;
         }

         float f1 = this.IIlI111l1llIIl111.isSelected() ? this.Il11ll1lllll1l.lll1lI1llll1IIllIIIII1lll() : 1.0F;
         float f2 = this.IIlI111l1llIIl111.isSelected() ? this.IlII11l1l111ll1l1l1l1I11IIlI.lll1lI1llll1IIllIIIII1lll() : 1.0F;
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
         if (this.I1l1IIlll11l1llIlI.isSelected()) {
            flag = false;
            if (l11I1I1ll1Illll1I1l1111l1II.player.isSprinting()) {
               flag1 = false;
            }
         }

         if (this.llI11II11lI1IllIllIIIIIlI1l1l.isSelected()) {
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

   public boolean lI11ll11ll1l11II1l111() {
      return !this.I1III1lI1l11lllIII11Il1IlIIl1I.isSelected() && !ZenithInternal071.DrawContextImpl();
   }

   private LivingEntity lI11l11111lI1lII() {
      return LivingEntityHolder.StringHolder_8(
         l11I1I1ll1Illll1I1l1111l1II.world.getEntities(),
         this.l1l11IlII.lll1lI1llll1IIllIIIII1lll() + 0.5F,
         this.I1IIIII1IIlI111Il1II11111I.Spider(),
         ((MultiBooleanSetting)this.lI1llIlIlllIllIlIIllIll1lI11.getSettings().get(0)).lIIll1ll11111I1llII111IllI1ll(),
         ((MultiBooleanSetting)this.lI1llIlIlllIllIlIIllIll1lI11.getSettings().get(1)).lIIll1ll11111I1llII111IllI1ll(),
         ((BooleanSetting)this.lI1llIlIlllIllIlIIllIll1lI11.getSettings().get(2)).Spider()
      );
   }

   public LivingEntity lI1IIllII11I() {
      return this.Spider() ? this.llIl11llIII1IIlI1 : null;
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
