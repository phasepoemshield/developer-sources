/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.RenderLayer
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.VertexConsumerProvider$Immediate
 *  net.minecraft.client.util.BufferAllocator
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.util.math.MatrixStack$Entry
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.math.RotationAxis
 *  net.minecraft.util.math.Vec3d
 *  org.joml.Quaternionfc
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package kotakbaz.rain.module.modules.hud.container;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.WorldParticlesModule;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RainRenderLayers;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Quaternionfc;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u062b;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001gB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ7\u0010#\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0002\u00a2\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0002\u00a2\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020!H\u0002\u00a2\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b1\u0010\u0003R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b<\u0010=R$\u0010@\u001a\u0012\u0012\u0004\u0012\u00020\u000f0>j\b\u0012\u0004\u0012\u00020\u000f`?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bI\u0010HR\u0014\u0010J\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bJ\u0010HR\u0014\u0010K\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bK\u0010HR\u0014\u0010L\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bL\u0010HR\u0014\u0010M\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bM\u0010HR\u0014\u0010N\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bN\u0010HR\u0014\u0010O\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bO\u0010HR\u0014\u0010P\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bP\u0010HR\u0014\u0010Q\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bQ\u0010HR\u0014\u0010R\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bR\u0010HR\u0014\u0010S\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bS\u0010HR\u0014\u0010T\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bT\u0010HR\u0014\u0010U\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bU\u0010HR\u0014\u0010V\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bV\u0010HR\u0014\u0010W\u001a\u00020\u00198\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020\u00198\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bY\u0010XR\u0014\u0010Z\u001a\u00020\u00198\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bZ\u0010XR\u0014\u0010[\u001a\u00020\u00198\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b[\u0010XR\u0014\u0010\\\u001a\u00020\u00198\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\\\u0010XR\u0014\u0010]\u001a\u00020\u00198\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b]\u0010XR\u0014\u0010^\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b^\u0010HR\u0014\u0010_\u001a\u00020\u00198\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b_\u0010XR\u0014\u0010`\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b`\u0010HR\u0014\u0010a\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\ba\u0010HR\u0014\u0010b\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bb\u0010HR\u0014\u0010c\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bc\u0010HR\u0014\u0010d\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bd\u0010HR\u0014\u0010e\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\be\u0010HR\u0014\u0010f\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bf\u0010F\u00a8\u0006h"}, d2={"Loxxxde/\u0628\u062c;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u0634\u062b;", "event", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Lnet/minecraft/class_243;", "playerPos", "spawnParticle", "(Lnet/minecraft/class_243;)V", "Loxxxde/\u0636\u0628;", "particle", "", "now", "", "elapsedSeconds", "", "updateParticle", "(Lkotakbaz/rain/module/modules/render/WorldParticlesModule$WorldParticle;Lnet/minecraft/class_243;JD)Z", "ageSeconds", "", "lifeProgress", "step", "simulateParticle", "(Lkotakbaz/rain/module/modules/render/WorldParticlesModule$WorldParticle;DFD)V", "Lnet/minecraft/class_4588;", "buffer", "cameraPos", "Ljava/awt/Color;", "color", "renderParticle", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4588;Lkotakbaz/rain/module/modules/render/WorldParticlesModule$WorldParticle;Lnet/minecraft/class_243;Ljava/awt/Color;)V", "Lnet/minecraft/class_2960;", "selectedTexture", "()Lnet/minecraft/class_2960;", "selectedColor", "()Ljava/awt/Color;", "origin", "range", "randomTargetAround", "(Lnet/minecraft/class_243;D)Lnet/minecraft/class_243;", "value", "smootherstep", "(F)F", "clearState", "Loxxxde/\u0638\u064a;", "particleType", "Loxxxde/\u0638\u064a;", "Loxxxde/\u0637\u064f;", "spawnCount", "Loxxxde/\u0637\u064f;", "Loxxxde/\u062e\u0630;", "useClientColor", "Loxxxde/\u062e\u0630;", "Loxxxde/\u0631\u062a;", "particleColor", "Loxxxde/\u0631\u062a;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "particles", "Ljava/util/ArrayList;", "Lnet/minecraft/class_638;", "trackedWorld", "Lnet/minecraft/class_638;", "lastSimulationAtNanos", "J", "spawnCarry", "D", "NANOS_PER_SECOND", "PARTICLE_LIFETIME_SECONDS", "MAX_FRAME_TIME_SECONDS", "MAX_PHYSICS_STEP_SECONDS", "SPAWN_RADIUS", "SPAWN_HEIGHT", "DESPAWN_DISTANCE_SQUARED", "TARGET_RANGE", "INITIAL_SPEED", "STEERING_ACCELERATION", "DRIFT_ACCELERATION", "GRAVITY_ACCELERATION", "VELOCITY_DRAG", "MAX_SPEED", "APPEAR_FRACTION", "F", "FADE_FRACTION", "SIZE_FADE_START", "SIZE_FADE_AMOUNT", "SLOWDOWN_START_FRACTION", "RETARGET_END_FRACTION", "PULSE_SPEED", "PULSE_AMOUNT", "MIN_PARTICLE_SIZE", "MAX_PARTICLE_SIZE", "MIN_ROTATION_SPEED", "MAX_ROTATION_SPEED", "ROTATION_DRAG", "RETARGET_DISTANCE_SQUARED", "RETARGET_INTERVAL_NANOS", "WorldParticle", "rain-visuals"})
@RecompileFormat
public final class HudModule
extends Module {
    private static final double DRIFT_ACCELERATION = 0.055;
    @NotNull
    private static final SliderSetting spawnCount;
    private static long lastSimulationAtNanos;
    private static double spawnCarry;
    private static final double MAX_PARTICLE_SIZE = 0.22;
    private static final double VELOCITY_DRAG = 0.3;
    @NotNull
    private static final ModeSetting particleType;
    private static final float RETARGET_END_FRACTION = 0.82f;
    private static final double SPAWN_HEIGHT = 14.0;
    private static final double PARTICLE_LIFETIME_SECONDS = 5.0;
    private static final float PULSE_AMOUNT = 0.035f;
    private static final float SLOWDOWN_START_FRACTION = 0.78f;
    private static final double INITIAL_SPEED = 0.36;
    private static final double MIN_PARTICLE_SIZE = 0.16;
    private static final double MAX_FRAME_TIME_SECONDS = 0.1;
    private static final float SIZE_FADE_AMOUNT = 0.35f;
    private static final double MIN_ROTATION_SPEED = -0.65;
    @NotNull
    private static final BooleanSetting useClientColor;
    private static final double NANOS_PER_SECOND = 1.0E9;
    @Nullable
    private static ClientWorld trackedWorld;
    @NotNull
    public static final HudModule INSTANCE;
    private static final long RETARGET_INTERVAL_NANOS = 700000000L;
    private static final double SPAWN_RADIUS = 22.0;
    private static final float APPEAR_FRACTION = 0.14f;
    @NotNull
    private static final ColorSetting particleColor;
    private static final double RETARGET_DISTANCE_SQUARED = 0.36;
    private static final double DESPAWN_DISTANCE_SQUARED = 900.0;
    private static final double ROTATION_DRAG = 0.08;
    private static final double GRAVITY_ACCELERATION = 0.144;
    private static final float SIZE_FADE_START = 0.68f;
    private static final double MAX_SPEED = 0.54;
    @NotNull
    private static final ArrayList<WorldParticlesModule.WorldParticle> particles;
    private static final double MAX_ROTATION_SPEED = 0.65;
    private static final double MAX_PHYSICS_STEP_SECONDS = 0.008333333333333333;
    private static final double TARGET_RANGE = 3.2;
    private static final double STEERING_ACCELERATION = 1.08;
    private static final double PULSE_SPEED = 2.1;
    private static final float FADE_FRACTION = 0.3f;

    private final Color selectedColor() {
        return (Boolean)useClientColor.getValue() != false && \u0638\u062b.INSTANCE.isEnabled() ? \u0638\u062b.INSTANCE.getClientColor() : (Color)particleColor.getValue();
    }

    @Override
    public void onEnable() {
        this.clearState();
    }

    private final float smootherstep(float value) {
        return value * value * value * (value * (value * 6.0f - 15.0f) + 10.0f);
    }

    private final Vec3d randomTargetAround(Vec3d origin, double range) {
        Vec3d vec3d = origin.add((Random.Default.nextDouble() - 0.5) * range, (Random.Default.nextDouble() - 0.5) * range, (Random.Default.nextDouble() - 0.5) * range);
        Intrinsics.checkNotNullExpressionValue(vec3d, "add(...)");
        return vec3d;
    }

    private final void clearState() {
        particles.clear();
        trackedWorld = \u0636\u0643.getMc().world;
        lastSimulationAtNanos = 0L;
        spawnCarry = 0.0;
    }

    private HudModule() {
        super("World Particles", \u0638\u0646.getRENDER(), "\u0414\u043e\u0431\u0430\u0432\u043b\u044f\u0435\u0442 \u043b\u0435\u0442\u0430\u044e\u0449\u0438\u0435 \u0447\u0430\u0441\u0442\u0438\u0446\u044b \u0432 \u043c\u0438\u0440\u0435");
    }

    private final void spawnParticle(Vec3d playerPos) {
        if (particles.size() >= 200) {
            return;
        }
        double angle = Random.Default.nextDouble() * Math.PI * 2.0;
        double spawnRadius = Math.sqrt(Random.Default.nextDouble()) * 22.0;
        double x = playerPos.x + Math.cos(angle) * spawnRadius;
        double z = playerPos.z + Math.sin(angle) * spawnRadius;
        double y = playerPos.y + (Random.Default.nextDouble() - 0.5) * 14.0;
        Vec3d startPos = new Vec3d(x, y, z);
        long now = System.nanoTime();
        particles.add(new WorldParticlesModule.WorldParticle(startPos, this.randomTargetAround(startPos, 3.2), new Vec3d((Random.Default.nextDouble() - 0.5) * 0.36, (Random.Default.nextDouble() - 0.5) * 0.36, (Random.Default.nextDouble() - 0.5) * 0.36), now, now, (float)Random.Default.nextDouble(0.16, 0.22), Random.Default.nextDouble() * Math.PI * 2.0, (float)Random.Default.nextDouble() * ((float)Math.PI * 2), (float)Random.Default.nextDouble(-0.65, 0.65), 0.0f, 0.0f, 1536, null));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.isEnabled()) {
            return;
        }
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            HudModule $this$onRender3D_u24lambda_u240 = this;
            boolean bl = false;
            $this$onRender3D_u24lambda_u240.clearState();
            return;
        }
        ClientWorld world = clientWorld;
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        if (trackedWorld != world) {
            this.clearState();
            trackedWorld = world;
        }
        long now = System.nanoTime();
        Vec3d vec3d = player.getLerpedPos(event.getPartialTicks());
        Intrinsics.checkNotNullExpressionValue(vec3d, "getPosition(...)");
        Vec3d playerPos = vec3d;
        if (lastSimulationAtNanos == 0L) {
            lastSimulationAtNanos = now;
        } else {
            double elapsedSeconds = RangesKt.coerceAtMost((double)RangesKt.coerceAtLeast(now - lastSimulationAtNanos, 0L) / 1.0E9, 0.1);
            spawnCarry += elapsedSeconds * ((Number)spawnCount.getValue()).doubleValue() * 10.0;
            while (spawnCarry >= 1.0) {
                this.spawnParticle(playerPos);
                spawnCarry -= 1.0;
            }
            Iterator<WorldParticlesModule.WorldParticle> iterator2 = particles.iterator();
            Intrinsics.checkNotNullExpressionValue(iterator2, "iterator(...)");
            Iterator<WorldParticlesModule.WorldParticle> iterator3 = iterator2;
            while (iterator3.hasNext()) {
                WorldParticlesModule.WorldParticle particle;
                Intrinsics.checkNotNullExpressionValue(iterator3.next(), "next(...)");
                if (this.updateParticle(particle, playerPos, now, elapsedSeconds)) continue;
                iterator3.remove();
            }
            lastSimulationAtNanos = now;
        }
        if (particles.isEmpty()) {
            return;
        }
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        Vec3d cameraPos = \u0637\u062b.getPos(\u0637\u062b.getCamera(gameRenderer));
        RenderLayer layer = RainRenderLayers.getTrailSprite(this.selectedTexture());
        Color color = this.selectedColor();
        AutoCloseable autoCloseable = (AutoCloseable)new BufferAllocator(262144);
        Throwable throwable = null;
        try {
            void var16_20;
            BufferAllocator allocator = (BufferAllocator)autoCloseable;
            boolean bl = false;
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)allocator);
            Intrinsics.checkNotNullExpressionValue(immediate, "immediate(...)");
            VertexConsumerProvider.Immediate consumers = immediate;
            VertexConsumer vertexConsumer = consumers.getBuffer(layer);
            Intrinsics.checkNotNullExpressionValue(vertexConsumer, "getBuffer(...)");
            VertexConsumer buffer = vertexConsumer;
            Iterable $this$forEach$iv = particles;
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                void var20_26;
                WorldParticlesModule.WorldParticle particle = (WorldParticlesModule.WorldParticle)element$iv;
                boolean bl2 = false;
                if (particle.getAlpha() <= 0.0f) continue;
                if (particle.getSize() <= 0.0f) continue;
                INSTANCE.renderParticle(event, buffer, (WorldParticlesModule.WorldParticle)var20_26, cameraPos, color);
            }
            VertexConsumerProvider.Immediate $this$draw$iv = consumers;
            Intrinsics.checkNotNull(layer);
            RenderLayer renderLayer = layer;
            boolean bl3 = false;
            var16_20.draw(renderLayer);
            Unit unit = Unit.INSTANCE;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            AutoCloseableKt.closeFinally(autoCloseable, throwable);
        }
    }

    private final void simulateParticle(WorldParticlesModule.WorldParticle particle, double ageSeconds, float lifeProgress, double step) {
        Vec3d vec3d = particle.getTarget().subtract(particle.getPosition());
        Intrinsics.checkNotNullExpressionValue(vec3d, "subtract(...)");
        Vec3d toTarget = vec3d;
        float tailProgress = RangesKt.coerceIn((lifeProgress - 0.78f) / 0.22000003f, 0.0f, 1.0f);
        double movementScale = 1.0 - (double)tailProgress * 0.65;
        double phase = particle.getDriftPhase();
        Vec3d vec3d2 = new Vec3d(Math.sin(ageSeconds * 0.85 + phase), Math.sin(ageSeconds * 0.62 + phase * 1.7) * 0.55, Math.cos(ageSeconds * 0.78 + phase * 0.73)).multiply(0.055);
        Intrinsics.checkNotNullExpressionValue(vec3d2, "scale(...)");
        Vec3d drift = vec3d2;
        Vec3d vec3d3 = particle.getVelocity().add(toTarget.multiply(1.08 * movementScale * step)).add(drift.multiply(step)).add(0.0, -0.144 * movementScale * step, 0.0);
        Intrinsics.checkNotNullExpressionValue(vec3d3, "add(...)");
        particle.setVelocity(vec3d3);
        double maxSpeed = 0.54 * RangesKt.coerceAtLeast(movementScale, 0.35);
        double speedSquared = particle.getVelocity().lengthSquared();
        if (speedSquared > maxSpeed * maxSpeed) {
            Vec3d vec3d4 = particle.getVelocity().multiply(maxSpeed / Math.sqrt(speedSquared));
            Intrinsics.checkNotNullExpressionValue(vec3d4, "scale(...)");
            particle.setVelocity(vec3d4);
        }
        Vec3d vec3d5 = particle.getVelocity().multiply(Math.exp(-0.3 * step));
        Intrinsics.checkNotNullExpressionValue(vec3d5, "scale(...)");
        particle.setVelocity(vec3d5);
        Vec3d vec3d6 = particle.getPosition().add(particle.getVelocity().multiply(step));
        Intrinsics.checkNotNullExpressionValue(vec3d6, "add(...)");
        particle.setPosition(vec3d6);
        particle.setRotation(particle.getRotation() + particle.getAngularVelocity() * (float)step * (float)movementScale);
        particle.setAngularVelocity(particle.getAngularVelocity() * (float)Math.exp(-0.08 * step));
    }

    static {
        INSTANCE = new HudModule();
        String[] stringArray = new String[8];
        stringArray[0] = "\u0414\u043e\u043b\u043b\u0430\u0440";
        stringArray[1] = "\u0421\u0432\u0435\u0447\u0435\u043d\u0438\u0435";
        stringArray[2] = "\u0421\u0435\u0440\u0434\u0446\u0435";
        stringArray[3] = "\u041c\u043e\u043b\u043d\u0438\u044f";
        stringArray[4] = "\u0422\u043e\u0447\u043a\u0430";
        stringArray[5] = "\u0421\u043d\u0435\u0436\u0438\u043d\u043a\u0430";
        stringArray[6] = "\u0417\u0432\u0435\u0437\u0434\u0430";
        stringArray[7] = "\u0420\u0443\u0431";
        particleType = Module.mode$default(INSTANCE, "\u0421\u0442\u0438\u043b\u044c", CollectionsKt.listOf(stringArray), 0, null, 12, null);
        spawnCount = Module.slider$default(INSTANCE, "\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e", 15.0f, 1.0f, 30.0f, 1.0f, null, 32, null);
        useClientColor = Module.boolean$default(INSTANCE, "\u0426\u0432\u0435\u0442 \u043a\u043b\u0438\u0435\u043d\u0442\u0430", true, null, 4, null);
        Module module = INSTANCE;
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        particleColor = Module.color$default(module, "\u0426\u0432\u0435\u0442", color, null, 4, null).setVisible(HudModule::particleColor$lambda$0);
        particles = new ArrayList();
    }

    private final Identifier selectedTexture() {
        String fileName = switch (particleType.getSelectedIndex()) {
            case 0 -> "dollar.png";
            case 1 -> "glow.png";
            case 2 -> "heart.png";
            case 3 -> "lightning.png";
            case 4 -> "point.png";
            case 5 -> "snowflake.png";
            case 6 -> "star.png";
            case 7 -> "starnew.png";
            default -> "snowflake.png";
        };
        Identifier identifier = Identifier.of((String)"rain", (String)("images/particles/" + fileName));
        Intrinsics.checkNotNullExpressionValue(identifier, "fromNamespaceAndPath(...)");
        return identifier;
    }

    @Override
    public void onDisable() {
        this.clearState();
    }

    /*
     * WARNING - void declaration
     */
    private final boolean updateParticle(WorldParticlesModule.WorldParticle particle, Vec3d playerPos, long now, double elapsedSeconds) {
        void step22;
        double ageSeconds = (double)RangesKt.coerceAtLeast(now - particle.getCreatedAtNanos(), 0L) / 1.0E9;
        if (ageSeconds >= 5.0) {
            return false;
        }
        if (playerPos.squaredDistanceTo(particle.getPosition()) > 900.0) {
            return false;
        }
        float lifeProgress = RangesKt.coerceIn((float)(ageSeconds / 5.0), 0.0f, 1.0f);
        float appear = this.smootherstep(RangesKt.coerceIn(lifeProgress / 0.14f, 0.0f, 1.0f));
        float disappear = this.smootherstep(RangesKt.coerceIn((1.0f - lifeProgress) / 0.3f, 0.0f, 1.0f));
        float fadeSize = 1.0f - this.smootherstep(RangesKt.coerceIn((lifeProgress - 0.68f) / 0.32f, 0.0f, 1.0f)) * 0.35f;
        float pulse = 1.0f + (float)Math.sin(ageSeconds * 2.1 + particle.getDriftPhase()) * 0.035f;
        particle.setAlpha(appear * disappear);
        particle.setSize(particle.getBaseSize() * (0.72f + appear * 0.28f) * fadeSize * pulse);
        boolean bl = true;
        int n = (int)Math.ceil(elapsedSeconds / 0.008333333333333333);
        int steps = Math.max((int)step22, n);
        double step22 = elapsedSeconds / (double)steps;
        int n2 = 0;
        while (n2 < steps) {
            int it = n2++;
            boolean bl2 = false;
            INSTANCE.simulateParticle(particle, ageSeconds, lifeProgress, step22);
        }
        Vec3d vec3d = particle.getTarget().subtract(particle.getPosition());
        Intrinsics.checkNotNullExpressionValue(vec3d, "subtract(...)");
        Vec3d toTarget = vec3d;
        if (lifeProgress <= 0.82f && toTarget.lengthSquared() < 0.36 && now - particle.getLastRetargetAtNanos() > 700000000L) {
            void var3_3;
            void var1_1;
            particle.setTarget(this.randomTargetAround(var1_1.getPosition(), 3.2));
            var1_1.setLastRetargetAtNanos((long)var3_3);
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private final void renderParticle(Render3DEvent event, VertexConsumer buffer, WorldParticlesModule.WorldParticle particle, Vec3d cameraPos, Color color) {
        void var1_1;
        int alpha = RangesKt.coerceIn((int)(255.0f * particle.getAlpha()), 0, 255);
        float size = particle.getSize();
        event.getMatrices().push();
        event.getMatrices().translate(particle.getPosition().x - cameraPos.x, particle.getPosition().y - cameraPos.y, particle.getPosition().z - cameraPos.z);
        MatrixStack matrixStack = event.getMatrices();
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        matrixStack.multiply((Quaternionfc)\u0637\u062b.getCamera(gameRenderer).getRotation());
        event.getMatrices().multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotation(particle.getRotation()));
        MatrixStack.Entry entry = event.getMatrices().peek();
        Intrinsics.checkNotNullExpressionValue(entry, "last(...)");
        MatrixStack.Entry entry2 = entry;
        buffer.vertex(entry2, -size, size, 0.0f).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(0.0f, 0.0f);
        buffer.vertex(entry2, size, size, 0.0f).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(1.0f, 0.0f);
        buffer.vertex(entry2, size, -size, 0.0f).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(1.0f, 1.0f);
        buffer.vertex(entry2, -size, -size, 0.0f).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(0.0f, 1.0f);
        var1_1.getMatrices().pop();
    }

    private static final boolean particleColor$lambda$0() {
        return !((Boolean)useClientColor.getValue()).booleanValue() || !\u0638\u062b.INSTANCE.isEnabled();
    }
}

