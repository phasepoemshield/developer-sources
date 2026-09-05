/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00405
 *  minecraft.class05935
 *  minecraft.class05936
 *  minecraft.class05977
 */
package Nursultan;

import java.util.Optional;
import minecraft.class00405;
import minecraft.class05935;
import minecraft.class05936;
import minecraft.class05977;

public class class10551
implements class05936 {
    final /* synthetic */ String N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10551(String string) {
        this.N = string;
    }

    public <T> Optional<T> N_8(class05977<T> class059772) {
        return class059772.accept(this.N);
    }

    public <T> Optional<T> N(class05935<T> class059352, class00405 class004052) {
        return class059352.accept(class004052, this.N);
    }
}

