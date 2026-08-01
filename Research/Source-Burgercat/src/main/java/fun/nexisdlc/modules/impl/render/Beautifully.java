package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontObject;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@FunctionAdd(name = "Beautifully", alias = "Beautifully", category = Category.Render,
        description = "Улучшения визуала ванильного Minecraft")
public class Beautifully extends Function {
    private static final List<WidgetDrawCall> WIDGETS = new ArrayList<>();
    private static final List<TextDrawCall> TEXTS = new ArrayList<>();

    public final BooleanSetting customButtonWidgets = new BooleanSetting("Кастомные кнопки-виджеты", false);

    public final BooleanSetting highlightInventoryPotions = new BooleanSetting("Подсветка зелей в инве", true);

    public final SliderSetting saturation = new SliderSetting("Насыщенность", 1.2f, 0.0f, 2.0f, 0.05f);
    public final SliderSetting warmth = new SliderSetting("Теплота", 0, 0.0f, 1.0f, 0.05f);

    public Beautifully() {
        addSettings(customButtonWidgets, highlightInventoryPotions, saturation, warmth);
    }

    public static boolean shouldRenderCustomButtonWidgets() {
        var manager = Nexis.getFunctionManager();
        if (manager == null || manager.getBeautifully() == null) {
            return false;
        }
        Beautifully beautifully = manager.getBeautifully();
        return beautifully.isState() && beautifully.customButtonWidgets.get();
    }

    public static void queueButton(ClickableWidget widget) {
        queue(widget, false, 0.0f);
    }

    public static void queueSlider(ClickableWidget widget, double value) {
        queue(widget, true, (float) value);
    }

    public static boolean shouldRenderCustomMenuText() {
        return false;
    }

    public static boolean shouldHighlightInventoryPotions() {
        var manager = Nexis.getFunctionManager();
        if (manager == null || manager.getBeautifully() == null) {
            return false;
        }
        Beautifully beautifully = manager.getBeautifully();
        return beautifully.isState() && beautifully.highlightInventoryPotions.get();
    }

    public static boolean shouldApplyColorGrading() {
        var manager = Nexis.getFunctionManager();
        if (manager == null || manager.getBeautifully() == null) {
            return false;
        }
        Beautifully beautifully = manager.getBeautifully();
        return beautifully.isState() && (beautifully.saturation.get() != 0.0f || beautifully.warmth.get() != 0.0f);
    }

    public static float getSaturation() {
        var manager = Nexis.getFunctionManager();
        if (manager == null || manager.getBeautifully() == null) {
            return 1.0f;
        }
        return manager.getBeautifully().saturation.get();
    }

    public static float getWarmth() {
        var manager = Nexis.getFunctionManager();
        if (manager == null || manager.getBeautifully() == null) {
            return 0.0f;
        }
        return manager.getBeautifully().warmth.get();
    }

    public static int getPotionHighlightColor(ItemStack stack) {
        if (stack == null || stack.isEmpty()) {
            return 0;
        }

        PotionContentsComponent contents = stack.getOrDefault(DataComponentTypes.POTION_CONTENTS, PotionContentsComponent.DEFAULT);
        boolean hasBeneficial = false;
        boolean hasHarmful = false;
        for (StatusEffectInstance effect : contents.getEffects()) {
            StatusEffectCategory category = effect.getEffectType().value().getCategory();
            if (category == StatusEffectCategory.BENEFICIAL) {
                hasBeneficial = true;
            } else if (category == StatusEffectCategory.HARMFUL) {
                hasHarmful = true;
            }
        }

        if (!hasBeneficial && !hasHarmful) {
            return 0;
        }
        if (hasBeneficial && !hasHarmful) {
            return new Color(0, 255, 0, 90).getRGB();
        }
        if (hasHarmful && !hasBeneficial) {
            return new Color(255, 0, 0, 90).getRGB();
        }
        return 0;
    }

