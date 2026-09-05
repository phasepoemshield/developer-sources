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
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class08051;

public class class07335
implements class00381<class08051> {
    public static final class02362<class00667, class07335> N = class00381.N(class07335::N, class07335::new);
    private final int y;

    public class07335(int n) {
        this.y = n;
    }

    private class07335(class00667 class006672) {
        this.y = class006672.readShort();
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12056(this);
    }

    private void N(class00667 class006672) {
        class006672.writeShort(this.y);
    }

    public int N() {
        return this.y;
    }

    public class02897<class07335> method_65080() {
        return class04248.Lz;
    }
}

