package pulse.modules.visuals;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.Objects;
import java.util.Optional;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL11;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.module.ModuleRegistry;
import pulse.render.shader.PulseShaderProgram;
import pulse.render.shader.ShaderLibrary;
import pulse.settings.BooleanSetting;
import pulse.settings.ColorSetting;
import pulse.settings.ModeSetting;
import pulse.settings.SettingGroup;
import pulse.settings.SliderSetting;
import pulse.events.BlockOutlineEvent;

@ModuleInfo(a = "Block Overlay", b = "Красиво выделяет блок, на который наведен игрок", c = ModuleCategory.VISUALS)
public class BlockOverlay extends ClientModule {
    private static final String FILL_NORMAL = "Обычная";
    private static final String FILL_SHADER = "Шейдер";
    private static final String ANIMATION_NONE = "Нет";
    private static final String ANIMATION_PULSE = "Пульсация";
    private static final String ANIMATION_WAVE = "Волна";
    private static final String SHADER_NEBULA = "Небула";
    private static final String SHADER_STARS = "Звёзды";
    private static final String SHADER_WEB = "Паутина";
    private static final String SHADER_PLASMA = "Плазма";
    private final SettingGroup outlineGroup = new SettingGroup("Обводка");
    private final BooleanSetting outlineEnabled = new BooleanSetting("Обводка", true);
    private final SliderSetting lineWidth;
    private final SettingGroup fillGroup;
    private final BooleanSetting fillEnabled;
    private final ModeSetting fillType;
    private final SliderSetting fillAlpha;
    private final ModeSetting shaderType;
    private final SliderSetting shaderSpeed;
    private final SliderSetting shaderAlpha;
    private final SettingGroup animationGroup;
    private final ModeSetting animationMode;
    private final SettingGroup colorGroup;
    private final BooleanSetting useClientColor;
    private final ColorSetting customColor;

    public BlockOverlay() {
        SliderSetting sliderSetting = new SliderSetting("Толщина линий", 2.0f, 1.0f, 5.0f, 0.5f);
        BooleanSetting booleanSetting = this.outlineEnabled;
        Objects.requireNonNull(booleanSetting);
        this.lineWidth = sliderSetting.a(booleanSetting::a);
        this.fillGroup = new SettingGroup("Заливка");
        this.fillEnabled = new BooleanSetting("Заливка", true);
        ModeSetting modeSetting = new ModeSetting("Тип заливки", new String[]{FILL_NORMAL, FILL_SHADER}, FILL_NORMAL);
        BooleanSetting booleanSetting2 = this.fillEnabled;
        Objects.requireNonNull(booleanSetting2);
        this.fillType = modeSetting.a(booleanSetting2::a);
        this.fillAlpha = new SliderSetting("Прозрачность заливки", 0.3f, 0.1f, 1.0f, 0.05f).a(() -> {
            return Boolean.valueOf(this.fillEnabled.a() && this.fillType.b(FILL_NORMAL));
        });
        this.shaderType = new ModeSetting(FILL_SHADER, new String[]{SHADER_NEBULA, SHADER_STARS, SHADER_WEB, SHADER_PLASMA}, SHADER_NEBULA).a(() -> {
            return Boolean.valueOf(this.fillEnabled.a() && this.fillType.b(FILL_SHADER));
        });
        this.shaderSpeed = new SliderSetting("Скорость анимации", 1.0f, 0.1f, 3.0f, 0.1f).a(() -> {
            return Boolean.valueOf(this.fillEnabled.a() && this.fillType.b(FILL_SHADER));
        });
        this.shaderAlpha = new SliderSetting("Прозрачность", 1.0f, 0.1f, 1.0f, 0.05f).a(() -> {
            return Boolean.valueOf(this.fillEnabled.a() && this.fillType.b(FILL_SHADER));
        });
        this.animationGroup = new SettingGroup("Анимация");
        this.animationMode = new ModeSetting("Режим анимации", new String[]{ANIMATION_NONE, ANIMATION_PULSE, ANIMATION_WAVE}, ANIMATION_NONE);
        this.colorGroup = new SettingGroup("Цвет");
        this.useClientColor = new BooleanSetting("Цвет клиента", true);
        this.customColor = new ColorSetting("Кастомный цвет", Color.WHITE).a(() -> {
            return Boolean.valueOf(!this.useClientColor.a());
        });
    }

