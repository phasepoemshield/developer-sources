// Module: NoDelay
// Category: movement
// Original class: Nodelay
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.movement;

import java.util.List;
import java.util.Objects;

@ModuleInfo(
   name = "NoDelay",
   description = "",
   category = Category.MOVEMENT
)
public final class Nodelay extends Module {
   private final MultiBooleanSetting IIllI1lIlI11II1IllI = MultiBooleanSetting.StringHolder_8(
      "module.noDelay.ignoreSetting",
      "module.noDelay.ignoreSetting.desc",
      List.of("module.noDelay.ignoreSetting.jump", "module.noDelay.ignoreSetting.use", "module.noDelay.ignoreSetting.break")
   );
   public static final Nodelay ll1llIllIl1llll1IlIIl1ll = new Nodelay();

   private Nodelay() {
   }

   @EventTarget
   public void EventBus(EventImpl_22 l11llilil1) {
      if (this.IIllI1lIlI11II1IllI.ConstructorHolder(2)) {
         l11I1I1ll1Illll1I1l1111l1II.interactionManager.blockBreakingCooldown = 0;
      }

      if (this.IIllI1lIlI11II1IllI.ConstructorHolder(0)) {
         Objects.requireNonNull(l11I1I1ll1Illll1I1l1111l1II.player).jumpingCooldown = 0;
      }

      if (this.IIllI1lIlI11II1IllI.ConstructorHolder(1)) {
         l11I1I1ll1Illll1I1l1111l1II.itemUseCooldown = 0;
      }
   }
}
