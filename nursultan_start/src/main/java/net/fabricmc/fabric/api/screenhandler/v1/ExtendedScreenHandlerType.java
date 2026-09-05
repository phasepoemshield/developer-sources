/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02362
 *  minecraft.class03794
 *  minecraft.class04247
 *  minecraft.class05851
 *  minecraft.class07482
 *  minecraft.class08044
 */
package net.fabricmc.fabric.api.screenhandler.v1;

import java.util.Objects;
import minecraft.class02362;
import minecraft.class03794;
import minecraft.class04247;
import minecraft.class05851;
import minecraft.class07482;
import minecraft.class08044;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType$ExtendedFactory;

public class ExtendedScreenHandlerType<T extends class07482, D>
extends class05851<T> {
    private final ExtendedScreenHandlerType$ExtendedFactory<T, D> factory;
    private final class02362<? super class04247, D> packetCodec;

    public T create(int n, class08044 class080442, D d) {
        return this.factory.create(n, class080442, d);
    }

    public ExtendedScreenHandlerType(ExtendedScreenHandlerType$ExtendedFactory<T, D> extendedScreenHandlerType$ExtendedFactory, class02362<? super class04247, D> class023622) {
        super(null, class03794.M);
        this.factory = Objects.requireNonNull(extendedScreenHandlerType$ExtendedFactory, "screen handler factory cannot be null");
        this.packetCodec = Objects.requireNonNull(class023622, "packet codec cannot be null");
    }

    @Deprecated
    public final T method_17434(int n, class08044 class080442) {
        throw new UnsupportedOperationException("Use ExtendedScreenHandlerType.create(int, PlayerInventory, PacketByteBuf)!");
    }

    public class02362<? super class04247, D> getPacketCodec() {
        return this.packetCodec;
    }
}

