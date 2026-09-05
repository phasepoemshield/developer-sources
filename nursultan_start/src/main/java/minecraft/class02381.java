/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09702
 *  io.netty.buffer.ByteBuf
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  minecraft.class00489
 *  minecraft.class00559
 *  minecraft.class01657
 *  minecraft.class01659
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class09702;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.List;
import java.util.function.Function;
import minecraft.class00489;
import minecraft.class00559;
import minecraft.class01657;
import minecraft.class01659;
import minecraft.class02362;
import minecraft.class02365;
import minecraft.class02396;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class02381<B extends ByteBuf, V, T>
implements class02362<B, V> {
    private static final int N = -1;
    private final Function<V, ? extends T> y;
    private final List<class02365<B, V, T>> L;
    private final Object2IntMap<T> u;

    class02381(Function<V, ? extends T> function, List<class02365<B, V, T>> list, Object2IntMap<T> object2IntMap) {
        this.y = function;
        this.L = list;
        this.u = object2IntMap;
    }

    public void N(ByteBuf byteBuf, Object object, CallbackInfo callbackInfo, Object object2, Exception exception) {
        class01659 class016592 = null;
        if (object instanceof class00559) {
            class016592 = ((class00559)object).N();
        } else if (object instanceof class00489) {
            class016592 = ((class00489)object).N();
        }
        if (class016592 != null && class016592.method_56479() != null) {
            throw new EncoderException("Failed to encode packet '%s' (%s)".formatted(new Object[]{object2, class016592.method_56479().N().toString()}), (Throwable)exception);
        }
    }

    public static <B extends ByteBuf, V, T> class02396<B, V, T> N(Function<V, ? extends T> function) {
        return new class02396(function);
    }

    public void encode(B b, V v) {
        T t = this.y.apply(v);
        int n = this.u.getOrDefault(t, -1);
        if (n == -1) {
            throw new EncoderException("Sending unknown packet '" + String.valueOf(t) + "'");
        }
        class01657.N(b, (int)n);
        class02365<B, V, T> class023652 = this.L.get(n);
        try {
            class02362<B, V> class023622 = class023652.N();
            class023622.encode(b, v);
        }
        catch (Exception exception) {
            if (exception instanceof class09702) {
                throw exception;
            }
            this.N((ByteBuf)b, v, null, t, exception);
            throw new EncoderException("Failed to encode packet '" + String.valueOf(t) + "'", (Throwable)exception);
        }
    }

    public V decode(B b) {
        int n = class01657.N(b);
        if (n < 0 || n >= this.L.size()) {
            throw new DecoderException("Received unknown packet id " + n);
        }
        class02365<B, V, T> class023652 = this.L.get(n);
        try {
            return (V)class023652.N().decode(b);
        }
        catch (Exception exception) {
            if (exception instanceof class09702) {
                throw exception;
            }
            throw new DecoderException("Failed to decode packet '" + String.valueOf(class023652.y()) + "'", (Throwable)exception);
        }
    }
}

