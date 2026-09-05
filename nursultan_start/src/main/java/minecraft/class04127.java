/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class00507
 *  minecraft.class00891
 *  minecraft.class08855
 *  minecraft.class08889
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import minecraft.class00500;
import minecraft.class00507;
import minecraft.class00891;
import minecraft.class04123;
import minecraft.class04125;
import minecraft.class08855;
import minecraft.class08889;
import org.slf4j.Logger;

public final class class04127
extends Record {
    private final Optional<class04123> simpleModels;
    private final Optional<class04125> multiPart;
    static final Logger N = LogUtils.getLogger();
    public static final Codec<class04127> y = RecordCodecBuilder.create(instance -> instance.group((App)class04123.N.optionalFieldOf("variants").forGetter(class04127::N), (App)class04125.N.optionalFieldOf("multipart").forGetter(class04127::y)).apply(instance, class04127::new)).validate(class041272 -> {
        if (class041272.N().isEmpty() && class041272.y().isEmpty()) {
            return DataResult.error(() -> "Neither 'variants' nor 'multipart' found");
        }
        return DataResult.success((Object)class041272);
    });

    public class04127(Optional<class04123> optional, Optional<class04125> optional2) {
        this.simpleModels = optional;
        this.multiPart = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04127.class, "simpleModels;multiPart", "simpleModels", "multiPart"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04127.class, "simpleModels;multiPart", "simpleModels", "multiPart"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04127.class, "simpleModels;multiPart", "simpleModels", "multiPart"}, this);
    }

    public Optional<class04125> y() {
        return this.multiPart;
    }

    public Map<class00500, class08889> N(class00507<class00891, class00500> class005072, Supplier<String> supplier) {
        IdentityHashMap<class00500, class08889> identityHashMap = new IdentityHashMap<class00500, class08889>();
        this.simpleModels.ifPresent(class041232 -> class041232.N(class005072, supplier, (class005002, class088892) -> {
            if (identityHashMap.put((class00500)class005002, (class08889)class088892) != null) {
                throw new IllegalArgumentException("Overlapping definition on state: " + String.valueOf(class005002));
            }
        }));
        this.multiPart.ifPresent(class041252 -> {
            ImmutableList immutableList = class005072.N();
            class08855 class088552 = class041252.N(class005072);
            for (class00500 class005002 : immutableList) {
                identityHashMap.putIfAbsent(class005002, (class08889)class088552);
            }
        });
        return identityHashMap;
    }

    public Optional<class04123> N() {
        return this.simpleModels;
    }
}

