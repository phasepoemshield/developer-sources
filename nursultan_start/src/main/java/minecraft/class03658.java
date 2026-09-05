/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class02057
 *  minecraft.class02060
 *  minecraft.class02102
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class02057;
import minecraft.class02060;
import minecraft.class02102;
import minecraft.class03668;
import minecraft.class03676;
import minecraft.class03680;
import minecraft.class03695;
import minecraft.class03703;

public class class03658 {
    final int N;
    private final List<class03703> R = new ArrayList<class03703>();
    int y;
    int L = 4;
    int u;
    Optional<class03676> i = Optional.empty();

    public class03658(int n) {
        this.N = n;
    }

    public class03658 y(int n) {
        this.L = n;
        return this;
    }

    public class03668 y() {
        class02060 class020602 = new class02060().y(this.L);
        class020602.N((class02102)class02057.N((int)(this.N - 44)), 0, 0);
        class020602.N((class02102)class02057.N((int)44), 0, 1);
        ArrayList<class03680> arrayList = new ArrayList<class03680>();
        this.u = 0;
        for (class03703 class037032 : this.R) {
            arrayList.add(class037032.N(this, class020602, 0));
        }
        class020602.N();
        class03668 class036682 = new class03668(arrayList, (class03695)class020602);
        class036682.y();
        return class036682;
    }

    public class03658 N(int n, boolean bl) {
        this.i = Optional.of(new class03676(n, bl));
        return this;
    }

    public class03658 N(int n) {
        this.y = n;
        return this;
    }

    public class03703 N(class00392 class003922, BooleanSupplier booleanSupplier, Consumer<Boolean> consumer) {
        class03703 class037032 = new class03703(class003922, booleanSupplier, consumer, 44);
        this.R.add(class037032);
        return class037032;
    }

    void N() {
        ++this.u;
    }
}

