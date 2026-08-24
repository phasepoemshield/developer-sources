package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.module.ViewArmorDurability;
import org.zenith.module.ViewModel;


public record CloudConfigMetaDto(String ViewArmorDurability, String ViewModel) {

   public String userId() {
      return this.ViewArmorDurability;
   }

   public String HudInventoryPanel() {
      return this.ViewModel;
   }
}
