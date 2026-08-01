package zenith;

import net.minecraft.block.Blocks;

@ModuleInfo(
   name = "NoSweetSlow",
   category = Category.MOVEMENT,
   description = "Noweb"
)
public final class Nosweetslow extends Module {
   public static final Nosweetslow llII1II1lllIIlII1llll = new Nosweetslow();
   private final NumberSetting IlIIl1IIl1IlI1IIl1Il1 = new NumberSetting(
      "module.noSweetSlow.speed", 1.5F, 0.8F, 1.8F, 0.05F, "module.noSweetSlow.speed.desc", "x"
   );

   private Nosweetslow() {
   }

   @EventTarget
   public void EventBus(BlockHolder illl1ilili1il11ll11) {
      if (illl1ilili1il11ll11.Strafe() == Blocks.SWEET_BERRY_BUSH) {
         illl1ilili1il11ll11.EventBus(true);
         l11I1I1ll1Illll1I1l1111l1II.player
            .slowMovement(
               l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(illl1ilili1il11ll11.Velocity()),
               new net.minecraft.util.math.Vec3d(
                  (double)this.IlIIl1IIl1IlI1IIl1Il1.lll1lI1llll1IIllIIIII1lll(), 0.75, (double)this.IlIIl1IIl1IlI1IIl1Il1.lll1lI1llll1IIllIIIII1lll()
               )
            );
      }
   }
}
