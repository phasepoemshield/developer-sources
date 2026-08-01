package sky.core.util.render.font;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;

public final class FontRenderer {
    private static final FontRenderContext FONT_RENDER_CONTEXT =
            new FontRenderContext(new AffineTransform(), true, true);

    private final Map<Identifier, List<GlyphDrawEntry>> drawQueue = new HashMap<>();
    private final List<FontGlyphAtlas> atlases = new ArrayList<>();
    private Font font;
    private float size;

    public FontRenderer(Font baseFont, float halfSize) {
        this.size = halfSize;
        this.font = baseFont.deriveFont(halfSize * 2.0F);
    }

    public float getSize() {
        return this.size;
    }

    public void draw(String text, double x, double y, Color color, MatrixStack matrices) {
        this.draw(matrices, text, x, y, color.getRGB());
    }

    public void drawCentered(String text, double centerX, double y, Color color, MatrixStack matrices) {
        this.draw(text, centerX - this.getWidth(text) / 2.0, y, color, matrices);
    }

    public void draw(MatrixStack matrices, String text, double x, double y, int color) {
        matrices.push();
        x = Math.round(x * 2.0) / 2.0;
        y = Math.round(y * 2.0) / 2.0;
        matrices.translate(x, y, 0.0);
        matrices.scale(0.5F, 0.5F, 0.5F);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        char[] chars = text.toCharArray();
        float[] positions = this.getGlyphPositions(text);
        float lineOffset = 0.0F;
        int lineStart = 0;

        for (int index = 0; index < chars.length; index++) {
            char value = chars[index];
            if (value == '\n') {
                lineOffset += this.getLineHeight(text.substring(lineStart, index)) - 2.0F;
                lineStart = index + 1;
                if (lineStart < chars.length) {
                    positions = this.getGlyphPositions(text.substring(lineStart));
                }
                continue;
            }

            FontGlyph glyph = this.getGlyph(value);
            if (glyph != null && glyph.value() != ' ') {
                Identifier atlasId = glyph.atlas().textureId;
                float glyphX = positions[index - lineStart];
                this.drawQueue.computeIfAbsent(atlasId, key -> new ArrayList<>())
                        .add(new GlyphDrawEntry(glyphX, lineOffset, color, glyph));
            }
        }

        this.flush(matrix);
        RenderSystem.disableBlend();
        this.drawQueue.clear();
        matrices.pop();
    }

    private void flush(Matrix4f matrix) {
        RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
        for (Map.Entry<Identifier, List<GlyphDrawEntry>> entry : this.drawQueue.entrySet()) {
            Identifier atlasId = entry.getKey();
            RenderSystem.setShaderTexture(0, atlasId);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);

            BufferBuilder builder = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
            for (GlyphDrawEntry drawEntry : entry.getValue()) {
                float drawX = drawEntry.x();
                float drawY = drawEntry.y();
                FontGlyph glyph = drawEntry.glyph();
                FontGlyphAtlas atlas = glyph.atlas();
                float glyphWidth = glyph.width();
                float glyphHeight = glyph.height();
                float minU = (float) glyph.u() / atlas.width;
                float minV = (float) glyph.v() / atlas.height;
                float maxU = (float) (glyph.u() + glyph.width()) / atlas.width;
                float maxV = (float) (glyph.v() + glyph.height()) / atlas.height;
                int argb = drawEntry.color();
                builder.vertex(matrix, drawX, drawY + glyphHeight, 0.0F).texture(minU, maxV).color(argb);
                builder.vertex(matrix, drawX + glyphWidth, drawY + glyphHeight, 0.0F).texture(maxU, maxV).color(argb);
                builder.vertex(matrix, drawX + glyphWidth, drawY, 0.0F).texture(maxU, minV).color(argb);
                builder.vertex(matrix, drawX, drawY, 0.0F).texture(minU, minV).color(argb);
            }
            BufferRenderer.drawWithGlobalProgram(builder.end());
        }
    }

    private float[] getGlyphPositions(String text) {
        if (text.isEmpty()) {
            return new float[0];
        }

        String firstLine = text.split("\n", 2)[0];
        float[] positions = new float[firstLine.length()];
        GlyphVector vector = this.font.createGlyphVector(FONT_RENDER_CONTEXT, firstLine);
        positions[0] = 0.0F;
        float cursor = 0.0F;

        for (int index = 1; index < firstLine.length(); index++) {
            float previous = (float) vector.getGlyphPosition(index - 1).getX();
            float current = (float) vector.getGlyphPosition(index).getX();
            cursor += Math.round(current - previous);
            positions[index] = cursor;
        }

        return positions;
    }

    private FontGlyph getGlyph(char value) {
        for (FontGlyphAtlas atlas : this.atlases) {
            if (atlas.contains(value)) {
                return atlas.glyph(value);
            }
        }

        char pageStart = (char) (256 * (int) Math.floor(value / 256.0));
        FontGlyphAtlas atlas = new FontGlyphAtlas(pageStart, (char) (pageStart + 256), this.font, createAtlasId(), 5);
        this.atlases.add(atlas);
        return atlas.glyph(value);
    }

    private static Identifier createAtlasId() {
        Random random = new Random();
        String suffix = IntStream.range(0, 32)
                .mapToObj(index -> String.valueOf((char) ('a' + random.nextInt(26))))
                .collect(Collectors.joining());
        return Identifier.of("skycore", "font_atlas/" + suffix);
    }

    public float getWidth(String text) {
        if (text.isEmpty()) {
            return 0.0F;
        }

        float maxWidth = 0.0F;
        for (String line : text.split("\n")) {
            if (line.isEmpty()) {
                continue;
            }

            GlyphVector vector = this.font.createGlyphVector(FONT_RENDER_CONTEXT, line);
            float lineWidth = 0.0F;
            for (int index = 1; index <= line.length(); index++) {
                float previous = (float) vector.getGlyphPosition(index - 1).getX();
                float current = (float) vector.getGlyphPosition(index).getX();
                lineWidth += Math.round(current - previous);
            }
            maxWidth = Math.max(maxWidth, lineWidth);
        }

        return (float) (Math.round(maxWidth / 2.0F * 2.0) / 2.0);
    }

    public float getLineHeight(String text) {
        float tallest = 0.0F;
        float total = 0.0F;

        for (char value : (text.isEmpty() ? " " : text).toCharArray()) {
            if (value == '\n') {
                total += tallest == 0.0F ? this.getGlyph(' ').height() : tallest;
                tallest = 0.0F;
            } else {
                FontGlyph glyph = this.getGlyph(value);
                tallest = Math.max(glyph == null ? 0.0F : glyph.height(), tallest);
            }
        }

        return (float) (Math.round((tallest + total) / 2.0F * 2.0) / 2.0);
    }
}
