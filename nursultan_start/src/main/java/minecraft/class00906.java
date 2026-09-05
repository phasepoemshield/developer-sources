/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.floats.Float2FloatFunction
 *  minecraft.class00379
 *  minecraft.class06029
 *  minecraft.class07274
 */
package minecraft;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import minecraft.class00379;
import minecraft.class06029;
import minecraft.class07274;

class class00906
implements class06029<class00379, Float2FloatFunction> {
    final /* synthetic */ class07274 N;

    class00906(class07274 class072742) {
        this.N = class072742;
    }

    public Float2FloatFunction N(class00379 class003792, class00379 class003793) {
        return f -> Math.max(class003792.N(f), class003793.N(f));
    }

    public Float2FloatFunction y() {
        return arg_0 -> ((class07274)this.N).N(arg_0);
    }

    public Float2FloatFunction N(class00379 class003792) {
        return arg_0 -> ((class00379)class003792).N(arg_0);
    }
}

