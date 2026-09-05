/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01659
 *  minecraft.class01666
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class03748
 *  minecraft.class04247
 */
package net.fabricmc.fabric.impl.screenhandler;

import minecraft.class00392;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class03748;
import minecraft.class04247;
import net.fabricmc.fabric.impl.screenhandler.Networking;

public record Networking$OpenScreenPayload<D>(class01894 identifier, int syncId, class00392 title, class02362<class04247, D> innerCodec, D data) implements class01659
{
    public static final class02362<class04247, Networking$OpenScreenPayload<?>> CODEC = class01659.N(Networking$OpenScreenPayload::write, Networking$OpenScreenPayload::fromBuf);
    public static final class01666<Networking$OpenScreenPayload<?>> ID = new class01666(Networking.OPEN_ID);

    private void write(class04247 class042472) {
        class042472.N(this.identifier);
        class042472.E(this.syncId);
        class03748.y.encode((Object)class042472, (Object)this.title);
        this.innerCodec.encode((Object)class042472, this.data);
    }

    public class01666<? extends class01659> method_56479() {
        return ID;
    }

    private static <D> Networking$OpenScreenPayload<D> fromBuf(class04247 class042472) {
        class01894 class018942 = class042472.T();
        class02362<? super class04247, ?> class023622 = Networking.CODEC_BY_ID.get(class018942);
        return new Networking$OpenScreenPayload<Object>(class018942, class042472.readByte(), (class00392)class03748.y.decode((Object)class042472), (class02362<class04247, Object>)class023622, (class023622 == null ? null : class023622.decode((Object)class042472)));
    }
}

