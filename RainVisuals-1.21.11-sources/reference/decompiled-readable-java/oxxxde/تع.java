/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.entity.player.ItemCooldownManager
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.Identifier
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotakbaz.rain.mixin.ItemCooldownEntryAccessor;
import kotakbaz.rain.mixin.ItemCooldownManagerAccessor;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2={"Loxxxde/\u062a\u0639;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Lnet/minecraft/class_332;", "context", "Lnet/minecraft/class_1657;", "player", "", "renderHotbarCooldowns", "(Lnet/minecraft/class_332;Lnet/minecraft/class_1657;)V", "", "seconds", "", "getColor", "(F)I", "rain-visuals"})
@RecompileFormat
public final class \u062a\u0639
extends Module {
    @NotNull
    public static final \u062a\u0639 INSTANCE = new \u062a\u0639();

    private final int getColor(float seconds) {
        return seconds <= 3.0f ? -43691 : (seconds <= 10.0f ? -22016 : -1);
    }

    /*
     * WARNING - void declaration
     */
    public final void renderHotbarCooldowns(@NotNull DrawContext context, @NotNull PlayerEntity player) {
        void $this$mapNotNullTo$iv$iv;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(player, "player");
        if (!this.isEnabled()) {
            return;
        }
        ItemCooldownManager itemCooldownManager = player.getItemCooldownManager();
        Intrinsics.checkNotNullExpressionValue(itemCooldownManager, "getCooldowns(...)");
        ItemCooldownManager cooldownManager = itemCooldownManager;
        ItemCooldownManagerAccessor accessor = (ItemCooldownManagerAccessor)cooldownManager;
        int currentTick = accessor.rain$getTick();
        Map<Identifier, Object> map = accessor.rain$getEntries();
        Intrinsics.checkNotNullExpressionValue(map, "rain$getEntries(...)");
        Map<Identifier, Object> $this$mapNotNull$iv = map;
        boolean $i$f$mapNotNull = false;
        Map<Identifier, Object> map2 = $this$mapNotNull$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$mapNotNullTo = false;
        void $this$forEach$iv$iv$iv = $this$mapNotNullTo$iv$iv;
        boolean $i$f$forEach = false;
        Iterator iterator2 = $this$forEach$iv$iv$iv.entrySet().iterator();
        while (iterator2.hasNext()) {
            void var23_34;
            Pair<void, ItemCooldownEntryAccessor> pair;
            Map.Entry element$iv$iv$iv;
            Map.Entry element$iv$iv = element$iv$iv$iv = iterator2.next();
            boolean bl = false;
            Map.Entry entry = element$iv$iv;
            boolean bl2 = false;
            Identifier groupId = (Identifier)entry.getKey();
            Object rawEntry = entry.getValue();
            if ((rawEntry instanceof ItemCooldownEntryAccessor ? (ItemCooldownEntryAccessor)rawEntry : null) == null) {
                pair = null;
            } else {
                void var20_31;
                ItemCooldownEntryAccessor itemCooldownEntryAccessor;
                itemCooldownEntryAccessor = itemCooldownEntryAccessor;
                pair = TuplesKt.to(var20_31, itemCooldownEntryAccessor);
            }
            if (pair == null) continue;
            Pair<void, ItemCooldownEntryAccessor> it$iv$iv = pair;
            boolean bl3 = false;
            destination$iv$iv.add(var23_34);
        }
        Map activeCooldowns = MapsKt.toMap((List)destination$iv$iv);
        int hotbarX = context.getScaledWindowWidth() / 2 - 91;
        int hotbarY = context.getScaledWindowHeight() - 20;
        int slot = 0;
        while (slot < 9) {
            void var9_10;
            ItemStack stack;
            Intrinsics.checkNotNullExpressionValue(player.getInventory().getStack(slot), "getItem(...)");
            if (!stack.isEmpty()) {
                ItemCooldownEntryAccessor entry;
                int remainingTicks;
                if ((ItemCooldownEntryAccessor)activeCooldowns.get(cooldownManager.getGroup(stack)) != null && (remainingTicks = entry.rain$getEndTick() - currentTick) > 0) {
                    void var13_17;
                    void var8_8;
                    void var16_24;
                    TextRenderer $this$getWidth$iv;
                    String string;
                    float seconds = (float)remainingTicks / 20.0f;
                    if (seconds <= 1.0f) {
                        Locale element$iv$iv = Locale.US;
                        String bl = "%.1f";
                        Object[] objectArray = new Object[1];
                        objectArray[0] = Float.valueOf(seconds);
                        String string2 = String.format(element$iv$iv, bl, Arrays.copyOf(objectArray, objectArray.length));
                        string = string2;
                        Intrinsics.checkNotNullExpressionValue(string2, "format(...)");
                    } else {
                        string = String.valueOf((int)seconds);
                    }
                    String value = string;
                    Intrinsics.checkNotNullExpressionValue(\u0636\u0643.getMc().textRenderer, "font");
                    String string3 = value;
                    boolean bl = false;
                    int width = $this$getWidth$iv.getWidth(string3);
                    int textX = hotbarX + slot * 20 + 10 - width / 2;
                    context.drawTextWithShadow(\u0636\u0643.getMc().textRenderer, iterator2, (int)var16_24, (int)(var8_8 + 2), this.getColor((float)var13_17));
                }
            }
            ++var9_10;
        }
    }

    private \u062a\u0639() {
        super("Cooldowns", \u0638\u0646.getPLAYER(), "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u0435 \u043a\u0434 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432 \u0432 \u0445\u043e\u0442\u0431\u0430\u0440\u0435");
    }
}

