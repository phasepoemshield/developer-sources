package pulse.modules.utilities;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ChargedProjectilesComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.joml.Matrix4f;
import pulse.events.WorldRenderEvent;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.module.ModuleRegistry;
import pulse.render.RenderSystemHelper;
import pulse.render.system.ClientPipelines;
import pulse.settings.BooleanSetting;
import pulse.settings.ColorSetting;
import pulse.settings.SettingGroup;
import pulse.settings.SliderSetting;

@ModuleInfo(
    a = "Predictions",
    b = "Показывает траекторию полёта снарядов (жемчуг, стрелы, трезубец, зелья и др.)",
    c = ModuleCategory.UTILITIES
)
public class Predictions extends ClientModule {
    private static final int MAX_STEPS = 220;
    private static final int MARKER_SEGMENTS = 48;

    private final SettingGroup projectileGroup = new SettingGroup("Снаряды");
    private final BooleanSetting arrows = new BooleanSetting("Стрелы", true);
    private final BooleanSetting enderPearls = new BooleanSetting("Эндер-жемчуг", true);
    private final BooleanSetting tridents = new BooleanSetting("Трезубцы", true);
    private final BooleanSetting potions = new BooleanSetting("Зелья и снежки", true);

    private final SettingGroup lineGroup = new SettingGroup("Линия");
    private final SliderSetting lineWidth = new SliderSetting("Толщина линии", 2.0F, 1.0F, 6.0F, 0.25F);
    private final BooleanSetting useClientColor = new BooleanSetting("Цвет клиента", true);
    private final ColorSetting lineColor = new ColorSetting("Цвет линии", new Color(120, 80, 255)).a(() -> !this.useClientColor.a());
    private final BooleanSetting gradient = new BooleanSetting("Градиент", true);
    private final ColorSetting gradientColor;
    private final BooleanSetting fadeOut;
    private final SliderSetting fadeStart;

    private final SettingGroup markerGroup;
    private final BooleanSetting impactMarker;
    private final SliderSetting markerSize;
    private final BooleanSetting markerPulse;
    private final SliderSetting markerPulseSpeed;
    private final ColorSetting hitColor;

    private final List<Predictions.Trajectory> trajectories = new ArrayList<>();

    public Predictions() {
        ColorSetting colorSetting = new ColorSetting("Цвет градиента", new Color(80, 180, 255));
        BooleanSetting booleanSetting = this.gradient;
        Objects.requireNonNull(booleanSetting);
        this.gradientColor = colorSetting.a(booleanSetting::a);

        this.fadeOut = new BooleanSetting("Затухание", true);
        SliderSetting sliderSetting = new SliderSetting("Начало затухания", 0.65F, 0.1F, 0.95F, 0.05F);
        BooleanSetting booleanSetting2 = this.fadeOut;
        Objects.requireNonNull(booleanSetting2);
        this.fadeStart = sliderSetting.a(booleanSetting2::a);

        this.markerGroup = new SettingGroup("Метка падения");
        this.impactMarker = new BooleanSetting("Метка падения", true);
        SliderSetting sliderSetting2 = new SliderSetting("Размер метки", 0.35F, 0.1F, 1.2F, 0.05F);
        BooleanSetting booleanSetting3 = this.impactMarker;
        Objects.requireNonNull(booleanSetting3);
        this.markerSize = sliderSetting2.a(booleanSetting3::a);

        BooleanSetting booleanSetting4 = new BooleanSetting("Пульсация", true);
        BooleanSetting booleanSetting5 = this.impactMarker;
        Objects.requireNonNull(booleanSetting5);
        this.markerPulse = booleanSetting4.a(booleanSetting5::a);
        this.markerPulseSpeed = new SliderSetting("Скорость пульсации", 1.0F, 0.2F, 3.0F, 0.1F)
            .a(() -> this.impactMarker.a() && this.markerPulse.a());

        ColorSetting colorSetting2 = new ColorSetting("Цвет при попадании в цель", new Color(255, 60, 60));
        BooleanSetting booleanSetting6 = this.impactMarker;
        Objects.requireNonNull(booleanSetting6);
        this.hitColor = colorSetting2.a(booleanSetting6::a);
    }

