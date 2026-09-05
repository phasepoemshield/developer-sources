/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01652
 *  minecraft.class02362
 *  minecraft.class02885
 *  minecraft.class02897
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01652;
import minecraft.class02362;
import minecraft.class02885;
import minecraft.class02897;
import minecraft.class07369;

public final class class07367
extends Record
implements class00381<class01652> {
    private final UUID id;
    private final class07369 action;
    public static final class02362<class00667, class07367> N = class00381.N(class07367::N, class07367::new);

    private class07367(class00667 class006672) {
        this(class006672.m(), (class07369)class006672.y(class07369.class));
    }

    public class07367(UUID uUID, class07369 class073692) {
        this.id = uUID;
        this.action = class073692;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07367.class, "id;action", "id", "action"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07367.class, "id;action", "id", "action"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07367.class, "id;action", "id", "action"}, this);
    }

    public class07369 y() {
        return this.action;
    }

    private void N(class00667 class006672) {
        class006672.N(this.id);
        class006672.N((Enum)this.action);
    }

    public UUID N() {
        return this.id;
    }

    public void method_65081(class01652 class016522) {
        class016522.method_52395(this);
    }

    public class02897<class07367> method_65080() {
        return class02885.b;
    }
}

