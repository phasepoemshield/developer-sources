package org.zenith.event;

import org.zenith.module.Bot;
import org.zenith.module.Module;

import org.zenith.module.ItemDebug;

import org.zenith.module.ItemDebug;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;

import org.zenith.base.bot.client.BotClient;














import com.darkmagician6.eventapi.events.Event;
import net.minecraft.text.Text;

public class Event19 implements Event {
   public final BotClient botClient4;
   public final Text text2;

   public BotClient getBot() {
      return this.botClient4;
   }

   public Text ItemDebug() {
      return this.text2;
   }

   public Event19(BotClient var1, Text var2) {
      this.botClient4 = var1;
      this.text2 = var2;
   }
}
