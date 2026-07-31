package l;

import java.util.Objects;
import net.minecraft.client.option.Perspective;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import net.minecraft.util.math.Vec3d;

public class FreeCam extends Helper242 {
   private final Setting2 speedSetting = new Setting2("Скорость", "Выберите скорость камеры отладки").method2086(2.0F).method2078(0.5F, 5.0F);
   private final Setting3 freezeSetting = new Setting3("Заморозка", "Вы замораживаетесь на месте").method2201(false);
   public Vec3d pos;
   public Vec3d prevPos;

   public static FreeCam method3641() {
      return Helper222.method1979(FreeCam.class);
   }

   public FreeCam() {
      super("FreeCam", "Free Cam", Helper269.MISC);
      this.setup(new Helper264[]{this.speedSetting, this.freezeSetting});
   }

   @Override
   public void activate() {
      this.prevPos = this.pos = new Vec3d(mc.getEntityRenderDispatcher().camera.getPos().toVector3f());
      super.activate();
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      Packet var10000 = var1.method3895();
      Objects.requireNonNull(var10000);
      Object var2 = var10000;
      switch (var2) {
         case PlayerMoveC2SPacket var4 when this.freezeSetting.method2200():
            var1.method582();
            break;
         case PlayerRespawnS2CPacket var5:
            this.setState(false);
            break;
         case GameJoinS2CPacket var6:
            this.setState(false);
            break;
         default:
      }
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
      Helper183.method1545(mc.player.getBoundingBox().offset(Helper147.method1247(mc.player).subtract(mc.player.getPos())), -1, 1.0F);
   }

   @Helper104
   public void method3642(Event13 var1) {
      if (this.freezeSetting.method2200()) {
         var1.method3726(Vec3d.ZERO);
      }
   }

   @Helper104
   public void onInput(Helper379 var1) {
      float var2 = this.speedSetting.method2082();
      double[] var3 = Helper165.method1363(var1.method3767(), var1.method3768(), var2);
      this.prevPos = this.pos;
      this.pos = this.pos.add(var3[0], var1.method3776().jump() ? var2 : (var1.method3776().sneak() ? -var2 : 0.0), var3[1]);
      var1.method3766();
   }

   @Helper104
   public void method3643(Event9 var1) {
      var1.method3707(Helper147.method1246(this.prevPos, this.pos));
      mc.options.setPerspective(Perspective.FIRST_PERSON);
   }
}
