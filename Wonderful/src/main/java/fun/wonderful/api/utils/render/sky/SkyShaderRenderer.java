package fun.wonderful.api.utils.render.sky;

import com.mojang.blaze3d.systems.ProjectionType;

import com.mojang.blaze3d.systems.RenderSystem;
import fun.wonderful.api.QClient;
import fun.wonderful.api.utils.render.ShaderUtils;
import lombok.Generated;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gl.ShaderProgramKey;
import com.mojang.blaze3d.systems.ProjectionType;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.GlUniform;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.render.Camera;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.render.BuiltBuffer;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public final class SkyShaderRenderer
implements QClient {
    private static final int DOWNSCALE_FOG = 3;
    private static final int DOWNSCALE_RAIN = 4;
    private static final int DOWNSCALE_POLAR = 3;
    private static final Matrix4f savedProj = new Matrix4f();
    private static final Matrix4f ortho = new Matrix4f();
    private static Framebuffer halfResBuffer;
    private static int lastWidth;
    private static int lastHeight;

    private static void ensureFramebuffer(int downscale) {
        int w2 = Math.max(mc.getWindow().getFramebufferWidth() / downscale, 1);
        int h2 = Math.max(mc.getWindow().getFramebufferHeight() / downscale, 1);
        if (halfResBuffer == null || lastWidth != w2 || lastHeight != h2) {
            if (halfResBuffer != null) {
                halfResBuffer.delete();
            }
            halfResBuffer = new SimpleFramebuffer(w2, h2, false);
            int prevTex = GL11.glGetInteger((int)32873);
            GL11.glBindTexture((int)3553, (int)halfResBuffer.getColorAttachment());
            GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
            GL11.glTexParameteri((int)3553, (int)10242, (int)33071);
            GL11.glTexParameteri((int)3553, (int)10243, (int)33071);
            GL11.glBindTexture((int)3553, (int)prevTex);
            lastWidth = w2;
            lastHeight = h2;
        }
    }

    public static void render(Mode mode) {
        SkyShaderRenderer.render(mode, null, null, 1.0f, 1.35f);
    }

    public static void render(Mode mode, float[] color1, float[] color2, float speed, float scale) {
        ShaderProgramKey key;
        if (mc.getWindow() == null) {
            return;
        }
        int downscale = switch (mode.ordinal()) {
            case 1 -> {
                key = ShaderUtils.skyRain;
                yield 4;
            }
            case 2 -> {
                key = ShaderUtils.skyPolar;
                yield 3;
            }
            default -> {
                key = ShaderUtils.skyFog;
                yield 3;
            }
        };
        ShaderProgram shader = mc.getShaderLoader().getOrCreateProgram(key);
        if (shader == null) {
            return;
        }
        SkyShaderRenderer.ensureFramebuffer(downscale);
        Camera camera = SkyShaderRenderer.mc.gameRenderer.getCamera();
        float yawRad = (float)Math.toRadians(-camera.getYaw());
        float pitchRad = (float)Math.toRadians(camera.getPitch());
        float fovDeg = ((Integer)SkyShaderRenderer.mc.options.getFov().getValue()).floatValue();
        int fullW = mc.getWindow().getFramebufferWidth();
        int fullH = mc.getWindow().getFramebufferHeight();
        float shaderTime = (float)(System.currentTimeMillis() % 100000L) / 1000.0f;
        GlUniform u2 = shader.getUniform("Time");
        if (u2 != null) {
            u2.set(shaderTime);
        }
        if ((u2 = shader.getUniform("Resolution")) != null) {
            u2.set((float)lastWidth, (float)lastHeight);
        }
        if ((u2 = shader.getUniform("CameraDir")) != null) {
            u2.set(yawRad, pitchRad);
        }
        if ((u2 = shader.getUniform("Fov")) != null) {
            u2.set(fovDeg);
        }
        if (mode == Mode.POLAR) {
            if (color1 != null && (u2 = shader.getUniform("Color1")) != null) {
                u2.set(color1[0], color1[1], color1[2]);
            }
            if (color2 != null && (u2 = shader.getUniform("Color2")) != null) {
                u2.set(color2[0], color2[1], color2[2]);
            }
            if ((u2 = shader.getUniform("Speed")) != null) {
                u2.set(speed);
            }
            if ((u2 = shader.getUniform("Scale")) != null) {
                u2.set(scale);
            }
        }
        savedProj.set((Matrix4fc)RenderSystem.getProjectionMatrix());
        ProjectionType savedType = RenderSystem.getProjectionType();
        int savedFbo = GL11.glGetInteger((int)36006);
        Matrix4fStack modelViewStack = RenderSystem.getModelViewStack();
        modelViewStack.pushMatrix();
        modelViewStack.identity();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableBlend();
        RenderSystem.disableCull();
        GL30.glBindFramebuffer((int)36160, (int)SkyShaderRenderer.halfResBuffer.fbo);
        GL11.glViewport((int)0, (int)0, (int)lastWidth, (int)lastHeight);
        RenderSystem.clearColor((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        RenderSystem.clear((int)16384);
        ortho.identity().setOrtho(0.0f, (float)lastWidth, (float)lastHeight, 0.0f, -1.0f, 1.0f);
        RenderSystem.setProjectionMatrix((Matrix4f)ortho, (ProjectionType)ProjectionType.ORTHOGRAPHIC);
        RenderSystem.setShader((ShaderProgramKey)key);
        BufferBuilder buf = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        buf.vertex(0.0f, 0.0f, 0.0f).texture(0.0f, 1.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        buf.vertex(0.0f, (float)lastHeight, 0.0f).texture(0.0f, 0.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        buf.vertex((float)lastWidth, (float)lastHeight, 0.0f).texture(1.0f, 0.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        buf.vertex((float)lastWidth, 0.0f, 0.0f).texture(1.0f, 1.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buf.end());
        GL30.glBindFramebuffer((int)36160, (int)savedFbo);
        GL11.glViewport((int)0, (int)0, (int)fullW, (int)fullH);
        ortho.identity().setOrtho(0.0f, (float)fullW, (float)fullH, 0.0f, -1.0f, 1.0f);
        RenderSystem.setProjectionMatrix((Matrix4f)ortho, (ProjectionType)ProjectionType.ORTHOGRAPHIC);
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_TEX_COLOR);
        RenderSystem.setShaderTexture((int)0, (int)halfResBuffer.getColorAttachment());
        BufferBuilder buf2 = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        buf2.vertex(0.0f, 0.0f, 0.0f).texture(0.0f, 1.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        buf2.vertex(0.0f, (float)fullH, 0.0f).texture(0.0f, 0.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        buf2.vertex((float)fullW, (float)fullH, 0.0f).texture(1.0f, 0.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        buf2.vertex((float)fullW, 0.0f, 0.0f).texture(1.0f, 1.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buf2.end());
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.enableCull();
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
        modelViewStack.popMatrix();
        RenderSystem.setProjectionMatrix((Matrix4f)savedProj, (ProjectionType)savedType);
    }

    @Generated
    private SkyShaderRenderer() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static enum Mode {
        FOG,
        RAIN,
        POLAR;

    }
}