/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class01128
 *  minecraft.class01135
 *  minecraft.class01296
 *  minecraft.class04782
 *  minecraft.class05372
 *  minecraft.class05377
 *  minecraft.class05456
 *  minecraft.class06889
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07475
 *  minecraft.class07978
 *  minecraft.class08041
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class01128;
import minecraft.class01135;
import minecraft.class01296;
import minecraft.class04782;
import minecraft.class05372;
import minecraft.class05377;
import minecraft.class05456;
import minecraft.class06889;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07475;
import minecraft.class07978;
import minecraft.class08041;
import org.jspecify.annotations.Nullable;

public class class05192
extends class07978 {
    private static final int Z = 2;
    private static final int z = 32;
    private static final int U = 10;
    private static final int E = 7;

    protected @Nullable class06889 M() {
        class06889 class068892;
        float f = this.y.method_73183().field_9229.z();
        if (this.y.method_73183().field_9229.z() < 0.3f) {
            return this.U();
        }
        if (f < 0.7f) {
            class068892 = this.E();
            if (class068892 == null) {
                class068892 = this.W();
            }
        } else {
            class068892 = this.W();
            if (class068892 == null) {
                class068892 = this.E();
            }
        }
        return class068892 == null ? this.U() : class068892;
    }

    public class05192(class07475 class074752, double d) {
        super(class074752, d, 240, false);
    }

    private @Nullable class01296 m() {
        class04782 class047822 = (class04782)this.y.method_73183();
        List list = class01296.N((class01296)class01296.N((class01135)this.y), (int)2).filter(class012962 -> class047822.method_19498(class012962) == 0).collect(Collectors.toList());
        if (list.isEmpty()) {
            return null;
        }
        return (class01296)list.get(class047822.field_9229.y(list.size()));
    }

    private @Nullable class06889 U() {
        return class05456.N((class07475)this.y, (int)10, (int)7);
    }

    private @Nullable class06889 E() {
        Predicate<class08041> predicate = this::N;
        class00734 class007342 = this.y.method_5829().M(32.0);
        class07078 var6 = class07078.ye;
        class04782 class047822 = (class04782)this.y.method_73183();
        List list = this.N(class047822, (class01128)var6, class007342, predicate);
        if (list.isEmpty()) {
            return null;
        }
        class06889 class068892 = ((class08041)list.get(this.y.method_73183().field_9229.y(list.size()))).method_73189();
        return class05456.N((class07475)this.y, (int)10, (int)7, (class06889)class068892);
    }

    private List N(class04782 class047822, class01128 class011282, class00734 class007342, Predicate predicate) {
        if (class011282 == class07078.ye) {
            return class047822.N(class08041.class, this.y.method_5829().M(32.0), this::N);
        }
        return class047822.method_18023((class01128)class07078.ye, this.y.method_5829().M(32.0), this::N);
    }

    private boolean N(class08041 class080412) {
        return class080412.N(this.y.method_73183().N());
    }

    private @Nullable class07209 N(class01296 class012962) {
        class04782 class047822 = (class04782)this.y.method_73183();
        List list = class047822.method_19494().i(class035562 -> true, class012962.U(), 8, class05372.field_18488).map(class05377::M).collect(Collectors.toList());
        if (list.isEmpty()) {
            return null;
        }
        return (class07209)list.get(class047822.field_9229.y(list.size()));
    }

    private @Nullable class06889 W() {
        class01296 class012962 = this.m();
        if (class012962 == null) {
            return null;
        }
        class07209 class072092 = this.N(class012962);
        if (class072092 == null) {
            return null;
        }
        return class05456.N((class07475)this.y, (int)10, (int)7, (class06889)class06889.L((class00753)class072092));
    }
}

