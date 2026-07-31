package fun.wonderful.client.ui.clickgui;

import com.mojang.blaze3d.systems.RenderSystem;
import fun.wonderful.Wonderful;
import fun.wonderful.api.storages.implement.ThemeStorage;
import fun.wonderful.api.utils.animation.AnimationUtils;
import fun.wonderful.api.utils.animation.Easings;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.math.HoveringUtils;
import fun.wonderful.api.utils.render.RenderUtils;
import fun.wonderful.api.utils.render.ShaderUtils;
import fun.wonderful.api.utils.render.fonts.msdf.Font;
import fun.wonderful.api.utils.render.fonts.msdf.Fonts;
import fun.wonderful.client.ui.clickgui.ClickGuiLayout;
import java.awt.Color;
import java.util.List;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.gl.GlUniform;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.render.BuiltBuffer;
import org.joml.Matrix4f;

public class ClickGuiThemeSelector {
    private static final float ACTION_BUTTON_SIZE = 11.0f;
    private static final float ACTION_BUTTON_GAP = 4.0f;
    private boolean open;
    private boolean draggingPicker;
    private boolean draggingHue;
    private boolean pickerInitialized;
    private float pickerHue = 0.63f;
    private float pickerSaturation = 0.75f;
    private float pickerBrightness = 1.0f;
    private final AnimationUtils popupAnimation = new AnimationUtils(0.0f, 15.0f, Easings.CUBIC_OUT);

    public void render(DrawContext context, float baseX, float panelY, int categoryCount, float alphaMul, int shadeColor) {
        if (context == null || categoryCount <= 0) {
            return;
        }
        this.syncPickerFromSelection();
        float buttonX = ClickGuiLayout.getThemeButtonX(baseX, categoryCount);
        float buttonY = ClickGuiLayout.getThemeButtonY(panelY);
        this.renderButton(context, buttonX, buttonY, alphaMul, shadeColor);
        this.popupAnimation.update(this.open ? 1.0f : 0.0f);
        float popupProgress = MathHelper.clamp((float)this.popupAnimation.getValue(), (float)0.0f, (float)1.0f);
        if (popupProgress <= 0.01f) {
            return;
        }
        PopupLayout layout = this.buildLayout(buttonX, buttonY);
        float popupY = layout.panelY + (1.0f - popupProgress) * 3.0f;
        float contentAlphaMul = alphaMul * popupProgress;
        int popupShadeColor = ColorUtils.applyAlpha(shadeColor, popupProgress);
        int themeColor = ColorUtils.getThemeColor();
        float popupRadius = 6.0f;
        this.drawHudRect(context, layout.panelX, popupY, layout.panelWidth, layout.panelHeight, popupRadius, themeColor, contentAlphaMul);
        if ((popupShadeColor >> 24 & 0xFF) > 0) {
            RenderUtils.drawRoundedRect(context.getMatrices(), layout.panelX, popupY, layout.panelWidth, layout.panelHeight, popupRadius, popupShadeColor);
        }
        this.renderActionButtons(context, layout, popupY, contentAlphaMul);
        this.renderPickerSquare(context, layout.pickerX, popupY + layout.pickerYOffset, contentAlphaMul);
        this.renderHueSlider(context, layout.pickerX, popupY + layout.hueYOffset, contentAlphaMul);
        this.renderPresetThemes(context, layout, popupY, contentAlphaMul);
    }

