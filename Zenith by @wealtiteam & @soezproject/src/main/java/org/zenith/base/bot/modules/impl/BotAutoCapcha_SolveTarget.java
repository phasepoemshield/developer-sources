package org.zenith.base.bot.modules.impl;

import org.zenith.module.Module;

import org.zenith.module.Bot;

import org.zenith.base.bot.client.BotClient;
import org.zenith.module.Bot;















record BotAutoCapcha_SolveTarget(BotClient bot) {

   public boolean isConnected() {
      return this.bot.isJoined();
   }

   public String label() {
      return this.bot.getName();
   }
}
