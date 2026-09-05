/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03530
 *  minecraft.class08292
 *  net.fabricmc.fabric.mixin.datagen.TagAppenderMixin
 */
package minecraft;

import java.util.function.Function;
import minecraft.class03530;
import minecraft.class08292;
import net.fabricmc.fabric.mixin.datagen.TagAppenderMixin;

class class08331<U, T>
implements class08292<U, T>,
TagAppenderMixin {
    final /* synthetic */ class08292 N;
    final /* synthetic */ Function y;

    class08331(class08292 class082922, class08292 class082923, Function function) {
        this.N = class082923;
        this.y = function;
    }

    public class08292<U, T> y(U u) {
        this.N.N(this.y.apply(u));
        return this;
    }

    public class08292<U, T> y(class03530<T> class035302) {
        this.N.y(class035302);
        return this;
    }

    public class08292<U, T> N(class03530<T> class035302) {
        this.N.N(class035302);
        return this;
    }

    public class08292<U, T> N(U u) {
        this.N.N(this.y.apply(u));
        return this;
    }

    public class08292 setReplace(boolean bl) {
        this.N.setReplace(bl);
        return this;
    }

    public class08292 forceAddTag(class03530 class035302) {
        this.N.forceAddTag(class035302);
        return this;
    }
}

