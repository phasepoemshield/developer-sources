package sky.core.ui.gui.click;

import java.awt.Color;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import sky.core.util.render.RenderUtil;
import sky.core.util.render.font.FontManager;
import sky.core.util.render.font.FontRenderer;
import sky.core.util.ColorUtil;

public final class ClickGuiEmpty {
    private static final String TEXT = "Hmmm, there's nothing to look for...";
    private static final Identifier LOCK_ICON = Identifier.of("skycore", "textures/clickgui/zamok.png");
    private static final int ICON_ALPHA = 200;
    private static final int FONT_SIZE = 15;

    public void render(RenderUtil renderer, MatrixStack matrices, float panelX, float panelY, float panelWidth, float panelHeight, float alpha) {
        ClickGuiTheme theme = ClickGuiTheme.theme;
        float areaTop = panelY + theme.getModuleTop();
        float areaHeight = panelHeight - theme.getModuleTop() - 8.0F;
        float centerX = panelX + panelWidth / 2.0F;
        float centerY = areaTop + areaHeight / 2.0F;

        float iconCenterY = centerY - 10.0F;
        renderer.drawTextureNative(
                LOCK_ICON,
                centerX,
                iconCenterY,
                new Color(255, 255, 255, ICON_ALPHA),
                matrices
        );

        FontRenderer font = FontManager.getRegular(FONT_SIZE);
        font.drawCentered(
                TEXT,
                centerX,
                centerY + 4.0F,
                ColorUtil.withAlpha(theme.getFooterText(), alpha),
                matrices
        );
    }
}
