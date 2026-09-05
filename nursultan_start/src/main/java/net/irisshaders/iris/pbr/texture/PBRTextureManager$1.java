/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08918
 */
package net.irisshaders.iris.pbr.texture;

import minecraft.class08918;
import net.irisshaders.iris.pbr.texture.PBRTextureHolder;
import net.irisshaders.iris.pbr.texture.PBRTextureManager;

class PBRTextureManager$1
implements PBRTextureHolder {
    final /* synthetic */ PBRTextureManager this$0;

    PBRTextureManager$1(PBRTextureManager pBRTextureManager) {
        this.this$0 = pBRTextureManager;
    }

    @Override
    public class08918 normalTexture() {
        return this.this$0.defaultNormalTexture;
    }

    @Override
    public class08918 specularTexture() {
        return this.this$0.defaultSpecularTexture;
    }
}

