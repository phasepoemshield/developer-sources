// Module: FastBreak
// Category: misc
// Original class: Fastbreak
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.misc;

import net.minecraft.util.math.BlockPos;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.GlUniform7;

@ModuleInfo(
   name = "FastBreak",
   category = Category.MISC,
   description = "Ускоряет добычу блоков"
)
public final class Fastbreak extends Module {
   public static final Fastbreak l1I1lllIll11 = new Fastbreak();
   private final NumberSetting III1lIlIlI1lIlII = new NumberSetting(
      "module.fastBreak.breakDamage", 0.8F, 0.1F, 1.0F, 0.1F, "module.fastBreak.breakDamage.desc", "%"
   );
   private final BooleanSetting l11lIllllI1l1Ill1 = new BooleanSetting(
      "module.fastBreak.bypass", "module.fastBreak.bypass.desc", true
   );

   private Fastbreak() {
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_22 l11llilil1) {
      l11I1I1ll1Illll1I1l1111l1II.interactionManager.blockBreakingCooldown = 0;
      if (l11I1I1ll1Illll1I1l1111l1II.interactionManager.currentBreakingProgress > 0.0F) {
         l11I1I1ll1Illll1I1l1111l1II.interactionManager.currentBreakingProgress = 1.0F;
      }
   }

   @EventTarget
   public void EventImpl_13(PacketHolder ii1l11il1i1i) {
      if (this.l11lIllllI1l1Ill1.Spider()) {
         if (ii1l11il1i1i.Swinganimation() instanceof PlayerActionC2SPacket PlayerActionC2SPacket && PlayerActionC2SPacket.getAction() == GlUniform7.STOP_DESTROY_BLOCK) {
            BlockPos BlockPos = PlayerActionC2SPacket.getPos();
            if (BlockPos != null) {
               l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler()
                  .sendPacket(new PlayerActionC2SPacket(GlUniform7.ABORT_DESTROY_BLOCK, BlockPos.up(), PlayerActionC2SPacket.getDirection()));
            }
         }
      }
   }
}
