/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.text.Text
 *  net.minecraft.util.Formatting
 *  org.joml.Matrix3x2fStack
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import kotakbaz.rain.event.events.AttackEvent;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2fStack;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u0003R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000e\u0010#\u00a8\u0006$"}, d2={"Loxxxde/\u0634\u0643;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u0630\u0645;", "event", "", "onAttack", "(Lkotakbaz/rain/event/events/AttackEvent;)V", "Lnet/minecraft/class_332;", "context", "render", "(Lnet/minecraft/class_332;)V", "Lnet/minecraft/class_1657;", "target", "renderIndicator", "(Lnet/minecraft/class_332;Lnet/minecraft/class_1657;)V", "", "health", "Lnet/minecraft/class_124;", "healthFormatting", "(F)Lnet/minecraft/class_124;", "player", "", "isUsableTarget", "(Lnet/minecraft/class_1657;)Z", "", "timeSinceLastAttack", "()J", "onDisable", "", "TEXT_Y_OFFSET", "I", "lastAttackAt", "J", "Lnet/minecraft/class_1657;", "rain-visuals"})
@RecompileFormat
public final class \u0634\u0643
extends Module {
    @Nullable
    private static PlayerEntity target;
    @NotNull
    public static final \u0634\u0643 INSTANCE;
    private static final int TEXT_Y_OFFSET = 7;
    private static long lastAttackAt;

    private final boolean isUsableTarget(PlayerEntity player) {
        return !player.isRemoved() && player.isAlive() && !player.isInvisible();
    }

    private final Formatting healthFormatting(float health) {
        return health <= 5.0f ? Formatting.RED : (health <= 10.0f ? Formatting.GOLD : (health <= 15.0f ? Formatting.YELLOW : (health <= 20.0f ? Formatting.GREEN : Formatting.DARK_GREEN)));
    }

    /*
     * WARNING - void declaration
     */
    @Commando
    public final void onAttack(@NotNull AttackEvent event) {
        PlayerEntity attackedPlayer;
        block5: {
            block4: {
                Intrinsics.checkNotNullParameter(event, "event");
                Entity entity = event.getEntity();
                attackedPlayer = entity instanceof PlayerEntity ? (PlayerEntity)entity : null;
                if (attackedPlayer == null) break block4;
                if (this.isUsableTarget(attackedPlayer)) break block5;
            }
            lastAttackAt = 0L;
            return;
        }
        lastAttackAt = System.currentTimeMillis();
        if (target != attackedPlayer) {
            void var2_3;
            target = var2_3;
        }
    }

    private final long timeSinceLastAttack() {
        return System.currentTimeMillis() - lastAttackAt;
    }

    /*
     * WARNING - void declaration
     */
    private final void renderIndicator(DrawContext context, PlayerEntity target) {
        void var9_11;
        int health = (int)target.getHealth();
        float scale = 1.0f;
        String rendered = "" + this.healthFormatting(health) + health;
        TextRenderer textRenderer = \u0636\u0643.getMc().textRenderer;
        Intrinsics.checkNotNullExpressionValue(textRenderer, "font");
        TextRenderer $this$getWidth$iv = textRenderer;
        String text$iv = rendered;
        boolean $i$f$getWidth = false;
        int textWidth = $this$getWidth$iv.getWidth(text$iv);
        int y = (int)((float)\u0636\u0643.getMc().getWindow().getScaledHeight() / (scale * 2.0f));
        int x = (int)((float)\u0636\u0643.getMc().getWindow().getScaledWidth() / (scale * 2.0f) - (float)textWidth / 2.0f);
        Matrix3x2fStack matrix3x2fStack = context.getMatrices();
        Intrinsics.checkNotNullExpressionValue(matrix3x2fStack, "pose(...)");
        Matrix3x2fStack matrices = matrix3x2fStack;
        matrices.pushMatrix();
        if (scale > 1.0f) {
            matrices.scale(scale, scale);
        }
        context.drawText(\u0636\u0643.getMc().textRenderer, (Text)Text.literal((String)rendered), x, y + 7, -65536, true);
        var9_11.popMatrix();
    }

    private \u0634\u0643() {
        super("CrosshairHP", \u0638\u0646.getPLAYER(), "Displays target HP under the crosshair");
    }

    static {
        INSTANCE = new \u0634\u0643();
    }

    public final void render(@NotNull DrawContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.isEnabled()) {
            return;
        }
        if (this.timeSinceLastAttack() > 10000L) {
            return;
        }
        PlayerEntity playerEntity = target;
        if (playerEntity == null) {
            return;
        }
        PlayerEntity player = playerEntity;
        if (!this.isUsableTarget(player)) {
            return;
        }
        this.renderIndicator(context, player);
    }

    @Override
    public void onDisable() {
        lastAttackAt = 0L;
        target = null;
    }
}

