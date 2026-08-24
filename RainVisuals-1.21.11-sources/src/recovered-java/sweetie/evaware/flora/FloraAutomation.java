/*
 * Decompiled with CFR 0.152.
 */
package sweetie.evaware.flora;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import sweetie.evaware.flora.Flora;
import sweetie.evaware.flora.api.Commando;
import sweetie.evaware.flora.api.Subscription;
import sweetie.evaware.flora.core.FloraBus;
import sweetie.evaware.flora.core.Listener;
import sweetie.evaware.flora.util.LambdaFactory;

public class FloraAutomation {
    private static final Map<Object, List<Subscription>> registry = new ConcurrentHashMap<Object, List<Subscription>>();

    public static void unregister(Object target) {
        List<Subscription> subs = registry.remove(target);
        if (subs != null) {
            subs.forEach(Subscription::unsubscribe);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void register(Object target) {
        if (registry.containsKey(target)) {
            return;
        }
        ArrayList<Subscription> subs = new ArrayList<Subscription>();
        Class<?> clazz = target.getClass();
        Method[] methodArray = clazz.getDeclaredMethods();
        int n = methodArray.length;
        for (int i = 0; i < n; ++i) {
            Method method = methodArray[i];
            if (!method.isAnnotationPresent(Commando.class)) continue;
            if (method.getParameterCount() != 1) continue;
            Class<?> eventType = method.getParameterTypes()[0];
            Commando info = method.getAnnotation(Commando.class);
            FloraBus<?> bus = Flora.getBus(eventType);
            Consumer<?> handler = LambdaFactory.create(target, method, eventType);
            subs.add(bus.subscribe(new Listener(info.priority(), handler, info.mode())));
        }
        if (!subs.isEmpty()) {
            void var1_1;
            registry.put(target, (List<Subscription>)var1_1);
        }
    }
}

