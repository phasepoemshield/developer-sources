/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class03556
 *  minecraft.class05216
 *  minecraft.class05523
 *  minecraft.class07209
 *  minecraft.class08092
 *  minecraft.class08594
 *  minecraft.class08620
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class00195;
import minecraft.class00201;
import minecraft.class00225;
import minecraft.class00235;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class03556;
import minecraft.class05216;
import minecraft.class05523;
import minecraft.class07209;
import minecraft.class08092;
import minecraft.class08594;
import minecraft.class08620;

public class class00200
extends class00201 {
    public static final MapCodec<class00200> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00195.N.forGetter(class00201::m)).apply(instance, class00200::new));

    public class00200(class00195<class03556<class00225>> class001952) {
        super(class001952);
    }

    @Override
    protected class05216 y() {
        return class00392.L((String)"test_instance.type.block_based");
    }

    private class07209 y(class05523 class055232) {
        List<class07209> var2 = this.N(class055232, class00235.field_56024);
        if (var2.isEmpty()) {
            class055232.y((class00392)class00392.N((String)"test_block.error.missing", (Object[])new Object[]{class00235.field_56024.N()}));
        }
        if (var2.size() != 1) {
            class055232.y((class00392)class00392.N((String)"test_block.error.too_many", (Object[])new Object[]{class00235.field_56024.N()}));
        }
        return (class07209)var2.getFirst();
    }

    @Override
    public void N(class05523 class055232) {
        class07209 class072092 = this.y(class055232);
        ((class08594)class055232.N(class072092, class08594.class)).R();
        class055232.i(() -> {
            List<class07209> var2 = this.N(class055232, class00235.field_56027);
            if (var2.isEmpty()) {
                class055232.y((class00392)class00392.N((String)"test_block.error.missing", (Object[])new Object[]{class00235.field_56027.N()}));
            }
            if (var2.stream().map(class072092 -> (class08594)class055232.N(class072092, class08594.class)).anyMatch(class08594::B)) {
                class055232.u();
            } else {
                this.N(class055232, class00235.field_56026, class085942 -> class055232.y((class00392)class00392.y((String)class085942.Z())));
                this.N(class055232, class00235.field_56025, class08594::R);
            }
        });
    }

    public MapCodec<class00200> N() {
        return N;
    }

    private void N(class05523 class055232, class00235 class002352, Consumer<class08594> consumer) {
        for (class07209 class072092 : this.N(class055232, class002352)) {
            class08594 class085942 = (class08594)class055232.N(class072092, class08594.class);
            if (!class085942.B()) continue;
            consumer.accept(class085942);
            class085942.u();
        }
    }

    private List<class07209> N(class05523 class055232, class00235 class002352) {
        ArrayList<class07209> arrayList = new ArrayList<class07209>();
        class055232.N((T class072092) -> {
            class00500 class005002 = class055232.N(class072092);
            if (class005002.N(class00869.TN) && class005002.L((class08092)class08620.y) == class002352) {
                arrayList.add(class072092.method_10062());
            }
        });
        return arrayList;
    }
}

