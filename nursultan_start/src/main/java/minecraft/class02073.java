/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.report.AbuseReportLimits
 *  com.mojang.datafixers.util.Either
 *  minecraft.class02043
 *  minecraft.class02044
 *  minecraft.class03380
 *  minecraft.class03409
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Either;
import java.util.UUID;
import minecraft.class02043;
import minecraft.class02044;
import minecraft.class02065;
import minecraft.class03380;
import minecraft.class03409;
import org.jspecify.annotations.Nullable;

public abstract class class02073<R extends class02065> {
    protected final R N;
    protected final AbuseReportLimits y;

    public @Nullable class02043 L() {
        if (!((class02065)this.i()).M) {
            return class02043.i;
        }
        return null;
    }

    public String M() {
        return ((class02065)this.N).i;
    }

    protected class02073(R r, AbuseReportLimits abuseReportLimits) {
        this.N = r;
        this.y = abuseReportLimits;
    }

    public boolean B() {
        return ((class02065)this.i()).M;
    }

    public @Nullable class03380 Z() {
        return ((class02065)this.N).R;
    }

    public R i() {
        return this.N;
    }

    public abstract boolean y();

    public void N(boolean bl) {
        ((class02065)this.N).M = bl;
    }

    public abstract Either<class02044, class02043> N(class03409 var1);

    public void N(class03380 class033802) {
        ((class02065)this.N).R = class033802;
    }

    public void N(String string) {
        ((class02065)this.N).i = string;
    }

    public UUID R() {
        return ((class02065)this.N).u;
    }
}

