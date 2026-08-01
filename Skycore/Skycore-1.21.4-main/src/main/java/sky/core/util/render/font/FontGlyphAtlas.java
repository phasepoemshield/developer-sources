package sky.core.util.render.font;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.util.Identifier;

public final class FontGlyphAtlas {
    public final Identifier textureId;
    public int width;
    public int height;

    private final Map<Character, FontGlyph> glyphs = new HashMap<>();
    private final char firstChar;
    private final char lastCharExclusive;
    private final Font baseFont;
    private final int padding;
    private boolean built;

    public FontGlyphAtlas(char firstChar, char lastCharExclusive, Font baseFont, Identifier textureId, int padding) {
        this.firstChar = firstChar;
        this.lastCharExclusive = lastCharExclusive;
        this.baseFont = baseFont;
        this.textureId = textureId;
        this.padding = padding;
    }

    public static void uploadTexture(Identifier textureId, BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        NativeImage nativeImage = new NativeImage(NativeImage.Format.RGBA, width, height, false);
        WritableRaster raster = image.getRaster();
        ColorModel colorModel = image.getColorModel();
        Object pixelData = createRasterDataBuffer(raster);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                raster.getDataElements(x, y, pixelData);
                int alpha = colorModel.getAlpha(pixelData);
                int red = colorModel.getRed(pixelData);
                int green = colorModel.getGreen(pixelData);
                int blue = colorModel.getBlue(pixelData);
                nativeImage.setColorArgb(x, y, (alpha << 24) | (red << 16) | (green << 8) | blue);
            }
        }

        NativeImageBackedTexture texture = new NativeImageBackedTexture(nativeImage);
        texture.upload();
        if (RenderSystem.isOnRenderThread()) {
            MinecraftClient.getInstance().getTextureManager().registerTexture(textureId, texture);
        } else {
            RenderSystem.recordRenderCall(() -> MinecraftClient.getInstance().getTextureManager().registerTexture(textureId, texture));
        }
    }

    private static Object createRasterDataBuffer(WritableRaster raster) {
        return switch (raster.getDataBuffer().getDataType()) {
            case 0 -> new byte[raster.getNumDataElements()];
            case 1 -> new short[raster.getNumDataElements()];
            case 3 -> new int[raster.getNumDataElements()];
            default -> throw new IllegalArgumentException("Unsupported raster data type");
        };
    }

    public FontGlyph glyph(char value) {
        if (!this.built) {
            this.build();
        }
        return this.glyphs.get(value);
    }

    public boolean contains(char value) {
        return value >= this.firstChar && value < this.lastCharExclusive;
    }

    private Font fontFor(char value) {
        return this.baseFont.canDisplay(value) ? this.baseFont : new Font("SansSerif", Font.PLAIN, this.baseFont.getSize());
    }

    public void build() {
        if (this.built) {
            return;
        }

        int glyphCount = Math.max(this.lastCharExclusive - this.firstChar, 1);
        int rowCapacity = Math.max((int) (Math.ceil(Math.sqrt(glyphCount)) * 1.5), 1);
        this.glyphs.clear();

        int atlasWidth = 0;
        int atlasHeight = 0;
        int cursorX = 0;
        int cursorY = 0;
        int tallestGlyphInRow = 0;
        int glyphsInRow = 0;
        ArrayList<FontGlyph> pendingGlyphs = new ArrayList<>();
        FontRenderContext renderContext = new FontRenderContext(new AffineTransform(), true, false);

        for (int glyphIndex = 0; glyphIndex < glyphCount; glyphIndex++) {
            char value = (char) (this.firstChar + glyphIndex);
            Font font = this.fontFor(value);
            Rectangle2D bounds = font.getStringBounds(String.valueOf(value), renderContext);
            int glyphWidth = (int) Math.ceil(bounds.getWidth());
            int glyphHeight = (int) Math.ceil(bounds.getHeight());

            atlasWidth = Math.max(atlasWidth, cursorX + glyphWidth);
            atlasHeight = Math.max(atlasHeight, cursorY + glyphHeight);

            if (glyphsInRow >= rowCapacity) {
                cursorX = 0;
                cursorY += tallestGlyphInRow + this.padding;
                glyphsInRow = 0;
                tallestGlyphInRow = 0;
            }

            tallestGlyphInRow = Math.max(tallestGlyphInRow, glyphHeight);
            pendingGlyphs.add(new FontGlyph(cursorX, cursorY, glyphWidth, glyphHeight, value, this));
            cursorX += glyphWidth + this.padding;
            glyphsInRow++;
        }

        BufferedImage image = new BufferedImage(
                Math.max(atlasWidth + this.padding, 1),
                Math.max(atlasHeight + this.padding, 1),
                BufferedImage.TYPE_INT_ARGB
        );
        this.width = image.getWidth();
        this.height = image.getHeight();

        Graphics2D graphics = image.createGraphics();
        try {
            graphics.setColor(new Color(255, 255, 255, 0));
            graphics.fillRect(0, 0, this.width, this.height);
            graphics.setColor(Color.WHITE);
            graphics.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
            graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

            for (FontGlyph glyph : pendingGlyphs) {
                graphics.setFont(this.fontFor(glyph.value()));
                FontMetrics metrics = graphics.getFontMetrics();
                graphics.drawString(String.valueOf(glyph.value()), glyph.u(), glyph.v() + metrics.getAscent());
                this.glyphs.put(glyph.value(), glyph);
            }
        } finally {
            graphics.dispose();
        }

        uploadTexture(this.textureId, image);
        this.built = true;
    }
}
