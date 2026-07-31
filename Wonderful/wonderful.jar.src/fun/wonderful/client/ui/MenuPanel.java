package fun.wonderful.client.ui;

import fun.wonderful.api.QClient;
import fun.wonderful.api.utils.animation.AnimationUtils;
import fun.wonderful.api.utils.animation.Easings;
import fun.wonderful.api.utils.client.ClientSoundPlayer;
import fun.wonderful.api.utils.scissor.ScissorUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.ui.clickgui.ClickGuiInputHandler;
import fun.wonderful.client.ui.clickgui.ClickGuiLayout;
import fun.wonderful.client.ui.clickgui.ClickGuiRenderer;
import fun.wonderful.client.ui.clickgui.ClickGuiSettingRenderer;
import fun.wonderful.client.ui.clickgui.ClickGuiState;
import fun.wonderful.client.ui.clickgui.ClickGuiThemeSelector;
import net.minecraft.client.util.Window;
import net.minecraft.text.Text;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;

public class MenuPanel
extends Screen
implements QClient {
    private static final ClickGuiState SHARED_STATE = new ClickGuiState();
    private final int categoryCount = Module.ModuleCategory.values().length;
    private final ClickGuiState state = SHARED_STATE;
    private final ClickGuiThemeSelector themeSelector = new ClickGuiThemeSelector();
    private final ClickGuiRenderer renderer = new ClickGuiRenderer(this.state, new ClickGuiSettingRenderer(), this.themeSelector);
    private final ClickGuiInputHandler inputHandler = new ClickGuiInputHandler(this.state, this.themeSelector);
    private final AnimationUtils openAnimation = new AnimationUtils(0.0f, 7.5f, Easings.CUBIC_OUT);
    private boolean closing;
    private boolean closeSoundPlayed;

    public MenuPanel() {
        super(Text.of((String)"ClickGui"));
        this.state.refreshModules();
    }

    public static boolean isSearchActive() {
        return SHARED_STATE.isSearchActive();
    }

    private Window getWindow() {
        return mc == null ? null : mc.getWindow();
    }

    private void syncLayout() {
        Window window = this.getWindow();
        if (window != null) {
            this.state.updatePosition(window, this.categoryCount);
        }
    }

    public int[] getClickGuiBlurScissor(int targetWidth, int targetHeight, int downsample) {
        Window window = this.getWindow();
        if (window == null || targetWidth <= 0 || targetHeight <= 0 || downsample <= 0) {
            return null;
        }
        float progress = this.getAnimationProgress();
        if (progress <= 0.05f) {
            return null;
        }
        this.state.updatePosition(window, this.categoryCount);
        float panelX = this.state.getX();
        float panelY = this.state.getY() + this.state.getRenderOffsetY();
        float totalWidth = ClickGuiLayout.getTotalCategoriesWidth(this.categoryCount);
        float minX = panelX;
        float minY = panelY;
        float maxX = panelX + totalWidth;
        float maxY = panelY + 254.0f;
        float searchW = Math.max(80.0f, totalWidth * 0.45f);
        float searchX = ClickGuiLayout.getSearchX(panelX, this.categoryCount, searchW);
        float searchY = ClickGuiLayout.getSearchY(panelY);
        minX = Math.min(minX, searchX);
        minY = Math.min(minY, searchY);
        maxX = Math.max(maxX, searchX + searchW);
        maxY = Math.max(maxY, searchY + 18.0f);
        float themeX = ClickGuiLayout.getThemeButtonX(panelX, this.categoryCount);
        float themeY = ClickGuiLayout.getThemeButtonY(panelY);
        float themePopupW = 98.0f;
        float themePopupH = 205.0f;
        minX = Math.min(minX, themeX);
        minY = Math.min(minY, themeY);
        maxX = Math.max(maxX, themeX + Math.max(23.0f, themePopupW));
        maxY = Math.max(maxY, themeY + themePopupH);
        float margin = 96.0f;
        minX -= margin;
        minY -= margin;
        maxX += margin;
        maxY += margin;
        float cx = (float)window.getScaledWidth() * 0.5f;
        float cy = (float)window.getScaledHeight() * 0.5f;
        minX = cx + (minX - cx) * progress;
        maxX = cx + (maxX - cx) * progress;
        minY = cy + (minY - cy) * progress;
        maxY = cy + (maxY - cy) * progress;
        double scaleFactor = window.getScaleFactor();
        int leftPx = Math.max(0, (int)Math.floor((double)minX * scaleFactor));
        int rightPx = Math.min(window.getFramebufferWidth(), (int)Math.ceil((double)maxX * scaleFactor));
        int topPx = Math.max(0, (int)Math.floor((double)minY * scaleFactor));
        int bottomPx = Math.min(window.getFramebufferHeight(), (int)Math.ceil((double)maxY * scaleFactor));
        int left = Math.max(0, leftPx / downsample - 2);
        int right = Math.min(targetWidth, (rightPx + downsample - 1) / downsample + 2);
        int top = Math.max(0, topPx / downsample - 2);
        int bottom = Math.min(targetHeight, (bottomPx + downsample - 1) / downsample + 2);
        int width = right - left;
        int height = bottom - top;
        if (width <= 0 || height <= 0) {
            return null;
        }
        return new int[]{left, targetHeight - bottom, width, height};
    }

    public void renderBackground(DrawContext context, int mouseX, int mouseY, float delta) {
    }

    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        Window window = this.getWindow();
        if (window == null) {
            return;
        }
        this.updateAnimation();
        float progress = this.getAnimationProgress();
        if (this.closing && progress <= 0.01f) {
            if (mc != null) {
                mc.setScreen(null);
            }
            return;
        }
        this.state.updatePosition(window, this.categoryCount);
        this.state.setRenderOffsetY(0.0f);
        float scale = progress;
        float cx = (float)window.getScaledWidth() / 2.0f;
        float cy = (float)window.getScaledHeight() / 2.0f;
        int scaledMouseX = (int)(((float)mouseX - cx) / scale + cx);
        int scaledMouseY = (int)(((float)mouseY - cy) / scale + cy);
        MatrixStack matrices = context.getMatrices();
        matrices.push();
        matrices.translate(cx, cy, 0.0f);
        matrices.scale(scale, scale, 1.0f);
        matrices.translate(-cx, -cy, 0.0f);
        ScissorUtils.setGlobalScale(scale, cx, cy);
        this.renderer.render(context, scaledMouseX, scaledMouseY, window, progress);
        ScissorUtils.resetGlobalScale();
        matrices.pop();
        super.render(context, mouseX, mouseY, delta);
    }

    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (this.closing) {
            return true;
        }
        this.syncLayout();
        this.state.setRenderOffsetY(0.0f);
        Window window = this.getWindow();
        double[] scaled = this.toScaledMouse(mouseX, mouseY, window);
        return this.inputHandler.mouseClicked(scaled[0], scaled[1], button, window) || super.mouseClicked(mouseX, mouseY, button);
    }

    public boolean mouseReleased(double mouseX, double mouseY, int button) {
        if (this.closing) {
            return true;
        }
        this.syncLayout();
        return this.inputHandler.mouseReleased(button) || super.mouseReleased(mouseX, mouseY, button);
    }

    public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
        if (this.closing) {
            return true;
        }
        this.syncLayout();
        this.state.setRenderOffsetY(0.0f);
        Window window = this.getWindow();
        double[] scaled = this.toScaledMouse(mouseX, mouseY, window);
        return this.inputHandler.mouseDragged(scaled[0], scaled[1], button) || super.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
    }

    public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
        if (this.closing) {
            return true;
        }
        this.syncLayout();
        this.state.setRenderOffsetY(0.0f);
        Window window = this.getWindow();
        double[] scaled = this.toScaledMouse(mouseX, mouseY, window);
        return this.inputHandler.mouseScrolled(scaled[0], scaled[1], verticalAmount) || super.mouseScrolled(mouseX, mouseY, horizontalAmount, verticalAmount);
    }

    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (this.closing) {
            return true;
        }
        if (this.inputHandler.keyPressed(keyCode, modifiers)) {
            return true;
        }
        if (keyCode == 256) {
            this.startClosing();
            return true;
        }
        return super.keyPressed(keyCode, scanCode, modifiers);
    }

    public boolean charTyped(char chr, int modifiers) {
        if (this.closing) {
            return true;
        }
        return this.inputHandler.charTyped(chr) || super.charTyped(chr, modifiers);
    }

    public void close() {
        this.startClosing();
    }

    public void removed() {
        if (!this.closeSoundPlayed) {
            this.closeSoundPlayed = true;
            ClientSoundPlayer.playSound("closegui.wav", 0.6, 1.0f);
        }
        super.removed();
    }

    private void startClosing() {
        if (this.closing) {
            return;
        }
        this.closing = true;
        this.openAnimation.setEasing(Easings.CUBIC_IN);
        if (!this.closeSoundPlayed) {
            this.closeSoundPlayed = true;
            ClientSoundPlayer.playSound("closegui.wav", 0.6, 1.0f);
        }
    }

    private void updateAnimation() {
        if (this.closing) {
            this.openAnimation.update(0.0f);
        } else {
            this.openAnimation.setEasing(Easings.CUBIC_OUT);
            this.openAnimation.update(1.0f);
        }
    }

    private float getAnimationProgress() {
        return MathHelper.clamp((float)this.openAnimation.getValue(), (float)0.0f, (float)1.0f);
    }

    public float getOpenProgress() {
        return this.getAnimationProgress();
    }

    private double[] toScaledMouse(double mouseX, double mouseY, Window window) {
        float progress;
        if (window == null) {
            return new double[]{mouseX, mouseY};
        }
        float scale = progress = this.getAnimationProgress();
        float cx = (float)window.getScaledWidth() / 2.0f;
        float cy = (float)window.getScaledHeight() / 2.0f;
        return new double[]{(mouseX - (double)cx) / (double)scale + (double)cx, (mouseY - (double)cy) / (double)scale + (double)cy};
    }
}