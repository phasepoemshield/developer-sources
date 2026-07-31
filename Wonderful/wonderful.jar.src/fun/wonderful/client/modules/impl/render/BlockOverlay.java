package fun.wonderful.client.modules.impl.render;

import com.mojang.blaze3d.systems.RenderSystem;
import fun.wonderful.Wonderful;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.Event3DRender;
import fun.wonderful.api.events.implement.EventRender;
import fun.wonderful.api.storages.implement.helpertstorages.Theme;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.render.ShaderUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.world.BlockView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.GlUniform;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.render.BuiltBuffer;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public class BlockOverlay
extends Module {
    public static BlockOverlay INSTANCE = new BlockOverlay();
    private final ModeSetting mode = new ModeSetting("Режим", "Аврора", "Аврора", "Варп");
    private final FloatSetting waveSpeed = new FloatSetting("Скорость волн", 1.2f, 0.1f, 5.0f, 0.1f);
    private final FloatSetting waveScale = new FloatSetting("Частота волн", 1.0f, 1.0f, 3.0f, 0.1f);
    private final FloatSetting fillAlpha = new FloatSetting("Заливка", 1.0f, 0.0f, 1.0f, 0.01f);
    private final FloatSetting outlineWidth = new FloatSetting("Обводка", 1.1f, 0.0f, 5.0f, 0.1f);
    private Framebuffer maskBuffer;
    private int fbWidth = -1;
    private int fbHeight = -1;
    private boolean hasMask;
    private boolean pendingComposite;
    private BlockPos lastBlockPos;
    private Box displayBox;
    private Box targetBox;
    private int cachedThemeColor1 = -1;
    private int cachedThemeColor2 = -1;
    private final Matrix4f cameraViewProj = new Matrix4f();
    private final Matrix4f invViewProj = new Matrix4f();
    private Vec3d savedCameraPos = Vec3d.ZERO;
    private int configuredMaskDepthTex = -1;

    public BlockOverlay() {
        super("BlockOverlay", "Красивая заливка на блок", Module.ModuleCategory.RENDER);
        this.addSettings(this.mode, this.waveSpeed, this.waveScale, this.fillAlpha, this.outlineWidth);
    }

    @Override
    public void onDisable() {
        this.hasMask = false;
        this.pendingComposite = false;
        this.lastBlockPos = null;
        this.displayBox = null;
        this.targetBox = null;
        if (this.maskBuffer != null) {
            this.maskBuffer.delete();
            this.maskBuffer = null;
        }
        this.fbWidth = -1;
        this.fbHeight = -1;
        super.onDisable();
    }

    @EventLink(priority=-100)
    public void onRender3D(Event3DRender event) {
        if (mc == null || BlockOverlay.mc.world == null || BlockOverlay.mc.player == null) {
            return;
        }
        Box worldBox = this.getTargetedBlockBox();
        if (worldBox == null) {
            this.hasMask = false;
            this.pendingComposite = false;
            this.lastBlockPos = null;
            this.displayBox = null;
            this.targetBox = null;
            return;
        }
        if (this.displayBox == null || this.targetBox == null || this.lastBlockPos == null) {
            this.displayBox = worldBox;
            this.targetBox = worldBox;
        } else {
            this.targetBox = worldBox;
            this.displayBox = this.lerpBox(this.displayBox, this.targetBox, 0.24f);
        }
        this.lastBlockPos = BlockPos.ofFloored((double)worldBox.minX, (double)worldBox.minY, (double)worldBox.minZ);
        this.updateCachedThemeColors();
        this.ensureMaskBuffer();
        if (this.maskBuffer == null) {
            return;
        }
        Vec3d cam = event.getCamera().getPos();
        Box localBox = this.displayBox.offset(-cam.x, -cam.y, -cam.z);
        Matrix4f matrix = event.getMatrices().peek().getPositionMatrix();
        this.savedCameraPos = cam;
        this.cameraViewProj.set((Matrix4fc)event.getProjectionMatrix()).mul((Matrix4fc)event.getPositionMatrix());
        this.hasMask = true;
        this.pendingComposite = true;
        this.maskBuffer.setClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        this.maskBuffer.clear();
        this.copyMainDepthToMask();
        this.maskBuffer.beginWrite(false);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_COLOR);
        this.drawMaskBox(matrix, localBox);
        RenderSystem.depthMask((boolean)true);
        RenderSystem.disableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
        mc.getFramebuffer().beginWrite(true);
    }

    @EventLink(priority=199)
    public void onRender2D(EventRender.Default event) {
        this.renderOverlayIfPending();
    }

    public void renderOverlayIfPending() {
        if (!this.pendingComposite || !this.hasMask || this.maskBuffer == null) {
            return;
        }
        boolean auroraMode = this.mode.is("Аврора");
        boolean warpMode = this.mode.is("Варп");
        ShaderProgram shader = mc.getShaderLoader().getOrCreateProgram(auroraMode ? ShaderUtils.blockOverlayWorld : ShaderUtils.blockOverlayWarp);
        if (shader == null) {
            this.pendingComposite = false;
            return;
        }
        mc.getFramebuffer().beginWrite(false);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableDepthTest();
        RenderSystem.setShader((ShaderProgramKey)(auroraMode ? ShaderUtils.blockOverlayWorld : ShaderUtils.blockOverlayWarp));
        RenderSystem.setShaderTexture((int)0, (int)this.maskBuffer.getColorAttachment());
        int maskDepth = this.maskBuffer.getDepthAttachment();
        if (maskDepth == 0) {
            this.pendingComposite = false;
            this.restoreCompositeState();
            return;
        }
        if (maskDepth != this.configuredMaskDepthTex) {
            int prevTex = GL11.glGetInteger((int)32873);
            GL11.glBindTexture((int)3553, (int)maskDepth);
            GL11.glTexParameteri((int)3553, (int)34892, (int)0);
            GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
            GL11.glBindTexture((int)3553, (int)prevTex);
            this.configuredMaskDepthTex = maskDepth;
        }
        RenderSystem.setShaderTexture((int)1, (int)maskDepth);
        this.setUniform(shader, "texelSize", 1.0f / (float)Math.max(1, mc.getWindow().getFramebufferWidth()), 1.0f / (float)Math.max(1, mc.getWindow().getFramebufferHeight()));
        this.setUniform(shader, "color", ColorUtils.redf(this.cachedThemeColor1), ColorUtils.greenf(this.cachedThemeColor1), ColorUtils.bluef(this.cachedThemeColor1));
        this.setUniform(shader, "color2", ColorUtils.redf(this.cachedThemeColor2), ColorUtils.greenf(this.cachedThemeColor2), ColorUtils.bluef(this.cachedThemeColor2));
        this.setUniform(shader, "time", (float)(System.currentTimeMillis() % 100000L) / 1000.0f);
        this.setUniform(shader, "speed", warpMode ? this.waveSpeed.get() * 4.0f : this.waveSpeed.get());
        this.setUniform(shader, "scale", this.waveScale.get());
        this.setUniform(shader, "outline", this.outlineWidth.get());
        this.setUniform(shader, "glow", 0.0f);
        this.setUniform(shader, "fill", this.fillAlpha.get());
        this.setUniform(shader, "alpha", this.fillAlpha.get());
        this.setUniform(shader, "outlineOnly", 0.0f);
        float yawRad = (float)Math.toRadians(-BlockOverlay.mc.gameRenderer.getCamera().getYaw());
        float pitchRad = (float)Math.toRadians(BlockOverlay.mc.gameRenderer.getCamera().getPitch());
        this.setUniform(shader, "CameraDir", yawRad, pitchRad);
        if (this.lastBlockPos != null) {
            this.setUniform(shader, "BlockPos", this.lastBlockPos.getX() & 0xFFF, this.lastBlockPos.getY() & 0xFFF, this.lastBlockPos.getZ() & 0xFFF);
        } else {
            this.setUniform(shader, "BlockPos", 0.0f, 0.0f, 0.0f);
        }
        this.invViewProj.set((Matrix4fc)this.cameraViewProj).invert();
        GlUniform invVP = shader.getUniform("InvViewProj");
        if (invVP != null) {
            invVP.set(this.invViewProj);
        }
        float camX = (float)this.savedCameraPos.x;
        float camY = (float)this.savedCameraPos.y;
        float camZ = (float)this.savedCameraPos.z;
        this.setUniform(shader, "CameraPos", camX, camY, camZ);
        this.drawFullscreenQuad();
        this.restoreCompositeState();
        this.pendingComposite = false;
    }

    private void restoreCompositeState() {
        RenderSystem.colorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.setShaderTexture((int)1, (int)0);
        mc.getFramebuffer().beginWrite(true);
    }

    private void setUniform(ShaderProgram shader, String name, float value) {
        GlUniform uniform = shader.getUniform(name);
        if (uniform != null) {
            uniform.set(value);
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

    private void ensureMaskBuffer() {
        int width = mc.getWindow().getFramebufferWidth();
        int height = mc.getWindow().getFramebufferHeight();
        if (this.maskBuffer == null || this.fbWidth != width || this.fbHeight != height) {
            if (this.maskBuffer != null) {
                this.maskBuffer.delete();
            }
            this.maskBuffer = new SimpleFramebuffer(width, height, true);
            this.fbWidth = width;
            this.fbHeight = height;
            this.configuredMaskDepthTex = -1;
        }
    }

    private Box getTargetedBlockBox() {
        BlockHitResult blockHit;
        block5: {
            block4: {
                HitResult hit = BlockOverlay.mc.crosshairTarget;
                if (!(hit instanceof BlockHitResult)) break block4;
                blockHit = (BlockHitResult)hit;
                if (hit.getType() == HitResult.class_240.BLOCK) break block5;
            }
            return null;
        }
        BlockPos pos = blockHit.getBlockPos();
        if (pos == null || BlockOverlay.mc.world.getBlockState(pos).isAir()) {
            return null;
        }
        VoxelShape shape = BlockOverlay.mc.world.getBlockState(pos).getOutlineShape((BlockView)BlockOverlay.mc.world, pos);
        Box box = shape.isEmpty() ? new Box(pos) : shape.getBoundingBox().offset(pos);
        return box.expand(0.002);
    }

    private Box lerpBox(Box from, Box to, float delta) {
        return new Box(from.minX + (to.minX - from.minX) * (double)delta, from.minY + (to.minY - from.minY) * (double)delta, from.minZ + (to.minZ - from.minZ) * (double)delta, from.maxX + (to.maxX - from.maxX) * (double)delta, from.maxY + (to.maxY - from.maxY) * (double)delta, from.maxZ + (to.maxZ - from.maxZ) * (double)delta);
    }

    private void copyMainDepthToMask() {
        if (this.maskBuffer == null) {
            return;
        }
        int readFbo = GL11.glGetInteger((int)36010);
        int drawFbo = GL11.glGetInteger((int)36006);
        int width = mc.getWindow().getFramebufferWidth();
        int height = mc.getWindow().getFramebufferHeight();
        GL30.glBindFramebuffer((int)36008, (int)BlockOverlay.mc.getFramebuffer().fbo);
        GL30.glBindFramebuffer((int)36009, (int)this.maskBuffer.fbo);
        GL30.glBlitFramebuffer((int)0, (int)0, (int)width, (int)height, (int)0, (int)0, (int)width, (int)height, (int)256, (int)9728);
        GL30.glBindFramebuffer((int)36008, (int)readFbo);
        GL30.glBindFramebuffer((int)36009, (int)drawFbo);
    }

    private void updateCachedThemeColors() {
        int base;
        if (Wonderful.INSTANCE == null || Wonderful.INSTANCE.themeStorage == null || Wonderful.INSTANCE.themeStorage.getThemes() == null) {
            this.cachedThemeColor1 = ColorUtils.getThemeColor(0);
            this.cachedThemeColor2 = ColorUtils.getThemeColor(180);
            return;
        }
        Theme theme = Wonderful.INSTANCE.themeStorage.getThemes().getTheme();
        if (theme == null) {
            this.cachedThemeColor1 = ColorUtils.getThemeColor(0);
            this.cachedThemeColor2 = ColorUtils.getThemeColor(180);
            return;
        }
        if ("Rainbow".equals(theme.getName())) {
            this.cachedThemeColor1 = ColorUtils.getThemeColor(0);
            this.cachedThemeColor2 = ColorUtils.getThemeColor(180);
            return;
        }
        this.cachedThemeColor1 = base = theme.color != null && theme.color.length > 0 ? theme.color[0] : ColorUtils.getThemeColor(0);
        this.cachedThemeColor2 = base;
    }

    private void drawMaskBox(Matrix4f matrix, Box box) {
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.class_5596.QUADS, VertexFormats.POSITION_COLOR);
        int white = -1;
        buffer.vertex(matrix, (float)box.minX, (float)box.minY, (float)box.minZ).color(white);
        buffer.vertex(matrix, (float)box.minX, (float)box.minY, (float)box.maxZ).color(white);
        buffer.vertex(matrix, (float)box.maxX, (float)box.minY, (float)box.maxZ).color(white);
        buffer.vertex(matrix, (float)box.maxX, (float)box.minY, (float)box.minZ).color(white);
        buffer.vertex(matrix, (float)box.minX, (float)box.maxY, (float)box.minZ).color(white);
        buffer.vertex(matrix, (float)box.maxX, (float)box.maxY, (float)box.minZ).color(white);
        buffer.vertex(matrix, (float)box.maxX, (float)box.maxY, (float)box.maxZ).color(white);
        buffer.vertex(matrix, (float)box.minX, (float)box.maxY, (float)box.maxZ).color(white);
        buffer.vertex(matrix, (float)box.minX, (float)box.minY, (float)box.minZ).color(white);
        buffer.vertex(matrix, (float)box.maxX, (float)box.minY, (float)box.minZ).color(white);
        buffer.vertex(matrix, (float)box.maxX, (float)box.maxY, (float)box.minZ).color(white);
        buffer.vertex(matrix, (float)box.minX, (float)box.maxY, (float)box.minZ).color(white);
        buffer.vertex(matrix, (float)box.minX, (float)box.minY, (float)box.maxZ).color(white);
        buffer.vertex(matrix, (float)box.minX, (float)box.maxY, (float)box.maxZ).color(white);
        buffer.vertex(matrix, (float)box.maxX, (float)box.maxY, (float)box.maxZ).color(white);
        buffer.vertex(matrix, (float)box.maxX, (float)box.minY, (float)box.maxZ).color(white);
        buffer.vertex(matrix, (float)box.minX, (float)box.minY, (float)box.minZ).color(white);
        buffer.vertex(matrix, (float)box.minX, (float)box.maxY, (float)box.minZ).color(white);
        buffer.vertex(matrix, (float)box.minX, (float)box.maxY, (float)box.maxZ).color(white);
        buffer.vertex(matrix, (float)box.minX, (float)box.minY, (float)box.maxZ).color(white);
        buffer.vertex(matrix, (float)box.maxX, (float)box.minY, (float)box.minZ).color(white);
        buffer.vertex(matrix, (float)box.maxX, (float)box.minY, (float)box.maxZ).color(white);
        buffer.vertex(matrix, (float)box.maxX, (float)box.maxY, (float)box.maxZ).color(white);
        buffer.vertex(matrix, (float)box.maxX, (float)box.maxY, (float)box.minZ).color(white);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
    }

    private void drawFullscreenQuad() {
        float width = Math.max(mc.getWindow().getScaledWidth(), 1);
        float height = Math.max(mc.getWindow().getScaledHeight(), 1);
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.class_5596.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        buffer.vertex(0.0f, 0.0f, 0.0f).texture(0.0f, 1.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        buffer.vertex(0.0f, height, 0.0f).texture(0.0f, 0.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        buffer.vertex(width, height, 0.0f).texture(1.0f, 0.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        buffer.vertex(width, 0.0f, 0.0f).texture(1.0f, 1.0f).color(1.0f, 1.0f, 1.0f, 1.0f);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
    }
}