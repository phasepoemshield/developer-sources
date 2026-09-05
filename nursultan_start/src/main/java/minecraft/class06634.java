/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09415
 *  com.google.common.cache.CacheLoader
 *  minecraft.class00910
 *  minecraft.class06610
 *  minecraft.class06615
 *  minecraft.class07948
 *  minecraft.class08985
 */
package minecraft;

import Nursultan.class09415;
import com.google.common.cache.CacheLoader;
import java.util.function.Supplier;
import minecraft.class00910;
import minecraft.class06610;
import minecraft.class06615;
import minecraft.class07948;
import minecraft.class08985;

class class06634
extends CacheLoader<class09415, class08985> {
    final /* synthetic */ class06615 N;

    class06634(class06615 class066152) {
        this.N = class066152;
    }

    public class08985 load(class09415 class094152) {
        Supplier var2 = this.N.y.y(class094152.N());
        boolean bl = class094152.y();
        return new class00910((class07948)new class06610(this, var2, bl));
    }
}

