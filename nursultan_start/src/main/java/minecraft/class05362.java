/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class03428
 *  minecraft.class05216
 *  minecraft.class06308
 *  minecraft.class06611
 */
package minecraft;

import minecraft.class00392;
import minecraft.class03428;
import minecraft.class05216;
import minecraft.class05341;
import minecraft.class05361;
import minecraft.class05373;
import minecraft.class06308;
import minecraft.class06611;

public abstract class class05362
extends class06308 {
    public static final int field_39499 = 120;
    public static final int field_39500 = 150;
    public static final int field_49479 = 200;
    public static final int field_39501 = 20;
    public static final int field_46856 = 8;
    public static final class05341 field_40754 = supplier -> (class05216)supplier.get();
    public class05361 field_22767;
    protected final class05341 field_40755;

    public class05362(int n, int n2, int n3, int n4, class00392 class003922, class05361 class053612, class05341 class053412) {
        super(n, n2, n3, n4, class003922);
        this.field_22767 = class053612;
        this.field_40755 = class053412;
    }

    public void method_25306(class06611 class066112) {
        this.field_22767.onPress(this);
    }

    public static class05373 method_46430(class00392 class003922, class05361 class053612) {
        return new class05373(class003922, class053612);
    }

    public void method_47399(class03428 class034282) {
        this.method_37021(class034282);
    }

    protected class05216 method_25360() {
        return this.field_40755.createNarrationMessage(() -> super.method_25360());
    }
}

