/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.services;

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
import net.caffeinemc.mods.sodium.client.services.Services;
import net.caffeinemc.mods.sodium.client.services.SodiumModelData;
import net.caffeinemc.mods.sodium.client.services.SodiumModelDataContainer;
import org.jspecify.annotations.Nullable;

public interface PlatformModelAccess {
    public static final PlatformModelAccess INSTANCE = Services.load(PlatformModelAccess.class);

    public static PlatformModelAccess getInstance() {
        return INSTANCE;
    }

    public SodiumModelData getEmptyModelData();

    public List<class02022> getQuads(class07295 var1, class07209 var2, class08877 var3, class00500 var4, class07211 var5, class06069 var6, class08743 var7);

    public SodiumModelDataContainer getModelDataContainer(class07299 var1, class01296 var2);

    public List<class08877> collectPartsOf(class08887 var1, class07295 var2, class07209 var3, class00500 var4, class06069 var5, @Nullable ListStorage var6);

    public class08743 getPartRenderType(class08877 var1, class00500 var2, class08743 var3);
}

