package org.zenith.utility.game.other.render;

import org.zenith.event.Event37;

import org.zenith.utility.render.display.base.HudDrawContext;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.ClickFxController;
import org.zenith.core.MenuScreenId;
import org.zenith.core.CloudResponse;













import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public abstract class CustomScreen extends Screen {
   protected CustomScreen() {
      super(Text.empty());
   }

   public abstract void render(HudDrawContext var1, float var2, float var3);

   @Override
   public final void render(DrawContext context, int mouseX, int mouseY, float delta) {
      HudDrawContext ililll1lli1i11l11l111i1l1 = HudDrawContext.of(context, mouseX, mouseY, delta);
      this.render(ililll1lli1i11l11l111i1l1, (float)mouseX, (float)mouseY);
      super.render(context, mouseX, mouseY, delta);
   }

   @Override
   public final boolean mouseClicked(double mouseX, double mouseY, int button) {
      MenuScreenId ll1lil1ii1iil1l = MenuScreenId.Event37(button);
      this.onMouseClicked(mouseX, mouseY, ll1lil1ii1iil1l);
      return super.mouseClicked(mouseX, mouseY, button);
   }

   @Override
   public void tick() {
   }

   @Override
   public final boolean mouseReleased(double mouseX, double mouseY, int button) {
      MenuScreenId ll1lil1ii1iil1l = MenuScreenId.Event37(button);
      this.onMouseReleased(mouseX, mouseY, ll1lil1ii1iil1l);
      return super.mouseReleased(mouseX, mouseY, button);
   }

   @Override
   public final boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
      MenuScreenId ll1lil1ii1iil1l = MenuScreenId.Event37(button);
      this.onMouseDragged(mouseX, mouseY, ll1lil1ii1iil1l, deltaX, deltaY);
      return super.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
   }

   public void onMouseClicked(double var1, double var3, MenuScreenId var5) {
   }

   public void onMouseReleased(double var1, double var3, MenuScreenId var5) {
   }

   public void onMouseDragged(double var1, double var3, MenuScreenId var5, double var6, double var8) {
   }
}
