/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11165
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11533
 *  Nursultan.class11536
 *  Nursultan.class12018
 *  Nursultan.class12020
 *  minecraft.class02484
 *  minecraft.class06584
 */
package Nursultan;

import Nursultan.class11165;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11533;
import Nursultan.class11536;
import Nursultan.class12018;
import Nursultan.class12020;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import minecraft.class02484;
import minecraft.class06584;

public class class11882
extends class11512
implements Predicate<class06584> {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public Object y_6;
    public boolean y_init;

    public boolean L(class06584 class065842) {
        this.W();
        return class06584.y((class06584)((class06584)this.y_5), (class06584)class065842);
    }

    public class12018 L() {
        this.W();
        return (class12018)this.N_0;
    }

    public boolean M() {
        this.W();
        return (Boolean)this.y_6;
    }

    public class11882(class06584 class065842, String string, String string2, class11165 class111652) {
        this.W();
        this.y_0 = class11524.N((class11512)this, (String)"auto-parser-include", (boolean)true);
        this.y_1 = class11524.N((class11512)this, (String)"max-price", (String)"0", (Pattern)Pattern.compile("^[1-9]\\d{0,18}$"));
        this.y_5 = class065842;
        this.N_0 = new class12018("autobuy.name").N(string);
        this.N_1 = string2;
        this.N_2 = class111652;
        this.y_2 = class11882.N(class11882.i(class065842), () -> class11524.N((class11512)this, (String)"min-count", (float)1.0f, (float)1.0f, (float)64.0f, (float)1.0f));
        this.y_3 = class11882.N(class065842.W(), () -> class11524.N((class11512)this, (String)"min-durability-percentage", (float)50.0f, (float)1.0f, (float)100.0f, (float)1.0f));
        this.y_4 = class11882.N(class11882.R(class065842), () -> class11524.N((class11512)this, (String)"ignore-thorns", (boolean)true));
    }

    public boolean equals(Object object) {
        this.W();
        if (!(object instanceof class11882)) {
            return false;
        }
        class11882 class118822 = (class11882)object;
        return ((class12018)this.N_0).equals((Object)((class12018)class118822.N_0));
    }

    public String toString() {
        this.W();
        return (String)this.N_1;
    }

    public int hashCode() {
        this.W();
        return ((class12018)this.N_0).hashCode();
    }

    public boolean B() {
        this.W();
        return (Boolean)((Optional)this.y_4).map(class11536::i).orElse(false);
    }

    public class11533 Z() {
        this.W();
        return (class11533)this.y_1;
    }

    public class11165 i() {
        this.W();
        return (class11165)this.N_2;
    }

    private static boolean i(class06584 class065842) {
        return class065842.y().N(class02484.L) && (Integer)class065842.method_58694(class02484.L) > 1;
    }

    public class06584 U() {
        this.W();
        return (class06584)this.y_5;
    }

    public void z() {
        this.W();
        this.y_6 = false;
        this.w().forEach((string, class115362) -> class115362.s());
    }

    public boolean u(class06584 class065842) {
        return true;
    }

    public class11507 u() {
        this.W();
        return (class11507)this.y_0;
    }

    @Override
    public boolean test(class06584 class065842) {
        return this.L(class065842) && this.u(class065842);
    }

    public String y() {
        this.W();
        return class12020.N((class12018)((class12018)this.N_0));
    }

    public int E() {
        this.W();
        return ((Optional)this.y_2).map(class115042 -> ((Float)class115042.i()).intValue()).orElse(1);
    }

    public class11882 N(boolean bl) {
        this.W();
        this.y_6 = bl;
        return this;
    }

    public class12018 N_7(String string) {
        return new class12018("autobuy.item").N(string);
    }

    private static <T> Optional<T> N(boolean bl, Supplier<T> supplier) {
        return bl ? Optional.of(supplier.get()) : Optional.empty();
    }

    public float N() {
        this.W();
        return ((Float)((Optional)this.y_3).map(class11536::i).orElse(Float.valueOf(1.0f))).floatValue();
    }

    public class11882 N(class06584 class065842) {
        this.W();
        this.y_5 = class065842;
        return this;
    }

    private void W() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_6 = false;
        }
    }

    public String R() {
        this.W();
        return (String)this.N_1;
    }

    private static boolean R(class06584 class065842) {
        return class065842.y().N(class02484.o) && class065842.y().N(class02484.q);
    }
}

