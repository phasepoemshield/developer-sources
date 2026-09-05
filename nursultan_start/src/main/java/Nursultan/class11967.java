/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09276
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09276;
import Nursultan.class11939;
import Nursultan.class11940;
import Nursultan.class11941;
import Nursultan.class11944;
import Nursultan.class11946;
import Nursultan.class11951;
import Nursultan.class11962;
import Nursultan.class11965;
import Nursultan.class11970;
import Nursultan.class11980;
import java.util.UUID;

public class class11967
implements class11951<class09276> {
    public Object N_0;
    public Object N_1;

    public static class11967 L() {
        return new class11967(class11962.REQUEST_LIST, new class11939());
    }

    public class11967(class11962 class119622, class11946 class119462) {
        this.u();
        this.N_0 = class119622;
        this.N_1 = class119462;
    }

    public class11967() {
        this.u();
    }

    private void u() {
    }

    public class11962 y() {
        return (class11962)((Object)this.N_0);
    }

    public static class11967 y(long l) {
        return new class11967(class11962.REQUEST_GET, new class11944(l));
    }

    @Override
    public void y(class11940 class119402) {
        int n = class119402.R();
        this.N_0 = class11962.N(n);
        if ((class11962)((Object)this.N_0) == null) {
            throw new IllegalStateException("Unknown C2SPresetPacket action: " + n);
        }
        this.N_1 = switch (((class11962)((Object)this.N_0)).ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class11939.y(class119402);
            case 1 -> class11965.y(class119402);
            case 2 -> class11941.y(class119402);
            case 3 -> class11944.y(class119402);
            case 4 -> class11980.y(class119402);
            case 5 -> class11970.y(class119402);
        };
    }

    @Override
    public void N(class09276 class092762) {
        class092762.N(this);
    }

    public static class11967 N(long l, byte[] byArray, int n) {
        return new class11967(class11962.REQUEST_UPDATE, new class11941(l, n, byArray));
    }

    public static class11967 N(UUID uUID, String string, byte[] byArray, int n) {
        return new class11967(class11962.REQUEST_CREATE, new class11965(uUID, n, string, byArray));
    }

    public static class11967 N(long l) {
        return new class11967(class11962.REQUEST_DELETE, new class11980(l));
    }

    public class11946 N() {
        return (class11946)this.N_1;
    }

    public static class11967 N(long l, String string) {
        return new class11967(class11962.REQUEST_RENAME, new class11970(l, string));
    }

    @Override
    public void N(class11940 class119402) {
        class119402.y(((class11962)((Object)this.N_0)).N());
        ((class11946)this.N_1).N(class119402);
    }
}

