/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09262
 *  Nursultan.class09264
 *  Nursultan.class09276
 *  Nursultan.class09301
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09262;
import Nursultan.class09264;
import Nursultan.class09276;
import Nursultan.class09301;
import Nursultan.class11940;
import Nursultan.class11942;
import Nursultan.class11951;
import Nursultan.class11972;
import Nursultan.class11982;
import Nursultan.class11988;

public class class11957
implements class11951<class09276> {
    public Object N_0;
    public Object N_1;

    public class11988 L() {
        return (class11988)((Object)this.N_0);
    }

    public class11957(class11988 class119882, class11942 class119422) {
        this.R();
        this.N_0 = class119882;
        this.N_1 = class119422;
    }

    public class11957() {
        this.R();
    }

    @Override
    public void y(class11940 class119402) {
        int n = class119402.R();
        this.N_0 = class11988.N(n);
        if ((class11988)((Object)this.N_0) == null) {
            throw new IllegalStateException("Unknown C2SSharePacket action: " + n);
        }
        this.N_1 = switch (((class11988)((Object)this.N_0)).ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class09301.y((class11940)class119402);
            case 1 -> class11982.y(class119402);
            case 2 -> class09264.y((class11940)class119402);
            case 3 -> class11972.y(class119402);
            case 4 -> class09262.y((class11940)class119402);
        };
    }

    public static class11957 y(long l) {
        return new class11957(class11988.REQUEST_REFRESH, (class11942)new class09262(l));
    }

    public static class11957 y() {
        return new class11957(class11988.REQUEST_LIST, (class11942)new class09301());
    }

    @Override
    public void N(class09276 class092762) {
        class092762.N(this);
    }

    public static class11957 N(long l) {
        return new class11957(class11988.REQUEST_DELETE, (class11942)new class09264(l));
    }

    @Override
    public void N(class11940 class119402) {
        class119402.y(((class11988)((Object)this.N_0)).N());
        ((class11942)this.N_1).N(class119402);
    }

    public class11942 N() {
        return (class11942)this.N_1;
    }

    public static class11957 N(byte[] byArray) {
        return new class11957(class11988.REQUEST_ACTIVATE, new class11972(byArray));
    }

    public static class11957 N(long l, long l2, int n) {
        return new class11957(class11988.REQUEST_CREATE, new class11982(l, l2, n));
    }

    private void R() {
    }
}

