/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07023
 */
package minecraft;

import java.util.List;
import java.util.function.Supplier;
import minecraft.class07023;
import minecraft.class07709;
import minecraft.class07741;
import minecraft.class07773;

class class07777
implements class07773 {
    private final int N;

    public class07777(int n) {
        this.N = n;
    }

    @Override
    public class07709 N() {
        return new class07741();
    }

    @Override
    public int N(class07709 class077092, Supplier<class07709> supplier) {
        if (class077092 instanceof class07023) {
            int n;
            class07023 class070232 = (class07023)class077092;
            int n2 = class070232.size();
            int n3 = n = this.N < 0 ? n2 + this.N : this.N;
            if (0 <= n && n < n2) {
                class07709 class077093 = class070232.get(n);
                class07709 class077094 = supplier.get();
                if (!class077094.equals(class077093) && class070232.N(n, class077094)) {
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override
    public int N(class07709 class077092) {
        if (class077092 instanceof class07023) {
            int n;
            class07023 class070232 = (class07023)class077092;
            int n2 = class070232.size();
            int n3 = n = this.N < 0 ? n2 + this.N : this.N;
            if (0 <= n && n < n2) {
                class070232.remove(n);
                return 1;
            }
        }
        return 0;
    }

    @Override
    public void N(class07709 class077092, Supplier<class07709> supplier, List<class07709> list) {
        this.N(class077092, list);
    }

    @Override
    public void N(class07709 class077092, List<class07709> list) {
        if (class077092 instanceof class07023) {
            int n;
            class07023 class070232 = (class07023)class077092;
            int n2 = class070232.size();
            int n3 = n = this.N < 0 ? n2 + this.N : this.N;
            if (0 <= n && n < n2) {
                list.add(class070232.get(n));
            }
        }
    }
}

