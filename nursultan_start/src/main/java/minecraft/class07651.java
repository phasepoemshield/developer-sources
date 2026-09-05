/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00143
 *  minecraft.class00737
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00143;
import minecraft.class00737;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07655;
import org.jspecify.annotations.Nullable;

public class class07651
extends class07655 {
    private @Nullable class07209 N;

    public class07651(class07079 class070792, class07299 class072992) {
        super(class070792, class072992);
    }

    @Override
    public void N() {
        if (this.U()) {
            if (this.N != null) {
                if (this.N.method_19769((class00737)this.y.method_73189(), (double)this.y.method_17681()) || this.y.method_23318() > (double)this.N.method_10264() && class07209.method_49637((double)this.N.method_10263(), (double)this.y.method_23318(), (double)this.N.method_10260()).method_19769((class00737)this.y.method_73189(), (double)this.y.method_17681())) {
                    this.N = null;
                } else {
                    this.y.F().N((double)this.N.method_10263(), (double)this.N.method_10264(), (double)this.N.method_10260(), this.i);
                }
            }
            return;
        }
        super.N();
    }

    @Override
    public boolean N(class07049 class070492, double d) {
        class00143 class001432 = this.N(class070492, 0);
        if (class001432 != null) {
            return this.N(class001432, d);
        }
        this.N = class070492.method_24515();
        this.i = d;
        return true;
    }

    @Override
    public class00143 N(class07049 class070492, int n) {
        this.N = class070492.method_24515();
        return super.N(class070492, n);
    }

    @Override
    public class00143 N(class07209 class072092, int n) {
        this.N = class072092;
        return super.N(class072092, n);
    }
}

