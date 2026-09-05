/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11805
 *  Nursultan.class11818
 *  org.jspecify.annotations.NonNull
 */
package Nursultan;

import Nursultan.class11805;
import Nursultan.class11818;
import java.util.Map;
import org.jspecify.annotations.NonNull;

public class class11800
extends ClassValue<class11818> {
    public Object N_0;

    private void L() {
    }

    public class11800(class11805 class118052) {
        this.L();
        this.N_0 = class118052;
    }

    @Override
    public class11818 computeValue(@NonNull Class<?> clazz) {
        return (class11818)((Map)((class11805)this.N_0).y_1).get(clazz);
    }
}

