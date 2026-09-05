/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01777
 *  minecraft.class03249
 *  minecraft.class03255
 *  minecraft.class03428
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class05220
 *  minecraft.class06202
 *  minecraft.class06478
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import minecraft.class00104;
import minecraft.class01054;
import minecraft.class01777;
import minecraft.class03249;
import minecraft.class03255;
import minecraft.class03428;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class05220;
import minecraft.class06202;
import minecraft.class06478;
import org.jspecify.annotations.Nullable;

class class00131
extends class01777 {
    private final class06202 y;
    private final List<class06478> L;
    final /* synthetic */ class00104 N;

    public class00131(class00104 class001042, class06202 class062022, int n, int n2) {
        this.N = class001042;
        super(0, 0, n, n2, class05220.N);
        this.L = new ArrayList<class06478>();
        this.y = class062022;
        class001042.N.method_48206(this.L::add);
    }

    public class03255 N_49(class03249 class032492) {
        return new class03255(this.method_46426(), this.method_46427(), this.field_22758, this.method_44395());
    }

    public List<? extends class04654> method_25396() {
        return this.L;
    }

    public void method_25395(@Nullable class04654 class046542) {
        super.method_25395(class046542);
        if (class046542 == null || !this.y.Nc().y()) {
            return;
        }
        class03255 class032552 = this.method_48202();
        class03255 class032553 = class046542.method_48202();
        int n = class032553.y() - class032552.y();
        int n2 = class032553.L() - class032552.L();
        if (n < 0) {
            this.method_44382(this.method_44387() + (double)n - 14.0);
        } else if (n2 > 0) {
            this.method_44382(this.method_44387() + (double)n2 + 14.0);
        }
    }

    public void method_46419(int n) {
        super.method_46419(n);
        this.N.N.method_46419(n - (int)this.method_44387());
    }

    public void method_46421(int n) {
        super.method_46421(n);
        this.N.N.method_46421(n + 10);
    }

    public Collection<? extends class03434> e_() {
        return this.L;
    }

    public void method_44382(double d) {
        super.method_44382(d);
        this.N.N.method_46419(this.method_48202().y() - (int)this.method_44387());
    }

    protected void method_47399(class03428 class034282) {
    }

    protected void method_48579(class01054 class010542, int n, int n2, float f) {
        class010542.L(this.method_46426(), this.method_46427(), this.method_46426() + this.field_22758, this.method_46427() + this.field_22759);
        Iterator<class06478> var5 = this.L.iterator();
        while (var5.hasNext()) {
            var5.next().method_25394(class010542, n, n2, f);
        }
        class010542.R();
        this.method_44396(class010542, n, n2);
    }

    protected int method_44395() {
        return this.N.N.method_25364();
    }

    protected double method_44393() {
        return 10.0;
    }
}

