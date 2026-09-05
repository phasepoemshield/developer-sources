/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.report.AbuseReport
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03752
 */
package minecraft;

import com.mojang.authlib.minecraft.report.AbuseReport;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import minecraft.class03752;

public final class class02044
extends Record {
    private final UUID id;
    private final class03752 reportType;
    private final AbuseReport report;

    public AbuseReport L() {
        return this.report;
    }

    public class02044(UUID uUID, class03752 class037522, AbuseReport abuseReport) {
        this.id = uUID;
        this.reportType = class037522;
        this.report = abuseReport;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02044.class, "id;reportType;report", "id", "reportType", "report"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02044.class, "id;reportType;report", "id", "reportType", "report"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02044.class, "id;reportType;report", "id", "reportType", "report"}, this);
    }

    public class03752 y() {
        return this.reportType;
    }

    public UUID N() {
        return this.id;
    }
}

