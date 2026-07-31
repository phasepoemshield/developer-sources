package fun.wonderful.client.ui.clickgui;

import fun.wonderful.api.utils.animation.AnimationUtils;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.input.KeyBoardUtils;
import fun.wonderful.api.utils.render.RenderUtils;
import fun.wonderful.api.utils.render.fonts.msdf.Font;
import fun.wonderful.api.utils.render.fonts.msdf.Fonts;
import fun.wonderful.api.utils.scissor.ScissorUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.Setting;
import fun.wonderful.client.modules.settings.implement.BindSetting;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ListSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import fun.wonderful.client.modules.settings.implement.OpenScreenSetting;
import fun.wonderful.client.modules.settings.implement.TextSetting;
import fun.wonderful.client.ui.clickgui.ClickGuiLayout;
import fun.wonderful.client.ui.clickgui.ClickGuiState;
import java.util.List;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;

public class ClickGuiSettingRenderer {
    private static final float HOVER_SCROLL_OVERFLOW_THRESHOLD = 6.0f;

    public void render(DrawContext context, Module module, float panelX, float moduleY, float openProgress, int colorTheme, double mouseX, double mouseY, ClickGuiState state) {
        List<Setting> settings = module.getSettings();
        if (settings == null || settings.isEmpty() || openProgress <= 0.01f) {
            return;
        }
        float maxSettingHeight = ClickGuiLayout.calculateSettingsHeight(module);
        float settingsClipY = moduleY + 19.0f;
        float settingsClipHeight = maxSettingHeight * openProgress;
        ScissorUtils.push();
        ScissorUtils.setFromComponentCoordinates(panelX + 4.0f, settingsClipY, 102.0, settingsClipHeight);
        float settingYoffset = 19.0f;
        for (Setting setting : settings) {
            if (setting == null || !setting.visible().booleanValue()) continue;
            float settingY = moduleY + settingYoffset + 4.0f;
            int alpha = (int)(255.0f * openProgress);
            if (setting instanceof BooleanSetting) {
                BooleanSetting booleanSetting = (BooleanSetting)setting;
                this.renderBooleanSetting(context, panelX, settingY, alpha, colorTheme, mouseX, mouseY, booleanSetting, state);
                settingYoffset += 12.0f;
                continue;
            }
            if (setting instanceof TextSetting) {
                TextSetting textSetting = (TextSetting)setting;
                this.renderTextSetting(context, panelX, settingY, alpha, colorTheme, mouseX, mouseY, textSetting, state);
                settingYoffset += 12.0f;
                continue;
            }
            if (setting instanceof FloatSetting) {
                FloatSetting floatSetting = (FloatSetting)setting;
                this.renderFloatSetting(context, panelX, settingY, alpha, colorTheme, mouseX, mouseY, floatSetting, state);
                settingYoffset += 22.0f;
                continue;
            }
            if (setting instanceof ModeSetting) {
                ModeSetting modeSetting = (ModeSetting)setting;
                this.renderModeSetting(context, panelX, settingY, alpha, colorTheme, mouseX, mouseY, modeSetting, state);
                settingYoffset += ClickGuiLayout.calculateModeSettingHeight(modeSetting);
                continue;
            }
            if (setting instanceof ListSetting) {
                ListSetting listSetting = (ListSetting)setting;
                this.renderListSetting(context, panelX, settingY, alpha, colorTheme, mouseX, mouseY, listSetting, state);
                settingYoffset += ClickGuiLayout.calculateListSettingHeight(listSetting);
                continue;
            }
            if (setting instanceof BindSetting) {
                BindSetting bindSetting = (BindSetting)setting;
                this.renderBindSetting(context, panelX, settingY, alpha, colorTheme, mouseX, mouseY, bindSetting, state);
                settingYoffset += 12.0f;
                continue;
            }
            if (!(setting instanceof OpenScreenSetting)) continue;
            OpenScreenSetting openScreenSetting = (OpenScreenSetting)setting;
            this.renderOpenScreenSetting(context, panelX, settingY, alpha, colorTheme, mouseX, mouseY, openScreenSetting, state);
            settingYoffset += 12.0f;
        }
        ScissorUtils.pop();
    }

