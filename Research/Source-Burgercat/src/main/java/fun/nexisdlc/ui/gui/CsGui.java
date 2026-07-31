package fun.nexisdlc.ui.gui;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.ai.AiManager;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.client.utils.render.CursorHelper;
import fun.nexisdlc.client.utils.render.animations.EasingFunction;
import fun.nexisdlc.client.utils.render.animations.Easings;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.color.basic.ColorUtils;
import fun.nexisdlc.client.utils.render.gif.GifTexture;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.config.Config;
import fun.nexisdlc.client.utils.config.ConfigStorage;
import fun.nexisdlc.client.utils.config.ThemeConfig;
import fun.nexisdlc.client.utils.render.main.text.FontObject;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.settings.api.Setting;
import fun.nexisdlc.modules.api.settings.impl.ColorSetting;
import fun.nexisdlc.ui.gui.elements.AiImagePreviewCache;
import fun.nexisdlc.ui.gui.elements.CsColorPicker;
import fun.nexisdlc.ui.gui.elements.CsSettingComponent;
import fun.nexisdlc.ui.gui.elements.CsStringComponent;
import fun.nexisdlc.ui.gui.elements.TextInputField;
import net.minecraft.client.gui.Click;
import net.minecraft.client.input.CharInput;
import net.minecraft.client.input.KeyInput;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;

import java.awt.*;
import java.io.File;
import java.nio.file.Files;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

public class CsGui extends BaseClickGui {
    private static final float PANEL_WIDTH = 900f;
    private static final float PANEL_HEIGHT = 600f;
    private static final float ROUNDING = 18;
    private static final float SCALE_START = 0.3f;

    private final SimpleLinearAnimation guiScaleAnimation = new SimpleLinearAnimation(400);

    private static final String[] CLIENT_CATS = {"Themes", "IRC", "Config", "AI"};
    private static final String[] CLIENT_CAT_ICONS = {"B", "A", "C", "P"};
    private static final int THEMES_CATEGORY_INDEX = Category.values().length;
    private static final int IRC_CATEGORY_INDEX = Category.values().length + 1;
    private static final int CONFIG_CATEGORY_INDEX = Category.values().length + 2;
    private static final int AI_CATEGORY_INDEX = Category.values().length + 3;
    private int selectedCategory = 0;
    private final List<float[]> catHitBoxes = new ArrayList<>();
    private final List<Float> catRectPositions = new ArrayList<>();
    private final List<SimpleLinearAnimation> catColorAnims = new ArrayList<>();
    private float fromRectY = 0f;
    private float toRectY = 0f;
    private boolean rectPositionInitialized = false;
    private SimpleLinearAnimation rectSlideAnimation = new SimpleLinearAnimation(200);
    private float moduleScrollOffset = 0f;
    private float moduleTargetScrollOffset = 0f;
    private Function bindingFunction = null;
    private final Map<Function, SimpleLinearAnimation> moduleToggleAnims = new HashMap<>();

    private float themesScrollOffset = 0f;
    private float themesTargetScrollOffset = 0f;
    private float configScrollOffset = 0f;
    private float configTargetScrollOffset = 0f;

    private static final int SB_NONE = 0;
    private static final int SB_MODULES = 1;
    private static final int SB_THEMES = 2;
    private static final int SB_CONFIG = 3;
    private static final int SB_IRC = 4;
    private static final int SB_AI = 5;
    private static final int SB_AI_CHATS = 6;
    private int draggingScrollbar = SB_NONE;
    private float sbDragOffsetWithinThumb = 0f;
    private float sbDragTrackY = 0f;
    private float sbDragTrackH = 0f;
    private float sbDragThumbH = 0f;
    private double sbDragMaxScroll = 0;

    private static final class ScrollbarGeometry {
        float trackX, trackY, trackW, trackH;
        float thumbY, thumbH;
        float totalContentH, viewportH;
        boolean visible;

        void clear() {
            visible = false;
        }

        void set(float tx, float ty, float tw, float th, float thY, float thH, float total, float view) {
            this.trackX = tx;
            this.trackY = ty;
            this.trackW = tw;
            this.trackH = th;
            this.thumbY = thY;
            this.thumbH = thH;
            this.totalContentH = total;
            this.viewportH = view;
            this.visible = true;
        }

        boolean hitThumb(double mx, double my) {
            return visible && mx >= trackX - 8 && mx <= trackX + trackW + 8 && my >= thumbY && my <= thumbY + thumbH;
        }

        boolean hitTrack(double mx, double my) {
            return visible && mx >= trackX - 8 && mx <= trackX + trackW + 8 && my >= trackY && my <= trackY + trackH;
        }
    }

    private final ScrollbarGeometry sbModules = new ScrollbarGeometry();
    private final ScrollbarGeometry sbThemes = new ScrollbarGeometry();
    private final ScrollbarGeometry sbConfig = new ScrollbarGeometry();
    private final ScrollbarGeometry sbIrc = new ScrollbarGeometry();
    private final ScrollbarGeometry sbAi = new ScrollbarGeometry();
    private final ScrollbarGeometry sbAiChats = new ScrollbarGeometry();

    private final TextInputField themeNameInput = new TextInputField()
            .setFontSize(13.5f)
            .setPadding(12f, 0f)
            .setPlaceholder("Введите название темы")
            .setMaxLength(40);
    private final TextInputField configNameInput = new TextInputField()
            .setFontSize(13.5f)
            .setPadding(12f, 0f)
            .setPlaceholder("Введите название конфига")
            .setMaxLength(40);

    private final TextInputField ircInput = new TextInputField()
            .setFontSize(15f)
            .setPadding(14f, 0f)
            .setPlaceholder("Сообщение в IRC...")
            .setMultiline(true)
            .setMaxLength(500);
    private double ircScrollY = 0;
    private double ircTargetScrollY = 0;
    private final SimpleLinearAnimation ircSendHoverAnim = new SimpleLinearAnimation(200);
    private final SimpleLinearAnimation ircSendActiveAnim = new SimpleLinearAnimation(280);
    private final SimpleLinearAnimation ircInputFocusAnim = new SimpleLinearAnimation(220);
    private final SimpleLinearAnimation ircScrollbarFadeAnim = new SimpleLinearAnimation(250);
    private final SimpleLinearAnimation ircSendPulseAnim = new SimpleLinearAnimation(180);
    private final SimpleLinearAnimation ircHeaderFadeAnim = new SimpleLinearAnimation(400);
    private final SimpleLinearAnimation ircConnectionPulseAnim = new SimpleLinearAnimation(450);
    private int ircPrevMessageCount = 0;
    private int ircNewMsgCount = 0;
    private long ircLastMessageTime = 0;
    private boolean ircAutoScroll = false;
    private long ircEnterCategoryTime = 0;
    private int ircSelMessageIndex = -1;
    private int ircSelStartPos = -1;
    private int ircSelEndPos = -1;
    private int ircSelStartLine = -1;
    private int ircSelEndLine = -1;
    private boolean ircMsgSelectionDragging = false;
    private final List<IrcMsgLineRect> ircLineRects = new ArrayList<>();
    private final Map<String, IrcBubbleLayout> ircBubbleCache = new HashMap<>();
    private float ircBubbleCacheWidth = -1f;

    private record IrcMsgLineRect(int msgIndex, int lineIndex, float x, float y, float w, float h, String text,
                                  float fontSize, int globalStart) {
    }

    private static final class IrcBubbleLayout {
        final java.util.List<String> wrappedLines;
        final float maxLineW;
        final float bubbleW;
        final float bubbleH;

        IrcBubbleLayout(java.util.List<String> wrappedLines, float maxLineW, float bubbleW, float bubbleH) {
            this.wrappedLines = wrappedLines;
            this.maxLineW = maxLineW;
            this.bubbleW = bubbleW;
            this.bubbleH = bubbleH;
        }
    }

    private static final String[] THEME_FIELD_LABELS = {"Основной цвет", "Цвет фона", "Цвет обводки", "Цвет акцента", "Цвет текста", "Цвет подзаголовков"};
    private final ColorSetting[] themeColorSettings = new ColorSetting[THEME_FIELD_LABELS.length];
    private int[] themePrevColors = new int[THEME_FIELD_LABELS.length];
    private String themeBoundName = null;

    private final Map<String, SimpleLinearAnimation> themeCardAnims = new HashMap<>();
    private final Map<String, SimpleLinearAnimation> configCardAnims = new HashMap<>();
    private final Map<String, SimpleLinearAnimation> themeCardAppearAnims = new HashMap<>();
    private final Map<String, SimpleLinearAnimation> configCardAppearAnims = new HashMap<>();
    private final Map<String, SimpleLinearAnimation> themeDelBtnAnims = new HashMap<>();
    private final Map<String, SimpleLinearAnimation> configDelBtnAnims = new HashMap<>();
    private final Map<String, SimpleLinearAnimation> configRefreshBtnAnims = new HashMap<>();
    private final Map<String, SimpleLinearAnimation> configLoadBtnAnims = new HashMap<>();
    private final SimpleLinearAnimation themeCreateHoverAnim = new SimpleLinearAnimation(220);
    private final SimpleLinearAnimation configCreateHoverAnim = new SimpleLinearAnimation(220);
    private final SimpleLinearAnimation themeNameFocusAnim = new SimpleLinearAnimation(220);
    private final SimpleLinearAnimation configNameFocusAnim = new SimpleLinearAnimation(220);
    private final SimpleLinearAnimation themeCreatePulseAnim = new SimpleLinearAnimation(280);
    private final SimpleLinearAnimation configCreatePulseAnim = new SimpleLinearAnimation(280);
    private final SimpleLinearAnimation themePanelEnterAnim = new SimpleLinearAnimation(420);
    private final SimpleLinearAnimation configPanelEnterAnim = new SimpleLinearAnimation(420);
    private final float[] themeFieldHover = new float[THEME_FIELD_LABELS.length];
    private final SimpleLinearAnimation[] themeFieldHoverAnims = new SimpleLinearAnimation[THEME_FIELD_LABELS.length];
    private final SimpleLinearAnimation[] themeSwatchPulseAnims = new SimpleLinearAnimation[THEME_FIELD_LABELS.length];
    private long themePanelEnterTime = 0L;
    private long configPanelEnterTime = 0L;
    private long lastSelectedCategoryChange = 0L;
    private final TextInputField searchInput = new TextInputField()
            .setFontSize(14.5f)
            .setPadding(13f, 0f)
            .setPlaceholder("Поиск")
            .setMaxLength(64);
    private String prevSearchQuery = "";
    private final Map<Function, Map<Setting<?>, CsSettingComponent<?>>> moduleSettingComponents = new HashMap<>();
    private static final float SETTINGS_GAP = 5f;
    private static final float HEADER_TO_SETTINGS_GAP = -3f;
    private static final float SETTINGS_BOTTOM_PADDING = 3f;

    private static final long MARQUEE_PAUSE_MS = 3000L;
    private static final float MARQUEE_SPEED_PX_PER_SEC = 28f;
    private static final float MARQUEE_GAP = 24f;
    private static final float MARQUEE_SIDE_PADDING = 2f;

    private static final float AI_INPUT_BASE_H = 44f;
    private static final float AI_INPUT_MAX_H = 110f;
    private static final float AI_PREVIEW_STRIP_H = 64f;
    private static final float AI_PREVIEW_THUMB = 52f;
    private static final float AI_SIDEBAR_W = 170f;
    private static final float AI_HEADER_H = 44f;
    private static final float AI_CREDITS_BAR_H = 22f;
    private static final float AI_CREDITS_BAR_GAP = 6f;
    private static final int AI_MAX_IMAGES = 4;

    private final TextInputField aiInput = new TextInputField()
            .setFontSize(15f)
            .setPadding(14f, 0f)
            .setPlaceholder("Сообщение...")
            .setMultiline(true)
            .setMaxLength(4000);
    private boolean aiWaitingForResponse = false;
    private double aiScrollY = 0;
    private double aiTargetScrollY = 0;

    private final SimpleLinearAnimation aiSendHoverAnim = new SimpleLinearAnimation(200);
    private final SimpleLinearAnimation aiSendActiveAnim = new SimpleLinearAnimation(280);
    private final SimpleLinearAnimation aiInputFocusAnim = new SimpleLinearAnimation(220);
    private final SimpleLinearAnimation aiScrollbarFadeAnim = new SimpleLinearAnimation(250);
    private final SimpleLinearAnimation aiSidebarSlideAnim = new SimpleLinearAnimation(320);
    private final SimpleLinearAnimation aiNewChatBtnAnim = new SimpleLinearAnimation(200);
    private final SimpleLinearAnimation aiChatListBtnAnim = new SimpleLinearAnimation(200);
    private final SimpleLinearAnimation aiAttachBtnAnim = new SimpleLinearAnimation(200);
    private final SimpleLinearAnimation aiSendPulseAnim = new SimpleLinearAnimation(180);
    private final SimpleLinearAnimation aiHeaderFadeAnim = new SimpleLinearAnimation(400);
    private final SimpleLinearAnimation aiPreviewStripAnim = new SimpleLinearAnimation(260);
    private final SimpleLinearAnimation aiTypingAnim = new SimpleLinearAnimation(300);
    private final SimpleLinearAnimation aiCreditsPulseAnim = new SimpleLinearAnimation(450);
    private final SimpleLinearAnimation aiCreditsDangerAnim = new SimpleLinearAnimation(400);
    private float aiCreditsBarProgress = -1f;
    private long aiCreditsPrevChanged = 0L;

    private boolean aiShowChatsList = false;
    private int aiPrevMessageCount = 0;
    private int aiNewMsgCount = 0;
    private long aiLastMessageTime = 0;
    private boolean aiAutoScroll = false;
    private double aiChatsScrollY = 0;
    private double aiChatsTargetScrollY = 0;
    private long aiSidebarOpenTime = 0;
    private long aiEnterCategoryTime = 0;

    private final List<byte[]> aiAttachedImages = new ArrayList<>();
    private final List<String> aiAttachedMimes = new ArrayList<>();
    private final Map<Integer, SimpleLinearAnimation> aiPreviewAnims = new HashMap<>();
    private final Map<Integer, SimpleLinearAnimation> aiPreviewRemoveAnims = new HashMap<>();
    private int aiPreviewSeq = 0;
    private final List<Integer> aiPreviewIds = new ArrayList<>();
    private volatile boolean aiImageLoading = false;

    private int aiSelMessageIndex = -1;
    private int aiSelStartPos = -1;
    private int aiSelEndPos = -1;
    private int aiSelStartLine = -1;
    private int aiSelEndLine = -1;
    private boolean aiMsgSelectionDragging = false;
    private final List<AiMsgLineRect> aiLineRects = new ArrayList<>();

    private EasingFunction getEasing() {
        return Easings.EASE_OUT_BACK;
    }

    CsGui() {
        guiScaleAnimation.setEasing(getEasing());
        guiScaleAnimation.show();
        initCategoryAnimations();
    }

    public boolean isAnyTextInputFocused() {
        return searchInput.isFocused() || aiInput.isFocused() || themeNameInput.isFocused() || configNameInput.isFocused() || ircInput.isFocused() || CsStringComponent.focusedStringComp != null || TextInputField.focusedField != null;
    }

    private void initCategoryAnimations() {
        int total = Category.values().length + CLIENT_CATS.length;
        for (int i = 0; i < total; i++) {
            catColorAnims.add(new SimpleLinearAnimation(250));
            catColorAnims.get(i).hide();
        }
        if (!catColorAnims.isEmpty()) {
            SimpleLinearAnimation firstAnim = catColorAnims.get(selectedCategory);
            firstAnim.setDuration(1);
            firstAnim.show();
            firstAnim.getProgress();
            firstAnim.setDuration(250);
        }
    }

    private String getSelectedCategoryName() {
        int moduleCategories = Category.values().length;
        if (selectedCategory < moduleCategories) {
            return Category.values()[selectedCategory].getDisplay();
        }
        int clientIndex = selectedCategory - moduleCategories;
        return clientIndex >= 0 && clientIndex < CLIENT_CATS.length ? CLIENT_CATS[clientIndex] : "";
    }

    private String getSelectedCategoryIcon() {
        int moduleCategories = Category.values().length;
        if (selectedCategory < moduleCategories) {
            return Category.values()[selectedCategory].getIcon();
        }
        int clientIndex = selectedCategory - moduleCategories;
        return clientIndex >= 0 && clientIndex < CLIENT_CAT_ICONS.length ? CLIENT_CAT_ICONS[clientIndex] : "";
    }

    @Override
    protected void renderGui(Renderer2D r, int vw, int vh) {
        CursorHelper.setArrow();
        float fbW = mc.getWindow().getFramebufferWidth();
        float fbH = mc.getWindow().getFramebufferHeight();
        float x = (fbW - PANEL_WIDTH) / 2f;
        float y = (fbH - PANEL_HEIGHT) / 2f;

        float alphaProgress = guiOpenAnimation.getProgress();
        float scaleProgress = guiScaleAnimation.getProgress();
        float currentScale = SCALE_START + (1f - SCALE_START) * scaleProgress;

        float cx = x + PANEL_WIDTH / 2f;
        float cy = y + PANEL_HEIGHT / 2f;
        r.pushScale(currentScale, cx, cy);

        r.blur(x, y, PANEL_WIDTH, PANEL_HEIGHT, ROUNDING, alphaProgress);
        renderMiniRects(r, x, y, alphaProgress);
        renderBackground(r, x, y, alphaProgress);
        renderCategoryTitle(r, x, y, alphaProgress);
        renderSearchWidget(r, x, y, alphaProgress);
        renderCategoryList(r, x, y, alphaProgress);
        renderModules(r, x, y, alphaProgress);
        renderUserInfo(r, x, y, alphaProgress);

        r.popScale();
        CsSettingComponent.tickSuppressVisibility();
    }

    @Override
    protected void startClosing() {
        if (closing) return;
        if (guiOpenAnimation.getProgress() < 0.5f) return;
        super.startClosing();
        guiOpenAnimation.setDuration(450);
        guiScaleAnimation.hide();
        guiScaleAnimation.setEasing(Easings.EASE_IN_OUT_QUAD);
    }

    @Override
    protected void resetAnimations() {
        guiOpenAnimation.setDuration(240);
        super.resetAnimations();
        CsSettingComponent.requestSuppressVisibility(3);
        guiScaleAnimation.setEasing(getEasing());
        guiScaleAnimation.show();
        rectPositionInitialized = false;
        for (SimpleLinearAnimation anim : catColorAnims) {
            anim.hide();
        }
        if (!catColorAnims.isEmpty()) {
            SimpleLinearAnimation firstAnim = catColorAnims.get(selectedCategory);
            firstAnim.setDuration(1);
            firstAnim.show();
            firstAnim.getProgress();
            firstAnim.setDuration(250);
        }
        aiCreditsBarProgress = -1f;
        aiCreditsPrevChanged = AiManager.getCreditsLastChangedMs();
        aiCreditsPulseAnim.hide();
        aiCreditsDangerAnim.hide();
        aiEnterCategoryTime = 0;
        aiHeaderFadeAnim.hide();
    }

