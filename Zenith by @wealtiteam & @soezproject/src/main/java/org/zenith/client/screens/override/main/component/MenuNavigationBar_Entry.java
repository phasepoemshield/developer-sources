package org.zenith.client.screens.override.main.component;

import org.zenith.core.UiAnimation;
import org.zenith.event.Event18Ext2;
import org.zenith.event.EventMixin_modifySetScreenArg;

import org.zenith.utility.render.display.base.AnimationValue;

import org.zenith.util.Item;
import org.zenith.core.Easing;
import org.zenith.core.BotFeatureRegistry;














final class MenuNavigationBar_Entry {
   public final MenuNavigationBar_Item item;
   public final AnimationValue bounds = new AnimationValue(0.0F, 0.0F, 0.0F, 0.0F);
   public final org.zenith.core.UiAnimation activity = new org.zenith.core.UiAnimation(220L, Easing.EventMixin_modifySetScreenArg);
   public final org.zenith.core.UiAnimation hover = new org.zenith.core.UiAnimation(180L, Easing.Event18Ext2);

   public MenuNavigationBar_Entry(MenuNavigationBar_Item var1) {
      this.item = var1;
   }
}
