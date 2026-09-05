/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00265
 *  minecraft.class00299
 *  minecraft.class00302
 *  minecraft.class00307
 *  minecraft.class00326
 *  minecraft.class00330
 *  minecraft.class01929
 *  minecraft.class02754
 *  minecraft.class02903
 *  minecraft.class03762
 *  minecraft.class04493
 *  minecraft.class05857
 *  minecraft.class06510
 *  minecraft.class06514
 *  minecraft.class06570
 *  minecraft.class06584
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.Optional;
import minecraft.class00265;
import minecraft.class00299;
import minecraft.class00302;
import minecraft.class00307;
import minecraft.class00326;
import minecraft.class00330;
import minecraft.class01929;
import minecraft.class02754;
import minecraft.class02903;
import minecraft.class03762;
import minecraft.class04493;
import minecraft.class05857;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class07329
implements class05857 {
    final class04493 N;
    final class06584 y;
    final String L;
    final class03762 u;
    final boolean i;
    private @Nullable class02754 Z;

    public boolean L() {
        return this.i;
    }

    public int M() {
        return this.N.N();
    }

    public class07329(String string, class03762 class037622, class04493 class044932, class06584 class065842, boolean bl) {
        this.L = string;
        this.u = class037622;
        this.N = class044932;
        this.y = class065842;
        this.i = bl;
    }

    public class07329(String string, class03762 class037622, class04493 class044932, class06584 class065842) {
        this(string, class037622, class044932, class065842, true);
    }

    public int B() {
        return this.N.y();
    }

    public String y() {
        return this.L;
    }

    public class06584 method_8116(class02903 class029032, class01929 class019292) {
        return this.y.t();
    }

    public List<class00265> N() {
        return List.of(new class00326(this.N.N(), this.N.y(), this.N.L().stream().map(optional -> optional.map(class06510::method_64673).orElse((class00299)class00307.L)).toList(), (class00299)new class00302(this.y), (class00299)new class00330(class06570.Rn)));
    }

    public boolean method_8115(class02903 class029032, class07299 class072992) {
        return this.N.N(class029032);
    }

    public class06514<? extends class07329> method_8119() {
        return class06514.y;
    }

    public class02754 method_61671() {
        if (this.Z == null) {
            this.Z = class02754.N((List)this.N.L());
        }
        return this.Z;
    }

    public class03762 method_45441() {
        return this.u;
    }

    public List<Optional<class06510>> R() {
        return this.N.L();
    }
}