    @EventHandler
    public void onBlockOutline(BlockOutlineEvent blockOutlineEvent) {
        blockOutlineEvent.a();
        BlockState BlockStateVarBlockState = blockOutlineEvent.blockState();
        if (BlockStateVarBlockState.isAir()) {
            return;
        }
        Box BoxVarOffset = BlockStateVarBlockState.getOutlineShape(c.world, blockOutlineEvent.blockPos()).getBoundingBox().offset(((double) blockOutlineEvent.blockPos().getX()) - blockOutlineEvent.cameraX(), ((double) blockOutlineEvent.blockPos().getY()) - blockOutlineEvent.cameraY(), ((double) blockOutlineEvent.blockPos().getZ()) - blockOutlineEvent.cameraZ());
        renderOverlay(blockOutlineEvent.matrices(), applyPrimaryAnimation(BoxVarOffset), overlayColor());
        if (this.animationMode.b(ANIMATION_WAVE)) {
            renderWave(blockOutlineEvent.matrices(), BoxVarOffset, overlayColor());
        }
    }

    private Box applyPrimaryAnimation(Box BoxVar) {
        return !this.animationMode.b(ANIMATION_PULSE) ? BoxVar : scaleBox(BoxVar, 1.0f + (((float) ((Math.sin(System.currentTimeMillis() / 260.0d) + 1.0d) * 0.5d)) * 0.04f));
    }

    private void renderOverlay(MatrixStack MatrixStackVar, Box BoxVar, Color color) {
        MatrixStackVar.push();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.depthMask(false);
        RenderSystem.depthFunc(519);
        if (this.fillEnabled.a()) {
            drawFill(MatrixStackVar, BoxVar, color);
        }
        if (this.outlineEnabled.a()) {
            drawOutline(MatrixStackVar, BoxVar, color, 1.0f, this.lineWidth.a());
        }
        RenderSystem.depthFunc(515);
        RenderSystem.depthMask(true);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
        MatrixStackVar.pop();
    }

    private void renderWave(MatrixStack MatrixStackVar, Box BoxVar, Color color) {
        float fCurrentTimeMillis = (System.currentTimeMillis() % 1000) / 1000.0f;
        Box BoxVarScaleBox = scaleBox(BoxVar, 1.0f + (fCurrentTimeMillis * 0.18f));
        MatrixStackVar.push();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.depthFunc(519);
        drawOutline(MatrixStackVar, BoxVarScaleBox, color, 1.0f - fCurrentTimeMillis, Math.max(1.0f, this.lineWidth.a() - 0.5f));
        RenderSystem.depthFunc(515);
        RenderSystem.disableBlend();
        MatrixStackVar.pop();
    }

