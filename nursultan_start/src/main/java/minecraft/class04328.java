/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Unit
 *  com.mojang.serialization.Codec
 *  minecraft.class00392
 *  minecraft.class01962
 *  minecraft.class03448
 *  minecraft.class04344
 *  minecraft.class04370
 *  minecraft.class04380
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class05914
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class07086
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import minecraft.class00392;
import minecraft.class01962;
import minecraft.class03448;
import minecraft.class04344;
import minecraft.class04370;
import minecraft.class04380;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class05914;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class07086;
import org.jspecify.annotations.Nullable;

public class class04328
extends class05914 {
    private static final class00392 N = class00392.L((String)"options.online.title");
    private @Nullable class04370<Unit> y;

    public class04328(class05096 class050962, class05630 class056302) {
        super(class050962, class056302, N);
    }

    private class04370<?>[] N(class05630 class056302, class06202 class062022) {
        ArrayList<class04370> arrayList = new ArrayList<class04370>();
        arrayList.add(class056302.NB());
        arrayList.add(class056302.NZ());
        class04370 class043702 = (class04370)class01962.N((Object)((class03448)class062022.T_3), class034482 -> {
            class07086 class070862 = class034482.y();
            return new class04370("options.difficulty.online", class04370.method_42399(), (class003922, unit) -> class070862.y(), (class04344)new class04380(List.of(Unit.INSTANCE), Codec.EMPTY.codec()), (Object)Unit.INSTANCE, unit -> {});
        });
        if (class043702 != null) {
            this.y = class043702;
            arrayList.add(class043702);
        }
        return arrayList.toArray(new class04370[0]);
    }

    public void method_25426() {
        class06478 class064782;
        super.method_25426();
        if (this.y != null && (class064782 = this.field_51824.y(this.y)) != null) {
            class064782.field_22763 = false;
        }
    }

    protected void method_60325() {
        this.field_51824.N(this.N(this.field_21336, this.field_22787));
    }
}

