/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.function.Supplier;
import javax.management.MBeanAttributeInfo;

final class class05072 {
    final String N;
    final Supplier<Object> y;
    private final String L;
    private final Class<?> u;

    class05072(String string, Supplier<Object> supplier, String string2, Class<?> clazz) {
        this.N = string;
        this.y = supplier;
        this.L = string2;
        this.u = clazz;
    }

    public MBeanAttributeInfo N() {
        return new MBeanAttributeInfo(this.N, this.u.getSimpleName(), this.L, true, false, false);
    }
}

