package sky.core.util.render;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.Optional;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.util.Window;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import sky.core.util.render.shader.ShaderLibrary;
import sky.core.util.render.shader.ShaderProgram;

public final class RenderUtil {
    private static RenderUtil instance;

    public static void init() {
        instance = new RenderUtil();
    }

    public static RenderUtil get() {
        return instance;
    }

    public void drawRoundedRect(float x, float y, float width, float height, float radius, Color color, MatrixStack matrices) {
        ShaderLibrary.loadDefaultShaders();
        Optional<ShaderProgram> shader = ShaderLibrary.getRegistry().find("round_rect");
        if (shader.isEmpty()) {
            return;
        }

        Window window = MinecraftClient.getInstance().getWindow();
        ShaderProgram program = shader.get();
        program.bind();
        float scale = ScreenScale.getScale();
        program.setVec2("location", x * scale, window.getHeight() - height * scale - y * scale);
        program.setVec2("rectSize", width * scale, height * scale);
        program.setFloat("radius", radius);
        program.setColor("color", color);
        BlendUtil.runBlended(() -> ShaderProgram.drawQuad(x, y, width, height));
        program.unbind();
    }

    public void drawRoundedRect(float x, float y, float width, float height, Color color, MatrixStack matrices) {
        this.drawRoundedRect(x, y, width, height, 0.0F, color, matrices);
    }

    public void drawRoundedOutline(float x, float y, float width, float height, float radius, float thickness, Color color, MatrixStack matrices) {
        ShaderLibrary.loadDefaultShaders();
        Optional<ShaderProgram> shader = ShaderLibrary.getRegistry().find("round_rect_outline");
        if (shader.isEmpty()) {
            return;
        }

        Window window = MinecraftClient.getInstance().getWindow();
        ShaderProgram program = shader.get();
        program.bind();
        float scale = ScreenScale.getScale();
        float drawX = x - thickness;
        float drawY = y - (1.0F + thickness);
        float drawWidth = width + thickness * 2.0F;
        float drawHeight = height + (2.0F + thickness * 2.0F);
        program.setVec2("location", drawX * scale, window.getHeight() - drawHeight * scale - drawY * scale);
        program.setVec2("rectSize", drawWidth * scale, drawHeight * scale);
        program.setFloat("radius", radius);
        program.setFloat("thickness", thickness);
        program.setColor("color", new Color(0, 0, 0, 0));
        program.setColor("outlineColor", color);
        BlendUtil.runBlended(() -> ShaderProgram.drawQuad(drawX, drawY, drawWidth, drawHeight));
        program.unbind();
    }

    public void drawGradientRoundedRect(
            float x,
            float y,
            float width,
            float height,
            float radius,
            Color topLeft,
            Color topRight,
            Color bottomLeft,
            Color bottomRight,
            MatrixStack matrices
    ) {
        ShaderLibrary.loadDefaultShaders();
        Optional<ShaderProgram> shader = ShaderLibrary.getRegistry().find("gradient");
        if (shader.isEmpty()) {
            return;
        }

        Window window = MinecraftClient.getInstance().getWindow();
        ShaderProgram program = shader.get();
        program.bind();
        float scale = ScreenScale.getScale();
        program.setVec2("location", x * scale, window.getHeight() - height * scale - y * scale);
        program.setVec2("rectSize", width * scale, height * scale);
        program.setVec4("radii", radius, radius, radius, radius);
        program.setColor("topLeftColor", topLeft);
        program.setColor("topRightColor", topRight);
        program.setColor("bottomLeftColor", bottomLeft);
        program.setColor("bottomRightColor", bottomRight);
        BlendUtil.runBlended(() -> ShaderProgram.drawQuad(x, y, width, height));
        program.unbind();
    }

    public void drawVerticalGradientRoundedRect(
            float x,
            float y,
            float width,
            float height,
            float radius,
            Color topColor,
            Color bottomColor,
            MatrixStack matrices
    ) {
        this.drawGradientRoundedRect(x, y, width, height, radius, topColor, topColor, bottomColor, bottomColor, matrices);
    }

    public void drawCircle(float centerX, float centerY, float radius, Color color, MatrixStack matrices) {
        ShaderLibrary.loadDefaultShaders();
        Optional<ShaderProgram> shader = ShaderLibrary.getRegistry().find("circle");
        if (shader.isEmpty()) {
            return;
        }

        Window window = MinecraftClient.getInstance().getWindow();
        float size = radius * 2.0F;
        float x = centerX - radius;
        float y = centerY - radius;
        ShaderProgram program = shader.get();
        program.bind();
        float scale = ScreenScale.getScale();
        program.setVec2("location", x * scale, window.getHeight() - size * scale - y * scale);
        program.setVec2("rectSize", size * scale, size * scale);
        program.setFloat("radius", radius * scale);
        program.setColor("color", color);
        BlendUtil.runBlended(() -> ShaderProgram.drawQuad(x, y, size, size));
        program.unbind();
    }

