/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class07185;
import minecraft.class07214;

final class class07223
extends class07214 {
    class07223(String string, int n) {
    }

    @Override
    public class07185 N(class07185 class071852) {
        switch (class071852.ordinal()) {
            case 0: {
                return class07185.field_11051;
            }
            case 1: {
                return class07185.field_11048;
            }
            case 2: {
                return class07185.field_11052;
            }
        }
        throw new IllegalArgumentException();
    }

    @Override
    public class07214 N() {
        return field_10963;
    }

    @Override
    public double N(double d, double d2, double d3, class07185 class071852) {
        return class071852.N(d2, d3, d);
    }

    @Override
    public int N(int n, int n2, int n3, class07185 class071852) {
        return class071852.N(n2, n3, n);
    }
}

