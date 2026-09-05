/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08372
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08372;
import org.jspecify.annotations.Nullable;

public interface class02145 {
    public class07299 method_73183();

    default public @Nullable class07438 Z() {
        ObjectArraySet objectArraySet = new ObjectArraySet();
        class07438 class074382 = this.L_();
        objectArraySet.add(this);
        while (class074382 instanceof class02145) {
            class02145 class021452 = (class02145)class074382;
            class07438 class074383 = class021452.L_();
            if (objectArraySet.contains(class074383)) {
                return null;
            }
            objectArraySet.add(class074382);
            class074382 = class021452.L_();
        }
        return class074382;
    }

    public @Nullable class08372<class07438> NI();

    default public @Nullable class07438 L_() {
        return class08372.y(this.NI(), (class07299)this.method_73183());
    }
}

