/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01032
 *  minecraft.class01042
 *  minecraft.class01210
 *  minecraft.class01231
 *  minecraft.class01599
 *  minecraft.class01929
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02953
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04684
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05487
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class05946
 *  minecraft.class06344
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06785
 *  minecraft.class06889
 *  minecraft.class06942
 *  minecraft.class07001
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07065
 *  minecraft.class07072
 *  minecraft.class07074
 *  minecraft.class07078
 *  minecraft.class07113
 *  minecraft.class07204
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07259
 *  minecraft.class07276
 *  minecraft.class07280
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07310
 *  minecraft.class07451
 *  minecraft.class07804
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08303
 *  minecraft.class08308
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01032;
import minecraft.class01042;
import minecraft.class01210;
import minecraft.class01231;
import minecraft.class01599;
import minecraft.class01929;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02953;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04684;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05487;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class05946;
import minecraft.class06344;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06785;
import minecraft.class06889;
import minecraft.class06942;
import minecraft.class07001;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07065;
import minecraft.class07072;
import minecraft.class07074;
import minecraft.class07078;
import minecraft.class07113;
import minecraft.class07204;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07259;
import minecraft.class07276;
import minecraft.class07280;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07310;
import minecraft.class07451;
import minecraft.class07804;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08303;
import minecraft.class08308;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00701
extends class07049 {
    private static final Logger R = LogUtils.getLogger();
    private static final class00500 M = class00869.e.W();
    private static final int B = 0;
    private static final float Z = 0.0f;
    private static final int z = 40;
    private static final boolean U = true;
    private static final boolean E = false;
    private class00500 W = M;
    public int N = 0;
    public boolean y = true;
    private boolean m = false;
    private boolean P;
    private int s = 40;
    private float T = 0.0f;
    public @Nullable class07001 L;
    public boolean u;
    protected static final class02131<class07209> i = class03289.N(class00701.class, (class04383)class02154.P);

    public class00500 L() {
        return this.W;
    }

    public boolean method_5862() {
        return false;
    }

    public void method_31471(class07276 class072762) {
        super.method_31471(class072762);
        this.W = class00891.N((int)class072762.W());
        this.field_23807 = true;
        double d = class072762.u();
        double d2 = class072762.M();
        double d3 = class072762.B();
        this.method_5814(d, d2, d3);
        this.N(this.method_24515());
    }

    public class00381<class07280> method_18002(class01599 class015992) {
        return new class07276((class07049)this, class015992, class00891.W((class00500)this.L()));
    }

    protected void method_5693(class04293 class042932) {
        class042932.N(i, (Object)class07209.field_10980);
    }

    public void method_5773() {
        if (this.W.P()) {
            this.method_31472();
            return;
        }
        class00891 class008912 = this.W.i();
        ++this.N;
        this.method_56990();
        this.method_5784(class07451.field_6308, this.method_18798());
        this.method_61409();
        this.method_60698();
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if (this.method_5805() || this.u) {
                class00500 class005002;
                class072992 = this.method_24515();
                boolean bl = this.W.i() instanceof class06785;
                boolean bl2 = bl && this.method_73183().method_8316((class07209)class072992).N(class01231.N);
                double d = this.method_18798().B();
                if (bl && d > 1.0 && (class005002 = this.method_73183().N(new class05862(new class06889(this.field_6014, this.field_6036, this.field_5969), this.method_73189(), class05849.field_17558, class05835.field_1345, (class07049)this))).N() != class07113.field_1333 && this.method_73183().method_8316(class005002.u()).N(class01231.N)) {
                    class072992 = class005002.u();
                    bl2 = true;
                }
                if (this.method_24828() || bl2) {
                    class005002 = this.method_73183().method_8320((class07209)class072992);
                    this.method_18799(this.method_18798().u(0.7, -0.5, 0.7));
                    if (!class005002.N(class00869.LN)) {
                        if (!this.m) {
                            boolean bl3;
                            boolean bl4 = class005002.N((class06942)new class02953(this.method_73183(), (class07209)class072992, class07211.field_11033, class06584.E, class07211.field_11036));
                            boolean bl5 = class07204.U((class00500)this.method_73183().method_8320(class072992.method_10074())) && (!bl || !bl2);
                            boolean bl6 = bl3 = this.W.N((class05487)this.method_73183(), (class07209)class072992) && !bl5;
                            if (bl4 && bl3) {
                                if (this.W.y((class08092)class06665.q) && this.method_73183().method_8316((class07209)class072992).N() == class04684.L) {
                                    this.W = (class00500)this.W.y((class08092)class06665.q, (Comparable)Boolean.valueOf(true));
                                }
                                if (this.method_73183().method_8652((class07209)class072992, this.W, 3)) {
                                    class06344 class063442;
                                    class047822.method_14178().L.N((class07049)this, (class00381)new class07259((class07209)class072992, this.method_73183().method_8320((class07209)class072992)));
                                    this.method_31472();
                                    if (class008912 instanceof class06344) {
                                        class063442 = (class06344)class008912;
                                        class063442.N(this.method_73183(), (class07209)class072992, this.W, class005002, this);
                                    }
                                    if (this.L != null && this.W.k() && (class063442 = this.method_73183().method_8321((class07209)class072992)) != null) {
                                        try (class04495 class044952 = new class04495(class063442.J(), R);){
                                            class01042 class010422 = this.method_73183().method_30349();
                                            class08303 class083032 = class08303.N((class04490)class044952, (class01929)class010422);
                                            class063442.i((class08329)class083032);
                                            class07001 class070012 = class083032.y();
                                            this.L.N((string, class077092) -> class070012.N(string, class077092.N()));
                                            class063442.y_1(class08308.N((class04490)class044952, (class01929)class010422, (class07001)class070012));
                                        }
                                        catch (Exception exception) {
                                            R.error("Failed to load block entity from falling block", (Throwable)exception);
                                        }
                                        class063442.method_5431();
                                    }
                                } else if (this.y && ((Boolean)class047822.method_64395().N(class07305.U)).booleanValue()) {
                                    this.method_31472();
                                    this.N(class008912, (class07209)class072992);
                                    this.method_5706(class047822, (class07310)class008912);
                                }
                            } else {
                                this.method_31472();
                                if (this.y && ((Boolean)class047822.method_64395().N(class07305.U)).booleanValue()) {
                                    this.N(class008912, (class07209)class072992);
                                    this.method_5706(class047822, (class07310)class008912);
                                }
                            }
                        } else {
                            this.method_31472();
                            this.N(class008912, (class07209)class072992);
                        }
                    }
                } else if (this.N > 100 && (class072992.method_10264() <= this.method_73183().method_31607() || class072992.method_10264() > this.method_73183().method_31600()) || this.N > 600) {
                    if (this.y && ((Boolean)class047822.method_64395().N(class07305.U)).booleanValue()) {
                        this.method_5706(class047822, (class07310)class008912);
                    }
                    this.method_31472();
                }
            }
        }
        this.method_18799(this.method_18798().L(0.98));
    }

    public final boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        if (!this.method_64421(class070722)) {
            this.method_5785();
        }
        return false;
    }

    protected class07065 method_33570() {
        return class07065.field_28630;
    }

    public boolean method_5747(double d, float f, class07072 class070722) {
        class07072 class070723;
        if (!this.P) {
            return false;
        }
        int n = class04995.L((double)(d - 1.0));
        if (n < 0) {
            return false;
        }
        Predicate var6 = class07042.i.and(class07042.y);
        class00891 class008912 = this.W.i();
        if (class008912 instanceof class06344) {
            class06344 class063442 = (class06344)class008912;
            class070723 = class063442.N((class07049)this);
        } else {
            class070723 = this.method_48923().N((class07049)this);
        }
        class07072 class070724 = class070723;
        float f2 = Math.min(class04995.y((float)((float)n * this.T)), this.s);
        this.method_73183().method_8333((class07049)this, this.method_5829(), var6).forEach(class070492 -> class070492.method_64419(class070724, f2));
        boolean bl = this.W.N(class01210.V);
        if (bl && f2 > 0.0f && this.field_5974.z() < 0.05f + (float)n * 0.05f) {
            class00500 class005002 = class07804.Z((class00500)this.W);
            if (class005002 == null) {
                this.m = true;
            } else {
                this.W = class005002;
            }
        }
        return false;
    }

    protected double method_7490() {
        return 0.04;
    }

    protected void method_5652(class08329 class083292) {
        class083292.N("BlockState", class00500.N, (Object)this.W);
        class083292.N("Time", this.N);
        class083292.N("DropItem", this.y);
        class083292.N("HurtEntities", this.P);
        class083292.N("FallHurtAmount", this.T);
        class083292.N("FallHurtMax", this.s);
        if (this.L != null) {
            class083292.N("TileEntityData", class07001.N, (Object)this.L);
        }
        class083292.N("CancelDrop", this.m);
    }

    public boolean method_5863() {
        return !this.method_31481();
    }

    public void method_5819(class07074 class070742) {
        super.method_5819(class070742);
        class070742.N("Immitating BlockState", (Object)this.W.toString());
    }

    protected void method_5749(class08299 class082992) {
        this.W = class082992.N("BlockState", class00500.N).orElse(M);
        this.N = class082992.N("Time", 0);
        boolean bl = this.W.N(class01210.V);
        this.P = class082992.N("HurtEntities", bl);
        this.T = class082992.N("FallHurtAmount", 0.0f);
        this.s = class082992.N("FallHurtMax", 40);
        this.y = class082992.N("DropItem", true);
        this.L = class082992.N("TileEntityData", class07001.N).orElse(null);
        this.m = class082992.N("CancelDrop", false);
    }

    public @Nullable class07049 method_5731(class01032 class010322) {
        class05946 var2 = class010322.y().method_27983();
        class05946 var3 = this.method_73183().method_27983();
        boolean bl = (var3 == class07299.field_25181 || var2 == class07299.field_25181) && var3 != var2;
        class07049 class070492 = super.method_5731(class010322);
        this.u = class070492 != null && bl;
        return class070492;
    }

    public boolean method_5732() {
        return false;
    }

    protected class00392 method_23315() {
        return class00392.N((String)"entity.minecraft.falling_block_type", (Object[])new Object[]{this.W.i().M()});
    }

    public class00701(class07078<? extends class00701> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    private class00701(class07299 class072992, double d, double d2, double d3, class00500 class005002) {
        this((class07078<? extends class00701>)class07078.Ny, class072992);
        this.W = class005002;
        this.field_23807 = true;
        this.method_5814(d, d2, d3);
        this.method_18799(class06889.L);
        this.field_6014 = d;
        this.field_6036 = d2;
        this.field_5969 = d3;
        this.N(this.method_24515());
    }

    public void y() {
        this.m = true;
    }

    public void N(float f, int n) {
        this.P = true;
        this.T = f;
        this.s = n;
    }

    public void N(class07209 class072092) {
        this.field_6011.N(i, (Object)class072092);
    }

    public static class00701 N(class07299 class072992, class07209 class072092, class00500 class005002) {
        class00701 class007012 = new class00701(class072992, (double)class072092.method_10263() + 0.5, class072092.method_10264(), (double)class072092.method_10260() + 0.5, class005002.y((class08092)class06665.q) ? (class00500)class005002.y((class08092)class06665.q, (Comparable)Boolean.valueOf(false)) : class005002);
        class072992.method_8652(class072092, class005002.Y().B(), 3);
        class072992.method_8649((class07049)class007012);
        return class007012;
    }

    public void N(class00891 class008912, class07209 class072092) {
        if (class008912 instanceof class06344) {
            ((class06344)class008912).N(this.method_73183(), class072092, this);
        }
    }

    public class07209 N() {
        return (class07209)this.field_6011.N(i);
    }
}

