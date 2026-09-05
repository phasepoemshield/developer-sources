/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04344
 *  minecraft.class04355
 *  minecraft.class04363
 *  minecraft.class04370
 *  minecraft.class05630
 *  minecraft.class06478
 */
package net.irisshaders.iris.gui.option;

import java.util.function.Consumer;
import minecraft.class04344;
import minecraft.class04355;
import minecraft.class04363;
import minecraft.class04370;
import minecraft.class05630;
import minecraft.class06478;
import net.irisshaders.iris.gui.option.IrisVideoSettings;

public class ShadowDistanceOption<T>
extends class04370<T> {
    public class06478 method_18520(class05630 class056302, int n, int n2, int n3) {
        class06478 class064782 = super.method_18520(class056302, n, n2, n3);
        class064782.field_22763 = IrisVideoSettings.isShadowDistanceSliderEnabled();
        return class064782;
    }

    public ShadowDistanceOption(String string, class04355<T> class043552, class04363<T> class043632, class04344<T> class043442, T t, Consumer<T> consumer) {
        super(string, class043552, class043632, class043442, t, consumer);
    }
}

