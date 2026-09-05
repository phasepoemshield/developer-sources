/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09781;
import Nursultan.class09819;
import Nursultan.class09847;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

final class class09872 {
    private final Map<class09819, Runnable> N = new IdentityHashMap<class09819, Runnable>();

    private class09872() {
    }

    void N(class09819 class098192) {
        if (class098192 != null) {
            this.N.remove(class098192);
        }
    }

    class09847 N(float f) {
        if (f <= 0.0f || this.N.isEmpty()) {
            return class09847.N;
        }
        boolean bl = false;
        for (Map.Entry<class09819, Runnable> entry : this.N.entrySet()) {
            class09819 class098192 = entry.getKey();
            if (!class098192.N()) continue;
            bl = true;
            if (!class098192.N(f)) continue;
            entry.getValue().run();
        }
        return bl ? class09847.y : class09847.N;
    }

    static class09872 N(class09781 class097812) {
        return (class09872)class097812.N(class09872.class).orElseGet(() -> {
            class09872 class098722 = new class09872();
            class097812.N(class09872.class, class098722);
            return class098722;
        });
    }

    void N(class09819 class098192, Runnable runnable) {
        this.N.put(Objects.requireNonNull(class098192, "ticker"), Objects.requireNonNull(runnable, "requestRender"));
    }
}

