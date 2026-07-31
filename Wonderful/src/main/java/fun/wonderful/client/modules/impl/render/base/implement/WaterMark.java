package fun.wonderful.client.modules.impl.render.base.implement;

import com.mojang.blaze3d.systems.RenderSystem;
import fun.wonderful.Wonderful;
import fun.wonderful.api.events.implement.EventRender;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.draggable.Draggable;
import fun.wonderful.api.utils.render.RenderUtils;
import fun.wonderful.api.utils.render.fonts.msdf.Font;
import fun.wonderful.api.utils.render.fonts.msdf.Fonts;
import fun.wonderful.client.modules.impl.render.base.InterfaceProcessing;
import java.awt.Color;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.client.render.BuiltBuffer;
import org.joml.Matrix4f;

public class WaterMark
extends InterfaceProcessing {
    public static final boolean XOSHUDEZ_PROFILE = false;
    public static final String STATIC_USERNAME = "dezolator";
    public static final int STATIC_UID = 0;
    private static final int HUD_TEXT_COLOR = ColorUtils.rgb(245, 245, 245);
    private static final int HUD_SUFFIX_COLOR = ColorUtils.rgb(185, 185, 185);
    private static final int HUD_DOT_COLOR = ColorUtils.rgba(50, 50, 50, 255);
    private static final int HUD_WAVE_STROKE_COLOR = ColorUtils.rgba(185, 185, 185, 255);
    private static final float HUD_RADIUS = 3.0f;
    private static final float BOTTOM_CONTENT_OFFSET_Y = 0.4f;
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static final float[] WATERMARK_WAVE_T = new float[]{0.0f, 0.16f, 0.36f, 0.62f, 0.82f, 1.0f};
    private static final float[] WATERMARK_WAVE_X = new float[]{4.2f, 1.2f, 1.0f, 4.8f, 5.0f, 3.2f};
    private static final int WAVE_DOT_SEGMENTS = 12;
    private static final float[] WAVE_DOT_COS = WaterMark.createDotTrigTable(true);
    private static final float[] WAVE_DOT_SIN = WaterMark.createDotTrigTable(false);
    private boolean showUsername = true;
    private boolean showFps = true;
    private boolean showTime = true;
    private boolean showMs = true;
    private boolean showServer = true;
    private boolean showTps = true;

    public static String getUsername() {
        return "Komaru1337";
    }

    public static String getUID() {
        return "1337";
    }

    public WaterMark(Draggable draggable) {
        super(draggable);
    }

    public boolean isShowFps() {
        return this.showFps;
    }

    public void setShowFps(boolean showFps) {
        this.showFps = showFps;
    }

    public boolean isShowTime() {
        return this.showTime;
    }

    public void setShowTime(boolean showTime) {
        this.showTime = showTime;
    }

    public boolean isShowUsername() {
        return this.showUsername;
    }

    public void setShowUsername(boolean showUsername) {
        this.showUsername = showUsername;
    }

    public boolean isShowMs() {
        return this.showMs;
    }

    public void setShowMs(boolean showMs) {
        this.showMs = showMs;
    }

    public boolean isShowServer() {
        return this.showServer;
    }

    public void setShowServer(boolean showServer) {
        this.showServer = showServer;
    }

    public boolean isShowTps() {
        return this.showTps;
    }

    public void setShowTps(boolean showTps) {
        this.showTps = showTps;
    }

    @Override
    public void onRender(EventRender.Default eventRender) {
        this.renderFigmaStyle(eventRender);
        super.onRender(eventRender);
    }

    private void renderFigmaStyle(EventRender.Default eventRender) {
        float width;
        float contentX;
        PlayerListEntry entry;
        ServerInfo info;
        MatrixStack matrices = eventRender.getContext().getMatrices();
        float x2 = this.draggable.getX();
        float y2 = this.draggable.getY();
        int themeColor = this.getHudThemeColor();
        int textColor = HUD_TEXT_COLOR;
        int suffixColor = HUD_SUFFIX_COLOR;
        Font brandFont = Fonts.getFont("sf_regular", 15);
        Font mainFont = Fonts.getFont("sf_regular", 15);
        String brandText = "wonderful.fun";
        String username = this.showUsername ? WaterMark.getUsername() : "";
        String fpsValue = String.valueOf(mc != null ? mc.getCurrentFps() : 0);
        String fpsSuffix = "fps";
        String timeText = LocalTime.now().format(TIME_FORMATTER);
        String serverName = "Singleplayer";
        if (mc != null && (info = mc.getCurrentServerEntry()) != null && info.address != null && !info.address.isEmpty()) {
            serverName = info.address;
        }
        String serverDisplayName = this.formatServerNameForDisplay(serverName);
        String tpsValue = this.formatOneDecimal(this.getServerTps());
        String tpsSuffix = "tps";
        int ping = 0;
        if (mc != null && WaterMark.mc.player != null && mc.getNetworkHandler() != null && (entry = mc.getNetworkHandler().getPlayerListEntry(WaterMark.mc.player.getUuid())) != null) {
            ping = entry.getLatency();
        }
        String pingValue = String.valueOf(ping);
        String pingSuffix = "ms";
        float height = 18.0f;
        float paddingX = 6.0f;
        float separatorWidth = 11.0f;
        float textY = y2 + 6.5f;
        float dotY = y2 + 8.7f;
        float usernameDotOffsetX = -1.5f;
        float pingDotOffsetX = -1.0f;
        float serverDotOffsetX = -1.8f;
        float tpsDotOffsetX = -0.8f;
        float brandX = x2 + paddingX - 5.0f;
        float brandTextOffsetX = 5.3f;
        float brandWidth = brandFont.getWidth(brandText);
        float waveBaseX = brandX + brandWidth + 7.5f;
        float drawX = contentX = waveBaseX + 12.0f;
        boolean hasUsername = !username.isEmpty();
        boolean hasFps = this.showFps;
        boolean hasTopPing = this.showMs;
        float usernameWidth = mainFont.getWidth(username);
        float fpsWidth = mainFont.getWidth(fpsValue) + mainFont.getWidth(fpsSuffix);
        float topPingWidth = mainFont.getWidth(pingValue) + mainFont.getWidth(pingSuffix);
        if (hasUsername) {
            drawX += usernameWidth;
            if (hasFps || hasTopPing) {
                drawX += separatorWidth;
            }
        }
        if (hasFps) {
            drawX += fpsWidth;
            if (hasTopPing) {
                drawX += separatorWidth;
            }
        }
        if (hasTopPing) {
            drawX += topPingWidth;
        }
        boolean hasTopValues = hasUsername || hasFps || hasTopPing;
        float brandOnlyWidth = brandX + brandTextOffsetX + brandWidth - x2 + 3.6f;
        float f2 = width = hasTopValues ? Math.max(98.0f, drawX - x2 + paddingX) : Math.max(34.0f, brandOnlyWidth);
        if (hasTopValues) {
            this.drawWatermarkPanel(matrices, x2, y2, width, height, themeColor, waveBaseX);
        } else {
            this.drawSimpleWatermarkPanel(matrices, x2, y2, width, height, themeColor);
        }
        brandFont.draw(matrices, brandText, brandX + brandTextOffsetX, textY, ColorUtils.applyAlpha(themeColor, 1.0f));
        drawX = contentX;
        if (hasUsername) {
            mainFont.draw(matrices, username, drawX, textY, textColor);
            drawX += usernameWidth;
            if (hasFps || hasTopPing) {
                this.drawSeparatorDot(matrices, (drawX += 6.0f) + usernameDotOffsetX, dotY);
                drawX += 5.0f;
            }
        }
        if (hasFps) {
            mainFont.draw(matrices, fpsValue, drawX, textY, textColor);
            mainFont.draw(matrices, fpsSuffix, drawX + mainFont.getWidth(fpsValue), textY, themeColor);
            drawX += fpsWidth;
            if (hasTopPing) {
                this.drawSeparatorDot(matrices, (drawX += 6.0f) + pingDotOffsetX, dotY);
                drawX += 5.0f;
            }
        }
        if (hasTopPing) {
            mainFont.draw(matrices, pingValue, drawX, textY, textColor);
            mainFont.draw(matrices, pingSuffix, drawX + mainFont.getWidth(pingValue), textY, themeColor);
        }
        boolean hasServer = this.showServer && !serverDisplayName.isEmpty();
        boolean hasTps = this.showTps;
        boolean hasBottomTime = this.showTime;
        int bottomValueCount = (hasServer ? 1 : 0) + (hasTps ? 1 : 0) + (hasBottomTime ? 1 : 0);
        boolean showBottom = bottomValueCount > 0;
        float bottomWidth = 0.0f;
        float bottomHeight = 18.0f;
        if (showBottom) {
            float bottomY = y2 + height + 3.0f;
            float bottomTextY = bottomY + 6.5f + 0.4f;
            float bottomDotY = bottomY + 8.7f + 0.4f;
            float serverWidth = mainFont.getWidth(serverDisplayName);
            float tpsWidth = mainFont.getWidth(tpsValue) + mainFont.getWidth(tpsSuffix);
            float timeWidth = mainFont.getWidth(timeText);
            float firstWidth = hasServer ? serverWidth : (hasTps ? tpsWidth : timeWidth);
            if (bottomValueCount == 1) {
                bottomWidth = Math.max(34.0f, paddingX + firstWidth + paddingX);
                this.drawSimpleWatermarkPanel(matrices, x2, bottomY, bottomWidth, bottomHeight, themeColor);
                float bottomDrawX = x2 + paddingX;
                if (hasServer) {
                    this.drawServerNameWithThemeSuffix(matrices, mainFont, serverDisplayName, bottomDrawX, bottomTextY, textColor, themeColor);
                } else if (hasTps) {
                    mainFont.draw(matrices, tpsValue, bottomDrawX, bottomTextY, textColor);
                    mainFont.draw(matrices, tpsSuffix, bottomDrawX + mainFont.getWidth(tpsValue), bottomTextY, themeColor);
                } else {
                    this.drawTimeWithThemeSeconds(matrices, mainFont, timeText, bottomDrawX, bottomTextY, textColor, themeColor);
                }
            } else {
                float bottomDrawX = x2 + paddingX;
                if (hasServer) {
                    bottomDrawX += serverWidth;
                    if (hasTps || hasBottomTime) {
                        bottomDrawX += separatorWidth;
                    }
                }
                if (hasTps) {
                    bottomDrawX += tpsWidth;
                    if (hasBottomTime) {
                        bottomDrawX += separatorWidth;
                    }
                }
                if (hasBottomTime) {
                    bottomDrawX += timeWidth;
                }
                bottomWidth = Math.max(34.0f, bottomDrawX - x2 + paddingX);
                this.drawSimpleWatermarkPanel(matrices, x2, bottomY, bottomWidth, bottomHeight, themeColor);
                bottomDrawX = x2 + paddingX;
                if (hasServer) {
                    this.drawServerNameWithThemeSuffix(matrices, mainFont, serverDisplayName, bottomDrawX, bottomTextY, textColor, themeColor);
                    bottomDrawX += serverWidth;
                    if (hasTps || hasBottomTime) {
                        this.drawSeparatorDot(matrices, (bottomDrawX += 6.0f) + serverDotOffsetX, bottomDotY);
                        bottomDrawX += 5.0f;
                    }
                }
                if (hasTps) {
                    mainFont.draw(matrices, tpsValue, bottomDrawX, bottomTextY, textColor);
                    mainFont.draw(matrices, tpsSuffix, bottomDrawX + mainFont.getWidth(tpsValue), bottomTextY, themeColor);
                    bottomDrawX += tpsWidth;
                    if (hasBottomTime) {
                        this.drawSeparatorDot(matrices, (bottomDrawX += 6.0f) + tpsDotOffsetX, bottomDotY);
                        bottomDrawX += 5.0f;
                    }
                }
                if (hasBottomTime) {
                    this.drawTimeWithThemeSeconds(matrices, mainFont, timeText, bottomDrawX, bottomTextY, textColor, themeColor);
                }
            }
        }
        this.draggable.setWidth(Math.max(width, bottomWidth));
        this.draggable.setHeight(showBottom ? height + 3.0f + bottomHeight : height);
    }

    private int getHudThemeColor() {
        if (!Wonderful.INSTANCE.themeStorage.getThemes().getTheme().getName().equals("Rainbow")) {
            return Wonderful.INSTANCE.themeStorage.getThemes().getTheme().color[0];
        }
        return ColorUtils.getThemeColor();
    }

    private void drawWatermarkPanel(MatrixStack matrices, float x2, float y2, float width, float height, int themeColor, float waveBaseX) {
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
        this.drawWatermarkLightWaveMask(matrices, innerX + 0.5f, innerY + 0.5f, innerWidth - 1.0f, innerHeight - 1.0f, lightTop, lightBottom, waveBaseX);
        this.drawWatermarkWaveStroke(matrices, innerY + 0.5f, innerHeight - 1.0f, waveBaseX);
    }

    private void drawSimpleWatermarkPanel(MatrixStack matrices, float x2, float y2, float width, float height, int themeColor) {
        int topColor = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.15f), 255);
        int bottomColor = ColorUtils.setAlphaColor(ColorUtils.darken(themeColor, 0.05f), 255);
        float inset = 0.0f;
        RenderUtils.drawGradientRect(matrices, x2 + inset, y2 + inset, width - inset * 2.0f, height - inset * 2.0f, 3.0f, topColor, bottomColor);
    }

    private void drawWatermarkLightWaveMask(MatrixStack matrices, float x2, float y2, float width, float height, int topColor, int bottomColor, float waveBaseX) {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_COLOR);
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
        int segments = 220;
        for (int i2 = 0; i2 < segments; ++i2) {
            float t1 = (float)i2 / (float)segments;
            float t2 = (float)(i2 + 1) / (float)segments;
            float y1 = y2 + height * t1;
            float y22 = y2 + height * t2;
            float leftX1 = this.getRoundedLeftClipX(x2, y2, height, y1);
            float leftX2 = this.getRoundedLeftClipX(x2, y2, height, y22);
            float waveX1 = this.getWatermarkWaveX(waveBaseX, t1);
            float waveX2 = this.getWatermarkWaveX(waveBaseX, t2);
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

    private float getWatermarkWaveX(float waveBaseX, float t2) {
        int point;
        t2 = MathHelper.clamp((float)t2, (float)0.0f, (float)1.0f);
        for (point = 0; point < WATERMARK_WAVE_T.length - 2 && t2 > WATERMARK_WAVE_T[point + 1]; ++point) {
        }
        int p0 = Math.max(0, point - 1);
        int p1 = point;
        int p2 = Math.min(WATERMARK_WAVE_T.length - 1, point + 1);
        int p3 = Math.min(WATERMARK_WAVE_T.length - 1, point + 2);
        float span = WATERMARK_WAVE_T[p2] - WATERMARK_WAVE_T[p1];
        float local = span <= 1.0E-4f ? 0.0f : (t2 - WATERMARK_WAVE_T[p1]) / span;
        float local2 = local * local;
        float local3 = local2 * local;
        float x0 = WATERMARK_WAVE_X[p0];
        float x1 = WATERMARK_WAVE_X[p1];
        float x2 = WATERMARK_WAVE_X[p2];
        float x3 = WATERMARK_WAVE_X[p3];
        float wave = 0.5f * (2.0f * x1 + (-x0 + x2) * local + (2.0f * x0 - 5.0f * x1 + 4.0f * x2 - x3) * local2 + (-x0 + 3.0f * x1 - 3.0f * x2 + x3) * local3);
        return waveBaseX + wave;
    }

    private void drawWatermarkWaveStroke(MatrixStack matrices, float y2, float height, float waveBaseX) {
        this.drawWatermarkWaveSoftStroke(matrices, y2, height, waveBaseX, 1.75f, ColorUtils.rgba(185, 185, 185, 255), 150);
        this.drawWatermarkWaveSoftStroke(matrices, y2, height, waveBaseX, 1.15f, ColorUtils.rgba(185, 185, 185, 255), 170);
        this.drawWatermarkWaveSoftStroke(matrices, y2, height, waveBaseX, 0.7f, HUD_WAVE_STROKE_COLOR, 190);
    }

    private void drawWatermarkWaveSoftStroke(MatrixStack matrices, float y2, float height, float waveBaseX, float diameter, int color, int steps) {
        int alpha = ColorUtils.getAlpha(color);
        if (alpha <= 0 || diameter <= 0.0f || steps <= 0) {
            return;
        }
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_COLOR);
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.TRIANGLES, VertexFormats.POSITION_COLOR);
        float half = diameter * 0.5f;
        float red = ColorUtils.redf(color);
        float green = ColorUtils.greenf(color);
        float blue = ColorUtils.bluef(color);
        float alphaF = (float)alpha / 255.0f;
        for (int i2 = 0; i2 <= steps; ++i2) {
            float t2 = (float)i2 / (float)steps;
            float centerX = this.getWatermarkWaveX(waveBaseX, t2);
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

    private void drawServerNameWithThemeSuffix(MatrixStack matrices, Font font, String serverName, float x2, float y2, int textColor, int themeColor) {
        int suffixStart = serverName.lastIndexOf(46);
        if (suffixStart <= 0 || suffixStart >= serverName.length() - 1) {
            font.draw(matrices, serverName, x2, y2, textColor);
            return;
        }
        String namePart = serverName.substring(0, suffixStart);
        String suffixPart = serverName.substring(suffixStart);
        font.draw(matrices, namePart, x2, y2, textColor);
        font.draw(matrices, suffixPart, x2 + font.getWidth(namePart) - 2.0f, y2, themeColor);
    }

    private void drawTimeWithThemeSeconds(MatrixStack matrices, Font font, String time, float x2, float y2, int textColor, int themeColor) {
        int secondsStart = time.lastIndexOf(58);
        if (secondsStart < 0 || secondsStart >= time.length() - 1) {
            font.draw(matrices, time, x2, y2, textColor);
            return;
        }
        String timePart = time.substring(0, secondsStart + 1);
        String secondsPart = time.substring(secondsStart + 1);
        font.draw(matrices, timePart, x2, y2, textColor);
        font.draw(matrices, secondsPart, x2 + font.getWidth(timePart) - 2.0f, y2, themeColor);
    }

    public void DefaultStyle(EventRender.Default eventRender) {
        ServerInfo info;
        PlayerListEntry entry;
        MatrixStack matrices = eventRender.getContext().getMatrices();
        float x2 = this.draggable.getX();
        float y2 = this.draggable.getY();
        Font logoFont = Fonts.getFont("logo", 17);
        Font iconNew14 = Fonts.getFont("iconnew", 14);
        Font iconNew15 = Fonts.getFont("iconnew", 15);
        Font icon14 = Fonts.getFont("icon", 14);
        Font statsIconFont = Fonts.getFont("wonderful", 14);
        if (statsIconFont == null) {
            statsIconFont = iconNew14 != null ? iconNew14 : icon14;
        }
        Font pingIconFont = iconNew14 != null ? iconNew14 : statsIconFont;
        Font suisse13 = Fonts.getFont("suisse", 13);
        float wonderfulRectH = 16.0f;
        int iconSize = 17;
        String iconGlyph = "A";
        float iconW = logoFont.getStringWidth(iconGlyph);
        float iconX = x2 + (17.0f - iconW) / 2.0f;
        float iconY = y2 + 5.5f;
        int iconTop = !Wonderful.INSTANCE.themeStorage.getThemes().getTheme().getName().equals("Rainbow") ? Wonderful.INSTANCE.themeStorage.getThemes().getTheme().color[0] : ColorUtils.getThemeColor();
        boolean drawSquares = this.isUnusualRectType();
        float rect2Pad = 3.0f;
        String username = this.showUsername ? WaterMark.getUsername() : "";
        String UID = WaterMark.getUID();
        int whiteColor = new Color(255, 255, 255, 255).getRGB();
        float textY = y2 + 6.8f;
        String brandText = "";
        float brandTextX = iconX + iconW + 2.5f;
        float brandTextW = suisse13.getStringWidth(brandText);
        float wonderfulRectX = x2;
        float wonderfulRectY = y2;
        float wonderfulRectW = brandTextX + brandTextW + 1.5f - x2;
        RenderUtils.drawGradientRect(matrices, wonderfulRectX, wonderfulRectY, wonderfulRectW, wonderfulRectH, 2.8f, ColorUtils.darken(iconTop, 0.15f), ColorUtils.darken(iconTop, 0.05f));
        if (drawSquares) {
            
        }
        logoFont.drawGradientStringHorizontal(matrices, iconGlyph, iconX - 0.25f, iconY, iconTop, iconTop);
        suisse13.drawString(matrices, brandText, brandTextX, textY, whiteColor);
        float rect2X = wonderfulRectX + wonderfulRectW + 2.5f;
        float rect2H = 15.85f;
        int icon3Size = 14;
        String fpsIconGlyph = "J";
        String pingIconGlyph = "y";
        float statsIconY = y2 + 5.45f;
        float fpsIconOffsetX = 0.0f;
        float fpsIconOffsetY = 0.0f;
        float pingIconOffsetX = 0.0f;
        float pingIconOffsetY = 1.3f;
        int fps = mc != null ? mc.getCurrentFps() : 0;
        String fpsValue = String.valueOf(fps);
        String fpsSuffix = "fps";
        String fpsText = fpsValue + fpsSuffix;
        int ping = 0;
        if (mc != null && WaterMark.mc.player != null && mc.getNetworkHandler() != null && (entry = mc.getNetworkHandler().getPlayerListEntry(WaterMark.mc.player.getUuid())) != null) {
            ping = entry.getLatency();
        }
        String pingValue = String.valueOf(ping);
        String pingSuffix = "ms";
        String pingText = pingValue + pingSuffix;
        boolean showTop = this.showUsername || this.showFps || this.showMs;
        float rect2W = 0.0f;
        if (showTop) {
            float contentW = rect2Pad;
            contentW += iconNew14.getStringWidth("e") + 1.0f;
            if (!username.isEmpty()) {
                contentW += suisse13.getStringWidth(username) + 2.0f;
            }
            if (this.showFps) {
                contentW += statsIconFont != null ? statsIconFont.getStringWidth(fpsIconGlyph) + 2.0f : 0.0f;
                contentW += suisse13.getStringWidth(fpsText) + 2.0f;
            }
            if (this.showMs) {
                contentW += pingIconFont != null ? pingIconFont.getStringWidth(pingIconGlyph) + 2.0f : 0.0f;
                contentW += suisse13.getStringWidth(pingText) + 2.0f;
            }
            rect2W = (contentW += rect2Pad) - 1.05f;
            RenderUtils.drawGradientRect(matrices, rect2X, wonderfulRectY, rect2W, rect2H, 2.8f, ColorUtils.darken(iconTop, 0.15f), ColorUtils.darken(iconTop, 0.05f));
            if (drawSquares) {
                RenderUtils.drawHudSquarePattern(matrices, rect2X, wonderfulRectY, rect2W, rect2H, iconTop);
            }
            float drawX = rect2X + rect2Pad + 1.5f;
            String iconGlyph2 = "e";
            float icon2Y = y2 + 7.05f;
            iconNew14.drawGradientStringHorizontal(matrices, iconGlyph2, drawX - 1.0f, icon2Y, iconTop, iconTop);
            drawX += iconNew14.getStringWidth(iconGlyph2) + 1.0f;
            if (!username.isEmpty()) {
                suisse13.drawString(matrices, username, drawX, textY, whiteColor);
                drawX += suisse13.getStringWidth(username) + 2.0f;
            }
            if (this.showFps) {
                float fpsDrawX = drawX;
                if (statsIconFont != null) {
                    statsIconFont.drawGradientStringHorizontal(matrices, fpsIconGlyph, fpsDrawX + fpsIconOffsetX, statsIconY + fpsIconOffsetY, iconTop, iconTop);
                    fpsDrawX += statsIconFont.getStringWidth(fpsIconGlyph) + 2.0f;
                }
                suisse13.drawString(matrices, fpsValue, fpsDrawX, textY, whiteColor);
                suisse13.drawString(matrices, fpsSuffix, fpsDrawX + suisse13.getStringWidth(fpsValue) - 1.0f, textY, iconTop);
                drawX += (statsIconFont != null ? statsIconFont.getStringWidth(fpsIconGlyph) + 2.0f : 0.0f) + suisse13.getStringWidth(fpsText) + 2.0f;
            }
            if (this.showMs) {
                float pingDrawX = drawX;
                if (pingIconFont != null) {
                    pingIconFont.drawGradientStringHorizontal(matrices, pingIconGlyph, pingDrawX + pingIconOffsetX, statsIconY + pingIconOffsetY, iconTop, iconTop);
                    pingDrawX += pingIconFont.getStringWidth(pingIconGlyph) + 2.0f;
                }
                suisse13.drawString(matrices, pingValue, pingDrawX, textY, whiteColor);
                suisse13.drawString(matrices, pingSuffix, pingDrawX + suisse13.getStringWidth(pingValue) - 0.5f, textY, iconTop);
            }
        }
        String serverName = "Singleplayer";
        if (mc != null && (info = mc.getCurrentServerEntry()) != null && info.address != null && !info.address.isEmpty()) {
            serverName = info.address;
        }
        boolean showBottom = this.showServer || this.showTps;
        float rectBtmY = wonderfulRectY + wonderfulRectH + 2.0f;
        float rectBtmH = 15.85f;
        int iconSmallSize = 15;
        float iconSmallW = iconNew15.getStringWidth(iconGlyph);
        float iconSmallY = rectBtmY + (rectBtmH - (float)iconSmallSize) / 2.0f + 6.5f + 0.4f;
        float serverTextY = rectBtmY + (rectBtmH - 12.0f) / 2.0f + 5.5f + 0.4f;
        String serverDisplayName = this.formatServerNameForDisplay(serverName);
        float serverTextW = suisse13.getStringWidth(serverDisplayName);
        int extraIconSize = 15;
        Font tpsIconFont = Fonts.getFont("wonderful", 15);
        String extraIconGlyph = "B";
        float extraIconW = tpsIconFont.getStringWidth(extraIconGlyph);
        float extraIconY = rectBtmY + (rectBtmH - (float)extraIconSize) / 2.0f + 5.9f + 0.4f;
        String tpsValue = this.formatOneDecimal(this.getServerTps());
        String tpsSuffix = "tps";
        String tpsText = tpsValue + tpsSuffix;
        float tpsTextW = suisse13.getStringWidth(tpsText);
        float rectBtmW = 0.0f;
        if (showBottom) {
            float bottomX = x2 + rect2Pad + 8.5f;
            if (this.showServer) {
                bottomX += iconSmallW + 3.0f + serverTextW;
            }
            if (this.showTps) {
                if (this.showServer) {
                    bottomX += 3.0f;
                }
                bottomX += extraIconW + 3.0f + tpsTextW;
            }
            rectBtmW = Math.max(40.0f, bottomX + rect2Pad - x2);
            RenderUtils.drawGradientRect(matrices, x2, rectBtmY, rectBtmW - 2.85f, rectBtmH, 2.8f, ColorUtils.darken(iconTop, 0.15f), ColorUtils.darken(iconTop, 0.05f));
            if (drawSquares) {
                RenderUtils.drawHudSquarePattern(matrices, x2, rectBtmY, rectBtmW, rectBtmH, iconTop);
            }
            float drawBottomX = x2 + rect2Pad + 7.0f;
            if (this.showServer) {
                iconNew15.drawGradientStringHorizontal(matrices, "n", drawBottomX - 6.5f, iconSmallY, iconTop, iconTop);
                this.drawServerNameWithThemeParts(matrices, serverDisplayName, drawBottomX += iconSmallW + 3.0f, serverTextY, iconTop, whiteColor);
                drawBottomX += serverTextW;
            }
            if (this.showTps) {
                if (this.showServer) {
                    drawBottomX += 3.0f;
                }
                tpsIconFont.drawGradientStringHorizontal(matrices, extraIconGlyph, drawBottomX - 1.5f, extraIconY, iconTop, iconTop);
                suisse13.drawString(matrices, tpsValue, (drawBottomX += extraIconW + 3.0f) - 1.75f, serverTextY, whiteColor);
                suisse13.drawString(matrices, tpsSuffix, drawBottomX + suisse13.getStringWidth(tpsValue) - 2.5f, serverTextY, iconTop);
            }
        }
        float topWidth = showTop ? wonderfulRectW + 2.0f + rect2W : wonderfulRectW;
        float totalW = Math.max(topWidth, rectBtmW);
        this.draggable.setWidth(totalW);
        this.draggable.setHeight(showBottom ? wonderfulRectH + 1.0f + rectBtmH : wonderfulRectH);
    }

    private void drawServerNameWithThemeParts(MatrixStack matrices, String serverName, float x2, float y2, int themeColor, int whiteColor) {
        Font font = Fonts.getFont("suisse", 13);
        String[] parts = serverName.split("\\.");
        if (parts.length < 2) {
            font.drawString(matrices, serverName, x2, y2, whiteColor);
            return;
        }
        String mainPart = String.join((CharSequence)".", Arrays.copyOf(parts, parts.length - 1));
        String suffixPart = "." + parts[parts.length - 1];
        font.drawString(matrices, mainPart, x2, y2, whiteColor);
        float suffixX = x2 + font.getStringWidth(mainPart) - 2.0f;
        font.drawString(matrices, suffixPart, suffixX, y2, themeColor);
    }

    private String formatServerNameForDisplay(String serverName) {
        String[] parts;
        if (serverName == null || serverName.isEmpty()) {
            return "";
        }
        String host = serverName;
        int portIndex = host.indexOf(58);
        if (portIndex > 0) {
            host = host.substring(0, portIndex);
        }
        if ((parts = host.split("\\.")).length >= 3) {
            return String.join((CharSequence)".", Arrays.copyOfRange(parts, 1, parts.length));
        }
        return host;
    }

    private float getServerTps() {
        if (Wonderful.INSTANCE == null || Wonderful.INSTANCE.tpsCalc == null) {
            return 20.0f;
        }
        return Math.max(0.0f, Math.min(20.0f, Wonderful.INSTANCE.tpsCalc.getTPS()));
    }

    private String formatOneDecimal(float value) {
        int scaled = Math.round(value * 10.0f);
        return scaled / 10 + "." + Math.abs(scaled % 10);
    }
}