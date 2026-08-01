package sky.core.ui.hud.notifications;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;
import sky.core.util.drag.DragController;
import sky.core.util.drag.HudLayoutMode;
import sky.core.util.drag.NotificationsDrag;
import sky.core.ui.gui.click.ClickGuiTheme;
import sky.core.module.Module;
import sky.core.module.impl.visuals.InterfaceModule;
import sky.core.util.render.RenderUtil;
import sky.core.util.render.font.FontManager;
import sky.core.util.render.font.FontRenderer;
import sky.core.util.ColorUtil;

public final class Notifications {
    private static final float RADIUS = 12.0F;
    private static final float HEIGHT = 19.0F;
    private static final int TEXT_SIZE = 12;
    private static final int ICON_SIZE = 10;
    private static final float PADDING_X = 8.0F;
    private static final float ITEM_GAP = 5.0F;
    private static final float STACK_GAP = 3.0F;
    private static final float SLIDE_OFFSET = 8.0F;
    private static final float LAYOUT_ANIM_RATE = 11.0F;
    private static final long SHOW_MS = 2000L;
    private static final long ANIM_MS = 350L;

    private static final String CHECKMARK = "\u2713";
    private static final String FALLBACK_ICON = "S";

    private static final Color PASTEL_RED = new Color(255, 170, 170, 255);
    private static final Color DISABLED_BG_TOP = new Color(45, 28, 32, 255);
    private static final Color DISABLED_BG_BOTTOM = new Color(18, 10, 12, 255);

    private static final String DISABLE_ICON = "\u00D7";
    private static final String PREVIEW_TEXT = "\u042d\u0442\u043e \u043f\u0440\u0438\u043c\u0435\u0440 \u0443\u0432\u0435\u0434\u043e\u043c\u043b\u0435\u043d\u0438\u044f";
    private static final String PREVIEW_COUNTDOWN = "2.0s";

    private final List<Entry> entries = new ArrayList<>();
    private long lastRenderNs;
    private long previewAnimStartMs;
    private boolean previewDismissing;
    private boolean chatWasOpen;

    public void push(Module module, boolean enabled) {
        InterfaceModule interfaceModule = InterfaceModule.INSTANCE;
        if (!interfaceModule.isNotificationsEnabled()) {
            return;
        }

        if (module == interfaceModule) {
            return;
        }

        MinecraftClient client = MinecraftClient.getInstance();
        if (client.world == null || client.player == null) {
            return;
        }

        float stackStep = HEIGHT + STACK_GAP;
        this.entries.add(0, new Entry(module.getName(), enabled));
        this.syncStackTargets(stackStep);
    }

    private void syncStackTargets(float stackStep) {
        for (int i = 0; i < this.entries.size(); i++) {
            this.entries.get(i).setTargetLayoutY(i * stackStep);
        }
    }

    public void tick() {
        int before = this.entries.size();
        this.entries.removeIf(Entry::isFinished);
        if (this.entries.size() != before) {
            this.syncStackTargets(HEIGHT + STACK_GAP);
        }

        this.updatePreviewState();
    }

    public boolean shouldRenderInMainHud() {
        return !HudLayoutMode.isActive() || this.previewDismissing;
    }

    public boolean shouldRenderInChatOverlay() {
        return HudLayoutMode.isActive() && !this.previewDismissing;
    }

    private void updatePreviewState() {
        boolean chatOpen = HudLayoutMode.isActive();
        boolean hasEntries = !this.entries.isEmpty();

        if (hasEntries) {
            this.previewDismissing = false;
            this.previewAnimStartMs = 0L;
            this.chatWasOpen = chatOpen;
            return;
        }

        if (chatOpen) {
            if (!this.chatWasOpen) {
                this.previewDismissing = false;
                this.previewAnimStartMs = System.currentTimeMillis();
            }
        } else if (this.chatWasOpen && this.previewAnimStartMs != 0L && !this.previewDismissing) {
            this.previewDismissing = true;
            this.previewAnimStartMs = System.currentTimeMillis();
        } else if (!chatOpen && !this.previewDismissing) {
            this.previewAnimStartMs = 0L;
        }

        if (this.previewDismissing) {
            long elapsed = System.currentTimeMillis() - this.previewAnimStartMs;
            if (elapsed >= ANIM_MS) {
                this.previewDismissing = false;
                this.previewAnimStartMs = 0L;
            }
        }

        this.chatWasOpen = chatOpen;
    }

