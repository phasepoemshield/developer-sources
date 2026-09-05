/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09667
 */
package Nursultan;

import Nursultan.class09667;
import Nursultan.class09786;
import Nursultan.class09794;
import Nursultan.class09803;
import Nursultan.class09868;
import Nursultan.class09869;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public final class class09781 {
    private final class09803 N;
    private final class09868 y;
    private final class09667 L;
    private final class09794 u = new class09794();
    private final Map<Class<?>, Object> i = new HashMap();
    private final class09869 R;

    public class09667 L() {
        return this.L;
    }

    public class09781(class09803 class098032, class09868 class098682, class09667 class096672) {
        this.N = Objects.requireNonNull(class098032, "clipboard");
        this.y = Objects.requireNonNull(class098682, "fontMetrics");
        this.L = Objects.requireNonNull(class096672, "textMeasurer");
        this.R = new class09786(this);
    }

    public class09869 i() {
        return this.R;
    }

    public class09794 u() {
        return this.u;
    }

    public class09868 y() {
        return this.y;
    }

    public <T> Optional<T> N(Class<T> clazz) {
        Object object = this.i.get(Objects.requireNonNull(clazz, "type"));
        if (object == null) {
            return Optional.empty();
        }
        return Optional.of(clazz.cast(object));
    }

    public <T> void N(Class<T> clazz, T t) {
        this.i.put(Objects.requireNonNull(clazz, "type"), Objects.requireNonNull(t, "service"));
    }

    public class09803 N() {
        return this.N;
    }
}

