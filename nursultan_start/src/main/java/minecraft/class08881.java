/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02012
 *  minecraft.class02028
 *  minecraft.class02601
 *  minecraft.class03702
 *  minecraft.class04673
 *  minecraft.class08388
 *  minecraft.class08431
 *  minecraft.class08496
 *  minecraft.class08510
 *  minecraft.class08517
 *  minecraft.class08529
 *  minecraft.class08908
 *  minecraft.class08910
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02012;
import minecraft.class02028;
import minecraft.class02601;
import minecraft.class03702;
import minecraft.class04673;
import minecraft.class08388;
import minecraft.class08431;
import minecraft.class08496;
import minecraft.class08510;
import minecraft.class08517;
import minecraft.class08529;
import minecraft.class08838;
import minecraft.class08857;
import minecraft.class08869;
import minecraft.class08877;
import minecraft.class08887;
import minecraft.class08908;
import minecraft.class08910;

public final class class08881
extends Record {
    final class08877 blockPart;
    private final class08887 block;
    final class08910 item;

    public class08910 L() {
        return this.item;
    }

    public class08881(class08877 class088772, class08887 class088872, class08910 class089102) {
        this.blockPart = class088772;
        this.block = class088872;
        this.item = class089102;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08881.class, "blockPart;block;item", "blockPart", "block", "item"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08881.class, "blockPart;block;item", "blockPart", "block", "item"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08881.class, "blockPart;block;item", "blockPart", "block", "item"}, this);
    }

    public class08887 y() {
        return this.block;
    }

    public class08877 N() {
        return this.blockPart;
    }

    public static class08881 N(class08529 class085292, class02601 class026012, class02012 class020122) {
        class08869 class088692 = new class08869(class026012, class020122);
        class08838 class088382 = class085292.B();
        boolean bl = class085292.u();
        boolean bl2 = class085292.i().N();
        class03702 class037022 = class085292.R();
        class08496 class084962 = class085292.N(class088382, (class02028)class088692, (class04673)class08510.N);
        class08388 class083882 = class085292.N(class088382, (class02028)class088692);
        class08431 class084312 = new class08431(class084962, bl, class083882);
        class08857 class088572 = new class08857((class08877)class084312);
        class08908 class089082 = new class08908(class084962.method_68048(), new class08517(bl2, class083882, class037022));
        return new class08881((class08877)class084312, class088572, (class08910)class089082);
    }
}

