/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00580
 *  minecraft.class00604
 *  minecraft.class01054
 *  minecraft.class01065
 *  minecraft.class01590
 *  minecraft.class03428
 *  minecraft.class06478
 *  minecraft.class06613
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00580;
import minecraft.class00604;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class01590;
import minecraft.class03428;
import minecraft.class06478;
import minecraft.class06613;
import org.jspecify.annotations.Nullable;

public abstract class class03660
extends class06478 {
    private @Nullable Consumer<class00405> N = null;
    private final class01590 y;

    public class03660(int n, int n2, int n3, int n4, class00392 class003922, class01590 class015902) {
        super(n, n2, n3, n4, class003922);
        this.y = class015902;
    }

    protected final class01590 Z() {
        return this.y;
    }

    public class03660 N(@Nullable Consumer<class00405> consumer) {
        this.N = consumer;
        return this;
    }

    public abstract void N(class00580 var1);

    public void method_25355(class00392 class003922) {
        super.method_25355(class003922);
        this.method_25358(this.Z().N(class003922.method_30937()));
    }

    public void method_25348(class06613 class066132, boolean bl) {
        if (this.N != null) {
            class00604 class006042 = new class00604(this.Z(), (int)class066132.n(), (int)class066132.t());
            this.N((class00580)class006042);
            class00405 class004052 = class006042.y();
            if (class004052 != null) {
                this.N.accept(class004052);
                return;
            }
        }
        super.method_25348(class066132, bl);
    }

    protected void method_47399(class03428 class034282) {
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        class01065 class010652 = this.method_49606() ? (this.N != null ? class01065.field_63852 : class01065.field_63851) : class01065.field_63850;
        this.N(class010542.N((class06478)this, class010652));
    }
}

