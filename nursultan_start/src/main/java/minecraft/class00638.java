/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00417
 *  minecraft.class00423
 *  minecraft.class02570
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07878
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00417;
import minecraft.class00423;
import minecraft.class00648;
import minecraft.class02570;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07878;

public interface class00638 {
    public class00648 y();

    public class00423 N();

    default public void N(class07080 class070802) {
        class07074 class070742 = class070802.N("Connection");
        class070742.N("Protocol", () -> this.y().N());
        class070742.N("Flow", () -> this.N().toString());
        this.N(class070802, class070742);
    }

    default public void N(class07080 class070802, class07074 class070742) {
    }

    default public class02570 N(class00392 class003922, Throwable throwable) {
        return new class02570(class003922);
    }

    public boolean method_48106();

    public void method_10839(class02570 var1);

    default public void method_59807(class00381 class003812, Exception exception) throws class07878 {
        throw class00417.N((Exception)exception, (class00381)class003812, (class00638)this);
    }

    default public boolean method_52413(class00381<?> class003812) {
        return this.method_48106();
    }
}

