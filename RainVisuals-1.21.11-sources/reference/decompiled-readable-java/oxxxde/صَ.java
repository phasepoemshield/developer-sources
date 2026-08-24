/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.item.ItemStack
 *  ru.ocz.protection.annotation.Compile
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.mixin.MinecraftClientAccessor;
import kotakbaz.rain.mixin.MinecraftClientInvoker;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0633\u0638;
import oxxxde.\u0635\u0635;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.annotation.Compile;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2={"Loxxxde/\u0635\u064e;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "Loxxxde/\u0633\u062d;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "", "shouldClickNow", "()Z", "isUsingFood", "Loxxxde/\u0638\u064a;", "button", "Loxxxde/\u0638\u064a;", "Loxxxde/\u0637\u064f;", "delay", "Loxxxde/\u0637\u064f;", "", "BUTTON_LEFT", "I", "BUTTON_RIGHT", "", "lastActionAt", "J", "rain-visuals"})
@RecompileFormat
public final class \u0635\u064e
extends Module {
    @NotNull
    public static final \u0635\u064e INSTANCE = new \u0635\u064e();
    private static long lastActionAt;
    private static final int BUTTON_LEFT = 0;
    @NotNull
    private static final SliderSetting delay;
    @NotNull
    private static final ModeSetting button;
    private static final int BUTTON_RIGHT = 1;

    static {
        String[] stringArray = new String[2];
        stringArray[0] = "\u041b\u0435\u0432\u0430\u044f";
        stringArray[1] = "\u041f\u0440\u0430\u0432\u0430\u044f";
        button = Module.mode$default(INSTANCE, "\u041a\u043d\u043e\u043f\u043a\u0430", CollectionsKt.listOf(stringArray), 0, null, 12, null);
        delay = Module.slider$default(INSTANCE, "\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430", 500.0f, 200.0f, 2000.0f, 10.0f, null, 32, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isUsingFood() {
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return false;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        if (!player.isUsingItem()) {
            return false;
        }
        ItemStack itemStack = player.getActiveItem();
        Intrinsics.checkNotNullExpressionValue(itemStack, "getUseItem(...)");
        ItemStack stack = itemStack;
        if (stack.isEmpty()) return false;
        if (stack.get(DataComponentTypes.FOOD) == null) return false;
        return true;
    }

    private final boolean shouldClickNow() {
        block9: {
            block8: {
                if (!this.isEnabled()) {
                    return false;
                }
                if (\u0633\u0638.INSTANCE.isActiveEating()) {
                    return false;
                }
                if (this.isUsingFood()) {
                    return false;
                }
                if (\u0635\u0635.INSTANCE.getCustomScreen() != null) {
                    return false;
                }
                if (\u0636\u0643.getMc().player == null || \u0636\u0643.getMc().world == null) break block8;
                if (\u0636\u0643.getMc().interactionManager != null) break block9;
            }
            return false;
        }
        if (\u0636\u0643.getMc().currentScreen != null) {
            return false;
        }
        return \u0636\u0643.getMc().mouse.isCursorLocked();
    }

    @Override
    public void onEnable() {
        lastActionAt = 0L;
    }

    private \u0635\u064e() {
        super("TapeMouse", \u0638\u0646.getPLAYER(), "\u0410\u0432\u0442\u043e-\u043a\u043b\u0438\u043a\u0438 \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u043e\u0439 \u043a\u043d\u043e\u043f\u043a\u0438");
    }

    @Commando
    @Compile
    public final void onUpdate(@NotNull PlayerUpdateEvent playerUpdateEvent) {
        Intrinsics.checkNotNullParameter(playerUpdateEvent, "event");
        if (!this.shouldClickNow()) {
            return;
        }
        long l = System.currentTimeMillis();
        if ((float)(l - lastActionAt) < ((Number)delay.getValue()).floatValue()) {
            return;
        }
        MinecraftClient minecraftClient = \u0636\u0643.getMc();
        Intrinsics.checkNotNull(minecraftClient, "null cannot be cast to non-null type kotakbaz.rain.mixin.MinecraftClientInvoker");
        if (button.getSelectedIndex() == 0) {
            ((MinecraftClientInvoker)minecraftClient).rain$doAttack();
            lastActionAt = l;
            return;
        }
        if (((MinecraftClientAccessor)minecraftClient).rain$getItemUseCooldown() == 0 && !minecraftClient.player.isUsingItem()) {
            ((MinecraftClientInvoker)minecraftClient).rain$doItemUse();
            lastActionAt = l;
            return;
        }
    }
}