    private void renderBooleanSetting(DrawContext context, float panelX, float settingY, int alpha, int colorTheme, double mouseX, double mouseY, BooleanSetting booleanSetting, ClickGuiState state) {
        AnimationUtils backgroundAnimation = state.getBooleanBackgroundAnimation(booleanSetting);
        AnimationUtils circleAnimation = state.getBooleanCircleAnimation(booleanSetting);
        backgroundAnimation.update(booleanSetting.isState() ? 1.0f : 0.0f);
        circleAnimation.update(booleanSetting.isState() ? 1.0f : 0.0f);
        float backgroundProgress = backgroundAnimation.getValue();
        float circleProgress = circleAnimation.getValue();
        int offColor = ColorUtils.darken(colorTheme, 0.05f);
        int onColor = colorTheme;
        int r2 = (int)((float)(offColor >> 16 & 0xFF) + (float)((onColor >> 16 & 0xFF) - (offColor >> 16 & 0xFF)) * backgroundProgress);
        int g2 = (int)((float)(offColor >> 8 & 0xFF) + (float)((onColor >> 8 & 0xFF) - (offColor >> 8 & 0xFF)) * backgroundProgress);
        int b2 = (int)((float)(offColor & 0xFF) + (float)((onColor & 0xFF) - (offColor & 0xFF)) * backgroundProgress);
        int a2 = (int)((float)(offColor >> 24 & 0xFF) + (float)((onColor >> 24 & 0xFF) - (offColor >> 24 & 0xFF)) * backgroundProgress);
        int interpolatedColor = a2 << 24 | r2 << 16 | g2 << 8 | b2;
        float toggleX = panelX + 84.0f;
        float toggleY = settingY - 2.0f;
        float maxWidth = toggleX - 4.0f - (panelX + 10.0f);
        this.drawStringWithHoverScroll(this.issue(13), context.getMatrices(), booleanSetting.name(), panelX + 10.0f, settingY, maxWidth, this.getPrimarySettingColor(alpha), mouseX, mouseY, state, this.getSettingTextKey(booleanSetting));
        RenderUtils.drawRoundedRect(context.getMatrices(), toggleX, toggleY, 16.0f, 9.0f, 3.5f, ColorUtils.rgba(interpolatedColor >> 16 & 0xFF, interpolatedColor >> 8 & 0xFF, interpolatedColor & 0xFF, alpha));
        float travel = 7.0f;
        float circleCenterX = toggleX + 4.5f + circleProgress * travel;
        float circleCenterY = toggleY + 4.5f;
        RenderUtils.drawRoundCircle(context.getMatrices(), circleCenterX, circleCenterY, 7.0f, ColorUtils.rgba(255, 255, 255, alpha));
    }

    private void renderFloatSetting(DrawContext context, float panelX, float settingY, int alpha, int colorTheme, double mouseX, double mouseY, FloatSetting floatSetting, ClickGuiState state) {
        if (floatSetting.isActive()) {
            floatSetting.setValue(state.updateActiveSliderValue(floatSetting, mouseX));
        }
        AnimationUtils sliderAnimation = state.getSliderAnimation(floatSetting);
        sliderAnimation.update(state.getSliderPos(floatSetting));
        float animatedPos = sliderAnimation.getValue();
        String valueString = this.formatSliderValue(floatSetting);
        float valueX = panelX + 100.0f - this.issue(12).getWidth(valueString);
        float nameMaxWidth = valueX - 4.0f - (panelX + 10.0f);
        this.drawStringWithHoverScroll(this.issue(12), context.getMatrices(), floatSetting.name(), panelX + 10.0f, settingY + 1.0f, nameMaxWidth, this.getPrimarySettingColor(alpha), mouseX, mouseY, state, this.getSettingTextKey(floatSetting));
        this.issue(12).drawString(context.getMatrices(), valueString, valueX, settingY + 1.0f, ColorUtils.setAlphaColor(colorTheme, alpha));
        float trackY = settingY + 9.0f;
        float trackHeight = 4.5f;
        int sliderBackgroundColor = ColorUtils.setAlphaColor(ColorUtils.darken(colorTheme, 0.2f), alpha);
        float trackX = panelX + 10.0f;
        this.drawSliderPill(context.getMatrices(), trackX, trackY, 90.0f, trackHeight, sliderBackgroundColor);
        int sliderFillColor = ColorUtils.setAlphaColor(colorTheme, alpha);
        float fillWidth = animatedPos * 90.0f;
        if (fillWidth > 0.01f) {
            this.drawSliderPill(context.getMatrices(), trackX, trackY, fillWidth, trackHeight, sliderFillColor);
        }
        float handleSize = 6.0f;
        float handleCx = trackX + animatedPos * 90.0f;
        float handleCy = trackY + trackHeight / 2.0f;
        RenderUtils.drawRoundedRect(context.getMatrices(), handleCx - handleSize / 2.0f, handleCy - handleSize / 2.0f, handleSize, handleSize, handleSize / 2.0f, ColorUtils.setAlphaColor(-1, alpha));
    }

