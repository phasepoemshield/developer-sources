/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  minecraft.class02477
 *  minecraft.class02694
 *  net.fabricmc.fabric.impl.item.ComponentTooltipAppenderRegistryImpl
 */
package net.fabricmc.fabric.api.item.v1;

import com.google.common.base.Preconditions;
import minecraft.class02477;
import minecraft.class02694;
import net.fabricmc.fabric.impl.item.ComponentTooltipAppenderRegistryImpl;

public interface ComponentTooltipAppenderRegistry {
    public static void addFirst(class02477<? extends class02694> class024772) {
        Preconditions.checkNotNull(class024772, (Object)"componentType");
        ComponentTooltipAppenderRegistryImpl.addFirst(class024772);
    }

    public static void addLast(class02477<? extends class02694> class024772) {
        Preconditions.checkNotNull(class024772, (Object)"componentType");
        ComponentTooltipAppenderRegistryImpl.addLast(class024772);
    }

    public static void addBefore(class02477<?> class024772, class02477<? extends class02694> class024773) {
        Preconditions.checkNotNull(class024772, (Object)"anchor");
        Preconditions.checkNotNull(class024773, (Object)"componentType");
        ComponentTooltipAppenderRegistryImpl.addBefore(class024772, class024773);
    }

    public static void addAfter(class02477<?> class024772, class02477<? extends class02694> class024773) {
        Preconditions.checkNotNull(class024772, (Object)"anchor");
        Preconditions.checkNotNull(class024773, (Object)"componentType");
        ComponentTooltipAppenderRegistryImpl.addAfter(class024772, class024773);
    }
}

