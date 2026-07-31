package fun.wonderful.api.utils.render.blur;

import com.mojang.blaze3d.systems.RenderSystem;
import fun.wonderful.api.QClient;
import fun.wonderful.api.utils.render.ShaderUtils;
import fun.wonderful.client.ui.MenuPanel;
import lombok.Generated;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.GlUniform;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.render.BuiltBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public class BlurProgram
implements QClient {
    private static BlurProgram instance;
    private static Framebuffer buffer1;
    private static Framebuffer buffer2;
    private static Framebuffer blurredBuffer;
    private int lastWidth = -1;
    private int lastHeight = -1;
    private long lastRefreshNanos;
    private float lastRenderedBlurOffset = Float.NaN;
    private boolean requestedThisFrame = true;
    private float blurOffset = 1.0f;
    private static final int ITERATIONS = 3;
    private static final int DOWNSAMPLE = 4;
    private static final long CLICKGUI_ANIMATED_REFRESH_INTERVAL_NANOS = 8000000L;

    public static BlurProgram getInstance() {
        if (instance == null) {
            instance = new BlurProgram();
        }
        return instance;
    }

    public void beginFrame() {
        boolean shouldDraw = this.requestedThisFrame;
        this.requestedThisFrame = false;
        if (!shouldDraw) {
            return;
        }
        if (this.canReuseClickGuiBlur()) {
            return;
        }
        this.draw();
        this.lastRefreshNanos = System.nanoTime();
        this.lastRenderedBlurOffset = this.blurOffset;
    }

    public void request() {
        this.requestedThisFrame = true;
    }

    private boolean canReuseClickGuiBlur() {
        if (!(BlurProgram.mc.currentScreen instanceof MenuPanel) || blurredBuffer == null) {
            return false;
        }
        MenuPanel menuPanel = (MenuPanel)BlurProgram.mc.currentScreen;
        int width = Math.max(1, mc.getWindow().getFramebufferWidth() / 4);
        int height = Math.max(1, mc.getWindow().getFramebufferHeight() / 4);
        if (this.lastWidth != width || this.lastHeight != height) {
            return false;
        }
        if (Math.abs(this.lastRenderedBlurOffset - this.blurOffset) > 0.001f) {
            return false;
        }
        if (menuPanel.getOpenProgress() > 0.98f) {
            return true;
        }
        return System.nanoTime() - this.lastRefreshNanos < 8000000L;
    }

    private void draw() {
        Framebuffer dst;
        Framebuffer src;
        int i2;
        int framebufferWidth = mc.getWindow().getFramebufferWidth();
        int framebufferHeight = mc.getWindow().getFramebufferHeight();
        int width = Math.max(1, framebufferWidth / 4);
        int height = Math.max(1, framebufferHeight / 4);
        if (buffer1 == null || buffer2 == null || this.lastWidth != width || this.lastHeight != height) {
            if (buffer1 != null) {
                buffer1.delete();
            }
            if (buffer2 != null) {
                buffer2.delete();
            }
            buffer1 = new SimpleFramebuffer(width, height, false);
            buffer2 = new SimpleFramebuffer(width, height, false);
            this.setLinearFiltering(buffer1);
            this.setLinearFiltering(buffer2);
            this.lastWidth = width;
            this.lastHeight = height;
        }
        RenderSystem.disableBlend();
        ShaderProgram kawaseDown = mc.getShaderLoader().getOrCreateProgram(ShaderUtils.kawaseDown);
        ShaderProgram kawaseUp = mc.getShaderLoader().getOrCreateProgram(ShaderUtils.kawaseUp);
        int[] scissor = this.getClickGuiScissor(width, height);
        boolean restoreScissor = GL11.glIsEnabled((int)3089);
        if (scissor != null) {
            GL11.glEnable((int)3089);
            GL11.glScissor((int)scissor[0], (int)scissor[1], (int)scissor[2], (int)scissor[3]);
        }
        buffer1.beginWrite(true);
        RenderSystem.setShader((ShaderProgramKey)ShaderUtils.kawaseDown);
        mc.getFramebuffer().beginRead();
        RenderSystem.setShaderTexture((int)0, (int)mc.getFramebuffer().getColorAttachment());
        this.setKawaseUniforms(kawaseDown, width, height, this.blurOffset * 0.5f / 3.0f);
        this.drawQuad(mc.getWindow().getScaledWidth(), mc.getWindow().getScaledHeight());
        mc.getFramebuffer().endRead();
        buffer1.endWrite();
        Framebuffer current = buffer1;
        for (i2 = 1; i2 < 3; ++i2) {
            src = current;
            dst = current == buffer1 ? buffer2 : buffer1;
            dst.beginWrite(true);
            RenderSystem.setShader((ShaderProgramKey)ShaderUtils.kawaseDown);
            src.beginRead();
            RenderSystem.setShaderTexture((int)0, (int)src.getColorAttachment());
            float downOffset = this.blurOffset * ((float)i2 + 0.5f) / 3.0f;
            this.setKawaseUniforms(kawaseDown, src.textureWidth, src.textureHeight, downOffset);
            this.drawQuad(mc.getWindow().getScaledWidth(), mc.getWindow().getScaledHeight());
            src.endRead();
            dst.endWrite();
            current = dst;
        }
        for (i2 = 0; i2 < 3; ++i2) {
            src = current;
            dst = current == buffer1 ? buffer2 : buffer1;
            dst.beginWrite(true);
            RenderSystem.setShader((ShaderProgramKey)ShaderUtils.kawaseUp);
            src.beginRead();
            RenderSystem.setShaderTexture((int)0, (int)src.getColorAttachment());
            float upOffset = this.blurOffset * ((float)(3 - i2) - 0.5f) / 3.0f;
            this.setKawaseUniforms(kawaseUp, src.textureWidth, src.textureHeight, upOffset);
            this.drawQuad(mc.getWindow().getScaledWidth(), mc.getWindow().getScaledHeight());
            src.endRead();
            dst.endWrite();
            current = dst;
        }
        blurredBuffer = current;
        if (scissor != null && !restoreScissor) {
            GL11.glDisable((int)3089);
        }
        RenderSystem.disableBlend();
        mc.getFramebuffer().beginWrite(true);
        RenderSystem.setShaderTexture((int)0, (int)0);
    }

    private int[] getClickGuiScissor(int width, int height) {
        Screen class_4372 = BlurProgram.mc.currentScreen;
        if (class_4372 instanceof MenuPanel) {
            MenuPanel menuPanel = (MenuPanel)class_4372;
            return menuPanel.getClickGuiBlurScissor(width, height, 4);
        }
        return null;
    }

    private void setLinearFiltering(Framebuffer framebuffer) {
        RenderSystem.bindTexture((int)framebuffer.getColorAttachment());
        GL30.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL30.glTexParameteri((int)3553, (int)10240, (int)9729);
        RenderSystem.bindTexture((int)0);
    }

    private void setKawaseUniforms(ShaderProgram shader, int texWidth, int texHeight, float offset) {
        GlUniform resolutionUniform = shader.getUniform("Resolution");
        GlUniform offsetUniform = shader.getUniform("Offset");
        GlUniform saturationUniform = shader.getUniform("Saturation");
        GlUniform tintIntensityUniform = shader.getUniform("TintIntensity");
        GlUniform tintColorUniform = shader.getUniform("TintColor");
        if (resolutionUniform != null) {
            resolutionUniform.set(1.0f / (float)texWidth, 1.0f / (float)texHeight);
        }
        if (offsetUniform != null) {
            offsetUniform.set(offset);
        }
        if (saturationUniform != null) {
            saturationUniform.set(1.0f);
        }
        if (tintIntensityUniform != null) {
            tintIntensityUniform.set(0.0f);
        }
        if (tintColorUniform != null) {
            tintColorUniform.set(1.0f, 1.0f, 1.0f);
        }
    }

    private void drawQuad(float width, float height) {
        BufferBuilder builder = Tessellator.getInstance().begin(VertexFormat.class_5596.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        builder.vertex(0.0f, 0.0f, 0.0f).texture(0.0f, 1.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        builder.vertex(0.0f, height, 0.0f).texture(0.0f, 0.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        builder.vertex(width, height, 0.0f).texture(1.0f, 0.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        builder.vertex(width, 0.0f, 0.0f).texture(1.0f, 1.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)builder.end());
    }

    public static int getTexture() {
        BlurProgram.getInstance().request();
        return blurredBuffer != null ? blurredBuffer.getColorAttachment() : (buffer1 != null ? buffer1.getColorAttachment() : 0);
    }

    @Generated
    public static Framebuffer getBuffer1() {
        return buffer1;
    }

    @Generated
    public static Framebuffer getBuffer2() {
        return buffer2;
    }

    @Generated
    public void setBlurOffset(float blurOffset) {
        this.blurOffset = blurOffset;
    }
}