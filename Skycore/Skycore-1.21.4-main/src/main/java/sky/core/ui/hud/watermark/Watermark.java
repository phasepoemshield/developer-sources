package sky.core.ui.hud.watermark;

import java.awt.Color;

import com.sun.jna.platform.win32.Netapi32Util;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;
import ru.fametyca.UserProfile;
import sky.core.util.drag.DragController;
import sky.core.util.drag.WatermarkDrag;
import sky.core.ui.gui.click.ClickGuiTheme;
import sky.core.module.impl.visuals.InterfaceModule;
import sky.core.util.render.RenderUtil;
import sky.core.util.render.font.FontManager;
import sky.core.util.render.font.FontRenderer;

public final class Watermark {
    private static final float RADIUS = 14.0F;
    private static final int TEXT_SIZE = 14;
    private static final float TEXT_PADDING_X = 10.0F;
    private static final float ITEM_GAP = 8.0F;
    private static final float SEPARATOR_RADIUS = 2.5F;
    private static final Color TEXT_COLOR = new Color(255, 255, 255, 255);
    private static final Color FPS_SUFFIX_COLOR = new Color(140, 140, 140, 255);
    private static final String BRAND_TEXT = "SkyCore";
    private static final String FPS_SUFFIX = "fps";

    private String pcName;

    public void render(MatrixStack matrices, float screenWidth) {
        InterfaceModule module = InterfaceModule.INSTANCE;
        if (!module.isWatermarkEnabled()) {
            return;
        }

        RenderUtil renderer = RenderUtil.get();
        if (renderer == null) {
            return;
        }
        boolean showPcName = module.showPcName.get();
        boolean showFps = module.showFps.get();

        WatermarkDrag drag = DragController.getInstance().getWatermark();
        FontRenderer font = FontManager.getRegular(TEXT_SIZE);

        float contentWidth = TEXT_PADDING_X + font.getWidth(BRAND_TEXT);
        if (showPcName) {
            contentWidth += ITEM_GAP + SEPARATOR_RADIUS * 2.0F + ITEM_GAP + font.getWidth(this.getPcName());
        }
        if (showFps) {
            String fpsValueText = String.valueOf(MinecraftClient.getInstance().getCurrentFps());
            contentWidth += ITEM_GAP + SEPARATOR_RADIUS * 2.0F + ITEM_GAP + font.getWidth(fpsValueText) + font.getWidth(FPS_SUFFIX);
        }
        contentWidth += TEXT_PADDING_X;

        drag.setWidth(contentWidth);
        drag.ensureInitialized(screenWidth);

        float x = drag.getX();
        float y = drag.getY();
        float centerY = y + drag.getHeight() / 2.0F;
        ClickGuiTheme theme = ClickGuiTheme.theme;
        renderer.drawVerticalGradientRoundedRect(x, y, drag.getWidth(), drag.getHeight(), RADIUS, theme.getPanelTop(), theme.getPanelBottom(), matrices);

        float cursorX = x + TEXT_PADDING_X;
        float textY = y + (drag.getHeight() - font.getLineHeight(BRAND_TEXT)) / 2.0F;

        font.draw(BRAND_TEXT, cursorX, textY, TEXT_COLOR, matrices);
        cursorX += font.getWidth(BRAND_TEXT);

        if (showPcName) {
            cursorX += ITEM_GAP + SEPARATOR_RADIUS;
            renderer.drawCircle(cursorX, centerY, SEPARATOR_RADIUS, theme.getHudSeparator(), matrices);
            cursorX += SEPARATOR_RADIUS + ITEM_GAP;

            font.draw(this.getPcName(), cursorX, textY, TEXT_COLOR, matrices);
            cursorX += font.getWidth(this.getPcName());
        }

        if (showFps) {
            String fpsValueText = String.valueOf(MinecraftClient.getInstance().getCurrentFps());
            cursorX += ITEM_GAP + SEPARATOR_RADIUS;
            renderer.drawCircle(cursorX, centerY, SEPARATOR_RADIUS, theme.getHudSeparator(), matrices);
            cursorX += SEPARATOR_RADIUS + ITEM_GAP;

            font.draw(fpsValueText, cursorX, textY, TEXT_COLOR, matrices);
            cursorX += font.getWidth(fpsValueText);
            font.draw(FPS_SUFFIX, cursorX, textY, FPS_SUFFIX_COLOR, matrices);
        }
    }

    private String getPcName() {
      String anus = UserProfile.username;
        return anus;
    }
}