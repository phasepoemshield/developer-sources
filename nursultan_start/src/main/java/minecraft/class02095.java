/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import minecraft.class02117;
import minecraft.class02129;

public class class02095 {
    private final String N;
    private final String y;
    private final List<class02117<?>> L = new ArrayList();
    private boolean u;

    class02095(String string, String string2) {
        this.N = string;
        this.y = string2;
    }

    public class02129 y() {
        class02129 class021292 = new class02129(this.N, this.y, List.copyOf(this.L), this.u);
        if (class02129.N.putIfAbsent(this.N, class021292) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.N + "'");
        }
        return class021292;
    }

    public class02095 N(List<class02117<?>> list) {
        this.L.addAll(list);
        return this;
    }

    public class02095 N() {
        this.u = true;
        return this;
    }

    public <T> class02095 N(class02117<T> class021172) {
        this.L.add(class021172);
        return this;
    }
}