    public boolean handleClick(double mouseX, double mouseY, int button, float baseX, float panelY, int categoryCount) {
        float buttonY;
        if (button != 0 && button != 1 || categoryCount <= 0) {
            return false;
        }
        float buttonX = ClickGuiLayout.getThemeButtonX(baseX, categoryCount);
        if (HoveringUtils.isHovered(mouseX, mouseY, buttonX, buttonY = ClickGuiLayout.getThemeButtonY(panelY), 23.0, 23.0)) {
            this.open = !this.open;
            this.stopDragging();
            return true;
        }
        if (!this.open) {
            return false;
        }
        PopupLayout layout = this.buildLayout(buttonX, buttonY);
        if (!HoveringUtils.isHovered(mouseX, mouseY, layout.panelX, layout.panelY, layout.panelWidth, layout.panelHeight)) {
            this.open = false;
            this.stopDragging();
            return false;
        }
        if (button != 0) {
            return true;
        }
        if (HoveringUtils.isHovered(mouseX, mouseY, layout.addButtonX, layout.panelY + layout.actionButtonsYOffset, 11.0, 11.0)) {
            Wonderful.INSTANCE.themeStorage.removeSelectedCustomTheme();
            this.pickerInitialized = false;
            this.syncPickerFromSelection();
            return true;
        }
        if (HoveringUtils.isHovered(mouseX, mouseY, layout.removeButtonX, layout.panelY + layout.actionButtonsYOffset, 11.0, 11.0)) {
            Wonderful.INSTANCE.themeStorage.addCurrentCustomTheme();
            this.pickerInitialized = false;
            this.syncPickerFromSelection();
            return true;
        }
        if (HoveringUtils.isHovered(mouseX, mouseY, layout.pickerX, layout.panelY + layout.pickerYOffset, 88.0, 78.0)) {
            this.draggingPicker = true;
            this.updatePicker(mouseX, mouseY, layout);
            return true;
        }
        if (HoveringUtils.isHovered(mouseX, mouseY, layout.pickerX, layout.panelY + layout.hueYOffset, 88.0, 6.0)) {
            this.draggingHue = true;
            this.updateHue(mouseX, layout);
            return true;
        }
        List<ThemeStorage.ThemePreset> presets = Wonderful.INSTANCE.themeStorage.getThemePresets();
        for (int i2 = 0; i2 < presets.size(); ++i2) {
            float boxY;
            float boxX = this.getPresetBoxX(i2, presets.size(), layout);
            if (!HoveringUtils.isHovered(mouseX, mouseY, boxX, boxY = this.getPresetBoxY(i2, layout), 10.0, 10.0)) continue;
            Wonderful.INSTANCE.themeStorage.applyPreset(presets.get(i2));
            this.pickerInitialized = false;
            this.syncPickerFromSelection();
            return true;
        }
        return true;
    }

    public boolean handleDrag(double mouseX, double mouseY, int button, float baseX, float panelY, int categoryCount) {
        if (button != 0 || categoryCount <= 0 || !this.open) {
            return false;
        }
        if (!this.draggingPicker && !this.draggingHue) {
            return false;
        }
        PopupLayout layout = this.buildLayout(ClickGuiLayout.getThemeButtonX(baseX, categoryCount), ClickGuiLayout.getThemeButtonY(panelY));
        if (this.draggingPicker) {
            this.updatePicker(mouseX, mouseY, layout);
            return true;
        }
        if (this.draggingHue) {
            this.updateHue(mouseX, layout);
            return true;
        }
        return false;
    }

    public void handleRelease(int button) {
        if (button == 0) {
            this.stopDragging();
        }
    }

    private void stopDragging() {
        this.draggingPicker = false;
        this.draggingHue = false;
    }

    private void syncPickerFromSelection() {
        if (this.pickerInitialized && (this.draggingPicker || this.draggingHue)) {
            return;
        }
        ThemeStorage.ThemePreset selectedPreset = Wonderful.INSTANCE.themeStorage.getSelectedPreset();
        int primary = selectedPreset != null ? this.getPresetPrimaryColor(selectedPreset) : Wonderful.INSTANCE.themeStorage.getCustomPrimaryColor();
        float[] primaryHsb = Color.RGBtoHSB(ColorUtils.red(primary), ColorUtils.green(primary), ColorUtils.blue(primary), null);
        this.pickerHue = primaryHsb[0];
        this.pickerSaturation = primaryHsb[1];
        this.pickerBrightness = primaryHsb[2];
        this.pickerInitialized = true;
    }

    private void updatePicker(double mouseX, double mouseY, PopupLayout layout) {
        this.pickerSaturation = MathHelper.clamp((float)((float)((mouseX - (double)layout.pickerX) / 88.0)), (float)0.0f, (float)1.0f);
        this.pickerBrightness = 1.0f - MathHelper.clamp((float)((float)((mouseY - (double)(layout.panelY + layout.pickerYOffset)) / 78.0)), (float)0.0f, (float)1.0f);
        this.applyCustomTheme();
    }

    private void updateHue(double mouseX, PopupLayout layout) {
        this.pickerHue = MathHelper.clamp((float)((float)((mouseX - (double)layout.pickerX) / 88.0)), (float)0.0f, (float)1.0f);
        this.applyCustomTheme();
    }

    private void applyCustomTheme() {
        int primary = 0xFF000000 | Color.HSBtoRGB(this.pickerHue, this.pickerSaturation, this.pickerBrightness) & 0xFFFFFF;
        int secondary = ColorUtils.darken(primary, 0.72f);
        Wonderful.INSTANCE.themeStorage.setCustomThemeColors(primary, secondary);
        Wonderful.INSTANCE.themeStorage.setThemes(ThemeStorage.Themes.Custom);
    }

