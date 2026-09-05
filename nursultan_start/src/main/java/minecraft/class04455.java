/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10407
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 *  minecraft.class03039
 *  minecraft.class04469
 */
package minecraft;

import Nursultan.class10407;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import minecraft.class00667;
import minecraft.class03039;
import minecraft.class04443;
import minecraft.class04469;

public class class04455
extends Record {
    public List<class10407> entries;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;

    private static void L() {
        y_1 = 8;
        y_2 = 16;
    }

    public class04455(class00667 class006672) {
        this((List)class006672.N_15(class00667.N(ArrayList::new, (int)8), class10407::new));
    }

    public class04455(List<class10407> list) {
        this.entries = list;
    }

    static {
        class04455.L();
        y_0 = new class04455(List.of());
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04455.class, "entries", "entries"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04455.class, "entries", "entries"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04455.class, "entries", "entries"}, this);
    }

    public void N(class00667 class006673) {
        class006673.N_12(this.entries, (class006672, class104072) -> class104072.N(class006672));
    }

    public List<class10407> N() {
        return this.entries;
    }

    public static class04455 N(class03039<?> class030392, class04443 class044432) {
        List list = class030392.N().stream().map(class030672 -> {
            class04469 class044692 = class044432.sign(class030672.L());
            if (class044692 != null) {
                return new class10407(class030672.N(), class044692);
            }
            return null;
        }).filter(Objects::nonNull).toList();
        return new class04455(list);
    }
}