    public void render(MatrixStack matrices, float screenWidth, float screenHeight) {
        if (!InterfaceModule.INSTANCE.isNotificationsEnabled()) {
            return;
        }

        this.updatePreviewState();

        boolean hasEntries = !this.entries.isEmpty();
        boolean showPreview = !hasEntries && (HudLayoutMode.isActive() || this.previewDismissing);

        if (!hasEntries && !showPreview) {
            return;
        }

        RenderUtil renderer = RenderUtil.get();
        if (renderer == null) {
            return;
        }

        NotificationsDrag drag = DragController.getInstance().getNotifications();
        float frameDelta = this.getFrameDeltaSeconds();

        if (showPreview) {
            FontRenderer font = FontManager.getRegular(TEXT_SIZE);
            FontRenderer iconFont = this.resolveIconFont(ICON_SIZE);
            float width = this.measurePreviewWidth(font, iconFont);
            drag.setWidth(width);
            drag.ensureInitialized(screenWidth, screenHeight, HEIGHT);
            drag.syncCenterX(screenWidth);
            drag.setHitHeight(HEIGHT);

            long elapsed = Math.max(0L, System.currentTimeMillis() - this.previewAnimStartMs);
            float alpha;
            float slideY;
            if (this.previewDismissing) {
                alpha = 1.0F - easeOutCubic(Math.min(1.0F, elapsed / (float) ANIM_MS));
                slideY = -SLIDE_OFFSET * easeOutCubic(Math.min(1.0F, elapsed / (float) ANIM_MS));
            } else if (elapsed < ANIM_MS) {
                float t = easeOutCubic(elapsed / (float) ANIM_MS);
                alpha = t;
                slideY = -SLIDE_OFFSET * (1.0F - t);
            } else {
                alpha = 1.0F;
                slideY = 0.0F;
            }

            this.renderPreview(renderer, matrices, font, iconFont, drag.getX(), drag.getY() + slideY, width, alpha);
            return;
        }

        FontRenderer font = FontManager.getRegular(TEXT_SIZE);
        FontRenderer iconFont = this.resolveIconFont(ICON_SIZE);

        float maxWidth = 0.0F;
        for (Entry entry : this.entries) {
            maxWidth = Math.max(maxWidth, entry.measureWidth(font, iconFont));
        }

        drag.setWidth(maxWidth);
        drag.ensureInitialized(screenWidth, screenHeight, HEIGHT);
        drag.syncCenterX(screenWidth);

        float stackHeight = this.entries.size() * HEIGHT + Math.max(0, this.entries.size() - 1) * STACK_GAP;
        drag.setHitHeight(stackHeight);

        float baseY = drag.getY();
        float anchorCenterX = drag.getCenterX();
        float stackStep = HEIGHT + STACK_GAP;
        this.syncStackTargets(stackStep);
        for (Entry entry : this.entries) {
            entry.updateLayout(frameDelta);
            float width = entry.measureWidth(font, iconFont);
            float x = anchorCenterX - width / 2.0F;
            entry.render(renderer, matrices, font, iconFont, x, baseY + entry.layoutY, width);
        }
    }

    private float measurePreviewWidth(FontRenderer font, FontRenderer iconFont) {
        String iconGlyph = this.resolveEnableIcon(iconFont, ICON_SIZE);
        return PADDING_X
                + iconFont.getWidth(iconGlyph)
                + ITEM_GAP
                + font.getWidth(PREVIEW_TEXT)
                + ITEM_GAP
                + font.getWidth(PREVIEW_COUNTDOWN)
                + PADDING_X;
    }

