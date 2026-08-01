package zenith;

import java.util.List;
import net.minecraft.entity.player.PlayerEntity;

@ModuleInfo(
   name = "AutoLeave",
   category = Category.MISC,
   description = ""
)
public final class Autoleave extends Module {
   public static final Autoleave II1lIl111II1l1I1ll1IlI1II1ll1 = new Autoleave();
   private final MultiBooleanSetting l1ll1IlI11lll11I1IlIl1l1IlIl1 = MultiBooleanSetting.StringHolder_8(
      "leave.factor", "module.autoLeave.leaveFactor.desc", List.of("leave.health", "leave.players", "Distance")
   );
   private final NumberSetting l11lIl1lI1l11IIl11I1IIll = new NumberSetting(
      "leave.health",
      15.0F,
      1.0F,
      20.0F,
      1.0F,
      "module.autoLeave.minHealth.desc",
      "hp",
      () -> this.l1ll1IlI11lll11I1IlIl1l1IlIl1.ConstructorHolder(0),
      null
   );
   private final NumberSetting Illlll111 = new NumberSetting(
      "Radius",
      300.0F,
      3.0F,
      300.0F,
      10.0F,
      "module.autoLeave.leaveRadius.desc",
      "b",
      () -> this.l1ll1IlI11lll11I1IlIl1l1IlIl1.ConstructorHolder(2),
      null
   );
   private final NumberSetting llllllIl1I1 = new NumberSetting("leave.time", 0.0F, 0.0F, 200.0F, 10.0F, "module.autoLeave.leaveTime.desc", "s");
   private final StringSetting l1111IlI1I1lIlIIIIl1lIlIIlI = new StringSetting(
      "leave.command", "module.autoLeave.command.desc", "/hub", "leave.command.description"
   );
   private int III1ll1IIllI1lI1ll1lIIIIlI1 = 0;

   private Autoleave() {
   }

   @Override
   public void onEnable() {
      this.III1ll1IIllI1lI1ll1lIIIIlI1 = -1;
      super.l11l1lII();
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_22 l11llilil1) {
      if (this.I1IIlI11I()) {
         this.III1ll1IIllI1lI1ll1lIIIIlI1++;
      }

      if ((float)this.III1ll1IIllI1lI1ll1lIIIIlI1 >= this.llllllIl1I1.lll1lI1llll1IIllIIIII1lll()) {
         if (this.l1111IlI1I1lIlIIIIl1lIlIIlI.getValue().startsWith("/")) {
            l11I1I1ll1Illll1I1l1111l1II.player.networkHandler.sendChatCommand(this.l1111IlI1I1lIlIIIIl1lIlIIlI.getValue().substring(1));
         } else {
            l11I1I1ll1Illll1I1l1111l1II.player.networkHandler.sendChatMessage(this.l1111IlI1I1lIlIIIIl1lIlIIlI.getValue());
         }

         this.lI1Il11I1l1III11IIlI1lI1II11I();
      }
   }

   private boolean I1IIlI11I() {
      if (l11I1I1ll1Illll1I1l1111l1II.player.getHealth() < this.l11lIl1lI1l11IIl11I1IIll.lll1lI1llll1IIllIIIII1lll()
         && this.l1ll1IlI11lll11I1IlIl1l1IlIl1.ConstructorHolder(0)) {
         return true;
      } else {
         for (PlayerEntity PlayerEntity : l11I1I1ll1Illll1I1l1111l1II.world.getPlayers()) {
            if (!ZenithClient.getInstance().StringHolder_26().EventBus(PlayerEntity)
               && PlayerEntity != l11I1I1ll1Illll1I1l1111l1II.player
               && (
                  !this.l1ll1IlI11lll11I1IlIl1l1IlIl1.ConstructorHolder(2)
                     || !(
                        PlayerEntity.squaredDistanceTo(l11I1I1ll1Illll1I1l1111l1II.player)
                           > (double)(this.Illlll111.lll1lI1llll1IIllIIIII1lll() * this.Illlll111.lll1lI1llll1IIllIIIII1lll())
                     )
               )) {
               return true;
            }
         }

         return false;
      }
   }
}
