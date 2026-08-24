/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.RenderLayer
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.VertexConsumerProvider$Immediate
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.util.math.MatrixStack$Entry
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.RotationAxis
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 *  net.minecraft.world.World
 *  org.joml.Quaternionfc
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotakbaz.rain.event.events.AttackEvent;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.HitParticlesModule;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Quaternionfc;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u062b;
import oxxxde.\u0638\u0639;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0004vwxyB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000e\u0010\u0003J/\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ7\u0010'\u001a\u00020&2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b'\u0010(J7\u0010/\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0002\u00a2\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020!H\u0002\u00a2\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020-H\u0002\u00a2\u0006\u0004\b3\u00104J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u000205H\u0002\u00a2\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b=\u0010<J\u000f\u0010?\u001a\u00020>H\u0002\u00a2\u0006\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bJ\u0010IR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bN\u0010MR\u0014\u0010O\u001a\u00020K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bO\u0010MR\u0014\u0010P\u001a\u00020K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bP\u0010MR\u0014\u0010Q\u001a\u00020K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bQ\u0010MR$\u0010T\u001a\u0012\u0012\u0004\u0012\u00020\u000f0Rj\b\u0012\u0004\u0012\u00020\u000f`S8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b?\u0010VR\u0014\u0010W\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bY\u0010XR\u0014\u0010Z\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bZ\u0010XR\u0014\u0010[\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b]\u0010\\R\u0014\u0010^\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b^\u0010\\R\u0014\u0010_\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b_\u0010\\R\u0014\u0010`\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b`\u0010\\R\u0014\u0010a\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\ba\u0010\\R\u0014\u0010b\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bb\u0010\\R\u0014\u0010c\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bc\u0010\\R\u0014\u0010d\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bd\u0010\\R\u0014\u0010e\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\be\u0010\\R\u0014\u0010f\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bf\u0010\\R\u0014\u0010g\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bg\u0010XR\u0014\u0010h\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bh\u0010XR\u0014\u0010i\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bi\u0010\\R\u0014\u0010j\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bj\u0010\\R\u0014\u0010k\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010m\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bm\u0010lR\u0014\u0010n\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bn\u0010\\R\u0014\u0010o\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bo\u0010\\R\u001f\u0010s\u001a\r\u0012\t\u0012\u00070q\u00a2\u0006\u0002\br0p8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010u\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bu\u0010X\u00a8\u0006z"}, d2={"Loxxxde/\u062f\u0638;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u0630\u0645;", "event", "onAttack", "(Lkotakbaz/rain/event/events/AttackEvent;)V", "Loxxxde/\u0634\u062b;", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "updateParticles", "Loxxxde/\u062d\u064a;", "particle", "", "elapsedSeconds", "Lnet/minecraft/class_638;", "world", "Lnet/minecraft/class_1657;", "player", "simulateParticle", "(Lkotakbaz/rain/module/modules/render/HitParticlesModule$BurstParticle;DLnet/minecraft/class_638;Lnet/minecraft/class_1657;)V", "step", "simulateFreeParticle", "(Lkotakbaz/rain/module/modules/render/HitParticlesModule$BurstParticle;D)V", "simulateBouncingParticle", "dragFactor", "(Lkotakbaz/rain/module/modules/render/HitParticlesModule$BurstParticle;D)D", "Loxxxde/\u0637\u0635;", "physics", "", "index", "particleCount", "batchPhase", "speedMultiplier", "Loxxxde/\u0630\u0637;", "createSpawnMotion", "(Lkotakbaz/rain/module/modules/render/HitParticlesModule$ParticlePhysics;IIDD)Lkotakbaz/rain/module/modules/render/HitParticlesModule$SpawnMotion;", "Lnet/minecraft/class_4588;", "buffer", "Lnet/minecraft/class_243;", "cameraPos", "Ljava/awt/Color;", "color", "renderParticle", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4588;Lkotakbaz/rain/module/modules/render/HitParticlesModule$BurstParticle;Lnet/minecraft/class_243;Ljava/awt/Color;)V", "selectedTextureIndex", "()I", "selectedColor", "()Ljava/awt/Color;", "", "seconds", "", "secondsToNanos", "(F)J", "value", "smoothStep", "(D)D", "easeOutBack", "Loxxxde/\u0634\u064b;", "renderResources", "()Lkotakbaz/rain/module/modules/render/HitParticlesModule$ParticleRenderResources;", "Loxxxde/\u062e\u0630;", "useClientColor", "Loxxxde/\u062e\u0630;", "Loxxxde/\u0631\u062a;", "particleColor", "Loxxxde/\u0631\u062a;", "Loxxxde/\u0638\u064a;", "physicsMode", "Loxxxde/\u0638\u064a;", "particleType", "Loxxxde/\u0637\u064f;", "count", "Loxxxde/\u0637\u064f;", "size", "speed", "gravity", "lifeTime", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "particles", "Ljava/util/ArrayList;", "Loxxxde/\u0634\u064b;", "TEXTURE_BUFFER_SIZE", "I", "FALLBACK_BUFFER_SIZE", "MAX_PARTICLES", "NANOS_PER_SECOND", "D", "MAX_CATCH_UP_TIME", "MAX_PHYSICS_STEP", "APPEAR_PORTION", "SIZE_POP_PORTION", "ROTATION_DRAG", "IMPACT_PULSE_DECAY", "SURFACE_FRICTION", "SETTLE_FRICTION", "GROUND_DRAG", "MIN_BOUNCE_SPEED", "MAX_BOUNCES", "BOUNCE_MODE_INDEX", "COLLISION_EPSILON", "ANGLE_JITTER", "FULL_STEP_ROTATION_DECAY", "F", "FULL_STEP_IMPACT_DECAY", "FULL_STEP_GROUND_DRAG", "GOLDEN_ANGLE", "", "Lnet/minecraft/class_2960;", "Lkotlin/jvm/internal/EnhancedNullability;", "PARTICLE_TEXTURES", "Ljava/util/List;", "RANDOM_MODE_INDEX", "ParticlePhysics", "SpawnMotion", "BurstParticle", "ParticleRenderResources", "rain-visuals"})
@RecompileFormat
public final class \u062f\u0638
extends Module {
    @NotNull
    private static final BooleanSetting useClientColor;
    @NotNull
    private static final ArrayList<HitParticlesModule.BurstParticle> particles;
    private static final double MIN_BOUNCE_SPEED = 0.24;
    private static final double COLLISION_EPSILON = 0.012;
    private static final double SIZE_POP_PORTION = 0.16;
    private static final double ROTATION_DRAG = 0.55;
    @NotNull
    public static final \u062f\u0638 INSTANCE;
    private static final double SETTLE_FRICTION = 0.72;
    private static final double IMPACT_PULSE_DECAY = 9.0;
    private static final int MAX_BOUNCES = 4;
    private static final float FULL_STEP_ROTATION_DECAY;
    private static final float FULL_STEP_IMPACT_DECAY;
    private static final double APPEAR_PORTION = 0.1;
    private static final double NANOS_PER_SECOND = 1.0E9;
    @NotNull
    private static final SliderSetting speed;
    @NotNull
    private static final SliderSetting gravity;
    private static final double SURFACE_FRICTION = 0.74;
    private static final double MAX_CATCH_UP_TIME = 0.12;
    private static final int TEXTURE_BUFFER_SIZE = 131072;
    private static final double MAX_PHYSICS_STEP = 0.008333333333333333;
    @NotNull
    private static final List<Identifier> PARTICLE_TEXTURES;
    private static final double GOLDEN_ANGLE;
    private static final int RANDOM_MODE_INDEX;
    private static final double ANGLE_JITTER = 0.09;
    @NotNull
    private static final ModeSetting physicsMode;
    @NotNull
    private static final SliderSetting size;
    private static final int BOUNCE_MODE_INDEX = 1;
    @NotNull
    private static final ColorSetting particleColor;
    @NotNull
    private static final SliderSetting lifeTime;
    @Nullable
    private static HitParticlesModule.ParticleRenderResources renderResources;
    private static final double FULL_STEP_GROUND_DRAG;
    @NotNull
    private static final ModeSetting particleType;
    @NotNull
    private static final SliderSetting count;
    private static final int MAX_PARTICLES = 800;
    private static final double GROUND_DRAG = 5.5;
    private static final int FALLBACK_BUFFER_SIZE = 1024;

    private static final boolean particleColor$lambda$0() {
        return !((Boolean)useClientColor.getValue()).booleanValue() || !\u0638\u062b.INSTANCE.isEnabled();
    }

    /*
     * WARNING - void declaration
     */
    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        void var5_6;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.isEnabled()) {
            return;
        }
        if (\u0636\u0643.getMc().player == null || \u0636\u0643.getMc().world == null) {
            return;
        }
        this.updateParticles();
        if (particles.isEmpty()) {
            return;
        }
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        Vec3d cameraPos = \u0637\u062b.getPos(\u0637\u062b.getCamera(gameRenderer));
        Color color = this.selectedColor();
        HitParticlesModule.ParticleRenderResources resources = this.renderResources();
        int n = ((Collection)particles).size();
        for (int index = 0; index < n; ++index) {
            HitParticlesModule.BurstParticle particle;
            Intrinsics.checkNotNullExpressionValue(particles.get(index), "get(...)");
            if (particle.getAlpha() <= 0.0f) continue;
            if (particle.getCurrentSize() <= 0.0f) continue;
            RenderLayer layer = resources.getLayers()[particle.getTextureIndex()];
            VertexConsumer vertexConsumer = resources.getConsumers().getBuffer(layer);
            Intrinsics.checkNotNullExpressionValue(vertexConsumer, "getBuffer(...)");
            this.renderParticle(event, vertexConsumer, particle, cameraPos, color);
        }
        VertexConsumerProvider.Immediate $this$draw$iv = resources.getConsumers();
        boolean $i$f$draw = false;
        var5_6.draw();
    }

    private static final boolean useClientColor$lambda$0() {
        return \u0638\u062b.INSTANCE.isEnabled();
    }

    private final double dragFactor(HitParticlesModule.BurstParticle particle, double step) {
        return step == 0.008333333333333333 ? particle.getFullStepDrag() : Math.exp(-particle.getDrag() * step);
    }

    private \u062f\u0638() {
        super("HitParticles", \u0638\u0646.getRENDER(), "\u0427\u0430\u0441\u0442\u0438\u0446\u044b \u043f\u0440\u0438 \u043f\u043e\u043f\u0430\u0434\u0430\u043d\u0438\u0438 \u043f\u043e \u0446\u0435\u043b\u0438");
    }

    private final int selectedTextureIndex() {
        return particleType.getSelectedIndex() == RANDOM_MODE_INDEX ? Random.Default.nextInt(PARTICLE_TEXTURES.size()) : RangesKt.coerceIn(particleType.getSelectedIndex(), 0, CollectionsKt.getLastIndex(PARTICLE_TEXTURES));
    }

    @Override
    public void onDisable() {
        particles.clear();
        HitParticlesModule.ParticleRenderResources particleRenderResources = renderResources;
        if (particleRenderResources != null) {
            particleRenderResources.close();
        }
        renderResources = null;
    }

    private final void simulateParticle(HitParticlesModule.BurstParticle particle, double elapsedSeconds, ClientWorld world, PlayerEntity player) {
        double step;
        for (double remaining = elapsedSeconds; remaining > 0.0; remaining -= step) {
            step = Math.min(remaining, 0.008333333333333333);
            switch (\u0638\u0639.$EnumSwitchMapping$0[particle.getPhysics().ordinal()]) {
                case 1: {
                    this.simulateFreeParticle(particle, step);
                    break;
                }
                case 2: {
                    this.simulateBouncingParticle(particle, step, world, player);
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            particle.setRotation(particle.getRotation() + particle.getAngularVelocity() * (float)step);
            boolean fullStep = step == 0.008333333333333333;
            particle.setAngularVelocity(particle.getAngularVelocity() * (fullStep ? FULL_STEP_ROTATION_DECAY : (float)Math.exp(-0.55 * step)));
            particle.setImpactPulse(particle.getImpactPulse() * (fullStep ? FULL_STEP_IMPACT_DECAY : (float)Math.exp(-9.0 * step)));
        }
    }

    private final HitParticlesModule.SpawnMotion createSpawnMotion(HitParticlesModule.ParticlePhysics physics, int index, int particleCount, double batchPhase, double speedMultiplier) {
        double angle = batchPhase + (double)index * GOLDEN_ANGLE + Random.Default.nextDouble(-0.09, 0.09);
        return switch (\u0638\u0639.$EnumSwitchMapping$0[physics.ordinal()]) {
            case 1 -> {
                double vertical = 1.0 - 2.0 * (((double)index + 0.5) / (double)particleCount);
                double horizontal = Math.sqrt(RangesKt.coerceAtLeast(1.0 - vertical * vertical, 0.0));
                Vec3d v0 = new Vec3d(Math.cos(angle) * horizontal, vertical, Math.sin(angle) * horizontal).normalize();
                Intrinsics.checkNotNullExpressionValue(v0, "normalize(...)");
                Vec3d direction = v0;
                double particleSpeed = Random.Default.nextDouble(1.5, 2.25) * speedMultiplier;
                Vec3d v1 = direction.multiply(particleSpeed).add(0.0, 0.12 * speedMultiplier, 0.0);
                Intrinsics.checkNotNullExpressionValue(v1, "add(...)");
                yield new HitParticlesModule.SpawnMotion(direction, v1, Random.Default.nextDouble(1.15, 1.65), 0.0, 0.88f, 0.48, 0.58, 0.0, (float)Random.Default.nextDouble(-8.0, 8.0));
            }
            case 2 -> {
                double vertical = Random.Default.nextDouble(0.48, 1.05) * speedMultiplier;
                double horizontal = Random.Default.nextDouble(0.9, 1.55) * speedMultiplier;
                Vec3d direction = new Vec3d(Math.cos(angle), 0.0, Math.sin(angle));
                Vec3d v3 = new Vec3d(Math.cos(angle) * 0.78, 0.62, Math.sin(angle) * 0.78).normalize();
                Intrinsics.checkNotNullExpressionValue(v3, "normalize(...)");
                yield new HitParticlesModule.SpawnMotion(v3, new Vec3d(direction.x * horizontal, vertical, direction.z * horizontal), Random.Default.nextDouble(0.14, 0.28), 2.2, 1.55f, 0.7, 0.24, Random.Default.nextDouble(0.52, 0.68), (float)Random.Default.nextDouble(-7.0, 7.0));
            }
            default -> throw new NoWhenBranchMatchedException();
        };
    }

    public static final /* synthetic */ List access$getPARTICLE_TEXTURES$p() {
        return PARTICLE_TEXTURES;
    }

    private final long secondsToNanos(float seconds) {
        return (long)(RangesKt.coerceAtLeast(seconds, 0.01f) * (float)1000000000L);
    }

    /*
     * WARNING - void declaration
     */
    private final void renderParticle(Render3DEvent event, VertexConsumer buffer, HitParticlesModule.BurstParticle particle, Vec3d cameraPos, Color color) {
        void var1_1;
        int alpha = RangesKt.coerceIn((int)(255.0f * particle.getAlpha()), 0, 255);
        float halfSize = particle.getCurrentSize();
        event.getMatrices().push();
        event.getMatrices().translate(particle.getPositionX() - cameraPos.x, particle.getPositionY() - cameraPos.y, particle.getPositionZ() - cameraPos.z);
        MatrixStack matrixStack = event.getMatrices();
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        matrixStack.multiply((Quaternionfc)\u0637\u062b.getCamera(gameRenderer).getRotation());
        event.getMatrices().multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotation(particle.getRotation()));
        MatrixStack.Entry entry = event.getMatrices().peek();
        Intrinsics.checkNotNullExpressionValue(entry, "last(...)");
        MatrixStack.Entry entry2 = entry;
        buffer.vertex(entry2, -halfSize, halfSize, 0.0f).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(0.0f, 0.0f);
        buffer.vertex(entry2, halfSize, halfSize, 0.0f).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(1.0f, 0.0f);
        buffer.vertex(entry2, halfSize, -halfSize, 0.0f).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(1.0f, 1.0f);
        buffer.vertex(entry2, -halfSize, -halfSize, 0.0f).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(0.0f, 1.0f);
        var1_1.getMatrices().pop();
    }

    @Override
    public void onEnable() {
        particles.clear();
    }

    @Commando
    public final void onAttack(@NotNull AttackEvent event) {
        Vec3d vec3d;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.isEnabled()) {
            return;
        }
        if (\u0636\u0643.getMc().player == null || \u0636\u0643.getMc().world == null) {
            return;
        }
        Entity entity = event.getEntity();
        HitResult hitResult = \u0636\u0643.getMc().crosshairTarget;
        if (hitResult instanceof EntityHitResult) {
            if (Intrinsics.areEqual(((EntityHitResult)hitResult).getEntity(), entity)) {
                vec3d = \u0637\u062b.getPos(hitResult);
            } else {
                Vec3d vec3d2 = \u0637\u062b.getPos(entity).add(0.0, (double)\u0637\u062b.getHeight(entity) * 0.5, 0.0);
                Intrinsics.checkNotNull(vec3d2);
                vec3d = vec3d2;
            }
        } else {
            Vec3d vec3d3 = \u0637\u062b.getPos(entity).add(0.0, (double)\u0637\u062b.getHeight(entity) * 0.5, 0.0);
            vec3d = vec3d3;
            Intrinsics.checkNotNullExpressionValue(vec3d3, "add(...)");
        }
        Vec3d hitPos = vec3d;
        long spawnedAt = System.nanoTime();
        double speedMultiplier = ((Number)speed.getValue()).floatValue();
        HitParticlesModule.ParticlePhysics physics = (HitParticlesModule.ParticlePhysics)((Object)HitParticlesModule.ParticlePhysics.getEntries().get(RangesKt.coerceIn(physicsMode.getSelectedIndex(), 0, CollectionsKt.getLastIndex((List)HitParticlesModule.ParticlePhysics.getEntries()))));
        int n = 1;
        int n2 = (int)((Number)count.getValue()).floatValue();
        int particleCount = Math.max(n, n2);
        double batchPhase = Random.Default.nextDouble(0.0, Math.PI * 2);
        int n3 = 0;
        while (n3 < particleCount) {
            Vec3d origin;
            int index = n3++;
            boolean bl = false;
            HitParticlesModule.SpawnMotion motion = INSTANCE.createSpawnMotion(physics, index, particleCount, batchPhase, speedMultiplier);
            Intrinsics.checkNotNullExpressionValue(hitPos.add(motion.getDirection().multiply(Random.Default.nextDouble(0.035, 0.12))).add(Random.Default.nextDouble(-0.025, 0.025), Random.Default.nextDouble(-0.02, 0.025), Random.Default.nextDouble(-0.025, 0.025)), "add(...)");
            float particleLifeTime = ((Number)lifeTime.getValue()).floatValue() * motion.getLifeTimeMultiplier() * (float)Random.Default.nextDouble(0.88, 1.12);
            particles.add(new HitParticlesModule.BurstParticle(physics, spawnedAt, spawnedAt, INSTANCE.secondsToNanos(particleLifeTime), ((Number)size.getValue()).floatValue() * (float)Random.Default.nextDouble(0.82, 1.18), INSTANCE.selectedTextureIndex(), motion.getDrag(), (double)((Number)gravity.getValue()).floatValue() * motion.getGravityMultiplier() * Random.Default.nextDouble(0.92, 1.08), motion.getAngularVelocity(), motion.getFadeStart(), motion.getShrinkAmount(), motion.getRestitution(), origin.x, origin.y, origin.z, motion.getVelocity().x, motion.getVelocity().y, motion.getVelocity().z, Math.exp(-motion.getDrag() * 0.008333333333333333), 0.0f, Random.Default.nextFloat() * (float)Math.PI * 2.0f, 0.0f, 0.0f, 0, false, 31981568, null));
        }
        if (particles.size() > 800) {
            particles.subList(0, particles.size() - 800).clear();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private final void simulateBouncingParticle(HitParticlesModule.BurstParticle particle, double step, ClientWorld world, PlayerEntity player) {
        void var34_24;
        void var22_18;
        void var32_23;
        void var1_1;
        double reboundSpeed;
        double tangentY;
        double tangentX;
        double normalY;
        double normalX;
        block6: {
            double tangentZ;
            block7: {
                void $this$raycast$iv;
                if (particle.getGrounded()) {
                    double groundDrag = step == 0.008333333333333333 ? FULL_STEP_GROUND_DRAG : Math.exp(-5.5 * step);
                    particle.setVelocityX(particle.getVelocityX() * groundDrag);
                    particle.setVelocityY(0.0);
                    particle.setVelocityZ(particle.getVelocityZ() * groundDrag);
                    particle.setPositionX(particle.getPositionX() + particle.getVelocityX() * step);
                    particle.setPositionZ(particle.getPositionZ() + particle.getVelocityZ() * step);
                    return;
                }
                double drag = this.dragFactor(particle, step);
                particle.setVelocityX(particle.getVelocityX() * drag);
                particle.setVelocityY((particle.getVelocityY() - particle.getGravity() * step) * drag);
                particle.setVelocityZ(particle.getVelocityZ() * drag);
                double intendedX = particle.getPositionX() + particle.getVelocityX() * step;
                double intendedY = particle.getPositionY() + particle.getVelocityY() * step;
                double intendedZ = particle.getPositionZ() + particle.getVelocityZ() * step;
                Vec3d startPosition = new Vec3d(particle.getPositionX(), particle.getPositionY(), particle.getPositionZ());
                Vec3d intendedPosition = new Vec3d(intendedX, intendedY, intendedZ);
                World world2 = (World)world;
                RaycastContext context$iv = new RaycastContext(startPosition, intendedPosition, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, (Entity)player);
                boolean $i$f$raycast = false;
                BlockHitResult blockHitResult = $this$raycast$iv.raycast(context$iv);
                Intrinsics.checkNotNullExpressionValue(blockHitResult, "clip(...)");
                BlockHitResult hit = blockHitResult;
                if (hit.getType() == HitResult.Type.MISS) {
                    particle.setPositionX(intendedX);
                    particle.setPositionY(intendedY);
                    particle.setPositionZ(intendedZ);
                    return;
                }
                Direction direction = hit.getSide();
                Intrinsics.checkNotNullExpressionValue(direction, "getDirection(...)");
                Direction direction2 = direction;
                normalX = direction2.getOffsetX();
                normalY = direction2.getOffsetY();
                double normalZ = direction2.getOffsetZ();
                double normalVelocity = particle.getVelocityX() * normalX + particle.getVelocityY() * normalY + particle.getVelocityZ() * normalZ;
                double surfaceOffset = Math.max(0.012, (double)particle.getInitialSize() * 0.58);
                particle.setPositionX(hit.getPos().x + normalX * surfaceOffset);
                particle.setPositionY(hit.getPos().y + normalY * surfaceOffset);
                particle.setPositionZ(hit.getPos().z + normalZ * surfaceOffset);
                if (normalVelocity >= 0.0) {
                    return;
                }
                tangentX = (particle.getVelocityX() - normalX * normalVelocity) * 0.74;
                tangentY = (particle.getVelocityY() - normalY * normalVelocity) * 0.74;
                tangentZ = (particle.getVelocityZ() - normalZ * normalVelocity) * 0.74;
                reboundSpeed = -normalVelocity * particle.getRestitution();
                int n = particle.getBounceCount();
                particle.setBounceCount(n + 1);
                particle.setImpactPulse(1.0f);
                particle.setAngularVelocity(particle.getAngularVelocity() * -0.72f);
                boolean floorCollision = normalY > 0.5;
                if (!floorCollision) break block6;
                if (reboundSpeed < 0.24) break block7;
                if (particle.getBounceCount() < 4) break block6;
            }
            particle.setVelocityX(tangentX * 0.72);
            particle.setVelocityY(0.0);
            particle.setVelocityZ(tangentZ * 0.72);
            particle.setGrounded(true);
            return;
        }
        particle.setVelocityX(tangentX + normalX * reboundSpeed);
        particle.setVelocityY(tangentY + normalY * reboundSpeed);
        var1_1.setVelocityZ((double)(var32_23 + var22_18 * var34_24));
    }

    /*
     * WARNING - void declaration
     */
    private final void updateParticles() {
        long now = System.nanoTime();
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            return;
        }
        ClientWorld world = clientWorld;
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        int writeIndex = 0;
        int readIndex = 0;
        int n = ((Collection)particles).size();
        while (readIndex < n) {
            void var6_5;
            HitParticlesModule.BurstParticle particle;
            Intrinsics.checkNotNullExpressionValue(particles.get(readIndex), "get(...)");
            long ageNanos = RangesKt.coerceAtLeast(now - particle.getSpawnedAtNanos(), 0L);
            if (ageNanos < particle.getLifeTimeNanos()) {
                void var23_15;
                void var21_14;
                void var19_13;
                if (writeIndex != readIndex) {
                    particles.set(writeIndex, particle);
                }
                ++writeIndex;
                double progress = RangesKt.coerceIn((double)ageNanos / (double)particle.getLifeTimeNanos(), 0.0, 1.0);
                double elapsedSeconds = RangesKt.coerceAtMost((double)RangesKt.coerceAtLeast(now - particle.getLastUpdatedAtNanos(), 0L) / 1.0E9, 0.12);
                particle.setLastUpdatedAtNanos(now);
                this.simulateParticle(particle, elapsedSeconds, world, (PlayerEntity)player);
                double appear = this.smoothStep(RangesKt.coerceIn(progress / 0.1, 0.0, 1.0));
                double fade = this.smoothStep(RangesKt.coerceIn((progress - particle.getFadeStart()) / (1.0 - particle.getFadeStart()), 0.0, 1.0));
                double pop = this.easeOutBack(RangesKt.coerceIn(progress / 0.16, 0.0, 1.0));
                double shrink = 1.0 - progress * particle.getShrinkAmount();
                double impactScale = 1.0 + (double)particle.getImpactPulse() * 0.16;
                particle.setAlpha(RangesKt.coerceIn((float)(appear * (1.0 - fade)), 0.0f, 1.0f));
                particle.setCurrentSize(RangesKt.coerceAtLeast((float)((double)particle.getInitialSize() * var19_13 * var21_14 * var23_15), 0.0f));
            }
            ++var6_5;
        }
        if (writeIndex < particles.size()) {
            void var5_4;
            particles.subList((int)var5_4, particles.size()).clear();
        }
    }

    private final double smoothStep(double value) {
        return value * value * (3.0 - 2.0 * value);
    }

    private final HitParticlesModule.ParticleRenderResources renderResources() {
        HitParticlesModule.ParticleRenderResources particleRenderResources = renderResources;
        if (particleRenderResources == null) {
            HitParticlesModule.ParticleRenderResources particleRenderResources2;
            HitParticlesModule.ParticleRenderResources it = particleRenderResources2 = new HitParticlesModule.ParticleRenderResources();
            boolean bl = false;
            renderResources = it;
            particleRenderResources = particleRenderResources2;
        }
        return particleRenderResources;
    }

    private final void simulateFreeParticle(HitParticlesModule.BurstParticle particle, double step) {
        double drag = this.dragFactor(particle, step);
        particle.setVelocityX(particle.getVelocityX() * drag);
        particle.setVelocityY((particle.getVelocityY() - particle.getGravity() * step) * drag);
        particle.setVelocityZ(particle.getVelocityZ() * drag);
        particle.setPositionX(particle.getPositionX() + particle.getVelocityX() * step);
        particle.setPositionY(particle.getPositionY() + particle.getVelocityY() * step);
        particle.setPositionZ(particle.getPositionZ() + particle.getVelocityZ() * step);
    }

    private static final boolean gravity$lambda$0() {
        return physicsMode.getSelectedIndex() == 1;
    }

    /*
     * WARNING - void declaration
     */
    static {
        void var3_3;
        void $this$map$iv;
        INSTANCE = new \u062f\u0638();
        useClientColor = Module.boolean$default(INSTANCE, "\u0426\u0432\u0435\u0442 \u043a\u043b\u0438\u0435\u043d\u0442\u0430", true, null, 4, null).setVisible(\u062f\u0638::useClientColor$lambda$0);
        Module module = INSTANCE;
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        particleColor = Module.color$default(module, "\u0426\u0432\u0435\u0442", color, null, 4, null).setVisible(\u062f\u0638::particleColor$lambda$0);
        String[] stringArray = new String[2];
        stringArray[0] = "\u0412\u0437\u0440\u044b\u0432";
        stringArray[1] = "\u041e\u0442\u0441\u043a\u043e\u043a\u0438";
        physicsMode = Module.mode$default(INSTANCE, "\u0424\u0438\u0437\u0438\u043a\u0430", CollectionsKt.listOf(stringArray), 0, null, 8, null);
        stringArray = new String[9];
        stringArray[0] = "\u0414\u043e\u043b\u043b\u0430\u0440";
        stringArray[1] = "\u0421\u0432\u0435\u0447\u0435\u043d\u0438\u0435";
        stringArray[2] = "\u0421\u0435\u0440\u0434\u0446\u0435";
        stringArray[3] = "\u041c\u043e\u043b\u043d\u0438\u044f";
        stringArray[4] = "\u0422\u043e\u0447\u043a\u0430";
        stringArray[5] = "\u0421\u043d\u0435\u0436\u0438\u043d\u043a\u0430";
        stringArray[6] = "\u0417\u0432\u0435\u0437\u0434\u0430";
        stringArray[7] = "\u0420\u0443\u0431";
        stringArray[8] = "\u0420\u0430\u043d\u0434\u043e\u043c";
        particleType = Module.mode$default(INSTANCE, "\u0421\u0442\u0438\u043b\u044c", CollectionsKt.listOf(stringArray), 1, null, 8, null);
        count = Module.slider$default(INSTANCE, "\u041a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e", 20.0f, 1.0f, 40.0f, 1.0f, null, 32, null);
        size = Module.slider$default(INSTANCE, "\u0420\u0430\u0437\u043c\u0435\u0440", 0.15f, 0.1f, 0.25f, 0.01f, null, 32, null);
        speed = INSTANCE.slider("\u0421\u0438\u043b\u0430 \u0440\u0430\u0437\u043b\u0451\u0442\u0430", 1.5f, 0.6f, 2.0f, 0.05f, "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c");
        gravity = Module.slider$default(INSTANCE, "\u0413\u0440\u0430\u0432\u0438\u0442\u0430\u0446\u0438\u044f", 4.0f, 0.0f, 4.0f, 0.1f, null, 32, null).setVisible(\u062f\u0638::gravity$lambda$0);
        lifeTime = Module.slider$default(INSTANCE, "\u0412\u0440\u0435\u043c\u044f \u0436\u0438\u0437\u043d\u0438", 0.8f, 0.5f, 2.0f, 0.05f, null, 32, null);
        particles = new ArrayList();
        FULL_STEP_ROTATION_DECAY = (float)Math.exp(-0.004583333333333333);
        FULL_STEP_IMPACT_DECAY = (float)Math.exp(-0.075);
        FULL_STEP_GROUND_DRAG = Math.exp(-0.04583333333333333);
        GOLDEN_ANGLE = Math.PI * (3.0 - Math.sqrt(5.0));
        stringArray = new String[8];
        stringArray[0] = "dollar.png";
        stringArray[1] = "glow.png";
        stringArray[2] = "heart.png";
        $this$map$iv[3] = "lightning.png";
        $this$map$iv[4] = "point.png";
        $this$map$iv[5] = "snowflake.png";
        $this$map$iv[6] = "star.png";
        $this$map$iv[7] = "starnew.png";
        boolean $i$f$map = false;
        void $this$mapTo$iv$iv = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(((void)$this$map$iv).length);
        boolean $i$f$mapTo = false;
        int n = ((void)$this$mapTo$iv$iv).length;
        for (int i = 0; i < n; ++i) {
            void var2_2;
            void var7_7 = var2_2[i];
            void var8_8 = var7_7;
            void var10_10 = var3_3;
            boolean bl = false;
            var10_10.add(Identifier.of((String)"rain", (String)("images/particles/" + (String)var8_8)));
        }
        PARTICLE_TEXTURES = (List)var3_3;
        RANDOM_MODE_INDEX = PARTICLE_TEXTURES.size();
    }

    private final double easeOutBack(double value) {
        double shifted = value - 1.0;
        return 1.0 + 2.70158 * shifted * shifted * shifted + 1.70158 * shifted * shifted;
    }

    private final Color selectedColor() {
        return (Boolean)useClientColor.getValue() != false && \u0638\u062b.INSTANCE.isEnabled() ? \u0638\u062b.INSTANCE.getClientColor() : (Color)particleColor.getValue();
    }
}

