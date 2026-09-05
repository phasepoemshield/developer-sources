/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class02733
 *  minecraft.class04376
 *  minecraft.class07209
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import Nursultan.class10340;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class02733;
import minecraft.class04376;
import minecraft.class07209;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public final class class10346
extends Record
implements class10340 {
    private final class00500 state;
    private final class07209 pos;
    private final class00891 block;
    private final @Nullable class02733 orientation;
    private final boolean movedByPiston;

    public class00891 L() {
        return this.block;
    }

    public class10346(class00500 class005002, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        this.state = class005002;
        this.pos = class072092;
        this.block = class008912;
        this.orientation = class027332;
        this.movedByPiston = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10346.class, "state;pos;block;orientation;movedByPiston", "state", "pos", "block", "orientation", "movedByPiston"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10346.class, "state;pos;block;orientation;movedByPiston", "state", "pos", "block", "orientation", "movedByPiston"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10346.class, "state;pos;block;orientation;movedByPiston", "state", "pos", "block", "orientation", "movedByPiston"}, this);
    }

    public boolean i() {
        return this.movedByPiston;
    }

    public @Nullable class02733 u() {
        return this.orientation;
    }

    public class07209 y() {
        return this.pos;
    }

    public class00500 N() {
        return this.state;
    }

    @Override
    public boolean N(class07299 class072992) {
        class04376.N((class07299)class072992, (class00500)this.state, (class07209)this.pos, (class00891)this.block, (class02733)this.orientation, (boolean)this.movedByPiston);
        return false;
    }

    @Override
    public void N(Consumer<class07209> consumer) {
        consumer.accept(this.pos);
    }
}