    private void renderPickerSquare(DrawContext context, float x2, float y2, float alphaMul) {
        int hueColor = 0xFF000000 | Color.HSBtoRGB(this.pickerHue, 1.0f, 1.0f) & 0xFFFFFF;
        RenderUtils.drawRoundedRect(context.getMatrices(), x2 - 0.5f, y2 - 0.5f, 89.0f, 79.0f, 5.0f, ColorUtils.applyAlpha(ColorUtils.rgba(18, 18, 18, 255), alphaMul));
        RenderUtils.drawGradientRect(context.getMatrices(), x2, y2, 88.0f, 78.0f, 4.5f, ColorUtils.applyAlpha(ColorUtils.rgba(255, 255, 255, 255), alphaMul), ColorUtils.applyAlpha(hueColor, alphaMul), ColorUtils.applyAlpha(ColorUtils.rgba(0, 0, 0, 255), alphaMul), ColorUtils.applyAlpha(ColorUtils.rgba(0, 0, 0, 255), alphaMul));
        float knobX = x2 + this.pickerSaturation * 88.0f;
        float knobY = y2 + (1.0f - this.pickerBrightness) * 78.0f;
        RenderUtils.drawRoundedRect(context.getMatrices(), knobX - 5.0f, knobY - 5.0f, 10.0f, 10.0f, 5.0f, ColorUtils.applyAlpha(ColorUtils.rgba(255, 255, 255, 255), alphaMul));
        RenderUtils.drawRoundedRect(context.getMatrices(), knobX - 3.0f, knobY - 3.0f, 6.0f, 6.0f, 3.0f, ColorUtils.applyAlpha(0xFF000000 | Color.HSBtoRGB(this.pickerHue, this.pickerSaturation, this.pickerBrightness) & 0xFFFFFF, alphaMul));
    }

    private void renderHueSlider(DrawContext context, float x2, float y2, float alphaMul) {
        RenderUtils.drawRoundedRect(context.getMatrices(), x2 - 0.5f, y2 - 0.5f, 89.0f, 7.0f, 3.0f, ColorUtils.applyAlpha(ColorUtils.rgba(18, 18, 18, 255), alphaMul));
        this.renderHueGradient(context, x2, y2, alphaMul);
        float knobX = x2 + this.pickerHue * 88.0f;
        RenderUtils.drawRoundedRect(context.getMatrices(), knobX - 2.0f, y2 - 1.2f, 4.0f, 8.4f, 1.4f, ColorUtils.applyAlpha(ColorUtils.rgba(255, 255, 255, 255), alphaMul));
    }

