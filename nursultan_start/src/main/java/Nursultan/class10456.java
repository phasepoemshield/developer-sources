/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01603
 *  minecraft.class01829
 *  minecraft.class04551
 *  minecraft.class04580
 *  minecraft.class08735
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Date;
import minecraft.class01603;
import minecraft.class01829;
import minecraft.class04551;
import minecraft.class04580;
import minecraft.class08735;

public final class class10456
extends Record
implements class04551 {
    private final String id;
    private final String name;
    private final class01829 dataVersion;
    private final int protocolVersion;
    private final class08735 resourcePackVersion;
    private final class08735 datapackVersion;
    private final Date buildTime;
    private final boolean stable;

    public class10456(String string, String string2, class01829 class018292, int n, class08735 class087352, class08735 class087353, Date date, boolean bl) {
        this.id = string;
        this.name = string2;
        this.dataVersion = class018292;
        this.protocolVersion = n;
        this.resourcePackVersion = class087352;
        this.datapackVersion = class087353;
        this.buildTime = date;
        this.stable = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10456.class, "id;name;dataVersion;protocolVersion;resourcePackVersion;datapackVersion;buildTime;stable", "id", "name", "dataVersion", "protocolVersion", "resourcePackVersion", "datapackVersion", "buildTime", "stable"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10456.class, "id;name;dataVersion;protocolVersion;resourcePackVersion;datapackVersion;buildTime;stable", "id", "name", "dataVersion", "protocolVersion", "resourcePackVersion", "datapackVersion", "buildTime", "stable"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10456.class, "id;name;dataVersion;protocolVersion;resourcePackVersion;datapackVersion;buildTime;stable", "id", "name", "dataVersion", "protocolVersion", "resourcePackVersion", "datapackVersion", "buildTime", "stable"}, this);
    }

    public class08735 y() {
        return this.datapackVersion;
    }

    public class08735 N() {
        return this.resourcePackVersion;
    }

    public boolean comp_4031() {
        return this.stable;
    }

    public Date comp_4030() {
        return this.buildTime;
    }

    public int comp_4027() {
        return this.protocolVersion;
    }

    public String comp_4024() {
        return this.id;
    }

    public class01829 comp_4026() {
        return this.dataVersion;
    }

    public String comp_4025() {
        return this.name;
    }

    public class08735 method_70592(class01603 class016032) {
        return switch (class04580.N[class016032.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> this.resourcePackVersion;
            case 2 -> this.datapackVersion;
        };
    }
}

