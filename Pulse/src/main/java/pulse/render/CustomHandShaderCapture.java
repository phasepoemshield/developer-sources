package pulse.render;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.ProjectionType;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.Optional;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.render.VertexConsumerProvider;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import pulse.module.ModuleRegistry;
import pulse.modules.visuals.CustomHand;
import pulse.render.shader.PulseShaderProgram;
import pulse.render.shader.ShaderLibrary;

public final class CustomHandShaderCapture {
    private static final MinecraftClient CLIENT = MinecraftClient.getInstance();
    private static Framebuffer handFramebuffer = null;
    private static int fbWidth = 0;
    private static int fbHeight = 0;
    private static boolean capturing = false;

    private CustomHandShaderCapture() {
    }

    public static void beginCapture() {
        CustomHand customHand;
        if (guiOpen() || capturing || (customHand = ModuleRegistry.CUSTOM_HAND) == null || !customHand.k() || !customHand.shaderEnabled.a()) {
            return;
        }
        flushEntityBuffers();
        int width = CLIENT.getWindow().getFramebufferWidth();
        int height = CLIENT.getWindow().getFramebufferHeight();
        if (handFramebuffer == null || fbWidth != width || fbHeight != height) {
            if (handFramebuffer != null) {
                handFramebuffer.delete();
            }
            handFramebuffer = new SimpleFramebuffer(width, height, true);
            handFramebuffer.setClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            fbWidth = width;
            fbHeight = height;
        }
        handFramebuffer.copyDepthFrom(CLIENT.getFramebuffer());
        handFramebuffer.beginWrite(true);
        GlStateManager._colorMask(true, true, true, true);
        GlStateManager._depthMask(true);
        RenderSystem.clearColor(0.0f, 0.0f, 0.0f, 0.0f);
        RenderSystem.clear(GL11.GL_COLOR_BUFFER_BIT);
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
        try {
            CLIENT.gameRenderer.getLightmapTextureManager().enable();
        } catch (Throwable ignored) {
        }
        capturing = true;
    }

    public static void endCapture() {
        if (guiOpen()) {
            resetForGui();
            return;
        }
        if (!capturing || handFramebuffer == null) {
            return;
        }
        flushEntityBuffers();
        capturing = false;
        CLIENT.getFramebuffer().beginWrite(true);
        CustomHand customHand = ModuleRegistry.CUSTOM_HAND;
        if (customHand != null && customHand.k() && customHand.shaderEnabled.a()) {
            composite(customHand);
        }
    }

    private static void composite(CustomHand customHand) {
        Optional<PulseShaderProgram> optionalFind = ShaderLibrary.getRegistry().find("hand_shader");
        if (optionalFind.isEmpty() || !optionalFind.get().b()) {
            return;
        }
        Color colorHandShaderColor = customHand.handShaderColor();
        float time = ((System.currentTimeMillis() % 100000) / 1000.0f) * customHand.shaderSpeed.a();
        float opacity = customHand.shaderOpacity.a();
        int width = CLIENT.getWindow().getFramebufferWidth();
        int height = CLIENT.getWindow().getFramebufferHeight();
        Matrix4f previousProjection = new Matrix4f(RenderSystem.getProjectionMatrix());
        ProjectionType previousProjectionType = RenderSystem.getProjectionType();

        RenderSystem.setProjectionMatrix(new Matrix4f().ortho(0.0f, width, height, 0.0f, -1.0f, 1.0f), ProjectionType.ORTHOGRAPHIC);
        RenderSystem.getModelViewStack().pushMatrix();
        RenderSystem.getModelViewStack().identity();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(false);
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate(
                GlStateManager.SrcFactor.SRC_ALPHA,
                GlStateManager.DstFactor.ONE_MINUS_SRC_ALPHA,
                GlStateManager.SrcFactor.ONE,
                GlStateManager.DstFactor.ONE_MINUS_SRC_ALPHA);
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager._viewport(0, 0, width, height);

        int colorTex = handFramebuffer.getColorAttachment();
        GL13.glActiveTexture(GL13.GL_TEXTURE0);
        GlStateManager._bindTexture(colorTex);
        RenderSystem.setShaderTexture(0, colorTex);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);

        PulseShaderProgram program = optionalFind.get();
        program.d();
        program.a("time", time);
        program.a("screenSize", (float) width, (float) height);
        program.a(
                "baseColor",
                colorHandShaderColor.getRed() / 255.0f,
                colorHandShaderColor.getGreen() / 255.0f,
                colorHandShaderColor.getBlue() / 255.0f,
                1.0f);
        program.a("alpha", Math.max(0.15f, opacity));
        program.b("handTexture", 0);
        program.b("shaderMode", customHand.shaderModeIndex());
        program.b("shaderOnlyMode", customHand.shaderOnly.a() ? 1 : 0);
        PulseShaderProgram.a(0.0f, 0.0f, width, height);
        program.e();

        RenderSystem.getModelViewStack().popMatrix();
        RenderSystem.setProjectionMatrix(previousProjection, previousProjectionType);
        GL13.glActiveTexture(GL13.GL_TEXTURE0);
        GlStateManager._bindTexture(0);
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.depthMask(true);
        RenderSystem.enableDepthTest();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
    }

    private static void flushEntityBuffers() {
        try {
            VertexConsumerProvider.Immediate immediate = CLIENT.getBufferBuilders().getEntityVertexConsumers();
            if (immediate != null) {
                immediate.draw();
            }
        } catch (Throwable ignored) {
        }
    }

    public static boolean isActive() {
        if (guiOpen()) {
            return false;
        }
        return capturing;
    }

    public static Framebuffer getFramebuffer() {
        return handFramebuffer;
    }

    public static void dispose() {
        if (handFramebuffer != null) {
            handFramebuffer.delete();
            handFramebuffer = null;
        }
        capturing = false;
    }

    public static boolean guiOpen() {
        return CLIENT.currentScreen != null;
    }

    public static void resetForGui() {
        if (!capturing) {
            return;
        }
        capturing = false;
        try {
            flushEntityBuffers();
            CLIENT.getFramebuffer().beginWrite(true);
            RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
            RenderSystem.enableDepthTest();
            RenderSystem.disableBlend();
        } catch (Throwable ignored) {
        }
    }

    public static void beginGuiRender() {
        resetForGui();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableDepthTest();
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public static void endGuiRender() {
        RenderSystem.enableDepthTest();
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
    }
}
