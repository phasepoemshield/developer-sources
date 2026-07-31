package l;

public class AutoEvent extends Helper242 {
   private Setting2 triggerDelayMs = new Setting2("Delay ms", "Delay before sending event command").method2086(350.0F).method2079(0, 5000);
   private Helper339 enterWatch = new Helper339();
   private Helper339 sendCooldown = new Helper339();
   private int lastAnarchy = -1;
   private boolean pendingCommand;

   public AutoEvent() {
      super("AutoEvent", "Auto Event", Helper269.MISC);
      this.setup(new Helper264[]{this.triggerDelayMs});
   }

   @Override
   public void activate() {
      super.activate();
      this.pendingCommand = false;
      this.lastAnarchy = -1;
      this.enterWatch.method3358();
      this.sendCooldown.method3358();
   }

   @Override
   public void deactivate() {
      super.deactivate();
      this.pendingCommand = false;
      this.lastAnarchy = -1;
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null && mc.getNetworkHandler() != null) {
         int var2 = Helper128.method1059();
         boolean var3 = var2 > 0 && (this.lastAnarchy <= 0 || var2 != this.lastAnarchy);
         if (var3) {
            this.pendingCommand = true;
            this.enterWatch.method3358();
         }

         if (var2 <= 0) {
            this.pendingCommand = false;
         }

         if (this.pendingCommand && this.enterWatch.method3356(this.triggerDelayMs.method2082()) && this.sendCooldown.method3356(1000.0)) {
            mc.getNetworkHandler().sendChatCommand("event delay");
            this.pendingCommand = false;
            this.sendCooldown.method3358();
         }

         this.lastAnarchy = var2;
      }
   }
}
