package org.zenith.core;

import org.zenith.event.Event43;

import com.darkmagician6.eventapi.EventManager;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.MinecraftClient;

public class TaskQueueThread {
   public Thread thread;
   public volatile boolean running;

   public TaskQueueThread() {
   }

   public void start() {
      if (!this.running) {
         this.running = true;
         this.thread = new Thread(() -> {
            while (this.running) {
               try {
                  try {
                     if (MinecraftClient.getInstance().player != null) {
                        MinecraftClient.getInstance().execute(() -> EventManager.call(new Event43()));
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
         this.thread.setDaemon(true);
         this.thread.start();
      }
   }

   public void stop() {
      this.running = false;
      if (this.thread != null) {
         this.thread.interrupt();
         this.thread = null;
      }
   }
}
