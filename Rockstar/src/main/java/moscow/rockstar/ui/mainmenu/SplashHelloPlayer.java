package moscow.rockstar.ui.mainmenu;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.InputStream;
import java.util.Optional;
import moscow.rockstar.Rockstar;
import moscow.rockstar.ui.components.gif.GifDecoder;
import moscow.rockstar.util.interfaces.IMinecraft;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.client.texture.NativeImage.Format;
import net.minecraft.resource.Resource;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SplashHelloPlayer implements IMinecraft {
    private static final Logger LOGGER = LoggerFactory.getLogger("rockstar-splash");
    private static final Identifier TEXTURE_ID = Rockstar.id("splash_hello_dynamic");
    private static final Identifier GIF_ID = Rockstar.id("gifs/hello.gif");
    private static final int LOOP_START = 40;
    private static final int FULL_WORD_FRAME = 158;
    private static final int LOOP_END = 175;

    private final GifDecoder decoder = new GifDecoder();
    private NativeImageBackedTexture texture;
    private NativeImage image;
    private int frameCount;
    private int currentFrame;
    private long lastFrameTime;
    private boolean ready;
    private boolean shownFullWord;

    public SplashHelloPlayer() {
        try (InputStream in = openGifStream()) {
            if (in == null) {
                throw new IllegalStateException("hello.gif stream is null");
            }
            int status = this.decoder.read(in);
            if (status != GifDecoder.STATUS_OK) {
                throw new IllegalStateException("GifDecoder status=" + status);
            }
            this.frameCount = this.decoder.getFrameCount();
            if (this.frameCount <= 0) {
                throw new IllegalStateException("hello.gif has 0 frames");
            }
            this.currentFrame = Math.min(LOOP_START, this.frameCount - 1);
            BufferedImage first = this.decoder.getFrame(this.currentFrame);
            this.image = new NativeImage(Format.RGBA, first.getWidth(), first.getHeight(), false);
            this.copyFrame(first);
            this.texture = new NativeImageBackedTexture(this.image);
            mc.getTextureManager().registerTexture(TEXTURE_ID, this.texture);
            this.texture.upload();
            this.lastFrameTime = System.currentTimeMillis();
            this.ready = true;
            LOGGER.info("Splash hello ready: {} frames, loop={}..{}", this.frameCount, LOOP_START, LOOP_END);
        } catch (Exception e) {
            LOGGER.error("Failed to init splash hello", e);
            this.dispose();
        }
    }

    private InputStream openGifStream() throws Exception {
        Optional<Resource> res = mc.getResourceManager().getResource(GIF_ID);
        if (res.isPresent()) {
            return res.get().getInputStream();
        }
        InputStream classpath = Rockstar.class.getClassLoader().getResourceAsStream("assets/rockstar/gifs/hello.gif");
        if (classpath != null) {
            LOGGER.warn("hello.gif loaded from classpath fallback");
            return classpath;
        }
        return null;
    }

    public boolean isReady() {
        return this.ready;
    }

    public boolean hasShownFullWord() {
        return this.shownFullWord;
    }

    public void render(DrawContext context, int screenW, int screenH) {
        if (!this.ready || this.texture == null) {
            return;
        }

        long now = System.currentTimeMillis();
        int delayCs = this.decoder.getDelay(this.currentFrame);
        int delayMs = Math.max(4, (delayCs <= 0 ? 20 : delayCs * 10) / 3);
        if (now - this.lastFrameTime >= delayMs) {
            this.lastFrameTime = now;
            this.currentFrame++;
            int end = Math.min(LOOP_END, this.frameCount - 1);
            if (this.currentFrame > end) {
                this.currentFrame = FULL_WORD_FRAME;
            }
            if (this.currentFrame >= FULL_WORD_FRAME) {
                this.shownFullWord = true;
            }
            this.copyFrame(this.decoder.getFrame(this.currentFrame));
            this.texture.upload();
        }

        float helloW = Math.min(screenW * 0.55F, 480.0F);
        float helloH = helloW * 240.0F / 427.0F;
        int x = Math.round((screenW - helloW) / 2.0F);
        int y = Math.round((screenH - helloH) / 2.0F - screenH * 0.04F);
        int w = Math.round(helloW);
        int h = Math.round(helloH);

        context.drawTexture(
            RenderLayer::getGuiTextured,
            TEXTURE_ID,
            x,
            y,
            0.0F,
            0.0F,
            w,
            h,
            this.image.getWidth(),
            this.image.getHeight()
        );
    }

    private void copyFrame(BufferedImage frame) {
        int w = frame.getWidth();
        int h = frame.getHeight();
        if (frame.getRaster().getDataBuffer() instanceof DataBufferInt data) {
            int[] src = data.getData();
            int i = 0;
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    this.image.setColorArgb(x, y, src[i++]);
                }
            }
            return;
        }
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                this.image.setColorArgb(x, y, frame.getRGB(x, y));
            }
        }
    }

    public void dispose() {
        this.ready = false;
        if (this.texture != null && mc != null && mc.getTextureManager() != null) {
            mc.getTextureManager().destroyTexture(TEXTURE_ID);
            this.texture.close();
        }
        this.texture = null;
        this.image = null;
    }
}
