package zenith;

@ModuleInfo(
   name = "AutoRespawn",
   category = Category.MISC,
   description = "Автоматически возрождается после смерти"
)
public final class Autorespawn extends Module {
   public static final Autorespawn IIIIl1I1I = new Autorespawn();

   private Autorespawn() {
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_22 l11llilil1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         if (l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof net.minecraft.client.gui.screen.DeathScreen && l11I1I1ll1Illll1I1l1111l1II.player.deathTime > 5) {
            l11I1I1ll1Illll1I1l1111l1II.player.requestRespawn();
            l11I1I1ll1Illll1I1l1111l1II.setScreen(null);
         }
      }
   }
}
