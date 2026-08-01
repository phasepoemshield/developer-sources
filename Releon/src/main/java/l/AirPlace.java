package l;

import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;

public class AirPlace extends Helper242 {
   public AirPlace() {
      super("AirPlace", "Air Place", Helper269.PLAYER);
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null && mc.interactionManager != null && mc.options != null) {
         if (mc.options.useKey.isPressed() && mc.currentScreen == null) {
            HitResult var2 = mc.player.raycast(4.5, 1.0F, true);
            if (var2 instanceof BlockHitResult var3 && var2.getType() == Type.BLOCK) {
               ActionResult var4 = mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var3);
               if (var4.isAccepted()) {
                  mc.player.swingHand(Hand.MAIN_HAND);
               }
            }
         }
      }
   }
}
