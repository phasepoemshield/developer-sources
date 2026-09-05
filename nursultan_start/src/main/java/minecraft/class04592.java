/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04922
 *  minecraft.class06581
 *  minecraft.class06918
 */
package minecraft;

import java.util.Comparator;
import minecraft.class04590;
import minecraft.class04611;
import minecraft.class04922;
import minecraft.class06581;
import minecraft.class06918;

class class04592
implements Comparator<class04590> {
    final /* synthetic */ class04611 N;

    class04592(class04611 class046112) {
        this.N = class046112;
    }

    @Override
    public int compare(class04590 class045902, class04590 class045903) {
        int n;
        int n2;
        class06581 class065812 = class045902.N();
        class06581 class065813 = class045903.N();
        if (this.N.u == null) {
            n2 = 0;
            n = 0;
        } else if (this.N.N.contains(this.N.u)) {
            class04922<?> var7 = this.N.u;
            n2 = class065812 instanceof class06918 ? this.N.R.B.N(var7, (Object)((class06918)class065812).L()) : -1;
            n = class065813 instanceof class06918 ? this.N.R.B.N(var7, (Object)((class06918)class065813).L()) : -1;
        } else {
            class04922<?> var7 = this.N.u;
            n2 = this.N.R.B.N(var7, (Object)class065812);
            n = this.N.R.B.N(var7, (Object)class065813);
        }
        if (n2 == n) {
            return this.N.i * Integer.compare(class06581.N((class06581)class065812), class06581.N((class06581)class065813));
        }
        return this.N.i * Integer.compare(n2, n);
    }
}

