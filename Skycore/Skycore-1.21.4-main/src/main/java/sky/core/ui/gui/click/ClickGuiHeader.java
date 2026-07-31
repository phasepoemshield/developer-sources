package sky.core.ui.gui.click;

import java.util.List;
import net.minecraft.client.util.math.MatrixStack;
import sky.core.ui.gui.click.component.ModuleCard;
import sky.core.module.Category;
import sky.core.util.ColorUtil;
import sky.core.util.render.RenderUtil;
import sky.core.util.render.font.FontManager;
import sky.core.util.render.font.FontRenderer;

public final class ClickGuiHeader {
    private static final float TEXT_PADDING_X = 10.0F;
    private static final float TEXT_TOP_PADDING = 8.0F;
    public static final float HEIGHT = 22.0F;

    public void render(
            RenderUtil renderer,
            MatrixStack matrices,
            float panelX,
            float panelY,
            float panelWidth,
            Category category,
            List<ModuleCard> cards,
            float alpha
    ) {
        ClickGuiTheme theme = ClickGuiTheme.theme;
        FontRenderer font = FontManager.getRegular(theme.getFontFooter());
        float textY = panelY + TEXT_TOP_PADDING;

        String expandedModule = null;
        for (ModuleCard card : cards) {
            if (card.isExpanded()) {
                expandedModule = card.getModule().getName();
            }
        }

        float cursorX = panelX + TEXT_PADDING_X;
        cursorX = this.drawPart(font, "Skycore", cursorX, textY, theme.getFooterText(), alpha, matrices);
        cursorX = this.drawSeparator(font, cursorX, textY, theme.getFooterText(), alpha, matrices);

        if (expandedModule != null) {
            cursorX = this.drawPart(font, category.getDisplayName(), cursorX, textY, theme.getFooterText(), alpha, matrices);
            cursorX = this.drawSeparator(font, cursorX, textY, theme.getFooterText(), alpha, matrices);
            this.drawPart(font, expandedModule, cursorX, textY, theme.getText(), alpha, matrices);
        } else {
            this.drawPart(font, category.getDisplayName(), cursorX, textY, theme.getText(), alpha, matrices);
        }
    }

    private float drawPart(FontRenderer font, String text, float x, float y, java.awt.Color color, float alpha, MatrixStack matrices) {
        font.draw(text, x, y, ColorUtil.withAlpha(color, alpha), matrices);
        return x + font.getWidth(text);
    }

    private float drawSeparator(FontRenderer font, float x, float y, java.awt.Color color, float alpha, MatrixStack matrices) {
        String separator = " / ";
        font.draw(separator, x, y, ColorUtil.withAlpha(color, alpha), matrices);
        return x + font.getWidth(separator);
    }
}
