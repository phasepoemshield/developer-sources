/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08918
 */
package net.irisshaders.iris.pbr.texture;

import minecraft.class08918;
import net.irisshaders.iris.pbr.loader.PBRTextureLoader$PBRTextureConsumer;
import net.irisshaders.iris.pbr.texture.PBRTextureHolder;
import net.irisshaders.iris.pbr.texture.PBRTextureManager;
import net.irisshaders.iris.pbr.texture.PBRTextureManager$PBRTextureHolderImpl;

class PBRTextureManager$PBRTextureConsumerImpl
implements PBRTextureLoader$PBRTextureConsumer {
    private class08918 normalTexture;
    private class08918 specularTexture;
    private boolean changed;
    final /* synthetic */ PBRTextureManager this$0;

    PBRTextureManager$PBRTextureConsumerImpl(PBRTextureManager pBRTextureManager) {
        this.this$0 = pBRTextureManager;
    }

    public void clear() {
        this.normalTexture = this.this$0.defaultNormalTexture;
        this.specularTexture = this.this$0.defaultSpecularTexture;
        this.changed = false;
    }

    @Override
    public void acceptSpecularTexture(class08918 class089182) {
        this.specularTexture = class089182;
        this.changed = true;
    }

    @Override
    public void acceptNormalTexture(class08918 class089182) {
        this.normalTexture = class089182;
        this.changed = true;
    }

    public PBRTextureHolder toHolder() {
        if (this.changed) {
            return new PBRTextureManager$PBRTextureHolderImpl(this.normalTexture, this.specularTexture);
        }
        return this.this$0.defaultHolder;
    }
}

