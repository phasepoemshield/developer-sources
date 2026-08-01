package fun.nexisdlc.client.utils.render.main.core;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.client.utils.render.main.gl.GlBackend;
import fun.nexisdlc.client.utils.render.main.text.FontObject;
import fun.nexisdlc.client.utils.render.main.text.TextRenderer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTextureView;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Renderer2D {
    private static final Logger LOGGER = LoggerFactory.getLogger(Renderer2D.class);
    private static final String DEFAULT_CULLING_OWNER = "";
    private static final float MIN_BLUR_STRENGTH = 0.5f;
    private static final float BLUR_STRENGTH_EPSILON = 0.05f;
    private static final int CLIENT_GRADIENT_SPEED = 10;
    private static final int CLIENT_GRADIENT_OFFSET = 14;
    private static final ThreadLocal<float[]> RADII_SCRATCH = ThreadLocal.withInitial(() -> new float[4]);
    private static final ThreadLocal<java.util.ArrayList<CullingRegion>> FRAME_CULLING_REGIONS =
            ThreadLocal.withInitial(java.util.ArrayList::new);
    private static final ThreadLocal<java.util.ArrayList<CullingRegion>> FRAME_ITEM_CULLING_REGIONS =
            ThreadLocal.withInitial(java.util.ArrayList::new);
    private final GlBackend backend;
    private final java.util.ArrayDeque<ClipState> clipStack = new java.util.ArrayDeque<>();
    private final java.util.ArrayDeque<Float> alphaStack = new java.util.ArrayDeque<>();
    private final java.util.ArrayDeque<String> cullingOwnerStack = new java.util.ArrayDeque<>();
    private final TransformStack transformStack = new TransformStack();
    private java.util.Map<String, TextRenderer> idToTextRenderer = new java.util.HashMap<>();
    private final java.util.Map<Identifier, Integer> textureCache = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.Set<Identifier> pendingTextures =
            java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap<>());
    private final ShapeBatcher batcher;
    private boolean frameBegun = false;
    private int frameWidth = 0;
    private int frameHeight = 0;
    private boolean blurPrepared = false;
    private float blurPreparedStrength = 0f;
    private int blurPreparedSourceTexture = 0;
    private int blurPreparedWidth = 0;
    private int blurPreparedHeight = 0;
    private boolean regionBlurPrepared = false;
    private float regionBlurPreparedStrength = 0f;
    private int regionBlurCaptureX = 0;
    private int regionBlurCaptureY = 0;
    private int regionBlurCaptureWidth = 0;
    private int regionBlurCaptureHeight = 0;

    // Lazy blur parameters (set externally before begin; used on first blur() call)
    private int lazyBlurSourceTexture = 0;
    private int lazyBlurWidth = 0;
    private int lazyBlurHeight = 0;
    private float lazyBlurStrength = 8f;

    // Adaptive blur: refresh rate of the primary monitor + padding, queried once.
    private long lastBlurUpdateNanos = 0L;
    private int cachedMonitorRefreshRate = -1;
    private static final int BLUR_REFRESH_RATE_PADDING = 15;

    public Renderer2D(GlBackend backend) {
        LOGGER.info("  - Создание Renderer2D...");
        this.backend = backend;
        this.batcher = new ShapeBatcher(backend);
        resetAlphaStack();
        resetCullingOwnerStack();
        LOGGER.info("  ✓ Renderer2D создан");
    }

    private long blurMinIntervalNanos() {
        int rate = cachedMonitorRefreshRate;
        if (rate <= 0) {
            rate = 60;
        }
        int capped = rate + BLUR_REFRESH_RATE_PADDING;
        return 1_000_000_000L / capped;
    }

    public void setLazyBlurSource(int sourceTexture, int width, int height, float strength) {
        this.lazyBlurSourceTexture = sourceTexture;
        this.lazyBlurWidth = width;
        this.lazyBlurHeight = height;
        this.lazyBlurStrength = strength;
    }

    public void begin(int width, int height) {
        if (frameBegun) {
            throw new IllegalStateException("begin() called while a frame is already active");
        }
        frameBegun = true;
        frameWidth = width;
        frameHeight = height;
        blurPrepared = false;
        blurPreparedStrength = 0f;
        blurPreparedSourceTexture = 0;
        blurPreparedWidth = 0;
        blurPreparedHeight = 0;
        regionBlurPrepared = false;
        regionBlurPreparedStrength = 0f;
        regionBlurCaptureX = 0;
        regionBlurCaptureY = 0;
        regionBlurCaptureWidth = 0;
        regionBlurCaptureHeight = 0;
        RenderFrameMetrics.getInstance().beginFrame(width, height);
        backend.beginFrame(width, height);
        backend.setScissorEnabled(false);
        clipStack.clear();
        transformStack.clear();
        resetAlphaStack();
        resetCullingOwnerStack();
        FRAME_CULLING_REGIONS.get().clear();
        FRAME_ITEM_CULLING_REGIONS.get().clear();
    }

    private void ensureFrame() {
        if (!frameBegun) {
            throw new IllegalStateException("begin() must be called before issuing draw commands");
        }
    }

    public void resetPipelineState() {
        ensureFrame();
        backend.reset2DState(frameWidth, frameHeight);
    }

    public void rect(float x, float y, float w, float h, int rgbaPremul) {
        ensureFrame();
        batcher.enqueueRect(x, y, w, h, 0f, 0f, 0f, 0f, modulateColor(rgbaPremul), transformStack.current());
    }

    public void rect(float x, float y, float w, float h, float rounding, int rgbaPremul) {
        rect(x, y, w, h, rounding, rounding, rounding, rounding, rgbaPremul);
    }

    public void rect(float x, float y, float w, float h,
                     float roundTopLeft, float roundTopRight,
                     float roundBottomRight, float roundBottomLeft,
                     int rgbaPremul) {
        ensureFrame();
        registerCullingRegions(x, y, w, h, true);
        float[] radii = scratchRadii(roundTopLeft, roundTopRight, roundBottomRight, roundBottomLeft);
        normalizeCornerRadii(w, h, radii);
        batcher.enqueueRect(x, y, w, h,
                radii[0], radii[1], radii[2], radii[3],
                modulateColor(rgbaPremul), transformStack.current());
    }

    public void drawRgbaTexture(int texture, float x, float y, float w, float h) {
        drawRgbaTextureInternal(texture, x, y, w, h, 0xFFFFFFFF, true, false);
    }

    public void drawRgbaTexture(int texture, float x, float y, float w, float h, int tintRgba) {
        drawRgbaTextureInternal(texture, x, y, w, h, tintRgba, true, false);
    }

    public void drawRgbaTexture(int texture, float x, float y, float w, float h, int tintRgba, boolean flipVertically) {
        drawRgbaTextureInternal(texture, x, y, w, h, tintRgba, flipVertically, false);
    }

    public void drawPremultipliedRgbaTexture(int texture, float x, float y, float w, float h) {
        drawRgbaTextureInternal(texture, x, y, w, h, 0xFFFFFFFF, true, true);
    }

    public void drawPremultipliedRgbaTexture(int texture, float x, float y, float w, float h,
                                             int tintRgba, boolean flipVertically) {
        drawRgbaTextureInternal(texture, x, y, w, h, tintRgba, flipVertically, true);
    }

    public void drawTexture(Identifier texture, float x, float y, float w, float h) {
        drawTexture(texture, x, y, w, h, 0xFFFFFFFF);
    }

    public void drawTexture(Identifier texture, float x, float y, float w, float h, int tintRgba) {
        drawTexture(texture, x, y, w, h, tintRgba, false);
    }

    public void drawTexture(Identifier texture, float x, float y, float w, float h, int tintRgba, boolean flipVertically) {
        int glId = resolveTextureId(texture, false);
        if (glId <= 0) {
            queueTexture(texture);
            return;
        }
        drawRgbaTextureInternal(glId, x, y, w, h, tintRgba, flipVertically, false);
    }

    public void drawTextureRegion(Identifier texture, float x, float y, float w, float h,
                                  float u0, float v0, float u1, float v1) {
        drawTextureRegion(texture, x, y, w, h, u0, v0, u1, v1, 0xFFFFFFFF, false);
    }

    public void drawTextureRegion(Identifier texture, float x, float y, float w, float h,
                                  float u0, float v0, float u1, float v1, int tintRgba) {
        drawTextureRegion(texture, x, y, w, h, u0, v0, u1, v1, tintRgba, false);
    }

    public void drawTextureRegion(Identifier texture, float x, float y, float w, float h,
                                  float u0, float v0, float u1, float v1,
                                  int tintRgba, boolean flipVertically) {
        int glId = resolveTextureId(texture, false);
        if (glId <= 0) {
            queueTexture(texture);
            return;
        }
        registerCullingRegion(x, y, w, h);
        float tv0 = flipVertically ? v1 : v0;
        float tv1 = flipVertically ? v0 : v1;
        batcher.enqueueTexturedQuad(glId, x, y, w, h, u0, tv0, u1, tv1,
                modulateColor(tintRgba), transformStack.current(), false);
    }

    public void drawTextureRegionRounded(Identifier texture, float x, float y, float w, float h,
                                         float u0, float v0, float u1, float v1,
                                         float rounding) {
        drawTextureRegionRounded(texture, x, y, w, h, u0, v0, u1, v1, 0xFFFFFFFF, rounding, false);
    }

    public void drawTextureRegionRounded(Identifier texture, float x, float y, float w, float h,
                                         float u0, float v0, float u1, float v1,
                                         int tintRgba, float rounding) {
        drawTextureRegionRounded(texture, x, y, w, h, u0, v0, u1, v1, tintRgba, rounding, false);
    }

    public void drawTextureRegionRounded(Identifier texture, float x, float y, float w, float h,
                                         float u0, float v0, float u1, float v1,
                                         int tintRgba, float rounding, boolean flipVertically) {
        int glId = resolveTextureId(texture, false);
        if (glId <= 0) {
            queueTexture(texture);
            return;
        }
        registerCullingRegion(x, y, w, h);
        float tv0 = flipVertically ? v1 : v0;
        float tv1 = flipVertically ? v0 : v1;
        float safeRound = Math.max(0f, rounding);
        float limit = Math.min(Math.abs(w), Math.abs(h)) * 0.5f;
        if (safeRound > limit) {
            safeRound = limit;
        }
        batcher.enqueueTexturedQuadRounded(glId, x, y, w, h, u0, tv0, u1, tv1,
                safeRound, modulateColor(tintRgba), transformStack.current(), false);
    }

    public void drawTextureRounded(Identifier texture, float x, float y, float w, float h, float rounding) {
        drawTextureRounded(texture, x, y, w, h, 0xFFFFFFFF, rounding, false);
    }

    public void drawTextureRounded(Identifier texture, float x, float y, float w, float h, int tintRgba, float rounding) {
        drawTextureRounded(texture, x, y, w, h, tintRgba, rounding, false);
    }

    public void drawTextureRounded(Identifier texture, float x, float y, float w, float h,
                                   int tintRgba, float rounding, boolean flipVertically) {
        int glId = resolveTextureId(texture, false);
        if (glId <= 0) {
            queueTexture(texture);
            return;
        }
        drawRgbaTextureRoundedInternal(glId, x, y, w, h, tintRgba, rounding, flipVertically, false);
    }

    public void drawRgbaTextureRounded(int texture, float x, float y, float w, float h, float rounding) {
        drawRgbaTextureRoundedInternal(texture, x, y, w, h, 0xFFFFFFFF, rounding, true, false);
    }

    public void drawRgbaTextureRounded(int texture, float x, float y, float w, float h,
                                       int tintRgba, float rounding, boolean flipVertically) {
        drawRgbaTextureRoundedInternal(texture, x, y, w, h, tintRgba, rounding, flipVertically, false);
    }

    private void drawRgbaTextureInternal(int texture, float x, float y, float w, float h,
                                         int tintRgba, boolean flipVertically,
                                         boolean preservePremultipliedColor) {
        ensureFrame();
        if (texture <= 0) {
            return;
        }
        registerCullingRegion(x, y, w, h);
        float v0 = flipVertically ? 1f : 0f;
        float v1 = flipVertically ? 0f : 1f;
        batcher.enqueueTexturedQuad(texture, x, y, w, h, 0f, v0, 1f, v1,
                modulateColor(tintRgba), transformStack.current(), preservePremultipliedColor);
    }

    private void drawRgbaTextureRoundedInternal(int texture, float x, float y, float w, float h,
                                                int tintRgba, float rounding, boolean flipVertically,
                                                boolean preservePremultipliedColor) {
        ensureFrame();
        if (texture <= 0) {
            return;
        }
        registerCullingRegion(x, y, w, h);
        float v0 = flipVertically ? 1f : 0f;
        float v1 = flipVertically ? 0f : 1f;
        float safeRound = Math.max(0f, rounding);
        float limit = Math.min(Math.abs(w), Math.abs(h)) * 0.5f;
        if (safeRound > limit) {
            safeRound = limit;
        }
        batcher.enqueueTexturedQuadRounded(texture, x, y, w, h, 0f, v0, 1f, v1,
                safeRound, modulateColor(tintRgba), transformStack.current(), preservePremultipliedColor);
    }

    public void preloadTexture(Identifier texture) {
        if (texture == null) {
            return;
        }
        int glId = resolveTextureId(texture, true);
        if (glId > 0) {
            textureCache.put(texture, glId);
        } else {
            pendingTextures.add(texture);
        }
    }

    public void preloadQueuedTextures() {
        if (pendingTextures.isEmpty()) {
            return;
        }
        var queued = new java.util.ArrayList<>(pendingTextures);
        pendingTextures.clear();
        for (Identifier id : queued) {
            preloadTexture(id);
        }
    }

    private int resolveTextureId(Identifier texture, boolean allowLoad) {
        if (texture == null) {
            return 0;
        }
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null) {
            return 0;
        }
        AbstractTexture abstractTexture;
        try {
            abstractTexture = client.getTextureManager().getTexture(texture);
        } catch (Exception e) {
            return 0;
        }
        if (abstractTexture == null) {
            textureCache.remove(texture);
            return 0;
        }
        if (abstractTexture.getGlTextureView() instanceof GlTextureView view) {
            int glId = view.texture().getGlId();
            if (glId > 0) {
                Integer cached = textureCache.get(texture);
                if (cached == null || cached != glId) {
                    textureCache.put(texture, glId);
                }
                pendingTextures.remove(texture);
                return glId;
            }
        }
        if (allowLoad) {
            pendingTextures.add(texture);
        }
        textureCache.remove(texture);
        return 0;
    }

    private void queueTexture(Identifier texture) {
        if (texture == null) {
            return;
        }
        pendingTextures.add(texture);
    }

    public void end() {
        if (!frameBegun) {
            throw new IllegalStateException("end() called without a matching begin()");
        }
        batcher.flush();
        preloadQueuedTextures();
        backend.endFrame();
        RenderFrameMetrics.getInstance().endFrame();
        frameBegun = false;
        frameWidth = 0;
        frameHeight = 0;
        blurPrepared = false;
        blurPreparedStrength = 0f;
        blurPreparedSourceTexture = 0;
        blurPreparedWidth = 0;
        blurPreparedHeight = 0;
        regionBlurPrepared = false;
        regionBlurPreparedStrength = 0f;
        regionBlurCaptureX = 0;
        regionBlurCaptureY = 0;
        regionBlurCaptureWidth = 0;
        regionBlurCaptureHeight = 0;
        resetAlphaStack();
        resetCullingOwnerStack();
        FRAME_CULLING_REGIONS.get().clear();
        FRAME_ITEM_CULLING_REGIONS.get().clear();
    }

    public void flush() {
        ensureFrame();
        batcher.flush();
    }


    public void pushClipRect(int x, int y, int w, int h) {
        pushRoundedClipRect((float) x, (float) y, (float) w, (float) h, 0f, 0f, 0f, 0f);
    }

    public void pushRoundedClipRect(float x, float y, float w, float h,
                                    float roundTopLeft, float roundTopRight,
                                    float roundBottomRight, float roundBottomLeft) {
        ensureFrame();
        ClipState incoming = ClipState.fromRect(
                x,
                y,
                w,
                h,
                roundTopLeft,
                roundTopRight,
                roundBottomRight,
                roundBottomLeft,
                transformStack.current()
        );
        ClipState applied;
        if (clipStack.isEmpty()) {
            applied = incoming;
        } else {
            ClipState current = clipStack.peek();
            applied = ClipState.intersect(current, incoming);
        }
        clipStack.push(applied);
        applyClipState(applied);
    }

    public void popClipRect() {
        ensureFrame();
        if (clipStack.isEmpty()) return;
        clipStack.pop();
        if (clipStack.isEmpty()) {
            backend.setScissorEnabled(false);
        } else {
            applyClipState(clipStack.peek());
        }
    }

    private void applyClipState(ClipState state) {
        if (state == null) {
            backend.setScissorEnabled(false);
            return;
        }
        backend.setScissorEnabled(true);
        backend.setScissorRect(state.x(), state.y(), state.w(), state.h(),
                state.roundTopLeft(), state.roundTopRight(), state.roundBottomRight(), state.roundBottomLeft());
    }

    public void rectOutline(float x, float y, float w, float h, int rgbaPremul, float thickness) {
        ensureFrame();
        batcher.enqueueRectOutline(x, y, w, h,
                0f, 0f, 0f, 0f,
                modulateColor(rgbaPremul), Math.max(1f, thickness), transformStack.current());
    }

    public void rectOutline(float x, float y, float w, float h, float rounding, int rgbaPremul, float thickness) {
        rectOutline(x, y, w, h, rounding, rounding, rounding, rounding, rgbaPremul, thickness);
    }

    public void rectOutline(float x, float y, float w, float h,
                            float roundTopLeft, float roundTopRight,
                            float roundBottomRight, float roundBottomLeft,
                            int rgbaPremul, float thickness) {
        ensureFrame();
        registerCullingRegion(x, y, w, h);
        float[] radii = scratchRadii(roundTopLeft, roundTopRight, roundBottomRight, roundBottomLeft);
        normalizeCornerRadii(w, h, radii);
        batcher.enqueueRectOutline(x, y, w, h,
                radii[0], radii[1], radii[2], radii[3],
                modulateColor(rgbaPremul), Math.max(1f, thickness), transformStack.current());
    }

    public void gradient(float x, float y, float w, float h, int c00, int c10, int c11, int c01) {
        ensureFrame();
        batcher.enqueueGradient(x, y, w, h, 0f, 0f, 0f, 0f,
                modulateColor(c00),
                modulateColor(c10),
                modulateColor(c11),
                modulateColor(c01),
                transformStack.current());
    }

    public void gradient(float x, float y, float w, float h, float rounding, int c00, int c10, int c11, int c01) {
        gradient(x, y, w, h, rounding, rounding, rounding, rounding, c00, c10, c11, c01);
    }

    public void gradient(float x, float y, float w, float h,
                         float roundTopLeft, float roundTopRight,
                         float roundBottomRight, float roundBottomLeft,
                         int c00, int c10, int c11, int c01) {
        ensureFrame();
        registerCullingRegion(x, y, w, h);
        float[] radii = scratchRadii(roundTopLeft, roundTopRight, roundBottomRight, roundBottomLeft);
        normalizeCornerRadii(w, h, radii);
        batcher.enqueueGradient(x, y, w, h,
                radii[0], radii[1], radii[2], radii[3],
                modulateColor(c00),
                modulateColor(c10),
                modulateColor(c11),
                modulateColor(c01),
                transformStack.current());
    }

    public void circle(float cx, float cy, float radius, float startDeg, float pct, int rgbaPremul) {
        ensureFrame();
        registerCullingRegion(cx - radius, cy - radius, radius * 2f, radius * 2f);
        batcher.enqueueCircle(cx, cy, radius, startDeg, pct, modulateColor(rgbaPremul), transformStack.current());
    }

    public void shadow(float x, float y, float w, float h, float rounding,
                       float blurStrength, float spread, int rgbaPremul) {
        shadow(x, y, w, h, rounding, rounding, rounding, rounding, blurStrength, spread, rgbaPremul);
    }

    public void shadow(float x, float y, float w, float h,
                       float roundTopLeft, float roundTopRight,
                       float roundBottomRight, float roundBottomLeft,
                       float blurStrength, float spread, int rgbaPremul) {
        ensureFrame();
        registerCullingRegion(x - spread, y - spread, w + spread * 2f, h + spread * 2f);
        if (w <= 0f || h <= 0f) {
            return;
        }
        float safeBlur = Math.max(0f, blurStrength);
        float safeSpread = Math.max(0f, spread);
        if (safeBlur <= 0f && safeSpread <= 0f) {
            return;
        }
        float[] radii = scratchRadii(roundTopLeft, roundTopRight, roundBottomRight, roundBottomLeft);
        normalizeCornerRadii(w, h, radii);
        backend.drawDropShadowRect(x, y, w, h,
                radii[0], radii[1], radii[2], radii[3],
                safeBlur, safeSpread,
                modulateColor(rgbaPremul),
                transformStack.current());
    }

    public void gradientShadow(float x, float y, float w, float h, float rounding,
                               float blurStrength, float spread,
                               int c00, int c10, int c11, int c01) {
        gradientShadow(x, y, w, h, rounding, rounding, rounding, rounding,
                blurStrength, spread, c00, c10, c11, c01);
    }

    public void gradientShadow(float x, float y, float w, float h,
                               float roundTopLeft, float roundTopRight,
                               float roundBottomRight, float roundBottomLeft,
                               float blurStrength, float spread,
                               int c00, int c10, int c11, int c01) {
        ensureFrame();
        registerCullingRegion(x, y, w, h);
        float safeBlur = Math.max(0f, blurStrength);
        float safeSpread = Math.max(0f, spread);
        if (safeBlur <= 0f && safeSpread <= 0f) return;
        float[] radii = scratchRadii(roundTopLeft, roundTopRight, roundBottomRight, roundBottomLeft);
        normalizeCornerRadii(w, h, radii);
        backend.drawGradientShadow(x, y, w, h,
                radii[0], radii[1], radii[2], radii[3],
                safeBlur, safeSpread,
                modulateColor(c00), modulateColor(c10),
                modulateColor(c11), modulateColor(c01),
                transformStack.current());
    }

    public void blur(float x, float y, float w, float h, float rounding) {
        blur(x, y, w, h, rounding, 1.0f);
    }

    public void blur(float x, float y, float w, float h, float rounding, float alpha) {
        ensureFrame();
        if (!blurPrepared) {
            // A1: lazy prepare blur only when actually needed
            if (lazyBlurSourceTexture != 0 && lazyBlurWidth > 0 && lazyBlurHeight > 0) {
                prepareBlurFromTexture(lazyBlurSourceTexture, lazyBlurWidth, lazyBlurHeight, lazyBlurStrength);
            } else if (frameWidth > 0 && frameHeight > 0) {
                prepareBlur(lazyBlurStrength);
            }
            if (!blurPrepared) {
                return;
            }
            lastBlurUpdateNanos = System.nanoTime();
        }
        float opacity = clamp01(alpha) * currentAlphaMultiplier();
        if (opacity <= 0.0001f) {
            return;
        }
        float insetX = 1.0f;
        float insetY = 1.3f;
        float blurX = x + insetX * 0.5f;
        float blurY = y + insetY * 0.5f;
        float blurW = w - insetX;
        float blurH = h - insetY;
        if (blurW <= 0f || blurH <= 0f) {
            return;
        }

        registerCullingRegions(blurX, blurY, blurW, blurH, true);
        backend.drawPreparedBlurRounded(blurX, blurY, blurW, blurH, Math.max(0f, rounding), opacity, transformStack.current());
    }

    public void blurRegion(float x, float y, float w, float h, float rounding) {
        blurRegion(x, y, w, h, rounding, 1.0f);
    }

    public void blurRegion(float x, float y, float w, float h, float rounding, float alpha) {
        ensureFrame();
        if (!regionBlurPrepared) {
            return;
        }
        float opacity = clamp01(alpha) * currentAlphaMultiplier();
        if (opacity <= 0.0001f) {
            return;
        }
        registerCullingRegions(x, y, w, h, true);
        backend.drawPreparedRegionBlurRounded(x, y, w, h, Math.max(0f, rounding), opacity,
                transformStack.current(), regionBlurCaptureX, regionBlurCaptureY,
                regionBlurCaptureWidth, regionBlurCaptureHeight);
    }

    public void prepareBlur(float strength) {
        ensureFrame();
        int width = frameWidth;
        int height = frameHeight;
        if (width <= 0 || height <= 0) {
            blurPrepared = false;
            blurPreparedSourceTexture = 0;
            blurPreparedWidth = 0;
            blurPreparedHeight = 0;
            return;
        }

        float radius = Math.max(MIN_BLUR_STRENGTH, strength);
        boolean alreadyPrepared = blurPrepared
                && blurPreparedSourceTexture == 0
                && blurPreparedWidth == width
                && blurPreparedHeight == height
                && Math.abs(blurPreparedStrength - radius) <= BLUR_STRENGTH_EPSILON;
        if (alreadyPrepared) {
            return;
        }

        backend.prepareScreenBlur(width, height, radius);
        blurPrepared = true;
        blurPreparedStrength = radius;
        blurPreparedSourceTexture = 0;
        blurPreparedWidth = width;
        blurPreparedHeight = height;
        lastBlurUpdateNanos = System.nanoTime();
    }

    public void prepareBlurForced(float strength) {
        blurPrepared = false;
        blurPreparedStrength = 0f;
        blurPreparedSourceTexture = 0;
        blurPreparedWidth = 0;
        blurPreparedHeight = 0;
        prepareBlur(strength);
    }

    public void prepareBlurFromTexture(int texture, int width, int height, float strength) {
        ensureFrame();
        if (texture <= 0 || width <= 0 || height <= 0) {
            blurPrepared = false;
            blurPreparedSourceTexture = 0;
            blurPreparedWidth = 0;
            blurPreparedHeight = 0;
            return;
        }

        float radius = Math.max(MIN_BLUR_STRENGTH, strength);
        boolean alreadyPrepared = blurPrepared
                && blurPreparedSourceTexture == texture
                && blurPreparedWidth == width
                && blurPreparedHeight == height
                && Math.abs(blurPreparedStrength - radius) <= BLUR_STRENGTH_EPSILON;
        if (alreadyPrepared) {
            return;
        }

        backend.prepareScreenBlurFromTexture(texture, width, height, radius);
        blurPrepared = true;
        blurPreparedStrength = radius;
        blurPreparedSourceTexture = texture;
        blurPreparedWidth = width;
        blurPreparedHeight = height;
        lastBlurUpdateNanos = System.nanoTime();
    }

    public void prepareBlurRegion(float x, float y, float w, float h, float strength) {
        ensureFrame();
        if (frameWidth <= 0 || frameHeight <= 0) {
            regionBlurPrepared = false;
            regionBlurCaptureWidth = 0;
            regionBlurCaptureHeight = 0;
            return;
        }
        if (w <= 0f || h <= 0f) {
            regionBlurPrepared = false;
            regionBlurCaptureWidth = 0;
            regionBlurCaptureHeight = 0;
            return;
        }

        float[] matrix = transformStack.current();
        Bounds bounds = computeTransformedBounds(matrix, x, y, w, h);

        int captureLeft = clampToViewportFloor(bounds.minX, frameWidth);
        int captureTop = clampToViewportFloor(bounds.minY, frameHeight);
        int captureRight = clampToViewportCeil(bounds.maxX, frameWidth);
        int captureBottom = clampToViewportCeil(bounds.maxY, frameHeight);

        int captureWidth = Math.max(0, captureRight - captureLeft);
        int captureHeight = Math.max(0, captureBottom - captureTop);
        if (captureWidth <= 0 || captureHeight <= 0) {
            regionBlurPrepared = false;
            regionBlurCaptureWidth = 0;
            regionBlurCaptureHeight = 0;
            return;
        }

        float radius = Math.max(MIN_BLUR_STRENGTH, strength);
        boolean alreadyPrepared = regionBlurPrepared
                && regionBlurCaptureX == captureLeft
                && regionBlurCaptureY == captureTop
                && regionBlurCaptureWidth == captureWidth
                && regionBlurCaptureHeight == captureHeight
                && Math.abs(regionBlurPreparedStrength - radius) <= BLUR_STRENGTH_EPSILON;
        if (alreadyPrepared) {
            return;
        }

        boolean success = backend.prepareRegionBlur(captureLeft, captureTop, captureWidth, captureHeight, radius);
        regionBlurPrepared = success;
        if (success) {
            regionBlurPreparedStrength = radius;
            regionBlurCaptureX = captureLeft;
            regionBlurCaptureY = captureTop;
            regionBlurCaptureWidth = captureWidth;
            regionBlurCaptureHeight = captureHeight;
        } else {
            regionBlurPreparedStrength = 0f;
            regionBlurCaptureWidth = 0;
            regionBlurCaptureHeight = 0;
        }
    }

    private static int clampToViewportFloor(float value, int viewportMax) {
        int floored = (int) Math.floor(value);
        if (floored < 0) {
            return 0;
        }
        if (floored > viewportMax) {
            return viewportMax;
        }
        return floored;
    }

    private static int clampToViewportCeil(float value, int viewportMax) {
        int ceiled = (int) Math.ceil(value);
        if (ceiled < 0) {
            return 0;
        }
        if (ceiled > viewportMax) {
            return viewportMax;
        }
        return ceiled;
    }

    private static Bounds computeTransformedBounds(float[] matrix, float x, float y, float w, float h) {
        float x0 = x;
        float y0 = y;
        float x1 = x + w;
        float y1 = y + h;

        float wx0y0x = transformX(matrix, x0, y0);
        float wx0y0y = transformY(matrix, x0, y0);
        float wx1y0x = transformX(matrix, x1, y0);
        float wx1y0y = transformY(matrix, x1, y0);
        float wx1y1x = transformX(matrix, x1, y1);
        float wx1y1y = transformY(matrix, x1, y1);
        float wx0y1x = transformX(matrix, x0, y1);
        float wx0y1y = transformY(matrix, x0, y1);

        float minX = Math.min(Math.min(wx0y0x, wx1y0x), Math.min(wx1y1x, wx0y1x));
        float maxX = Math.max(Math.max(wx0y0x, wx1y0x), Math.max(wx1y1x, wx0y1x));
        float minY = Math.min(Math.min(wx0y0y, wx1y0y), Math.min(wx1y1y, wx0y1y));
        float maxY = Math.max(Math.max(wx0y0y, wx1y0y), Math.max(wx1y1y, wx0y1y));

        return new Bounds(minX, minY, maxX, maxY);
    }

    private static float transformX(float[] matrix, float px, float py) {
        if (matrix == null || matrix.length < 6) {
            return px;
        }
        return matrix[0] * px + matrix[1] * py + matrix[2];
    }

    private static float transformY(float[] matrix, float px, float py) {
        if (matrix == null || matrix.length < 6) {
            return py;
        }
        return matrix[3] * px + matrix[4] * py + matrix[5];
    }

    public static boolean intersectsFrameCullingRegion(float x, float y, float w, float h) {
        return intersectsFrameCullingRegion(x, y, w, h, null);
    }

    public static boolean intersectsFrameCullingRegion(float x, float y, float w, float h, String ignoredOwnerKey) {
        float minX = Math.min(x, x + w);
        float maxX = Math.max(x, x + w);
        float minY = Math.min(y, y + h);
        float maxY = Math.max(y, y + h);
        if (maxX <= minX || maxY <= minY) {
            return false;
        }

        String ignoredOwner = normalizeCullingOwner(ignoredOwnerKey);
        boolean hasIgnoredOwner = !ignoredOwner.isEmpty();
        var regions = FRAME_CULLING_REGIONS.get();
        for (int i = 0; i < regions.size(); i++) {
            CullingRegion region = regions.get(i);
            if (hasIgnoredOwner && ignoredOwner.equals(region.ownerKey)) {
                continue;
            }
            if (maxX <= region.x || minX >= region.right || maxY <= region.y || minY >= region.bottom) {
                continue;
            }
            return true;
        }
        return false;
    }

    public static boolean isFullyCoveredByFrameCullingRegion(float x, float y, float w, float h) {
        float minX = Math.min(x, x + w);
        float maxX = Math.max(x, x + w);
        float minY = Math.min(y, y + h);
        float maxY = Math.max(y, y + h);
        if (maxX <= minX || maxY <= minY) {
            return false;
        }

        var regions = FRAME_CULLING_REGIONS.get();
        for (int i = 0; i < regions.size(); i++) {
            CullingRegion region = regions.get(i);
            if (minX >= region.x && maxX <= region.right && minY >= region.y && maxY <= region.bottom) {
                return true;
            }
        }
        return false;
    }

    public static boolean intersectsItemCullingRegion(float x, float y, float w, float h) {
        return intersectsItemCullingRegion(x, y, w, h, null);
    }

    public static boolean intersectsItemCullingRegion(float x, float y, float w, float h, String ignoredOwnerKey) {
        float minX = Math.min(x, x + w);
        float maxX = Math.max(x, x + w);
        float minY = Math.min(y, y + h);
        float maxY = Math.max(y, y + h);
        if (maxX <= minX || maxY <= minY) {
            return false;
        }

        String ignoredOwner = normalizeCullingOwner(ignoredOwnerKey);
        boolean hasIgnoredOwner = !ignoredOwner.isEmpty();
        var regions = FRAME_ITEM_CULLING_REGIONS.get();
        for (int i = 0; i < regions.size(); i++) {
            CullingRegion region = regions.get(i);
            if (hasIgnoredOwner && ignoredOwner.equals(region.ownerKey)) {
                continue;
            }
            if (maxX <= region.x || minX >= region.right || maxY <= region.y || minY >= region.bottom) {
                continue;
            }
            return true;
        }
        return false;
    }

    private record Bounds(float minX, float minY, float maxX, float maxY) {
    }

    private record CullingRegion(int x, int y, int right, int bottom, String ownerKey) {
    }

    public void pushCullingOwner(String ownerKey) {
        ensureFrame();
        cullingOwnerStack.push(normalizeCullingOwner(ownerKey));
    }

    public void popCullingOwner() {
        ensureFrame();
        if (cullingOwnerStack.size() > 1) {
            cullingOwnerStack.pop();
        }
    }

    public void setTransform(float[] m3) {
        ensureFrame();
        transformStack.clear();
        transformStack.replaceTop(m3);
    }

    public void pushRotation(float degrees) {
        ensureFrame();
        transformStack.pushRotation(degrees);
    }

    public void popRotation() {
        ensureFrame();
        transformStack.pop();
    }

    public void pushTranslation(float tx, float ty) {
        ensureFrame();
        transformStack.pushTranslation(tx, ty);
    }

    public void popTransform() {
        ensureFrame();
        transformStack.pop();
    }

    public void pushScale(float scale) {
        pushScale(scale, scale);
    }

    public void pushScale(float sx, float sy) {
        ensureFrame();
        transformStack.pushScale(sx, sy, 0f, 0f);
    }

    public void pushScaleCentered(float scale) {
        pushScaleCentered(scale, scale);
    }

    public void pushScaleCentered(float sx, float sy) {
        ensureFrame();
        if (frameWidth <= 0 || frameHeight <= 0) {
            throw new IllegalStateException("Cannot compute frame center before begin(width, height) is called with positive dimensions");
        }
        transformStack.pushScale(sx, sy, frameWidth * 0.5f, frameHeight * 0.5f);
    }

    public void pushScale(float scale, float originX, float originY) {
        pushScale(scale, scale, originX, originY);
    }

    public void pushScale(float sx, float sy, float originX, float originY) {
        ensureFrame();
        transformStack.pushScale(sx, sy, originX, originY);
    }

    public void popScale() {
        ensureFrame();
        transformStack.pop();
    }

    public void pushAlpha(float alpha) {
        ensureFrame();
        float parent = currentAlphaMultiplier();
        float clamped = clamp01(alpha);
        alphaStack.push(parent * clamped);
    }

    public void popAlpha() {
        ensureFrame();
        if (alphaStack.size() > 1) {
            alphaStack.pop();
        }
    }

    public void registerTextRenderer(String fontId, TextRenderer tr) {
        if (tr != null) idToTextRenderer.put(fontId, tr);
    }

    public void registerTextRenderer(FontObject fo, TextRenderer tr) {
        if (tr != null) idToTextRenderer.put(fo.id, tr);
    }

    public TransformStack getTransformStack() {
        return transformStack;
    }

    public void text(FontObject fo, float x, float y, float size, String s, int rgbaPremul) {
        ensureFrame();
        if (fo == null) {
            throw new IllegalArgumentException("FontObject must not be null");
        }
        if (size <= 0f) {
            return;
        }
        TextRenderer tr = idToTextRenderer.get(fo.id);
        if (tr == null) return;
        String content = s == null ? "" : s;
        if (content.isEmpty()) {
            return;
        }
        registerTextCullingRegion(fo, x, y, size, content, "l");
        if (!containsFormattingCodes(content)) {
            tr.drawText(x, y, size, content, modulateColor(rgbaPremul), transformStack.current());
            return;
        }
        var segments = parseFormattedSegments(content, rgbaPremul);
        drawFormattedSegments(tr, fo, x, y, size, segments, "l", transformStack.current());
    }

    public void text(FontObject fo, float x, float y, float size, String s, int rgbaPremul, String alignKey) {
        ensureFrame();
        if (fo == null) {
            throw new IllegalArgumentException("FontObject must not be null");
        }
        if (size <= 0f) {
            return;
        }
        TextRenderer tr = idToTextRenderer.get(fo.id);
        if (tr == null) return;
        String content = s == null ? "" : s;
        if (content.isEmpty()) {
            return;
        }
        registerTextCullingRegion(fo, x, y, size, content, alignKey);
        if (!containsFormattingCodes(content)) {
            tr.drawText(x, y, size, content, modulateColor(rgbaPremul), alignKey, transformStack.current());
            return;
        }
        var segments = parseFormattedSegments(content, rgbaPremul);
        drawFormattedSegments(tr, fo, x, y, size, segments, alignKey, transformStack.current());
    }

    public void drawTextureDirect(Identifier texture, float x, float y, float w, float h) {
        drawTextureDirect(texture, x, y, w, h, 0xFFFFFFFF, false);
    }

    public void drawTextureDirect(Identifier texture, float x, float y, float w, float h, int tintRgba) {
        drawTextureDirect(texture, x, y, w, h, tintRgba, false);
    }

    public void drawTextureDirect(Identifier texture, float x, float y, float w, float h, int tintRgba, boolean flipVertically) {
        ensureFrame();
        int glId = getTextureGlIdDirect(texture);
        if (glId <= 0) {
            return;
        }
        registerCullingRegion(x, y, w, h);
        float v0 = flipVertically ? 1f : 0f;
        float v1 = flipVertically ? 0f : 1f;
        batcher.enqueueTexturedQuad(glId, x, y, w, h, 0f, v0, 1f, v1,
                modulateColor(tintRgba), transformStack.current(), false);
    }

    public void drawTextureRegionDirect(Identifier texture, float x, float y, float w, float h,
                                        float u0, float v0, float u1, float v1, int tintRgba) {
        ensureFrame();
        int glId = getTextureGlIdDirect(texture);
        if (glId <= 0) {
            return;
        }
        registerCullingRegion(x, y, w, h);
        batcher.enqueueTexturedQuad(glId, x, y, w, h, u0, v0, u1, v1,
                modulateColor(tintRgba), transformStack.current(), false);
    }

    public void clearTextureCache() {
        textureCache.clear();
        pendingTextures.clear();
    }

    public void invalidateTexture(Identifier texture) {
        if (texture != null) {
            textureCache.remove(texture);
        }
    }

    public int getTextureGlIdDirect(Identifier texture) {
        int glId = resolveTextureIdDirect(texture);
        if (glId > 0) {
            return glId;
        }
        // Fallback to the regular loader path (with allowLoad=true) to force-init on first use.
        return resolveTextureId(texture, true);
    }

    private int resolveTextureIdDirect(Identifier texture) {
        if (texture == null) {
            return 0;
        }
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null) {
            return 0;
        }
        AbstractTexture abstractTexture;
        try {
            abstractTexture = client.getTextureManager().getTexture(texture);
        } catch (Exception e) {
            return 0;
        }
        if (abstractTexture == null) {
            return 0;
        }
        // Force the texture to initialize/upload if needed before reading its GL view.
        if (abstractTexture.getGlTextureView() instanceof GlTextureView view) {
            int glId = view.texture().getGlId();
            if (glId > 0) {
                Integer cached = textureCache.get(texture);
                if (cached == null || cached != glId) {
                    textureCache.put(texture, glId);
                }
            }
            return glId;
        }
        textureCache.remove(texture);
        return 0;
    }

    public void gradientText(FontObject fo, float x, float y, float size, String text, int startRgba, int endRgba) {
        ensureFrame();
        if (fo == null) {
            throw new IllegalArgumentException("FontObject must not be null");
        }
        if (size <= 0f) {
            return;
        }
        TextRenderer tr = idToTextRenderer.get(fo.id);
        if (tr == null) return;
        String content = text == null ? "" : text;
        if (content.isEmpty()) {
            return;
        }
        tr.drawGradientText(x, y, size, content, modulateColor(startRgba), modulateColor(endRgba),
                "l", transformStack.current());
    }

    public void gradientTextClientColor(FontObject fo, float x, float y, float size, String text) {
        gradientTextClientColor(fo, x, y, size, text, 0xFFFFFFFF);
    }

    public void gradientTextClientColor(FontObject fo, float x, float y, float size, String text, int rgbaPremul) {
        gradientTextClientColor(fo, x, y, size, text,
                ClientColors.GRADIENT_START.getRGB(),
                ClientColors.GRADIENT_END.getRGB(),
                rgbaPremul);
    }

    public void gradientTextClientColor(FontObject fo, float x, float y, float size, String text,
                                        int startRgb, int endRgb, int rgbaPremul) {
        ensureFrame();
        if (fo == null || size <= 0f) return;
        TextRenderer tr = idToTextRenderer.get(fo.id);
        if (tr == null) return;
        String content = text == null ? "" : text;
        if (content.isEmpty()) return;
        int baseAlpha = (rgbaPremul >>> 24) & 0xFF;
        int startColor = modulateColor((baseAlpha << 24) | (startRgb & 0xFFFFFF));
        int endColor = modulateColor((baseAlpha << 24) | (endRgb & 0xFFFFFF));
        tr.drawGradientText(x, y, size, content, startColor, endColor, "l", transformStack.current());
    }

    public void gradientText(FontObject fo, float x, float y, float size, String text,
                             int startRgba, int endRgba, String alignKey) {
        ensureFrame();
        if (fo == null) {
            throw new IllegalArgumentException("FontObject must not be null");
        }
        if (size <= 0f) {
            return;
        }
        TextRenderer tr = idToTextRenderer.get(fo.id);
        if (tr == null) return;
        String content = text == null ? "" : text;
        if (content.isEmpty()) {
            return;
        }
        tr.drawGradientText(x, y, size, content, modulateColor(startRgba), modulateColor(endRgba),
                alignKey, transformStack.current());
    }

    public void gradientCenteredText(FontObject fo, float centerX, float y, float size, String text,
                                     int startRgba, int endRgba) {
        ensureFrame();
        if (fo == null || size <= 0f) {
            return;
        }
        TextRenderer tr = idToTextRenderer.get(fo.id);
        if (tr == null) return;
        String content = text == null ? "" : text;
        if (content.isEmpty()) {
            return;
        }
        float width = tr.measureText(content, size).width;
        float alignedX = centerX - width * 0.5f;
        tr.drawGradientText(alignedX, y, size, content, modulateColor(startRgba), modulateColor(endRgba),
                "l", transformStack.current());
    }

    public void centredText(FontObject fo, float centerX, float y, float size, String s, int rgbaPremul) {
        ensureFrame();
        if (fo == null || size <= 0f || s == null || s.isEmpty()) {
            return;
        }
        TextRenderer tr = idToTextRenderer.get(fo.id);
        if (tr == null) {
            return;
        }

        float width = tr.measureText(s, size).width;

        float alignedX = centerX - width * 0.5f;

        tr.drawText(alignedX, y, size, s, modulateColor(rgbaPremul), transformStack.current());
    }

    public TextRenderer.TextMetrics measureText(FontObject fo, String text, float size) {
        if (fo == null) {
            throw new IllegalArgumentException("FontObject must not be null");
        }
        if (size <= 0f) {
            return new TextRenderer.TextMetrics(0f, 0f);
        }
        TextRenderer tr = idToTextRenderer.get(fo.id);
        if (tr == null) {
            return new TextRenderer.TextMetrics(0f, 0f);
        }
        String content = text == null ? "" : text;
        if (content.isEmpty()) {
            return new TextRenderer.TextMetrics(0f, 0f);
        }
        if (!containsFormattingCodes(content)) {
            return tr.measureText(content, size);
        }
        var segments = parseFormattedSegments(content, 0xFFFFFFFF);
        return measureFormattedSegments(tr, fo, segments, size);
    }

    private static String buildClientGradientText(String text, int startRgb, int endRgb) {
        if (text == null || text.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(text.length() * 10);
        for (int i = 0; i < text.length(); i++) {
            int color = ColorUtils.fade(CLIENT_GRADIENT_SPEED, i * CLIENT_GRADIENT_OFFSET, startRgb, endRgb);
            sb.append('\u00A7').append('#').append(String.format("%06X", color & 0xFFFFFF));
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public void text(FontObject fo, float x, float y, float size, Text text, int rgbaPremul) {
        ensureFrame();
        if (text == null) {
            return;
        }
        if (fo == null) {
            throw new IllegalArgumentException("FontObject must not be null");
        }
        if (size <= 0f) {
            return;
        }
        TextRenderer tr = idToTextRenderer.get(fo.id);
        if (tr == null) {
            return;
        }
        var segments = collectTextSegments(text, rgbaPremul);
        if (segments.isEmpty()) {
            return;
        }
        drawFormattedSegments(tr, fo, x, y, size, segments, "l", transformStack.current());
    }

    public void centredText(FontObject fo, float centerX, float y, float size, Text text, int rgbaPremul) {
        if (text == null) {
            return;
        }
        if (fo == null || size <= 0f) {
            return;
        }
        TextRenderer tr = idToTextRenderer.get(fo.id);
        if (tr == null) {
            return;
        }
        var segments = collectTextSegments(text, rgbaPremul);
        if (segments.isEmpty()) {
            return;
        }
        var metrics = measureFormattedSegments(tr, fo, segments, size);
        float alignedX = centerX - metrics.width * 0.5f;
        drawFormattedSegments(tr, fo, alignedX, y, size, segments, "l", transformStack.current());
    }

    public TextRenderer.TextMetrics measureText(FontObject fo, Text text, float size) {
        if (text == null) {
            return new TextRenderer.TextMetrics(0f, 0f);
        }
        if (fo == null || size <= 0f) {
            return new TextRenderer.TextMetrics(0f, 0f);
        }
        TextRenderer tr = idToTextRenderer.get(fo.id);
        if (tr == null) {
            return new TextRenderer.TextMetrics(0f, 0f);
        }
        var segments = collectTextSegments(text, 0xFFFFFFFF);
        return measureFormattedSegments(tr, fo, segments, size);
    }

    private record ColoredSegment(String text, int color) {
    }

    private record MeasuredColoredSegment(String text, int color, float width) {
    }

    private java.util.List<ColoredSegment> collectTextSegments(Text text, int rgbaPremul) {
        var segments = new java.util.ArrayList<ColoredSegment>();
        if (text == null) {
            return segments;
        }
        int baseAlpha = (rgbaPremul >>> 24) & 0xFF;
        text.visit((style, part) -> {
            if (part == null || part.isEmpty()) {
                return java.util.Optional.empty();
            }
            int color = rgbaPremul;
            if (style != null && style.getColor() != null) {
                int rgb = style.getColor().getRgb() & 0xFFFFFF;
                color = (baseAlpha << 24) | rgb;
            }
            segments.addAll(parseFormattedSegments(part, color));
            return java.util.Optional.empty();
        }, Style.EMPTY);
        return segments;
    }

    private static boolean containsFormattingCodes(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }
        for (int i = 0; i < text.length() - 1; i++) {
            char ch = text.charAt(i);
            if (ch == '\u00A7' || ch == '&') {
                return true;
            }
        }
        return false;
    }

    private java.util.List<ColoredSegment> parseFormattedSegments(String input, int defaultColor) {
        var segments = new java.util.ArrayList<ColoredSegment>();
        if (input == null || input.isEmpty()) {
            return segments;
        }
        int baseAlpha = (defaultColor >>> 24) & 0xFF;
        int currentColor = defaultColor;
        StringBuilder sb = new StringBuilder();

        int length = input.length();
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            if (ch == '\u00A7' || ch == '&') {
                if (i + 1 < length) {
                    char code = input.charAt(i + 1);
                    if (code == '#') {
                        if (i + 7 < length) {
                            String hex = input.substring(i + 2, i + 8);
                            int rgb = parseHexRgb(hex);
                            if (rgb != -1) {
                                flushSegment(segments, sb, currentColor);
                                currentColor = (baseAlpha << 24) | rgb;
                                i += 7;
                                continue;
                            }
                        }
                    } else if (code == 'x' || code == 'X') {
                        int rgb = parseExpandedHex(input, i);
                        if (rgb != -1) {
                            flushSegment(segments, sb, currentColor);
                            currentColor = (baseAlpha << 24) | rgb;
                            i += 13;
                            continue;
                        }
                    } else {
                        int rgb = mapFormattingColor(code);
                        if (rgb != -1) {
                            flushSegment(segments, sb, currentColor);
                            currentColor = (baseAlpha << 24) | rgb;
                            i += 1;
                            continue;
                        }
                        if (code == 'r' || code == 'R') {
                            flushSegment(segments, sb, currentColor);
                            currentColor = defaultColor;
                            i += 1;
                            continue;
                        }
                        if (isFormatCode(code)) {
                            i += 1;
                            continue;
                        }
                    }
                }
            }
            sb.append(ch);
        }
        flushSegment(segments, sb, currentColor);
        return segments;
    }

    private static void flushSegment(java.util.List<ColoredSegment> segments, StringBuilder sb, int color) {
        if (sb.length() <= 0) {
            return;
        }
        segments.add(new ColoredSegment(sb.toString(), color));
        sb.setLength(0);
    }

    private static boolean isFormatCode(char code) {
        char c = Character.toLowerCase(code);
        return c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'o';
    }

    private static int parseExpandedHex(String input, int index) {
        int length = input.length();
        if (index + 13 >= length) {
            return -1;
        }
        char[] hex = new char[6];
        int pos = index + 2;
        for (int i = 0; i < 6; i++) {
            if (pos + 1 >= length) {
                return -1;
            }
            char prefix = input.charAt(pos);
            char value = input.charAt(pos + 1);
            if (prefix != '\u00A7' && prefix != '&') {
                return -1;
            }
            if (!isHexDigit(value)) {
                return -1;
            }
            hex[i] = value;
            pos += 2;
        }
        return parseHexRgb(new String(hex));
    }

    private static int parseHexRgb(String hex) {
        if (hex == null || hex.length() != 6) {
            return -1;
        }
        for (int i = 0; i < 6; i++) {
            if (!isHexDigit(hex.charAt(i))) {
                return -1;
            }
        }
        try {
            return Integer.parseInt(hex, 16) & 0xFFFFFF;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static boolean isHexDigit(char c) {
        return (c >= '0' && c <= '9')
                || (c >= 'a' && c <= 'f')
                || (c >= 'A' && c <= 'F');
    }

    private static int mapFormattingColor(char code) {
        return switch (Character.toLowerCase(code)) {
            case '0' -> 0x000000;
            case '1' -> 0x0000AA;
            case '2' -> 0x00AA00;
            case '3' -> 0x00AAAA;
            case '4' -> 0xAA0000;
            case '5' -> 0xAA00AA;
            case '6' -> 0xFFAA00;
            case '7' -> 0xAAAAAA;
            case '8' -> 0x555555;
            case '9' -> 0x5555FF;
            case 'a' -> 0x55FF55;
            case 'b' -> 0x55FFFF;
            case 'c' -> 0xFF5555;
            case 'd' -> 0xFF55FF;
            case 'e' -> 0xFFFF55;
            case 'f' -> 0xFFFFFF;
            default -> -1;
        };
    }

    private void drawFormattedSegments(TextRenderer tr, FontObject fo, float x, float y, float size,
                                       java.util.List<ColoredSegment> segments, String alignKey,
                                       float[] transform) {
        if (segments == null || segments.isEmpty()) {
            return;
        }
        float lineHeight = fo.getLineHeight(size);
        char align = 'l';
        if (alignKey != null && !alignKey.isEmpty()) {
            align = Character.toLowerCase(alignKey.charAt(0));
        }

        java.util.List<java.util.List<MeasuredColoredSegment>> lines = new java.util.ArrayList<>();
        java.util.List<MeasuredColoredSegment> currentLine = new java.util.ArrayList<>();
        for (ColoredSegment segment : segments) {
            String text = segment.text();
            if (text == null || text.isEmpty()) {
                continue;
            }
            int start = 0;
            for (int i = 0; i <= text.length(); i++) {
                if (i == text.length() || text.charAt(i) == '\n') {
                    if (i > start) {
                        String part = text.substring(start, i);
                        currentLine.add(new MeasuredColoredSegment(part, segment.color(), tr.measureText(part, size).width));
                    }
                    if (i < text.length()) {
                        lines.add(currentLine);
                        currentLine = new java.util.ArrayList<>();
                    }
                    start = i + 1;
                }
            }
        }
        lines.add(currentLine);

        float cursorY = y;
        for (java.util.List<MeasuredColoredSegment> line : lines) {
            float lineWidth = 0f;
            for (MeasuredColoredSegment segment : line) {
                lineWidth += segment.width();
            }
            float cursorX = x;
            if (align == 'c') {
                cursorX = x - lineWidth * 0.5f;
            } else if (align == 'r') {
                cursorX = x - lineWidth;
            }

            for (MeasuredColoredSegment segment : line) {
                String text = segment.text();
                if (text == null || text.isEmpty()) {
                    continue;
                }
                int color = modulateColor(segment.color());
                tr.drawText(cursorX, cursorY, size, text, color, "l", transform);
                cursorX += segment.width();
            }
            cursorY += lineHeight;
        }
    }

    private TextRenderer.TextMetrics measureFormattedSegments(TextRenderer tr, FontObject fo,
                                                              java.util.List<ColoredSegment> segments, float size) {
        if (segments == null || segments.isEmpty()) {
            return new TextRenderer.TextMetrics(0f, 0f);
        }
        float lineHeight = fo.getLineHeight(size);
        float maxWidth = 0f;
        float lineWidth = 0f;
        int lineCount = 1;
        for (ColoredSegment segment : segments) {
            String text = segment.text();
            if (text == null || text.isEmpty()) {
                continue;
            }
            int start = 0;
            for (int i = 0; i <= text.length(); i++) {
                if (i == text.length() || text.charAt(i) == '\n') {
                    if (i > start) {
                        String part = text.substring(start, i);
                        lineWidth += tr.measureText(part, size).width;
                    }
                    if (i < text.length()) {
                        maxWidth = Math.max(maxWidth, lineWidth);
                        lineWidth = 0f;
                        lineCount++;
                    }
                    start = i + 1;
                }
            }
        }
        maxWidth = Math.max(maxWidth, lineWidth);
        float height = Math.max(lineHeight * lineCount, lineHeight);
        return new TextRenderer.TextMetrics(maxWidth, height);
    }

    private String convertTextToFormattedString(Text text) {
        if (text == null) return "";
        StringBuilder sb = new StringBuilder();

        text.visit((style, part) -> {
            if (style.getColor() != null) {
                int rgb = style.getColor().getRgb();
                sb.append("\u00A7#").append(String.format("%06X", (rgb & 0xFFFFFF)));
            }

            sb.append(part.replaceAll("\u00A7[lmnokLMNONK]", ""));
            return java.util.Optional.empty();
        }, Style.EMPTY);

        sb.append("\u00A7r");
        return sb.toString();
    }

    private void collectFormattedText(StringBuilder sb, Text component) {
        Style style = component.getStyle();

        if (style.getColor() != null) {
            int rgb = style.getColor().getRgb();
            sb.append("§#").append(String.format("%06X", (rgb & 0xFFFFFF)));
        }

        String content = component.getString();

        if (component.getSiblings().isEmpty()) {
            if (!content.isEmpty()) {
                sb.append(content.replaceAll("§[lmnokLMNONK]", ""));
            }
            sb.append("§r");
        } else {
            component.visit((style1, s) -> {
                if (style1.getColor() != null) {
                    int rgb = style1.getColor().getRgb();
                    sb.append("§#").append(String.format("%06X", (rgb & 0xFFFFFF)));
                }
                sb.append(s.replaceAll("§[lmnokLMNONK]", ""));
                return java.util.Optional.empty();
            }, style);
            sb.append("§r");
        }
    }

    private void resetAlphaStack() {
        alphaStack.clear();
        alphaStack.push(1f);
    }

    private float currentAlphaMultiplier() {
        return alphaStack.isEmpty() ? 1f : alphaStack.peek();
    }

    private int modulateColor(int rgbaPremul) {
        float factor = currentAlphaMultiplier();
        if (factor >= 0.999f) {
            return rgbaPremul;
        }
        int a = (rgbaPremul >>> 24) & 0xFF;
        int r = (rgbaPremul >>> 16) & 0xFF;
        int g = (rgbaPremul >>> 8) & 0xFF;
        int b = rgbaPremul & 0xFF;
        int na = scaleChannel(a, factor);
        int nr = scaleChannel(r, factor);
        int ng = scaleChannel(g, factor);
        int nb = scaleChannel(b, factor);
        return (na << 24) | (nr << 16) | (ng << 8) | nb;
    }

    private static int scaleChannel(int value, float factor) {
        float scaled = value * factor;
        if (scaled <= 0f) {
            return 0;
        }
        if (scaled >= 255f) {
            return 255;
        }
        return Math.round(scaled);
    }

    private static float clamp01(float value) {
        if (value < 0f) {
            return 0f;
        }
        if (value > 1f) {
            return 1f;
        }
        return value;
    }

    private static String normalizeCullingOwner(String ownerKey) {
        if (ownerKey == null || ownerKey.isEmpty()) {
            return DEFAULT_CULLING_OWNER;
        }
        return ownerKey;
    }

    private void resetCullingOwnerStack() {
        cullingOwnerStack.clear();
        cullingOwnerStack.push(DEFAULT_CULLING_OWNER);
    }

    private String currentCullingOwner() {
        if (cullingOwnerStack.isEmpty()) {
            return DEFAULT_CULLING_OWNER;
        }
        return cullingOwnerStack.peek();
    }

    private void registerCullingRegion(float x, float y, float w, float h) {
        registerCullingRegions(x, y, w, h, false);
    }

    private void registerItemCullingRegion(float x, float y, float w, float h) {
        addCullingRegion(FRAME_ITEM_CULLING_REGIONS.get(),
                computeTransformedBounds(transformStack.current(), x, y, w, h));
    }

    private void registerCullingRegions(float x, float y, float w, float h, boolean includeItems) {
        Bounds bounds = computeTransformedBounds(transformStack.current(), x, y, w, h);
        addCullingRegion(FRAME_CULLING_REGIONS.get(), bounds);
        if (includeItems) {
            addCullingRegion(FRAME_ITEM_CULLING_REGIONS.get(), bounds);
        }
    }

    private void addCullingRegion(java.util.ArrayList<CullingRegion> target, Bounds bounds) {
        if (target == null || bounds == null) {
            return;
        }
        if (!Float.isFinite(bounds.minX) || !Float.isFinite(bounds.minY)
                || !Float.isFinite(bounds.maxX) || !Float.isFinite(bounds.maxY)) {
            return;
        }
        int left = (int) Math.floor(Math.min(bounds.minX, bounds.maxX));
        int top = (int) Math.floor(Math.min(bounds.minY, bounds.maxY));
        int right = (int) Math.ceil(Math.max(bounds.minX, bounds.maxX));
        int bottom = (int) Math.ceil(Math.max(bounds.minY, bounds.maxY));
        if (right <= left || bottom <= top) {
            return;
        }
        target.add(new CullingRegion(left, top, right, bottom, currentCullingOwner()));
    }

    private void registerTextCullingRegion(FontObject fo, float x, float y, float size, String text, String alignKey) {
        if (fo == null || text == null || text.isEmpty() || size <= 0f) {
            return;
        }
        TextRenderer.TextMetrics metrics = measureText(fo, text, size);
        if (metrics.width <= 0f || metrics.height <= 0f) {
            return;
        }
        float drawX = x;
        if (alignKey != null && !alignKey.isEmpty()) {
            char align = Character.toLowerCase(alignKey.charAt(0));
            if (align == 'c') {
                drawX -= metrics.width * 0.5f;
            } else if (align == 'r') {
                drawX -= metrics.width;
            }
        }
        registerCullingRegions(drawX, y, metrics.width, metrics.height, true);
    }

    private static float[] scratchRadii(float topLeft, float topRight, float bottomRight, float bottomLeft) {
        float[] radii = RADII_SCRATCH.get();
        radii[0] = topLeft;
        radii[1] = topRight;
        radii[2] = bottomRight;
        radii[3] = bottomLeft;
        return radii;
    }

    private static void normalizeCornerRadii(float w, float h, float[] radii) {
        if (radii == null || radii.length < 4) {
            throw new IllegalArgumentException("radii");
        }

        for (int i = 0; i < 4; i++) {
            float value = radii[i];
            if (!Float.isFinite(value)) {
                value = 0f;
            }
            radii[i] = Math.max(0f, value);
        }

        float absW = Math.abs(w);
        float absH = Math.abs(h);
        if (absW <= 0f || absH <= 0f) {
            java.util.Arrays.fill(radii, 0f);
            return;
        }

        enforceRadiusLimit(radii, 0, 1, absW);
        enforceRadiusLimit(radii, 3, 2, absW);
        enforceRadiusLimit(radii, 0, 3, absH);
        enforceRadiusLimit(radii, 1, 2, absH);
    }

    private static void enforceRadiusLimit(float[] radii, int a, int b, float limit) {
        float sum = radii[a] + radii[b];
        if (sum > limit && limit > 0f) {
            float scale = limit / sum;
            radii[a] *= scale;
            radii[b] *= scale;
        }
    }

    private static boolean nearlyEqual(float a, float b) {
        return Math.abs(a - b) <= 1.0e-4f;
    }

    private static boolean nearlyZero(float value) {
        return Math.abs(value) <= 1.0e-4f;
    }

    private static boolean isIdentityTransform(float[] matrix) {
        if (matrix == null || matrix.length < 9) {
            return true;
        }
        return nearlyEqual(matrix[0], 1f)
                && nearlyZero(matrix[1])
                && nearlyZero(matrix[2])
                && nearlyZero(matrix[3])
                && nearlyEqual(matrix[4], 1f)
                && nearlyZero(matrix[5])
                && nearlyZero(matrix[6])
                && nearlyZero(matrix[7])
                && nearlyEqual(matrix[8], 1f);
    }

    private static boolean isAxisAlignedTransform(float[] matrix) {
        if (matrix == null || matrix.length < 9) {
            return true;
        }
        return nearlyZero(matrix[1]) && nearlyZero(matrix[3]) && nearlyZero(matrix[6]) && nearlyZero(matrix[7])
                && nearlyEqual(matrix[8], 1f);
    }

    private static float transformPointX(float[] matrix, float x, float y) {
        if (matrix == null || matrix.length < 9) {
            return x;
        }
        return matrix[0] * x + matrix[1] * y + matrix[2];
    }

    private static float transformPointY(float[] matrix, float x, float y) {
        if (matrix == null || matrix.length < 9) {
            return y;
        }
        return matrix[3] * x + matrix[4] * y + matrix[5];
    }

    private static float computeRadiusScale(float[] matrix) {
        if (matrix == null || matrix.length < 9) {
            return 1f;
        }
        float scaleX = Math.abs(matrix[0]);
        float scaleY = Math.abs(matrix[4]);
        float minScale = Math.min(scaleX, scaleY);
        if (minScale <= 1.0e-4f) {
            return 0f;
        }
        return minScale;
    }

    private record ClipState(int x, int y, int w, int h,
                             float roundTopLeft, float roundTopRight,
                             float roundBottomRight, float roundBottomLeft) {

        private static ClipState fromRect(float x, float y, float w, float h,
                                          float roundTopLeft, float roundTopRight,
                                          float roundBottomRight, float roundBottomLeft) {
            return fromRect(x, y, w, h, roundTopLeft, roundTopRight, roundBottomRight, roundBottomLeft, null);
        }

        private static ClipState fromRect(float x, float y, float w, float h,
                                          float roundTopLeft, float roundTopRight,
                                          float roundBottomRight, float roundBottomLeft,
                                          float[] transform) {
            if (!Float.isFinite(x) || !Float.isFinite(y) || !Float.isFinite(w) || !Float.isFinite(h)) {
                return new ClipState(0, 0, 0, 0, 0f, 0f, 0f, 0f);
            }
            boolean hasTransform = transform != null && transform.length >= 9 && !isIdentityTransform(transform);
            float[] radii = scratchRadii(roundTopLeft, roundTopRight, roundBottomRight, roundBottomLeft);
            normalizeCornerRadii(Math.abs(w), Math.abs(h), radii);
            if (!hasTransform) {
                float left = (float) Math.floor(Math.min(x, x + w));
                float top = (float) Math.floor(Math.min(y, y + h));
                float right = (float) Math.ceil(Math.max(x, x + w));
                float bottom = (float) Math.ceil(Math.max(y, y + h));
                int ix = (int) left;
                int iy = (int) top;
                int iw = Math.max(0, (int) (right - left));
                int ih = Math.max(0, (int) (bottom - top));
                if (iw <= 0 || ih <= 0) {
                    return new ClipState(ix, iy, 0, 0, 0f, 0f, 0f, 0f);
                }
                return new ClipState(ix, iy, iw, ih, radii[0], radii[1], radii[2], radii[3]);
            }

            float x2 = x + w;
            float y2 = y + h;
            float[] xs = new float[]{x, x2, x, x2};
            float[] ys = new float[]{y, y, y2, y2};
            float minX = Float.POSITIVE_INFINITY;
            float minY = Float.POSITIVE_INFINITY;
            float maxX = Float.NEGATIVE_INFINITY;
            float maxY = Float.NEGATIVE_INFINITY;
            for (int i = 0; i < 4; i++) {
                float tx = transformPointX(transform, xs[i], ys[i]);
                float ty = transformPointY(transform, xs[i], ys[i]);
                if (!Float.isFinite(tx) || !Float.isFinite(ty)) {
                    return new ClipState(0, 0, 0, 0, 0f, 0f, 0f, 0f);
                }
                if (tx < minX) {
                    minX = tx;
                }
                if (tx > maxX) {
                    maxX = tx;
                }
                if (ty < minY) {
                    minY = ty;
                }
                if (ty > maxY) {
                    maxY = ty;
                }
            }

            float left = (float) Math.floor(Math.min(minX, maxX));
            float top = (float) Math.floor(Math.min(minY, maxY));
            float right = (float) Math.ceil(Math.max(minX, maxX));
            float bottom = (float) Math.ceil(Math.max(minY, maxY));
            int ix = (int) left;
            int iy = (int) top;
            int iw = Math.max(0, (int) (right - left));
            int ih = Math.max(0, (int) (bottom - top));
            if (iw <= 0 || ih <= 0) {
                return new ClipState(ix, iy, 0, 0, 0f, 0f, 0f, 0f);
            }

            if (isAxisAlignedTransform(transform)) {
                float radiusScale = computeRadiusScale(transform);
                if (radiusScale > 0f) {
                    for (int i = 0; i < radii.length; i++) {
                        radii[i] *= radiusScale;
                    }
                } else {
                    java.util.Arrays.fill(radii, 0f);
                }
            } else {
                java.util.Arrays.fill(radii, 0f);
            }
            normalizeCornerRadii(Math.abs(right - left), Math.abs(bottom - top), radii);
            return new ClipState(ix, iy, iw, ih, radii[0], radii[1], radii[2], radii[3]);
        }

        private static ClipState intersect(ClipState a, ClipState b) {
            if (a == null) {
                return b;
            }
            if (b == null) {
                return a;
            }
            int nx = Math.max(a.x, b.x);
            int ny = Math.max(a.y, b.y);
            int nr = Math.min(a.x + a.w, b.x + b.w);
            int nb = Math.min(a.y + a.h, b.y + b.h);
            int nw = Math.max(0, nr - nx);
            int nh = Math.max(0, nb - ny);
            if (nw <= 0 || nh <= 0) {
                return new ClipState(nx, ny, 0, 0, 0f, 0f, 0f, 0f);
            }
            if (matchesRect(nx, ny, nw, nh, b)) {
                return new ClipState(nx, ny, nw, nh,
                        b.roundTopLeft, b.roundTopRight, b.roundBottomRight, b.roundBottomLeft);
            }
            if (matchesRect(nx, ny, nw, nh, a)) {
                return new ClipState(nx, ny, nw, nh,
                        a.roundTopLeft, a.roundTopRight, a.roundBottomRight, a.roundBottomLeft);
            }
            return new ClipState(nx, ny, nw, nh, 0f, 0f, 0f, 0f);
        }

        private static boolean matchesRect(int x, int y, int w, int h, ClipState other) {
            return other != null && other.x == x && other.y == y && other.w == w && other.h == h;
        }
    }
}
