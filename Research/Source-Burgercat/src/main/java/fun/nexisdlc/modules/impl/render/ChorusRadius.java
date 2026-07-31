package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.easy.RenderUtil;
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
import fun.nexisdlc.modules.impl.combat.AuraModule;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.ArrayList;
import java.util.List;

@FunctionAdd(name = "ChorusRadius", alias = "Chorus Radius", category = Category.Render, description = "Показывает возможные точки телепортации хоруса")
public class ChorusRadius extends Function {

    public static final ModeSetting modeType = new ModeSetting("Тип отображения",
            "Боксами",
            "Боксами", "Радиусом");

    private final SliderSetting radius = new SliderSetting("Радиус проверки", 10.0f, 5.0f, 20.0f, 1.0f);
    private final BooleanSetting showForSelf = new BooleanSetting("Для себя", true);
    private final BooleanSetting showForOthers = new BooleanSetting("Для других", true);
    private final BooleanSetting showForAttackTarget = new BooleanSetting("Для цели AttackAura", true);
    private final BooleanSetting fillBlocks = new BooleanSetting("Заливка блоков", true).setVisible(() -> modeType.is("Боксами"));
    private final SliderSetting fillAlpha = new SliderSetting("Прозрачность заливки", 0.15f, 0.05f, 0.5f, 0.05f)
            .setVisible(() -> modeType.is("Боксами") && fillBlocks.get());
    private final BooleanSetting showOutline = new BooleanSetting("Обводка", true).setVisible(() -> modeType.is("Боксами"));
    private final BooleanSetting filledRadius = new BooleanSetting("Заполненный", true).setVisible(() -> modeType.is("Радиусом"));
    private final SliderSetting maxPoints = new SliderSetting("Макс. точек", 50, 10, 200, 10).setVisible(() -> modeType.is("Боксами"));

    private static final int CHORUS_RADIUS = 8;
    private static final int CHORUS_HEIGHT = 2;

    public ChorusRadius() {
        addSettings(modeType, radius, showForSelf, showForOthers, showForAttackTarget, fillBlocks, fillAlpha, showOutline, filledRadius, maxPoints);
    }

    @EventHandler
    public void onRender3D(EventRender.World event) {
        if (nullCheck() || mc.player == null || mc.world == null) {
            return;
        }

        float tickDelta = RenderUtil.getTickDelta();
        List<PlayerData> playersToRender = new ArrayList<>();

        if (showForSelf.get() && isHoldingChorus(mc.player)) {
            playersToRender.add(new PlayerData(mc.player, getLerpedPlayerPos(mc.player, tickDelta)));
        }

        if (showForOthers.get()) {
            for (PlayerEntity player : mc.world.getPlayers()) {
                if (player == mc.player) continue;
                if (player.squaredDistanceTo(mc.player) > radius.get() * radius.get()) continue;
                if (isHoldingChorus(player)) {
                    playersToRender.add(new PlayerData(player, getLerpedPlayerPos(player, tickDelta)));
                }
            }
        }

        if (showForAttackTarget.get()) {
            var attackAura = Nexis.getFunctionManager().getAttackAura(); if (attackAura != null && attackAura.isState()) { net.minecraft.entity.Entity target = AuraModule.target;
                if (target instanceof PlayerEntity targetPlayer && targetPlayer != mc.player && isHoldingChorus(targetPlayer)) {
                    boolean alreadyAdded = playersToRender.stream().anyMatch(p -> p.player == targetPlayer);
                    if (!alreadyAdded) {
                        playersToRender.add(new PlayerData(targetPlayer, getLerpedPlayerPos(targetPlayer, tickDelta)));
                    }
                }
            }
        }

        if (playersToRender.isEmpty()) {
            return;
        }

        Camera camera = mc.gameRenderer.getCamera();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, event.getTicks(), true);