    @EventHandler
    public void onRender(WorldRenderEvent worldRenderEvent) {
        if (c.player == null || c.world == null || c.gameRenderer == null) {
            this.clearPrediction();
            return;
        }

        ItemStack stack = this.currentProjectileStack();
        Predictions.ProjectileType type = this.projectileType(stack);
        if (type == null || !this.isEnabled(type) || !this.isReady(stack, type)) {
            this.clearPrediction();
            return;
        }

        this.simulateAll(worldRenderEvent.tickDelta(), stack, type);
        if (!this.trajectories.isEmpty()) {
            this.render(worldRenderEvent);
        }
    }

    private ItemStack currentProjectileStack() {
        ItemStack main = c.player.getMainHandStack();
        if (Predictions.ProjectileType.from(main) != null) {
            return main;
        }

        ItemStack off = c.player.getOffHandStack();
        return Predictions.ProjectileType.from(off) != null ? off : ItemStack.EMPTY;
    }

    private boolean isEnabled(Predictions.ProjectileType type) {
        if (type == Predictions.ProjectileType.ENDER_PEARL) {
            return this.enderPearls.a();
        } else if (type == Predictions.ProjectileType.TRIDENT) {
            return this.tridents.a();
        } else if (type == Predictions.ProjectileType.ARROW || type == Predictions.ProjectileType.FIREWORK_ROCKET) {
            return this.arrows.a();
        } else {
            return this.potions.a();
        }
    }

    private boolean isReady(ItemStack stack, Predictions.ProjectileType type) {
        Item item = stack.getItem();
        if (item == Items.BOW || item == Items.TRIDENT) {
            // Keep the preview visible while merely holding a bow or trident. The
            // launch calculation below uses the actual charge while drawing and a
            // fully charged preview otherwise, which is how this utility is meant
            // to be used when lining up a throw.
            return true;
        }

        if (item != Items.CROSSBOW) {
            return true;
        }

        ChargedProjectilesComponent comp = (ChargedProjectilesComponent)stack.get(DataComponentTypes.CHARGED_PROJECTILES);
        return comp != null && !comp.isEmpty();
    }

    private boolean isActivelyUsing(ItemStack stack) {
        return c.player.isUsingItem() && c.player.getActiveItem().getItem() == stack.getItem();
    }

    private Predictions.ProjectileType projectileType(ItemStack stack) {
        Predictions.ProjectileType heldType = Predictions.ProjectileType.from(stack);
        if (heldType == null || stack.getItem() != Items.CROSSBOW) {
            return heldType;
        }

        ChargedProjectilesComponent charged = stack.get(DataComponentTypes.CHARGED_PROJECTILES);
        if (charged == null || charged.isEmpty()) {
            return heldType;
        }

        // A crossbow itself is not the projectile. Its loaded item determines the
        // speed and physics (most notably for firework rockets).
        for (ItemStack projectile : charged.getProjectiles()) {
            Predictions.ProjectileType type = Predictions.ProjectileType.from(projectile);
            if (type != null) {
                return type;
            }
        }
        return heldType;
    }

    private boolean hasMultishot(ItemStack stack) {
        try {
            for (RegistryEntry<Enchantment> entry : stack.getEnchantments().getEnchantments()) {
                if (entry.getKey().isPresent() && ((RegistryKey)entry.getKey().get()).getValue().getPath().contains("multishot")) {
                    return true;
                }
            }
        } catch (Exception ignored) {
        }

        return false;
    }

