package org.zenith.client.screens.bot;

import org.zenith.module.Bot;
import org.zenith.module.Module;

import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;













enum BotScreen_BulkAction {
   CONNECT("Z", "module.bot.connect", "module.bot.connect", "module.bot.connectTo"),
   CHAT("d", "module.bot.chat", "module.bot.send", "module.bot.message"),
   RCT("7", "module.bot.rct", "module.bot.rct", "module.bot.anarchy");

   final String icon;
   final String tabKey;
   final String buttonKey;
   final String placeholderKey;

   private BotScreen_BulkAction(String var3, String var4, String var5, String var6) {
      this.icon = var3;
      this.tabKey = var4;
      this.buttonKey = var5;
      this.placeholderKey = var6;
   }
}
