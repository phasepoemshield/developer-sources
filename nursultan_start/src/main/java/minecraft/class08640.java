/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00235
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07209
 *  minecraft.class08051
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00235;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07209;
import minecraft.class08051;

public final class class08640
extends Record
implements class00381<class08051> {
    private final class07209 position;
    private final class00235 mode;
    private final String message;
    public static final class02362<class00667, class08640> N = class02362.N((class02362)class07209.field_48404, class08640::N, (class02362)class00235.field_56029, class08640::y, (class02362)class02389.s, class08640::L, class08640::new);

    public String L() {
        return this.message;
    }

    public class08640(class07209 class072092, class00235 class002352, String string) {
        this.position = class072092;
        this.mode = class002352;
        this.message = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08640.class, "position;mode;message", "position", "mode", "message"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08640.class, "position;mode;message", "position", "mode", "message"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08640.class, "position;mode;message", "position", "mode", "message"}, this);
    }

    public class00235 y() {
        return this.mode;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_66581(this);
    }

    public class07209 N() {
        return this.position;
    }

    public class02897<class08640> method_65080() {
        return class04248.Ls;
    }
}