    private void simulateAll(float tickDelta, ItemStack stack, Predictions.ProjectileType type) {
        this.trajectories.clear();
        if (stack.getItem() == Items.CROSSBOW && this.hasMultishot(stack)) {
            this.simulateSingle(tickDelta, stack, type, -10.0F);
            this.simulateSingle(tickDelta, stack, type, 0.0F);
            this.simulateSingle(tickDelta, stack, type, 10.0F);
        } else {
            this.simulateSingle(tickDelta, stack, type, 0.0F);
        }
    }

    private void simulateSingle(float tickDelta, ItemStack stack, Predictions.ProjectileType type, float yawOffset) {
        Predictions.Trajectory t = new Predictions.Trajectory();
        Vec3d pos = c.player.getCameraPosVec(tickDelta);
        Vec3d vel = this.initialVelocity(stack, type, yawOffset);
        t.path.add(pos);

        for (int i = 0; i < MAX_STEPS; i++) {
            Vec3d nextPos = pos.add(vel);
            BlockHitResult blockHit = c.world.raycast(new RaycastContext(pos, nextPos, ShapeType.COLLIDER, FluidHandling.NONE, c.player));
            boolean hit = false;
            if (blockHit.getType() != Type.MISS) {
                if (i > 0 || blockHit.getPos().distanceTo(pos) > 0.35) {
                    nextPos = blockHit.getPos();
                    hit = true;
                }
            }

            EntityHitResult entityHit = this.findEntityHit(pos, nextPos);
            if (entityHit != null) {
                nextPos = entityHit.getPos();
                t.hitEntity = true;
                hit = true;
            }

            t.path.add(nextPos);
            if (hit) {
                t.impactPoint = nextPos;
                break;
            }

            if (nextPos.y < (double)c.world.getBottomY() - 16.0) {
                break;
            }

            pos = nextPos;
            vel = vel.multiply(type.drag).subtract(0.0, type.gravity, 0.0);
        }

        this.trajectories.add(t);
    }

    private Vec3d initialVelocity(ItemStack stack, Predictions.ProjectileType type, float yawOffset) {
        float yaw = c.player.getYaw() + yawOffset;
        float pitch = c.player.getPitch() + type.pitchOffset;
        float f = -MathHelper.sin(yaw * (float)(Math.PI / 180.0)) * MathHelper.cos(pitch * (float)(Math.PI / 180.0));
        float g = -MathHelper.sin(pitch * (float)(Math.PI / 180.0));
        float h = MathHelper.cos(yaw * (float)(Math.PI / 180.0)) * MathHelper.cos(pitch * (float)(Math.PI / 180.0));
        Vec3d dir = new Vec3d(f, g, h).normalize();
        double speed = type.baseSpeed;
        Item item = stack.getItem();
        if (item == Items.BOW) {
            int useTime = this.isActivelyUsing(stack) ? stack.getMaxUseTime(c.player) - c.player.getItemUseTimeLeft() : stack.getMaxUseTime(c.player);
            speed = 3.0 * (double)BowItem.getPullProgress(useTime);
        } else if (item == Items.CROSSBOW) {
            speed = type == Predictions.ProjectileType.FIREWORK_ROCKET ? 1.6 : 3.15;
        } else if (item == Items.TRIDENT) {
            int useTime = this.isActivelyUsing(stack) ? stack.getMaxUseTime(c.player) - c.player.getItemUseTimeLeft() : 10;
            speed = 2.5 * (double)MathHelper.clamp((float)useTime / 10.0F, 0.0F, 1.0F);
        }

        return dir.multiply(speed).add(c.player.getVelocity().multiply(0.35));
    }