    private void drawSliderPill(MatrixStack matrices, float x2, float y2, float width, float height, int color) {
        if (width <= 0.01f) {
            return;
        }
        RenderUtils.drawRoundedRect(matrices, x2, y2, width, height, Math.min(width, height) / 3.0f, color);
    }

    private void renderTextSetting(DrawContext context, float panelX, float settingY, int alpha, int colorTheme, double mouseX, double mouseY, TextSetting textSetting, ClickGuiState state) {
        String value = textSetting.get();
        boolean editing = state.getEditingTextSetting() == textSetting;
        String preview = value == null || value.isEmpty() ? "..." : value;
        Object boxText = editing ? preview + "_" : preview;
        float boxWidth = 42.0f;
        float boxX = panelX + 58.0f;
        float boxHeight = 9.0f;
        float boxY = settingY - 2.5f;
        this.drawStringWithHoverScroll(this.issue(13), context.getMatrices(), textSetting.name(), panelX + 10.0f, settingY, boxX - 1.0f - (panelX + 10.0f), this.getPrimarySettingColor(alpha), mouseX, mouseY, state, this.getSettingTextKey(textSetting));
        int background = ColorUtils.setAlphaColor(editing ? colorTheme : ColorUtils.darken(colorTheme, 0.15f), alpha);
        int textColor = ColorUtils.setAlphaColor(-1, alpha);
        RenderUtils.drawRoundedRect(context.getMatrices(), boxX, boxY, boxWidth, boxHeight, 1.5f, background);
        ScissorUtils.push();
        ScissorUtils.setFromComponentCoordinates(boxX + 2.0f, boxY + 1.0f, boxWidth - 4.0f, boxHeight - 2.0f);
        this.issue(12).drawString(context.getMatrices(), (String)boxText, boxX + 3.0f, settingY + 1.0f, textColor);
        ScissorUtils.pop();
    }

    private void renderModeSetting(DrawContext context, float panelX, float settingY, int alpha, int colorTheme, double mouseX, double mouseY, ModeSetting modeSetting, ClickGuiState state) {
        this.drawStringWithHoverScroll(this.issue(12), context.getMatrices(), modeSetting.name(), panelX + 10.0f, settingY + 1.0f, 90.0f, this.getPrimarySettingColor(alpha), mouseX, mouseY, state, this.getSettingTextKey(modeSetting));
        float modeY = settingY + 10.0f;
        for (String mode : modeSetting.getMods()) {
            boolean selected = modeSetting.getCurrent().equals(mode);
            AnimationUtils animation = state.getModeAnimation(this.getModeKey(modeSetting, mode), selected);
            animation.update(selected ? 1.0f : 0.0f);
            float progress = animation.getValue();
            int outerColor = ColorUtils.setAlphaColor(colorTheme, (int)((float)alpha * (0.3f + 0.7f * progress)));
            int innerColor = selected ? ColorUtils.setAlphaColor(ColorUtils.darken(colorTheme, 0.4f), alpha) : ColorUtils.rgba(255, 255, 255, alpha);
            this.issue(13).draw(context.getMatrices(), mode, panelX + 10.0f, modeY, this.getSecondarySettingColor(alpha));
            float dotCenterX = panelX + 96.0f;
            float dotCenterY = modeY + 2.0f;
            RenderUtils.drawRoundCircle(context.getMatrices(), dotCenterX, dotCenterY, 9.0f, outerColor);
            RenderUtils.drawRoundCircle(context.getMatrices(), dotCenterX, dotCenterY, 6.0f - progress * 2.0f + 3.0f, innerColor);
            modeY += 10.0f;
        }
    }

