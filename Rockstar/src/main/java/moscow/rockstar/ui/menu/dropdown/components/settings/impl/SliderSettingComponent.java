package moscow.rockstar.ui.menu.dropdown.components.settings.impl;

import moscow.rockstar.framework.base.CustomComponent;
import moscow.rockstar.framework.base.UIContext;
import moscow.rockstar.framework.msdf.Font;
import moscow.rockstar.framework.msdf.Fonts;
import moscow.rockstar.framework.objects.BorderRadius;
import moscow.rockstar.framework.objects.MouseButton;
import moscow.rockstar.systems.localization.Localizator;
import moscow.rockstar.module.visuals.Interface;
import moscow.rockstar.config.settings.SliderSetting;
import moscow.rockstar.ui.components.textfield.TextField;
import moscow.rockstar.ui.menu.dropdown.components.settings.MenuSettingComponent;
import moscow.rockstar.util.animation.base.Animation;
import moscow.rockstar.util.animation.base.Easing;
import moscow.rockstar.util.colors.ColorRGBA;
import moscow.rockstar.util.colors.Colors;
import moscow.rockstar.util.game.cursor.CursorType;
import moscow.rockstar.util.game.cursor.CursorUtility;
import moscow.rockstar.util.gui.GuiUtility;
import moscow.rockstar.util.render.DrawUtility;
import moscow.rockstar.util.time.Timer;

public class SliderSettingComponent extends MenuSettingComponent<SliderSetting> {
    private final Animation animation = new Animation(350L, Easing.BACK_OUT);
    private final Animation moving = new Animation(500L, Easing.FIGMA_EASE_IN_OUT);
    private final Timer timer = new Timer();
    private boolean drag;
    /**
     * Текстовое поле для ручного ввода значения по ПКМ (как в Rockstar).
     * Когда {@link TextField#isFocused()} — поле перехватывает clavi/charTyped,
     * drag-режим не должен срабатывать. На Enter применяем значение, на ЛКМ
     * вне поля — отменяем (теряем введённое).
     */
    private final TextField numberField = new TextField(Fonts.REGULAR.getFont(7.0f));
    /** Кэш-зоны TextField, обновляется в renderComponent — нужно для onMouseClicked. */
    private float fieldX;
    private float fieldY;
    private float fieldW;
    private float fieldH;
    private static SliderSettingComponent current;

    public SliderSettingComponent(SliderSetting setting, CustomComponent parent) {
        super(setting, parent);
    }

