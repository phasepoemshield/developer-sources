/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00972
 *  minecraft.class00983
 *  minecraft.class01237
 *  minecraft.class04790
 *  minecraft.class06959
 *  net.irisshaders.iris.mixinterface.ParticleRenderStateExtension
 */
package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class00972;
import minecraft.class00983;
import minecraft.class01237;
import minecraft.class04790;
import minecraft.class06959;
import net.irisshaders.iris.mixinterface.ParticleRenderStateExtension;

public class class00987
implements ParticleRenderStateExtension {
    public final List<class00972> N = new ArrayList<class00972>();

    public void N(class04790 class047902, class06959 class069592) {
        Iterator<class00972> var3 = this.N.iterator();
        while (var3.hasNext()) {
            var3.next().submit((class01237)class047902, class069592);
        }
    }

    public void N(class00972 class009722) {
        this.N.add(class009722);
    }

    public void N() {
        this.N.forEach(class00972::y);
        this.N.clear();
    }

    public void submitWithoutItems(class04790 class047902, class06959 class069592) {
        for (class00972 class009722 : this.N) {
            if (class009722 instanceof class00983) continue;
            class009722.submit((class01237)class047902, class069592);
        }
    }
}

