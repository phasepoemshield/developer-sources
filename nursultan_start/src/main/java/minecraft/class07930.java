/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class03529
 *  minecraft.class04206
 *  minecraft.class07389
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00751;
import minecraft.class01894;
import minecraft.class03529;
import minecraft.class04206;
import minecraft.class07389;
import minecraft.class07920;
import minecraft.class07924;
import minecraft.class07927;
import minecraft.class07931;
import minecraft.class07940;
import minecraft.class07941;
import org.jspecify.annotations.Nullable;

public class class07930<Params, Result> {
    public static final class07924 N = new class07924(true);
    private final class07927<Params, Result> y;
    private String L = "";
    private @Nullable class07920<Params> u;
    private @Nullable class07941<Result> i;

    public class07930(class07927<Params, Result> class079272) {
        this.y = class079272;
    }

    public class03529<class07940<Params, Result>> y(String string) {
        return this.N(class01894.y((String)("notification/" + string)));
    }

    public class07930<Params, Result> y(String string, class07389<Params> class073892) {
        this.u = new class07920<Params>(string, class073892);
        return this;
    }

    private class03529<class07940<Params, Result>> N(class01894 class018942) {
        return class00751.y((class00751)class04206.NO, (class01894)class018942, this.N());
    }

    private class07940<Params, Result> N() {
        class07931<Params, Result> class079312 = new class07931<Params, Result>(this.L, this.u, this.i);
        return this.y.create(class079312, N);
    }

    public class07930<Params, Result> N(String string, class07389<Result> class073892) {
        this.i = new class07941<Result>(string, class073892);
        return this;
    }

    public class07930<Params, Result> N(String string) {
        this.L = string;
        return this;
    }
}

