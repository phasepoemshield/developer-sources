package moscow.rockstar.ui.menu.dropdown.components.settings.impl;

import moscow.rockstar.Rockstar;
import moscow.rockstar.framework.base.CustomComponent;
import moscow.rockstar.framework.base.UIContext;
import moscow.rockstar.framework.msdf.Font;
import moscow.rockstar.framework.msdf.Fonts;
import moscow.rockstar.framework.objects.BorderRadius;
import moscow.rockstar.framework.objects.MouseButton;
import moscow.rockstar.systems.localization.Localizator;
import moscow.rockstar.config.settings.ModeSetting;
import moscow.rockstar.ui.menu.dropdown.components.settings.MenuSettingComponent;
import moscow.rockstar.util.colors.Colors;
import moscow.rockstar.util.game.cursor.CursorType;
import moscow.rockstar.util.game.cursor.CursorUtility;
import moscow.rockstar.util.gui.GuiUtility;
import moscow.rockstar.util.render.DrawUtility;
import moscow.rockstar.util.render.ScissorUtility;
import moscow.rockstar.util.render.penis.PenisPlayer;

import java.util.HashMap;
import java.util.Map;

/**
 * Финальная реализация ModeSettingComponent.
 * Поддерживает независимую бегущую строку для каждого элемента списка.
 */
public class ModeSettingComponent extends MenuSettingComponent<ModeSetting> {
    private boolean initialized;

    // Хранилище индивидуальных состояний скролла для каждой опции (Value)
    private final Map<ModeSetting.Value, ValueScroll> scrollMap = new HashMap<>();

    public ModeSettingComponent(ModeSetting setting, CustomComponent parent) {
        super(setting, parent);
    }

    @Override
    protected void renderComponent(UIContext context) {
        // Инициализация ресурсов при первом запуске
        if (!this.initialized) {
            for (ModeSetting.Value value : this.setting.getValues()) {
                value.setEnablePenis(new PenisPlayer(Rockstar.id("penises/check_enable.penis")));
                value.setDisablePenis(new PenisPlayer(Rockstar.id("penises/check_disable.penis")));
                value.setLastState(value.isSelected());
                value.setCurrentPenis(value.isLastState() ? value.getEnablePenis() : value.getDisablePenis());

                if (value.isLastState()) {
                    value.getEnablePenis().playOnce();
                } else {
                    value.getDisablePenis().setFrame(0);
                    value.getDisablePenis().stop();
                }
            }
            this.initialized = true;
        }

        // Параметры отрисовки основного контейнера
        float xPos = this.x + 9.0f;
        float yPos = this.y + 1.0f;
        float menuWidth = this.width - 18.0f;
        Font mainFont = Fonts.REGULAR.getFont(8.0f);
        float headerHeight = 19.0f;

        // 1. Отрисовка названия настройки (Заголовок)
        this.hoverAnimation.update(this.isHovered(context.getMouseX(), context.getMouseY()));
        this.drawSettingName(context, mainFont, Localizator.translate(this.setting.getName()),
                this.x + 10.0f, yPos - 1.0f + GuiUtility.getMiddleOfBox(mainFont.height(), headerHeight),
                Colors.getTextColor().withAlpha(255.0f * (0.75f + 0.25f * this.hoverAnimation.getValue())),
                this.getParent().getWidth() - 10.0f);

        // 2. Отрисовка подложки списка
        float listHeight = (float)(8 + this.setting.getValues().size() * 12);
        context.drawRoundedRect(xPos - 1.0f, yPos + 17.0f, menuWidth + 2.0f, listHeight, BorderRadius.all(6.0f), Colors.getBackgroundColor().withAlpha(76.5f));

        float verticalOffset = 0.0f;
        Font valueFont = Fonts.REGULAR.getFont(7.0f);

        // 3. Цикл отрисовки элементов (Value)
        for (ModeSetting.Value value : this.setting.getValues()) {
            if (value.isHidden()) continue;

            // Обновление анимаций выбора (галочек)
            boolean selected = value.isSelected();
            if (selected != value.isLastState()) {
                value.setCurrentPenis(selected ? value.getEnablePenis() : value.getDisablePenis());
                value.getCurrentPenis().playOnce();
                value.setLastState(selected);
            }
            value.getCurrentPenis().update();

            // Координаты конкретной строки
            float itemY = yPos + 20.0f + verticalOffset;
            float itemHeight = 12.0f;
            boolean isRowHovered = GuiUtility.isHovered(xPos - 1.0f, itemY, menuWidth + 2.0f, itemHeight, context.getMouseX(), context.getMouseY());

            if (isRowHovered) CursorUtility.set(CursorType.HAND);
            value.getHoverAnimation().update(isRowHovered);
            value.getActiveAnimation().update(selected);

            // --- ЛОГИКА БЕГУЩЕЙ СТРОКИ ---
            String valName = Localizator.translate(value.getName());
            float valWidth = valueFont.width(valName);
            float maxValWidth = menuWidth - 22.0f; // Место для текста до иконки

            // Обработка скролла
            ValueScroll scroll = scrollMap.computeIfAbsent(value, v -> new ValueScroll());
            scroll.tick(valWidth, maxValWidth, isRowHovered);

            float drawX = xPos + 7.0f;
            float drawY = yPos + 24.5f + verticalOffset;

            // Обрезка текста (Scissor)
            ScissorUtility.push(context.getMatrices(), drawX, drawY - 2f, maxValWidth, valueFont.height() + 4f);

            // Отрисовка едущего текста
            context.drawFadeoutText(
                    valueFont,
                    valName,
                    drawX - scroll.offset,
                    drawY,
                    Colors.getTextColor().withAlpha(255.0f * (0.75f + 0.25f * value.getHoverAnimation().getValue() + 0.25f * value.getActiveAnimation().getValue())),
                    0.96f, // Плавное исчезновение у правого края
                    1.0f,
                    maxValWidth + scroll.offset
            );

            ScissorUtility.pop();

            // 4. Отрисовка иконки статуса (PenisPlayer)
            if (value.getActiveAnimation().getValue() > 0.0f || value.getCurrentPenis().isPlaying()) {
                DrawUtility.drawAnimationSprite(context.getMatrices(), value.getCurrentPenis().getCurrentSprite(),
                        xPos + menuWidth - 11.0f - value.getActiveAnimation().getValue() * 2.0f,
                        yPos + 24.0f + verticalOffset, 6.0f, 6.0f,
                        Colors.getTextColor().mulAlpha(0.1f + 0.9f * value.getActiveAnimation().getValue()));
            }

            verticalOffset += 12.0f;
        }
    }

