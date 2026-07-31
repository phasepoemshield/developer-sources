package fun.nexisdlc.client.utils.render.main.postfx;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.utils.render.main.gl.GlState;
import fun.nexisdlc.client.utils.render.main.gl.ResourceUtils;
import fun.nexisdlc.client.utils.render.main.gl.ShaderProgram;
import org.lwjgl.opengl.*;

/**
 * Fullscreen theme transition using a shockwave shader that reveals the new
 * theme starting from a click centre.
 */
public final class ThemeTransitionRenderer {
    private static ShaderProgram program;
    private static int vao;
    private static int vbo;
    private static boolean initFailed;

    private static int uTextureOld = -1;
    private static int uTextureNew = -1;
    private static int uResolution = -1;
    private static int uTime = -1;
    private static int uProgress = -1;
    private static int uLinearProgress = -1;
    private static int uCenter = -1;
    private static int uAspect = -1;
    private static int uRadius = -1;
    private static int uMaxRadius = -1;
    private static int uAccentTop = -1;
    private static int uAccentBottom = -1;

    private static final ColorRenderTarget oldTarget = new ColorRenderTarget();
    private static final ColorRenderTarget newTarget = new ColorRenderTarget();

    private static boolean active = false;
    private static long startMs;
    private static float cx, cy;
    private static float screenW, screenH;
    private static final float DURATION_MS = 950f;

    public static boolean isActive() {
        return active;
    }

    public static void trigger(float centerX, float centerY, float sw, float sh) {
        if (!ensureInit()) return;
        int vw = Math.max(1, (int) sw);
        int vh = Math.max(1, (int) sh);
        oldTarget.ensure(vw, vh);
        newTarget.ensure(vw, vh);
        if (oldTarget.fbo == 0 || newTarget.fbo == 0) return;

        int[] vp = new int[4];
        GL11.glGetIntegerv(GL11.GL_VIEWPORT, vp);
        int vpW = vp[2];
        int vpH = vp[3];

        GlState.Snapshot snap = GlState.push();
        try {
            // capture current framebuffer -> oldTarget
            GL30.glBindFramebuffer(GL30.GL_READ_FRAMEBUFFER, 0);
            GL11.glReadBuffer(GL11.GL_BACK);
            GL30.glBindFramebuffer(GL30.GL_DRAW_FRAMEBUFFER, oldTarget.fbo);
            GL11.glDrawBuffer(GL30.GL_COLOR_ATTACHMENT0);
            GL30.glBlitFramebuffer(0, 0, vpW, vpH,
                    0, 0, vw, vh,
                    GL11.GL_COLOR_BUFFER_BIT, GL11.GL_LINEAR);
        } finally {
            GlState.pop(snap);
        }

        active = true;
        startMs = System.currentTimeMillis();
        cx = centerX;
        cy = centerY;
        screenW = sw;
        screenH = sh;
    }

    public static void render() {
        if (!active || !ensureInit()) return;

        int[] vp = new int[4];
        GL11.glGetIntegerv(GL11.GL_VIEWPORT, vp);
        int vpW = vp[2];
        int vpH = vp[3];

        int texW = Math.max(1, (int) screenW);
        int texH = Math.max(1, (int) screenH);
        newTarget.ensure(texW, texH);

        GlState.Snapshot snap = GlState.push();
        try {
            // capture current framebuffer -> newTarget
            GL30.glBindFramebuffer(GL30.GL_READ_FRAMEBUFFER, 0);
            GL11.glReadBuffer(GL11.GL_BACK);
            GL30.glBindFramebuffer(GL30.GL_DRAW_FRAMEBUFFER, newTarget.fbo);
            GL11.glDrawBuffer(GL30.GL_COLOR_ATTACHMENT0);
            GL30.glBlitFramebuffer(0, 0, vpW, vpH,
                    0, 0, texW, texH,
                    GL11.GL_COLOR_BUFFER_BIT, GL11.GL_LINEAR);

            float elapsed = System.currentTimeMillis() - startMs;
            float linear = Math.min(1f, elapsed / DURATION_MS);
            if (linear >= 1f) {
                active = false;
                return;
            }
            float eased = linear * linear * (3f - 2f * linear); // smoothstep

            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

            program.use();

            GL13.glActiveTexture(GL13.GL_TEXTURE0);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, oldTarget.colorTex);
            if (uTextureOld >= 0) GL20.glUniform1i(uTextureOld, 0);

            GL13.glActiveTexture(GL13.GL_TEXTURE1);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, newTarget.colorTex);
            if (uTextureNew >= 0) GL20.glUniform1i(uTextureNew, 1);

