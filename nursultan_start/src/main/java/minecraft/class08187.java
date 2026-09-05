/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  minecraft.class01001
 *  minecraft.class01042
 *  minecraft.class01289
 *  minecraft.class01929
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02204
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05781
 *  minecraft.class05946
 *  minecraft.class06113
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07085
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07589
 *  minecraft.class07597
 *  minecraft.class08156
 *  minecraft.class08167
 *  minecraft.class08329
 *  minecraft.class08577
 *  minecraft.class08579
 *  minecraft.class08700
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Dynamic;
import java.util.Optional;
import minecraft.class01001;
import minecraft.class01042;
import minecraft.class01289;
import minecraft.class01929;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02204;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05781;
import minecraft.class05946;
import minecraft.class06113;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07085;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07589;
import minecraft.class07597;
import minecraft.class08156;
import minecraft.class08167;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08577;
import minecraft.class08579;
import minecraft.class08700;
import org.jspecify.annotations.Nullable;

public class class08187
extends class08156 {
    private static final class02131<class03556<class07589>> p = class03289.N(class08187.class, (class04383)class02154.O);

    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.NF);
        super.method_66649(class026662);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(p, (Object)class08577.N((class01042)this.method_56673(), (class05946)class07597.N));
    }

    protected class04891 method_5737() {
        return class04909.oM;
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class08577.N((class08329)class083292, this.o());
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.NF) {
            return (T)class08187.method_66651(class024772, (Object)new class02204(this.o()));
        }
        return (T)super.method_58694(class024772);
    }

    public boolean method_6109() {
        return false;
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        class08577.N((class08299)class082992, (class05946)class04227.Nx).ifPresent(this::N);
    }

    public class08187(class07078<? extends class08187> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public static class05300 I() {
        return class08156.B().N(class05298.l, (double)1.1f);
    }

    protected class07085 J() {
        return class07085.field_48824;
    }

    protected class04891 s() {
        return this.method_5869() ? class04909.JS : class04909.Jx;
    }

    protected class04891 l() {
        return this.method_5869() ? class04909.Jr : class04909.oN;
    }

    public class03556<class07589> o() {
        return (class03556)this.field_6011.N(p);
    }

    public boolean g() {
        return !this.Q() && !this.Y();
    }

    public void N(class03556<class07589> class035562) {
        this.field_6011.N(p, class035562);
    }

    public class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class08577.N((class08579)class08579.N((class01001)class010012, (class07209)this.method_24515()), (class05946)class04227.Nx).ifPresent(this::N);
        return super.N(class010012, class070522, class061132, class074462);
    }

    public @Nullable class08187 y(class04782 class047822, class07077 class070772) {
        return null;
    }

    protected void N(class04782 class047822) {
        class04643 class046432 = class08700.N();
        class046432.N("zombieNautilusBrain");
        this.method_18868().N(class047822, (class07438)this);
        class046432.L();
        class046432.N("zombieNautilusActivityUpdate");
        class08167.N((class08187)this);
        class046432.L();
        super.N(class047822);
    }

    protected void O() {
        this.method_56078(class04909.ou);
    }

    protected class04891 G() {
        return this.method_5869() ? class04909.JD : class04909.Jh;
    }

    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.NF) {
            Optional var3 = ((class02204)class08187.method_66651((class02477)class02484.NF, t)).N((class01929)this.method_56673());
            if (var3.isPresent()) {
                this.N((class03556<class07589>)((class03556)var3.get()));
                return true;
            }
            return false;
        }
        return super.method_66654(class024772, t);
    }

    public class05781<class08187> method_28306() {
        return class08167.N();
    }

    public class04891 method_6002() {
        return this.method_5869() ? class04909.oy : class04909.oL;
    }

    public class01289<class08187> method_18868() {
        return super.method_18868();
    }

    public class04891 method_6011(class07072 class070722) {
        return this.method_5869() ? class04909.oi : class04909.oR;
    }

    public class01289<?> method_18867(Dynamic<?> dynamic) {
        return class08167.N((class01289)this.method_28306().N(dynamic));
    }
}

