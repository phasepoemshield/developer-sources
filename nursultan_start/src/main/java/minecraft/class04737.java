/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class05097
 *  minecraft.class05108
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class05097;
import minecraft.class05108;

final class class04737
extends Record {
    final class00392 title;
    final class00392 detail;

    class04737(class00392 class003922, class00392 class003923) {
        this.title = class003922;
        this.detail = class003923;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04737.class, "title;detail", "title", "detail"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04737.class, "title;detail", "title", "detail"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04737.class, "title;detail", "title", "detail"}, this);
    }

    public class00392 y() {
        return this.detail;
    }

    public class00392 N() {
        return this.title;
    }

    static class04737 N(class05097 class050972) {
        class05108 class051082 = class050972.N;
        return new class04737((class00392)class00392.N((String)"mco.errorMessage.realmsService.realmsError", (Object[])new Object[]{class051082.N()}), class051082.y());
    }
}

