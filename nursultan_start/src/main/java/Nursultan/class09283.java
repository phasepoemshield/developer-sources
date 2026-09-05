/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10732
 *  Nursultan.class11940
 *  Nursultan.class11951
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09259;
import Nursultan.class09260;
import Nursultan.class09263;
import Nursultan.class09265;
import Nursultan.class09267;
import Nursultan.class09275;
import Nursultan.class09287;
import Nursultan.class10732;
import Nursultan.class11940;
import Nursultan.class11951;
import java.util.List;

public class class09283
implements class11951<class09263> {
    public Object N_0;
    public Object N_1;

    public class09283() {
        this.i();
    }

    public class09283(class09259 class092592, class09260 class092602) {
        this.i();
        this.N_0 = class092592;
        this.N_1 = class092602;
    }

    private void i() {
    }

    public class09259 y() {
        return (class09259)((Object)this.N_0);
    }

    public void y(class11940 class119402) {
        int n = class119402.R();
        this.N_0 = class09259.N(n);
        if ((class09259)((Object)this.N_0) == null) {
            throw new IllegalStateException("Unknown S2CConfigPacket action: " + n);
        }
        this.N_1 = switch (((class09259)((Object)this.N_0)).ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class09267.y(class119402);
            case 1 -> class09275.y(class119402);
            case 2 -> class09287.y(class119402);
            case 3 -> class09265.y(class119402);
        };
    }

    public void N(class11940 class119402) {
        class119402.y(((class09259)((Object)this.N_0)).N());
        ((class09260)this.N_1).N(class119402);
    }

    public static class09283 N(List<class10732> list) {
        return new class09283(class09259.LIST_RESPONSE, new class09267(list));
    }

    public class09260 N() {
        return (class09260)this.N_1;
    }

    public void N(class09263 class092632) {
        class092632.N(this);
    }

    public static class09283 N(int n, long l, byte[] byArray) {
        return new class09283(class09259.BLOB, new class09275(n, l, byArray));
    }

    public static class09283 N(int n, long l) {
        return new class09283(class09259.ACK, new class09287(n, l));
    }

    public static class09283 N(int n, int n2) {
        return new class09283(class09259.NACK, new class09265(n, n2));
    }
}

