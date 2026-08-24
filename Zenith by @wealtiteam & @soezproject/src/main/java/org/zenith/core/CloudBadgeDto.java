package org.zenith.core;

import org.zenith.event.Event29;

public record CloudBadgeDto(String string48, String string49, String string50) {

   public String id() {
      return this.string48;
   }

   public String HudInventoryPanel() {
      return this.string49;
   }

   public String Event29() {
      return this.string50;
   }
}
