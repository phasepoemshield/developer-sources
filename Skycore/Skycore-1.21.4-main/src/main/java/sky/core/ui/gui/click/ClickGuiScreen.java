package sky.core.ui.gui.click;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;
import sky.core.Skycore;
import sky.core.ui.gui.click.component.ModuleCard;
import sky.core.ui.gui.click.theme.ThemeEditor;
import sky.core.module.Category;
import sky.core.module.Module;
import sky.core.util.render.RenderUtil;
import sky.core.util.render.ScissorUtil;
import sky.core.util.render.ScreenScale;
import sky.core.util.animation.SmoothFloat;

public final class ClickGuiScreen extends Screen {
    private static final float PANEL_WIDTH = 411.0F;
    private static final float PANEL_HEIGHT = 220.0F;
    private static final float SIDEBAR_WIDTH = 38.0F;
    private static final float SIDEBAR_GAP = 6.0F;
    private static final float PANEL_PADDING = 12.0F;
    private static final float MODULE_TOP = ClickGuiHeader.HEIGHT + 6.0F;
    private static final float GRID_GAP = 6.5F;
    private static final float BOTTOM_PADDING = 8.0F;
    private static final float SCROLL_STEP = 14.0F;
    private static final float SCROLL_SMOOTHING = 0.28F;

    private final Map<Category, List<ModuleCard>> cardsByCategory = new EnumMap<>(Category.class);
    private final CategorySidebar categorySidebar = new CategorySidebar();
    private final ClickGuiHeader header = new ClickGuiHeader();
    private final ClickGuiEmpty emptyState = new ClickGuiEmpty();
    private final ThemeEditor themeEditor = new ThemeEditor();

    private final SmoothFloat moduleScroll = new SmoothFloat(SCROLL_SMOOTHING);
    private float moduleContentHeight;

    public ClickGuiScreen() {
        super(Text.literal("Skycore"));
        for (Category category : Category.values()) {
            List<ModuleCard> cards = new ArrayList<>();
            for (Module module : Skycore.getInstance().getModuleManager().getModules(category)) {
                cards.add(new ModuleCard(module));
            }
            this.cardsByCategory.put(category, cards);
        }
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        RenderUtil renderer = RenderUtil.get();
        if (renderer == null) {
            return;
        }

        ClickGuiTheme theme = ClickGuiTheme.theme;
        theme.setModuleTop(MODULE_TOP);

        context.draw();
        ScreenScale.begin(2.0);

        float screenWidth = ScreenScale.getRenderWidth();
        float screenHeight = ScreenScale.getRenderHeight();
        float groupWidth = SIDEBAR_WIDTH + SIDEBAR_GAP + PANEL_WIDTH;
        float totalHeight = PANEL_HEIGHT + this.themeEditor.getTotalHeight();
        float groupX = (screenWidth - groupWidth) / 2.0F;
        float groupY = (screenHeight - totalHeight) / 2.0F;
        float sidebarX = groupX;
        float panelX = groupX + SIDEBAR_WIDTH + SIDEBAR_GAP;
        float themePanelWidth = this.themeEditor.getPanelWidth();
        float themeX = panelX + (PANEL_WIDTH - themePanelWidth) / 2.0F;
        float themeY = groupY + PANEL_HEIGHT + this.themeEditor.getPanelGap();

        renderer.drawRoundedRect(0.0F, 0.0F, screenWidth, screenHeight, 0.0F, theme.getOverlay(), context.getMatrices());

        this.categorySidebar.render(renderer, context.getMatrices(), sidebarX, groupY, SIDEBAR_WIDTH, PANEL_HEIGHT, 1.0F);

        renderer.drawVerticalGradientRoundedRect(
                panelX,
                groupY,
                PANEL_WIDTH,
                PANEL_HEIGHT,
                theme.getPanelRadius(),
                theme.getPanelTop(),
                theme.getPanelBottom(),
                context.getMatrices()
        );

        Category selectedCategory = this.categorySidebar.getSelectedCategory();
        List<ModuleCard> cards = this.cardsByCategory.get(selectedCategory);

        this.header.render(renderer, context.getMatrices(), panelX, groupY, PANEL_WIDTH, selectedCategory, cards, 1.0F);

        if (cards.isEmpty()) {
            this.emptyState.render(renderer, context.getMatrices(), panelX, groupY, PANEL_WIDTH, PANEL_HEIGHT, 1.0F);
        } else {
            this.layoutModules(panelX, groupY, cards);
            this.renderModules(renderer, context, panelX, groupY, cards, mouseX, mouseY);
        }

        this.themeEditor.render(renderer, context.getMatrices(), themeX, themeY, 1.0F);

        ScreenScale.end();
    }

    private void layoutModules(float panelX, float panelY, List<ModuleCard> cards) {
        float contentX = panelX + PANEL_PADDING;
        float contentY = panelY + MODULE_TOP;
        float contentWidth = PANEL_WIDTH - PANEL_PADDING * 2.0F;
        float cardWidth = (contentWidth - GRID_GAP) / 2.0F;
        float leftX = contentX;
        float rightX = contentX + cardWidth + GRID_GAP;
        float leftY = contentY;
        float rightY = contentY;

        for (int i = 0; i < cards.size(); i++) {
            ModuleCard card = cards.get(i);
            card.setWidth(cardWidth);
            card.prepareLayout();

            if (i % 2 == 0) {
                card.setX(leftX);
                card.setLayoutY(leftY);
                leftY += card.getHeight() + GRID_GAP;
            } else {
                card.setX(rightX);
                card.setLayoutY(rightY);
                rightY += card.getHeight() + GRID_GAP;
            }
        }

        this.moduleContentHeight = Math.max(leftY, rightY) - contentY;
        float visibleHeight = this.getModuleVisibleHeight();
        float maxScroll = Math.max(0.0F, this.moduleContentHeight - visibleHeight);
        this.moduleScroll.setTarget(Math.max(0.0F, Math.min(maxScroll, this.moduleScroll.getTarget())));
    }

