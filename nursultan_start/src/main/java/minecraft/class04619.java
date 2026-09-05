/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class03949
 *  minecraft.class04782
 *  minecraft.class05372
 *  minecraft.class05377
 *  minecraft.class07209
 */
package minecraft;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import minecraft.class00753;
import minecraft.class03949;
import minecraft.class04596;
import minecraft.class04626;
import minecraft.class04782;
import minecraft.class05372;
import minecraft.class05377;
import minecraft.class07209;

class class04619
extends class04596 {
    final /* synthetic */ class04626 y;

    public void L() {
        this.y.F = 200;
        List<class07209> var1 = this.U();
        if (var1.isEmpty()) {
            return;
        }
        for (class07209 class072092 : var1) {
            if (this.y.x.N(class072092)) continue;
            this.y.C = class072092;
            return;
        }
        this.y.x.U();
        this.y.C = var1.get(0);
    }

    @Override
    public boolean M() {
        return this.y.F == 0 && !this.y.Y() && this.y.d();
    }

    class04619(class04626 class046262) {
        this.y = class046262;
        super(class046262);
    }

    @Override
    public boolean Z() {
        return false;
    }

    private List<class07209> U() {
        class07209 class072092 = this.y.method_24515();
        return ((class04782)this.y.method_73183()).method_19494().i(class035562 -> class035562.N(class03949.L), class072092, 20, class05372.field_18489).map(class05377::M).filter(this.y::M).sorted(Comparator.comparingDouble(class072093 -> class072093.method_10262((class00753)class072092))).collect(Collectors.toList());
    }
}

