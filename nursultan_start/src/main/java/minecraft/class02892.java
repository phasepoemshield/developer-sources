/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class02017
 *  minecraft.class05946
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.mixin.registry.sync.client.ClientRegistriesDynamicRegistriesAccessor
 */
package minecraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import minecraft.class00751;
import minecraft.class02017;
import minecraft.class05946;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.mixin.registry.sync.client.ClientRegistriesDynamicRegistriesAccessor;

@Environment(value=EnvType.CLIENT)
class class02892
implements ClientRegistriesDynamicRegistriesAccessor {
    final Map<class05946<? extends class00751<?>>, List<class02017>> N = new HashMap();

    class02892() {
    }

    public void N(class05946<? extends class00751<?>> class059463, List<class02017> list) {
        this.N.computeIfAbsent(class059463, class059462 -> new ArrayList()).addAll(list);
    }

    public /* synthetic */ Map getDynamicRegistries() {
        return this.N;
    }
}

