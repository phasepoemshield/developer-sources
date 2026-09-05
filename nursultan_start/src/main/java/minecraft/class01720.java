/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01194
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02484
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07307
 *  minecraft.class07310
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class01194;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02484;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07307;
import minecraft.class07310;
import minecraft.class08036;

public abstract class class01720
extends class07049 {
    protected static final class02131<Integer> i = class03289.N(class01720.class, (class04383)class02154.y);
    protected static final class02131<Integer> R = class03289.N(class01720.class, (class04383)class02154.y);
    protected static final class02131<Float> M = class03289.N(class01720.class, (class04383)class02154.u);

    public void L(int n) {
        this.field_6011.N(R, (Object)n);
    }

    public boolean method_5659(class07307 class073072) {
        return class073072.L() instanceof class07079 && (Boolean)class073072.N().method_64395().N(class07305.I) == false;
    }

    protected void method_5693(class04293 class042932) {
        class042932.N(i, (Object)0);
        class042932.N(R, (Object)1);
        class042932.N(M, (Object)Float.valueOf(0.0f));
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        boolean bl;
        if (this.method_31481()) {
            return true;
        }
        if (this.method_64421(class070722)) {
            return false;
        }
        this.L(-this.l());
        this.y(10);
        this.method_5785();
        this.y(this.t() + f * 10.0f);
        this.method_32875((class03556)class01194.P, class070722.u());
        class07049 class070492 = class070722.u();
        boolean bl2 = bl = class070492 instanceof class08036 && ((class08036)class070492).method_31549().u;
        if (!bl && this.t() > 40.0f || this.y(class070722)) {
            this.N(class047822, class070722);
        } else if (bl) {
            this.method_31472();
        }
        return true;
    }

    public int method_5806() {
        return 10;
    }

    public boolean method_5643(class07072 class070722) {
        return true;
    }

    public class01720(class07078<?> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public int l() {
        return (Integer)this.field_6011.N(R);
    }

    public float t() {
        return ((Float)this.field_6011.N(M)).floatValue();
    }

    protected abstract class06581 z();

    public void y(int n) {
        this.field_6011.N(i, (Object)n);
    }

    protected boolean y(class07072 class070722) {
        return false;
    }

    public void y(float f) {
        this.field_6011.N(M, (Object)Float.valueOf(f));
    }

    protected void N(class04782 class047822, class07072 class070722) {
        this.N(class047822, this.z());
    }

    public void N(class04782 class047822, class06581 class065812) {
        this.method_5768(class047822);
        if (!((Boolean)class047822.method_64395().N(class07305.U)).booleanValue()) {
            return;
        }
        class06584 class065842 = new class06584((class07310)class065812);
        class065842.N(class02484.B, (Object)this.method_5797());
        this.method_5775(class047822, class065842);
    }

    public int G() {
        return (Integer)this.field_6011.N(i);
    }
}

