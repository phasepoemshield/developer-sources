/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class02362
 */
package minecraft;

import minecraft.class00667;
import minecraft.class02362;
import minecraft.class08687;

class class08709
implements class02362<class00667, class08687> {
    class08709() {
    }

    public void encode(class00667 class006672, class08687 class086872) {
        byte by = 0;
        by = (byte)(by | (class086872.N() ? 1 : 0));
        by = (byte)(by | (class086872.y() ? 2 : 0));
        by = (byte)(by | (class086872.L() ? 4 : 0));
        by = (byte)(by | (class086872.u() ? 8 : 0));
        by = (byte)(by | (class086872.i() ? 16 : 0));
        by = (byte)(by | (class086872.R() ? 32 : 0));
        by = (byte)(by | (class086872.M() ? 64 : 0));
        class006672.writeByte((int)by);
    }

    public class08687 decode(class00667 class006672) {
        byte by = class006672.readByte();
        boolean bl = (by & 1) != 0;
        boolean bl2 = (by & 2) != 0;
        boolean bl3 = (by & 4) != 0;
        boolean bl4 = (by & 8) != 0;
        boolean bl5 = (by & 0x10) != 0;
        boolean bl6 = (by & 0x20) != 0;
        boolean bl7 = (by & 0x40) != 0;
        return new class08687(bl, bl2, bl3, bl4, bl5, bl6, bl7);
    }
}

