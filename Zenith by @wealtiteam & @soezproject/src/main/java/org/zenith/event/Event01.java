package org.zenith.event;

import org.zenith.module.Bot;
import org.zenith.module.Module;

import org.zenith.module.InventorySetting;

import org.zenith.module.InventorySetting;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;

import org.zenith.base.bot.client.BotClient;














import com.darkmagician6.eventapi.events.Event;
import net.minecraft.text.Text;

public class Event01 implements Event {
   public final BotClient botClient;
   public final Text text;

   public BotClient getBot() {
      return this.botClient;
   }

   public Text InventorySetting() {
      return this.text;
   }

   public Event01(BotClient var1, Text var2) {
      this.botClient = var1;
      this.text = var2;
   }
}
