/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  java.lang.MatchException
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05033
 *  minecraft.class07043
 *  minecraft.class07085
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05033;
import minecraft.class07043;
import minecraft.class07085;

public final class class02834
extends Enum<class02834>
implements class05033,
Iterable<class07085> {
    public static final /* enum */ class02834 field_49216 = new class02834(0, "any", class070852 -> true);
    public static final /* enum */ class02834 field_49217 = new class02834(1, "mainhand", class07085.field_6173);
    public static final /* enum */ class02834 field_49218 = new class02834(2, "offhand", class07085.field_6171);
    public static final /* enum */ class02834 field_49219 = new class02834(3, "hand", class070852 -> class070852.N() == class07043.field_6177);
    public static final /* enum */ class02834 field_49220 = new class02834(4, "feet", class07085.field_6166);
    public static final /* enum */ class02834 field_49221 = new class02834(5, "legs", class07085.field_6172);
    public static final /* enum */ class02834 field_49222 = new class02834(6, "chest", class07085.field_6174);
    public static final /* enum */ class02834 field_49223 = new class02834(7, "head", class07085.field_6169);
    public static final /* enum */ class02834 field_49224 = new class02834(8, "armor", class07085::i);
    public static final /* enum */ class02834 field_50127 = new class02834(9, "body", class07085.field_48824);
    public static final /* enum */ class02834 field_55948 = new class02834(10, "saddle", class07085.field_55946);
    public static final IntFunction<class02834> field_49225;
    public static final Codec<class02834> field_49226;
    public static final class02362<ByteBuf, class02834> field_49227;
    private final int field_49228;
    private final String field_49229;
    private final Predicate<class07085> field_49230;
    private final List<class07085> field_55949;
    private static final /* synthetic */ class02834[] field_49231;

    private class02834(int n2, String string2, Predicate<class07085> predicate) {
        this.field_49228 = n2;
        this.field_49229 = string2;
        this.field_49230 = predicate;
        this.field_55949 = class07085.field_54086.stream().filter(predicate).toList();
    }

    private class02834(int n2, String string2, class07085 class070852) {
        this(n2, string2, (class07085 class070853) -> class070853 == class070852);
    }

    public static class02834[] values() {
        return (class02834[])field_49231.clone();
    }

    public static class02834 valueOf(String string) {
        return Enum.valueOf(class02834.class, string);
    }

    @Override
    public Iterator<class07085> iterator() {
        return this.field_55949.iterator();
    }

    private static /* synthetic */ class02834[] y() {
        return new class02834[]{field_49216, field_49217, field_49218, field_49219, field_49220, field_49221, field_49222, field_49223, field_49224, field_50127, field_55948};
    }

    public boolean y(class07085 class070852) {
        return this.field_49230.test(class070852);
    }

    public List<class07085> N() {
        return this.field_55949;
    }

    public static class02834 N(class07085 class070852) {
        return switch (class070852) {
            default -> throw new MatchException(null, null);
            case class07085.field_6173 -> field_49217;
            case class07085.field_6171 -> field_49218;
            case class07085.field_6166 -> field_49220;
            case class07085.field_6172 -> field_49221;
            case class07085.field_6174 -> field_49222;
            case class07085.field_6169 -> field_49223;
            case class07085.field_48824 -> field_50127;
            case class07085.field_55946 -> field_55948;
        };
    }

    private static /* synthetic */ int N(class02834 class028342) {
        return class028342.field_49228;
    }

    public String method_15434() {
        return this.field_49229;
    }

    static {
        field_49231 = class02834.y();
        field_49225 = class02121.N(class028342 -> class028342.field_49228, (Object[])class02834.values(), (class02126)class02126.field_41664);
        field_49226 = class05033.N(class02834::values);
        field_49227 = class02389.N(field_49225, (T class028342) -> class028342.field_49228);
    }
}

