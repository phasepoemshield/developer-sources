/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.VertexConsumerProvider$Immediate
 *  net.minecraft.client.util.BufferAllocator
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.util.math.MatrixStack$Entry
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.RotationAxis
 *  net.minecraft.util.math.Vec3d
 *  org.joml.Quaternionfc
 *  ru.ocz.protection.annotation.Compile
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.BlinkModule;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RainRenderLayers;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Quaternionfc;
import oxxxde.\u0627\u0625;
import oxxxde.\u0628\u062d;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u062b;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.annotation.Compile;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\u008b\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u0003J7\u0010$\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\"H\u0002\u00a2\u0006\u0004\b$\u0010%J7\u0010+\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b+\u0010,J_\u00104\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020(2\u0006\u00101\u001a\u00020(2\u0006\u00102\u001a\u00020(2\u0006\u00103\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b4\u00105J?\u00106\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00100\u001a\u00020(2\u0006\u00101\u001a\u00020(2\u0006\u00102\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b6\u00107JW\u0010>\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020(2\u0006\u0010:\u001a\u00020(2\u0006\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b>\u0010?JW\u0010H\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020(2\u0006\u0010D\u001a\u00020(2\u0006\u0010E\u001a\u00020(2\u0006\u0010F\u001a\u00020(2\u0006\u0010G\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\bH\u0010IJW\u0010J\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020(2\u0006\u0010D\u001a\u00020(2\u0006\u0010E\u001a\u00020(2\u0006\u0010F\u001a\u00020(2\u0006\u0010G\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\bJ\u0010IJW\u0010K\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020@2\u0006\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020(2\u0006\u0010:\u001a\u00020(2\u0006\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\bK\u0010IJW\u0010L\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020@2\u0006\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020(2\u0006\u0010:\u001a\u00020(2\u0006\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\bL\u0010IJW\u0010M\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020@2\u0006\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020(2\u0006\u0010:\u001a\u00020(2\u0006\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\bM\u0010IJ\u0087\u0001\u0010T\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020@2\u0006\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020(2\u0006\u0010:\u001a\u00020(2\u0006\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020(2\u0006\u0010N\u001a\u00020(2\u0006\u0010O\u001a\u00020(2\u0006\u0010P\u001a\u00020(2\u0006\u0010Q\u001a\u00020(2\u0006\u0010R\u001a\u00020(2\u0006\u0010S\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\bT\u0010UJ\u001b\u0010X\u001a\u00020\u00042\n\b\u0002\u0010W\u001a\u0004\u0018\u00010VH\u0002\u00a2\u0006\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020Z8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b_\u0010\\R\u0014\u0010a\u001a\u00020`8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010e\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\be\u0010dR\u0014\u0010f\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bf\u0010dR\u0014\u0010g\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bg\u0010dR\u0014\u0010h\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bh\u0010dR\u0014\u0010i\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bi\u0010dR\u0014\u0010j\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bj\u0010dR\u0014\u0010k\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bk\u0010dR\u0014\u0010l\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bl\u0010dR\u0014\u0010m\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bm\u0010dR\u0014\u0010n\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bn\u0010dR\u0014\u0010o\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bo\u0010dR\u0014\u0010p\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bp\u0010dR\u0014\u0010q\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bq\u0010dR\u0014\u0010r\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\br\u0010dR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010!\u001a\u00020v8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010wR\u0014\u0010x\u001a\u00020s8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bx\u0010uR\u0014\u0010y\u001a\u00020s8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\by\u0010uR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b{\u0010|R@\u0010\u0081\u0001\u001a+\u0012\u0004\u0012\u00020~\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u007f0}j\u0015\u0012\u0004\u0012\u00020~\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u007f`\u0080\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R5\u0010\u0085\u0001\u001a \u0012\u0004\u0012\u00020~\u0012\u0004\u0012\u00020\"0\u0083\u0001j\u000f\u0012\u0004\u0012\u00020~\u0012\u0004\u0012\u00020\"`\u0084\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u0089\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0089\u0001\u0010dR\u0018\u0010\u008a\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u008a\u0001\u0010^\u00a8\u0006\u008c\u0001"}, d2={"Loxxxde/\u0628\u064e;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u0633\u062d;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Loxxxde/\u0634\u062b;", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Lnet/minecraft/class_1657;", "player", "", "shouldCreateSnapshot", "(Lnet/minecraft/class_1657;)Z", "", "currentTime", "pruneExpiredSnapshots", "(J)V", "snapshotLifetime", "()J", "Ljava/awt/Color;", "resolveBlinkColor", "()Ljava/awt/Color;", "updateDashOffset", "Lnet/minecraft/class_4588;", "buffer", "Loxxxde/\u062e\u0628;", "snapshot", "color", "Lnet/minecraft/class_243;", "cameraPos", "renderPlayerSnapshot", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4588;Lkotakbaz/rain/module/modules/render/BlinkModule$BlinkSnapshot;Ljava/awt/Color;Lnet/minecraft/class_243;)V", "Lnet/minecraft/class_4587;", "matrices", "", "yaw", "pitch", "renderHead", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;FFLjava/awt/Color;)V", "x", "y", "z", "width", "height", "depth", "rotationX", "renderPart", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;FFFFFFFLjava/awt/Color;)V", "renderCenteredPrism", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;FFFLjava/awt/Color;)V", "x1", "y1", "z1", "x2", "y2", "z2", "renderPrism", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;FFFFFFLjava/awt/Color;)V", "Lnet/minecraft/class_4587$class_4665;", "entry", "minX", "minY", "minZ", "maxX", "maxY", "maxZ", "emitOutline", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;FFFFFFLjava/awt/Color;)V", "emitDashedOutline", "emitDashedLine", "emitLine", "emitSolidBox", "x3", "y3", "z3", "x4", "y4", "z4", "emitQuad", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;FFFFFFFFFFFFLjava/awt/Color;)V", "Lnet/minecraft/class_638;", "world", "clearState", "(Lnet/minecraft/class_638;)V", "", "BUFFER_SIZE", "I", "SNAPSHOT_DELAY_MS", "J", "MAX_SNAPSHOTS", "", "MIN_MOVE_DISTANCE", "D", "OUTLINE_WIDTH", "F", "THICKNESS_SCALE", "MIN_THICKNESS", "MIN_SEGMENT_LENGTH", "DASH_LENGTH", "DASH_GAP", "DASH_WRAP", "DASH_ANIMATION_SPEED", "HEAD_SIZE", "BODY_WIDTH", "BODY_HEIGHT", "BODY_DEPTH", "LIMB_WIDTH", "ARM_HEIGHT", "LEG_HEIGHT", "Loxxxde/\u062e\u0630;", "useClientColor", "Loxxxde/\u062e\u0630;", "Loxxxde/\u0631\u062a;", "Loxxxde/\u0631\u062a;", "fill", "dashedOutline", "Loxxxde/\u0637\u064f;", "myLifetime", "Loxxxde/\u0637\u064f;", "Ljava/util/LinkedHashMap;", "Ljava/util/UUID;", "", "Lkotlin/collections/LinkedHashMap;", "playerSnapshots", "Ljava/util/LinkedHashMap;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "lastPositions", "Ljava/util/HashMap;", "trackedWorld", "Lnet/minecraft/class_638;", "dashOffset", "lastFrameTime", "BlinkSnapshot", "rain-visuals"})
@RecompileFormat
public final class \u0628\u064e
extends Module {
    private static final long SNAPSHOT_DELAY_MS = 500L;
    private static final float LIMB_WIDTH = 0.25f;
    @NotNull
    private static final ColorSetting color;
    @NotNull
    private static final HashMap<UUID, Vec3d> lastPositions;
    @NotNull
    private static final SliderSetting myLifetime;
    private static final float BODY_DEPTH = 0.25f;
    @NotNull
    private static final BooleanSetting dashedOutline;
    @NotNull
    public static final \u0628\u064e INSTANCE;
    @NotNull
    private static final LinkedHashMap<UUID, List<BlinkModule.BlinkSnapshot>> playerSnapshots;
    private static final float DASH_ANIMATION_SPEED = 1.2f;
    private static final float HEAD_SIZE = 0.5f;
    private static final double MIN_MOVE_DISTANCE = 0.3;
    @NotNull
    private static final BooleanSetting useClientColor;
    private static final int BUFFER_SIZE = 0x100000;
    private static final float LEG_HEIGHT = 0.75f;
    private static final float THICKNESS_SCALE = 0.005f;
    private static final float DASH_GAP = 0.025f;
    private static long lastFrameTime;
    private static final float MIN_THICKNESS = 0.002f;
    private static final float MIN_SEGMENT_LENGTH = 0.001f;
    private static float dashOffset;
    @NotNull
    private static final BooleanSetting fill;
    private static final float DASH_WRAP = 1.0f;
    private static final float ARM_HEIGHT = 0.7f;
    private static final float OUTLINE_WIDTH = 1.5f;
    private static final float BODY_HEIGHT = 0.7f;
    private static final float DASH_LENGTH = 0.05f;
    private static final int MAX_SNAPSHOTS = 5;
    @Nullable
    private static ClientWorld trackedWorld;
    private static final float BODY_WIDTH = 0.5f;

    /*
     * WARNING - void declaration
     */
    private final void emitOutline(VertexConsumer buffer, MatrixStack.Entry entry, float minX, float minY, float minZ, float maxX, float maxY, float maxZ, Color color) {
        void var9_9;
        void var8_8;
        void var7_7;
        void var6_6;
        this.emitLine(buffer, entry, minX, minY, minZ, maxX, minY, minZ, color);
        this.emitLine(buffer, entry, maxX, minY, minZ, maxX, minY, maxZ, color);
        this.emitLine(buffer, entry, maxX, minY, maxZ, minX, minY, maxZ, color);
        this.emitLine(buffer, entry, minX, minY, maxZ, minX, minY, minZ, color);
        this.emitLine(buffer, entry, minX, maxY, minZ, maxX, maxY, minZ, color);
        this.emitLine(buffer, entry, maxX, maxY, minZ, maxX, maxY, maxZ, color);
        this.emitLine(buffer, entry, maxX, maxY, maxZ, minX, maxY, maxZ, color);
        this.emitLine(buffer, entry, minX, maxY, maxZ, minX, maxY, minZ, color);
        this.emitLine(buffer, entry, minX, minY, minZ, minX, maxY, minZ, color);
        this.emitLine(buffer, entry, maxX, minY, minZ, maxX, maxY, minZ, color);
        this.emitLine(buffer, entry, minX, minY, maxZ, minX, maxY, maxZ, color);
        this.emitLine(buffer, entry, maxX, minY, maxZ, (float)var6_6, (float)var7_7, (float)var8_8, (Color)var9_9);
    }

    private static final boolean pruneExpiredSnapshots$lambda$1(Function1 $tmp0, Object p0) {
        return (Boolean)$tmp0.invoke(p0);
    }

    static /* synthetic */ void clearState$default(\u0628\u064e \u0628\u064e2, ClientWorld clientWorld, int n, Object object) {
        if ((n & 1) != 0) {
            clientWorld = \u0636\u0643.getMc().world;
        }
        \u0628\u064e2.clearState(clientWorld);
    }

    /*
     * WARNING - void declaration
     */
    private final void renderHead(MatrixStack matrices, VertexConsumer buffer, float yaw, float pitch, Color color) {
        void var1_1;
        matrices.push();
        matrices.translate(0.0f, 1.95f, 0.0f);
        matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(yaw));
        matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(pitch));
        this.renderCenteredPrism(matrices, buffer, 0.5f, 0.5f, 0.5f, color);
        var1_1.pop();
    }

    @Commando
    @Compile
    public final void onUpdate(@NotNull PlayerUpdateEvent playerUpdateEvent) {
        Intrinsics.checkNotNullParameter(playerUpdateEvent, "event");
        if (!this.isEnabled()) {
            return;
        }
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            \u0628\u064e.clearState$default(this, null, 1, null);
            return;
        }
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            \u0628\u064e.clearState$default(this, null, 1, null);
            return;
        }
        if (trackedWorld != clientWorld) {
            this.clearState(clientWorld);
        }
        long l = System.currentTimeMillis();
        this.pruneExpiredSnapshots(l);
        if (\u0627\u0625.INSTANCE.isFakePlayer((Entity)clientPlayerEntity) || !this.shouldCreateSnapshot((PlayerEntity)clientPlayerEntity)) {
            playerSnapshots.remove(clientPlayerEntity.getUuid());
            lastPositions.remove(clientPlayerEntity.getUuid());
            return;
        }
        Vec3d vec3d = \u0637\u062b.getPos((Entity)clientPlayerEntity);
        Vec3d vec3d2 = lastPositions.get(clientPlayerEntity.getUuid());
        lastPositions.put(clientPlayerEntity.getUuid(), vec3d);
        ArrayList<BlinkModule.BlinkSnapshot> arrayList = (ArrayList<BlinkModule.BlinkSnapshot>)playerSnapshots.get(clientPlayerEntity.getUuid());
        if (arrayList == null) {
            arrayList = new ArrayList<BlinkModule.BlinkSnapshot>();
            playerSnapshots.put(clientPlayerEntity.getUuid(), arrayList);
        }
        BlinkModule.BlinkSnapshot blinkSnapshot = (BlinkModule.BlinkSnapshot)CollectionsKt.lastOrNull(arrayList);
        arrayList.add(BlinkModule.BlinkSnapshot.Companion.from((PlayerEntity)clientPlayerEntity, vec3d, l));
        while (arrayList.size() > 5) {
            arrayList.remove(0);
        }
    }

    private final void updateDashOffset() {
        long currentNanoTime = System.nanoTime();
        float deltaSeconds = (float)RangesKt.coerceAtLeast(currentNanoTime - lastFrameTime, 0L) / 1.0E9f;
        lastFrameTime = currentNanoTime;
        if (!((Boolean)dashedOutline.getValue()).booleanValue()) {
            return;
        }
        dashOffset += deltaSeconds * 1.2f;
        if (dashOffset > 1.0f) {
            dashOffset %= 1.0f;
        }
    }

    private static final boolean useClientColor$lambda$0() {
        return \u0638\u062b.INSTANCE.isEnabled();
    }

    /*
     * WARNING - void declaration
     */
    private final void emitLine(VertexConsumer buffer, MatrixStack.Entry entry, float x1, float y1, float z1, float x2, float y2, float z2, Color color) {
        void var9_9;
        float dx = Math.abs(x2 - x1);
        float dy = Math.abs(y2 - y1);
        float dz = Math.abs(z2 - z1);
        if (dx <= 0.001f && dy <= 0.001f && dz <= 0.001f) {
            return;
        }
        float half = Math.max(0.0075f, 0.002f);
        this.emitSolidBox(buffer, entry, Math.min(x1, x2) - (dx <= 0.001f ? half : 0.0f), Math.min(y1, y2) - (dy <= 0.001f ? half : 0.0f), Math.min(z1, z2) - (dz <= 0.001f ? half : 0.0f), Math.max(x1, x2) + (dx <= 0.001f ? half : 0.0f), Math.max(y1, y2) + (dy <= 0.001f ? half : 0.0f), Math.max(z1, z2) + (dz <= 0.001f ? half : 0.0f), (Color)var9_9);
    }

    private final long snapshotLifetime() {
        return (long)(((Number)myLifetime.getValue()).floatValue() * 1000.0f);
    }

    private final void clearState(ClientWorld world) {
        playerSnapshots.clear();
        lastPositions.clear();
        trackedWorld = world;
        dashOffset = 0.0f;
        lastFrameTime = System.nanoTime();
    }

    /*
     * WARNING - void declaration
     */
    private final void emitDashedOutline(VertexConsumer buffer, MatrixStack.Entry entry, float minX, float minY, float minZ, float maxX, float maxY, float maxZ, Color color) {
        void var9_9;
        void var8_8;
        void var7_7;
        void var6_6;
        this.emitDashedLine(buffer, entry, minX, minY, minZ, maxX, minY, minZ, color);
        this.emitDashedLine(buffer, entry, maxX, minY, minZ, maxX, minY, maxZ, color);
        this.emitDashedLine(buffer, entry, maxX, minY, maxZ, minX, minY, maxZ, color);
        this.emitDashedLine(buffer, entry, minX, minY, maxZ, minX, minY, minZ, color);
        this.emitDashedLine(buffer, entry, minX, maxY, minZ, maxX, maxY, minZ, color);
        this.emitDashedLine(buffer, entry, maxX, maxY, minZ, maxX, maxY, maxZ, color);
        this.emitDashedLine(buffer, entry, maxX, maxY, maxZ, minX, maxY, maxZ, color);
        this.emitDashedLine(buffer, entry, minX, maxY, maxZ, minX, maxY, minZ, color);
        this.emitDashedLine(buffer, entry, minX, minY, minZ, minX, maxY, minZ, color);
        this.emitDashedLine(buffer, entry, maxX, minY, minZ, maxX, maxY, minZ, color);
        this.emitDashedLine(buffer, entry, minX, minY, maxZ, minX, maxY, maxZ, color);
        this.emitDashedLine(buffer, entry, maxX, minY, maxZ, (float)var6_6, (float)var7_7, (float)var8_8, (Color)var9_9);
    }

    /*
     * WARNING - void declaration
     */
    private final void renderPlayerSnapshot(Render3DEvent event, VertexConsumer buffer, BlinkModule.BlinkSnapshot snapshot, Color color, Vec3d cameraPos) {
        void var1_1;
        void var4_4;
        void var11_11;
        void var2_2;
        float limbPos = snapshot.getLimbPos();
        float limbSpeed = snapshot.getLimbSpeed();
        float armLeftSwing = (float)Math.sin(limbPos * 0.6662f + (float)Math.PI) * 2.0f * limbSpeed * 0.5f;
        float armRightSwing = (float)Math.sin(limbPos * 0.6662f) * 2.0f * limbSpeed * 0.5f;
        float legLeftSwing = (float)Math.sin(limbPos * 0.6662f) * 1.4f * limbSpeed;
        float legRightSwing = (float)Math.sin(limbPos * 0.6662f + (float)Math.PI) * 1.4f * limbSpeed;
        float headYaw = -(snapshot.getHeadYaw() - snapshot.getBodyYaw());
        event.getMatrices().push();
        event.getMatrices().translate(snapshot.getPosition().x - cameraPos.x, snapshot.getPosition().y - cameraPos.y, snapshot.getPosition().z - cameraPos.z);
        event.getMatrices().multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(180.0f - snapshot.getBodyYaw()));
        if (snapshot.getGliding()) {
            event.getMatrices().translate(0.0f, 1.0f, 0.0f);
            event.getMatrices().multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(-90.0f + snapshot.getPitch()));
            event.getMatrices().translate(0.0f, -1.0f, 0.0f);
        }
        this.renderHead(event.getMatrices(), buffer, headYaw, snapshot.getPitch(), color);
        this.renderPart(event.getMatrices(), buffer, 0.0f, 1.45f, 0.0f, 0.5f, 0.7f, 0.25f, 0.0f, color);
        this.renderPart(event.getMatrices(), buffer, -0.375f, 1.45f, 0.0f, 0.25f, 0.7f, 0.25f, armLeftSwing, color);
        this.renderPart(event.getMatrices(), buffer, 0.375f, 1.45f, 0.0f, 0.25f, 0.7f, 0.25f, armRightSwing, color);
        this.renderPart(event.getMatrices(), buffer, -0.125f, 0.75f, 0.0f, 0.25f, 0.75f, 0.25f, legLeftSwing, color);
        this.renderPart(event.getMatrices(), (VertexConsumer)var2_2, 0.125f, 0.75f, 0.0f, 0.25f, 0.75f, 0.25f, (float)var11_11, (Color)var4_4);
        var1_1.getMatrices().pop();
    }

    /*
     * WARNING - void declaration
     */
    private final void renderPart(MatrixStack matrices, VertexConsumer buffer, float x, float y, float z, float width, float height, float depth, float rotationX, Color color) {
        void var1_1;
        matrices.push();
        matrices.translate(x, y, z);
        if (!(rotationX == 0.0f)) {
            matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotation(rotationX));
        }
        this.renderCenteredPrism(matrices, buffer, width, height, depth, color);
        var1_1.pop();
    }

    @Override
    public void onDisable() {
        \u0628\u064e.clearState$default(this, null, 1, null);
    }

    private final void emitQuad(VertexConsumer buffer, MatrixStack.Entry entry, float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4, Color color) {
        buffer.vertex(entry, x1, y1, z1).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        buffer.vertex(entry, x2, y2, z2).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        buffer.vertex(entry, x3, y3, z3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        buffer.vertex(entry, x4, y4, z4).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }

    private final void emitDashedLine(VertexConsumer buffer, MatrixStack.Entry entry, float x1, float y1, float z1, float x2, float y2, float z2, Color color) {
        float dx = x2 - x1;
        float dy = y2 - y1;
        float dz = z2 - z1;
        float totalLength = (float)Math.sqrt(dx * dx + dy * dy + dz * dz);
        if (totalLength <= 0.001f) {
            return;
        }
        float patternLength = 0.075f;
        float normalizedLength = 0.05f / totalLength;
        float normalizedPattern = patternLength / totalLength;
        float offset = dashOffset * patternLength;
        if (offset > patternLength) {
            offset %= patternLength;
        }
        for (float t = -(offset / totalLength); t < 1.0f; t += normalizedPattern) {
            float startT = RangesKt.coerceAtLeast(t, 0.0f);
            float endT = RangesKt.coerceAtMost(t + normalizedLength, 1.0f);
            if (!(endT > startT)) continue;
            this.emitLine(buffer, entry, x1 + dx * startT, y1 + dy * startT, z1 + dz * startT, x1 + dx * endT, y1 + dy * endT, z1 + dz * endT, color);
        }
    }

    private static final boolean color$lambda$0() {
        return !((Boolean)useClientColor.getValue()).booleanValue() || !\u0638\u062b.INSTANCE.isEnabled();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.isEnabled()) {
            return;
        }
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            return;
        }
        ClientWorld world = clientWorld;
        if (\u0636\u0643.getMc().player == null) {
            return;
        }
        if (playerSnapshots.isEmpty()) {
            return;
        }
        if (trackedWorld != world) {
            this.clearState(world);
            return;
        }
        this.updateDashOffset();
        long now = System.currentTimeMillis();
        GameOptions gameOptions = \u0636\u0643.getMc().options;
        Intrinsics.checkNotNullExpressionValue(gameOptions, "options");
        if (\u0637\u062b.getPerspective(gameOptions).isFirstPerson()) {
            return;
        }
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        Vec3d cameraPos = \u0637\u062b.getPos(\u0637\u062b.getCamera(gameRenderer));
        AutoCloseable autoCloseable = (AutoCloseable)new BufferAllocator(0x100000);
        Throwable throwable = null;
        try {
            BufferAllocator allocator = (BufferAllocator)autoCloseable;
            boolean bl = false;
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)allocator);
            Intrinsics.checkNotNullExpressionValue(immediate, "immediate(...)");
            VertexConsumerProvider.Immediate consumers = immediate;
            VertexConsumer vertexConsumer = consumers.getBuffer(RainRenderLayers.getHitBoxQuad(true));
            Intrinsics.checkNotNullExpressionValue(vertexConsumer, "getBuffer(...)");
            VertexConsumer buffer = vertexConsumer;
            Iterator<List<BlinkModule.BlinkSnapshot>> iterator2 = playerSnapshots.values().iterator();
            while (iterator2.hasNext()) {
                List<BlinkModule.BlinkSnapshot> snapshots;
                Intrinsics.checkNotNullExpressionValue(iterator2.next(), "next(...)");
                long lifetimeMs = INSTANCE.snapshotLifetime();
                for (BlinkModule.BlinkSnapshot snapshot : snapshots) {
                    float alpha = snapshot.alpha(lifetimeMs, now);
                    if (alpha <= 0.0f) continue;
                    Color snapshotColor = \u0628\u062d.INSTANCE.setAlpha(INSTANCE.resolveBlinkColor(), alpha);
                    INSTANCE.renderPlayerSnapshot(event, buffer, snapshot, snapshotColor, cameraPos);
                }
            }
            VertexConsumerProvider.Immediate $this$draw$iv = consumers;
            boolean bl2 = false;
            iterator2.draw();
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

    private \u0628\u064e() {
        super("Blink", \u0638\u0646.getRENDER(), "\u0412\u0438\u0437\u0443\u0430\u043b\u044c\u043d\u044b\u0435 \u0441\u043b\u0435\u043f\u043a\u0438 \u0438\u0433\u0440\u043e\u043a\u0430");
    }

    @Override
    public void onEnable() {
        \u0628\u064e.clearState$default(this, null, 1, null);
    }

    private final boolean shouldCreateSnapshot(PlayerEntity player) {
        block4: {
            block3: {
                if (!player.isAlive() || player.isRemoved() || player.isInvisible()) break block3;
                if (!player.isSpectator()) break block4;
            }
            return false;
        }
        GameOptions gameOptions = \u0636\u0643.getMc().options;
        Intrinsics.checkNotNullExpressionValue(gameOptions, "options");
        return !\u0637\u062b.getPerspective(gameOptions).isFirstPerson();
    }

    private final void renderCenteredPrism(MatrixStack matrices, VertexConsumer buffer, float width, float height, float depth, Color color) {
        float halfWidth = width * 0.5f;
        float halfDepth = depth * 0.5f;
        this.renderPrism(matrices, buffer, -halfWidth, -height, -halfDepth, halfWidth, 0.0f, halfDepth, color);
    }

    /*
     * WARNING - void declaration
     */
    private final void emitSolidBox(VertexConsumer buffer, MatrixStack.Entry entry, float x1, float y1, float z1, float x2, float y2, float z2, Color color) {
        void var9_9;
        this.emitQuad(buffer, entry, x1, y1, z1, x2, y1, z1, x2, y2, z1, x1, y2, z1, color);
        this.emitQuad(buffer, entry, x1, y1, z2, x2, y1, z2, x2, y2, z2, x1, y2, z2, color);
        this.emitQuad(buffer, entry, x1, y1, z1, x1, y1, z2, x1, y2, z2, x1, y2, z1, color);
        this.emitQuad(buffer, entry, x2, y1, z1, x2, y1, z2, x2, y2, z2, x2, y2, z1, color);
        this.emitQuad(buffer, entry, x1, y1, z1, x2, y1, z1, x2, y1, z2, x1, y1, z2, color);
        this.emitQuad(buffer, entry, x1, y2, z1, x2, y2, z1, x2, y2, z2, x1, y2, z2, (Color)var9_9);
    }

    private final void pruneExpiredSnapshots(long currentTime) {
        Iterator<Map.Entry<UUID, List<BlinkModule.BlinkSnapshot>>> iterator2 = playerSnapshots.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<UUID, List<BlinkModule.BlinkSnapshot>> entry;
            Intrinsics.checkNotNullExpressionValue(iterator2.next(), "next(...)");
            long lifetimeMs = this.snapshotLifetime();
            entry.getValue().removeIf(arg_0 -> \u0628\u064e.pruneExpiredSnapshots$lambda$1(arg_0 -> \u0628\u064e.pruneExpiredSnapshots$lambda$0(currentTime, lifetimeMs, arg_0), arg_0));
            if (!entry.getValue().isEmpty()) continue;
            iterator2.remove();
        }
    }

    private static final boolean pruneExpiredSnapshots$lambda$0(long $currentTime, long $lifetimeMs, BlinkModule.BlinkSnapshot it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return $currentTime - it.getCreatedAt() > $lifetimeMs;
    }

    static {
        INSTANCE = new \u0628\u064e();
        useClientColor = Module.boolean$default(INSTANCE, "\u0426\u0432\u0435\u0442 \u043a\u043b\u0438\u0435\u043d\u0442\u0430", false, null, 4, null).setVisible(\u0628\u064e::useClientColor$lambda$0);
        Module module = INSTANCE;
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        \u0628\u064e.color = Module.color$default(module, "\u0426\u0432\u0435\u0442", color, null, 4, null).setVisible(\u0628\u064e::color$lambda$0);
        fill = Module.boolean$default(INSTANCE, "\u0417\u0430\u043f\u043e\u043b\u043d\u0438\u0442\u044c", false, null, 4, null);
        dashedOutline = Module.boolean$default(INSTANCE, "\u041f\u0443\u043d\u043a\u0442\u0438\u0440", false, null, 4, null);
        myLifetime = Module.slider$default(INSTANCE, "\u0412\u0440\u0435\u043c\u044f \u0436\u0438\u0437\u043d\u0438", 1.5f, 1.0f, 5.0f, 0.1f, null, 32, null);
        playerSnapshots = new LinkedHashMap();
        lastPositions = new HashMap();
        lastFrameTime = System.nanoTime();
    }

    /*
     * WARNING - void declaration
     */
    private final void renderPrism(MatrixStack matrices, VertexConsumer buffer, float x1, float y1, float z1, float x2, float y2, float z2, Color color) {
        float minX = Math.min(x1, x2);
        float minY = Math.min(y1, y2);
        float minZ = Math.min(z1, z2);
        float maxX = Math.max(x1, x2);
        float maxY = Math.max(y1, y2);
        float maxZ = Math.max(z1, z2);
        MatrixStack.Entry entry = matrices.peek();
        Intrinsics.checkNotNullExpressionValue(entry, "last(...)");
        MatrixStack.Entry entry2 = entry;
        if (((Boolean)fill.getValue()).booleanValue()) {
            int fillAlpha = RangesKt.coerceAtLeast(color.getAlpha() / 4, color.getAlpha() > 0 ? 1 : 0);
            this.emitSolidBox(buffer, entry2, minX, minY, minZ, maxX, maxY, maxZ, new Color(color.getRed(), color.getGreen(), color.getBlue(), fillAlpha));
        }
        if (((Boolean)dashedOutline.getValue()).booleanValue()) {
            this.emitDashedOutline(buffer, entry2, minX, minY, minZ, maxX, maxY, maxZ, color);
        } else {
            void var9_9;
            this.emitOutline(buffer, entry2, minX, minY, minZ, maxX, maxY, maxZ, (Color)var9_9);
        }
    }

    private final Color resolveBlinkColor() {
        return (Boolean)useClientColor.getValue() != false && \u0638\u062b.INSTANCE.isEnabled() ? \u0638\u062b.INSTANCE.getClientColor() : (Color)color.getValue();
    }
}

