/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09666
 *  Nursultan.class09753
 *  Nursultan.class09780
 *  Nursultan.class11833
 *  Nursultan.class11863
 */
package Nursultan;

import Nursultan.class09666;
import Nursultan.class09753;
import Nursultan.class09780;
import Nursultan.class11833;
import Nursultan.class11863;
import java.util.Objects;

public class class11607
implements class09780 {
    public Object N_0;
    public Object N_1;

    private void L() {
    }

    public class11607(class09666 class096662, class09666 class096663, class11863 class118632) {
        this.L();
        Objects.requireNonNull(class118632, "spec");
        this.N_0 = new class11833(class096662.y(), class096663.y(), class118632);
        this.N_1 = new class11833(class096662.L(), class096663.L(), class118632);
    }

    public boolean y() {
        return ((class11833)this.N_0).y() && ((class11833)this.N_1).y();
    }

    public boolean N(float f) {
        boolean bl = ((class11833)this.N_0).N(f);
        boolean bl2 = ((class11833)this.N_1).N(f);
        return bl || bl2;
    }

    public boolean N(class09753 class097532) {
        class09666 class096662 = class097532.i();
        boolean bl = ((class11833)this.N_0).y(class096662.y());
        boolean bl2 = ((class11833)this.N_1).y(class096662.L());
        return bl || bl2;
    }

    public class09753 N() {
        return class09753.N((class09666)class09666.N((float)((class11833)this.N_0).L(), (float)((class11833)this.N_1).L()));
    }
}

