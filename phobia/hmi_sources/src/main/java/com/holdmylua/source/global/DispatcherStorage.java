/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1839
 */
package com.holdmylua.source.global;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1839;

public class DispatcherStorage {
    private static final List<class_1799> renderedItems = new ArrayList<class_1799>();

    public static void setItem(class_1799 item) {
        if (!item.method_7960() && item.method_7976() != class_1839.field_8949 && item.method_7976() != class_1839.field_63380) {
            renderedItems.add(item);
        }
    }

    public static class_1799 getRenderedItem() {
        if (!renderedItems.isEmpty()) {
            class_1799 stack = (class_1799)renderedItems.getFirst();
            renderedItems.remove(stack);
            return stack;
        }
        return class_1802.field_8162.method_7854();
    }

    public static void clear() {
        renderedItems.clear();
    }
}