        try (WorldRenderer renderer = WorldRenderer.begin(
                mc,
                mc.getRenderTickCounter(),
                camera,
                event.getMatrixStack().peek().getPositionMatrix(),
                mc.gameRenderer.getBasicProjectionMatrix(fov))) {

            for (PlayerData playerData : playersToRender) {
                if (modeType.is("Радиусом")) {
                    renderRadius(renderer, playerData.position, camera);
                } else {
                    renderTeleportPositions(renderer, playerData.position, camera);
                }
            }

            renderer.flush();
        }
    }

    private void renderTeleportPositions(WorldRenderer renderer, Vec3d playerPos, Camera camera) {
        List<Vec3d> validPositions = calculateTeleportPositions(playerPos);
        if (validPositions.isEmpty()) {
            return;
        }

        int maxPointsValue = maxPoints.get().intValue();
        if (validPositions.size() > maxPointsValue) {
            validPositions = validPositions.subList(0, maxPointsValue);
        }

        Vec3d cameraPos = camera.getCameraPos();

        if (fillBlocks.get()) {
            int fillAlphaValue = (int) (fillAlpha.get() * 255);
            int fillColor = (fillAlphaValue << 24) | 0x00FF00;

            RenderLayer fillLayer = WorldRenderLayers.POSITION_COLOR_QUADS_NO_DEPTH();
            MatrixStack identity = new MatrixStack();
            WorldGeometryEmitter fillEmitter = new WorldGeometryEmitter(
                    camera,
                    identity.peek(),
                    renderer.getBuffer(fillLayer)
            );

            for (Vec3d pos : validPositions) {
                emitBlockFill(fillEmitter, pos.x - cameraPos.x, pos.y - cameraPos.y, pos.z - cameraPos.z, fillColor);
            }

            renderer.flush();
        }

        if (showOutline.get()) {
            RenderLayer lineLayer = WorldRenderLayers.LINES_NO_DEPTH(2.0);
            WorldGeometryEmitter lineEmitter = renderer.lineEmitter(lineLayer);

            for (Vec3d pos : validPositions) {
                emitBlockOutline(lineEmitter, pos.x - cameraPos.x, pos.y - cameraPos.y, pos.z - cameraPos.z, 0xFF00FF00);
            }

            renderer.flush();
        }
    }

    private void renderRadius(WorldRenderer renderer, Vec3d center, Camera camera) {
        Vec3d cameraPos = camera.getCameraPos();
        float cx = (float) (center.x - cameraPos.x);
        float cy = (float) (center.y - cameraPos.y);
        float cz = (float) (center.z - cameraPos.z);

        if (filledRadius.get()) {
            MatrixStack identity = new MatrixStack();
            WorldGeometryEmitter quadEmitter = new WorldGeometryEmitter(
                    camera,
                    identity.peek(),
                    renderer.getBuffer(WorldRenderLayers.POSITION_COLOR_QUADS_NO_DEPTH())
            );

            float prevX = cx;
            float prevZ = cz;
            boolean hasPrev = false;

            for (int deg = 0; deg <= 360; deg += 5) {
                double rad = Math.toRadians(deg);
                float x = cx + (float) (MathHelper.sin((float) rad) * CHORUS_RADIUS);
                float z = cz + (float) (-MathHelper.cos((float) rad) * CHORUS_RADIUS);

                if (!hasPrev) {
                    prevX = x;
                    prevZ = z;
                    hasPrev = true;
                    continue;
                }

                quadEmitter.emitQuad(
                        new Vec3d(cx, cy, cz),
                        new Vec3d(prevX, cy, prevZ),
                        new Vec3d(x, cy, z),
                        new Vec3d(cx, cy, cz),
                        0x3300FF00, 0x3300FF00, 0x3300FF00, 0x3300FF00
                );

                prevX = x;
                prevZ = z;
            }
        }

        RenderLayer lineLayer = WorldRenderLayers.LINES_NO_DEPTH(5.0);
        WorldGeometryEmitter lineEmitter = renderer.lineEmitter(lineLayer);

        float firstX = 0.0f;
        float firstZ = 0.0f;
        float prevX = 0.0f;
        float prevZ = 0.0f;
        boolean hasPrev = false;

        for (int deg = 0; deg <= 360; deg += 5) {
            double rad = Math.toRadians(deg);
            float x = cx + (float) (MathHelper.sin((float) rad) * CHORUS_RADIUS);
            float z = cz + (float) (-MathHelper.cos((float) rad) * CHORUS_RADIUS);

            if (!hasPrev) {
                firstX = x;
                firstZ = z;
                prevX = x;
                prevZ = z;
                hasPrev = true;
                continue;
            }

            lineEmitter.emitLine(new Vec3d(prevX, cy, prevZ), new Vec3d(x, cy, z), 0xFF00FF00);
            prevX = x;
            prevZ = z;
        }

        if (hasPrev) {
            lineEmitter.emitLine(new Vec3d(prevX, cy, prevZ), new Vec3d(firstX, cy, firstZ), 0xFF00FF00);
        }
    }

    private List<Vec3d> calculateTeleportPositions(Vec3d playerPos) {
        List<Vec3d> positions = new ArrayList<>();

        int playerBlockX = (int) Math.floor(playerPos.x);
        int playerBlockY = (int) Math.floor(playerPos.y);
        int playerBlockZ = (int) Math.floor(playerPos.z);

        for (int x = playerBlockX - CHORUS_RADIUS; x <= playerBlockX + CHORUS_RADIUS; x++) {
            for (int y = playerBlockY - CHORUS_RADIUS; y <= playerBlockY + CHORUS_RADIUS; y++) {
                for (int z = playerBlockZ - CHORUS_RADIUS; z <= playerBlockZ + CHORUS_RADIUS; z++) {
                    BlockPos pos = new BlockPos(x, y, z);
                    if (isValidTeleportPosition(pos, playerPos)) {
                        positions.add(new Vec3d(x + 0.5, y, z + 0.5));
                    }
                }
            }
        }

        return positions;
    }

    private boolean isValidTeleportPosition(BlockPos pos, Vec3d playerPos) {
        if (mc.world == null) return false;

        double distanceSq = playerPos.squaredDistanceTo(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5);
        if (distanceSq > CHORUS_RADIUS * CHORUS_RADIUS) {
            return false;
        }

        BlockState state = mc.world.getBlockState(pos);
        BlockState aboveState = mc.world.getBlockState(pos.up());

        if (!state.getFluidState().isEmpty() || !aboveState.getFluidState().isEmpty()) {
            return false;
        }

        if (!state.isAir() && !state.isReplaceable()) {
            return false;
        }

        if (!aboveState.isAir() && !aboveState.isReplaceable()) {
            return false;
        }

        BlockPos below = pos.down();
        BlockState belowState = mc.world.getBlockState(below);
        return !belowState.isAir() && !belowState.isReplaceable();
    }

    private void emitBlockFill(WorldGeometryEmitter emitter, double x, double y, double z, int color) {
        double minX = x - 0.5;
        double minY = y;
        double minZ = z - 0.5;
        double maxX = x + 0.5;
        double maxY = y + CHORUS_HEIGHT;
        double maxZ = z + 0.5;

        Vec3d p000 = new Vec3d(minX, minY, minZ);
        Vec3d p001 = new Vec3d(minX, minY, maxZ);
        Vec3d p010 = new Vec3d(minX, maxY, minZ);
        Vec3d p011 = new Vec3d(minX, maxY, maxZ);
        Vec3d p100 = new Vec3d(maxX, minY, minZ);
        Vec3d p101 = new Vec3d(maxX, minY, maxZ);
        Vec3d p110 = new Vec3d(maxX, maxY, minZ);
        Vec3d p111 = new Vec3d(maxX, maxY, maxZ);

        emitter.emitQuad(p000, p100, p110, p010, color, color, color, color);
        emitter.emitQuad(p001, p011, p111, p101, color, color, color, color);
        emitter.emitQuad(p000, p001, p101, p100, color, color, color, color);
        emitter.emitQuad(p010, p110, p111, p011, color, color, color, color);
        emitter.emitQuad(p000, p010, p011, p001, color, color, color, color);
        emitter.emitQuad(p100, p101, p111, p110, color, color, color, color);
    }

    private void emitBlockOutline(WorldGeometryEmitter emitter, double x, double y, double z, int color) {
        double minX = x - 0.5;
        double minY = y;
        double minZ = z - 0.5;
        double maxX = x + 0.5;
        double maxY = y + CHORUS_HEIGHT;
        double maxZ = z + 0.5;

        Vec3d p000 = new Vec3d(minX, minY, minZ);
        Vec3d p001 = new Vec3d(minX, minY, maxZ);
        Vec3d p010 = new Vec3d(minX, maxY, minZ);
        Vec3d p011 = new Vec3d(minX, maxY, maxZ);
        Vec3d p100 = new Vec3d(maxX, minY, minZ);
        Vec3d p101 = new Vec3d(maxX, minY, maxZ);
        Vec3d p110 = new Vec3d(maxX, maxY, minZ);
        Vec3d p111 = new Vec3d(maxX, maxY, maxZ);

        emitter.emitLine(p000, p100, color);
        emitter.emitLine(p100, p101, color);
        emitter.emitLine(p101, p001, color);
        emitter.emitLine(p001, p000, color);

        emitter.emitLine(p010, p110, color);
        emitter.emitLine(p110, p111, color);
        emitter.emitLine(p111, p011, color);
        emitter.emitLine(p011, p010, color);

        emitter.emitLine(p000, p010, color);
        emitter.emitLine(p100, p110, color);
        emitter.emitLine(p101, p111, color);
        emitter.emitLine(p001, p011, color);
    }

    private boolean isHoldingChorus(PlayerEntity player) {
        if (player == null) return false;
        var main = player.getMainHandStack();
        var off = player.getOffHandStack();
        return (!main.isEmpty() && main.isOf(Items.CHORUS_FRUIT)) ||
                (!off.isEmpty() && off.isOf(Items.CHORUS_FRUIT));
    }

    private Vec3d getLerpedPlayerPos(PlayerEntity player, float tickDelta) {
        if (player == null) return Vec3d.ZERO;
        double x = player.lastRenderX + (player.getX() - player.lastRenderX) * tickDelta;
        double y = player.lastRenderY + (player.getY() - player.lastRenderY) * tickDelta;
        double z = player.lastRenderZ + (player.getZ() - player.lastRenderZ) * tickDelta;
        return new Vec3d(x, y, z);
    }

    private record PlayerData(PlayerEntity player, Vec3d position) {
    }
}



