package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.entity.EventJump;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.color.basic.ColorUtils;
import fun.nexisdlc.client.utils.render.easy.RenderUtil;
import fun.nexisdlc.client.utils.render.main.world.WorldGeometryEmitter;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderLayers;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderer;
import fun.nexisdlc.mixins.accessors.GameRendererAccessor;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

@FunctionAdd(name = "JumpCircle", alias = "Jump Circle", category = Category.Render, description = "Круги под ногами при прыжке и приземлении")
public class JumpCircle extends Function {
    private static final Identifier CIRCLE_TEXTURE = Identifier.of("nexis", "images/jumpcircle/circle.png");
    private static final long LIFE_TIME_MS = 3200L;
    private static final int MAX_CIRCLES = 64;
    private static final int MIN_RENDER_BUDGET = 8;
    private static final int MAX_RENDER_BUDGET = 34;
    private static final double MAX_RENDER_DISTANCE_SQ = 85.0 * 85.0;

    private final SliderSetting radius = new SliderSetting("Размер", 1f, 1, 4f, 0.1f);
    private final SliderSetting transparency = new SliderSetting("Прозрачность", 1f, 0.1f, 1f, 0.05f);
    private final SliderSetting animationSpeed = new SliderSetting("Скорость анимации", 1f, 1f, 3f, 0.1f);

    private final List<Circle> circles = new ArrayList<>();
    private final MatrixStack identityStack = new MatrixStack();

    public JumpCircle() {
        addSettings(radius, transparency, animationSpeed);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        circles.clear();
    }

    @Override
    public void onDisable() {
        super.onDisable();
        circles.clear();
    }

    @EventHandler
    public void onJump(EventJump event) {
        if (nullCheck()) {
            return;
        }
        Vec3d pos = mc.player.getEntityPos().add(0.0, 0.01, 0.0);
        long now = System.currentTimeMillis();
        circles.add(new Circle(pos, now, 1.0f));
        circles.add(new Circle(pos, now, 0.8f));
        trimCircles();
    }

    @EventHandler
    public void onRender3D(EventRender.World event) {
        if (nullCheck() || circles.isEmpty()) {
            return;
        }

        long now = System.currentTimeMillis();
        Camera camera = mc.gameRenderer.getCamera();
        float tickDelta = event.getTicks();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, tickDelta, true);

        float speed = Math.max(0.1f, animationSpeed.get());
        float maxRadius = Math.max(0.05f, radius.get());
        float alphaMultiplier = MathHelper.clamp(transparency.get() * 1.15f, 0.1f, 1f);
        float durationMs = LIFE_TIME_MS / speed;
        Vec3d cameraPos = camera.getCameraPos();
        int renderBudget = computeRenderBudget(mc.getCurrentFps());

        int circleColor = ClientColors.ICON.getRGB();

        List<RenderEntry> entries = new ArrayList<>(Math.min(circles.size(), renderBudget));
        for (int i = circles.size() - 1; i >= 0; i--) {
            Circle circle = circles.get(i);
            long lifeTime = now - circle.spawnMs;
            if (lifeTime > LIFE_TIME_MS) {
                circles.remove(i);
                continue;
            }

            if (cameraPos.squaredDistanceTo(circle.position) > MAX_RENDER_DISTANCE_SQ) {
                continue;
            }

            float progress = MathHelper.clamp(lifeTime / durationMs, 0f, 1f);
            float currentRadius = circOut(progress) * maxRadius;

            float fadeIn = Math.min(progress * 2f, 1f);
            float fadeOut = 1f - Math.max((lifeTime - 1600f) / 1600f, 0f);
            float finalFade = Math.min(fadeIn, fadeOut);

            int alpha = MathHelper.clamp((int) (255f * finalFade * alphaMultiplier * circle.alphaScale), 0, 255);
            if (alpha <= 0) {
                continue;
            }

            entries.add(new RenderEntry(circle.position, currentRadius, alpha));
            if (entries.size() >= renderBudget) {
                break;
            }
        }
        if (entries.isEmpty()) {
            return;
        }

