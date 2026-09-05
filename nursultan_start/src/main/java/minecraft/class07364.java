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
 *  minecraft.class07211
 *  minecraft.class08051
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07356;
import minecraft.class08051;

public class class07364
implements class00381<class08051> {
    public static final class02362<class00667, class07364> N = class00381.N(class07364::N, class07364::new);
    private final class07209 y;
    private final class07211 L;
    private final class07356 u;
    private final int i;

    public class07356 L() {
        return this.u;
    }

    private class07364(class00667 class006672) {
        this.u = (class07356)class006672.y(class07356.class);
        this.y = class006672.i();
        this.L = class07211.N((int)class006672.readUnsignedByte());
        this.i = class006672.E();
    }

    public class07364(class07356 class073562, class07209 class072092, class07211 class072112) {
        this(class073562, class072092, class072112, 0);
    }

    public class07364(class07356 class073562, class07209 class072092, class07211 class072112, int n) {
        this.u = class073562;
        this.y = class072092.method_10062();
        this.L = class072112;
        this.i = n;
    }

    public int u() {
        return this.i;
    }

    public class07211 y() {
        return this.L;
    }

    private void N(class00667 class006672) {
        class006672.N((Enum)this.u);
        class006672.N(this.y);
        class006672.writeByte(this.L.L());
        class006672.L(this.i);
    }

    public class07209 N() {
        return this.y;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12066(this);
    }

    public class02897<class07364> method_65080() {
        return class04248.yr;
    }
}

