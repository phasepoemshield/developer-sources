/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBufUtil
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class00423
 *  minecraft.class00648
 *  minecraft.class00667
 *  minecraft.class01657
 *  minecraft.class01659
 *  minecraft.class01666
 *  minecraft.class01668
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class04247
 *  minecraft.class04275
 *  net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.networking;

import io.netty.buffer.ByteBufUtil;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import minecraft.class00423;
import minecraft.class00648;
import minecraft.class00667;
import minecraft.class01657;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01668;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class04247;
import minecraft.class04275;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import org.jspecify.annotations.Nullable;

public class PayloadTypeRegistryImpl<B extends class00667>
implements PayloadTypeRegistry<B> {
    public static final PayloadTypeRegistryImpl<class00667> CONFIGURATION_C2S = new PayloadTypeRegistryImpl(class00648.field_45671, class00423.field_11941);
    public static final PayloadTypeRegistryImpl<class00667> CONFIGURATION_S2C = new PayloadTypeRegistryImpl(class00648.field_45671, class00423.field_11942);
    public static final PayloadTypeRegistryImpl<class04247> PLAY_C2S = new PayloadTypeRegistryImpl(class00648.field_20591, class00423.field_11941);
    public static final PayloadTypeRegistryImpl<class04247> PLAY_S2C = new PayloadTypeRegistryImpl(class00648.field_20591, class00423.field_11942);
    private final Map<class01894, class01668<B, ? extends class01659>> packetTypes = new HashMap<class01894, class01668<B, ? extends class01659>>();
    private final Object2IntMap<class01894> maxPacketSize = new Object2IntOpenHashMap();
    private final class00648 state;
    private final class00423 side;
    private final int minimalSplittableSize;

    private PayloadTypeRegistryImpl(class00648 class006482, class00423 class004232) {
        this.state = class006482;
        this.side = class004232;
        this.minimalSplittableSize = class004232 == class00423.field_11942 ? 0x100000 : Short.MAX_VALUE;
    }

    public static @Nullable PayloadTypeRegistryImpl<?> get(class04275<?> class042752) {
        return switch (class042752.N()) {
            case class00648.field_45671 -> {
                if (class042752.y() == class00423.field_11942) {
                    yield CONFIGURATION_S2C;
                }
                yield CONFIGURATION_C2S;
            }
            case class00648.field_20591 -> {
                if (class042752.y() == class00423.field_11942) {
                    yield PLAY_S2C;
                }
                yield PLAY_C2S;
            }
            default -> null;
        };
    }

    public @Nullable class01668<B, ? extends class01659> get(class01894 class018942) {
        return this.packetTypes.get(class018942);
    }

    public <T extends class01659> @Nullable class01668<B, T> get(class01666<T> class016662) {
        return this.packetTypes.get(class016662.N());
    }

    public <T extends class01659> class01668<? super B, T> register(class01666<T> class016662, class02362<? super B, T> class023622) {
        Objects.requireNonNull(class016662, "id");
        Objects.requireNonNull(class023622, "codec");
        class01668 class016682 = new class01668(class016662, class023622.N());
        if (this.packetTypes.containsKey(class016662.N())) {
            throw new IllegalArgumentException("Packet type " + String.valueOf(class016662) + " is already registered!");
        }
        this.packetTypes.put(class016662.N(), class016682);
        return class016682;
    }

    public <T extends class01659> class01668<? super B, T> registerLarge(class01666<T> class016662, class02362<? super B, T> class023622, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Provided maxPayloadSize needs to be positive!");
        }
        class01668<? super B, T> class016682 = this.register(class016662, class023622);
        int n2 = ByteBufUtil.utf8MaxBytes((CharSequence)class016662.N().toString());
        int n3 = n + class01657.N((int)n2) + n2 + 10;
        if (n3 < 0) {
            n3 = Integer.MAX_VALUE;
        }
        if (n3 > this.minimalSplittableSize) {
            this.maxPacketSize.put((Object)class016662.N(), n3);
        }
        return class016682;
    }

    public int getMaxPacketSize(class01894 class018942) {
        return this.maxPacketSize.getOrDefault((Object)class018942, -1);
    }

    public class00423 getSide() {
        return this.side;
    }

    public class00648 getPhase() {
        return this.state;
    }
}

