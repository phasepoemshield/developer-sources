/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.BlockState
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.shape.VoxelShape
 *  net.minecraft.world.BlockView
 */
package oxxxde;

import java.awt.Color;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import net.minecraft.block.BlockState;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0628\u0639;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ'\u0010$\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020\u00148\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00148\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010/\u001a\u00020 8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b:\u00106R\u0014\u0010;\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b;\u00109R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b?\u00109R\u0018\u0010@\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bD\u0010-R\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bF\u0010G\u00a8\u0006H"}, d2={"Loxxxde/\u0639\u062c;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u0634\u062b;", "event", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "", "shouldReplaceVanillaOutline", "()Z", "Lnet/minecraft/class_638;", "world", "Lnet/minecraft/class_238;", "targetedBlockBox", "(Lnet/minecraft/class_638;)Lnet/minecraft/class_238;", "target", "", "deltaSeconds", "updatePosition", "(Lnet/minecraft/class_238;F)V", "frameDeltaSeconds", "()F", "current", "speed", "approach", "(FFFF)F", "smoothingFactor", "(FF)F", "", "from", "to", "factor", "lerp", "(DDF)D", "resetState", "(Lnet/minecraft/class_638;)V", "", "MODE_OUTLINE", "Ljava/lang/String;", "MODE_DASHED", "FADE_SPEED", "F", "MOVE_SPEED", "BOX_EXPANSION", "D", "Loxxxde/\u0631\u062a;", "overlayColor", "Loxxxde/\u0631\u062a;", "Loxxxde/\u0637\u064f;", "lineWidth", "Loxxxde/\u0637\u064f;", "Loxxxde/\u062e\u0630;", "fill", "Loxxxde/\u062e\u0630;", "fillOpacity", "outline", "Loxxxde/\u0638\u064a;", "outlineMode", "Loxxxde/\u0638\u064a;", "smoothMovement", "trackedWorld", "Lnet/minecraft/class_638;", "currentBox", "Lnet/minecraft/class_238;", "alpha", "", "lastFrameNanos", "J", "rain-visuals"})
public final class \u0639\u062c
extends Module {
    @NotNull
    private static final SliderSetting lineWidth;
    private static final double BOX_EXPANSION = 0.002;
    @NotNull
    public static final \u0639\u062c INSTANCE;
    private static final float MOVE_SPEED = 13.0f;
    @Nullable
    private static Box currentBox;
    @NotNull
    private static final BooleanSetting fill;
    @NotNull
    private static final SliderSetting fillOpacity;
    @NotNull
    private static final ColorSetting overlayColor;
    @NotNull
    private static final String MODE_DASHED = "\u041f\u0443\u043d\u043a\u0442\u0438\u0440";
    private static final float FADE_SPEED = 10.0f;
    @NotNull
    private static final ModeSetting outlineMode;
    @NotNull
    private static final BooleanSetting outline;
    @NotNull
    private static final String MODE_OUTLINE = "\u041e\u0431\u0432\u043e\u0434\u043a\u0430";
    @Nullable
    private static ClientWorld trackedWorld;
    private static float alpha;
    @NotNull
    private static final BooleanSetting smoothMovement;
    private static long lastFrameNanos;

    private final Box targetedBlockBox(ClientWorld world) {
        Box box;
        BlockHitResult hit;
        block8: {
            block7: {
                HitResult hitResult = \u0636\u0643.getMc().crosshairTarget;
                BlockHitResult blockHitResult = hitResult instanceof BlockHitResult ? (BlockHitResult)hitResult : null;
                if (blockHitResult == null) {
                    return null;
                }
                hit = blockHitResult;
                if (hit.getType() != HitResult.Type.BLOCK) break block7;
                if (!hit.isAgainstWorldBorder()) break block8;
            }
            return null;
        }
        BlockPos blockPos = hit.getBlockPos();
        Intrinsics.checkNotNullExpressionValue(blockPos, "getBlockPos(...)");
        BlockPos pos = blockPos;
        BlockState blockState = world.getBlockState(pos);
        Intrinsics.checkNotNullExpressionValue(blockState, "getBlockState(...)");
        BlockState state = blockState;
        if (state.isAir()) {
            return null;
        }
        VoxelShape voxelShape = state.getOutlineShape((BlockView)world, pos);
        Intrinsics.checkNotNullExpressionValue(voxelShape, "getShape(...)");
        VoxelShape shape = voxelShape;
        if (shape.isEmpty()) {
            box = new Box(pos);
        } else {
            Box box2 = shape.getBoundingBox().offset((double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
            Intrinsics.checkNotNull(box2);
            box = box2;
        }
        Box box3 = box;
        return box3.expand(0.002);
    }

    private static final boolean outlineMode$lambda$0() {
        return (Boolean)outline.getValue();
    }

    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            return;
        }
        ClientWorld world = clientWorld;
        if (trackedWorld != world) {
            this.resetState(world);
        }
        float deltaSeconds = this.frameDeltaSeconds();
        Box targetBox = this.targetedBlockBox(world);
        this.updatePosition(targetBox, deltaSeconds);
        float targetAlpha = targetBox != null && (((Boolean)fill.getValue()).booleanValue() || ((Boolean)outline.getValue()).booleanValue()) ? 1.0f : 0.0f;
        alpha = this.approach(alpha, targetAlpha, 10.0f, deltaSeconds);
        Box box = currentBox;
        if (box == null || alpha <= 0.003f) {
            if (targetBox == null) {
                currentBox = null;
            }
            return;
        }
        Color baseColor = (Color)overlayColor.getValue();
        float animationAlpha = RangesKt.coerceIn(alpha, 0.0f, 1.0f);
        int outlineAlpha = RangesKt.coerceIn(MathKt.roundToInt((float)baseColor.getAlpha() * animationAlpha), 0, 255);
        int fillAlpha = RangesKt.coerceIn(MathKt.roundToInt(255.0f * (((Number)fillOpacity.getValue()).floatValue() / 100.0f) * animationAlpha), 0, 255);
        \u0628\u0639.render$default(\u0628\u0639.INSTANCE, event, CollectionsKt.listOf(box), ((Boolean)fill.getValue()).booleanValue() ? new Color(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), fillAlpha) : null, ((Boolean)outline.getValue()).booleanValue() ? new Color(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), outlineAlpha) : null, ((Number)lineWidth.getValue()).floatValue(), Intrinsics.areEqual(outlineMode.getValue(), MODE_DASHED), 0.0f, 64, null);
    }

    static {
        INSTANCE = new \u0639\u062c();
        Module module = INSTANCE;
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        overlayColor = Module.color$default(module, "\u0426\u0432\u0435\u0442", color, null, 4, null);
        lineWidth = Module.slider$default(INSTANCE, "\u0422\u043e\u043b\u0449\u0438\u043d\u0430 \u043e\u0431\u0432\u043e\u0434\u043a\u0438", 1.5f, 1.0f, 5.0f, 0.1f, null, 32, null);
        fill = Module.boolean$default(INSTANCE, "\u0417\u0430\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435 \u0431\u043b\u043e\u043a\u0430", false, null, 4, null);
        fillOpacity = Module.slider$default(INSTANCE, "\u041f\u0440\u043e\u0437\u0440\u0430\u0447\u043d\u043e\u0441\u0442\u044c \u0437\u0430\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f", 25.0f, 10.0f, 70.0f, 1.0f, null, 32, null).setVisible(\u0639\u062c::fillOpacity$lambda$0);
        outline = Module.boolean$default(INSTANCE, "\u041e\u0431\u0432\u043e\u0434\u043a\u0430 \u0431\u043b\u043e\u043a\u0430", true, null, 4, null);
        String[] stringArray = new String[2];
        stringArray[0] = MODE_OUTLINE;
        stringArray[1] = MODE_DASHED;
        outlineMode = Module.mode$default(INSTANCE, "\u0420\u0435\u0436\u0438\u043c \u043e\u0431\u0432\u043e\u0434\u043a\u0438", CollectionsKt.listOf(stringArray), 0, null, 12, null).setVisible(\u0639\u062c::outlineMode$lambda$0);
        smoothMovement = Module.boolean$default(INSTANCE, "\u041f\u043b\u0430\u0432\u043d\u043e\u0435 \u043f\u0435\u0440\u0435\u043c\u0435\u0449\u0435\u043d\u0438\u0435 \u043e\u0432\u0435\u0440\u043b\u0435\u044f", true, null, 4, null);
    }

    private \u0639\u062c() {
        super("BlockOverlay", \u0638\u0646.getRENDER(), "\u041d\u0430\u0441\u0442\u0440\u0430\u0438\u0432\u0430\u0435\u043c\u0430\u044f \u043e\u0431\u0432\u043e\u0434\u043a\u0430 \u043d\u0430 \u0431\u043b\u043e\u043a\u0438");
    }

    private final void resetState(ClientWorld world) {
        trackedWorld = world;
        currentBox = null;
        alpha = 0.0f;
        lastFrameNanos = 0L;
    }

    @Override
    public void onEnable() {
        this.resetState(\u0636\u0643.getMc().world);
    }

    private final float approach(float current, float target, float speed, float deltaSeconds) {
        float factor = this.smoothingFactor(speed, deltaSeconds);
        return current + (target - current) * factor;
    }

    private static final boolean fillOpacity$lambda$0() {
        return (Boolean)fill.getValue();
    }

    public final boolean shouldReplaceVanillaOutline() {
        return this.isEnabled();
    }

    private final void updatePosition(Box target, float deltaSeconds) {
        if (target == null) {
            return;
        }
        Box current = currentBox;
        if (current == null || !((Boolean)smoothMovement.getValue()).booleanValue()) {
            currentBox = target;
            return;
        }
        float factor = this.smoothingFactor(13.0f, deltaSeconds);
        currentBox = new Box(this.lerp(current.minX, target.minX, factor), this.lerp(current.minY, target.minY, factor), this.lerp(current.minZ, target.minZ, factor), this.lerp(current.maxX, target.maxX, factor), this.lerp(current.maxY, target.maxY, factor), this.lerp(current.maxZ, target.maxZ, factor));
    }

    /*
     * WARNING - void declaration
     */
    private final float frameDeltaSeconds() {
        void var3_2;
        long now = System.nanoTime();
        if (lastFrameNanos == 0L) {
            lastFrameNanos = now;
            return 0.016666668f;
        }
        float delta = (float)RangesKt.coerceAtMost((double)RangesKt.coerceAtLeast(now - lastFrameNanos, 0L) / 1.0E9, 0.1);
        lastFrameNanos = now;
        return (float)var3_2;
    }

    @Override
    public void onDisable() {
        this.resetState(null);
    }

    private final double lerp(double from, double to, float factor) {
        return from + (to - from) * (double)factor;
    }

    private final float smoothingFactor(float speed, float deltaSeconds) {
        return RangesKt.coerceIn((float)(1.0 - Math.exp(-speed * deltaSeconds)), 0.0f, 1.0f);
    }
}

