/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 *  java.util.SequencedCollection
 *  java.util.SequencedSet
 *  minecraft.class01056
 *  minecraft.class01231
 *  minecraft.class01894
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class06202
 *  minecraft.class07438
 *  minecraft.class08036
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents
 *  net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry
 *  net.fabricmc.fabric.api.client.rendering.v1.hud.StatusBarHeightProvider
 *  net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements
 *  net.fabricmc.fabric.mixin.client.rendering.GuiAccessor
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.client.rendering.hud;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.SequencedCollection;
import java.util.SequencedSet;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntFunction;
import minecraft.class01056;
import minecraft.class01231;
import minecraft.class01894;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class06202;
import minecraft.class07438;
import minecraft.class08036;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.hud.StatusBarHeightProvider;
import net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements;
import net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl;
import net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl$RootLayer;
import net.fabricmc.fabric.impl.client.rendering.hud.HudLayer;
import net.fabricmc.fabric.impl.client.rendering.hud.HudStatusBarHeightRegistryImpl$ResolvedHeightProvider;
import net.fabricmc.fabric.mixin.client.rendering.GuiAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(value=EnvType.CLIENT)
public final class HudStatusBarHeightRegistryImpl
implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger((String)"fabric-rendering-v1");
    static final int DEFAULT_HEIGHT = 39;
    static final int HELD_ITEM_TOOLTIP_HEIGHT = 20;
    static final int OVERLAY_MESSAGE_HEIGHT = 29;
    static final int TEXT_HEIGHT_DELTA = 9;
    static final StatusBarHeightProvider HEALTH_BAR = class080362 -> {
        class01056 class010562 = (class01056)class06202.Nq().i_6;
        int n = class04995.u((float)class080362.method_6032());
        int n2 = ((GuiAccessor)class010562).fabric$getRenderHealthValue();
        float f = Math.max((float)class080362.method_45325(class05298.n), (float)Math.max(n2, n));
        int n3 = class04995.u((float)class080362.method_6067());
        int n4 = class04995.u((float)((f + (float)n3) / 2.0f / 10.0f));
        int n5 = Math.max(10 - (n4 - 2), 3);
        return 10 + (n4 - 1) * n5;
    };
    static final StatusBarHeightProvider ARMOR_BAR = class080362 -> class080362.method_6096() > 0 ? 10 : 0;
    static final StatusBarHeightProvider MOUNT_HEALTH = class080362 -> {
        class01056 class010562 = (class01056)class06202.Nq().i_6;
        class07438 class074382 = ((GuiAccessor)class010562).fabric$callGetRiddenEntity();
        int n = ((GuiAccessor)class010562).fabric$callGetHeartCount(class074382);
        return ((GuiAccessor)class010562).fabric$callGetHeartRows(n) * 10;
    };
    static final StatusBarHeightProvider FOOD_BAR = class080362 -> {
        class01056 class010562 = (class01056)class06202.Nq().i_6;
        class07438 class074382 = ((GuiAccessor)class010562).fabric$callGetRiddenEntity();
        return ((GuiAccessor)class010562).fabric$callGetHeartCount(class074382) == 0 ? 10 : 0;
    };
    static final StatusBarHeightProvider AIR_BAR = class080362 -> {
        int n = class080362.method_5748();
        int n2 = Math.clamp((long)class080362.method_5669(), (int)0, (int)n);
        boolean bl = class080362.method_5777(class01231.N);
        return bl || n2 < n ? 10 : 0;
    };
    static final Map<class01894, HudStatusBarHeightRegistryImpl$ResolvedHeightProvider> RESOLVED_VANILLA_HEIGHT_PROVIDERS = ImmutableMap.of((Object)VanillaHudElements.HEALTH_BAR, (Object)HudStatusBarHeightRegistryImpl$ResolvedHeightProvider.ZERO, (Object)VanillaHudElements.ARMOR_BAR, arg_0 -> ((StatusBarHeightProvider)HEALTH_BAR).getStatusBarHeight(arg_0), (Object)VanillaHudElements.MOUNT_HEALTH, (Object)HudStatusBarHeightRegistryImpl$ResolvedHeightProvider.ZERO, (Object)VanillaHudElements.FOOD_BAR, (Object)HudStatusBarHeightRegistryImpl$ResolvedHeightProvider.ZERO, (Object)VanillaHudElements.AIR_BAR, (Object)HudStatusBarHeightRegistryImpl.reduceToIntFunctions((ToIntFunction<class08036>)MOUNT_HEALTH, (ToIntFunction<class08036>)FOOD_BAR, Integer::sum));
    static final Map<class01894, StatusBarHeightProvider> LEFT_VANILLA_HEIGHT_PROVIDERS = ImmutableMap.of((Object)VanillaHudElements.HEALTH_BAR, (Object)HEALTH_BAR, (Object)VanillaHudElements.ARMOR_BAR, (Object)ARMOR_BAR);
    static final Map<class01894, StatusBarHeightProvider> RIGHT_VANILLA_HEIGHT_PROVIDERS = ImmutableMap.of((Object)VanillaHudElements.MOUNT_HEALTH, (Object)MOUNT_HEALTH, (Object)VanillaHudElements.FOOD_BAR, (Object)FOOD_BAR, (Object)VanillaHudElements.AIR_BAR, (Object)AIR_BAR);
    static final Map<class01894, StatusBarHeightProvider> LEFT_HEIGHT_PROVIDERS = new HashMap<class01894, StatusBarHeightProvider>(LEFT_VANILLA_HEIGHT_PROVIDERS);
    static final Map<class01894, StatusBarHeightProvider> RIGHT_HEIGHT_PROVIDERS = new HashMap<class01894, StatusBarHeightProvider>(RIGHT_VANILLA_HEIGHT_PROVIDERS);
    static @Nullable Map<class01894, HudStatusBarHeightRegistryImpl$ResolvedHeightProvider> resolvedHeightProviders;

    static void init() {
        if (LEFT_VANILLA_HEIGHT_PROVIDERS.equals(LEFT_HEIGHT_PROVIDERS) && RIGHT_VANILLA_HEIGHT_PROVIDERS.equals(RIGHT_HEIGHT_PROVIDERS)) {
            resolvedHeightProviders = RESOLVED_VANILLA_HEIGHT_PROVIDERS;
        } else {
            LinkedHashMap<class01894, HudStatusBarHeightRegistryImpl$ResolvedHeightProvider> linkedHashMap = new LinkedHashMap<class01894, HudStatusBarHeightRegistryImpl$ResolvedHeightProvider>();
            HudStatusBarHeightRegistryImpl$ResolvedHeightProvider hudStatusBarHeightRegistryImpl$ResolvedHeightProvider = HudStatusBarHeightRegistryImpl.resolveHeightProviders(LEFT_HEIGHT_PROVIDERS, linkedHashMap::put);
            HudStatusBarHeightRegistryImpl$ResolvedHeightProvider hudStatusBarHeightRegistryImpl$ResolvedHeightProvider2 = HudStatusBarHeightRegistryImpl.resolveHeightProviders(RIGHT_HEIGHT_PROVIDERS, linkedHashMap::put);
            HudStatusBarHeightRegistryImpl.applyVanillaHeightProviders(linkedHashMap, HudStatusBarHeightRegistryImpl.reduceToIntFunctions(hudStatusBarHeightRegistryImpl$ResolvedHeightProvider, hudStatusBarHeightRegistryImpl$ResolvedHeightProvider2, Math::max));
            resolvedHeightProviders = ImmutableMap.copyOf(linkedHashMap);
        }
    }

    private static void applyVanillaHeightProviders(Map<class01894, HudStatusBarHeightRegistryImpl$ResolvedHeightProvider> map, HudStatusBarHeightRegistryImpl$ResolvedHeightProvider hudStatusBarHeightRegistryImpl$ResolvedHeightProvider) {
        for (Map.Entry<class01894, HudStatusBarHeightRegistryImpl$ResolvedHeightProvider> entry : RESOLVED_VANILLA_HEIGHT_PROVIDERS.entrySet()) {
            if (HudStatusBarHeightRegistryImpl.isVanillaHeightProvider(entry.getKey())) {
                HudStatusBarHeightRegistryImpl$ResolvedHeightProvider hudStatusBarHeightRegistryImpl$ResolvedHeightProvider2 = entry.getValue();
                HudStatusBarHeightRegistryImpl$ResolvedHeightProvider hudStatusBarHeightRegistryImpl$ResolvedHeightProvider3 = map.put(entry.getKey(), hudStatusBarHeightRegistryImpl$ResolvedHeightProvider2);
                Objects.requireNonNull(hudStatusBarHeightRegistryImpl$ResolvedHeightProvider3, () -> "resolved height provider " + String.valueOf(entry.getKey()) + " is null");
                HudStatusBarHeightRegistryImpl.replaceVanillaElement(entry.getKey(), HudStatusBarHeightRegistryImpl.reduceToIntFunctions(hudStatusBarHeightRegistryImpl$ResolvedHeightProvider2, hudStatusBarHeightRegistryImpl$ResolvedHeightProvider3, (n, n2) -> n - n2));
                continue;
            }
            LOGGER.debug("Skipped wrapping hud element {} for applying height provider offsets", (Object)entry.getKey());
        }
        HudStatusBarHeightRegistryImpl.replaceVanillaElement(VanillaHudElements.HELD_ITEM_TOOLTIP, class080362 -> 20 - Math.max(20, hudStatusBarHeightRegistryImpl$ResolvedHeightProvider.getResolvedHeight(class080362)));
        HudStatusBarHeightRegistryImpl.replaceVanillaElement(VanillaHudElements.OVERLAY_MESSAGE, class080362 -> 29 - Math.max(29, hudStatusBarHeightRegistryImpl$ResolvedHeightProvider.getResolvedHeight(class080362) + 9));
    }

    private static HudStatusBarHeightRegistryImpl$ResolvedHeightProvider resolveMaximumHeightProvider(class01894 class018942, Map<class01894, StatusBarHeightProvider> map, SequencedCollection<class01894> sequencedCollection) {
        HudStatusBarHeightRegistryImpl$ResolvedHeightProvider hudStatusBarHeightRegistryImpl$ResolvedHeightProvider = HudStatusBarHeightRegistryImpl.resolveHeightProvider(class018942, map, sequencedCollection);
        return HudStatusBarHeightRegistryImpl.reduceToIntFunctions((ToIntFunction)map.get(class018942), hudStatusBarHeightRegistryImpl$ResolvedHeightProvider, Integer::sum);
    }

    public static void addRight(class01894 class018942, StatusBarHeightProvider statusBarHeightProvider) {
        if (resolvedHeightProviders != null) {
            throw new IllegalStateException("Height provider registry already frozen!");
        }
        RIGHT_HEIGHT_PROVIDERS.put(class018942, statusBarHeightProvider);
    }

    public static void addLeft(class01894 class018942, StatusBarHeightProvider statusBarHeightProvider) {
        if (resolvedHeightProviders != null) {
            throw new IllegalStateException("Height provider registry already frozen!");
        }
        LEFT_HEIGHT_PROVIDERS.put(class018942, statusBarHeightProvider);
    }

    public void onInitializeClient() {
        ClientLifecycleEvents.CLIENT_STARTED.register(class062022 -> HudStatusBarHeightRegistryImpl.init());
    }

    public static int getHeight(class01894 class018942) {
        if (resolvedHeightProviders == null) {
            throw new IllegalStateException("Trying to get status bar height for " + String.valueOf(class018942) + " too early");
        }
        if (!resolvedHeightProviders.containsKey(class018942)) {
            throw new IllegalArgumentException("Unknown status bar: " + String.valueOf(class018942));
        }
        class08036 class080362 = ((GuiAccessor)((class01056)class06202.Nq().i_6)).fabric$callGetCameraPlayer();
        if (class080362 == null) {
            throw new IllegalStateException("Trying to get status bar height for " + String.valueOf(class018942) + " without a camera player");
        }
        return 39 + resolvedHeightProviders.get(class018942).getResolvedHeight(class080362);
    }

    private static HudStatusBarHeightRegistryImpl$ResolvedHeightProvider reduceToIntFunctions(ToIntFunction<class08036> toIntFunction, ToIntFunction<class08036> toIntFunction2, IntBinaryOperator intBinaryOperator) {
        return class080362 -> intBinaryOperator.applyAsInt(toIntFunction.applyAsInt(class080362), toIntFunction2.applyAsInt(class080362));
    }

    private static SequencedSet<class01894> getOrderedHeightProviders(Map<class01894, StatusBarHeightProvider> map) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (class01894 object : RESOLVED_VANILLA_HEIGHT_PROVIDERS.keySet()) {
            for (HudLayer hudLayer : HudElementRegistryImpl.ROOT_ELEMENTS.get(object).layers()) {
                HudStatusBarHeightRegistryImpl.addOrderedHeightProvider(hudLayer, map, linkedHashSet::add);
            }
        }
        for (Map.Entry entry : HudElementRegistryImpl.ROOT_ELEMENTS.entrySet()) {
            if (RESOLVED_VANILLA_HEIGHT_PROVIDERS.containsKey(entry.getKey())) continue;
            for (HudLayer hudLayer : ((HudElementRegistryImpl$RootLayer)((Object)entry.getValue())).layers()) {
                HudStatusBarHeightRegistryImpl.addOrderedHeightProvider(hudLayer, map, linkedHashSet::add);
            }
        }
        return linkedHashSet;
    }

    private static HudStatusBarHeightRegistryImpl$ResolvedHeightProvider resolveHeightProviders(Map<class01894, StatusBarHeightProvider> map, BiConsumer<class01894, HudStatusBarHeightRegistryImpl$ResolvedHeightProvider> biConsumer) {
        SequencedSet<class01894> sequencedSet = HudStatusBarHeightRegistryImpl.getOrderedHeightProviders(map);
        Sets.SetView setView = Sets.difference(map.keySet(), sequencedSet);
        if (!setView.isEmpty()) {
            throw new IllegalStateException("Unregistered hud elements: " + String.valueOf(setView));
        }
        for (class01894 class018942 : map.keySet()) {
            HudStatusBarHeightRegistryImpl$ResolvedHeightProvider hudStatusBarHeightRegistryImpl$ResolvedHeightProvider = HudStatusBarHeightRegistryImpl.resolveHeightProvider(class018942, map, sequencedSet);
            biConsumer.accept(class018942, hudStatusBarHeightRegistryImpl$ResolvedHeightProvider);
        }
        return HudStatusBarHeightRegistryImpl.resolveMaximumHeightProvider((class01894)sequencedSet.getLast(), map, sequencedSet);
    }

    private static HudStatusBarHeightRegistryImpl$ResolvedHeightProvider resolveHeightProvider(class01894 class018942, Map<class01894, StatusBarHeightProvider> map, SequencedCollection<class01894> sequencedCollection) {
        HudStatusBarHeightRegistryImpl$ResolvedHeightProvider hudStatusBarHeightRegistryImpl$ResolvedHeightProvider = HudStatusBarHeightRegistryImpl$ResolvedHeightProvider.ZERO;
        for (class01894 class018943 : sequencedCollection) {
            if (class018943.equals((Object)class018942)) {
                return hudStatusBarHeightRegistryImpl$ResolvedHeightProvider;
            }
            if (!map.containsKey(class018943)) continue;
            hudStatusBarHeightRegistryImpl$ResolvedHeightProvider = HudStatusBarHeightRegistryImpl.reduceToIntFunctions(hudStatusBarHeightRegistryImpl$ResolvedHeightProvider, (ToIntFunction)map.get(class018943), Integer::sum);
        }
        throw new IllegalStateException("Unknown height provider: " + String.valueOf(class018942));
    }

    private static void addOrderedHeightProvider(HudLayer hudLayer, Map<class01894, StatusBarHeightProvider> map, Consumer<class01894> consumer) {
        if (!hudLayer.isRemoved() && map.containsKey(hudLayer.id())) {
            consumer.accept(hudLayer.id());
        }
    }

    private static boolean isVanillaHeightProvider(class01894 class018942) {
        if (LEFT_HEIGHT_PROVIDERS.containsKey(class018942) && LEFT_HEIGHT_PROVIDERS.get(class018942) == LEFT_VANILLA_HEIGHT_PROVIDERS.get(class018942)) {
            return true;
        }
        return RIGHT_HEIGHT_PROVIDERS.containsKey(class018942) && RIGHT_HEIGHT_PROVIDERS.get(class018942) == RIGHT_VANILLA_HEIGHT_PROVIDERS.get(class018942);
    }

    private static void replaceVanillaElement(class01894 class018942, HudStatusBarHeightRegistryImpl$ResolvedHeightProvider hudStatusBarHeightRegistryImpl$ResolvedHeightProvider) {
        HudElementRegistry.replaceElement((class01894)class018942, hudElement -> (class010542, class022332) -> {
            int n;
            class08036 class080362 = ((GuiAccessor)((class01056)class06202.Nq().i_6)).fabric$callGetCameraPlayer();
            int n2 = n = class080362 != null ? hudStatusBarHeightRegistryImpl$ResolvedHeightProvider.getResolvedHeight(class080362) : 0;
            if (n != 0) {
                class010542.i().pushMatrix();
                class010542.i().translate(0.0f, (float)n);
            }
            hudElement.render(class010542, class022332);
            if (n != 0) {
                class010542.i().popMatrix();
            }
        });
    }
}

