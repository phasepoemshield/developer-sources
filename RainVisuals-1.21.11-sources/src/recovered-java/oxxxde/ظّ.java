/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.render.state.SkyRenderState
 *  net.minecraft.client.world.ClientWorld
 *  org.joml.Vector3fc
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL30
 */
package oxxxde;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.state.SkyRenderState;
import net.minecraft.client.world.ClientWorld;
import org.joml.Vector3fc;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import oxxxde.\u0628\u064c;

public final class \u0638\u0651 {
    private static int vertexArray;
    private static final Logger LOGGER;
    private static final Map<String, \u0628\u064c> PROGRAMS;
    private static final long START_NANOS;
    private static final Set<String> FAILED_PROGRAMS;
    private static final String VERTEX_SHADER = "assets/rain/shaders/core/sky/sky.vsh";
    private static final String SHADER_DIRECTORY = "assets/rain/shaders/core/sky/";
    private static boolean releaseRequested;

    private static void setDepthTest(boolean enabled) {
        if (enabled) {
            GlStateManager._enableDepthTest();
        } else {
            GlStateManager._disableDepthTest();
        }
    }

    private static void setBlend(boolean enabled) {
        if (enabled) {
            GlStateManager._enableBlend();
        } else {
            GlStateManager._disableBlend();
        }
    }

    public static void release() {
        if (RenderSystem.isOnRenderThread()) {
            \u0638\u0651.releaseNow();
        } else {
            releaseRequested = true;
        }
    }

    private static void setScissor(boolean enabled) {
        if (enabled) {
            GlStateManager._enableScissorTest();
        } else {
            GlStateManager._disableScissorTest();
        }
    }

    private static int vertexArray() {
        if (vertexArray == 0) {
            vertexArray = GL30.glGenVertexArrays();
        }
        return vertexArray;
    }

    private static void upload(int location, Vector3fc vector) {
        \u0638\u0651.upload(location, vector.x(), vector.y(), vector.z());
    }

