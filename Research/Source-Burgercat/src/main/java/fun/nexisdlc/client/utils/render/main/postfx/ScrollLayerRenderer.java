package fun.nexisdlc.client.utils.render.main.postfx;

import fun.nexisdlc.client.utils.render.main.gl.GlState;
import fun.nexisdlc.client.utils.render.main.gl.ResourceUtils;
import fun.nexisdlc.client.utils.render.main.gl.ShaderProgram;
import org.lwjgl.opengl.*;

/**
 * Scroll-layer postfx: captures a screen region into an FBO and redraws it through
 * a shader that applies motion blur, edge fade and rounded clipping.
 */
public final class ScrollLayerRenderer {
    private static ShaderProgram program;
    private static int vao;
    private static int vbo;
    private static boolean initFailed;

    private static int uSource = -1;
    private static int uTextureSize = -1;
    private static int uSize = -1;
    private static int uRadii = -1;
    private static int uClipRect = -1;
    private static int uClipRadii = -1;
    private static int uFadePx = -1;
    private static int uEdgeBlurPx = -1;
    private static int uMotionBlurPx = -1;
    private static int uMotionStrength = -1;
    private static int uDirection = -1;
    private static int uAlpha = -1;
    private static int uViewport = -1;

    private static final ColorRenderTarget captureTarget = new ColorRenderTarget();

