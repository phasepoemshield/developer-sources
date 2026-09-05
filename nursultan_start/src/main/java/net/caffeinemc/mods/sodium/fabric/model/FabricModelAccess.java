/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMaps
 *  minecraft.class00500
 *  minecraft.class01296
 *  minecraft.class02022
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07295
 *  minecraft.class07299
 *  minecraft.class08743
 *  minecraft.class08877
 *  minecraft.class08887
 *  net.caffeinemc.mods.sodium.client.render.helper.ListStorage
 */
package net.caffeinemc.mods.sodium.fabric.model;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import java.util.ArrayList;
import java.util.List;
import minecraft.class00500;
import minecraft.class01296;
import minecraft.class02022;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07295;
import minecraft.class07299;
import minecraft.class08743;
import minecraft.class08877;
import minecraft.class08887;
import net.caffeinemc.mods.sodium.client.render.helper.ListStorage;
import net.caffeinemc.mods.sodium.client.services.PlatformModelAccess;
import net.caffeinemc.mods.sodium.client.services.SodiumModelData;
import net.caffeinemc.mods.sodium.client.services.SodiumModelDataContainer;

public class FabricModelAccess
implements PlatformModelAccess {
    private static final SodiumModelDataContainer EMPTY_CONTAINER = new SodiumModelDataContainer((Long2ObjectMap<SodiumModelData>)Long2ObjectMaps.emptyMap());

    @Override
    public SodiumModelData getEmptyModelData() {
        return null;
    }

    @Override
    public List<class02022> getQuads(class07295 class072952, class07209 class072092, class08877 class088772, class00500 class005002, class07211 class072112, class06069 class060692, class08743 class087432) {
        return class088772.N(class072112);
    }

    @Override
    public SodiumModelDataContainer getModelDataContainer(class07299 class072992, class01296 class012962) {
        return EMPTY_CONTAINER;
    }

    @Override
    public List<class08877> collectPartsOf(class08887 class088872, class07295 class072952, class07209 class072092, class00500 class005002, class06069 class060692, ListStorage listStorage) {
        ArrayList<class08877> arrayList = listStorage == null ? new ArrayList() : listStorage.clearAndGet();
        class088872.method_68513(class060692, arrayList);
        return arrayList;
    }

    @Override
    public class08743 getPartRenderType(class08877 class088772, class00500 class005002, class08743 class087432) {
        return class087432;
    }
}