    public static void queueMenuText(String text, float x, float y, int color, boolean centered) {
        if (text == null || text.isBlank() || !shouldRenderCustomMenuText()) {
            return;
        }
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null || client.getWindow() == null) {
            return;
        }
        float scale = (float) client.getWindow().getScaleFactor();
        TEXTS.add(new TextDrawCall(text, x * scale, y * scale, normalizeColor(color), centered, scale));
    }

    private static void queue(ClickableWidget widget, boolean slider, float value) {
        if (widget == null || !shouldRenderCustomButtonWidgets()) {
            return;
        }

        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null || client.getWindow() == null) {
            return;
        }

        float scale = (float) client.getWindow().getScaleFactor();
        WIDGETS.add(new WidgetDrawCall(
                widget.getX() * scale,
                widget.getY() * scale,
                widget.getWidth() * scale,
                widget.getHeight() * scale,
                widget.getMessage(),
                widget.isHovered(),
                widget.isFocused(),
                widget.active,
                Math.max(0.0f, Math.min(1.0f, widget.getAlpha())),
                slider,
                Math.max(0.0f, Math.min(1.0f, value)),
                scale
        ));
    }

    @EventHandler
    public void onRender(EventRender.Screen.OverGui event) {
        if (WIDGETS.isEmpty() && TEXTS.isEmpty()) {
            return;
        }

        if (!customButtonWidgets.get()) {
            WIDGETS.clear();
        }

        Renderer2D r = event.getRenderer();
        for (TextDrawCall text : TEXTS) {
            renderText(r, text);
        }
        TEXTS.clear();

        if (customButtonWidgets.get()) {
            for (WidgetDrawCall widget : WIDGETS) {
                renderWidget(r, widget);
            }
        }
        WIDGETS.clear();
    }

    private static void renderWidget(Renderer2D r, WidgetDrawCall widget) {
        float rounding = 6.0f * widget.scale();
        float outlineWidth = Math.max(1.0f, widget.scale());
        float alpha = widget.alpha();


        int panelColor = ClientColors.applyAlpha(ClientColors.BACKGROUND.getRGB(), widget.alpha() * 0.5f);
        int headerColor = ClientColors.applyAlpha(new Color(195, 195, 195, 255).getRGB(), widget.alpha());
        int rowColor = !widget.hovered()
                ? panelColor
                : ColorUtils.rgba(255, 255, 255, Math.round((widget.active() ? 16 : 8) * alpha));

        int outlineColor = ColorUtils.rgba(125, 125, 125, Math.round((widget.hovered() ? 145 : 84) * alpha));
        int textColor = widget.active()
                ? ColorUtils.rgba(235, 235, 245, Math.round((widget.hovered() ? 255 : 225) * alpha))
                : ColorUtils.rgba(155, 155, 165, Math.round(170 * alpha));

        r.blur(widget.x(), widget.y(), widget.w(), widget.h(), rounding, 0.85f * alpha);
        r.rect(widget.x(), widget.y(), widget.w(), widget.h(), rounding, rowColor);


        if (widget.slider()) {
            renderSlider(r, widget, textColor);
        } else {
            renderLabel(r, widget, textColor);
        }
    }

    private static void renderSlider(Renderer2D r, WidgetDrawCall widget, int textColor) {
        float scale = widget.scale();
        float indicatorW = Math.max(2.0f, 6.0f * scale);
        float indicatorX = widget.x() + Math.max(0.0f, widget.w() - indicatorW) * widget.value();

        renderLabel(r, widget, textColor);
        r.rect(indicatorX, widget.y(), indicatorW, widget.h(), 2.0f * scale,
                ColorUtils.rgba(136, 121, 207, Math.round(115 * widget.alpha())));
    }

    private static void renderLabel(Renderer2D r, WidgetDrawCall widget, int textColor) {
        String label = widget.message().getString();
        if (label.isBlank()) {
            return;
        }

        FontObject font = FontRegistry.SF_MEDIUM;
        float size = Math.max(10.0f, 9.0f * widget.scale());
        float textWidth = font.getWidth(label, size);
        float x = widget.x() + (widget.w() - textWidth) * 0.5f;
        float y = widget.y() + widget.h() * 0.5f + FontRegistry.centeredBaselineOffset(font, 'H', size);
        r.text(font, x, y, size, label, textColor);
    }

    private static void renderText(Renderer2D r, TextDrawCall text) {
        FontObject font = FontRegistry.SF_MEDIUM;
        if (font == null) {
            return;
        }
        float size = Math.max(10.0f, 9.0f * text.scale());
        float baseline = text.y() + size * 0.5f + FontRegistry.centeredBaselineOffset(font, 'H', size);
        if (text.centered()) {
            r.centredText(font, text.x(), baseline, size, text.text(), text.color());
        } else {
            r.text(font, text.x(), baseline, size, text.text(), text.color());
        }
    }

    private static int normalizeColor(int color) {
        return (color & 0xFF000000) == 0 ? color | 0xFF000000 : color;
    }

    private record WidgetDrawCall(
            float x,
            float y,
            float w,
            float h,
            Text message,
            boolean hovered,
            boolean focused,
            boolean active,
            float alpha,
            boolean slider,
            float value,
            float scale
    ) {
    }

    private record TextDrawCall(
            String text,
            float x,
            float y,
            int color,
            boolean centered,
            float scale
    ) {
    }
}
