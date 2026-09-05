/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$Error
 *  com.mojang.serialization.DataResult$Success
 *  com.mojang.serialization.DynamicOps
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class04480
 *  minecraft.class04490
 *  minecraft.class07709
 *  minecraft.class07741
 *  minecraft.class08294
 *  minecraft.class08297
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import minecraft.class04480;
import minecraft.class04490;
import minecraft.class07709;
import minecraft.class07741;
import minecraft.class08294;
import minecraft.class08297;

class class08330<T>
implements class08294<T> {
    private final class04490 N;
    private final String y;
    private final DynamicOps<class07709> L;
    private final Codec<T> u;
    private final class07741 i;

    class08330(class04490 class044902, String string, DynamicOps<class07709> dynamicOps, Codec<T> codec, class07741 class077412) {
        this.N = class044902;
        this.y = string;
        this.L = dynamicOps;
        this.u = codec;
        this.i = class077412;
    }

    public void N(T t) {
        DataResult dataResult = this.u.encodeStart(this.L, t);
        Objects.requireNonNull(dataResult);
        DataResult var2 = dataResult;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{DataResult.Success.class, DataResult.Error.class}, (Object)var2, (int)n)) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                DataResult.Success success = (DataResult.Success)var2;
                this.i.add((Object)((class07709)success.value()));
                break;
            }
            case 1: {
                DataResult.Error error = (DataResult.Error)var2;
                this.N.N_47((class04480)new class08297(this.y, t, error));
                error.partialValue().ifPresent(arg_0 -> this.i.add(arg_0));
            }
        }
    }

    public boolean N() {
        return this.i.isEmpty();
    }
}

