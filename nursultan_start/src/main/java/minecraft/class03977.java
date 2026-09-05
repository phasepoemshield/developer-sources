/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10288
 *  minecraft.class00734
 *  minecraft.class00743
 *  minecraft.class01514
 *  minecraft.class02796
 *  minecraft.class04160
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04803
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06237
 *  minecraft.class06551
 *  minecraft.class06584
 *  minecraft.class06686
 *  minecraft.class06695
 *  minecraft.class06704
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class06925
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10288;
import java.util.Iterator;
import minecraft.class00734;
import minecraft.class00743;
import minecraft.class01514;
import minecraft.class02796;
import minecraft.class04160;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04803;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06237;
import minecraft.class06551;
import minecraft.class06584;
import minecraft.class06686;
import minecraft.class06695;
import minecraft.class06704;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class06925;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public interface class03977
extends class06237,
class06695 {
    default public class07082 L(class08036 class080362) {
        class080362.method_17355((class06237)this);
        return class07082.N;
    }

    public class07299 method_73183();

    public class00734 method_5829();

    public boolean method_31481();

    public class06889 method_73189();

    default public boolean i(class08036 class080362) {
        return !this.method_31481() && class080362.method_56092(this.method_5829(), 4.0);
    }

    public void m();

    public @Nullable class05946<class05074> U();

    default public void u(@Nullable class08036 class080362) {
        class02796 class027962 = this.method_73183().method_8503();
        if (this.U() != null && class027962 != null) {
            class05074 class050742 = class027962.yd().N(this.U());
            if (class080362 != null) {
                class06912.F.N((class04770)class080362, this.U());
            }
            this.N((class05946<class05074>)null);
            class04160 class041602 = new class04160((class04782)this.method_73183()).N(class06551.B, (Object)this.method_73189());
            if (class080362 != null) {
                class041602.N(class080362.method_7292()).N(class06551.N, (Object)class080362);
            }
            class050742.N((class06695)this, class041602.N(class06925.u), this.E());
        }
    }

    public long E();

    default public void N(int n, class06584 class065842) {
        this.u(null);
        this.W().set(n, (Object)class065842);
        class065842.R(this.a_(class065842));
    }

    default public class06584 N(int n, int n2) {
        this.u(null);
        return class06686.N(this.W(), (int)n, (int)n2);
    }

    default public void N(class07072 class070722, class04782 class047822, class07049 class070492) {
        if (!((Boolean)class047822.method_64395().N(class07305.U)).booleanValue()) {
            return;
        }
        class06704.N((class07299)class047822, (class07049)class070492, (class06695)this);
        class07049 class070493 = class070722.L();
        if (class070493 != null && class070493.method_5864() == class07078.Ly) {
            class01514.N((class04782)class047822, (class08036)((class08036)class070493), (boolean)true);
        }
    }

    public void N(long var1);

    default public void N(class08329 class083292) {
        if (this.U() != null) {
            class083292.N("LootTable", this.U().N().toString());
            if (this.E() != 0L) {
                class083292.N("LootTableSeed", this.E());
            }
        } else {
            class06686.N((class08329)class083292, this.W());
        }
    }

    public void N(@Nullable class05946<class05074> var1);

    default public boolean method_5442() {
        return this.i_();
    }

    public class00743<class06584> W();

    default public void a_(class08299 class082992) {
        this.m();
        class05946 var2 = class082992.N("LootTable", class05074.N).orElse(null);
        this.N((class05946<class05074>)var2);
        this.N(class082992.N("LootTableSeed", 0L));
        if (var2 == null) {
            class06686.N((class08299)class082992, this.W());
        }
    }

    default public class06584 a_(int n) {
        this.u(null);
        class06584 class065842 = (class06584)this.W().get(n);
        if (class065842.R()) {
            return class06584.E;
        }
        this.W().set(n, (Object)class06584.E);
        return class065842;
    }

    default public boolean i_() {
        Iterator var1 = this.W().iterator();
        while (var1.hasNext()) {
            if (((class06584)var1.next()).R()) continue;
            return false;
        }
        return true;
    }

    default public class06584 b_(int n) {
        this.u(null);
        return (class06584)this.W().get(n);
    }

    default public @Nullable class04803 c_(int n) {
        if (n >= 0 && n < this.method_5439()) {
            return new class10288(this, n);
        }
        return null;
    }

    default public void h_() {
        this.u(null);
        this.W().clear();
    }
}

