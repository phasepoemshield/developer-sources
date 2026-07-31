/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTexture
 *  net.minecraft.class_10868
 *  net.minecraft.class_11246
 *  net.minecraft.class_1304
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_408
 *  net.minecraft.class_742
 *  net.minecraft.class_746
 *  net.minecraft.class_757
 *  org.joml.Matrix3x2fStack
 *  org.joml.Vector4f
 */
package kotakbaz.rain.module.modules.hud;

import com.mojang.blaze3d.textures.GpuTexture;
import java.awt.Color;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotakbaz.rain.client.draggable.c_0;
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.client.util.render.A;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.E;
import kotakbaz.rain.event.events.C;
import kotakbaz.rain.event.events.D;
import kotakbaz.rain.mixin.GameRendererAccessor;
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.modules.hud.container.e;
import kotakbaz.rain.module.modules.render.target.a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import net.minecraft.class_10868;
import net.minecraft.class_11246;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_408;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_757;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2fStack;
import org.joml.Vector4f;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\f\u0010\u0003J\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u001c\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002\u00a2\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b$\u0010%J7\u0010'\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b'\u0010(J/\u0010.\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b.\u0010/J'\u00101\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020=8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010A\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bA\u0010<R\u0014\u0010B\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bB\u0010<R\u0014\u0010C\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bC\u0010<R\u0014\u0010D\u001a\u00020)8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bF\u0010<R\u0014\u0010G\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bG\u0010<R\u0014\u0010H\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bH\u0010<R\u0014\u0010I\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bI\u0010<R\u0014\u0010J\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bJ\u0010<R\u0014\u0010K\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bK\u0010<R\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bR\u0010QR\u001c\u0010T\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010S8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010V\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bV\u0010W\u00a8\u0006X"}, d2={"Lkotakbaz/rain/module/modules/hud/TargetHudModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "event", "", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lkotakbaz/rain/event/events/OverlayRenderEvent;", "onOverlayRender", "(Lkotakbaz/rain/event/events/OverlayRenderEvent;)V", "onDisable", "Lnet/minecraft/class_1657;", "target", "", "animation", "renderHud", "(Lnet/minecraft/class_1657;F)V", "", "Lnet/minecraft/class_1799;", "equipment", "x", "y", "Ljava/awt/Color;", "emptyColor", "itemSize", "itemGap", "drawEquipment", "(Ljava/util/List;FFLjava/awt/Color;FFF)V", "stack", "drawItemSprite", "(Lnet/minecraft/class_1799;FFFF)V", "Lnet/minecraft/class_332;", "createItemDrawContext", "()Lnet/minecraft/class_332;", "equipmentStacks", "(Lnet/minecraft/class_1657;)Ljava/util/List;", "size", "drawHead", "(Lnet/minecraft/class_1657;FFFF)V", "", "text", "Lkotakbaz/rain/client/util/render/font/Font;", "font", "maxWidth", "ellipsize", "(Ljava/lang/String;Lkotakbaz/rain/client/util/render/font/Font;FF)Ljava/lang/String;", "containerHeight", "centeredTopOffset", "(Lkotakbaz/rain/client/util/render/font/Font;FF)F", "color", "factor", "withAlpha", "(Ljava/awt/Color;F)Ljava/awt/Color;", "player", "", "isUsableTarget", "(Lnet/minecraft/class_1657;)Z", "BASE_WIDTH", "F", "", "SHOW_ANIMATION_MILLIS", "J", "HEALTH_ANIMATION_MILLIS", "BASE_EQUIPMENT_ITEM_SIZE", "BASE_EQUIPMENT_ITEM_GAP", "ITEM_RENDER_SIZE", "EMPTY_ITEM_ICON", "Ljava/lang/String;", "FACE_SCALE", "FACE_SIZE_UV", "FACE_U", "HAT_U", "FACE_START_V", "FACE_HEIGHT_V", "Lkotakbaz/rain/client/draggable/Draggable;", "draggable", "Lkotakbaz/rain/client/draggable/Draggable;", "Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "showAnimation", "Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "healthAnimation", "Ljava/lang/reflect/Constructor;", "isolatedDrawContextConstructor", "Ljava/lang/reflect/Constructor;", "displayTarget", "Lnet/minecraft/class_1657;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nTargetHudModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetHudModule.kt\nkotakbaz/rain/module/modules/hud/TargetHudModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,357:1\n1#2:358\n1924#3,3:359\n*S KotlinDebug\n*F\n+ 1 TargetHudModule.kt\nkotakbaz/rain/module/modules/hud/TargetHudModule\n*L\n248#1:359,3\n*E\n"})
public final class TargetHudModule
extends a_0 {
    @NotNull
    public static final TargetHudModule INSTANCE;
    private static final float BASE_WIDTH = 115.0f;
    private static final long SHOW_ANIMATION_MILLIS = 180L;
    private static final long HEALTH_ANIMATION_MILLIS = 400L;
    private static final float BASE_EQUIPMENT_ITEM_SIZE = 10.0f;
    private static final float BASE_EQUIPMENT_ITEM_GAP = 1.0f;
    private static final float ITEM_RENDER_SIZE = 16.0f;
    @NotNull
    private static final String EMPTY_ITEM_ICON = "i";
    private static final float FACE_SCALE = 0.015625f;
    private static final float FACE_SIZE_UV = 0.125f;
    private static final float FACE_U = 0.125f;
    private static final float HAT_U = 0.625f;
    private static final float FACE_START_V = 0.25f;
    private static final float FACE_HEIGHT_V = -0.125f;
    @NotNull
    private static final c_0 draggable;
    @NotNull
    private static final kotakbaz.rain.client.draggable.animation.A showAnimation;
    @NotNull
    private static final kotakbaz.rain.client.draggable.animation.A healthAnimation;
    @Nullable
    private static final Constructor<class_332> isolatedDrawContextConstructor;
    @Nullable
    private static class_1657 displayTarget;

    private TargetHudModule() {
        super("TargetHUD", kotakbaz.rain.client.extensions.a_0.getHUD(), "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u0438\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044e \u043e \u0446\u0435\u043b\u0438");
    }

    @Commando
    public final void onUpdate(@NotNull D event) {
        Object object;
        Intrinsics.checkNotNullParameter(event, "event");
        a.INSTANCE.update();
        class_1657 class_16572 = a.INSTANCE.currentTarget();
        if (class_16572 != null) {
            class_1657 class_16573;
            class_1657 p0 = class_16573 = class_16572;
            boolean bl = false;
            object = this.isUsableTarget(p0) ? class_16573 : null;
        } else {
            object = null;
        }
        class_1657 liveTarget = object;
        class_746 previewTarget = b_0.getMc().field_1755 instanceof class_408 ? b_0.getMc().field_1724 : null;
        class_1657 class_16574 = liveTarget;
        if (class_16574 == null) {
            class_16574 = (class_1657)previewTarget;
        }
        class_1657 targetForState = class_16574;
        class_1657 previousTarget = displayTarget;
        if (targetForState != null) {
            displayTarget = targetForState;
            float healthProgress = RangesKt.coerceIn(targetForState.method_6032() / RangesKt.coerceAtLeast(targetForState.method_6063(), 1.0f), 0.0f, 1.0f);
            if (!Intrinsics.areEqual(previousTarget, targetForState)) {
                healthAnimation.snap(healthProgress);
            } else {
                healthAnimation.run(healthProgress, 400L, kotakbaz.rain.client.draggable.animation.a_0.b, true);
            }
        }
        showAnimation.run(targetForState != null ? 1.0 : 0.0, 180L, kotakbaz.rain.client.draggable.animation.a_0.b, true);
        if (targetForState == null && showAnimation.get() <= 0.0f) {
            displayTarget = null;
            healthAnimation.snap(0.0);
        }
    }

    @Commando
    public final void onOverlayRender(@NotNull C event) {
        Intrinsics.checkNotNullParameter(event, "event");
        showAnimation.update();
        healthAnimation.update();
        float animation = RangesKt.coerceIn(showAnimation.get(), 0.0f, 1.0f);
        class_1657 target = displayTarget;
        if (animation <= 0.01f || target == null) {
            if (!(b_0.getMc().field_1755 instanceof class_408)) {
                draggable.setWidth(0.0f);
                draggable.setHeight(0.0f);
            }
            return;
        }
        this.renderHud(target, animation);
    }

    @Override
    public void onDisable() {
        displayTarget = null;
        showAnimation.snap(0.0);
        healthAnimation.snap(0.0);
        draggable.setWidth(0.0f);
        draggable.setHeight(0.0f);
    }

    private final void renderHud(class_1657 target, float animation) {
        float textTop;
        float height;
        float x2 = draggable.getX();
        float y2 = draggable.getY();
        List<class_1799> equipment = this.equipmentStacks(target);
        float width2 = e.INSTANCE.scaled(115.0f);
        float gap = e.INSTANCE.margin();
        float headSize = e.INSTANCE.scaled(27.0f);
        float sideWidth = height = headSize + gap * 1.5f;
        float round = height * 0.25f;
        Vector4f roundVector = new Vector4f(round, 0.0f, round, 0.0f);
        float offset = gap * 0.9f;
        float healthBarHeight = e.INSTANCE.scaled(3.0f);
        float healthBarRound = healthBarHeight * 0.2f;
        float startX = x2 + sideWidth + offset;
        float healthBarWidth = width2 - sideWidth - offset * 2.0f;
        float textSize = e.INSTANCE.scaled(7.0f);
        float healthUnitSize = textSize * 0.7f;
        float healthUnitGap = e.INSTANCE.scaled(1.0f);
        float textY = textTop = y2 + offset;
        float healthBarY = textTop + kotakbaz.rain.client.util.render.font.D.INSTANCE.getGS_MEDIUM().getHeight(textSize) + gap * 0.6f;
        float equipmentItemSize = e.INSTANCE.scaled(10.0f);
        float equipmentItemGap = e.INSTANCE.scaled(1.0f);
        float equipmentWidth = (float)equipment.size() * equipmentItemSize + (float)RangesKt.coerceAtLeast(equipment.size() - 1, 0) * equipmentItemGap;
        float equipmentX = startX + RangesKt.coerceAtLeast(healthBarWidth - equipmentWidth, 0.0f) * 0.5f;
        float equipmentY = healthBarY + healthBarHeight + gap * 0.45f;
        Color panelColor = this.withAlpha(e.INSTANCE.getPANEL_COLOR(), animation);
        Color sideColor = this.withAlpha(e.INSTANCE.getHEADER_COLOR(), animation);
        Color textColor = this.withAlpha(e.INSTANCE.getTITLE_COLOR(), animation);
        Color secondaryColor = this.withAlpha(e.INSTANCE.getVALUE_COLOR(), animation);
        Color healthBackColor = kotakbaz.rain.client.util.color.a_0.INSTANCE.setAlpha(e.INSTANCE.getHEADER_COLOR(), 0.35f * animation);
        Color healthColor = this.withAlpha(e.INSTANCE.getTITLE_COLOR(), animation);
        A.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(panelColor).mix(0.9f).round(round).draw(x2, y2, width2, height);
        A.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(sideColor).mix(0.9f).round(roundVector).draw(x2, y2, sideWidth, height);
        this.drawHead(target, x2 + gap / 1.2f, y2 + (height - headSize) / 2.0f, headSize, animation);
        A.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(healthBackColor).mix(0.9f).round(healthBarRound).draw(startX, healthBarY, healthBarWidth, healthBarHeight);
        A.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(healthColor).mix(0.9f).round(healthBarRound).draw(startX, healthBarY, healthBarWidth * RangesKt.coerceIn(healthAnimation.get(), 0.0f, 1.0f), healthBarHeight);
        Locale locale = Locale.US;
        String string = "%.1f";
        Object[] objectArray = new Object[]{Float.valueOf(target.method_6032())};
        String string2 = String.format(locale, string, Arrays.copyOf(objectArray, objectArray.length));
        Intrinsics.checkNotNullExpressionValue(string2, "format(...)");
        String healthText = string2;
        String healthUnitText = "hp";
        float healthWidth = E.getWidth$default(kotakbaz.rain.client.util.render.font.D.INSTANCE.getGS_MEDIUM(), healthText, textSize, 0.0f, 4, null);
        float healthUnitWidth = E.getWidth$default(kotakbaz.rain.client.util.render.font.D.INSTANCE.getGS_REGULAR(), healthUnitText, healthUnitSize, 0.0f, 4, null);
        float totalHealthWidth = healthWidth + healthUnitGap + healthUnitWidth;
        float healthX = startX + healthBarWidth - totalHealthWidth - e.INSTANCE.scaled(1.0f);
        float healthUnitY = textY + (textSize - healthUnitSize);
        float nameWidth = RangesKt.coerceAtLeast(healthBarWidth - totalHealthWidth - gap * 0.5f, 0.0f);
        String string3 = target.method_5477().getString();
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String nameText = this.ellipsize(string3, kotakbaz.rain.client.util.render.font.D.INSTANCE.getGS_MEDIUM(), textSize, nameWidth);
        E.drawText$default(kotakbaz.rain.client.util.render.font.D.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT), nameText, startX, textY, textSize, textColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        E.drawText$default(kotakbaz.rain.client.util.render.font.D.INSTANCE.getGS_REGULAR().priority(ClientRenderPipeline.HUD_TEXT), healthText, healthX + e.INSTANCE.scaled(1.0f), textY, textSize, textColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        E.drawText$default(kotakbaz.rain.client.util.render.font.D.INSTANCE.getGS_REGULAR().priority(ClientRenderPipeline.HUD_TEXT), healthUnitText, healthX + healthWidth + healthUnitGap, healthUnitY, healthUnitSize, secondaryColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        this.drawEquipment(equipment, equipmentX, equipmentY, secondaryColor, animation, equipmentItemSize, equipmentItemGap);
        draggable.setWidth(width2);
        draggable.setHeight(height);
    }

    /*
     * WARNING - void declaration
     */
    private final void drawEquipment(List<class_1799> equipment, float x2, float y2, Color emptyColor, float animation, float itemSize, float itemGap) {
        if (animation <= 0.01f) {
            return;
        }
        float crossSize = itemSize * 0.7f;
        Iterable $this$forEachIndexed$iv = equipment;
        boolean $i$f$forEachIndexed = false;
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            void stack;
            int n;
            if ((n = index$iv++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            class_1799 class_17992 = (class_1799)item$iv;
            int index = n;
            boolean bl = false;
            float slotX = x2 + (float)index * (itemSize + itemGap);
            if (stack.method_7960()) {
                E.drawCenteredText$default(kotakbaz.rain.client.util.render.font.D.INSTANCE.getICON().priority(ClientRenderPipeline.HUD_TEXT), EMPTY_ITEM_ICON, slotX + itemSize * 0.5f, y2 + INSTANCE.centeredTopOffset(kotakbaz.rain.client.util.render.font.D.INSTANCE.getICON(), crossSize, itemSize), crossSize, emptyColor, 0.0f, 32, null);
                continue;
            }
            INSTANCE.drawItemSprite((class_1799)stack, slotX, y2, animation, itemSize);
        }
    }

    private final void drawItemSprite(class_1799 stack, float x2, float y2, float animation, float itemSize) {
        if (animation <= 0.01f) {
            return;
        }
        class_332 context = this.createItemDrawContext();
        float itemScale = itemSize / 16.0f;
        context.method_51448().pushMatrix();
        context.method_51448().translate(x2, y2);
        context.method_51448().scale(itemScale, itemScale);
        context.method_51427(stack, 0, 0);
        context.method_51448().popMatrix();
    }

    private final class_332 createItemDrawContext() {
        Matrix3x2fStack matrices = new Matrix3x2fStack(8);
        class_757 class_7572 = b_0.getMc().field_1773;
        Intrinsics.checkNotNull(class_7572, "null cannot be cast to non-null type kotakbaz.rain.mixin.GameRendererAccessor");
        class_11246 guiState = ((GameRendererAccessor)class_7572).rain$getGuiState();
        Constructor<class_332> constructor = isolatedDrawContextConstructor;
        if (constructor == null) {
            boolean bl = false;
            String string = "Failed to access DrawContext constructor for target HUD items";
            throw new IllegalStateException(string.toString());
        }
        Object[] objectArray = new Object[]{b_0.getMc(), matrices, guiState};
        class_332 class_3322 = constructor.newInstance(objectArray);
        Intrinsics.checkNotNullExpressionValue(class_3322, "newInstance(...)");
        return class_3322;
    }

    private final List<class_1799> equipmentStacks(class_1657 target) {
        class_1799[] class_1799Array = new class_1799[]{target.method_6047(), target.method_6079(), target.method_6118(class_1304.field_6169), target.method_6118(class_1304.field_6174), target.method_6118(class_1304.field_6172), target.method_6118(class_1304.field_6166)};
        return CollectionsKt.listOf(class_1799Array);
    }

    private final void drawHead(class_1657 target, float x2, float y2, float size, float animation) {
        class_742 player;
        class_742 class_7422 = player = target instanceof class_742 ? (class_742)target : null;
        if (player == null) {
            E.drawCenteredText$default(kotakbaz.rain.client.util.render.font.D.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT), "?", x2 + size / 2.0f, y2, size * 0.65f, this.withAlpha(e.INSTANCE.getTITLE_COLOR(), animation), 0.0f, 32, null);
            return;
        }
        class_2960 skin = player.method_52814().comp_1626();
        GpuTexture gpuTexture = b_0.getMc().method_1531().method_4619(skin).method_68004();
        Intrinsics.checkNotNull(gpuTexture, "null cannot be cast to non-null type net.minecraft.client.texture.GlTexture");
        int textureId = ((class_10868)gpuTexture).method_68427();
        float round = size * 0.2f;
        kotakbaz.rain.client.util.render.display.C c2 = A.INSTANCE.getTEXTURE_RECT().priority(ClientRenderPipeline.HUD_SPECIAL).texture(textureId);
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        c2.draw(x2, y2, size, size, color, round, 0.0f, 0.125f, 0.25f, 0.125f, -0.125f, animation);
        kotakbaz.rain.client.util.render.display.C c3 = A.INSTANCE.getTEXTURE_RECT().priority(ClientRenderPipeline.HUD_SPECIAL).texture(textureId);
        Color color2 = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color2, "WHITE");
        c3.draw(x2, y2, size, size, color2, round, 0.0f, 0.625f, 0.25f, 0.125f, -0.125f, animation);
    }

    private final String ellipsize(String text, E font, float size, float maxWidth) {
        if (maxWidth <= 0.0f) {
            return "";
        }
        if (E.getWidth$default(font, text, size, 0.0f, 4, null) <= maxWidth) {
            return text;
        }
        String ellipsis = "...";
        float ellipsisWidth = E.getWidth$default(font, ellipsis, size, 0.0f, 4, null);
        if (ellipsisWidth > maxWidth) {
            return "";
        }
        for (int endIndex = text.length(); endIndex > 0; --endIndex) {
            String string = text.substring(0, endIndex);
            Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
            String candidate = string + ellipsis;
            if (!(E.getWidth$default(font, candidate, size, 0.0f, 4, null) <= maxWidth)) continue;
            return candidate;
        }
        return ellipsis;
    }

    private final float centeredTopOffset(E font, float size, float containerHeight) {
        return (containerHeight - font.getMetrics().getLineHeight() * size) * 0.5f;
    }

    private final Color withAlpha(Color color, float factor) {
        return kotakbaz.rain.client.util.color.a_0.INSTANCE.setAlpha(color, (float)color.getAlpha() / 255.0f * factor);
    }

    private final boolean isUsableTarget(class_1657 player) {
        return !player.method_31481() && player.method_5805() && !player.method_5767();
    }

    static {
        Object object;
        INSTANCE = new TargetHudModule();
        draggable = INSTANCE.draggable(INSTANCE.getName(), 200.0f, 200.0f);
        showAnimation = new kotakbaz.rain.client.draggable.animation.A();
        healthAnimation = new kotakbaz.rain.client.draggable.animation.A();
        TargetHudModule $this$isolatedDrawContextConstructor_u24lambda_u240 = INSTANCE;
        boolean bl = false;
        try {
            object = new Class[]{class_310.class, Matrix3x2fStack.class, class_11246.class};
            Object $this$isolatedDrawContextConstructor_u24lambda_u240_u240 = object = class_332.class.getDeclaredConstructor((Class<?>)object);
            boolean bl2 = false;
            ((Constructor)$this$isolatedDrawContextConstructor_u24lambda_u240_u240).setAccessible(true);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            object = null;
        }
        isolatedDrawContextConstructor = object;
    }
}

