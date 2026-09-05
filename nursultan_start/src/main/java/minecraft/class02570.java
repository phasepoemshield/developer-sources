/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.URI;
import java.nio.file.Path;
import java.util.Optional;
import minecraft.class00392;

public final class class02570
extends Record {
    private final class00392 reason;
    private final Optional<Path> report;
    private final Optional<URI> bugReportLink;

    public Optional<URI> L() {
        return this.bugReportLink;
    }

    public class02570(class00392 class003922) {
        this(class003922, Optional.empty(), Optional.empty());
    }

    public class02570(class00392 class003922, Optional<Path> optional, Optional<URI> optional2) {
        this.reason = class003922;
        this.report = optional;
        this.bugReportLink = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02570.class, "reason;report;bugReportLink", "reason", "report", "bugReportLink"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02570.class, "reason;report;bugReportLink", "reason", "report", "bugReportLink"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02570.class, "reason;report;bugReportLink", "reason", "report", "bugReportLink"}, this);
    }

    public Optional<Path> y() {
        return this.report;
    }

    public class00392 N() {
        return this.reason;
    }
}

