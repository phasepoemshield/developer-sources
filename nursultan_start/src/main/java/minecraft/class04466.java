/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class00471
 *  minecraft.class02484
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04449
 *  minecraft.class05908
 *  minecraft.class05946
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06584
 *  minecraft.class07439
 *  minecraft.class08582
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import minecraft.class00453;
import minecraft.class00471;
import minecraft.class02484;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04449;
import minecraft.class05908;
import minecraft.class05946;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class07439;
import minecraft.class08582;

public class class04466
extends class00453 {
    public static final MapCodec<class04466> N = RecordCodecBuilder.mapCodec(instance -> class04466.N(instance).and((App)class03530.y((class05946)class04227.yZ).fieldOf("options").forGetter(class044662 -> class044662.y)).apply(instance, class04466::new));
    private final class03530<class04449> y;

    private class04466(List<class05957> list, class03530<class04449> class035302) {
        super(list);
        this.y = class035302;
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        Optional optional = class059082.u().method_30349().L(class04227.yZ).N(this.y, class059082.y());
        if (optional.isPresent()) {
            class065842.N(class02484.NZ, (Object)new class08582((class03556)optional.get()));
        }
        return class065842;
    }

    public class05959<class04466> N() {
        return class07439.J;
    }

    public static class00471<?> N(class03530<class04449> class035302) {
        return class04466.N((T list) -> new class04466((List<class05957>)list, class035302));
    }
}

