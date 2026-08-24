package org.zenith.util;

import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.EventGetBasicProjectionMatrixHook2;

import java.util.HashSet;

public class ItemExt extends Item<String> {
   public ItemExt() {
      super("staffName.json", "", new ItemExt_1().getType(), HashSet::new);
   }

   public boolean EventGetBasicProjectionMatrixHook2(String var1) {
      return this.getItems().contains(var1);
   }
}
