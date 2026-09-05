/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00001
 *  minecraft.class00007
 *  minecraft.class00010
 *  minecraft.class00019
 *  minecraft.class00021
 *  minecraft.class00023
 *  minecraft.class00667
 *  minecraft.class00753
 *  minecraft.class00945
 *  minecraft.class01487
 *  minecraft.class02362
 *  minecraft.class02874
 *  minecraft.class02895
 *  minecraft.class07049
 *  minecraft.class07299
 *  minecraft.class07321
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import minecraft.class00001;
import minecraft.class00007;
import minecraft.class00010;
import minecraft.class00019;
import minecraft.class00021;
import minecraft.class00023;
import minecraft.class00025;
import minecraft.class00027;
import minecraft.class00028;
import minecraft.class00036;
import minecraft.class00667;
import minecraft.class00753;
import minecraft.class00945;
import minecraft.class01487;
import minecraft.class02362;
import minecraft.class02874;
import minecraft.class02895;
import minecraft.class07049;
import minecraft.class07299;
import minecraft.class07321;
import org.slf4j.Logger;

public abstract class class00037
implements class00001 {
    static final Logger N = LogUtils.getLogger();
    public static final class02362<ByteBuf, class00037> y = class02362.N_34(class00037::N, class00037::L);
    protected final Either<UUID, String> L;
    private final class00028 u;
    private final class00025 i;

    private static class00037 L(ByteBuf byteBuf) {
        class00667 class006672 = new class00667(byteBuf);
        Either either = class006672.y((class02895)class01487.M, class00667::s);
        class00028 class000282 = (class00028)class00028.y.decode((Object)class006672);
        return (class00037)((class00025)class006672.y(class00025.class)).field_59782.apply((Object)either, (Object)class000282, (Object)class006672);
    }

    class00037(Either<UUID, String> either, class00028 class000282, class00025 class000252) {
        this.L = either;
        this.u = class000282;
        this.i = class000252;
    }

    public class00028 y() {
        return this.u;
    }

    public abstract void y(ByteBuf var1);

    public abstract double N(class07299 var1, class00023 var2, class00945 var3);

    public abstract class00036 N(class07299 var1, class00007 var2, class00945 var3);

    public static class00037 N(UUID uUID) {
        return new class00027(uUID);
    }

    public abstract double N(class07049 var1);

    public static class00037 N(UUID uUID, class00028 class000282, class07321 class073212) {
        return new class00019(uUID, class000282, class073212);
    }

    public void N(ByteBuf byteBuf) {
        class00667 class006672 = new class00667(byteBuf);
        class006672.N(this.L, (class02874)class01487.M, class00667::N);
        class00028.y.encode((Object)class006672, (Object)this.u);
        class006672.N((Enum)this.i);
        this.y(byteBuf);
    }

    public abstract void N(class00037 var1);

    public static class00037 N(UUID uUID, class00028 class000282, class00753 class007532) {
        return new class00021(uUID, class000282, class007532);
    }

    public Either<UUID, String> N() {
        return this.L;
    }

    public static class00037 N(UUID uUID, class00028 class000282, float f) {
        return new class00010(uUID, class000282, f);
    }
}

