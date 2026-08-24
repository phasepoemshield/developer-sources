package moscow.rockstar.ui.menu.dropdown.components.settings;

import lombok.Generated;
import moscow.rockstar.Rockstar;
import moscow.rockstar.framework.base.CustomComponent;
import moscow.rockstar.framework.base.UIContext;
import moscow.rockstar.framework.msdf.Font;
import moscow.rockstar.systems.localization.Localizator;
import moscow.rockstar.config.Setting;
import moscow.rockstar.ui.components.popup.Popup;
import moscow.rockstar.ui.menu.dropdown.DropDownScreen;
import moscow.rockstar.ui.menu.dropdown.components.module.ModuleComponent;
import moscow.rockstar.util.animation.base.Animation;
import moscow.rockstar.util.animation.base.Easing;
import moscow.rockstar.util.colors.ColorRGBA;
import moscow.rockstar.util.render.ScissorUtility;

import java.util.HashMap;
import java.util.Map;

/**
 * Базовый компонент для отрисовки настроек в чит-клиенте Rockstar.
 * Реализует логику плавного появления, отображения описаний и
 * динамическую бегущую строку для длинных названий.
 */
public abstract class MenuSettingComponent<T extends Setting> extends CustomComponent {

    private final CustomComponent parent;
    protected final T setting;

    private final Animation visibilityAnimation = new Animation(300L, Easing.BAKEK_PAGES);
    protected final Animation hoverAnimation = new Animation(300L, Easing.FIGMA_EASE_IN_OUT);

    // --- Система множественного скролла ---
    // Храним данные скролла для каждой уникальной строки текста
    private final Map<String, ScrollState> scrollStates = new HashMap<>();

    // === Настройки динамического скролла ===
    private static final float BASE_SCROLL_SPEED = 15f;
    private static final float MAX_SCROLL_SPEED  = 60f;
    private static final long SCROLL_PAUSE = 800L;
    private static final long REVERSE_PAUSE = 450L;

    public MenuSettingComponent(T setting, CustomComponent parent) {
        this.parent = parent;
        this.setting = setting;
    }

    @Override
    public void update(UIContext context) {
        ModuleComponent component;
        String translatedDescription = Localizator.translateOrEmpty(this.setting.getDescription());
        CustomComponent customComponent = this.parent;

        if (customComponent instanceof ModuleComponent &&
                ((component = (ModuleComponent) customComponent).getParent().isHovered(context) && this.isHovered(context)
                        || Rockstar.getInstance().getMenuScreen() instanceof DropDownScreen)) {

            if (Rockstar.getInstance().getMenuScreen() instanceof DropDownScreen screen) {
                screen.setDesc(Localizator.translate(translatedDescription));
            }
        }

        if (this.parent instanceof Popup && this.isHovered(context)) {
            Rockstar.getInstance().getHud().setDesc(Localizator.translate(translatedDescription));
        }

        super.update(context);
    }

    @Override
    public void onInit() {
        super.onInit();
    }

    public float getOpacity() {
        return this.visibilityAnimation.getValue();
    }

    public void drawRegular8(UIContext context) {
    }

    public void drawSplit(UIContext context) {
    }

    /**
     * Стандартный вызов для заголовка (использует общий hovered компонента)
     */
    protected void drawSettingName(UIContext context, Font font, String text, float x, float y, ColorRGBA color, float maxWidth) {
        drawSettingName(context, font, text, x, y, color, maxWidth, this.isHovered(context.getMouseX(), context.getMouseY()));
    }

    /**
     * Универсальный метод отрисовки названия с динамическим скроллом.
     * @param hoveredOverride передаем true, если наведена мышь конкретно на эту строку (для ModeSetting)
     */
    protected void drawSettingName(UIContext context, Font font, String text, float x, float y, ColorRGBA color, float maxWidth, boolean hoveredOverride) {
        float textWidth = font.width(text);

        if (textWidth <= maxWidth) {
            context.drawText(font, text, x, y, color);
            return;
        }

        // Получаем состояние скролла именно для этого текста
        ScrollState s = scrollStates.computeIfAbsent(text, k -> new ScrollState());

        long now = System.currentTimeMillis();
        float deltaTime = (float) (now - s.lastScrollTime);
        s.lastScrollTime = now;

        float maxScroll = textWidth - maxWidth;
        float overflowRatio = maxScroll / maxWidth;
        float speedFactor = Math.min(overflowRatio * 0.85f, 1.0f);
        float currentSpeed = BASE_SCROLL_SPEED + (MAX_SCROLL_SPEED - BASE_SCROLL_SPEED) * speedFactor;
        float scrollSpeed = currentSpeed / 1000f;

        if (hoveredOverride) {
            if (now >= s.scrollPauseUntil) {
                float delta = deltaTime * scrollSpeed;
                if (s.scrollForward) {
                    s.offset += delta;
                    if (s.offset >= maxScroll) {
                        s.offset = maxScroll;
                        s.scrollForward = false;
                        s.scrollPauseUntil = now + REVERSE_PAUSE;
                    }
                } else {
                    s.offset -= delta;
                    if (s.offset <= 0f) {
                        s.offset = 0f;
                        s.scrollForward = true;
                        s.scrollPauseUntil = now + REVERSE_PAUSE;
                    }
                }
            }
        } else if (s.offset > 0f) {
            s.offset = Math.max(0, s.offset - deltaTime * (scrollSpeed * 1.7f));
            s.scrollForward = true;
            s.scrollPauseUntil = now + SCROLL_PAUSE;
        }

        ScissorUtility.push(context.getMatrices(), x, y - 2f, maxWidth, font.height() + 4f);

        context.drawFadeoutText(
                font,
                text,
                x - s.offset,
                y,
                color,
                0.96f,
                1.0f,
                maxWidth + s.offset
        );

        ScissorUtility.pop();
    }

    // Вспомогательный класс для хранения состояния каждой отдельной строки
    private static class ScrollState {
        float offset = 0f;
        boolean scrollForward = true;
        long scrollPauseUntil = System.currentTimeMillis() + SCROLL_PAUSE;
        long lastScrollTime = System.currentTimeMillis();
    }

    @Generated
    public CustomComponent getParent() {
        return this.parent;
    }

    @Generated
    public T getSetting() {
        return this.setting;
    }

    @Generated
    public Animation getVisibilityAnimation() {
        return this.visibilityAnimation;
    }

    @Generated
    public Animation getHoverAnimation() {
        return this.hoverAnimation;
    }
}