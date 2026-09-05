/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09276
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09276;
import Nursultan.class11940;
import Nursultan.class11949;
import Nursultan.class11951;
import Nursultan.class11960;
import Nursultan.class11969;
import Nursultan.class11979;
import Nursultan.class11981;

public class class11948
implements class11951<class09276> {
    public Object N_0;
    public Object N_1;

    public class11981 L() {
        return (class11981)this.N_1;
    }

    public class11948(class11979 class119792, class11981 class119812) {
        this.R();
        this.N_0 = class119792;
        this.N_1 = class119812;
    }

    public class11948() {
        this.R();
    }

    @Override
    public void y(class11940 class119402) {
        int n = class119402.R();
        this.N_0 = class11979.N(n);
        if ((class11979)((Object)this.N_0) == null) {
            throw new IllegalStateException("Unknown C2SConfigPacket action: " + n);
        }
        this.N_1 = switch (((class11979)((Object)this.N_0)).ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class11949.y(class119402);
            case 1 -> class11960.y(class119402);
            case 2 -> class11969.y(class119402);
        };
    }

    public class11979 y() {
        return (class11979)((Object)this.N_0);
    }

    public static class11948 N(int n, byte[] byArray) {
        return new class11948(class11979.REQUEST_PUSH, new class11969(n, byArray));
    }

    public static class11948 N(int n) {
        return new class11948(class11979.REQUEST_PULL, new class11960(n));
    }

    public static class11948 N() {
        return new class11948(class11979.REQUEST_LIST, new class11949());
    }

    @Override
    public void N(class09276 class092762) {
        class092762.N(this);
    }

    @Override
    public void N(class11940 class119402) {
        class119402.y(((class11979)((Object)this.N_0)).N());
        ((class11981)this.N_1).N(class119402);
    }

    private void R() {
    }
}

