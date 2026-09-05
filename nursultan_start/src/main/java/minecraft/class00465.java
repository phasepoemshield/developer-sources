/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05369
 *  minecraft.class05377
 *  minecraft.class05946
 *  minecraft.class07209
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05369;
import minecraft.class05377;
import minecraft.class05946;
import minecraft.class07209;

public final class class00465
extends Record {
    private final class07209 pos;
    private final class03556<class05369> poiType;
    private final int freeTicketCount;
    public static final class02362<class04247, class00465> N = class02362.N((class02362)class07209.field_48404, class00465::N, (class02362)class02389.y((class05946)class04227.NZ), class00465::y, (class02362)class02389.B, class00465::L, class00465::new);

    public int L() {
        return this.freeTicketCount;
    }

    public class00465(class05377 class053772) {
        this(class053772.M(), (class03556<class05369>)class053772.B(), class053772.y());
    }

    public class00465(class07209 class072092, class03556<class05369> class035562, int n) {
        this.pos = class072092;
        this.poiType = class035562;
        this.freeTicketCount = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00465.class, "pos;poiType;freeTicketCount", "pos", "poiType", "freeTicketCount"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00465.class, "pos;poiType;freeTicketCount", "pos", "poiType", "freeTicketCount"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00465.class, "pos;poiType;freeTicketCount", "pos", "poiType", "freeTicketCount"}, this);
    }

    public class03556<class05369> y() {
        return this.poiType;
    }

    public class07209 N() {
        return this.pos;
    }
}

