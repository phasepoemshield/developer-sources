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

public final class class06656
extends Enum<class06656>
implements class05033 {
    public static final /* enum */ class06656 field_1437 = new class06656("always", 0);
    public static final /* enum */ class06656 field_1435 = new class06656("never", 1);
    public static final /* enum */ class06656 field_1434 = new class06656("pushOtherTeams", 2);
    public static final /* enum */ class06656 field_1440 = new class06656("pushOwnTeam", 3);
    public static final Codec<class06656> field_56486;
    private static final IntFunction<class06656> field_56488;
    public static final class02362<ByteBuf, class06656> field_56487;
    public final String field_1436;
    public final int field_1433;
    private static final /* synthetic */ class06656[] field_1439;

    private class06656(String string2, int n2) {
        this.field_1436 = string2;
        this.field_1433 = n2;
    }

    static {
        field_1439 = class06656.y();
        field_56486 = class05033.N(class06656::values);
        field_56488 = class02121.N(class066562 -> class066562.field_1433, (Object[])class06656.values(), (class02126)class02126.field_41664);
        field_56487 = class02389.N(field_56488, class066562 -> class066562.field_1433);
    }

    public static class06656[] values() {
        return (class06656[])field_1439.clone();
    }

    public static class06656 valueOf(String string) {
        return Enum.valueOf(class06656.class, string);
    }

    private static /* synthetic */ class06656[] y() {
        return new class06656[]{field_1437, field_1435, field_1434, field_1440};
    }

    public class00392 N() {
        return class00392.L((String)("team.collision." + this.field_1436));
    }

    public String method_15434() {
        return this.field_1436;
    }
}

