/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gl.RenderPipelines
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.Arm
 *  net.minecraft.util.Identifier
 */
package oxxxde;

import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0636\u0642;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ7\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b!\u0010\"\u00a8\u0006#"}, d2={"Loxxxde/\u062e\u0635;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Lnet/minecraft/class_332;", "context", "", "renderInGameHud", "(Lnet/minecraft/class_332;)V", "Lnet/minecraft/class_1799;", "stack", "", "index", "startX", "hotbarY", "drawArmorSlot", "(Lnet/minecraft/class_332;Lnet/minecraft/class_1799;III)V", "x", "y", "drawDurability", "(Lnet/minecraft/class_332;Lnet/minecraft/class_1799;II)V", "", "percent", "durabilityColor", "(F)I", "drawBackground", "(Lnet/minecraft/class_332;II)V", "Loxxxde/\u062e\u0630;", "showDamage", "Loxxxde/\u062e\u0630;", "Lnet/minecraft/class_2960;", "hotbarTexture", "Lnet/minecraft/class_2960;", "DURABILITY_TEXT_SCALE", "F", "rain-visuals"})
public final class \u062e\u0635
extends Module {
    @NotNull
    private static final BooleanSetting showDamage;
    private static final float DURABILITY_TEXT_SCALE = 0.75f;
    @NotNull
    public static final \u062e\u0635 INSTANCE;
    @NotNull
    private static final Identifier hotbarTexture;

    private final int durabilityColor(float percent) {
        return percent > 0.55f ? -11141291 : (percent > 0.25f ? -171 : -43691);
    }

    static {
        INSTANCE = new \u062e\u0635();
        showDamage = Module.boolean$default(INSTANCE, "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0442\u044c \u043f\u0440\u043e\u0447\u043d\u043e\u0441\u0442\u044c", true, null, 4, null);
        Identifier identifier = Identifier.ofVanilla((String)"textures/gui/sprites/hud/hotbar.png");
        Intrinsics.checkNotNullExpressionValue(identifier, "withDefaultNamespace(...)");
        hotbarTexture = identifier;
    }

    private \u062e\u0635() {
        super("ArmorHUD", \u0638\u0646.getHUD(), "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u0435 \u0441\u043e\u0441\u0442\u043e\u044f\u043d\u0438\u044f \u0431\u0440\u043e\u043d\u0438");
    }

    /*
     * WARNING - void declaration
     */
    private final void drawArmorSlot(DrawContext context, ItemStack stack, int index, int startX, int hotbarY) {
        void var7_7;
        if (stack.isEmpty()) {
            return;
        }
        int x = startX + index * 20 + 3;
        int y = hotbarY + 3;
        if (((Boolean)showDamage.getValue()).booleanValue()) {
            this.drawDurability(context, stack, x, hotbarY - 7);
        }
        context.drawItem(stack, x, y);
        context.drawStackOverlay(\u0636\u0643.getMc().textRenderer, stack, x, (int)var7_7, null);
    }

    private final void drawBackground(DrawContext context, int startX, int y) {
        context.drawTexture(RenderPipelines.GUI_TEXTURED, hotbarTexture, startX, y, 0.0f, 0.0f, 61, 22, 182, 22);
        context.drawTexture(RenderPipelines.GUI_TEXTURED, hotbarTexture, startX + 60, y, 160.0f, 0.0f, 22, 22, 182, 22);
    }

    /*
     * WARNING - void declaration
     */
    public final void renderInGameHud(@NotNull DrawContext context) {
        void var6_6;
        void var8_8;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.isEnabled()) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        int screenWidth = \u0636\u0643.getMc().getWindow().getScaledWidth();
        int screenHeight = \u0636\u0643.getMc().getWindow().getScaledHeight();
        int hotbarX = (screenWidth - 182) / 2;
        int hotbarY = screenHeight - 22;
        int leftHandOffset = player.getMainArm() == Arm.LEFT && !\u0636\u0642.INSTANCE.shouldKeepLeftOffhandSlotInHud() ? 28 : 0;
        int startX = hotbarX + 190 + leftHandOffset;
        this.drawBackground(context, startX, hotbarY);
        ItemStack itemStack = player.getEquippedStack(EquipmentSlot.HEAD);
        Intrinsics.checkNotNullExpressionValue(itemStack, "getItemBySlot(...)");
        this.drawArmorSlot(context, itemStack, 0, startX, hotbarY);
        ItemStack itemStack2 = player.getEquippedStack(EquipmentSlot.CHEST);
        Intrinsics.checkNotNullExpressionValue(itemStack2, "getItemBySlot(...)");
        this.drawArmorSlot(context, itemStack2, 1, startX, hotbarY);
        ItemStack itemStack3 = player.getEquippedStack(EquipmentSlot.LEGS);
        Intrinsics.checkNotNullExpressionValue(itemStack3, "getItemBySlot(...)");
        this.drawArmorSlot(context, itemStack3, 2, startX, hotbarY);
        ItemStack itemStack4 = player.getEquippedStack(EquipmentSlot.FEET);
        Intrinsics.checkNotNullExpressionValue(itemStack4, "getItemBySlot(...)");
        this.drawArmorSlot(context, itemStack4, 3, (int)var8_8, (int)var6_6);
    }

    /*
     * WARNING - void declaration
     */
    private final void drawDurability(DrawContext context, ItemStack stack, int x, int y) {
        void var1_1;
        void var10_10;
        if (!stack.isDamageable()) {
            return;
        }
        int max = RangesKt.coerceAtLeast(stack.getMaxDamage(), 1);
        String value = String.valueOf(RangesKt.coerceAtLeast(max - stack.getDamage(), 0));
        int color = this.durabilityColor((float)(max - stack.getDamage()) / (float)max);
        float f = (float)(x + 8) / 0.75f;
        TextRenderer textRenderer = \u0636\u0643.getMc().textRenderer;
        Intrinsics.checkNotNullExpressionValue(textRenderer, "font");
        TextRenderer $this$getWidth$iv = textRenderer;
        String text$iv = value;
        boolean $i$f$getWidth = false;
        int textX = MathKt.roundToInt(f - (float)$this$getWidth$iv.getWidth((String)var10_10) / 2.0f);
        int textY = MathKt.roundToInt((float)y / 0.75f);
        context.getMatrices().pushMatrix();
        context.getMatrices().scale(0.75f, 0.75f);
        context.drawTextWithShadow(\u0636\u0643.getMc().textRenderer, value, textX, textY, color);
        var1_1.getMatrices().popMatrix();
    }
}

