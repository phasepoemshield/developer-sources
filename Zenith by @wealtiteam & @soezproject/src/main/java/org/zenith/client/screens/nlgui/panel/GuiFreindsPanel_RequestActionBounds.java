package org.zenith.client.screens.nlgui.panel;

import org.zenith.client.screens.nlgui.panel.api.Panel;

import org.zenith.utility.render.display.base.CornerRadiusF;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;














final class GuiFreindsPanel_RequestActionBounds {
   public final String uid;
   public final CornerRadiusF acceptBounds;
   public final CornerRadiusF declineBounds;

   public GuiFreindsPanel_RequestActionBounds(String var1, CornerRadiusF var2, CornerRadiusF var3) {
      this.uid = var1;
      this.acceptBounds = var2;
      this.declineBounds = var3;
   }
}
