/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01222
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04271
 *  minecraft.class05449
 *  minecraft.class07844
 */
package minecraft;

import java.security.PublicKey;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01222;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04271;
import minecraft.class05449;
import minecraft.class07844;

public class class07820
implements class00381<class07844> {
    public static final class02362<class00667, class07820> N = class00381.N(class07820::N, class07820::new);
    private final String y;
    private final byte[] L;
    private final byte[] u;
    private final boolean i;

    public byte[] L() {
        return this.u;
    }

    public class07820(String string, byte[] byArray, byte[] byArray2, boolean bl) {
        this.y = string;
        this.L = byArray;
        this.u = byArray2;
        this.i = bl;
    }

    private class07820(class00667 class006672) {
        this.y = class006672.u(20);
        this.L = class006672.y();
        this.u = class006672.y();
        this.i = class006672.readBoolean();
    }

    public boolean u() {
        return this.i;
    }

    public PublicKey y() throws class05449 {
        return class01222.N((byte[])this.L);
    }

    private void N(class00667 class006672) {
        class006672.N(this.y);
        class006672.N(this.L);
        class006672.N(this.u);
        class006672.writeBoolean(this.i);
    }

    public String N() {
        return this.y;
    }

    public void method_65081(class07844 class078442) {
        class078442.N(this);
    }

    public class02897<class07820> method_65080() {
        return class04271.L;
    }
}

