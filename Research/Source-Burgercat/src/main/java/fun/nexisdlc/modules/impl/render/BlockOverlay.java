package fun.nexisdlc.modules.impl.render;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.main.world.WorldGeometryEmitter;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderLayers;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderer;
import fun.nexisdlc.mixins.accessors.GameRendererAccessor;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.UniformType;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryStack;

import java.awt.*;
import java.nio.ByteBuffer;
import java.util.OptionalDouble;
import java.util.OptionalInt;

@FunctionAdd(name = "BlockOverlay", alias = "Block Overlay", category = Category.Render, description = "Подсвечивает блок, на который направлен прицел: поддерживается заливка, обводка и анимированные эффекты")
public class BlockOverlay extends Function {

    private static final double BOX_EXPAND_FILL = 0.01;
    // 1 грань (наведённая) * 2 треугольника * 3 вершины = 6 вершин
    private static final int SHADER_VERTEX_COUNT = 6;

    private final ModeSetting renderMode = new ModeSetting("Режим рендера", "Обычный", "Обычный", "Шейдерный");
    private final ModeSetting shaderType = new ModeSetting("Тип шейдера", "Water", "Water", "Caustic")
            .setVisible(() -> renderMode.is("Шейдерный"));
    private final BooleanSetting filled = new BooleanSetting("Заливка", true);
    private final SliderSetting fillAlpha = new SliderSetting("Прозрачность", 0.6f, 0.1f, 1f, 0.05f);
    private final SliderSetting shaderScale = new SliderSetting("Размер", 8.0f, 1.0f, 40.0f, 0.5f)
            .setVisible(() -> renderMode.isIndex(1) && filled.get());
    private final SliderSetting shaderIntensity = new SliderSetting("Интенсивность", 0.01f, 0.001f, 0.05f, 0.001f)
            .setVisible(() -> renderMode.isIndex(1) && filled.get());
    private final SliderSetting shaderSpeed = new SliderSetting("Скорость шейдера", 1.2f, 0.1f, 5.0f, 0.1f)
            .setVisible(() -> renderMode.isIndex(1) && filled.get());
    private final BooleanSetting smoothAnimation = new BooleanSetting("Плавность", true);
    private final SliderSetting smoothSpeed = new SliderSetting("Скорость плавности", 10f, 2f, 25f, 0.5f)
            .setVisible(smoothAnimation::get);

    private Box animatedBox;
    private long lastAnimUpdateNs = -1L;

    // GPU resources
    private RenderPipeline waterPipeline;
    private RenderPipeline causticPipeline;
    private GpuBuffer vertexBuffer;
    private GpuBuffer mvpBuffer;
    private GpuBuffer timeBuffer;
    private GpuBuffer colorBuffer;
    private GpuBuffer paramsBuffer;
    private GpuBuffer cameraPosBuffer;
    private long startMillis = -1L;

    public BlockOverlay() {
        addSettings(renderMode, shaderType, filled, fillAlpha, shaderScale, shaderIntensity, shaderSpeed, smoothAnimation, smoothSpeed);
    }

    @Override
    public void onDisable() {
        super.onDisable();
        animatedBox = null;
        lastAnimUpdateNs = -1L;
        startMillis = -1L;
    }

    @EventHandler
    public void onRender3D(EventRender.World event) {
        if (nullCheck() || mc.player == null || mc.world == null) {
            return;
        }
        HitResult hitResult = mc.crosshairTarget;
        if (hitResult != null && hitResult.getType() == HitResult.Type.BLOCK) {
            BlockHitResult blockHitResult = (BlockHitResult) hitResult;
            BlockPos targetPos = blockHitResult.getBlockPos();
            Direction face = blockHitResult.getSide();
            double distanceToBlock = mc.player.squaredDistanceTo(targetPos.getX() + 0.5, targetPos.getY() + 0.5,
                    targetPos.getZ() + 0.5);
            if (distanceToBlock <= 36.0) {
                Box targetBox = resolveTargetBox(mc.world, targetPos);
                updateAnimatedBox(targetBox);
                if (animatedBox != null) {
                    renderBlockOverlay(event, animatedBox, face);
                }
                return;
            }
        }
        animatedBox = null;
        lastAnimUpdateNs = -1L;
    }

