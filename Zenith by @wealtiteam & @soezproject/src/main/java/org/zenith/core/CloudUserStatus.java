package org.zenith.core;

import org.zenith.hud.HudElementText2;

import org.zenith.event.AttackEntityEvent;
import org.zenith.event.Event18Ext5;


record CloudUserStatus(CloudUserProfile HudElementText2, boolean HudInfoBoxPrimary) {

   public CloudUserProfile AttackEntityEvent() {
      return this.HudElementText2;
   }

   public boolean Event18Ext5() {
      return this.HudInfoBoxPrimary;
   }
}
