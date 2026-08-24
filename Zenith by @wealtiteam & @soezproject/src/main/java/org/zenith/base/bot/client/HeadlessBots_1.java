package org.zenith.base.bot.client;

import org.zenith.module.Bot;

import org.zenith.core.BotFeatureRegistry;














import java.util.concurrent.ThreadFactory;

class HeadlessBots_1 implements ThreadFactory {
   public int index;

   HeadlessBots_1() {
   }

   @Override
   public synchronized Thread newThread(Runnable var1) {
      Thread thread = new Thread(var1, "hbot-proxy-ping-" + this.index++);
      thread.setDaemon(true);
      return thread;
   }
}
