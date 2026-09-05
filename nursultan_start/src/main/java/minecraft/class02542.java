/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class01194
 *  minecraft.class02560
 *  minecraft.class02841
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class01194;
import minecraft.class02525;
import minecraft.class02560;
import minecraft.class02841;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;

public final class class02542
extends Record
implements class02560 {
    private final class02841 properties;
    private final class00753 offset;
    private final Optional<class03556<class01194>> triggerGameEvent;
    public static final MapCodec<class02542> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02841.y.fieldOf("properties").forGetter(class02542::y), (App)class00753.field_25123.optionalFieldOf("offset", (Object)class00753.field_11176).forGetter(class02542::L), (App)class01194.Nz.optionalFieldOf("trigger_game_event").forGetter(class02542::u)).apply(instance, class02542::new));

    public class00753 L() {
        return this.offset;
    }

    public class02542(class02841 class028412) {
        this(class028412, class00753.field_11176, Optional.of(class01194.L));
    }

    public class02542(class02841 class028412, class00753 class007532, Optional<class03556<class01194>> optional) {
        this.properties = class028412;
        this.offset = class007532;
        this.triggerGameEvent = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02542.class, "properties;offset;triggerGameEvent", "properties", "offset", "triggerGameEvent"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02542.class, "properties;offset;triggerGameEvent", "properties", "offset", "triggerGameEvent"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02542.class, "properties;offset;triggerGameEvent", "properties", "offset", "triggerGameEvent"}, this);
    }

    public Optional<class03556<class01194>> u() {
        return this.triggerGameEvent;
    }

    public class02841 y() {
        return this.properties;
    }

    public void N(class04782 class047822, int n, class02525 class025252, class07049 class070492, class06889 class068892) {
        class00500 class005002;
        class07209 class072092 = class07209.method_49638((class00737)class068892).method_10081(this.offset);
        class00500 class005003 = class070492.method_73183().method_8320(class072092);
        if (class005003 != (class005002 = this.properties.N(class005003)) && class070492.method_73183().method_8652(class072092, class005002, 3)) {
            this.triggerGameEvent.ifPresent(class035562 -> class047822.N(class070492, class035562, class072092));
        }
    }

    public MapCodec<class02542> N() {
        return N;
    }
}

