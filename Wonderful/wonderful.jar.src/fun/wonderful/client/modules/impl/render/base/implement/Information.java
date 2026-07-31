package fun.wonderful.client.modules.impl.render.base.implement;

import com.mojang.blaze3d.systems.RenderSystem;
import fun.wonderful.Wonderful;
import fun.wonderful.api.events.implement.EventRender;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.draggable.Draggable;
import fun.wonderful.api.utils.math.MathUtils;
import fun.wonderful.api.utils.render.RenderUtils;
import fun.wonderful.api.utils.render.fonts.msdf.Font;
import fun.wonderful.api.utils.render.fonts.msdf.Fonts;
import fun.wonderful.client.modules.impl.render.base.InterfaceProcessing;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.BuiltBuffer;
import org.joml.Matrix4f;

public class Information
extends InterfaceProcessing {
    private static final int HUD_TEXT_COLOR = ColorUtils.rgb(245, 245, 245);
    private static final int HUD_DOT_COLOR = ColorUtils.rgba(50, 50, 50, 255);
    private static final int HUD_WAVE_STROKE_COLOR = ColorUtils.rgba(185, 185, 185, 255);
    private static final float HUD_RADIUS = 3.0f;
    private static final float[] INFO_WAVE_T = new float[]{0.0f, 0.16f, 0.36f, 0.62f, 0.82f, 1.0f};
    private static final float[] INFO_WAVE_X = new float[]{4.2f, 1.2f, 1.0f, 4.8f, 5.0f, 3.2f};
    private static final int WAVE_DOT_SEGMENTS = 12;
    private static final float[] WAVE_DOT_COS = Information.createDotTrigTable(true);
    private static final float[] WAVE_DOT_SIN = Information.createDotTrigTable(false);

    public Information(Draggable draggable) {
        super(draggable);
    }

    @Override
    public void onRender(EventRender.Default eventRender) {
        this.DefaultStyle(eventRender);
        super.onRender(eventRender);
    }

    public void DefaultStyle(EventRender.Default eventRender) {
        float contentX;
        MatrixStack matrices = eventRender.getContext().getMatrices();
        float x2 = this.draggable.getX();
        float y2 = this.draggable.getY();
        Font labelFont = Fonts.getFont("sf_regular", 15);
        Font mainFont = Fonts.getFont("sf_regular", 15);
        int themeColor = this.getHudThemeColor();
        int px = mc != null && Information.mc.player != null ? (int)Math.floor(Information.mc.player.getX()) : 0;
        int py = mc != null && Information.mc.player != null ? (int)Math.floor(Information.mc.player.getY()) : 0;
        int pz = mc != null && Information.mc.player != null ? (int)Math.floor(Information.mc.player.getZ()) : 0;
        float height = 18.0f;
        float paddingX = 6.0f;
        float textY = y2 + 6.5f;
        float dotY = y2 + 8.7f;
        float dotOffsetX = -0.8f;
        double bps = MathUtils.calculateBPS();
        String xValue = String.valueOf(px);
        String yValue = String.valueOf(py);
        String zValue = String.valueOf(pz);
        String labelText = "Information";
        String bpsValue = this.formatTwoDecimals(bps);
        String bpsSuffix = "bps";
        float labelX = x2 + paddingX - 1.0f;
        float labelWidth = labelFont.getWidth(labelText);
        float waveBaseX = labelX + labelWidth + 0.7f;
        float drawX = contentX = waveBaseX + 8.0f;
        float xPrefixWidth = mainFont.getWidth("x");
        float yPrefixWidth = mainFont.getWidth("y");
        float zPrefixWidth = mainFont.getWidth("z");
        float coordsWidth = xPrefixWidth + mainFont.getWidth(xValue) + mainFont.getWidth(" ") + yPrefixWidth + mainFont.getWidth(yValue) + mainFont.getWidth(" ") + zPrefixWidth + mainFont.getWidth(zValue);
        float bpsWidth = mainFont.getWidth(bpsValue) + mainFont.getWidth(bpsSuffix);
        float width = Math.max(108.0f, (drawX += coordsWidth + 11.0f + bpsWidth) - x2 + paddingX);
        this.drawInformationPanel(matrices, x2, y2, width, height, themeColor, waveBaseX);
        labelFont.draw(matrices, labelText, labelX, textY, ColorUtils.applyAlpha(themeColor, 1.0f));
        drawX = contentX;
        mainFont.draw(matrices, "x", drawX, textY, themeColor);
        mainFont.draw(matrices, xValue, drawX += xPrefixWidth, textY, HUD_TEXT_COLOR);
        mainFont.draw(matrices, "y", drawX += mainFont.getWidth(xValue) + mainFont.getWidth(" "), textY, themeColor);
        mainFont.draw(matrices, yValue, drawX += yPrefixWidth, textY, HUD_TEXT_COLOR);
        mainFont.draw(matrices, "z", drawX += mainFont.getWidth(yValue) + mainFont.getWidth(" "), textY, themeColor);
        mainFont.draw(matrices, zValue, drawX += zPrefixWidth, textY, HUD_TEXT_COLOR);
        this.drawSeparatorDot(matrices, (drawX += mainFont.getWidth(zValue) + 6.0f) + dotOffsetX, dotY);
        mainFont.draw(matrices, bpsValue, drawX += 5.0f, textY, HUD_TEXT_COLOR);
        mainFont.draw(matrices, bpsSuffix, drawX + mainFont.getWidth(bpsValue), textY, themeColor);
        this.draggable.setHeight(height);
        this.draggable.setWidth(width);
    }

    private int getHudThemeColor() {
        if (!Wonderful.INSTANCE.themeStorage.getThemes().getTheme().getName().equals("Rainbow")) {
            return Wonderful.INSTANCE.themeStorage.getThemes().getTheme().color[0];
        }
        return ColorUtils.getThemeColor();
    }

    private void drawInformationPanel(MatrixStack matrices, float x2, float y2, float width, float height, int themeColor, float waveBaseX) {
        int darkTop = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.15f), 255);
        int darkBottom = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.05f), 255);
        int lightTop = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.21f), 255);
        int lightBottom = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.14f), 255);
        float inset = 0.0f;
        float innerX = x2 + inset;
        float innerY = y2 + inset;
        float innerWidth = width - inset * 2.0f;
        float innerHeight = height - inset * 2.0f;
        RenderUtils.drawGradientRect(matrices, innerX, innerY, innerWidth, innerHeight, 3.0f, darkTop, darkBottom);
        this.drawInformationLightWaveMask(matrices, innerX + 0.5f, innerY + 0.5f, innerWidth - 1.0f, innerHeight - 1.0f, lightTop, lightBottom, waveBaseX);
        this.drawInformationWaveStroke(matrices, innerY + 0.5f, innerHeight - 1.0f, waveBaseX);
    }

    private void drawInformationLightWaveMask(MatrixStack matrices, float x2, float y2, float width, float height, int topColor, int bottomColor, float waveBaseX) {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_COLOR);
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.class_5596.QUADS, VertexFormats.POSITION_COLOR);
        int segments = 220;
        for (int i2 = 0; i2 < segments; ++i2) {
            float t1 = (float)i2 / (float)segments;
            float t2 = (float)(i2 + 1) / (float)segments;
            float y1 = y2 + height * t1;
            float y22 = y2 + height * t2;
            float leftX1 = this.getRoundedLeftClipX(x2, y2, height, y1);
            float leftX2 = this.getRoundedLeftClipX(x2, y2, height, y22);
            float waveX1 = this.getInformationWaveX(waveBaseX, t1);
            float waveX2 = this.getInformationWaveX(waveBaseX, t2);
            int color1 = ColorUtils.interpolateColor(topColor, bottomColor, t1);
            int color2 = ColorUtils.interpolateColor(topColor, bottomColor, t2);
            buffer.vertex(matrix, leftX1, y1, 0.0f).color(color1);
            buffer.vertex(matrix, leftX2, y22, 0.0f).color(color2);
            buffer.vertex(matrix, waveX2, y22, 0.0f).color(color2);
            buffer.vertex(matrix, waveX1, y1, 0.0f).color(color1);
        }
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
        RenderSystem.disableBlend();
    }

    private float getRoundedLeftClipX(float x2, float y2, float height, float currentY) {
        float localY = currentY - y2;
        float radius = 3.0f;
        if (localY < radius) {
            float dy = radius - localY;
            return x2 + radius - (float)Math.sqrt(Math.max(0.0f, radius * radius - dy * dy));
        }
        if (localY > height - radius) {
            float dy = localY - (height - radius);
            return x2 + radius - (float)Math.sqrt(Math.max(0.0f, radius * radius - dy * dy));
        }
        return x2;
    }

    private float getRoundedRightClipX(float x2, float y2, float width, float height, float currentY) {
        float localY = currentY - y2;
        float radius = 3.0f;
        if (localY < radius) {
            float dy = radius - localY;
            return x2 + width - radius + (float)Math.sqrt(Math.max(0.0f, radius * radius - dy * dy));
        }
        if (localY > height - radius) {
            float dy = localY - (height - radius);
            return x2 + width - radius + (float)Math.sqrt(Math.max(0.0f, radius * radius - dy * dy));
        }
        return x2 + width;
    }

    private float getInformationWaveX(float waveBaseX, float t2) {
        int point;
        t2 = MathHelper.clamp((float)t2, (float)0.0f, (float)1.0f);
        for (point = 0; point < INFO_WAVE_T.length - 2 && t2 > INFO_WAVE_T[point + 1]; ++point) {
        }
        int p0 = Math.max(0, point - 1);
        int p1 = point;
        int p2 = Math.min(INFO_WAVE_T.length - 1, point + 1);
        int p3 = Math.min(INFO_WAVE_T.length - 1, point + 2);
        float span = INFO_WAVE_T[p2] - INFO_WAVE_T[p1];
        float local = span <= 1.0E-4f ? 0.0f : (t2 - INFO_WAVE_T[p1]) / span;
        float local2 = local * local;
        float local3 = local2 * local;
        float x0 = INFO_WAVE_X[p0];
        float x1 = INFO_WAVE_X[p1];
        float x2 = INFO_WAVE_X[p2];
        float x3 = INFO_WAVE_X[p3];
        float wave = 0.5f * (2.0f * x1 + (-x0 + x2) * local + (2.0f * x0 - 5.0f * x1 + 4.0f * x2 - x3) * local2 + (-x0 + 3.0f * x1 - 3.0f * x2 + x3) * local3);
        return waveBaseX + wave;
    }

    private void drawInformationWaveStroke(MatrixStack matrices, float y2, float height, float waveBaseX) {
        this.drawInformationWaveSoftStroke(matrices, y2, height, waveBaseX, 1.75f, ColorUtils.rgba(185, 185, 185, 255), 150);
        this.drawInformationWaveSoftStroke(matrices, y2, height, waveBaseX, 1.15f, ColorUtils.rgba(185, 185, 185, 255), 170);
        this.drawInformationWaveSoftStroke(matrices, y2, height, waveBaseX, 0.7f, HUD_WAVE_STROKE_COLOR, 190);
    }

    private void drawInformationWaveSoftStroke(MatrixStack matrices, float y2, float height, float waveBaseX, float diameter, int color, int steps) {
        int alpha = ColorUtils.getAlpha(color);
        if (alpha <= 0 || diameter <= 0.0f || steps <= 0) {
            return;
        }
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_COLOR);
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.class_5596.TRIANGLES, VertexFormats.POSITION_COLOR);
        float half = diameter * 0.5f;
        float red = ColorUtils.redf(color);
        float green = ColorUtils.greenf(color);
        float blue = ColorUtils.bluef(color);
        float alphaF = (float)alpha / 255.0f;
        for (int i2 = 0; i2 <= steps; ++i2) {
            float t2 = (float)i2 / (float)steps;
            float centerX = this.getInformationWaveX(waveBaseX, t2);
            float centerY = y2 + height * t2;
            for (int segment = 0; segment < 12; ++segment) {
                int next = segment + 1;
                buffer.vertex(matrix, centerX, centerY, 0.0f).color(red, green, blue, alphaF);
                buffer.vertex(matrix, centerX + WAVE_DOT_COS[segment] * half, centerY + WAVE_DOT_SIN[segment] * half, 0.0f).color(red, green, blue, alphaF);
                buffer.vertex(matrix, centerX + WAVE_DOT_COS[next] * half, centerY + WAVE_DOT_SIN[next] * half, 0.0f).color(red, green, blue, alphaF);
            }
        }
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
        RenderSystem.disableBlend();
    }

    private static float[] createDotTrigTable(boolean cos) {
        float[] table = new float[13];
        for (int i2 = 0; i2 <= 12; ++i2) {
            double angle = Math.PI * 2 * (double)i2 / 12.0;
            table[i2] = (float)(cos ? Math.cos(angle) : Math.sin(angle));
        }
        return table;
    }

    private void drawSeparatorDot(MatrixStack matrices, float x2, float y2) {
        RenderUtils.drawRoundCircle(matrices, x2, y2, 4.0f, HUD_DOT_COLOR);
    }

    private String formatTwoDecimals(double value) {
        int scaled = (int)Math.round(value * 100.0);
        int fraction = Math.abs(scaled % 100);
        return scaled / 100 + "." + (fraction < 10 ? "0" : "") + fraction;
    }
}