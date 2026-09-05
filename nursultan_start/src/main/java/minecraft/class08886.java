/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JavaOps
 *  minecraft.class00149
 *  minecraft.class00151
 *  minecraft.class00154
 *  minecraft.class00157
 *  minecraft.class00170
 *  minecraft.class00186
 *  minecraft.class02325
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import java.util.List;
import java.util.Set;
import minecraft.class00149;
import minecraft.class00151;
import minecraft.class00154;
import minecraft.class00157;
import minecraft.class00170;
import minecraft.class00186;
import minecraft.class02325;
import minecraft.class08876;
import org.jspecify.annotations.Nullable;

abstract class class08886
extends Enum<class08886> {
    public static final /* enum */ class08886 field_58002 = new class00151("BYTE", 0, class00157.field_58022, new class00157[0]);
    public static final /* enum */ class08886 field_58003 = new class00186("INT", 1, class00157.field_58024, new class00157[]{class00157.field_58022, class00157.field_58023});
    public static final /* enum */ class08886 field_58004 = new class00149("LONG", 2, class00157.field_58025, new class00157[]{class00157.field_58022, class00157.field_58023, class00157.field_58024});
    private final class00157 field_58005;
    private final Set<class00157> field_58006;
    private static final /* synthetic */ class08886[] field_58007;

    class08886(class00157 class001572, class00157 ... class00157Array) {
        this.field_58006 = Set.of(class00157Array);
        this.field_58005 = class001572;
    }

    static {
        field_58007 = class08886.N();
    }

    public static class08886[] values() {
        return (class08886[])field_58007.clone();
    }

    public static class08886 valueOf(String string) {
        return Enum.valueOf(class08886.class, string);
    }

    private @Nullable class00157 N(class00154 class001542) {
        class00157 class001572 = class001542.y();
        if (class001572 == null) {
            return this.field_58005;
        }
        if (!this.N(class001572)) {
            return null;
        }
        return class001572;
    }

    public abstract <T> @Nullable T N(DynamicOps<T> var1, List<class00170> var2, class02325<?> var3);

    private static /* synthetic */ class08886[] N() {
        return new class08886[]{field_58002, field_58003, field_58004};
    }

    protected @Nullable Number N(class00170 class001702, class02325<?> class023252) {
        class00157 class001572 = this.N(class001702.u());
        if (class001572 == null) {
            class023252.y().N(class023252.M(), class08876.u);
            return null;
        }
        return (Number)class001702.N((DynamicOps)JavaOps.INSTANCE, class001572, class023252);
    }

    public abstract <T> T N(DynamicOps<T> var1);

    public boolean N(class00157 class001572) {
        return class001572 == this.field_58005 || this.field_58006.contains(class001572);
    }
}

