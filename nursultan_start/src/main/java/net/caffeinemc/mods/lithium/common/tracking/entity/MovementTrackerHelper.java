/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap
 *  minecraft.class00717
 *  minecraft.class01135
 *  minecraft.class06695
 *  minecraft.class07049
 *  minecraft.class07234
 *  net.caffeinemc.mods.lithium.api.inventory.LithiumInventory
 */
package net.caffeinemc.mods.lithium.common.tracking.entity;

import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import minecraft.class00717;
import minecraft.class01135;
import minecraft.class06695;
import minecraft.class07049;
import minecraft.class07234;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.entity.EntityClassGroup;

public abstract class MovementTrackerHelper {
    public static final List<Class<?>> MOVEMENT_NOTIFYING_ENTITY_CLASSES = LithiumInventory.class.isAssignableFrom(class07234.class) ? List.of(class00717.class, class06695.class) : List.of();
    public static final List<EntityClassGroup> MOVEMENT_NOTIFYING_ENTITY_CLASS_GROUPS = List.of();
    public static volatile Reference2IntOpenHashMap<Class<? extends class01135>> CLASS_2_NOTIFY_MASK = new Reference2IntOpenHashMap();
    public static final int NUM_MOVEMENT_NOTIFYING_CLASSES;

    static {
        CLASS_2_NOTIFY_MASK.defaultReturnValue(-1);
        NUM_MOVEMENT_NOTIFYING_CLASSES = MOVEMENT_NOTIFYING_ENTITY_CLASSES.size() + MOVEMENT_NOTIFYING_ENTITY_CLASS_GROUPS.size();
    }

    static int getTrackerIndex(Object object) {
        if (object instanceof Class) {
            return MOVEMENT_NOTIFYING_ENTITY_CLASSES.indexOf(object);
        }
        if (object instanceof EntityClassGroup) {
            return MOVEMENT_NOTIFYING_ENTITY_CLASSES.size() + MOVEMENT_NOTIFYING_ENTITY_CLASS_GROUPS.indexOf(object);
        }
        return -1;
    }

    public static int getNotificationMask(class07049 class070492) {
        int n = CLASS_2_NOTIFY_MASK.getInt(class070492.getClass());
        if (n == -1) {
            n = MovementTrackerHelper.calculateNotificationMask(class070492);
        }
        return n;
    }

    private static int calculateNotificationMask(class07049 class070492) {
        Object object;
        int n;
        int n2 = 0;
        Class<?> clazz = class070492.getClass();
        for (n = 0; n < MOVEMENT_NOTIFYING_ENTITY_CLASSES.size(); ++n) {
            object = MOVEMENT_NOTIFYING_ENTITY_CLASSES.get(n);
            if (!((Class)object).isAssignableFrom(clazz)) continue;
            n2 |= 1 << n;
        }
        for (n = 0; n < MOVEMENT_NOTIFYING_ENTITY_CLASS_GROUPS.size(); ++n) {
            object = MOVEMENT_NOTIFYING_ENTITY_CLASS_GROUPS.get(n);
            if (!((EntityClassGroup)object).contains(class070492)) continue;
            n2 |= 1 << n + MOVEMENT_NOTIFYING_ENTITY_CLASSES.size();
        }
        Reference2IntOpenHashMap reference2IntOpenHashMap = CLASS_2_NOTIFY_MASK.clone();
        reference2IntOpenHashMap.put(clazz, n2);
        CLASS_2_NOTIFY_MASK = reference2IntOpenHashMap;
        return n2;
    }
}

