/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00743
 *  minecraft.class03977
 *  minecraft.class04782
 *  minecraft.class04803
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06704
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07062
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.caffeinemc.mods.lithium.api.inventory.LithiumInventory
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00743;
import minecraft.class03977;
import minecraft.class04782;
import minecraft.class04803;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06704;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07062;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class07504;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08299;
import minecraft.class08329;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import org.jspecify.annotations.Nullable;

public abstract class class07477
extends class07504
implements class03977,
LithiumInventory {
    private class00743<class06584> y = class00743.method_10213((int)36, (Object)class06584.E);
    private @Nullable class05946<class05074> u;
    private long B;

    public class04803 method_32318(int n) {
        return this.c_(n);
    }

    public void method_5650(class07062 class070622) {
        if (!this.method_73183().method_8608() && class070622.N()) {
            class06704.N((class07299)this.method_73183(), (class07049)this, (class06695)this);
        }
        super.method_5650(class070622);
    }

    @Override
    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        this.N(class083292);
    }

    public class07082 method_5688(class08036 class080362, class07050 class070502) {
        return this.L(class080362);
    }

    @Override
    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.a_(class082992);
    }

    protected class07477(class07078<?> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public void m() {
        this.y = class00743.method_10213((int)this.method_5439(), (Object)class06584.E);
    }

    public @Nullable class05946<class05074> U() {
        return this.u;
    }

    public long E() {
        return this.B;
    }

    @Override
    protected class06889 N(class06889 class068892) {
        float f = 0.98f;
        if (this.u == null) {
            int n = 15 - class07482.L((class06695)this);
            f += (float)n * 0.001f;
        }
        if (this.method_5799()) {
            f *= 0.95f;
        }
        return class068892.u((double)f, 0.0, (double)f);
    }

    public void N(long l) {
        this.B = l;
    }

    public void N(@Nullable class05946<class05074> class059462) {
        this.u = class059462;
    }

    protected abstract class07482 N(int var1, class08044 var2);

    public void N(class05946<class05074> class059462, long l) {
        this.u = class059462;
        this.B = l;
    }

    public void N(class04782 class047822, class07072 class070722) {
        super.N(class047822, class070722);
        this.N(class070722, class047822, (class07049)this);
    }

    public boolean method_5443(class08036 class080362) {
        return this.i(class080362);
    }

    public void method_5448() {
        this.h_();
    }

    public void method_5447(int n, class06584 class065842) {
        this.N(n, class065842);
    }

    public void method_5431() {
    }

    public class06584 method_5434(int n, int n2) {
        return this.N(n, n2);
    }

    public class06584 method_5441(int n) {
        return this.a_(n);
    }

    public class00743<class06584> W() {
        return this.y;
    }

    public @Nullable class07482 createMenu(int n, class08044 class080442, class08036 class080362) {
        if (this.u == null || !class080362.method_7325()) {
            this.u(class080442.z);
            return this.N(n, class080442);
        }
        return null;
    }

    public class06584 method_5438(int n) {
        return this.b_(n);
    }

    public /* synthetic */ void setInventoryLithium(class00743 class007432) {
        this.y = class007432;
    }

    public /* synthetic */ class00743 getInventoryLithium() {
        return this.y;
    }
}

