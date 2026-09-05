/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00349
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class08354
 *  minecraft.class08361
 *  minecraft.class08918
 *  net.irisshaders.iris.mixin.texture.ReloadableTextureAccessor
 *  net.irisshaders.iris.vertices.ImmediateState
 */
package net.irisshaders.iris.pbr.loader;

import minecraft.class00349;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class08354;
import minecraft.class08361;
import minecraft.class08918;
import net.irisshaders.iris.mixin.texture.ReloadableTextureAccessor;
import net.irisshaders.iris.pbr.loader.PBRTextureLoader;
import net.irisshaders.iris.pbr.loader.PBRTextureLoader$PBRTextureConsumer;
import net.irisshaders.iris.pbr.texture.PBRType;
import net.irisshaders.iris.vertices.ImmediateState;

public class SimplePBRLoader
implements PBRTextureLoader<class00349> {
    @Override
    public void load(class00349 class003492, class01089 class010892, PBRTextureLoader$PBRTextureConsumer pBRTextureLoader$PBRTextureConsumer) {
        class01894 class018942 = ((ReloadableTextureAccessor)class003492).getLocation();
        class08918 class089182 = this.createPBRTexture(class018942, class010892, PBRType.NORMAL);
        class08918 class089183 = this.createPBRTexture(class018942, class010892, PBRType.SPECULAR);
        if (class089182 != null) {
            pBRTextureLoader$PBRTextureConsumer.acceptNormalTexture(class089182);
        }
        if (class089183 != null) {
            pBRTextureLoader$PBRTextureConsumer.acceptSpecularTexture(class089183);
        }
    }

    protected class08918 createPBRTexture(class01894 class018942, class01089 class010892, PBRType pBRType) {
        class01894 class018943 = class018942.N(pBRType::appendSuffix);
        ImmediateState.temporarilyIgnorePass = true;
        class00349 class003492 = new class00349(class018943);
        class08354 class083542 = this.loadContentsSafe((class08361)class003492, class010892);
        if (class083542 == null) {
            class003492.close();
            ImmediateState.temporarilyIgnorePass = false;
            return null;
        }
        class003492.method_65857(class083542);
        ImmediateState.temporarilyIgnorePass = false;
        return class003492;
    }

    private class08354 loadContentsSafe(class08361 class083612, class01089 class010892) {
        try {
            return class083612.method_65809(class010892);
        }
        catch (Exception exception) {
            return null;
        }
    }
}