    private void drawOutline(MatrixStack MatrixStackVar, Box BoxVar, Color color, float f, float f2) {
        GL11.glEnable(2848);
        RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
        RenderSystem.lineWidth(f2);
        BufferBuilder BufferBuilderVarBegin = Tessellator.getInstance().begin(VertexFormat.DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
        addBoxLines(BufferBuilderVarBegin, MatrixStackVar.peek().getPositionMatrix(), BoxVar, color, f);
        BufferRenderer.drawWithGlobalProgram(BufferBuilderVarBegin.end());
        RenderSystem.lineWidth(1.0f);
        GL11.glDisable(2848);
    }

    private void drawFill(MatrixStack MatrixStackVar, Box BoxVar, Color color) {
        Matrix4f matrix4fGetPositionMatrix = MatrixStackVar.peek().getPositionMatrix();
        if (this.fillType.b(FILL_SHADER)) {
            drawShaderFill(matrix4fGetPositionMatrix, BoxVar, color);
            return;
        }
        RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
        BufferBuilder BufferBuilderVarBegin = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
        addBoxQuads(BufferBuilderVarBegin, matrix4fGetPositionMatrix, BoxVar, color, this.fillAlpha.a());
        BufferRenderer.drawWithGlobalProgram(BufferBuilderVarBegin.end());
    }

    private void drawShaderFill(Matrix4f matrix4f, Box BoxVar, Color color) {
        Optional<PulseShaderProgram> optionalFind = ShaderLibrary.getRegistry().find(shaderProgramName());
        if (optionalFind.isEmpty() || !optionalFind.get().b()) {
            RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
            BufferBuilder BufferBuilderVarBegin = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
            addBoxQuads(BufferBuilderVarBegin, matrix4f, BoxVar, color, this.shaderAlpha.a() * 0.45f);
            BufferRenderer.drawWithGlobalProgram(BufferBuilderVarBegin.end());
            return;
        }
        float time = ((System.currentTimeMillis() % 100000) / 1000.0f) * this.shaderSpeed.a();
        float alpha = Math.max(0.2f, this.shaderAlpha.a());
        PulseShaderProgram program = optionalFind.get();
        RenderSystem.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
        program.d();
        program.a("time", time);
        program.a("screenSize", (float) c.getWindow().getFramebufferWidth(), (float) c.getWindow().getFramebufferHeight());
        program.a("baseColor", color.getRed() / 255.0f, color.getGreen() / 255.0f, color.getBlue() / 255.0f, 1.0f);
        program.a("alpha", alpha);
        emitShaderBox(matrix4f, BoxVar);
        program.e();
        RenderSystem.defaultBlendFunc();
    }

    private String shaderProgramName() {
        String type = this.shaderType.d();
        if (SHADER_STARS.equals(type)) {
            return "block_starfield";
        }
        if (SHADER_WEB.equals(type)) {
            return "block_cobweb";
        }
        if (SHADER_PLASMA.equals(type)) {
            return "block_plasma";
        }
        return "block_nebula";
    }

    private void emitShaderBox(Matrix4f matrix4f, Box BoxVar) {
        float minX = (float) BoxVar.minX;
        float minY = (float) BoxVar.minY;
        float minZ = (float) BoxVar.minZ;
        float maxX = (float) BoxVar.maxX;
        float maxY = (float) BoxVar.maxY;
        float maxZ = (float) BoxVar.maxZ;
        // north (+Z)
        emitShaderQuad(matrix4f, minX, minY, maxZ, maxX, minY, maxZ, maxX, maxY, maxZ, minX, maxY, maxZ);
        // south (-Z)
        emitShaderQuad(matrix4f, minX, maxY, minZ, maxX, maxY, minZ, maxX, minY, minZ, minX, minY, minZ);
        // west (-X)
        emitShaderQuad(matrix4f, minX, minY, minZ, minX, minY, maxZ, minX, maxY, maxZ, minX, maxY, minZ);
        // east (+X)
        emitShaderQuad(matrix4f, maxX, maxY, minZ, maxX, maxY, maxZ, maxX, minY, maxZ, maxX, minY, minZ);
        // up (+Y)
        emitShaderQuad(matrix4f, minX, maxY, minZ, minX, maxY, maxZ, maxX, maxY, maxZ, maxX, maxY, minZ);
        // down (-Y)
        emitShaderQuad(matrix4f, maxX, minY, minZ, maxX, minY, maxZ, minX, minY, maxZ, minX, minY, minZ);
    }

    private void emitShaderQuad(Matrix4f matrix4f, float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4) {
        emitShaderTriangle(matrix4f, x1, y1, z1, x2, y2, z2, x3, y3, z3, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f);
        emitShaderTriangle(matrix4f, x1, y1, z1, x3, y3, z3, x4, y4, z4, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f);
    }

    private void emitShaderTriangle(Matrix4f matrix4f, float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float u1, float v1, float u2, float v2, float u3, float v3) {
        Vector4f p1 = matrix4f.transform(new Vector4f(x1, y1, z1, 1.0f));
        Vector4f p2 = matrix4f.transform(new Vector4f(x2, y2, z2, 1.0f));
        Vector4f p3 = matrix4f.transform(new Vector4f(x3, y3, z3, 1.0f));
        PulseShaderProgram.a(new float[]{
                p1.x, p1.y, p1.z, u1, v1,
                p2.x, p2.y, p2.z, u2, v2,
                p3.x, p3.y, p3.z, u3, v3
        }, 3);
    }

    private Color overlayColor() {
        return this.useClientColor.a() ? ModuleRegistry.CLIENT_COLOR.n() : this.customColor.a();
    }

    private static Box scaleBox(Box BoxVar, float f) {
        Vec3d Vec3dVarGetCenter = BoxVar.getCenter();
        double d = (BoxVar.maxX - BoxVar.minX) * 0.5d * ((double) f);
        double d2 = (BoxVar.maxY - BoxVar.minY) * 0.5d * ((double) f);
        double d3 = (BoxVar.maxZ - BoxVar.minZ) * 0.5d * ((double) f);
        return new Box(Vec3dVarGetCenter.x - d, Vec3dVarGetCenter.y - d2, Vec3dVarGetCenter.z - d3, Vec3dVarGetCenter.x + d, Vec3dVarGetCenter.y + d2, Vec3dVarGetCenter.z + d3);
    }

    private static void addBoxLines(BufferBuilder BufferBuilderVar, Matrix4f matrix4f, Box BoxVar, Color color, float f) {
        float f2 = (float) BoxVar.minX;
        float f3 = (float) BoxVar.minY;
        float f4 = (float) BoxVar.minZ;
        float f5 = (float) BoxVar.maxX;
        float f6 = (float) BoxVar.maxY;
        float f7 = (float) BoxVar.maxZ;
        line(BufferBuilderVar, matrix4f, f2, f3, f4, f5, f3, f4, color, f);
        line(BufferBuilderVar, matrix4f, f2, f3, f4, f2, f6, f4, color, f);
        line(BufferBuilderVar, matrix4f, f2, f3, f4, f2, f3, f7, color, f);
        line(BufferBuilderVar, matrix4f, f5, f6, f7, f2, f6, f7, color, f);
        line(BufferBuilderVar, matrix4f, f5, f6, f7, f5, f3, f7, color, f);
        line(BufferBuilderVar, matrix4f, f5, f6, f7, f5, f6, f4, color, f);
        line(BufferBuilderVar, matrix4f, f2, f6, f4, f5, f6, f4, color, f);
        line(BufferBuilderVar, matrix4f, f5, f3, f4, f5, f3, f7, color, f);
        line(BufferBuilderVar, matrix4f, f2, f3, f7, f5, f3, f7, color, f);
        line(BufferBuilderVar, matrix4f, f2, f6, f7, f2, f6, f4, color, f);
        line(BufferBuilderVar, matrix4f, f2, f6, f7, f2, f3, f7, color, f);
        line(BufferBuilderVar, matrix4f, f5, f6, f4, f5, f3, f4, color, f);
    }

    private static void addBoxQuads(BufferBuilder BufferBuilderVar, Matrix4f matrix4f, Box BoxVar, Color color, float f) {
        float f2 = (float) BoxVar.minX;
        float f3 = (float) BoxVar.minY;
        float f4 = (float) BoxVar.minZ;
        float f5 = (float) BoxVar.maxX;
        float f6 = (float) BoxVar.maxY;
        float f7 = (float) BoxVar.maxZ;
        quad(BufferBuilderVar, matrix4f, color, f, f2, f3, f7, f5, f3, f7, f5, f6, f7, f2, f6, f7);
        quad(BufferBuilderVar, matrix4f, color, f, f2, f6, f4, f5, f6, f4, f5, f3, f4, f2, f3, f4);
        quad(BufferBuilderVar, matrix4f, color, f, f2, f3, f4, f2, f3, f7, f2, f6, f7, f2, f6, f4);
        quad(BufferBuilderVar, matrix4f, color, f, f5, f6, f4, f5, f6, f7, f5, f3, f7, f5, f3, f4);
        quad(BufferBuilderVar, matrix4f, color, f, f2, f6, f4, f2, f6, f7, f5, f6, f7, f5, f6, f4);
        quad(BufferBuilderVar, matrix4f, color, f, f5, f3, f4, f5, f3, f7, f2, f3, f7, f2, f3, f4);
    }

    private static void line(BufferBuilder BufferBuilderVar, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, Color color, float f7) {
        vertex(BufferBuilderVar, matrix4f, f, f2, f3, color, f7);
        vertex(BufferBuilderVar, matrix4f, f4, f5, f6, color, f7);
    }

    private static void quad(BufferBuilder BufferBuilderVar, Matrix4f matrix4f, Color color, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        vertex(BufferBuilderVar, matrix4f, f2, f3, f4, color, f);
        vertex(BufferBuilderVar, matrix4f, f5, f6, f7, color, f);
        vertex(BufferBuilderVar, matrix4f, f8, f9, f10, color, f);
        vertex(BufferBuilderVar, matrix4f, f11, f12, f13, color, f);
    }

    private static void vertex(BufferBuilder BufferBuilderVar, Matrix4f matrix4f, float f, float f2, float f3, Color color, float f4) {
        BufferBuilderVar.vertex(matrix4f, f, f2, f3).color(color.getRed() / 255.0f, color.getGreen() / 255.0f, color.getBlue() / 255.0f, (color.getAlpha() / 255.0f) * f4);
    }
}