    @Override
    protected void renderComponent(UIContext context) {
        float x = this.x + 9.0f;
        float y = this.y + 2.0f;
        float width = this.width - 18.0f;
        Font nameFont = Fonts.REGULAR.getFont(8.0f);
        float leftPadding = 10.0f;
        float nameHeight = Fonts.REGULAR.getFont(7.0f).height();
        float headerHeight = 19.0f;
        this.animation.update(((SliderSetting) this.setting).getCurrentValue());
        this.hoverAnimation.update(this.isHovered(context.getMouseX(), context.getMouseY()));
        context.drawRoundedRect(x, y + this.height - 12.0f, width, 2.0f, BorderRadius.all(0.25f), Colors.getAdditionalColor().withAlpha((255.0f - 100.0f * Interface.glass()) * 0.7f));
        context.drawRoundedRect(x, y + this.height - 12.0f, width * GuiUtility.getPercent(this.animation.getValue(), ((SliderSetting) this.setting).getMin(), ((SliderSetting) this.setting).getMax()), 2.0f, BorderRadius.all(0.25f), Colors.getAccent());
        if (this.timer.finished(1000L)) {
            DrawUtility.updateBuffer();
            this.timer.reset();
        }
        if (Interface.showGlass()) {
            context.drawShadow(x + width * GuiUtility.getPercent(this.animation.getValue(), ((SliderSetting) this.setting).getMin(), ((SliderSetting) this.setting).getMax()) - 4.5f - 3.0f * this.moving.getValue(), y + this.height - 11.0f - 3.0f - 2.0f * this.moving.getValue(), 9.0f + 6.0f * this.moving.getValue(), 6.0f + 4.0f * this.moving.getValue(), 10.0f, BorderRadius.all(3.0f + this.moving.getValue() * 2.0f), ColorRGBA.BLACK.withAlpha(255.0f * (0.25f + 0.2f * this.moving.getValue()) * Interface.glass()));
            context.drawSquircle(x + width * GuiUtility.getPercent(this.animation.getValue(), ((SliderSetting) this.setting).getMin(), ((SliderSetting) this.setting).getMax()) - 4.5f - 3.0f * this.moving.getValue(), y + this.height - 11.0f - 3.0f - 2.0f * this.moving.getValue(), 9.0f + 6.0f * this.moving.getValue(), 6.0f + 4.0f * this.moving.getValue(), 7.0f, BorderRadius.all(3.0f + this.moving.getValue()), ColorRGBA.WHITE.withAlpha(255.0f * (1.0f - this.moving.getValue()) * Interface.glass()));
            context.drawLiquidGlass(x + width * GuiUtility.getPercent(this.animation.getValue(), ((SliderSetting) this.setting).getMin(), ((SliderSetting) this.setting).getMax()) - 4.5f - 3.0f * this.moving.getValue(), y + this.height - 11.0f - 3.0f - 2.0f * this.moving.getValue(), 9.0f + 6.0f * this.moving.getValue(), 6.0f + 4.0f * this.moving.getValue(), 7.0f, BorderRadius.all(3.0f + this.moving.getValue()), ColorRGBA.WHITE.withAlpha(255.0f * this.moving.getValue() * Interface.glass()), true);
        }
        if (Interface.showMinimalizm()) {
            context.drawShadow(x + width * GuiUtility.getPercent(this.animation.getValue(), ((SliderSetting) this.setting).getMin(), ((SliderSetting) this.setting).getMax()) - 3.0f, y + this.height - 14.0f + this.moving.getValue(), 6.0f, 6.0f - this.moving.getValue() * 2.0f, 10.0f, BorderRadius.all(3.0f - this.moving.getValue() * 2.0f), ColorRGBA.BLACK.withAlpha(63.75f * Interface.minimalizm()));
            context.drawRoundedRect(x + width * GuiUtility.getPercent(this.animation.getValue(), ((SliderSetting) this.setting).getMin(), ((SliderSetting) this.setting).getMax()) - 3.0f, y + this.height - 14.0f + this.moving.getValue(), 6.0f, 6.0f - this.moving.getValue() * 2.0f, BorderRadius.all(3.0f - this.moving.getValue() * 2.0f), ColorRGBA.WHITE.withAlpha(255.0f * Interface.minimalizm()));
        }

        String value = formatSliderValue(this.animation.getValue(), ((SliderSetting) this.setting).getStep()) + ((SliderSetting) this.setting).getSuffix();

        // ── Зона текста значения / TextField для ручного ввода ──────────────
        // Текст рисуется выровненным по правому краю на (x + width). Высота
        // зоны = высота шрифта значения. Кэшируем границы — нужны в
        // onMouseClicked и для clamp-проверки ЛКМ вне поля.
        Font valueFont = Fonts.REGULAR.getFont(7.0f);
        float valueTextWidth = valueFont.width(value);
        // Ширина зоны: не уже самого значения, не уже минимума 24 px (для пустого поля).
        float fieldWidth = Math.max(valueTextWidth + 4.0f, 24.0f);
        this.fieldX = x + width - fieldWidth;
        this.fieldY = y + 11.0f - nameHeight - 1.0f;
        this.fieldW = fieldWidth;
        this.fieldH = nameHeight + 2.0f;

        this.drawSettingName(context, nameFont, Localizator.translate(((SliderSetting) this.setting).getName()), this.x + leftPadding, y + 11.0f - nameFont.height(), Colors.getTextColor().withAlpha(255.0f * (0.75f + 0.25f * this.hoverAnimation.getValue())), this.getParent().getWidth() - leftPadding - valueTextWidth - 10.0f);

        if (this.numberField.isFocused()) {
            // В режиме ручного ввода рисуем поле вместо текста значения.
            this.numberField.set(this.fieldX, this.fieldY, this.fieldW, this.fieldH);
            this.numberField.setAlpha(1.0f);
            this.numberField.setTextColor(Colors.getTextColor());
            this.numberField.render(context);
        } else {
            context.drawRightText(valueFont, value, x + width, y + 11.0f - nameHeight, Colors.getTextColor().withAlpha(255.0f * (0.75f + 0.25f * this.hoverAnimation.getValue())));
        }
        if (this.isHovered(context.getMouseX(), context.getMouseY())) {
            CursorUtility.set(CursorType.HAND);
        }
        this.moving.setDuration(200L);
        this.moving.update(this.drag ? 1.0f : 0.0f);
        if (this.drag && !this.numberField.isFocused()) {
            float xValue = GuiUtility.getSliderValue(((SliderSetting) this.setting).getMin(), ((SliderSetting) this.setting).getMax(), x, width, context.getMouseX());
            ((SliderSetting) this.setting).setCurrentValue(xValue);
            CursorUtility.set(CursorType.ARROW_HORIZONTAL);
            current = this;
        }
    }

