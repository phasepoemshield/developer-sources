package fun.wonderful.client.modules.impl.render;

import com.mojang.blaze3d.systems.RenderSystem;
import fun.wonderful.Wonderful;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventRender;
import fun.wonderful.api.utils.animation.AnimationUtils;
import fun.wonderful.api.utils.animation.Easings;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.math.HoveringUtils;
import fun.wonderful.api.utils.render.RenderUtils;
import fun.wonderful.api.utils.render.fonts.msdf.Font;
import fun.wonderful.api.utils.render.fonts.msdf.Fonts;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.impl.render.base.InterfaceProcessing;
import fun.wonderful.client.modules.impl.render.base.implement.HelperBinds;
import fun.wonderful.client.modules.impl.render.base.implement.Information;
import fun.wonderful.client.modules.impl.render.base.implement.KeyBinds;
import fun.wonderful.client.modules.impl.render.base.implement.Notifications;
import fun.wonderful.client.modules.impl.render.base.implement.Potions;
import fun.wonderful.client.modules.impl.render.base.implement.StaffList;
import fun.wonderful.client.modules.impl.render.base.implement.TargetHud;
import fun.wonderful.client.modules.impl.render.base.implement.WaterMark;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.ListSetting;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.util.math.MatrixStack;

public class Interface
extends Module {
    public static Interface INSTANCE = new Interface();
    private static final ConcurrentHashMap<String, Long> PERF_WARNINGS = new ConcurrentHashMap();
    private static final boolean PERF_DEBUG = Boolean.parseBoolean(System.getProperty("wonderful.perf.debug", "false"));
    private static final long SLOW_HUD_ELEMENT_NANOS = Long.getLong("wonderful.perf.hudMs", 5L) * 1000000L;
    private static final long PERF_WARN_COOLDOWN_NANOS = Long.getLong("wonderful.perf.cooldownMs", 1000L) * 1000000L;
    private final WaterMark waterMark;
    private final KeyBinds keyBinds;
    private final HelperBinds helperBinds;
    private final Potions potions;
    private final Notifications notifications;
    private final TargetHud targetHud;
    private final Information information;
    private final StaffList staffList;
    private boolean targetHudMenuOpen;
    private float targetHudMenuX;
    private float targetHudMenuY;
    private InterfaceProcessing hudContextElement;
    private InterfaceProcessing pendingHudContextElement;
    private float pendingTargetHudMenuX;
    private float pendingTargetHudMenuY;
    private final AnimationUtils targetHudMenuAnimation = new AnimationUtils(0.0f, 12.5f, Easings.CUBIC_OUT);
    private final AnimationUtils targetHudParticlesBgAnimation = new AnimationUtils(1.0f, 15.0f, Easings.CUBIC_OUT);
    private final AnimationUtils targetHudParticlesCircleAnimation = new AnimationUtils(1.0f, 8.2f, Easings.BACK_OUT);
    private final AnimationUtils targetHudBarSwitchAnimation = new AnimationUtils(0.0f, 7.0f, Easings.CUBIC_OUT);
    private final AnimationUtils waterMarkFpsBgAnimation = new AnimationUtils(1.0f, 15.0f, Easings.CUBIC_OUT);
    private final AnimationUtils waterMarkFpsCircleAnimation = new AnimationUtils(1.0f, 8.2f, Easings.BACK_OUT);
    private final AnimationUtils waterMarkTimeBgAnimation = new AnimationUtils(1.0f, 15.0f, Easings.CUBIC_OUT);
    private final AnimationUtils waterMarkTimeCircleAnimation = new AnimationUtils(1.0f, 8.2f, Easings.BACK_OUT);
    private final AnimationUtils waterMarkUsernameBgAnimation = new AnimationUtils(1.0f, 15.0f, Easings.CUBIC_OUT);
    private final AnimationUtils waterMarkUsernameCircleAnimation = new AnimationUtils(1.0f, 8.2f, Easings.BACK_OUT);
    private final AnimationUtils waterMarkMsBgAnimation = new AnimationUtils(1.0f, 15.0f, Easings.CUBIC_OUT);
    private final AnimationUtils waterMarkMsCircleAnimation = new AnimationUtils(1.0f, 8.2f, Easings.BACK_OUT);
    private final AnimationUtils waterMarkServerBgAnimation = new AnimationUtils(1.0f, 15.0f, Easings.CUBIC_OUT);
    private final AnimationUtils waterMarkServerCircleAnimation = new AnimationUtils(1.0f, 8.2f, Easings.BACK_OUT);
    private final AnimationUtils waterMarkTpsBgAnimation = new AnimationUtils(1.0f, 15.0f, Easings.CUBIC_OUT);
    private final AnimationUtils waterMarkTpsCircleAnimation = new AnimationUtils(1.0f, 8.2f, Easings.BACK_OUT);
    private static final String HUD_HINT_TEXT = "ПКМ - по элементу для открытия настроек";
    private final ListSetting hudModules = new ListSetting("Элементы", new BooleanSetting("Ватермарка", true), new BooleanSetting("Горячие клавиши", true), new BooleanSetting("Серверные бинды", true), new BooleanSetting("Зелья", true), new BooleanSetting("Таргет худ", true), new BooleanSetting("Уведомления", true), new BooleanSetting("Стафф", true), new BooleanSetting("Информация", true));

    public Interface() {
        super("Interface", "Интерфейс клиента", Module.ModuleCategory.RENDER);
        this.addSettings(this.hudModules);
        this.waterMark = new WaterMark(Wonderful.draggable(this, "WaterMark", 10.0f, 10.0f));
        this.keyBinds = new KeyBinds(Wonderful.draggable(this, "KeyBinds", 30.0f, 30.0f));
        this.helperBinds = new HelperBinds(Wonderful.draggable(this, "HelperBinds", 90.0f, 30.0f));
        this.potions = new Potions(Wonderful.draggable(this, "Potions", 30.0f, 60.0f));
        this.staffList = new StaffList(Wonderful.draggable(this, "StaffList", 60.0f, 100.0f));
        this.information = new Information(Wonderful.draggable(this, "Information", 50.0f, 100.0f));
        this.notifications = new Notifications(Wonderful.draggable(this, "Notifications", 0.0f, 0.0f));
        this.targetHud = new TargetHud(Wonderful.draggable(this, "TargetHud", 30.0f, 90.0f));
    }

    private Font issue(int size) {
        return Fonts.getFont("sf_regular", size);
    }

    private int fadeColorSafe(int color, float progress, int minAlpha) {
        int faded = ColorUtils.applyAlpha(color, progress);
        int a2 = ColorUtils.getAlpha(faded);
        if (a2 == 0 && progress > 0.001f) {
            return ColorUtils.setAlphaColor(faded, minAlpha);
        }
        return faded;
    }

    private int fadeTextAlphaSafe(float progress, int maxAlpha, int minAlpha) {
        int alpha = MathHelper.clamp((int)((int)((float)maxAlpha * progress)), (int)0, (int)maxAlpha);
        if (alpha == 0 && progress > 0.001f) {
            return minAlpha;
        }
        return alpha;
    }

    private int getThemeColor() {
        if (!Wonderful.INSTANCE.themeStorage.getThemes().getTheme().getName().equals("Rainbow")) {
            return Wonderful.INSTANCE.themeStorage.getThemes().getTheme().color[0];
        }
        return ColorUtils.getThemeColor();
    }

    private boolean isHudElementHovered(InterfaceProcessing element, double mouseX, double mouseY) {
        float width = element.draggable.getWidth();
        float height = element.draggable.getHeight();
        if (width <= 1.0f || height <= 1.0f) {
            return false;
        }
        return HoveringUtils.isHovered(mouseX, mouseY, element.draggable.getX(), element.draggable.getY(), width, height);
    }

    private boolean isHudElementEnabled(InterfaceProcessing element) {
        return element != null && element.draggable.getWidth() > 1.0f && element.draggable.getHeight() > 1.0f;
    }

    private InterfaceProcessing getHoveredHudElement(double mouseX, double mouseY) {
        if (this.isHudElementEnabled(this.targetHud) && this.isHudElementHovered(this.targetHud, mouseX, mouseY)) {
            return this.targetHud;
        }
        if (this.isHudElementEnabled(this.waterMark) && this.isHudElementHovered(this.waterMark, mouseX, mouseY)) {
            return this.waterMark;
        }
        if (this.isHudElementEnabled(this.keyBinds) && this.isHudElementHovered(this.keyBinds, mouseX, mouseY)) {
            return this.keyBinds;
        }
        if (this.isHudElementEnabled(this.helperBinds) && this.isHudElementHovered(this.helperBinds, mouseX, mouseY)) {
            return this.helperBinds;
        }
        if (this.isHudElementEnabled(this.potions) && this.isHudElementHovered(this.potions, mouseX, mouseY)) {
            return this.potions;
        }
        if (this.isHudElementEnabled(this.information) && this.isHudElementHovered(this.information, mouseX, mouseY)) {
            return this.information;
        }
        if (this.isHudElementEnabled(this.staffList) && this.isHudElementHovered(this.staffList, mouseX, mouseY)) {
            return this.staffList;
        }
        if (this.isHudElementEnabled(this.notifications) && this.isHudElementHovered(this.notifications, mouseX, mouseY)) {
            return this.notifications;
        }
        return null;
    }

    private float getTargetHudMenuWidth() {
        return 100.0f;
    }

    private float getMenuHeightForElement(InterfaceProcessing element) {
        if (element == this.targetHud) {
            return 19.0f;
        }
        if (element == this.waterMark) {
            return 66.0f;
        }
        return 29.0f;
    }

    private boolean supportsHudContextMenu(InterfaceProcessing element) {
        return element == this.targetHud || element == this.waterMark;
    }

    private float getTargetHudMenuHeight() {
        return this.getMenuHeightForElement(this.hudContextElement);
    }

    private void clampTargetHudMenuToWindow(float menuWidth, float menuHeight) {
        if (mc == null || mc.getWindow() == null) {
            return;
        }
        float maxX = Math.max(2.0f, (float)mc.getWindow().getScaledWidth() - menuWidth - 2.0f);
        float maxY = Math.max(2.0f, (float)mc.getWindow().getScaledHeight() - menuHeight - 2.0f);
        this.targetHudMenuX = MathHelper.clamp((float)this.targetHudMenuX, (float)2.0f, (float)maxX);
        this.targetHudMenuY = MathHelper.clamp((float)this.targetHudMenuY, (float)2.0f, (float)maxY);
    }

    public boolean handleHudContextClick(double mouseX, double mouseY, int button) {
        InterfaceProcessing hoveredElement = this.getHoveredHudElement(mouseX, mouseY);
        if (button == 1 && hoveredElement != null && this.supportsHudContextMenu(hoveredElement)) {
            if (this.targetHudMenuOpen && this.hudContextElement == hoveredElement) {
                this.targetHudMenuOpen = false;
                this.pendingHudContextElement = null;
            } else if (this.targetHudMenuOpen && this.hudContextElement != null && this.hudContextElement != hoveredElement) {
                this.pendingHudContextElement = hoveredElement;
                float menuWidth = this.getTargetHudMenuWidth();
                float menuHeight = this.getMenuHeightForElement(hoveredElement);
                this.pendingTargetHudMenuX = hoveredElement.draggable.getX() + hoveredElement.draggable.getWidth() + 4.0f;
                this.pendingTargetHudMenuY = hoveredElement.draggable.getY() + 1.5f;
                float saveX = this.targetHudMenuX;
                float saveY = this.targetHudMenuY;
                this.targetHudMenuX = this.pendingTargetHudMenuX;
                this.targetHudMenuY = this.pendingTargetHudMenuY;
                this.clampTargetHudMenuToWindow(menuWidth, menuHeight);
                this.pendingTargetHudMenuX = this.targetHudMenuX;
                this.pendingTargetHudMenuY = this.targetHudMenuY;
                this.targetHudMenuX = saveX;
                this.targetHudMenuY = saveY;
                this.targetHudMenuOpen = false;
            } else {
                this.hudContextElement = hoveredElement;
                this.pendingHudContextElement = null;
                this.targetHudMenuOpen = true;
                float menuWidth = this.getTargetHudMenuWidth();
                float menuHeight = this.getTargetHudMenuHeight();
                this.targetHudMenuX = hoveredElement.draggable.getX() + hoveredElement.draggable.getWidth() + 4.0f;
                this.targetHudMenuY = hoveredElement.draggable.getY() + 1.5f;
                this.clampTargetHudMenuToWindow(menuWidth, menuHeight);
            }
            return true;
        }
        if (!this.targetHudMenuOpen || this.hudContextElement == null) {
            return false;
        }
        float menuWidth = this.getTargetHudMenuWidth();
        float menuHeight = this.getTargetHudMenuHeight();
        this.clampTargetHudMenuToWindow(menuWidth, menuHeight);
        float buttonGap = 3.0f;
        float buttonX = this.targetHudMenuX + 5.0f;
        float buttonW = (menuWidth - 10.0f - buttonGap) / 2.0f;
        float buttonH = 10.0f;
        float normalButtonX = buttonX;
        float unusualButtonX = buttonX + buttonW + buttonGap;
        boolean menuHovered = HoveringUtils.isHovered(mouseX, mouseY, this.targetHudMenuX, this.targetHudMenuY, menuWidth, menuHeight);
        if (button == 0 && !menuHovered && hoveredElement == this.hudContextElement) {
            this.targetHudMenuOpen = false;
            this.pendingHudContextElement = null;
            return false;
        }
        if (this.hudContextElement == this.targetHud) {
            float particlesToggleX = this.targetHudMenuX + menuWidth - 21.0f;
            float particlesToggleY = this.targetHudMenuY + 4.0f;
            boolean particlesHovered = HoveringUtils.isHovered(mouseX, mouseY, particlesToggleX, particlesToggleY, 16.0, 9.0);
            if (button == 0 && particlesHovered) {
                this.targetHud.setHeadParticlesEnabled(!this.targetHud.isHeadParticlesEnabled());
                return true;
            }
        } else if (this.hudContextElement == this.waterMark) {
            float baseY = this.targetHudMenuY + 4.5f;
            float toggleX = this.targetHudMenuX + menuWidth - 21.0f;
            boolean fpsHovered = HoveringUtils.isHovered(mouseX, mouseY, toggleX, baseY, 16.0, 9.0);
            boolean timeHovered = HoveringUtils.isHovered(mouseX, mouseY, toggleX, baseY + 10.0f, 16.0, 9.0);
            boolean msHovered = HoveringUtils.isHovered(mouseX, mouseY, toggleX, baseY + 20.0f, 16.0, 9.0);
            boolean serverHovered = HoveringUtils.isHovered(mouseX, mouseY, toggleX, baseY + 30.0f, 16.0, 9.0);
            boolean tpsHovered = HoveringUtils.isHovered(mouseX, mouseY, toggleX, baseY + 40.0f, 16.0, 9.0);
            boolean usernameHovered = HoveringUtils.isHovered(mouseX, mouseY, toggleX, baseY + 50.0f, 16.0, 9.0);
            if (button == 0 && fpsHovered) {
                this.waterMark.setShowFps(!this.waterMark.isShowFps());
                return true;
            }
            if (button == 0 && timeHovered) {
                this.waterMark.setShowTime(!this.waterMark.isShowTime());
                return true;
            }
            if (button == 0 && msHovered) {
                this.waterMark.setShowMs(!this.waterMark.isShowMs());
                return true;
            }
            if (button == 0 && serverHovered) {
                this.waterMark.setShowServer(!this.waterMark.isShowServer());
                return true;
            }
            if (button == 0 && tpsHovered) {
                this.waterMark.setShowTps(!this.waterMark.isShowTps());
                return true;
            }
            if (button == 0 && usernameHovered) {
                this.waterMark.setShowUsername(!this.waterMark.isShowUsername());
                return true;
            }
        }
        if (button == 0 || button == 1) {
            if (menuHovered) {
                return true;
            }
            if (hoveredElement != this.hudContextElement) {
                this.targetHudMenuOpen = false;
                this.pendingHudContextElement = null;
            }
        }
        return false;
    }

    public void renderHudContextMenu(DrawContext context, int mouseX, int mouseY) {
        if (this.hudContextElement != null && !this.isHudElementEnabled(this.hudContextElement)) {
            this.targetHudMenuOpen = false;
            this.hudContextElement = null;
            this.pendingHudContextElement = null;
        }
        this.targetHudMenuAnimation.update(this.targetHudMenuOpen ? 1.0f : 0.0f);
        float targetMenuProgress = MathHelper.clamp((float)this.targetHudMenuAnimation.getValue(), (float)0.0f, (float)1.0f);
        if (!this.targetHudMenuOpen && targetMenuProgress <= 0.01f) {
            if (this.pendingHudContextElement != null) {
                this.hudContextElement = this.pendingHudContextElement;
                this.pendingHudContextElement = null;
                this.targetHudMenuX = this.pendingTargetHudMenuX;
                this.targetHudMenuY = this.pendingTargetHudMenuY;
                this.targetHudMenuOpen = true;
            } else {
                this.hudContextElement = null;
            }
        }
        if (!this.targetHudMenuOpen && targetMenuProgress <= 0.01f && this.hudContextElement == null) {
            this.hudContextElement = null;
            return;
        }
        if (this.hudContextElement == null) {
            return;
        }
        if (!this.supportsHudContextMenu(this.hudContextElement)) {
            this.targetHudMenuOpen = false;
            this.hudContextElement = null;
            this.pendingHudContextElement = null;
            return;
        }
        boolean targetContext = this.hudContextElement == this.targetHud;
        boolean waterMarkContext = this.hudContextElement == this.waterMark;
        float menuWidth = this.getTargetHudMenuWidth();
        float menuHeight = this.getTargetHudMenuHeight();
        this.clampTargetHudMenuToWindow(menuWidth, menuHeight);
        float x2 = this.targetHudMenuX;
        float y2 = this.targetHudMenuY;
        int themeColor = this.getThemeColor();
        float contentProgress = MathHelper.clamp((float)((targetMenuProgress - 0.06f) / 0.94f), (float)0.0f, (float)1.0f);
        int textAlpha = this.fadeTextAlphaSafe(contentProgress, 255, 2);
        MatrixStack matrices = context.getMatrices();
        matrices.push();
        RenderUtils.drawDefaultHudPanel(matrices, x2, y2, menuWidth, menuHeight, 3.0f, 3.5f, ColorUtils.applyAlpha(ColorUtils.rgba(50, 50, 50, 255), targetMenuProgress), ColorUtils.applyAlpha(ColorUtils.darken(themeColor, 0.15f), targetMenuProgress), ColorUtils.applyAlpha(ColorUtils.darken(themeColor, 0.05f), targetMenuProgress));
        if (contentProgress <= 0.02f) {
            matrices.pop();
            return;
        }
        float buttonGap = 3.0f;
        float buttonX = x2 + 5.0f;
        float buttonW = (menuWidth - 10.0f - buttonGap) / 2.0f;
        float buttonH = 10.0f;
        float normalX = buttonX;
        float unusualX = buttonX + buttonW + buttonGap;
        int inactiveColor = ColorUtils.applyAlpha(ColorUtils.rgba(70, 70, 70, 255), contentProgress);
        int activeLeftColor = this.fadeColorSafe(ColorUtils.darken(themeColor, 0.4f), contentProgress, 2);
        int activeRightColor = this.fadeColorSafe(themeColor, contentProgress, 2);
        if (targetContext) {
            this.issue(12).drawStringWithFade(matrices, "Партиклы с головы", x2 + 4.7f, y2 + 7.5f, menuWidth - 28.0f, ColorUtils.rgba(255, 255, 255, textAlpha));
            this.targetHudParticlesBgAnimation.update(this.targetHud.isHeadParticlesEnabled() ? 1.0f : 0.0f);
            this.targetHudParticlesCircleAnimation.update(this.targetHud.isHeadParticlesEnabled() ? 1.0f : 0.0f);
            float bgProgress = this.targetHudParticlesBgAnimation.getValue();
            float circleProgress = this.targetHudParticlesCircleAnimation.getValue();
            int particlesOffColor = ColorUtils.darken(themeColor, 0.05f);
            int particlesColor = ColorUtils.interpolateColor(particlesOffColor, themeColor, bgProgress);
            float particlesToggleX = x2 + menuWidth - 21.0f;
            float particlesToggleY = y2 + 4.5f;
            RenderUtils.drawGradientRect(matrices, particlesToggleX, particlesToggleY, 16.0f, 9.0f, 3.0f, this.fadeColorSafe(particlesColor, contentProgress, 2), this.fadeColorSafe(ColorUtils.darken(particlesColor, 0.65f), contentProgress, 2));
            float particlesCircleX = particlesToggleX + 4.5f + circleProgress * 6.2f;
            RenderUtils.drawRoundCircle(matrices, particlesCircleX + 0.5f, particlesToggleY + 4.5f, 6.85f, ColorUtils.rgba(255, 255, 255, textAlpha));
        } else if (waterMarkContext) {
            float wmToggleX = x2 + menuWidth - 21.0f;
            float wmBaseY = y2 + 3.5f;
            float wmLabelX = x2 + 5.0f;
            this.drawWaterMarkToggle(matrices, "Отображать фпс", wmLabelX, wmToggleX, wmBaseY, this.waterMark.isShowFps(), this.waterMarkFpsBgAnimation, this.waterMarkFpsCircleAnimation, themeColor, contentProgress, textAlpha);
            this.drawWaterMarkToggle(matrices, "Отображать время", wmLabelX, wmToggleX, wmBaseY + 10.0f, this.waterMark.isShowTime(), this.waterMarkTimeBgAnimation, this.waterMarkTimeCircleAnimation, themeColor, contentProgress, textAlpha);
            this.drawWaterMarkToggle(matrices, "Отображать пинг", wmLabelX, wmToggleX, wmBaseY + 20.0f, this.waterMark.isShowMs(), this.waterMarkMsBgAnimation, this.waterMarkMsCircleAnimation, themeColor, contentProgress, textAlpha);
            this.drawWaterMarkToggle(matrices, "Отображать сервер", wmLabelX, wmToggleX, wmBaseY + 30.0f, this.waterMark.isShowServer(), this.waterMarkServerBgAnimation, this.waterMarkServerCircleAnimation, themeColor, contentProgress, textAlpha);
            this.drawWaterMarkToggle(matrices, "Отображать тпс", wmLabelX, wmToggleX, wmBaseY + 40.0f, this.waterMark.isShowTps(), this.waterMarkTpsBgAnimation, this.waterMarkTpsCircleAnimation, themeColor, contentProgress, textAlpha);
            this.drawWaterMarkToggle(matrices, "Отображать логин", wmLabelX, wmToggleX, wmBaseY + 50.0f, this.waterMark.isShowUsername(), this.waterMarkUsernameBgAnimation, this.waterMarkUsernameCircleAnimation, themeColor, contentProgress, textAlpha);
        }
        matrices.pop();
    }

    private void renderHudElement(InterfaceProcessing element, EventRender.Default event) {
        long start = PERF_DEBUG ? System.nanoTime() : 0L;
        element.draggable.beginRenderTilt(event.getContext().getMatrices());
        try {
            element.onRender(event);
        }
        finally {
            long elapsed;
            element.draggable.endRenderTilt(event.getContext().getMatrices());
            if (PERF_DEBUG && (elapsed = System.nanoTime() - start) >= SLOW_HUD_ELEMENT_NANOS) {
                this.logSlowHudElement(element, elapsed);
            }
        }
    }

    private void logSlowHudElement(InterfaceProcessing element, long elapsedNanos) {
        String name = element.getClass().getSimpleName();
        long now = System.nanoTime();
        Long lastWarn = PERF_WARNINGS.get(name);
        if (lastWarn != null && now - lastWarn < PERF_WARN_COOLDOWN_NANOS) {
            return;
        }
        PERF_WARNINGS.put(name, now);
        System.out.println(String.format(Locale.ROOT, "[PerfDebug] Slow HUD element: Interface -> %s took %.2f ms", name, (double)elapsedNanos / 1000000.0));
    }

    private void drawWaterMarkToggle(MatrixStack matrices, String label, float labelX, float toggleX, float toggleY, boolean enabled, AnimationUtils bgAnimation, AnimationUtils circleAnimation, int themeColor, float contentProgress, int textAlpha) {
        this.issue(12).draw(matrices, label, labelX, toggleY + 3.0f, ColorUtils.rgba(255, 255, 255, textAlpha));
        bgAnimation.update(enabled ? 1.0f : 0.0f);
        circleAnimation.update(enabled ? 1.0f : 0.0f);
        float bgProgress = bgAnimation.getValue();
        float circleProgress = circleAnimation.getValue();
        int offColor = ColorUtils.darken(themeColor, 0.05f);
        int toggleColor = ColorUtils.interpolateColor(offColor, themeColor, bgProgress);
        RenderUtils.drawGradientRect(matrices, toggleX, toggleY, 16.0f, 9.0f, 3.0f, this.fadeColorSafe(toggleColor, contentProgress, 2), this.fadeColorSafe(ColorUtils.darken(toggleColor, 0.65f), contentProgress, 2));
        float circleX = toggleX + 4.5f + circleProgress * 6.2f;
        RenderUtils.drawRoundCircle(matrices, circleX + 0.5f, toggleY + 4.5f, 6.85f, ColorUtils.rgba(255, 255, 255, textAlpha));
    }

    public Map<String, InterfaceProcessing> getConfigurableHudElements() {
        LinkedHashMap<String, InterfaceProcessing> elements = new LinkedHashMap<String, InterfaceProcessing>();
        elements.put("waterMark", this.waterMark);
        elements.put("keyBinds", this.keyBinds);
        elements.put("helperBinds", this.helperBinds);
        elements.put("potions", this.potions);
        elements.put("notifications", this.notifications);
        elements.put("targetHud", this.targetHud);
        elements.put("information", this.information);
        elements.put("staffList", this.staffList);
        return elements;
    }

    @EventLink(priority=-200)
    public void onEvent(EventRender.Default event) {
        boolean showWaterMark = this.hudModules.is("Ватермарка");
        boolean showKeyBinds = this.hudModules.is("Горячие клавиши");
        boolean showHelperBinds = this.hudModules.is("Серверные бинды");
        boolean showPotions = this.hudModules.is("Зелья");
        boolean showInformation = this.hudModules.is("Информация");
        boolean showStaff = this.hudModules.is("Стафф");
        boolean showNotifications = this.hudModules.is("Уведомления");
        boolean showTargetHud = this.hudModules.is("Таргет худ");
        if (mc != null && mc.getWindow() != null && Interface.mc.currentScreen instanceof ChatScreen) {
            Font hintFont = this.issue(18);
            float x2 = (float)mc.getWindow().getScaledWidth() * 0.5f - hintFont.getWidth(HUD_HINT_TEXT) * 0.5f;
            hintFont.draw(event.getContext().getMatrices(), HUD_HINT_TEXT, x2, 40.0f, -1);
        }
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        try {
            if (showWaterMark) {
                this.renderHudElement(this.waterMark, event);
            }
            if (showKeyBinds) {
                this.renderHudElement(this.keyBinds, event);
            }
            if (showHelperBinds) {
                this.renderHudElement(this.helperBinds, event);
            }
            if (showPotions) {
                this.renderHudElement(this.potions, event);
            }
            if (showInformation) {
                this.renderHudElement(this.information, event);
            }
            if (showStaff) {
                this.renderHudElement(this.staffList, event);
            }
            if (showNotifications) {
                this.renderHudElement(this.notifications, event);
            }
            if (showTargetHud) {
                this.renderHudElement(this.targetHud, event);
            }
        }
        finally {
            RenderSystem.depthMask((boolean)true);
            RenderSystem.enableDepthTest();
        }
        if (!(Interface.mc.currentScreen instanceof ChatScreen)) {
            this.targetHudMenuOpen = false;
            this.pendingHudContextElement = null;
        }
    }
}