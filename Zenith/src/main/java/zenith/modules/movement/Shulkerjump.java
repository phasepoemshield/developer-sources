// Module: ShulkerJump
// Category: movement
// Original class: Shulkerjump
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.movement;

import net.minecraft.screen.ShulkerBoxScreenHandler;

@ModuleInfo(
   name = "ShulkerJump",
   category = Category.MOVEMENT,
   description = "Подлетаешь вверх при взаимодействии с шалкером"
)
public final class Shulkerjump extends Module {
   public static final Shulkerjump III11ll1llIlIlI1lllIIl111I1 = new Shulkerjump();
   int lIIl1I1IIl1lIl1l = 0;
   boolean I1IlIIl1lI1Il1ll11lI1II1l1lI1I = false;

   @EventTarget
   public void EventBus(EventImpl_22 l11llilil1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         if (l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof ShulkerBoxScreenHandler && !this.I1IlIIl1lI1Il1ll11lI1II1l1lI1I) {
            l11I1I1ll1Illll1I1l1111l1II.options.jumpKey.setPressed(true);
            l11I1I1ll1Illll1I1l1111l1II.player.closeHandledScreen();
            l11I1I1ll1Illll1I1l1111l1II.player.addVelocity(0.0, 2.4, 0.0);
            this.I1IlIIl1lI1Il1ll11lI1II1l1lI1I = true;
            this.lIIl1I1IIl1lIl1l = 0;
         }

         if (this.I1IlIIl1lI1Il1ll11lI1II1l1lI1I) {
            if (this.lIIl1I1IIl1lIl1l >= 5) {
               l11I1I1ll1Illll1I1l1111l1II.player.closeHandledScreen();
               l11I1I1ll1Illll1I1l1111l1II.options.jumpKey.setPressed(false);
               this.I1IlIIl1lI1Il1ll11lI1II1l1lI1I = false;
               this.lIIl1I1IIl1lIl1l = 0;
            } else {
               this.lIIl1I1IIl1lIl1l++;
            }
         }
      }
   }
}
