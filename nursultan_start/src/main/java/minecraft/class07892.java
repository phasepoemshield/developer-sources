/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00392
 *  minecraft.class02121
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class02694
 *  minecraft.class05033
 *  minecraft.class05216
 *  minecraft.class06497
 *  minecraft.class06541
 *  minecraft.class06563
 *  minecraft.class06591
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import minecraft.class00392;
import minecraft.class02121;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class02694;
import minecraft.class05033;
import minecraft.class05216;
import minecraft.class06497;
import minecraft.class06541;
import minecraft.class06563;
import minecraft.class06591;
import minecraft.class07865;
import minecraft.class07890;
import minecraft.class07899;

public final class class07892
extends Enum<class07892>
implements class02694,
class05033 {
    public static final /* enum */ class07892 field_6881 = new class07892("kob", class07865.field_41574, 0);
    public static final /* enum */ class07892 field_6880 = new class07892("sunstreak", class07865.field_41574, 1);
    public static final /* enum */ class07892 field_6882 = new class07892("snooper", class07865.field_41574, 2);
    public static final /* enum */ class07892 field_6890 = new class07892("dasher", class07865.field_41574, 3);
    public static final /* enum */ class07892 field_6891 = new class07892("brinely", class07865.field_41574, 4);
    public static final /* enum */ class07892 field_6892 = new class07892("spotty", class07865.field_41574, 5);
    public static final /* enum */ class07892 field_6893 = new class07892("flopper", class07865.field_41575, 0);
    public static final /* enum */ class07892 field_6887 = new class07892("stripey", class07865.field_41575, 1);
    public static final /* enum */ class07892 field_6883 = new class07892("glitter", class07865.field_41575, 2);
    public static final /* enum */ class07892 field_6884 = new class07892("blockfish", class07865.field_41575, 3);
    public static final /* enum */ class07892 field_6888 = new class07892("betty", class07865.field_41575, 4);
    public static final /* enum */ class07892 field_6889 = new class07892("clayfish", class07865.field_41575, 5);
    public static final Codec<class07892> field_41578;
    private static final IntFunction<class07892> field_41579;
    public static final class02362<ByteBuf, class07892> field_55969;
    private final String field_41580;
    private final class00392 field_41581;
    private final class07865 field_41582;
    private final int field_41583;
    private static final /* synthetic */ class07892[] field_6886;

    public class00392 L() {
        return this.field_41581;
    }

    private class07892(String string2, class07865 class078652, int n2) {
        this.field_41580 = string2;
        this.field_41582 = class078652;
        this.field_41583 = class078652.field_41576 | n2 << 8;
        this.field_41581 = class00392.L((String)("entity.minecraft.tropical_fish.type." + this.field_41580));
    }

    public static class07892[] values() {
        return (class07892[])field_6886.clone();
    }

    public static class07892 valueOf(String string) {
        return Enum.valueOf(class07892.class, string);
    }

    private static /* synthetic */ class07892[] u() {
        return new class07892[]{field_6881, field_6880, field_6882, field_6890, field_6891, field_6892, field_6893, field_6887, field_6883, field_6884, field_6888, field_6889};
    }

    public int y() {
        return this.field_41583;
    }

    public class07865 N() {
        return this.field_41582;
    }

    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        class06563 class065632 = (class06563)class026662.a_(class02484.NV, (Object)class07899.N.L());
        class06563 class065633 = (class06563)class026662.a_(class02484.Ne, (Object)class07899.N.u());
        class06541[] class06541Array = new class06541[]{class06541.field_1056, class06541.field_1080};
        int n = class07899.y.indexOf((Object)new class07890(this, class065632, class065633));
        if (n != -1) {
            consumer.accept((class00392)class00392.L((String)class07899.N(n)).N(class06541Array));
            return;
        }
        consumer.accept((class00392)this.field_41581.y().N(class06541Array));
        class05216 class052162 = class00392.L((String)("color.minecraft." + class065632.y()));
        if (class065632 != class065633) {
            class052162.i(", ").y((class00392)class00392.L((String)("color.minecraft." + class065633.y())));
        }
        class052162.N(class06541Array);
        consumer.accept((class00392)class052162);
    }

    public static class07892 N(int n) {
        return field_41579.apply(n);
    }

    public String method_15434() {
        return this.field_41580;
    }

    static {
        field_6886 = class07892.u();
        field_41578 = class05033.N(class07892::values);
        field_41579 = class02121.N(class07892::y, (Object[])class07892.values(), (Object)((Object)field_6881));
        field_55969 = class02389.N(field_41579, class07892::y);
    }
}

