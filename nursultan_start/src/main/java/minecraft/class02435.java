/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class01894
 *  minecraft.class02412
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import minecraft.class01894;
import minecraft.class02412;
import minecraft.class02447;

public sealed interface class02435
permits class02412, class02447 {
    public static final Codec<class02435> N = Codec.xor((Codec)class02412.y, class02447.y).xmap(either -> (class02435)either.map(Function.identity(), Function.identity()), class024352 -> {
        class02435 class024353 = class024352;
        Objects.requireNonNull(class024353);
        class02435 class024354 = class024353;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class02412.class, class02447.class}, (Object)class024354, (int)n)) {
            default -> throw new MatchException(null, null);
            case 0 -> Either.left((Object)((class02412)class024354));
            case 1 -> Either.right((Object)((class02447)class024354));
        };
    });

    public Set<class01894> y();

    public String N();
}

