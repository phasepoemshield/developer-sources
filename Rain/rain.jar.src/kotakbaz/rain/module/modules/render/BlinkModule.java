/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.render;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.client.util.color.ColorUtil;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.player.FakePlayerModule;
import kotakbaz.rain.module.modules.render.ClientColorModule;
import kotakbaz.rain.module.modules.render.K;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import net.minecraft.client.network.ClientPlayerEntity;
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
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u008b\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u0003J7\u0010$\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\"H\u0002\u00a2\u0006\u0004\b$\u0010%J7\u0010+\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b+\u0010,J_\u00104\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020(2\u0006\u00101\u001a\u00020(2\u0006\u00102\u001a\u00020(2\u0006\u00103\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b4\u00105J?\u00106\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00100\u001a\u00020(2\u0006\u00101\u001a\u00020(2\u0006\u00102\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b6\u00107JW\u0010>\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020(2\u0006\u0010:\u001a\u00020(2\u0006\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b>\u0010?JW\u0010H\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020(2\u0006\u0010D\u001a\u00020(2\u0006\u0010E\u001a\u00020(2\u0006\u0010F\u001a\u00020(2\u0006\u0010G\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\bH\u0010IJW\u0010J\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020(2\u0006\u0010D\u001a\u00020(2\u0006\u0010E\u001a\u00020(2\u0006\u0010F\u001a\u00020(2\u0006\u0010G\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\bJ\u0010IJW\u0010K\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020@2\u0006\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020(2\u0006\u0010:\u001a\u00020(2\u0006\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\bK\u0010IJW\u0010L\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020@2\u0006\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020(2\u0006\u0010:\u001a\u00020(2\u0006\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\bL\u0010IJW\u0010M\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020@2\u0006\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020(2\u0006\u0010:\u001a\u00020(2\u0006\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\bM\u0010IJ\u0087\u0001\u0010T\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020@2\u0006\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020(2\u0006\u0010:\u001a\u00020(2\u0006\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020(2\u0006\u0010N\u001a\u00020(2\u0006\u0010O\u001a\u00020(2\u0006\u0010P\u001a\u00020(2\u0006\u0010Q\u001a\u00020(2\u0006\u0010R\u001a\u00020(2\u0006\u0010S\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\bT\u0010UJ\u001b\u0010X\u001a\u00020\u00042\n\b\u0002\u0010W\u001a\u0004\u0018\u00010VH\u0002\u00a2\u0006\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020Z8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b_\u0010\\R\u0014\u0010a\u001a\u00020`8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010e\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\be\u0010dR\u0014\u0010f\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bf\u0010dR\u0014\u0010g\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bg\u0010dR\u0014\u0010h\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bh\u0010dR\u0014\u0010i\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bi\u0010dR\u0014\u0010j\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bj\u0010dR\u0014\u0010k\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bk\u0010dR\u0014\u0010l\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bl\u0010dR\u0014\u0010m\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bm\u0010dR\u0014\u0010n\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bn\u0010dR\u0014\u0010o\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bo\u0010dR\u0014\u0010p\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bp\u0010dR\u0014\u0010q\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bq\u0010dR\u0014\u0010r\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\br\u0010dR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010!\u001a\u00020v8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010wR\u0014\u0010x\u001a\u00020s8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bx\u0010uR\u0014\u0010y\u001a\u00020s8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\by\u0010uR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b{\u0010|R@\u0010\u0081\u0001\u001a+\u0012\u0004\u0012\u00020~\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u007f0}j\u0015\u0012\u0004\u0012\u00020~\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u007f`\u0080\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R5\u0010\u0085\u0001\u001a \u0012\u0004\u0012\u00020~\u0012\u0004\u0012\u00020\"0\u0083\u0001j\u000f\u0012\u0004\u0012\u00020~\u0012\u0004\u0012\u00020\"`\u0084\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u0089\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0089\u0001\u0010dR\u0018\u0010\u008a\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u008a\u0001\u0010^\u00a8\u0006\u008c\u0001"}, d2={"Lkotakbaz/rain/module/modules/render/BlinkModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lkotakbaz/rain/event/events/Render3DEvent;", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Lnet/minecraft/class_1657;", "player", "", "shouldCreateSnapshot", "(Lnet/minecraft/class_1657;)Z", "", "currentTime", "pruneExpiredSnapshots", "(J)V", "snapshotLifetime", "()J", "Ljava/awt/Color;", "resolveBlinkColor", "()Ljava/awt/Color;", "updateDashOffset", "Lnet/minecraft/class_4588;", "buffer", "Lkotakbaz/rain/module/modules/render/BlinkModule$BlinkSnapshot;", "snapshot", "color", "Lnet/minecraft/class_243;", "cameraPos", "renderPlayerSnapshot", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4588;Lkotakbaz/rain/module/modules/render/BlinkModule$BlinkSnapshot;Ljava/awt/Color;Lnet/minecraft/class_243;)V", "Lnet/minecraft/class_4587;", "matrices", "", "yaw", "pitch", "renderHead", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;FFLjava/awt/Color;)V", "x", "y", "z", "width", "height", "depth", "rotationX", "renderPart", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;FFFFFFFLjava/awt/Color;)V", "renderCenteredPrism", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;FFFLjava/awt/Color;)V", "x1", "y1", "z1", "x2", "y2", "z2", "renderPrism", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;FFFFFFLjava/awt/Color;)V", "Lnet/minecraft/class_4587$class_4665;", "entry", "minX", "minY", "minZ", "maxX", "maxY", "maxZ", "emitOutline", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;FFFFFFLjava/awt/Color;)V", "emitDashedOutline", "emitDashedLine", "emitLine", "emitSolidBox", "x3", "y3", "z3", "x4", "y4", "z4", "emitQuad", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;FFFFFFFFFFFFLjava/awt/Color;)V", "Lnet/minecraft/class_638;", "world", "clearState", "(Lnet/minecraft/class_638;)V", "", "BUFFER_SIZE", "I", "SNAPSHOT_DELAY_MS", "J", "MAX_SNAPSHOTS", "", "MIN_MOVE_DISTANCE", "D", "OUTLINE_WIDTH", "F", "THICKNESS_SCALE", "MIN_THICKNESS", "MIN_SEGMENT_LENGTH", "DASH_LENGTH", "DASH_GAP", "DASH_WRAP", "DASH_ANIMATION_SPEED", "HEAD_SIZE", "BODY_WIDTH", "BODY_HEIGHT", "BODY_DEPTH", "LIMB_WIDTH", "ARM_HEIGHT", "LEG_HEIGHT", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "useClientColor", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "fill", "dashedOutline", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "myLifetime", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "Ljava/util/LinkedHashMap;", "Ljava/util/UUID;", "", "Lkotlin/collections/LinkedHashMap;", "playerSnapshots", "Ljava/util/LinkedHashMap;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "lastPositions", "Ljava/util/HashMap;", "trackedWorld", "Lnet/minecraft/class_638;", "dashOffset", "lastFrameTime", "BlinkSnapshot", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nBlinkModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlinkModule.kt\nkotakbaz/rain/module/modules/render/BlinkModule\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,549:1\n383#2,7:550\n*S KotlinDebug\n*F\n+ 1 BlinkModule.kt\nkotakbaz/rain/module/modules/render/BlinkModule\n*L\n111#1:550,7\n*E\n"})
public final class BlinkModule
extends Module {
    @NotNull
    public static final BlinkModule INSTANCE;
    private static final int a = 0x100000;
    private static final long A = 500L;
    private static final int b = 5;
    private static final double B = 0.3;
    private static final float c = 1.5f;
    private static final float C = 0.005f;
    private static final float d = 0.002f;
    private static final float D = 0.001f;
    private static final float e = 0.05f;
    private static final float E = 0.025f;
    private static final float f = 1.0f;
    private static final float F = 1.2f;
    private static final float g = 0.5f;
    private static final float G = 0.5f;
    private static final float h = 0.7f;
    private static final float H = 0.25f;
    private static final float i = 0.25f;
    private static final float I = 0.7f;
    private static final float j = 0.75f;
    @NotNull
    private static final BooleanSetting J;
    @NotNull
    private static final ColorSetting k;
    @NotNull
    private static final BooleanSetting K;
    @NotNull
    private static final BooleanSetting l;
    @NotNull
    private static final SliderSetting L;
    @NotNull
    private static final LinkedHashMap<UUID, List<K>> m;
    @NotNull
    private static final HashMap<UUID, Vec3d> M;
    @Nullable
    private static ClientWorld n;
    private static float N;
    private static long o;
    private static Object[] O;
    private static Object P;
    private static Object[] q;
    private static Object[] p;
    private static Object[] Q;
    public static int[] r;

    private BlinkModule() {
        int n2 = r[0];
        n2 += r[1];
        int n3 = r[3];
        n3 -= r[4];
        int n4 = r[6];
        n4 ^= r[7];
        super((String)O[n2 ^= r[2]], a_0.getRENDER(), (String)O[n3 ^= r[5]] + (String)O[n4 ^= r[8]]);
    }

    @Override
    public void onEnable() {
        int n2 = r[9];
        n2 ^= r[10];
        BlinkModule.clearState$default(this, null, n2 ^= r[11], null);
    }

    @Override
    public void onDisable() {
        int n2 = r[12];
        n2 += r[13];
        BlinkModule.clearState$default(this, null, n2 += r[14], null);
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        List list;
        Object object;
        long l2 = 4240656199069666762L;
        long l3 = 3479080732349288149L;
        int n2 = r[15];
        n2 += r[16];
        Intrinsics.checkNotNullParameter(event, (String)O[n2 += r[17]]);
        if (!this.isEnabled()) {
            return;
        }
        ClientWorld clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
        if (clientWorld == null) {
            BlinkModule blinkModule = this;
            long l4 = l3;
            int n3 = r[18];
            n3 ^= r[19];
            l3 = l4 ^ (0L ^ l4) & -1L << (n3 += r[20]);
            int n4 = r[21];
            n4 ^= r[22];
            BlinkModule.clearState$default(blinkModule, null, n4 += r[23], null);
            return;
        }
        ClientWorld clientWorld2 = clientWorld;
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            BlinkModule blinkModule = this;
            long l5 = l3;
            int n5 = r[24];
            n5 -= r[25];
            l3 = l5 ^ (0L ^ l5) & -1L >>> (n5 -= r[26]);
            int n6 = r[27];
            n6 -= r[28];
            BlinkModule.clearState$default(blinkModule, null, n6 ^= r[29], null);
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        if (n != clientWorld2) {
            this.clearState(clientWorld2);
        }
        long l6 = System.currentTimeMillis();
        this.pruneExpiredSnapshots(l6);
        if (FakePlayerModule.INSTANCE.isFakePlayer((Entity)clientPlayerEntity2) || !this.shouldCreateSnapshot((PlayerEntity)clientPlayerEntity2)) {
            m.remove(clientPlayerEntity2.getUuid());
            M.remove(clientPlayerEntity2.getUuid());
            return;
        }
        Vec3d vec3d = clientPlayerEntity2.getPos();
        Vec3d vec3d2 = M.get(clientPlayerEntity2.getUuid());
        ((Map)M).put(clientPlayerEntity2.getUuid(), vec3d);
        if (vec3d2 != null && vec3d.distanceTo(vec3d2) < Double.longBitsToDouble(0x6ECA3C6EAEA54324L ^ 0x51190F5D9D967017L)) {
            return;
        }
        Object object2 = m;
        Object object3 = clientPlayerEntity2.getUuid();
        long l7 = l2;
        int n7 = r[30];
        n7 ^= r[31];
        l2 = l7 ^ (0L ^ l7) & -1L << (n7 -= r[32]);
        Object v = object2.get(object3);
        if (v == null) {
            long l8 = l2;
            int n8 = r[33];
            n8 -= r[34];
            l2 = l8 ^ (0L ^ l8) & -1L >>> (n8 -= r[35]);
            List list2 = new ArrayList();
            object2.put(object3, list2);
            object = list2;
        } else {
            object = v;
        }
        if ((object2 = (K)CollectionsKt.lastOrNull(list = (List)object)) != null && l6 - ((K)object2).getCreatedAt() < 500L) {
            return;
        }
        object3 = list;
        PlayerEntity playerEntity = (PlayerEntity)clientPlayerEntity2;
        Vec3d vec3d3 = vec3d2;
        if (vec3d3 == null) {
            vec3d3 = vec3d;
        }
        Vec3d vec3d4 = vec3d3;
        Intrinsics.checkNotNull(vec3d4);
        object3.add(kotakbaz.rain.module.modules.render.K.a.from(playerEntity, vec3d4, l6));
        while (true) {
            int n9 = r[36];
            n9 ^= r[37];
            if (list.size() <= (n9 -= r[38])) break;
            int n10 = r[39];
            n10 ^= r[40];
            list.remove(n10 -= r[41]);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        long l2 = -1217243440122332143L;
        int n2 = r[42];
        n2 -= r[43];
        Intrinsics.checkNotNullParameter(event, (String)O[n2 -= r[44]]);
        if (!this.isEnabled()) {
            return;
        }
        ClientWorld clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
        if (clientWorld == null) {
            return;
        }
        ClientWorld clientWorld2 = clientWorld;
        if (kotakbaz.rain.client.extensions.b.getMc().player == null) {
            return;
        }
        if (m.isEmpty()) {
            return;
        }
        if (n != clientWorld2) {
            this.clearState(clientWorld2);
            return;
        }
        this.updateDashOffset();
        long l3 = System.currentTimeMillis();
        if (kotakbaz.rain.client.extensions.b.getMc().options.getPerspective().isFirstPerson()) {
            return;
        }
        Vec3d vec3d = kotakbaz.rain.client.extensions.b.getMc().gameRenderer.getCamera().getPos();
        int n3 = r[45];
        n3 ^= r[46];
        AutoCloseable autoCloseable = (AutoCloseable)new BufferAllocator(n3 ^= r[47]);
        Throwable throwable = null;
        try {
            Object object = (BufferAllocator)autoCloseable;
            long l4 = l2;
            int n4 = r[48];
            n4 += r[49];
            l2 = l4 ^ (0L ^ l4) & -1L << (n4 += r[50]);
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)object);
            boolean bl = r[51];
            bl ^= r[52];
            VertexConsumer vertexConsumer = immediate.getBuffer(RainRenderLayers.getHitBoxQuad((boolean)(bl += r[53])));
            Iterator<List<K>> iterator2 = m.values().iterator();
            while (iterator2.hasNext()) {
                List<K> list;
                int n5 = r[54];
                n5 += r[55];
                Intrinsics.checkNotNullExpressionValue(iterator2.next(), (String)O[n5 += r[56]]);
                long l5 = INSTANCE.snapshotLifetime();
                for (K k2 : list) {
                    float f2 = k2.alpha(l5, l3);
                    if (f2 <= 0.0f) continue;
                    Color color = ColorUtil.INSTANCE.setAlpha(INSTANCE.resolveBlinkColor(), f2);
                    Intrinsics.checkNotNull(vertexConsumer);
                    Intrinsics.checkNotNull(vec3d);
                    INSTANCE.renderPlayerSnapshot(event, vertexConsumer, k2, color, vec3d);
                }
            }
            immediate.draw();
            object = Unit.INSTANCE;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            AutoCloseableKt.closeFinally(autoCloseable, throwable);
        }
    }

    private final boolean shouldCreateSnapshot(PlayerEntity player) {
        boolean bl;
        if (!player.isAlive() || player.isRemoved() || player.isInvisible() || player.isSpectator()) {
            boolean bl2 = r[57];
            bl2 -= r[58];
            return bl2 -= r[59];
        }
        if (!kotakbaz.rain.client.extensions.b.getMc().options.getPerspective().isFirstPerson()) {
            boolean bl3 = r[60];
            bl3 += r[61];
            bl = bl3 ^= r[62];
        } else {
            boolean bl4 = r[63];
            bl4 ^= r[64];
            bl = bl4 += r[65];
        }
        return bl;
    }

    private final void pruneExpiredSnapshots(long currentTime) {
        Iterator<Map.Entry<UUID, List<K>>> iterator2 = m.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<UUID, List<K>> entry;
            int n2 = r[66];
            n2 += r[67];
            Intrinsics.checkNotNullExpressionValue(iterator2.next(), (String)O[n2 ^= r[68]]);
            long l2 = this.snapshotLifetime();
            entry.getValue().removeIf(arg_0 -> BlinkModule.pruneExpiredSnapshots$lambda$1(arg_0 -> BlinkModule.pruneExpiredSnapshots$lambda$0(currentTime, l2, arg_0), arg_0));
            if (!entry.getValue().isEmpty()) continue;
            iterator2.remove();
        }
    }

    private final long snapshotLifetime() {
        return (long)(((Number)L.getValue()).floatValue() * 1000.0f);
    }

    private final Color resolveBlinkColor() {
        return (Boolean)J.getValue() != false && ClientColorModule.INSTANCE.isEnabled() ? ClientColorModule.INSTANCE.getClientColor() : (Color)k.getValue();
    }

    private final void updateDashOffset() {
        long l2 = System.nanoTime();
        float f2 = (float)RangesKt.coerceAtLeast(l2 - o, 0L) / 1.0E9f;
        o = l2;
        if (!((Boolean)l.getValue()).booleanValue()) {
            return;
        }
        if ((N += f2 * 1.2f) > 1.0f) {
            N %= 1.0f;
        }
    }

    private final void renderPlayerSnapshot(Render3DEvent event, VertexConsumer buffer, K snapshot, Color color, Vec3d cameraPos) {
        float f2 = snapshot.getLimbPos();
        float f3 = snapshot.getLimbSpeed();
        float f4 = (float)Math.sin(f2 * 0.6662f + (float)Math.PI) * 2.0f * f3 * 0.5f;
        float f5 = (float)Math.sin(f2 * 0.6662f) * 2.0f * f3 * 0.5f;
        float f6 = (float)Math.sin(f2 * 0.6662f) * 1.4f * f3;
        float f7 = (float)Math.sin(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        float f8 = -(snapshot.getHeadYaw() - snapshot.getBodyYaw());
        event.getMatrices().push();
        event.getMatrices().translate(snapshot.getPosition().x - cameraPos.x, snapshot.getPosition().y - cameraPos.y, snapshot.getPosition().z - cameraPos.z);
        event.getMatrices().multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(180.0f - snapshot.getBodyYaw()));
        this.renderHead(event.getMatrices(), buffer, f8, snapshot.getPitch(), color);
        this.renderPart(event.getMatrices(), buffer, 0.0f, 1.45f, 0.0f, 0.5f, 0.7f, 0.25f, 0.0f, color);
        this.renderPart(event.getMatrices(), buffer, -0.375f, 1.45f, 0.0f, 0.25f, 0.7f, 0.25f, f4, color);
        this.renderPart(event.getMatrices(), buffer, 0.375f, 1.45f, 0.0f, 0.25f, 0.7f, 0.25f, f5, color);
        this.renderPart(event.getMatrices(), buffer, -0.125f, 0.75f, 0.0f, 0.25f, 0.75f, 0.25f, f6, color);
        this.renderPart(event.getMatrices(), buffer, 0.125f, 0.75f, 0.0f, 0.25f, 0.75f, 0.25f, f7, color);
        event.getMatrices().pop();
    }

    private final void renderHead(MatrixStack matrices, VertexConsumer buffer, float yaw, float pitch, Color color) {
        matrices.push();
        matrices.translate(0.0f, 1.95f, 0.0f);
        matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(yaw));
        matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(pitch));
        this.renderCenteredPrism(matrices, buffer, 0.5f, 0.5f, 0.5f, color);
        matrices.pop();
    }

    private final void renderPart(MatrixStack matrices, VertexConsumer buffer, float x2, float y, float z, float width2, float height, float depth, float rotationX, Color color) {
        int n2;
        matrices.push();
        matrices.translate(x2, y, z);
        if (rotationX == 0.0f) {
            int n3 = r[69];
            n3 += r[70];
            n2 = n3 ^= r[71];
        } else {
            int n4 = r[72];
            n4 ^= r[73];
            n2 = n4 += r[74];
        }
        if (n2 == 0) {
            matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotation(rotationX));
        }
        this.renderCenteredPrism(matrices, buffer, width2, height, depth, color);
        matrices.pop();
    }

    private final void renderCenteredPrism(MatrixStack matrices, VertexConsumer buffer, float width2, float height, float depth, Color color) {
        float f2 = width2 * 0.5f;
        float f3 = depth * 0.5f;
        this.renderPrism(matrices, buffer, -f2, -height, -f3, f2, 0.0f, f3, color);
    }

    private final void renderPrism(MatrixStack matrices, VertexConsumer buffer, float x1, float y1, float z1, float x2, float y2, float z2, Color color) {
        long l2 = -6933923660427334905L;
        float f2 = Math.min(x1, x2);
        float f3 = Math.min(y1, y2);
        float f4 = Math.min(z1, z2);
        float f5 = Math.max(x1, x2);
        float f6 = Math.max(y1, y2);
        float f7 = Math.max(z1, z2);
        MatrixStack.Entry entry = matrices.peek();
        if (((Boolean)K.getValue()).booleanValue()) {
            int n2;
            int n3 = r[75];
            n3 ^= r[76];
            int n4 = color.getAlpha() / (n3 ^= r[77]);
            if (color.getAlpha() > 0) {
                int n5 = r[78];
                n5 ^= r[79];
                n2 = n5 += r[80];
            } else {
                int n6 = r[81];
                n6 -= r[82];
                n2 = n6 -= r[83];
            }
            int n7 = r[84];
            n7 -= r[85];
            long l3 = l2;
            int n8 = r[87];
            n8 -= r[88];
            l2 = l3 ^ ((long)RangesKt.coerceAtLeast(n4, n2) << (n7 += r[86]) ^ l3) & -1L << (n8 -= r[89]);
            Intrinsics.checkNotNull(entry);
            int n9 = r[90];
            n9 ^= r[91];
            this.emitSolidBox(buffer, entry, f2, f3, f4, f5, f6, f7, new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)(l2 >>> (n9 += r[92]))));
        }
        if (((Boolean)l.getValue()).booleanValue()) {
            Intrinsics.checkNotNull(entry);
            this.emitDashedOutline(buffer, entry, f2, f3, f4, f5, f6, f7, color);
        } else {
            Intrinsics.checkNotNull(entry);
            this.emitOutline(buffer, entry, f2, f3, f4, f5, f6, f7, color);
        }
    }

    private final void emitOutline(VertexConsumer buffer, MatrixStack.Entry entry, float minX, float minY, float minZ, float maxX, float maxY, float maxZ, Color color) {
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
        this.emitLine(buffer, entry, maxX, minY, maxZ, maxX, maxY, maxZ, color);
    }

    private final void emitDashedOutline(VertexConsumer buffer, MatrixStack.Entry entry, float minX, float minY, float minZ, float maxX, float maxY, float maxZ, Color color) {
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
        this.emitDashedLine(buffer, entry, maxX, minY, maxZ, maxX, maxY, maxZ, color);
    }

    private final void emitDashedLine(VertexConsumer buffer, MatrixStack.Entry entry, float x1, float y1, float z1, float x2, float y2, float z2, Color color) {
        float f2 = x2 - x1;
        float f3 = y2 - y1;
        float f4 = z2 - z1;
        float f5 = (float)Math.sqrt(f2 * f2 + f3 * f3 + f4 * f4);
        if (f5 <= 0.001f) {
            return;
        }
        float f6 = 0.075f;
        float f7 = 0.05f / f5;
        float f8 = f6 / f5;
        float f9 = N * f6;
        if (f9 > f6) {
            f9 %= f6;
        }
        for (float f10 = -(f9 / f5); f10 < 1.0f; f10 += f8) {
            float f11 = RangesKt.coerceAtLeast(f10, 0.0f);
            float f12 = RangesKt.coerceAtMost(f10 + f7, 1.0f);
            if (!(f12 > f11)) continue;
            this.emitLine(buffer, entry, x1 + f2 * f11, y1 + f3 * f11, z1 + f4 * f11, x1 + f2 * f12, y1 + f3 * f12, z1 + f4 * f12, color);
        }
    }

    private final void emitLine(VertexConsumer buffer, MatrixStack.Entry entry, float x1, float y1, float z1, float x2, float y2, float z2, Color color) {
        float f2 = Math.abs(x2 - x1);
        float f3 = Math.abs(y2 - y1);
        float f4 = Math.abs(z2 - z1);
        if (f2 <= 0.001f && f3 <= 0.001f && f4 <= 0.001f) {
            return;
        }
        float f5 = Math.max(0.0075f, 0.002f);
        this.emitSolidBox(buffer, entry, Math.min(x1, x2) - (f2 <= 0.001f ? f5 : 0.0f), Math.min(y1, y2) - (f3 <= 0.001f ? f5 : 0.0f), Math.min(z1, z2) - (f4 <= 0.001f ? f5 : 0.0f), Math.max(x1, x2) + (f2 <= 0.001f ? f5 : 0.0f), Math.max(y1, y2) + (f3 <= 0.001f ? f5 : 0.0f), Math.max(z1, z2) + (f4 <= 0.001f ? f5 : 0.0f), color);
    }

    private final void emitSolidBox(VertexConsumer buffer, MatrixStack.Entry entry, float x1, float y1, float z1, float x2, float y2, float z2, Color color) {
        this.emitQuad(buffer, entry, x1, y1, z1, x2, y1, z1, x2, y2, z1, x1, y2, z1, color);
        this.emitQuad(buffer, entry, x1, y1, z2, x2, y1, z2, x2, y2, z2, x1, y2, z2, color);
        this.emitQuad(buffer, entry, x1, y1, z1, x1, y1, z2, x1, y2, z2, x1, y2, z1, color);
        this.emitQuad(buffer, entry, x2, y1, z1, x2, y1, z2, x2, y2, z2, x2, y2, z1, color);
        this.emitQuad(buffer, entry, x1, y1, z1, x2, y1, z1, x2, y1, z2, x1, y1, z2, color);
        this.emitQuad(buffer, entry, x1, y2, z1, x2, y2, z1, x2, y2, z2, x1, y2, z2, color);
    }

    private final void emitQuad(VertexConsumer buffer, MatrixStack.Entry entry, float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4, Color color) {
        buffer.vertex(entry, x1, y1, z1).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        buffer.vertex(entry, x2, y2, z2).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        buffer.vertex(entry, x3, y3, z3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        buffer.vertex(entry, x4, y4, z4).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }

    private final void clearState(ClientWorld world) {
        m.clear();
        M.clear();
        n = world;
        N = 0.0f;
        o = System.nanoTime();
    }

    static /* synthetic */ void clearState$default(BlinkModule blinkModule, ClientWorld clientWorld, int n2, Object object) {
        int n3 = r[93];
        n3 -= r[94];
        if ((n2 & (n3 -= r[95])) != 0) {
            clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
        }
        blinkModule.clearState(clientWorld);
    }

    private static final boolean useClientColor$lambda$0() {
        return ClientColorModule.INSTANCE.isEnabled();
    }

    private static final boolean color$lambda$0() {
        int n2;
        if (!((Boolean)J.getValue()).booleanValue() || !ClientColorModule.INSTANCE.isEnabled()) {
            int n3 = r[96];
            n3 += r[97];
            n2 = n3 -= r[98];
        } else {
            int n4 = r[99];
            n4 -= r[100];
            n2 = n4 -= r[101];
        }
        return n2 != 0;
    }

    private static final boolean pruneExpiredSnapshots$lambda$0(long $currentTime, long $lifetimeMs, K it) {
        boolean bl;
        int n2 = r[102];
        n2 -= r[103];
        Intrinsics.checkNotNullParameter(it, (String)O[n2 -= r[104]]);
        if ($currentTime - it.getCreatedAt() > $lifetimeMs) {
            boolean bl2 = r[105];
            bl2 -= r[106];
            bl = bl2 -= r[107];
        } else {
            boolean bl3 = r[108];
            bl3 ^= r[109];
            bl = bl3 += r[110];
        }
        return bl;
    }

    private static final boolean pruneExpiredSnapshots$lambda$1(Function1 $tmp0, Object p0) {
        return (Boolean)$tmp0.invoke(p0);
    }

    static {
        BlinkModule.b();
        long l2 = -4776627970654978099L;
        long l3 = -1222113777873919426L;
        long l4 = -3424717832460103894L;
        long l5 = 922546855588993442L;
        long l6 = -1813107803129846899L;
        long l7 = -2643106265759622619L;
        long l8 = 7005740179147336205L;
        long l9 = -6247167251715442659L;
        long l10 = -2642046383706405088L;
        long l11 = 4134547962304225298L;
        long l12 = 8496690427030905241L;
        long l13 = -4840277158725100327L;
        long l14 = 3168790041652865233L;
        long l15 = 3966599632015502049L;
        int n2 = r[111];
        n2 -= r[112];
        O = new Object[n2 -= r[113]];
        long l16 = l15;
        int n3 = r[114];
        n3 += r[115];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= r[116]);
        Object[] objectArray = new Object[r[117]];
        objectArray[BlinkModule.r[118]] = p;
        objectArray[BlinkModule.r[119]] = r[120];
        int n4 = r[121];
        Object object = BlinkModule.A()[r[122]];
        if (object == null) {
            char[] cArray = "\u14b1\u14b4\u129e\u1298\u12ea\u14b6\u1341\u129f\u14bf\u14c3\u14b7\u12ed\u1353\u1348\u14c3\u135b\u1297\u14b2\u1353\u14b5\u14c3\u14b8\u134d\u1354\u12e8\u14bc\u12ee\u12f3\u12ee\u1348\u1351\u12e3\u14b2\u134c\u1290\u1350\u134e\u1353\u14bc\u1323\u134a\u12ef\u14b4\u134e\u1346\u1352\u135e\u129a\u129c\u1349\u14bf\u12f3\u12e1\u14b8\u1291\u14b7\u14b2\u14c3\u1341\u135f\u14b2\u1367\u134f\u129a\u134e\u134a\u1349\u12ee\u129a\u134f\u1347\u135e\u12e9\u14b0\u1350\u12ee\u134f\u12ef\u14ba\u12ea\u1347\u14a6\u129c\u135a\u12ee\u1323\u1355\u14b7\u12e9\u14bf\u1354\u14b7\u1345\u12ef\u14b0\u1355\u1365\u1351\u1351\u12e9\u1323\u1290\u14c3\u1357\u14ba\u14ba\u12ef\u14b2\u14c3\u14bc\u12ea\u135b\u1358\u129a\u1365\u1351\u14b7\u12e3\u12ed\u1354\u14b6\u12f3\u1357\u1329\u12ea\u135b\u14a6\u135f\u1353\u1297\u135c\u12ee\u129f\u134a\u14c3\u14b7\u1295\u1351\u134d\u12f3\u132d\u1323\u14bf\u129e\u135b\u135b\u1351\u135b\u14b2\u14b8\u1352\u129a\u1353\u1345\u14be\u1354\u1367\u14b0\u135c\u14b1\u12f3\u14a6\u129c\u1348\u129c\u1350\u12ea\u1365\u1346\u14b1\u12f3\u1347\u1355\u14b0\u14c3\u135c\u1323\u1295\u129c\u132d\u1346\u12ea\u14b1\u14b5\u14be\u12e8\u1347\u12e1\u1357\u1341\u1350\u14ba\u14b0\u14b5\u1349\u134e\u134d\u1345\u1365\u134a\u129a\u1348\u1323\u14be\u14b0\u14bc\u14b0\u12ee\u134a\u14b7\u1329\u1358\u129e\u1290\u1345\u12ef\u12f3\u1298\u14ba\u12e3\u134d\u12ee\u14bf\u135c\u14c3\u14a6\u1347\u12ef\u1352\u1365\u1345\u1354\u12ed\u12ec\u134c\u12e3\u1353\u1367\u14b1\u14b1\u132d\u14bc\u1346\u14b4\u129c\u14b4\u1356\u1323\u1290\u1341\u14b5\u134c\u12e1\u135c\u1354\u14bc\u1347\u129f\u1349\u14b7\u134c\u1351\u135c\u14bc\u1347\u1329\u1351\u135e\u129c\u14b0\u129f\u1298\u129c\u129e\u14b7\u1355\u14b4\u134f\u1367\u14b2\u14bb\u1349\u12e3\u1351\u129f\u1290\u14b2\u14c3\u135b\u12ed\u1352\u135a\u12ec\u134e\u135b\u14bb\u12ea\u135f\u1290\u128b".toCharArray();
            for (int i2 = r[123]; i2 < r[124]; ++i2) {
                int n5 = cArray[i2];
                n5 -= r[125];
                n5 ^= r[126];
                n5 ^= r[127];
                n5 ^= r[128];
                n5 -= r[129];
                n5 += r[130];
                n5 -= r[131];
                n5 -= r[132];
                n5 ^= r[133];
                n5 -= r[134];
                n5 ^= r[135];
                n5 += r[136];
                cArray[i2] = (char)(n5 ^= r[137]);
            }
            object = BlinkModule.A()[BlinkModule.r[138]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)BlinkModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = r[139];
        n6 += r[140];
        l6 = l17 ^ (0x8900000000L ^ l17) & -1L << (n6 += r[141]);
        long l18 = l13;
        int n7 = r[142];
        n7 ^= r[143];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += r[144]);
        while (true) {
            int n8 = r[145];
            n8 += r[146];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= r[147]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = r[148];
            n10 -= r[149];
            int n11 = r[151];
            n11 ^= r[152];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= r[150])) & -1L >>> (n11 -= r[153]);
            long l20 = l9;
            int n12 = r[154];
            n12 -= r[155];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= r[156]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = r[157];
            n14 -= r[158];
            int n15 = r[160];
            n15 ^= r[161];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += r[159])) & -1L >>> (n15 ^= r[162]);
            int n16 = r[163];
            n16 -= r[164];
            long l22 = l10;
            int n17 = r[166];
            n17 += r[167];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += r[165]) ^ l22) & -1L << (n17 ^= r[168]);
            int n18 = r[169];
            n18 ^= r[170];
            n18 -= r[171];
            int n19 = r[172];
            n19 ^= r[173];
            long l23 = l12;
            int n20 = r[175];
            n20 += r[176];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= r[174]))) ^ l23) & -1L >>> (n20 -= r[177]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = r[178];
            n21 += r[179];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= r[180]);
            while (true) {
                int n22 = r[181];
                n22 ^= r[182];
                if ((int)(l14 >>> (n22 -= r[183])) >= (int)l12) break;
                int n23 = r[184];
                n23 += r[185];
                int n24 = r[187];
                n24 ^= r[188];
                cArray2[(int)(l14 >>> (n23 -= BlinkModule.r[186]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= r[189]))];
                l14 += 0x100000000L;
            }
            int n25 = r[190];
            n25 -= r[191];
            int n26 = (int)(l15 >>> (n25 ^= r[192]));
            l15 += 0x100000000L;
            BlinkModule.O[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = r[193];
            n27 -= r[194];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= r[195]);
        }
        INSTANCE = new BlinkModule();
        int n28 = r[196];
        n28 += r[197];
        boolean bl = r[199];
        bl ^= r[200];
        J = INSTANCE.cfr_renamed_0((String)O[n28 += r[198]], bl ^= r[201]).setVisible(BlinkModule::useClientColor$lambda$0);
        int n29 = r[202];
        n29 -= r[203];
        String string = (String)O[n29 += r[204]];
        Color color = Color.WHITE;
        int n30 = r[205];
        n30 += r[206];
        Intrinsics.checkNotNullExpressionValue(color, (String)O[n30 -= r[207]]);
        k = INSTANCE.color(string, color).setVisible(BlinkModule::color$lambda$0);
        int n31 = r[208];
        n31 -= r[209];
        boolean bl2 = r[211];
        bl2 ^= r[212];
        K = INSTANCE.cfr_renamed_0((String)O[n31 -= r[210]], bl2 -= r[213]);
        int n32 = r[214];
        n32 += r[215];
        boolean bl3 = r[217];
        bl3 -= r[218];
        l = INSTANCE.cfr_renamed_0((String)O[n32 -= r[216]], bl3 += r[219]);
        int n33 = r[220];
        n33 -= r[221];
        L = INSTANCE.slider((String)O[n33 ^= r[222]], 1.5f, 0.1f, 5.0f, 0.1f);
        m = new LinkedHashMap();
        M = new HashMap();
        o = System.nanoTime();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[r[223]];
        String string = (String)object[r[224]];
        object = object[r[225]];
        Object[] objectArray = q;
        if (q == null) {
            objectArray = q = new Object[r[226]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[r[227]];
                p = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[r[229] ^ r[230]];
                byArray[BlinkModule.r[231] ^ BlinkModule.r[232]] = r[233] ^ r[234];
                byArray[BlinkModule.r[235] ^ BlinkModule.r[236]] = r[237] ^ r[238];
                byArray[BlinkModule.r[239] ^ BlinkModule.r[240]] = r[241] ^ r[242];
                byArray[BlinkModule.r[243] ^ BlinkModule.r[244]] = r[245] ^ r[246];
                byArray[BlinkModule.r[247] ^ BlinkModule.r[248]] = r[249] ^ r[250];
                byArray[BlinkModule.r[251] ^ BlinkModule.r[252]] = r[253] ^ r[254];
                byArray[BlinkModule.r[255] ^ BlinkModule.r[256]] = r[257] ^ r[258];
                byArray[BlinkModule.r[259] ^ BlinkModule.r[260]] = r[261] ^ r[262];
                byArray[BlinkModule.r[263] ^ BlinkModule.r[264]] = r[265] ^ r[266];
                byArray[BlinkModule.r[267] ^ BlinkModule.r[268]] = r[269] ^ r[270];
                byArray[BlinkModule.r[271] ^ BlinkModule.r[272]] = r[273] ^ r[274];
                byArray[BlinkModule.r[275] ^ BlinkModule.r[276]] = r[277] ^ r[278];
                byArray[BlinkModule.r[279] ^ BlinkModule.r[280]] = r[281] ^ r[282];
                byArray[BlinkModule.r[283] ^ BlinkModule.r[284]] = r[285] ^ r[286];
                byArray[BlinkModule.r[287] ^ BlinkModule.r[288]] = r[289] ^ r[290];
                byArray[BlinkModule.r[291] ^ BlinkModule.r[292]] = r[293] ^ r[294];
                objectArray2[BlinkModule.r[228]] = byArray;
            }
            byte[] byArray = (byte[])object3[r[295]];
            if (P == null) {
                byte[] byArray2 = new byte[r[296] ^ r[297]];
                byArray2[BlinkModule.r[298] ^ BlinkModule.r[299]] = r[300] ^ r[301];
                byArray2[BlinkModule.r[302] ^ BlinkModule.r[303]] = r[304] ^ r[305];
                byArray2[BlinkModule.r[306] ^ BlinkModule.r[307]] = r[308] ^ r[309];
                byArray2[BlinkModule.r[310] ^ BlinkModule.r[311]] = r[312] ^ r[313];
                byArray2[BlinkModule.r[314] ^ BlinkModule.r[315]] = r[316] ^ r[317];
                byArray2[BlinkModule.r[318] ^ BlinkModule.r[319]] = r[320] ^ r[321];
                byArray2[BlinkModule.r[322] ^ BlinkModule.r[323]] = r[324] ^ r[325];
                byArray2[BlinkModule.r[326] ^ BlinkModule.r[327]] = r[328] ^ r[329];
                byArray2[BlinkModule.r[330] ^ BlinkModule.r[331]] = r[332] ^ r[333];
                byArray2[BlinkModule.r[334] ^ BlinkModule.r[335]] = r[336] ^ r[337];
                byArray2[BlinkModule.r[338] ^ BlinkModule.r[339]] = r[340] ^ r[341];
                byArray2[BlinkModule.r[342] ^ BlinkModule.r[343]] = r[344] ^ r[345];
                byArray2[BlinkModule.r[346] ^ BlinkModule.r[347]] = r[348] ^ r[349];
                byArray2[BlinkModule.r[350] ^ BlinkModule.r[351]] = r[352] ^ r[353];
                byArray2[BlinkModule.r[354] ^ BlinkModule.r[355]] = r[356] ^ r[357];
                byArray2[BlinkModule.r[358] ^ BlinkModule.r[359]] = r[360] ^ r[361];
                byArray2[BlinkModule.r[362] ^ BlinkModule.r[363]] = r[364] ^ r[365];
                byArray2[BlinkModule.r[366] ^ BlinkModule.r[367]] = r[368] ^ r[369];
                byArray2[BlinkModule.r[370] ^ BlinkModule.r[371]] = r[372] ^ r[373];
                byArray2[BlinkModule.r[374] ^ BlinkModule.r[375]] = r[376] ^ r[377];
                byArray2[BlinkModule.r[378] ^ BlinkModule.r[379]] = r[380] ^ r[381];
                byArray2[BlinkModule.r[382] ^ BlinkModule.r[383]] = r[384] ^ r[385];
                byArray2[BlinkModule.r[386] ^ BlinkModule.r[387]] = r[388] ^ r[389];
                byArray2[BlinkModule.r[390] ^ BlinkModule.r[391]] = r[392] ^ r[393];
                byArray2[BlinkModule.r[394] ^ BlinkModule.r[395]] = r[396] ^ r[397];
                byArray2[BlinkModule.r[398] ^ BlinkModule.r[399]] = 0x100D ^ 0x105B;
                byArray2[0xD6A6 ^ 0xD6B9] = 0xFFFF295F ^ 0xD6B9;
                byArray2[0x6199 ^ 0x6188] = 0x61D4 ^ 0x6188;
                byArray2[0xE1B0 ^ 0xE1A6] = 0xFFFF1E4C ^ 0xE1A6;
                byArray2[0xCEB5 ^ 0xCEAF] = 0xCEE6 ^ 0xCEAF;
                byArray2[0x18D4 ^ 0x18DD] = 0xFFFFE760 ^ 0x18DD;
                byArray2[0x82A5 ^ 0x82BC] = 0x82B1 ^ 0x82BC;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = BlinkModule.A()[1];
                if (object4 == null) {
                    char[] cArray = "\ue7f8\ue84a\ue7f3\ue7dc\ue7de\ue7da\ue80f\ue261\ue62c\ue280\ue7e0\ue615\ue269\ue27b\ue80b\ue7e0\ue849\ue7d9".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 -= 41344;
                        n3 -= 49361;
                        n3 ^= 0x3A84;
                        n3 ^= 0x90B5;
                        n3 += 26422;
                        n3 ^= 0xAD16;
                        n3 -= 1289;
                        n3 += 46188;
                        n3 -= 49326;
                        n3 ^= 0x423F;
                        n3 += 5871;
                        cArray[i2] = (char)(n3 -= 32591);
                    }
                    object4 = BlinkModule.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[3] = 8;
                byArray4[13] = 31;
                byArray4[5] = -109;
                byArray4[1] = 57;
                byArray4[8] = -117;
                byArray4[9] = 72;
                byArray4[7] = -81;
                byArray4[10] = -67;
                byArray4[0] = -58;
                byArray4[15] = -109;
                byArray4[14] = -67;
                byArray4[11] = -53;
                byArray4[12] = 63;
                byArray4[2] = -24;
                byArray4[4] = -96;
                byArray4[6] = 92;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 2, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = BlinkModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u04a9\u04a5\u048f".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 58625;
                        n4 -= 58962;
                        n4 += 29634;
                        n4 ^= 0x6A42;
                        n4 ^= 0xA553;
                        n4 ^= 0xF05;
                        n4 ^= 0xEBD6;
                        n4 += 54807;
                        n4 -= 49032;
                        n4 ^= 0x57E9;
                        n4 ^= 0xC65D;
                        cArray[i3] = (char)(n4 += 7534);
                    }
                    object5 = BlinkModule.A()[2] = new String(cArray);
                }
                P = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = BlinkModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\ua90b\ua90f\ua91d\ua8f9\ua90d\ua90c\ua90d\ua8f9\ua91a\ua915\ua90d\ua91d\ua8ff\ua91a\ua92b\ua92e\ua92e\ua933\ua938\ua931".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 += 25536;
                    n5 += 31713;
                    n5 += 38050;
                    n5 += 37955;
                    n5 -= 33828;
                    n5 += 9606;
                    n5 -= 37799;
                    n5 -= 36939;
                    n5 -= 59599;
                    n5 += 13616;
                    n5 ^= 0x9990;
                    n5 ^= 0x6590;
                    n5 += 23798;
                    n5 -= 45976;
                    cArray[i4] = (char)(n5 -= 12415);
                }
                object6 = BlinkModule.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)P), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = Q;
        if (Q == null) {
            Q = new Object[4];
            objectArray = Q;
        }
        return objectArray;
    }

    public static void b() {
        r = new int[0x97F6 ^ 0x9666];
        BlinkModule.r[0xD8AB ^ 0xD84A] = 0xD84A ^ 0xD84A;
        BlinkModule.r[0xB185 ^ 0xB168] = 0xFFFF8FC6 ^ 0xB168;
        BlinkModule.r[0x451A ^ 0x4531] = 0x4541 ^ 0x4531;
        BlinkModule.r[0xEF39 ^ 0xEF9C] = 0xFFFF100A ^ 0xEF9C;
        BlinkModule.r[0x1035 ^ 0x10E1] = 0xFFFFEF1F ^ 0x10E1;
        BlinkModule.r[0xADEC ^ 0xAD7C] = 0xAD6A ^ 0xAD7C;
        BlinkModule.r[0xCA9F ^ 0xCB96] = 0xB985 ^ 0xCB96;
        BlinkModule.r[0x1A1B ^ 0x1A6C] = 0x1A6D ^ 0x1A6C;
        BlinkModule.r[0x92B3 ^ 0x9263] = 0x92E6 ^ 0x9263;
        BlinkModule.r[0x109BA ^ 0x10988] = 0x1098F ^ 0x10988;
        BlinkModule.r[0x66 ^ 0x137] = 0x468A ^ 0x137;
        BlinkModule.r[0x10CE ^ 0x1021] = 0x694A ^ 0x1021;
        BlinkModule.r[0x797A ^ 0x7830] = 0xF7A4 ^ 0x7830;
        BlinkModule.r[0x9C37 ^ 0x9C76] = 0x9C61 ^ 0x9C76;
        BlinkModule.r[0xF8E5 ^ 0xF9DA] = 0x2800 ^ 0xF9DA;
        BlinkModule.r[0x4221 ^ 0x426C] = 0x424A ^ 0x426C;
        BlinkModule.r[0xA58C ^ 0xA4BB] = 0x27B1 ^ 0xA4BB;
        BlinkModule.r[0x7881 ^ 0x7891] = 0xFFFF8748 ^ 0x7891;
        BlinkModule.r[0x193D ^ 0x194C] = 0xFFFFE6DB ^ 0x194C;
        BlinkModule.r[0x220C ^ 0x2293] = 0x22DF ^ 0x2293;
        BlinkModule.r[0x3B32 ^ 0x3B49] = 0x3B49 ^ 0x3B49;
        BlinkModule.r[0xA05A ^ 0xA149] = 0x2870 ^ 0xA149;
        BlinkModule.r[0xF18F ^ 0xF14C] = 0xFFFF0EAE ^ 0xF14C;
        BlinkModule.r[0xE34C ^ 0xE3AF] = 0xE3AE ^ 0xE3AF;
        BlinkModule.r[0xEF69 ^ 0xEF43] = 0xEF5B ^ 0xEF43;
        BlinkModule.r[0x2177 ^ 0x21D9] = 0xFFFFDE19 ^ 0x21D9;
        BlinkModule.r[0x30FC ^ 0x3003] = 0xC851 ^ 0x3003;
        BlinkModule.r[0x5A23 ^ 0x5A07] = 0x5A77 ^ 0x5A07;
        BlinkModule.r[0xB3E4 ^ 0xB2EF] = 0x2151 ^ 0xB2EF;
        BlinkModule.r[0x10C3E ^ 0x10CAD] = 0x10C83 ^ 0x10CAD;
        BlinkModule.r[0x31A3 ^ 0x31EC] = 0xFFFFCE3A ^ 0x31EC;
        BlinkModule.r[0xF5FF ^ 0xF57C] = 0x31AE ^ 0xF57C;
        BlinkModule.r[0x42EC ^ 0x43CC] = 0xC2E6 ^ 0x43CC;
        BlinkModule.r[0x5C8A ^ 0x5CA4] = 0xFFFFA333 ^ 0x5CA4;
        BlinkModule.r[0x65E6 ^ 0x64F8] = 0x9D2B ^ 0x64F8;
        BlinkModule.r[0xA742 ^ 0xA72C] = 0xA70B ^ 0xA72C;
        BlinkModule.r[0xDF41 ^ 0xDE6B] = 0x1DCAA ^ 0xDE6B;
        BlinkModule.r[0x46A7 ^ 0x4685] = 0x46E6 ^ 0x4685;
        BlinkModule.r[0x2710 ^ 0x2620] = 0xC3F8 ^ 0x2620;
        BlinkModule.r[0x2B10 ^ 0x2A1D] = 0xFFFF4628 ^ 0x2A1D;
        BlinkModule.r[0xD606 ^ 0xD6DA] = 0xD653 ^ 0xD6DA;
        BlinkModule.r[0xDF35 ^ 0xDF45] = 0xDF70 ^ 0xDF45;
        BlinkModule.r[0x6856 ^ 0x6929] = 0xBCA3 ^ 0x6929;
        BlinkModule.r[0xB3CD ^ 0xB28E] = 0xC21B ^ 0xB28E;
        BlinkModule.r[0xBD7F ^ 0xBDFF] = 0x9478 ^ 0xBDFF;
        BlinkModule.r[0xACCD ^ 0xADB1] = 0xCC1C ^ 0xADB1;
        BlinkModule.r[0xAB4 ^ 0xB3A] = 0x1B66 ^ 0xB3A;
        BlinkModule.r[0x1DEB ^ 0x1CF9] = 0x6150 ^ 0x1CF9;
        BlinkModule.r[0x2EA3 ^ 0x2EA9] = 0x2EA8 ^ 0x2EA9;
        BlinkModule.r[0xA93A ^ 0xA959] = 0xA920 ^ 0xA959;
        BlinkModule.r[0xC9E9 ^ 0xC8F2] = 0x312B ^ 0xC8F2;
        BlinkModule.r[0x3E7 ^ 0x37E] = 0x340 ^ 0x37E;
        BlinkModule.r[0xBBD0 ^ 0xBACA] = 0x2064 ^ 0xBACA;
        BlinkModule.r[0xF883 ^ 0xF90C] = 0xE957 ^ 0xF90C;
        BlinkModule.r[0xEDD2 ^ 0xED99] = 0xFFFF1252 ^ 0xED99;
        BlinkModule.r[0x6C04 ^ 0x6D87] = 0x5A49 ^ 0x6D87;
        BlinkModule.r[0xB4AF ^ 0xB462] = 0xB47F ^ 0xB462;
        BlinkModule.r[0x63A5 ^ 0x6350] = 0xE935 ^ 0x6350;
        BlinkModule.r[0x5D5A ^ 0x5D54] = 0xFFFFA283 ^ 0x5D54;
        BlinkModule.r[0x822F ^ 0x834C] = 0x9A1A ^ 0x834C;
        BlinkModule.r[0x6B0D ^ 0x6BF7] = 0xF684 ^ 0x6BF7;
        BlinkModule.r[0xEC95 ^ 0xED12] = 0x4791 ^ 0xED12;
        BlinkModule.r[0xFCEF ^ 0xFC58] = 0xFC3E ^ 0xFC58;
        BlinkModule.r[0x23E8 ^ 0x23D2] = 0xFFFFDC35 ^ 0x23D2;
        BlinkModule.r[0x7E24 ^ 0x7EFA] = 0x7EE7 ^ 0x7EFA;
        BlinkModule.r[0x5FAD ^ 0x5EFB] = 0x2A6F ^ 0x5EFB;
        BlinkModule.r[0xDB87 ^ 0xDBE8] = 0xFFFF2432 ^ 0xDBE8;
        BlinkModule.r[0x52AE ^ 0x53DB] = 0xA8E1 ^ 0x53DB;
        BlinkModule.r[0x10199 ^ 0x101FE] = 0x101E8 ^ 0x101FE;
        BlinkModule.r[0xCDBB ^ 0xCC94] = 0x294C ^ 0xCC94;
        BlinkModule.r[0x10C02 ^ 0x10C3B] = 0xFFFEF3B2 ^ 0x10C3B;
        BlinkModule.r[0x9BD ^ 0x8DA] = 0xC506 ^ 0x8DA;
        BlinkModule.r[0x5FB2 ^ 0x5EED] = 0x739A ^ 0x5EED;
        BlinkModule.r[0x9744 ^ 0x9642] = 0x8BF2 ^ 0x9642;
        BlinkModule.r[0x92F5 ^ 0x9286] = 0x92C2 ^ 0x9286;
        BlinkModule.r[0xB7D3 ^ 0xB76E] = 0xFFFF48F6 ^ 0xB76E;
        BlinkModule.r[0xAAC1 ^ 0xABD8] = 0x311A ^ 0xABD8;
        BlinkModule.r[0x84E9 ^ 0x8419] = 0xFD7F ^ 0x8419;
        BlinkModule.r[0xA7B2 ^ 0xA7B4] = 0xFFFF5870 ^ 0xA7B4;
        BlinkModule.r[0x72D7 ^ 0x7383] = 0xCA49 ^ 0x7383;
        BlinkModule.r[0x43C1 ^ 0x43A9] = 0x43E6 ^ 0x43A9;
        BlinkModule.r[0xB83C ^ 0xB90A] = 0x3A0F ^ 0xB90A;
        BlinkModule.r[0xE84A ^ 0xE86A] = 0xFFFF17AC ^ 0xE86A;
        BlinkModule.r[0x5B88 ^ 0x5B5F] = 0xFFFFA481 ^ 0x5B5F;
        BlinkModule.r[0xA7F2 ^ 0xA70C] = 0x22C3 ^ 0xA70C;
        BlinkModule.r[0x715C ^ 0x705E] = 0x8808 ^ 0x705E;
        BlinkModule.r[0x3AB3 ^ 0x3A75] = 0xFFFFC5E1 ^ 0x3A75;
        BlinkModule.r[0x44CA ^ 0x44C3] = 0xFFFFBB11 ^ 0x44C3;
        BlinkModule.r[0xE961 ^ 0xE811] = 0xB19C ^ 0xE811;
        BlinkModule.r[0xC709 ^ 0xC706] = 0xFFFF38DD ^ 0xC706;
        BlinkModule.r[0x9E55 ^ 0x9E7A] = 0xFFFF61FB ^ 0x9E7A;
        BlinkModule.r[0x8DE3 ^ 0x8C8E] = 0x8E25 ^ 0x8C8E;
        BlinkModule.r[0xA9FC ^ 0xA900] = 0x2CCF ^ 0xA900;
        BlinkModule.r[0xC0B0 ^ 0xC012] = 0xFFFF3FE1 ^ 0xC012;
        BlinkModule.r[0x60E8 ^ 0x6081] = 0x6095 ^ 0x6081;
        BlinkModule.r[0xDB82 ^ 0xDBFF] = 0x821F ^ 0xDBFF;
        BlinkModule.r[0x1C6F ^ 0x1D43] = 0xFFFEE028 ^ 0x1D43;
        BlinkModule.r[0xD7C6 ^ 0xD7DE] = 0xFFFF2830 ^ 0xD7DE;
        BlinkModule.r[0x572B ^ 0x57D6] = 0xFFFF2DFC ^ 0x57D6;
        BlinkModule.r[0xC62 ^ 0xD41] = 0xC7DF ^ 0xD41;
        BlinkModule.r[0x67FD ^ 0x6744] = 0xFFFF98E3 ^ 0x6744;
        BlinkModule.r[0x94C8 ^ 0x95ED] = 0xFFFFA0EC ^ 0x95ED;
        BlinkModule.r[0xD25A ^ 0xD20B] = 0xFFFF2D43 ^ 0xD20B;
        BlinkModule.r[0x5400 ^ 0x54EE] = 0x95AC ^ 0x54EE;
        BlinkModule.r[0xC651 ^ 0xC606] = 0xFFFF39E4 ^ 0xC606;
        BlinkModule.r[0x10625 ^ 0x10666] = 0xFFFEF9FD ^ 0x10666;
        BlinkModule.r[0x5EAE ^ 0x5EFB] = 0x5ECB ^ 0x5EFB;
        BlinkModule.r[0x592D ^ 0x59E3] = 0x5983 ^ 0x59E3;
        BlinkModule.r[0x5516 ^ 0x5544] = 0xFFFFAACA ^ 0x5544;
        BlinkModule.r[0x5D98 ^ 0x5DAF] = 0x5DA8 ^ 0x5DAF;
        BlinkModule.r[0x6867 ^ 0x685F] = 0x6863 ^ 0x685F;
        BlinkModule.r[0x63F7 ^ 0x63A9] = 0x63C9 ^ 0x63A9;
        BlinkModule.r[0x56BF ^ 0x562D] = 0x5677 ^ 0x562D;
        BlinkModule.r[0x7B1D ^ 0x7A2F] = 0xDC51 ^ 0x7A2F;
        BlinkModule.r[0x500 ^ 0x5FB] = 0x803D ^ 0x5FB;
        BlinkModule.r[0xD00B ^ 0xD159] = 0x68D6 ^ 0xD159;
        BlinkModule.r[0xA5EF ^ 0xA59A] = 0xA599 ^ 0xA59A;
        BlinkModule.r[0xBE21 ^ 0xBF0F] = 0x5AD4 ^ 0xBF0F;
        BlinkModule.r[0xEAD8 ^ 0xEAF0] = 0xFFFF154F ^ 0xEAF0;
        BlinkModule.r[0xDEED ^ 0xDE69] = 0x6B5B ^ 0xDE69;
        BlinkModule.r[0x5075 ^ 0x5141] = 0xF70C ^ 0x5141;
        BlinkModule.r[0x14E0 ^ 0x1407] = 0xC860 ^ 0x1407;
        BlinkModule.r[0x94C2 ^ 0x9486] = 0xFFFF6B74 ^ 0x9486;
        BlinkModule.r[0xD271 ^ 0xD365] = 0x5A5B ^ 0xD365;
        BlinkModule.r[0xFB69 ^ 0xFA54] = 0x7300 ^ 0xFA54;
        BlinkModule.r[0x87 ^ 0xA2] = 0xF3 ^ 0xA2;
        BlinkModule.r[0xBACC ^ 0xBBBB] = 0x74F7 ^ 0xBBBB;
        BlinkModule.r[0x73EF ^ 0x72AE] = 0xA374 ^ 0x72AE;
        BlinkModule.r[0x1F4F ^ 0x1F05] = 0xFFFFE0C0 ^ 0x1F05;
        BlinkModule.r[0x4D98 ^ 0x4CAD] = 0xEAD5 ^ 0x4CAD;
        BlinkModule.r[0x8FB ^ 0x9B3] = 0xFFFF0713 ^ 0x9B3;
        BlinkModule.r[0x19EE ^ 0x19FF] = 0x19B2 ^ 0x19FF;
        BlinkModule.r[0x7931 ^ 0x7861] = 0x3FAD ^ 0x7861;
        BlinkModule.r[0x103E4 ^ 0x10368] = 0xFFFEFCA3 ^ 0x10368;
        BlinkModule.r[0xEE5E ^ 0xEF3C] = 0xF66A ^ 0xEF3C;
        BlinkModule.r[0xE6F0 ^ 0xE6D6] = 0xE6CA ^ 0xE6D6;
        BlinkModule.r[0x10BC3 ^ 0x10AE5] = 0x1C077 ^ 0x10AE5;
        BlinkModule.r[0x8D2E ^ 0x8C3E] = 0xF197 ^ 0x8C3E;
        BlinkModule.r[0x4CA8 ^ 0x4C48] = 0x4C4A ^ 0x4C48;
        BlinkModule.r[0x33CA ^ 0x33E9] = 0x3385 ^ 0x33E9;
        BlinkModule.r[0xD047 ^ 0xD119] = 0xFC73 ^ 0xD119;
        BlinkModule.r[0x1620 ^ 0x16BD] = 0xFFFFE9D3 ^ 0x16BD;
        BlinkModule.r[0xFF56 ^ 0xFE2E] = 0xFFFFCE86 ^ 0xFE2E;
        BlinkModule.r[0x24C6 ^ 0x2544] = 0x1291 ^ 0x2544;
        BlinkModule.r[0x10754 ^ 0x1061B] = 0x141A6 ^ 0x1061B;
        BlinkModule.r[0x67BA ^ 0x66D4] = 0x3F1F ^ 0x66D4;
        BlinkModule.r[0xCEDE ^ 0xCF90] = 0x8831 ^ 0xCF90;
        BlinkModule.r[0x56D9 ^ 0x56B3] = 0x56BA ^ 0x56B3;
        BlinkModule.r[0x9961 ^ 0x987E] = 0x1955 ^ 0x987E;
        BlinkModule.r[0x39E8 ^ 0x3996] = 0x1B6 ^ 0x3996;
        BlinkModule.r[0x72BE ^ 0x72B6] = 0x72F9 ^ 0x72B6;
        BlinkModule.r[0xE9E0 ^ 0xE9EC] = 0xFFFF1636 ^ 0xE9EC;
        BlinkModule.r[0xE9AF ^ 0xE97E] = 0xE93D ^ 0xE97E;
        BlinkModule.r[0x921B ^ 0x9279] = 0xFFFF6DB4 ^ 0x9279;
        BlinkModule.r[0x10353 ^ 0x103C8] = 0x10389 ^ 0x103C8;
        BlinkModule.r[0xE8CC ^ 0xE989] = 0x991C ^ 0xE989;
        BlinkModule.r[0xBBBA ^ 0xBB43] = 0xFFFFD99E ^ 0xBB43;
        BlinkModule.r[0x87F5 ^ 0x877D] = 0xD080 ^ 0x877D;
        BlinkModule.r[0x29A6 ^ 0x297B] = 0x2910 ^ 0x297B;
        BlinkModule.r[0x17E0 ^ 0x1792] = 0x17A1 ^ 0x1792;
        BlinkModule.r[0x298E ^ 0x293C] = 0x295C ^ 0x293C;
        BlinkModule.r[0x5449 ^ 0x5568] = 0xD472 ^ 0x5568;
        BlinkModule.r[0x632F ^ 0x631A] = 0xFFFF9CEF ^ 0x631A;
        BlinkModule.r[0xC075 ^ 0xC0FF] = 0xC0FF ^ 0xC0FF;
        BlinkModule.r[0xEED5 ^ 0xEFCD] = 0x7563 ^ 0xEFCD;
        BlinkModule.r[0x1B04 ^ 0x1A70] = 0xFFFF1EED ^ 0x1A70;
        BlinkModule.r[0xEA86 ^ 0xEB83] = 0xF67A ^ 0xEB83;
        BlinkModule.r[0xA4C3 ^ 0xA464] = 0xA456 ^ 0xA464;
        BlinkModule.r[0x10669 ^ 0x106A2] = 0x106F8 ^ 0x106A2;
        BlinkModule.r[0xB10E ^ 0xB117] = 0xB111 ^ 0xB117;
        BlinkModule.r[0xB92F ^ 0xB986] = 0xFFFF466B ^ 0xB986;
        BlinkModule.r[0x1BDD ^ 0x1AA0] = 0x7B24 ^ 0x1AA0;
        BlinkModule.r[0x7572 ^ 0x7534] = 0xFFFF8ABC ^ 0x7534;
        BlinkModule.r[0x9069 ^ 0x91E2] = 0xDC9B ^ 0x91E2;
        BlinkModule.r[0x88DE ^ 0x8982] = 0xF34C ^ 0x8982;
        BlinkModule.r[0xF330 ^ 0xF3F0] = 0xFFFF0C77 ^ 0xF3F0;
        BlinkModule.r[0xECEA ^ 0xECF7] = 0xFFFF1367 ^ 0xECF7;
        BlinkModule.r[0xC352 ^ 0xC33F] = 0xC368 ^ 0xC33F;
        BlinkModule.r[0x1A6 ^ 0xAA] = 0x931B ^ 0xAA;
        BlinkModule.r[0x6A38 ^ 0x6B11] = 0x5504 ^ 0x6B11;
        BlinkModule.r[0x5789 ^ 0x573F] = 0xFFFFA8B4 ^ 0x573F;
        BlinkModule.r[0x3056 ^ 0x303D] = 0x3037 ^ 0x303D;
        BlinkModule.r[0x7D97 ^ 0x7CF7] = 0x51BF ^ 0x7CF7;
        BlinkModule.r[0x9A2B ^ 0x9BA7] = 0xD6FF ^ 0x9BA7;
        BlinkModule.r[0x1856 ^ 0x18FE] = 0xFFFFE73D ^ 0x18FE;
        BlinkModule.r[0x159D ^ 0x1552] = 0x1520 ^ 0x1552;
        BlinkModule.r[0xACFC ^ 0xAC26] = 0xFFFF53A1 ^ 0xAC26;
        BlinkModule.r[0xC06 ^ 0xD5E] = 0x79E7 ^ 0xD5E;
        BlinkModule.r[0x2F8A ^ 0x2F87] = 0x2FD7 ^ 0x2F87;
        BlinkModule.r[0xF916 ^ 0xF9D2] = 0xF9CE ^ 0xF9D2;
        BlinkModule.r[0x2800 ^ 0x28C2] = 0x28E1 ^ 0x28C2;
        BlinkModule.r[0x2973 ^ 0x2877] = 0x35C7 ^ 0x2877;
        BlinkModule.r[0xE93D ^ 0xE9D1] = 0x2893 ^ 0xE9D1;
        BlinkModule.r[0xDAE5 ^ 0xDA3D] = 0xFFFF25E0 ^ 0xDA3D;
        BlinkModule.r[0x52A5 ^ 0x53DF] = 0x3245 ^ 0x53DF;
        BlinkModule.r[0x51C8 ^ 0x50E3] = 0x1522E ^ 0x50E3;
        BlinkModule.r[0x3165 ^ 0x3193] = 0xBB80 ^ 0x3193;
        BlinkModule.r[0xC9FC ^ 0xC966] = 0xC94E ^ 0xC966;
        BlinkModule.r[0xA833 ^ 0xA87A] = 0xA849 ^ 0xA87A;
        BlinkModule.r[0xD0B8 ^ 0xD0BC] = 0xD091 ^ 0xD0BC;
        BlinkModule.r[0x2FAB ^ 0x2EBD] = 0xA783 ^ 0x2EBD;
        BlinkModule.r[0xD922 ^ 0xD99C] = 0xFFFF267B ^ 0xD99C;
        BlinkModule.r[0x2B3C ^ 0x2B0A] = 0xFFFFD4CF ^ 0x2B0A;
        BlinkModule.r[0x2671 ^ 0x271E] = 0x7ED0 ^ 0x271E;
        BlinkModule.r[0xB907 ^ 0xB939] = 0xFFFF4690 ^ 0xB939;
        BlinkModule.r[0x37A9 ^ 0x372F] = 0x1D38 ^ 0x372F;
        BlinkModule.r[0x10D3F ^ 0x10D66] = 0xFFFEF2C4 ^ 0x10D66;
        BlinkModule.r[0xD6E2 ^ 0xD6B9] = 0xFFFF2902 ^ 0xD6B9;
        BlinkModule.r[0xA873 ^ 0xA95B] = 0x976E ^ 0xA95B;
        BlinkModule.r[0x3BF1 ^ 0x3BA7] = 0xFFFFC41E ^ 0x3BA7;
        BlinkModule.r[0x54FD ^ 0x5586] = 0x3402 ^ 0x5586;
        BlinkModule.r[0x918D ^ 0x9154] = 0xFFFF6EA0 ^ 0x9154;
        BlinkModule.r[0x1076F ^ 0x1061D] = 0x1FD32 ^ 0x1061D;
        BlinkModule.r[0x24DB ^ 0x245C] = 0x52E0 ^ 0x245C;
        BlinkModule.r[0x6554 ^ 0x6435] = 0x4942 ^ 0x6435;
        BlinkModule.r[0x74E4 ^ 0x75F1] = 0xFCA8 ^ 0x75F1;
        BlinkModule.r[0x10656 ^ 0x1073D] = 0x10596 ^ 0x1073D;
        BlinkModule.r[0xA647 ^ 0xA6D0] = 0xFFFF5911 ^ 0xA6D0;
        BlinkModule.r[0x7B71 ^ 0x7B15] = 0x7B79 ^ 0x7B15;
        BlinkModule.r[0xADE ^ 0xA90] = 0xA83 ^ 0xA90;
        BlinkModule.r[0xB7DC ^ 0xB7B0] = 0xFFFF483E ^ 0xB7B0;
        BlinkModule.r[0x2623 ^ 0x26B5] = 0xFFFFD925 ^ 0x26B5;
        BlinkModule.r[0x2635 ^ 0x2771] = 0xFFFFA879 ^ 0x2771;
        BlinkModule.r[0xAB0E ^ 0xAA84] = 0xE7EF ^ 0xAA84;
        BlinkModule.r[0xDCEB ^ 0xDDA6] = 0x5222 ^ 0xDDA6;
        BlinkModule.r[0x9077 ^ 0x911E] = 0x5CC2 ^ 0x911E;
        BlinkModule.r[0x9FBC ^ 0x9ED8] = 0xFFFF7871 ^ 0x9ED8;
        BlinkModule.r[0x8EFF ^ 0x8ECB] = 0xFFFF716C ^ 0x8ECB;
        BlinkModule.r[0xBF22 ^ 0xBE7F] = 0xC496 ^ 0xBE7F;
        BlinkModule.r[0x2B47 ^ 0x2B5C] = 0xFFFFD4AB ^ 0x2B5C;
        BlinkModule.r[0x10E7 ^ 0x1022] = 0x1074 ^ 0x1022;
        BlinkModule.r[0x430F ^ 0x4332] = 0x4324 ^ 0x4332;
        BlinkModule.r[0x629B ^ 0x622F] = 0x6237 ^ 0x622F;
        BlinkModule.r[0xEDE0 ^ 0xECE7] = 0x9EF4 ^ 0xECE7;
        BlinkModule.r[0x4B87 ^ 0x4B54] = 0x4B6C ^ 0x4B54;
        BlinkModule.r[0x47E1 ^ 0x4728] = 0xFFFFB8A2 ^ 0x4728;
        BlinkModule.r[0x7F9B ^ 0x7F7E] = 0x3D59 ^ 0x7F7E;
        BlinkModule.r[0x9F5C ^ 0x9F1B] = 0x9F72 ^ 0x9F1B;
        BlinkModule.r[0xEDA9 ^ 0xECFA] = 0x557B ^ 0xECFA;
        BlinkModule.r[0x258F ^ 0x253E] = 0xFFFFDA9E ^ 0x253E;
        BlinkModule.r[0x31C ^ 0x227] = 0x8B73 ^ 0x227;
        BlinkModule.r[0x5FD6 ^ 0x5F5F] = 0x5141 ^ 0x5F5F;
        BlinkModule.r[0xC1EE ^ 0xC14D] = 0xC181 ^ 0xC14D;
        BlinkModule.r[0x96FB ^ 0x9793] = 0xFFFFA5E6 ^ 0x9793;
        BlinkModule.r[0x3C7E ^ 0x3CCE] = 0x3CD3 ^ 0x3CCE;
        BlinkModule.r[0x5859 ^ 0x5912] = 0xD696 ^ 0x5912;
        BlinkModule.r[0x7A62 ^ 0x7AAE] = 0x7A90 ^ 0x7AAE;
        BlinkModule.r[0x8200 ^ 0x8245] = 0x82A5 ^ 0x8245;
        BlinkModule.r[0xDFD0 ^ 0xDFA6] = 0xDFA6 ^ 0xDFA6;
        BlinkModule.r[0x9441 ^ 0x94ED] = 0xFFFF6B4F ^ 0x94ED;
        BlinkModule.r[0x1931 ^ 0x1900] = 0xFFFFE6DF ^ 0x1900;
        BlinkModule.r[0x4773 ^ 0x47EF] = 0xFFFFB828 ^ 0x47EF;
        BlinkModule.r[0x376C ^ 0x3709] = 0x3704 ^ 0x3709;
        BlinkModule.r[0x75AA ^ 0x7578] = 0x7545 ^ 0x7578;
        BlinkModule.r[0xC2B6 ^ 0xC23D] = 0xC28E ^ 0xC23D;
        BlinkModule.r[0x1BA7 ^ 0x1B25] = 0xDCD4 ^ 0x1B25;
        BlinkModule.r[0x120C ^ 0x1282] = 0x128D ^ 0x1282;
        BlinkModule.r[0xA9F7 ^ 0xA9BF] = 0xA9B7 ^ 0xA9BF;
        BlinkModule.r[0xD44C ^ 0xD54C] = 0x2D1A ^ 0xD54C;
        BlinkModule.r[0x1DDE ^ 0x1CAF] = 0x4561 ^ 0x1CAF;
        BlinkModule.r[0xC60A ^ 0xC65A] = 0xC666 ^ 0xC65A;
        BlinkModule.r[0x634E ^ 0x63D6] = 0xFFFF9C49 ^ 0x63D6;
        BlinkModule.r[0x26E9 ^ 0x2764] = 0x6A1D ^ 0x2764;
        BlinkModule.r[0x4827 ^ 0x4929] = 0xDA98 ^ 0x4929;
        BlinkModule.r[0x9DB ^ 0x8B1] = 0xA18 ^ 0x8B1;
        BlinkModule.r[0x6D63 ^ 0x6D50] = 0xFFFF92FB ^ 0x6D50;
        BlinkModule.r[0x20D5 ^ 0x20D6] = 0xFFFFDF13 ^ 0x20D6;
        BlinkModule.r[0x7583 ^ 0x75CF] = 0xFFFF8A26 ^ 0x75CF;
        BlinkModule.r[0xDDED ^ 0xDC93] = 0x901 ^ 0xDC93;
        BlinkModule.r[0xC8EB ^ 0xC9AB] = 0xFFFFE7E9 ^ 0xC9AB;
        BlinkModule.r[0x9584 ^ 0x95D9] = 0x95BC ^ 0x95D9;
        BlinkModule.r[0xF8E6 ^ 0xF8E7] = 0xF8F0 ^ 0xF8E7;
        BlinkModule.r[0x97BA ^ 0x97A5] = 0xFFFF681D ^ 0x97A5;
        BlinkModule.r[0x42A ^ 0x48E] = 0x4CC ^ 0x48E;
        BlinkModule.r[0xA512 ^ 0xA492] = 0x7148 ^ 0xA492;
        BlinkModule.r[0xBCFF ^ 0xBDBD] = 0xCD29 ^ 0xBDBD;
        BlinkModule.r[0x3988 ^ 0x38A5] = 0x13A68 ^ 0x38A5;
        BlinkModule.r[0x5B3E ^ 0x5B39] = 0xFFFFA4BF ^ 0x5B39;
        BlinkModule.r[0x8378 ^ 0x825F] = 0x825F ^ 0x825F;
        BlinkModule.r[0x5167 ^ 0x51F6] = 0xFFFFAE42 ^ 0x51F6;
        BlinkModule.r[0x13C9 ^ 0x128E] = 0xE399 ^ 0x128E;
        BlinkModule.r[0x6965 ^ 0x6841] = 0xA2D3 ^ 0x6841;
        BlinkModule.r[0x103A ^ 0x116F] = 0xA8EE ^ 0x116F;
        BlinkModule.r[0x664A ^ 0x669C] = 0xFFFF9963 ^ 0x669C;
        BlinkModule.r[0xCAE1 ^ 0xCA16] = 0x576B ^ 0xCA16;
        BlinkModule.r[0x90EB ^ 0x90CA] = 0x9025 ^ 0x90CA;
        BlinkModule.r[0x3138 ^ 0x3178] = 0x3128 ^ 0x3178;
        BlinkModule.r[0x3F21 ^ 0x3F5E] = 0x62BA ^ 0x3F5E;
        BlinkModule.r[0x30FF ^ 0x309E] = 0x30EF ^ 0x309E;
        BlinkModule.r[0x725D ^ 0x72D2] = 0x72D7 ^ 0x72D2;
        BlinkModule.r[0x5FC9 ^ 0x5FF6] = 0xFFFFA04F ^ 0x5FF6;
        BlinkModule.r[0x109FE ^ 0x109A1] = 0x109A5 ^ 0x109A1;
        BlinkModule.r[0xA203 ^ 0xA35A] = 0xD7CA ^ 0xA35A;
        BlinkModule.r[0x1573 ^ 0x147B] = 0x6668 ^ 0x147B;
        BlinkModule.r[0xB0D9 ^ 0xB0F4] = 0x10B0E2 ^ 0xB0F4;
        BlinkModule.r[0xE7F9 ^ 0xE752] = 0xFFFF18C7 ^ 0xE752;
        BlinkModule.r[0x5834 ^ 0x5818] = 0xFFFFA786 ^ 0x5818;
        BlinkModule.r[0xACBB ^ 0xACC7] = 0xADEB ^ 0xACC7;
        BlinkModule.r[0x4C63 ^ 0x4C76] = 0x4C47 ^ 0x4C76;
        BlinkModule.r[0x1248 ^ 0x12BA] = 0x6BDC ^ 0x12BA;
        BlinkModule.r[0x10955 ^ 0x10844] = 0xFFFE8A2B ^ 0x10844;
        BlinkModule.r[0x2D4 ^ 0x27E] = 0x236 ^ 0x27E;
        BlinkModule.r[0xC134 ^ 0xC1A1] = 0xC1A9 ^ 0xC1A1;
        BlinkModule.r[0x731B ^ 0x73A1] = 0xFFFF8C25 ^ 0x73A1;
        BlinkModule.r[0xF4D3 ^ 0xF435] = 0xB602 ^ 0xF435;
        BlinkModule.r[0xAD26 ^ 0xADD7] = 0xD481 ^ 0xADD7;
        BlinkModule.r[0x76D7 ^ 0x775F] = 0xDDBC ^ 0x775F;
        BlinkModule.r[0x3D44 ^ 0x3C32] = 0xF36D ^ 0x3C32;
        BlinkModule.r[0x437E ^ 0x432A] = 0x43BD ^ 0x432A;
        BlinkModule.r[0xF0E1 ^ 0xF04C] = 0xF00E ^ 0xF04C;
        BlinkModule.r[0xB1D1 ^ 0xB0CD] = 0x491E ^ 0xB0CD;
        BlinkModule.r[0x77E ^ 0x73C] = 0x769 ^ 0x73C;
        BlinkModule.r[0x5541 ^ 0x551B] = 0x5546 ^ 0x551B;
        BlinkModule.r[0x7441 ^ 0x74E1] = 0xFFFF8B1B ^ 0x74E1;
        BlinkModule.r[0x38CC ^ 0x39F4] = 0xBA98 ^ 0x39F4;
        BlinkModule.r[0x27AA ^ 0x2748] = 0x2749 ^ 0x2748;
        BlinkModule.r[0xA2C1 ^ 0xA3B2] = 0x5888 ^ 0xA3B2;
        BlinkModule.r[0x6E10 ^ 0x6ECF] = 0x6ECE ^ 0x6ECF;
        BlinkModule.r[0xF6F2 ^ 0xF654] = 0xFFFF09E5 ^ 0xF654;
        BlinkModule.r[0xA0B7 ^ 0xA1FB] = 0xFFFFD1A5 ^ 0xA1FB;
        BlinkModule.r[0xF72E ^ 0xF7D6] = 0x6AA5 ^ 0xF7D6;
        BlinkModule.r[0x66FD ^ 0x67DF] = 0xE6F5 ^ 0x67DF;
        BlinkModule.r[0x7C09 ^ 0x7D6C] = 0x643A ^ 0x7D6C;
        BlinkModule.r[0x2ABD ^ 0x2AC9] = 0x2A9E ^ 0x2AC9;
        BlinkModule.r[0x65F ^ 0x698] = 0xFFFFF963 ^ 0x698;
        BlinkModule.r[0x49F3 ^ 0x4939] = 0x4911 ^ 0x4939;
        BlinkModule.r[0x2624 ^ 0x27A2] = 0x8D36 ^ 0x27A2;
        BlinkModule.r[0x2CBE ^ 0x2DB1] = 0x501D ^ 0x2DB1;
        BlinkModule.r[0xD5D9 ^ 0xD4E8] = 0x3130 ^ 0xD4E8;
        BlinkModule.r[0x2DA6 ^ 0x2C22] = 0xFFFFE474 ^ 0x2C22;
        BlinkModule.r[0x1040 ^ 0x1088] = 0x10F9 ^ 0x1088;
        BlinkModule.r[0xDE9D ^ 0xDEA6] = 0xFFFF2104 ^ 0xDEA6;
        BlinkModule.r[0xADC3 ^ 0xAD9F] = 0xADA5 ^ 0xAD9F;
        BlinkModule.r[0x3612 ^ 0x36AA] = 0xFFFFC957 ^ 0x36AA;
        BlinkModule.r[0xB416 ^ 0xB400] = 0xFFFF4BF6 ^ 0xB400;
        BlinkModule.r[0xF1C4 ^ 0xF17B] = 0xF13B ^ 0xF17B;
        BlinkModule.r[0xEF69 ^ 0xEFE8] = 0x6926 ^ 0xEFE8;
        BlinkModule.r[0xFC57 ^ 0xFD3B] = 0xFFFF0001 ^ 0xFD3B;
        BlinkModule.r[0x2B66 ^ 0x2B71] = 0x2B4B ^ 0x2B71;
        BlinkModule.r[0x7615 ^ 0x7742] = 0x3D2 ^ 0x7742;
        BlinkModule.r[0x26A5 ^ 0x2699] = 0xFFFFD90B ^ 0x2699;
        BlinkModule.r[0xFBFE ^ 0xFA7B] = 0xCDB5 ^ 0xFA7B;
        BlinkModule.r[0xE5A8 ^ 0xE525] = 0xFFFF1A87 ^ 0xE525;
        BlinkModule.r[0x2319 ^ 0x231B] = 0xFFFFDCFC ^ 0x231B;
        BlinkModule.r[0xC4A0 ^ 0xC4A0] = 0xFFFF3B6C ^ 0xC4A0;
        BlinkModule.r[0x10B44 ^ 0x10A3D] = 0x1C571 ^ 0x10A3D;
        BlinkModule.r[0x7080 ^ 0x71C6] = 0x80DA ^ 0x71C6;
        BlinkModule.r[0x2C38 ^ 0x2D02] = 0xA45C ^ 0x2D02;
        BlinkModule.r[0x1299 ^ 0x13C3] = 0x693E ^ 0x13C3;
        BlinkModule.r[0x6E3B ^ 0x6E12] = 0x6E17 ^ 0x6E12;
        BlinkModule.r[0x4614 ^ 0x46FD] = 0x9AF8 ^ 0x46FD;
        BlinkModule.r[0xF73B ^ 0xF780] = 0xF795 ^ 0xF780;
        BlinkModule.r[0x1AB4 ^ 0x1A84] = 0x1ABE ^ 0x1A84;
        BlinkModule.r[0x895C ^ 0x88DD] = 0x5D57 ^ 0x88DD;
        BlinkModule.r[0x1D0B ^ 0x1DBE] = 0xFFFFE2B3 ^ 0x1DBE;
        BlinkModule.r[0x29DE ^ 0x2857] = 0x82D4 ^ 0x2857;
        BlinkModule.r[0xC864 ^ 0xC837] = 0xFFFF378D ^ 0xC837;
        BlinkModule.r[0x974D ^ 0x9715] = 0x9735 ^ 0x9715;
        BlinkModule.r[0x105A7 ^ 0x105B4] = 0x105F0 ^ 0x105B4;
        BlinkModule.r[0xCF0C ^ 0xCF1E] = 0xCFDA ^ 0xCF1E;
        BlinkModule.r[0x38E0 ^ 0x3813] = 0xB202 ^ 0x3813;
        BlinkModule.r[0x6659 ^ 0x66C7] = 0xFFFF997E ^ 0x66C7;
        BlinkModule.r[0xC147 ^ 0xC13F] = 0xC13F ^ 0xC13F;
        BlinkModule.r[0xC26E ^ 0xC327] = 0x3230 ^ 0xC327;
        BlinkModule.r[0x73AA ^ 0x737F] = 0xFFFF8CB9 ^ 0x737F;
        BlinkModule.r[0x260C ^ 0x2616] = 0xFFFFD9DE ^ 0x2616;
        BlinkModule.r[0xDE20 ^ 0xDE3E] = 0xDE60 ^ 0xDE3E;
        BlinkModule.r[0x5359 ^ 0x53B1] = 0x8FD0 ^ 0x53B1;
        BlinkModule.r[0x3B44 ^ 0x3BC1] = 0x6D77 ^ 0x3BC1;
        BlinkModule.r[0x48F5 ^ 0x49F6] = 0x5445 ^ 0x49F6;
        BlinkModule.r[0x7F67 ^ 0x7F1D] = 0x7F1D ^ 0x7F1D;
        BlinkModule.r[0xFBFD ^ 0xFBDA] = 0xFFFF0460 ^ 0xFBDA;
        BlinkModule.r[0x60A ^ 0x6D1] = 0xFFFFF942 ^ 0x6D1;
        BlinkModule.r[0x1B7E ^ 0x1B94] = 0xC7F5 ^ 0x1B94;
        BlinkModule.r[0xC54F ^ 0xC429] = 0x9FD ^ 0xC429;
        BlinkModule.r[0xEFD6 ^ 0xEF32] = 0xEF32 ^ 0xEF32;
        BlinkModule.r[0xABB ^ 0xA2F] = 0xFFFFF5B6 ^ 0xA2F;
        BlinkModule.r[0x69AC ^ 0x690D] = 0x6924 ^ 0x690D;
        BlinkModule.r[0x728 ^ 0x673] = 0x7C9A ^ 0x673;
        BlinkModule.r[0x1947 ^ 0x19AC] = 0xD8E5 ^ 0x19AC;
        BlinkModule.r[0xB314 ^ 0xB22A] = 0x63FD ^ 0xB22A;
        BlinkModule.r[0x2B26 ^ 0x2A1F] = 0xA915 ^ 0x2A1F;
        BlinkModule.r[0xFB3C ^ 0xFB28] = 0xFFFF0488 ^ 0xFB28;
        BlinkModule.r[0x6BD7 ^ 0x6BD2] = 0xFFFF9443 ^ 0x6BD2;
        BlinkModule.r[0xA1B ^ 0xA7B] = 0xFFFFF526 ^ 0xA7B;
        BlinkModule.r[0x1093B ^ 0x1083A] = 0xFFFE0FCB ^ 0x1083A;
        BlinkModule.r[0xE4F3 ^ 0xE48A] = 0xE488 ^ 0xE48A;
        BlinkModule.r[0x1EA8 ^ 0x1E07] = 0xFFFFE1A4 ^ 0x1E07;
        BlinkModule.r[0xF4DF ^ 0xF463] = 0xFFFF0BCE ^ 0xF463;
        BlinkModule.r[0x37BA ^ 0x37DC] = 0x37B0 ^ 0x37DC;
        BlinkModule.r[0xAEE ^ 0xA5D] = 0xFFFFF585 ^ 0xA5D;
        BlinkModule.r[0x107B5 ^ 0x10741] = 0x18D52 ^ 0x10741;
        BlinkModule.r[0x80B9 ^ 0x81B3] = 0xF3A0 ^ 0x81B3;
        BlinkModule.r[0xAAAB ^ 0xABBC] = 0x311A ^ 0xABBC;
        BlinkModule.r[0xD975 ^ 0xD846] = 0x7E3E ^ 0xD846;
        BlinkModule.r[0x10B23 ^ 0x10BE2] = 0x10BC7 ^ 0x10BE2;
        BlinkModule.r[0xBB49 ^ 0xBB55] = 0xBB33 ^ 0xBB55;
        BlinkModule.r[0xF4B6 ^ 0xF58A] = 0xFFFF8346 ^ 0xF58A;
        BlinkModule.r[0x4EFC ^ 0x4FE1] = 0xFFFF49DE ^ 0x4FE1;
        BlinkModule.r[0xB9C0 ^ 0xB9CB] = 0xFFFF4619 ^ 0xB9CB;
    }
}

