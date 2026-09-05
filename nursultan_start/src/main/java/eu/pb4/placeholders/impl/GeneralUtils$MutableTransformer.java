/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class05216
 */
package eu.pb4.placeholders.impl;

import eu.pb4.placeholders.impl.GeneralUtils;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class05216;

public record GeneralUtils$MutableTransformer(Function<class00405, class00405> textMutableTextFunction) implements Function<class05216, class00392>
{
    public static final GeneralUtils$MutableTransformer CLEAR = new GeneralUtils$MutableTransformer(class004052 -> class00405.N);

    @Override
    public class00392 apply(class05216 class052162) {
        return GeneralUtils.cloneTransformText((class00392)class052162, this::transformStyle);
    }

    private class05216 transformStyle(class05216 class052162) {
        return class052162.y(this.textMutableTextFunction.apply(class052162.method_10866()));
    }
}

