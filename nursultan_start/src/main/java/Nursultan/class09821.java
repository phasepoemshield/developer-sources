/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMaps
 *  minecraft.class02362
 *  minecraft.class02477
 *  minecraft.class02678
 *  minecraft.class02704
 *  minecraft.class04247
 */
package Nursultan;

import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import java.util.Optional;
import minecraft.class02362;
import minecraft.class02477;
import minecraft.class02678;
import minecraft.class02704;
import minecraft.class04247;

public class class09821
implements class02362<class04247, class02678> {
    final /* synthetic */ class02704 N;

    public class09821(class02704 class027042) {
        this.N = class027042;
    }

    private <T> void N(class04247 class042472, class02477<T> class024772, Object object) {
        this.N.N(class024772).encode((Object)class042472, object);
    }

    public void encode(class04247 class042472, class02678 class026782) {
        Optional optional;
        if (class026782.u()) {
            class042472.L(0);
            class042472.L(0);
            return;
        }
        int n = 0;
        int n2 = 0;
        for (Reference2ObjectMap.Entry entry : Reference2ObjectMaps.fastIterable((Reference2ObjectMap)class026782.i)) {
            if (((Optional)entry.getValue()).isPresent()) {
                ++n;
                continue;
            }
            ++n2;
        }
        class042472.L(n);
        class042472.L(n2);
        for (Reference2ObjectMap.Entry entry : Reference2ObjectMaps.fastIterable((Reference2ObjectMap)class026782.i)) {
            optional = (Optional)entry.getValue();
            if (!optional.isPresent()) continue;
            class02477 var8 = (class02477)entry.getKey();
            class02477.y.encode((Object)class042472, (Object)var8);
            this.N(class042472, var8, optional.get());
        }
        for (Reference2ObjectMap.Entry entry : Reference2ObjectMaps.fastIterable((Reference2ObjectMap)class026782.i)) {
            if (!((Optional)entry.getValue()).isEmpty()) continue;
            optional = (class02477)entry.getKey();
            class02477.y.encode((Object)class042472, (Object)optional);
        }
    }

    public class02678 decode(class04247 class042472) {
        int n;
        int n2 = class042472.E();
        int n3 = class042472.E();
        if (n2 == 0 && n3 == 0) {
            return class02678.N;
        }
        int n4 = n2 + n3;
        Reference2ObjectArrayMap reference2ObjectArrayMap = new Reference2ObjectArrayMap(Math.min(n4, 65536));
        for (n = 0; n < n2; ++n) {
            class02477 var7 = (class02477)class02477.y.decode((Object)class042472);
            Object object = this.N.N(var7).decode((Object)class042472);
            reference2ObjectArrayMap.put((Object)var7, Optional.of(object));
        }
        for (n = 0; n < n3; ++n) {
            class02477 class024772 = (class02477)class02477.y.decode((Object)class042472);
            reference2ObjectArrayMap.put((Object)class024772, Optional.empty());
        }
        return new class02678((Reference2ObjectMap)reference2ObjectArrayMap);
    }
}