    private void renderPreview(
            RenderUtil renderer,
            MatrixStack matrices,
            FontRenderer font,
            FontRenderer iconFont,
            float x,
            float y,
            float width,
            float alpha
    ) {
        if (alpha <= 0.001F) {
            return;
        }

        ClickGuiTheme theme = ClickGuiTheme.theme;
        String iconGlyph = this.resolveEnableIcon(iconFont, ICON_SIZE);

        renderer.drawVerticalGradientRoundedRect(
                x,
                y,
                width,
                HEIGHT,
                RADIUS,
                ColorUtil.withAlpha(theme.getPanelTop(), alpha),
                ColorUtil.withAlpha(theme.getPanelBottom(), alpha),
                matrices
        );

        this.drawNotificationContent(
                font,
                iconFont,
                matrices,
                x,
                y,
                PADDING_X,
                ITEM_GAP,
                HEIGHT,
                alpha,
                iconGlyph,
                PREVIEW_TEXT,
                PREVIEW_COUNTDOWN,
                theme.getAccent(),
                theme.getText(),
                theme.getAccent()
        );
    }

    private void drawNotificationContent(
            FontRenderer font,
            FontRenderer iconFont,
            MatrixStack matrices,
            float x,
            float y,
            float paddingX,
            float itemGap,
            float height,
            float alpha,
            String iconGlyph,
            String mainText,
            String countdownText,
            Color iconColor,
            Color textColor,
            Color countdownColor
    ) {
        float textY = y + (height - font.getLineHeight(mainText)) / 2.0F - 0.3F;
        float cursorX = x + paddingX;

        iconFont.draw(iconGlyph, cursorX - 1.0F, textY + 1.0F, ColorUtil.withAlpha(iconColor, alpha), matrices);
        cursorX += iconFont.getWidth(iconGlyph) + itemGap;

        font.draw(mainText, cursorX, textY + 0.5F, ColorUtil.withAlpha(textColor, alpha), matrices);
        cursorX += font.getWidth(mainText) + itemGap;

        font.draw(countdownText, cursorX, textY + 0.5F, ColorUtil.withAlpha(countdownColor, alpha), matrices);
    }

    private FontRenderer resolveIconFont(int size) {
        FontRenderer icons = FontManager.getIcons(size);
        FontRenderer regular = FontManager.getRegular(size);
        return icons != regular ? icons : regular;
    }

    private String resolveEnableIcon(FontRenderer iconFont, int regularSize) {
        FontRenderer regular = FontManager.getRegular(regularSize);
        if (iconFont != regular && iconFont.getWidth(CHECKMARK) > 1.0F) {
            return CHECKMARK;
        }
        return FALLBACK_ICON;
    }

    private String resolveIcon(Entry entry, FontRenderer iconFont) {
        if (!entry.enabled) {
            return DISABLE_ICON;
        }
        return this.resolveEnableIcon(iconFont, ICON_SIZE);
    }

    private float getFrameDeltaSeconds() {
        long now = System.nanoTime();
        if (this.lastRenderNs == 0L) {
            this.lastRenderNs = now;
            return 0.016F;
        }

        float delta = (now - this.lastRenderNs) / 1_000_000_000.0F;
        this.lastRenderNs = now;
        return Math.max(0.001F, Math.min(0.05F, delta));
    }

    private static float easeOutCubic(float value) {
        float t = 1.0F - Math.max(0.0F, Math.min(1.0F, value));
        return 1.0F - t * t * t;
    }

    private static float expSmoothFactor(float rate, float deltaSeconds) {
        return 1.0F - (float) Math.exp(-rate * deltaSeconds);
    }

    private static float resolveAlpha(long elapsed) {
        if (elapsed < ANIM_MS) {
            return easeOutCubic(elapsed / (float) ANIM_MS);
        }
        if (elapsed < SHOW_MS) {
            return 1.0F;
        }
        if (elapsed < SHOW_MS + ANIM_MS) {
            float t = (elapsed - SHOW_MS) / (float) ANIM_MS;
            return 1.0F - easeOutCubic(t);
        }
        return 0.0F;
    }

