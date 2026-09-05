/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00667
 *  minecraft.class01042
 *  net.fabricmc.fabric.impl.networking.FabricRegistryByteBuf
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import minecraft.class00667;
import minecraft.class01042;
import net.fabricmc.fabric.impl.networking.FabricRegistryByteBuf;
import org.jspecify.annotations.Nullable;

public class class04247
extends class00667
implements FabricRegistryByteBuf {
    private final class01042 L;
    private Set u = null;

    public class04247(ByteBuf byteBuf, class01042 class010422) {
        super(byteBuf);
        this.L = class010422;
    }

    public class01042 J() {
        return this.L;
    }

    public static Function<ByteBuf, class04247> N(class01042 class010422) {
        return byteBuf -> new class04247((ByteBuf)byteBuf, class010422);
    }

    public void fabric_setSendableConfigurationChannels(Set set) {
        this.u = Objects.requireNonNull(set);
    }

    public @Nullable Set fabric_getSendableConfigurationChannels() {
        return this.u;
    }
}

