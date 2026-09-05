/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  minecraft.class01603
 *  minecraft.class01623
 *  minecraft.class03545
 *  minecraft.class03554
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.resource.pack.ModPackResourcesUtil
 *  net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import minecraft.class01603;
import minecraft.class01623;
import minecraft.class02267;
import minecraft.class02298;
import minecraft.class03545;
import minecraft.class03554;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.resource.pack.ModPackResourcesUtil;
import net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(value=EnvType.CLIENT)
public class class02301 {
    private final class01623 N = this.y();
    private final Map<class02298, String> y;
    private static final Logger L = LoggerFactory.getLogger((String)"KnownPacksManagerMixin");

    public class02301() {
        this.N.N();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        this.N.u().forEach(class010552 -> {
            class02267 class022672 = class010552.N();
            class022672.u().ifPresent(class022982 -> builder.put((Object)class022982, (Object)class022672.N()));
        });
        this.y = builder.build();
    }

    List y(List list) {
        if (list.size() > ModResourcePackCreator.MAX_KNOWN_PACKS) {
            L.warn("Too many knownPacks: Found {}; max {}", (Object)list.size(), (Object)ModResourcePackCreator.MAX_KNOWN_PACKS);
            return list.subList(0, ModResourcePackCreator.MAX_KNOWN_PACKS);
        }
        return list;
    }

    public class01623 y() {
        return ModPackResourcesUtil.createClientManager();
    }

    public class03554 N() {
        List var1 = this.N.B();
        return new class03545(class01603.field_14190, var1);
    }

    public List<class02298> N(List<class02298> list) {
        ArrayList<class02298> arrayList = new ArrayList<class02298>(list.size());
        ArrayList<String> arrayList2 = new ArrayList<String>(list.size());
        for (class02298 class022982 : list) {
            String string = this.y.get((Object)class022982);
            if (string == null) continue;
            arrayList2.add(string);
            arrayList.add(class022982);
        }
        this.N.y(arrayList2);
        return this.y(arrayList);
    }
}

