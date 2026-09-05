/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00869
 *  minecraft.class01377
 *  minecraft.class04425
 *  minecraft.class07068
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07655
 *  minecraft.class07955
 */
package minecraft;

import minecraft.class00869;
import minecraft.class01377;
import minecraft.class04425;
import minecraft.class07068;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07655;
import minecraft.class07955;

class class01335
extends class07655 {
    class01335(class01377 class013772, class07299 class072992) {
        super((class07079)class013772, class072992);
    }

    protected boolean y(class04425 class044252) {
        if (class044252 == class04425.field_14 || class044252 == class04425.field_3 || class044252 == class04425.field_9) {
            return true;
        }
        return super.y(class044252);
    }

    protected class07068 N(int n) {
        this.s = new class07955();
        return new class07068(this.s, n);
    }

    public boolean N(class07209 class072092) {
        return this.L.method_8320(class072092).N(class00869.V) || super.N(class072092);
    }
}

