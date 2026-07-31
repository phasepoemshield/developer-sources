package l;

import antidaunleak.api.annotation.Native;
import net.minecraft.block.Blocks;

public class NoWeb extends Helper242 {
   public final Setting5 webMode = new Setting5("Режим", "Выберите режим обхода").method2381("Grim");

   public static NoWeb method2308() {
      return Helper222.method1979(NoWeb.class);
   }

   public NoWeb() {
      super("NoWeb", "No Web", Helper269.MOVEMENT);
      this.setup(new Helper264[]{this.webMode});
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginUltra
   )
   public void onTick(Event8 var1) {
      if (Helper38.method539(Blocks.COBWEB)) {
         double[] var2 = Helper165.method1352(0.35);
         mc.player.addVelocity(var2[0], 0.0, var2[1]);
         mc.player.velocity.y = mc.options.jumpKey.isPressed() ? 0.65F : (mc.options.sneakKey.isPressed() ? -0.65F : 0.0);
      }
   }
}
