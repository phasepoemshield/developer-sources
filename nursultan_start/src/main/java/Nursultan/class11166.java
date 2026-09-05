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
import java.util.Objects;
import java.util.UUID;

public class class11166
extends Record
implements class11776 {
    public UUID uuid;
    public byte[] data;
    public String name;
    public boolean insecure;

    public UUID L() {
        return this.uuid;
    }

    public class11166(boolean bl, UUID uUID, String string, byte[] byArray) {
        this.insecure = bl;
        this.uuid = uUID;
        this.name = string;
        this.data = (byte[])byArray.clone();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class11166)) return false;
        class11166 class111662 = (class11166)((Object)object);
        if (!Objects.equals(this.uuid, class111662.uuid)) return false;
        if (!Objects.equals(this.name, class111662.name)) return false;
        return true;
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11166.class, "insecure;uuid;name;data", "insecure", "uuid", "name", "data"}, this);
    }

    public int hashCode() {
        return Objects.hash(this.uuid, this.name);
    }

    public boolean i() {
        return this.insecure;
    }

    public String u() {
        return this.name;
    }

    public UUID y() {
        return this.uuid;
    }

    public class09054 N() {
        return class09054.MICROSOFT;
    }

    public byte[] R() {
        return (byte[])this.data.clone();
    }
}

