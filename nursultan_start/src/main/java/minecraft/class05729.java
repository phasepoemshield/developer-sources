/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class00392
 *  minecraft.class01202
 *  minecraft.class01295
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class02116
 *  minecraft.class03428
 *  minecraft.class03434
 *  minecraft.class03457
 *  minecraft.class04654
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class05117
 *  minecraft.class06613
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class00392;
import minecraft.class01202;
import minecraft.class01295;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class02116;
import minecraft.class03428;
import minecraft.class03434;
import minecraft.class03457;
import minecraft.class04654;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class05117;
import minecraft.class06613;
import org.jspecify.annotations.Nullable;

public abstract class class05729<E extends class05729<E>>
extends class01202<E>
implements class01295 {
    private @Nullable class04654 field_19077;
    private @Nullable class03434 field_33782;
    private boolean field_19078;

    public @Nullable class04654 method_25399() {
        return this.field_19077;
    }

    public @Nullable class02106 method_48205(class02089 class020892) {
        if (class020892 instanceof class02116) {
            int n;
            class02116 class021162 = (class02116)class020892;
            switch (class021162.y()) {
                default: {
                    throw new MatchException(null, null);
                }
                case field_41826: 
                case field_41827: {
                    int n2 = 0;
                    break;
                }
                case field_41828: {
                    int n2 = -1;
                    break;
                }
                case field_41829: {
                    int n2 = n = 1;
                }
            }
            if (n == 0) {
                return null;
            }
            for (int i = class04995.N((int)(n + this.method_25396().indexOf(this.method_25399())), (int)0, (int)(this.method_25396().size() - 1)); i >= 0 && i < this.method_25396().size(); i += n) {
                class02106 class021062 = ((class04654)this.method_25396().get(i)).method_48205(class020892);
                if (class021062 == null) continue;
                return class02106.N((class01295)this, (class02106)class021062);
            }
        }
        return super.method_48205(class020892);
    }

    public void method_25395(@Nullable class04654 class046542) {
        if (this.field_19077 != null) {
            this.field_19077.method_25365(false);
        }
        if (class046542 != null) {
            class046542.method_25365(true);
        }
        this.field_19077 = class046542;
    }

    public void method_25398(boolean bl) {
        this.field_19078 = bl;
    }

    public boolean method_25397() {
        return this.field_19078;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        return super.method_25402(class066132, bl);
    }

    public abstract List<? extends class03434> method_37025();

    public @Nullable class02106 method_48208(class02089 class020892, int n) {
        if (this.method_25396().isEmpty()) {
            return null;
        }
        class02106 class021062 = ((class04654)this.method_25396().get(Math.min(n, this.method_25396().size() - 1))).method_48205(class020892);
        return class02106.N((class01295)this, (class02106)class021062);
    }

    public void method_37024(class03428 class034282) {
        List<class03434> var2 = this.method_37025();
        class05117 class051172 = class05096.method_37061(var2, (class03434)this.field_33782);
        if (class051172 != null) {
            if (class051172.L().N()) {
                this.field_33782 = class051172.N();
            }
            if (var2.size() > 1) {
                class034282.N(class03457.field_33789, (class00392)class00392.N((String)"narrator.position.object_list", (Object[])new Object[]{class051172.y() + 1, var2.size()}));
            }
            class051172.N().method_37020(class034282.N());
        }
    }
}

