/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class08051
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01015;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class08051;

public class class01023
implements class00381<class08051> {
    public static final class02362<class00667, class01023> N = class00381.N(class01023::N, class01023::new);
    private final class01015 y;
    private final boolean L;
    private final boolean u;

    public boolean L() {
        return this.u;
    }

    public class01023(class01015 class010152, boolean bl, boolean bl2) {
        this.y = class010152;
        this.L = bl;
        this.u = bl2;
    }

    private class01023(class00667 class006672) {
        this.y = (class01015)class006672.y(class01015.class);
        this.L = class006672.readBoolean();
        this.u = class006672.readBoolean();
    }

    public boolean y() {
        return this.L;
    }

    private void N(class00667 class006672) {
        class006672.N((Enum)this.y);
        class006672.writeBoolean(this.L);
        class006672.writeBoolean(this.u);
    }

    public class01015 N() {
        return this.y;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_30303(this);
    }

    public class02897<class01023> method_65080() {
        return class04248.Lu;
    }
}

