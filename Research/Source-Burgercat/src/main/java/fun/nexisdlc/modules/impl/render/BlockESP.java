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
import fun.nexisdlc.client.utils.config.BlockEspStorage;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.color.basic.ColorUtils;
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
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.ChunkSectionPos;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;

import java.awt.Color;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;

@FunctionAdd(name = "BlockESP", alias = "Block ESP", category = Category.Render, description = "Подсвечивает нужные блоки сквозь стены: обводка, заливка и анимированные эффекты. Блоки задаются через .blockesp")
public class BlockESP extends Function {

    private static final double BOX_EXPAND_FILL = 0.01;
    private static final double BOX_EXPAND_OUTLINE = 0.002;
    // Полный бокс: 6 граней * 2 треугольника * 3 вершины = 36 вершин
    private static final int SHADER_VERTS_PER_BOX = 36;

    // ---------------- настройки ----------------
    private final ModeSetting renderMode = new ModeSetting("Режим рендера", "Обычный", "Обычный", "Шейдерный");
    private final ModeSetting shaderType = new ModeSetting("Тип шейдера", "Water", "Water", "Caustic")
            .setVisible(() -> renderMode.isIndex(1));
    private final BooleanSetting filled = new BooleanSetting("Заливка", true);
    private final SliderSetting fillAlpha = new SliderSetting("Прозрачность", 0.45f, 0.05f, 1f, 0.05f)
            .setVisible(filled::get);
    private final SliderSetting lineWidth = new SliderSetting("Толщина линий", 1.6f, 0.5f, 4.0f, 0.1f);
    private final SliderSetting shaderScale = new SliderSetting("Размер", 8.0f, 1.0f, 40.0f, 0.5f)
            .setVisible(() -> renderMode.isIndex(1) && filled.get());
    private final SliderSetting shaderIntensity = new SliderSetting("Интенсивность", 0.01f, 0.001f, 0.05f, 0.001f)
            .setVisible(() -> renderMode.isIndex(1) && filled.get());
    private final SliderSetting shaderSpeed = new SliderSetting("Скорость шейдера", 1.2f, 0.1f, 5.0f, 0.1f)
            .setVisible(() -> renderMode.isIndex(1) && filled.get());

    private final SliderSetting radius = new SliderSetting("Радиус", 48f, 8f, 128f, 1f);
    private final SliderSetting verticalRadius = new SliderSetting("Радиус по Y", 32f, 4f, 96f, 1f);
    private final SliderSetting scanBudget = new SliderSetting("Бюджет скана", 4500f, 500f, 25000f, 100f);
    private final SliderSetting rescanDelay = new SliderSetting("Период скана (мс)", 700f, 100f, 3000f, 50f);
    private final SliderSetting maxRender = new SliderSetting("Макс блоков", 512f, 32f, 4096f, 16f);

    // ---------------- состояние рендера (то что реально рисуется) ----------------
    private final List<BlockPos> cachedPositions = new ArrayList<>();
    private final Set<Long> cachedKeys = new HashSet<>();

    // ---------------- буфер скана (своп в конце) ----------------
    private final List<BlockPos> scanningPositions = new ArrayList<>();
    private final Set<Long> scanningKeys = new HashSet<>();

    private final BlockPos.Mutable scanCursor = new BlockPos.Mutable();
    private int minX, minY, minZ, maxX, maxY, maxZ;
    private int scanX, scanY, scanZ;
    private boolean scanFinished = true;
    private long nextRescanMs = 0L;
    private int lastTargetHash = 0;
    private int centerSectionX, centerSectionY, centerSectionZ;

    // ---------------- GPU ресурсы (шейдерный режим) ----------------
    private RenderPipeline waterPipeline;
    private RenderPipeline causticPipeline;
    private GpuBuffer vertexBuffer;
    private long vertexCapacityBytes = 0L;
    private GpuBuffer mvpBuffer;
    private GpuBuffer timeBuffer;
    private GpuBuffer colorBuffer;
    private GpuBuffer paramsBuffer;
    private GpuBuffer cameraPosBuffer;
    private long startMillis = -1L;
    private ByteBuffer scratch;

    public BlockESP() {
        addSettings(renderMode, shaderType, filled, fillAlpha, lineWidth,
                shaderScale, shaderIntensity, shaderSpeed,
                radius, verticalRadius, scanBudget, rescanDelay, maxRender);
    }

    @Override
    public void onDisable() {
        super.onDisable();
        resetScan();
        startMillis = -1L;
    }

    private void resetScan() {
        cachedPositions.clear();
        cachedKeys.clear();
        scanningPositions.clear();
        scanningKeys.clear();
        scanFinished = true;
        nextRescanMs = 0L;
        lastTargetHash = 0;
    }

