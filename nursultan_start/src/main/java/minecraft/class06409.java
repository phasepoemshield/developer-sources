/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00500;
import minecraft.class06404;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

final class class06409
extends Record {
    final class07209 pos;
    final class00500 state;
    final @Nullable class06404 blockEntityInfo;
    final class00500 previousStateAtDestination;

    public @Nullable class06404 L() {
        return this.blockEntityInfo;
    }

    class06409(class07209 class072092, class00500 class005002, @Nullable class06404 class064042, class00500 class005003) {
        this.pos = class072092;
        this.state = class005002;
        this.blockEntityInfo = class064042;
        this.previousStateAtDestination = class005003;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06409.class, "pos;state;blockEntityInfo;previousStateAtDestination", "pos", "state", "blockEntityInfo", "previousStateAtDestination"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06409.class, "pos;state;blockEntityInfo;previousStateAtDestination", "pos", "state", "blockEntityInfo", "previousStateAtDestination"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06409.class, "pos;state;blockEntityInfo;previousStateAtDestination", "pos", "state", "blockEntityInfo", "previousStateAtDestination"}, this);
    }

    public class00500 u() {
        return this.previousStateAtDestination;
    }

    public class00500 y() {
        return this.state;
    }

    public class07209 N() {
        return this.pos;
    }
}

