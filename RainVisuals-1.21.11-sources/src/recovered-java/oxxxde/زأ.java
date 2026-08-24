/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.client.gui.screen.ChatScreen
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.item.ItemRenderState
 *  net.minecraft.client.util.math.MatrixStack$Entry
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.Hand
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package oxxxde;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotakbaz.rain.event.events.HandOffsetEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.ViewModelModule;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.item.ItemRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import oxxxde.\u0636\u062e;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u0646;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0004pqrsB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000b\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u001a\u0010\u001bJ-\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f\u00a2\u0006\u0004\b#\u0010$J-\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f\u00a2\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\"\u00a2\u0006\u0004\b&\u0010'J5\u0010)\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f\u00a2\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b,\u0010\u0003J1\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u0002002\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b3\u00102J\u0017\u00104\u001a\u0002002\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b4\u00102J\u0017\u00105\u001a\u0002002\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b5\u00102J\u0017\u00107\u001a\u0002062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b7\u00108J)\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010\n\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b:\u0010;J/\u0010A\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020>H\u0002\u00a2\u0006\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020>8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u001c8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\u001c8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bG\u0010FR\u0014\u0010H\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\u001c8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bJ\u0010FR\u0014\u0010K\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010N\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bN\u0010LR\u0014\u0010O\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bO\u0010LR\u0014\u0010P\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bP\u0010LR\u0014\u0010Q\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bQ\u0010LR\u0014\u0010R\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bR\u0010LR\u0014\u0010S\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bS\u0010LR\u0018\u0010T\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bV\u0010FR\u0016\u0010W\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bW\u0010FR\u0016\u0010X\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bX\u0010IR\u0016\u0010Y\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bY\u0010IR\u0016\u0010Z\u001a\u00020>8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bZ\u0010DR\u0016\u0010[\u001a\u00020>8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b[\u0010DR\u0014\u0010\\\u001a\u0002068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010^\u001a\u0002068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b^\u0010]R\u0018\u0010_\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b_\u0010UR\u0016\u0010`\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b`\u0010IR\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bd\u0010cR\u0014\u0010e\u001a\u00020a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\be\u0010cR\u0014\u0010f\u001a\u00020a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bf\u0010cR\u0014\u0010g\u001a\u00020a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bg\u0010cR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bn\u0010mR\u0014\u0010o\u001a\u00020k8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bo\u0010m\u00a8\u0006t"}, d2={"Loxxxde/\u0632\u0623;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u0633\u0639;", "event", "", "onHandOffset", "(Lkotakbaz/rain/event/events/HandOffsetEvent;)V", "Lnet/minecraft/class_1268;", "hand", "", "animatedScale", "(Lnet/minecraft/class_1268;)F", "Lnet/minecraft/class_4587$class_4665;", "pose", "captureHandOffsetBase", "(Lnet/minecraft/class_1268;Lnet/minecraft/class_4587$class_4665;)V", "tickProgress", "beginItemBoundsCapture", "(Lnet/minecraft/class_1268;F)V", "Lnet/minecraft/class_10444;", "state", "renderedPose", "captureRenderedBounds", "(Lnet/minecraft/class_10444;Lnet/minecraft/class_4587$class_4665;)V", "endItemBoundsCapture", "(Lnet/minecraft/class_1268;)V", "", "mouseX", "mouseY", "", "screenWidth", "screenHeight", "", "beginChatDrag", "(DDII)Z", "dragChatItem", "endChatDrag", "()Z", "verticalAmount", "scrollChatItem", "(DDDII)Z", "onEnable", "onDisable", "Loxxxde/\u0638\u0645;", "hoveredTarget", "(DDII)Lkotakbaz/rain/module/modules/render/ViewModelModule$HandHitTarget;", "Loxxxde/\u0637\u064f;", "positionX", "(Lnet/minecraft/class_1268;)Lkotakbaz/rain/module/setting/settings/SliderSetting;", "positionY", "positionZ", "scale", "Loxxxde/\u0636\u0622;", "renderedBounds", "(Lnet/minecraft/class_1268;)Lkotakbaz/rain/module/modules/render/ViewModelModule$RenderedHandBounds;", "Loxxxde/\u0631\u0652;", "handHitbox", "(Lnet/minecraft/class_1268;II)Lkotakbaz/rain/module/modules/render/ViewModelModule$HandHitbox;", "current", "target", "", "now", "previousUpdate", "smoothScale", "(FFJJ)F", "RENDERED_BOUNDS_MAX_AGE_NANOS", "J", "HITBOX_PADDING_PIXELS", "D", "MINIMUM_HITBOX_SIZE_PIXELS", "POSITION_PROBE_DISTANCE", "F", "MIN_JACOBIAN_DETERMINANT", "rightX", "Loxxxde/\u0637\u064f;", "rightY", "rightZ", "rightScale", "leftX", "leftY", "leftZ", "leftScale", "draggingHand", "Lnet/minecraft/class_1268;", "dragGrabOffsetX", "dragGrabOffsetY", "renderedRightScale", "renderedLeftScale", "rightScaleUpdatedAt", "leftScaleUpdatedAt", "mainHandBounds", "Loxxxde/\u0636\u0622;", "offHandBounds", "capturedHand", "capturedTickProgress", "Lorg/joml/Matrix4f;", "offsetTransform", "Lorg/joml/Matrix4f;", "renderedTransform", "remainderTransform", "xProbeTransform", "yProbeTransform", "Lorg/joml/Vector3f;", "projectedExtent", "Lorg/joml/Vector3f;", "Loxxxde/\u0636\u062e;", "currentProjection", "Loxxxde/\u0636\u062e;", "xProbeProjection", "yProbeProjection", "HandHitTarget", "RenderedHandBounds", "ProjectedBounds", "HandHitbox", "rain-visuals"})
public final class \u0632\u0623
extends Module {
    private static float renderedRightScale;
    @NotNull
    private static final SliderSetting leftZ;
    @NotNull
    private static final SliderSetting leftScale;
    @Nullable
    private static Hand draggingHand;
    private static long rightScaleUpdatedAt;
    @NotNull
    private static final SliderSetting rightScale;
    @NotNull
    private static final Matrix4f offsetTransform;
    private static final long RENDERED_BOUNDS_MAX_AGE_NANOS = 250000000L;
    private static final double MINIMUM_HITBOX_SIZE_PIXELS = 22.0;
    @NotNull
    private static final Matrix4f xProbeTransform;
    @NotNull
    private static final \u0636\u062e currentProjection;
    @NotNull
    private static final \u0636\u062e xProbeProjection;
    @NotNull
    private static final SliderSetting rightX;
    @NotNull
    private static final ViewModelModule.RenderedHandBounds offHandBounds;
    @NotNull
    private static final Matrix4f renderedTransform;
    @NotNull
    private static final Matrix4f remainderTransform;
    @NotNull
    private static final SliderSetting leftX;
    @Nullable
    private static Hand capturedHand;
    private static final double HITBOX_PADDING_PIXELS = 6.0;
    private static final float POSITION_PROBE_DISTANCE = 0.01f;
    @NotNull
    private static final ViewModelModule.RenderedHandBounds mainHandBounds;
    @NotNull
    private static final SliderSetting leftY;
    private static double dragGrabOffsetX;
    @NotNull
    private static final SliderSetting rightZ;
    private static float capturedTickProgress;
    @NotNull
    private static final Vector3f projectedExtent;
    private static double dragGrabOffsetY;
    @NotNull
    private static final Matrix4f yProbeTransform;
    @NotNull
    private static final SliderSetting rightY;
    private static float renderedLeftScale;
    @NotNull
    public static final \u0632\u0623 INSTANCE;
    @NotNull
    private static final \u0636\u062e yProbeProjection;
    private static long leftScaleUpdatedAt;
    private static final double MIN_JACOBIAN_DETERMINANT = 1.0E-7;

    private final SliderSetting positionZ(Hand hand) {
        return hand == Hand.MAIN_HAND ? rightZ : leftZ;
    }

    public final boolean scrollChatItem(double mouseX, double mouseY, double verticalAmount, int screenWidth, int screenHeight) {
        block5: {
            block4: {
                if (!this.isEnabled()) break block4;
                boolean bl = verticalAmount == 0.0;
                if (!bl) break block5;
            }
            return false;
        }
        ViewModelModule.HandHitTarget handHitTarget = this.hoveredTarget(mouseX, mouseY, screenWidth, screenHeight);
        if (handHitTarget == null || (handHitTarget = handHitTarget.getHand()) == null) {
            return false;
        }
        ViewModelModule.HandHitTarget hand = handHitTarget;
        SliderSetting setting = this.scale((Hand)hand);
        setting.setClamped(((Number)setting.getValue()).floatValue() + (float)Math.signum(verticalAmount) * 0.05f);
        return true;
    }

    @Override
    public void onDisable() {
        this.endChatDrag();
        capturedHand = null;
        mainHandBounds.invalidate();
        offHandBounds.invalidate();
    }

    static {
        INSTANCE = new \u0632\u0623();
        rightX = Module.slider$default(INSTANCE, "\u041f\u0440\u0430\u0432\u044b\u0439 X", 0.0f, -2.0f, 2.0f, 0.001f, null, 32, null);
        rightY = Module.slider$default(INSTANCE, "\u041f\u0440\u0430\u0432\u044b\u0439 Y", 0.0f, -2.0f, 2.0f, 0.001f, null, 32, null);
        rightZ = Module.slider$default(INSTANCE, "\u041f\u0440\u0430\u0432\u044b\u0439 Z", 0.0f, -2.0f, 2.0f, 0.01f, null, 32, null);
        rightScale = INSTANCE.slider("\u0420\u0430\u0437\u043c\u0435\u0440 \u043f\u0440\u0430\u0432\u043e\u0433\u043e \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430", 1.0f, 0.25f, 2.0f, 0.05f, "rightScale");
        leftX = Module.slider$default(INSTANCE, "\u041b\u0435\u0432\u044b\u0439 X", 0.0f, -2.0f, 2.0f, 0.001f, null, 32, null);
        leftY = Module.slider$default(INSTANCE, "\u041b\u0435\u0432\u044b\u0439 Y", 0.0f, -2.0f, 2.0f, 0.001f, null, 32, null);
        leftZ = Module.slider$default(INSTANCE, "\u041b\u0435\u0432\u044b\u0439 Z", 0.0f, -2.0f, 2.0f, 0.01f, null, 32, null);
        leftScale = INSTANCE.slider("\u0420\u0430\u0437\u043c\u0435\u0440 \u043b\u0435\u0432\u043e\u0433\u043e \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430", 1.0f, 0.25f, 2.0f, 0.05f, "leftScale");
        renderedRightScale = 1.0f;
        renderedLeftScale = 1.0f;
        mainHandBounds = new ViewModelModule.RenderedHandBounds();
        offHandBounds = new ViewModelModule.RenderedHandBounds();
        offsetTransform = new Matrix4f();
        renderedTransform = new Matrix4f();
        remainderTransform = new Matrix4f();
        xProbeTransform = new Matrix4f();
        yProbeTransform = new Matrix4f();
        projectedExtent = new Vector3f();
        currentProjection = new \u0636\u062e();
        xProbeProjection = new \u0636\u062e();
        yProbeProjection = new \u0636\u062e();
    }

    @Override
    public void onEnable() {
        renderedRightScale = ((Number)rightScale.getValue()).floatValue();
        renderedLeftScale = ((Number)leftScale.getValue()).floatValue();
        leftScaleUpdatedAt = rightScaleUpdatedAt = System.nanoTime();
        mainHandBounds.invalidate();
        offHandBounds.invalidate();
    }

    @Commando
    public final void onHandOffset(@NotNull HandOffsetEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getHand() == Hand.MAIN_HAND) {
            event.getMatrices().translate(((Number)rightX.getValue()).floatValue(), ((Number)rightY.getValue()).floatValue(), ((Number)rightZ.getValue()).floatValue());
        } else {
            event.getMatrices().translate(((Number)leftX.getValue()).floatValue(), ((Number)leftY.getValue()).floatValue(), ((Number)leftZ.getValue()).floatValue());
        }
    }

    public final void endItemBoundsCapture(@NotNull Hand hand) {
        Intrinsics.checkNotNullParameter(hand, "hand");
        if (capturedHand == hand) {
            capturedHand = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private final float smoothScale(float current, float target, long now, long previousUpdate) {
        void var10_7;
        if (previousUpdate == 0L) {
            return target;
        }
        double deltaSeconds = RangesKt.coerceIn((double)(now - previousUpdate) / 1.0E9, 0.0, 0.05);
        float factor = (float)(1.0 - Math.exp(-deltaSeconds * 18.0));
        float result = current + (target - current) * factor;
        return Math.abs(target - result) < 0.001f ? target : var10_7;
    }

    private static final void captureRenderedBounds$lambda$0(Matrix4f $renderedMatrix, double $halfWidth, double $halfHeight, double $projectionTan, Vector3fc extent) {
        Intrinsics.checkNotNullParameter(extent, "extent");
        projectedExtent.set(extent).mulPosition((Matrix4fc)$renderedMatrix);
        currentProjection.include(projectedExtent, $halfWidth, $halfHeight, $projectionTan);
        projectedExtent.set(extent).mulPosition((Matrix4fc)xProbeTransform);
        xProbeProjection.include(projectedExtent, $halfWidth, $halfHeight, $projectionTan);
        projectedExtent.set(extent).mulPosition((Matrix4fc)yProbeTransform);
        yProbeProjection.include(projectedExtent, $halfWidth, $halfHeight, $projectionTan);
    }

    /*
     * WARNING - void declaration
     */
    public final void captureRenderedBounds(@NotNull ItemRenderState state, @NotNull MatrixStack.Entry renderedPose) {
        void var12_10;
        void var11_9;
        void var29_20;
        void var25_18;
        void var27_19;
        void var23_17;
        double centerY;
        double centerX;
        int height;
        int width;
        ViewModelModule.RenderedHandBounds bounds;
        block15: {
            block14: {
                double projectionTan;
                Hand hand;
                block13: {
                    block12: {
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(renderedPose, "renderedPose");
                        if (!this.isEnabled() || !(\u0636\u0643.getMc().currentScreen instanceof ChatScreen)) {
                            return;
                        }
                        Hand hand2 = capturedHand;
                        if (hand2 == null) {
                            return;
                        }
                        hand = hand2;
                        bounds = this.renderedBounds(hand);
                        if (!bounds.getOffsetBaseReady()) {
                            return;
                        }
                        bounds.setOffsetBaseReady(false);
                        width = \u0636\u0643.getMc().getWindow().getScaledWidth();
                        height = \u0636\u0643.getMc().getWindow().getScaledHeight();
                        if (width <= 0 || height <= 0) {
                            return;
                        }
                        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
                        GameRenderer gameRenderer2 = \u0636\u0643.getMc().gameRenderer;
                        Intrinsics.checkNotNullExpressionValue(gameRenderer2, "gameRenderer");
                        double fov = gameRenderer.getFov(\u0637\u062b.getCamera(gameRenderer2), capturedTickProgress, false);
                        projectionTan = Math.tan(Math.toRadians(fov * 0.5));
                        boolean bl = Math.abs(projectionTan) <= Double.MAX_VALUE;
                        if (!bl) break block12;
                        if (!(projectionTan <= 0.0)) break block13;
                    }
                    return;
                }
                float settingX = ((Number)this.positionX(hand).getValue()).floatValue();
                float settingY = ((Number)this.positionY(hand).getValue()).floatValue();
                float settingZ = ((Number)this.positionZ(hand).getValue()).floatValue();
                Matrix4f renderedMatrix = renderedTransform.set((Matrix4fc)RenderSystem.getModelViewMatrix()).mul((Matrix4fc)renderedPose.getPositionMatrix());
                offsetTransform.set((Matrix4fc)bounds.getOffsetBasePose()).translate(settingX, settingY, settingZ);
                if (Math.abs(offsetTransform.determinant()) < 1.0E-7f) {
                    return;
                }
                remainderTransform.set((Matrix4fc)offsetTransform).invert().mul((Matrix4fc)renderedMatrix);
                xProbeTransform.set((Matrix4fc)bounds.getOffsetBasePose()).translate(settingX + 0.01f, settingY, settingZ).mul((Matrix4fc)remainderTransform);
                yProbeTransform.set((Matrix4fc)bounds.getOffsetBasePose()).translate(settingX, settingY + 0.01f, settingZ).mul((Matrix4fc)remainderTransform);
                currentProjection.reset();
                xProbeProjection.reset();
                yProbeProjection.reset();
                double halfWidth = (double)width * 0.5;
                double halfHeight = (double)height * 0.5;
                state.load(arg_0 -> \u0632\u0623.captureRenderedBounds$lambda$0(renderedMatrix, halfWidth, halfHeight, projectionTan, arg_0));
                if (!(currentProjection.isValid() && xProbeProjection.isValid() && yProbeProjection.isValid())) {
                    return;
                }
                centerX = currentProjection.getCenterX();
                centerY = currentProjection.getCenterY();
                double jacobianXX = (xProbeProjection.getCenterX() - centerX) / (double)0.01f / (double)width;
                double jacobianYX = (xProbeProjection.getCenterY() - centerY) / (double)0.01f / (double)height;
                double jacobianXY = (yProbeProjection.getCenterX() - centerX) / (double)0.01f / (double)width;
                double jacobianYY = (yProbeProjection.getCenterY() - centerY) / (double)0.01f / (double)height;
                boolean bl = Math.abs(jacobianXX) <= Double.MAX_VALUE;
                if (!bl) break block14;
                boolean bl2 = Math.abs(jacobianYX) <= Double.MAX_VALUE;
                if (!bl2) break block14;
                boolean bl3 = Math.abs(jacobianXY) <= Double.MAX_VALUE;
                if (!bl3) break block14;
                if (Math.abs(jacobianYY) <= Double.MAX_VALUE) break block15;
            }
            return;
        }
        bounds.update(currentProjection.getMinX() / (double)width, currentProjection.getMinY() / (double)height, currentProjection.getMaxX() / (double)width, currentProjection.getMaxY() / (double)height, centerX / (double)width, centerY / (double)height, (double)var23_17, (double)var27_19, (double)var25_18, (double)var29_20, (float)var11_9, (float)var12_10);
    }

    private final ViewModelModule.HandHitbox handHitbox(Hand hand, int screenWidth, int screenHeight) {
        ViewModelModule.RenderedHandBounds bounds = this.renderedBounds(hand);
        if (!bounds.isFresh()) {
            return null;
        }
        double rawLeft = bounds.getMinX() * (double)screenWidth;
        double rawTop = bounds.getMinY() * (double)screenHeight;
        double rawRight = bounds.getMaxX() * (double)screenWidth;
        double rawBottom = bounds.getMaxY() * (double)screenHeight;
        double centerX = (rawLeft + rawRight) * 0.5;
        double centerY = (rawTop + rawBottom) * 0.5;
        double halfWidth = Math.max((rawRight - rawLeft) * 0.5 + 6.0, 11.0);
        double halfHeight = Math.max((rawBottom - rawTop) * 0.5 + 6.0, 11.0);
        return new ViewModelModule.HandHitbox(centerX - halfWidth, centerY - halfHeight, centerX + halfWidth, centerY + halfHeight);
    }

    /*
     * WARNING - void declaration
     */
    public final boolean endChatDrag() {
        void var1_1;
        boolean wasDragging = draggingHand != null;
        draggingHand = null;
        dragGrabOffsetX = 0.0;
        dragGrabOffsetY = 0.0;
        return (boolean)var1_1;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean dragChatItem(double mouseX, double mouseY, int screenWidth, int screenHeight) {
        void var29_19;
        double correctionX;
        SliderSetting ySetting;
        SliderSetting xSetting;
        block12: {
            block11: {
                double determinant;
                double errorY;
                double errorX;
                ViewModelModule.RenderedHandBounds bounds;
                block10: {
                    block9: {
                        Hand hand = draggingHand;
                        if (hand == null) {
                            return false;
                        }
                        Hand hand2 = hand;
                        if (!this.isEnabled() || screenWidth <= 0 || screenHeight <= 0) {
                            this.endChatDrag();
                            return false;
                        }
                        bounds = this.renderedBounds(hand2);
                        if (!bounds.isFresh()) {
                            return true;
                        }
                        xSetting = this.positionX(hand2);
                        ySetting = this.positionY(hand2);
                        float pendingX = ((Number)xSetting.getValue()).floatValue() - bounds.getSettingX();
                        float pendingY = ((Number)ySetting.getValue()).floatValue() - bounds.getSettingY();
                        double predictedCenterX = bounds.getCenterX() + bounds.getJacobianXX() * (double)pendingX + bounds.getJacobianXY() * (double)pendingY;
                        double predictedCenterY = bounds.getCenterY() + bounds.getJacobianYX() * (double)pendingX + bounds.getJacobianYY() * (double)pendingY;
                        double desiredCenterX = mouseX / (double)screenWidth - dragGrabOffsetX;
                        double desiredCenterY = mouseY / (double)screenHeight - dragGrabOffsetY;
                        errorX = desiredCenterX - predictedCenterX;
                        errorY = desiredCenterY - predictedCenterY;
                        determinant = bounds.getJacobianXX() * bounds.getJacobianYY() - bounds.getJacobianXY() * bounds.getJacobianYX();
                        boolean bl = Math.abs(determinant) <= Double.MAX_VALUE;
                        if (!bl) break block9;
                        if (!(Math.abs(determinant) < 1.0E-7)) break block10;
                    }
                    return true;
                }
                correctionX = (errorX * bounds.getJacobianYY() - bounds.getJacobianXY() * errorY) / determinant;
                double correctionY = (bounds.getJacobianXX() * errorY - errorX * bounds.getJacobianYX()) / determinant;
                boolean bl = Math.abs(correctionX) <= Double.MAX_VALUE;
                if (!bl) break block11;
                if (Math.abs(correctionY) <= Double.MAX_VALUE) break block12;
            }
            return true;
        }
        xSetting.setClamped(((Number)xSetting.getValue()).floatValue() + (float)correctionX);
        ySetting.setClamped(((Number)ySetting.getValue()).floatValue() + (float)var29_19);
        return true;
    }

    public final void captureHandOffsetBase(@NotNull Hand hand, @NotNull MatrixStack.Entry pose) {
        Intrinsics.checkNotNullParameter(hand, "hand");
        Intrinsics.checkNotNullParameter(pose, "pose");
        if (!this.isEnabled() || !(\u0636\u0643.getMc().currentScreen instanceof ChatScreen)) {
            return;
        }
        ViewModelModule.RenderedHandBounds bounds = this.renderedBounds(hand);
        bounds.getOffsetBasePose().set((Matrix4fc)RenderSystem.getModelViewMatrix()).mul((Matrix4fc)pose.getPositionMatrix());
        bounds.setOffsetBaseReady(true);
    }

    private final ViewModelModule.RenderedHandBounds renderedBounds(Hand hand) {
        return hand == Hand.MAIN_HAND ? mainHandBounds : offHandBounds;
    }

    /*
     * WARNING - void declaration
     */
    private final ViewModelModule.HandHitTarget hoveredTarget(double mouseX, double mouseY, int screenWidth, int screenHeight) {
        Object v2;
        void $this$mapNotNullTo$iv$iv;
        ClientPlayerEntity player;
        block17: {
            block16: {
                ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
                if (clientPlayerEntity == null) {
                    return null;
                }
                player = clientPlayerEntity;
                if (screenWidth <= 0) break block16;
                if (screenHeight > 0) break block17;
            }
            return null;
        }
        Hand[] handArray = new Hand[2];
        handArray[0] = Hand.MAIN_HAND;
        handArray[1] = Hand.OFF_HAND;
        Iterable $this$mapNotNull$iv = CollectionsKt.listOf(handArray);
        boolean $i$f$mapNotNull = false;
        Iterable iterable = $this$mapNotNull$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$mapNotNullTo = false;
        void $this$forEach$iv$iv$iv = $this$mapNotNullTo$iv$iv;
        boolean $i$f$forEach = false;
        Iterator iterator2 = $this$forEach$iv$iv$iv.iterator();
        while (iterator2.hasNext()) {
            void var29_30;
            ViewModelModule.HandHitbox hitbox;
            ViewModelModule.HandHitTarget handHitTarget;
            Object element$iv$iv$iv;
            Object element$iv$iv = element$iv$iv$iv = iterator2.next();
            boolean bl = false;
            Hand hand = (Hand)element$iv$iv;
            boolean bl2 = false;
            ItemStack itemStack = hand == Hand.MAIN_HAND ? player.getMainHandStack() : player.getOffHandStack();
            Intrinsics.checkNotNull(itemStack);
            ItemStack stack = itemStack;
            if (stack.isEmpty()) {
                handHitTarget = null;
            } else if (INSTANCE.handHitbox(hand, screenWidth, screenHeight) == null) {
                handHitTarget = null;
            } else if (!hitbox.contains(mouseX, mouseY)) {
                handHitTarget = null;
            } else {
                void var27_29;
                void var25_28;
                double normalizedDeltaX = (mouseX - hitbox.getCenterX()) / (double)screenWidth;
                double normalizedDeltaY = (mouseY - hitbox.getCenterY()) / (double)screenHeight;
                handHitTarget = new ViewModelModule.HandHitTarget(hand, hitbox, normalizedDeltaX * var25_28 + var27_29 * var27_29);
            }
            if (handHitTarget == null) continue;
            ViewModelModule.HandHitTarget it$iv$iv = handHitTarget;
            boolean bl3 = false;
            destination$iv$iv.add(var29_30);
        }
        Iterable $this$minByOrNull$iv = (List)destination$iv$iv;
        boolean $i$f$minByOrNull = false;
        Iterator iterator$iv = $this$minByOrNull$iv.iterator();
        if (!iterator$iv.hasNext()) {
            v2 = null;
        } else {
            Object minElem$iv = iterator$iv.next();
            if (!iterator$iv.hasNext()) {
                v2 = minElem$iv;
            } else {
                void var11_9;
                ViewModelModule.HandHitTarget minValue$iv22 = (ViewModelModule.HandHitTarget)minElem$iv;
                boolean e$iv2 = false;
                double minValue$iv22 = minValue$iv22.getDistanceSquared();
                do {
                    void var14_15;
                    void var15_18;
                    Object e$iv2 = iterator$iv.next();
                    ViewModelModule.HandHitTarget v$iv22 = (ViewModelModule.HandHitTarget)e$iv2;
                    boolean bl = false;
                    double v$iv22 = v$iv22.getDistanceSquared();
                    if (Double.compare(minValue$iv22, (double)var15_18) <= 0) continue;
                    var11_9 = var14_15;
                    void var12_12 = var15_18;
                } while (iterable.hasNext());
                v2 = var11_9;
            }
        }
        return v2;
    }

    private final SliderSetting positionY(Hand hand) {
        return hand == Hand.MAIN_HAND ? rightY : leftY;
    }

    public final boolean beginChatDrag(double mouseX, double mouseY, int screenWidth, int screenHeight) {
        block5: {
            block4: {
                draggingHand = null;
                if (!this.isEnabled() || screenWidth <= 0) break block4;
                if (screenHeight > 0) break block5;
            }
            return false;
        }
        ViewModelModule.HandHitTarget handHitTarget = this.hoveredTarget(mouseX, mouseY, screenWidth, screenHeight);
        if (handHitTarget == null) {
            return false;
        }
        ViewModelModule.HandHitTarget target = handHitTarget;
        draggingHand = target.getHand();
        dragGrabOffsetX = mouseX / (double)screenWidth - target.getHitbox().getCenterX() / (double)screenWidth;
        dragGrabOffsetY = mouseY / (double)screenHeight - target.getHitbox().getCenterY() / (double)screenHeight;
        return true;
    }

    private final SliderSetting scale(Hand hand) {
        return hand == Hand.MAIN_HAND ? rightScale : leftScale;
    }

    private \u0632\u0623() {
        super("ViewModel", \u0638\u0646.getRENDER(), "\u041d\u0430\u0441\u0442\u0440\u0430\u0438\u0432\u0430\u0435\u0442 \u0440\u0430\u0437\u043c\u0435\u0440 \u0438 \u043f\u043e\u043b\u043e\u0436\u0435\u043d\u0438\u0435 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432 \u0432 \u0440\u0443\u043a\u0430\u0445");
    }

    public final void beginItemBoundsCapture(@NotNull Hand hand, float tickProgress) {
        Intrinsics.checkNotNullParameter(hand, "hand");
        capturedHand = hand;
        capturedTickProgress = tickProgress;
    }

    public final float animatedScale(@NotNull Hand hand) {
        float f;
        Intrinsics.checkNotNullParameter(hand, "hand");
        if (!this.isEnabled()) {
            return 1.0f;
        }
        long now = System.nanoTime();
        if (hand == Hand.MAIN_HAND) {
            float result;
            renderedRightScale = result = this.smoothScale(renderedRightScale, ((Number)rightScale.getValue()).floatValue(), now, rightScaleUpdatedAt);
            rightScaleUpdatedAt = now;
            f = result;
        } else {
            float result;
            renderedLeftScale = result = this.smoothScale(renderedLeftScale, ((Number)leftScale.getValue()).floatValue(), now, leftScaleUpdatedAt);
            leftScaleUpdatedAt = now;
            f = result;
        }
        return f;
    }

    private final SliderSetting positionX(Hand hand) {
        return hand == Hand.MAIN_HAND ? rightX : leftX;
    }
}

