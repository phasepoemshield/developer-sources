/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.hud;

import com.mojang.blaze3d.textures.GpuTexture;
import java.awt.Color;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotakbaz.rain.client.draggable.animation.AnimationUtil;
import kotakbaz.rain.client.draggable.animation.Easing;
import kotakbaz.rain.client.draggable.c;
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.client.util.color.ColorUtil;
import kotakbaz.rain.client.util.render.RenderUtils;
import kotakbaz.rain.client.util.render.display.TextureRectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.E;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.event.events.OverlayRenderEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.mixin.GameRendererAccessor;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.hud.container.HudStyle;
import kotakbaz.rain.module.modules.render.target.TargetTracker;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.render.state.GuiRenderState;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2fStack;
import org.joml.Vector4f;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\f\u0010\u0003J\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u001c\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002\u00a2\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b$\u0010%J7\u0010'\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b'\u0010(J/\u0010.\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b.\u0010/J'\u00101\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020=8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010A\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bA\u0010<R\u0014\u0010B\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bB\u0010<R\u0014\u0010C\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bC\u0010<R\u0014\u0010D\u001a\u00020)8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bF\u0010<R\u0014\u0010G\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bG\u0010<R\u0014\u0010H\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bH\u0010<R\u0014\u0010I\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bI\u0010<R\u0014\u0010J\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bJ\u0010<R\u0014\u0010K\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bK\u0010<R\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bR\u0010QR\u001c\u0010T\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010S8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010V\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bV\u0010W\u00a8\u0006X"}, d2={"Lkotakbaz/rain/module/modules/hud/TargetHudModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "event", "", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lkotakbaz/rain/event/events/OverlayRenderEvent;", "onOverlayRender", "(Lkotakbaz/rain/event/events/OverlayRenderEvent;)V", "onDisable", "Lnet/minecraft/class_1657;", "target", "", "animation", "renderHud", "(Lnet/minecraft/class_1657;F)V", "", "Lnet/minecraft/class_1799;", "equipment", "x", "y", "Ljava/awt/Color;", "emptyColor", "itemSize", "itemGap", "drawEquipment", "(Ljava/util/List;FFLjava/awt/Color;FFF)V", "stack", "drawItemSprite", "(Lnet/minecraft/class_1799;FFFF)V", "Lnet/minecraft/class_332;", "createItemDrawContext", "()Lnet/minecraft/class_332;", "equipmentStacks", "(Lnet/minecraft/class_1657;)Ljava/util/List;", "size", "drawHead", "(Lnet/minecraft/class_1657;FFFF)V", "", "text", "Lkotakbaz/rain/client/util/render/font/Font;", "font", "maxWidth", "ellipsize", "(Ljava/lang/String;Lkotakbaz/rain/client/util/render/font/Font;FF)Ljava/lang/String;", "containerHeight", "centeredTopOffset", "(Lkotakbaz/rain/client/util/render/font/Font;FF)F", "color", "factor", "withAlpha", "(Ljava/awt/Color;F)Ljava/awt/Color;", "player", "", "isUsableTarget", "(Lnet/minecraft/class_1657;)Z", "BASE_WIDTH", "F", "", "SHOW_ANIMATION_MILLIS", "J", "HEALTH_ANIMATION_MILLIS", "BASE_EQUIPMENT_ITEM_SIZE", "BASE_EQUIPMENT_ITEM_GAP", "ITEM_RENDER_SIZE", "EMPTY_ITEM_ICON", "Ljava/lang/String;", "FACE_SCALE", "FACE_SIZE_UV", "FACE_U", "HAT_U", "FACE_START_V", "FACE_HEIGHT_V", "Lkotakbaz/rain/client/draggable/Draggable;", "draggable", "Lkotakbaz/rain/client/draggable/Draggable;", "Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "showAnimation", "Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "healthAnimation", "Ljava/lang/reflect/Constructor;", "isolatedDrawContextConstructor", "Ljava/lang/reflect/Constructor;", "displayTarget", "Lnet/minecraft/class_1657;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nTargetHudModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetHudModule.kt\nkotakbaz/rain/module/modules/hud/TargetHudModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,357:1\n1#2:358\n1924#3,3:359\n*S KotlinDebug\n*F\n+ 1 TargetHudModule.kt\nkotakbaz/rain/module/modules/hud/TargetHudModule\n*L\n248#1:359,3\n*E\n"})
public final class TargetHudModule
extends Module {
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
    private static final c draggable;
    @NotNull
    private static final AnimationUtil showAnimation;
    @NotNull
    private static final AnimationUtil healthAnimation;
    @Nullable
    private static final Constructor<DrawContext> isolatedDrawContextConstructor;
    @Nullable
    private static PlayerEntity displayTarget;

    private TargetHudModule() {
        super("TargetHUD", a_0.getHUD(), "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u0438\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044e \u043e \u0446\u0435\u043b\u0438");
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        Object object;
        Intrinsics.checkNotNullParameter(event, "event");
        TargetTracker.INSTANCE.update();
        PlayerEntity playerEntity = TargetTracker.INSTANCE.currentTarget();
        if (playerEntity != null) {
            PlayerEntity playerEntity2;
            PlayerEntity p0 = playerEntity2 = playerEntity;
            boolean bl = false;
            object = this.isUsableTarget(p0) ? playerEntity2 : null;
        } else {
            object = null;
        }
        PlayerEntity liveTarget = object;
        ClientPlayerEntity previewTarget = b.getMc().currentScreen instanceof ChatScreen ? b.getMc().player : null;
        PlayerEntity playerEntity3 = liveTarget;
        if (playerEntity3 == null) {
            playerEntity3 = (PlayerEntity)previewTarget;
        }
        PlayerEntity targetForState = playerEntity3;
        PlayerEntity previousTarget = displayTarget;
        if (targetForState != null) {
            displayTarget = targetForState;
            float healthProgress = RangesKt.coerceIn(targetForState.getHealth() / RangesKt.coerceAtLeast(targetForState.getMaxHealth(), 1.0f), 0.0f, 1.0f);
            if (!Intrinsics.areEqual(previousTarget, targetForState)) {
                healthAnimation.snap(healthProgress);
            } else {
                healthAnimation.run(healthProgress, 400L, Easing.b, true);
            }
        }
        showAnimation.run(targetForState != null ? 1.0 : 0.0, 180L, Easing.b, true);
        if (targetForState == null && showAnimation.get() <= 0.0f) {
            displayTarget = null;
            healthAnimation.snap(0.0);
        }
    }

    @Commando
    public final void onOverlayRender(@NotNull OverlayRenderEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        showAnimation.update();
        healthAnimation.update();
        float animation = RangesKt.coerceIn(showAnimation.get(), 0.0f, 1.0f);
        PlayerEntity target = displayTarget;
        if (animation <= 0.01f || target == null) {
            if (!(b.getMc().currentScreen instanceof ChatScreen)) {
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

    private final void renderHud(PlayerEntity target, float animation) {
        float textTop;
        float height;
        float x2 = draggable.getX();
        float y = draggable.getY();
        List<ItemStack> equipment = this.equipmentStacks(target);
        float width2 = HudStyle.INSTANCE.scaled(115.0f);
        float gap = HudStyle.INSTANCE.margin();
        float headSize = HudStyle.INSTANCE.scaled(27.0f);
        float sideWidth = height = headSize + gap * 1.5f;
        float round = height * 0.25f;
        Vector4f roundVector = new Vector4f(round, 0.0f, round, 0.0f);
        float offset = gap * 0.9f;
        float healthBarHeight = HudStyle.INSTANCE.scaled(3.0f);
        float healthBarRound = healthBarHeight * 0.2f;
        float startX = x2 + sideWidth + offset;
        float healthBarWidth = width2 - sideWidth - offset * 2.0f;
        float textSize = HudStyle.INSTANCE.scaled(7.0f);
        float healthUnitSize = textSize * 0.7f;
        float healthUnitGap = HudStyle.INSTANCE.scaled(1.0f);
        float textY = textTop = y + offset;
        float healthBarY = textTop + Font.INSTANCE.getGS_MEDIUM().getHeight(textSize) + gap * 0.6f;
        float equipmentItemSize = HudStyle.INSTANCE.scaled(10.0f);
        float equipmentItemGap = HudStyle.INSTANCE.scaled(1.0f);
        float equipmentWidth = (float)equipment.size() * equipmentItemSize + (float)RangesKt.coerceAtLeast(equipment.size() - 1, 0) * equipmentItemGap;
        float equipmentX = startX + RangesKt.coerceAtLeast(healthBarWidth - equipmentWidth, 0.0f) * 0.5f;
        float equipmentY = healthBarY + healthBarHeight + gap * 0.45f;
        Color panelColor = this.withAlpha(HudStyle.INSTANCE.getPANEL_COLOR(), animation);
        Color sideColor = this.withAlpha(HudStyle.INSTANCE.getHEADER_COLOR(), animation);
        Color textColor = this.withAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), animation);
        Color secondaryColor = this.withAlpha(HudStyle.INSTANCE.getVALUE_COLOR(), animation);
        Color healthBackColor = ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getHEADER_COLOR(), 0.35f * animation);
        Color healthColor = this.withAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), animation);
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(panelColor).mix(0.9f).round(round).draw(x2, y, width2, height);
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(sideColor).mix(0.9f).round(roundVector).draw(x2, y, sideWidth, height);
        this.drawHead(target, x2 + gap / 1.2f, y + (height - headSize) / 2.0f, headSize, animation);
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(healthBackColor).mix(0.9f).round(healthBarRound).draw(startX, healthBarY, healthBarWidth, healthBarHeight);
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(healthColor).mix(0.9f).round(healthBarRound).draw(startX, healthBarY, healthBarWidth * RangesKt.coerceIn(healthAnimation.get(), 0.0f, 1.0f), healthBarHeight);
        Locale locale = Locale.US;
        String string = "%.1f";
        Object[] objectArray = new Object[]{Float.valueOf(target.getHealth())};
        String string2 = String.format(locale, string, Arrays.copyOf(objectArray, objectArray.length));
        Intrinsics.checkNotNullExpressionValue(string2, "format(...)");
        String healthText = string2;
        String healthUnitText = "hp";
        float healthWidth = E.getWidth$default(Font.INSTANCE.getGS_MEDIUM(), healthText, textSize, 0.0f, 4, null);
        float healthUnitWidth = E.getWidth$default(Font.INSTANCE.getGS_REGULAR(), healthUnitText, healthUnitSize, 0.0f, 4, null);
        float totalHealthWidth = healthWidth + healthUnitGap + healthUnitWidth;
        float healthX = startX + healthBarWidth - totalHealthWidth - HudStyle.INSTANCE.scaled(1.0f);
        float healthUnitY = textY + (textSize - healthUnitSize);
        float nameWidth = RangesKt.coerceAtLeast(healthBarWidth - totalHealthWidth - gap * 0.5f, 0.0f);
        String string3 = target.getName().getString();
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String nameText = this.ellipsize(string3, Font.INSTANCE.getGS_MEDIUM(), textSize, nameWidth);
        E.drawText$default(Font.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT), nameText, startX, textY, textSize, textColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        E.drawText$default(Font.INSTANCE.getGS_REGULAR().priority(ClientRenderPipeline.HUD_TEXT), healthText, healthX + HudStyle.INSTANCE.scaled(1.0f), textY, textSize, textColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        E.drawText$default(Font.INSTANCE.getGS_REGULAR().priority(ClientRenderPipeline.HUD_TEXT), healthUnitText, healthX + healthWidth + healthUnitGap, healthUnitY, healthUnitSize, secondaryColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        this.drawEquipment(equipment, equipmentX, equipmentY, secondaryColor, animation, equipmentItemSize, equipmentItemGap);
        draggable.setWidth(width2);
        draggable.setHeight(height);
    }

    /*
     * WARNING - void declaration
     */
    private final void drawEquipment(List<ItemStack> equipment, float x2, float y, Color emptyColor, float animation, float itemSize, float itemGap) {
        if (animation <= 0.01f) {
            return;
        }
        float crossSize = itemSize * 0.7f;
        Iterable $this$forEachIndexed$iv = equipment;
        boolean $i$f$forEachIndexed = false;
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            void stack;
            int n2;
            if ((n2 = index$iv++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ItemStack itemStack = (ItemStack)item$iv;
            int index = n2;
            boolean bl = false;
            float slotX = x2 + (float)index * (itemSize + itemGap);
            if (stack.isEmpty()) {
                E.drawCenteredText$default(Font.INSTANCE.getICON().priority(ClientRenderPipeline.HUD_TEXT), EMPTY_ITEM_ICON, slotX + itemSize * 0.5f, y + INSTANCE.centeredTopOffset(Font.INSTANCE.getICON(), crossSize, itemSize), crossSize, emptyColor, 0.0f, 32, null);
                continue;
            }
            INSTANCE.drawItemSprite((ItemStack)stack, slotX, y, animation, itemSize);
        }
    }

    private final void drawItemSprite(ItemStack stack, float x2, float y, float animation, float itemSize) {
        if (animation <= 0.01f) {
            return;
        }
        DrawContext context = this.createItemDrawContext();
        float itemScale = itemSize / 16.0f;
        context.getMatrices().pushMatrix();
        context.getMatrices().translate(x2, y);
        context.getMatrices().scale(itemScale, itemScale);
        context.drawItem(stack, 0, 0);
        context.getMatrices().popMatrix();
    }

    private final DrawContext createItemDrawContext() {
        Matrix3x2fStack matrices = new Matrix3x2fStack(8);
        GameRenderer gameRenderer = b.getMc().gameRenderer;
        Intrinsics.checkNotNull(gameRenderer, "null cannot be cast to non-null type kotakbaz.rain.mixin.GameRendererAccessor");
        GuiRenderState guiState = ((GameRendererAccessor)gameRenderer).rain$getGuiState();
        Constructor<DrawContext> constructor = isolatedDrawContextConstructor;
        if (constructor == null) {
            boolean bl = false;
            String string = "Failed to access DrawContext constructor for target HUD items";
            throw new IllegalStateException(string.toString());
        }
        Object[] objectArray = new Object[]{b.getMc(), matrices, guiState};
        DrawContext drawContext = constructor.newInstance(objectArray);
        Intrinsics.checkNotNullExpressionValue(drawContext, "newInstance(...)");
        return drawContext;
    }

    private final List<ItemStack> equipmentStacks(PlayerEntity target) {
        ItemStack[] itemStackArray = new ItemStack[]{target.getMainHandStack(), target.getOffHandStack(), target.getEquippedStack(EquipmentSlot.HEAD), target.getEquippedStack(EquipmentSlot.CHEST), target.getEquippedStack(EquipmentSlot.LEGS), target.getEquippedStack(EquipmentSlot.FEET)};
        return CollectionsKt.listOf(itemStackArray);
    }

    private final void drawHead(PlayerEntity target, float x2, float y, float size, float animation) {
        AbstractClientPlayerEntity player;
        AbstractClientPlayerEntity abstractClientPlayerEntity = player = target instanceof AbstractClientPlayerEntity ? (AbstractClientPlayerEntity)target : null;
        if (player == null) {
            E.drawCenteredText$default(Font.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT), "?", x2 + size / 2.0f, y, size * 0.65f, this.withAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), animation), 0.0f, 32, null);
            return;
        }
        Identifier skin = player.getSkinTextures().texture();
        GpuTexture gpuTexture = b.getMc().getTextureManager().getTexture(skin).getGlTexture();
        Intrinsics.checkNotNull(gpuTexture, "null cannot be cast to non-null type net.minecraft.client.texture.GlTexture");
        int textureId = ((GlTexture)gpuTexture).getGlId();
        float round = size * 0.2f;
        TextureRectRenderer textureRectRenderer = RenderUtils.INSTANCE.getTEXTURE_RECT().priority(ClientRenderPipeline.HUD_SPECIAL).texture(textureId);
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        textureRectRenderer.draw(x2, y, size, size, color, round, 0.0f, 0.125f, 0.25f, 0.125f, -0.125f, animation);
        TextureRectRenderer textureRectRenderer2 = RenderUtils.INSTANCE.getTEXTURE_RECT().priority(ClientRenderPipeline.HUD_SPECIAL).texture(textureId);
        Color color2 = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color2, "WHITE");
        textureRectRenderer2.draw(x2, y, size, size, color2, round, 0.0f, 0.625f, 0.25f, 0.125f, -0.125f, animation);
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
        return ColorUtil.INSTANCE.setAlpha(color, (float)color.getAlpha() / 255.0f * factor);
    }

    private final boolean isUsableTarget(PlayerEntity player) {
        return !player.isRemoved() && player.isAlive() && !player.isInvisible();
    }

    static {
        Object object;
        INSTANCE = new TargetHudModule();
        draggable = INSTANCE.draggable(INSTANCE.getName(), 200.0f, 200.0f);
        showAnimation = new AnimationUtil();
        healthAnimation = new AnimationUtil();
        TargetHudModule $this$isolatedDrawContextConstructor_u24lambda_u240 = INSTANCE;
        boolean bl = false;
        try {
            object = new Class[]{MinecraftClient.class, Matrix3x2fStack.class, GuiRenderState.class};
            Object $this$isolatedDrawContextConstructor_u24lambda_u240_u240 = object = DrawContext.class.getDeclaredConstructor((Class<?>)object);
            boolean bl2 = false;
            ((Constructor)$this$isolatedDrawContextConstructor_u24lambda_u240_u240).setAccessible(true);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            object = null;
        }
        isolatedDrawContextConstructor = object;
    }
}

