package fun.wonderful.client.modules.impl.render.base.implement;

import fun.wonderful.Wonderful;
import fun.wonderful.api.events.implement.EventRender;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.animation.AnimationUtils;
import fun.wonderful.api.utils.animation.Easings;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.draggable.Draggable;
import fun.wonderful.api.utils.input.KeyBoardUtils;
import fun.wonderful.api.utils.render.RenderUtils;
import fun.wonderful.api.utils.render.fonts.msdf.Font;
import fun.wonderful.api.utils.render.fonts.msdf.Fonts;
import fun.wonderful.api.utils.scissor.ScissorUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.impl.render.base.InterfaceProcessing;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.util.math.MatrixStack;

public class KeyBinds
extends InterfaceProcessing {
    private static final int HUD_TEXT_COLOR = ColorUtils.rgb(227, 227, 227);
    private static final int HUD_SEPARATOR_COLOR = ColorUtils.rgba(185, 185, 185, 140);
    private static final float HUD_RADIUS = 3.0f;
    private final Map<Module, AnimationUtils> animations = new HashMap<Module, AnimationUtils>();
    private final AnimationUtils widthAnimation = new AnimationUtils(60.0f, 10.5f, Easings.QUAD_OUT);
    private static final Map<Character, Character> RU_TO_EN = new HashMap<Character, Character>();

    public KeyBinds(Draggable draggable) {
        super(draggable);
    }

    private Font issue(int size) {
        return Fonts.getFont("sf_regular", size);
    }

    private Font icon(int size) {
        return Fonts.getFont("wonderful", size);
    }

    private AnimationUtils getAnimation(Module module) {
        return this.animations.computeIfAbsent(module, m2 -> new AnimationUtils(0.0f, 10.5f, Easings.QUAD_OUT));
    }

    private String toEnglish(String text) {
        StringBuilder result = new StringBuilder();
        for (char c2 : text.toCharArray()) {
            result.append(RU_TO_EN.getOrDefault(Character.valueOf(c2), Character.valueOf(c2)));
        }
        return result.toString();
    }

    @Override
    public void onRender(EventRender.Default eventRender) {
        this.DefaultStyle(eventRender);
        super.onRender(eventRender);
    }

    public void DefaultStyle(EventRender.Default eventRender) {
        AnimationUtils anim;
        float baseX = this.draggable.getX();
        float y2 = this.draggable.getY();
        int colorTheme = !Wonderful.INSTANCE.themeStorage.getThemes().getTheme().getName().equals("Rainbow") ? Wonderful.INSTANCE.themeStorage.getThemes().getTheme().color[0] : ColorUtils.getThemeColor();
        float targetWidth = 64.0f;
        float targetHeight = 16.0f;
        int visibleCount = 0;
        for (Module module : ModuleClass.INSTANCE.getObject()) {
            if (module.getKey() == -1) continue;
            anim = this.getAnimation(module);
            anim.update(module.isEnable() ? 1.0f : 0.0f);
        }
        for (Module module : ModuleClass.INSTANCE.getObject()) {
            float animValue;
            if (module.getKey() == -1 || !((animValue = (anim = this.getAnimation(module)).getValue()) > 0.01f)) continue;
            ++visibleCount;
            String keyName = this.toEnglish(KeyBoardUtils.getKeyName(module.getKey()));
            float keyWidth = this.issue(10).getWidth(keyName);
            float moduleWidth = this.issue(12).getWidth(module.getDisplayName()) + keyWidth + 25.0f;
            if (moduleWidth > targetWidth) {
                targetWidth = moduleWidth;
            }
            targetHeight += 11.0f * animValue;
        }
        if (visibleCount > 0) {
            targetHeight += 4.0f;
        }
        this.widthAnimation.update(targetWidth);
        float width = this.widthAnimation.getValue() + 7.0f;
        float height = targetHeight;
        float rightEdge = baseX + 60.0f;
        float x2 = rightEdge - width;
        float separatorX = x2 + 0.5f;
        float separatorY = y2 + 15.35f;
        float separatorWidth = width - 1.0f;
        this.drawFigmaPanel(eventRender.getContext().getMatrices(), x2, y2, width, height, colorTheme);
        this.issue(15).draw(eventRender.getContext().getMatrices(), "Keybinds", x2 + 5.0f, y2 + 6.0f, HUD_TEXT_COLOR);
        this.icon(13).draw(eventRender.getContext().getMatrices(), "A", rightEdge - 13.0f, y2 + 6.8f, colorTheme);
        if (visibleCount > 0) {
            this.drawHeaderSeparator(eventRender.getContext().getMatrices(), separatorX, separatorY, separatorWidth);
        }
        float offsetY = 19.5f;
        for (Module module : ModuleClass.INSTANCE.getObject()) {
            AnimationUtils anim2;
            float animValue;
            if (module.getKey() == -1 || !((animValue = (anim2 = this.getAnimation(module)).getValue()) > 0.01f)) continue;
            ScissorUtils.push();
            ScissorUtils.setFromComponentCoordinates(x2, y2, width, height);
            String keyName = this.toEnglish(KeyBoardUtils.getBindName(module.getKey()));
            float keyBoxWidth = Math.max(this.issue(10).getWidth(keyName) + 4.0f, 9.0f);
            int alpha = (int)(255.0f * animValue);
            int textColor = ColorUtils.setAlphaColor(HUD_TEXT_COLOR, alpha);
            int accentColor = ColorUtils.setAlphaColor(this.getStableThemeColor(), alpha);
            this.issue(13).draw(eventRender.getContext().getMatrices(), module.getDisplayName(), x2 + 5.4f, y2 + 1.5f + offsetY, textColor);
            float keyBoxX = rightEdge - keyBoxWidth - 4.5f;
            this.issue(12).drawCenteredString(eventRender.getContext().getMatrices(), keyName, keyBoxX + keyBoxWidth / 2.0f, y2 + offsetY + 2.2f, accentColor);
            offsetY += 11.0f * animValue;
            ScissorUtils.pop();
            ScissorUtils.unset();
        }
        this.draggable.setWidth(60.0f);
        this.draggable.setHeight(height);
    }

    private int getStableThemeColor() {
        if (!Wonderful.INSTANCE.themeStorage.getThemes().getTheme().getName().equals("Rainbow")) {
            return Wonderful.INSTANCE.themeStorage.getThemes().getTheme().color[0];
        }
        return ColorUtils.getThemeColor();
    }

    private void drawFigmaPanel(MatrixStack matrices, float x2, float y2, float width, float height, int themeColor) {
        int topColor = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.15f), 255);
        int bottomColor = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.05f), 255);
        RenderUtils.drawGradientRect(matrices, x2, y2, width, height, 3.0f, topColor, bottomColor);
    }

    private void drawHeaderSeparator(MatrixStack matrices, float x2, float y2, float width) {
        float snappedY = Math.round(y2);
        RenderUtils.drawRoundedRect(matrices, x2, snappedY, width, 0.6f, 0.0f, HUD_SEPARATOR_COLOR);
    }

    static {
        String ru = "йцукенгшщзхъфывапролджэячсмитьбюЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ";
        String en = "qwertyuiop[]asdfghjkl;'zxcvbnm,.QWERTYUIOP[]ASDFGHJKL;'ZXCVBNM,.";
        int length = Math.min(ru.length(), en.length());
        for (int i2 = 0; i2 < length; ++i2) {
            RU_TO_EN.put(Character.valueOf(ru.charAt(i2)), Character.valueOf(en.charAt(i2)));
        }
    }
}