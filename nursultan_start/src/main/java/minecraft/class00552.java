/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01652
 *  minecraft.class02362
 *  minecraft.class02885
 *  minecraft.class02897
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01652;
import minecraft.class02362;
import minecraft.class02885;
import minecraft.class02897;

public class class00552
implements class00381<class01652> {
    public static final class02362<class00667, class00552> N = class00381.N(class00552::N, class00552::new);
    private final long y;

    public class00552(long l) {
        this.y = l;
    }

    private class00552(class00667 class006672) {
        this.y = class006672.readLong();
    }

    public void method_65081(class01652 class016522) {
        class016522.method_52393(this);
    }

    private void N(class00667 class006672) {
        class006672.writeLong(this.y);
    }

    public long N() {
        return this.y;
    }

    public class02897<class00552> method_65080() {
        return class02885.s;
    }
}

