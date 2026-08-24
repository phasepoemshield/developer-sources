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
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.math.RotationAxis
 *  net.minecraft.util.math.Vec3d
 *  org.joml.Quaternionfc
 */
package oxxxde;

import java.awt.Color;
import java.util.ArrayList;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.TracesModule;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001QB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJO\u0010\u0019\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ7\u0010%\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H\u0002\u00a2\u0006\u0004\b'\u0010(J'\u0010*\u001a\u00020)2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020)2\u0006\u0010,\u001a\u00020)H\u0002\u00a2\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b1\u0010\u0003R\u0014\u00102\u001a\u00020\u00148\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u0002048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b7\u00106R\u0014\u00108\u001a\u0002048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b8\u00106R\u0014\u00109\u001a\u00020)8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b>\u0010=R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bF\u0010GR$\u0010J\u001a\u0012\u0012\u0004\u0012\u00020\u00100Hj\b\u0012\u0004\u0012\u00020\u0010`I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010O\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bO\u0010P\u00a8\u0006R"}, d2={"Loxxxde/\u062e\u064a;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u0633\u062d;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Loxxxde/\u0634\u062b;", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Lnet/minecraft/class_4588;", "buffer", "Loxxxde/\u0639\u0631;", "point", "Lnet/minecraft/class_243;", "cameraPos", "", "red", "green", "blue", "alpha", "renderTrailPoint", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4588;Lkotakbaz/rain/module/modules/render/TracesModule$TrailPoint;Lnet/minecraft/class_243;IIII)V", "", "now", "updateSelfTrail", "(J)V", "currentPos", "previousPos", "velocity", "", "onGround", "time", "appendTrailPointIfNeeded", "(Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;ZJ)V", "resolveLastPosition", "(Lnet/minecraft/class_243;Lnet/minecraft/class_243;Z)Lnet/minecraft/class_243;", "", "calculateMovementYaw", "(Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)F", "progress", "calculateAlpha", "(F)F", "lifetimeMillis", "()J", "clearState", "BUFFER_SIZE", "I", "", "MIN_DISTANCE_FOR_YAW", "D", "MAX_POINT_DISTANCE", "TRAIL_Y_OFFSET", "TRAIL_SIZE", "F", "Loxxxde/\u0637\u064f;", "trailLifetime", "Loxxxde/\u0637\u064f;", "stepDistance", "Loxxxde/\u062e\u0630;", "useClientColor", "Loxxxde/\u062e\u0630;", "Loxxxde/\u0631\u062a;", "trailColor", "Loxxxde/\u0631\u062a;", "Lnet/minecraft/class_2960;", "texture", "Lnet/minecraft/class_2960;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "trailPoints", "Ljava/util/ArrayList;", "Lnet/minecraft/class_638;", "trackedWorld", "Lnet/minecraft/class_638;", "lastSelfPosition", "Lnet/minecraft/class_243;", "TrailPoint", "rain-visuals"})
public final class \u062e\u064a
extends Module {
    @Nullable
    private static ClientWorld trackedWorld;
    private static final double TRAIL_Y_OFFSET = 0.05;
    @NotNull
    private static final BooleanSetting useClientColor;
    @NotNull
    private static final SliderSetting trailLifetime;
    private static final int BUFFER_SIZE = 262144;
    @NotNull
    private static final ArrayList<TracesModule.TrailPoint> trailPoints;
    @NotNull
    private static final ColorSetting trailColor;
    @NotNull
    private static final Identifier texture;
    private static final double MAX_POINT_DISTANCE = 3.0;
    @NotNull
    public static final \u062e\u064a INSTANCE;
    private static final double MIN_DISTANCE_FOR_YAW = 0.01;
    @NotNull
    private static final SliderSetting stepDistance;
    private static final float TRAIL_SIZE = 1.1f;
    @Nullable
    private static Vec3d lastSelfPosition;

    private final void appendTrailPointIfNeeded(Vec3d currentPos, Vec3d previousPos, Vec3d velocity, boolean onGround, long time) {
        double distance = currentPos.distanceTo(previousPos);
        if (onGround && distance >= (double)((Number)stepDistance.getValue()).floatValue() && distance <= 3.0) {
            trailPoints.add(new TracesModule.TrailPoint(currentPos, this.calculateMovementYaw(velocity, previousPos, currentPos), time));
        }
    }

    @Override
    public void onDisable() {
        this.clearState();
    }

    private \u062e\u064a() {
        super("Traces", \u0638\u0646.getRENDER(), "\u0412\u0438\u0437\u0443\u0430\u043b\u044c\u043d\u044b\u0435 \u0441\u043b\u0435\u0434\u044b \u0445\u043e\u0434\u044c\u0431\u044b");
    }

    /*
     * WARNING - void declaration
     */
    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        void var3_6;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.isEnabled()) {
            return;
        }
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            \u062e\u064a $this$onUpdate_u24lambda_u240 = this;
            boolean bl = false;
            $this$onUpdate_u24lambda_u240.clearState();
            return;
        }
        ClientWorld world = clientWorld;
        if (trackedWorld != world) {
            this.clearState();
            trackedWorld = world;
        }
        long now = System.currentTimeMillis();
        long lifetimeMillis = this.lifetimeMillis();
        trailPoints.removeIf(arg_0 -> \u062e\u064a.onUpdate$lambda$2(arg_0 -> \u062e\u064a.onUpdate$lambda$1(now, lifetimeMillis, arg_0), arg_0));
        this.updateSelfTrail((long)var3_6);
    }

    /*
     * WARNING - void declaration
     */
    private final Vec3d resolveLastPosition(Vec3d previousPos, Vec3d currentPos, boolean onGround) {
        void var1_1;
        double distance = currentPos.distanceTo(previousPos);
        return !onGround || distance >= (double)((Number)stepDistance.getValue()).floatValue() && distance <= 3.0 ? currentPos : var1_1;
    }

    private final long lifetimeMillis() {
        return RangesKt.coerceAtLeast((long)(((Number)trailLifetime.getValue()).floatValue() * 1000.0f), 1L);
    }

    private final void clearState() {
        trailPoints.clear();
        trackedWorld = null;
        lastSelfPosition = null;
    }

    /*
     * WARNING - void declaration
     */
    private final void renderTrailPoint(Render3DEvent event, VertexConsumer buffer, TracesModule.TrailPoint point, Vec3d cameraPos, int red, int green, int blue, int alpha) {
        void var1_1;
        float halfSize = 0.55f;
        event.getMatrices().push();
        event.getMatrices().translate(point.getPosition().x - cameraPos.x, point.getPosition().y - cameraPos.y + 0.05, point.getPosition().z - cameraPos.z);
        event.getMatrices().multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(-point.getYaw() + 180.0f));
        event.getMatrices().scale(1.1f, 1.1f, 1.1f);
        MatrixStack.Entry entry = event.getMatrices().peek();
        Intrinsics.checkNotNullExpressionValue(entry, "last(...)");
        MatrixStack.Entry entry2 = entry;
        buffer.vertex(entry2, -halfSize, 0.0f, -halfSize).color(red, green, blue, alpha).texture(0.0f, 0.0f);
        buffer.vertex(entry2, halfSize, 0.0f, -halfSize).color(red, green, blue, alpha).texture(1.0f, 0.0f);
        buffer.vertex(entry2, halfSize, 0.0f, halfSize).color(red, green, blue, alpha).texture(1.0f, 1.0f);
        buffer.vertex(entry2, -halfSize, 0.0f, halfSize).color(red, green, blue, alpha).texture(0.0f, 1.0f);
        var1_1.getMatrices().pop();
    }

    private final float calculateAlpha(float progress) {
        return progress < 0.2f ? RangesKt.coerceIn(progress / 0.2f, 0.0f, 1.0f) : (progress > 0.8f ? RangesKt.coerceIn(1.0f - (progress - 0.8f) / 0.2f, 0.0f, 1.0f) : 1.0f);
    }

    private static final boolean useClientColor$lambda$0() {
        return \u0638\u062b.INSTANCE.isEnabled();
    }

    @Override
    public void onEnable() {
        this.clearState();
    }

    private final void updateSelfTrail(long now) {
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            \u062e\u064a $this$updateSelfTrail_u24lambda_u240 = this;
            boolean bl = false;
            lastSelfPosition = null;
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        Vec3d currentPos = \u0637\u062b.getPos((Entity)player);
        Vec3d previousPos = lastSelfPosition;
        if (previousPos == null) {
            lastSelfPosition = currentPos;
            return;
        }
        this.appendTrailPointIfNeeded(currentPos, previousPos, \u0637\u062b.getVelocity((Entity)player), player.isOnGround(), now);
        lastSelfPosition = this.resolveLastPosition(previousPos, currentPos, player.isOnGround());
    }

    private static final boolean onUpdate$lambda$2(Function1 $tmp0, Object p0) {
        return (Boolean)$tmp0.invoke(p0);
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
        if (trailPoints.isEmpty()) {
            return;
        }
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        Vec3d cameraPos = \u0637\u062b.getPos(\u0637\u062b.getCamera(gameRenderer));
        long now = System.currentTimeMillis();
        float lifetimeMillis = RangesKt.coerceAtLeast((float)this.lifetimeMillis(), 1.0f);
        Color selectedColor = (Boolean)useClientColor.getValue() != false && \u0638\u062b.INSTANCE.isEnabled() ? \u0638\u062b.INSTANCE.getClientColor() : (Color)trailColor.getValue();
        RenderLayer layer = RainRenderLayers.getTrailSprite(texture);
        try (BufferAllocator allocator = new BufferAllocator(262144);){
            void var11_11;
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)allocator);
            Intrinsics.checkNotNullExpressionValue(immediate, "immediate(...)");
            VertexConsumerProvider.Immediate consumers = immediate;
            VertexConsumer vertexConsumer = consumers.getBuffer(layer);
            Intrinsics.checkNotNullExpressionValue(vertexConsumer, "getBuffer(...)");
            VertexConsumer buffer = vertexConsumer;
            Iterable $this$forEach$iv = trailPoints;
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                void var19_19;
                TracesModule.TrailPoint point = (TracesModule.TrailPoint)element$iv;
                boolean bl = false;
                float progress = RangesKt.coerceAtLeast((float)(now - point.getTime()) / lifetimeMillis, 0.0f);
                float alphaFactor = INSTANCE.calculateAlpha(progress);
                if (alphaFactor <= 0.0f) continue;
                int alpha = RangesKt.coerceIn((int)((float)selectedColor.getAlpha() * alphaFactor), 0, 255);
                if (alpha <= 0) continue;
                INSTANCE.renderTrailPoint(event, buffer, point, cameraPos, selectedColor.getRed(), selectedColor.getGreen(), selectedColor.getBlue(), (int)var19_19);
            }
            VertexConsumerProvider.Immediate $this$draw$iv = consumers;
            boolean bl = false;
            var11_11.draw();
        }
    }

    static {
        INSTANCE = new \u062e\u064a();
        trailLifetime = Module.slider$default(INSTANCE, "\u0412\u0440\u0435\u043c\u044f \u0436\u0438\u0437\u043d\u0438", 1.5f, 0.5f, 5.0f, 0.1f, null, 32, null);
        stepDistance = Module.slider$default(INSTANCE, "\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f", 1.5f, 1.0f, 2.5f, 0.1f, null, 32, null);
        useClientColor = Module.boolean$default(INSTANCE, "\u0426\u0432\u0435\u0442 \u043a\u043b\u0438\u0435\u043d\u0442\u0430", false, null, 4, null).setVisible(\u062e\u064a::useClientColor$lambda$0);
        Module module = INSTANCE;
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        trailColor = Module.color$default(module, "\u0426\u0432\u0435\u0442", color, null, 4, null).setVisible(\u062e\u064a::trailColor$lambda$0);
        Identifier identifier = Identifier.of((String)"rain", (String)"textures/world/trails/trails.png");
        Intrinsics.checkNotNullExpressionValue(identifier, "fromNamespaceAndPath(...)");
        texture = identifier;
        trailPoints = new ArrayList();
    }

    private final float calculateMovementYaw(Vec3d velocity, Vec3d previousPos, Vec3d currentPos) {
        double velocityHorizontal = Math.sqrt(velocity.x * velocity.x + velocity.z * velocity.z);
        if (velocityHorizontal > 0.01) {
            return (float)Math.toDegrees(Math.atan2(-velocity.x, velocity.z));
        }
        double deltaX = currentPos.x - previousPos.x;
        double deltaZ = currentPos.z - previousPos.z;
        double deltaHorizontal = Math.sqrt(deltaX * deltaX + deltaZ * deltaZ);
        if (deltaHorizontal > 0.01) {
            return (float)Math.toDegrees(Math.atan2(-deltaX, deltaZ));
        }
        return 0.0f;
    }

    private static final boolean onUpdate$lambda$1(long $now, long $lifetimeMillis, TracesModule.TrailPoint it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return $now - it.getTime() > $lifetimeMillis;
    }

    private static final boolean trailColor$lambda$0() {
        return !((Boolean)useClientColor.getValue()).booleanValue() || !\u0638\u062b.INSTANCE.isEnabled();
    }
}

