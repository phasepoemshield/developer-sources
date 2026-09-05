/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02070
 *  minecraft.class02072
 *  minecraft.class02084
 *  minecraft.class02102
 *  minecraft.class07536
 */
package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class02040;
import minecraft.class02062;
import minecraft.class02070;
import minecraft.class02072;
import minecraft.class02084;
import minecraft.class02102;
import minecraft.class07536;

public class class02041
extends class02040 {
    private final class02062 L;
    private final List<class02070> u = new ArrayList<class02070>();
    private final class02072 i = class02072.Z();

    public class02072 L() {
        return this.i;
    }

    public class02041(int n, int n2, class02062 class020622) {
        this(0, 0, n, n2, class020622);
    }

    public class02041(int n, int n2, int n3, int n4, class02062 class020622) {
        super(n, n2, n3, n4);
        this.L = class020622;
    }

    public class02072 y() {
        return this.i.M();
    }

    public <T extends class02102> T N(T t, class02072 class020722) {
        this.u.add(new class02070(t, class020722));
        return t;
    }

    public <T extends class02102> T N(T t, Consumer<class02072> consumer) {
        return this.N(t, (class02072)class07536.N((Object)this.y(), consumer));
    }

    public <T extends class02102> T N(T t) {
        return this.N(t, this.y());
    }

    public void N(Consumer<class02102> consumer) {
        this.u.forEach(class020702 -> consumer.accept(class020702.N));
    }

    public void N() {
        super.N();
        if (this.u.isEmpty()) {
            return;
        }
        int n = 0;
        int n2 = this.L.y((class02102)this);
        for (class02070 class020702 : this.u) {
            n += this.L.N(class020702);
            n2 = Math.max(n2, this.L.y(class020702));
        }
        int n3 = this.L.N((class02102)this) - n;
        int n4 = this.L.L((class02102)this);
        Iterator<class02070> var5 = this.u.iterator();
        class02070 class020703 = var5.next();
        this.L.N(class020703, n4);
        n4 += this.L.N(class020703);
        if (this.u.size() >= 2) {
            class02084 class020842 = new class02084(n3, this.u.size() - 1);
            while (class020842.hasNext()) {
                class02070 class020704 = var5.next();
                this.L.N(class020704, n4 += class020842.nextInt());
                n4 += this.L.N(class020704);
            }
        }
        int n5 = this.L.u((class02102)this);
        for (class02070 class020705 : this.u) {
            this.L.N(class020705, n5, n2);
        }
        switch (this.L.ordinal()) {
            case 0: {
                this.y = n2;
                break;
            }
            case 1: {
                this.N = n2;
            }
        }
    }
}

