// Module: Grim Glide
// Category: movement
// Original class: GrimGlide
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.movement;

@ModuleInfo(
   name = "Grim Glide",
   category = Category.MOVEMENT,
   description = ""
)
public final class GrimGlide extends Module {
   public static final GrimGlide lI1IlIlIl111 = new GrimGlide();
   private final longHolder ll1l1l1I1l1II111l1IIllIl1lI1I = new longHolder();
   private int I1llII111llllllI1l1 = 0;

   private GrimGlide() {
   }

   @EventTarget
   public void byteHolder(PlayerInputHolder ili11i1il11) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null
         && l11I1I1ll1Illll1I1l1111l1II.world != null
         && l11I1I1ll1Illll1I1l1111l1II.player.isGliding()) {
         this.I1llII111llllllI1l1++;
         net.minecraft.util.math.Vec3d Vec3d = l11I1I1ll1Illll1I1l1111l1II.player.getPos();
         float f = l11I1I1ll1Illll1I1l1111l1II.player.getYaw();
         double d0 = (l11I1I1ll1Illll1I1l1111l1II.player.age % 2 == 0 ? 0.087 : 0.09) - 0.0;
         double d1 = -Math.sin(Math.toRadians((double)f)) * d0;
         double d2 = Math.cos(Math.toRadians((double)f)) * d0;
         l11I1I1ll1Illll1I1l1111l1II.player.setPosition(Vec3d.getX() + d1, Vec3d.getY(), Vec3d.getZ() + d2);
      }
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      this.ll1l1l1I1l1II111l1IIllIl1lI1I.reset();
      this.I1llII111llllllI1l1 = 0;
      super.l1l1lI111l1II1Illl111l1l1ll1l();
   }
}
