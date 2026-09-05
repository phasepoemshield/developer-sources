/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.clothconfig2.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import me.shedaniel.clothconfig2.impl.EasingMethod;
import me.shedaniel.clothconfig2.impl.EasingMethod$EasingMethodImpl;

public class EasingMethods {
    private static final List<EasingMethod> METHODS = new ArrayList<EasingMethod>();

    static {
        METHODS.addAll(Arrays.asList(EasingMethod$EasingMethodImpl.values()));
    }

    public static List<EasingMethod> getMethods() {
        return Collections.unmodifiableList(METHODS);
    }

    public static void register(EasingMethod easingMethod) {
        METHODS.add(easingMethod);
    }
}

