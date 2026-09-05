/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07001
 */
package minecraft;

import java.util.List;
import java.util.function.Supplier;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07773;

class class07805
implements class07773 {
    private final String N;

    public class07805(String string) {
        this.N = string;
    }

    @Override
    public class07709 N() {
        return new class07001();
    }

    @Override
    public int N(class07709 class077092, Supplier<class07709> supplier) {
        if (class077092 instanceof class07001) {
            class07709 class077093;
            class07001 class070012 = (class07001)class077092;
            class07709 class077094 = supplier.get();
            if (!class077094.equals(class077093 = class070012.N(this.N, class077094))) {
                return 1;
            }
        }
        return 0;
    }

    @Override
    public int N(class07709 class077092) {
        class07001 class070012;
        if (class077092 instanceof class07001 && (class070012 = (class07001)class077092).y(this.N)) {
            class070012.b(this.N);
            return 1;
        }
        return 0;
    }

    @Override
    public void N(class07709 class077092, Supplier<class07709> supplier, List<class07709> list) {
        if (class077092 instanceof class07001) {
            class07709 class077093;
            class07001 class070012 = (class07001)class077092;
            if (class070012.y(this.N)) {
                class077093 = class070012.N(this.N);
            } else {
                class077093 = supplier.get();
                class070012.N(this.N, class077093);
            }
            list.add(class077093);
        }
    }

    @Override
    public void N(class07709 class077092, List<class07709> list) {
        class07709 class077093;
        if (class077092 instanceof class07001 && (class077093 = ((class07001)class077092).N(this.N)) != null) {
            list.add(class077093);
        }
    }
}

