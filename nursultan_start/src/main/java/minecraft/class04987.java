/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04719
 *  minecraft.class08314
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class04719;
import minecraft.class08314;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class class04987
extends Record {
    private final boolean worldClosed;
    private final @Nullable String token;
    private final URI uploadEndpoint;
    private static final Logger u = LogUtils.getLogger();
    private static final String i = "http://";
    private static final int R = 8080;
    private static final Pattern M = Pattern.compile("^[a-zA-Z][-a-zA-Z0-9+.]+:");

    public URI L() {
        return this.uploadEndpoint;
    }

    public class04987(boolean bl, @Nullable String string, URI uRI) {
        this.worldClosed = bl;
        this.token = string;
        this.uploadEndpoint = uRI;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04987.class, "worldClosed;token;uploadEndpoint", "worldClosed", "token", "uploadEndpoint"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04987.class, "worldClosed;token;uploadEndpoint", "worldClosed", "token", "uploadEndpoint"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04987.class, "worldClosed;token;uploadEndpoint", "worldClosed", "token", "uploadEndpoint"}, this);
    }

    public @Nullable String y() {
        return this.token;
    }

    public static String y(@Nullable String string) {
        JsonObject jsonObject = new JsonObject();
        if (string != null) {
            jsonObject.addProperty("token", string);
        }
        return jsonObject.toString();
    }

    public static @Nullable class04987 N(String string) {
        try {
            int n;
            URI uRI;
            JsonObject jsonObject = class08314.N((String)string).getAsJsonObject();
            String string2 = class04719.N((String)"uploadEndpoint", (JsonObject)jsonObject, null);
            if (string2 != null && (uRI = class04987.N(string2, n = class04719.N((String)"port", (JsonObject)jsonObject, (int)-1))) != null) {
                boolean bl = class04719.N((String)"worldClosed", (JsonObject)jsonObject, (boolean)false);
                String string3 = class04719.N((String)"token", (JsonObject)jsonObject, null);
                return new class04987(bl, string3, uRI);
            }
        }
        catch (Exception exception) {
            u.error("Could not parse UploadInfo", (Throwable)exception);
        }
        return null;
    }

    private static int N(int n, int n2) {
        if (n != -1) {
            return n;
        }
        if (n2 != -1) {
            return n2;
        }
        return 8080;
    }

    public boolean N() {
        return this.worldClosed;
    }

    private static String N(String string, Matcher matcher) {
        if (matcher.find()) {
            return string;
        }
        return i + string;
    }

    public static @Nullable URI N(String string, int n) {
        Matcher matcher = M.matcher(string);
        String string2 = class04987.N(string, matcher);
        try {
            URI uRI = new URI(string2);
            int n2 = class04987.N(n, uRI.getPort());
            if (n2 != uRI.getPort()) {
                return new URI(uRI.getScheme(), uRI.getUserInfo(), uRI.getHost(), n2, uRI.getPath(), uRI.getQuery(), uRI.getFragment());
            }
            return uRI;
        }
        catch (URISyntaxException uRISyntaxException) {
            u.warn("Failed to parse URI {}", (Object)string2, (Object)uRISyntaxException);
            return null;
        }
    }
}