    private void renderListSetting(DrawContext context, float panelX, float settingY, int alpha, int colorTheme, double mouseX, double mouseY, ListSetting listSetting, ClickGuiState state) {
        this.drawStringWithHoverScroll(this.issue(12), context.getMatrices(), listSetting.name(), panelX + 10.0f, settingY + 1.0f, 90.0f, this.getPrimarySettingColor(alpha), mouseX, mouseY, state, this.getSettingTextKey(listSetting));
        float listY = settingY + 10.0f;
        for (BooleanSetting entry : listSetting.getSettings()) {
            if (!entry.visible().booleanValue()) continue;
            boolean selected = entry.isState();
            AnimationUtils animation = state.getListAnimation(this.getListKey(listSetting, entry), selected);
            animation.update(selected ? 1.0f : 0.0f);
            float progress = animation.getValue();
            int outerColor = ColorUtils.setAlphaColor(colorTheme, (int)((float)alpha * (0.3f + 0.7f * progress)));
            int innerColor = selected ? ColorUtils.setAlphaColor(ColorUtils.darken(colorTheme, 0.4f), alpha) : ColorUtils.rgba(255, 255, 255, alpha);
            float dotCenterX = panelX + 96.0f;
            float dotCenterY = listY + 2.0f;
            float entryMaxWidth = dotCenterX - 9.0f - (panelX + 10.0f);
            this.drawStringWithHoverScroll(this.issue(13), context.getMatrices(), entry.name(), panelX + 10.0f, listY, entryMaxWidth, this.getSecondarySettingColor(alpha), mouseX, mouseY, state, this.getListKey(listSetting, entry) + "_text");
            RenderUtils.drawRoundCircle(context.getMatrices(), dotCenterX, dotCenterY, 9.0f, outerColor);
            RenderUtils.drawRoundCircle(context.getMatrices(), dotCenterX, dotCenterY, 6.0f - progress * 2.0f + 3.0f, innerColor);
            listY += 10.0f;
        }
    }

    private void renderBindSetting(DrawContext context, float panelX, float settingY, int alpha, int colorTheme, double mouseX, double mouseY, BindSetting bindSetting, ClickGuiState state) {
        boolean binding = state.getBindingSetting() == bindSetting;
        AnimationUtils bindAnimation = state.getBindAnimation(this.getBindKey(bindSetting), binding);
        bindAnimation.update(binding ? 1.0f : 0.0f);
        float progress = bindAnimation.getValue();
        String bindString = binding ? "..." : state.toEnglish(KeyBoardUtils.getBindName(bindSetting.getKey()));
        float bindTextWidth = this.issue(12).getWidth(bindString);
        float bindWidth = bindTextWidth + 6.0f;
        float bindHeight = 9.0f;
        float bindX = panelX + 100.0f - bindWidth;
        float bindY = settingY - 2.5f;
        int bindBackgroundColor = ColorUtils.setAlphaColor(ColorUtils.interpolateColor(ColorUtils.darken(colorTheme, 0.15f), colorTheme, progress), alpha);
        int bindTextColor = ColorUtils.setAlphaColor(ColorUtils.interpolateColor(ColorUtils.rgb(140, 139, 145), -1, progress), alpha);
        RenderUtils.drawRoundedRect(context.getMatrices(), bindX, bindY, bindWidth, bindHeight, 1.5f, bindBackgroundColor);
        this.issue(12).drawString(context.getMatrices(), bindString, bindX + 3.0f, settingY + 1.0f, bindTextColor);
        this.drawStringWithHoverScroll(this.issue(12), context.getMatrices(), bindSetting.name(), panelX + 10.0f, settingY + 1.0f, bindX - 4.0f - (panelX + 10.0f), this.getPrimarySettingColor(alpha), mouseX, mouseY, state, this.getSettingTextKey(bindSetting));
    }

