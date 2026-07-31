package zenith;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadHolder$Helper {
   private Thread l1Il1lIlIlI1I11I1IlI1;
   private volatile boolean MinecraftClientHolder_3;

   public void start() {
      if (!this.MinecraftClientHolder_3) {
         this.MinecraftClientHolder_3 = true;
         this.l1Il1lIlIlI1I11I1IlI1 = new Thread(() -> {
            while (this.MinecraftClientHolder_3) {
               try {
                  try {
                     if (net.minecraft.client.MinecraftClient.getInstance().player != null) {
                        net.minecraft.client.MinecraftClient.getInstance().execute(() -> EventBus.StringHolder_8((Event)(new EventImpl_29())));
                     }
                  } catch (Exception exception) {
                     exception.printStackTrace();
                  }

                  int i = ThreadLocalRandom.current().nextInt(40, 60);
                  Thread.sleep((long)i);
               } catch (InterruptedException interruptedexception) {
               }
            }
         }, "RandomEventCaller");
         this.l1Il1lIlIlI1I11I1IlI1.setDaemon(true);
         this.l1Il1lIlIlI1I11I1IlI1.start();
      }
   }

   public void stop() {
      this.MinecraftClientHolder_3 = false;
      if (this.l1Il1lIlIlI1I11I1IlI1 != null) {
         this.l1Il1lIlIlI1I11I1IlI1.interrupt();
         this.l1Il1lIlIlI1I11I1IlI1 = null;
      }
   }
}