    private static String readResource(String path) throws IOException {
        String string;
        block6: {
            InputStream stream = \u0638\u0651.class.getClassLoader().getResourceAsStream(path);
            try {
                if (stream == null) {
                    throw new IOException("Shader resource not found: " + path);
                }
                string = new String(stream.readAllBytes(), StandardCharsets.UTF_8);
                if (stream == null) break block6;
            }
            catch (Throwable throwable) {
                if (stream != null) {
                    try {
                        stream.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
            stream.close();
        }
        return string;
    }

    static {
        LOGGER = LoggerFactory.getLogger("Rain Custom Sky");
        START_NANOS = System.nanoTime();
        PROGRAMS = new HashMap<String, \u0628\u064c>();
        FAILED_PROGRAMS = new HashSet<String>();
    }

    private static void upload(int location, float x, float y, float z) {
        if (location >= 0) {
            GL20.glUniform3f((int)location, (float)x, (float)y, (float)z);
        }
    }

    private static float normalizeAngle(float angle) {
        float fullTurn = (float)Math.PI * 2;
        float normalized = angle % fullTurn;
        if (normalized < 0.0f) {
            normalized += fullTurn;
        }
        return normalized / fullTurn;
    }

    /*
     * WARNING - void declaration
     */
    private static \u0628\u064c program(String shaderName) {
        \u0628\u064c existing = PROGRAMS.get(shaderName);
        if (existing != null) {
            return existing;
        }
        if (FAILED_PROGRAMS.contains(shaderName)) {
            return null;
        }
        try {
            void throwable;
            \u0628\u064c compiled = \u0638\u0651.compile(shaderName);
            PROGRAMS.put(shaderName, compiled);
            LOGGER.info("Loaded custom sky shader '{}'", (Object)shaderName);
            return throwable;
        }
        catch (Throwable throwable) {
            FAILED_PROGRAMS.add(shaderName);
            LOGGER.error("Failed to load custom sky shader '{}'", (Object)shaderName, (Object)throwable);
            return null;
        }
    }

    private \u0638\u0651() {
    }

    private static void upload(int location, float value) {
        if (location >= 0) {
            GL20.glUniform1f((int)location, (float)value);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static \u0628\u064c compile(String shaderName) throws IOException {
        String vertexSource = \u0638\u0651.readResource(VERTEX_SHADER);
        String fragmentSource = \u0638\u0651.readResource(SHADER_DIRECTORY + shaderName + ".fsh");
        int vertexShader = \u0638\u0651.compileShader(shaderName + ".vsh", 35633, vertexSource);
        int fragmentShader = 0;
        int program = 0;
        try {
            void throwable;
            fragmentShader = \u0638\u0651.compileShader(shaderName + ".fsh", 35632, fragmentSource);
            program = GL20.glCreateProgram();
            GL20.glAttachShader((int)program, (int)vertexShader);
            GL20.glAttachShader((int)program, (int)fragmentShader);
            GL20.glLinkProgram((int)program);
            if (GL20.glGetProgrami((int)program, (int)35714) == 0) {
                throw new IllegalStateException(GL20.glGetProgramInfoLog((int)program).trim());
            }
            \u0628\u064c \u0628\u064c2 = new \u0628\u064c(program, \u0638\u0651.uniform(program, "uTime"), \u0638\u0651.uniform(program, "uSkyColor"), \u0638\u0651.uniform(program, "uCameraForward"), \u0638\u0651.uniform(program, "uCameraLeft"), \u0638\u0651.uniform(program, "uCameraUp"), \u0638\u0651.uniform(program, "uSunDirection"), \u0638\u0651.uniform(program, "uTanHalfFov"), \u0638\u0651.uniform(program, "uAspect"), \u0638\u0651.uniform(program, "uDayTime"), \u0638\u0651.uniform(program, "uRain"), \u0638\u0651.uniform(program, "uThunder"), \u0638\u0651.uniform(program, "uFogColor"), \u0638\u0651.uniform(program, "uFogStrength"));
            return throwable;
        }
        catch (Error | RuntimeException throwable) {
            void var6_7;
            if (program != 0) {
                GL20.glDeleteProgram((int)program);
            }
            throw var6_7;
        }
        finally {
            GL20.glDeleteShader((int)vertexShader);
            if (fragmentShader != 0) {
                GL20.glDeleteShader((int)fragmentShader);
            }
        }
    }

    private static float clamp01(float value) {
        return Math.max(0.0f, Math.min(value, 1.0f));
    }

    private static void releaseNow() {
        PROGRAMS.values().forEach(program -> GL20.glDeleteProgram((int)program.id()));
        PROGRAMS.clear();
        FAILED_PROGRAMS.clear();
        if (vertexArray != 0) {
            GL30.glDeleteVertexArrays((int)vertexArray);
            vertexArray = 0;
        }
        releaseRequested = false;
    }

    /*
     * WARNING - void declaration
     */
    private static int compileShader(String name, int type, String source) {
        void var3_3;
        int shader = GL20.glCreateShader((int)type);
        GL20.glShaderSource((int)shader, (CharSequence)source);
        GL20.glCompileShader((int)shader);
        if (GL20.glGetShaderi((int)shader, (int)35713) == 0) {
            String message = GL20.glGetShaderInfoLog((int)shader).trim();
            GL20.glDeleteShader((int)shader);
            throw new IllegalStateException(name + ": " + message);
        }
        return (int)var3_3;
    }

    private static void setCull(boolean enabled) {
        if (enabled) {
            GlStateManager._enableCull();
        } else {
            GlStateManager._disableCull();
        }
    }

    private static void discard(String shaderName) {
        \u0628\u064c program = PROGRAMS.remove(shaderName);
        if (program != null) {
            GL20.glDeleteProgram((int)program.id());
        }
        FAILED_PROGRAMS.add(shaderName);
    }

    private static int uniform(int program, String name) {
        return GL20.glGetUniformLocation((int)program, (CharSequence)name);
    }

    private static void uploadColor(int location, int color) {
        \u0638\u0651.upload(location, (float)(color >> 16 & 0xFF) / 255.0f, (float)(color >> 8 & 0xFF) / 255.0f, (float)(color & 0xFF) / 255.0f);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public static boolean render(String shaderName, SkyRenderState skyState, int fogColor, float fogStrength) {
        Camera camera;
        ClientWorld level;
        MinecraftClient minecraft;
        \u0628\u064c program;
        block10: {
            block9: {
                RenderSystem.assertOnRenderThread();
                if (releaseRequested) {
                    \u0638\u0651.releaseNow();
                }
                if ((program = \u0638\u0651.program(shaderName)) == null) {
                    return false;
                }
                minecraft = MinecraftClient.getInstance();
                level = minecraft.world;
                camera = minecraft.gameRenderer.getCamera();
                if (level == null) break block9;
                if (camera.isReady()) break block10;
            }
            return false;
        }
        float partialTick = camera.getLastTickProgress();
        float fov = minecraft.gameRenderer.getFov(camera, partialTick, true);
        float tanHalfFov = (float)Math.tan(Math.toRadians(fov * 0.5f));
        int width = Math.max(minecraft.getWindow().getFramebufferWidth(), 1);
        int height = Math.max(minecraft.getWindow().getFramebufferHeight(), 1);
        float aspect = (float)width / (float)height;
        float rain = \u0638\u0651.clamp01(1.0f - skyState.rainGradient);
        float thunder = \u0638\u0651.clamp01(level.getThunderGradient(partialTick));
        float time = (float)(System.nanoTime() - START_NANOS) / 1.0E9f;
        float dayTime = \u0638\u0651.normalizeAngle(skyState.sunAngle);
        float sunX = -((float)Math.sin(skyState.sunAngle));
        float sunY = (float)Math.cos(skyState.sunAngle);
        int previousProgram = GL11.glGetInteger((int)35725);
        int previousVertexArray = GL11.glGetInteger((int)34229);
        boolean depthTest = GL11.glIsEnabled((int)2929);
        boolean blend = GL11.glIsEnabled((int)3042);
        boolean cull = GL11.glIsEnabled((int)2884);
        boolean scissor = GL11.glIsEnabled((int)3089);
        boolean depthMask = GL11.glGetBoolean((int)2930);
        ChromaRenderer.FramebufferState framebufferState = ChromaRenderer.captureFramebufferState();
        try {
            ChromaRenderer.bindMainFramebuffer();
            GlStateManager._disableDepthTest();
            GlStateManager._depthMask((boolean)false);
            GlStateManager._disableBlend();
            GlStateManager._disableCull();
            GlStateManager._disableScissorTest();
            GL20.glUseProgram((int)program.id());
            \u0638\u0651.upload(program.time(), time);
            \u0638\u0651.uploadColor(program.skyColor(), skyState.skyColor);
            \u0638\u0651.upload(program.cameraForward(), camera.getHorizontalPlane());
            \u0638\u0651.upload(program.cameraLeft(), camera.getDiagonalPlane());
            \u0638\u0651.upload(program.cameraUp(), camera.getVerticalPlane());
            \u0638\u0651.upload(program.sunDirection(), sunX, sunY, 0.0f);
            \u0638\u0651.upload(program.tanHalfFov(), tanHalfFov);
            \u0638\u0651.upload(program.aspect(), aspect);
            \u0638\u0651.upload(program.dayTime(), dayTime);
            \u0638\u0651.upload(program.rain(), rain);
            \u0638\u0651.upload(program.thunder(), thunder);
            \u0638\u0651.uploadColor(program.fogColor(), fogColor);
            \u0638\u0651.upload(program.fogStrength(), \u0638\u0651.clamp01(fogStrength));
            GL30.glBindVertexArray((int)\u0638\u0651.vertexArray());
            GL11.glDrawArrays((int)4, (int)0, (int)3);
            boolean bl = true;
        }
        catch (Throwable throwable) {
            boolean bl;
            try {
                LOGGER.error("Failed to render custom sky shader '{}'", (Object)shaderName, (Object)throwable);
                \u0638\u0651.discard(shaderName);
                bl = false;
            }
            catch (Throwable throwable2) {
                void var27_27;
                void var25_25;
                GL30.glBindVertexArray((int)previousVertexArray);
                GL20.glUseProgram((int)previousProgram);
                GlStateManager._depthMask((boolean)depthMask);
                \u0638\u0651.setDepthTest(depthTest);
                \u0638\u0651.setBlend(blend);
                \u0638\u0651.setCull(cull);
                \u0638\u0651.setScissor((boolean)var25_25);
                ChromaRenderer.restoreFramebufferState((ChromaRenderer.FramebufferState)var27_27);
                throw throwable2;
            }
            GL30.glBindVertexArray((int)previousVertexArray);
            GL20.glUseProgram((int)previousProgram);
            GlStateManager._depthMask((boolean)depthMask);
            \u0638\u0651.setDepthTest(depthTest);
            \u0638\u0651.setBlend(blend);
            \u0638\u0651.setCull(cull);
            \u0638\u0651.setScissor(scissor);
            ChromaRenderer.restoreFramebufferState(framebufferState);
            return bl;
        }
        GL30.glBindVertexArray((int)previousVertexArray);
        GL20.glUseProgram((int)previousProgram);
        GlStateManager._depthMask((boolean)depthMask);
        \u0638\u0651.setDepthTest(depthTest);
        \u0638\u0651.setBlend(blend);
        \u0638\u0651.setCull(cull);
        \u0638\u0651.setScissor(scissor);
        ChromaRenderer.restoreFramebufferState(framebufferState);
        return (boolean)throwable;
    }
}

