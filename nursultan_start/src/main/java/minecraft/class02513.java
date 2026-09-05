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
 *  minecraft.class00672
 *  minecraft.class00737
 *  minecraft.class02560
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05946
 *  minecraft.class06113
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00672;
import minecraft.class00737;
import minecraft.class02525;
import minecraft.class02560;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05946;
import minecraft.class06113;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;

public final class class02513
extends Record
implements class02560 {
    private final class03543<class07078<?>> entityTypes;
    private final boolean joinTeam;
    public static final MapCodec<class02513> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03541.N((class05946)class04227.I).fieldOf("entity").forGetter(class02513::y), (App)Codec.BOOL.optionalFieldOf("join_team", (Object)false).forGetter(class02513::L)).apply(instance, class02513::new));

    public boolean L() {
        return this.joinTeam;
    }

    public class02513(class03543<class07078<?>> class035432, boolean bl) {
        this.entityTypes = class035432;
        this.joinTeam = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02513.class, "entityTypes;joinTeam", "entityTypes", "joinTeam"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02513.class, "entityTypes;joinTeam", "entityTypes", "joinTeam"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02513.class, "entityTypes;joinTeam", "entityTypes", "joinTeam"}, this);
    }

    public class03543<class07078<?>> y() {
        return this.entityTypes;
    }

    public MapCodec<class02513> N() {
        return N;
    }

    public void N(class04782 class047822, int n, class02525 class025252, class07049 class070492, class06889 class068892) {
        class07209 class072092 = class07209.method_49638((class00737)class068892);
        if (!class07299.method_25953((class07209)class072092)) {
            return;
        }
        Optional optional = this.y().N(class047822.method_8409());
        if (optional.isEmpty()) {
            return;
        }
        class07049 class070493 = ((class07078)((class03556)optional.get()).N()).N(class047822, class072092, class06113.field_16461);
        if (class070493 == null) {
            return;
        }
        if (class070493 instanceof class00672) {
            class00672 class006722 = (class00672)class070493;
            class07438 class074382 = class025252.L();
            if (class074382 instanceof class04770) {
                class04770 class047702 = (class04770)class074382;
                class006722.N(class047702);
            }
        }
        if (this.joinTeam && class070492.method_5781() != null) {
            class047822.method_14170().N(class070493.method_5820(), class070492.method_5781());
        }
        class070493.method_5808(class068892.M, class068892.B, class068892.Z, class070493.method_36454(), class070493.method_36455());
    }
}

