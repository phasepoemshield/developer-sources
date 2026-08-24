/*
 * Decompiled with CFR 0.152.
 */
package sweetie.evaware.flora;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sweetie.evaware.flora.core.FloraBus;

public class Flora {
    private static final Map<Class<?>, FloraBus<?>> BUSES = new ConcurrentHashMap();

    public static <T> FloraBus<T> getBus(Class<T> type) {
        return BUSES.computeIfAbsent(type, k -> new FloraBus());
    }

    public static void post(Object event) {
        BUSES.computeIfAbsent(event.getClass(), k -> new FloraBus()).post(event);
    }
}

