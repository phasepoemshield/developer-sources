package fun.nexisdlc.ui.hud;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.ui.HudTheme;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.render.Interface;

import java.awt.*;

/**
 * Компонент для отображения переключателя (toggle) в настройках HUD.
 */
public class HudToggleComponent {

    private static final float TEXT_SIZE = 13f;
    private static final float ROW_PAD_X = 14f;
    private static final float ROW_PAD_Y = 2f;
    private static final float ROW_ROUND = 8f;
    private static final float TOGGLE_W = 32f;
    private static final float TOGGLE_H = 16f;
    private static final float TOGGLE_PAD = 6f;

    private final SimpleLinearAnimation toggleAnimation;
    private final String draggingName;
    private final String optionKey;
    private final boolean defaultValue;
    private final String label;

    public HudToggleComponent(String draggingName, String optionKey, boolean defaultValue, String label) {
        this.draggingName = draggingName;
        this.optionKey = optionKey;
        this.defaultValue = defaultValue;
        this.label = label;
        this.toggleAnimation = new SimpleLinearAnimation(180);
        if (DraggingManager.getHudBoolean(draggingName, optionKey, defaultValue)) {
            toggleAnimation.show();
        } else {
            toggleAnimation.hide();
        }
    }

    /**
     * Обновляет состояние анимации переключателя.
     */
    public void updateAnimation() {
        if (DraggingManager.getHudBoolean(draggingName, optionKey, defaultValue)) {
            toggleAnimation.show();
        } else {
            toggleAnimation.hide();
        }
    }

    /**
     * Рисует компонент переключателя.
     *
     * @param render Renderer2D объект для рисования
     * @param x      X координата
     * @param y      Y координата
     * @param mouseX X координата мыши
     * @param mouseY Y координата мыши
     * @param alpha  Прозрачность
     */
    public void draw(Renderer2D render, float x, float y, int mouseX, int mouseY, int alpha) {
        int a = (int) alpha;
        float rowX = x + ROW_PAD_X;
        float rowY = y + ROW_PAD_Y;
        float rowW = width - ROW_PAD_X * 2f; // Ширина передается как параметр
        float rowH = height - ROW_PAD_Y * 2f; // Высота передается как параметр

        boolean isHovered = isHovered(mouseX, mouseY, rowX, rowY, rowW, rowH);
        if (isHovered) {
            hoverAnimation.show();
        } else {
            hoverAnimation.hide();
        }

        float hoverProgress = hoverAnimation.getProgress();
        int bg = new Color(18, 18, 22, (int) (a * (0.18f + 0.06f * hoverProgress))).getRGB();
        render.rect(rowX, rowY, rowW, rowH, Interface.getHudRounding(ROW_ROUND), bg);

        updateAnimation(); // Обновляем анимацию перед рисованием
        float toggleProgress = toggleAnimation.getProgress();

        String originalLabel = label;
        String truncatedLabel = truncateText(originalLabel, 20); // Ограничиваем до 20 символов
        int textColor = interpolateColor(
                new Color(Math.round(HudTheme.getTextDimR() * 255f), Math.round(HudTheme.getTextDimG() * 255f), Math.round(HudTheme.getTextDimB() * 255f), a),
                new Color(Math.round(HudTheme.getTextR() * 255f), Math.round(HudTheme.getTextG() * 255f), Math.round(HudTheme.getTextB() * 255f), a),
                toggleProgress
        );

        float textWidth = textWidth(truncatedLabel, TEXT_SIZE);
        float availableWidth = rowW - TOGGLE_W - TOGGLE_PAD - 16f;

        float baseline = centeredTextBaseline(rowY, rowH, TEXT_SIZE);
        enableTextScissor(rowX + 8f, baseline - textLineHeight(TEXT_SIZE) / 2, availableWidth, textLineHeight(TEXT_SIZE) * 1.5f);

        render.text(FontRegistry.SF_MEDIUM, rowX + 8f + textOffsetX, baseline, TEXT_SIZE, truncatedLabel, textColor);

        disableTextScissor();

        float toggleX = rowX + rowW - TOGGLE_W - TOGGLE_PAD;
        float toggleY = rowY + (rowH - TOGGLE_H) * 0.5f;

        int trackColor = new Color(
                Math.round(HudTheme.getCardR() * 255f),
                Math.round(HudTheme.getCardG() * 255f),
                Math.round(HudTheme.getCardB() * 255f),
                (int) (a * 0.6f)
        ).getRGB();
        int fillColor = new Color(
                Math.round(HudTheme.getAccentR() * 255f),
                Math.round(HudTheme.getAccentG() * 255f),
                Math.round(HudTheme.getAccentB() * 255f),
                (int) (a * 0.9f * toggleProgress)
        ).getRGB();

        render.rect(toggleX, toggleY, TOGGLE_W, TOGGLE_H, Interface.getHudRounding(TOGGLE_H * 0.5f), trackColor);
        if (toggleProgress > 0.01) {
            render.rect(toggleX, toggleY, TOGGLE_W, TOGGLE_H, Interface.getHudRounding(TOGGLE_H * 0.5f), fillColor);
        }

        float knobSize = TOGGLE_H - 4f;
        float knobX = toggleX + 2f + (TOGGLE_W - knobSize - 4f) * toggleProgress;
        int knobColor = new Color(
                Math.round(HudTheme.getTextR() * 255f),
                Math.round(HudTheme.getTextG() * 255f),
                Math.round(HudTheme.getTextB() * 255f),
                a
        ).getRGB();
        render.rect(knobX, toggleY + 2f, knobSize, knobSize, Interface.getHudRounding(knobSize * 0.5f), knobColor);
    }

