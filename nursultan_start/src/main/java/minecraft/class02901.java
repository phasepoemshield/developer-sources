/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00672
 *  minecraft.class00753
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07307
 *  minecraft.class07451
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class00672;
import minecraft.class00753;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07307;
import minecraft.class07451;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class class02901
extends class07049 {
    private static final Logger N = LogUtils.getLogger();
    private int L;
    protected class07209 y;

    public void method_18382() {
    }

    public boolean method_5659(class07307 class073072) {
        class07049 class070492 = class073072.u();
        if (class070492 != null && class070492.method_5799()) {
            return true;
        }
        if (class073072.B()) {
            return super.method_5659(class073072);
        }
        return true;
    }

    public void method_5814(double d, double d2, double d3) {
        this.y = class07209.method_49637((double)d, (double)d2, (double)d3);
        this.N();
        this.field_64356 = true;
    }

    public void method_5773() {
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.method_31473();
            if (this.L++ == 100) {
                this.L = 0;
                if (!this.method_31481() && !this.y()) {
                    this.method_31472();
                    this.N(class047822, null);
                }
            }
        }
    }

    public void method_5784(class07451 class074512, class06889 class068892) {
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if (!this.method_31481() && class068892.B() > 0.0) {
                this.method_5768(class047822);
                this.N(class047822, null);
            }
        }
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        if (this.method_64421(class070722)) {
            return false;
        }
        if (!((Boolean)class047822.method_64395().N(class07305.I)).booleanValue() && class070722.u() instanceof class07079) {
            return false;
        }
        if (!this.method_31481()) {
            this.method_5768(class047822);
            this.method_5785();
            this.N(class047822, class070722.u());
        }
        return true;
    }

    public void method_5762(double d, double d2, double d3) {
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if (!this.method_31481() && d * d + d2 * d2 + d3 * d3 > 0.0) {
                this.method_5768(class047822);
                this.N(class047822, null);
            }
        }
    }

    protected void method_5652(class08329 class083292) {
        class083292.N("block_pos", class07209.field_25064, (Object)this.s());
    }

    public boolean method_5863() {
        return true;
    }

    public boolean method_5643(class07072 class070722) {
        return !this.method_64421(class070722);
    }

    protected boolean method_5638() {
        return false;
    }

    protected void method_5749(class08299 class082992) {
        class07209 class072092 = class082992.N("block_pos", class07209.field_25064).orElse(null);
        if (class072092 == null || !class072092.method_19771((class00753)this.method_24515(), 16.0)) {
            N.error("Block-attached entity at invalid position: {}", (Object)class072092);
            return;
        }
        this.y = class072092;
    }

    public void method_5800(class04782 class047822, class00672 class006722) {
    }

    public boolean method_5698(class07049 class070492) {
        if (class070492 instanceof class08036) {
            class08036 class080362 = (class08036)class070492;
            if (!this.method_73183().method_8505((class07049)class080362, this.y)) {
                return true;
            }
            return this.method_64420(this.method_48923().N(class080362), 0.0f);
        }
        return false;
    }

    protected class02901(class07078<? extends class02901> class070782, class07299 class072992, class07209 class072092) {
        this(class070782, class072992);
        this.y = class072092;
    }

    protected class02901(class07078<? extends class02901> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public class07209 s() {
        return this.y;
    }

    public abstract boolean y();

    protected abstract void N();

    public abstract void N(class04782 var1, @Nullable class07049 var2);
}

