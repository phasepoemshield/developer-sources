/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class06113
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class07633
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class06113;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class07633;
import minecraft.class07862;
import minecraft.class07877;
import minecraft.class07901;
import org.jspecify.annotations.Nullable;

public class class07884
extends class07877 {
    public class07884(class07078<? extends class07884> class070782, class07299 class072992) {
        super((class07078<? extends class07877>)class070782, class072992);
    }

    protected class04891 s() {
        return class04909.Zg;
    }

    @Override
    public @Nullable class07077 y(class04782 class047822, class07077 class070772) {
        class07862 class078622 = (class07862)(class070772 instanceof class07901 ? class07078.Ne : class07078.H).N((class07299)class047822, class06113.field_16466);
        if (class078622 != null) {
            this.N(class070772, class078622);
        }
        return class078622;
    }

    @Override
    public boolean N(class07633 class076332) {
        if (class076332 == this) {
            return false;
        }
        if (class076332 instanceof class07884 || class076332 instanceof class07901) {
            return this.NS() && ((class07862)class076332).NS();
        }
        return false;
    }

    @Override
    protected class04891 G() {
        return class04909.Zq;
    }

    @Override
    protected void Y() {
        this.method_5783(class04909.ZV, 0.4f, 1.0f);
    }

    public class04891 method_6002() {
        return class04909.Zo;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.ZK;
    }

    @Override
    protected class04891 M_() {
        return class04909.ZI;
    }
}

