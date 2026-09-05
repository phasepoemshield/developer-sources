/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class00507
 *  minecraft.class00891
 *  minecraft.class02449
 *  minecraft.class06338
 *  minecraft.class08880
 *  minecraft.class08889
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import minecraft.class00500;
import minecraft.class00507;
import minecraft.class00891;
import minecraft.class02449;
import minecraft.class04127;
import minecraft.class06338;
import minecraft.class08880;
import minecraft.class08889;

public final class class04123
extends Record {
    private final Map<String, class08880> models;
    public static final Codec<class04123> N = class06338.u((Codec)Codec.unboundedMap((Codec)Codec.STRING, (Codec)class08880.L)).xmap(class04123::new, class04123::N);

    public class04123(Map<String, class08880> map) {
        this.models = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04123.class, "models", "models"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04123.class, "models", "models"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04123.class, "models", "models"}, this);
    }

    public Map<String, class08880> N() {
        return this.models;
    }

    public void N(class00507<class00891, class00500> class005072, Supplier<String> supplier, BiConsumer<class00500, class08889> biConsumer) {
        this.models.forEach((string, class088802) -> {
            try {
                Predicate predicate = class02449.N((class00507)class005072, (String)string);
                class08889 class088892 = class088802.N();
                for (class00500 class005002 : class005072.N()) {
                    if (!predicate.test(class005002)) continue;
                    biConsumer.accept(class005002, class088892);
                }
            }
            catch (Exception exception) {
                class04127.N.warn("Exception loading blockstate definition: '{}' for variant: '{}': {}", new Object[]{supplier.get(), string, exception.getMessage()});
            }
        });
    }
}

