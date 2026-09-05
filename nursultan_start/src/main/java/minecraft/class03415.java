/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.yggdrasil.request.AbuseReportRequest$ClientInfo
 *  com.mojang.authlib.yggdrasil.request.AbuseReportRequest$RealmInfo
 *  com.mojang.authlib.yggdrasil.request.AbuseReportRequest$ThirdPartyServerInfo
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04981
 *  minecraft.class06202
 *  minecraft.class07529
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.authlib.yggdrasil.request.AbuseReportRequest;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Locale;
import minecraft.class03388;
import minecraft.class03395;
import minecraft.class03405;
import minecraft.class04981;
import minecraft.class06202;
import minecraft.class07529;
import org.jspecify.annotations.Nullable;

public final class class03415
extends Record {
    private final String clientVersion;
    private final @Nullable class03405 server;

    public // Could not load outer class - annotation placement on inner may be incorrect
     @Nullable AbuseReportRequest.ThirdPartyServerInfo L() {
        class03405 class034052 = this.server;
        if (class034052 instanceof class03388) {
            class03388 class033882 = (class03388)class034052;
            return new AbuseReportRequest.ThirdPartyServerInfo(class033882.N());
        }
        return null;
    }

    private static String M() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(class07529.y().comp_4024());
        if (class06202.Z().N()) {
            stringBuilder.append(" (modded)");
        }
        return stringBuilder.toString();
    }

    public class03415(String string, @Nullable class03405 class034052) {
        this.clientVersion = string;
        this.server = class034052;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03415.class, "clientVersion;server", "clientVersion", "server"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03415.class, "clientVersion;server", "clientVersion", "server"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03415.class, "clientVersion;server", "clientVersion", "server"}, this);
    }

    public String i() {
        return this.clientVersion;
    }

    public // Could not load outer class - annotation placement on inner may be incorrect
     @Nullable AbuseReportRequest.RealmInfo u() {
        class03405 class034052 = this.server;
        if (class034052 instanceof class03395) {
            class03395 class033952 = (class03395)class034052;
            return new AbuseReportRequest.RealmInfo(String.valueOf(class033952.N()), class033952.y());
        }
        return null;
    }

    public AbuseReportRequest.ClientInfo y() {
        return new AbuseReportRequest.ClientInfo(this.clientVersion, Locale.getDefault().toLanguageTag());
    }

    public static class03415 N() {
        return class03415.N(null);
    }

    public static class03415 N(String string) {
        return class03415.N(new class03388(string));
    }

    public static class03415 N(class04981 class049812) {
        return class03415.N(new class03395(class049812));
    }

    public static class03415 N(@Nullable class03405 class034052) {
        return new class03415(class03415.M(), class034052);
    }

    public @Nullable class03405 R() {
        return this.server;
    }
}