        try (WorldRenderer renderer = WorldRenderer.begin(
                mc,
                mc.getRenderTickCounter(),
                camera,
                event.getMatrixStack().peek().getPositionMatrix(),
                mc.gameRenderer.getBasicProjectionMatrix(fov))) {
            RenderUtil.enableBlend();
            RenderUtil.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
            renderEntries(renderer, camera, cameraPos, entries, circleColor, circleColor, circleColor, circleColor);

            renderer.flush();
            RenderUtil.defaultBlendFunc();
        }
    }

    private void renderEntries(WorldRenderer renderer,
                               Camera camera,
                               Vec3d cameraPos,
                               List<RenderEntry> entries,
                               int base0, int base1, int base2, int base3) {
        RenderLayer layer = WorldRenderLayers.TEXTURED_QUADS_ADDITIVE(CIRCLE_TEXTURE);
        VertexConsumer consumer = renderer.getBuffer(layer);
        WorldGeometryEmitter emitter = new WorldGeometryEmitter(camera, identityStack.peek(), consumer);

        for (RenderEntry entry : entries) {
            int c0 = withAlpha(base0, entry.alpha);
            int c1 = withAlpha(base1, entry.alpha);
            int c2 = withAlpha(base2, entry.alpha);
            int c3 = withAlpha(base3, entry.alpha);
            emitCircle(emitter, cameraPos, entry.position, entry.radius, c0, c1, c2, c3);
        }
    }

    private int animatedBaseColor(long now, int offset) {
        int start = ClientColors.GRADIENT_START.getRGB();
        int end = ClientColors.GRADIENT_END.getRGB();
        float time = (now + (offset * 35L)) / 340.0f;
        float blend = (float) ((Math.sin(time) + 1.0) * 0.5);
        return ColorUtils.interpolate(start, end, blend);
    }

    private static int withAlpha(int color, int alpha) {
        return ColorUtils.injectAlpha(color, alpha);
    }

    private void trimCircles() {
        int overflow = circles.size() - MAX_CIRCLES;
        if (overflow <= 0) {
            return;
        }
        circles.subList(0, overflow).clear();
    }

    private static int computeRenderBudget(int fps) {
        if (fps <= 0) {
            return 14;
        }
        if (fps <= 45) {
            return MIN_RENDER_BUDGET;
        }
        if (fps >= 180) {
            return MAX_RENDER_BUDGET;
        }
        float t = (fps - 45f) / (180f - 45f);
        return MathHelper.clamp((int) (MIN_RENDER_BUDGET + t * (MAX_RENDER_BUDGET - MIN_RENDER_BUDGET)), MIN_RENDER_BUDGET, MAX_RENDER_BUDGET);
    }

    private static void emitCircle(WorldGeometryEmitter emitter,
                                   Vec3d cameraPos,
                                   Vec3d position,
                                   float radius,
                                   int c0, int c1, int c2, int c3) {
        float half = radius * 0.5f;
        double minX = position.x - half;
        double minZ = position.z - half;
        double maxX = position.x + half;
        double maxZ = position.z + half;
        double y = position.y;

        Vec3d v0 = new Vec3d(minX, y, minZ).subtract(cameraPos);
        Vec3d v1 = new Vec3d(maxX, y, minZ).subtract(cameraPos);
        Vec3d v2 = new Vec3d(maxX, y, maxZ).subtract(cameraPos);
        Vec3d v3 = new Vec3d(minX, y, maxZ).subtract(cameraPos);

        emitter.emitTexturedQuad(
                v0, v1, v2, v3,
                0f, 0f,
                1f, 0f,
                1f, 1f,
                0f, 1f,
                c0, c1, c2, c3
        );
    }

    private static float circOut(float value) {
        float t = MathHelper.clamp(value, 0f, 1f);
        float p = t - 1f;
        return (float) Math.sqrt(1f - (p * p));
    }

    private static final class Circle {
        private final Vec3d position;
        private final long spawnMs;
        private final float alphaScale;

        private Circle(Vec3d position, long spawnMs, float alphaScale) {
            this.position = position;
            this.spawnMs = spawnMs;
            this.alphaScale = alphaScale;
        }
    }

    private static final class RenderEntry {
        private final Vec3d position;
        private final float radius;
        private final int alpha;

        private RenderEntry(Vec3d position, float radius, int alpha) {
            this.position = position;
            this.radius = radius;
            this.alpha = alpha;
        }
    }
}
