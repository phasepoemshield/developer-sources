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

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import minecraft.class00405;
import minecraft.class05935;
import minecraft.class05936;
import minecraft.class05977;

public class class10550
implements class05936 {
    final /* synthetic */ List N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10550(List list) {
        this.N = list;
    }

    public <T> Optional<T> N_8(class05977<T> class059772) {
        Iterator iterator = this.N.iterator();
        while (iterator.hasNext()) {
            Optional optional = ((class05936)iterator.next()).N_8(class059772);
            if (!optional.isPresent()) continue;
            return optional;
        }
        return Optional.empty();
    }

    public <T> Optional<T> N(class05935<T> class059352, class00405 class004052) {
        Iterator iterator = this.N.iterator();
        while (iterator.hasNext()) {
            Optional optional = ((class05936)iterator.next()).N(class059352, class004052);
            if (!optional.isPresent()) continue;
            return optional;
        }
        return Optional.empty();
    }
}

