/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11535
 *  Nursultan.class11919
 *  Nursultan.class11929
 *  Nursultan.class11938
 *  minecraft.class01463
 *  minecraft.class03443
 *  minecraft.class04453
 *  minecraft.class05096
 *  minecraft.class06202
 *  minecraft.class06584
 */
package Nursultan;

import Nursultan.class11535;
import Nursultan.class11919;
import Nursultan.class11929;
import Nursultan.class11938;
import java.util.function.Predicate;
import minecraft.class01463;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06584;

public class class11160
extends class11535
implements Predicate<class06202> {
    public Object N_0;

    public static class11160 L(boolean bl) {
        return new class11160("block-breaking", bl, class062022 -> ((class03443)class062022.T_2).E());
    }

    private void L() {
    }

    public class11160(String string, boolean bl, Predicate<class06202> predicate) {
        super(string, bl);
        this.L();
        this.N_0 = predicate;
    }

    static {
        class11160.i();
        class11160.u();
    }

    public static class11160 i(boolean bl) {
        return new class11160("moving-items", bl, class062022 -> (class05096)class062022.v_3 instanceof class01463 || class11938.m().u());
    }

    private static void i() {
    }

    public static class11160 u(boolean bl) {
        return new class11160("using-item", bl, class062022 -> ((class04453)class062022.T_4).method_6115() && !((class04453)class062022.T_4).method_6039());
    }

    private static void u() {
    }

    public static class11160 y(boolean bl) {
        return new class11160("no-weapon", bl, class062022 -> !class11929.u((class06584)((class04453)class062022.T_4).method_6047()) && !class11929.u((class06584)((class04453)class062022.T_4).method_6079()));
    }

    public static class11160 N(boolean bl) {
        return new class11160("using-shield", bl, class062022 -> ((class04453)class062022.T_4).method_6039());
    }

    @Override
    public boolean test(class06202 class062022) {
        this.L();
        return ((Predicate)this.N_0).test(class062022);
    }

    public static class11160 R(boolean bl) {
        return new class11160("elytra-gliding", bl, class062022 -> class11919.N());
    }
}

