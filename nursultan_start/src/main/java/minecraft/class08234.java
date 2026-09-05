/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00502
 *  minecraft.class07079
 *  minecraft.class08731
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00502;
import minecraft.class07079;
import minecraft.class08731;
import org.jspecify.annotations.Nullable;

public final class class08234
extends Record {
    private final class08731 type;
    private final boolean keepEquipment;
    private final boolean preserveCanPickUpLoot;
    private final @Nullable class00502 team;

    public boolean L() {
        return this.preserveCanPickUpLoot;
    }

    public class08234(class08731 class087312, boolean bl, boolean bl2, @Nullable class00502 class005022) {
        this.type = class087312;
        this.keepEquipment = bl;
        this.preserveCanPickUpLoot = bl2;
        this.team = class005022;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08234.class, "type;keepEquipment;preserveCanPickUpLoot;team", "type", "keepEquipment", "preserveCanPickUpLoot", "team"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08234.class, "type;keepEquipment;preserveCanPickUpLoot;team", "type", "keepEquipment", "preserveCanPickUpLoot", "team"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08234.class, "type;keepEquipment;preserveCanPickUpLoot;team", "type", "keepEquipment", "preserveCanPickUpLoot", "team"}, this);
    }

    public @Nullable class00502 u() {
        return this.team;
    }

    public boolean y() {
        return this.keepEquipment;
    }

    public static class08234 N(class07079 class070792, boolean bl, boolean bl2) {
        return new class08234(class08731.field_54080, bl, bl2, class070792.method_5781());
    }

    public class08731 N() {
        return this.type;
    }
}

