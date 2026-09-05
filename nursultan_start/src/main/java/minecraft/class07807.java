/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07209
 *  minecraft.class08051
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07209;
import minecraft.class08051;

public class class07807
implements class00381<class08051> {
    public static final class02362<class00667, class07807> N = class00381.N(class07807::N, class07807::new);
    private static final int y = 384;
    private final class07209 L;
    private final String[] u;
    private final boolean i;

    public String[] L() {
        return this.u;
    }

    public class07807(class07209 class072092, boolean bl, String string, String string2, String string3, String string4) {
        this.L = class072092;
        this.i = bl;
        this.u = new String[]{string, string2, string3, string4};
    }

    private class07807(class00667 class006672) {
        this.L = class006672.i();
        this.i = class006672.readBoolean();
        this.u = new String[4];
        for (int i = 0; i < 4; ++i) {
            this.u[i] = class006672.u(384);
        }
    }

    public boolean y() {
        return this.i;
    }

    private void N(class00667 class006672) {
        class006672.N(this.L);
        class006672.writeBoolean(this.i);
        for (int i = 0; i < 4; ++i) {
            class006672.N(this.u[i]);
        }
    }

    public class07209 N() {
        return this.L;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12071(this);
    }

    public class02897<class07807> method_65080() {
        return class04248.Lb;
    }
}

