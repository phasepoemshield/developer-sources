package fun.nexisdlc.client.utils.render.main.gl;

import fun.nexisdlc.client.utils.render.main.core.RenderFrameMetrics;
import fun.nexisdlc.client.utils.render.main.postfx.DepthRenderTarget;
import fun.nexisdlc.client.utils.render.main.postfx.DownsampleBlur;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import net.minecraft.client.texture.GlTexture;
import org.lwjgl.opengl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class GlBackend {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlBackend.class);
    private static final int MAX_INSTANCES = 4_096;
    private static final int MAX_TEXTURE_SLOTS = 16;
    private static final int INSTANCE_STRIDE = 144;
    private static final int INSTANCE_BUFFER_BYTES = MAX_INSTANCES * INSTANCE_STRIDE;

    private static final int TYPE_RECT_FILL = 0;
    private static final int TYPE_RECT_OUTLINE = 1;
    private static final int TYPE_CIRCLE = 2;
    private static final int TYPE_TEXTURED = 3;
    private static final int FLAG_TEXTURE_MSDF = 1 << 4;
    private static final int FLAG_TEXTURE_SCREEN_SPACE = 1 << 5;
    private static final int FLAG_TEXTURE_PRESERVE_PREMULTIPLIED = 1 << 6;
    private static final int FLAG_SHADOW = 1 << 26;

    private static final float[] IDENTITY_TRANSFORM = new float[]{
            1f, 0f, 0f,
            0f, 1f, 0f,
            0f, 0f, 1f
    };

    private static int packColorRgba(int color) {
        int r = (color >> 16) & 0xFF;
        int g = (color >> 8) & 0xFF;
        int b = color & 0xFF;
        int a = (color >>> 24) & 0xFF;
        return (a << 24) | (b << 16) | (g << 8) | r;
    }

    private final boolean ssboSupported;
    private final boolean debugOutputSupported;
    private boolean samplersInitialized = false;
    private final ShaderProgram shapeProgram;
    private final int vaoDraw;

    private final int ssbo;
    private final int instanceVbo;
    private final ByteBuffer instanceBuffer;
    private int instanceCount = 0;

    private GlState.Snapshot snapshot;
    private int viewportWidth;
    private int viewportHeight;

    private boolean clipEnabled = false;
    private int clipX = 0, clipY = 0, clipW = Integer.MAX_VALUE, clipH = Integer.MAX_VALUE;
    private float clipRoundTL = 0f, clipRoundTR = 0f, clipRoundBR = 0f, clipRoundBL = 0f;

    private final Int2IntOpenHashMap textureToSlot = new Int2IntOpenHashMap();
    private final IntArrayList slotToTexture = new IntArrayList(MAX_TEXTURE_SLOTS);
    private final int[] prevTextureBindings = new int[MAX_TEXTURE_SLOTS];

    private int uViewportLoc = -1;
    private int captureTex = 0;
    private int captureW = 0;
    private int captureH = 0;
    private int captureFbo = 0;
    private int downscaledCaptureTex = 0;
    private int downscaledCaptureW = 0;
    private int downscaledCaptureH = 0;
    private int downscaledCaptureFbo = 0;
    private float blurCaptureScaleX = 1.0f;
    private float blurCaptureScaleY = 1.0f;
    private int blurTempTex = 0;
    private int blurTempFbo = 0;
    private int regionCaptureTex = 0;
    private int regionCaptureW = 0;
    private int regionCaptureH = 0;
    private int regionCaptureFbo = 0;
    private final DepthRenderTarget fullFrameTarget = new DepthRenderTarget();
    private int fullFrameReadFbo = 0;
    private int fullscreenQuadVao = 0;
    private int fullscreenQuadVbo = 0;
    private int blurQuadVao = 0;
    private int blurQuadVbo = 0;
    private ShaderProgram fullscreenProgram;
    private int fullscreenSamplerLoc = -1;
    private ShaderProgram blurHProgram;
    private ShaderProgram blurVProgram;
    private int blurHSamplerLoc = -1;
    private int blurVSamplerLoc = -1;
    private int blurHResLoc = -1;
    private int blurVResLoc = -1;
    private int blurHRadiusLoc = -1;
    private int blurVRadiusLoc = -1;
    private GLDebugMessageCallback debugCallback;
    private DownsampleBlur screenBlur;
    private DownsampleBlur regionBlur;
    private int preparedBlurTex = 0;
    private int preparedBlurW = 0;
    private int preparedBlurH = 0;
    private float preparedBlurScaleX = 1.0f;
    private float preparedBlurScaleY = 1.0f;
    private int preparedRegionBlurTex = 0;
    private int preparedRegionBlurX = 0;
    private int preparedRegionBlurY = 0;
    private int preparedRegionBlurW = 0;
    private int preparedRegionBlurH = 0;
    private boolean destroyed = false;

    private void ensureInstanceCapacity() {
        ensureInstanceCapacity(1);
    }

    private void ensureInstanceCapacity(int additionalInstances) {
        if (additionalInstances <= 0) {
            return;
        }
        if (additionalInstances > MAX_INSTANCES) {
            throw new IllegalArgumentException(
                    "additionalInstances must be between 1 and " + MAX_INSTANCES);
        }
        if (instanceCount + additionalInstances > MAX_INSTANCES) {
            flush();
        }
    }

    public GlBackend() {
        LOGGER.info("  - Инициализация GlBackend...");
        GLCapabilities caps = GL.getCapabilities();
        this.textureToSlot.defaultReturnValue(-1);
        this.ssboSupported = caps.OpenGL43 || caps.GL_ARB_shader_storage_buffer_object;
        this.debugOutputSupported = caps.OpenGL43 || caps.GL_KHR_debug;
        boolean instancedArraysSupported = caps.OpenGL33 || caps.GL_ARB_instanced_arrays;
        boolean drawInstancedSupported = caps.OpenGL31 || caps.GL_ARB_draw_instanced;

        LOGGER.info("  - OpenGL возможности:");
        LOGGER.info("    - SSBO: {}", ssboSupported);
        LOGGER.info("    - Debug Output: {}", debugOutputSupported);
        LOGGER.info("    - Instanced Arrays: {}", instancedArraysSupported);
        LOGGER.info("    - Draw Instanced: {}", drawInstancedSupported);

        if (!ssboSupported && (!instancedArraysSupported || !drawInstancedSupported)) {
            throw new IllegalStateException("OpenGL instanced rendering is required when shader storage buffers are unavailable");
        }

        String vertexShaderPath = ssboSupported
                ? "assets/nexis/shaders/shape.vert"
                : "assets/nexis/shaders/shape_compat.vert";

        this.shapeProgram = ShaderProgram.fromResources(
                vertexShaderPath,
                "assets/nexis/shaders/shape.frag");

        vaoDraw = GL30.glGenVertexArrays();
        int vbo = GL15.glGenBuffers();

        GL30.glBindVertexArray(vaoDraw);
        GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vbo);

        float[] quad = {0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1};
        GL15.glBufferData(GL15.GL_ARRAY_BUFFER, quad, GL15.GL_STATIC_DRAW);
        GL20.glEnableVertexAttribArray(0);
        GL20.glVertexAttribPointer(0, 2, GL11.GL_FLOAT, false, 0, 0);

        int localInstanceVbo = 0;
        if (!ssboSupported) {
            localInstanceVbo = GL15.glGenBuffers();
            GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, localInstanceVbo);

            int stride = INSTANCE_STRIDE;
            long offset = 0L;

            GL20.glEnableVertexAttribArray(1);
            GL20.glVertexAttribPointer(1, 4, GL11.GL_FLOAT, false, stride, offset);
            GL33.glVertexAttribDivisor(1, 1);
            offset += Float.BYTES * 4L;

            GL20.glEnableVertexAttribArray(2);
            GL20.glVertexAttribPointer(2, 4, GL11.GL_FLOAT, false, stride, offset);
            GL33.glVertexAttribDivisor(2, 1);
            offset += Float.BYTES * 4L;

            GL20.glEnableVertexAttribArray(3);
            GL30.glVertexAttribIPointer(3, 4, GL11.GL_INT, stride, offset);
            GL33.glVertexAttribDivisor(3, 1);
            offset += Integer.BYTES * 4L;

            GL20.glEnableVertexAttribArray(4);
            GL20.glVertexAttribPointer(4, 4, GL11.GL_FLOAT, false, stride, offset);
            GL33.glVertexAttribDivisor(4, 1);
            offset += Float.BYTES * 4L;

            GL20.glEnableVertexAttribArray(5);
            GL20.glVertexAttribPointer(5, 4, GL11.GL_FLOAT, false, stride, offset);
            GL33.glVertexAttribDivisor(5, 1);
            offset += Float.BYTES * 4L;

            GL20.glEnableVertexAttribArray(6);
            GL30.glVertexAttribIPointer(6, 4, GL11.GL_INT, stride, offset);
            GL33.glVertexAttribDivisor(6, 1);
            offset += Integer.BYTES * 4L;

            GL20.glEnableVertexAttribArray(7);
            GL20.glVertexAttribPointer(7, 4, GL11.GL_FLOAT, false, stride, offset);
            GL33.glVertexAttribDivisor(7, 1);
            offset += Float.BYTES * 4L;

            GL20.glEnableVertexAttribArray(8);
            GL20.glVertexAttribPointer(8, 4, GL11.GL_FLOAT, false, stride, offset);
            GL33.glVertexAttribDivisor(8, 1);
            offset += Float.BYTES * 4L;

            GL20.glEnableVertexAttribArray(9);
            GL30.glVertexAttribIPointer(9, 1, GL11.GL_INT, stride, offset);
            GL33.glVertexAttribDivisor(9, 1);
            offset += Integer.BYTES;

            GL20.glEnableVertexAttribArray(10);
            GL30.glVertexAttribIPointer(10, 1, GL11.GL_INT, stride, offset);
            GL33.glVertexAttribDivisor(10, 1);

            GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
        }

        GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
        GL30.glBindVertexArray(0);

        ssbo = ssboSupported ? GL15.glGenBuffers() : 0;
        instanceVbo = localInstanceVbo;
        instanceBuffer = ByteBuffer.allocateDirect(MAX_INSTANCES * INSTANCE_STRIDE).order(ByteOrder.nativeOrder());

        if (ssbo != 0) {
            GL15.glBindBuffer(GL43.GL_SHADER_STORAGE_BUFFER, ssbo);
            GL15.glBufferData(GL43.GL_SHADER_STORAGE_BUFFER, INSTANCE_BUFFER_BYTES, GL15.GL_STREAM_DRAW);
            GL15.glBindBuffer(GL43.GL_SHADER_STORAGE_BUFFER, 0);
        }
        if (instanceVbo != 0) {
            GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, instanceVbo);
            GL15.glBufferData(GL15.GL_ARRAY_BUFFER, INSTANCE_BUFFER_BYTES, GL15.GL_STREAM_DRAW);
            GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
        }

        if (debugOutputSupported) {
            installDebugCallback(caps);
        }
        LOGGER.info("  ✓ GlBackend успешно инициализирован");
    }

    private void ensureFullscreenResources() {
        if (fullscreenQuadVao != 0) {
            return;
        }
        fullscreenQuadVao = GL30.glGenVertexArrays();
        fullscreenQuadVbo = GL15.glGenBuffers();
        GL30.glBindVertexArray(fullscreenQuadVao);
        GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, fullscreenQuadVbo);
        float[] quad = {
                -1f, -1f, 0f, 0f,
                1f, -1f, 1f, 0f,
                1f, 1f, 1f, 1f,
                -1f, -1f, 0f, 0f,
                1f, 1f, 1f, 1f,
                -1f, 1f, 0f, 1f
        };
        GL15.glBufferData(GL15.GL_ARRAY_BUFFER, quad, GL15.GL_STATIC_DRAW);
        int stride = 4 * Float.BYTES;
        GL20.glEnableVertexAttribArray(0);
        GL20.glVertexAttribPointer(0, 2, GL11.GL_FLOAT, false, stride, 0L);
        GL20.glEnableVertexAttribArray(1);
        GL20.glVertexAttribPointer(1, 2, GL11.GL_FLOAT, false, stride, 2L * Float.BYTES);
        GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
        GL30.glBindVertexArray(0);
    }

    private ShaderProgram ensureFullscreenProgram() {
        if (fullscreenProgram != null) {
            return fullscreenProgram;
        }
        String vertex = ResourceUtils.readText(
                "assets/nexis/shaders/blur/blur_fullscreen.vert");
        String fragment = "#version 330 core\n"
                + "layout(location = 0) out vec4 fragColor;\n"
                + "in vec2 vUv;\n"
                + "uniform sampler2D uSource;\n"
                + "void main() {\n"
                + "    fragColor = texture(uSource, vUv);\n"
                + "}";
        fullscreenProgram = new ShaderProgram(vertex, fragment);
        fullscreenSamplerLoc = fullscreenProgram.getUniformLocation("uSource");
        return fullscreenProgram;
    }

    private void ensureBlurPrograms() {
        if (blurHProgram != null && blurVProgram != null) return;
        String vertex = ResourceUtils.readText(
                "assets/nexis/shaders/blur/blur_fullscreen.vert");
        String blurFrag = "#version 330 core\n"
                + "layout(location = 0) out vec4 fragColor;\n"
                + "in vec2 vUv;\n"
                + "uniform sampler2D uSource;\n"
                + "uniform vec2 uResolution;\n"
                + "uniform float uRadius;\n"
                + "#define TAU 6.28318530718\n"
                + "void main() {\n"
                + "    vec2 uv = vUv;\n"
                + "    vec4 color = texture(uSource, uv);\n"
                + "    float step = TAU / 16.0;\n"
                + "    float samples = 0.0;\n"
                + "    vec2 radius = vec2(uRadius) / uResolution;\n"
                + "    for (float d = 0.0; d < TAU; d += step) {\n"
                + "        for (float i = 0.2; i <= 1.0; i += 0.2) {\n"
                + "            color += texture(uSource, uv + vec2(cos(d), sin(d)) * radius * i);\n"
                + "            samples += 1.0;\n"
                + "        }\n"
                + "    }\n"
                + "    color /= (1.0 + samples);\n"
                + "    fragColor = color;\n"
                + "}";
        blurHProgram = new ShaderProgram(vertex, blurFrag);
        blurVProgram = new ShaderProgram(vertex, blurFrag);
        blurHSamplerLoc = blurHProgram.getUniformLocation("uSource");
        blurVSamplerLoc = blurVProgram.getUniformLocation("uSource");
        blurHResLoc = blurHProgram.getUniformLocation("uResolution");
        blurVResLoc = blurVProgram.getUniformLocation("uResolution");
        blurHRadiusLoc = blurHProgram.getUniformLocation("uRadius");
        blurVRadiusLoc = blurVProgram.getUniformLocation("uRadius");
    }

    private void ensureScreenBlur() {
        if (screenBlur == null) {
            screenBlur = new DownsampleBlur(GL11.GL_RGBA8, GL11.GL_UNSIGNED_BYTE);
        }
    }

    private void ensureRegionBlur() {
        if (regionBlur == null) {
            regionBlur = new DownsampleBlur(GL11.GL_RGBA8, GL11.GL_UNSIGNED_BYTE);
        }
    }

    public void beginFrame(int width, int height) {
        snapshot = GlState.push();
        viewportWidth = width;
        viewportHeight = height;

        instanceCount = 0;
        instanceBuffer.clear();
        textureToSlot.clear();
        slotToTexture.clear();

        shapeProgram.use();
        if (uViewportLoc == -1) {
            uViewportLoc = shapeProgram.getUniformLocation("uViewport");
        }
        GL30.glBindVertexArray(vaoDraw);

        GL20.glUniform2f(uViewportLoc, width, height);
        preparedRegionBlurTex = 0;
        preparedRegionBlurW = 0;
        preparedRegionBlurH = 0;
        preparedRegionBlurX = 0;
        preparedRegionBlurY = 0;

        GL11.glDisable(GL11.GL_DEPTH_TEST);
        GL11.glDisable(GL11.GL_CULL_FACE);
        GL11.glDisable(GL11.GL_SCISSOR_TEST);
        GL11.glEnable(GL11.GL_BLEND);
        GL13.glActiveTexture(GL13.GL_TEXTURE0);
        GL14.glBlendFuncSeparate(GL11.GL_ONE, GL11.GL_ONE_MINUS_SRC_ALPHA,
                GL11.GL_ONE, GL11.GL_ONE_MINUS_SRC_ALPHA);

        if (!samplersInitialized) {
            for (int i = 0; i < MAX_TEXTURE_SLOTS; i++) {
                int loc = shapeProgram.getUniformLocation("uTextures[" + i + "]");
                if (loc != -1) {
                    GL20.glUniform1i(loc, i);
                }
            }
            samplersInitialized = true;
        }
    }

    public void reset2DState(int width, int height) {
        shapeProgram.use();
        if (uViewportLoc == -1) {
            uViewportLoc = shapeProgram.getUniformLocation("uViewport");
        }
        GL30.glBindVertexArray(vaoDraw);
        GL20.glUniform2f(uViewportLoc, width, height);

        GL11.glDisable(GL11.GL_DEPTH_TEST);
        GL11.glDisable(GL11.GL_CULL_FACE);
        GL11.glDisable(GL11.GL_SCISSOR_TEST);
        GL11.glEnable(GL11.GL_BLEND);
        GL13.glActiveTexture(GL13.GL_TEXTURE0);
        GL14.glBlendFuncSeparate(GL11.GL_ONE, GL11.GL_ONE_MINUS_SRC_ALPHA,
                GL11.GL_ONE, GL11.GL_ONE_MINUS_SRC_ALPHA);

        if (!samplersInitialized) {
            for (int i = 0; i < MAX_TEXTURE_SLOTS; i++) {
                int loc = shapeProgram.getUniformLocation("uTextures[" + i + "]");
                if (loc != -1) {
                    GL20.glUniform1i(loc, i);
                }
            }
            samplersInitialized = true;
        }
    }

    public void endFrame() {
        flush();

        GL30.glBindVertexArray(0);
        GL20.glUseProgram(0);
        GlState.pop(snapshot);
        snapshot = null;

        instanceCount = 0;
        instanceBuffer.clear();
    }

    public void flush() {
        if (instanceCount <= 0) return;
        // Re-activate our shape program and VAO in case blur shaders or vanilla changed them
        shapeProgram.use();
        GL30.glBindVertexArray(vaoDraw);

        // Re-establish single sampler binding
        int uTextureLoc = shapeProgram.getUniformLocation("uTexture");
        if (uTextureLoc != -1) {
            GL20.glUniform1i(uTextureLoc, 0);
        }

        instanceBuffer.limit(instanceCount * INSTANCE_STRIDE);
        instanceBuffer.position(0);

        if (ssboSupported) {
            GL15.glBindBuffer(GL43.GL_SHADER_STORAGE_BUFFER, ssbo);
            GL15.glBufferSubData(GL43.GL_SHADER_STORAGE_BUFFER, 0, instanceBuffer);
            GL43.glBindBufferBase(GL43.GL_SHADER_STORAGE_BUFFER, 0, ssbo);
        } else {
            GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, instanceVbo);
            GL15.glBufferSubData(GL15.GL_ARRAY_BUFFER, 0, instanceBuffer);
            GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
        }

        int usedSlots = slotToTexture.size();
        for (int slot = 0; slot < usedSlots; slot++) {
            GL13.glActiveTexture(GL13.GL_TEXTURE0 + slot);
            int tex = slotToTexture.getInt(slot);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, tex);
            // ФИКС: отвязываем чужой GpuSampler от юнита, иначе он переопределяет
            // фильтр текстуры (mag=LINEAR у скина -> мыло). Без sampler-объекта
            // семплинг идёт по параметрам texture-object (NEAREST, выставленный нами).
            GL33.glBindSampler(slot, 0);
        }

        int trianglesDrawn = Math.max(0, instanceCount) * 2;
        if (trianglesDrawn > 0) {
            RenderFrameMetrics.getInstance().recordDrawCall(trianglesDrawn);
        }

        if (ssboSupported) {
            GL11.glDrawArrays(GL11.GL_TRIANGLES, 0, instanceCount * 6);
        } else {
            GL31.glDrawArraysInstanced(GL11.GL_TRIANGLES, 0, 6, instanceCount);
        }

        instanceCount = 0;
        instanceBuffer.clear();
        textureToSlot.clear();
        slotToTexture.clear();
    }

    public void setScissorEnabled(boolean enabled) {
        this.clipEnabled = enabled;
        if (!enabled) {
            this.clipRoundTL = 0f;
            this.clipRoundTR = 0f;
            this.clipRoundBR = 0f;
            this.clipRoundBL = 0f;
        }
    }

    public void setScissorRect(int x, int y, int w, int h,
                               float roundTopLeft, float roundTopRight,
                               float roundBottomRight, float roundBottomLeft) {
        this.clipX = x;
        this.clipY = y;
        this.clipW = w;
        this.clipH = h;
        this.clipRoundTL = roundTopLeft;
        this.clipRoundTR = roundTopRight;
        this.clipRoundBR = roundBottomRight;
        this.clipRoundBL = roundBottomLeft;
    }

    public void setTransform(float[] m3) {
    }

    public void setBlurCaptureScale(float scaleX, float scaleY) {
        if (!Float.isFinite(scaleX) || !Float.isFinite(scaleY)) {
            throw new IllegalArgumentException("Blur capture scale must be finite");
        }
        if (scaleX <= 0f || scaleY <= 0f) {
            throw new IllegalArgumentException("Blur capture scale must be positive");
        }
        this.blurCaptureScaleX = scaleX;
        this.blurCaptureScaleY = scaleY;
    }

    private void writeInstanceEx(int type, float x, float y, float w, float h,
                                 int colorTL, int colorTR, int colorBR, int colorBL,
                                 float roundTL, float roundTR, float roundBR, float roundBL,
                                 float thickness, float[] transform,
                                 float u0, float v0, float u1, float v1, int texSlot,
                                 float startDeg, float arcPct, int extraFlags) {
        if (instanceCount >= MAX_INSTANCES) {
            throw new IllegalStateException("Instance capacity exceeded without prior ensureInstanceCapacity call");
        }

        int offset = instanceCount * INSTANCE_STRIDE;
        instanceBuffer.position(offset);

        putVertices(instanceBuffer, transform, x, y, w, h);

        int cx = clipEnabled ? clipX : 0;
        int cy = clipEnabled ? clipY : 0;
        int cw = clipEnabled ? clipW : viewportWidth;
        int ch = clipEnabled ? clipH : viewportHeight;
        float cRoundTL = clipEnabled ? clipRoundTL : 0f;
        float cRoundTR = clipEnabled ? clipRoundTR : 0f;
        float cRoundBR = clipEnabled ? clipRoundBR : 0f;
        float cRoundBL = clipEnabled ? clipRoundBL : 0f;
        instanceBuffer.putInt(cx);
        instanceBuffer.putInt(cy);
        instanceBuffer.putInt(cw);
        instanceBuffer.putInt(ch);
        instanceBuffer.putFloat(cRoundTL);
        instanceBuffer.putFloat(cRoundTR);
        instanceBuffer.putFloat(cRoundBR);
        instanceBuffer.putFloat(cRoundBL);

        instanceBuffer.putFloat(x);
        instanceBuffer.putFloat(y);
        instanceBuffer.putFloat(w);
        instanceBuffer.putFloat(h);

        instanceBuffer.putInt(packColorRgba(colorTL));
        instanceBuffer.putInt(packColorRgba(colorTR));
        instanceBuffer.putInt(packColorRgba(colorBR));
        instanceBuffer.putInt(packColorRgba(colorBL));

        float sanitizedTL = sanitizeRadius(roundTL);
        float sanitizedTR = sanitizeRadius(roundTR);
        float sanitizedBR = sanitizeRadius(roundBR);
        float sanitizedBL = sanitizeRadius(roundBL);

        instanceBuffer.putFloat(sanitizedTL);
        instanceBuffer.putFloat(sanitizedTR);
        instanceBuffer.putFloat(sanitizedBR);
        instanceBuffer.putFloat(sanitizedBL);

        instanceBuffer.putFloat(u0);
        instanceBuffer.putFloat(v0);
        instanceBuffer.putFloat(u1);
        instanceBuffer.putFloat(v1);

        int flags = type;
        if (type == TYPE_RECT_OUTLINE) {
            int th = Math.max(0, Math.min(255, Math.round(thickness)));
            flags |= (th << 2);
        }
        if (type == TYPE_CIRCLE) {
            float normalizedStart = startDeg;
            normalizedStart %= 360f;
            if (normalizedStart < 0f) normalizedStart += 360f;
            int encodedStart = Math.max(0, Math.min(255, Math.round((normalizedStart / 360f) * 255f)));
            float clampedPct = Math.max(0f, Math.min(1f, arcPct));
            int encodedPct = Math.max(0, Math.min(255, Math.round(clampedPct * 255f)));
            flags |= (encodedStart << 10);
            flags |= (encodedPct << 18);
        }
        if (type == TYPE_TEXTURED) {
            if (thickness > 0.0f) {
                flags |= (1 << 2);
            }
        }
        flags |= extraFlags;
        instanceBuffer.putInt(flags);

        instanceBuffer.putInt(texSlot);
        instanceBuffer.putInt(0);
        instanceBuffer.putInt(0);

        instanceCount++;
    }

    private static void putVertices(ByteBuffer buffer, float[] matrix, float x, float y, float w, float h) {
        float[] mat = (matrix != null && matrix.length >= 6) ? matrix : IDENTITY_TRANSFORM;
        float x0 = x;
        float y0 = y;
        float x1 = x + w;
        float y1 = y + h;

        putVertex(buffer, mat, x0, y0);
        putVertex(buffer, mat, x1, y0);
        putVertex(buffer, mat, x1, y1);
        putVertex(buffer, mat, x0, y1);
    }

    private static void putVertex(ByteBuffer buffer, float[] matrix, float px, float py) {
        float worldX = matrix[0] * px + matrix[1] * py + matrix[2];
        float worldY = matrix[3] * px + matrix[4] * py + matrix[5];
        buffer.putFloat(worldX);
        buffer.putFloat(worldY);
    }

    private static float sanitizeRadius(float radius) {
        if (!Float.isFinite(radius)) {
            return 0f;
        }
        return radius <= 0f ? 0f : radius;
    }

    private void writeInstance(int type, float x, float y, float w, float h, int color,
                               float rounding, float thickness, float[] transform,
                               float u0, float v0, float u1, float v1, int texSlot,
                               float startDeg, float arcPct) {
        writeInstanceEx(type, x, y, w, h,
                color, color, color, color,
                rounding, rounding, rounding, rounding,
                thickness, transform,
                u0, v0, u1, v1, texSlot, startDeg, arcPct, 0);
    }

    public void enqueueRect(float x, float y, float w, float h,
                            float roundTopLeft, float roundTopRight,
                            float roundBottomRight, float roundBottomLeft,
                            int color, float[] transform) {
        ensureInstanceCapacity();
        writeInstanceEx(TYPE_RECT_FILL, x, y, w, h,
                color, color, color, color,
                roundTopLeft, roundTopRight, roundBottomRight, roundBottomLeft,
                0f, transform,
                0, 0, 1, 1, -1, 0f, 1f, 0);
    }

    public void enqueueRectOutline(float x, float y, float w, float h,
                                   float roundTopLeft, float roundTopRight,
                                   float roundBottomRight, float roundBottomLeft,
                                   int color, float thickness, float[] transform) {
        ensureInstanceCapacity();
        writeInstanceEx(TYPE_RECT_OUTLINE, x, y, w, h,
                color, color, color, color,
                roundTopLeft, roundTopRight, roundBottomRight, roundBottomLeft,
                thickness, transform,
                0, 0, 1, 1, -1, 0f, 1f, 0);
    }

    public void enqueueGradient(float x, float y, float w, float h,
                                float roundTopLeft, float roundTopRight,
                                float roundBottomRight, float roundBottomLeft,
                                int c00, int c10, int c11, int c01, float[] transform) {
        ensureInstanceCapacity();
        writeInstanceEx(TYPE_RECT_FILL, x, y, w, h,
                c00, c10, c11, c01,
                roundTopLeft, roundTopRight, roundBottomRight, roundBottomLeft,
                0f, transform,
                0, 0, 1, 1, -1, 0f, 1f, 0);
    }

    public void enqueueCircle(float cx, float cy, float radius, float startDeg, float pct, int color, float[] transform) {
        float size = radius * 2f;
        ensureInstanceCapacity();
        writeInstance(TYPE_CIRCLE, cx - radius, cy - radius, size, size, color, 0, 0, transform,
                0, 0, 1, 1, -1, startDeg, pct);
    }

    public void drawDropShadowRect(float x, float y, float w, float h,
                                   float roundTopLeft, float roundTopRight,
                                   float roundBottomRight, float roundBottomLeft,
                                   float blurStrength, float spread,
                                   int rgbaPremul, float[] transform) {
        if (w <= 0f || h <= 0f) {
            return;
        }
        float safeBlur = blurStrength > 0f ? blurStrength : 0f;
        float safeSpread = spread > 0f ? spread : 0f;
        float padding = safeSpread + safeBlur * 3f;
        float expandedX = x - padding;
        float expandedY = y - padding;
        float expandedW = w + padding * 2f;
        float expandedH = h + padding * 2f;
        if (expandedW <= 0f || expandedH <= 0f) {
            return;
        }

        ensureInstanceCapacity();
        writeInstanceEx(TYPE_RECT_FILL, expandedX, expandedY, expandedW, expandedH,
                rgbaPremul, rgbaPremul, rgbaPremul, rgbaPremul,
                roundTopLeft, roundTopRight, roundBottomRight, roundBottomLeft,
                0f, transform,
                w, h, Math.max(safeBlur, 1.0e-3f), safeSpread, 0,
                0f, 1f, FLAG_SHADOW);
    }

    public void drawGradientShadow(float x, float y, float w, float h,
                                   float roundTopLeft, float roundTopRight,
                                   float roundBottomRight, float roundBottomLeft,
                                   float blurStrength, float spread,
                                   int c00, int c10, int c11, int c01, float[] transform) {
        if (w <= 0f || h <= 0f) return;
        if (w <= 0f || h <= 0f) return;
        float safeBlur = blurStrength > 0f ? blurStrength : 0f;
        float safeSpread = spread > 0f ? spread : 0f;
        float padding = safeSpread + safeBlur * 3f;
        float expandedX = x - padding;
        float expandedY = y - padding;
        float expandedW = w + padding * 2f;
        float expandedH = h + padding * 2f;
        if (expandedW <= 0f || expandedH <= 0f) return;

        ensureInstanceCapacity();
        writeInstanceEx(TYPE_RECT_FILL, expandedX, expandedY, expandedW, expandedH,
                c00, c10, c11, c01,
                roundTopLeft, roundTopRight, roundBottomRight, roundBottomLeft,
                0f, transform,
                w, h, Math.max(safeBlur, 1.0e-3f), safeSpread, 0,
                0f, 1f, FLAG_SHADOW);
    }

    public void drawTexturedQuad(int texture, float x, float y, float w, float h,
                                 float u0, float v0, float u1, float v1,
                                 int rgbaPremul, float[] transform) {
        ensureInstanceCapacity();
        int slot = textureSlotFor(texture);
        writeInstance(TYPE_TEXTURED, x, y, w, h, rgbaPremul, 0, 0, transform,
                u0, v0, u1, v1, slot, 0f, 1f);
    }

    public void drawTexturedQuadRounded(int texture, float x, float y, float w, float h,
                                        float u0, float v0, float u1, float v1,
                                        float rounding, int rgbaPremul, float[] transform) {
        ensureInstanceCapacity();
        int slot = textureSlotFor(texture);
        writeInstance(TYPE_TEXTURED, x, y, w, h, rgbaPremul, rounding, 0, transform,
                u0, v0, u1, v1, slot, 0f, 1f);
    }

    public void drawRgbaTexturedQuad(int texture, float x, float y, float w, float h,
                                     float u0, float v0, float u1, float v1,
                                     int rgbaPremul, float[] transform) {
        drawRgbaTexturedQuad(texture, x, y, w, h, u0, v0, u1, v1, rgbaPremul, transform, false);
    }

    public void drawRgbaTexturedQuad(int texture, float x, float y, float w, float h,
                                     float u0, float v0, float u1, float v1,
                                     int rgbaPremul, float[] transform,
                                     boolean preservePremultipliedColor) {
        ensureInstanceCapacity();
        int slot = textureSlotFor(texture);
        int extraFlags = preservePremultipliedColor ? FLAG_TEXTURE_PRESERVE_PREMULTIPLIED : 0;
        writeInstanceEx(TYPE_TEXTURED, x, y, w, h,
                rgbaPremul, rgbaPremul, rgbaPremul, rgbaPremul,
                0f, 0f, 0f, 0f,
                1, transform,
                u0, v0, u1, v1, slot, 0f, 1f, extraFlags);
    }

    public void drawRgbaTexturedQuadRounded(int texture, float x, float y, float w, float h,
                                            float u0, float v0, float u1, float v1,
                                            float rounding, int rgbaPremul, float[] transform) {
        drawRgbaTexturedQuadRounded(texture, x, y, w, h, u0, v0, u1, v1, rounding, rgbaPremul, transform, false);
    }

    public void drawRgbaTexturedQuadRounded(int texture, float x, float y, float w, float h,
                                            float u0, float v0, float u1, float v1,
                                            float rounding, int rgbaPremul, float[] transform,
                                            boolean preservePremultipliedColor) {
        ensureInstanceCapacity();
        int slot = textureSlotFor(texture);
        int extraFlags = preservePremultipliedColor ? FLAG_TEXTURE_PRESERVE_PREMULTIPLIED : 0;
        writeInstanceEx(TYPE_TEXTURED, x, y, w, h,
                rgbaPremul, rgbaPremul, rgbaPremul, rgbaPremul,
                rounding, rounding, rounding, rounding,
                1, transform,
                u0, v0, u1, v1, slot, 0f, 1f, extraFlags);
    }

    public void drawRgbaOpaqueTexturedQuadRounded(int texture, float x, float y, float w, float h,
                                                  float u0, float v0, float u1, float v1,
                                                  float rounding, int rgbaPremul, float[] transform) {
        ensureInstanceCapacity();
        drawRgbaOpaqueTexturedQuadRounded(texture, x, y, w, h,
                u0, v0, u1, v1, rounding, rgbaPremul, transform, false);
    }

    public void drawRgbaOpaqueTexturedQuadRounded(int texture, float x, float y, float w, float h,
                                                  float u0, float v0, float u1, float v1,
                                                  float rounding, int rgbaPremul, float[] transform,
                                                  boolean screenSpaceUv) {
        ensureInstanceCapacity();
        int slot = textureSlotFor(texture);
        int extraFlags = (1 << 3);
        if (screenSpaceUv) {
            extraFlags |= FLAG_TEXTURE_SCREEN_SPACE;
        }
        writeInstanceEx(TYPE_TEXTURED, x, y, w, h,
                rgbaPremul, rgbaPremul, rgbaPremul, rgbaPremul,
                rounding, rounding, rounding, rounding,
                1, transform,
                u0, v0, u1, v1, slot, 0f, 1f, extraFlags);
    }

    public void drawRgbaOpaqueTexturedQuad(int texture, float x, float y, float w, float h,
                                           float u0, float v0, float u1, float v1,
                                           int rgbaPremul, float[] transform) {
        ensureInstanceCapacity();
        int slot = textureSlotFor(texture);
        int extraFlags = (1 << 3);
        writeInstanceEx(TYPE_TEXTURED, x, y, w, h,
                rgbaPremul, rgbaPremul, rgbaPremul, rgbaPremul,
                0f, 0f, 0f, 0f,
                1, transform,
                u0, v0, u1, v1, slot, 0f, 1f, extraFlags);
    }

    public void enqueueMsdfGlyph(int texture,
                                 float pxRange,
                                 float x,
                                 float y,
                                 float width,
                                 float height,
                                 float u0, float v0,
                                 float u1, float v1,
                                 int rgbaColor,
                                 float[] transform) {
        if (texture <= 0) {
            return;
        }

        ensureInstanceCapacity();
        int slot = textureSlotFor(texture);
        float clampedRange = pxRange > 0f ? pxRange : 1e-3f;
        writeInstanceEx(TYPE_TEXTURED, x, y, width, height,
                rgbaColor, rgbaColor, rgbaColor, rgbaColor,
                clampedRange, clampedRange, clampedRange, clampedRange,
                0f, transform,
                u0, v0, u1, v1, slot, 0f, 1f, FLAG_TEXTURE_MSDF);
    }

    private int textureSlotFor(int texture) {
        int slot = textureToSlot.get(texture);
        if (slot != -1) {
            return slot;
        }
        if (slotToTexture.size() >= MAX_TEXTURE_SLOTS) {
            flush();
        }
        int newSlot = slotToTexture.size();
        slotToTexture.add(texture);
        textureToSlot.put(texture, newSlot);
        return newSlot;
    }

    public void drawInstances(ByteBuffer data, int instanceCount) {
    }

    public int createMsdfTexture(int width, int height, ByteBuffer data) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Invalid MSDF texture dimensions: " + width + "x" + height);
        }
        if (data == null) {
            throw new IllegalArgumentException("data");
        }
        int tex = GL11.glGenTextures();
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, tex);

        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
        GL12.glTexParameteri(GL11.GL_TEXTURE_2D, GL12.GL_TEXTURE_BASE_LEVEL, 0);
        GL12.glTexParameteri(GL11.GL_TEXTURE_2D, GL12.GL_TEXTURE_MAX_LEVEL, 0);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);

        GL11.glPixelStorei(GL11.GL_UNPACK_ALIGNMENT, 1);
        GL12.glPixelStorei(GL12.GL_UNPACK_ROW_LENGTH, 0);

        data.rewind();
        GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGBA8, width, height, 0, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, data);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);
        return tex;
    }

    public int createAlphaTexture(int width, int height) {
        int tex = GL11.glGenTextures();
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, tex);

        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
        GL12.glTexParameteri(GL11.GL_TEXTURE_2D, GL12.GL_TEXTURE_BASE_LEVEL, 0);
        GL12.glTexParameteri(GL11.GL_TEXTURE_2D, GL12.GL_TEXTURE_MAX_LEVEL, 0);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);

        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL33.GL_TEXTURE_SWIZZLE_R, GL11.GL_RED);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL33.GL_TEXTURE_SWIZZLE_G, GL11.GL_RED);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL33.GL_TEXTURE_SWIZZLE_B, GL11.GL_RED);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL33.GL_TEXTURE_SWIZZLE_A, GL11.GL_RED);

        GL11.glPixelStorei(GL11.GL_UNPACK_ALIGNMENT, 1);
        GL12.glPixelStorei(GL12.GL_UNPACK_ROW_LENGTH, 0);

        GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL30.GL_R8, width, height, 0, GL11.GL_RED, GL11.GL_UNSIGNED_BYTE, (ByteBuffer) null);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);
        return tex;
    }

    public void uploadAlphaSubImage(int tex, int x, int y, int w, int h, ByteBuffer data) {
        int prevAlign = GL11.glGetInteger(GL11.GL_UNPACK_ALIGNMENT);
        int prevRowLen = GL11.glGetInteger(GL12.GL_UNPACK_ROW_LENGTH);

        data.order(ByteOrder.nativeOrder());

        GL11.glBindTexture(GL11.GL_TEXTURE_2D, tex);

        GL11.glPixelStorei(GL11.GL_UNPACK_ALIGNMENT, 1);
        GL12.glPixelStorei(GL12.GL_UNPACK_ROW_LENGTH, 0);

        GL11.glTexSubImage2D(GL11.GL_TEXTURE_2D, 0, x, y, w, h, GL11.GL_RED, GL11.GL_UNSIGNED_BYTE, data);

        GL12.glPixelStorei(GL12.GL_UNPACK_ROW_LENGTH, prevRowLen);
        GL11.glPixelStorei(GL11.GL_UNPACK_ALIGNMENT, prevAlign);

        GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);
    }

    public void uploadAlphaSubImageWithStride(int tex, int x, int y, int w, int h,
                                              ByteBuffer data, int sourceRowLength) {
        int prevAlign = GL11.glGetInteger(GL11.GL_UNPACK_ALIGNMENT);
        int prevRowLen = GL11.glGetInteger(GL12.GL_UNPACK_ROW_LENGTH);

        data.order(ByteOrder.nativeOrder());

        GL11.glBindTexture(GL11.GL_TEXTURE_2D, tex);

        GL11.glPixelStorei(GL11.GL_UNPACK_ALIGNMENT, 1);
        GL12.glPixelStorei(GL12.GL_UNPACK_ROW_LENGTH, sourceRowLength);

        GL11.glTexSubImage2D(GL11.GL_TEXTURE_2D, 0, x, y, w, h, GL11.GL_RED, GL11.GL_UNSIGNED_BYTE, data);

        GL12.glPixelStorei(GL12.GL_UNPACK_ROW_LENGTH, prevRowLen);
        GL11.glPixelStorei(GL11.GL_UNPACK_ALIGNMENT, prevAlign);

        GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);
    }

    private void ensureCaptureTex(int w, int h, boolean fullscreen) {
        if (w <= 0 || h <= 0) {
            return;
        }

        int currentTex = fullscreen ? captureTex : regionCaptureTex;
        int currentFbo = fullscreen ? captureFbo : regionCaptureFbo;
        int currentW = fullscreen ? captureW : regionCaptureW;
        int currentH = fullscreen ? captureH : regionCaptureH;

        if (currentTex != 0 && w == currentW && h == currentH) {
            return;
        }

        if (currentTex != 0) {
            GL11.glDeleteTextures(currentTex);
            currentTex = 0;
        }
        if (currentFbo != 0) {
            GL30.glDeleteFramebuffers(currentFbo);
            currentFbo = 0;
        }

        currentTex = GL11.glGenTextures();
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, currentTex);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGBA8, w, h, 0, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, (ByteBuffer) null);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);

        currentFbo = GL30.glGenFramebuffers();
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER, currentFbo);
        GL30.glFramebufferTexture2D(GL30.GL_FRAMEBUFFER, GL30.GL_COLOR_ATTACHMENT0, GL11.GL_TEXTURE_2D, currentTex, 0);
        GL11.glDrawBuffer(GL30.GL_COLOR_ATTACHMENT0);
        int status = GL30.glCheckFramebufferStatus(GL30.GL_FRAMEBUFFER);
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER, 0);
        if (status != GL30.GL_FRAMEBUFFER_COMPLETE) {
            GL30.glDeleteFramebuffers(currentFbo);
            GL11.glDeleteTextures(currentTex);
            throw new IllegalStateException("Capture FBO incomplete: status=" + status);
        }

        if (fullscreen) {
            captureTex = currentTex;
            captureFbo = currentFbo;
            captureW = w;
            captureH = h;
        } else {
            regionCaptureTex = currentTex;
            regionCaptureFbo = currentFbo;
            regionCaptureW = w;
            regionCaptureH = h;
        }
    }

    private void ensureDownscaledCapture(int screenW, int screenH) {
        ensureDownscaledCapture(screenW, screenH, blurCaptureScaleX, blurCaptureScaleY);
    }

    private void ensureDownscaledCapture(int screenW, int screenH, float scaleX, float scaleY) {
        if (screenW <= 0 || screenH <= 0) {
            return;
        }
        if (!Float.isFinite(scaleX) || !Float.isFinite(scaleY)) {
            throw new IllegalArgumentException("Blur capture scale must be finite");
        }
        if (scaleX <= 0f || scaleY <= 0f) {
            throw new IllegalArgumentException("Blur capture scale must be positive");
        }

        int clampedSrcW = Math.max(1, screenW);
        int clampedSrcH = Math.max(1, screenH);
        int targetW = Math.max(1, Math.round(clampedSrcW * scaleX));
        int targetH = Math.max(1, Math.round(clampedSrcH * scaleY));

        if (downscaledCaptureTex != 0 && targetW == downscaledCaptureW && targetH == downscaledCaptureH) {
            return;
        }

        if (downscaledCaptureTex != 0) {
            GL11.glDeleteTextures(downscaledCaptureTex);
            downscaledCaptureTex = 0;
        }
        if (downscaledCaptureFbo != 0) {
            GL30.glDeleteFramebuffers(downscaledCaptureFbo);
            downscaledCaptureFbo = 0;
        }

        downscaledCaptureTex = GL11.glGenTextures();
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, downscaledCaptureTex);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL12.GL_TEXTURE_BASE_LEVEL, 0);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL12.GL_TEXTURE_MAX_LEVEL, 0);
        GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGBA8, targetW, targetH, 0, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, (ByteBuffer) null);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);

        downscaledCaptureFbo = GL30.glGenFramebuffers();
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER, downscaledCaptureFbo);
        GL30.glFramebufferTexture2D(GL30.GL_FRAMEBUFFER, GL30.GL_COLOR_ATTACHMENT0, GL11.GL_TEXTURE_2D, downscaledCaptureTex, 0);
        GL11.glDrawBuffer(GL30.GL_COLOR_ATTACHMENT0);
        int status = GL30.glCheckFramebufferStatus(GL30.GL_FRAMEBUFFER);
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER, 0);
        if (status != GL30.GL_FRAMEBUFFER_COMPLETE) {
            GL30.glDeleteFramebuffers(downscaledCaptureFbo);
            GL11.glDeleteTextures(downscaledCaptureTex);
            downscaledCaptureFbo = 0;
            downscaledCaptureTex = 0;
            throw new IllegalStateException("Downscaled capture FBO incomplete: status=" + status);
        }

        downscaledCaptureW = targetW;
        downscaledCaptureH = targetH;
    }

    private void ensureBlurTemp(int w, int h) {
        if (blurTempTex != 0 && blurTempW == w && blurTempH == h) return;
        if (blurTempTex != 0) {
            GL11.glDeleteTextures(blurTempTex);
            blurTempTex = 0;
        }
        if (blurTempFbo != 0) {
            GL30.glDeleteFramebuffers(blurTempFbo);
            blurTempFbo = 0;
        }
        blurTempTex = GL11.glGenTextures();
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, blurTempTex);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL12.GL_TEXTURE_BASE_LEVEL, 0);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL12.GL_TEXTURE_MAX_LEVEL, 0);
        GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL11.GL_RGBA8, w, h, 0,
                GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, (ByteBuffer) null);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);

        blurTempFbo = GL30.glGenFramebuffers();
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER, blurTempFbo);
        GL30.glFramebufferTexture2D(GL30.GL_FRAMEBUFFER, GL30.GL_COLOR_ATTACHMENT0,
                GL11.GL_TEXTURE_2D, blurTempTex, 0);
        GL11.glDrawBuffer(GL30.GL_COLOR_ATTACHMENT0);
        int status = GL30.glCheckFramebufferStatus(GL30.GL_FRAMEBUFFER);
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER, 0);
        if (status != GL30.GL_FRAMEBUFFER_COMPLETE) {
            GL30.glDeleteFramebuffers(blurTempFbo);
            GL11.glDeleteTextures(blurTempTex);
            blurTempFbo = 0;
            blurTempTex = 0;
            throw new IllegalStateException("Blur temp FBO incomplete: status=" + status);
        }
        blurTempW = w;
        blurTempH = h;
    }

    private int blurTempW = 0;
    private int blurTempH = 0;

    private boolean blitTextureToFramebuffer(int sourceTexture, int sourceW, int sourceH,
                                             int targetFbo, int targetW, int targetH) {
        if (sourceTexture <= 0 || sourceW <= 0 || sourceH <= 0 || targetFbo == 0 || targetW <= 0 || targetH <= 0) {
            return false;
        }

        boolean blitOk = true;
        GlState.Snapshot state = GlState.push();
        try {
            boolean wasScissorEnabled = GL11.glIsEnabled(GL11.GL_SCISSOR_TEST);
            boolean wasSrgb = GL11.glIsEnabled(GL30.GL_FRAMEBUFFER_SRGB);
            if (wasScissorEnabled) GL11.glDisable(GL11.GL_SCISSOR_TEST);
            if (wasSrgb) GL11.glDisable(GL30.GL_FRAMEBUFFER_SRGB);

            if (fullFrameReadFbo == 0) {
                fullFrameReadFbo = GL30.glGenFramebuffers();
            }
            GL30.glBindFramebuffer(GL30.GL_READ_FRAMEBUFFER, fullFrameReadFbo);
            GL30.glFramebufferTexture2D(GL30.GL_READ_FRAMEBUFFER, GL30.GL_COLOR_ATTACHMENT0, GL11.GL_TEXTURE_2D, sourceTexture, 0);
            GL30.glFramebufferTexture2D(GL30.GL_READ_FRAMEBUFFER, GL30.GL_DEPTH_ATTACHMENT, GL11.GL_TEXTURE_2D, 0, 0);
            int status = GL30.glCheckFramebufferStatus(GL30.GL_READ_FRAMEBUFFER);
            if (status != GL30.GL_FRAMEBUFFER_COMPLETE) {
                blitOk = false;
            } else {
                GL11.glReadBuffer(GL30.GL_COLOR_ATTACHMENT0);

                GL30.glBindFramebuffer(GL30.GL_DRAW_FRAMEBUFFER, targetFbo);
                GL11.glDrawBuffer(GL30.GL_COLOR_ATTACHMENT0);

                GL30.glBlitFramebuffer(0, 0, sourceW, sourceH,
                        0, 0, targetW, targetH,
                        GL11.GL_COLOR_BUFFER_BIT, GL11.GL_LINEAR);
            }

            if (wasScissorEnabled) GL11.glEnable(GL11.GL_SCISSOR_TEST);
            if (wasSrgb) GL11.glEnable(GL30.GL_FRAMEBUFFER_SRGB);
        } finally {
            GlState.pop(state);
        }
        return blitOk;
    }

    public int captureRegionToTexture(int x, int y, int w, int h) {
        return captureRegionToTexture(x, y, w, h, true);
    }

    public int captureRegionToTexture(int x, int y, int w, int h, boolean fullscreen) {
        ensureCaptureTex(w, h, fullscreen);
        int targetFbo = fullscreen ? captureFbo : regionCaptureFbo;
        int srcY = Math.max(0, viewportHeight - y - h);
        int srcX = Math.max(0, x);

        GlState.Snapshot s = GlState.push();
        try {
            boolean wasScissorEnabled = GL11.glIsEnabled(GL11.GL_SCISSOR_TEST);
            boolean wasSrgb = GL11.glIsEnabled(GL30.GL_FRAMEBUFFER_SRGB);
            if (wasScissorEnabled) GL11.glDisable(GL11.GL_SCISSOR_TEST);
            if (wasSrgb) GL11.glDisable(GL30.GL_FRAMEBUFFER_SRGB);

            GL30.glBindFramebuffer(GL30.GL_READ_FRAMEBUFFER, 0);
            GL11.glReadBuffer(GL11.GL_BACK);

            GL30.glBindFramebuffer(GL30.GL_DRAW_FRAMEBUFFER, targetFbo);
            GL11.glDrawBuffer(GL30.GL_COLOR_ATTACHMENT0);

            GL30.glBlitFramebuffer(srcX, srcY, srcX + w, srcY + h,
                    0, 0, w, h,
                    GL11.GL_COLOR_BUFFER_BIT, GL11.GL_NEAREST);

            if (wasScissorEnabled) GL11.glEnable(GL11.GL_SCISSOR_TEST);
            if (wasSrgb) GL11.glEnable(GL30.GL_FRAMEBUFFER_SRGB);
        } finally {
            GlState.pop(s);
        }
        return fullscreen ? captureTex : regionCaptureTex;
    }

    private void ensureBlurQuad() {
        if (blurQuadVao != 0) return;
        blurQuadVao = GL30.glGenVertexArrays();
        blurQuadVbo = GL15.glGenBuffers();
        GL30.glBindVertexArray(blurQuadVao);
        GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, blurQuadVbo);
        float[] quad = {0, 0, 1, 0, 0, 1, 1, 1};
        GL15.glBufferData(GL15.GL_ARRAY_BUFFER, quad, GL15.GL_STATIC_DRAW);
        GL20.glEnableVertexAttribArray(0);
        GL20.glVertexAttribPointer(0, 2, GL11.GL_FLOAT, false, 0, 0);
        GL30.glBindVertexArray(0);
    }

    private int applyGaussianBlur(int sourceTex, int width, int height, float radius) {
        ensureScreenBlur();
        return screenBlur.blurFromColorTexture(sourceTex, width, height, radius, true);
    }

    public void prepareScreenBlur(int screenW, int screenH, float radiusPx) {
        if (screenW <= 0 || screenH <= 0) {
            preparedBlurTex = 0;
            preparedBlurW = 0;
            preparedBlurH = 0;
            preparedBlurScaleX = 1.0f;
            preparedBlurScaleY = 1.0f;
            return;
        }

        ensureScreenBlur();
        float requestedScaleX = 1.0f;
        float requestedScaleY = 1.0f;
        float userScaleFloorX = blurCaptureScaleX;
        float userScaleFloorY = blurCaptureScaleY;
        float smallKernelThreshold = screenBlur.smallKernelThreshold();
        if (radiusPx > smallKernelThreshold) {
            float minimumRadius = screenBlur.minimumRadius();
            float radius = Math.max(radiusPx, minimumRadius);
            float adaptiveScale = smallKernelThreshold / radius;
            requestedScaleX = Math.min(requestedScaleX, adaptiveScale);
            requestedScaleY = Math.min(requestedScaleY, adaptiveScale);
        }

        requestedScaleX = Math.max(requestedScaleX, userScaleFloorX);
        requestedScaleY = Math.max(requestedScaleY, userScaleFloorY);

        ensureDownscaledCapture(screenW, screenH, requestedScaleX, requestedScaleY);
        if (downscaledCaptureTex == 0 || downscaledCaptureFbo == 0) {
            preparedBlurTex = 0;
            preparedBlurW = 0;
            preparedBlurH = 0;
            preparedBlurScaleX = 1.0f;
            preparedBlurScaleY = 1.0f;
            return;
        }

        float actualScaleX = downscaledCaptureW / (float) Math.max(1, screenW);
        float actualScaleY = downscaledCaptureH / (float) Math.max(1, screenH);

        GlState.Snapshot state = GlState.push();
        try {
            boolean wasScissorEnabled = GL11.glIsEnabled(GL11.GL_SCISSOR_TEST);
            boolean wasSrgb = GL11.glIsEnabled(GL30.GL_FRAMEBUFFER_SRGB);
            if (wasScissorEnabled) GL11.glDisable(GL11.GL_SCISSOR_TEST);
            if (wasSrgb) GL11.glDisable(GL30.GL_FRAMEBUFFER_SRGB);

            int currentFbo = GL11.glGetInteger(GL30.GL_FRAMEBUFFER_BINDING);
            GL30.glBindFramebuffer(GL30.GL_READ_FRAMEBUFFER, currentFbo);
            GL11.glReadBuffer(GL30.GL_COLOR_ATTACHMENT0);

            GL30.glBindFramebuffer(GL30.GL_DRAW_FRAMEBUFFER, downscaledCaptureFbo);
            GL11.glDrawBuffer(GL30.GL_COLOR_ATTACHMENT0);

            GL30.glBlitFramebuffer(0, 0, screenW, screenH,
                    0, 0, downscaledCaptureW, downscaledCaptureH,
                    GL11.GL_COLOR_BUFFER_BIT, GL11.GL_LINEAR);

            if (wasScissorEnabled) GL11.glEnable(GL11.GL_SCISSOR_TEST);
            if (wasSrgb) GL11.glEnable(GL30.GL_FRAMEBUFFER_SRGB);
        } finally {
            GlState.pop(state);
        }

        GL11.glBindTexture(GL11.GL_TEXTURE_2D, downscaledCaptureTex);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);

        int blurred = applyGaussianBlur(downscaledCaptureTex, downscaledCaptureW, downscaledCaptureH, radiusPx);
        if (blurred == 0) {
            preparedBlurTex = 0;
            preparedBlurW = 0;
            preparedBlurH = 0;
            preparedBlurScaleX = 1.0f;
            preparedBlurScaleY = 1.0f;
            return;
        }
        preparedBlurTex = blurred;
        preparedBlurW = downscaledCaptureW;
        preparedBlurH = downscaledCaptureH;
        preparedBlurScaleX = actualScaleX;
        preparedBlurScaleY = actualScaleY;
    }

    public void prepareScreenBlurFromTexture(int sourceTexture, int sourceW, int sourceH, float radiusPx) {
        if (sourceTexture <= 0 || sourceW <= 0 || sourceH <= 0) {
            preparedBlurTex = 0;
            preparedBlurW = 0;
            preparedBlurH = 0;
            preparedBlurScaleX = 1.0f;
            preparedBlurScaleY = 1.0f;
            return;
        }

        ensureScreenBlur();
        float requestedScaleX = 1.0f;
        float requestedScaleY = 1.0f;
        float userScaleFloorX = blurCaptureScaleX;
        float userScaleFloorY = blurCaptureScaleY;
        float smallKernelThreshold = screenBlur.smallKernelThreshold();
        if (radiusPx > smallKernelThreshold) {
            float minimumRadius = screenBlur.minimumRadius();
            float radius = Math.max(radiusPx, minimumRadius);
            float adaptiveScale = smallKernelThreshold / radius;
            requestedScaleX = Math.min(requestedScaleX, adaptiveScale);
            requestedScaleY = Math.min(requestedScaleY, adaptiveScale);
        }

        requestedScaleX = Math.max(requestedScaleX, userScaleFloorX);
        requestedScaleY = Math.max(requestedScaleY, userScaleFloorY);

        ensureDownscaledCapture(sourceW, sourceH, requestedScaleX, requestedScaleY);
        if (downscaledCaptureTex == 0 || downscaledCaptureFbo == 0) {
            preparedBlurTex = 0;
            preparedBlurW = 0;
            preparedBlurH = 0;
            preparedBlurScaleX = 1.0f;
            preparedBlurScaleY = 1.0f;
            return;
        }

        float actualScaleX = downscaledCaptureW / (float) Math.max(1, sourceW);
        float actualScaleY = downscaledCaptureH / (float) Math.max(1, sourceH);

        boolean blitOk = blitTextureToFramebuffer(sourceTexture, sourceW, sourceH,
                downscaledCaptureFbo, downscaledCaptureW, downscaledCaptureH);

        if (!blitOk) {
            preparedBlurTex = 0;
            preparedBlurW = 0;
            preparedBlurH = 0;
            preparedBlurScaleX = 1.0f;
            preparedBlurScaleY = 1.0f;
            return;
        }

        GL11.glBindTexture(GL11.GL_TEXTURE_2D, downscaledCaptureTex);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);

        int blurred = applyGaussianBlur(downscaledCaptureTex, downscaledCaptureW, downscaledCaptureH, radiusPx);
        if (blurred == 0) {
            preparedBlurTex = 0;
            preparedBlurW = 0;
            preparedBlurH = 0;
            preparedBlurScaleX = 1.0f;
            preparedBlurScaleY = 1.0f;
            return;
        }
        preparedBlurTex = blurred;
        preparedBlurW = downscaledCaptureW;
        preparedBlurH = downscaledCaptureH;
        preparedBlurScaleX = actualScaleX;
        preparedBlurScaleY = actualScaleY;
    }

    public boolean prepareRegionBlur(int x, int y, int width, int height, float radiusPx) {
        if (width <= 0 || height <= 0) {
            preparedRegionBlurTex = 0;
            preparedRegionBlurW = 0;
            preparedRegionBlurH = 0;
            preparedRegionBlurX = 0;
            preparedRegionBlurY = 0;
            return false;
        }
        int texture = captureRegionToTexture(x, y, width, height, false);
        int blurSourceTexture = texture;
        int blurSourceWidth = width;
        int blurSourceHeight = height;
        float effectiveRadius = radiusPx;

        ensureRegionBlur();
        float requestedScaleX = 1.0f;
        float requestedScaleY = 1.0f;
        float smallKernelThreshold = regionBlur.smallKernelThreshold();
        if (radiusPx > smallKernelThreshold) {
            float minimumRadius = regionBlur.minimumRadius();
            float radius = Math.max(radiusPx, minimumRadius);
            float adaptiveScale = smallKernelThreshold / radius;
            requestedScaleX = Math.max(adaptiveScale, blurCaptureScaleX);
            requestedScaleY = Math.max(adaptiveScale, blurCaptureScaleY);
        }

        if (requestedScaleX < 0.999f || requestedScaleY < 0.999f) {
            ensureDownscaledCapture(width, height, requestedScaleX, requestedScaleY);
            if (downscaledCaptureTex != 0 && downscaledCaptureFbo != 0
                    && blitTextureToFramebuffer(texture, width, height, downscaledCaptureFbo,
                    downscaledCaptureW, downscaledCaptureH)) {
                blurSourceTexture = downscaledCaptureTex;
                blurSourceWidth = downscaledCaptureW;
                blurSourceHeight = downscaledCaptureH;
                float radiusScale = (float) Math.sqrt(
                        (blurSourceWidth / (float) Math.max(1, width))
                                * (blurSourceHeight / (float) Math.max(1, height)));
                effectiveRadius = Math.max(0f, radiusPx) * radiusScale;
            }
        }

        int blurred = regionBlur.blurFromColorTexture(
                blurSourceTexture, blurSourceWidth, blurSourceHeight, effectiveRadius);
        preparedRegionBlurTex = blurred;
        preparedRegionBlurW = blurSourceWidth;
        preparedRegionBlurH = blurSourceHeight;
        preparedRegionBlurX = x;
        preparedRegionBlurY = y;
        return blurred != 0;
    }

    public void drawPreparedBlurRounded(float x, float y, float w, float h, float rounding, float alpha, float[] transform) {
        if (preparedBlurTex == 0) return;
        flush();

        int colorPremul = ((int) (Math.max(0f, Math.min(1f, alpha)) * 255f) << 24) | 0x00FFFFFF;
        float uScale = 1.0f / Math.max(1, preparedBlurW);
        float vScale = -1.0f / Math.max(1, preparedBlurH);
        drawRgbaOpaqueTexturedQuadRounded(preparedBlurTex, x, y, w, h,
                uScale, vScale, 0.0f, 1.0f, rounding, colorPremul, transform, true);
    }

    public void drawPreparedRegionBlurRounded(float x, float y, float w, float h,
                                              float rounding, float alpha, float[] transform,
                                              int regionX, int regionY, int regionW, int regionH) {
        if (preparedRegionBlurTex == 0) {
            return;
        }
        flush();
        if (regionW <= 0 || regionH <= 0) {
            return;
        }
        if (preparedRegionBlurX != regionX || preparedRegionBlurY != regionY) {
            return;
        }
        ensureInstanceCapacity();
        int colorPremul = ((int) (Math.max(0f, Math.min(1f, alpha)) * 255f) << 24) | 0x00FFFFFF;
        float invW = regionW > 0 ? (1.0f / regionW) : 0f;
        float invH = regionH > 0 ? (1.0f / regionH) : 0f;

        float uScale = invW;
        float vScale = regionH > 0 ? (-invH) : 0f;
        float uOffset = -regionX * invW;
        float vOffset = regionH > 0 ? (1.0f + regionY * invH) : 0f;

        drawRgbaOpaqueTexturedQuadRounded(preparedRegionBlurTex, x, y, w, h,
                uScale, vScale, uOffset, vOffset, rounding, colorPremul, transform, true);
    }

    public record FrameCapture(int colorTexture, int depthTexture, int width, int height) {
    }

    public FrameCapture captureFullFrame() {
        net.minecraft.client.MinecraftClient client = net.minecraft.client.MinecraftClient.getInstance();
        if (client == null) {
            return new FrameCapture(0, 0, 0, 0);
        }
        net.minecraft.client.gl.Framebuffer framebuffer = client.getFramebuffer();
        if (framebuffer == null) {
            return new FrameCapture(0, 0, 0, 0);
        }
        com.mojang.blaze3d.textures.GpuTexture colorAttachment = framebuffer.getColorAttachment();
        if (!(colorAttachment instanceof GlTexture glColor)) {
            return new FrameCapture(0, 0, 0, 0);
        }
        int sourceColor = glColor.getGlId();
        int sourceDepth = 0;
        com.mojang.blaze3d.textures.GpuTexture depthAttachment = framebuffer.getDepthAttachment();
        if (depthAttachment instanceof GlTexture glDepth) {
            sourceDepth = glDepth.getGlId();
        }
        int width = Math.max(1, framebuffer.textureWidth);
        int height = Math.max(1, framebuffer.textureHeight);
        fullFrameTarget.ensure(width, height);

        GlState.Snapshot state = GlState.push();
        try {
            GL11.glDisable(GL11.GL_SCISSOR_TEST);
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glDisable(GL30.GL_FRAMEBUFFER_SRGB);

            if (fullFrameReadFbo == 0) {
                fullFrameReadFbo = GL30.glGenFramebuffers();
            }
            GL30.glBindFramebuffer(GL30.GL_READ_FRAMEBUFFER, fullFrameReadFbo);
            GL30.glFramebufferTexture2D(GL30.GL_READ_FRAMEBUFFER, GL30.GL_COLOR_ATTACHMENT0, GL11.GL_TEXTURE_2D, sourceColor, 0);
            if (sourceDepth > 0) {
                GL30.glFramebufferTexture2D(GL30.GL_READ_FRAMEBUFFER, GL30.GL_DEPTH_ATTACHMENT, GL11.GL_TEXTURE_2D, sourceDepth, 0);
            } else {
                GL30.glFramebufferTexture2D(GL30.GL_READ_FRAMEBUFFER, GL30.GL_DEPTH_ATTACHMENT, GL11.GL_TEXTURE_2D, 0, 0);
            }
            int status = GL30.glCheckFramebufferStatus(GL30.GL_READ_FRAMEBUFFER);
            if (status != GL30.GL_FRAMEBUFFER_COMPLETE) {
                throw new IllegalStateException("Source framebuffer incomplete: status=" + status);
            }
            GL30.glBindFramebuffer(GL30.GL_DRAW_FRAMEBUFFER, fullFrameTarget.fbo);
            GL11.glReadBuffer(GL30.GL_COLOR_ATTACHMENT0);
            GL11.glDrawBuffer(GL30.GL_COLOR_ATTACHMENT0);

            int mask = GL11.GL_COLOR_BUFFER_BIT;
            if (sourceDepth > 0) {
                mask |= GL11.GL_DEPTH_BUFFER_BIT;
            }
            GL30.glBlitFramebuffer(0, 0, width, height,
                    0, 0, width, height,
                    mask,
                    GL11.GL_NEAREST);
        } finally {
            GlState.pop(state);
        }

        return new FrameCapture(fullFrameTarget.colorTex, fullFrameTarget.depthTex, width, height);
    }

    public void drawFullscreenTexture(int texture, int width, int height) {
        if (texture <= 0 || width <= 0 || height <= 0) {
            return;
        }
        ensureFullscreenResources();
        ShaderProgram program = ensureFullscreenProgram();

        GlState.Snapshot state = GlState.push();
        try {
            GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER, 0);
            GL11.glViewport(0, 0, width, height);
            GL11.glDisable(GL11.GL_SCISSOR_TEST);
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glDisable(GL30.GL_FRAMEBUFFER_SRGB);

            program.use();
            if (fullscreenSamplerLoc >= 0) {
                GL20.glUniform1i(fullscreenSamplerLoc, 0);
            }
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, texture);

            GL30.glBindVertexArray(fullscreenQuadVao);
            RenderFrameMetrics.getInstance().recordDrawCall(2);
            GL11.glDrawArrays(GL11.GL_TRIANGLES, 0, 6);
            GL30.glBindVertexArray(0);
        } finally {
            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);
            GL20.glUseProgram(0);
            GlState.pop(state);
        }
    }

    public void destroy() {
        if (destroyed) {
            LOGGER.info("  - GlBackend уже уничтожен");
            return;
        }
        LOGGER.info("  - Уничтожение GlBackend...");
        destroyed = true;

        try {
            if (GL.getCapabilities() == null) {
                LOGGER.warn("  - GlBackend: нет GL context, пропускаю native destroy");
                return;
            }
        } catch (Throwable t) {
            LOGGER.warn("  - GlBackend: GL context недоступен, пропускаю native destroy");
            return;
        }

        if (screenBlur != null) {
            screenBlur.destroy();
        }
        if (regionBlur != null) {
            regionBlur.destroy();
        }

        fullFrameTarget.destroy();

        if (fullFrameReadFbo != 0) {
            GL30.glDeleteFramebuffers(fullFrameReadFbo);
            fullFrameReadFbo = 0;
        }

        if (fullscreenQuadVao != 0) {
            GL30.glDeleteVertexArrays(fullscreenQuadVao);
            fullscreenQuadVao = 0;
        }
        if (fullscreenQuadVbo != 0) {
            GL15.glDeleteBuffers(fullscreenQuadVbo);
            fullscreenQuadVbo = 0;
        }
        if (blurQuadVao != 0) {
            GL30.glDeleteVertexArrays(blurQuadVao);
            blurQuadVao = 0;
        }
        if (blurQuadVbo != 0) {
            GL15.glDeleteBuffers(blurQuadVbo);
            blurQuadVbo = 0;
        }

        if (captureFbo != 0) {
            GL30.glDeleteFramebuffers(captureFbo);
            captureFbo = 0;
        }
        if (captureTex != 0) {
            GL11.glDeleteTextures(captureTex);
            captureTex = 0;
        }
        captureW = 0;
        captureH = 0;

        if (downscaledCaptureFbo != 0) {
            GL30.glDeleteFramebuffers(downscaledCaptureFbo);
            downscaledCaptureFbo = 0;
        }
        if (downscaledCaptureTex != 0) {
            GL11.glDeleteTextures(downscaledCaptureTex);
            downscaledCaptureTex = 0;
        }
        downscaledCaptureW = 0;
        downscaledCaptureH = 0;

        if (regionCaptureFbo != 0) {
            GL30.glDeleteFramebuffers(regionCaptureFbo);
            regionCaptureFbo = 0;
        }
        if (regionCaptureTex != 0) {
            GL11.glDeleteTextures(regionCaptureTex);
            regionCaptureTex = 0;
        }
        regionCaptureW = 0;
        regionCaptureH = 0;

        preparedBlurTex = 0;
        preparedBlurW = 0;
        preparedBlurH = 0;
        preparedBlurScaleX = 1.0f;
        preparedBlurScaleY = 1.0f;
        preparedRegionBlurTex = 0;
        preparedRegionBlurW = 0;
        preparedRegionBlurH = 0;
        preparedRegionBlurX = 0;
        preparedRegionBlurY = 0;

        textureToSlot.clear();
        slotToTexture.clear();

        GL30.glBindVertexArray(0);
        GL20.glUseProgram(0);

        if (vaoDraw != 0) {
            GL30.glDeleteVertexArrays(vaoDraw);
        }
        if (ssbo != 0) {
            GL15.glDeleteBuffers(ssbo);
        }
        if (instanceVbo != 0) {
            GL15.glDeleteBuffers(instanceVbo);
        }

        shapeProgram.delete();
        if (fullscreenProgram != null) {
            fullscreenProgram.delete();
            fullscreenProgram = null;
        }
        if (blurHProgram != null) {
            blurHProgram.delete();
            blurHProgram = null;
        }
        if (blurVProgram != null) {
            blurVProgram.delete();
            blurVProgram = null;
        }
        if (screenBlur != null) {
            screenBlur.destroy();
            screenBlur = null;
        }
        if (regionBlur != null) {
            regionBlur.destroy();
            regionBlur = null;
        }
        if (debugCallback != null) {
            debugCallback.free();
            debugCallback = null;
        }
        LOGGER.info("  ✓ GlBackend успешно уничтожен");
    }

    private void installDebugCallback(GLCapabilities caps) {
        if (debugCallback != null) {
            return;
        }

        debugCallback = GLDebugMessageCallback.create((source, type, id, severity, length, message, userParam) -> {
            String text = GLDebugMessageCallback.getMessage(length, message);
            if (severity == GL43.GL_DEBUG_SEVERITY_NOTIFICATION) {
                return;
            }
        });

        if (caps.OpenGL43) {
            GL11.glEnable(GL43.GL_DEBUG_OUTPUT);
            GL11.glEnable(GL43.GL_DEBUG_OUTPUT_SYNCHRONOUS);
            GL43.glDebugMessageCallback(debugCallback, 0L);
            GL43.glDebugMessageControl(GL11.GL_DONT_CARE, GL11.GL_DONT_CARE,
                    GL43.GL_DEBUG_SEVERITY_NOTIFICATION, (int[]) null, false);
        } else {
            GL11.glEnable(KHRDebug.GL_DEBUG_OUTPUT);
            GL11.glEnable(KHRDebug.GL_DEBUG_OUTPUT_SYNCHRONOUS);
            KHRDebug.glDebugMessageCallback(debugCallback, 0L);
            KHRDebug.glDebugMessageControl(GL11.GL_DONT_CARE, GL11.GL_DONT_CARE,
                    KHRDebug.GL_DEBUG_SEVERITY_NOTIFICATION, (int[]) null, false);
        }
    }
}
