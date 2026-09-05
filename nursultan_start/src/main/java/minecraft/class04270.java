/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class04782
 *  minecraft.class05163
 *  minecraft.class05513
 *  minecraft.class05514
 *  minecraft.class05516
 *  minecraft.class07209
 *  minecraft.class07218
 */
package minecraft;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class04782;
import minecraft.class05163;
import minecraft.class05513;
import minecraft.class05514;
import minecraft.class05516;
import minecraft.class07209;
import minecraft.class07218;

public class class04270
implements class05516 {
    private static final int L = 5;
    private static final int u = 6;
    private final int i;
    private int R;
    private class00734 M;
    private final class07218 B;
    private final class07209 Z;
    private final boolean z;
    private float U = -1.0f;
    private final Collection<class05513> E = new ArrayList<class05513>();

    public class04270(class07209 class072092, int n, boolean bl) {
        this.i = n;
        this.B = class072092.method_25503();
        this.M = new class00734((class07209)this.B);
        this.Z = class072092;
        this.z = bl;
    }

    public void N(class04782 class047822) {
        if (this.z) {
            this.E.forEach(class055132 -> class05514.N((class05163)class055132.R().u(), (class04782)class047822));
            this.E.clear();
            this.M = new class00734(this.Z);
            this.B.N((class00753)this.Z);
        }
    }

    public Optional<class05513> spawnStructure(class05513 class055132) {
        class07209 class072092 = new class07209((class00753)this.B);
        class055132.N(class072092);
        class05513 class055133 = class055132.P();
        if (class055133 == null) {
            return Optional.empty();
        }
        class055133.N(1);
        class00734 class007342 = class055132.R().R();
        this.M = this.M.y(class007342);
        this.B.y((int)class007342.y() + 5, 0, 0);
        if ((float)this.B.method_10263() > this.U) {
            this.U = this.B.method_10263();
        }
        if (++this.R >= this.i) {
            this.R = 0;
            this.B.y(0, 0, (int)this.M.u() + 6);
            this.B.method_20787(this.Z.method_10263());
            this.M = new class00734((class07209)this.B);
        }
        this.E.add(class055132);
        return Optional.of(class055132);
    }
}

