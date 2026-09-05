/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07905
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class07414;
import minecraft.class07422;
import minecraft.class07905;

public final class class07420
extends Record {
    private final String jsonRpcProtocolVersion;
    private final class07414 discoverInfo;
    private final List<class07905<?, ?>> methods;
    private final class07422 components;
    public static final MapCodec<class07420> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.fieldOf("openrpc").forGetter(class07420::N), (App)class07414.N.codec().fieldOf("info").forGetter(class07420::y), (App)Codec.list((Codec)class07905.N).fieldOf("methods").forGetter(class07420::L), (App)class07422.N.codec().fieldOf("components").forGetter(class07420::u)).apply(instance, class07420::new));

    public List<class07905<?, ?>> L() {
        return this.methods;
    }

    public class07420(String string, class07414 class074142, List<class07905<?, ?>> list, class07422 class074222) {
        this.jsonRpcProtocolVersion = string;
        this.discoverInfo = class074142;
        this.methods = list;
        this.components = class074222;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07420.class, "jsonRpcProtocolVersion;discoverInfo;methods;components", "jsonRpcProtocolVersion", "discoverInfo", "methods", "components"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07420.class, "jsonRpcProtocolVersion;discoverInfo;methods;components", "jsonRpcProtocolVersion", "discoverInfo", "methods", "components"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07420.class, "jsonRpcProtocolVersion;discoverInfo;methods;components", "jsonRpcProtocolVersion", "discoverInfo", "methods", "components"}, this);
    }

    public class07422 u() {
        return this.components;
    }

    public class07414 y() {
        return this.discoverInfo;
    }

    public String N() {
        return this.jsonRpcProtocolVersion;
    }
}

