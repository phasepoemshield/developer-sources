/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.terraformersmc.modmenu.mixin.AccessorGridWidget
 *  minecraft.class02068
 *  minecraft.class02072
 *  minecraft.class02080
 *  minecraft.class02084
 *  minecraft.class02102
 *  minecraft.class07536
 */
package minecraft;

import com.terraformersmc.modmenu.mixin.AccessorGridWidget;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class02040;
import minecraft.class02068;
import minecraft.class02072;
import minecraft.class02080;
import minecraft.class02084;
import minecraft.class02102;
import minecraft.class07536;

public class class02060
extends class02040
implements AccessorGridWidget {
    private final List<class02102> L = new ArrayList<class02102>();
    private final List<class02068> u = new ArrayList<class02068>();
    private final class02072 i = class02072.Z();
    private int R = 0;
    private int M = 0;

    public /* synthetic */ List getChildren() {
        return this.L;
    }

    public class02060 L(int n) {
        return this.N(n).y(n);
    }

    public class02072 L() {
        return this.i;
    }

    public class02060() {
        this(0, 0);
    }

    public class02060(int n, int n2) {
        super(n, n2, 0, 0);
    }

    public class02080 u(int n) {
        return new class02080(this, n);
    }

    public class02072 y() {
        return this.i.M();
    }

    public class02060 y(int n) {
        this.R = n;
        return this;
    }

    public <T extends class02102> T N(T t, int n, int n2, int n3, int n4, Consumer<class02072> consumer) {
        return this.N(t, n, n2, n3, n4, (class02072)class07536.N((Object)this.y(), consumer));
    }

    public void N(Consumer<class02102> consumer) {
        this.L.forEach(consumer);
    }

    public void N() {
        int n;
        int n2;
        int n3;
        Object object32;
        Object object222;
        super.N();
        int n4 = 0;
        int n5 = 0;
        for (Object object222 : this.u) {
            n4 = Math.max(object222.L(), n4);
            n5 = Math.max(object222.u(), n5);
        }
        int[] nArray = new int[n5 + 1];
        object222 = new int[n4 + 1];
        for (Object object32 : this.u) {
            n3 = object32.N() - (object32.i - 1) * this.R;
            class02084 class020842 = new class02084(n3, object32.i);
            for (n2 = object32.L; n2 <= object32.L(); ++n2) {
                object222[n2] = (class02068)Math.max((int)object222[n2], class020842.nextInt());
            }
            n2 = object32.y() - (object32.R - 1) * this.M;
            class02084 class020843 = new class02084(n2, object32.R);
            for (n = object32.u; n <= object32.u(); ++n) {
                nArray[n] = Math.max(nArray[n], class020843.nextInt());
            }
        }
        int[] nArray2 = new int[n5 + 1];
        object32 = new int[n4 + 1];
        nArray2[0] = 0;
        for (n3 = 1; n3 <= n5; ++n3) {
            nArray2[n3] = nArray2[n3 - 1] + nArray[n3 - 1] + this.M;
        }
        object32[0] = (class02068)false;
        for (n3 = 1; n3 <= n4; ++n3) {
            object32[n3] = object32[n3 - 1] + object222[n3 - 1] + this.R;
        }
        for (class02068 class020682 : this.u) {
            int n6;
            n2 = 0;
            for (n6 = class020682.u; n6 <= class020682.u(); ++n6) {
                n2 += nArray[n6];
            }
            class020682.N(this.method_46426() + nArray2[class020682.u], n2 += this.M * (class020682.R - 1));
            n6 = 0;
            for (n = class020682.L; n <= class020682.L(); ++n) {
                n6 += object222[n];
            }
            class020682.y(this.method_46427() + object32[class020682.L], n6 += this.R * (class020682.i - 1));
        }
        this.N = nArray2[n5] + nArray[n5];
        this.y = (int)(object32[n4] + object222[n4]);
    }

    public <T extends class02102> T N(T t, int n, int n2, Consumer<class02072> consumer) {
        return this.N(t, n, n2, 1, 1, (class02072)class07536.N((Object)this.y(), consumer));
    }

    public <T extends class02102> T N(T t, int n, int n2, int n3, int n4) {
        return this.N(t, n, n2, n3, n4, this.y());
    }

    public <T extends class02102> T N(T t, int n, int n2, int n3, int n4, class02072 class020722) {
        if (n3 < 1) {
            throw new IllegalArgumentException("Occupied rows must be at least 1");
        }
        if (n4 < 1) {
            throw new IllegalArgumentException("Occupied columns must be at least 1");
        }
        this.u.add(new class02068(t, n, n2, n3, n4, class020722));
        this.L.add(t);
        return t;
    }

    public <T extends class02102> T N(T t, int n, int n2) {
        return this.N(t, n, n2, this.y());
    }

    public class02060 N(int n) {
        this.M = n;
        return this;
    }

    public <T extends class02102> T N(T t, int n, int n2, class02072 class020722) {
        return this.N(t, n, n2, 1, 1, class020722);
    }
}

