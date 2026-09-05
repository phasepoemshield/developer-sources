/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00860
 *  minecraft.class00891
 *  minecraft.class06695
 *  minecraft.class07209
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00860;
import minecraft.class00891;
import minecraft.class06695;
import minecraft.class07209;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public final class class08948
extends Record {
    final class07209 pos;
    final class06695 container;
    final class00394 blockEntity;
    final class00500 state;

    public class00394 L() {
        return this.blockEntity;
    }

    public class08948(class07209 class072092, class06695 class066952, class00394 class003942, class00500 class005002) {
        this.pos = class072092;
        this.container = class066952;
        this.blockEntity = class003942;
        this.state = class005002;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08948.class, "pos;container;blockEntity;state", "pos", "container", "blockEntity", "state"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08948.class, "pos;container;blockEntity;state", "pos", "container", "blockEntity", "state"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08948.class, "pos;container;blockEntity;state", "pos", "container", "blockEntity", "state"}, this);
    }

    public class00500 u() {
        return this.state;
    }

    public class06695 y() {
        return this.container;
    }

    private static @Nullable class06695 N(class00394 class003942, class00500 class005002, class07299 class072992, class07209 class072092) {
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class00860) {
            return class00860.N((class00860)((class00860)class008912), (class00500)class005002, (class07299)class072992, (class07209)class072092, (boolean)false);
        }
        if (class003942 instanceof class06695) {
            return (class06695)class003942;
        }
        return null;
    }

    public static @Nullable class08948 N(class00394 class003942, class07299 class072992) {
        class07209 class072092 = class003942.d();
        class00500 class005002 = class003942.w();
        class06695 class066952 = class08948.N(class003942, class005002, class072992, class072092);
        if (class066952 != null) {
            return new class08948(class072092, class066952, class003942, class005002);
        }
        return null;
    }

    public static @Nullable class08948 N(class07209 class072092, class07299 class072992) {
        class00394 class003942 = class072992.method_8321(class072092);
        return class003942 == null ? null : class08948.N(class003942, class072992);
    }

    public class07209 N() {
        return this.pos;
    }
}

