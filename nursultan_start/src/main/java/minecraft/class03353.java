/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class06271
 *  minecraft.class06851
 */
package minecraft;

import minecraft.class01686;
import minecraft.class06271;
import minecraft.class06851;

class class03353
extends class06271<Float> {
    private final class01686 N;

    public class03353(class01686 class016862) {
        super(class016862, class06851::M);
        this.N = class016862.y("lid");
    }

    public void method_2819(Float f) {
        super.method_2819((Object)f);
        this.N.N(0.0f, 24.0f - f.floatValue() * 0.5f * 16.0f, 0.0f);
        this.N.R = 270.0f * f.floatValue() * ((float)Math.PI / 180);
    }
}

