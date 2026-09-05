/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08055
 *  minecraft.class08057
 */
package net.caffeinemc.mods.lithium.common.world.listeners;

import java.util.WeakHashMap;
import minecraft.class08055;
import minecraft.class08057;
import net.caffeinemc.mods.lithium.common.world.listeners.WorldBorderListenerOnce;

public class WorldBorderPositionListenerMulti
implements class08055 {
    private final WeakHashMap<WorldBorderListenerOnce, Object> delegate = new WeakHashMap();

    public void add(WorldBorderListenerOnce worldBorderListenerOnce) {
        this.delegate.put(worldBorderListenerOnce, null);
    }

    public void method_11931(class08057 class080572, double d, double d2, long l, long l2) {
        for (WorldBorderListenerOnce worldBorderListenerOnce : this.delegate.keySet()) {
            worldBorderListenerOnce.method_11931(class080572, d, d2, l, l2);
        }
        this.delegate.clear();
    }

    public void onAreaReplaced(class08057 class080572) {
        for (WorldBorderListenerOnce worldBorderListenerOnce : this.delegate.keySet()) {
            worldBorderListenerOnce.onAreaReplaced(class080572);
        }
        this.delegate.clear();
    }

    public void method_11935(class08057 class080572, double d) {
    }

    public void method_11932(class08057 class080572, int n) {
    }

    public void method_11933(class08057 class080572, int n) {
    }

    public void method_11929(class08057 class080572, double d) {
    }

    public void method_11934(class08057 class080572, double d) {
        for (WorldBorderListenerOnce worldBorderListenerOnce : this.delegate.keySet()) {
            worldBorderListenerOnce.method_11934(class080572, d);
        }
        this.delegate.clear();
    }

    public void method_11930(class08057 class080572, double d, double d2) {
        for (WorldBorderListenerOnce worldBorderListenerOnce : this.delegate.keySet()) {
            worldBorderListenerOnce.method_11930(class080572, d, d2);
        }
        this.delegate.clear();
    }
}