    private void updateModuleScroll() {
        this.moduleScroll.update();
    }

    private float getAnimatedModuleScroll() {
        return this.moduleScroll.get();
    }

    private void renderModules(RenderUtil renderer, DrawContext context, float panelX, float panelY, List<ModuleCard> cards, int mouseX, int mouseY) {
        this.updateModuleScroll();
        float visibleHeight = this.getModuleVisibleHeight();
        float scroll = this.getAnimatedModuleScroll();
        ScissorUtil.enable(panelX, panelY + MODULE_TOP, PANEL_WIDTH, visibleHeight);

        for (ModuleCard card : cards) {
            card.setY(card.getLayoutY() - scroll);
            card.render(renderer, context.getMatrices(), mouseX, mouseY, 1.0F);
        }

        ScissorUtil.disable();
    }

    private void applyScrollToCards(float panelX, float panelY, List<ModuleCard> cards) {
        this.layoutModules(panelX, panelY, cards);
        this.updateModuleScroll();
        float scroll = this.getAnimatedModuleScroll();
        for (ModuleCard card : cards) {
            card.setY(card.getLayoutY() - scroll);
        }
    }

    private float getModuleVisibleHeight() {
        return PANEL_HEIGHT - MODULE_TOP - BOTTOM_PADDING;
    }

    private float getPanelX() {
        float screenWidth = ScreenScale.getRenderWidth();
        float groupWidth = SIDEBAR_WIDTH + SIDEBAR_GAP + PANEL_WIDTH;
        return (screenWidth - groupWidth) / 2.0F + SIDEBAR_WIDTH + SIDEBAR_GAP;
    }

    private float getPanelY() {
        float screenHeight = ScreenScale.getRenderHeight();
        float totalHeight = PANEL_HEIGHT + this.themeEditor.getTotalHeight();
        return (screenHeight - totalHeight) / 2.0F;
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        float screenWidth = ScreenScale.getRenderWidth();
        float screenHeight = ScreenScale.getRenderHeight();
        float groupWidth = SIDEBAR_WIDTH + SIDEBAR_GAP + PANEL_WIDTH;
        float totalHeight = PANEL_HEIGHT + this.themeEditor.getTotalHeight();
        float themePanelWidth = this.themeEditor.getPanelWidth();
        float groupX = (screenWidth - groupWidth) / 2.0F;
        float groupY = (screenHeight - totalHeight) / 2.0F;
        float panelX = groupX + SIDEBAR_WIDTH + SIDEBAR_GAP;
        float themeX = panelX + (PANEL_WIDTH - themePanelWidth) / 2.0F;
        float themeY = groupY + PANEL_HEIGHT + this.themeEditor.getPanelGap();

        if (this.themeEditor.mouseClicked(mouseX, mouseY, button, themeX, themeY)) {
            return true;
        }

        float sidebarX = groupX;

        if (this.categorySidebar.mouseClicked(mouseX, mouseY, button, sidebarX, groupY, SIDEBAR_WIDTH, PANEL_HEIGHT)) {
            this.moduleScroll.setImmediate(0.0F);
            return true;
        }

        List<ModuleCard> cards = this.cardsByCategory.get(this.categorySidebar.getSelectedCategory());
        this.applyScrollToCards(panelX, groupY, cards);

        for (ModuleCard card : cards) {
            card.mouseClicked(mouseX, mouseY, button);
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    public boolean mouseReleased(double mouseX, double mouseY, int button) {
        float panelX = this.getPanelX();
        float panelY = this.getPanelY();
        List<ModuleCard> cards = this.cardsByCategory.get(this.categorySidebar.getSelectedCategory());
        this.applyScrollToCards(panelX, panelY, cards);

        for (ModuleCard card : cards) {
            card.mouseReleased(mouseX, mouseY, button);
        }
        return super.mouseReleased(mouseX, mouseY, button);
    }

    @Override
    public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
        float panelX = this.getPanelX();
        float panelY = this.getPanelY();
        List<ModuleCard> cards = this.cardsByCategory.get(this.categorySidebar.getSelectedCategory());
        this.applyScrollToCards(panelX, panelY, cards);

        for (ModuleCard card : cards) {
            card.mouseDragged(mouseX, mouseY, button);
        }
        return super.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
        List<ModuleCard> cards = this.cardsByCategory.get(this.categorySidebar.getSelectedCategory());
        if (cards.isEmpty()) {
            return false;
        }

        float panelX = this.getPanelX();
        float panelY = this.getPanelY();
        if (!GuiMath.isHovered(mouseX, mouseY, panelX, panelY + MODULE_TOP, PANEL_WIDTH, this.getModuleVisibleHeight())) {
            return false;
        }

        this.layoutModules(panelX, panelY, cards);
        float maxScroll = Math.max(0.0F, this.moduleContentHeight - this.getModuleVisibleHeight());
        float nextScroll = this.moduleScroll.getTarget() - (float) verticalAmount * SCROLL_STEP;
        this.moduleScroll.setTarget(Math.max(0.0F, Math.min(maxScroll, nextScroll)));
        return true;
    }

    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (keyCode == GLFW.GLFW_KEY_ESCAPE || keyCode == GLFW.GLFW_KEY_RIGHT_SHIFT) {
            this.close();
            return true;
        }
        return super.keyPressed(keyCode, scanCode, modifiers);
    }

    @Override
    public boolean shouldPause() {
        return false;
    }
}