            if (uResolution >= 0) GL20.glUniform2f(uResolution, screenW, screenH);
            if (uTime >= 0) GL20.glUniform1f(uTime, elapsed / 1000f);
            if (uProgress >= 0) GL20.glUniform1f(uProgress, eased);
            if (uLinearProgress >= 0) GL20.glUniform1f(uLinearProgress, linear);
            if (uCenter >= 0) GL20.glUniform2f(uCenter, cx, cy);
            if (uAspect >= 0) GL20.glUniform1f(uAspect, screenW / Math.max(1f, screenH));

            float maxRadius = (float) Math.sqrt(screenW * screenW + screenH * screenH);
            if (uMaxRadius >= 0) GL20.glUniform1f(uMaxRadius, maxRadius);
            if (uRadius >= 0) GL20.glUniform1f(uRadius, eased * maxRadius);

            int top = ClientColors.GRADIENT_START.getRGB();
            int bot = ClientColors.GRADIENT_END.getRGB();
            if (uAccentTop >= 0) {
                GL20.glUniform3f(uAccentTop,
                        ((top >> 16) & 0xFF) / 255f,
                        ((top >> 8) & 0xFF) / 255f,
                        (top & 0xFF) / 255f);
            }
            if (uAccentBottom >= 0) {
                GL20.glUniform3f(uAccentBottom,
                        ((bot >> 16) & 0xFF) / 255f,
                        ((bot >> 8) & 0xFF) / 255f,
                        (bot & 0xFF) / 255f);
            }

            GL30.glBindVertexArray(vao);
            GL11.glDrawArrays(GL11.GL_TRIANGLES, 0, 6);
        } finally {
            GlState.pop(snap);
        }
    }

    private static boolean ensureInit() {
        if (initFailed) return false;
        if (program != null) return true;
        try {
            String vert = ResourceUtils.readText("assets/nexis/shaders/postfx/theme_shockwave_transition.vert");
            String frag = ResourceUtils.readText("assets/nexis/shaders/postfx/theme_shockwave_transition.frag");
            program = new ShaderProgram(vert, frag);

            int posLoc = GL20.glGetAttribLocation(program.id(), "aPos");
            int uvLoc = GL20.glGetAttribLocation(program.id(), "aUv");

            uTextureOld = program.getUniformLocation("u_textureOld");
            uTextureNew = program.getUniformLocation("u_textureNew");
            uResolution = program.getUniformLocation("u_resolution");
            uTime = program.getUniformLocation("u_time");
            uProgress = program.getUniformLocation("u_progress");
            uLinearProgress = program.getUniformLocation("u_linearProgress");
            uCenter = program.getUniformLocation("u_center");
            uAspect = program.getUniformLocation("u_aspect");
            uRadius = program.getUniformLocation("u_radius");
            uMaxRadius = program.getUniformLocation("u_maxRadius");
            uAccentTop = program.getUniformLocation("u_accentTop");
            uAccentBottom = program.getUniformLocation("u_accentBottom");

            vao = GL30.glGenVertexArrays();
            vbo = GL15.glGenBuffers();
            GL30.glBindVertexArray(vao);
            GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vbo);

            float[] quad = {
                    -1f, -1f, 0f, 0f,
                     1f, -1f, 1f, 0f,
                     1f,  1f, 1f, 1f,
                    -1f, -1f, 0f, 0f,
                     1f,  1f, 1f, 1f,
                    -1f,  1f, 0f, 1f
            };
            GL15.glBufferData(GL15.GL_ARRAY_BUFFER, quad, GL15.GL_STATIC_DRAW);
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