    private String formatSliderValue(double number, float step) {
        int decimals = 0;
        if (step < 1f) {
            String s = Float.toString(step);
            int dot = s.indexOf('.');
            if (dot >= 0) {
                decimals = Math.min(s.substring(dot + 1).replaceAll("0+$", "").length(), 2);
            }
        }

        // Форматируем с нужным кол-вом знаков
        String formatted = String.format("%." + decimals + "f", number).replace(",", ".");

        // Убираем trailing zeros и лишнюю точку: 1.00 -> 1, 1.20 -> 1.2, 1.02 -> 1.02
        if (formatted.contains(".")) {
            formatted = formatted.replaceAll("0+$", "").replaceAll("\\.$", "");
        }

        return formatted;
    }

    @Override
    public void drawSplit(UIContext context) {
        float separatorHeight = 0.5f;
        context.drawRect(this.x, this.y + this.height, this.width, separatorHeight, Colors.getTextColor().withAlpha(5.1f));
    }

    @Override
    public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
        // ── Активный TextField — приоритетная ветка ─────────────────────────
        // ЛКМ внутри зоны поля — отдаём клик ему (фокус остаётся, курсор
        // переставляется). ЛКМ или ПКМ вне зоны — снимаем фокус БЕЗ apply
        // (как в Rockstar: чтобы случайно не записать введённое половину).
        if (this.numberField.isFocused()) {
            boolean inside = mouseX >= this.fieldX && mouseX <= this.fieldX + this.fieldW
                    && mouseY >= this.fieldY && mouseY <= this.fieldY + this.fieldH;
            if (inside) {
                this.numberField.onMouseClicked(mouseX, mouseY, button);
            } else {
                this.numberField.setFocused(false);
                this.numberField.clear();
            }
            super.onMouseClicked(mouseX, mouseY, button);
            return;
        }
        // ── ПКМ по строке слайдера — открываем числовой ввод ────────────────
        if (button == MouseButton.RIGHT && this.isHovered(mouseX, mouseY)) {
            SliderSetting s = (SliderSetting) this.setting;
            String pre = formatSliderValue(s.getCurrentValue(), s.getStep());
            this.numberField.clear();
            this.numberField.paste(pre);
            this.numberField.setFocused(true);
            super.onMouseClicked(mouseX, mouseY, button);
            return;
        }
        // ── Стандартное поведение: ЛКМ → drag ───────────────────────────────
        if (button == MouseButton.LEFT && this.isHovered(mouseX, mouseY)) {
            this.drag = true;
            current = this;
        }
        super.onMouseClicked(mouseX, mouseY, button);
    }

    @Override
    public void onMouseReleased(double mouseX, double mouseY, MouseButton button) {
        this.drag = false;
        if (this.numberField.isFocused()) {
            this.numberField.onMouseReleased(mouseX, mouseY, button);
        }
        super.onMouseReleased(mouseX, mouseY, button);
    }

    @Override
    public void onKeyPressed(int keyCode, int scanCode, int modifiers) {
        // ── TextField активен: Enter применяет, Esc отменяет ────────────────
        if (this.numberField.isFocused()) {
            if (keyCode == 257 || keyCode == 335) { // Enter / NumpadEnter
                applyNumberFieldValue();
                return;
            }
            if (keyCode == 256) { // Escape — отмена
                this.numberField.setFocused(false);
                this.numberField.clear();
                return;
            }
            // Стрелки/Backspace/Ctrl+A/копирование — это всё работа поля.
            this.numberField.onKeyPressed(keyCode, scanCode, modifiers);
            return;
        }
        // ── Стрелочная регулировка — только если поле НЕ в фокусе ───────────
        if ((keyCode == 262 || keyCode == 263) && current == this) {
            SliderSetting s = (SliderSetting) current.getSetting();
            s.setCurrentValue(s.getCurrentValue() + s.getStep() * 0.7f * (float) (keyCode == 262 ? 1 : -1));
        }
    }

    @Override
    public boolean charTyped(char chr, int modifiers) {
        if (!this.numberField.isFocused()) {
            return false;
        }
        // Числовой фильтр (как Rockstar.sanitizeNumericText, но на лету): пускаем
        // только цифры, точку, запятую (нормализуется в '.'), и минус — но
        // только в начале строки (для отрицательных значений).
        if (chr >= '0' && chr <= '9') {
            return this.numberField.charTyped(chr, modifiers);
        }
        if (chr == '.' || chr == ',') {
            // Запретим вторую точку.
            if (this.numberField.getBuiltText().indexOf('.') < 0
                    && this.numberField.getBuiltText().indexOf(',') < 0) {
                return this.numberField.charTyped('.', modifiers);
            }
            return false;
        }
        if (chr == '-' && this.numberField.getBuiltText().isEmpty()) {
            return this.numberField.charTyped(chr, modifiers);
        }
        // Любой другой символ глушим.
        return false;
    }

    /**
     * Парсит содержимое {@link #numberField}, clamp'ит в [min, max], квантизует
     * к шагу setting'а и применяет. Поле после этого расфокусируется и
     * очищается. На пустую/невалидную строку — просто закрываем поле без apply.
     */
    private void applyNumberFieldValue() {
        String raw = this.numberField.getBuiltText().replace(',', '.').trim();
        this.numberField.setFocused(false);
        this.numberField.clear();
        if (raw.isEmpty() || raw.equals("-") || raw.equals(".") || raw.equals("-.")) {
            return;
        }
        float parsed;
        try {
            parsed = Float.parseFloat(raw);
        } catch (NumberFormatException nfe) {
            return;
        }
        if (Float.isNaN(parsed) || Float.isInfinite(parsed)) {
            return;
        }
        SliderSetting s = (SliderSetting) this.setting;
        float min = s.getMin();
        float max = s.getMax();
        float step = s.getStep();
        // Clamp
        float clamped = Math.max(min, Math.min(max, parsed));
        // Квантизация к шагу (если step > 0). Округляем вниз через Math.round.
        if (step > 0f) {
            float steps = Math.round((clamped - min) / step);
            clamped = min + steps * step;
            // Защита от floating-point вылета за max после умножения шагов.
            if (clamped > max) clamped = max;
            if (clamped < min) clamped = min;
        }
        s.setCurrentValue(clamped);
    }

    @Override
    public float getHeight() {
        this.height = 29.0f;
        return 29.0f;
    }
}