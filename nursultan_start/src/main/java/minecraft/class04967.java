/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  com.mojang.logging.LogUtils
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04942
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.annotations.SerializedName;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class04942;
import minecraft.class04968;
import minecraft.class04981;
import org.slf4j.Logger;

public final class class04967
extends Record
implements class04942 {
    @SerializedName(value="servers")
    private final List<class04981> servers;
    private static final Logger y = LogUtils.getLogger();

    public class04967(List<class04981> list) {
        this.servers = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04967.class, "servers", "servers"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04967.class, "servers", "servers"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04967.class, "servers", "servers"}, this);
    }

    @SerializedName(value="servers")
    public List<class04981> N() {
        return this.servers;
    }

    public static class04967 N(class04968 class049682, String string) {
        try {
            class04967 class049672 = class049682.N(string, class04967.class);
            if (class049672 != null) {
                class049672.servers.forEach(class04981::N);
                return class049672;
            }
            y.error("Could not parse McoServerList: {}", (Object)string);
        }
        catch (Exception exception) {
            y.error("Could not parse McoServerList", (Throwable)exception);
        }
        return new class04967(List.of());
    }
}

