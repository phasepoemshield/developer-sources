package org.zenith.client.screens.nlgui.elements.api;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.ClickFxController;
import org.zenith.core.MenuScreenId;
import org.zenith.core.ClientProvider;














public abstract class Element implements ClientProvider {
   public Element() {
   }

   public abstract String getName();

   public boolean isVisible() {
      return true;
   }

   public abstract float getHeight();

   public abstract float getWidth();

   public abstract boolean onMouseClicked(double var1, double var3, MenuScreenId var5);

   public boolean keyPressed(int var1, int var2, int var3) {
      return false;
   }

   public void onMouseReleased(double var1, double var3, MenuScreenId var5) {
   }

   public boolean charTyped(char var1, int var2) {
      return false;
   }
}
