package l;

import net.minecraft.client.MinecraftClient;

public class ShiftTap extends Helper242 {
   private long shiftTapEndTime = 0L;
   private boolean isModuleControllingSneak = false;
   private int shiftTapDuration = 100;
   private final MinecraftClient mc = MinecraftClient.getInstance();

   public ShiftTap() {
      super("ShiftTap", "Auto Shift", Helper269.COMBAT);
   }

   private void method4135() {
      this.shiftTapEndTime = System.currentTimeMillis() + 25L;
      if (!this.isModuleControllingSneak) {
         this.mc.options.sneakKey.setPressed(true);
         this.isModuleControllingSneak = true;
      }
   }

   private void method4136() {
      if (this.isModuleControllingSneak) {
         this.mc.options.sneakKey.setPressed(false);
         this.isModuleControllingSneak = false;
      }
   }

   @Helper104
   public void method4137(Helper401 var1) {
      if (this.mc.player != null) {
         this.method4135();
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (this.mc.player != null && !this.mc.player.isSpectator()) {
         long var2 = System.currentTimeMillis();
         if (this.isModuleControllingSneak && var2 > this.shiftTapEndTime) {
            this.method4136();
         }
      } else {
         this.method4136();
      }
   }
}
