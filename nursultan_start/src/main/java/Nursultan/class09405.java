/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00819
 *  minecraft.class02362
 */
package Nursultan;

import java.util.Optional;
import minecraft.class00819;
import minecraft.class02362;

public class class09405<B, T>
implements class02362<B, class00819<T>> {
    private static final int y = 1;
    private static final int L = 2;
    final /* synthetic */ class02362 N;

    public class09405(class02362 class023622) {
        this.N = class023622;
    }

    public void encode(B b, class00819<T> class008192) {
        Optional optional = class008192.R();
        Optional optional2 = class008192.M();
        b.writeByte((optional.isPresent() ? 1 : 0) | (optional2.isPresent() ? 2 : 0));
        optional.ifPresent(number -> this.N.encode(b, number));
        optional2.ifPresent(number -> this.N.encode(b, number));
    }

    public class00819<T> decode(B b) {
        byte by = b.readByte();
        Optional optional = (by & 1) != 0 ? Optional.of((Number)this.N.decode(b)) : Optional.empty();
        Optional optional2 = (by & 2) != 0 ? Optional.of((Number)this.N.decode(b)) : Optional.empty();
        return new class00819(optional, optional2);
    }
}

