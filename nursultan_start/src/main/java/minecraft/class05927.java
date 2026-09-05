/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.BlockOptionalMeta$ServerLevelStub
 *  minecraft.class01894
 *  minecraft.class02063
 *  minecraft.class02331
 *  minecraft.class02796
 *  minecraft.class04162
 *  minecraft.class04782
 *  minecraft.class06069
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import baritone.api.utils.BlockOptionalMeta;
import java.util.Optional;
import minecraft.class01894;
import minecraft.class02063;
import minecraft.class02331;
import minecraft.class02796;
import minecraft.class04162;
import minecraft.class04782;
import minecraft.class05908;
import minecraft.class06069;
import org.jspecify.annotations.Nullable;

public class class05927 {
    private final class04162 N;
    private @Nullable class06069 y;

    public class05927(class04162 class041622) {
        this.N = class041622;
    }

    public class05908 N(Optional<class01894> optional) {
        class04782 class047822 = this.N();
        class02796 class027962 = class047822.method_8503();
        class06069 class060692 = Optional.ofNullable(this.y).or(() -> optional.map(arg_0 -> ((class04782)class047822).method_51836(arg_0))).orElseGet(() -> ((class04782)class047822).method_8409());
        class02796 class027963 = class027962;
        return new class05908(this.N, class060692, (class02063)this.N(class027963).N());
    }

    private class02331 N(class02796 class027962) {
        if (class027962 != null) {
            return class027962.yd();
        }
        class04782 class047822 = this.N();
        if (class047822 instanceof BlockOptionalMeta.ServerLevelStub) {
            return ((BlockOptionalMeta.ServerLevelStub)class047822).holder();
        }
        return null;
    }

    public class04782 N() {
        return this.N.N();
    }

    public class05927 N(class06069 class060692) {
        this.y = class060692;
        return this;
    }

    public class05927 N(long l) {
        if (l != 0L) {
            this.y = class06069.y((long)l);
        }
        return this;
    }
}

