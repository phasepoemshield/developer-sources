/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement
 *  net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements
 *  org.apache.commons.lang3.mutable.MutableBoolean
 */
package net.fabricmc.fabric.impl.client.rendering.hud;

import java.util.IdentityHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import minecraft.class01894;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements;
import net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl$LayerVisitor;
import net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl$RootLayer;
import net.fabricmc.fabric.impl.client.rendering.hud.HudLayer;
import org.apache.commons.lang3.mutable.MutableBoolean;

@Environment(value=EnvType.CLIENT)
public class HudElementRegistryImpl {
    static final List<class01894> VANILLA_ELEMENT_IDS = List.of(VanillaHudElements.MISC_OVERLAYS, VanillaHudElements.CROSSHAIR, VanillaHudElements.SPECTATOR_MENU, VanillaHudElements.HOTBAR, VanillaHudElements.ARMOR_BAR, VanillaHudElements.HEALTH_BAR, VanillaHudElements.FOOD_BAR, VanillaHudElements.AIR_BAR, VanillaHudElements.MOUNT_HEALTH, VanillaHudElements.INFO_BAR, VanillaHudElements.EXPERIENCE_LEVEL, VanillaHudElements.HELD_ITEM_TOOLTIP, VanillaHudElements.SPECTATOR_TOOLTIP, VanillaHudElements.STATUS_EFFECTS, VanillaHudElements.BOSS_BAR, VanillaHudElements.SLEEP, VanillaHudElements.DEMO_TIMER, VanillaHudElements.SCOREBOARD, VanillaHudElements.OVERLAY_MESSAGE, VanillaHudElements.TITLE_AND_SUBTITLE, VanillaHudElements.CHAT, VanillaHudElements.PLAYER_LIST, VanillaHudElements.SUBTITLES);
    public static final Map<class01894, HudElementRegistryImpl$RootLayer> ROOT_ELEMENTS = VANILLA_ELEMENT_IDS.stream().map(HudElementRegistryImpl$RootLayer::new).collect(Collectors.toMap(HudElementRegistryImpl$RootLayer::id, Function.identity(), (hudElementRegistryImpl$RootLayer, hudElementRegistryImpl$RootLayer2) -> hudElementRegistryImpl$RootLayer, IdentityHashMap::new));
    private static final HudElementRegistryImpl$RootLayer FIRST = ROOT_ELEMENTS.get(VanillaHudElements.MISC_OVERLAYS);
    private static final HudElementRegistryImpl$RootLayer LAST = ROOT_ELEMENTS.get(VanillaHudElements.SUBTITLES);

    public static HudElementRegistryImpl$RootLayer getRoot(class01894 class018942) {
        return ROOT_ELEMENTS.get(class018942);
    }

    public static void addFirst(class01894 class018942, HudElement hudElement) {
        HudElementRegistryImpl.validateUnique(class018942);
        FIRST.layers().addFirst(HudLayer.ofElement(class018942, hudElement));
    }

    public static void addLast(class01894 class018942, HudElement hudElement) {
        HudElementRegistryImpl.validateUnique(class018942);
        LAST.layers().addLast(HudLayer.ofElement(class018942, hudElement));
    }

    public static void attachElementAfter(class01894 class018942, class01894 class018943, HudElement hudElement) {
        HudElementRegistryImpl.validateUnique(class018943);
        boolean bl = HudElementRegistryImpl.findLayer(class018942, (hudLayer, listIterator) -> {
            listIterator.add(HudLayer.ofElement(class018943, hudElement));
            return true;
        });
        if (!bl) {
            throw new IllegalArgumentException("Layer with identifier " + String.valueOf(class018942) + " not found");
        }
    }

    static boolean visitLayers(HudElementRegistryImpl$LayerVisitor hudElementRegistryImpl$LayerVisitor) {
        boolean bl = false;
        for (class01894 class018942 : VANILLA_ELEMENT_IDS) {
            HudElementRegistryImpl$RootLayer hudElementRegistryImpl$RootLayer = ROOT_ELEMENTS.get(class018942);
            bl |= HudElementRegistryImpl.visitLayers(hudElementRegistryImpl$RootLayer.layers(), hudElementRegistryImpl$LayerVisitor);
        }
        return bl;
    }

    private static boolean visitLayers(List<HudLayer> list, HudElementRegistryImpl$LayerVisitor hudElementRegistryImpl$LayerVisitor) {
        MutableBoolean mutableBoolean = new MutableBoolean(false);
        ListIterator<HudLayer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            HudLayer hudLayer = listIterator.next();
            if (!hudElementRegistryImpl$LayerVisitor.visit(hudLayer, listIterator)) continue;
            mutableBoolean.setTrue();
        }
        return mutableBoolean.booleanValue();
    }

    static void validateUnique(class01894 class018942) {
        HudElementRegistryImpl.visitLayers((hudLayer, listIterator) -> {
            if (hudLayer.id().equals((Object)class018942)) {
                throw new IllegalArgumentException("Layer with identifier " + String.valueOf(class018942) + " already exists");
            }
            return false;
        });
    }

    public static void removeElement(class01894 class018942) {
        boolean bl = HudElementRegistryImpl.findLayer(class018942, (hudLayer, listIterator) -> {
            listIterator.set(HudLayer.of(hudLayer.id(), hudLayer::element, true));
            return true;
        });
        if (!bl) {
            throw new IllegalArgumentException("Layer with identifier " + String.valueOf(class018942) + " not found");
        }
    }

    public static void attachElementBefore(class01894 class018942, class01894 class018943, HudElement hudElement) {
        HudElementRegistryImpl.validateUnique(class018943);
        boolean bl = HudElementRegistryImpl.findLayer(class018942, (hudLayer, listIterator) -> {
            listIterator.previous();
            listIterator.add(HudLayer.ofElement(class018943, hudElement));
            listIterator.next();
            return true;
        });
        if (!bl) {
            throw new IllegalArgumentException("Layer with identifier " + String.valueOf(class018942) + " not found");
        }
    }

    static boolean findLayer(class01894 class018942, HudElementRegistryImpl$LayerVisitor hudElementRegistryImpl$LayerVisitor) {
        MutableBoolean mutableBoolean = new MutableBoolean(false);
        HudElementRegistryImpl.visitLayers((hudLayer, listIterator) -> {
            if (hudLayer.id().equals((Object)class018942)) {
                mutableBoolean.setTrue();
                return hudElementRegistryImpl$LayerVisitor.visit(hudLayer, listIterator);
            }
            return false;
        });
        return mutableBoolean.booleanValue();
    }

    public static void replaceElement(class01894 class018942, Function<HudElement, HudElement> function) {
        boolean bl = HudElementRegistryImpl.findLayer(class018942, (hudLayer, listIterator) -> {
            listIterator.set(HudLayer.of(hudLayer.id(), function.compose(hudLayer::element), hudLayer.isRemoved()));
            return true;
        });
        if (!bl) {
            throw new IllegalArgumentException("Layer with identifier " + String.valueOf(class018942) + " not found");
        }
    }
}

