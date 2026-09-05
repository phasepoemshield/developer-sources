/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00869
 *  minecraft.class01231
 *  minecraft.class04425
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07475
 */
package minecraft;

import minecraft.class00869;
import minecraft.class01231;
import minecraft.class04425;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07475;

public abstract class class07874
extends class07475 {
    public static final int M = 120;

    public static boolean L(class07078<? extends class07874> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        int n = class072842.method_8615();
        int n2 = n - 13;
        return class072092.method_10264() >= n2 && class072092.method_10264() <= n && class072842.method_8316(class072092.method_10074()).N(class01231.N) && class072842.method_8320(class072092.method_10084()).N(class00869.K);
    }

    public boolean method_5675() {
        return false;
    }

    public void method_5670() {
        int n = this.method_5669();
        super.method_5670();
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.N(class047822, n);
        }
    }

    public class07874(class07078<? extends class07874> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.N(class04425.field_18, 0.0f);
    }

    public boolean g() {
        return false;
    }

    protected void N(class04782 class047822, int n) {
        if (this.method_5805() && !this.method_5799()) {
            this.method_5855(n - 1);
            if (this.method_74092()) {
                this.method_5855(0);
                this.method_64397(class047822, this.method_48923().Z(), 2.0f);
            }
        } else {
            this.method_5855(300);
        }
    }

    public boolean N(class05487 class054872) {
        return class054872.method_8606((class07049)this);
    }

    public int m_() {
        return 120;
    }

    public int method_6110(class04782 class047822) {
        return 1 + this.field_5974.y(3);
    }
}

