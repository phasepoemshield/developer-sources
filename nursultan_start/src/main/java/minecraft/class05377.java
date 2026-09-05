/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03556
 *  minecraft.class07209
 */
package minecraft;

import java.util.Objects;
import minecraft.class03556;
import minecraft.class05342;
import minecraft.class05369;
import minecraft.class07209;

public class class05377 {
    private final class07209 N;
    private final class03556<class05369> y;
    private int L;
    private final Runnable u;

    public boolean L() {
        if (this.L <= 0) {
            return false;
        }
        --this.L;
        this.u.run();
        return true;
    }

    public class07209 M() {
        return this.N;
    }

    class05377(class07209 class072092, class03556<class05369> class035562, int n, Runnable runnable) {
        this.N = class072092.method_10062();
        this.y = class035562;
        this.L = n;
        this.u = runnable;
    }

    public class05377(class07209 class072092, class03556<class05369> class035562, Runnable runnable) {
        this(class072092, class035562, ((class05369)((Object)class035562.N())).y(), runnable);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        return Objects.equals(this.N, ((class05377)object).N);
    }

    public int hashCode() {
        return this.N.hashCode();
    }

    public class03556<class05369> B() {
        return this.y;
    }

    public boolean i() {
        return this.L > 0;
    }

    protected boolean u() {
        if (this.L >= ((class05369)((Object)this.y.N())).y()) {
            return false;
        }
        ++this.L;
        this.u.run();
        return true;
    }

    @Deprecated
    public int y() {
        return this.L;
    }

    public class05342 N() {
        return new class05342(this.N, this.y, this.L);
    }

    public boolean R() {
        return this.L != ((class05369)((Object)this.y.N())).y();
    }
}

