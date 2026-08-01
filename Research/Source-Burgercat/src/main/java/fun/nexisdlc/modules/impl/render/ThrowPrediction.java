package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.player.rotation.RotationTask;
import fun.nexisdlc.client.utils.render.easy.RenderUtil;
import fun.nexisdlc.client.utils.render.main.world.WorldCircleRenderer;
import fun.nexisdlc.client.utils.render.main.world.WorldGeometryEmitter;
import fun.nexisdlc.client.utils.render.main.world.WorldLineRenderer;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderLayers;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderer;
import fun.nexisdlc.mixins.accessors.GameRendererAccessor;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;

import java.util.ArrayList;
import java.util.List;

@FunctionAdd(name = "ThrowPrediction", alias = "Throw Prediction", category = Category.Render, description = "Предсказывает точку падения вашего броска / выстрела")
public class ThrowPrediction extends Function {

    private static final int MAX_STEPS = 240;
    private static final double SPLASH_RADIUS = 2.2;
    private static final double RETICLE_RADIUS = 0.45;
    private static final double SURFACE_OFFSET = 0.02;     // отступ от блока, чтобы не было z-fight
    private static final double MULTISHOT_SPREAD_DEG = 10.0; // ванильный разброс мультишота
    private static final int COLOR_HIT = 0xCC4BFF4B;       // зелёный — попадаем по таргету
    private static final int COLOR_MISS = 0xCCFF4B4B;      // красный — мимо

    private enum Mode {NONE, PROJECTILE, POTION}

    private final BooleanSetting showProjectile = new BooleanSetting("Снаряды", true);
    private final BooleanSetting showPotions = new BooleanSetting("Зелья", true);
    private final SliderSetting lineWidth = new SliderSetting("Ширина линий", 5.0f, 0.5f, 8.0f, 0.1f);

    public ThrowPrediction() {
        addSettings(showProjectile, showPotions, lineWidth);
    }

    @EventHandler
    public void onRenderWorld(EventRender.World event) {
        if (mc.world == null || mc.player == null || ClientContainer.isHide()) {
            return;
        }

        ItemStack stack = mc.player.getMainHandStack();
        Mode mode = modeFor(stack);
        if (mode == Mode.NONE) {
            stack = mc.player.getOffHandStack();
            mode = modeFor(stack);
        }
        if (mode == Mode.NONE) {
            return;
        }

        List<Simulation> sims = simulateAll(stack, mode);
        if (sims.isEmpty()) {
            return;
        }

        double px = lineWidth.get().doubleValue();

        Camera camera = mc.gameRenderer.getCamera();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, event.getTicks(), true);
        Vec3d cameraPos = camera.getCameraPos();