    public static void render(int sourceTexture,
                              float x, float y, float w, float h,
                              float rounding,
                              float scrollVelocity,
                              float alpha,
                              float[] clipRect) {
        if (!ensureInit()) {
            return;
        }
        if (w <= 0f || h <= 0f || sourceTexture <= 0) {
            return;
        }

        int[] vp = new int[4];
        GL11.glGetIntegerv(GL11.GL_VIEWPORT, vp);
        float viewportW = vp[2];
        float viewportH = vp[3];

        GlState.Snapshot snap = GlState.push();
        try {
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

            program.use();

            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, sourceTexture);
            if (uSource >= 0) GL20.glUniform1i(uSource, 0);

            if (uTextureSize >= 0) GL20.glUniform2f(uTextureSize, w, h);
            if (uSize >= 0) GL20.glUniform2f(uSize, w, h);

            float tl = rounding, tr = rounding, br = rounding, bl = rounding;
            if (uRadii >= 0) GL20.glUniform4f(uRadii, tl, tr, br, bl);

            if (uClipRect >= 0) {
                if (clipRect != null && clipRect.length == 4) {
                    GL20.glUniform4f(uClipRect, clipRect[0], clipRect[1], clipRect[2], clipRect[3]);
                } else {
                    GL20.glUniform4f(uClipRect, x, y, w, h);
                }
            }
            if (uClipRadii >= 0) GL20.glUniform4f(uClipRadii, 0f, 0f, 0f, 0f);

            if (uFadePx >= 0) GL20.glUniform1f(uFadePx, 18f);
            if (uEdgeBlurPx >= 0) GL20.glUniform1f(uEdgeBlurPx, 0f);

            float motionPx = Math.abs(scrollVelocity) * 0.6f;
            float motionStr = Math.min(1f, Math.abs(scrollVelocity) / 20f);
            if (uMotionBlurPx >= 0) GL20.glUniform1f(uMotionBlurPx, motionPx);
            if (uMotionStrength >= 0) GL20.glUniform1f(uMotionStrength, motionStr);
            if (uDirection >= 0) GL20.glUniform1f(uDirection, scrollVelocity >= 0 ? 1f : -1f);
            if (uAlpha >= 0) GL20.glUniform1f(uAlpha, alpha);
            if (uViewport >= 0) GL20.glUniform2f(uViewport, viewportW, viewportH);

            uploadQuad(x, y, w, h);

            GL30.glBindVertexArray(vao);
            GL11.glDrawArrays(GL11.GL_TRIANGLES, 0, 6);
        } finally {
            GlState.pop(snap);
        }
    }

    public static int captureRegion(float x, float y, float w, float h) {
        int iw = Math.max(1, (int) w);
        int ih = Math.max(1, (int) h);
        captureTarget.ensure(iw, ih);
        if (captureTarget.fbo == 0 || captureTarget.colorTex == 0) {
            return 0;
        }

        int[] vp = new int[4];
        GL11.glGetIntegerv(GL11.GL_VIEWPORT, vp);
        int vpH = vp[3];

        int srcX0 = (int) x;
        int srcY0 = vpH - (int) (y + h);
        int srcX1 = srcX0 + iw;
        int srcY1 = srcY0 + ih;

        GlState.Snapshot snap = GlState.push();
        try {
            GL30.glBindFramebuffer(GL30.GL_READ_FRAMEBUFFER, 0);
            GL11.glReadBuffer(GL11.GL_BACK);

            GL30.glBindFramebuffer(GL30.GL_DRAW_FRAMEBUFFER, captureTarget.fbo);
            GL11.glDrawBuffer(GL30.GL_COLOR_ATTACHMENT0);

            GL30.glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1,
                    0, 0, iw, ih,
                    GL11.GL_COLOR_BUFFER_BIT, GL11.GL_LINEAR);
        } finally {
            GlState.pop(snap);
        }
        return captureTarget.colorTex;
    }

    private static void uploadQuad(float x, float y, float w, float h) {
        float x1 = x, y1 = y, x2 = x + w, y2 = y + h;
        // y1 is screen-top, y2 is screen-bottom. OpenGL texture has origin at bottom,
        // so we flip V so screen-top samples texture-top.
        float[] verts = {
                x1, y1, 0f, 1f,
                x2, y1, 1f, 1f,
                x2, y2, 1f, 0f,
                x1, y1, 0f, 1f,
                x2, y2, 1f, 0f,
                x1, y2, 0f, 0f
        };
        GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vbo);
        GL15.glBufferData(GL15.GL_ARRAY_BUFFER, verts, GL15.GL_STREAM_DRAW);
    }

    private static boolean ensureInit() {
        if (initFailed) return false;
        if (program != null) return true;
        try {
            String vert = ResourceUtils.readText("assets/nexis/shaders/postfx/scroll_layer.vert");
            String frag = ResourceUtils.readText("assets/nexis/shaders/postfx/scroll_layer.frag");
            program = new ShaderProgram(vert, frag);

            int posLoc = GL20.glGetAttribLocation(program.id(), "aPos");
            int uvLoc = GL20.glGetAttribLocation(program.id(), "aUv");

            uSource = program.getUniformLocation("uSource");
            uTextureSize = program.getUniformLocation("uTextureSize");
            uSize = program.getUniformLocation("uSize");
            uRadii = program.getUniformLocation("uRadii");
            uClipRect = program.getUniformLocation("uClipRect");
            uClipRadii = program.getUniformLocation("uClipRadii");
            uFadePx = program.getUniformLocation("uFadePx");
            uEdgeBlurPx = program.getUniformLocation("uEdgeBlurPx");
            uMotionBlurPx = program.getUniformLocation("uMotionBlurPx");
            uMotionStrength = program.getUniformLocation("uMotionStrength");
            uDirection = program.getUniformLocation("uDirection");
            uAlpha = program.getUniformLocation("uAlpha");
            uViewport = program.getUniformLocation("uViewport");

            vao = GL30.glGenVertexArrays();
            vbo = GL15.glGenBuffers();
            GL30.glBindVertexArray(vao);
            GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vbo);
            int stride = 4 * Float.BYTES;
            if (posLoc >= 0) {
                GL20.glEnableVertexAttribArray(posLoc);
                GL20.glVertexAttribPointer(posLoc, 2, GL11.GL_FLOAT, false, stride, 0L);
            }
            if (uvLoc >= 0) {
                GL20.glEnableVertexAttribArray(uvLoc);
                GL20.glVertexAttribPointer(uvLoc, 2, GL11.GL_FLOAT, false, stride, 2L * Float.BYTES);
            }
            GL30.glBindVertexArray(0);
            GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
            return true;
        } catch (Exception ignored) {
            initFailed = true;
            return false;
        }
    }
}
