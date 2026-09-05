/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00717
 *  minecraft.class00753
 *  minecraft.class02484
 *  minecraft.class02699
 *  minecraft.class02706
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05216
 *  minecraft.class05266
 *  minecraft.class05845
 *  minecraft.class05856
 *  minecraft.class06237
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06889
 *  minecraft.class06984
 *  minecraft.class07049
 *  minecraft.class07109
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07482
 *  minecraft.class07701
 *  minecraft.class07703
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08092
 *  minecraft.class08152
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00717;
import minecraft.class00753;
import minecraft.class02484;
import minecraft.class02699;
import minecraft.class02706;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05216;
import minecraft.class05266;
import minecraft.class05845;
import minecraft.class05856;
import minecraft.class06100;
import minecraft.class06108;
import minecraft.class06127;
import minecraft.class06237;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06889;
import minecraft.class06984;
import minecraft.class07049;
import minecraft.class07109;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class07701;
import minecraft.class07703;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08092;
import minecraft.class08152;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class06119
extends class00394
implements class05266,
class06237 {
    public static final int N = 0;
    public static final int y = 1;
    public static final int L = 0;
    public static final int u = 1;
    private final class06695 M = new class06108(this);
    private final class05845 B = new class06100(this);
    class06584 i = class06584.E;
    int R;
    private int Z;

    public boolean L() {
        return this.i.L(class02484.Ny) || this.i.L(class02484.NL);
    }

    private static int L(class06584 class065842) {
        class02706 class027062 = (class02706)class065842.method_58694(class02484.NL);
        if (class027062 != null) {
            return class027062.N().size();
        }
        class02699 class026992 = (class02699)class065842.method_58694(class02484.Ny);
        if (class026992 != null) {
            return class026992.N().size();
        }
        return 0;
    }

    public int M() {
        return class04995.y((float)((this.Z > 1 ? (float)this.R() / ((float)this.Z - 1.0f) : 1.0f) * 14.0f)) + (this.L() ? 1 : 0);
    }

    public class00392 method_5476() {
        return class00392.L((String)"container.lectern");
    }

    public class06119(class07209 class072092, class00500 class005002) {
        super(class00404.field_16412, class072092, class005002);
    }

    void u() {
        this.R = 0;
        this.Z = 0;
        class06127.N(null, this.G(), this.d(), this.w(), false);
    }

    private class06584 y(class06584 class065842, @Nullable class08036 class080362) {
        class07299 class072992 = this.z;
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class02706.N((class06584)class065842, (class07701)this.N(class080362, class047822), (class08036)class080362);
        }
        return class065842;
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        if (!this.N().R()) {
            class083292.N("Book", class06584.y, (Object)this.N());
            class083292.N("Page", this.R);
        }
    }

    public void N(class07209 class072092, class00500 class005002) {
        if (((Boolean)class005002.L((class08092)class06127.u)).booleanValue() && this.z != null) {
            class07211 class072112 = (class07211)class005002.L(class06127.y);
            class06584 class065842 = this.N().t();
            float f = 0.25f * (float)class072112.P();
            float f2 = 0.25f * (float)class072112.T();
            class00717 class007172 = new class00717(this.z, (double)class072092.method_10263() + 0.5 + (double)f, (double)(class072092.method_10264() + 1), (double)class072092.method_10260() + 0.5 + (double)f2, class065842);
            class007172.L();
            this.z.method_8649((class07049)class007172);
        }
    }

    public void N(class06584 class065842) {
        this.N(class065842, null);
    }

    void N(int n) {
        int n2 = class04995.N((int)n, (int)0, (int)(this.Z - 1));
        if (n2 != this.R) {
            this.R = n2;
            this.method_5431();
            class06127.N(this.G(), this.d(), this.w());
        }
    }

    public class06584 N() {
        return this.i;
    }

    public void N(class06584 class065842, @Nullable class08036 class080362) {
        this.i = this.y(class065842, class080362);
        this.R = 0;
        this.Z = class06119.L(this.i);
        this.method_5431();
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.i = class082992.N("Book", class06584.y).map(class065842 -> this.y((class06584)class065842, null)).orElse(class06584.E);
        this.Z = class06119.L(this.i);
        this.R = class04995.N((int)class082992.N("Page", 0), (int)0, (int)(this.Z - 1));
    }

    private class07701 N(@Nullable class08036 class080362, class04782 class047822) {
        class05216 class052162;
        String string;
        if (class080362 == null) {
            string = "Lectern";
            class052162 = class00392.y((String)"Lectern");
        } else {
            string = class080362.method_74861();
            class052162 = class080362.method_5476();
        }
        class06889 class068892 = class06889.y((class00753)this.U);
        return new class07701(class07703.j_, class068892, class07109.N, class047822, (class08152)class06984.L, string, (class00392)class052162, class047822.method_8503(), (class07049)class080362);
    }

    public void method_5448() {
        this.N(class06584.E);
    }

    public int R() {
        return this.R;
    }

    public class07482 createMenu(int n, class08044 class080442, class08036 class080362) {
        return new class05856(n, this.M, this.B);
    }
}