    // ======================================================================
    //  RENDER ENTRY
    // ======================================================================
    @EventHandler
    public void onRender3D(EventRender.World event) {
        if (nullCheck() || mc.player == null || mc.world == null) {
            return;
        }
        if (BlockEspStorage.getInstance().isEmpty()) {
            resetScan();
            return;
        }

        // Скан по бюджету (рисуемый cache не меняется пока скан не закончен -> нет моргания)
        updateScan();
        if (cachedPositions.isEmpty()) {
            return;
        }

        Camera camera = mc.gameRenderer.getCamera();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, event.getTicks(), true);
        Matrix4f positionMatrix = new Matrix4f(event.getMatrixStack().peek().getPositionMatrix());
        Matrix4f projectionMatrix = new Matrix4f(mc.gameRenderer.getBasicProjectionMatrix(fov));
        Vec3d cameraPos = camera.getCameraPos();
        int accentColor = ClientColors.ICON.getRGB();
        int max = maxRender.get().intValue();
        boolean shaderMode = filled.get() && renderMode.isIndex(1);

        // Шейдерная заливка (сквозь стены, NO_DEPTH_TEST). View строим сами из камеры как GameRenderer.
        if (shaderMode) {
            Matrix4f view = new Matrix4f()
                    .rotateX((float) Math.toRadians(camera.getPitch()))
                    .rotateY((float) Math.toRadians(camera.getYaw() + 180.0f));
            Matrix4f mvp = new Matrix4f(projectionMatrix).mul(view);
            renderShaderFill(mvp, cameraPos, accentColor, max);
        }