    private void renderBlockOverlay(EventRender.World event, Box worldBox, Direction face) {
        Camera camera = mc.gameRenderer.getCamera();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, event.getTicks(), true);
        Matrix4f positionMatrix = new Matrix4f(event.getMatrixStack().peek().getPositionMatrix());
        Matrix4f projectionMatrix = new Matrix4f(mc.gameRenderer.getBasicProjectionMatrix(fov));
        Vec3d cameraPos = camera.getCameraPos();
        boolean shaderMode = filled.get() && renderMode.isIndex(1);
        int accentColor = ClientColors.ICON.getRGB();
        // Настоящий шейдер на весь бокс (как SkyShader)
        if (shaderMode) {
            // event positionMatrix НЕ содержит поворот камеры (vanilla кладёт его в глобальный ModelViewMat,
            // а WorldGeometryEmitter пишет вершины через identity). Строим view из камеры сами,
            // как GameRenderer: rotateX(pitch), rotateY(yaw + 180). Вершины camera-relative.
            Matrix4f view = new Matrix4f()
                    .rotateX((float) Math.toRadians(camera.getPitch()))
                    .rotateY((float) Math.toRadians(camera.getYaw() + 180.0f));
            Matrix4f mvp = new Matrix4f(projectionMatrix).mul(view);
            renderShaderFill(mvp, worldBox, cameraPos, accentColor, face);
        }
        // Заливка (обычный режим) + обводка через WorldRenderer
        try (WorldRenderer renderer = WorldRenderer.begin(
                mc,
                mc.getRenderTickCounter(),
                camera,
                positionMatrix,
                projectionMatrix)) {
            if (!shaderMode && filled.get()) {
                emitBlockFill(renderer, cameraPos, worldBox, accentColor, fillAlpha.get().floatValue());
            }
            RenderLayer lineLayer = WorldRenderLayers.LINES_ADDITIVE(1.6);
            WorldGeometryEmitter lineEmitter = renderer.lineEmitter(lineLayer);
            emitBlockOutline(lineEmitter, cameraPos, worldBox, accentColor);
            renderer.flush();
        }
    }

    // ===================== SHADER FILL =====================
    private void renderShaderFill(Matrix4f mvp, Box worldBox, Vec3d cameraPos, int accentColor, Direction face) {
        ensureInitialized();
        if (waterPipeline == null || causticPipeline == null || vertexBuffer == null) {
            return;
        }
        if (startMillis < 0L) {
            startMillis = System.currentTimeMillis();
        }
        MinecraftClient client = MinecraftClient.getInstance();
        Color color = new Color(accentColor, true);
        float time = (System.currentTimeMillis() - startMillis) / 1000.0f;
        GpuDevice device = RenderSystem.getDevice();
        CommandEncoder encoder = device.createCommandEncoder();
        // Геометрия бокса (camera-relative) в вершинный буфер
        writeFaceVertices(encoder, worldBox, cameraPos, face);
        // Юниформы
        try (MemoryStack stack = MemoryStack.stackPush()) {
            encoder.writeToBuffer(mvpBuffer.slice(),
                    Std140Builder.onStack(stack, 64).putMat4f(mvp).get());
            encoder.writeToBuffer(timeBuffer.slice(),
                    Std140Builder.onStack(stack, 16).putFloat(time).get());
            encoder.writeToBuffer(colorBuffer.slice(),
                    Std140Builder.onStack(stack, 16).putVec3(color.getRed() / 255f, color.getGreen() / 255f, color.getBlue() / 255f).get());
            encoder.writeToBuffer(paramsBuffer.slice(),
                    Std140Builder.onStack(stack, 16).putVec4(
                            fillAlpha.get().floatValue(),
                            shaderSpeed.get().floatValue(),
                            shaderScale.get().floatValue(),
                            shaderIntensity.get().floatValue()).get());
            // Абсолютная позиция камеры: vWorldPos camera-relative + это = мировые коорды -> паттерн не плывёт
            encoder.writeToBuffer(cameraPosBuffer.slice(),
                    Std140Builder.onStack(stack, 16).putVec3((float) cameraPos.x, (float) cameraPos.y, (float) cameraPos.z).get());
        }
        try (RenderPass pass = encoder.createRenderPass(
                () -> "blockoverlay_shader",
                client.getFramebuffer().getColorAttachmentView(),
                OptionalInt.empty(),
                // подключаем depth-буфер мира (не очищаем) -> энтити/блоки перед блоком перекрывают оверлей
                client.getFramebuffer().getDepthAttachmentView(),
                OptionalDouble.empty())) {
            pass.setPipeline(shaderType.is("Caustic") ? causticPipeline : waterPipeline);
            pass.setUniform("uModelViewProjection", mvpBuffer.slice());
            pass.setUniform("uTime", timeBuffer.slice());
            pass.setUniform("uColor", colorBuffer.slice());
            pass.setUniform("uParams", paramsBuffer.slice());
            pass.setUniform("uCameraPos", cameraPosBuffer.slice());
            pass.setVertexBuffer(0, vertexBuffer);
            pass.draw(0, SHADER_VERTEX_COUNT);
        }
    }

    private void ensureInitialized() {
        if (waterPipeline != null && causticPipeline != null && vertexBuffer != null) {
            return;
        }
        GpuDevice device = RenderSystem.getDevice();
        waterPipeline = buildPipeline("blockoverlay_water", "blockoverlay_water");
        causticPipeline = buildPipeline("blockoverlay_caustic", "blockoverlay_caustic");
        vertexBuffer = device.createBuffer(() -> "blockoverlay_vertices",
                GpuBuffer.USAGE_VERTEX | GpuBuffer.USAGE_COPY_DST, (long) SHADER_VERTEX_COUNT * 3L * Float.BYTES);
        mvpBuffer = device.createBuffer(() -> "blockoverlay_mvp", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 64L);
        timeBuffer = device.createBuffer(() -> "blockoverlay_time", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);
        colorBuffer = device.createBuffer(() -> "blockoverlay_color", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);
        paramsBuffer = device.createBuffer(() -> "blockoverlay_params", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);
        cameraPosBuffer = device.createBuffer(() -> "blockoverlay_camerapos", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);
    }

    private static RenderPipeline buildPipeline(String location, String shaderName) {
        Identifier shader = Identifier.of("nexis", "core/" + shaderName);
        return RenderPipeline.builder()
                .withLocation(Identifier.of("nexis", location))
                .withVertexShader(shader)
                .withFragmentShader(shader)
                .withVertexFormat(VertexFormats.POSITION, VertexFormat.DrawMode.TRIANGLES)
                .withUniform("uModelViewProjection", UniformType.UNIFORM_BUFFER)
                .withUniform("uTime", UniformType.UNIFORM_BUFFER)
                .withUniform("uColor", UniformType.UNIFORM_BUFFER)
                .withUniform("uParams", UniformType.UNIFORM_BUFFER)
                .withUniform("uCameraPos", UniformType.UNIFORM_BUFFER)
                .withBlend(BlendFunction.TRANSLUCENT)
                .withDepthWrite(false)
                .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
                .withCull(false)
                .build();
    }

    // Только одна грань — та, на которую наведён игрок (без просвечивания задних сайдов)
    private void writeFaceVertices(CommandEncoder encoder, Box worldBox, Vec3d cameraPos, Direction face) {
        Box box = worldBox.expand(BOX_EXPAND_FILL).offset(-cameraPos.x, -cameraPos.y, -cameraPos.z);
        float minX = (float) box.minX, minY = (float) box.minY, minZ = (float) box.minZ;
        float maxX = (float) box.maxX, maxY = (float) box.maxY, maxZ = (float) box.maxZ;
        try (MemoryStack stack = MemoryStack.stackPush()) {
            ByteBuffer buffer = stack.malloc(SHADER_VERTEX_COUNT * 3 * Float.BYTES);
            java.nio.FloatBuffer fb = buffer.asFloatBuffer();
            switch (face) {
                case DOWN -> quad(fb, minX, minY, minZ, maxX, minY, minZ, maxX, minY, maxZ, minX, minY, maxZ);
                case UP -> quad(fb, minX, maxY, minZ, minX, maxY, maxZ, maxX, maxY, maxZ, maxX, maxY, minZ);
                case NORTH -> quad(fb, minX, minY, minZ, minX, maxY, minZ, maxX, maxY, minZ, maxX, minY, minZ);
                case SOUTH -> quad(fb, minX, minY, maxZ, maxX, minY, maxZ, maxX, maxY, maxZ, minX, maxY, maxZ);
                case WEST -> quad(fb, minX, minY, minZ, minX, minY, maxZ, minX, maxY, maxZ, minX, maxY, minZ);
                case EAST -> quad(fb, maxX, minY, minZ, maxX, maxY, minZ, maxX, maxY, maxZ, maxX, minY, maxZ);
            }
            encoder.writeToBuffer(vertexBuffer.slice(), buffer);
        }
    }

    // Два треугольника из 4 углов (cull выключен, порядок не важен)
    private static void quad(java.nio.FloatBuffer fb,
                             float ax, float ay, float az,
                             float bx, float by, float bz,
                             float cx, float cy, float cz,
                             float dx, float dy, float dz) {
        fb.put(ax).put(ay).put(az);
        fb.put(bx).put(by).put(bz);
        fb.put(cx).put(cy).put(cz);
        fb.put(ax).put(ay).put(az);
        fb.put(cx).put(cy).put(cz);
        fb.put(dx).put(dy).put(dz);
    }

    // ===================== ОБЫЧНЫЙ РЕЖИМ =====================
    private void emitBlockFill(WorldRenderer renderer, Vec3d cameraPos, Box worldBox, int baseColor, float alphaValue) {
        int alphaInt = Math.max(0, Math.min(255, (int) (alphaValue * 255.0f)));
        int fillColor = fun.nexisdlc.client.utils.render.color.basic.ColorUtils.injectAlpha(baseColor, alphaInt);
        net.minecraft.client.util.math.MatrixStack identity = new net.minecraft.client.util.math.MatrixStack();
        WorldGeometryEmitter quadEmitter = new WorldGeometryEmitter(
                mc.gameRenderer.getCamera(),
                identity.peek(),
                renderer.getBuffer(WorldRenderLayers.POSITION_COLOR_QUADS_ADDITIVE()));
        Box offsetBox = worldBox.expand(BOX_EXPAND_FILL)
                .offset(-cameraPos.x, -cameraPos.y, -cameraPos.z);
        emitFilledBox(quadEmitter, offsetBox, fillColor);
    }

    private void emitFilledBox(WorldGeometryEmitter emitter, Box box, int fillColor) {
        Vec3d p000 = new Vec3d(box.minX, box.minY, box.minZ);
        Vec3d p001 = new Vec3d(box.minX, box.minY, box.maxZ);
        Vec3d p010 = new Vec3d(box.minX, box.maxY, box.minZ);
        Vec3d p011 = new Vec3d(box.minX, box.maxY, box.maxZ);
        Vec3d p100 = new Vec3d(box.maxX, box.minY, box.minZ);
        Vec3d p101 = new Vec3d(box.maxX, box.minY, box.maxZ);
        Vec3d p110 = new Vec3d(box.maxX, box.maxY, box.minZ);
        Vec3d p111 = new Vec3d(box.maxX, box.maxY, box.maxZ);
        emitter.emitQuad(p000, p100, p110, p010, fillColor, fillColor, fillColor, fillColor);
        emitter.emitQuad(p001, p011, p111, p101, fillColor, fillColor, fillColor, fillColor);
        emitter.emitQuad(p000, p001, p101, p100, fillColor, fillColor, fillColor, fillColor);
        emitter.emitQuad(p010, p110, p111, p011, fillColor, fillColor, fillColor, fillColor);
        emitter.emitQuad(p000, p010, p011, p001, fillColor, fillColor, fillColor, fillColor);
        emitter.emitQuad(p100, p101, p111, p110, fillColor, fillColor, fillColor, fillColor);
    }

    // Обводка всего блока (12 рёбер) с depth-тестом — задние рёбра скрыты самим блоком
    private static void emitBlockOutline(WorldGeometryEmitter emitter, Vec3d cameraPos, Box worldBox, int color) {
        Box box = worldBox.expand(0.002);
        double minX = box.minX - cameraPos.x;
        double minY = box.minY - cameraPos.y;
        double minZ = box.minZ - cameraPos.z;
        double maxX = box.maxX - cameraPos.x;
        double maxY = box.maxY - cameraPos.y;
        double maxZ = box.maxZ - cameraPos.z;
        Vec3d p000 = new Vec3d(minX, minY, minZ);
        Vec3d p001 = new Vec3d(minX, minY, maxZ);
        Vec3d p010 = new Vec3d(minX, maxY, minZ);
        Vec3d p011 = new Vec3d(minX, maxY, maxZ);
        Vec3d p100 = new Vec3d(maxX, minY, minZ);
        Vec3d p101 = new Vec3d(maxX, minY, maxZ);
        Vec3d p110 = new Vec3d(maxX, maxY, minZ);
        Vec3d p111 = new Vec3d(maxX, maxY, maxZ);
        // низ
        emitter.emitLine(p000, p100, color);
        emitter.emitLine(p100, p101, color);
        emitter.emitLine(p101, p001, color);
        emitter.emitLine(p001, p000, color);
        // верх
        emitter.emitLine(p010, p110, color);
        emitter.emitLine(p110, p111, color);
        emitter.emitLine(p111, p011, color);
        emitter.emitLine(p011, p010, color);
        // вертикали
        emitter.emitLine(p000, p010, color);
        emitter.emitLine(p100, p110, color);
        emitter.emitLine(p101, p111, color);
        emitter.emitLine(p001, p011, color);
    }

    private Box resolveTargetBox(World world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        Box outlineShape = state.getOutlineShape(world, pos).getBoundingBox();
        if (outlineShape.isNaN() ||
                (outlineShape.minX >= outlineShape.maxX - 1e-7 && outlineShape.minY >= outlineShape.maxY - 1e-7
                        && outlineShape.minZ >= outlineShape.maxZ - 1e-7)) {
            return new Box(pos);
        }
        return outlineShape.offset(pos.getX(), pos.getY(), pos.getZ());
    }

    private void updateAnimatedBox(Box targetBox) {
        long now = System.nanoTime();
        if (!smoothAnimation.get()) {
            animatedBox = targetBox;
            lastAnimUpdateNs = now;
            return;
        }
        if (animatedBox == null || lastAnimUpdateNs < 0L) {
            animatedBox = targetBox;
            lastAnimUpdateNs = now;
            return;
        }
        double deltaSeconds = (now - lastAnimUpdateNs) / 1_000_000_000.0;
        lastAnimUpdateNs = now;
        double speed = smoothSpeed.get();
        double t = 1.0 - Math.exp(-speed * Math.max(0.0, deltaSeconds));
        animatedBox = new Box(
                lerp(animatedBox.minX, targetBox.minX, t),
                lerp(animatedBox.minY, targetBox.minY, t),
                lerp(animatedBox.minZ, targetBox.minZ, t),
                lerp(animatedBox.maxX, targetBox.maxX, t),
                lerp(animatedBox.maxY, targetBox.maxY, t),
                lerp(animatedBox.maxZ, targetBox.maxZ, t));
    }

    private static double lerp(double from, double to, double t) {
        return from + (to - from) * t;
    }
}
