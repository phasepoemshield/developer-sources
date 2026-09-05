/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  minecraft.class00500
 *  minecraft.class00783
 *  minecraft.class00869
 *  minecraft.class01210
 *  minecraft.class01763
 *  minecraft.class02682
 *  minecraft.class04425
 *  minecraft.class04604
 *  minecraft.class04995
 *  minecraft.class05847
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07322
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import minecraft.class00500;
import minecraft.class00783;
import minecraft.class00869;
import minecraft.class01210;
import minecraft.class01763;
import minecraft.class02682;
import minecraft.class04425;
import minecraft.class04604;
import minecraft.class04995;
import minecraft.class05847;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07322;

public abstract class class02119 {
    protected class02682 L;
    protected class07079 u;
    protected final Int2ObjectMap<class01763> i = new Int2ObjectOpenHashMap();
    protected int R;
    protected int M;
    protected int B;
    protected boolean Z = true;
    protected boolean z;
    protected boolean U;
    protected boolean E;

    protected class01763 L(int n, int n2, int n3) {
        return (class01763)this.i.computeIfAbsent(class01763.y((int)n, (int)n2, (int)n3), n4 -> new class01763(n, n2, n3));
    }

    public void L(boolean bl) {
        this.U = bl;
    }

    public boolean M() {
        return this.E;
    }

    public boolean i() {
        return this.z;
    }

    public void u(boolean bl) {
        this.E = bl;
    }

    public boolean u() {
        return this.Z;
    }

    protected class01763 u(class07209 class072092) {
        return this.L(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public class04425 y(class07079 class070792, class07209 class072092) {
        return this.N(new class02682((class07322)class070792.method_73183(), class070792), class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public void y(boolean bl) {
        this.z = bl;
    }

    protected class04604 y(double d, double d2, double d3) {
        return new class04604(this.L(class04995.N((double)d), class04995.N((double)d2), class04995.N((double)d3)));
    }

    public abstract class01763 y();

    public abstract class04425 N(class02682 var1, int var2, int var3, int var4);

    public void N() {
        this.L = null;
        this.u = null;
    }

    public void N(class00783 class007832, class07079 class070792) {
        this.L = new class02682((class07322)class007832, class070792);
        this.u = class070792;
        this.i.clear();
        this.R = class04995.y((float)(class070792.method_17681() + 1.0f));
        this.M = class04995.y((float)(class070792.method_17682() + 1.0f));
        this.B = class04995.y((float)(class070792.method_17681() + 1.0f));
    }

    public static boolean N(class00500 class005002) {
        return class005002.N(class01210.Nh) || class005002.N(class00869.V) || class005002.N(class00869.EI) || class05847.U((class00500)class005002) || class005002.N(class00869.MU);
    }

    public abstract class04425 N(class02682 var1, int var2, int var3, int var4, class07079 var5);

    public void N(boolean bl) {
        this.Z = bl;
    }

    public abstract int N(class01763[] var1, class01763 var2);

    public abstract class04604 N(double var1, double var3, double var5);

    public boolean R() {
        return this.U;
    }
}

