/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00608
 *  minecraft.class01484
 *  minecraft.class01514
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02484
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04425
 *  minecraft.class04782
 *  minecraft.class05459
 *  minecraft.class07047
 *  minecraft.class07055
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07150
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08234
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00608;
import minecraft.class01484;
import minecraft.class01514;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02484;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04425;
import minecraft.class04782;
import minecraft.class05459;
import minecraft.class07047;
import minecraft.class07055;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07150;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08234;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public abstract class class01238
extends class07150 {
    protected static final class02131<Boolean> L = class03289.N(class01238.class, (class04383)class02154.U);
    public static final int u = 300;
    private static final boolean N = false;
    private static final boolean y = true;
    private static final int R = 0;
    protected int i = 0;

    public void L(class04782 class047822) {
        this.N(class07078.LN, class08234.N((class07079)this, (boolean)true, (boolean)true), class071822 -> class071822.method_6092(new class07055(class07047.Z, 200, 0)));
    }

    private void M() {
        if (class05459.N((class07079)this)) {
            this.f().y(true);
        }
    }

    public @Nullable class07438 T() {
        return this.S();
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(L, (Object)false);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("IsImmuneToZombification", this.t());
        class083292.N("TimeInOverworld", this.i);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.L(class082992.N("CanPickUpLoot", true));
        this.B(class082992.N("IsImmuneToZombification", false));
        this.i = class082992.N("TimeInOverworld", 0);
    }

    public class01238(class07078<? extends class01238> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.L(true);
        this.M();
        this.N(class04425.field_9, 16.0f);
        this.N(class04425.field_3, -1.0f);
    }

    protected abstract boolean B();

    public void B(boolean bl) {
        this.method_5841().N(L, (Object)bl);
    }

    public void D() {
        if (class01514.L((class01238)this)) {
            super.D();
        }
    }

    public boolean l() {
        return !this.method_6109();
    }

    protected boolean d() {
        return this.method_6047().L(class02484.O);
    }

    protected boolean t() {
        return (Boolean)this.method_5841().N(L);
    }

    protected abstract void v();

    public abstract class01484 E();

    public void N(class04782 class047822) {
        super.N(class047822);
        this.i = this.G() ? ++this.i : 0;
        if (this.i > 300) {
            this.v();
            this.L(class047822);
        }
    }

    public void N(int n) {
        this.i = n;
    }

    public boolean G() {
        return !this.t() && !this.Nt() && (Boolean)this.method_73183().method_75728().N(class00608.K, this.method_73189()) != false;
    }
}

