/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00392
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import minecraft.class00392;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05033;

public final class class06672
extends Enum<class06672>
implements class05033 {
    public static final /* enum */ class06672 field_1442 = new class06672("always", 0);
    public static final /* enum */ class06672 field_1443 = new class06672("never", 1);
    public static final /* enum */ class06672 field_1444 = new class06672("hideForOtherTeams", 2);
    public static final /* enum */ class06672 field_1446 = new class06672("hideForOwnTeam", 3);
    public static final Codec<class06672> field_56489;
    private static final IntFunction<class06672> field_56491;
    public static final class02362<ByteBuf, class06672> field_56490;
    public final String field_1445;
    public final int field_1441;
    private static final /* synthetic */ class06672[] field_1448;

    private class06672(String string2, int n2) {
        this.field_1445 = string2;
        this.field_1441 = n2;
    }

    static {
        field_1448 = class06672.y();
        field_56489 = class05033.N(class06672::values);
        field_56491 = class02121.N(class066722 -> class066722.field_1441, (Object[])class06672.values(), (class02126)class02126.field_41664);
        field_56490 = class02389.N(field_56491, class066722 -> class066722.field_1441);
    }

    public static class06672[] values() {
        return (class06672[])field_1448.clone();
    }

    public static class06672 valueOf(String string) {
        return Enum.valueOf(class06672.class, string);
    }

    private static /* synthetic */ class06672[] y() {
        return new class06672[]{field_1442, field_1443, field_1444, field_1446};
    }

    public class00392 N() {
        return class00392.L((String)("team.visibility." + this.field_1445));
    }

    public String method_15434() {
        return this.field_1445;
    }
}

