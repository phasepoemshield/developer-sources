/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02362
 *  minecraft.class03762
 *  minecraft.class04247
 *  minecraft.class04493
 *  minecraft.class06514
 *  minecraft.class06584
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class02362;
import minecraft.class03762;
import minecraft.class04247;
import minecraft.class04493;
import minecraft.class06514;
import minecraft.class06584;
import minecraft.class07329;

public class class07292
implements class06514<class07329> {
    public static final MapCodec<class07329> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.optionalFieldOf("group", (Object)"").forGetter(class073292 -> class073292.L), (App)class03762.field_40252.fieldOf("category").orElse((Object)class03762.field_40251).forGetter(class073292 -> class073292.u), (App)class04493.y.forGetter(class073292 -> class073292.N), (App)class06584.u.fieldOf("result").forGetter(class073292 -> class073292.y), (App)Codec.BOOL.optionalFieldOf("show_notification", (Object)true).forGetter(class073292 -> class073292.i)).apply(instance, class07329::new));
    public static final class02362<class04247, class07329> l = class02362.N(class07292::N, class07292::N);

    public class02362<class04247, class07329> y() {
        return l;
    }

    public MapCodec<class07329> N() {
        return N;
    }

    private static class07329 N(class04247 class042472) {
        String string = class042472.s();
        class03762 class037622 = (class03762)class042472.y(class03762.class);
        class04493 class044932 = (class04493)class04493.L.decode((Object)class042472);
        class06584 class065842 = (class06584)class06584.z.decode((Object)class042472);
        boolean bl = class042472.readBoolean();
        return new class07329(string, class037622, class044932, class065842, bl);
    }

    private static void N(class04247 class042472, class07329 class073292) {
        class042472.N(class073292.L);
        class042472.N((Enum)class073292.u);
        class04493.L.encode((Object)class042472, (Object)class073292.N);
        class06584.z.encode((Object)class042472, (Object)class073292.y);
        class042472.writeBoolean(class073292.i);
    }
}

