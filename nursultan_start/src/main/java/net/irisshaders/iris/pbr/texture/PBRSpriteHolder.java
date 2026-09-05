/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08388
 */
package net.irisshaders.iris.pbr.texture;

import minecraft.class08388;

public class PBRSpriteHolder {
    protected class08388 normalSprite;
    protected class08388 specularSprite;

    public void close() {
        if (this.normalSprite != null) {
            this.normalSprite.method_45851().close();
        }
        if (this.specularSprite != null) {
            this.specularSprite.method_45851().close();
        }
    }

    public void setSpecularSprite(class08388 class083882) {
        this.specularSprite = class083882;
    }

    public void setNormalSprite(class08388 class083882) {
        this.normalSprite = class083882;
    }

    public class08388 getNormalSprite() {
        return this.normalSprite;
    }

    public class08388 getSpecularSprite() {
        return this.specularSprite;
    }
}

