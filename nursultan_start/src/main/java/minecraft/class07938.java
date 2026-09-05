/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class07389
 *  minecraft.class07393
 *  minecraft.class07945
 *  minecraft.class07946
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Function;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class07389;
import minecraft.class07393;
import minecraft.class07909;
import minecraft.class07920;
import minecraft.class07929;
import minecraft.class07931;
import minecraft.class07936;
import minecraft.class07941;
import minecraft.class07943;
import minecraft.class07945;
import minecraft.class07946;
import org.jspecify.annotations.Nullable;

public class class07938<Params, Result> {
    private String N = "";
    private @Nullable class07920<Params> y;
    private @Nullable class07941<Result> L;
    private boolean u = true;
    private boolean i = true;
    private @Nullable class07936<Result> R;
    private @Nullable class07929<Params, Result> M;

    public class07945<Params, Result> L() {
        if (this.L == null) {
            throw new IllegalStateException("No response defined");
        }
        class07946 class079462 = new class07946(this.i, this.u);
        class07931<Params, Result> class079312 = new class07931<Params, Result>(this.N, this.y, this.L);
        if (this.R != null) {
            return new class07909<Params, Result>(class079312, class079462, this.R);
        }
        if (this.M != null) {
            if (this.y == null) {
                throw new IllegalStateException("No param schema defined");
            }
            return new class07943<Params, Result>(class079312, class079462, this.M);
        }
        throw new IllegalStateException("No method defined");
    }

    public class07938(class07936<Result> class079362) {
        this.R = class079362;
    }

    public class07938(Function<class07393, Result> function) {
        this.R = (class073932, class074032) -> function.apply(class073932);
    }

    public class07938(class07929<Params, Result> class079292) {
        this.M = class079292;
    }

    public class07938<Params, Result> y() {
        this.i = false;
        return this;
    }

    public class07938<Params, Result> y(String string, class07389<Params> class073892) {
        this.y = new class07920(string, class073892.y());
        return this;
    }

    private class07945<?, ?> N(class00751<class07945<?, ?>> class007512, class01894 class018942) {
        return (class07945)class00751.N(class007512, (class01894)class018942, this.L());
    }

    public class07945<?, ?> N(class00751<class07945<?, ?>> class007512, String string) {
        return this.N(class007512, class01894.y((String)string));
    }

    public class07938<Params, Result> N() {
        this.u = false;
        return this;
    }

    public class07938<Params, Result> N(String string, class07389<Result> class073892) {
        this.L = new class07941(string, class073892.y());
        return this;
    }

    public class07938<Params, Result> N(String string) {
        this.N = string;
        return this;
    }
}