    /**
     * Внутренний класс для вычисления смещения бегущей строки.
     */
    private static class ValueScroll {
        float offset = 0;
        long lastMs = System.currentTimeMillis();
        long pauseUntil = 0;
        boolean forward = true;

        void tick(float textW, float maxW, boolean hovered) {
            long now = System.currentTimeMillis();
            float delta = (now - lastMs) / 1000f; // Дельта времени в секундах
            lastMs = now;

            // Если текст влезает — скролл не нужен
            if (textW <= maxW) {
                offset = 0;
                return;
            }

            if (hovered) {
                if (now > pauseUntil) {
                    float speed = 35f; // Пикселей в секунду
                    float limit = textW - maxW;

                    if (forward) {
                        offset += delta * speed;
                        if (offset >= limit) {
                            offset = limit;
                            forward = false;
                            pauseUntil = now + 600; // Пауза в конце
                        }
                    } else {
                        offset -= delta * speed;
                        if (offset <= 0) {
                            offset = 0;
                            forward = true;
                            pauseUntil = now + 1000; // Пауза в начале
                        }
                    }
                }
            } else if (offset > 0) {
                // Плавный возврат в исходную позицию при уходе курсора
                offset = Math.max(0, offset - delta * 60f);
                forward = true;
                pauseUntil = now + 400;
            }
        }
    }

    @Override
    public void drawSplit(UIContext context) {
        context.drawRect(this.x, this.y + this.height, this.width, 0.5f, Colors.getTextColor().withAlpha(5.1f));
    }

    @Override
    public void onMouseClicked(double mouseX, double mouseY, MouseButton button) {
        if (button != MouseButton.LEFT) return;
        float verticalOffset = 0.0f;
        for (ModeSetting.Value value : this.setting.getValues()) {
            if (value.isHidden()) continue;
            if (GuiUtility.isHovered(this.x + 8.0f, this.y + 20.0f + verticalOffset, this.width - 16.0f, 12.0, mouseX, mouseY)) {
                value.select();
            }
            verticalOffset += 12.0f;
        }
        super.onMouseClicked(mouseX, mouseY, button);
    }

    @Override
    public float getHeight() {
        this.height = 31 + this.setting.getValues().size() * 12;
        return this.height;
    }
}