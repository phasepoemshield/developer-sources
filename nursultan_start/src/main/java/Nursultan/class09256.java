/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09294
 *  Nursultan.class09300
 *  Nursultan.class11789
 *  Nursultan.class11794
 *  Nursultan.class11940
 *  Nursultan.class11951
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09251;
import Nursultan.class09253;
import Nursultan.class09254;
import Nursultan.class09263;
import Nursultan.class09269;
import Nursultan.class09282;
import Nursultan.class09284;
import Nursultan.class09294;
import Nursultan.class09300;
import Nursultan.class11789;
import Nursultan.class11794;
import Nursultan.class11940;
import Nursultan.class11951;
import java.util.List;

public class class09256
implements class11951<class09263> {
    public Object N_0;
    public Object N_1;

    public class09256(class09251 class092512, class09282 class092822) {
        this.i();
        this.N_0 = class092512;
        this.N_1 = class092822;
    }

    public class09256() {
        this.i();
    }

    private void i() {
    }

    public void y(class11940 class119402) {
        int n = class119402.R();
        this.N_0 = class09251.N(n);
        if ((class09251)((Object)this.N_0) == null) {
            throw new IllegalStateException("Unknown S2CSharePacket action: " + n);
        }
        this.N_1 = switch (((class09251)((Object)this.N_0)).ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class09254.y(class119402);
            case 1 -> class09269.y(class119402);
            case 2 -> class09300.y((class11940)class119402);
            case 3 -> class09284.y(class119402);
            case 4 -> class09253.y(class119402);
            case 5 -> class09294.y((class11940)class119402);
        };
    }

    public static class09256 y(class11789 class117892) {
        return new class09256(class09251.REFRESH_RESPONSE, (class09282)new class09294(class117892));
    }

    public class09282 y() {
        return (class09282)this.N_1;
    }

    public static class09256 N(long l, int n) {
        return new class09256(class09251.NACK, new class09284(l, n));
    }

    public void N(class11940 class119402) {
        class119402.y(((class09251)((Object)this.N_0)).N());
        ((class09282)this.N_1).N(class119402);
    }

    public class09251 N() {
        return (class09251)((Object)this.N_0);
    }

    public static class09256 N(class11794 class117942, String string, String string2) {
        return new class09256(class09251.ACTIVATE_RESPONSE, new class09253(class117942.N(), string, string2));
    }

    public static class09256 N(class11789 class117892) {
        return new class09256(class09251.CREATE_RESPONSE, new class09269(class117892));
    }

    public void N(class09263 class092632) {
        class092632.N(this);
    }

    public static class09256 N(long l) {
        return new class09256(class09251.DELETE_RESPONSE, (class09282)new class09300(l));
    }

    public static class09256 N(List<class11789> list) {
        return new class09256(class09251.LIST_RESPONSE, new class09254(list));
    }
}

