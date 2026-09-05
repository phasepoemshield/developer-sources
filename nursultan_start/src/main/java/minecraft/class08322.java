/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01225
 *  minecraft.class03530
 *  minecraft.class05946
 *  minecraft.class08292
 *  net.fabricmc.fabric.impl.datagen.FabricTagBuilder
 *  net.fabricmc.fabric.mixin.datagen.TagAppenderMixin
 */
package minecraft;

import minecraft.class01225;
import minecraft.class03530;
import minecraft.class05946;
import minecraft.class08292;
import net.fabricmc.fabric.impl.datagen.FabricTagBuilder;
import net.fabricmc.fabric.mixin.datagen.TagAppenderMixin;

class class08322<T>
implements class08292<class05946<T>, T>,
TagAppenderMixin {
    final /* synthetic */ class01225 N;

    class08322(class01225 class012252) {
        this.N = class012252;
    }

    public class08292<class05946<T>, T> y(class03530<T> class035302) {
        this.N.u(class035302.y());
        return this;
    }

    public class08292<class05946<T>, T> y(class05946<T> class059462) {
        this.N.y(class059462.N());
        return this;
    }

    public class08292<class05946<T>, T> N(class05946<T> class059462) {
        this.N.N(class059462.N());
        return this;
    }

    public class08292<class05946<T>, T> N(class03530<T> class035302) {
        this.N.L(class035302.y());
        return this;
    }

    public class08292 setReplace(boolean bl) {
        ((FabricTagBuilder)this.N).fabric_setReplace(bl);
        return this;
    }

    public class08292 forceAddTag(class03530 class035302) {
        ((FabricTagBuilder)this.N).fabric_forceAddTag(class035302.y());
        return this;
    }
}

