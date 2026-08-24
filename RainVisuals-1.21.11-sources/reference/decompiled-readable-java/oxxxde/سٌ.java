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
 *  net.minecraft.client.util.math.MatrixStack$Entry
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.math.RotationAxis
 *  net.minecraft.util.math.Vec3d
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import java.awt.Color;
import java.util.ArrayList;
import kotakbaz.rain.event.events.AttackEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.HitBubblesModule;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
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
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u062b;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001>B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\b!\u0010 J\u0017\u0010#\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b%\u0010$J\u001f\u0010(\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0002\u00a2\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b-\u0010\u0003R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b5\u00106R$\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u001307j\b\u0012\u0004\u0012\u00020\u0013`88\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b<\u0010=\u00a8\u0006?"}, d2={"Loxxxde/\u0633\u064c;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u0630\u0645;", "event", "onAttack", "(Lkotakbaz/rain/event/events/AttackEvent;)V", "Loxxxde/\u0633\u062d;", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Loxxxde/\u0634\u062b;", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Lnet/minecraft/class_4588;", "buffer", "Loxxxde/\u062f\u062b;", "particle", "Lnet/minecraft/class_243;", "cameraPos", "", "scale", "alphaProgress", "rotationProgress", "renderParticle", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4588;Lkotakbaz/rain/module/modules/render/HitBubblesModule$Particle;Lnet/minecraft/class_243;FFF)V", "", "age", "computeAlpha", "(J)F", "computeRotationProgress", "value", "expoOut", "(F)F", "expoIn", "min", "max", "randomRange", "(FF)F", "Ljava/awt/Color;", "selectedColor", "()Ljava/awt/Color;", "clearState", "Lnet/minecraft/class_2960;", "bubbleTexture", "Lnet/minecraft/class_2960;", "Loxxxde/\u062e\u0630;", "useClientColor", "Loxxxde/\u062e\u0630;", "Loxxxde/\u0631\u062a;", "bubbleColor", "Loxxxde/\u0631\u062a;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "particles", "Ljava/util/ArrayList;", "Lnet/minecraft/class_638;", "trackedWorld", "Lnet/minecraft/class_638;", "Particle", "rain-visuals"})
@RecompileFormat
public final class \u0633\u064c
extends Module {
    @NotNull
    private static final ArrayList<HitBubblesModule.Particle> particles;
    @NotNull
    private static final ColorSetting bubbleColor;
    @NotNull
    public static final \u0633\u064c INSTANCE;
    @Nullable
    private static ClientWorld trackedWorld;
    @NotNull
    private static final Identifier bubbleTexture;
    @NotNull
    private static final BooleanSetting useClientColor;

    /*
     * WARNING - void declaration
     */
    private final void renderParticle(Render3DEvent event, VertexConsumer buffer, HitBubblesModule.Particle particle, Vec3d cameraPos, float scale, float alphaProgress, float rotationProgress) {
        void var1_1;
        Color baseColor = this.selectedColor();
        Color color = new Color(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), RangesKt.coerceIn((int)(alphaProgress * 255.0f), 0, 255));
        float size = scale / 1.5f;
        event.getMatrices().push();
        event.getMatrices().translate(particle.getPosition().x - cameraPos.x, particle.getPosition().y - cameraPos.y, particle.getPosition().z - cameraPos.z);
        event.getMatrices().multiply((Quaternionfc)particle.getSpawnRotation());
        event.getMatrices().multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(particle.getRotX() * rotationProgress));
        event.getMatrices().multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(particle.getRotY() * rotationProgress));
        event.getMatrices().multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotationDegrees(rotationProgress * 360.0f * particle.getRotZDir()));
        MatrixStack.Entry entry = event.getMatrices().peek();
        Intrinsics.checkNotNullExpressionValue(entry, "last(...)");
        MatrixStack.Entry entry2 = entry;
        int n = 2;
        int n2 = 0;
        while (n2 < n) {
            int it = n2++;
            boolean bl = false;
            buffer.vertex(entry2, -size, size, 0.0f).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).texture(0.0f, 0.0f);
            buffer.vertex(entry2, size, size, 0.0f).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).texture(1.0f, 0.0f);
            buffer.vertex(entry2, size, -size, 0.0f).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).texture(1.0f, 1.0f);
            buffer.vertex(entry2, -size, -size, 0.0f).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).texture(0.0f, 1.0f);
        }
        var1_1.getMatrices().pop();
    }

    private final float computeRotationProgress(long age) {
        return this.expoOut(RangesKt.coerceIn((float)age / 5000.0f, 0.0f, 1.0f)) * 2.0f;
    }

    private final float computeAlpha(long age) {
        return age <= 1000L ? this.expoOut(RangesKt.coerceIn((float)age / 1000.0f, 0.0f, 1.0f)) : (age <= 1600L ? 1.0f - this.expoIn(RangesKt.coerceIn((float)(age - 1000L) / 600.0f, 0.0f, 1.0f)) : 0.0f);
    }

    private final void clearState() {
        particles.clear();
        trackedWorld = \u0636\u0643.getMc().world;
    }

    private static final boolean useClientColor$lambda$0() {
        return \u0638\u062b.INSTANCE.isEnabled();
    }

    private static final boolean onUpdate$lambda$2(Function1 $tmp0, Object p0) {
        return (Boolean)$tmp0.invoke(p0);
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.isEnabled()) {
            return;
        }
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            \u0633\u064c $this$onUpdate_u24lambda_u240 = this;
            boolean bl = false;
            $this$onUpdate_u24lambda_u240.clearState();
            return;
        }
        ClientWorld world = clientWorld;
        if (trackedWorld != world) {
            this.clearState();
            trackedWorld = world;
        }
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        long now = System.currentTimeMillis();
        particles.removeIf(arg_0 -> \u0633\u064c.onUpdate$lambda$2(arg_0 -> \u0633\u064c.onUpdate$lambda$1(now, player, arg_0), arg_0));
    }

    static {
        INSTANCE = new \u0633\u064c();
        Identifier identifier = Identifier.of((String)"rain", (String)"images/hit/bubble.png");
        Intrinsics.checkNotNullExpressionValue(identifier, "fromNamespaceAndPath(...)");
        bubbleTexture = identifier;
        useClientColor = Module.boolean$default(INSTANCE, "\u0426\u0432\u0435\u0442 \u043a\u043b\u0438\u0435\u043d\u0442\u0430", false, null, 4, null).setVisible(\u0633\u064c::useClientColor$lambda$0);
        Module module = INSTANCE;
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        bubbleColor = Module.color$default(module, "\u0426\u0432\u0435\u0442", color, null, 4, null).setVisible(\u0633\u064c::bubbleColor$lambda$0);
        particles = new ArrayList();
    }

    private final float randomRange(float min, float max) {
        return min + Random.Default.nextFloat() * (max - min);
    }

    @Override
    public void onEnable() {
        this.clearState();
    }

    private final Color selectedColor() {
        return (Boolean)useClientColor.getValue() != false && \u0638\u062b.INSTANCE.isEnabled() ? \u0638\u062b.INSTANCE.getClientColor() : (Color)bubbleColor.getValue();
    }

    private final float expoOut(float value) {
        return value >= 1.0f ? 1.0f : 1.0f - (float)Math.pow(2.0f, -10.0f * value);
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
        if (particles.isEmpty()) {
            return;
        }
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        Vec3d cameraPos = \u0637\u062b.getPos(\u0637\u062b.getCamera(gameRenderer));
        AutoCloseable autoCloseable = (AutoCloseable)new BufferAllocator(262144);
        Throwable throwable = null;
        try {
            void var13_15;
            void var12_13;
            BufferAllocator allocator = (BufferAllocator)autoCloseable;
            boolean bl = false;
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)allocator);
            Intrinsics.checkNotNullExpressionValue(immediate, "immediate(...)");
            VertexConsumerProvider.Immediate consumers = immediate;
            RenderLayer layer = RainRenderLayers.getTrailSprite(bubbleTexture);
            VertexConsumer vertexConsumer = consumers.getBuffer(layer);
            Intrinsics.checkNotNullExpressionValue(vertexConsumer, "getBuffer(...)");
            VertexConsumer buffer = vertexConsumer;
            long now = System.currentTimeMillis();
            Iterable $this$forEach$iv = particles;
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                void var22_24;
                HitBubblesModule.Particle particle = (HitBubblesModule.Particle)element$iv;
                boolean bl2 = false;
                long age = now - particle.getCreatedAt();
                float alphaProgress = INSTANCE.computeAlpha(age);
                if (alphaProgress <= 0.0f) continue;
                float scale = alphaProgress;
                float rotationProgress = INSTANCE.computeRotationProgress(age);
                INSTANCE.renderParticle(event, buffer, particle, cameraPos, scale, alphaProgress, (float)var22_24);
            }
            $this$forEach$iv = consumers;
            Intrinsics.checkNotNull(layer);
            RenderLayer layer$iv = layer;
            boolean $i$f$draw = false;
            var12_13.draw((RenderLayer)var13_15);
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final boolean onUpdate$lambda$1(long $now, ClientPlayerEntity $player, HitBubblesModule.Particle particle) {
        Intrinsics.checkNotNullParameter(particle, "particle");
        if ($now - particle.getCreatedAt() > 3500L) return true;
        if (!(\u0637\u062b.getPos((Entity)$player).distanceTo(particle.getPosition()) > 100.0)) return false;
        return true;
    }

    @Commando
    public final void onAttack(@NotNull AttackEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.isEnabled()) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        Entity entity = event.getEntity();
        LivingEntity livingEntity = entity instanceof LivingEntity ? (LivingEntity)entity : null;
        if (livingEntity == null) {
            return;
        }
        LivingEntity target = livingEntity;
        if (Intrinsics.areEqual(target, player)) {
            return;
        }
        Vec3d vec3d = \u0637\u062b.getPos((Entity)player).subtract(\u0637\u062b.getPos((Entity)target));
        Intrinsics.checkNotNullExpressionValue(vec3d, "subtract(...)");
        Vec3d directionToPlayer = vec3d;
        Vec3d vec3d2 = directionToPlayer.lengthSquared() > 1.0E-6 ? directionToPlayer.normalize() : new Vec3d(0.0, 0.0, 1.0);
        Intrinsics.checkNotNull(vec3d2);
        Vec3d direction = vec3d2;
        Vec3d vec3d3 = \u0637\u062b.getPos((Entity)target).add(0.0, (double)\u0637\u062b.getHeight((Entity)target) / 1.55, 0.0).add(direction.multiply((double)\u0637\u062b.getWidth((Entity)target) / 2.0 + 0.2));
        Intrinsics.checkNotNullExpressionValue(vec3d3, "add(...)");
        Vec3d particlePosition = vec3d3;
        long l = System.currentTimeMillis();
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        particles.add(new HitBubblesModule.Particle(l, particlePosition, new Quaternionf((Quaternionfc)\u0637\u062b.getCamera(gameRenderer).getRotation()), Random.Default.nextFloat() * 20.0f - this.randomRange(-25.0f, 30.0f), Random.Default.nextFloat() * 20.0f - 10.0f, Random.Default.nextBoolean() ? 1.0f : -1.0f));
    }

    private final float expoIn(float value) {
        return value <= 0.0f ? 0.0f : (float)Math.pow(2.0f, 10.0f * value - 10.0f);
    }

    @Override
    public void onDisable() {
        this.clearState();
    }

    private \u0633\u064c() {
        super("HitBubbles", \u0638\u0646.getRENDER(), "\u0421\u043e\u0437\u0434\u0430\u0451\u0442 \u043f\u043e\u0440\u0442\u0430\u043b\u044b \u043f\u0440\u0438 \u0443\u0434\u0430\u0440\u0435");
    }

    private static final boolean bubbleColor$lambda$0() {
        return !((Boolean)useClientColor.getValue()).booleanValue() || !\u0638\u062b.INSTANCE.isEnabled();
    }
}

