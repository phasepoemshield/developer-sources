/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05031
 *  minecraft.class05033
 *  minecraft.class06584
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05031;
import minecraft.class05033;
import minecraft.class06584;
import minecraft.class07043;

public final class class07085
extends Enum<class07085>
implements class05033 {
    public static final /* enum */ class07085 field_6173 = new class07085(class07043.field_6177, 0, 0, "mainhand");
    public static final /* enum */ class07085 field_6171 = new class07085(class07043.field_6177, 1, 5, "offhand");
    public static final /* enum */ class07085 field_6166 = new class07085(class07043.field_6178, 0, 1, 1, "feet");
    public static final /* enum */ class07085 field_6172 = new class07085(class07043.field_6178, 1, 1, 2, "legs");
    public static final /* enum */ class07085 field_6174 = new class07085(class07043.field_6178, 2, 1, 3, "chest");
    public static final /* enum */ class07085 field_6169 = new class07085(class07043.field_6178, 3, 1, 4, "head");
    public static final /* enum */ class07085 field_48824 = new class07085(class07043.field_48825, 0, 1, 6, "body");
    public static final /* enum */ class07085 field_55946 = new class07085(class07043.field_55947, 0, 1, 7, "saddle");
    public static final int field_51935 = 0;
    public static final List<class07085> field_54086;
    public static final IntFunction<class07085> field_54087;
    public static final class05031<class07085> field_45739;
    public static final class02362<ByteBuf, class07085> field_54088;
    private final class07043 field_6170;
    private final int field_6168;
    private final int field_51936;
    private final int field_54089;
    private final String field_6175;
    private static final /* synthetic */ class07085[] field_6176;

    public int L() {
        return this.field_54089;
    }

    private static /* synthetic */ class07085[] M() {
        return new class07085[]{field_6173, field_6171, field_6166, field_6172, field_6174, field_6169, field_48824, field_55946};
    }

    private class07085(class07043 class070432, int n2, int n3, String string2) {
        this(class070432, n2, 0, n3, string2);
    }

    private class07085(class07043 class070432, int n2, int n3, int n4, String string2) {
        this.field_6170 = class070432;
        this.field_6168 = n2;
        this.field_51936 = n3;
        this.field_54089 = n4;
        this.field_6175 = string2;
    }

    public static class07085[] values() {
        return (class07085[])field_6176.clone();
    }

    public static class07085 valueOf(String string) {
        return Enum.valueOf(class07085.class, string);
    }

    public boolean i() {
        return this.field_6170 == class07043.field_6178 || this.field_6170 == class07043.field_48825;
    }

    public String u() {
        return this.field_6175;
    }

    public int y(int n) {
        return this.field_54089 + n;
    }

    private static /* synthetic */ int y(class07085 class070852) {
        return class070852.field_54089;
    }

    public int y() {
        return this.field_6168;
    }

    public static class07085 N(String string) {
        class07085 class070852 = (class07085)field_45739.N(string);
        if (class070852 != null) {
            return class070852;
        }
        throw new IllegalArgumentException("Invalid slot '" + string + "'");
    }

    private static /* synthetic */ int N(class07085 class070852) {
        return class070852.field_54089;
    }

    public class07043 N() {
        return this.field_6170;
    }

    public int N(int n) {
        return n + this.field_6168;
    }

    public class06584 N(class06584 class065842) {
        return this.field_51936 > 0 ? class065842.N(this.field_51936) : class065842;
    }

    public boolean R() {
        return this.field_6170 != class07043.field_55947;
    }

    public String method_15434() {
        return this.field_6175;
    }

    static {
        field_6176 = class07085.M();
        field_54086 = List.of(class07085.values());
        field_54087 = class02121.N(class070852 -> class070852.field_54089, (Object[])class07085.values(), (class02126)class02126.field_41664);
        field_45739 = class05033.N(class07085::values);
        field_54088 = class02389.N(field_54087, class070852 -> class070852.field_54089);
    }
}

