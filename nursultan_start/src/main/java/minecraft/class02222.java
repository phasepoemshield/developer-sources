/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00392
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class02362
 *  minecraft.class02389
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.function.IntFunction;
import minecraft.class00392;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02213;
import minecraft.class02362;
import minecraft.class02389;

public final class class02222
extends Enum<class02222> {
    public static final /* enum */ class02222 field_51981 = new class02222(0, "report_bug");
    public static final /* enum */ class02222 field_52205 = new class02222(1, "community_guidelines");
    public static final /* enum */ class02222 field_52206 = new class02222(2, "support");
    public static final /* enum */ class02222 field_52207 = new class02222(3, "status");
    public static final /* enum */ class02222 field_52208 = new class02222(4, "feedback");
    public static final /* enum */ class02222 field_52209 = new class02222(5, "community");
    public static final /* enum */ class02222 field_52210 = new class02222(6, "website");
    public static final /* enum */ class02222 field_52211 = new class02222(7, "forums");
    public static final /* enum */ class02222 field_52212 = new class02222(8, "news");
    public static final /* enum */ class02222 field_52213 = new class02222(9, "announcements");
    private static final IntFunction<class02222> field_51983;
    public static final class02362<ByteBuf, class02222> field_51982;
    private final int field_51984;
    private final String field_51985;
    private static final /* synthetic */ class02222[] field_51986;

    private class02222(int n2, String string2) {
        this.field_51984 = n2;
        this.field_51985 = string2;
    }

    static {
        field_51986 = class02222.y();
        field_51983 = class02121.N(class022222 -> class022222.field_51984, (Object[])class02222.values(), (class02126)class02126.field_41664);
        field_51982 = class02389.N(field_51983, class022222 -> class022222.field_51984);
    }

    public static class02222[] values() {
        return (class02222[])field_51986.clone();
    }

    public static class02222 valueOf(String string) {
        return Enum.valueOf(class02222.class, string);
    }

    private static /* synthetic */ class02222[] y() {
        return new class02222[]{field_51981, field_52205, field_52206, field_52207, field_52208, field_52209, field_52210, field_52211, field_52212, field_52213};
    }

    public class02213 N(URI uRI) {
        return class02213.N(this, uRI);
    }

    public class00392 N() {
        return class00392.L((String)("known_server_link." + this.field_51985));
    }
}

