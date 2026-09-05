/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01128
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02901
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06584
 *  minecraft.class06781
 *  minecraft.class06889
 *  minecraft.class06993
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07111
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  org.apache.commons.lang3.Validate
 */
package minecraft;

import java.util.Objects;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00717;
import minecraft.class00734;
import minecraft.class01128;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02901;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06584;
import minecraft.class06781;
import minecraft.class06889;
import minecraft.class06993;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07111;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import org.apache.commons.lang3.Validate;

public abstract class class00710
extends class02901 {
    private static final class02131<class07211> N = class03289.N(class00710.class, (class04383)class02154.T);
    private static final class07211 L = class07211.field_11035;

    protected class00734 L() {
        return this.method_5829().N(this.method_5735().B().mul(-0.5f)).B(1.0E-7);
    }

    public float method_5832(class06993 class069932) {
        class07211 class072112 = this.method_5735();
        if (class072112.z() != class07185.field_11052) {
            switch (class069932) {
                case field_11464: {
                    class072112 = class072112.b();
                    break;
                }
                case field_11465: {
                    class072112 = class072112.M();
                    break;
                }
                case field_11463: {
                    class072112 = class072112.R();
                    break;
                }
            }
            this.y(class072112);
        }
        float f = class04995.R((float)this.method_36454());
        return switch (class069932) {
            case class06993.field_11464 -> f + 180.0f;
            case class06993.field_11465 -> f + 90.0f;
            case class06993.field_11463 -> f + 270.0f;
            default -> f;
        };
    }

    public class07211 method_5735() {
        return (class07211)this.field_6011.N(N);
    }

    public float method_5763(class07111 class071112) {
        return this.method_5832(class071112.N(this.method_5735()));
    }

    public void method_5674(class02131<?> class021312) {
        super.method_5674(class021312);
        if (class021312.equals(N)) {
            this.y(this.method_5735());
        }
    }

    protected void method_5693(class04293 class042932) {
        class042932.N(N, (Object)L);
    }

    public class00717 method_5699(class04782 class047822, class06584 class065842, float f) {
        class00717 class007172 = new class00717(this.method_73183(), this.method_23317() + (double)((float)this.method_5735().P() * 0.15f), this.method_23318() + (double)f, this.method_23321() + (double)((float)this.method_5735().T() * 0.15f), class065842);
        class007172.L();
        this.method_73183().method_8649((class07049)class007172);
        return class007172;
    }

    protected class00710(class07078<? extends class00710> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    protected class00710(class07078<? extends class00710> class070782, class07299 class072992, class07209 class072092) {
        this(class070782, class072992);
        this.y = class072092;
    }

    public abstract void i();

    protected class00734 u() {
        return this.method_5829();
    }

    protected void y(class07211 class072112) {
        Objects.requireNonNull(class072112);
        Validate.isTrue((boolean)class072112.z().L());
        this.N(class072112);
        this.method_36456(class072112.u() * 90);
        this.field_5982 = this.method_36454();
        this.N();
    }

    public boolean y() {
        if (this.N(this.u())) {
            return false;
        }
        return class07209.method_29715((class00734)this.L()).allMatch(class072092 -> {
            class00500 class005002 = this.method_73183().method_8320(class072092);
            return class005002.B() || class06781.E((class00500)class005002);
        }) && this.N(false);
    }

    protected abstract class00734 N(class07209 var1, class07211 var2);

    protected boolean N(boolean bl) {
        Predicate<class00710> predicate = class007102 -> {
            boolean bl2 = !bl && class007102.method_5864() == this.method_5864();
            boolean bl3 = class007102.method_5735() == this.method_5735();
            return class007102 != this && (bl2 || bl3);
        };
        return !this.method_73183().method_74143(class01128.N(class00710.class), this.u(), predicate);
    }

    protected boolean N(class00734 class007342) {
        class07299 class072992 = this.method_73183();
        return !class072992.a_((class07049)this, class007342) || !class072992.L((class07049)this, class007342);
    }

    protected void N() {
        if (this.method_5735() == null) {
            return;
        }
        class00734 class007342 = this.N(this.y, this.method_5735());
        class06889 class068892 = class007342.R();
        this.method_23327(class068892.M, class068892.B, class068892.Z);
        this.method_5857(class007342);
    }

    protected void N(class07211 class072112) {
        this.field_6011.N(N, (Object)class072112);
    }
}

