/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class07079
 */
package minecraft;

import minecraft.class04995;
import minecraft.class07079;
import minecraft.class07442;

public class class07450
extends class07442 {
    private final int N;
    private static final int Z = 10;
    private static final int z = 20;

    public class07450(class07079 class070792, int n) {
        super(class070792);
        this.N = n;
    }

    @Override
    public void N() {
        if (this.i > 0) {
            --this.i;
            this.Z().ifPresent(f -> {
                this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(this.N(this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue(), f.floatValue() + 20.0f, this.L));
            });
            this.B().ifPresent(f -> this.y.method_36457(this.N(this.y.method_36455(), f.floatValue() + 10.0f, this.u)));
        } else {
            if (this.y.f().U()) {
                this.y.method_36457(this.N(this.y.method_36455(), 0.0f, 5.0f));
            }
            this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(this.N(this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue(), this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue(), this.L));
        }
        float f2 = class04995.R((float)(this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue() - this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue()));
        if (f2 < (float)(-this.N)) {
            this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue() - 4.0f);
        } else if (f2 > (float)this.N) {
            this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(this.y.fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue() + 4.0f);
        }
    }
}