    private void renderHueGradient(DrawContext context, float x2, float y2, float alphaMul) {
        float width = 88.0f;
        float height = 6.0f;
        float radius = height * 0.5f;
        ShaderProgram shader = MinecraftClient.getInstance().getShaderLoader().getOrCreateProgram(ShaderUtils.hueSlider);
        if (shader == null) {
            return;
        }
        GlUniform sizeUniform = shader.getUniform("Size");
        GlUniform radiusUniform = shader.getUniform("Radius");
        GlUniform smoothnessUniform = shader.getUniform("Smoothness");
        GlUniform alphaUniform = shader.getUniform("Alpha");
        if (sizeUniform != null) {
            sizeUniform.set(width, height);
        }
        if (radiusUniform != null) {
            radiusUniform.set(radius, radius, radius, radius);
        }
        if (smoothnessUniform != null) {
            smoothnessUniform.set(1.0f);
        }
        if (alphaUniform != null) {
            alphaUniform.set(alphaMul);
        }
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        Matrix4f matrix = context.getMatrices().peek().getPositionMatrix();
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.class_5596.QUADS, VertexFormats.POSITION_COLOR);
        buffer.vertex(matrix, x2, y2, 0.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        buffer.vertex(matrix, x2, y2 + height, 0.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        buffer.vertex(matrix, x2 + width, y2 + height, 0.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        buffer.vertex(matrix, x2 + width, y2, 0.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.setShader((ShaderProgramKey)ShaderUtils.hueSlider);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
        RenderSystem.disableBlend();
    }

    private int hueSliderColor(float hue, float alphaMul) {
        return ColorUtils.applyAlpha(0xFF000000 | Color.HSBtoRGB(hue, 1.0f, 1.0f) & 0xFFFFFF, alphaMul);
    }

    private void renderPresetThemes(DrawContext context, PopupLayout layout, float popupY, float alphaMul) {
        List<ThemeStorage.ThemePreset> presets = Wonderful.INSTANCE.themeStorage.getThemePresets();
        ThemeStorage.ThemePreset selected = Wonderful.INSTANCE.themeStorage.getSelectedPreset();
        for (int i2 = 0; i2 < presets.size(); ++i2) {
            ThemeStorage.ThemePreset preset = presets.get(i2);
            float boxX = this.getPresetBoxX(i2, presets.size(), layout);
            float boxY = popupY + this.getPresetRelativeY(i2, layout);
            if (selected != null && preset.id().equals(selected.id())) {
                RenderUtils.drawRoundedRect(context.getMatrices(), boxX - 0.75f, boxY - 0.75f, 11.5f, 11.5f, 3.1f, ColorUtils.applyAlpha(ColorUtils.rgba(255, 255, 255, 255), alphaMul));
            }
            this.renderPresetSwatch(context, preset, boxX, boxY, alphaMul);
        }
    }

    private void renderPresetSwatch(DrawContext context, ThemeStorage.ThemePreset preset, float boxX, float boxY, float alphaMul) {
        if (preset.builtInTheme() == ThemeStorage.Themes.Rainbow) {
            RenderUtils.drawGradient6Rect(context.getMatrices(), boxX, boxY, 10.0f, 10.0f, 2.5f, ColorUtils.applyAlpha(Color.HSBtoRGB(0.0f, 0.74f, 1.0f), Math.max(0.74f, alphaMul)), ColorUtils.applyAlpha(Color.HSBtoRGB(0.08f, 0.82f, 0.96f), Math.max(0.74f, alphaMul)), ColorUtils.applyAlpha(Color.HSBtoRGB(0.28f, 0.78f, 1.0f), Math.max(0.74f, alphaMul)), ColorUtils.applyAlpha(Color.HSBtoRGB(0.48f, 0.78f, 1.0f), Math.max(0.74f, alphaMul)), ColorUtils.applyAlpha(Color.HSBtoRGB(0.67f, 0.74f, 1.0f), Math.max(0.74f, alphaMul)), ColorUtils.applyAlpha(Color.HSBtoRGB(0.84f, 0.74f, 0.96f), Math.max(0.74f, alphaMul)));
            return;
        }
        RenderUtils.drawGradientRect(context.getMatrices(), boxX, boxY, 10.0f, 10.0f, 2.5f, ColorUtils.applyAlpha(this.getPresetPrimaryColor(preset), Math.max(0.72f, alphaMul)), ColorUtils.applyAlpha(this.getPresetSecondaryColor(preset), Math.max(0.72f, alphaMul)), false);
    }

    private void renderActionButtons(DrawContext context, PopupLayout layout, float popupY, float alphaMul) {
        this.renderActionButton(context, layout.addButtonX, popupY + layout.actionButtonsYOffset, alphaMul, "B", Wonderful.INSTANCE.themeStorage.hasSelectedRemovablePreset());
        this.renderActionButton(context, layout.removeButtonX, popupY + layout.actionButtonsYOffset, alphaMul, "C", true);
    }

    private void renderActionButton(DrawContext context, float x2, float y2, float alphaMul, String label, boolean active) {
        int themeColor = ColorUtils.getThemeColor();
        int background = active ? ColorUtils.applyAlpha(ColorUtils.darken(themeColor, 0.12f), alphaMul) : ColorUtils.applyAlpha(ColorUtils.rgba(28, 28, 28, 255), alphaMul);
        RenderUtils.drawRoundedRect(context.getMatrices(), x2, y2, 11.0f, 11.0f, 2.5f, background);
        Font font = Fonts.getFont("theme", 17);
        if (font != null) {
            float drawX = x2 + 5.5f - font.getWidth(label) * 0.5f;
            float drawY = y2 + 5.5f - font.getHeight() * 0.33f + 3.05f;
            int iconColor = active ? ColorUtils.applyAlpha(themeColor, alphaMul) : ColorUtils.applyAlpha(ColorUtils.darken(themeColor, 0.45f), alphaMul);
            font.draw(context.getMatrices(), label, drawX, drawY, iconColor);
        }
    }

    private void renderButton(DrawContext context, float buttonX, float buttonY, float alphaMul, int shadeColor) {
        Font themeFont;
        int themeColor = ColorUtils.getThemeColor();
        float radius = 3.5f;
        this.drawHudRect(context, buttonX, buttonY, 23.0f, 23.0f, radius, themeColor, alphaMul);
        if (!this.open && (shadeColor >> 24 & 0xFF) > 0) {
            RenderUtils.drawRoundedRect(context.getMatrices(), buttonX, buttonY, 23.0f, 23.0f, radius, shadeColor);
        }
        if ((themeFont = Fonts.getFont("theme", 18)) != null) {
            float centerX = buttonX + 11.5f;
            float centerY = buttonY + 11.5f - themeFont.getHeight() * 0.33f + 3.0f;
            int iconColor = ColorUtils.applyAlpha(themeColor, Math.max(0.7f, alphaMul));
            themeFont.drawCenteredString(context.getMatrices(), "A", centerX, centerY, iconColor);
        }
    }

    private int getPresetPrimaryColor(ThemeStorage.ThemePreset preset) {
        int[] colors = preset.getTheme().getColor();
        if (colors == null || colors.length == 0) {
            return ColorUtils.rgba(220, 220, 220, 180);
        }
        return colors[0];
    }

    private int getPresetSecondaryColor(ThemeStorage.ThemePreset preset) {
        int[] colors = preset.getTheme().getColor();
        if (colors == null || colors.length < 2) {
            return ColorUtils.darken(this.getPresetPrimaryColor(preset), 0.72f);
        }
        return colors[1];
    }

    private float getPresetBoxX(int index, int totalPresets, PopupLayout layout) {
        int row = index / layout.columns;
        int columnInRow = index - row * layout.columns;
        int rowStartIndex = row * layout.columns;
        int itemsInRow = Math.min(layout.columns, totalPresets - rowStartIndex);
        float rowWidth = (float)itemsInRow * 10.0f + (float)Math.max(0, itemsInRow - 1) * 5.0f;
        float rowOffsetX = (layout.innerWidth - rowWidth) * 0.5f;
        return layout.panelX + 5.0f + rowOffsetX + (float)columnInRow * 15.0f;
    }

    private float getPresetBoxY(int index, PopupLayout layout) {
        return layout.panelY + this.getPresetRelativeY(index, layout);
    }

    private float getPresetRelativeY(int index, PopupLayout layout) {
        int row = index / layout.columns;
        return layout.themesStartY + (float)row * 15.0f;
    }

    private PopupLayout buildLayout(float buttonX, float buttonY) {
        List<ThemeStorage.ThemePreset> presets = Wonderful.INSTANCE.themeStorage.getThemePresets();
        float panelWidth = 98.0f;
        float innerWidth = panelWidth - 10.0f;
        int columns = Math.max(1, (int)((innerWidth + 5.0f) / 15.0f));
        int rows = (int)Math.ceil((float)presets.size() / (float)columns);
        float contentHeight = (float)rows * 10.0f + (float)Math.max(0, rows - 1) * 5.0f;
        float panelY = buttonY + 23.0f + 6.0f;
        float pickerYOffset = 20.0f;
        float hueYOffset = pickerYOffset + 78.0f + 5.0f;
        float themesStartY = hueYOffset + 6.0f + 7.0f;
        float panelHeight = themesStartY + contentHeight + 5.0f + 1.5f;
        float pickerX = buttonX + 5.0f;
        float removeButtonX = buttonX + panelWidth - 5.0f - 11.0f;
        float addButtonX = removeButtonX - 4.0f - 11.0f;
        return new PopupLayout(buttonX, panelY, panelWidth, panelHeight, innerWidth, pickerX, pickerYOffset, hueYOffset, themesStartY, 5.0f, addButtonX, removeButtonX, columns);
    }

    private void drawHudRect(DrawContext context, float x2, float y2, float width, float height, float radius, int themeColor, float alphaMul) {
        RenderUtils.drawDefaultHudPanel(context.getMatrices(), x2, y2, width, height, radius, radius + 0.5f, ColorUtils.applyAlpha(ColorUtils.rgba(50, 50, 50, 255), alphaMul), ColorUtils.applyAlpha(ColorUtils.darken(themeColor, 0.15f), alphaMul), ColorUtils.applyAlpha(ColorUtils.darken(themeColor, 0.05f), alphaMul));
        RenderUtils.drawHudBlur(context.getMatrices(), x2, y2, width, height, radius, alphaMul * 0.45f);
    }

    private record PopupLayout(float panelX, float panelY, float panelWidth, float panelHeight, float innerWidth, float pickerX, float pickerYOffset, float hueYOffset, float themesStartY, float actionButtonsYOffset, float addButtonX, float removeButtonX, int columns) {
    }
}