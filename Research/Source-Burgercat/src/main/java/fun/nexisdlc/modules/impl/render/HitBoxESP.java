package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.color.basic.ColorUtils;
import fun.nexisdlc.client.utils.render.easy.RenderUtil;
import fun.nexisdlc.client.utils.render.main.world.WorldGeometryEmitter;
import fun.nexisdlc.client.utils.render.main.world.WorldLineRenderer;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderLayers;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderer;
import fun.nexisdlc.mixins.accessors.GameRendererAccessor;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ColorSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

@FunctionAdd(name = "HitBoxESP", alias = "Hit Box ESP", category = Category.Render, description = "Рисует хитбоксы игроков в мире")
public class HitBoxESP extends Function {

    private static final double BOX_EXPAND = 0.01;
    private static final double MAX_DISTANCE_SQ = 140.0 * 140.0;
    private static final double GLOW_WIDTH_MULT = 2.2;
    private static final int GLOW_ALPHA = 145;
    private static final float GLOW_FILL_ALPHA = 0.24f;

    private final ModeSetting colorMode = new ModeSetting("Цвет", "Из темы", "Из темы", "Свой");
    private final ColorSetting customColor = new ColorSetting("Свой цвет", new Color(133, 166, 255, 255).getRGB())
            .setVisible(() -> colorMode.is("Свой"));
    private final BooleanSetting filled = new BooleanSetting("Заливка", true);
    private final BooleanSetting glow = new BooleanSetting("Свечение", true);
    private final SliderSetting fillAlpha = new SliderSetting("Прозрачность заливки", 0.38f, 0.05f, 1.0f, 0.05f);
    private final SliderSetting lineWidth = new SliderSetting("Ширина линий", 2.20f, 0.5f, 8.0f, 0.1f);

    public HitBoxESP() {
        addSettings(colorMode, customColor, filled, glow, fillAlpha, lineWidth);
    }

    @EventHandler
    public void onRenderWorld(EventRender.World event) {
        if (nullCheck() || mc.player == null || mc.world == null) {
            return;
        }

        Camera camera = mc.gameRenderer.getCamera();
        float tickDelta = RenderUtil.getTickDelta();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, event.getTicks(), true);
        Matrix4f positionMatrix = new Matrix4f(event.getMatrixStack().peek().getPositionMatrix());
        Matrix4f projectionMatrix = new Matrix4f(mc.gameRenderer.getBasicProjectionMatrix(fov));
        Vec3d cameraPos = camera.getCameraPos();

        List<RenderEntry> entries = collectEntries(tickDelta);
        if (entries.isEmpty()) {
            return;
        }

        double px = lineWidth.get().doubleValue(); // толщина линии в пикселях

