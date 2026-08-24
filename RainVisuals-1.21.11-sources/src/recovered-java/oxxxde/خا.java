/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.entity.player.ItemCooldownManager
 *  net.minecraft.entity.player.PlayerInventory
 *  net.minecraft.item.ItemStack
 *  net.minecraft.registry.Registries
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.registry.entry.RegistryEntry$Reference
 *  net.minecraft.util.Identifier
 */
package oxxxde;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotakbaz.rain.event.events.OverlayRenderEvent;
import kotakbaz.rain.mixin.ItemCooldownEntryAccessor;
import kotakbaz.rain.mixin.ItemCooldownManagerAccessor;
import kotakbaz.rain.module.modules.hud.container.Data;
import kotakbaz.rain.ui.mainmenu.RainMainMenuScreen$Btn;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0633\u064e;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0637\u063a;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u00013B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0014\u00a2\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00102\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u000e\u0012\u0002\b\u00030\tH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0003J)\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0002\u00a2\u0006\u0004\b\"\u0010#R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b%\u0010&R$\u0010*\u001a\u0012\u0012\u0004\u0012\u00020(0'j\b\u0012\u0004\u0012\u00020(`)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b2\u0010/\u00a8\u00064"}, d2={"Loxxxde/\u062e\u0627;", "Loxxxde/\u0632\u0643;", "<init>", "()V", "Loxxxde/\u062b\u0622;", "event", "", "onOverlayRender", "(Lkotakbaz/rain/event/events/OverlayRenderEvent;)V", "", "Loxxxde/\u0635\u0647;", "Loxxxde/\u062a\u0650;", "getCurrentData", "()Ljava/util/Map;", "Lnet/minecraft/class_2960;", "cooldowns", "", "cooldownSignature", "(Ljava/util/Map;)J", "sortCooldownBuffer", "Lnet/minecraft/class_746;", "player", "Lnet/minecraft/class_1796;", "cooldownManager", "groupId", "Lnet/minecraft/class_1799;", "resolveCooldownStack", "(Lnet/minecraft/class_746;Lnet/minecraft/class_1796;Lnet/minecraft/class_2960;)Lnet/minecraft/class_1799;", "stack", "", "cooldownName", "(Lnet/minecraft/class_1799;Lnet/minecraft/class_2960;)Ljava/lang/String;", "", "remainingTicks", "formatDuration", "(I)Ljava/lang/String;", "Ljava/util/LinkedHashMap;", "map", "Ljava/util/LinkedHashMap;", "Ljava/util/ArrayList;", "Loxxxde/\u0633\u064e;", "Lkotlin/collections/ArrayList;", "cooldownBuffer", "Ljava/util/ArrayList;", "cachedPlayer", "Lnet/minecraft/class_746;", "cachedTick", "I", "cachedSignature", "J", "cooldownCount", "CooldownEntry", "rain-visuals"})
public final class \u062e\u0627
extends RainMainMenuScreen$Btn {
    private static int cachedTick;
    @NotNull
    public static final \u062e\u0627 INSTANCE;
    @Nullable
    private static ClientPlayerEntity cachedPlayer;
    private static long cachedSignature;
    private static int cooldownCount;
    @NotNull
    private static final LinkedHashMap<Data.First, Data.Second> map;
    @NotNull
    private static final ArrayList<\u0633\u064e> cooldownBuffer;

    static {
        INSTANCE = new \u062e\u0627();
        map = new LinkedHashMap();
        cooldownBuffer = new ArrayList();
        cachedTick = Integer.MIN_VALUE;
        cachedSignature = Long.MIN_VALUE;
    }

    /*
     * WARNING - void declaration
     */
    private final String formatDuration(int remainingTicks) {
        Object object;
        float seconds = (float)remainingTicks / 20.0f;
        if (seconds < 10.0f) {
            String string = "%.1fs";
            Object[] objectArray = new Object[1];
            objectArray[0] = Float.valueOf(seconds);
            String string2 = String.format(string, Arrays.copyOf(objectArray, objectArray.length));
            Intrinsics.checkNotNullExpressionValue(string2, "format(...)");
            return string2;
        }
        int totalSeconds = (int)Math.ceil(seconds);
        int minutes = totalSeconds / 60;
        int secs = totalSeconds % 60;
        if (minutes > 0) {
            String string = "%d:%02d";
            Object[] objectArray = new Object[2];
            objectArray[0] = minutes;
            objectArray[1] = secs;
            String string3 = String.format(string, Arrays.copyOf(objectArray, objectArray.length));
            object = string3;
            Intrinsics.checkNotNullExpressionValue(string3, "format(...)");
        } else {
            void var3_7;
            object = (int)var3_7 + "s";
        }
        return object;
    }

    private final String cooldownName(ItemStack stack, Identifier groupId) {
        CharSequence charSequence;
        Object object = stack;
        String string = object != null && (object = \u0637\u062b.getName(object)) != null && (object = object.getString()) != null ? ((Object)StringsKt.trim((CharSequence)object)).toString() : null;
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        String stackName = string2;
        boolean bl = ((CharSequence)stackName).length() > 0;
        if (bl) {
            return stackName;
        }
        String string3 = groupId.getPath();
        Intrinsics.checkNotNullExpressionValue(string3, "getPath(...)");
        CharSequence charSequence2 = ((Object)StringsKt.trim((CharSequence)StringsKt.replace$default(StringsKt.replace$default(string3, '_', ' ', false, 4, null), '/', ' ', false, 4, null))).toString();
        boolean bl2 = charSequence2.length() == 0;
        if (bl2) {
            boolean bl3 = false;
            String string4 = groupId.toString();
            charSequence = string4;
            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
        } else {
            charSequence = charSequence2;
        }
        return (String)charSequence;
    }

    /*
     * WARNING - void declaration
     */
    private final long cooldownSignature(Map<Identifier, ?> cooldowns) {
        void var2_2;
        long signature = cooldowns.size();
        for (Map.Entry<Identifier, ?> entry : cooldowns.entrySet()) {
            ItemCooldownEntryAccessor entry2;
            Identifier groupId = entry.getKey();
            Object rawEntry = entry.getValue();
            if ((rawEntry instanceof ItemCooldownEntryAccessor ? (ItemCooldownEntryAccessor)rawEntry : null) == null) continue;
            entry2 = entry2;
            signature = signature * 31L + (long)groupId.hashCode();
            signature = signature * 31L + (long)entry2.rain$getStartTick();
            signature = signature * 31L + (long)entry2.rain$getEndTick();
        }
        return (long)var2_2;
    }

    /*
     * WARNING - void declaration
     */
    private final ItemStack resolveCooldownStack(ClientPlayerEntity player, ItemCooldownManager cooldownManager, Identifier groupId) {
        void var7_9;
        PlayerInventory playerInventory = player.getInventory();
        Intrinsics.checkNotNullExpressionValue(playerInventory, "getInventory(...)");
        PlayerInventory inventory = playerInventory;
        int n = inventory.size();
        for (int slot = 0; slot < n; ++slot) {
            ItemStack stack;
            Intrinsics.checkNotNullExpressionValue(inventory.getStack(slot), "getItem(...)");
            if (stack.isEmpty()) continue;
            if (!Intrinsics.areEqual(cooldownManager.getGroup(stack), groupId)) continue;
            return stack;
        }
        ItemStack itemStack = player.getMainHandStack();
        Intrinsics.checkNotNullExpressionValue(itemStack, "getMainHandItem(...)");
        ItemStack mainHand = itemStack;
        if (!mainHand.isEmpty()) {
            if (Intrinsics.areEqual(cooldownManager.getGroup(mainHand), groupId)) {
                return mainHand;
            }
        }
        ItemStack itemStack2 = player.getOffHandStack();
        Intrinsics.checkNotNullExpressionValue(itemStack2, "getOffhandItem(...)");
        ItemStack offHand = itemStack2;
        if (!offHand.isEmpty()) {
            if (Intrinsics.areEqual(cooldownManager.getGroup(offHand), groupId)) {
                return offHand;
            }
        }
        RegistryEntry.Reference reference = Registries.ITEM.getEntry(groupId).orElse(null);
        if (reference == null) {
            return null;
        }
        RegistryEntry.Reference item = reference;
        return new ItemStack((RegistryEntry)var7_9);
    }

    /*
     * WARNING - void declaration
     */
    private final void sortCooldownBuffer() {
        int index = 1;
        int n = cooldownCount;
        while (index < n) {
            void var1_1;
            int current = index;
            while (current > 0) {
                void var3_3;
                \u0633\u064e previous;
                if (cooldownBuffer.get(current + -1).getRemainingTicks() >= cooldownBuffer.get(current).getRemainingTicks()) break;
                Intrinsics.checkNotNullExpressionValue(cooldownBuffer.get(current + -1), "get(...)");
                cooldownBuffer.set(current + -1, cooldownBuffer.get(current));
                cooldownBuffer.set(current, previous);
                --var3_3;
            }
            ++var1_1;
        }
    }

    private \u062e\u0627() {
        super("Cooldowns", "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0435\u0442 \u043d\u0430 \u043a\u0430\u043a\u0438\u0445 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430\u0445 \u043a\u0434", 200.0f, 200.0f, "l");
    }

    @Commando
    public final void onOverlayRender(@NotNull OverlayRenderEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.renderContainer(event);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    @NotNull
    protected Map<Data.First, Data.Second> getCurrentData() {
        block10: {
            block12: {
                block11: {
                    v0 = \u0636\u0643.getMc().player;
                    if (v0 != null) break block10;
                    $this$getCurrentData_u24lambda_u240 = this;
                    $i$a$-run-CooldownsHudModule$getCurrentData$player$1 = false;
                    if (\u062e\u0627.cachedPlayer != null) break block11;
                    v1 = !((Map)\u062e\u0627.map).isEmpty();
                    if (!v1) break block12;
                }
                \u062e\u0627.cachedPlayer = null;
                \u062e\u0627.cachedTick = -2147483648;
                \u062e\u0627.cachedSignature = -9223372036854775808L;
                \u062e\u0627.cooldownCount = 0;
                \u062e\u0627.map.clear();
            }
            return \u062e\u0627.map;
        }
        player = v0;
        v2 = player.getItemCooldownManager();
        Intrinsics.checkNotNullExpressionValue(v2, "getCooldowns(...)");
        cooldownManager = v2;
        accessor = (ItemCooldownManagerAccessor)cooldownManager;
        currentTick = accessor.rain$getTick();
        rawCooldowns = accessor.rain$getEntries();
        Intrinsics.checkNotNull(rawCooldowns);
        signature = this.cooldownSignature(rawCooldowns);
        if (\u062e\u0627.cachedPlayer == player && \u062e\u0627.cachedTick == currentTick && \u062e\u0627.cachedSignature == signature) {
            return \u062e\u0627.map;
        }
        \u062e\u0627.cachedPlayer = player;
        \u062e\u0627.cachedTick = currentTick;
        \u062e\u0627.cachedSignature = signature;
        \u062e\u0627.map.clear();
        \u062e\u0627.cooldownCount = 0;
        for (Map.Entry<Identifier, Object> var9_11 : rawCooldowns.entrySet()) {
            groupId = var9_11.getKey();
            rawEntry = var9_11.getValue();
            v3 = rawEntry instanceof ItemCooldownEntryAccessor ? (ItemCooldownEntryAccessor)rawEntry : null;
            if (v3 == null || (remainingTicks = (entry = v3).rain$getEndTick() - currentTick) <= 0) continue;
            Intrinsics.checkNotNull(groupId);
            stack = this.resolveCooldownStack(player, cooldownManager, groupId);
            if (\u062e\u0627.cooldownCount < \u062e\u0627.cooldownBuffer.size()) {
                v4 = \u062e\u0627.cooldownBuffer.get(\u062e\u0627.cooldownCount);
            } else {
                var17_22 = new \u0633\u064e(null, null, 0, 7, null);
                var18_23 = \u062e\u0627.cooldownBuffer;
                var19_24 = var17_22;
                var20_25 = false;
                var18_23.add(var19_24);
                v4 = var17_22;
            }
            var16_21 = v4;
            Intrinsics.checkNotNull(var16_21);
            cooldown = var16_21;
            v5 = stack;
            cooldown.setStack((ItemStack)(v5 != null ? v5.copy() : null));
            cooldown.setName(this.cooldownName(stack, groupId));
            cooldown.setRemainingTicks((int)var13_16);
            var16_20 = \u062e\u0627.cooldownCount;
            \u062e\u0627.cooldownCount = var16_20 + 1;
        }
        this.sortCooldownBuffer();
        index = 0;
        var9_12 = \u062e\u0627.cooldownCount;
        while (index < var9_12) {
            Intrinsics.checkNotNullExpressionValue(\u062e\u0627.cooldownBuffer.get(index), "get(...)");
            var12_15 = cooldown.getStack();
            if (var12_15 == null) ** GOTO lbl-1000
            it = var14_18 = var12_15;
            $i$a$-takeUnless-CooldownsHudModule$getCurrentData$leading$1 = false;
            var13_17 = !it.isEmpty() ? var14_18 : null;
            if (var13_17 != null) {
                var15_19 = var13_17;
                var16_20 = 0;
                v6 = new Data.Leading.Item(var15_19);
            } else lbl-1000:
            // 2 sources

            {
                v6 = null;
            }
            leading = v6;
            ((Map)\u062e\u0627.map).put(new Data.First(cooldown.getName(), leading), new Data.Second(this.formatDuration(var10_13.getRemainingTicks()), \u0637\u063a.INSTANCE.getVALUE_COLOR()));
            ++var8_10;
        }
        return \u062e\u0627.map;
    }
}

