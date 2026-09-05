/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00507
 *  minecraft.class00522
 *  minecraft.class01968
 *  minecraft.class01975
 *  minecraft.class06338
 *  minecraft.class07536
 *  minecraft.class08092
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.function.Predicate;
import minecraft.class00507;
import minecraft.class00522;
import minecraft.class01968;
import minecraft.class01975;
import minecraft.class06338;
import minecraft.class07536;
import minecraft.class08092;
import org.slf4j.Logger;

public final class class01942
extends Record
implements class01975 {
    private final Map<String, class01968> tests;
    static final Logger y = LogUtils.getLogger();
    public static final Codec<class01942> L = class06338.u((Codec)Codec.unboundedMap((Codec)Codec.STRING, (Codec)class01968.N)).xmap(class01942::new, class01942::N);

    public class01942(Map<String, class01968> map) {
        this.tests = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01942.class, "tests", "tests"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01942.class, "tests", "tests"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01942.class, "tests", "tests"}, this);
    }

    private static <O, S extends class00522<O, S>> Predicate<S> N(class00507<O, S> class005072, String string, class01968 class019682) {
        class08092 var3 = class005072.N(string);
        if (var3 == null) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Unknown property '%s' on '%s'", string, class005072.L()));
        }
        return class019682.N(class005072.L(), var3);
    }

    public Map<String, class01968> N() {
        return this.tests;
    }

    public <O, S extends class00522<O, S>> Predicate<S> N(class00507<O, S> class005072) {
        ArrayList arrayList = new ArrayList(this.tests.size());
        this.tests.forEach((string, class019682) -> arrayList.add(class01942.N(class005072, string, class019682)));
        return class07536.N(arrayList);
    }
}

