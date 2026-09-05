/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09291
 *  Nursultan.class09292
 *  Nursultan.class09293
 *  Nursultan.class11827
 *  Nursultan.class11940
 *  Nursultan.class11951
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09258;
import Nursultan.class09261;
import Nursultan.class09263;
import Nursultan.class09272;
import Nursultan.class09277;
import Nursultan.class09279;
import Nursultan.class09281;
import Nursultan.class09291;
import Nursultan.class09292;
import Nursultan.class09293;
import Nursultan.class11827;
import Nursultan.class11940;
import Nursultan.class11951;
import java.util.List;
import java.util.UUID;

public class class09274
implements class11951<class09263> {
    public Object N_0;
    public Object N_1;

    public class09274(class09277 class092772, class09279 class092792) {
        this.u();
        this.N_0 = class092772;
        this.N_1 = class092792;
    }

    public class09274() {
        this.u();
    }

    private void u() {
    }

    public class09279 y() {
        return (class09279)this.N_1;
    }

    public static class09274 y(class11827 class118272, int n, byte[] byArray) {
        return new class09274(class09277.GET_RESPONSE, new class09261(class118272, n, byArray));
    }

    public static class09274 y(class11827 class118272) {
        return new class09274(class09277.CREATE_RESPONSE, (class09279)new class09291(class118272));
    }

    public void y(class11940 class119402) {
        int n = class119402.R();
        this.N_0 = class09277.N(n);
        if ((class09277)((Object)this.N_0) == null) {
            throw new IllegalStateException("Unknown S2CPresetPacket action: " + n);
        }
        this.N_1 = switch (((class09277)((Object)this.N_0)).ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class09272.N(class119402);
            case 1 -> class09291.N((class11940)class119402);
            case 2 -> class09292.N((class11940)class119402);
            case 3 -> class09261.N(class119402);
            case 4 -> class09293.N((class11940)class119402);
            case 5 -> class09258.N(class119402);
            case 6 -> class09281.N(class119402);
        };
    }

    public static class09274 N(List<class11827> list) {
        return new class09274(class09277.LIST_RESPONSE, new class09272(list));
    }

    public static class09274 N(class11827 class118272) {
        return new class09274(class09277.RENAME_RESPONSE, new class09258(class118272));
    }

    public class09277 N() {
        return (class09277)((Object)this.N_0);
    }

    public void N(class09263 class092632) {
        class092632.N(this);
    }

    public static class09274 N(class11827 class118272, int n, byte[] byArray) {
        return new class09274(class09277.UPDATE_RESPONSE, (class09279)new class09292(class118272, n, byArray));
    }

    public static class09274 N(long l) {
        return new class09274(class09277.DELETE_RESPONSE, (class09279)new class09293(l));
    }

    public void N(class11940 class119402) {
        class119402.y(((class09277)((Object)this.N_0)).N());
        ((class09279)this.N_1).y(class119402);
    }

    public static class09274 N(long l, UUID uUID, int n) {
        return new class09274(class09277.NACK, new class09281(l, uUID, n));
    }
}

