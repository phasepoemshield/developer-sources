/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01929
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class02837
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class06584
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07709
 *  minecraft.class07717
 *  minecraft.class07755
 *  minecraft.class08036
 *  minecraft.class08303
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01929;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class02837;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class06584;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07709;
import minecraft.class07717;
import minecraft.class07755;
import minecraft.class08036;
import minecraft.class08303;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class class00809
extends Record {
    private final class07001 tag;
    private static final Logger i = LogUtils.getLogger();
    public static final Codec<class00809> N = class07755.R.xmap(class00809::new, class00809::N);
    public static final class02362<ByteBuf, class00809> y = class02389.j.N_10(class00809::new, class00809::N);
    public static final String L = "SelectedItem";

    public class00809(class07001 class070012) {
        this.tag = class070012;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00809.class, "tag", "tag"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00809.class, "tag", "tag"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00809.class, "tag", "tag"}, this);
    }

    public static class07001 y(class07049 class070492) {
        try (class04495 class044952 = new class04495(class070492.method_71370(), i);){
            class08036 class080362;
            class06584 class065842;
            class08303 class083032 = class08303.N((class04490)class044952, (class01929)class070492.method_56673());
            class070492.method_5647((class08329)class083032);
            if (class070492 instanceof class08036 && !(class065842 = (class080362 = (class08036)class070492).method_31548().y()).R()) {
                class083032.N(L, class06584.y, (Object)class065842);
            }
            class080362 = class083032.y();
            return class080362;
        }
    }

    public boolean N(class07049 class070492) {
        return this.N((class07709)class00809.y(class070492));
    }

    public class07001 N() {
        return this.tag;
    }

    public boolean N(@Nullable class07709 class077092) {
        return class077092 != null && class07717.N((class07709)this.tag, (class07709)class077092, (boolean)true);
    }

    public boolean N(class02666 class026662) {
        return ((class02837)class026662.a_(class02484.y, (Object)class02837.N)).y(this.tag);
    }
}

