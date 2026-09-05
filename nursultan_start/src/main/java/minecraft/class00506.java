/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01662
 *  minecraft.class02362
 *  minecraft.class02885
 *  minecraft.class02897
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01662;
import minecraft.class02362;
import minecraft.class02885;
import minecraft.class02897;

public class class00506
implements class00381<class01662> {
    public static final class02362<class00667, class00506> N = class00381.N(class00506::N, class00506::new);
    private final long y;

    public class00506(long l) {
        this.y = l;
    }

    private class00506(class00667 class006672) {
        this.y = class006672.readLong();
    }

    public void method_65081(class01662 class016622) {
        class016622.N(this);
    }

    private void N(class00667 class006672) {
        class006672.writeLong(this.y);
    }

    public long N() {
        return this.y;
    }

    public class02897<class00506> method_65080() {
        return class02885.i;
    }
}

