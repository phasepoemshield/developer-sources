package zenith;

import zenith.hud.*;

import net.minecraft.util.PlayerInput;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.input.Input;

public class InputImpl$Helper extends Input {
   public boolean llIl1Illlll1IIll = false;
   public float I1IIllIIIll111III1IllIIl1I1Ill;
   public float ll1lI1IIllIlIl;
   public PlayerInput lIllllllIIl1IIIIIll1lIl1l;
   public static final double IlIIl11II11l1 = 0.121;

   public InputImpl$Helper(PlayerInput PlayerInput) {
      this.lIllllllIIl1IIIIIll1lIl1l = PlayerInput;
   }

   public void Coordinates() {
      if (this.lIllllllIIl1IIIIIll1lIl1l.forward() != this.lIllllllIIl1IIIIIll1lIl1l.backward()) {
         this.I1IIllIIIll111III1IllIIl1I1Ill = this.lIllllllIIl1IIIIIll1lIl1l.forward() ? 1.0F : -1.0F;
      } else {
         this.I1IIllIIIll111III1IllIIl1I1Ill = 0.0F;
      }

      if (this.lIllllllIIl1IIIIIll1lIl1l.left() == this.lIllllllIIl1IIIIIll1lIl1l.right()) {
         this.ll1lI1IIllIlIl = 0.0F;
      } else {
         this.ll1lI1IIllIlIl = this.lIllllllIIl1IIIIIll1lIl1l.left() ? 1.0F : -1.0F;
      }
   }

   public String toString() {
      return "SimulatedPlayerInput(forwards={"
         + this.lIllllllIIl1IIIIIll1lIl1l.forward()
         + "}, backwards={"
         + this.lIllllllIIl1IIIIIll1lIl1l.backward()
         + "}, left={"
         + this.lIllllllIIl1IIIIIll1lIl1l.left()
         + "}, right={"
         + this.lIllllllIIl1IIIIIll1lIl1l.right()
         + "}, jumping={"
         + this.lIllllllIIl1IIIIIll1lIl1l.jump()
         + "}, sprinting="
         + this.lIllllllIIl1IIIIIll1lIl1l.sprint()
         + ", slowDown="
         + this.lIllllllIIl1IIIIIll1lIl1l.sneak()
         + ")";
   }

   public static InputImpl$Helper EventBus(PlayerInput PlayerInput) {
      return new InputImpl$Helper(PlayerInput);
   }

   public static InputImpl$Helper EventImpl_21(PlayerEntity PlayerEntity) {
      net.minecraft.util.math.Vec3d Vec3d = PlayerEntity.getPos()
         .subtract(new net.minecraft.util.math.Vec3d(PlayerEntity.prevX, PlayerEntity.prevY, PlayerEntity.prevZ));
      double d0 = Vec3d.horizontalLengthSquared();
      PlayerInput PlayerInput = new PlayerInput(false, false, false, false, !PlayerEntity.isOnGround(), PlayerEntity.isSneaking(), d0 >= 0.014641);
      if (d0 > 0.0025000000000000005) {
         double d1 = ZenithInternal047.StringHolder_8(Vec3d, PlayerEntity.getYaw());
         double d2 = MathHelper.wrapDegrees(d1);
         PlayerInput = ZenithInternal047.StringHolder_8(PlayerInput, d2);
      }

      return new InputImpl$Helper(PlayerInput);
   }
}
