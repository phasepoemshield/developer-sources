/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.fabricmc.fabric.impl.base.event.EventFactoryImpl
 */
package net.fabricmc.fabric.api.event;

import java.util.function.Function;
import minecraft.class01894;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.impl.base.event.EventFactoryImpl;

public final class EventFactory {
    public static <T> Event<T> createWithPhases(Class<? super T> clazz, Function<T[], T> function, class01894 ... class01894Array) {
        EventFactoryImpl.ensureContainsDefault((class01894[])class01894Array);
        EventFactoryImpl.ensureNoDuplicates((class01894[])class01894Array);
        Event<T> event = EventFactory.createArrayBacked(clazz, function);
        for (int i = 1; i < class01894Array.length; ++i) {
            event.addPhaseOrdering(class01894Array[i - 1], class01894Array[i]);
        }
        return event;
    }

    @Deprecated
    public static boolean isProfilingEnabled() {
        return false;
    }

    @Deprecated
    public static String getHandlerName(Object object) {
        return object.getClass().getName();
    }

    private EventFactory() {
    }

    @Deprecated(forRemoval=true)
    public static void invalidate() {
        EventFactoryImpl.invalidate();
    }

    public static <T> Event<T> createArrayBacked(Class<? super T> clazz, Function<T[], T> function) {
        return EventFactoryImpl.createArrayBacked(clazz, function);
    }

    public static <T> Event<T> createArrayBacked(Class<T> clazz, T t, Function<T[], T> function) {
        return EventFactory.createArrayBacked(clazz, objectArray -> {
            if (((Object[])objectArray).length == 0) {
                return t;
            }
            if (((Object[])objectArray).length == 1) {
                return objectArray[0];
            }
            return function.apply((T[])objectArray);
        });
    }
}