    public void drawTexture(Identifier texture, float x, float y, float width, float height, Color color, MatrixStack matrices) {
        final float drawX = snapHud(x);
        final float drawY = snapHud(y);
        final float drawWidth = snapHud(width);
        final float drawHeight = snapHud(height);

        int glId = MinecraftClient.getInstance().getTextureManager().getTexture(texture).getGlId();
        int[] texSize = TextureUtil.getSize(texture);
        this.bindTextureFilter(glId, drawWidth, drawHeight, texSize[0], texSize[1]);
        RenderSystem.setShaderTexture(0, glId);
        RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
        BlendUtil.runBlended(() -> {
            Matrix4f matrix = new Matrix4f();
            Tessellator tessellator = Tessellator.getInstance();
            BufferBuilder buffer = tessellator.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
            int red = color.getRed();
            int green = color.getGreen();
            int blue = color.getBlue();
            int alpha = color.getAlpha();
            buffer.vertex(matrix, drawX, drawY + drawHeight, 0.0F).texture(0.0F, 1.0F).color(red, green, blue, alpha);
            buffer.vertex(matrix, drawX + drawWidth, drawY + drawHeight, 0.0F).texture(1.0F, 1.0F).color(red, green, blue, alpha);
            buffer.vertex(matrix, drawX + drawWidth, drawY, 0.0F).texture(1.0F, 0.0F).color(red, green, blue, alpha);
            buffer.vertex(matrix, drawX, drawY, 0.0F).texture(0.0F, 0.0F).color(red, green, blue, alpha);
            BufferRenderer.drawWithGlobalProgram(buffer.end());
        });
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);
    }

    public void drawTextureNative(Identifier texture, float centerX, float centerY, Color color, MatrixStack matrices) {
        float width = TextureUtil.nativeHudWidth(texture);
        float height = TextureUtil.nativeHudHeight(texture);
        this.drawTexture(texture, centerX - width / 2.0F, centerY - height / 2.0F, width, height, color, matrices);
    }

    private static float snapHud(float value) {
        float scale = ScreenScale.getScale();
        return Math.round(value * scale) / scale;
    }

    private void bindTextureFilter(int glId, float drawWidth, float drawHeight, int texWidth, int texHeight) {
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, glId);
        float scale = ScreenScale.getScale();
        boolean pixelPerfect = Math.abs(drawWidth * scale - texWidth) < 0.01F
                && Math.abs(drawHeight * scale - texHeight) < 0.01F;
        int filter = pixelPerfect ? GL11.GL_NEAREST : GL11.GL_LINEAR;
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, filter);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, filter);
    }

    private void bindCrispTexture(int glId) {
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, glId);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
    }

    public void drawRoundedTexture(
            Identifier texture,
            float x,
            float y,
            float width,
            float height,
            float radius,
            Color color,
            MatrixStack matrices
    ) {
        this.drawRoundedTexture(texture, x, y, width, height, radius, 0.0F, 0.0F, 1.0F, 1.0F, color, matrices);
    }

    public void drawRoundedTexture(
            Identifier texture,
            float x,
            float y,
            float width,
            float height,
            float radius,
            float u,
            float v,
            float regionWidth,
            float regionHeight,
            Color color,
            MatrixStack matrices
    ) {
        ShaderLibrary.loadDefaultShaders();
        Optional<ShaderProgram> shader = ShaderLibrary.getRegistry().find("round_texture");
        if (shader.isEmpty()) {
            this.drawTexture(texture, x, y, width, height, color, matrices);
            return;
        }

        Window window = MinecraftClient.getInstance().getWindow();
        int glId = MinecraftClient.getInstance().getTextureManager().getTexture(texture).getGlId();
        GL30.glActiveTexture(GL30.GL_TEXTURE0);
        this.bindCrispTexture(glId);

        ShaderProgram program = shader.get();
        program.bind();
        float scale = ScreenScale.getScale();
        program.setVec2("location", x * scale, window.getHeight() - height * scale - y * scale);
        program.setVec2("rectSize", width * scale, height * scale);
        program.setFloat("radius", radius);
        program.setInt("tex", 0);
        program.setFloat("u", u);
        program.setFloat("v", v);
        program.setFloat("w", regionWidth);
        program.setFloat("h", regionHeight);
        program.setColor("tintColor", color);
        BlendUtil.runBlended(() -> ShaderProgram.drawQuad(x, y, width, height));
        program.unbind();
        RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
    }
}
