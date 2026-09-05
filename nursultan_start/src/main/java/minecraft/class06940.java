/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 *  minecraft.class07075
 *  minecraft.class07281
 *  minecraft.class08036
 *  minecraft.class08294
 *  minecraft.class08310
 *  minecraft.class08332
 *  minecraft.class08978
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class06584;
import minecraft.class07075;
import minecraft.class07281;
import minecraft.class08036;
import minecraft.class08294;
import minecraft.class08310;
import minecraft.class08332;
import minecraft.class08978;
import org.jspecify.annotations.Nullable;

public class class06940
extends class07075 {
    private @Nullable class07281 y;

    public class06940() {
        super(27);
    }

    public void y(class08294<class08332> class082942) {
        for (int i = 0; i < this.method_5439(); ++i) {
            class06584 class065842 = this.method_5438(i);
            if (class065842.R()) continue;
            class082942.N((Object)new class08332(i, class065842));
        }
    }

    public void y(class08310<class08332> class083102) {
        for (int i = 0; i < this.method_5439(); ++i) {
            this.method_5447(i, class06584.E);
        }
        for (class08332 class083322 : class083102) {
            if (!class083322.N(this.method_5439())) continue;
            this.method_5447(class083322.N(), class083322.y());
        }
    }

    public boolean y(class07281 class072812) {
        return this.y == class072812;
    }

    public void N(class07281 class072812) {
        this.y = class072812;
    }

    public boolean method_5443(class08036 class080362) {
        if (this.y != null && !this.y.N(class080362)) {
            return false;
        }
        return super.method_5443(class080362);
    }

    public void method_5432(class08978 class089782) {
        if (this.y != null) {
            this.y.y(class089782);
        }
        super.method_5432(class089782);
        this.y = null;
    }

    public void method_5435(class08978 class089782) {
        if (this.y != null) {
            this.y.N(class089782);
        }
        super.method_5435(class089782);
    }
}

