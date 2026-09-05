/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00405
 */
package minecraft;

import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class06478;

public abstract class class06466
extends class06478 {
    private class00392 field_63861;

    public class06466(int n, int n2, int n3, int n4, class00392 class003922) {
        super(n, n2, n3, n4, class003922);
        this.field_63861 = class06466.method_75800(class003922);
    }

    @Override
    public class00392 method_25369() {
        return this.field_22763 ? super.method_25369() : this.field_63861;
    }

    @Override
    public void method_25355(class00392 class003922) {
        super.method_25355(class003922);
        this.field_63861 = class06466.method_75800(class003922);
    }

    public static class00392 method_75800(class00392 class003922) {
        return class00390.N((class00392)class003922, (class00405)class00405.N.N(-6250336));
    }
}

