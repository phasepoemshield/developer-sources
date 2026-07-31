package l;

import antidaunleak.api.annotation.Native;
import java.util.Arrays;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;

public class AutoTpAccept extends Helper242 {
   private final String[] teleportMessages = new String[]{
      "has requested teleport", "просит телепортироваться", "хочет телепортироваться к вам", "просит к вам телепортироваться"
   };
   private boolean canAccept;
   private final Setting3 friendSetting = new Setting3("Только друзья", "Будет принимать запросы только от друзей").method2201(true);

   public AutoTpAccept() {
      super("AutoTpAccept", "Auto Tp Accept", Helper269.MISC);
      this.setup(new Helper264[]{this.friendSetting});
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginMutation
   )
   public void onPacket(Helper386 var1) {
      if (var1.method3895() instanceof GameMessageS2CPacket var2) {
         String var5 = var2.content().getString();
         boolean var4 = !this.friendSetting.method2200() || Helper309.method3078().stream().anyMatch(var1x -> var5.contains(var1x.getName()));
         if (this.method3700(var5)) {
            this.canAccept = var4;
         }
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (!Helper128.method1047() && this.canAccept) {
         mc.player.networkHandler.sendChatCommand("tpaccept");
         this.canAccept = false;
      }
   }

   private boolean method3700(String var1) {
      return Arrays.stream(this.teleportMessages).map(String::toLowerCase).anyMatch(var1::contains);
   }
}