    private EntityHitResult findEntityHit(Vec3d start, Vec3d end) {
        Entity target = null;
        Vec3d hitPos = null;
        double minDist = Double.MAX_VALUE;

        for (Entity ent : c.world.getOtherEntities(c.player, new Box(start, end).expand(1.0))) {
            if (ent != c.player && !ent.isSpectator() && ent.isAlive() && ent instanceof LivingEntity) {
                Optional<Vec3d> hit = ent.getBoundingBox().expand(0.3).raycast(start, end);
                if (hit.isPresent()) {
                    double dist = start.squaredDistanceTo(hit.get());
                    if (dist < minDist) {
                        minDist = dist;
                        target = ent;
                        hitPos = hit.get();
                    }
                }
            }
        }

        return target == null ? null : new EntityHitResult(target, hitPos);
    }

    private void render(WorldRenderEvent event) {
        Immediate bufferSource = event.bufferSource();
        if (bufferSource == null) {
            return;
        }

        MatrixStack stack = event.matrices();
        Vec3d camPos = c.gameRenderer.getCamera().getCameraPos();
        Matrix4f matrix = stack.peek().getPositionMatrix();
        VertexConsumer lines = bufferSource.getBuffer(ClientPipelines.OUTLINE_THROUGH);
        RenderSystemHelper.lineWidth(this.lineWidth.a());

        for (Predictions.Trajectory t : this.trajectories) {
            if (t.path.size() < 2) {
                continue;
            }

            for (int i = 0; i + 1 < t.path.size(); i++) {
                Vec3d p1 = t.path.get(i).subtract(camPos);
                Vec3d p2 = t.path.get(i + 1).subtract(camPos);
                float size1 = (float)i / (float)Math.max(1, t.path.size() - 1);
                float size2 = (float)(i + 1) / (float)Math.max(1, t.path.size() - 1);
                Color c1 = this.pathColor(size1, t.hitEntity);
                Color c2 = this.pathColor(size2, t.hitEntity);
                int argb1 = (int)(this.alpha(size1) * 255.0F) << 24 | c1.getRed() << 16 | c1.getGreen() << 8 | c1.getBlue();
                int argb2 = (int)(this.alpha(size2) * 255.0F) << 24 | c2.getRed() << 16 | c2.getGreen() << 8 | c2.getBlue();

                // One continuous line is deliberately used here. The previous
                // pseudo-thickness offsets made the path look like several jagged
                // lines instead of one precise prediction.
                lines.vertex(matrix, (float)p1.x, (float)p1.y, (float)p1.z).color(argb1);
                lines.vertex(matrix, (float)p2.x, (float)p2.y, (float)p2.z).color(argb2);
            }

            if (this.impactMarker.a() && t.impactPoint != null) {
                this.renderImpactMarker(lines, matrix, camPos, t.impactPoint, t.hitEntity);
            }
        }

        bufferSource.draw();
        RenderSystemHelper.lineWidth(1.0F);
    }

    private void renderImpactMarker(VertexConsumer lines, Matrix4f matrix, Vec3d camPos, Vec3d point, boolean hitEnt) {
        Color color = hitEnt ? this.hitColor.a() : this.pathColor(1.0F, false);
        float pulseFactor = this.markerPulse.a()
            ? 1.0F + 0.18F * (float)Math.sin((double)System.currentTimeMillis() * 0.006 * (double)this.markerPulseSpeed.a())
            : 1.0F;
        float radius = this.markerSize.a() * pulseFactor;
        Vec3d center = point.subtract(camPos);
        int argb = (int)(0.9F * 255.0F) << 24 | color.getRed() << 16 | color.getGreen() << 8 | color.getBlue();

        // A compact ground-aligned ring clearly marks the landing point without
        // obscuring blocks with a sphere, a reticle, or extra crosses.
        for (int i = 0; i < MARKER_SEGMENTS; i++) {
            double angle1 = (Math.PI * 2) * (double)i / (double)MARKER_SEGMENTS;
            double angle2 = (Math.PI * 2) * (double)(i + 1) / (double)MARKER_SEGMENTS;
            Vec3d h1 = center.add(Math.cos(angle1) * (double)radius, 0.01, Math.sin(angle1) * (double)radius);
            Vec3d h2 = center.add(Math.cos(angle2) * (double)radius, 0.01, Math.sin(angle2) * (double)radius);
            lines.vertex(matrix, (float)h1.x, (float)h1.y, (float)h1.z).color(argb);
            lines.vertex(matrix, (float)h2.x, (float)h2.y, (float)h2.z).color(argb);
        }
    }