    /**
     * Проверяет, находится ли курсор мыши над компонентом.
     *
     * @param mouseX X координата мыши
     * @param mouseY Y координата мыши
     * @param x      X координата компонента
     * @param y      Y координата компонента
     * @param w      Ширина компонента
     * @param h      Высота компонента
     * @return true если курсор над компонентом
     */
    private boolean isHovered(int mouseX, int mouseY, float x, float y, float w, float h) {
        return mouseX >= x && mouseX <= x + w && mouseY >= y && mouseY <= y + h;
    }

    /**
     * Интерполирует цвета.
     *
     * @param low Начальный цвет
     * @param high Конечный цвет
     * @param p Прогресс интерполяции (от 0 до 1)
     * @return Интерполированный цвет
     */
    private int interpolateColor(Color low, Color high, float p) {
        int r = (int) (low.getRed() + (high.getRed() - low.getRed()) * p);
        int g = (int) (low.getGreen() + (high.getGreen() - low.getGreen()) * p);
        int b = (int) (low.getBlue() + (high.getBlue() - low.getBlue()) * p);
        int a = (int) (low.getAlpha() + (high.getAlpha() - low.getAlpha()) * p);
        return new Color(r, g, b, a).getRGB();
    }

    /**
     * Обрезает текст до заданного количества символов.
     *
     * @param text Текст
     * @param maxLength Максимальная длина
     * @return Обрезанный текст
     */
    private String truncateText(String text, int maxLength) {
        if (text == null || text.length() <= maxLength) {
            return text;
        }
        return text.substring(0, maxLength) + "...";
    }

    /**
     * Возвращает ширину текста.
     *
     * @param text Текст
     * @param size Размер шрифта
     * @return Ширина текста
     */
    private float textWidth(String text, float size) {
        return FontRegistry.SF_MEDIUM.getWidth(text, size);
    }

    /**
     * Возвращает высоту строки текста.
     *
     * @param size Размер шрифта
     * @return Высота строки
     */
    private float textLineHeight(float size) {
        return size * 1.2f; // Приблизительное значение высоты строки
    }

    /**
     * Возвращает базовую линию для центрирования текста.
     *
     * @param y Координата Y
     * @param h Высота области
     * @param size Размер шрифта
     * @return Базовая линия
     */
    private float centeredTextBaseline(float y, float h, float size) {
        return y + h / 2f + FontRegistry.centeredBaselineOffset(FontRegistry.SF_MEDIUM, 'H', size);
    }

    /**
     * Включает обрезку текста.
     *
     * @param x      X координата
     * @param y      Y координата
     * @param width  Ширина области обрезки
     * @param height Высота области обрезки
     */
    private void enableTextScissor(float x, float y, float width, float height) {
        // Реализация обрезки текста (если требуется)
    }

    /**
     * Отключает обрезку текста.
     */
    private void disableTextScissor() {
        // Реализация отключения обрезки текста (если требуется)
    }

    // Эти переменные должны быть объявлены в классе или переданы как параметры
    private float width = 200f; // Пример значения, должно передаваться извне
    private float height = 24f; // Пример значения, должно передаваться извне
    private SimpleLinearAnimation hoverAnimation = new SimpleLinearAnimation(180);
    private float textOffsetX = 0f; // Смещение текста по X
}
