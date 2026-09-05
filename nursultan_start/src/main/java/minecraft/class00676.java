/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class03696
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class05989
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07062
 *  minecraft.class07065
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07328
 *  minecraft.class07856
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import minecraft.class00690;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class03696;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class05989;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07062;
import minecraft.class07065;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07328;
import minecraft.class07856;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class00676
extends class07049 {
    private static final class02131<Optional<class07209>> y = class03289.N(class00676.class, (class04383)class02154.s);
    private static final class02131<Boolean> L = class03289.N(class00676.class, (class04383)class02154.U);
    private static final boolean u = true;
    public int N;

    public class06584 method_31480() {
        return new class06584((class07310)class06570.ln);
    }

    protected void method_5693(class04293 class042932) {
        class042932.N(y, Optional.empty());
        class042932.N(L, (Object)true);
    }

    public void method_5768(class04782 class047822) {
        this.N(class047822, this.method_48923().s());
        super.method_5768(class047822);
    }

    public void method_5773() {
        ++this.N;
        this.method_61409();
        this.method_60698();
        if (this.method_73183() instanceof class04782) {
            class07209 class072092 = this.method_24515();
            if (((class04782)this.method_73183()).method_29198() != null && this.method_73183().method_8320(class072092).P()) {
                this.method_73183().method_8501(class072092, class05989.y((class07290)this.method_73183(), (class07209)class072092));
            }
        }
    }

    public final boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        if (this.method_64421(class070722)) {
            return false;
        }
        if (class070722.u() instanceof class00690) {
            return false;
        }
        if (!this.method_31481()) {
            this.method_5650(class07062.field_26998);
            if (!class070722.N(class03696.E)) {
                class07072 class070723 = class070722.u() != null ? this.method_48923().u((class07049)this, class070722.u()) : null;
                class047822.method_55117((class07049)this, class070723, null, this.method_23317(), this.method_23318(), this.method_23321(), 6.0f, false, class07328.field_40889);
            }
            this.N(class047822, class070722);
        }
        return true;
    }

    protected class07065 method_33570() {
        return class07065.field_28630;
    }

    protected void method_5652(class08329 class083292) {
        class083292.y("beam_target", class07209.field_25064, (Object)this.N());
        class083292.N("ShowBottom", this.y());
    }

    public boolean method_5863() {
        return true;
    }

    public boolean method_5640(double d) {
        return super.method_5640(d) || this.N() != null;
    }

    public final boolean method_5643(class07072 class070722) {
        if (this.method_64421(class070722)) {
            return false;
        }
        return !(class070722.u() instanceof class00690);
    }

    protected void method_5749(class08299 class082992) {
        this.N(class082992.N("beam_target", class07209.field_25064).orElse(null));
        this.N(class082992.N("ShowBottom", true));
    }

    public class00676(class07078<? extends class00676> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.field_23807 = true;
        this.N = this.field_5974.y(100000);
    }

    public class00676(class07299 class072992, double d, double d2, double d3) {
        this((class07078<? extends class00676>)class07078.S, class072992);
        this.method_5814(d, d2, d3);
    }

    public boolean y() {
        return (Boolean)this.method_5841().N(L);
    }

    private void N(class04782 class047822, class07072 class070722) {
        class07856 class078562 = class047822.method_29198();
        if (class078562 != null) {
            class078562.N(this, class070722);
        }
    }

    public void N(@Nullable class07209 class072092) {
        this.method_5841().N(y, Optional.ofNullable(class072092));
    }

    public @Nullable class07209 N() {
        return ((Optional)this.method_5841().N(y)).orElse(null);
    }

    public void N(boolean bl) {
        this.method_5841().N(L, (Object)bl);
    }
}