        // Обычная заливка + обводка через WorldRenderer
        try (WorldRenderer renderer = WorldRenderer.begin(
                mc, mc.getRenderTickCounter(), camera, positionMatrix, projectionMatrix)) {
            if (filled.get() && !shaderMode) {
                int fillColor = ColorUtils.injectAlpha(accentColor, alpha255(fillAlpha.get().floatValue()));
                net.minecraft.client.util.math.MatrixStack identity = new net.minecraft.client.util.math.MatrixStack();
                WorldGeometryEmitter quadEmitter = new WorldGeometryEmitter(
                        camera, identity.peek(),
                        renderer.getBuffer(WorldRenderLayers.POSITION_COLOR_QUADS_ADDITIVE()));
                int c = 0;
                for (BlockPos pos : cachedPositions) {
                    if (c++ >= max) break;
                    emitFilledBox(quadEmitter, offsetBox(pos, cameraPos, BOX_EXPAND_FILL), fillColor);
                }
            }
            RenderLayer lineLayer = WorldRenderLayers.LINES_ADDITIVE(lineWidth.get().doubleValue());
            WorldGeometryEmitter lineEmitter = renderer.lineEmitter(lineLayer);
            int c = 0;
            for (BlockPos pos : cachedPositions) {
                if (c++ >= max) break;
                emitBlockOutline(lineEmitter, offsetBox(pos, cameraPos, BOX_EXPAND_OUTLINE), accentColor);
            }
            renderer.flush();
        }
    }

    // ======================================================================
    //  СКАН (двойной буфер -> без моргания)
    // ======================================================================
    private void updateScan() {
        long now = System.currentTimeMillis();
        int curHash = BlockEspStorage.getInstance().getBlockIds().hashCode();
        boolean targetChanged = curHash != lastTargetHash;

        int secX = ChunkSectionPos.getSectionCoord((int) Math.floor(mc.player.getX()));
        int secY = ChunkSectionPos.getSectionCoord((int) Math.floor(mc.player.getY()));
        int secZ = ChunkSectionPos.getSectionCoord((int) Math.floor(mc.player.getZ()));
        boolean moved = secX != centerSectionX || secY != centerSectionY || secZ != centerSectionZ;

        if (scanFinished) {
            boolean needRescan = targetChanged || moved || now >= nextRescanMs || cachedPositions.isEmpty();
            if (needRescan) {
                lastTargetHash = curHash;
                centerSectionX = secX;
                centerSectionY = secY;
                centerSectionZ = secZ;
                beginScan();
            }
        }

        int budget = scanBudget.get().intValue();
        for (int i = 0; i < budget && !scanFinished; i++) {
            scanStep();
        }
    }

    private void beginScan() {
        scanningPositions.clear();
        scanningKeys.clear();

        int r = radius.get().intValue();
        int vr = verticalRadius.get().intValue();
        int px = (int) Math.floor(mc.player.getX());
        int py = (int) Math.floor(mc.player.getY());
        int pz = (int) Math.floor(mc.player.getZ());

        int worldBottom = mc.world.getBottomY();
        int worldTop = mc.world.getBottomY() + mc.world.getHeight() - 1;

        minX = px - r;
        maxX = px + r;
        minZ = pz - r;
        maxZ = pz + r;
        minY = Math.max(worldBottom, py - vr);
        maxY = Math.min(worldTop, py + vr);

        scanX = minX;
        scanY = minY;
        scanZ = minZ;
        scanFinished = false;
    }

    private void scanStep() {
        if (scanFinished) return;

        BlockPos.Mutable pos = scanCursor.set(scanX, scanY, scanZ);
        if (isChunkLoaded(scanX, scanZ) && isTargetBlock(pos)) {
            long key = pos.asLong();
            if (scanningKeys.add(key)) {
                scanningPositions.add(pos.toImmutable());
            }
        }
        if (!advanceCursor()) {
            finishScan();
        }
    }

    private boolean advanceCursor() {
        scanX++;
        if (scanX > maxX) {
            scanX = minX;
            scanZ++;
            if (scanZ > maxZ) {
                scanZ = minZ;
                scanY++;
                if (scanY > maxY) {
                    return false;
                }
            }
        }
        return true;
    }

    // Атомарный своп: удалённые блоки пропадают, новые появляются — БЕЗ моргания
    private void finishScan() {
        cachedPositions.clear();
        cachedPositions.addAll(scanningPositions);
        cachedKeys.clear();
        cachedKeys.addAll(scanningKeys);
        scanFinished = true;
        nextRescanMs = System.currentTimeMillis() + rescanDelay.get().longValue();
    }

    private boolean isTargetBlock(BlockPos pos) {
        BlockState state = mc.world.getBlockState(pos);
        if (state.isAir()) return false;
        return BlockEspStorage.getInstance().getBlocks().contains(state.getBlock());
    }

    private boolean isChunkLoaded(int x, int z) {
        return mc.world.isChunkLoaded(ChunkSectionPos.getSectionCoord(x), ChunkSectionPos.getSectionCoord(z));
    }

    // ======================================================================
    //  ШЕЙДЕРНАЯ ЗАЛИВКА (GPU pipeline, NO_DEPTH_TEST -> сквозь стены)
    // ======================================================================
    private void renderShaderFill(Matrix4f mvp, Vec3d cameraPos, int accentColor, int max) {
        int count = Math.min(cachedPositions.size(), max);
        if (count <= 0) return;

        ensureInitialized();
        if (waterPipeline == null || causticPipeline == null) return;

        int totalVerts = count * SHADER_VERTS_PER_BOX;
        ensureVertexCapacity(totalVerts);
        if (vertexBuffer == null) return;

        if (startMillis < 0L) startMillis = System.currentTimeMillis();
        MinecraftClient client = MinecraftClient.getInstance();
        Color color = new Color(accentColor, true);
        float time = (System.currentTimeMillis() - startMillis) / 1000.0f;
        GpuDevice device = RenderSystem.getDevice();
        CommandEncoder encoder = device.createCommandEncoder();

        // Геометрия всех боксов (camera-relative) в один вершинный буфер
        int bytes = totalVerts * 3 * Float.BYTES;
        ByteBuffer buffer = ensureScratch(bytes);
        FloatBuffer fb = buffer.asFloatBuffer();
        int c = 0;
        for (BlockPos pos : cachedPositions) {
            if (c++ >= count) break;
            writeBoxVertices(fb, offsetBox(pos, cameraPos, BOX_EXPAND_FILL));
        }
        buffer.position(0).limit(bytes);
        encoder.writeToBuffer(vertexBuffer.slice(), buffer);

        // Юниформы
        try (MemoryStack stack = MemoryStack.stackPush()) {
            encoder.writeToBuffer(mvpBuffer.slice(),
                    Std140Builder.onStack(stack, 64).putMat4f(mvp).get());
            encoder.writeToBuffer(timeBuffer.slice(),
                    Std140Builder.onStack(stack, 16).putFloat(time).get());
            encoder.writeToBuffer(colorBuffer.slice(),
                    Std140Builder.onStack(stack, 16).putVec3(
                            color.getRed() / 255f, color.getGreen() / 255f, color.getBlue() / 255f).get());
            encoder.writeToBuffer(paramsBuffer.slice(),
                    Std140Builder.onStack(stack, 16).putVec4(
                            fillAlpha.get().floatValue(),
                            shaderSpeed.get().floatValue(),
                            shaderScale.get().floatValue(),
                            shaderIntensity.get().floatValue()).get());
            encoder.writeToBuffer(cameraPosBuffer.slice(),
                    Std140Builder.onStack(stack, 16).putVec3(
                            (float) cameraPos.x, (float) cameraPos.y, (float) cameraPos.z).get());
        }

        try (RenderPass pass = encoder.createRenderPass(
                () -> "blockesp_shader",
                client.getFramebuffer().getColorAttachmentView(),
                OptionalInt.empty(),
                client.getFramebuffer().getDepthAttachmentView(),
                OptionalDouble.empty())) {
            pass.setPipeline(shaderType.is("Caustic") ? causticPipeline : waterPipeline);
            pass.setUniform("uModelViewProjection", mvpBuffer.slice());
            pass.setUniform("uTime", timeBuffer.slice());
            pass.setUniform("uColor", colorBuffer.slice());
            pass.setUniform("uParams", paramsBuffer.slice());
            pass.setUniform("uCameraPos", cameraPosBuffer.slice());
            pass.setVertexBuffer(0, vertexBuffer);
            pass.draw(0, totalVerts);
        }
    }

    private void ensureInitialized() {
        if (waterPipeline != null && causticPipeline != null && mvpBuffer != null) {
            return;
        }
        GpuDevice device = RenderSystem.getDevice();
        waterPipeline = buildPipeline("blockesp_water", "blockoverlay_water");
        causticPipeline = buildPipeline("blockesp_caustic", "blockoverlay_caustic");
        mvpBuffer = device.createBuffer(() -> "blockesp_mvp", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 64L);
        timeBuffer = device.createBuffer(() -> "blockesp_time", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);
        colorBuffer = device.createBuffer(() -> "blockesp_color", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);
        paramsBuffer = device.createBuffer(() -> "blockesp_params", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);
        cameraPosBuffer = device.createBuffer(() -> "blockesp_camerapos", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);
    }

    private void ensureVertexCapacity(int verts) {
        long needed = (long) verts * 3L * Float.BYTES;
        if (vertexBuffer != null && vertexCapacityBytes >= needed) return;
        if (vertexBuffer != null) {
            vertexBuffer.close();
        }
        GpuDevice device = RenderSystem.getDevice();
        long alloc = Math.max(needed, (long) SHADER_VERTS_PER_BOX * 3L * Float.BYTES);
        vertexBuffer = device.createBuffer(() -> "blockesp_vertices",
                GpuBuffer.USAGE_VERTEX | GpuBuffer.USAGE_COPY_DST, alloc);
        vertexCapacityBytes = alloc;
    }

    private ByteBuffer ensureScratch(int bytes) {
        if (scratch == null || scratch.capacity() < bytes) {
            scratch = BufferUtils.createByteBuffer(Math.max(bytes, 4096));
        }
        scratch.clear();
        return scratch;
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
                .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                .withCull(false)
                .build();
    }

    // Полный бокс (6 граней) в FloatBuffer, cull выкл
    private static void writeBoxVertices(FloatBuffer fb, Box b) {
        float x1 = (float) b.minX, y1 = (float) b.minY, z1 = (float) b.minZ;
        float x2 = (float) b.maxX, y2 = (float) b.maxY, z2 = (float) b.maxZ;
        quad(fb, x1, y1, z1, x2, y1, z1, x2, y1, z2, x1, y1, z2); // DOWN
        quad(fb, x1, y2, z1, x1, y2, z2, x2, y2, z2, x2, y2, z1); // UP
        quad(fb, x1, y1, z1, x1, y2, z1, x2, y2, z1, x2, y1, z1); // NORTH
        quad(fb, x1, y1, z2, x2, y1, z2, x2, y2, z2, x1, y2, z2); // SOUTH
        quad(fb, x1, y1, z1, x1, y1, z2, x1, y2, z2, x1, y2, z1); // WEST
        quad(fb, x2, y1, z1, x2, y2, z1, x2, y2, z2, x2, y1, z2); // EAST
    }

    private static void quad(FloatBuffer fb,
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

    // ======================================================================
    //  ОБЫЧНЫЙ РЕЖИМ (WorldRenderer)
    // ======================================================================
    private static void emitFilledBox(WorldGeometryEmitter emitter, Box box, int fillColor) {
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

    private static void emitBlockOutline(WorldGeometryEmitter emitter, Box box, int color) {
        Vec3d p000 = new Vec3d(box.minX, box.minY, box.minZ);
        Vec3d p001 = new Vec3d(box.minX, box.minY, box.maxZ);
        Vec3d p010 = new Vec3d(box.minX, box.maxY, box.minZ);
        Vec3d p011 = new Vec3d(box.minX, box.maxY, box.maxZ);
        Vec3d p100 = new Vec3d(box.maxX, box.minY, box.minZ);
        Vec3d p101 = new Vec3d(box.maxX, box.minY, box.maxZ);
        Vec3d p110 = new Vec3d(box.maxX, box.maxY, box.minZ);
        Vec3d p111 = new Vec3d(box.maxX, box.maxY, box.maxZ);
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

    private static Box offsetBox(BlockPos pos, Vec3d cam, double expand) {
        return new Box(pos).expand(expand).offset(-cam.x, -cam.y, -cam.z);
    }

    private static int alpha255(float value) {
        return Math.max(0, Math.min(255, (int) (value * 255.0f)));
    }
}