    private static float resolveSlideOffset(long elapsed, float slideOffset) {
        if (elapsed < ANIM_MS) {
            float t = easeOutCubic(elapsed / (float) ANIM_MS);
            return -slideOffset * (1.0F - t);
        }
        if (elapsed < SHOW_MS) {
            return 0.0F;
        }
        if (elapsed < SHOW_MS + ANIM_MS) {
            float t = easeOutCubic((elapsed - SHOW_MS) / (float) ANIM_MS);
            return -slideOffset * t;
        }
        return -slideOffset;
    }

    private final class Entry {
        private final String moduleName;
        private final boolean enabled;
        private final long startMs = System.currentTimeMillis();
        private float layoutY;
        private float targetLayoutY;

        private Entry(String moduleName, boolean enabled) {
            this.moduleName = moduleName;
            this.enabled = enabled;
        }

        private void setTargetLayoutY(float targetLayoutY) {
            this.targetLayoutY = targetLayoutY;
        }

        private void updateLayout(float frameDelta) {
            float blend = expSmoothFactor(LAYOUT_ANIM_RATE, frameDelta);
            this.layoutY += (this.targetLayoutY - this.layoutY) * blend;
        }

        private boolean isFinished() {
            return System.currentTimeMillis() - this.startMs >= SHOW_MS + ANIM_MS;
        }

        private float measureWidth(FontRenderer font, FontRenderer iconFont) {
            String iconGlyph = Notifications.this.resolveIcon(this, iconFont);
            String countdown = this.formatCountdown();
            return PADDING_X
                    + iconFont.getWidth(iconGlyph)
                    + ITEM_GAP
                    + font.getWidth(this.moduleName)
                    + ITEM_GAP
                    + font.getWidth(countdown)
                    + PADDING_X;
        }

        private void render(
                RenderUtil renderer,
                MatrixStack matrices,
                FontRenderer font,
                FontRenderer iconFont,
                float x,
                float y,
                float width
        ) {
            String iconGlyph = Notifications.this.resolveIcon(this, iconFont);
            long elapsed = System.currentTimeMillis() - this.startMs;
            float alpha = resolveAlpha(elapsed);
            if (alpha <= 0.001F) {
                return;
            }

            float slideY = resolveSlideOffset(elapsed, SLIDE_OFFSET);
            float drawY = y + slideY;

            ClickGuiTheme theme = ClickGuiTheme.theme;

            Color bgTop = this.enabled ? theme.getPanelTop() : DISABLED_BG_TOP;
            Color bgBottom = this.enabled ? theme.getPanelBottom() : DISABLED_BG_BOTTOM;
            Color iconColor = this.enabled ? theme.getAccent() : PASTEL_RED;
            Color textColor = theme.getText();
            Color countdownColor = this.enabled ? theme.getAccent() : PASTEL_RED;

            renderer.drawVerticalGradientRoundedRect(
                    x,
                    drawY,
                    width,
                    HEIGHT,
                    RADIUS,
                    ColorUtil.withAlpha(bgTop, alpha),
                    ColorUtil.withAlpha(bgBottom, alpha),
                    matrices
            );

            Notifications.this.drawNotificationContent(
                    font,
                    iconFont,
                    matrices,
                    x,
                    drawY,
                    PADDING_X,
                    ITEM_GAP,
                    HEIGHT,
                    alpha,
                    iconGlyph,
                    this.moduleName,
                    this.formatCountdown(),
                    iconColor,
                    textColor,
                    countdownColor
            );
        }

        private String formatCountdown() {
            long elapsed = System.currentTimeMillis() - this.startMs;
            long remainingMs = Math.max(0L, SHOW_MS + ANIM_MS - elapsed);
            return String.format(Locale.US, "%.1fs", remainingMs / 1000.0F);
        }
    }
}
