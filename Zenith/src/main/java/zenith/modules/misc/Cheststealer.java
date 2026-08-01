// Module: ChestStealer
// Category: misc
// Original class: Cheststealer
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.misc;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.slot.Slot;

@ModuleInfo(
   name = "ChestStealer",
   category = Category.MISC,
   description = ""
)
public final class Cheststealer extends Module {
   private final ModeSetting lII1lI1IIlIl1II1Il1 = new ModeSetting(
      "module.chestStealer.mode",
      "module.chestStealer.mode.desc",
      "module.chestStealer.mode.funTime",
      "module.chestStealer.mode.holyWorld",
      "module.chestStealer.mode.reallyWorld",
      "module.chestStealer.mode.custom"
   );
   public static final Cheststealer lll1Illllll1ll = new Cheststealer();
   private final NumberSetting l1IIlIl11Il1II = new NumberSetting(
      "module.chestStealer.startDelay", 4.0F, 0.0F, 60.0F, 1.0F, "module.chestStealer.startDelay.desc", "t"
   );
   private final NumberSetting I1I1111lIlll1III11IlI1l1l = new NumberSetting(
      "module.chestStealer.delay", 0.0F, 0.0F, 60.0F, 1.0F, "module.chestStealer.delay.desc", "t"
   );
   private final NumberSetting IlIII1I1IlIlIIl11lIlI = new NumberSetting(
      "module.chestStealer.maxDelay", 6.0F, 0.0F, 60.0F, 1.0F, "module.chestStealer.maxDelay.desc", "t"
   );
   private final NumberSetting II1llI1l1Illl1l1I = new NumberSetting(
      "module.chestStealer.closeDelay", 4.0F, 0.0F, 60.0F, 1.0F, "module.chestStealer.closeDelay.desc", "t"
   );
   private final BooleanSetting Illll1Ill1l1I1I1Ill1I = new BooleanSetting(
      "module.chestStealer.closeScreen", "module.chestStealer.closeScreen.desc", true
   );
   private final longHolder l1lllIII111l11I1lI = new longHolder();
   private final longHolder I1I1II1lIlllIl1lI11llIl1 = new longHolder();
   private final longHolder l11IllII1IIlI = new longHolder();
   private int lIllIlllll1I1llllI = -1;
   private boolean I1I11lIIlIlII = false;
   private boolean Il1llI1I = false;

   private Cheststealer() {
      this.l1IIlIl11Il1II.StringHolder_8(() -> this.lII1lI1IIlIl1II1Il1.EventImpl_15("module.chestStealer.mode.custom"));
      this.I1I1111lIlll1III11IlI1l1l.StringHolder_8(() -> this.lII1lI1IIlIl1II1Il1.EventImpl_15("module.chestStealer.mode.custom"));
      this.IlIII1I1IlIlIIl11lIlI.StringHolder_8(() -> this.lII1lI1IIlIl1II1Il1.EventImpl_15("module.chestStealer.mode.custom"));
      this.II1llI1l1Illl1l1I
         .StringHolder_8(() -> this.lII1lI1IIlIl1II1Il1.EventImpl_15("module.chestStealer.mode.custom") && this.Illll1Ill1l1I1I1Ill1I.Spider());
   }

   private void lII11I1I1lI111l1I1l1lII() {
      this.lIllIlllll1I1llllI = -1;
      this.I1I11lIIlIlII = false;
      this.Il1llI1I = false;
      this.I1I1II1lIlllIl1lI11llIl1.reset();
      this.l11IllII1IIlI.reset();
   }

   private float lI1II11lIl11IlI1Ill1I1III() {
      if (this.lII1lI1IIlIl1II1Il1.EventImpl_15("module.chestStealer.mode.funTime")) {
         return 8.0F;
      } else if (this.lII1lI1IIlIl1II1Il1.EventImpl_15("module.chestStealer.mode.holyWorld")) {
         return 1.0F;
      } else {
         return this.lII1lI1IIlIl1II1Il1.EventImpl_15("module.chestStealer.mode.reallyWorld") ? 5.0F : this.l1IIlIl11Il1II.lll1lI1llll1IIllIIIII1lll();
      }
   }

   private float Il1Il11I1I1lllIlII1IlI() {
      if (this.lII1lI1IIlIl1II1Il1.EventImpl_15("module.chestStealer.mode.funTime")) {
         return 4.0F;
      } else if (this.lII1lI1IIlIl1II1Il1.EventImpl_15("module.chestStealer.mode.holyWorld")) {
         return 1.0F;
      } else {
         return this.lII1lI1IIlIl1II1Il1.EventImpl_15("module.chestStealer.mode.reallyWorld")
            ? 1.0F
            : this.I1I1111lIlll1III11IlI1l1l.lll1lI1llll1IIllIIIII1lll();
      }
   }

