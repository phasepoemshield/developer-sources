/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  java.lang.MatchException
 *  minecraft.class01372
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05033
 *  minecraft.class06069
 *  minecraft.class06338
 *  minecraft.class07185
 *  minecraft.class07211
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;
import minecraft.class01372;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05033;
import minecraft.class06069;
import minecraft.class06338;
import minecraft.class07185;
import minecraft.class07211;
import minecraft.class07536;

public final class class06993
extends Enum<class06993>
implements class05033 {
    public static final /* enum */ class06993 field_11467 = new class06993(0, "none", class01372.field_23292);
    public static final /* enum */ class06993 field_11463 = new class06993(1, "clockwise_90", class01372.field_23318);
    public static final /* enum */ class06993 field_11464 = new class06993(2, "180", class01372.field_23300);
    public static final /* enum */ class06993 field_11465 = new class06993(3, "counterclockwise_90", class01372.field_23319);
    public static final IntFunction<class06993> field_55986;
    public static final Codec<class06993> field_39313;
    public static final class02362<ByteBuf, class06993> field_55987;
    @Deprecated
    public static final Codec<class06993> field_56670;
    private final int field_55988;
    private final String field_39314;
    private final class01372 field_23264;
    private static final /* synthetic */ class06993[] field_11466;

    private static /* synthetic */ class06993[] L() {
        return new class06993[]{field_11467, field_11463, field_11464, field_11465};
    }

    private class06993(int n2, String string2, class01372 class013722) {
        this.field_55988 = n2;
        this.field_39314 = string2;
        this.field_23264 = class013722;
    }

    public static class06993[] values() {
        return (class06993[])field_11466.clone();
    }

    public static class06993 valueOf(String string) {
        return Enum.valueOf(class06993.class, string);
    }

    private int y() {
        return this.field_55988;
    }

    public static List<class06993> y(class06069 class060692) {
        return class07536.y((Object[])class06993.values(), (class06069)class060692);
    }

    public int N(int n, int n2) {
        return switch (this.ordinal()) {
            case 2 -> (n + n2 / 2) % n2;
            case 3 -> (n + n2 * 3 / 4) % n2;
            case 1 -> (n + n2 / 4) % n2;
            default -> n;
        };
    }

    public class01372 N() {
        return this.field_23264;
    }

    public class07211 N(class07211 class072112) {
        if (class072112.z() == class07185.field_11052) {
            return class072112;
        }
        return switch (this.ordinal()) {
            case 2 -> class072112.b();
            case 3 -> class072112.M();
            case 1 -> class072112.R();
            default -> class072112;
        };
    }

    public static class06993 N(class06069 class060692) {
        return (class06993)((Object)class07536.N((Object[])class06993.values(), (class06069)class060692));
    }

    public class06993 N(class06993 class069932) {
        return switch (class069932.ordinal()) {
            case 2 -> {
                switch (this.ordinal()) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case 0: {
                        yield field_11464;
                    }
                    case 1: {
                        yield field_11465;
                    }
                    case 2: {
                        yield field_11467;
                    }
                    case 3: 
                }
                yield field_11463;
            }
            case 3 -> {
                switch (this.ordinal()) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case 0: {
                        yield field_11465;
                    }
                    case 1: {
                        yield field_11467;
                    }
                    case 2: {
                        yield field_11463;
                    }
                    case 3: 
                }
                yield field_11464;
            }
            case 1 -> {
                switch (this.ordinal()) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case 0: {
                        yield field_11463;
                    }
                    case 1: {
                        yield field_11464;
                    }
                    case 2: {
                        yield field_11465;
                    }
                    case 3: 
                }
                yield field_11467;
            }
            default -> this;
        };
    }

    public String method_15434() {
        return this.field_39314;
    }

    static {
        field_11466 = class06993.L();
        field_55986 = class02121.N(class06993::y, (Object[])class06993.values(), (class02126)class02126.field_41665);
        field_39313 = class05033.N(class06993::values);
        field_55987 = class02389.N(field_55986, class06993::y);
        field_56670 = class06338.L(class06993::valueOf);
    }
}

