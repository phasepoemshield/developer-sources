package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.InventorySetting;
import org.zenith.module.XrayBypass;

import org.zenith.event.Event18;
import org.zenith.module.InventorySetting;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.module.XrayBypass;



import net.minecraft.text.Text;

public class GameMessageEvent extends Event18 {
   public Text text;
   public boolean boolean150;

   public GameMessageEvent(Text var1) {
      this.text = var1;
   }

   public void on23(Text var1) {
      this.boolean150 = true;
      this.text = var1;
      this.cancel();
   }

   public Text InventorySetting() {
      return this.text;
   }

   public boolean XrayBypass() {
      return this.boolean150;
   }
}
