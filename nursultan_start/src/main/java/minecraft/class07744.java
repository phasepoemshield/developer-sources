/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.MapLike
 *  java.lang.MatchException
 *  minecraft.class07001
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapLike;
import java.util.stream.Stream;
import minecraft.class07001;
import minecraft.class07707;
import minecraft.class07709;
import minecraft.class07713;
import org.jspecify.annotations.Nullable;

class class07744
implements MapLike<class07709> {
    final /* synthetic */ class07001 N;
    final /* synthetic */ class07713 y;

    class07744(class07713 class077132, class07001 class070012) {
        this.y = class077132;
        this.N = class070012;
    }

    public String toString() {
        return "MapLike[" + String.valueOf(this.N) + "]";
    }

    public Stream<Pair<class07709, class07709>> entries() {
        return this.N.M().stream().map(entry -> Pair.of((Object)this.y.createString((String)entry.getKey()), (Object)((class07709)entry.getValue())));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public @Nullable class07709 get(class07709 class077092) {
        String string;
        if (!(class077092 instanceof class07707)) throw new UnsupportedOperationException("Cannot get map entry with non-string key: " + String.valueOf(class077092));
        class07707 class077072 = (class07707)((Object)class077092);
        try {
            string = class077072.U();
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
        return this.N.N(string);
    }

    public @Nullable class07709 get(String string) {
        return this.N.N(string);
    }
}

