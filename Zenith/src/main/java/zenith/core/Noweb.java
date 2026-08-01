package zenith;

import net.minecraft.block.Blocks;

@ModuleInfo(
   name = "NoWeb",
   category = Category.MOVEMENT,
   description = "Noweb"
)
public final class Noweb extends Module {
   public static final Noweb l1I1l1lIIlI1I1lIl11lI1I = new Noweb();

   private Noweb() {
   }

   @EventTarget
   public void EventBus(BlockHolder illl1ilili1il11ll11) {
      if (illl1ilili1il11ll11.Strafe() == Blocks.COBWEB) {
         if (ZenithInternal066.StringHolder_8(l11I1I1ll1Illll1I1l1111l1II.options.jumpKey.getDefaultKey())) {
            l11I1I1ll1Illll1I1l1111l1II.player.setVelocity(new net.minecraft.util.math.Vec3d(0.0, 1.0, 0.0));
         } else if (ZenithInternal066.StringHolder_8(l11I1I1ll1Illll1I1l1111l1II.options.sneakKey.getDefaultKey())) {
            l11I1I1ll1Illll1I1l1111l1II.player.setVelocity(new net.minecraft.util.math.Vec3d(0.0, -3.0, 0.0));
         }

         if (l11I1I1ll1Illll1I1l1111l1II.player.input.movementForward != 0.0F || l11I1I1ll1Illll1I1l1111l1II.player.input.movementSideways != 0.0F) {
            double[] adouble = ZenithInternal047.byteHolder(0.62F);
            l11I1I1ll1Illll1I1l1111l1II.player
               .setVelocity(new net.minecraft.util.math.Vec3d(adouble[0], l11I1I1ll1Illll1I1l1111l1II.player.getVelocity().y, adouble[1]));
         }
      }
   }
}