   private float I111Il11llI1lI() {
      if (this.lII1lI1IIlIl1II1Il1.EventImpl_15("module.chestStealer.mode.funTime")) {
         return 8.0F;
      } else if (this.lII1lI1IIlIl1II1Il1.EventImpl_15("module.chestStealer.mode.holyWorld")) {
         return 1.0F;
      } else {
         return this.lII1lI1IIlIl1II1Il1.EventImpl_15("module.chestStealer.mode.reallyWorld")
            ? 4.0F
            : this.IlIII1I1IlIlIIl11lIlI.lll1lI1llll1IIllIIIII1lll();
      }
   }

   private float l1I1lllll1I1lI11l1I() {
      if (this.lII1lI1IIlIl1II1Il1.EventImpl_15("module.chestStealer.mode.funTime")) {
         return 7.0F;
      } else if (this.lII1lI1IIlIl1II1Il1.EventImpl_15("module.chestStealer.mode.holyWorld")) {
         return 0.0F;
      } else {
         return this.lII1lI1IIlIl1II1Il1.EventImpl_15("module.chestStealer.mode.reallyWorld") ? 2.0F : this.II1llI1l1Illl1l1I.lll1lI1llll1IIllIIIII1lll();
      }
   }

   @EventTarget
   public void StringHolder_8(EventImpl_34 ll1li1l111llllli1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof GenericContainerScreenHandler GenericContainerScreenHandler && l11I1I1ll1Illll1I1l1111l1II.currentScreen != null) {
         if (this.lIllIlllll1I1llllI != GenericContainerScreenHandler.syncId) {
            this.lIllIlllll1I1llllI = GenericContainerScreenHandler.syncId;
            this.I1I1II1lIlllIl1lI11llIl1.reset();
            this.l11IllII1IIlI.reset();
            this.l1lllIII111l11I1lI.reset();
            this.I1I11lIIlIlII = false;
            this.Il1llI1I = false;
         }

         if (!this.I1I11lIIlIlII) {
            if (!this.I1I1II1lIlllIl1lI11llIl1.HostnameVerifierImpl((long)this.lI1II11lIl11IlI1Ill1I1III() * 50L)) {
               return;
            }

            this.I1I11lIIlIlII = true;
         }

         String s2 = l11I1I1ll1Illll1I1l1111l1II.currentScreen.getTitle().getString();
         String s = ZenithClient.getInstance().StringHolder_31().translate("module.chestStealer.title.auction");
         String s1 = ZenithClient.getInstance().StringHolder_31().translate("module.chestStealer.title.purchases");
         boolean flag = s2.contains(s) || s2.contains(s1);
         int i = GenericContainerScreenHandler.getInventory().size();
         List list = IntStream.range(0, i).boxed().collect(Collectors.toList());
         Collections.shuffle(list);
         if (!flag) {
            for (int j : list) {
               Slot Slot = GenericContainerScreenHandler.getSlot(j);
               if (Slot.hasStack()) {
                  long k = (long)doubleHolder_3.EventImpl_21(
                     (double)Math.min(this.Il1Il11I1I1lllIlII1IlI(), this.I111Il11llI1lI()),
                     (double)Math.max(this.Il1Il11I1I1lllIlII1IlI(), this.I111Il11llI1lI())
                  );
                  if (this.l1lllIII111l11I1lI.HostnameVerifierImpl(k * 50L)) {
                     l11I1I1ll1Illll1I1l1111l1II.interactionManager
                        .clickSlot(GenericContainerScreenHandler.syncId, j, 0, SlotActionType.QUICK_MOVE, l11I1I1ll1Illll1I1l1111l1II.player);
                     this.l1lllIII111l11I1lI.reset();
                     this.Il1llI1I = false;
                     break;
                  }
               }
            }
         }

         boolean flag1 = this.ZenithInternal095(GenericContainerScreenHandler);
         if (this.Illll1Ill1l1I1I1Ill1I.Spider() && flag1) {
            if (!this.Il1llI1I) {
               this.Il1llI1I = true;
               this.l11IllII1IIlI.reset();
               return;
            }

            if (this.l11IllII1IIlI.HostnameVerifierImpl((long)this.l1I1lllll1I1lI11l1I() * 50L)) {
               l11I1I1ll1Illll1I1l1111l1II.player.closeHandledScreen();
               this.Il1llI1I = false;
            }
         } else {
            this.Il1llI1I = false;
         }

         return;
      }

      this.lII11I1I1lI111l1I1l1lII();
   }

   private boolean ZenithInternal095(GenericContainerScreenHandler GenericContainerScreenHandler) {
      for (int i = 0; i < (GenericContainerScreenHandler.getInventory().size() == 90 ? 54 : 27); i++) {
         if (GenericContainerScreenHandler.getSlot(i).hasStack()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void onEnable() {
      super.l11l1lII();
      this.lII11I1I1lI111l1I1l1lII();
      this.l1lllIII111l11I1lI.reset();
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      super.l1l1lI111l1II1Illl111l1l1ll1l();
      this.lII11I1I1lI111l1I1l1lII();
      this.l1lllIII111l11I1lI.reset();
   }
}
