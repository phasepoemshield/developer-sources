package fun.wonderful.api.utils.render.hands;

import com.mojang.blaze3d.systems.RenderSystem;
import fun.wonderful.Wonderful;
import fun.wonderful.api.QClient;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.render.ShaderUtils;
import fun.wonderful.client.modules.impl.render.ShaderHands;
import net.minecraft.client.gl.ShaderProgramKey;
import com.mojang.blaze3d.systems.ProjectionType;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.GlUniform;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.render.BuiltBuffer;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public class ShaderHandsRenderer
implements QClient {
    private static ShaderHandsRenderer instance;
    private Framebuffer beforeBuffer;
    private Framebuffer afterBuffer;
    private Framebuffer maskBuffer;
    private Framebuffer trailPrevBuffer;
    private Framebuffer trailCurrBuffer;
    private int width = -1;
    private int height = -1;
    private boolean hasBeforeCapture;
    private boolean pendingComposite;
    private int configuredBeforeDepthTex = -1;
    private int configuredAfterDepthTex = -1;
    private final Matrix4f savedProj = new Matrix4f();
    private final Matrix4f ortho = new Matrix4f();
    private float previousSwingProgress;
    private float previousYaw;
    private float previousPitch;

    public static ShaderHandsRenderer getInstance() {
        if (instance == null) {
            instance = new ShaderHandsRenderer();
        }
        return instance;
    }

    public void captureBeforeHands() {
        ShaderHands module = this.getModule();
        if (!this.isEffectEnabled(module)) {
            this.clearPersistentState();
            return;
        }
        this.ensureBuffers();
        if (this.beforeBuffer == null) {
            return;
        }
        this.copyMainFramebuffer(this.beforeBuffer);
        this.hasBeforeCapture = true;
    }

    public void captureAfterHands() {
        ShaderHands module = this.getModule();
        if (!this.isEffectEnabled(module)) {
            this.clearPersistentState();
            return;
        }
        this.ensureBuffers();
        if (this.beforeBuffer == null || this.afterBuffer == null || this.maskBuffer == null) {
            return;
        }
        if (!this.hasBeforeCapture) {
            return;
        }
        this.copyMainFramebuffer(this.afterBuffer);
        this.pendingComposite = true;
    }

    public void renderOverlayIfPending() {
        if (!this.pendingComposite) {
            return;
        }
        this.ensureBuffers();
        if (this.beforeBuffer == null || this.afterBuffer == null || this.maskBuffer == null) {
            return;
        }
        ShaderHands module = this.getModule();
        if (!this.isEffectEnabled(module)) {
            this.clearPersistentState();
            return;
        }
        ShaderProgram maskShader = mc.getShaderLoader().getOrCreateProgram(ShaderUtils.shaderHandsMaskDiff);
        if (maskShader == null) {
            this.clearPersistentState();
            return;
        }
        this.savedProj.set((Matrix4fc)RenderSystem.getProjectionMatrix());
        ProjectionType savedType = RenderSystem.getProjectionType();
        Matrix4fStack modelViewStack = RenderSystem.getModelViewStack();
        modelViewStack.pushMatrix();
        modelViewStack.identity();
        this.setFramebufferProjection(this.width, this.height);
        try {
            this.maskBuffer.setClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            this.maskBuffer.clear();
            this.maskBuffer.beginWrite(false);
            RenderSystem.disableDepthTest();
            RenderSystem.disableBlend();
            RenderSystem.setShader((ShaderProgramKey)ShaderUtils.shaderHandsMaskDiff);
            RenderSystem.setShaderTexture((int)0, (int)this.beforeBuffer.getColorAttachment());
            RenderSystem.setShaderTexture((int)1, (int)this.afterBuffer.getColorAttachment());
            int beforeDepth = this.beforeBuffer.getDepthAttachment();
            int afterDepth = this.afterBuffer.getDepthAttachment();
            if (beforeDepth != 0 && beforeDepth != this.configuredBeforeDepthTex) {
                this.configureDepthTexture(beforeDepth);
                this.configuredBeforeDepthTex = beforeDepth;
            }
            if (afterDepth != 0 && afterDepth != this.configuredAfterDepthTex) {
                this.configureDepthTexture(afterDepth);
                this.configuredAfterDepthTex = afterDepth;
            }
            RenderSystem.setShaderTexture((int)2, (int)beforeDepth);
            RenderSystem.setShaderTexture((int)3, (int)afterDepth);
            this.setUniform(maskShader, "texelSize", 1.0f / (float)Math.max(1, this.width), 1.0f / (float)Math.max(1, this.height));
            this.drawFullscreenQuad();
            RenderSystem.enableDepthTest();
            int color1 = Wonderful.INSTANCE.themeStorage.getThemes().getTheme().getName().equals("Rainbow") ? ColorUtils.getThemeColor(0) : Wonderful.INSTANCE.themeStorage.getThemes().getTheme().color[0];
            int color2 = ColorUtils.getThemeColor(180);
            if (module.isOutline()) {
                this.renderFireMode(module, color1, color2);
                this.clearTrailBuffers();
            }
            if (module.mode.is("Трейл")) {
                this.updateTrailBuffers(module);
                this.renderTrailMode(module, color1, color2);
            } else {
                this.renderBaseMode(module, color1, color2);
            }
        }
        finally {
            this.restoreCompositeState();
            modelViewStack.popMatrix();
            RenderSystem.setProjectionMatrix((Matrix4f)this.savedProj, (ProjectionType)savedType);
            this.invalidateFrameState();
        }
    }

    public void clearPersistentState() {
        this.invalidateFrameState();
        this.clearTrailBuffers();
        this.previousSwingProgress = 0.0f;
        this.previousYaw = 0.0f;
        this.previousPitch = 0.0f;
    }

    private void invalidateFrameState() {
        this.hasBeforeCapture = false;
        this.pendingComposite = false;
        this.configuredBeforeDepthTex = -1;
        this.configuredAfterDepthTex = -1;
    }

    private void copyMainFramebuffer(Framebuffer target) {
        int readFbo = GL11.glGetInteger((int)36010);
        int drawFbo = GL11.glGetInteger((int)36006);
        GL30.glBindFramebuffer((int)36008, (int)ShaderHandsRenderer.mc.getFramebuffer().fbo);
        GL30.glBindFramebuffer((int)36009, (int)target.fbo);
        GL30.glBlitFramebuffer((int)0, (int)0, (int)this.width, (int)this.height, (int)0, (int)0, (int)this.width, (int)this.height, (int)16640, (int)9728);
        GL30.glBindFramebuffer((int)36008, (int)readFbo);
        GL30.glBindFramebuffer((int)36009, (int)drawFbo);
        mc.getFramebuffer().beginWrite(true);
    }

    private void configureDepthTexture(int depthTex) {
        RenderSystem.bindTexture((int)depthTex);
        GL11.glTexParameteri((int)3553, (int)34892, (int)0);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        RenderSystem.bindTexture((int)0);
    }

    private void ensureBuffers() {
        int w2 = mc.getWindow().getFramebufferWidth();
        int h2 = mc.getWindow().getFramebufferHeight();
        if (w2 == this.width && h2 == this.height && this.beforeBuffer != null && this.afterBuffer != null && this.maskBuffer != null && this.trailPrevBuffer != null && this.trailCurrBuffer != null) {
            return;
        }
        this.deleteBuffer(this.beforeBuffer);
        this.deleteBuffer(this.afterBuffer);
        this.deleteBuffer(this.maskBuffer);
        this.deleteBuffer(this.trailPrevBuffer);
        this.deleteBuffer(this.trailCurrBuffer);
        this.beforeBuffer = new SimpleFramebuffer(w2, h2, true);
        this.afterBuffer = new SimpleFramebuffer(w2, h2, true);
        this.maskBuffer = new SimpleFramebuffer(w2, h2, true);
        this.trailPrevBuffer = new SimpleFramebuffer(w2, h2, false);
        this.trailCurrBuffer = new SimpleFramebuffer(w2, h2, false);
        this.configureColorTexture(this.beforeBuffer);
        this.configureColorTexture(this.afterBuffer);
        this.configureColorTexture(this.maskBuffer);
        this.configureColorTexture(this.trailPrevBuffer);
        this.configureColorTexture(this.trailCurrBuffer);
        this.width = w2;
        this.height = h2;
        this.configuredBeforeDepthTex = -1;
        this.configuredAfterDepthTex = -1;
        this.clearTrailBuffers();
    }

    private void updateTrailBuffers(ShaderHands module) {
        if (this.trailPrevBuffer == null || this.trailCurrBuffer == null) {
            return;
        }
        float tickDelta = mc.getRenderTickCounter().getTickDelta(true);
        float swing = ShaderHandsRenderer.mc.player != null ? ShaderHandsRenderer.mc.player.getHandSwingProgress(tickDelta) : 0.0f;
        float decay = 0.955f - swing * 0.03f;
        float inject = 0.11f + swing * 0.29f;
        ShaderProgram overlayShader = mc.getShaderLoader().getOrCreateProgram(ShaderUtils.shaderHandsOverlay);
        if (overlayShader == null) {
            return;
        }
        this.trailCurrBuffer.setClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        this.trailCurrBuffer.clear();
        this.trailCurrBuffer.beginWrite(false);
        RenderSystem.disableDepthTest();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader((ShaderProgramKey)ShaderUtils.shaderHandsOverlay);
        RenderSystem.setShaderTexture((int)0, (int)this.trailPrevBuffer.getColorAttachment());
        this.setUniform(overlayShader, "color", 1.0f, 1.0f, 1.0f);
        this.setUniform(overlayShader, "fill", 1.0f);
        this.setUniform(overlayShader, "alpha", decay);
        this.drawFullscreenQuad();
        RenderSystem.setShaderTexture((int)0, (int)this.maskBuffer.getColorAttachment());
        this.setUniform(overlayShader, "alpha", inject * Math.max(0.35f, module.fillAlpha.get()));
        this.drawFullscreenQuad();
        RenderSystem.disableBlend();
        RenderSystem.enableDepthTest();
        mc.getFramebuffer().beginWrite(true);
        Framebuffer swap = this.trailPrevBuffer;
        this.trailPrevBuffer = this.trailCurrBuffer;
        this.trailCurrBuffer = swap;
    }

    private void renderTrailMode(ShaderHands module, int color1, int color2) {
        float tickDelta = mc.getRenderTickCounter().getTickDelta(true);
        float swing = ShaderHandsRenderer.mc.player != null ? ShaderHandsRenderer.mc.player.getHandSwingProgress(tickDelta) : 0.0f;
        ShaderProgram overlayShader = mc.getShaderLoader().getOrCreateProgram(ShaderUtils.shaderHandsOverlay);
        if (overlayShader == null || this.trailPrevBuffer == null) {
            return;
        }
        float sw = Math.max(this.width, 1);
        float sh = Math.max(this.height, 1);
        float pivotX = sw * 0.72f;
        float pivotY = sh * 0.72f;
        float t2 = (float)(System.currentTimeMillis() % 100000L) / 1000.0f;
        mc.getFramebuffer().beginWrite(false);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableDepthTest();
        RenderSystem.setShader((ShaderProgramKey)ShaderUtils.shaderHandsOverlay);
        this.setUniform(overlayShader, "fill", 1.0f);
        float idleSpread = 10.0f + module.waveScale.get() * 4.0f;
        for (int i2 = 0; i2 < 4; ++i2) {
            float index = (float)i2 / 3.0f;
            float dx = (float)Math.cos(t2 * module.waveSpeed.get() * 1.35f + (float)i2 * 0.75f) * idleSpread * (0.45f + index * 0.35f);
            float dy = 10.0f + index * (12.0f + module.waveScale.get() * 5.0f) + (float)Math.sin(t2 * module.waveSpeed.get() * 1.1f + (float)i2 * 0.65f) * 3.5f;
            float rotation = -7.0f + (float)i2 * 5.0f + (float)Math.sin(t2 * 1.4f + (float)i2) * 4.0f;
            float scale = 1.04f + index * 0.11f;
            float copyAlpha = module.fillAlpha.get() * (0.16f - index * 0.028f);
            int copyColor = ColorUtils.interpolateColor(color1, color2, index);
            RenderSystem.setShaderTexture((int)0, (int)this.maskBuffer.getColorAttachment());
            this.setUniform(overlayShader, "color", ColorUtils.redf(copyColor), ColorUtils.greenf(copyColor), ColorUtils.bluef(copyColor));
            this.setUniform(overlayShader, "alpha", copyAlpha);
            this.drawTransformedScreenQuad(pivotX, pivotY, dx, dy, scale, scale, rotation);
        }
        float hitStrength = 0.22f + swing * 0.78f;
        float hitReach = 18.0f + swing * (34.0f + module.waveScale.get() * 8.0f);
        for (int i3 = 0; i3 < 6; ++i3) {
            float index = (float)i3 / 5.0f;
            float dx = hitReach * index * (0.55f + swing * 0.32f);
            float dy = 12.0f + hitReach * index * 0.48f;
            dx += (float)Math.sin(t2 * module.waveSpeed.get() * 1.9f + (float)i3 * 0.8f) * (2.0f + swing * 4.0f);
            dy += (float)Math.cos(t2 * module.waveSpeed.get() * 1.6f + (float)i3 * 0.6f) * (1.4f + swing * 2.8f);
            float rotation = -10.0f + index * (16.0f + swing * 24.0f);
            float scale = 1.06f + index * (0.22f + swing * 0.1f);
            float copyAlpha = module.fillAlpha.get() * hitStrength * (0.16f - index * 0.02f);
            int copyColor = ColorUtils.interpolateColor(color1, color2, index);
            RenderSystem.setShaderTexture((int)0, (int)this.trailPrevBuffer.getColorAttachment());
            this.setUniform(overlayShader, "color", ColorUtils.redf(copyColor), ColorUtils.greenf(copyColor), ColorUtils.bluef(copyColor));
            this.setUniform(overlayShader, "alpha", copyAlpha);
            this.drawTransformedScreenQuad(pivotX, pivotY, dx, dy, scale, scale, rotation);
        }
        RenderSystem.setShaderTexture((int)0, (int)this.trailPrevBuffer.getColorAttachment());
        int glowColor = ColorUtils.interpolateColor(color1, color2, 0.5f);
        this.setUniform(overlayShader, "color", ColorUtils.redf(glowColor), ColorUtils.greenf(glowColor), ColorUtils.bluef(glowColor));
        this.setUniform(overlayShader, "alpha", module.fillAlpha.get() * (0.05f + swing * 0.07f));
        this.drawTransformedScreenQuad(pivotX, pivotY, 8.0f + swing * 12.0f, 16.0f + swing * 18.0f, 1.28f + swing * 0.12f, 1.24f + swing * 0.16f, 5.0f + swing * 8.0f);
        this.restoreCompositeState();
    }

    private void renderFireMode(ShaderHands module, int color1, int color2) {
        if (this.afterBuffer == null || this.trailPrevBuffer == null || this.trailCurrBuffer == null) {
            return;
        }
        ShaderProgram shader = mc.getShaderLoader().getOrCreateProgram(ShaderUtils.shaderHandsFire);
        if (shader == null) {
            return;
        }
        float[] motion = this.computeFireMotion();
        int baseColor = ColorUtils.interpolateColor(color1, color2, 0.35f);
        float red = ColorUtils.redf(baseColor);
        float green = ColorUtils.greenf(baseColor);
        float blue = ColorUtils.bluef(baseColor);
        this.renderFirePass(shader, module, this.afterBuffer, this.trailPrevBuffer, this.trailCurrBuffer, motion, false, red, green, blue);
        this.renderFirePass(shader, module, this.afterBuffer, this.trailCurrBuffer, mc.getFramebuffer(), motion, true, red, green, blue);
        Framebuffer swap = this.trailPrevBuffer;
        this.trailPrevBuffer = this.trailCurrBuffer;
        this.trailCurrBuffer = swap;
    }

    private void renderFirePass(ShaderProgram shader, ShaderHands module, Framebuffer sceneFramebuffer, Framebuffer historyFramebuffer, Framebuffer targetFramebuffer, float[] motion, boolean compositeToScene, float red, float green, float blue) {
        targetFramebuffer.beginWrite(false);
        if (!compositeToScene) {
            targetFramebuffer.setClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            targetFramebuffer.clear();
        }
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableCull();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader((ShaderProgramKey)ShaderUtils.shaderHandsFire);
        RenderSystem.setShaderTexture((int)0, (int)sceneFramebuffer.getColorAttachment());
        RenderSystem.setShaderTexture((int)1, (int)sceneFramebuffer.getDepthAttachment());
        RenderSystem.setShaderTexture((int)2, (int)historyFramebuffer.getColorAttachment());
        this.setUniform(shader, "time", (float)(System.currentTimeMillis() % 1000000L) / 1000.0f);
        this.setUniform(shader, "screenSize", this.width, this.height);
        this.setUniform(shader, "baseColor", red, green, blue, 1.0f);
        this.setUniform(shader, "motionVec", motion[0], motion[1]);
        this.setUniform(shader, "effectAlpha", module.fireAlpha.get() * 2.0f);
        this.setUniform(shader, "flameSpeed", module.fireSpeed.get());
        this.setUniform(shader, "flameRadius", module.fireRadius.get());
        this.setUniform(shader, "driftScale", 0.0f);
        this.setUniform(shader, "trailDecay", 0.88f);
        this.setUniform(shader, "trailStrength", 0.9f);
        this.setUniform(shader, "fireOnItem", 0.0f);
        this.setUniform(shader, "composeMode", compositeToScene ? 1.0f : 0.0f);
        this.drawFullscreenQuad();
    }

    private float[] computeFireMotion() {
        if (ShaderHandsRenderer.mc.player == null) {
            return new float[]{0.0f, 0.0f};
        }
        float tickDelta = mc.getRenderTickCounter().getTickDelta(true);
        float currentSwing = ShaderHandsRenderer.mc.player.getHandSwingProgress(tickDelta);
        float currentYaw = ShaderHandsRenderer.mc.player.getYaw();
        float currentPitch = ShaderHandsRenderer.mc.player.getPitch();
        float swingDelta = currentSwing - this.previousSwingProgress;
        float yawDelta = MathHelper.wrapDegrees((float)(currentYaw - this.previousYaw));
        float pitchDelta = currentPitch - this.previousPitch;
        this.previousSwingProgress = currentSwing;
        this.previousYaw = currentYaw;
        this.previousPitch = currentPitch;
        float yawTerm = Math.abs(yawDelta) > 0.35f ? yawDelta * 0.003f : 0.0f;
        float pitchTerm = Math.abs(pitchDelta) > 0.35f ? -pitchDelta * 0.0025f : 0.0f;
        float motionX = MathHelper.clamp((float)(yawTerm + swingDelta * 0.9f), (float)-2.0f, (float)2.0f);
        float motionY = MathHelper.clamp((float)(pitchTerm + swingDelta * 0.2f), (float)-2.0f, (float)2.0f);
        return new float[]{motionX, motionY};
    }

    private void renderBaseMode(ShaderHands module, int color1, int color2) {
        boolean warpMode = module.mode.is("Варп");
        ShaderProgram shader = mc.getShaderLoader().getOrCreateProgram(warpMode ? ShaderUtils.blockOverlayWarp : ShaderUtils.blockOverlayWorld);
        if (shader == null) {
            return;
        }
        mc.getFramebuffer().beginWrite(false);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableDepthTest();
        RenderSystem.setShader((ShaderProgramKey)(warpMode ? ShaderUtils.blockOverlayWarp : ShaderUtils.blockOverlayWorld));
        RenderSystem.setShaderTexture((int)0, (int)this.maskBuffer.getColorAttachment());
        this.setUniform(shader, "texelSize", 1.0f / (float)Math.max(1, this.width), 1.0f / (float)Math.max(1, this.height));
        this.setUniform(shader, "color", ColorUtils.redf(color1), ColorUtils.greenf(color1), ColorUtils.bluef(color1));
        this.setUniform(shader, "color2", ColorUtils.redf(color2), ColorUtils.greenf(color2), ColorUtils.bluef(color2));
        this.setUniform(shader, "time", (float)(System.currentTimeMillis() % 100000L) / 1000.0f);
        this.setUniform(shader, "speed", warpMode ? module.waveSpeed.get() * 4.0f : module.waveSpeed.get());
        this.setUniform(shader, "scale", module.waveScale.get());
        this.setUniform(shader, "outline", 0.0f);
        this.setUniform(shader, "glow", 0.0f);
        this.setUniform(shader, "fill", module.fillAlpha.get());
        this.setUniform(shader, "alpha", module.fillAlpha.get());
        this.setUniform(shader, "outlineOnly", 0.0f);
        this.drawFullscreenQuad();
        this.restoreCompositeState();
    }

    private void restoreCompositeState() {
        int w2 = mc.getWindow().getFramebufferWidth();
        int h2 = mc.getWindow().getFramebufferHeight();
        GL11.glViewport((int)0, (int)0, (int)w2, (int)h2);
        for (int i2 = 0; i2 < 8; ++i2) {
            RenderSystem.setShaderTexture((int)i2, (int)0);
        }
        RenderSystem.colorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        mc.getFramebuffer().beginWrite(true);
    }

    private void configureColorTexture(Framebuffer framebuffer) {
        if (framebuffer == null) {
            return;
        }
        int prevTex = GL11.glGetInteger((int)32873);
        GL11.glBindTexture((int)3553, (int)framebuffer.getColorAttachment());
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10242, (int)33071);
        GL11.glTexParameteri((int)3553, (int)10243, (int)33071);
        GL11.glBindTexture((int)3553, (int)prevTex);
    }

    private void setFramebufferProjection(int w2, int h2) {
        GL11.glViewport((int)0, (int)0, (int)w2, (int)h2);
        this.ortho.identity().setOrtho(0.0f, (float)w2, (float)h2, 0.0f, -1.0f, 1.0f);
        RenderSystem.setProjectionMatrix((Matrix4f)this.ortho, (ProjectionType)ProjectionType.ORTHOGRAPHIC);
    }

    private void clearTrailBuffers() {
        this.clearFramebuffer(this.trailPrevBuffer);
        this.clearFramebuffer(this.trailCurrBuffer);
    }

    private void clearFramebuffer(Framebuffer framebuffer) {
        if (framebuffer == null) {
            return;
        }
        framebuffer.setClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        framebuffer.clear();
        mc.getFramebuffer().beginWrite(true);
    }

    private void deleteBuffer(Framebuffer framebuffer) {
        if (framebuffer != null) {
            framebuffer.delete();
        }
    }

    private ShaderHands getModule() {
        if (Wonderful.INSTANCE == null || ModuleClass.INSTANCE == null) {
            return null;
        }
        return ModuleClass.shaderHands;
    }

    private boolean isEffectEnabled(ShaderHands module) {
        return module != null && module.isEnable();
    }

    private void setUniform(ShaderProgram shader, String name, float v2) {
        GlUniform uniform = shader.getUniform(name);
        if (uniform != null) {
            uniform.set(v2);
        }
    }

    private void setUniform(ShaderProgram shader, String name, float x2, float y2) {
        GlUniform uniform = shader.getUniform(name);
        if (uniform != null) {
            uniform.set(x2, y2);
        }
    }

    private void setUniform(ShaderProgram shader, String name, float x2, float y2, float z2) {
        GlUniform uniform = shader.getUniform(name);
        if (uniform != null) {
            uniform.set(x2, y2, z2);
        }
    }

    private void setUniform(ShaderProgram shader, String name, float x2, float y2, float z2, float w2) {
        GlUniform uniform = shader.getUniform(name);
        if (uniform != null) {
            uniform.set(x2, y2, z2, w2);
        }
    }

    private void drawFullscreenQuad() {
        float sw = Math.max(this.width, 1);
        float sh = Math.max(this.height, 1);
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.class_5596.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        buffer.vertex(0.0f, 0.0f, 0.0f).texture(0.0f, 1.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        buffer.vertex(0.0f, sh, 0.0f).texture(0.0f, 0.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        buffer.vertex(sw, sh, 0.0f).texture(1.0f, 0.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        buffer.vertex(sw, 0.0f, 0.0f).texture(1.0f, 1.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
    }

    private void drawTransformedScreenQuad(float pivotX, float pivotY, float dx, float dy, float scaleX, float scaleY, float rotationDeg) {
        float sw = Math.max(this.width, 1);
        float sh = Math.max(this.height, 1);
        float rad = (float)Math.toRadians(rotationDeg);
        float cos = (float)Math.cos(rad);
        float sin = (float)Math.sin(rad);
        float[][] positions = new float[][]{{0.0f, 0.0f, 0.0f, 1.0f}, {0.0f, sh, 0.0f, 0.0f}, {sw, sh, 1.0f, 0.0f}, {sw, 0.0f, 1.0f, 1.0f}};
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.class_5596.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        for (float[] pos : positions) {
            float x2 = pos[0] - pivotX;
            float y2 = pos[1] - pivotY;
            float rx = (x2 *= scaleX) * cos - (y2 *= scaleY) * sin;
            float ry = x2 * sin + y2 * cos;
            buffer.vertex(rx + pivotX + dx, ry + pivotY + dy, 0.0f).texture(pos[2], pos[3]).color(1.0f, 1.0f, 1.0f, 1.0f);
        }
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
    }
}