        try (WorldRenderer renderer = WorldRenderer.begin(
                mc,
                mc.getRenderTickCounter(),
                camera,
                positionMatrix,
                projectionMatrix)) {

            if (filled.get()) {
                renderNormalFill(renderer, entries, cameraPos);
            }

            // 1. Свечение — те же рёбра, шире и тусклее, blend GL alpha src one
            if (glow.get()) {
                WorldGeometryEmitter glowEmitter = new WorldGeometryEmitter(
                        camera, new MatrixStack().peek(),
                        renderer.getBuffer(WorldRenderLayers.POSITION_COLOR_QUADS_ALPHA_SRC_ONE_NO_DEPTH()));
                for (RenderEntry entry : entries) {
                    int glowColor = ColorUtils.injectAlpha(entry.color(), GLOW_ALPHA);
                    WorldLineRenderer.box(glowEmitter, entry.worldBox(), cameraPos, glowColor, px * GLOW_WIDTH_MULT);
                }
                renderer.flush();
            }

            // 2. Обводка — настоящие линии (quad-ленты), blend GL alpha src one
            WorldGeometryEmitter outlineEmitter = new WorldGeometryEmitter(
                    camera, new MatrixStack().peek(),
                    renderer.getBuffer(WorldRenderLayers.POSITION_COLOR_QUADS_ALPHA_SRC_ONE_NO_DEPTH()));
            for (RenderEntry entry : entries) {
                WorldLineRenderer.box(outlineEmitter, entry.worldBox(), cameraPos, entry.color(), px);
            }
            renderer.flush();
        }
    }

    private List<RenderEntry> collectEntries(float tickDelta) {
        List<RenderEntry> entries = new ArrayList<>();
        for (PlayerEntity player : mc.world.getPlayers()) {
            if (!shouldRender(player)) {
                continue;
            }
            Box worldBox = getInterpolatedBoundingBox(player, tickDelta).expand(BOX_EXPAND);
            int color = getPlayerColor(player);
            entries.add(new RenderEntry(worldBox, color));
        }
        return entries;
    }

    private void renderNormalFill(WorldRenderer renderer, List<RenderEntry> entries, Vec3d cameraPos) {
        WorldGeometryEmitter fillEmitter = new WorldGeometryEmitter(
                mc.gameRenderer.getCamera(),
                new MatrixStack().peek(),
                renderer.getBuffer(WorldRenderLayers.POSITION_COLOR_QUADS_ADDITIVE_NO_DEPTH()));
        for (RenderEntry entry : entries) {
            emitFilledBox(fillEmitter, entry.worldBox().offset(-cameraPos.x, -cameraPos.y, -cameraPos.z), entry.color());
        }
        renderer.flush();

        WorldGeometryEmitter glowFillEmitter = new WorldGeometryEmitter(
                mc.gameRenderer.getCamera(),
                new MatrixStack().peek(),
                renderer.getBuffer(WorldRenderLayers.POSITION_COLOR_QUADS_ADDITIVE_NO_DEPTH()));
        for (RenderEntry entry : entries) {
            emitGlowFilledBox(glowFillEmitter, entry.worldBox().offset(-cameraPos.x, -cameraPos.y, -cameraPos.z), entry.color());
        }
        renderer.flush();
    }

    private boolean shouldRender(PlayerEntity player) {
        if (player == null || player == mc.player || !player.isAlive() || player.isSpectator()) {
            return false;
        }
        return mc.player.squaredDistanceTo(player) <= MAX_DISTANCE_SQ;
    }

    private Box getInterpolatedBoundingBox(PlayerEntity player, float tickDelta) {
        double x = player.lastRenderX + (player.getX() - player.lastRenderX) * tickDelta;
        double y = player.lastRenderY + (player.getY() - player.lastRenderY) * tickDelta;
        double z = player.lastRenderZ + (player.getZ() - player.lastRenderZ) * tickDelta;
        double halfWidth = player.getWidth() * 0.5;
        return new Box(
                x - halfWidth,
                y,
                z - halfWidth,
                x + halfWidth,
                y + player.getHeight(),
                z + halfWidth
        );
    }

    private record RenderEntry(Box worldBox, int color) {
    }

    private int getPlayerColor(PlayerEntity player) {
        if (Nexis.getInstance().getFriendStorage().isFriend(player.getName().getString())) {
            return new Color(27, 224, 27, 255).getRGB();
        }
        if (colorMode.is("Свой")) {
            return customColor.get();
        }
        return ClientColors.ICON.getRGB();
    }

    private void emitFilledBox(WorldGeometryEmitter emitter, Box box, int color) {
        int alpha = Math.clamp((int) (fillAlpha.get() * 215f), 0, 255);
        emitBoxQuads(emitter, box, ColorUtils.injectAlpha(color, alpha));
    }

    private void emitGlowFilledBox(WorldGeometryEmitter emitter, Box box, int color) {
        int alpha = Math.max(0, Math.min(255, (int) (GLOW_FILL_ALPHA * 215f)));
        emitBoxQuads(emitter, box, ColorUtils.injectAlpha(color, alpha));
    }

    private void emitBoxQuads(WorldGeometryEmitter emitter, Box box, int color) {
        Vec3d p000 = new Vec3d(box.minX, box.minY, box.minZ);
        Vec3d p001 = new Vec3d(box.minX, box.minY, box.maxZ);
        Vec3d p010 = new Vec3d(box.minX, box.maxY, box.minZ);
        Vec3d p011 = new Vec3d(box.minX, box.maxY, box.maxZ);
        Vec3d p100 = new Vec3d(box.maxX, box.minY, box.minZ);
        Vec3d p101 = new Vec3d(box.maxX, box.minY, box.maxZ);
        Vec3d p110 = new Vec3d(box.maxX, box.maxY, box.minZ);
        Vec3d p111 = new Vec3d(box.maxX, box.maxY, box.maxZ);
        emitter.emitQuad(p000, p100, p110, p010, color, color, color, color);
        emitter.emitQuad(p001, p011, p111, p101, color, color, color, color);
        emitter.emitQuad(p000, p001, p101, p100, color, color, color, color);
        emitter.emitQuad(p010, p110, p111, p011, color, color, color, color);
        emitter.emitQuad(p000, p010, p011, p001, color, color, color, color);
        emitter.emitQuad(p100, p101, p111, p110, color, color, color, color);
    }
}