    private void renderOpenScreenSetting(DrawContext context, float panelX, float settingY, int alpha, int colorTheme, double mouseX, double mouseY, OpenScreenSetting setting, ClickGuiState state) {
        float buttonX = panelX + 10.0f;
        float buttonY = settingY - 2.5f;
        float buttonW = 90.0f;
        float buttonH = 9.0f;
        boolean hovered = this.isTextHovered(buttonX, buttonY, buttonW, buttonH, mouseX, mouseY);
        int background = ColorUtils.setAlphaColor(hovered ? colorTheme : ColorUtils.darken(colorTheme, 0.15f), alpha);
        RenderUtils.drawRoundedRect(context.getMatrices(), buttonX, buttonY, buttonW, buttonH, 1.8f, background);
        String text = setting.name();
        float textX = buttonX + buttonW / 2.0f - this.issue(12).getWidth(text) / 2.0f;
        this.issue(12).drawString(context.getMatrices(), text, textX, settingY + 1.0f, ColorUtils.rgba(255, 255, 255, alpha));
    }

    private String getModeKey(ModeSetting setting, String mode) {
        return System.identityHashCode(setting) + "_mode_" + mode;
    }

    private String getListKey(ListSetting setting, BooleanSetting entry) {
        return setting.hashCode() + "_list_" + entry.name();
    }

    private String getBindKey(BindSetting setting) {
        return setting.hashCode() + "_bind";
    }

    private String formatSliderValue(FloatSetting setting) {
        float value = setting.get();
        float increment = setting.getIncrement();
        if (increment >= 1.0f) {
            return String.valueOf((int)value);
        }
        if (increment >= 0.1f) {
            return String.format("%.1f", Float.valueOf(value));
        }
        return String.format("%.2f", Float.valueOf(value));
    }

    private void drawStringWithHoverScroll(Font font, MatrixStack matrix, String text, float x2, float y2, float maxWidth, int color, double mouseX, double mouseY, ClickGuiState state, String animationKey) {
        if (text == null || text.isEmpty() || maxWidth <= 0.0f) {
            return;
        }
        float totalWidth = font.getWidth(text);
        float overflow = totalWidth - maxWidth;
        if (overflow <= 6.0f) {
            font.draw(matrix, text, x2, y2, color);
            return;
        }
        boolean hovered = this.isTextHovered(x2, y2, maxWidth, font.getHeight(), mouseX, mouseY);
        float scrollPhase = state.advanceTextScrollPhase(animationKey, hovered);
        boolean scrollActive = state.isTextScrollActive(animationKey, hovered);
        AnimationUtils hoverAnimation = state.getTextHoverAnimation(animationKey, scrollActive);
        hoverAnimation.update(scrollActive ? 1.0f : 0.0f);
        float hoverProgress = hoverAnimation.getValue();
        float scrollOffset = this.getHoverScrollOffset(overflow, scrollPhase) * hoverProgress;
        ScissorUtils.push();
        ScissorUtils.setFromComponentCoordinates(x2, y2 - 2.0f, maxWidth, font.getHeight() + 4.0f);
        font.draw(matrix, text, x2 - scrollOffset, y2, color);
        ScissorUtils.pop();
    }

    private int getPrimarySettingColor(int alpha) {
        return ColorUtils.rgba(245, 245, 248, alpha);
    }

    private int getSecondarySettingColor(int alpha) {
        return ColorUtils.rgba(186, 186, 194, alpha);
    }

    private boolean isTextHovered(float x2, float y2, float width, float height, double mouseX, double mouseY) {
        return mouseX >= (double)x2 && mouseX <= (double)(x2 + width) && mouseY >= (double)(y2 - 2.0f) && mouseY <= (double)(y2 + height + 2.0f);
    }

    private float getHoverScrollOffset(float maxOffset, float phase) {
        if (maxOffset <= 0.0f) {
            return 0.0f;
        }
        float pingPong = phase < 0.5f ? phase * 2.0f : 2.0f - phase * 2.0f;
        float eased = pingPong * pingPong * (3.0f - 2.0f * pingPong);
        return maxOffset * eased;
    }

    private String getSettingTextKey(Setting setting) {
        return "setting_text_" + System.identityHashCode(setting);
    }

    private Font issue(int size) {
        return Fonts.getFont("suisse", size);
    }
}