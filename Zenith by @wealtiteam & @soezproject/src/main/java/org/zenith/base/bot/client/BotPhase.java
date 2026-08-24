package org.zenith.base.bot.client;

import org.zenith.module.Bot;




public enum BotPhase {
   CONNECTING,
   LOGIN,
   CONFIGURATION,
   PLAY,
   DISCONNECTED;

   private BotPhase() {
   }
}
