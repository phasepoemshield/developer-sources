/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00245
 *  minecraft.class00753
 *  minecraft.class02682
 *  minecraft.class04425
 *  minecraft.class07209
 *  minecraft.class07955
 */
package Nursultan;

import minecraft.class00245;
import minecraft.class00753;
import minecraft.class02682;
import minecraft.class04425;
import minecraft.class07209;
import minecraft.class07955;

public class class09234
extends class07955 {
    private static final int W = 1024;
    final /* synthetic */ class00245 N;

    public class09234(class00245 class002452) {
        this.N = class002452;
    }

    public class04425 N(class02682 class026822, int n, int n2, int n3) {
        class07209 class072092 = this.N.U();
        if (class072092 == null) {
            return super.N(class026822, n, n2, n3);
        }
        double d = class072092.method_10262(new class00753(n, n2, n3));
        if (d > 1024.0 && d >= class072092.method_10262((class00753)class026822.y())) {
            return class04425.field_22;
        }
        return super.N(class026822, n, n2, n3);
    }
}