        try (WorldRenderer renderer = WorldRenderer.begin(
                mc,
                mc.getRenderTickCounter(),
                camera,
                event.getMatrixStack().peek().getPositionMatrix(),
                mc.gameRenderer.getBasicProjectionMatrix(fov))) {

            WorldGeometryEmitter emitter = new WorldGeometryEmitter(
                    camera, new MatrixStack().peek(),
                    renderer.getBuffer(WorldRenderLayers.POSITION_COLOR_QUADS_ALPHA_SRC_ONE_NO_DEPTH()));

            for (Simulation sim : sims) {
                if (sim.path.size() < 2) {
                    continue;
                }
                boolean hit = mode == Mode.POTION
                        ? hasTargetInRadius(sim.impact, SPLASH_RADIUS)
                        : sim.entityHit;
                int color = hit ? COLOR_HIT : COLOR_MISS;

                if (mode == Mode.POTION) {
                    // область действия — кольцо на земле
                    WorldCircleRenderer.circleHorizontal(emitter, sim.impact, SPLASH_RADIUS, cameraPos, color, px);
                } else {
                    // снаряд — кольцо + прицел. Плоскость: по нормали блока/хитбокса, иначе биллборд
                    Vec3d center;
                    Vec3d planeNormal;
                    if (sim.normal != null) {
                        planeNormal = sim.normal;
                        center = sim.impact.add(planeNormal.multiply(SURFACE_OFFSET));
                    } else {
                        planeNormal = sim.impact.subtract(cameraPos);
                        center = sim.impact;
                    }
                    WorldCircleRenderer.circle(emitter, center, RETICLE_RADIUS, planeNormal,
                            WorldCircleRenderer.DEFAULT_SEGMENTS, cameraPos, color, px);
                    crosshairInPlane(emitter, center, planeNormal, RETICLE_RADIUS, cameraPos, color, px);
                }
            }
            renderer.flush();
        } catch (Throwable ignored) {
        }
    }

    private Mode modeFor(ItemStack stack) {
        if (stack == null || stack.isEmpty()) {
            return Mode.NONE;
        }
        var item = stack.getItem();
        if (item == Items.SPLASH_POTION) {
            return showPotions.get() ? Mode.POTION : Mode.NONE;
        }
        if (item == Items.ENDER_PEARL || item == Items.SNOWBALL || item == Items.EGG
                || item == Items.BOW || item == Items.CROSSBOW || item == Items.TRIDENT) {
            return showProjectile.get() ? Mode.PROJECTILE : Mode.NONE;
        }
        return Mode.NONE;
    }

    /**
     * Все траектории выстрела: арбалет с Multishot — три (разброс ±10°), иначе одна.
     */
    private List<Simulation> simulateAll(ItemStack stack, Mode mode) {
        ShotParams params = paramsFor(stack);
        if (params == null) {
            return List.of();
        }
        List<Double> yawOffsets = new ArrayList<>();
        if (stack.getItem() == Items.CROSSBOW && hasMultishot(stack)) {
            yawOffsets.add(-MULTISHOT_SPREAD_DEG);
            yawOffsets.add(0.0);
            yawOffsets.add(MULTISHOT_SPREAD_DEG);
        } else {
            yawOffsets.add(0.0);
        }
        List<Simulation> out = new ArrayList<>();
        for (double yawOffset : yawOffsets) {
            Simulation sim = simulateShot(params, yawOffset);
            if (sim != null && sim.path.size() >= 2) {
                out.add(sim);
            }
        }
        return out;
    }

    /**
     * Параметры выстрела/броска для предмета, или null если не поддерживается.
     */
    private ShotParams paramsFor(ItemStack stack) {
        var item = stack.getItem();
        if (item == Items.SPLASH_POTION) {
            return new ShotParams(0.5, 0.05, -20.0);
        }
        if (item == Items.ENDER_PEARL || item == Items.SNOWBALL || item == Items.EGG) {
            return new ShotParams(1.5, 0.03, 0.0);
        }
        if (item == Items.BOW) {
            return new ShotParams(3.0 * pull(stack), 0.05, 0.0);
        }
        if (item == Items.CROSSBOW) {
            return new ShotParams(3.15, 0.05, 0.0);
        }
        if (item == Items.TRIDENT) {
            return new ShotParams(2.5 * pull(stack), 0.05, 0.0);
        }
        return null;
    }

    /**
     * Есть ли на предмете чар Multishot.
     */
    private boolean hasMultishot(ItemStack stack) {
        try {
            for (var entry : EnchantmentHelper.getEnchantments(stack).getEnchantments()) {
                if (entry.matchesKey(Enchantments.MULTISHOT)) {
                    return true;
                }
            }
        } catch (Throwable ignored) {
        }
        return false;
    }

    /**
     * Одна траектория с заданным смещением yaw (для мультишота).
     */
    private Simulation simulateShot(ShotParams params, double yawOffsetDeg) {
        double speed = params.speed;
        if (speed < 0.05) {
            return null;
        }
        double gravity = params.gravity;

        float yawDeg = RotationTask.getRenderYaw();
        float pitchDeg = RotationTask.getRenderPitch();
        double yaw = Math.toRadians(yawDeg + yawOffsetDeg);
        double pitch = Math.toRadians(pitchDeg);
        double fx = -Math.sin(yaw) * Math.cos(pitch);
        double fy = -Math.sin(Math.toRadians(pitchDeg + params.rollDeg));
        double fz = Math.cos(yaw) * Math.cos(pitch);
        Vec3d dir = new Vec3d(fx, fy, fz);
        if (dir.lengthSquared() < 1.0E-9) {
            return null;
        }
        // БЕЗ учёта скорости игрока — чтобы предикт не дёргался при ходьбе
        Vec3d motion = dir.normalize().multiply(speed);

        float tickDelta = RenderUtil.getTickDelta();
        Vec3d pos = mc.player.getCameraPosVec(tickDelta);
        List<Vec3d> path = new ArrayList<>();
        path.add(pos);

        for (int i = 0; i < MAX_STEPS; i++) {
            Vec3d prev = pos;
            pos = pos.add(motion);

            // ближайшее попадание по блоку на этом шаге
            HitResult ray = mc.world.raycast(new RaycastContext(
                    prev, pos, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, mc.player));
            double blockSq = ray.getType() == HitResult.Type.BLOCK
                    ? prev.squaredDistanceTo(ray.getPos()) : Double.MAX_VALUE;

            // ближайшее попадание по хитбоксу энтити (с нормалью грани, как у стены)
            BoxHit entHit = nearestEntityBoxHit(prev, pos);
            double entSq = entHit != null ? prev.squaredDistanceTo(entHit.point) : Double.MAX_VALUE;

            if (entHit != null && entSq <= blockSq) {
                path.add(entHit.point);
                return new Simulation(path, entHit.point, true, entHit.normal);
            }
            if (ray.getType() == HitResult.Type.BLOCK) {
                Vec3d hitPos = ray.getPos();
                Vec3d normal = ray instanceof BlockHitResult bhr ? Vec3d.of(bhr.getSide().getVector()) : null;
                path.add(hitPos);
                return new Simulation(path, hitPos, false, normal);
            }

            path.add(pos);
            motion = applyMotion(motion, pos, gravity, 0.99);
            if (pos.y < -128.0 || pos.y > 512.0) {
                break;
            }
        }
        return new Simulation(path, pos, false, null);
    }

    /**
     * Прогресс натяжения лука/трезубца (0..1). Если не натягиваем — считаем полным.
     */
    private double pull(ItemStack stack) {
        if (mc.player.isUsingItem() && mc.player.getActiveItem() == stack) {
            int used = 72000 - mc.player.getItemUseTimeLeft();
            double f = used / 20.0;
            f = (f * f + f * 2.0) / 3.0;
            return Math.max(0.05, Math.min(1.0, f));
        }
        return 1.0;
    }

    private Vec3d applyMotion(Vec3d motion, Vec3d pos, double gravity, double drag) {
        boolean inWater = mc.world.getBlockState(BlockPos.ofFloored(pos)).getFluidState().isIn(FluidTags.WATER);
        double d = inWater ? drag * 0.8 : drag;
        return motion.multiply(d).add(0.0, -gravity, 0.0);
    }

    /**
     * Ближайшее пересечение отрезка с AABB живого энтити + нормаль грани.
     */
    private BoxHit nearestEntityBoxHit(Vec3d from, Vec3d to) {
        Box segment = new Box(from, to).expand(0.3);
        List<LivingEntity> found = mc.world.getEntitiesByClass(LivingEntity.class, segment,
                e -> e != mc.player && e.isAlive() && !e.isSpectator());
        BoxHit best = null;
        double bestSq = Double.MAX_VALUE;
        for (LivingEntity e : found) {
            BoxHit hit = raycastBox(e.getBoundingBox(), from, to);
            if (hit == null) {
                continue;
            }
            double sq = from.squaredDistanceTo(hit.point);
            if (sq < bestSq) {
                bestSq = sq;
                best = hit;
            }
        }
        return best;
    }

    /**
     * Ray vs AABB (slab-метод): возвращает точку входа и нормаль грани, или null.
     */
    private BoxHit raycastBox(Box box, Vec3d from, Vec3d to) {
        double dx = to.x - from.x;
        double dy = to.y - from.y;
        double dz = to.z - from.z;

        double tEnter = 0.0;
        double tExit = 1.0;
        Vec3d normal = new Vec3d(0.0, 1.0, 0.0);

        double[] sx = slab(from.x, dx, box.minX, box.maxX);
        if (sx == null) return null;
        if (sx[0] > tEnter) {
            tEnter = sx[0];
            normal = new Vec3d(dx > 0 ? -1.0 : 1.0, 0.0, 0.0);
        }
        tExit = Math.min(tExit, sx[1]);
        if (tEnter > tExit) return null;

        double[] sy = slab(from.y, dy, box.minY, box.maxY);
        if (sy == null) return null;
        if (sy[0] > tEnter) {
            tEnter = sy[0];
            normal = new Vec3d(0.0, dy > 0 ? -1.0 : 1.0, 0.0);
        }
        tExit = Math.min(tExit, sy[1]);
        if (tEnter > tExit) return null;

        double[] sz = slab(from.z, dz, box.minZ, box.maxZ);
        if (sz == null) return null;
        if (sz[0] > tEnter) {
            tEnter = sz[0];
            normal = new Vec3d(0.0, 0.0, dz > 0 ? -1.0 : 1.0);
        }
        tExit = Math.min(tExit, sz[1]);
        if (tEnter > tExit) return null;

        if (tEnter < 0.0 || tEnter > 1.0) {
            return null;
        }
        Vec3d point = new Vec3d(from.x + dx * tEnter, from.y + dy * tEnter, from.z + dz * tEnter);
        return new BoxHit(point, normal);
    }

    /**
     * Один slab: {tEnter, tExit} или null если луч промахивается мимо этой оси.
     */
    private double[] slab(double start, double dir, double min, double max) {
        if (Math.abs(dir) < 1.0E-9) {
            if (start < min || start > max) {
                return null;
            }
            return new double[]{Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY};
        }
        double t1 = (min - start) / dir;
        double t2 = (max - start) / dir;
        return new double[]{Math.min(t1, t2), Math.max(t1, t2)};
    }

    private boolean hasTargetInRadius(Vec3d center, double radius) {
        Box area = new Box(
                center.x - radius, center.y - radius, center.z - radius,
                center.x + radius, center.y + radius, center.z + radius);
        double radiusSq = radius * radius;
        List<LivingEntity> found = mc.world.getEntitiesByClass(LivingEntity.class, area,
                e -> e != mc.player && e.isAlive() && !e.isSpectator());
        for (LivingEntity e : found) {
            if (e.getEntityPos().squaredDistanceTo(center) <= radiusSq) {
                return true;
            }
        }
        return false;
    }

    /**
     * Прицел (две линии крестом) в заданной плоскости.
     */
    private void crosshairInPlane(WorldGeometryEmitter emitter, Vec3d center, Vec3d planeNormal, double radius,
                                  Vec3d cameraPos, int color, double px) {
        double nl = planeNormal.length();
        Vec3d n = nl < 1.0E-9 ? new Vec3d(0.0, 0.0, 1.0) : planeNormal.multiply(1.0 / nl);
        Vec3d helper = Math.abs(n.y) > 0.99 ? new Vec3d(1.0, 0.0, 0.0) : new Vec3d(0.0, 1.0, 0.0);
        Vec3d u = n.crossProduct(helper);
        if (u.lengthSquared() < 1.0E-9) {
            u = new Vec3d(1.0, 0.0, 0.0);
        }
        u = u.normalize();
        Vec3d v = n.crossProduct(u).normalize();
        WorldLineRenderer.line(emitter, center.subtract(u.multiply(radius)), center.add(u.multiply(radius)), cameraPos, color, px);
        WorldLineRenderer.line(emitter, center.subtract(v.multiply(radius)), center.add(v.multiply(radius)), cameraPos, color, px);
    }

    private record Simulation(List<Vec3d> path, Vec3d impact, boolean entityHit, Vec3d normal) {
    }

    private record BoxHit(Vec3d point, Vec3d normal) {
    }

    private record ShotParams(double speed, double gravity, double rollDeg) {
    }
}