    private void renderBackground(Renderer2D r, float x, float y, float alphaProgress) {
        r.rect(x, y, PANEL_WIDTH, PANEL_HEIGHT, ROUNDING, ColorUtils.interpolate(
                ColorUtils.rgba(0, 0, 0, (int) (215 * alphaProgress)),
                ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alphaProgress),
                0.04f));
    }

    private void renderCategoryTitle(Renderer2D r, float x, float y, float alphaProgress) {
        float miniW = 225f;
        String categoryName = getSelectedCategoryName();
        String categoryIcon = getSelectedCategoryIcon();
        float iconX = x + miniW + 22f;
        float iconSize = 20f;
        FontObject iconFont = selectedCategory == AI_CATEGORY_INDEX ? FontRegistry.ICONS_ASYNC : FontRegistry.CATEGORIES;
        r.text(iconFont, iconX, y + 43f, iconSize, categoryIcon,
                ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alphaProgress));
        float textX = iconX + iconFont.getWidth(categoryIcon, iconSize) + 6f;
        r.text(FontRegistry.SF_SEMIBOLD, textX, y + 43f, 19f, categoryName,
                ColorUtils.rgba(255, 255, 255, (int) (255 * alphaProgress)));
    }

    private void renderMiniRects(Renderer2D r, float x, float y, float alphaProgress) {
        float miniW = 225f;
        r.rect(x, y, miniW, PANEL_HEIGHT, ROUNDING, 0, 0, ROUNDING, ColorUtils.multAlpha(ColorUtils.interpolate(
                ColorUtils.rgba(0, 0, 0, (int) (215 * alphaProgress)),
                ClientColors.applyAlpha(ClientColors.ICON.getRGB(), 0.60f * alphaProgress),
                0.12f), 0.55f));

        r.rect(x + miniW - 1f, y, PANEL_WIDTH - miniW + 1f, 75f, 0, ROUNDING, 0, 0, ColorUtils.multAlpha(ColorUtils.interpolate(
                ColorUtils.rgba(0, 0, 0, (int) (215 * alphaProgress)),
                ClientColors.applyAlpha(ClientColors.ICON.getRGB(), 0.60f * alphaProgress),
                0.12f), 0.55f));

        float separatorAlpha = 100 * alphaProgress;
        r.rect(x + miniW, y, 2f, PANEL_HEIGHT - 1f, ColorUtils.rgba(255, 255, 255, (int) separatorAlpha));
        r.rect(x + miniW + 2f, y + 75f, PANEL_WIDTH - miniW - 2f, 2f, ColorUtils.rgba(255, 255, 255, (int) separatorAlpha));
    }

    private void renderCategoryList(Renderer2D r, float sx, float sy, float alphaProgress) {
        catHitBoxes.clear();
        catRectPositions.clear();
        float x = sx + 16f;
        float catX = x + 15f;
        float y = sy + 136f;
        int textColor = ColorUtils.rgba(134, 134, 139, (int) (255 * alphaProgress));

        r.text(FontRegistry.SF_MEDIUM, x, y - 3f, 16f, "Category", textColor);
        y += 24f;

        int totalItems = Category.values().length + CLIENT_CATS.length;
        while (catColorAnims.size() < totalItems) {
            catColorAnims.add(new SimpleLinearAnimation(250));
        }

        int idx = 0;
        for (Category cat : Category.values()) {
            renderCategoryItem(r, sx, sy, y, idx, cat.getDisplay(), cat.getIcon(), 17f, alphaProgress);
            y += 35f;
            idx++;
        }

        y += 24f;
        r.text(FontRegistry.SF_MEDIUM, x, y - 3f, 16f, "Client", textColor);
        y += 24f;

        for (int i = 0; i < CLIENT_CATS.length; i++) {
            renderCategoryItem(r, sx, sy, y, idx, CLIENT_CATS[i], CLIENT_CAT_ICONS[i], 17f, alphaProgress);
            y += 35f;
            idx++;
        }

        if (!catRectPositions.isEmpty()) {
            float targetY = catRectPositions.get(selectedCategory);
            if (!rectPositionInitialized) {
                fromRectY = toRectY = targetY;
                rectPositionInitialized = true;
            } else if (rectSlideAnimation.isFinished() && toRectY != targetY) {
                fromRectY = toRectY = targetY;
            }
        }
    }

    private Identifier getAvatar() {
        Identifier gif = Identifier.of("nexis", "gif/avatar.gif");
        GifTexture avatarGif = GifTexture.getCached(gif);
        if (avatarGif == null || avatarGif.getCurrentFrame() == null) {
            GifTexture.queueLoad(gif);
            return null;
        }
        return avatarGif.getCurrentFrame();
    }


    private void renderCategoryItem(Renderer2D r, float sx, float sy, float y, int idx, String name, String icon, float fontSize, float alphaProgress) {
        float itemH = 35f;
        catRectPositions.add(y - 16f);
        float[] b = new float[]{sx + 16f, y - 16f, 193f, itemH + 2f};
        catHitBoxes.add(b);
        int mx = scaledMouseX();
        int my = scaledMouseY();
        if (mx >= b[0] && mx <= b[0] + b[2] && my >= b[1] && my <= b[1] + b[3]) {
            CursorHelper.setHand();
        }
        if (selectedCategory == idx) {
            float progress = rectSlideAnimation.getProgress();
            float rectY = fromRectY + (toRectY - fromRectY) * progress;
            float minY = Math.min(fromRectY, toRectY) - 15f;
            float maxY = Math.max(fromRectY, toRectY) + 15f;
            rectY = Math.max(minY, Math.min(maxY, rectY));
            r.rect(sx + 16f, rectY, 193f, itemH + 2f, 12f, ColorUtils.rgba(255, 255, 255, (int) (12 * alphaProgress)));
            r.rect(sx + 18f, rectY + (itemH + 2f) / 2f - 11f, 3f, 22f, 0, 7, 7, 0, ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alphaProgress));
        }

        float animProgress = catColorAnims.get(idx).getProgress();
        int grayColor = ColorUtils.rgba(134, 134, 139, (int) (255 * alphaProgress));
        int iconColor = ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alphaProgress);
        int itemColor = ColorUtils.interpolate(grayColor, iconColor, animProgress);

        FontObject catFont = idx == AI_CATEGORY_INDEX ? FontRegistry.ICONS_ASYNC : FontRegistry.CATEGORIES;
        float iconX = sx + 16f + 15f;
        float iconY = y + itemH / 2f + FontRegistry.centeredBaselineOffset(catFont, icon.charAt(0), 20f) - 15f;
        float iconW = catFont.getWidth(icon, 20f);
        r.text(catFont, iconX, iconY, 20f, icon, itemColor);

        float textX = iconX + iconW + 6f;
        r.text(FontRegistry.SF_MEDIUM, textX, y + itemH / 2f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'H', fontSize) - 15f, fontSize, name, itemColor);
    }

    private void renderSearchWidget(Renderer2D r, float sx, float sy, float alphaProgress) {
        float x = sx + 15f;
        float y = sy + 74f;
        float w = 225f - 30f;
        float h = 38f;
        float iconSize = 37f;
        String icon = "H";
        float iconX = x + (w - FontRegistry.NEXIS_HUD.getWidth(icon, iconSize)) / 2f;
        r.text(FontRegistry.NEXIS_HUD, iconX, y - 25f, iconSize, icon,
                ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alphaProgress));
        r.rect(x, y, w, h, 18f, ColorUtils.rgba(255, 255, 255, (int) (18 * alphaProgress)));
        searchInput.render(r, x, y, w, h, alphaProgress);
    }

    private boolean handleSearchClicked(double mouseX, double mouseY, int button) {
        float sx = (mc.getWindow().getFramebufferWidth() - PANEL_WIDTH) / 2f;
        float sy = (mc.getWindow().getFramebufferHeight() - PANEL_HEIGHT) / 2f;
        float x = sx + 15f;
        float y = sy + 74f;
        float w = 225f - 30f;
        float h = 38f;
        boolean inside = mouseX >= x && mouseX <= x + w && mouseY >= y && mouseY <= y + h;
        boolean handled = searchInput.mouseClicked(mouseX, mouseY, button, x, y, w, h);
        return handled || inside;
    }

    private List<Function> getModulesToRender() {
        String searchQuery = searchInput.getText();
        if (!searchQuery.isEmpty()) {
            String q = searchQuery.toLowerCase(Locale.US);
            return Nexis.getFunctionManager().getFunctions().stream()
                    .filter(f -> f.isVisible() && f.getName().toLowerCase(Locale.US).contains(q))
                    .collect(Collectors.toList());
        }
        if (selectedCategory >= Category.values().length) return List.of();
        Category cat = Category.values()[selectedCategory];
        return Nexis.getFunctionManager().getFunctionsByCategory(cat);
    }

    private CsSettingComponent<?> getOrCreateSettingComponent(Function func, Setting<?> setting, float width) {
        Map<Setting<?>, CsSettingComponent<?>> comps = moduleSettingComponents.computeIfAbsent(func, k -> new HashMap<>());
        CsSettingComponent<?> comp = comps.get(setting);
        if (comp == null) {
            comp = CsSettingComponent.create(setting, width);
            comps.put(setting, comp);
        } else {
            comp.setWidth(width);
        }
        return comp;
    }

    private boolean hasRenderableSettings(Function func) {
        float innerW = 100f;
        for (Setting<?> s : func.getSettings()) {
            CsSettingComponent<?> comp = getOrCreateSettingComponent(func, s, innerW);
            if (comp.shouldRender()) return true;
        }
        return false;
    }

    private float getSettingsHeight(Function func, float width) {
        float innerW = width - SETTINGS_SIDE_INSET * 2f;
        float total = 0f;
        for (Setting<?> s : func.getSettings()) {
            CsSettingComponent<?> comp = getOrCreateSettingComponent(func, s, innerW);
            if (!comp.shouldRender()) continue;
            float h = comp.getAnimatedHeight();
            if (h <= 0.01f) continue;
            total += h + SETTINGS_GAP * comp.getVisibilityProgress();
        }
        if (total > 0f) total += SETTINGS_BOTTOM_PADDING;
        return total;
    }

    private static final float SETTINGS_SIDE_INSET = 5f;

    private void renderCsSettingComponents(Renderer2D r, Function func, float mx, float my, float width, int mouseX, int mouseY, int alpha) {
        float sy = my;
        float innerW = width - SETTINGS_SIDE_INSET * 2f;
        float innerX = mx + SETTINGS_SIDE_INSET;
        for (Setting<?> s : func.getSettings()) {
            CsSettingComponent<?> comp = getOrCreateSettingComponent(func, s, innerW);
            if (!comp.shouldRender()) continue;
            float p = comp.getVisibilityProgress();
            if (p > 0.001f) {
                int compAlpha = (int) (alpha * p);
                float scaleStart = 0.3f;
                float scale = scaleStart + (1f - scaleStart) * p;
                float cx = innerX + innerW * 0.5f;
                float cy = sy + comp.getHeight() * 0.5f;
                r.pushScale(scale, cx, cy);
                comp.draw(r, innerX, sy, mouseX, mouseY, compAlpha);
                r.popScale();
            }
            sy += comp.getAnimatedHeight() + SETTINGS_GAP * p;
        }
    }

    private boolean handleSettingClicked(Function func, double mouseX, double mouseY, int button, float mx, float my, float width) {
        float sy = my;
        float innerW = width - SETTINGS_SIDE_INSET * 2f;
        float innerX = mx + SETTINGS_SIDE_INSET;
        for (Setting<?> s : func.getSettings()) {
            CsSettingComponent<?> comp = getOrCreateSettingComponent(func, s, innerW);
            if (!comp.shouldRender()) continue;
            float p = comp.getVisibilityProgress();
            float sh = comp.getAnimatedHeight();
            if (p >= 0.5f && mouseX >= innerX && mouseX <= innerX + innerW && mouseY >= sy && mouseY <= sy + sh) {
                comp.mouseClicked(mouseX, mouseY, button, innerX, sy);
                return true;
            }
            sy += sh + SETTINGS_GAP * p;
        }
        return false;
    }

    private void renderModules(Renderer2D r, float sx, float sy, float alphaProgress) {
        String searchQuery = searchInput.getText();
        if (!searchQuery.equals(prevSearchQuery)) {
            moduleScrollOffset = 0f;
            moduleTargetScrollOffset = 0f;
            prevSearchQuery = searchQuery;
        }

        List<Function> modules = getModulesToRender();
        if (selectedCategory == AI_CATEGORY_INDEX) {
            renderAiChat(r, sx, sy, alphaProgress);
            return;
        }
        if (selectedCategory == THEMES_CATEGORY_INDEX && searchInput.getText().isEmpty()) {
            renderThemesPanel(r, sx, sy, alphaProgress);
            return;
        }
        if (selectedCategory == IRC_CATEGORY_INDEX && searchInput.getText().isEmpty()) {
            renderIrcChat(r, sx, sy, alphaProgress);
            return;
        }
        if (selectedCategory == CONFIG_CATEGORY_INDEX && searchInput.getText().isEmpty()) {
            renderConfigsPanel(r, sx, sy, alphaProgress);
            return;
        }
        if (modules.isEmpty()) return;

        float miniW = 225f;
        float areaX = sx + miniW + 2f;
        float areaY = sy + 75f + 2f;
        float areaW = PANEL_WIDTH - miniW - 2f;
        float areaH = PANEL_HEIGHT - 75f - 2f;

        float pad = 12f;
        float contentX = areaX + pad;
        float contentY = areaY + pad;
        float contentW = areaW - pad * 2f;
        float contentH = areaH - pad * 2f;

        float moduleGap = 8f;
        float moduleW = (contentW - moduleGap) / 2f;
        float baseModuleH = 52f;
        float moduleGapY = 6f;

        float[] heights = new float[modules.size()];
        for (int i = 0; i < modules.size(); i++) {
            float sh = getSettingsHeight(modules.get(i), moduleW);
            heights[i] = sh > 0f ? baseModuleH + HEADER_TO_SETTINGS_GAP + sh : baseModuleH;
        }

        float[] colYs = {contentY, contentY};
        for (int i = 0; i < modules.size(); i++) {
            int col = colYs[0] <= colYs[1] ? 0 : 1;
            colYs[col] += heights[i] + moduleGapY;
        }
        float totalContentH = Math.max(colYs[0], colYs[1]) - moduleGapY;
        float maxScroll = Math.max(0, totalContentH - contentH);
        moduleTargetScrollOffset = Math.max(0, Math.min(moduleTargetScrollOffset, maxScroll));
        moduleScrollOffset += (moduleTargetScrollOffset - moduleScrollOffset) * 0.06f;
        if (Math.abs(moduleTargetScrollOffset - moduleScrollOffset) < 0.1f) {
            moduleScrollOffset = moduleTargetScrollOffset;
        }

        r.pushClipRect((int) contentX, (int) contentY, (int) contentW, (int) contentH);

        float moduleAlpha = alphaProgress;
        float iconSize = 22f;
        float nameSize = 16f;
        float descSize = 12f;
        float bindSize = 14f;
        int moduleBg = ColorUtils.rgba(255, 255, 255, (int) (10 * moduleAlpha));
        int textCol = ColorUtils.rgba(200, 200, 205, (int) (255 * moduleAlpha));
        int descCol = ColorUtils.rgba(134, 134, 139, (int) (255 * moduleAlpha));
        int bindRectBg = ColorUtils.rgba(210, 210, 220, (int) (30 * moduleAlpha));
        int bindTextCol = ColorUtils.rgba(134, 134, 139, (int) (255 * moduleAlpha));

        int scaledMx = scaledMouseX();
        int scaledMy = scaledMouseY();

        colYs[0] = colYs[1] = contentY - moduleScrollOffset;
        for (int i = 0; i < modules.size(); i++) {
            Function func = modules.get(i);
            int col = colYs[0] <= colYs[1] ? 0 : 1;
            float h = heights[i];
            float mx = contentX + col * (moduleW + moduleGap);
            float my = colYs[col];
            colYs[col] += h + moduleGapY;

            boolean hovered = scaledMx >= mx && scaledMx <= mx + moduleW && scaledMy >= my && scaledMy <= my + baseModuleH;

            SimpleLinearAnimation toggleAnim = moduleToggleAnims.computeIfAbsent(func, k -> new SimpleLinearAnimation(250));
            if (func.isState()) toggleAnim.show();
            else toggleAnim.hide();
            float toggleProgress = toggleAnim.getProgress();
            int grayIcon = ColorUtils.rgba(200, 200, 205, (int) (255 * moduleAlpha));
            int iconEnabled = ClientColors.applyAlpha(ClientColors.ICON.getRGB(), moduleAlpha);
            int iconColor = ColorUtils.interpolate(grayIcon, iconEnabled, toggleProgress);

            r.rect(mx, my, moduleW, h, 11f, moduleBg);

            if (hovered) {
                String bind = PlayerUtils.getBindName(func.getBind());
                boolean onBind = bind != null && !bind.equalsIgnoreCase("NONE") && scaledMx >= mx + moduleW - FontRegistry.SF_MEDIUM.getWidth(bind, bindSize) - 10f - 11f && scaledMx <= mx + moduleW - 11f && scaledMy >= my + baseModuleH / 2f - 9f && scaledMy <= my + baseModuleH / 2f + 9f;
                if (!onBind) {
                    CursorHelper.setHand();
                }
            }

            String funcIcon = func.getCategory().getIcon();
            if (funcIcon == null || funcIcon.isEmpty()) funcIcon = "?";
            float iconX = mx + 7f;
            float iconY = my + baseModuleH / 2f + FontRegistry.centeredBaselineOffset(FontRegistry.CATEGORIES, funcIcon.charAt(0), iconSize) - 8f;
            float iconW = FontRegistry.CATEGORIES.getWidth(funcIcon, iconSize);
            r.text(FontRegistry.CATEGORIES, iconX, iconY, iconSize, funcIcon, iconColor);

            float nameX = iconX + iconW + 3f;
            float nameY = my + baseModuleH / 2f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'H', nameSize) - 8f;
            r.text(FontRegistry.SF_MEDIUM, nameX, nameY, nameSize, func.getName(), textCol);

            String desc = func.getDescription();
            if (desc != null && !desc.isEmpty()) {
                float descY = nameY + 18f;
                float descX = nameX;
                float rightBound = mx + moduleW - 7f;
                float descAvailW = rightBound - descX - 39f;
                float descFullW = FontRegistry.SF_MEDIUM.getWidth(desc, descSize);

                if (descFullW > descAvailW) {
                    float innerW = descAvailW - MARQUEE_SIDE_PADDING * 2f;
                    float overflow = descFullW - innerW;
                    float offset = -getMarqueeOffset(overflow);
                    float drawX = descX + MARQUEE_SIDE_PADDING;
                    r.pushClipRect((int) Math.floor(drawX), (int) Math.floor(descY - descSize - 4f),
                            (int) Math.ceil(innerW), (int) Math.ceil(descSize * 2f));
                    r.text(FontRegistry.SF_MEDIUM, drawX + offset, descY, descSize, desc, descCol);
                    if (offset < -0.5f) {
                        r.text(FontRegistry.SF_MEDIUM, drawX + offset + descFullW + MARQUEE_GAP + MARQUEE_SIDE_PADDING,
                                descY, descSize, desc, descCol);
                    }
                    r.popClipRect();
                } else {
                    r.text(FontRegistry.SF_MEDIUM, descX, descY, descSize, desc, descCol);
                }
            }

            boolean binding = bindingFunction == func;
            String bind = binding ? "..." : PlayerUtils.getBindName(func.getBind());
            if (binding || (bind != null && !bind.equalsIgnoreCase("NONE"))) {
                float bindH = 18f;
                float bindW = FontRegistry.SF_MEDIUM.getWidth(bind, bindSize) + 10f;
                float bindX = mx + moduleW - bindW - 11f;
                float bindY = my + baseModuleH / 2f - bindH / 2f;
                r.rect(bindX, bindY, bindW, bindH, 4f, bindRectBg);
                float bindTextX = bindX + 5f;
                float bindTextY = bindY + bindH / 2f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'H', bindSize);
                r.text(FontRegistry.SF_MEDIUM, bindTextX, bindTextY, bindSize, bind, bindTextCol);
            }

            if (hasRenderableSettings(func)) {
                float settingsStartY = my + baseModuleH + HEADER_TO_SETTINGS_GAP;
                renderCsSettingComponents(r, func, mx, settingsStartY, moduleW, scaledMx, scaledMy, (int) (255 * moduleAlpha));
            }
        }

        r.popClipRect();

        if (CsColorPicker.get() != null) {
            CsColorPicker.get().draw(r, scaledMx, scaledMy, (int) (255 * alphaProgress));
        }
    }

    private void ensureThemeBindings() {
        ThemeConfig.Theme cur = ThemeConfig.getCurrentTheme();
        if (cur == null) return;
        String key = cur.name;
        if (!key.equals(themeBoundName) || themeColorSettings[0] == null) {
            int[] vals = {cur.icon, cur.background, cur.gradientStart, cur.gradientEnd, cur.text, cur.text};
            for (int i = 0; i < themeColorSettings.length; i++) {
                themeColorSettings[i] = new ColorSetting(THEME_FIELD_LABELS[i], vals[i]);
                themePrevColors[i] = vals[i];
            }
            themeBoundName = key;
            return;
        }
        for (int i = 0; i < themeColorSettings.length; i++) {
            int cv = themeColorSettings[i].get();
            if (cv != themePrevColors[i]) {
                applyThemeColorChange(i, cv);
                themePrevColors[i] = cv;
            }
        }
    }

    private void applyThemeColorChange(int idx, int value) {
        ThemeConfig.Theme cur = ThemeConfig.getCurrentTheme();
        if (cur == null || cur.builtin || cur.rainbow) return;
        switch (idx) {
            case 0 -> cur.icon = value;
            case 1 -> cur.background = value;
            case 2 -> cur.gradientStart = value;
            case 3 -> cur.gradientEnd = value;
            case 4, 5 -> cur.text = value;
        }
        ThemeConfig.applyTheme(cur);
        ThemeConfig.markDirty();
    }

    private static final float THEMES_EDITOR_W = 280f;
    private static final float THEMES_COL_GAP = 12f;

    private void renderThemesPanel(Renderer2D r, float sx, float sy, float alphaProgress) {
        ensureThemeBindings();
        if (themePanelEnterTime == 0L) themePanelEnterTime = System.currentTimeMillis();
        themePanelEnterAnim.show();

        float miniW = 225f;
        float areaX = sx + miniW + 2f;
        float areaY = sy + 75f + 2f;
        float areaW = PANEL_WIDTH - miniW - 2f;
        float areaH = PANEL_HEIGHT - 75f - 2f;
        float pad = 14f;
        float contentX = areaX + pad;
        float contentY = areaY + pad;
        float contentW = areaW - pad * 2f;
        float contentH = areaH - pad * 2f;

        long elapsed = System.currentTimeMillis() - themePanelEnterTime;
        float enterP = themePanelEnterAnim.getProgress();
        float globalSlide = (1f - enterP) * 14f;

        int alpha = (int) (255 * alphaProgress);
        int textCol = ColorUtils.rgba(220, 220, 225, alpha);
        int dimCol = ColorUtils.rgba(140, 140, 145, alpha);
        int subCol = ColorUtils.rgba(120, 120, 125, alpha);
        int veryDimCol = ColorUtils.rgba(95, 95, 100, alpha);
        int cardBg = ColorUtils.rgba(255, 255, 255, (int) (10 * alphaProgress));
        int cardBgHover = ColorUtils.rgba(255, 255, 255, (int) (20 * alphaProgress));
        int rowBg = ColorUtils.rgba(255, 255, 255, (int) (6 * alphaProgress));
        int rowBgHover = ColorUtils.rgba(255, 255, 255, (int) (14 * alphaProgress));
        int accent = ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alphaProgress);
        int accentR = (ClientColors.ICON.getRGB() >> 16) & 0xFF;
        int accentG = (ClientColors.ICON.getRGB() >> 8) & 0xFF;
        int accentB = ClientColors.ICON.getRGB() & 0xFF;

        int mx = scaledMouseX();
        int my = scaledMouseY();

        float editorX = contentX - globalSlide;
        float editorY = contentY;
        float editorW = THEMES_EDITOR_W;
        float editorH = contentH;

        float listX = contentX + editorW + THEMES_COL_GAP + globalSlide * 0.6f;
        float listY = contentY;
        float listW = contentW - editorW - THEMES_COL_GAP;
        float listH = contentH;

        renderThemesEditor(r, editorX, editorY, editorW, editorH, alphaProgress, enterP, elapsed, mx, my,
                textCol, dimCol, subCol, veryDimCol, cardBg, rowBg, rowBgHover, accent, accentR, accentG, accentB, alpha);

        renderThemesList(r, listX, listY, listW, listH, alphaProgress, enterP, elapsed, mx, my,
                textCol, dimCol, subCol, cardBg, cardBgHover, accent, accentR, accentG, accentB, alpha);

        if (CsColorPicker.get() != null) {
            CsColorPicker.get().draw(r, mx, my, alpha);
        }
    }

    private void renderThemesEditor(Renderer2D r, float x, float y, float w, float h, float alphaProgress,
                                    float enterP, long elapsed, int mx, int my,
                                    int textCol, int dimCol, int subCol, int veryDimCol,
                                    int cardBg, int rowBg, int rowBgHover, int accent,
                                    int accentR, int accentG, int accentB, int alpha) {
        float panelAlpha = alphaProgress * (0.4f + 0.6f * enterP);
        int panelBg = ColorUtils.rgba(255, 255, 255, (int) (10 * panelAlpha));
        r.rect(x, y, w, h, 14f, panelBg);

        float titleP = Math.max(0f, Math.min(1f, (elapsed - 40) / 320f));
        titleP = 1f - (1f - titleP) * (1f - titleP);
        int titleAlpha = (int) (255 * alphaProgress * titleP);
        float titleSlide = (1f - titleP) * 10f;
        r.text(FontRegistry.SF_SEMIBOLD, x + 16f - titleSlide, y + 24f, 17f, "Создать тему", ColorUtils.rgba(230, 230, 235, titleAlpha));
        r.text(FontRegistry.SF_MEDIUM, x + 16f - titleSlide, y + 44f, 11.5f, "Настройте палитру и сохраните", ColorUtils.rgba(135, 135, 140, titleAlpha));

        float nameY = y + 62f;
        float nameH = 32f;
        float nameW = w - 32f;
        boolean nameHov = mx >= x + 16f && mx <= x + 16f + nameW && my >= nameY && my <= nameY + nameH;
        if (themeNameInput.isFocused() || nameHov) themeNameFocusAnim.show();
        else themeNameFocusAnim.hide();
        float nameFocusP = themeNameFocusAnim.getProgress();
        int nameBgCol = ColorUtils.interpolate(rowBg, rowBgHover, nameFocusP);
        r.rect(x + 16f, nameY, nameW, nameH, 10f, nameBgCol);
        themeNameInput.render(r, x + 16f, nameY, nameW, nameH, alphaProgress);

        float rowsY = nameY + nameH + 14f;
        float rowH = 36f;
        float rowGap = 4f;
        for (int i = 0; i < THEME_FIELD_LABELS.length; i++) {
            if (themeFieldHoverAnims[i] == null) {
                themeFieldHoverAnims[i] = new SimpleLinearAnimation(200);
                themeFieldHoverAnims[i].setEasing(Easings.EASE_OUT_QUART);
            }
            if (themeSwatchPulseAnims[i] == null) {
                themeSwatchPulseAnims[i] = new SimpleLinearAnimation(360);
                themeSwatchPulseAnims[i].setEasing(Easings.EASE_OUT_QUART);
            }
        }

        for (int i = 0; i < THEME_FIELD_LABELS.length; i++) {
            float ry = rowsY + i * (rowH + rowGap);
            if (ry + rowH > y + h - 60f) break;

            float rowAppearP = Math.max(0f, Math.min(1f, (elapsed - 80 - i * 35) / 280f));
            rowAppearP = 1f - (float) Math.pow(1f - rowAppearP, 3);
            float rowSlideX = (1f - rowAppearP) * 12f;
            int rowA = (int) (alpha * rowAppearP);

            boolean rowHov = mx >= x + 16f - rowSlideX && mx <= x + w - 16f && my >= ry && my <= ry + rowH;
            if (rowHov) themeFieldHoverAnims[i].show();
            else themeFieldHoverAnims[i].hide();
            float hoverP = themeFieldHoverAnims[i].getProgress();

            int rowBgCol = ColorUtils.interpolate(rowBg, rowBgHover, hoverP);
            rowBgCol = ColorUtils.multAlpha(rowBgCol, rowAppearP);
            r.rect(x + 16f - rowSlideX, ry, w - 32f, rowH, 9f, rowBgCol);

            int colorVal = themeColorSettings[i] != null ? themeColorSettings[i].get() : 0xFFFFFFFF;
            float pulseP = themeSwatchPulseAnims[i].getProgress();
            float swSize = 18f + 4f * pulseP;
            float swX = x + 16f + 8f - rowSlideX;
            float swY = ry + (rowH - swSize) / 2f;
            int swColor = ColorUtils.multAlpha(colorVal, alphaProgress * rowAppearP);
            if (pulseP > 0.01f) {
                int glow = ColorUtils.rgba((colorVal >> 16) & 0xFF, (colorVal >> 8) & 0xFF, colorVal & 0xFF, (int) (80 * pulseP * alphaProgress));
                r.rect(swX - 3f, swY - 3f, swSize + 6f, swSize + 6f, (swSize + 6f) / 2f, glow);
            }
            r.rect(swX, swY, swSize, swSize, swSize / 2f, swColor);

            float textX = swX + swSize + 10f;
            r.text(FontRegistry.SF_SEMIBOLD, textX, ry + rowH / 2f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', 12.5f) - 6f, 12.5f, THEME_FIELD_LABELS[i], ColorUtils.rgba(220, 220, 225, rowA));
            String hex = String.format("#%06X", colorVal & 0xFFFFFF);
            r.text(FontRegistry.SF_MEDIUM, textX, ry + rowH / 2f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'H', 10.5f) + 7f, 10.5f, hex, ColorUtils.rgba(130, 130, 135, rowA));

            if (rowHov) CursorHelper.setHand();
        }

        boolean createHov = mx >= x + 16f && mx <= x + w - 16f && my >= y + h - 16f - 38f && my <= y + h - 16f;
        if (createHov) themeCreateHoverAnim.show();
        else themeCreateHoverAnim.hide();
        float createHovP = themeCreateHoverAnim.getProgress();
        float pulseP = themeCreatePulseAnim.getProgress();
        float btnY = y + h - 16f - 38f;
        float btnH = 38f;
        float btnW = w - 32f;
        float btnX = x + 16f;
        int idleBg = ColorUtils.rgba(accentR, accentG, accentB, (int) (200 * alphaProgress));
        int hovBg = ColorUtils.rgba(accentR, accentG, accentB, (int) (255 * alphaProgress));
        int btnBg = ColorUtils.interpolate(idleBg, hovBg, createHovP);
        r.rect(btnX, btnY, btnW, btnH, 11f, btnBg);
        String createLbl = "Создать";
        float clW = FontRegistry.SF_SEMIBOLD.getWidth(createLbl, 14.5f);
        float lblScale = 1f + 0.04f * createHovP;
        float drawSize = 14.5f * lblScale;
        float drawW = FontRegistry.SF_SEMIBOLD.getWidth(createLbl, drawSize);
        r.text(FontRegistry.SF_SEMIBOLD, btnX + (btnW - drawW) / 2f, btnY + btnH / 2f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', drawSize), drawSize, createLbl, ColorUtils.rgba(255, 255, 255, alpha));
    }

    private void renderThemesList(Renderer2D r, float x, float y, float w, float h, float alphaProgress,
                                  float enterP, long elapsed, int mx, int my,
                                  int textCol, int dimCol, int subCol, int cardBg, int cardBgHover, int accent,
                                  int accentR, int accentG, int accentB, int alpha) {
        java.util.List<ThemeConfig.Theme> themes = ThemeConfig.getThemes();

        float headerH = 38f;
        float headerP = Math.max(0f, Math.min(1f, (elapsed - 60) / 320f));
        headerP = 1f - (1f - headerP) * (1f - headerP);
        int headerAlpha = (int) (255 * alphaProgress * headerP);
        float headerSlide = (1f - headerP) * 10f;
        r.text(FontRegistry.SF_SEMIBOLD, x + 4f + headerSlide, y + 24f, 16f, "Темы", ColorUtils.rgba(230, 230, 235, headerAlpha));
        r.text(FontRegistry.SF_MEDIUM, x + 4f + headerSlide, y + 44f, 11.5f, themes.size() + " доступно", ColorUtils.rgba(135, 135, 140, headerAlpha));

        float gridY = y + headerH + 14f;
        float gridH = h - (gridY - y);

        float colGap = 0f;
        float rowGap = 8f;
        int cols = 1;
        float cardW = w;
        float cardH = 74f;

        int rows = (int) Math.ceil(themes.size() / (float) cols);
        float totalH = rows * cardH + Math.max(0, rows - 1) * rowGap;
        float maxScroll = Math.max(0, totalH - gridH);
        themesTargetScrollOffset = Math.max(0, Math.min(themesTargetScrollOffset, maxScroll));
        themesScrollOffset += (themesTargetScrollOffset - themesScrollOffset) * 0.2f;
        if (Math.abs(themesTargetScrollOffset - themesScrollOffset) < 0.1f)
            themesScrollOffset = themesTargetScrollOffset;

        r.pushClipRect((int) x - 2, (int) gridY, (int) w + 16, (int) gridH + 1);

        ThemeConfig.Theme cur = ThemeConfig.getCurrentTheme();
        for (int i = 0; i < themes.size(); i++) {
            ThemeConfig.Theme t = themes.get(i);
            int col = i % cols;
            int row = i / cols;
            float cx = x + col * (cardW + colGap);
            float cy = gridY + row * (cardH + rowGap) - themesScrollOffset;

            if (cy + cardH < gridY - 2 || cy > gridY + gridH + 2) continue;

            SimpleLinearAnimation appearAnim = themeCardAppearAnims.computeIfAbsent(t.name, k -> {
                SimpleLinearAnimation a = new SimpleLinearAnimation(360);
                a.setEasing(Easings.EASE_OUT_QUART);
                a.show();
                return a;
            });
            float appearP = appearAnim.getProgress();
            float cardAppearDelay = Math.max(0f, Math.min(1f, (elapsed - 100 - i * 45) / 360f));
            cardAppearDelay = 1f - (float) Math.pow(1f - cardAppearDelay, 3);
            float combinedP = Math.min(appearP, cardAppearDelay);
            float slideY = (1f - combinedP) * 14f;
            int cardA = (int) (alpha * combinedP);

            float drawY = cy + slideY;

            SimpleLinearAnimation hoverAnim = themeCardAnims.computeIfAbsent(t.name, k -> new SimpleLinearAnimation(220));
            boolean cardHov = mx >= cx && mx <= cx + cardW && my >= cy && my <= cy + cardH;
            if (cardHov) hoverAnim.show();
            else hoverAnim.hide();
            float hoverP = hoverAnim.getProgress();

            boolean isCurrent = cur != null && cur.name.equalsIgnoreCase(t.name);

            int bgIdle = ColorUtils.rgba(255, 255, 255, (int) (10 * alphaProgress * combinedP));
            int bgHov = ColorUtils.rgba(255, 255, 255, (int) (22 * alphaProgress * combinedP));
            int bgCol = ColorUtils.interpolate(bgIdle, bgHov, hoverP);

            float scaleP = 1f - hoverP * 0.005f;
            float scaledW = cardW * scaleP;
            float scaledH = cardH * scaleP;
            float scaledX = cx + (cardW - scaledW) / 2f;
            float scaledYf = drawY + (cardH - scaledH) / 2f;

            r.rect(scaledX, scaledYf, scaledW, scaledH, 12f, bgCol);

            float namePadL = 12f;
            r.text(FontRegistry.SF_SEMIBOLD, scaledX + namePadL, scaledYf + 22f, 13.5f, t.name, ColorUtils.rgba(225, 225, 230, cardA));
            String sub = t.builtin ? "встроенная" : t.rainbow ? "радужная" : "кастомная";
            r.text(FontRegistry.SF_MEDIUM, scaledX + namePadL, scaledYf + 38f, 10.5f, sub, ColorUtils.rgba(135, 135, 140, cardA));

            int[] palette = {t.icon, t.background, t.gradientStart, t.gradientEnd, t.text};
            float dotSize = 11f + 1.5f * hoverP;
            float dotGap = 4f;
            float dotsY = scaledYf + scaledH - dotSize - 12f;
            float dotsStartX = scaledX + namePadL;
            for (int p = 0; p < palette.length; p++) {
                float dx = dotsStartX + p * (dotSize + dotGap);
                float dotAppearP = Math.max(0f, Math.min(1f, (elapsed - 200 - i * 45 - p * 30) / 280f));
                dotAppearP = 1f - (1f - dotAppearP) * (1f - dotAppearP);
                float scale = 0.5f + 0.5f * dotAppearP * combinedP;
                float ds = dotSize * scale;
                float doffset = (dotSize - ds) / 2f;
                r.rect(dx + doffset, dotsY + doffset, ds, ds, ds / 2f, ColorUtils.multAlpha(palette[p], alphaProgress * dotAppearP * combinedP));
            }

            if (ThemeConfig.isEditable(t)) {
                float btnSize = 22f;
                float btnX = scaledX + scaledW - btnSize - 10f;
                float btnYf = scaledYf + 10f;
                SimpleLinearAnimation delAnim = themeDelBtnAnims.computeIfAbsent(t.name, k -> new SimpleLinearAnimation(180));
                boolean delHov = mx >= btnX && mx <= btnX + btnSize && my >= btnYf && my <= btnYf + btnSize;
                if (delHov) delAnim.show();
                else delAnim.hide();
                float delP = delAnim.getProgress();
                int delBg = ColorUtils.interpolate(
                        ColorUtils.rgba(255, 255, 255, (int) (12 * alphaProgress * combinedP)),
                        ColorUtils.rgba(255, 80, 80, (int) (200 * alphaProgress * combinedP)),
                        delP);
                r.rect(btnX, btnYf, btnSize, btnSize, 7f, delBg);
                int xCol = ColorUtils.interpolate(ColorUtils.rgba(180, 180, 185, cardA), ColorUtils.rgba(255, 255, 255, cardA), delP);
                CsIcons.drawCrossIcon(r, btnX + btnSize / 2f, btnYf + btnSize / 2f, 8f, 1.6f, xCol);
                if (delHov) CursorHelper.setHand();
            }

            if (cardHov && !isCurrent) CursorHelper.setHand();
        }

        r.popClipRect();

        if (totalH > gridH + 0.5f) {
            float sbX = x + w + 7f;
            float sbY = gridY + 4f;
            float sbH = gridH - 8f;
            r.rect(sbX, sbY, 2.5f, sbH, 1.25f, ColorUtils.rgba(255, 255, 255, (int) (10 * alphaProgress)));
            float vis = Math.min(1f, gridH / totalH);
            float thumbH = Math.max(20f, sbH * vis);
            float prog = maxScroll > 0 ? themesScrollOffset / maxScroll : 0f;
            float thumbY = sbY + (sbH - thumbH) * Math.max(0f, Math.min(1f, prog));
            r.rect(sbX, thumbY, 2.5f, thumbH, 1.25f, ColorUtils.rgba(255, 255, 255, (int) (70 * alphaProgress)));
            sbThemes.set(sbX, sbY, 2.5f, sbH, thumbY, thumbH, totalH, gridH);
        } else {
            sbThemes.clear();
        }
    }

    private void renderConfigsPanel(Renderer2D r, float sx, float sy, float alphaProgress) {
        if (configPanelEnterTime == 0L) configPanelEnterTime = System.currentTimeMillis();
        configPanelEnterAnim.show();
        long elapsed = System.currentTimeMillis() - configPanelEnterTime;
        float enterP = configPanelEnterAnim.getProgress();

        float miniW = 225f;
        float areaX = sx + miniW + 2f;
        float areaY = sy + 75f + 2f;
        float areaW = PANEL_WIDTH - miniW - 2f;
        float areaH = PANEL_HEIGHT - 75f - 2f;
        float pad = 14f;
        float contentX = areaX + pad;
        float contentY = areaY + pad;
        float contentW = areaW - pad * 2f;
        float contentH = areaH - pad * 2f;

        int alpha = (int) (255 * alphaProgress);
        int textCol = ColorUtils.rgba(220, 220, 225, alpha);
        int dimCol = ColorUtils.rgba(140, 140, 145, alpha);
        int subCol = ColorUtils.rgba(120, 120, 125, alpha);
        int cardBg = ColorUtils.rgba(255, 255, 255, (int) (10 * alphaProgress));
        int cardBgHover = ColorUtils.rgba(255, 255, 255, (int) (20 * alphaProgress));
        int rowBg = ColorUtils.rgba(255, 255, 255, (int) (6 * alphaProgress));
        int rowBgHover = ColorUtils.rgba(255, 255, 255, (int) (14 * alphaProgress));
        int accent = ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alphaProgress);
        int accentR = (ClientColors.ICON.getRGB() >> 16) & 0xFF;
        int accentG = (ClientColors.ICON.getRGB() >> 8) & 0xFF;
        int accentB = ClientColors.ICON.getRGB() & 0xFF;

        int mx = scaledMouseX();
        int my = scaledMouseY();

        ConfigStorage storage = Nexis.getInstance().getConfigStorage();
        java.util.List<Config> configs = storage != null ? storage.getConfigs() : List.of();

        float globalSlide = (1f - enterP) * 14f;

        float headerH = 64f;
        float headerP = Math.max(0f, Math.min(1f, (elapsed - 40) / 320f));
        headerP = 1f - (1f - headerP) * (1f - headerP);
        float headerSlideY = (1f - headerP) * 10f;
        int headerAlpha = (int) (255 * alphaProgress * headerP);
        int headerBgCol = ColorUtils.multAlpha(cardBg, headerP);

        float headerY = contentY - headerSlideY;
        r.rect(contentX, headerY, contentW, headerH, 14f, headerBgCol);

        float nameH = 36f;
        float nameY = headerY + (headerH - nameH) / 2f;
        float createBtnW = 200f;
        float nameW = contentW - 28f - createBtnW - 10f;

        boolean nameHov = mx >= contentX + 14f && mx <= contentX + 14f + nameW && my >= nameY && my <= nameY + nameH;
        if (configNameInput.isFocused() || nameHov) configNameFocusAnim.show();
        else configNameFocusAnim.hide();
        float nameFocusP = configNameFocusAnim.getProgress();
        int nameBg = ColorUtils.interpolate(rowBg, rowBgHover, nameFocusP);
        r.rect(contentX + 14f, nameY, nameW, nameH, 11f, ColorUtils.multAlpha(nameBg, headerP));
        configNameInput.render(r, contentX + 14f, nameY, nameW, nameH, alphaProgress * headerP);

        float createBtnX = contentX + 14f + nameW + 10f;
        boolean createHov = mx >= createBtnX && mx <= createBtnX + createBtnW && my >= nameY && my <= nameY + nameH;
        if (createHov) configCreateHoverAnim.show();
        else configCreateHoverAnim.hide();
        float createHovP = configCreateHoverAnim.getProgress();
        float createPulseP = configCreatePulseAnim.getProgress();

        int idleBg = ColorUtils.rgba(accentR, accentG, accentB, (int) (200 * alphaProgress * headerP));
        int hovBg = ColorUtils.rgba(accentR, accentG, accentB, (int) (255 * alphaProgress * headerP));
        int createBg = ColorUtils.interpolate(idleBg, hovBg, createHovP);
        r.rect(createBtnX, nameY, createBtnW, nameH, 11f, createBg);
        String lbl = "Создать новый конфиг";
        float lblScale = 1f + 0.04f * createHovP;
        float lblSize = 12.5f * lblScale;
        float lblW = FontRegistry.SF_SEMIBOLD.getWidth(lbl, lblSize);
        r.text(FontRegistry.SF_SEMIBOLD, createBtnX + (createBtnW - lblW) / 2f, nameY + nameH / 2f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', lblSize), lblSize, lbl, ColorUtils.rgba(255, 255, 255, headerAlpha));

        float listHeaderH = 30f;
        float listHeaderY = contentY + headerH + 12f;
        float listSubP = Math.max(0f, Math.min(1f, (elapsed - 80) / 340f));
        listSubP = 1f - (1f - listSubP) * (1f - listSubP);
        int listHeaderAlpha = (int) (255 * alphaProgress * listSubP);
        float listHeaderSlide = (1f - listSubP) * 8f;
        r.text(FontRegistry.SF_SEMIBOLD, contentX + 4f - listHeaderSlide, listHeaderY + 18f, 14.5f, "Конфиги", ColorUtils.rgba(230, 230, 235, listHeaderAlpha));
        String countStr = configs.size() + (configs.size() == 1 ? " конфиг" : configs.size() < 5 && configs.size() > 1 ? " конфига" : " конфигов");
        float countW = FontRegistry.SF_MEDIUM.getWidth(countStr, 11.5f);
        r.text(FontRegistry.SF_MEDIUM, contentX + contentW - 4f - countW + listHeaderSlide, listHeaderY + 18f, 11.5f, countStr, ColorUtils.rgba(135, 135, 140, listHeaderAlpha));

        float listY = listHeaderY + listHeaderH;
        float listH = contentH - (listY - contentY);

        float cardH = 68f;
        float cardGap = 7f;
        float totalH = configs.size() * (cardH + cardGap);
        float maxScroll = Math.max(0, totalH - listH);
        configTargetScrollOffset = Math.max(0, Math.min(configTargetScrollOffset, maxScroll));
        configScrollOffset += (configTargetScrollOffset - configScrollOffset) * 0.2f;
        if (Math.abs(configTargetScrollOffset - configScrollOffset) < 0.1f)
            configScrollOffset = configTargetScrollOffset;

        r.pushClipRect((int) contentX - 2, (int) listY, (int) contentW + 16, (int) listH + 1);

        for (int i = 0; i < configs.size(); i++) {
            Config cfg = configs.get(i);
            float cy = listY + i * (cardH + cardGap) - configScrollOffset;
            if (cy + cardH < listY - 2 || cy > listY + listH + 2) continue;

            SimpleLinearAnimation appearAnim = configCardAppearAnims.computeIfAbsent(cfg.getName(), k -> {
                SimpleLinearAnimation a = new SimpleLinearAnimation(360);
                a.setEasing(Easings.EASE_OUT_QUART);
                a.show();
                return a;
            });
            float appearP = appearAnim.getProgress();
            float delayP = Math.max(0f, Math.min(1f, (elapsed - 100 - i * 45) / 360f));
            delayP = 1f - (float) Math.pow(1f - delayP, 3);
            float combinedP = Math.min(appearP, delayP);
            float slideX = (1f - combinedP) * 16f;
            int cardA = (int) (alpha * combinedP);

            float drawX = contentX + slideX;
            SimpleLinearAnimation hoverAnim = configCardAnims.computeIfAbsent(cfg.getName(), k -> new SimpleLinearAnimation(220));
            boolean cardHov = mx >= drawX && mx <= drawX + contentW && my >= cy && my <= cy + cardH;
            if (cardHov) hoverAnim.show();
            else hoverAnim.hide();
            float hoverP = hoverAnim.getProgress();

            int bgIdle = ColorUtils.rgba(255, 255, 255, (int) (10 * alphaProgress * combinedP));
            int bgHov = ColorUtils.rgba(255, 255, 255, (int) (22 * alphaProgress * combinedP));
            int bgCol = ColorUtils.interpolate(bgIdle, bgHov, hoverP);
            r.rect(drawX, cy, contentW, cardH, 12f, bgCol);
            if (cardHov) CursorHelper.setHand();

            CsConfigMeta.Meta meta = CsConfigMeta.get(cfg);
            r.text(FontRegistry.SF_SEMIBOLD, drawX + 18f, cy + 28f, 14.5f, cfg.getName(), ColorUtils.rgba(225, 225, 230, cardA));
            String info = "автор: " + meta.author + "  •  " + CsConfigMeta.formatRelativeDate(meta.updatedAt);
            r.text(FontRegistry.SF_MEDIUM, drawX + 18f, cy + 48f, 11.5f, info, ColorUtils.rgba(130, 130, 135, cardA));

            float btnSize = 28f;
            float btnGap = 6f;
            float btnY = cy + (cardH - btnSize) / 2f;
            float loadW = 86f;
            float loadX = drawX + contentW - 14f - loadW;
            float refreshX = loadX - btnGap - btnSize;
            float delX = refreshX - btnGap - btnSize;

            SimpleLinearAnimation loadAnim = configLoadBtnAnims.computeIfAbsent(cfg.getName(), k -> new SimpleLinearAnimation(200));
            boolean loadHov = mx >= loadX && mx <= loadX + loadW && my >= btnY && my <= btnY + btnSize;
            if (loadHov) loadAnim.show();
            else loadAnim.hide();
            float loadP = loadAnim.getProgress();
            int loadIdle = ColorUtils.rgba(accentR, accentG, accentB, (int) (140 * alphaProgress * combinedP));
            int loadHovBg = ColorUtils.rgba(accentR, accentG, accentB, (int) (240 * alphaProgress * combinedP));
            int loadBg = ColorUtils.interpolate(loadIdle, loadHovBg, loadP);
            r.rect(loadX, btnY, loadW, btnSize, 9f, loadBg);
            String loadLbl = "Загрузить";
            float loadLblSize = 12f * (1f + 0.04f * loadP);
            float loadLblW = FontRegistry.SF_SEMIBOLD.getWidth(loadLbl, loadLblSize);
            r.text(FontRegistry.SF_SEMIBOLD, loadX + (loadW - loadLblW) / 2f, btnY + btnSize / 2f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', loadLblSize), loadLblSize, loadLbl, ColorUtils.rgba(255, 255, 255, cardA));
            if (loadHov) CursorHelper.setHand();

            SimpleLinearAnimation refAnim = configRefreshBtnAnims.computeIfAbsent(cfg.getName(), k -> new SimpleLinearAnimation(200));
            boolean refHov = mx >= refreshX && mx <= refreshX + btnSize && my >= btnY && my <= btnY + btnSize;
            if (refHov) refAnim.show();
            else refAnim.hide();
            float refP = refAnim.getProgress();
            int refIdle = ColorUtils.rgba(255, 255, 255, (int) (12 * alphaProgress * combinedP));
            int refHovBg = ColorUtils.rgba(255, 255, 255, (int) (32 * alphaProgress * combinedP));
            int refBg = ColorUtils.interpolate(refIdle, refHovBg, refP);
            r.rect(refreshX, btnY, btnSize, btnSize, 9f, refBg);
            float arrowSize = 12f * (1f + 0.06f * refP);
            float arrowAng = refHov ? ((System.currentTimeMillis() % 1200L) / 1200f * 360f) : 0f;
            CsIcons.drawRefreshIcon(r, refreshX + btnSize / 2f, btnY + btnSize / 2f, arrowSize, arrowAng, ColorUtils.rgba(225, 225, 230, cardA));
            if (refHov) CursorHelper.setHand();

            SimpleLinearAnimation delAnim = configDelBtnAnims.computeIfAbsent(cfg.getName(), k -> new SimpleLinearAnimation(200));
            boolean delHov = mx >= delX && mx <= delX + btnSize && my >= btnY && my <= btnY + btnSize;
            if (delHov) delAnim.show();
            else delAnim.hide();
            float delP = delAnim.getProgress();
            int delIdle = ColorUtils.rgba(255, 255, 255, (int) (12 * alphaProgress * combinedP));
            int delHovBg = ColorUtils.rgba(255, 80, 80, (int) (200 * alphaProgress * combinedP));
            int delBg = ColorUtils.interpolate(delIdle, delHovBg, delP);
            r.rect(delX, btnY, btnSize, btnSize, 9f, delBg);
            int xCol = ColorUtils.interpolate(ColorUtils.rgba(195, 195, 200, cardA), ColorUtils.rgba(255, 255, 255, cardA), delP);
            float xSize = 9f * (1f + 0.06f * delP);
            CsIcons.drawCrossIcon(r, delX + btnSize / 2f, btnY + btnSize / 2f, xSize, 1.8f, xCol);
            if (delHov) CursorHelper.setHand();
        }

        if (configs.isEmpty()) {
            float phPulse = (float) (Math.sin(System.currentTimeMillis() / 1200.0) * 0.15 + 0.85);
            String ph = "Нет сохранённых конфигов";
            String sub = "Введите название и нажмите «Создать»";
            float phSize = 16f;
            float subSize = 12f;
            float phW = FontRegistry.SF_SEMIBOLD.getWidth(ph, phSize);
            float subW = FontRegistry.SF_MEDIUM.getWidth(sub, subSize);
            float cy = listY + listH * 0.4f;
            r.text(FontRegistry.SF_SEMIBOLD, contentX + (contentW - phW) / 2f, cy, phSize, ph, ColorUtils.rgba(180, 180, 185, (int) (200 * alphaProgress * phPulse)));
            r.text(FontRegistry.SF_MEDIUM, contentX + (contentW - subW) / 2f, cy + 22f, subSize, sub, ColorUtils.rgba(130, 130, 135, (int) (160 * alphaProgress)));
        }

        r.popClipRect();

        if (totalH > listH + 0.5f) {
            float sbX = areaX + areaW - 6f;
            float sbY = listY + 4f;
            float sbH = listH - 8f;
            r.rect(sbX, sbY, 2.5f, sbH, 1.25f, ColorUtils.rgba(255, 255, 255, (int) (10 * alphaProgress)));
            float vis = Math.min(1f, listH / totalH);
            float thumbH = Math.max(20f, sbH * vis);
            float prog = maxScroll > 0 ? configScrollOffset / maxScroll : 0f;
            float thumbY = sbY + (sbH - thumbH) * Math.max(0f, Math.min(1f, prog));
            r.rect(sbX, thumbY, 2.5f, thumbH, 1.25f, ColorUtils.rgba(255, 255, 255, (int) (70 * alphaProgress)));
            sbConfig.set(sbX, sbY, 2.5f, sbH, thumbY, thumbH, totalH, listH);
        } else {
            sbConfig.clear();
        }
    }

    private boolean handleThemesClicked(double mouseX, double mouseY, int button) {
        if (button != 0) return false;
        float fbW = mc.getWindow().getFramebufferWidth();
        float fbH = mc.getWindow().getFramebufferHeight();
        float sx = (fbW - PANEL_WIDTH) / 2f;
        float sy = (fbH - PANEL_HEIGHT) / 2f;
        float miniW = 225f;
        float areaX = sx + miniW + 2f;
        float areaY = sy + 75f + 2f;
        float areaW = PANEL_WIDTH - miniW - 2f;
        float areaH = PANEL_HEIGHT - 75f - 2f;
        if (mouseX < areaX || mouseX > areaX + areaW || mouseY < areaY || mouseY > areaY + areaH) return false;

        float pad = 14f;
        float contentX = areaX + pad;
        float contentY = areaY + pad;
        float contentW = areaW - pad * 2f;
        float contentH = areaH - pad * 2f;

        float editorX = contentX;
        float editorY = contentY;
        float editorW = THEMES_EDITOR_W;
        float editorH = contentH;

        float nameY = editorY + 62f;
        float nameH = 32f;
        float nameW = editorW - 32f;
        if (themeNameInput.mouseClicked(mouseX, mouseY, button, editorX + 16f, nameY, nameW, nameH)) return true;

        float rowsY = nameY + nameH + 14f;
        float rowH = 36f;
        float rowGap = 4f;
        for (int i = 0; i < THEME_FIELD_LABELS.length; i++) {
            float ry = rowsY + i * (rowH + rowGap);
            if (ry + rowH > editorY + editorH - 60f) break;
            if (mouseX >= editorX + 16f && mouseX <= editorX + editorW - 16f && mouseY >= ry && mouseY <= ry + rowH) {
                if (themeColorSettings[i] != null) {
                    CsColorPicker.open(themeColorSettings[i], editorX + editorW + 6f, ry, 200f);
                    if (themeSwatchPulseAnims[i] != null) {
                        themeSwatchPulseAnims[i].setDuration(1);
                        themeSwatchPulseAnims[i].show();
                        themeSwatchPulseAnims[i].getProgress();
                        themeSwatchPulseAnims[i].setDuration(360);
                        themeSwatchPulseAnims[i].hide();
                    }
                }
                return true;
            }
        }

        float btnY = editorY + editorH - 16f - 38f;
        float btnH = 38f;
        float btnW = editorW - 32f;
        float btnX = editorX + 16f;
        if (mouseX >= btnX && mouseX <= btnX + btnW && mouseY >= btnY && mouseY <= btnY + btnH) {
            String nm = themeNameInput.getText().trim();
            ThemeConfig.createThemeFromCurrent(nm.isEmpty() ? "Новая тема" : nm);
            ThemeConfig.save();
            themeNameInput.setText("");
            themeBoundName = null;
            themeCreatePulseAnim.setDuration(1);
            themeCreatePulseAnim.show();
            themeCreatePulseAnim.getProgress();
            themeCreatePulseAnim.setDuration(280);
            themeCreatePulseAnim.hide();
            return true;
        }

        float listX = contentX + editorW + THEMES_COL_GAP;
        float listY = contentY;
        float listW = contentW - editorW - THEMES_COL_GAP;
        float gridY = listY + 38f + 14f;
        float gridH = contentH - (gridY - listY);

        if (mouseX < listX || mouseX > listX + listW || mouseY < gridY || mouseY > gridY + gridH) return false;

        java.util.List<ThemeConfig.Theme> themes = ThemeConfig.getThemes();
        int cols = 1;
        float colGap = 0f;
        float rowGapList = 8f;
        float cardW = listW;
        float cardH = 74f;

        for (int i = 0; i < themes.size(); i++) {
            int col = i % cols;
            int row = i / cols;
            float cx = listX + col * (cardW + colGap);
            float cy = gridY + row * (cardH + rowGapList) - themesScrollOffset;

            if (mouseY < cy || mouseY > cy + cardH) continue;
            if (mouseX < cx || mouseX > cx + cardW) continue;

            ThemeConfig.Theme t = themes.get(i);
            if (ThemeConfig.isEditable(t)) {
                float btnSize = 22f;
                float dbX = cx + cardW - btnSize - 10f;
                float dbY = cy + 10f;
                if (mouseX >= dbX && mouseX <= dbX + btnSize && mouseY >= dbY && mouseY <= dbY + btnSize) {
                    ThemeConfig.removeTheme(t);
                    ThemeConfig.save();
                    themeBoundName = null;
                    themeCardAppearAnims.remove(t.name);
                    themeCardAnims.remove(t.name);
                    themeDelBtnAnims.remove(t.name);
                    return true;
                }
            }
            ThemeConfig.applyTheme(t);
            ThemeConfig.save();
            themeBoundName = null;
            return true;
        }
        return false;
    }

    private boolean handleConfigsClicked(double mouseX, double mouseY, int button) {
        if (button != 0) return false;
        float fbW = mc.getWindow().getFramebufferWidth();
        float fbH = mc.getWindow().getFramebufferHeight();
        float sx = (fbW - PANEL_WIDTH) / 2f;
        float sy = (fbH - PANEL_HEIGHT) / 2f;
        float miniW = 225f;
        float areaX = sx + miniW + 2f;
        float areaY = sy + 75f + 2f;
        float areaW = PANEL_WIDTH - miniW - 2f;
        float areaH = PANEL_HEIGHT - 75f - 2f;
        if (mouseX < areaX || mouseX > areaX + areaW || mouseY < areaY || mouseY > areaY + areaH) return false;

        float pad = 14f;
        float contentX = areaX + pad;
        float contentY = areaY + pad;
        float contentW = areaW - pad * 2f;
        float contentH = areaH - pad * 2f;

        float headerH = 64f;
        float nameH = 36f;
        float nameY = contentY + (headerH - nameH) / 2f;
        float createBtnW = 200f;
        float nameW = contentW - 28f - createBtnW - 10f;

        if (configNameInput.mouseClicked(mouseX, mouseY, button, contentX + 14f, nameY, nameW, nameH)) return true;

        float createBtnX = contentX + 14f + nameW + 10f;
        if (mouseX >= createBtnX && mouseX <= createBtnX + createBtnW && mouseY >= nameY && mouseY <= nameY + nameH) {
            String nm = configNameInput.getText().trim();
            if (!nm.isEmpty()) {
                ConfigStorage.saveConfiguration(nm);
                configNameInput.setText("");
                CsConfigMeta.CACHE.clear();
                CsConfigMeta.resetLastScan();
                configCreatePulseAnim.setDuration(1);
                configCreatePulseAnim.show();
                configCreatePulseAnim.getProgress();
                configCreatePulseAnim.setDuration(280);
                configCreatePulseAnim.hide();
            }
            return true;
        }

        float listHeaderH = 30f;
        float listHeaderY = contentY + headerH + 12f;
        float listY = listHeaderY + listHeaderH;
        float listH = contentH - (listY - contentY);
        if (mouseY < listY || mouseY > listY + listH) return false;

        float cardH = 68f;
        float cardGap = 7f;
        ConfigStorage storage = Nexis.getInstance().getConfigStorage();
        java.util.List<Config> configs = storage != null ? storage.getConfigs() : List.of();
        for (int i = 0; i < configs.size(); i++) {
            Config cfg = configs.get(i);
            float cy = listY + i * (cardH + cardGap) - configScrollOffset;
            if (mouseY < cy || mouseY > cy + cardH) continue;
            if (mouseX < contentX || mouseX > contentX + contentW) continue;

            float btnSize = 28f;
            float btnGap = 6f;
            float btnY = cy + (cardH - btnSize) / 2f;
            float loadW = 86f;
            float loadX = contentX + contentW - 14f - loadW;
            float refreshX = loadX - btnGap - btnSize;
            float delX = refreshX - btnGap - btnSize;

            if (mouseX >= loadX && mouseX <= loadX + loadW && mouseY >= btnY && mouseY <= btnY + btnSize) {
                if (storage != null) storage.loadConfiguration(cfg.getName());
                return true;
            }
            if (mouseX >= refreshX && mouseX <= refreshX + btnSize && mouseY >= btnY && mouseY <= btnY + btnSize) {
                ConfigStorage.saveConfiguration(cfg.getName());
                CsConfigMeta.CACHE.remove(cfg.getName());
                CsConfigMeta.resetLastScan();
                return true;
            }
            if (mouseX >= delX && mouseX <= delX + btnSize && mouseY >= btnY && mouseY <= btnY + btnSize) {
                if (storage != null) storage.deleteConfiguration(cfg.getName());
                CsConfigMeta.CACHE.remove(cfg.getName());
                configCardAppearAnims.remove(cfg.getName());
                configCardAnims.remove(cfg.getName());
                configDelBtnAnims.remove(cfg.getName());
                configRefreshBtnAnims.remove(cfg.getName());
                configLoadBtnAnims.remove(cfg.getName());
                return true;
            }
            return true;
        }
        return false;
    }

    private void renderIrcChat(Renderer2D r, float sx, float sy, float alphaProgress) {
        if (ircEnterCategoryTime == 0) ircEnterCategoryTime = System.currentTimeMillis();
        ircHeaderFadeAnim.show();

        float miniW = 225f;
        float areaX = sx + miniW + 2f;
        float areaY = sy + 75f + 2f;
        float areaW = PANEL_WIDTH - miniW - 2f;
        float areaH = PANEL_HEIGHT - 75f - 2f;
        float pad = 14f;
        float contentX = areaX + pad;
        float contentY = areaY + pad;
        float contentW = areaW - pad * 2f;
        float contentH = areaH - pad * 2f;

        int alpha = (int) (255 * alphaProgress);
        int textCol = ColorUtils.rgba(220, 220, 225, alpha);
        int dimCol = ColorUtils.rgba(160, 160, 165, alpha);
        int accent = ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alphaProgress);

        int mx = scaledMouseX();
        int my = scaledMouseY();

        renderIrcHeader(r, contentX, contentY, contentW, alphaProgress, textCol, dimCol);

        float headerH = 44f;
        float bodyY = contentY + headerH;
        float bodyH = contentH - headerH;

        float wrappedLineCount = ircCountInputLines(contentW - 80f);
        float lineH = FontRegistry.SF_MEDIUM.getLineHeight(15f);
        float dynamicInputH = Math.min(110f, 44f + Math.max(0f, wrappedLineCount - 1) * lineH);
        float inputBlockH = dynamicInputH + 6f;
        float msgAreaY = bodyY;
        float msgAreaH = bodyH - inputBlockH - 8f;

        renderIrcMessageArea(r, contentX, msgAreaY, contentW, msgAreaH, alphaProgress);

        float inputY = bodyY + bodyH - dynamicInputH;
        renderIrcInputBar(r, contentX, inputY, contentW, dynamicInputH, mx, my, alphaProgress);
    }

    private void renderIrcHeader(Renderer2D r, float x, float y, float w, float alphaProgress, int textCol, int dimCol) {
        float headerP = ircHeaderFadeAnim.getProgress();
        long elapsed = System.currentTimeMillis() - ircEnterCategoryTime;
        float titleSlide = (1f - headerP) * 10f;
        int titleAlpha = (int) (255 * alphaProgress * headerP);

        r.text(FontRegistry.SF_SEMIBOLD, x + 2f - titleSlide, y + 11f, 18f, "IRC Chat", ColorUtils.rgba(230, 230, 235, titleAlpha));

        fun.nexisdlc.client.utils.irc.IRCManager mgr = fun.nexisdlc.client.utils.irc.IRCManager.getInstance();
        boolean connected = mgr != null && mgr.isConnected();
        int msgCount = mgr != null ? mgr.getMessages().size() : 0;
        String sub = connected ? (msgCount + " сообщ.") : "не подключено";
        r.text(FontRegistry.SF_MEDIUM, x + 2f - titleSlide, y + 31f, 12.5f, sub, ColorUtils.rgba(130, 130, 135, titleAlpha));

        float dotSize = 8f;
        float dotX = x + w - dotSize - 4f;
        float dotY = y + 16f;
        if (connected) ircConnectionPulseAnim.show();
        else ircConnectionPulseAnim.hide();
        float pulseP = (float) (Math.sin(System.currentTimeMillis() / 600.0) * 0.5 + 0.5);
        int dotCol = connected
                ? ColorUtils.rgba(80, 220, 120, (int) ((180 + 75 * pulseP) * alphaProgress * headerP))
                : ColorUtils.rgba(220, 80, 80, (int) (200 * alphaProgress * headerP));
        r.rect(dotX, dotY, dotSize, dotSize, dotSize / 2f, dotCol);
        if (connected) {
            int glow = ColorUtils.rgba(80, 220, 120, (int) (90 * pulseP * alphaProgress * headerP));
            r.rect(dotX - 3f, dotY - 3f, dotSize + 6f, dotSize + 6f, (dotSize + 6f) / 2f, glow);
        }
        String status = connected ? "Вы подключены" : "Вы отключены";
        float statW = FontRegistry.SF_MEDIUM.getWidth(status, 11f);
        r.text(FontRegistry.SF_MEDIUM, dotX - statW - 6f, dotY + dotSize / 2f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'H', 11f), 11f, status, ColorUtils.rgba(160, 160, 165, titleAlpha));

        float lineY = y + 44f - 1f;
        float fadeIn = Math.min(1f, elapsed / 500f);
        int lineCol = ColorUtils.rgba(255, 255, 255, (int) (14 * alphaProgress * fadeIn));
        r.rect(x, lineY, w, 1f, lineCol);
    }

    private void renderIrcMessageArea(Renderer2D r, float x, float y, float w, float h, float alphaProgress) {
        float totalH = calculateIrcMessagesTotalHeight(w);
        boolean hasSb = totalH > h;

        fun.nexisdlc.client.utils.irc.IRCManager mgr = fun.nexisdlc.client.utils.irc.IRCManager.getInstance();
        java.util.List<fun.nexisdlc.client.utils.irc.IRCMessage> msgs = mgr != null ? mgr.getMessages() : java.util.List.of();
        if (msgs.size() > ircPrevMessageCount) {
            ircNewMsgCount = msgs.size() - ircPrevMessageCount;
            ircLastMessageTime = System.currentTimeMillis();
            ircAutoScroll = true;
        }
        if (System.currentTimeMillis() - ircLastMessageTime > 400) ircNewMsgCount = 0;
        ircPrevMessageCount = msgs.size();

        if (ircAutoScroll) {
            ircTargetScrollY = Math.max(0, totalH - h);
        }

        r.pushClipRect((int) x, (int) y - 4, (int) w + 1, (int) h + 8);
        renderIrcChatMessages(r, x, y, w, h, alphaProgress);
        r.popClipRect();

        if (hasSb) ircScrollbarFadeAnim.show();
        else ircScrollbarFadeAnim.hide();
        float sbP = ircScrollbarFadeAnim.getProgress() * alphaProgress;
        if (hasSb && sbP > 0.01f) {
            float sbX = x + w - 4f;
            float sbY = y + 4f;
            float sbH = h - 8f;
            r.rect(sbX, sbY, 2.5f, sbH, 1.25f, ColorUtils.rgba(255, 255, 255, (int) (10 * sbP)));
            float vis = Math.min(1f, h / totalH);
            float thumbH = Math.max(20f, sbH * vis);
            float maxScrollSb = totalH - h;
            float prog = (float) (maxScrollSb > 0 ? ircScrollY / maxScrollSb : 0);
            float thumbY = sbY + (sbH - thumbH) * Math.max(0f, Math.min(1f, prog));
            r.rect(sbX, thumbY, 2.5f, thumbH, 1.25f, ColorUtils.rgba(255, 255, 255, (int) (70 * sbP)));
            sbIrc.set(sbX, sbY, 2.5f, sbH, thumbY, thumbH, totalH, h);
        } else {
            sbIrc.clear();
        }

        float maxScroll = Math.max(0, totalH - h);
        ircTargetScrollY = Math.max(0, Math.min(ircTargetScrollY, maxScroll));
        float speed = ircAutoScroll ? 0.4f : 0.15f;
        ircScrollY += (ircTargetScrollY - ircScrollY) * speed;
        if (Math.abs(ircTargetScrollY - ircScrollY) < 0.4) ircScrollY = ircTargetScrollY;
    }

    private void renderIrcInputBar(Renderer2D r, float x, float y, float w, float h, int mx, int my, float alphaProgress) {
        int alpha = (int) (255 * alphaProgress);
        float sendW = 44f;
        float gap = 6f;
        float fieldX = x;
        float fieldW = w - sendW - gap;

        boolean fieldHov = mx >= fieldX && mx <= fieldX + fieldW && my >= y && my <= y + h;
        if (ircInput.isFocused() || fieldHov) ircInputFocusAnim.show();
        else ircInputFocusAnim.hide();
        float focusP = ircInputFocusAnim.getProgress();
        float pulseP = ircSendPulseAnim.getProgress();

        r.rect(fieldX, y, fieldW, h, 11f, ColorUtils.rgba(0, 0, 0, (int) (110 * alphaProgress)));
        int fieldBgA = (int) ((6 + 4 * focusP + 10 * pulseP) * alphaProgress);
        r.rect(fieldX, y, fieldW, h, 11f, ColorUtils.rgba(255, 255, 255, fieldBgA));
        ircInput.render(r, fieldX, y, fieldW, h, alphaProgress);

        float sendX = x + w - sendW;
        boolean sendHov = mx >= sendX && mx <= sendX + sendW && my >= y && my <= y + h;
        fun.nexisdlc.client.utils.irc.IRCManager mgr = fun.nexisdlc.client.utils.irc.IRCManager.getInstance();
        boolean connected = mgr != null && mgr.isConnected();
        boolean canSend = !ircInput.getText().trim().isEmpty() && connected;
        if (canSend) ircSendActiveAnim.show();
        else ircSendActiveAnim.hide();
        ircSendActiveAnim.setEasing(Easings.EASE_OUT_QUART);
        float activeP = ircSendActiveAnim.getProgress();
        if (sendHov && canSend) ircSendHoverAnim.show();
        else ircSendHoverAnim.hide();
        float sendP = ircSendHoverAnim.getProgress();
        int accentR = (ClientColors.ICON.getRGB() >> 16) & 0xFF;
        int accentG = (ClientColors.ICON.getRGB() >> 8) & 0xFF;
        int accentB = ClientColors.ICON.getRGB() & 0xFF;
        int idleBg = ColorUtils.rgba(255, 255, 255, (int) (10 * alphaProgress));
        int activeBg = ColorUtils.rgba(accentR, accentG, accentB, (int) ((30 + 24 * sendP + 18 * pulseP) * alphaProgress));
        int sendBg = ColorUtils.interpolate(idleBg, activeBg, activeP);
        r.rect(sendX, y, sendW, h, 11f, sendBg);
        float scaleP = 0.92f + 0.08f * activeP + 0.04f * sendP;
        int idleArrowCol = ColorUtils.rgba(140, 140, 145, alpha);
        int activeArrowCol = ColorUtils.rgba(255, 255, 255, alpha);
        int arrowCol = ColorUtils.interpolate(idleArrowCol, activeArrowCol, activeP);
        float arrowSize = 17f * scaleP;
        String arrowChar = ">";
        float arrowW = FontRegistry.SF_SEMIBOLD.getWidth(arrowChar, arrowSize);
        float arrowX = sendX + (sendW - arrowW) / 2f;
        float arrowY = y + h / 2f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', arrowSize);
        r.text(FontRegistry.SF_SEMIBOLD, arrowX, arrowY, arrowSize, arrowChar, arrowCol);
    }

    private float calculateIrcMessagesTotalHeight(float width) {
        fun.nexisdlc.client.utils.irc.IRCManager mgr = fun.nexisdlc.client.utils.irc.IRCManager.getInstance();
        java.util.List<fun.nexisdlc.client.utils.irc.IRCMessage> msgs = mgr != null ? mgr.getMessages() : java.util.List.of();
        if (msgs.isEmpty()) return 0;
        float msgGap = 10f;
        float total = 0;
        for (fun.nexisdlc.client.utils.irc.IRCMessage msg : msgs) {
            IrcBubbleLayout layout = getIrcBubbleLayout(msg, width);
            total += layout.bubbleH + msgGap;
        }
        return total;
    }

    private IrcBubbleLayout getIrcBubbleLayout(fun.nexisdlc.client.utils.irc.IRCMessage msg, float chatW) {
        if (ircBubbleCacheWidth != chatW) {
            ircBubbleCache.clear();
            ircBubbleCacheWidth = chatW;
        }
        String key = System.identityHashCode(msg) + ":" + (msg.getMessage() == null ? 0 : msg.getMessage().length());
        IrcBubbleLayout cached = ircBubbleCache.get(key);
        if (cached != null) return cached;

        float nameSize = 11f;
        float contentSize = 13.5f;
        float bubblePadX = 14f;
        float bubblePadY = 10f;
        float nameContentGap = 4f;
        float timeFontSize = 11.5f;
        float footerGap = 4f;
        float footerH = FontRegistry.SF_MEDIUM.getLineHeight(timeFontSize);
        float outerPadX = 14f;
        float avatarSize = 28f;
        float avatarGap = 8f;
        float availableBubbleW = chatW - outerPadX * 2f - avatarSize - avatarGap;
        float maxBubbleW = Math.min(chatW * 0.95f, Math.max(80f, availableBubbleW));
        float textMaxW = maxBubbleW - bubblePadX * 2f;

        java.util.List<String> wrapped = wrapText(msg.getMessage() == null ? "" : msg.getMessage(), textMaxW, contentSize);
        int lineCount = Math.max(1, wrapped.size());
        float lineH = FontRegistry.SF_MEDIUM.getLineHeight(contentSize);
        float textBlockH = lineCount * lineH + (lineCount - 1) * 2f;

        float maxLineW = 0f;
        for (String ln : wrapped) {
            float lw = FontRegistry.SF_MEDIUM.getWidth(ln, contentSize);
            if (lw > maxLineW) maxLineW = lw;
        }

        String userName = msg.getUsername() == null ? "User" : msg.getUsername();
        String roleStr = msg.getRole() == null ? "" : msg.getRole();
        float nameWPx = FontRegistry.SF_SEMIBOLD.getWidth(userName, nameSize);
        float roleWPx = roleStr.isEmpty() ? 0f : FontRegistry.SF_SEMIBOLD.getWidth(roleStr.toUpperCase(), nameSize);
        float headerLineW = nameWPx + (roleStr.isEmpty() ? 0f : 14f + roleWPx);
        float minContentW = Math.max(maxLineW, headerLineW) + bubblePadX * 2f;

        float nameH = FontRegistry.SF_MEDIUM.getLineHeight(nameSize);
        float bubbleW = Math.min(maxBubbleW, Math.max(minContentW, 280f));
        float bubbleH = nameH + nameContentGap + textBlockH + bubblePadY * 2f + footerGap;

        IrcBubbleLayout layout = new IrcBubbleLayout(wrapped, maxLineW, bubbleW, bubbleH);
        ircBubbleCache.put(key, layout);
        if (ircBubbleCache.size() > 256) {
            java.util.Iterator<String> it = ircBubbleCache.keySet().iterator();
            while (ircBubbleCache.size() > 200 && it.hasNext()) {
                it.next();
                it.remove();
            }
        }
        return layout;
    }

    private void renderIrcChatMessages(Renderer2D r, float x, float y, float w, float h, float alphaProgress) {
        ircLineRects.clear();
        float scrollY = y - (float) ircScrollY;
        float msgGap = 10f;
        float padX = 14f;
        float bubblePadX = 14f;
        float bubblePadY = 10f;
        float nameSize = 14f;
        float contentSize = 13.5f;
        float nameContentGap = 4f;
        float avatarSize = 28f;
        float avatarGap = 8f;
        int accentColor = ClientColors.ICON.getRGB();
        int accentR = (accentColor >> 16) & 0xFF;
        int accentG = (accentColor >> 8) & 0xFF;
        int accentB = accentColor & 0xFF;

        int alpha = (int) (255 * alphaProgress);

        long now = System.currentTimeMillis();
        long elapsed = now - ircLastMessageTime;
        fun.nexisdlc.client.utils.irc.IRCManager mgr = fun.nexisdlc.client.utils.irc.IRCManager.getInstance();
        java.util.List<fun.nexisdlc.client.utils.irc.IRCMessage> activeMessages = mgr != null ? mgr.getMessages() : java.util.List.of();
        int totalMsgCount = activeMessages.size();
        String selfUsername = fun.nexisdlc.ClientContainer.getUser();
        if (selfUsername == null) selfUsername = "";

        for (int idx = 0; idx < activeMessages.size(); idx++) {
            fun.nexisdlc.client.utils.irc.IRCMessage msg = activeMessages.get(idx);
            boolean isUser = !selfUsername.isEmpty() && msg.getUsername() != null && selfUsername.equalsIgnoreCase(msg.getUsername());

            IrcBubbleLayout layout = getIrcBubbleLayout(msg, w);
            float bubbleW = layout.bubbleW;
            float bubbleH = layout.bubbleH;
            java.util.List<String> wrappedLines = layout.wrappedLines;

            float msgAnim = 1f;
            float msgSlideY = 0f;
            float msgSlideX = 0f;
            if (ircNewMsgCount > 0 && idx >= totalMsgCount - ircNewMsgCount) {
                int newIdx = idx - (totalMsgCount - ircNewMsgCount);
                float delay = newIdx * 70f;
                float p = Math.max(0f, Math.min(1f, (elapsed - delay) / 260f));
                float eased = 1f - (float) Math.pow(1f - p, 3);
                msgAnim = eased;
                msgSlideY = (1f - eased) * 12f;
                msgSlideX = (1f - eased) * (isUser ? 14f : -14f);
            }
            int msgAlpha = (int) (alpha * msgAnim);

            float lineH = FontRegistry.SF_MEDIUM.getLineHeight(contentSize);
            float nameH = FontRegistry.SF_MEDIUM.getLineHeight(nameSize);
            float timeFontSize = 11.5f;
            float footerGap = 4f;
            float footerH = FontRegistry.SF_MEDIUM.getLineHeight(timeFontSize);

            Identifier avatarFrame = getAvatar();
            boolean hasAvatar = avatarFrame != null;

            float drawX;
            float avatarX = 0;
            float avatarY = 0;
            float drawY = scrollY + msgSlideY;

            if (isUser) {
                drawX = x + w - bubbleW - padX - (hasAvatar ? avatarSize + avatarGap : 0);
                if (hasAvatar) {
                    avatarX = x + w - padX - avatarSize;
                    avatarY = drawY + bubblePadY;
                }
            } else {
                drawX = x + padX + (hasAvatar ? avatarSize + avatarGap : 0);
                if (hasAvatar) {
                    avatarX = x + padX;
                    avatarY = drawY + bubblePadY;
                }
            }
            drawX += msgSlideX;
            avatarX += msgSlideX;

            if (hasAvatar && drawY + bubbleH > y - 4f && drawY < y + h + 4f) {
                int avatarAlpha = (int) (255 * alphaProgress * msgAnim);
                int avatarColor = ColorUtils.rgba(255, 255, 255, avatarAlpha);
                r.drawTextureRounded(avatarFrame, avatarX, avatarY, avatarSize, avatarSize, avatarColor, 6f);
            }

            if (drawY + bubbleH > y - 4f && drawY < y + h + 4f) {
                float radius = 14f;
                int bubbleBg = isUser
                        ? ColorUtils.rgba(accentR, accentG, accentB, (int) (22 * alphaProgress * msgAnim))
                        : ColorUtils.rgba(255, 255, 255, (int) (16 * alphaProgress * msgAnim));
                r.rect(drawX, drawY, bubbleW, bubbleH, radius, bubbleBg);

                String name = (msg.getUsername() == null ? "User" : msg.getUsername());
                int nameColor = isUser
                        ? ColorUtils.rgba(accentR, accentG, accentB, msgAlpha)
                        : ColorUtils.rgba(190, 190, 195, msgAlpha);
                float nameCY = drawY + bubblePadY + nameH * 0.5f;
                float nameBaseline = nameCY + FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'H', nameSize);
                r.text(FontRegistry.SF_MEDIUM, drawX + bubblePadX, nameBaseline, nameSize, name, nameColor);

                String roleRaw = msg.getRole() == null ? "" : msg.getRole();
                if (!roleRaw.isEmpty()) {
                    int roleCol = getIrcRoleColor(roleRaw, msgAlpha);
                    String roleChanged = getIrcRoleText(roleRaw);
                    float roleW = FontRegistry.SF_MEDIUM.getWidth(roleChanged, nameSize);
                    r.text(FontRegistry.SF_MEDIUM, drawX + bubbleW - bubblePadX - roleW, nameBaseline, nameSize, roleChanged, roleCol);
                }

                int textColMsg = ColorUtils.rgba(225, 225, 230, msgAlpha);
                float ly = drawY + bubblePadY + nameH + nameContentGap;
                int globalOffset = 0;
                for (int li = 0; li < wrappedLines.size(); li++) {
                    String ln = wrappedLines.get(li);
                    float lineCY = ly + lineH * 0.5f;
                    float lb = lineCY + FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'H', contentSize);
                    float lineW = FontRegistry.SF_MEDIUM.getWidth(ln, contentSize);
                    float lineRectX = drawX + bubblePadX;
                    float lineRectY = ly;
                    ircLineRects.add(new IrcMsgLineRect(idx, li, lineRectX, lineRectY, Math.max(lineW, 8f), lineH, ln, contentSize, globalOffset));

                    if (ircSelMessageIndex == idx) {
                        int sl = Math.min(ircSelStartLine, ircSelEndLine);
                        int el = Math.max(ircSelStartLine, ircSelEndLine);
                        boolean ascending = ircSelStartLine < ircSelEndLine
                                || (ircSelStartLine == ircSelEndLine && ircSelStartPos <= ircSelEndPos);
                        int sp = ascending ? ircSelStartPos : ircSelEndPos;
                        int ep = ascending ? ircSelEndPos : ircSelStartPos;
                        if (li >= sl && li <= el) {
                            int from = (li == sl) ? Math.max(0, Math.min(sp, ln.length())) : 0;
                            int to = (li == el) ? Math.max(from, Math.min(ep, ln.length())) : ln.length();
                            if (to > from) {
                                float xs = lineRectX + FontRegistry.SF_MEDIUM.getWidth(ln.substring(0, from), contentSize);
                                float xe = lineRectX + FontRegistry.SF_MEDIUM.getWidth(ln.substring(0, to), contentSize);
                                int selBg = ColorUtils.rgba(120, 160, 255, (int) (90 * alphaProgress * msgAnim));
                                r.rect(xs - 1f, lineRectY + 1f, Math.max(2f, xe - xs + 2f), lineH - 2f, 0f, selBg);
                            }
                        }
                    }

                    r.text(FontRegistry.SF_MEDIUM, lineRectX, lb, contentSize, ln, textColMsg);
                    ly += lineH + 2f;
                    globalOffset += ln.length() + 1;
                }

                String timeStrFooter = formatIrcTime(msg.getTimestamp());
                float timeFW = FontRegistry.SF_MEDIUM.getWidth(timeStrFooter, timeFontSize);
                float footerY = drawY + bubbleH - bubblePadY - footerH;
                float footerBaseline = footerY + footerH * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'H', timeFontSize);
                int footerCol = ColorUtils.rgba(125, 125, 130, (int) (msgAlpha * 0.85f));
                r.text(FontRegistry.SF_MEDIUM, drawX + bubbleW - bubblePadX - timeFW, footerBaseline, timeFontSize, timeStrFooter, footerCol);
            }
            scrollY += bubbleH + msgGap;
        }
    }

    private int getIrcRoleColor(String role, int alpha) {
        if (role == null) return ColorUtils.rgba(160, 160, 165, alpha);
        String r = role.toLowerCase(Locale.US);
        switch (r) {
            case "owner":
                return ColorUtils.rgba(212, 47, 47, alpha);
            case "admin":
                return ColorUtils.rgba(214, 84, 58, alpha);
            case "developer":
            case "dev":
                return ColorUtils.rgba(120, 180, 255, alpha);
            case "media":
                return ColorUtils.rgba(230, 100, 180, alpha);
            case "moderator":
            case "mod":
                return ColorUtils.rgba(100, 220, 140, alpha);
            case "vip":
                return ColorUtils.rgba(180, 130, 255, alpha);
            case "premium":
                return ColorUtils.rgba(255, 165, 80, alpha);
            case "bot":
                return ColorUtils.rgba(150, 150, 160, alpha);
            case "banned":
                return ColorUtils.rgba(255, 0, 0, alpha);
            default:
                return ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alpha / 255f);
        }
    }


    private String getIrcRoleText(String role) {
        if (role == null) return "Неизвестно";
        String r = role.toLowerCase(Locale.US);
        switch (r) {
            case "owner":
                return "Разработчик";
            case "admin":
                return "Разработчик";
            case "developer":
            case "manager":
                return "Разработчик";
            case "dev":
                return "Разработчик";
            case "media":
                return "Медиа";
            case "banned":
                return "Заблокирован";
            case "beta":
                return "Тестировщик";
            case "user":
                return "Пользователь";
            default:
                return "Пользователь";
        }
    }


    private String formatIrcTime(String iso) {
        if (iso == null || iso.isEmpty()) {
            return java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss").format(java.time.LocalTime.now());
        }
        try {
            java.time.Instant inst = java.time.Instant.parse(iso);
            return java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss").withZone(java.time.ZoneId.systemDefault()).format(inst);
        } catch (Exception ignored) {
            return iso.length() > 8 ? iso.substring(0, 8) : iso;
        }
    }

    private float ircCountInputLines(float maxWidth) {
        String t = ircInput.getText();
        if (t.isEmpty()) return 1f;
        return ircInput.getWrappedLineCount(Math.max(0f, maxWidth - 24f));
    }

    private void scrollIrcToBottom() {
        float miniW = 225f;
        float pad = 14f;
        float contentW = PANEL_WIDTH - miniW - 2f - pad * 2f;
        float bodyH = (PANEL_HEIGHT - 75f - 2f - pad * 2f) - 44f;
        float msgAreaH = bodyH - 44f - 8f;
        float totalMsgH = calculateIrcMessagesTotalHeight(contentW);
        float maxScroll = Math.max(0, totalMsgH - msgAreaH);
        ircTargetScrollY = maxScroll;
        ircScrollY = maxScroll;
    }

    private void sendIrcMessage() {
        String text = ircInput.getText().trim();
        if (text.isEmpty()) return;
        fun.nexisdlc.client.utils.irc.IRCManager mgr = fun.nexisdlc.client.utils.irc.IRCManager.getInstance();
        if (mgr == null || !mgr.isConnected()) return;
        mgr.sendMessage(text);
        ircInput.setText("");
        ircInput.blur();
        ircSendPulseAnim.setDuration(1);
        ircSendPulseAnim.show();
        ircSendPulseAnim.getProgress();
        ircSendPulseAnim.setDuration(180);
        ircSendPulseAnim.hide();
        scrollIrcToBottom();
    }

    private boolean handleIrcChatClicked(double mouseX, double mouseY, int button) {
        if (button != 0) return false;
        float fbW = mc.getWindow().getFramebufferWidth();
        float fbH = mc.getWindow().getFramebufferHeight();
        float sx = (fbW - PANEL_WIDTH) / 2f;
        float sy = (fbH - PANEL_HEIGHT) / 2f;
        float pad = 14f;
        float contentX = sx + 225f + 2f + pad;
        float contentY = sy + 75f + 2f + pad;
        float contentW = PANEL_WIDTH - 225f - 2f - pad * 2f;
        float contentH = PANEL_HEIGHT - 75f - 2f - pad * 2f;

        float headerH = 44f;
        float bodyY = contentY + headerH;
        float bodyH = contentH - headerH;

        float wrappedLineCount = ircCountInputLines(contentW - 80f);
        float lineH = FontRegistry.SF_MEDIUM.getLineHeight(15f);
        float dynamicInputH = Math.min(110f, 44f + Math.max(0f, wrappedLineCount - 1) * lineH);
        float inputY = bodyY + bodyH - dynamicInputH;

        float sendW = 44f;
        float gap = 6f;
        float fieldX = contentX;
        float fieldW = contentW - sendW - gap;
        float sendX = contentX + contentW - sendW;

        if (mouseX >= sendX && mouseX <= sendX + sendW && mouseY >= inputY && mouseY <= inputY + dynamicInputH) {
            sendIrcMessage();
            return true;
        }
        if (ircInput.mouseClicked(mouseX, mouseY, button, fieldX, inputY, fieldW, dynamicInputH)) {
            clearIrcMessageSelection();
            return true;
        }

        if (button == 0 && handleIrcMessageClick(mouseX, mouseY)) {
            return true;
        }
        return false;
    }

    private boolean handleIrcMessageClick(double mouseX, double mouseY) {
        for (IrcMsgLineRect rect : ircLineRects) {
            if (mouseX >= rect.x - 2 && mouseX <= rect.x + rect.w + 2
                    && mouseY >= rect.y - 2 && mouseY <= rect.y + rect.h + 2) {
                ircSelMessageIndex = rect.msgIndex;
                ircSelStartLine = rect.lineIndex;
                ircSelEndLine = rect.lineIndex;
                ircSelStartPos = ircCharIndexInLine(rect, mouseX);
                ircSelEndPos = ircSelStartPos;
                ircMsgSelectionDragging = true;
                return true;
            }
        }
        clearIrcMessageSelection();
        return false;
    }

    private int ircCharIndexInLine(IrcMsgLineRect rect, double mx) {
        float rel = (float) (mx - rect.x);
        if (rel <= 0) return 0;
        if (rect.text == null || rect.text.isEmpty()) return 0;
        float cum = 0f;
        for (int i = 0; i < rect.text.length(); i++) {
            float cw = FontRegistry.SF_MEDIUM.getWidth(rect.text.substring(i, i + 1), rect.fontSize);
            if (rel < cum + cw * 0.5f) return i;
            cum += cw;
        }
        return rect.text.length();
    }

    private void updateIrcMessageSelection(double mx, double my) {
        if (!ircMsgSelectionDragging || ircSelMessageIndex < 0) return;
        int posMsg = -1, posLine = -1, posChar = 0;
        for (IrcMsgLineRect rect : ircLineRects) {
            if (rect.msgIndex != ircSelMessageIndex) continue;
            if (my >= rect.y - 4 && my <= rect.y + rect.h + 4) {
                posMsg = rect.msgIndex;
                posLine = rect.lineIndex;
                posChar = ircCharIndexInLine(rect, mx);
                break;
            }
        }
        if (posMsg < 0) {
            IrcMsgLineRect closest = null;
            double bestDy = Double.MAX_VALUE;
            for (IrcMsgLineRect rect : ircLineRects) {
                if (rect.msgIndex != ircSelMessageIndex) continue;
                double centerY = rect.y + rect.h * 0.5;
                double dy = Math.abs(my - centerY);
                if (dy < bestDy) {
                    bestDy = dy;
                    closest = rect;
                }
            }
            if (closest == null) return;
            posLine = closest.lineIndex;
            posChar = my < closest.y ? 0 : closest.text.length();
            if (mx >= closest.x) posChar = ircCharIndexInLine(closest, mx);
        }
        ircSelEndLine = posLine;
        ircSelEndPos = posChar;
    }

    private void clearIrcMessageSelection() {
        ircSelMessageIndex = -1;
        ircSelStartLine = -1;
        ircSelEndLine = -1;
        ircSelStartPos = -1;
        ircSelEndPos = -1;
        ircMsgSelectionDragging = false;
    }

    private String getIrcSelectionText() {
        if (ircSelMessageIndex < 0 || ircSelStartLine < 0 || ircSelEndLine < 0) return "";
        int sl = Math.min(ircSelStartLine, ircSelEndLine);
        int el = Math.max(ircSelStartLine, ircSelEndLine);
        int sp, ep;
        if (ircSelStartLine < ircSelEndLine || (ircSelStartLine == ircSelEndLine && ircSelStartPos <= ircSelEndPos)) {
            sp = ircSelStartPos;
            ep = ircSelEndPos;
        } else {
            sp = ircSelEndPos;
            ep = ircSelStartPos;
        }
        StringBuilder sb = new StringBuilder();
        for (IrcMsgLineRect rect : ircLineRects) {
            if (rect.msgIndex != ircSelMessageIndex) continue;
            if (rect.lineIndex < sl || rect.lineIndex > el) continue;
            String t = rect.text == null ? "" : rect.text;
            int from = (rect.lineIndex == sl) ? Math.max(0, Math.min(sp, t.length())) : 0;
            int to = (rect.lineIndex == el) ? Math.max(from, Math.min(ep, t.length())) : t.length();
            if (sb.length() > 0) sb.append('\n');
            sb.append(t, from, to);
        }
        return sb.toString();
    }

    private void renderAiChat(Renderer2D r, float sx, float sy, float alphaProgress) {
        if (aiEnterCategoryTime == 0) aiEnterCategoryTime = System.currentTimeMillis();
        aiHeaderFadeAnim.show();

        float miniW = 225f;
        float areaX = sx + miniW + 2f;
        float areaY = sy + 75f + 2f;
        float areaW = PANEL_WIDTH - miniW - 2f;
        float areaH = PANEL_HEIGHT - 75f - 2f;
        float pad = 14f;
        float contentX = areaX + pad;
        float contentY = areaY + pad;
        float contentW = areaW - pad * 2f;
        float contentH = areaH - pad * 2f;

        int alpha = (int) (255 * alphaProgress);
        int textCol = ColorUtils.rgba(220, 220, 225, alpha);
        int dimCol = ColorUtils.rgba(160, 160, 165, alpha);
        int descCol = ColorUtils.rgba(120, 120, 125, alpha);
        int accent = ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alphaProgress);

        int mx = scaledMouseX();
        int my = scaledMouseY();

        renderAiHeader(r, contentX, contentY, contentW, mx, my, alphaProgress, textCol, dimCol, accent);

        aiSidebarSlideAnim.setEasing(Easings.EASE_OUT_QUART);
        float sidebarP = aiSidebarSlideAnim.getProgress();
        float sidebarW = AI_SIDEBAR_W * sidebarP;
        float sidebarGap = 10f * sidebarP;

        float bodyY = contentY + AI_HEADER_H;
        float bodyH = contentH - AI_HEADER_H;

        float chatX = contentX + sidebarW + sidebarGap;
        float chatW = contentW - sidebarW - sidebarGap;

        if (sidebarP > 0.01f) {
            renderAiSidebar(r, contentX, bodyY, sidebarW, bodyH, mx, my, alphaProgress, sidebarP);
        }

        boolean hasPreviews = !aiAttachedImages.isEmpty();
        if (hasPreviews) aiPreviewStripAnim.show();
        else aiPreviewStripAnim.hide();
        float previewP = aiPreviewStripAnim.getProgress();
        float previewStripH = AI_PREVIEW_STRIP_H * previewP;

        float wrappedLineCount = aiCountInputLines(chatW - 80f);
        float lineH = FontRegistry.SF_MEDIUM.getLineHeight(15f);
        float dynamicInputH = Math.min(AI_INPUT_MAX_H, AI_INPUT_BASE_H + Math.max(0f, wrappedLineCount - 1) * lineH);

        float creditsBlockH = AI_CREDITS_BAR_H + AI_CREDITS_BAR_GAP;
        float inputBlockH = previewStripH + dynamicInputH + creditsBlockH;
        float msgAreaY = bodyY;
        float msgAreaH = bodyH - inputBlockH - 8f;

        renderAiMessageArea(r, chatX, msgAreaY, chatW, msgAreaH, alphaProgress);

        float creditsY = bodyY + bodyH - AI_CREDITS_BAR_H;
        float inputY = creditsY - AI_CREDITS_BAR_GAP - dynamicInputH;
        if (previewP > 0.01f) {
            renderAiPreviewStrip(r, chatX, inputY - previewStripH - 6f, chatW, previewStripH, mx, my, alphaProgress, previewP);
        }
        renderAiInputBar(r, chatX, inputY, chatW, dynamicInputH, mx, my, alphaProgress);
        renderAiCreditsBar(r, chatX, creditsY, chatW, AI_CREDITS_BAR_H, alphaProgress);

    }

    private void renderAiHeader(Renderer2D r, float x, float y, float w, int mx, int my, float alphaProgress, int textCol, int dimCol, int accent) {
        float headerP = aiHeaderFadeAnim.getProgress();
        long elapsed = System.currentTimeMillis() - aiEnterCategoryTime;
        float titleSlide = (1f - headerP) * 10f;
        int titleAlpha = (int) (255 * alphaProgress * headerP);

        String chatName = AiManager.getCurrentSession().name;
        r.text(FontRegistry.SF_SEMIBOLD, x + 2f - titleSlide, y + 11f, 18f, chatName, ColorUtils.rgba(230, 230, 235, titleAlpha));

        int msgCount = AiManager.getCurrentSession().messages.size();
        String sub = msgCount == 0 ? "новый диалог" : msgCount + " сообщ.";
        r.text(FontRegistry.SF_MEDIUM, x + 2f - titleSlide, y + 31f, 12.5f, sub, ColorUtils.rgba(130, 130, 135, titleAlpha));

        float btnSize = 30f;
        float btnGap = 6f;
        float btnsRight = x + w;

        float listBtnX = btnsRight - btnSize;
        float listBtnY = y + 4f;
        renderAiHeaderButton(r, listBtnX, listBtnY, btnSize, mx, my, aiChatListBtnAnim, aiShowChatsList, alphaProgress);
        CsIcons.drawHamburgerOrClose(r, listBtnX, listBtnY, btnSize, aiShowChatsList, textCol);

        float newBtnX = listBtnX - btnGap - btnSize;
        float newBtnY = y + 4f;
        renderAiHeaderButton(r, newBtnX, newBtnY, btnSize, mx, my, aiNewChatBtnAnim, false, alphaProgress);
        CsIcons.drawPlusIcon(r, newBtnX, newBtnY, btnSize, textCol);

        float lineY = y + AI_HEADER_H - 1f;
        float fadeIn = Math.min(1f, elapsed / 500f);
        int lineCol = ColorUtils.rgba(255, 255, 255, (int) (14 * alphaProgress * fadeIn));
        r.rect(x, lineY, w, 1f, lineCol);
    }

    private void renderAiHeaderButton(Renderer2D r, float x, float y, float size, int mx, int my, SimpleLinearAnimation anim, boolean active, float alphaProgress) {
        boolean hovered = mx >= x && mx <= x + size && my >= y && my <= y + size;
        if (hovered) anim.show();
        else anim.hide();
        float t = anim.getProgress();
        int baseA = active ? 36 : (int) (10 + 22 * t);
        r.rect(x, y, size, size, 9f, ColorUtils.rgba(255, 255, 255, (int) (baseA * alphaProgress)));
        if (t > 0.01f) {
            int outlineCol = ColorUtils.rgba(255, 255, 255, (int) (40 * t * alphaProgress));
            r.rectOutline(x, y, size, size, 9f, outlineCol, 1f);
        }
    }

    private void renderAiSidebar(Renderer2D r, float x, float y, float w, float h, int mx, int my, float alphaProgress, float sidebarP) {
        int sidebarAlpha = (int) (Math.min(1f, sidebarP * 1.6f) * 255);
        int bgCol = ColorUtils.rgba(255, 255, 255, (int) (5 * alphaProgress * sidebarP));
        r.rect(x, y, w, h, 12f, bgCol);

        r.pushClipRect((int) x, (int) y, (int) w + 1, (int) h + 1);

        List<AiManager.ChatSession> sessions = AiManager.getGuiSessions();
        long elapsed = aiSidebarOpenTime > 0 ? System.currentTimeMillis() - aiSidebarOpenTime : 0;
        float curY = y + 6f - (float) aiChatsScrollY;
        float itemH = 46f;
        float itemGap = 5f;
        float nameSize = 13f;
        float previewSize = 10.5f;
        float innerPadX = 12f;
        float textGap = 4f;
        float nameLineH = FontRegistry.SF_MEDIUM.getLineHeight(nameSize);
        float previewLineH = FontRegistry.SF_MEDIUM.getLineHeight(previewSize);
        float textBlockH = nameLineH + textGap + previewLineH;

        for (int i = 0; i < sessions.size(); i++) {
            AiManager.ChatSession s = sessions.get(i);
            boolean isCurrent = (i == AiManager.getCurrentSessionIndex());
            boolean hovered = mx >= x + 4 && mx <= x + w - 4 && my >= curY && my <= curY + itemH;

            float itemAnim = 1f;
            if (aiShowChatsList && elapsed > 0) {
                float delay = i * 35f;
                itemAnim = Math.max(0f, Math.min(1f, (elapsed - delay) / 220f));
                itemAnim = 1f - (1f - itemAnim) * (1f - itemAnim);
            }
            int itemA = (int) (sidebarAlpha * itemAnim);
            if (itemA <= 1) {
                curY += itemH + itemGap;
                continue;
            }
            float slideX = (1f - itemAnim) * 12f;

            float ix = x + 4f - slideX;
            float iw = w - 8f + slideX;

            int itemBgA = isCurrent ? 30 : (hovered ? 16 : 7);
            int itemBg = ColorUtils.rgba(255, 255, 255, (int) (itemBgA * alphaProgress * itemAnim));
            r.rect(ix, curY, iw, itemH, 10f, itemBg);

            float accentBarW = 0f;
            if (isCurrent) {
                accentBarW = 3f;
                int accentCol = ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alphaProgress * itemAnim);
                r.rect(ix + 5f, curY + itemH / 2f - 11f, accentBarW, 22f, 1.5f, accentCol);
            }

            float dbW = 20f;
            boolean hasDelete = sessions.size() > 1;
            float rightReserve = hasDelete ? (dbW + 8f) : 6f;
            float leftPad = innerPadX + (isCurrent ? 6f : 0f);
            float textX = ix + leftPad;
            float textMaxW = iw - leftPad - rightReserve;

            float blockTopY = curY + (itemH - textBlockH) / 2f;
            float nameBaseline = blockTopY + nameLineH / 2f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', nameSize);
            float previewBaseline = blockTopY + nameLineH + textGap + previewLineH / 2f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'H', previewSize);

            String name = s.name;
            String trimmed = aiTrimToWidth(name, textMaxW, nameSize);
            int nameCol = isCurrent ? ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alphaProgress * itemAnim)
                    : ColorUtils.rgba(220, 220, 225, itemA);
            r.text(FontRegistry.SF_SEMIBOLD, textX, nameBaseline, nameSize, trimmed, nameCol);

            String preview = s.messages.isEmpty() ? "пусто" : aiTrimToWidth(s.messages.get(s.messages.size() - 1).content.replace('\n', ' '), textMaxW, previewSize);
            r.text(FontRegistry.SF_MEDIUM, textX, previewBaseline, previewSize, preview, ColorUtils.rgba(135, 135, 140, itemA));

            if (hasDelete) {
                float dbX = ix + iw - dbW - 6f;
                float dbY = curY + (itemH - dbW) / 2f;
                boolean dHov = mx >= dbX && mx <= dbX + dbW && my >= dbY && my <= dbY + dbW;
                int dBg = dHov ? ColorUtils.rgba(255, 85, 85, (int) (180 * itemAnim * alphaProgress))
                        : ColorUtils.rgba(255, 255, 255, (int) (14 * itemAnim * alphaProgress));
                r.rect(dbX, dbY, dbW, dbW, 6f, dBg);
                int xCol = dHov ? ColorUtils.rgba(255, 255, 255, itemA) : ColorUtils.rgba(185, 185, 190, itemA);
                float lL = 8f, tT = 1.6f;
                float dcx = dbX + dbW / 2f, dcy = dbY + dbW / 2f;
                r.rect(dcx - lL / 2f, dcy - tT / 2f, lL, tT, 1f, xCol);
                r.rect(dcx - tT / 2f, dcy - lL / 2f, tT, lL, 1f, xCol);
            }
            curY += itemH + itemGap;
        }
        r.popClipRect();

        float totalH = sessions.size() * (itemH + itemGap);
        float maxScroll = Math.max(0, totalH - h);
        aiChatsTargetScrollY = Math.max(0, Math.min(aiChatsTargetScrollY, maxScroll));
        aiChatsScrollY += (aiChatsTargetScrollY - aiChatsScrollY) * 0.18;
    }

    private void renderAiMessageArea(Renderer2D r, float x, float y, float w, float h, float alphaProgress) {
        float totalH = calculateAiMessagesTotalHeight(w);
        boolean hasSb = totalH > h;

        List<AiManager.ChatMessage> msgs = AiManager.getCurrentSession().messages;
        if (msgs.size() > aiPrevMessageCount) {
            aiNewMsgCount = msgs.size() - aiPrevMessageCount;
            aiLastMessageTime = System.currentTimeMillis();
            aiAutoScroll = true;
        }
        if (System.currentTimeMillis() - aiLastMessageTime > 400) aiNewMsgCount = 0;
        aiPrevMessageCount = msgs.size();

        if (aiAutoScroll) {
            aiTargetScrollY = Math.max(0, totalH - h);
        }

        r.pushClipRect((int) x, (int) y - 4, (int) w + 1, (int) h + 8);
        renderAiChatMessages(r, x, y, w, h, alphaProgress);
        r.popClipRect();

        if (aiWaitingForResponse) aiTypingAnim.show();
        else aiTypingAnim.hide();
        float typingP = aiTypingAnim.getProgress();
        if (typingP > 0.01f) {
            float capH = 26f;
            float labelSize = 10.5f;
            String label = "Nexis AI";
            float labelW = FontRegistry.SF_MEDIUM.getWidth(label, labelSize);
            float dotsW = 18f;
            float padXCap = 12f;
            float gapLD = 8f;
            float capW = padXCap * 2f + labelW + gapLD + dotsW;
            float capX = x + 10f;
            float capY = y + h - capH - 6f - (1f - typingP) * 6f;
            int tA = (int) (255 * alphaProgress * typingP);
            r.rect(capX, capY, capW, capH, capH * 0.5f, ColorUtils.rgba(255, 255, 255, (int) (16 * alphaProgress * typingP)));
            r.rectOutline(capX, capY, capW, capH, capH * 0.5f, ColorUtils.rgba(255, 255, 255, (int) (22 * alphaProgress * typingP)), 1f);
            float lblBaseline = capY + capH * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'H', labelSize);
            r.text(FontRegistry.SF_MEDIUM, capX + padXCap, lblBaseline, labelSize, label, ColorUtils.rgba(190, 190, 195, tA));
            long t = System.currentTimeMillis();
            float dotsX = capX + padXCap + labelW + gapLD;
            float dotsCY = capY + capH * 0.5f;
            for (int i = 0; i < 3; i++) {
                float ph = (float) (Math.sin((t + i * 180) / 200.0) * 0.5 + 0.5);
                int dotA = (int) (255 * alphaProgress * typingP * (0.35f + 0.65f * ph));
                float ds = 2.8f;
                r.rect(dotsX + i * 6f, dotsCY - ds * 0.5f, ds, ds, ds * 0.5f, ColorUtils.rgba(210, 210, 215, dotA));
            }
        }

        if (hasSb) aiScrollbarFadeAnim.show();
        else aiScrollbarFadeAnim.hide();
        float sbP = aiScrollbarFadeAnim.getProgress() * alphaProgress;
        if (hasSb && sbP > 0.01f) {
            float sbX = x + w - 4f;
            float sbY = y + 4f;
            float sbH = h - 8f;
            r.rect(sbX, sbY, 2.5f, sbH, 1.25f, ColorUtils.rgba(255, 255, 255, (int) (10 * sbP)));
            float vis = Math.min(1f, h / totalH);
            float thumbH = Math.max(20f, sbH * vis);
            float maxScrollSb = totalH - h;
            float prog = (float) (maxScrollSb > 0 ? aiScrollY / maxScrollSb : 0);
            float thumbY = sbY + (sbH - thumbH) * Math.max(0f, Math.min(1f, prog));
            r.rect(sbX, thumbY, 2.5f, thumbH, 1.25f, ColorUtils.rgba(255, 255, 255, (int) (70 * sbP)));
            sbAi.set(sbX, sbY, 2.5f, sbH, thumbY, thumbH, totalH, h);
        } else {
            sbAi.clear();
        }

        float maxScroll = Math.max(0, totalH - h);
        aiTargetScrollY = Math.max(0, Math.min(aiTargetScrollY, maxScroll));
        float speed = aiAutoScroll ? 0.4f : 0.15f;
        aiScrollY += (aiTargetScrollY - aiScrollY) * speed;
        if (Math.abs(aiTargetScrollY - aiScrollY) < 0.4) aiScrollY = aiTargetScrollY;
    }

    private void renderAiPreviewStrip(Renderer2D r, float x, float y, float w, float h, int mx, int my, float alphaProgress, float p) {
        int alpha = (int) (255 * alphaProgress * p);
        r.rect(x, y, w, h, 11f, ColorUtils.rgba(255, 255, 255, (int) (8 * alphaProgress * p)));

        float thumb = AI_PREVIEW_THUMB;
        float thumbY = y + (h - thumb) / 2f;
        float curX = x + 8f;
        float gap = 6f;

        for (int i = 0; i < aiAttachedImages.size(); i++) {
            byte[] bytes = aiAttachedImages.get(i);
            int previewId = i < aiPreviewIds.size() ? aiPreviewIds.get(i) : -1;
            SimpleLinearAnimation appearAnim = aiPreviewAnims.computeIfAbsent(previewId, k -> {
                SimpleLinearAnimation a = new SimpleLinearAnimation(260);
                a.setEasing(Easings.EASE_OUT_BACK);
                a.show();
                return a;
            });
            float appearP = appearAnim.getProgress();
            float scale = 0.6f + 0.4f * appearP;
            int itemA = (int) (alpha * appearP);

            float drawW = thumb * scale;
            float drawH = thumb * scale;
            float drawX = curX + (thumb - drawW) / 2f;
            float drawY = thumbY + (thumb - drawH) / 2f;

            AiImagePreviewCache.Entry entry = AiImagePreviewCache.get(bytes);
            if (entry != null) {
                r.drawTextureRounded(entry.id, drawX, drawY, drawW, drawH, ColorUtils.rgba(255, 255, 255, itemA), 8f);
            } else {
                r.rect(drawX, drawY, drawW, drawH, 8f, ColorUtils.rgba(255, 255, 255, (int) (20 * alphaProgress * appearP)));
                float pulse = (float) (Math.sin(System.currentTimeMillis() / 200.0) * 0.3 + 0.7);
                int loadA = (int) (180 * alphaProgress * appearP * pulse);
                r.text(FontRegistry.SF_MEDIUM, drawX + drawW / 2f - 6f, drawY + drawH / 2f - 4f, 9f, "...", ColorUtils.rgba(200, 200, 205, loadA));
            }

            float xBtnSize = 16f;
            float xBtnX = curX + thumb - xBtnSize + 2f;
            float xBtnY = thumbY - 2f;
            boolean xHov = mx >= xBtnX && mx <= xBtnX + xBtnSize && my >= xBtnY && my <= xBtnY + xBtnSize;
            int xBg = xHov ? ColorUtils.rgba(255, 80, 80, (int) (220 * alphaProgress * appearP))
                    : ColorUtils.rgba(0, 0, 0, (int) (170 * alphaProgress * appearP));
            r.rect(xBtnX, xBtnY, xBtnSize, xBtnSize, xBtnSize / 2f, xBg);
            int xCol = ColorUtils.rgba(255, 255, 255, (int) (240 * alphaProgress * appearP));
            float xl = 6f, xt = 1.4f;
            float xcx = xBtnX + xBtnSize / 2f, xcy = xBtnY + xBtnSize / 2f;
            r.rect(xcx - xl / 2f, xcy - xt / 2f, xl, xt, 1f, xCol);
            r.rect(xcx - xt / 2f, xcy - xl / 2f, xt, xl, 1f, xCol);

            curX += thumb + gap;
        }

        if (aiAttachedImages.size() < AI_MAX_IMAGES) {
            boolean addHov = mx >= curX && mx <= curX + thumb && my >= thumbY && my <= thumbY + thumb;
            int addBg = ColorUtils.rgba(255, 255, 255, (int) ((addHov ? 22 : 10) * alphaProgress * p));
            r.rect(curX, thumbY, thumb, thumb, 8f, addBg);
            r.rectOutline(curX, thumbY, thumb, thumb, 8f, ColorUtils.rgba(255, 255, 255, (int) (30 * alphaProgress * p)), 1f);
            int plusCol = ColorUtils.rgba(200, 200, 205, alpha);
            float pl = 12f, pt = 1.8f;
            float pcx = curX + thumb / 2f, pcy = thumbY + thumb / 2f;
            r.rect(pcx - pl / 2f, pcy - pt / 2f, pl, pt, 1f, plusCol);
            r.rect(pcx - pt / 2f, pcy - pl / 2f, pt, pl, 1f, plusCol);
        }
    }

    private void renderAiInputBar(Renderer2D r, float x, float y, float w, float h, int mx, int my, float alphaProgress) {
        int alpha = (int) (255 * alphaProgress);
        float sendW = 44f;
        float attachW = 36f;
        float gap = 6f;
        float fieldX = x + attachW + gap;
        float fieldW = w - attachW - gap - sendW - gap;

        boolean attachHov = mx >= x && mx <= x + attachW && my >= y && my <= y + h;
        if (attachHov) aiAttachBtnAnim.show();
        else aiAttachBtnAnim.hide();
        float attachP = aiAttachBtnAnim.getProgress();
        int attachBg = ColorUtils.rgba(255, 255, 255, (int) ((10 + 18 * attachP) * alphaProgress));
        r.rect(x, y, attachW, h, 11f, attachBg);
        int attachCol = ColorUtils.rgba(200 + (int) (55 * attachP), 200 + (int) (55 * attachP), 205 + (int) (50 * attachP), alpha);
        float al = 14f, at = 1.8f;
        float acx = x + attachW / 2f, acy = y + h / 2f;
        r.rect(acx - al / 2f, acy - at / 2f, al, at, 1f, attachCol);
        r.rect(acx - at / 2f, acy - al / 2f, at, al, 1f, attachCol);

        if (aiImageLoading) {
            long t = System.currentTimeMillis();
            float ang = (t % 1000L) / 1000f * 360f;
            int spinA = (int) (160 * alphaProgress);
            int dotCol = ClientColors.applyAlpha(ClientColors.ICON.getRGB(), alphaProgress * (spinA / 255f));
            for (int i = 0; i < 3; i++) {
                double rad = Math.toRadians(ang + i * 120);
                float sx = acx + (float) Math.cos(rad) * 9f;
                float sy = acy + (float) Math.sin(rad) * 9f;
                r.rect(sx - 1.2f, sy - 1.2f, 2.4f, 2.4f, 1.2f, dotCol);
            }
        }

        boolean fieldHov = mx >= fieldX && mx <= fieldX + fieldW && my >= y && my <= y + h;
        if (aiInput.isFocused() || fieldHov) aiInputFocusAnim.show();
        else aiInputFocusAnim.hide();
        float focusP = aiInputFocusAnim.getProgress();

        float pulseP = aiSendPulseAnim.getProgress();
        r.rect(fieldX, y, fieldW, h, 11f, ColorUtils.rgba(0, 0, 0, (int) (110 * alphaProgress)));
        int fieldBgA = (int) ((6 + 4 * focusP + 10 * pulseP) * alphaProgress);
        r.rect(fieldX, y, fieldW, h, 11f, ColorUtils.rgba(255, 255, 255, fieldBgA));

        aiInput.render(r, fieldX, y, fieldW, h, alphaProgress);

        float sendX = x + w - sendW;
        boolean sendHov = mx >= sendX && mx <= sendX + sendW && my >= y && my <= y + h;
        boolean canSend = (!aiInput.getText().trim().isEmpty() || !aiAttachedImages.isEmpty()) && !aiWaitingForResponse;
        if (canSend) aiSendActiveAnim.show();
        else aiSendActiveAnim.hide();
        aiSendActiveAnim.setEasing(Easings.EASE_OUT_QUART);
        float activeP = aiSendActiveAnim.getProgress();
        if (sendHov && canSend) aiSendHoverAnim.show();
        else aiSendHoverAnim.hide();
        float sendP = aiSendHoverAnim.getProgress();
        float pulseSendP = aiSendPulseAnim.getProgress();
        int accentR = (ClientColors.ICON.getRGB() >> 16) & 0xFF;
        int accentG = (ClientColors.ICON.getRGB() >> 8) & 0xFF;
        int accentB = ClientColors.ICON.getRGB() & 0xFF;
        int idleBg = ColorUtils.rgba(255, 255, 255, (int) (10 * alphaProgress));
        int activeBg = ColorUtils.rgba(accentR, accentG, accentB, (int) ((30 + 24 * sendP + 18 * pulseSendP) * alphaProgress));
        int sendBg = ColorUtils.interpolate(idleBg, activeBg, activeP);
        r.rect(sendX, y, sendW, h, 11f, sendBg);
        if (activeP > 0.01f) {
            int ringA = (int) (40 * activeP * (0.6f + 0.4f * sendP) * alphaProgress);
            r.rectOutline(sendX, y, sendW, h, 11f, ColorUtils.rgba(accentR, accentG, accentB, ringA), 1f);
        }
        float scaleP = 0.92f + 0.08f * activeP + 0.04f * sendP;

        int idleArrowCol = ColorUtils.rgba(140, 140, 145, alpha);
        int activeArrowCol = ColorUtils.rgba(255, 255, 255, alpha);
        int arrowCol = ColorUtils.interpolate(idleArrowCol, activeArrowCol, activeP);
        float arrowSize = 17f * scaleP;
        String arrowChar = ">";
        float arrowW = FontRegistry.SF_SEMIBOLD.getWidth(arrowChar, arrowSize);
        float arrowX = sendX + (sendW - arrowW) / 2f;
        float arrowY = y + h / 2f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', arrowSize);
        r.text(FontRegistry.SF_SEMIBOLD, arrowX, arrowY, arrowSize, arrowChar, arrowCol);
    }

    private record AiMsgLineRect(int msgIndex, int lineIndex, float x, float y, float w, float h, String text,
                                 float fontSize, int globalStart) {
    }

    private static final class AiBubbleLayout {
        final java.util.List<String> wrappedLines;
        final float maxLineW;
        final float bubbleW;
        final float bubbleH;

        AiBubbleLayout(java.util.List<String> wrappedLines, float maxLineW, float bubbleW, float bubbleH) {
            this.wrappedLines = wrappedLines;
            this.maxLineW = maxLineW;
            this.bubbleW = bubbleW;
            this.bubbleH = bubbleH;
        }
    }

    private final Map<String, AiBubbleLayout> aiBubbleCache = new HashMap<>();
    private float aiBubbleCacheWidth = -1f;

    private AiBubbleLayout getBubbleLayout(AiManager.ChatMessage msg, float chatW) {
        if (aiBubbleCacheWidth != chatW) {
            aiBubbleCache.clear();
            aiBubbleCacheWidth = chatW;
        }
        int imgCount = msg.imageList != null ? msg.imageList.size() : 0;
        String key = System.identityHashCode(msg) + ":" + (msg.content == null ? 0 : msg.content.length()) + ":" + imgCount;
        AiBubbleLayout cached = aiBubbleCache.get(key);
        if (cached != null) return cached;

        float nameSize = 11f;
        float contentSize = 13.5f;
        float bubblePadX = 14f;
        float bubblePadY = 10f;
        float nameContentGap = 4f;
        float maxBubbleW = chatW * 0.78f;
        float textMaxW = maxBubbleW - bubblePadX * 2f;

        java.util.List<String> wrapped = wrapText(msg.content, textMaxW, contentSize);
        int lineCount = Math.max(1, wrapped.size());
        float lineH = FontRegistry.SF_MEDIUM.getLineHeight(contentSize);
        float textBlockH = lineCount * lineH + (lineCount - 1) * 2f;

        float maxLineW = 0f;
        for (String ln : wrapped) {
            float lw = FontRegistry.SF_MEDIUM.getWidth(ln, contentSize);
            if (lw > maxLineW) maxLineW = lw;
        }

        float badgeRowH = imgCount > 0 ? 28f : 0f;
        float nameH = FontRegistry.SF_MEDIUM.getLineHeight(nameSize);
        float bubbleW = Math.min(maxBubbleW, Math.max(maxLineW + bubblePadX * 2f, imgCount > 0 ? 120f : 60f));
        float bubbleH = nameH + nameContentGap + textBlockH + bubblePadY * 2f + badgeRowH;

        AiBubbleLayout layout = new AiBubbleLayout(wrapped, maxLineW, bubbleW, bubbleH);
        aiBubbleCache.put(key, layout);
        if (aiBubbleCache.size() > 256) {
            java.util.Iterator<String> it = aiBubbleCache.keySet().iterator();
            while (aiBubbleCache.size() > 200 && it.hasNext()) {
                it.next();
                it.remove();
            }
        }
        return layout;
    }

    private void renderAiCreditsBar(Renderer2D r, float x, float y, float w, float h, float alphaProgress) {
        if (alphaProgress < 0.05f) return;
        long used = AiManager.getCreditsUsed();
        long limit = AiManager.CREDIT_LIMIT;
        long remaining = Math.max(0L, limit - used);
        float usedRatio = limit > 0 ? (float) used / (float) limit : 0f;
        float remainingRatio = 1f - usedRatio;

        long lastChanged = AiManager.getCreditsLastChangedMs();
        if (aiCreditsPrevChanged == 0L) aiCreditsPrevChanged = lastChanged;
        if (lastChanged != aiCreditsPrevChanged && lastChanged > 0 && alphaProgress > 0.9f) {
            aiCreditsPrevChanged = lastChanged;
            aiCreditsPulseAnim.setDuration(1);
            aiCreditsPulseAnim.show();
            aiCreditsPulseAnim.getProgress();
            aiCreditsPulseAnim.setDuration(450);
            aiCreditsPulseAnim.hide();
        }
        float pulseP = aiCreditsPulseAnim.getProgress();
        float pulseGlow = (1f - pulseP) * alphaProgress;

        if (remainingRatio <= 0.1f) aiCreditsDangerAnim.show();
        else aiCreditsDangerAnim.hide();
        float dangerP = aiCreditsDangerAnim.getProgress();

        int alpha = (int) (255 * alphaProgress);
        int bgA = (int) ((14 + 16 * pulseGlow) * alphaProgress);
        r.rect(x, y, w, h, h / 2f, ColorUtils.rgba(255, 255, 255, bgA));

        int accentR = (ClientColors.ICON.getRGB() >> 16) & 0xFF;
        int accentG = (ClientColors.ICON.getRGB() >> 8) & 0xFF;
        int accentB = ClientColors.ICON.getRGB() & 0xFF;

        boolean useDanger = remainingRatio <= 0.2f || dangerP > 0.5f;
        int barCol = useDanger
                ? ColorUtils.rgba(235, 95, 95, alpha)
                : ColorUtils.rgba(accentR, accentG, accentB, alpha);

        aiCreditsBarProgress = remainingRatio;

        float innerPad = 3f;
        float fillX = x + innerPad;
        float fillY = y + innerPad;
        float fillH = h - innerPad * 2f;
        float fillMaxW = w - innerPad * 2f;
        float fillW = fillMaxW * Math.max(0f, Math.min(1f, aiCreditsBarProgress));
        if (fillW > 1f) {
            r.rect(fillX, fillY, fillW, fillH, fillH / 2f, barCol);
        }

        String shortUsed = formatCreditsShort(used);
        String shortLimit = formatCreditsShort(limit);
        float percent = usedRatio * 100f;
        String percentStr = String.format(java.util.Locale.US, "%.1f%%", percent);
        String mainText = shortUsed + " / " + shortLimit;

        float mainSize = 11f;
        float secSize = 10f;
        float mainW = FontRegistry.SF_SEMIBOLD.getWidth(mainText, mainSize);
        float sepW = FontRegistry.SF_MEDIUM.getWidth(" · ", secSize);
        float secW = FontRegistry.SF_MEDIUM.getWidth(percentStr, secSize);

        int mainCol = ColorUtils.rgba(255, 255, 255, alpha);
        int secCol = ColorUtils.rgba(255, 255, 255, alpha);
        int sepCol = ColorUtils.rgba(255, 255, 255, alpha);

        float textLeftX = x + 12f;
        float mainBaseline = y + h / 2f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', mainSize);
        float secBaseline = y + h / 2f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'H', secSize);
        r.text(FontRegistry.SF_SEMIBOLD, textLeftX, mainBaseline, mainSize, mainText, mainCol);
        r.text(FontRegistry.SF_MEDIUM, textLeftX + mainW, secBaseline, secSize, " · ", sepCol);
        r.text(FontRegistry.SF_MEDIUM, textLeftX + mainW + sepW, secBaseline, secSize, percentStr, secCol);

        long resetAt = AiManager.getCreditResetAtMs();
        String rightText;
        if (resetAt > 0) {
            long left = resetAt - System.currentTimeMillis();
            if (left < 0) left = 0;
            long hours = left / (60L * 60L * 1000L);
            long minutes = (left / (60L * 1000L)) % 60L;
            rightText = "сброс через " + hours + "ч " + minutes + "м";
        } else {
            rightText = "квота полная";
        }
        float rSize = 10f;
        float rW = FontRegistry.SF_MEDIUM.getWidth(rightText, rSize);
        float rightEdge = x + w - 12f;

        if (isAiAdmin()) {
            String resetLabel = "Сбросить";
            float btnSize = 10f;
            float btnW = FontRegistry.SF_SEMIBOLD.getWidth(resetLabel, btnSize) + 14f;
            float btnH = h - 6f;
            float btnX = rightEdge - btnW;
            float btnY = y + (h - btnH) / 2f;
            aiResetBtnX = btnX;
            aiResetBtnY = btnY;
            aiResetBtnW = btnW;
            aiResetBtnH = btnH;

            int sMx = scaledMouseX();
            int sMy = scaledMouseY();
            boolean hov = sMx >= btnX && sMx <= btnX + btnW && sMy >= btnY && sMy <= btnY + btnH;
            if (hov) {
                aiResetBtnHoverAnim.show();
                CursorHelper.setHand();
            } else aiResetBtnHoverAnim.hide();
            float hp = aiResetBtnHoverAnim.getProgress();

            int btnBgA = (int) ((22 + 28 * hp) * alphaProgress);
            r.rect(btnX, btnY, btnW, btnH, btnH / 2f, ColorUtils.rgba(255, 255, 255, btnBgA));
            int outA = (int) ((30 + 50 * hp) * alphaProgress);
            r.rectOutline(btnX, btnY, btnW, btnH, btnH / 2f, ColorUtils.rgba(255, 255, 255, outA), 1f);

            int lblCol = ColorUtils.rgba(230, 230, 235, alpha);
            float lblBaseline = btnY + btnH / 2f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', btnSize);
            r.text(FontRegistry.SF_SEMIBOLD, btnX + 7f, lblBaseline, btnSize, resetLabel, lblCol);

            rightEdge = btnX - 8f;
        } else {
            aiResetBtnX = -1f;
        }

        float rX = rightEdge - rW;
        float rBaseline = y + h / 2f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'H', rSize);
        r.text(FontRegistry.SF_MEDIUM, rX, rBaseline, rSize, rightText, ColorUtils.rgba(255, 255, 255, alpha));
    }

    private static boolean isAiAdmin() {
        String uid = ClientContainer.getUid();
        return uid != null && (uid.equals("1") || uid.equals("2"));
    }

    private float aiResetBtnX = -1f, aiResetBtnY = -1f, aiResetBtnW = 0f, aiResetBtnH = 0f;
    private final SimpleLinearAnimation aiResetBtnHoverAnim = new SimpleLinearAnimation(180);

    private static String formatCreditsShort(long v) {
        if (v < 1000L) return Long.toString(v);
        if (v < 1_000_000L) {
            double k = v / 1000.0;
            if (k >= 100) return String.format(java.util.Locale.US, "%dK", (long) k);
            return String.format(java.util.Locale.US, "%.1fK", k);
        }
        double m = v / 1_000_000.0;
        if (v % 1_000_000L == 0L) return String.format(java.util.Locale.US, "%dM", (long) m);
        return String.format(java.util.Locale.US, "%.2fM", m);
    }

    private void updateAiMessageSelection(double mx, double my) {
        if (!aiMsgSelectionDragging || aiSelMessageIndex < 0) return;
        int posMsg = -1, posLine = -1, posChar = 0;
        for (AiMsgLineRect rect : aiLineRects) {
            if (rect.msgIndex != aiSelMessageIndex) continue;
            if (my >= rect.y - 4 && my <= rect.y + rect.h + 4) {
                posMsg = rect.msgIndex;
                posLine = rect.lineIndex;
                posChar = charIndexInLine(rect, mx);
                break;
            }
        }
        if (posMsg < 0) {
            AiMsgLineRect closest = null;
            double bestDy = Double.MAX_VALUE;
            for (AiMsgLineRect rect : aiLineRects) {
                if (rect.msgIndex != aiSelMessageIndex) continue;
                double centerY = rect.y + rect.h * 0.5;
                double dy = Math.abs(my - centerY);
                if (dy < bestDy) {
                    bestDy = dy;
                    closest = rect;
                }
            }
            if (closest == null) return;
            posMsg = closest.msgIndex;
            posLine = closest.lineIndex;
            posChar = my < closest.y ? 0 : closest.text.length();
            if (mx >= closest.x) posChar = charIndexInLine(closest, mx);
        }
        aiSelEndLine = posLine;
        aiSelEndPos = posChar;
    }

    private int charIndexInLine(AiMsgLineRect rect, double mx) {
        float rel = (float) (mx - rect.x);
        if (rel <= 0) return 0;
        if (rect.text == null || rect.text.isEmpty()) return 0;
        float cum = 0f;
        for (int i = 0; i < rect.text.length(); i++) {
            float cw = FontRegistry.SF_MEDIUM.getWidth(rect.text.substring(i, i + 1), rect.fontSize);
            if (rel < cum + cw * 0.5f) return i;
            cum += cw;
        }
        return rect.text.length();
    }

    private boolean handleAiMessageClick(double mouseX, double mouseY) {
        for (AiMsgLineRect rect : aiLineRects) {
            if (mouseX >= rect.x - 2 && mouseX <= rect.x + rect.w + 2
                    && mouseY >= rect.y - 2 && mouseY <= rect.y + rect.h + 2) {
                aiSelMessageIndex = rect.msgIndex;
                aiSelStartLine = rect.lineIndex;
                aiSelEndLine = rect.lineIndex;
                aiSelStartPos = charIndexInLine(rect, mouseX);
                aiSelEndPos = aiSelStartPos;
                aiMsgSelectionDragging = true;
                return true;
            }
        }
        clearAiMessageSelection();
        return false;
    }

    private void clearAiMessageSelection() {
        aiSelMessageIndex = -1;
        aiSelStartLine = -1;
        aiSelEndLine = -1;
        aiSelStartPos = -1;
        aiSelEndPos = -1;
        aiMsgSelectionDragging = false;
    }

    private String getAiSelectionText() {
        if (aiSelMessageIndex < 0 || aiSelStartLine < 0 || aiSelEndLine < 0) return "";
        int sl = Math.min(aiSelStartLine, aiSelEndLine);
        int el = Math.max(aiSelStartLine, aiSelEndLine);
        int sp, ep;
        if (aiSelStartLine < aiSelEndLine || (aiSelStartLine == aiSelEndLine && aiSelStartPos <= aiSelEndPos)) {
            sp = aiSelStartPos;
            ep = aiSelEndPos;
        } else {
            sp = aiSelEndPos;
            ep = aiSelStartPos;
        }
        StringBuilder sb = new StringBuilder();
        for (AiMsgLineRect rect : aiLineRects) {
            if (rect.msgIndex != aiSelMessageIndex) continue;
            if (rect.lineIndex < sl || rect.lineIndex > el) continue;
            String t = rect.text == null ? "" : rect.text;
            int from = (rect.lineIndex == sl) ? Math.max(0, Math.min(sp, t.length())) : 0;
            int to = (rect.lineIndex == el) ? Math.max(from, Math.min(ep, t.length())) : t.length();
            if (sb.length() > 0) sb.append('\n');
            sb.append(t, from, to);
        }
        return sb.toString();
    }

    private float aiCountInputLines(float maxWidth) {
        String t = aiInput.getText();
        if (t.isEmpty()) return 1f;
        return aiInput.getWrappedLineCount(Math.max(0f, maxWidth - 24f));
    }

    private String aiTrimToWidth(String text, float maxWidth, float size) {
        if (text == null) return "";
        if (FontRegistry.SF_MEDIUM.getWidth(text, size) <= maxWidth) return text;
        String ellipsis = "...";
        float eW = FontRegistry.SF_MEDIUM.getWidth(ellipsis, size);
        int lo = 0, hi = text.length();
        while (lo < hi) {
            int mid = (lo + hi + 1) / 2;
            if (FontRegistry.SF_MEDIUM.getWidth(text.substring(0, mid), size) + eW <= maxWidth) lo = mid;
            else hi = mid - 1;
        }
        return text.substring(0, lo) + ellipsis;
    }

    private void renderAiChatMessages(Renderer2D r, float x, float y, float w, float h, float alphaProgress) {
        aiLineRects.clear();
        float scrollY = y - (float) aiScrollY;
        float msgGap = 10f;
        float padX = 14f;
        float bubblePadX = 14f;
        float bubblePadY = 10f;
        float nameSize = 11f;
        float contentSize = 13.5f;
        float nameContentGap = 4f;
        int accentColor = ClientColors.ICON.getRGB();
        int accentR = (accentColor >> 16) & 0xFF;
        int accentG = (accentColor >> 8) & 0xFF;
        int accentB = accentColor & 0xFF;

        int alpha = (int) (255 * alphaProgress);

        long now = System.currentTimeMillis();
        long elapsed = now - aiLastMessageTime;
        List<AiManager.ChatMessage> activeMessages = AiManager.getCurrentSession().messages;
        int totalMsgCount = activeMessages.size();

        for (int idx = 0; idx < activeMessages.size(); idx++) {
            AiManager.ChatMessage msg = activeMessages.get(idx);
            boolean isUser = "user".equals(msg.role);

            AiBubbleLayout layout = getBubbleLayout(msg, w);
            float bubbleW = layout.bubbleW;
            float bubbleH = layout.bubbleH;
            java.util.List<String> wrappedLines = layout.wrappedLines;

            float msgAnim = 1f;
            float msgSlideY = 0f;
            float msgSlideX = 0f;
            if (aiNewMsgCount > 0 && idx >= totalMsgCount - aiNewMsgCount) {
                int newIdx = idx - (totalMsgCount - aiNewMsgCount);
                float delay = newIdx * 70f;
                float p = Math.max(0f, Math.min(1f, (elapsed - delay) / 260f));
                float eased = 1f - (float) Math.pow(1f - p, 3);
                msgAnim = eased;
                msgSlideY = (1f - eased) * 12f;
                msgSlideX = (1f - eased) * (isUser ? 14f : -14f);
            }
            int msgAlpha = (int) (alpha * msgAnim);

            float lineH = FontRegistry.SF_MEDIUM.getLineHeight(contentSize);
            int imgCount = msg.imageList != null ? msg.imageList.size() : 0;
            float nameH = FontRegistry.SF_MEDIUM.getLineHeight(nameSize);

            float drawX = isUser ? (x + w - bubbleW - padX) : (x + padX);
            float drawY = scrollY + msgSlideY;
            drawX += msgSlideX;

            if (drawY + bubbleH > y - 4f && drawY < y + h + 4f) {
                float radius = 14f;
                int bubbleBg = isUser
                        ? ColorUtils.rgba(accentR, accentG, accentB, (int) (22 * alphaProgress * msgAnim))
                        : ColorUtils.rgba(255, 255, 255, (int) (16 * alphaProgress * msgAnim));
                int bubbleBorder = isUser
                        ? ColorUtils.rgba(accentR, accentG, accentB, (int) (40 * alphaProgress * msgAnim))
                        : ColorUtils.rgba(255, 255, 255, (int) (22 * alphaProgress * msgAnim));
                r.rect(drawX, drawY, bubbleW, bubbleH, radius, bubbleBg);
                r.rectOutline(drawX, drawY, bubbleW, bubbleH, radius, bubbleBorder, 1f);

                String name = isUser ? "Вы" : "Nexis AI";
                int nameColor = isUser
                        ? ColorUtils.rgba(accentR, accentG, accentB, msgAlpha)
                        : ColorUtils.rgba(190, 190, 195, msgAlpha);
                float nameCY = drawY + bubblePadY + nameH * 0.5f;
                float nameBaseline = nameCY + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', nameSize);
                r.text(FontRegistry.SF_SEMIBOLD, drawX + bubblePadX, nameBaseline, nameSize, name, nameColor);

                int textColMsg = ColorUtils.rgba(225, 225, 230, msgAlpha);
                float ly = drawY + bubblePadY + nameH + nameContentGap;
                int globalOffset = 0;
                for (int li = 0; li < wrappedLines.size(); li++) {
                    String ln = wrappedLines.get(li);
                    float lineCY = ly + lineH * 0.5f;
                    float lb = lineCY + FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'H', contentSize);
                    float lineW = FontRegistry.SF_MEDIUM.getWidth(ln, contentSize);
                    float lineRectX = drawX + bubblePadX;
                    float lineRectY = ly;
                    aiLineRects.add(new AiMsgLineRect(idx, li, lineRectX, lineRectY, Math.max(lineW, 8f), lineH, ln, contentSize, globalOffset));

                    if (aiSelMessageIndex == idx) {
                        int sl = Math.min(aiSelStartLine, aiSelEndLine);
                        int el = Math.max(aiSelStartLine, aiSelEndLine);
                        boolean ascending = aiSelStartLine < aiSelEndLine
                                || (aiSelStartLine == aiSelEndLine && aiSelStartPos <= aiSelEndPos);
                        int sp = ascending ? aiSelStartPos : aiSelEndPos;
                        int ep = ascending ? aiSelEndPos : aiSelStartPos;
                        if (li >= sl && li <= el) {
                            int from = (li == sl) ? Math.max(0, Math.min(sp, ln.length())) : 0;
                            int to = (li == el) ? Math.max(from, Math.min(ep, ln.length())) : ln.length();
                            if (to > from) {
                                float xs = lineRectX + FontRegistry.SF_MEDIUM.getWidth(ln.substring(0, from), contentSize);
                                float xe = lineRectX + FontRegistry.SF_MEDIUM.getWidth(ln.substring(0, to), contentSize);
                                int selBg = ColorUtils.rgba(120, 160, 255, (int) (90 * alphaProgress * msgAnim));
                                r.rect(xs - 1f, lineRectY + 1f, Math.max(2f, xe - xs + 2f), lineH - 2f, 0f, selBg);
                            }
                        }
                    }

                    r.text(FontRegistry.SF_MEDIUM, lineRectX, lb, contentSize, ln, textColMsg);
                    ly += lineH + 2f;
                    globalOffset += ln.length() + 1;
                }

                if (imgCount > 0) {
                    float badgeH = 20f;
                    float badgeFontSize = 11f;
                    float bY = ly + 6f;
                    float bX = drawX + bubblePadX;
                    float maxRowW = bubbleW - bubblePadX * 2f;
                    float curX = bX;
                    for (int i = 0; i < imgCount; i++) {
                        String tag = "image " + (i + 1);
                        float textW = FontRegistry.SF_MEDIUM.getWidth(tag, badgeFontSize);
                        float iconW = 10f;
                        float bsW = textW + iconW + 18f;
                        if (curX - bX + bsW > maxRowW) break;
                        int bgC = isUser
                                ? ColorUtils.rgba(255, 255, 255, (int) (45 * alphaProgress * msgAnim))
                                : ColorUtils.rgba(accentR, accentG, accentB, (int) (50 * alphaProgress * msgAnim));
                        int txC = isUser
                                ? ColorUtils.rgba(255, 255, 255, msgAlpha)
                                : ColorUtils.rgba(accentR, accentG, accentB, msgAlpha);
                        r.rect(curX, bY, bsW, badgeH, badgeH * 0.5f, bgC);
                        float iconX = curX + 6f;
                        float iconY = bY + (badgeH - iconW) * 0.5f;
                        r.rect(iconX, iconY, iconW, iconW, 2.5f, txC);
                        int innerHole = isUser
                                ? ColorUtils.rgba(accentR, accentG, accentB, (int) (220 * alphaProgress * msgAnim))
                                : ColorUtils.rgba(20, 22, 28, (int) (220 * alphaProgress * msgAnim));
                        r.rect(iconX + 2f, iconY + 2f, iconW - 4f, iconW - 4f, 1.5f, innerHole);
                        float textX = iconX + iconW + 5f;
                        float textBaseline = bY + badgeH * 0.5f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'H', badgeFontSize);
                        r.text(FontRegistry.SF_MEDIUM, textX, textBaseline, badgeFontSize, tag, txC);
                        curX += bsW + 5f;
                    }
                }
            }
            scrollY += bubbleH + msgGap;
        }

        if (activeMessages.isEmpty()) {
            float phPulse = (float) (Math.sin(System.currentTimeMillis() / 1200.0) * 0.2 + 0.8);
            String placeholder = "Начните диалог";
            String sub = "Спросите что угодно или прикрепите изображение";
            float phCY = y + h * 0.5f - 10f;
            int phCol = ColorUtils.rgba(180, 180, 185, (int) (200 * alphaProgress * phPulse));
            int subCol = ColorUtils.rgba(130, 130, 135, (int) (160 * alphaProgress));
            float phSize = 20f;
            float subSize = 13f;
            r.text(FontRegistry.SF_SEMIBOLD, x + (w - FontRegistry.SF_SEMIBOLD.getWidth(placeholder, phSize)) / 2f,
                    phCY + FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', phSize), phSize, placeholder, phCol);
            r.text(FontRegistry.SF_MEDIUM, x + (w - FontRegistry.SF_MEDIUM.getWidth(sub, subSize)) / 2f,
                    phCY + 28f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'H', subSize), subSize, sub, subCol);
        }
    }

    private java.util.List<String> wrapText(String text, float maxWidth, float fontSize) {
        java.util.List<String> result = new java.util.ArrayList<>();
        if (text == null || text.isEmpty()) {
            result.add("");
            return result;
        }
        String[] paragraphs = text.split("\n", -1);
        for (String para : paragraphs) {
            if (para.isEmpty()) {
                result.add("");
                continue;
            }
            String[] words = para.split(" ");
            StringBuilder currentLine = new StringBuilder();
            for (String word : words) {
                String testLine = currentLine.length() == 0 ? word : currentLine + " " + word;
                float lineW = FontRegistry.SF_MEDIUM.getWidth(testLine, fontSize);
                if (lineW > maxWidth && currentLine.length() > 0) {
                    result.add(currentLine.toString());
                    currentLine = new StringBuilder(word);
                } else {
                    currentLine = new StringBuilder(testLine);
                }
            }
            if (currentLine.length() > 0) {
                result.add(currentLine.toString());
            }
        }
        return result;
    }

    private float calculateAiMessagesTotalHeight(float width) {
        List<AiManager.ChatMessage> activeMessages = AiManager.getCurrentSession().messages;
        if (activeMessages.isEmpty()) return 0;
        float msgGap = 10f;
        float total = 0;
        for (AiManager.ChatMessage msg : activeMessages) {
            AiBubbleLayout layout = getBubbleLayout(msg, width);
            total += layout.bubbleH + msgGap;
        }
        return total;
    }

    private void scrollAiToBottom() {
        float miniW = 225f;
        float pad = 14f;
        float contentW = PANEL_WIDTH - miniW - 2f - pad * 2f;
        float sidebarW = aiShowChatsList ? AI_SIDEBAR_W : 0f;
        float sidebarGap = aiShowChatsList ? 10f : 0f;
        float chatW = contentW - sidebarW - sidebarGap;
        float bodyH = (PANEL_HEIGHT - 75f - 2f - pad * 2f) - AI_HEADER_H;
        float previewH = aiAttachedImages.isEmpty() ? 0f : AI_PREVIEW_STRIP_H;
        float msgAreaH = bodyH - AI_INPUT_BASE_H - previewH - 8f;
        float totalMsgH = calculateAiMessagesTotalHeight(chatW);
        float maxScroll = Math.max(0, totalMsgH - msgAreaH);
        aiTargetScrollY = maxScroll;
        aiScrollY = maxScroll;
    }

    private void sendAiMessage() {
        boolean hasImages = !aiAttachedImages.isEmpty();
        String userText = aiInput.getText().trim();
        if (userText.isEmpty() && !hasImages) return;
        if (aiWaitingForResponse) return;

        List<byte[]> imgList = new ArrayList<>(aiAttachedImages);
        List<String> mimeList = new ArrayList<>(aiAttachedMimes);
        AiManager.ChatSession session = AiManager.getCurrentSession();

        aiInput.setText("");
        aiInput.blur();
        clearAiAttachedImages();
        aiWaitingForResponse = true;
        aiSendPulseAnim.show();
        scrollAiToBottom();

        Thread thread = new Thread(() -> {
            try {
                AiManager.requestGemini(session, userText, imgList, mimeList);
                mc.execute(() -> {
                    aiWaitingForResponse = false;
                    scrollAiToBottom();
                    AiManager.saveSessions();
                });
            } catch (Exception e) {
                mc.execute(() -> {
                    session.messages.add(new AiManager.ChatMessage("model", "Ошибка: " + e.getMessage()));
                    aiWaitingForResponse = false;
                    scrollAiToBottom();
                    AiManager.saveSessions();
                });
            }
        }, "AiChat-Request");
        thread.setDaemon(true);
        thread.start();
    }

    private boolean isCtrlDown() {
        long handle = mc.getWindow().getHandle();
        return GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_LEFT_CONTROL) == GLFW.GLFW_PRESS
                || GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_RIGHT_CONTROL) == GLFW.GLFW_PRESS;
    }

    private void clearAiAttachedImages() {
        aiAttachedImages.clear();
        aiAttachedMimes.clear();
        aiPreviewIds.clear();
        aiPreviewAnims.clear();
        aiPreviewRemoveAnims.clear();
    }

    private void addAttachedImage(byte[] bytes, String mime) {
        if (aiAttachedImages.size() >= AI_MAX_IMAGES) return;
        aiAttachedImages.add(bytes);
        aiAttachedMimes.add(mime);
        aiPreviewIds.add(++aiPreviewSeq);
    }

    private void removeAttachedImage(int index) {
        if (index < 0 || index >= aiAttachedImages.size()) return;
        aiAttachedImages.remove(index);
        aiAttachedMimes.remove(index);
        if (index < aiPreviewIds.size()) {
            int pid = aiPreviewIds.remove(index);
            aiPreviewAnims.remove(pid);
            aiPreviewRemoveAnims.remove(pid);
        }
    }

    private long aiLastChooserOpenMs = 0L;

    private void openAiImageFileChooser() {
        long now = System.currentTimeMillis();
        if (now - aiLastChooserOpenMs < 800) return;
        if (aiImageLoading) return;
        aiLastChooserOpenMs = now;
        mc.execute(() -> aiImageLoading = true);
        new Thread(() -> {
            try {
                String script =
                        "[Console]::OutputEncoding = [System.Text.Encoding]::UTF8;" +
                                "$OutputEncoding = [System.Text.Encoding]::UTF8;" +
                                "Add-Type -AssemblyName System.Windows.Forms;" +
                                "Add-Type -AssemblyName System.Drawing;" +
                                "$f = New-Object System.Windows.Forms.OpenFileDialog;" +
                                "$f.Multiselect = $true;" +
                                "$f.Filter = 'Images|*.png;*.jpg;*.jpeg;*.gif;*.webp;*.bmp';" +
                                "$f.Title = 'Select images for AI';" +
                                "$owner = New-Object System.Windows.Forms.Form;" +
                                "$owner.TopMost = $true;" +
                                "$owner.ShowInTaskbar = $false;" +
                                "$owner.StartPosition = 'CenterScreen';" +
                                "$owner.Size = New-Object System.Drawing.Size(1,1);" +
                                "$owner.Opacity = 0;" +
                                "$owner.Show();" +
                                "$owner.Activate();" +
                                "$res = $f.ShowDialog($owner);" +
                                "$owner.Close();" +
                                "if ($res -eq 'OK') { $f.FileNames | ForEach-Object { Write-Output $_ } } else { Write-Output 'CANCEL' }";
                ProcessBuilder pb = new ProcessBuilder(
                        "powershell", "-NoProfile", "-STA", "-WindowStyle", "Hidden", "-Command", script
                );
                pb.redirectErrorStream(true);
                Process p = pb.start();
                String output = new String(p.getInputStream().readAllBytes(), java.nio.charset.StandardCharsets.UTF_8).trim();
                p.waitFor();

                if (output.isEmpty() || "CANCEL".equals(output)) {
                    mc.execute(() -> aiImageLoading = false);
                    return;
                }

                String[] lines = output.split("\\r?\\n");
                for (String line : lines) {
                    line = line.trim();
                    if (line.isEmpty() || "CANCEL".equals(line)) continue;
                    File file = new File(line);
                    if (!file.exists() || !file.isFile()) continue;
                    byte[] bytes = Files.readAllBytes(file.toPath());
                    String name = file.getName().toLowerCase();
                    String mime;
                    if (name.endsWith(".png")) mime = "image/png";
                    else if (name.endsWith(".jpg") || name.endsWith(".jpeg")) mime = "image/jpeg";
                    else if (name.endsWith(".gif")) mime = "image/gif";
                    else if (name.endsWith(".webp")) mime = "image/webp";
                    else if (name.endsWith(".bmp")) mime = "image/bmp";
                    else mime = "image/png";

                    final byte[] finalBytes = bytes;
                    final String finalMime = mime;
                    mc.execute(() -> addAttachedImage(finalBytes, finalMime));
                }
                mc.execute(() -> aiImageLoading = false);
            } catch (Exception e) {
                mc.execute(() -> aiImageLoading = false);
            }
        }, "AiImageChooser").start();
    }

    private void pasteImageFromClipboard() {
        mc.execute(() -> aiImageLoading = true);
        new Thread(() -> {
            try {
                ProcessBuilder pb = new ProcessBuilder(
                        "powershell", "-NoProfile", "-Command",
                        "Add-Type -AssemblyName System.Windows.Forms; " +
                                "$img = [System.Windows.Forms.Clipboard]::GetImage(); " +
                                "if ($img -ne $null) { $tmp = [System.IO.Path]::GetTempFileName() + '.png'; " +
                                "$img.Save($tmp, [System.Drawing.Imaging.ImageFormat]::Png); Write-Host $tmp }"
                );
                pb.redirectErrorStream(true);
                Process p = pb.start();
                String output = new String(p.getInputStream().readAllBytes(), java.nio.charset.StandardCharsets.UTF_8).trim();
                p.waitFor();
                if (output == null || output.isEmpty() || "CANCEL".equals(output) || "null".equals(output)) {
                    mc.execute(() -> aiImageLoading = false);
                    return;
                }
                java.io.File tmpFile = new java.io.File(output);
                if (!tmpFile.exists()) {
                    mc.execute(() -> aiImageLoading = false);
                    return;
                }
                byte[] bytes = java.nio.file.Files.readAllBytes(tmpFile.toPath());
                tmpFile.delete();
                mc.execute(() -> {
                    if (aiAttachedImages.size() >= 4) {
                        aiImageLoading = false;
                        return;
                    }
                    addAttachedImage(bytes, "image/png");
                    aiImageLoading = false;
                });
            } catch (Exception ignored) {
                mc.execute(() -> aiImageLoading = false);
            }
        }, "AiPasteImage").start();
    }

    private boolean handleAiChatClicked(double mouseX, double mouseY, int button) {
        if (button != 0) return false;
        float fbW = mc.getWindow().getFramebufferWidth();
        float fbH = mc.getWindow().getFramebufferHeight();
        float sx = (fbW - PANEL_WIDTH) / 2f;
        float sy = (fbH - PANEL_HEIGHT) / 2f;
        float pad = 14f;
        float contentX = sx + 225f + 2f + pad;
        float contentY = sy + 75f + 2f + pad;
        float contentW = PANEL_WIDTH - 225f - 2f - pad * 2f;
        float contentH = PANEL_HEIGHT - 75f - 2f - pad * 2f;

        float btnSize = 30f;
        float btnGap = 6f;
        float listBtnX = contentX + contentW - btnSize;
        float listBtnY = contentY + 4f;
        if (mouseX >= listBtnX && mouseX <= listBtnX + btnSize && mouseY >= listBtnY && mouseY <= listBtnY + btnSize) {
            aiShowChatsList = !aiShowChatsList;
            if (aiShowChatsList) {
                aiSidebarSlideAnim.show();
                aiSidebarOpenTime = System.currentTimeMillis();
            } else aiSidebarSlideAnim.hide();
            return true;
        }
        float newBtnX = listBtnX - btnGap - btnSize;
        if (mouseX >= newBtnX && mouseX <= newBtnX + btnSize && mouseY >= listBtnY && mouseY <= listBtnY + btnSize) {
            AiManager.createNewChat();
            scrollAiToBottom();
            return true;
        }

        float sidebarP = aiSidebarSlideAnim.getProgress();
        float sidebarW = AI_SIDEBAR_W * sidebarP;
        float sidebarGap = 10f * sidebarP;
        float bodyY = contentY + AI_HEADER_H;
        float bodyH = contentH - AI_HEADER_H;
        float chatX = contentX + sidebarW + sidebarGap;
        float chatW = contentW - sidebarW - sidebarGap;

        if (aiShowChatsList && sidebarP > 0.5f && mouseX >= contentX && mouseX <= contentX + sidebarW) {
            float itemH = 46f;
            float itemGap = 5f;
            float curY = bodyY + 6f - (float) aiChatsScrollY;
            List<AiManager.ChatSession> sessions = AiManager.getGuiSessions();
            for (int i = 0; i < sessions.size(); i++) {
                if (mouseY >= curY && mouseY <= curY + itemH) {
                    float ix = contentX + 4f;
                    float iw = sidebarW - 8f;
                    float dbW = 20f;
                    float dbX = ix + iw - dbW - 6f;
                    float dbY = curY + (itemH - dbW) / 2f;
                    if (mouseX >= dbX && mouseX <= dbX + dbW && mouseY >= dbY && mouseY <= dbY + dbW && sessions.size() > 1) {
                        AiManager.deleteSession(i);
                        scrollAiToBottom();
                        return true;
                    }
                    AiManager.setCurrentSessionIndex(i);
                    scrollAiToBottom();
                    return true;
                }
                curY += itemH + itemGap;
            }
        }

        boolean hasPreviews = !aiAttachedImages.isEmpty();
        float previewStripH = hasPreviews ? AI_PREVIEW_STRIP_H * aiPreviewStripAnim.getProgress() : 0f;
        float wrappedLineCount = aiCountInputLines(chatW - 80f);
        float lineH = FontRegistry.SF_MEDIUM.getLineHeight(15f);
        float dynamicInputH = Math.min(AI_INPUT_MAX_H, AI_INPUT_BASE_H + Math.max(0f, wrappedLineCount - 1) * lineH);
        float creditsY = bodyY + bodyH - AI_CREDITS_BAR_H;
        float inputY = creditsY - AI_CREDITS_BAR_GAP - dynamicInputH;

        if (hasPreviews && previewStripH > 4f) {
            float stripY = inputY - previewStripH - 6f;
            float thumb = AI_PREVIEW_THUMB;
            float thumbY = stripY + (previewStripH - thumb) / 2f;
            float cx = chatX + 8f;
            float gap = 6f;
            for (int i = 0; i < aiAttachedImages.size(); i++) {
                float xBtnSize = 16f;
                float xBtnX = cx + thumb - xBtnSize + 2f;
                float xBtnY = thumbY - 2f;
                if (mouseX >= xBtnX && mouseX <= xBtnX + xBtnSize && mouseY >= xBtnY && mouseY <= xBtnY + xBtnSize) {
                    removeAttachedImage(i);
                    return true;
                }
                cx += thumb + gap;
            }
            if (aiAttachedImages.size() < AI_MAX_IMAGES) {
                if (mouseX >= cx && mouseX <= cx + thumb && mouseY >= thumbY && mouseY <= thumbY + thumb) {
                    openAiImageFileChooser();
                    return true;
                }
            }
        }

        float sendW = 44f;
        float attachW = 36f;
        float gap = 6f;
        float fieldX = chatX + attachW + gap;
        float fieldW = chatW - attachW - gap - sendW - gap;
        float sendX = chatX + chatW - sendW;

        if (isAiAdmin() && aiResetBtnX >= 0f
                && mouseX >= aiResetBtnX && mouseX <= aiResetBtnX + aiResetBtnW
                && mouseY >= aiResetBtnY && mouseY <= aiResetBtnY + aiResetBtnH) {
            AiManager.resetCredits();
            return true;
        }
        if (mouseX >= chatX && mouseX <= chatX + attachW && mouseY >= inputY && mouseY <= inputY + dynamicInputH) {
            openAiImageFileChooser();
            return true;
        }
        if (mouseX >= sendX && mouseX <= sendX + sendW && mouseY >= inputY && mouseY <= inputY + dynamicInputH) {
            sendAiMessage();
            return true;
        }
        if (aiInput.mouseClicked(mouseX, mouseY, button, fieldX, inputY, fieldW, dynamicInputH)) {
            clearAiMessageSelection();
            return true;
        }

        if (button == 0 && handleAiMessageClick(mouseX, mouseY)) {
            return true;
        }
        return false;
    }

    private float getMarqueeOffset(float overflow) {
        float travel = overflow + MARQUEE_GAP;
        long animationMs = Math.max(1L, (long) ((travel / MARQUEE_SPEED_PX_PER_SEC) * 1000f));
        long cycle = MARQUEE_PAUSE_MS + animationMs + MARQUEE_PAUSE_MS + animationMs;
        long time = System.currentTimeMillis() % cycle;
        if (time < MARQUEE_PAUSE_MS) return 0f;
        time -= MARQUEE_PAUSE_MS;
        if (time < animationMs) return easeInOut(time / (float) animationMs) * travel;
        time -= animationMs;
        if (time < MARQUEE_PAUSE_MS) return travel;
        time -= MARQUEE_PAUSE_MS;
        return (1f - easeInOut(time / (float) animationMs)) * travel;
    }

    private float easeInOut(float value) {
        float v = Math.max(0f, Math.min(1f, value));
        return v * v * (3f - 2f * v);
    }

    private void renderUserInfo(Renderer2D r, float sx, float sy, float alphaProgress) {
        float margin = 16f;
        float infoH = 48f;
        r.rect(sx + margin, sy + PANEL_HEIGHT - infoH - margin, 225f - margin * 2, infoH, ROUNDING / 1.5f, ColorUtils.rgba(255, 255, 255, (int) (10 * alphaProgress)));

        float avatarSize = 36f;
        float avatarGap = 10f;
        float infoX = sx + margin + 10f;
        float infoY = sy + PANEL_HEIGHT - infoH - margin + 20.5f;

        Identifier avatarFrame = getAvatar();
        if (avatarFrame != null) {
            float avatarX = sx + margin + 10f;
            float avatarY = sy + PANEL_HEIGHT - infoH - margin + (infoH - avatarSize) / 2f;
            int avatarAlpha = (int) (255 * alphaProgress);
            int avatarColor = ColorUtils.rgba(255, 255, 255, avatarAlpha);
            r.drawTextureRounded(avatarFrame, avatarX, avatarY, avatarSize, avatarSize, avatarColor, 6f);

            infoX += avatarSize + avatarGap;
        }

        r.text(FontRegistry.SF_MEDIUM, infoX, infoY, 14f,
                "" + ClientContainer.getUser(),
                ColorUtils.rgba(255, 255, 255, (int) (255 * alphaProgress)));

        r.text(FontRegistry.SF_SEMIBOLD, infoX, infoY + 17f, 13f, getIrcRoleText(ClientContainer.getRole()), getIrcRoleColor(ClientContainer.getRole(), (int) (255 * alphaProgress)));
    }

    private boolean tryStartScrollbarDrag(double mx, double my) {
        ScrollbarGeometry[] all = {sbThemes, sbConfig, sbIrc, sbAi, sbAiChats, sbModules};
        int[] types = {SB_THEMES, SB_CONFIG, SB_IRC, SB_AI, SB_AI_CHATS, SB_MODULES};
        for (int i = 0; i < all.length; i++) {
            ScrollbarGeometry sb = all[i];
            if (!sb.visible) continue;
            if (sb.hitThumb(mx, my)) {
                draggingScrollbar = types[i];
                sbDragOffsetWithinThumb = (float) (my - sb.thumbY);
                sbDragTrackY = sb.trackY;
                sbDragTrackH = sb.trackH;
                sbDragThumbH = sb.thumbH;
                sbDragMaxScroll = Math.max(0, sb.totalContentH - sb.viewportH);
                return true;
            }
            if (sb.hitTrack(mx, my)) {
                draggingScrollbar = types[i];
                sbDragOffsetWithinThumb = sb.thumbH * 0.5f;
                sbDragTrackY = sb.trackY;
                sbDragTrackH = sb.trackH;
                sbDragThumbH = sb.thumbH;
                sbDragMaxScroll = Math.max(0, sb.totalContentH - sb.viewportH);
                updateScrollbarDrag(my);
                return true;
            }
        }
        return false;
    }

    private void updateScrollbarDrag(double my) {
        if (draggingScrollbar == SB_NONE) return;
        float trackMove = Math.max(1f, sbDragTrackH - sbDragThumbH);
        float thumbTop = (float) (my - sbDragOffsetWithinThumb);
        float clampedTop = Math.max(sbDragTrackY, Math.min(thumbTop, sbDragTrackY + trackMove));
        float prog = (clampedTop - sbDragTrackY) / trackMove;
        double next = prog * sbDragMaxScroll;
        switch (draggingScrollbar) {
            case SB_THEMES -> {
                themesTargetScrollOffset = (float) next;
                themesScrollOffset = (float) next;
            }
            case SB_CONFIG -> {
                configTargetScrollOffset = (float) next;
                configScrollOffset = (float) next;
            }
            case SB_IRC -> {
                ircTargetScrollY = next;
                ircScrollY = next;
                ircAutoScroll = false;
            }
            case SB_AI -> {
                aiTargetScrollY = next;
                aiScrollY = next;
                aiAutoScroll = false;
            }
            case SB_AI_CHATS -> {
                aiChatsTargetScrollY = next;
                aiChatsScrollY = next;
            }
            case SB_MODULES -> {
                moduleTargetScrollOffset = (float) next;
                moduleScrollOffset = (float) next;
            }
        }
    }

    @Override
    public boolean mouseDragged(Click click, double deltaX, double deltaY) {
        double scaleX = (double) mc.getWindow().getFramebufferWidth() / width;
        double scaleY = (double) mc.getWindow().getFramebufferHeight() / height;
        double mx = click.x() * scaleX;
        double my = click.y() * scaleY;

        if (draggingScrollbar != SB_NONE) {
            updateScrollbarDrag(my);
            return true;
        }

        searchInput.tickDrag(mx, my);
        aiInput.tickDrag(mx, my);
        themeNameInput.tickDrag(mx, my);
        configNameInput.tickDrag(mx, my);
        ircInput.tickDrag(mx, my);
        updateAiMessageSelection(mx, my);
        updateIrcMessageSelection(mx, my);
        return super.mouseDragged(click, deltaX, deltaY);
    }

    @Override
    public boolean mouseReleased(Click click) {
        int button = click.button();
        searchInput.mouseReleased(button);
        aiInput.mouseReleased(button);
        themeNameInput.mouseReleased(button);
        configNameInput.mouseReleased(button);
        ircInput.mouseReleased(button);
        if (button == 0) {
            aiMsgSelectionDragging = false;
            ircMsgSelectionDragging = false;
            draggingScrollbar = SB_NONE;
        }
        return super.mouseReleased(click);
    }

    @Override
    protected int scaledMouseX() {
        double scale = (double) mc.getWindow().getFramebufferWidth() / width;
        return (int) Math.round(lastMouseX * scale);
    }

    @Override
    protected int scaledMouseY() {
        double scale = (double) mc.getWindow().getFramebufferHeight() / height;
        return (int) Math.round(lastMouseY * scale);
    }

    @Override
    public boolean mouseClicked(Click click, boolean isRepeated) {
        double scaleX = (double) mc.getWindow().getFramebufferWidth() / width;
        double scaleY = (double) mc.getWindow().getFramebufferHeight() / height;
        double mouseX = click.x() * scaleX;
        double mouseY = click.y() * scaleY;
        int button = click.button();

        if (bindingFunction != null) {
            if (button == GLFW.GLFW_MOUSE_BUTTON_RIGHT) {
                bindingFunction.setBind(0);
            } else {
                bindingFunction.setBind(1000 + button);
            }
            bindingFunction = null;
            return true;
        }

        if (CsColorPicker.get() != null) {
            if (CsColorPicker.get().mouseClicked(mouseX, mouseY, button)) return true;
        }

        if (button == 0 && tryStartScrollbarDrag(mouseX, mouseY)) return true;

        if (handleSearchClicked(mouseX, mouseY, button)) return true;
        if (selectedCategory == AI_CATEGORY_INDEX) {
            if (handleAiChatClicked(mouseX, mouseY, button)) return true;
        } else if (selectedCategory == IRC_CATEGORY_INDEX && searchInput.getText().isEmpty()) {
            if (handleIrcChatClicked(mouseX, mouseY, button)) return true;
        } else if (selectedCategory == THEMES_CATEGORY_INDEX && searchInput.getText().isEmpty()) {
            if (handleThemesClicked(mouseX, mouseY, button)) return true;
        } else if (selectedCategory == CONFIG_CATEGORY_INDEX && searchInput.getText().isEmpty()) {
            if (handleConfigsClicked(mouseX, mouseY, button)) return true;
        } else {
            if (handleModuleClicked(mouseX, mouseY, button)) return true;
        }
        if (handleCategoryClicked(mouseX, mouseY, button)) return true;
        return super.mouseClicked(click, isRepeated);
    }

    private boolean handleModuleClicked(double mouseX, double mouseY, int button) {
        float sx = (mc.getWindow().getFramebufferWidth() - PANEL_WIDTH) / 2f;
        float sy = (mc.getWindow().getFramebufferHeight() - PANEL_HEIGHT) / 2f;

        float miniW = 225f;
        float areaX = sx + miniW + 2f;
        float areaY = sy + 75f + 2f;
        float areaW = PANEL_WIDTH - miniW - 2f;
        float areaH = PANEL_HEIGHT - 75f - 2f;

        if (mouseX < areaX || mouseX > areaX + areaW || mouseY < areaY || mouseY > areaY + areaH) return false;

        float pad = 12f;
        float contentX = areaX + pad;
        float contentY = areaY + pad;
        float contentW = areaW - pad * 2f;

        float moduleGap = 8f;
        float moduleW = (contentW - moduleGap) / 2f;
        float baseModuleH = 52f;
        float moduleGapY = 6f;

        List<Function> modules = getModulesToRender();

        float[] heights = new float[modules.size()];
        for (int i = 0; i < modules.size(); i++) {
            float sh = getSettingsHeight(modules.get(i), moduleW);
            heights[i] = sh > 0f ? baseModuleH + HEADER_TO_SETTINGS_GAP + sh : baseModuleH;
        }

        float[] colYs = {contentY - moduleScrollOffset, contentY - moduleScrollOffset};
        for (int i = 0; i < modules.size(); i++) {
            Function func = modules.get(i);
            int col = colYs[0] <= colYs[1] ? 0 : 1;
            float h = heights[i];
            float mx = contentX + col * (moduleW + moduleGap);
            float my = colYs[col];
            colYs[col] += h + moduleGapY;

            if (mouseX < mx || mouseX > mx + moduleW || mouseY < my || mouseY > my + h) continue;

            if (mouseY >= my + baseModuleH + HEADER_TO_SETTINGS_GAP && h > baseModuleH) {
                return handleSettingClicked(func, mouseX, mouseY, button, mx, my + baseModuleH + HEADER_TO_SETTINGS_GAP, moduleW);
            }

            String bind = bindingFunction == func ? "..." : PlayerUtils.getBindName(func.getBind());
            if (bindingFunction == func || (bind != null && !bind.equalsIgnoreCase("NONE"))) {
                float bindSize = 14f;
                float bindH = 18f;
                float bindW = FontRegistry.SF_MEDIUM.getWidth(bind, bindSize) + 10f;
                float bindX = mx + moduleW - bindW - 11f;
                float bindY = my + baseModuleH / 2f - bindH / 2f;
                if (mouseX >= bindX && mouseX <= bindX + bindW && mouseY >= bindY && mouseY <= bindY + bindH) {
                    return false;
                }
            }

            if (button == GLFW.GLFW_MOUSE_BUTTON_LEFT) {
                func.toggle();
                return true;
            } else if (button == GLFW.GLFW_MOUSE_BUTTON_MIDDLE) {
                bindingFunction = func;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    protected boolean handleMouseClicked(double mouseX, double mouseY, int button) {
        return handleCategoryClicked(mouseX, mouseY, button);
    }

    private boolean handleCategoryClicked(double mouseX, double mouseY, int button) {
        for (int i = 0; i < catHitBoxes.size(); i++) {
            float[] b = catHitBoxes.get(i);
            if (mouseX >= b[0] && mouseX <= b[0] + b[2] && mouseY >= b[1] && mouseY <= b[1] + b[3]) {
                if (button != 0) return false;
                if (i == selectedCategory) return true;
                searchInput.setText("");
                catColorAnims.get(selectedCategory).hide();
                fromRectY = catRectPositions.get(selectedCategory);
                selectedCategory = i;
                catColorAnims.get(selectedCategory).show();
                toRectY = catRectPositions.get(selectedCategory);
                rectSlideAnimation = new SimpleLinearAnimation(200);
                rectSlideAnimation.setEasing(Easings.EASE_IN_OUT_QUART);
                rectSlideAnimation.show();
                moduleScrollOffset = 0f;
                moduleTargetScrollOffset = 0f;
                themesScrollOffset = 0f;
                themesTargetScrollOffset = 0f;
                configScrollOffset = 0f;
                configTargetScrollOffset = 0f;
                ircScrollY = 0;
                ircTargetScrollY = 0;
                themePanelEnterTime = (selectedCategory == THEMES_CATEGORY_INDEX) ? System.currentTimeMillis() : 0L;
                configPanelEnterTime = (selectedCategory == CONFIG_CATEGORY_INDEX) ? System.currentTimeMillis() : 0L;
                ircEnterCategoryTime = (selectedCategory == IRC_CATEGORY_INDEX) ? System.currentTimeMillis() : 0L;
                themePanelEnterAnim.setEasing(Easings.EASE_OUT_QUART);
                configPanelEnterAnim.setEasing(Easings.EASE_OUT_QUART);
                if (selectedCategory == THEMES_CATEGORY_INDEX) themePanelEnterAnim.show();
                else themePanelEnterAnim.hide();
                if (selectedCategory == CONFIG_CATEGORY_INDEX) configPanelEnterAnim.show();
                else configPanelEnterAnim.hide();
                if (selectedCategory == IRC_CATEGORY_INDEX) ircHeaderFadeAnim.show();
                else ircHeaderFadeAnim.hide();
                themeCardAppearAnims.clear();
                configCardAppearAnims.clear();
                clearIrcMessageSelection();
                CsSettingComponent.requestSuppressVisibility(3);
                lastSelectedCategoryChange = System.currentTimeMillis();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean keyPressed(KeyInput keyInput) {
        int keyCode = keyInput.key();
        int modifiers = keyInput.modifiers();

        if (CsSettingComponent.listeningBooleanComp != null) {
            CsSettingComponent.listeningBooleanComp.keyPressed(keyCode);
            return true;
        }

        if (CsSettingComponent.listeningBindComp != null) {
            CsSettingComponent.listeningBindComp.keyPressed(keyCode);
            return true;
        }

        if (CsColorPicker.get() != null) {
            CsColorPicker.get().keyPressed(keyCode);
            return true;
        }

        if (selectedCategory == AI_CATEGORY_INDEX && aiSelMessageIndex >= 0
                && keyCode == GLFW.GLFW_KEY_C && (modifiers & GLFW.GLFW_MOD_CONTROL) != 0
                && !aiInput.isFocused() && !searchInput.isFocused()) {
            String sel = getAiSelectionText();
            if (!sel.isEmpty()) {
                try {
                    mc.keyboard.setClipboard(sel);
                } catch (Exception ignored) {
                }
            }
            return true;
        }

        if (searchInput.isFocused()) {
            if (keyCode == GLFW.GLFW_KEY_ENTER) {
                searchInput.blur();
                return true;
            }
            if (searchInput.keyPressed(keyCode, modifiers)) return true;
            return true;
        }

        if (themeNameInput.isFocused()) {
            if (keyCode == GLFW.GLFW_KEY_ENTER) {
                themeNameInput.blur();
                return true;
            }
            if (themeNameInput.keyPressed(keyCode, modifiers)) return true;
            return true;
        }

        if (configNameInput.isFocused()) {
            if (keyCode == GLFW.GLFW_KEY_ENTER) {
                configNameInput.blur();
                return true;
            }
            if (configNameInput.keyPressed(keyCode, modifiers)) return true;
            return true;
        }

        if (selectedCategory == IRC_CATEGORY_INDEX && ircSelMessageIndex >= 0
                && keyCode == GLFW.GLFW_KEY_C && (modifiers & GLFW.GLFW_MOD_CONTROL) != 0
                && !ircInput.isFocused() && !searchInput.isFocused()) {
            String sel = getIrcSelectionText();
            if (!sel.isEmpty()) {
                try {
                    mc.keyboard.setClipboard(sel);
                } catch (Exception ignored) {
                }
            }
            return true;
        }

        if (selectedCategory == IRC_CATEGORY_INDEX && ircInput.isFocused()) {
            if (keyCode == GLFW.GLFW_KEY_ENTER && (modifiers & GLFW.GLFW_MOD_SHIFT) == 0) {
                sendIrcMessage();
                return true;
            }
            if (ircInput.keyPressed(keyCode, modifiers)) return true;
            return true;
        }

        if (selectedCategory == AI_CATEGORY_INDEX && aiInput.isFocused()) {
            if (keyCode == GLFW.GLFW_KEY_V && (modifiers & GLFW.GLFW_MOD_CONTROL) != 0) {
                pasteImageFromClipboard();
                aiInput.pasteFromClipboard();
                return true;
            }
            if (keyCode == GLFW.GLFW_KEY_ENTER && (modifiers & GLFW.GLFW_MOD_SHIFT) == 0) {
                sendAiMessage();
                return true;
            }
            if (aiInput.keyPressed(keyCode, modifiers)) return true;
            return true;
        }

        if (bindingFunction != null) {
            if (keyCode == GLFW.GLFW_KEY_ESCAPE || keyCode == GLFW.GLFW_KEY_BACKSPACE || keyCode == GLFW.GLFW_KEY_DELETE) {
                bindingFunction.setBind(0);
            } else if (keyCode != GLFW.GLFW_KEY_LEFT_SHIFT && keyCode != GLFW.GLFW_KEY_RIGHT_SHIFT
                    && keyCode != GLFW.GLFW_KEY_LEFT_CONTROL && keyCode != GLFW.GLFW_KEY_RIGHT_CONTROL
                    && keyCode != GLFW.GLFW_KEY_LEFT_ALT && keyCode != GLFW.GLFW_KEY_RIGHT_ALT) {
                bindingFunction.setBind(keyCode);
            }
            bindingFunction = null;
            return true;
        }

        if (CsStringComponent.focusedStringComp != null) {
            CsStringComponent.focusedStringComp.keyPressed(keyCode);
            return true;
        }

        return super.keyPressed(keyInput);
    }

    @Override
    public boolean charTyped(CharInput charInput) {
        if (CsSettingComponent.listeningBooleanComp != null) return true;
        if (CsSettingComponent.listeningBindComp != null) return true;

        if (CsColorPicker.get() != null) {
            CsColorPicker.get().charTyped((char) charInput.codepoint());
            return true;
        }

        if (CsStringComponent.focusedStringComp != null) {
            char chr = (char) charInput.codepoint();
            if (chr >= 32 && chr != 127) {
                CsStringComponent.focusedStringComp.charTyped(chr);
            }
            return true;
        }

        if (searchInput.isFocused()) {
            searchInput.charTyped((char) charInput.codepoint());
            return true;
        }

        if (themeNameInput.isFocused()) {
            themeNameInput.charTyped((char) charInput.codepoint());
            return true;
        }

        if (configNameInput.isFocused()) {
            configNameInput.charTyped((char) charInput.codepoint());
            return true;
        }

        if (selectedCategory == IRC_CATEGORY_INDEX && ircInput.isFocused()) {
            ircInput.charTyped((char) charInput.codepoint());
            return true;
        }

        if (selectedCategory == AI_CATEGORY_INDEX && aiInput.isFocused()) {
            aiInput.charTyped((char) charInput.codepoint());
            return true;
        }

        return super.charTyped(charInput);
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
        float fbW = mc.getWindow().getFramebufferWidth();
        float fbH = mc.getWindow().getFramebufferHeight();
        double scaleX = (double) fbW / width;
        double scaleY = (double) fbH / height;
        mouseX *= scaleX;
        mouseY *= scaleY;
        float miniW = 225f;
        float areaX = (fbW - PANEL_WIDTH) / 2f + miniW + 2f;
        float areaY = (fbH - PANEL_HEIGHT) / 2f + 75f + 2f;
        float areaW = PANEL_WIDTH - miniW - 2f;
        float areaH = PANEL_HEIGHT - 75f - 2f;

        if (mouseX >= areaX && mouseX <= areaX + areaW && mouseY >= areaY && mouseY <= areaY + areaH) {
            if (selectedCategory == AI_CATEGORY_INDEX) {
                float contentX = (fbW - PANEL_WIDTH) / 2f + miniW + 2f + 12f;
                if (aiShowChatsList && mouseX >= contentX && mouseX <= contentX + 150f) {
                    aiChatsTargetScrollY -= verticalAmount * 24.0;
                } else {
                    if (verticalAmount > 0) aiAutoScroll = false;
                    aiTargetScrollY -= verticalAmount * 35.0;
                }
            } else if (selectedCategory == IRC_CATEGORY_INDEX && searchInput.getText().isEmpty()) {
                if (verticalAmount > 0) ircAutoScroll = false;
                ircTargetScrollY -= verticalAmount * 35.0;
            } else if (selectedCategory == THEMES_CATEGORY_INDEX && searchInput.getText().isEmpty()) {
                themesTargetScrollOffset -= (float) verticalAmount * 52.5f;
            } else if (selectedCategory == CONFIG_CATEGORY_INDEX && searchInput.getText().isEmpty()) {
                configTargetScrollOffset -= (float) verticalAmount * 52.5f;
            } else {
                moduleTargetScrollOffset -= (float) verticalAmount * 52.5f;
            }
            return true;
        }
        return super.mouseScrolled(mouseX, mouseY, horizontalAmount, verticalAmount);
    }
}