    private Color pathColor(float progress, boolean hitEnt) {
        if (hitEnt) {
            return this.hitColor.a();
        }

        Color clientCol = this.useClientColor.a() ? ModuleRegistry.CLIENT_COLOR.n() : this.lineColor.a();
        if (!this.gradient.a()) {
            return clientCol;
        }

        Color gradCol = this.gradientColor.a();
        return new Color(
            lerp(clientCol.getRed(), gradCol.getRed(), progress),
            lerp(clientCol.getGreen(), gradCol.getGreen(), progress),
            lerp(clientCol.getBlue(), gradCol.getBlue(), progress)
        );
    }

    private float alpha(float progress) {
        if (!this.fadeOut.a() || progress <= this.fadeStart.a()) {
            return 1.0F;
        }

        return Math.max(0.0F, 1.0F - (progress - this.fadeStart.a()) / (1.0F - this.fadeStart.a()));
    }

    private void clearPrediction() {
        this.trajectories.clear();
    }

    @Override
    public void onDisable() {
        this.clearPrediction();
        super.onDisable();
    }

    private static int lerp(int a, int b, float f) {
        return Math.round((float)a + (float)(b - a) * Math.max(0.0F, Math.min(1.0F, f)));
    }

    private static class Trajectory {
        final List<Vec3d> path = new ArrayList<>();
        Vec3d impactPoint = null;
        boolean hitEntity = false;
    }

    private enum ProjectileType {
        ENDER_PEARL(1.5, 0.99, 0.03),
        TRIDENT(2.5, 0.99, 0.05),
        ARROW(3.0, 0.99, 0.05),
        // Vanilla throws potions and XP bottles 20 degrees above the crosshair.
        POTION(0.5, 0.99, 0.05, -20.0F),
        SNOWBALL(1.5, 0.99, 0.03),
        EGG(1.5, 0.99, 0.03),
        EXPERIENCE_BOTTLE(0.7, 0.99, 0.07, -20.0F),
        WIND_CHARGE(1.5, 1.0, 0.0),
        FIREWORK_ROCKET(1.6, 1.0, 0.0);

        private final double baseSpeed;
        private final double drag;
        private final double gravity;
        private final float pitchOffset;

        ProjectileType(double speed, double drag, double gravity) {
            this(speed, drag, gravity, 0.0F);
        }

        ProjectileType(double speed, double drag, double gravity, float pitchOffset) {
            this.baseSpeed = speed;
            this.drag = drag;
            this.gravity = gravity;
            this.pitchOffset = pitchOffset;
        }

        private static Predictions.ProjectileType from(ItemStack stack) {
            if (stack == null || stack.isEmpty()) {
                return null;
            }

            Item item = stack.getItem();
            if (item == Items.ENDER_PEARL) {
                return ENDER_PEARL;
            } else if (item == Items.TRIDENT) {
                return TRIDENT;
            } else if (item == Items.BOW || item == Items.CROSSBOW) {
                return ARROW;
            } else if (item == Items.SPLASH_POTION || item == Items.LINGERING_POTION) {
                return POTION;
            } else if (item == Items.SNOWBALL) {
                return SNOWBALL;
            } else if (item == Items.EGG) {
                return EGG;
            } else if (item == Items.EXPERIENCE_BOTTLE) {
                return EXPERIENCE_BOTTLE;
            } else if (item == Items.FIREWORK_ROCKET) {
                return FIREWORK_ROCKET;
            } else {
                return item == Items.WIND_CHARGE ? WIND_CHARGE : null;
            }
        }
    }
}
