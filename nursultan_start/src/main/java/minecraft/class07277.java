/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class02676
 *  minecraft.class02720
 *  minecraft.class03136
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06584
 *  minecraft.class07209
 *  minecraft.class07482
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00404;
import minecraft.class00500;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class02676;
import minecraft.class02720;
import minecraft.class03136;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06584;
import minecraft.class07209;
import minecraft.class07236;
import minecraft.class07482;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public abstract class class07277
extends class07236
implements class03136 {
    protected @Nullable class05946<class05074> i;
    protected long R = 0L;

    public @Nullable class05946<class05074> M() {
        return this.i;
    }

    protected class07277(class00404<?> class004042, class07209 class072092, class00500 class005002) {
        super(class004042, class072092, class005002);
    }

    public long B() {
        return this.R;
    }

    @Override
    public void y(class08329 class083292) {
        super.y(class083292);
        class083292.L("LootTable");
        class083292.L("LootTableSeed");
    }

    @Override
    public boolean N(class08036 class080362) {
        return super.N(class080362) && (this.i == null || !class080362.method_7325());
    }

    public void N(@Nullable class05946<class05074> class059462) {
        this.i = class059462;
    }

    @Override
    protected void N_9(class02666 class026662) {
        super.N_9(class026662);
        class02720 class027202 = (class02720)class026662.method_58694(class02484.Nk);
        if (class027202 != null) {
            this.i = class027202.N();
            this.R = class027202.y();
        }
    }

    @Override
    protected void N(class02676 class026762) {
        super.N(class026762);
        if (this.i != null) {
            class026762.N(class02484.Nk, (Object)new class02720(this.i, this.R));
        }
    }

    public void N(long l) {
        this.R = l;
    }

    @Override
    public void method_5447(int n, class06584 class065842) {
        this.y(null);
        super.method_5447(n, class065842);
    }

    @Override
    public class06584 method_5434(int n, int n2) {
        this.y(null);
        return super.method_5434(n, n2);
    }

    @Override
    public class06584 method_5441(int n) {
        this.y(null);
        return super.method_5441(n);
    }

    @Override
    public boolean method_5442() {
        this.y(null);
        return super.method_5442();
    }

    @Override
    public @Nullable class07482 createMenu(int n, class08044 class080442, class08036 class080362) {
        if (this.N(class080362)) {
            this.y(class080442.z);
            return this.N(n, class080442);
        }
        class07236.N(this.d().method_46558(), class080362, this.method_5476());
        return null;
    }

    @Override
    public class06584 method_5438(int n) {
        this.y(null);
        return super.method_5438(n);
    }
}

