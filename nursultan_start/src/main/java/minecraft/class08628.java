/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00201
 *  minecraft.class00381
 *  minecraft.class00753
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class05946
 *  minecraft.class06993
 *  minecraft.class07209
 *  minecraft.class08051
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00201;
import minecraft.class00381;
import minecraft.class00753;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class05946;
import minecraft.class06993;
import minecraft.class07209;
import minecraft.class08051;
import minecraft.class08595;
import minecraft.class08616;
import minecraft.class08625;

public final class class08628
extends Record
implements class00381<class08051> {
    private final class07209 pos;
    private final class08616 action;
    private final class08595 data;
    public static final class02362<class04247, class08628> N = class02362.N((class02362)class07209.field_48404, class08628::N, class08616.field_55927, class08628::y, class08595.y, class08628::L, class08628::new);

    public class08595 L() {
        return this.data;
    }

    public class08628(class07209 class072092, class08616 class086162, Optional<class05946<class00201>> optional, class00753 class007532, class06993 class069932, boolean bl) {
        this(class072092, class086162, new class08595(optional, class007532, class069932, bl, class08625.field_56014, Optional.empty()));
    }

    public class08628(class07209 class072092, class08616 class086162, class08595 class085952) {
        this.pos = class072092;
        this.action = class086162;
        this.data = class085952;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08628.class, "pos;action;data", "pos", "action", "data"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08628.class, "pos;action;data", "pos", "action", "data"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08628.class, "pos;action;data", "pos", "action", "data"}, this);
    }

    public class08616 y() {
        return this.action;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_66582(this);
    }

    public class07209 N() {
        return this.pos;
    }

    public class02897<class08628> method_65080() {
        return class04248.LT;
    }
}

