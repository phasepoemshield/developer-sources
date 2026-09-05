/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09054
 *  Nursultan.class11776
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09054;
import Nursultan.class11776;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.UUID;

public class class11991
extends Record
implements class11776 {
    public String name;
    public boolean generated;
    public UUID skinUuid;

    public static UUID L(String string) {
        return UUID.nameUUIDFromBytes(("OfflinePlayer:" + string).getBytes(StandardCharsets.UTF_8));
    }

    public UUID L() {
        return this.skinUuid != null ? this.skinUuid : this.y();
    }

    public class11991(String string, UUID uUID, boolean bl) {
        this.name = string;
        this.skinUuid = uUID;
        this.generated = bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class11991)) return false;
        class11991 class119912 = (class11991)((Object)object);
        if (!Objects.equals(this.name, class119912.name)) return false;
        return true;
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11991.class, "name;skinUuid;generated", "name", "skinUuid", "generated"}, this);
    }

    public int hashCode() {
        return Objects.hashCode(this.name);
    }

    public UUID i() {
        return this.skinUuid;
    }

    public String u() {
        return this.name;
    }

    public static class11991 y(String string) {
        return new class11991(string, null, false);
    }

    public UUID y() {
        return class11991.L(this.name);
    }

    public static class11991 N(String string) {
        return new class11991(string, null, true);
    }

    public class09054 N() {
        return this.generated ? class09054.OFFLINE_GENERATED : class09054.OFFLINE;
    }

    public boolean R() {
        return this.generated;
    }
}

