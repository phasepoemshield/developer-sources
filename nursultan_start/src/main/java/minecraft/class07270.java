/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class03748
 *  minecraft.class04247
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class03748;
import minecraft.class04247;
import minecraft.class07238;
import minecraft.class07239;
import minecraft.class07262;

final class class07270
extends Record
implements class07238 {
    private final class00392 name;

    public class07270(class04247 class042472) {
        this((class00392)class03748.u.decode((Object)class042472));
    }

    class07270(class00392 class003922) {
        this.name = class003922;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07270.class, "name", "name"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07270.class, "name", "name"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07270.class, "name", "name"}, this);
    }

    public class00392 y() {
        return this.name;
    }

    @Override
    public void N(class04247 class042472) {
        class03748.u.encode((Object)class042472, (Object)this.name);
    }

    @Override
    public class07239 N() {
        return class07239.field_29110;
    }

    @Override
    public void N(UUID uUID, class07262 class072622) {
        class072622.N(uUID, this.name);
    }
}

