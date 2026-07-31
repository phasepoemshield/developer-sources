// Module: Strafe
// Category: movement
// Original class: Strafe
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.movement;

import net.minecraft.client.input.KeyboardInput;

@ModuleInfo(
   name = "Strafe",
   description = "",
   category = Category.MOVEMENT
)
public final class Strafe extends Module {
   public static final Strafe IlII1I1Ill1IIlll111I1Il11lI1I = new Strafe();

   private Strafe() {
   }

   @EventTarget
   public void EventImpl_13(EventImpl_30 ll1iil11ii) {
      float f = KeyboardInput.getMovementMultiplier(
         l11I1I1ll1Illll1I1l1111l1II.options.forwardKey.isPressed(), l11I1I1ll1Illll1I1l1111l1II.options.backKey.isPressed()
      );
      float f1 = KeyboardInput.getMovementMultiplier(
         l11I1I1ll1Illll1I1l1111l1II.options.leftKey.isPressed(), l11I1I1ll1Illll1I1l1111l1II.options.rightKey.isPressed()
      );
      if (f != 0.0F || f1 != 0.0F) {
         float f2 = l11I1I1ll1Illll1I1l1111l1II.player.getYaw();
         float f3 = (float)Math.toDegrees(Math.atan2((double)(-f1), (double)f));
         float f4 = f2 + f3;
         floatHolder_6 il1ll111liili1ll11liil = II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1()
            .StringHolder_8(
               II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1().longHolder_6(new floatHolder_6(f4, l11I1I1ll1Illll1I1l1111l1II.player.getPitch()))
            );
         II1ll1II1l11lI.StringHolder_8(
            new SupplierHolder(
               il1ll111liili1ll11liil,
               () -> II1ll1II1l11lI.I1IlIlIlllI1III1l1l1I1l1IlI111().StringHolder_8(llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II(), il1ll111liili1ll11liil),
               llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II()
            ),
            -1,
            this
         );
      }
   }

   @EventTarget
   public void ConnectThread(PlayerInputHolder ili11i1il11) {
      if (ZenithInternal047.IlIllI1lI11Ill11llII1111l() && II1ll1II1l11lI.lIIII11lIIl1() == this) {
         ili11i1il11.StringHolder_5(false);
         ili11i1il11.ZenithException_2(false);
         ili11i1il11.ClearHeadersHandler(false);
         ili11i1il11.ZenithInternal061(
            l11I1I1ll1Illll1I1l1111l1II.options.forwardKey.isPressed()
               || l11I1I1ll1Illll1I1l1111l1II.options.backKey.isPressed()
               || l11I1I1ll1Illll1I1l1111l1II.options.rightKey.isPressed()
               || l11I1I1ll1Illll1I1l1111l1II.options.leftKey.isPressed()
         );
      }
   }
}
