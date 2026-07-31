package l;

import fat.releon.Releon;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;

public class Helper439 implements Helper404 {
   public static boolean serverSprint;
   public static int selectedSlot;

   public Helper439() {
   }

   @Helper104
   public void onTick(Event8 var1) {
      Helper337.method3337().method3338();
      Helper128.method1043();
      Releon.method71().method33().method3246();
      Helper59.method654();
      Releon.method71().method26().method788().forEach(Helper119::method308);
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      switch (var1.method3895()) {
         case ClientCommandC2SPacket var4:
            serverSprint = switch (var4.getMode()) {
               case START_SPRINTING -> true;
               case STOP_SPRINTING -> false;
               default -> serverSprint;
            };
            break;
         case UpdateSelectedSlotC2SPacket var5:
            selectedSlot = var5.getSelectedSlot();
            break;
         default:
      }

      Helper128.method1044(var1);
      Releon.method71().method33().onPacket(var1);
      Releon.method71().method26().method788().forEach(var1x -> var1x.method309(var1));
   }

   @Helper104
   public void method4590(Helper429 var1) {
      Releon.method71().method33().method3249(var1);
   }
}
