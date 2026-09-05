/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntFunction
 *  minecraft.class01894
 *  minecraft.class02484
 *  minecraft.class04206
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07050
 *  minecraft.class08036
 *  net.irisshaders.iris.api.v0.item.IrisItemLightProvider
 *  net.irisshaders.iris.shaderpack.materialmap.NamespacedId
 *  org.joml.Vector3f
 */
package net.irisshaders.iris.uniforms;

import it.unimi.dsi.fastutil.objects.Object2IntFunction;
import minecraft.class01894;
import minecraft.class02484;
import minecraft.class04206;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class08036;
import net.irisshaders.iris.api.v0.item.IrisItemLightProvider;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import org.joml.Vector3f;

class IdMapUniforms$HeldItemSupplier {
    private final class07050 hand;
    private final Object2IntFunction<NamespacedId> itemIdMap;
    private final boolean applyOldHandLight;
    private int intID;
    private int lightValue;
    private Vector3f lightColor;

    IdMapUniforms$HeldItemSupplier(class07050 class070502, Object2IntFunction<NamespacedId> object2IntFunction, boolean bl) {
        this.hand = class070502;
        this.itemIdMap = object2IntFunction;
        this.applyOldHandLight = bl && class070502 == class07050.field_5808;
    }

    public void update() {
        class04453 class044532 = (class04453)class06202.Nq().T_4;
        if (class044532 == null) {
            this.invalidate();
            return;
        }
        class06584 class065842 = class044532.method_5998(this.hand);
        if (class065842 == null) {
            this.invalidate();
            return;
        }
        class06581 class065812 = class065842.B();
        if (class065812 == null) {
            this.invalidate();
            return;
        }
        class01894 class018942 = (class01894)class065842.method_58694(class02484.E);
        if (class018942 == null) {
            class018942 = class04206.B.y((Object)class065812);
        }
        this.intID = this.itemIdMap.applyAsInt((Object)new NamespacedId(class018942.y(), class018942.N()));
        IrisItemLightProvider irisItemLightProvider = (IrisItemLightProvider)class065812;
        this.lightValue = irisItemLightProvider.getLightEmission((class08036)((class04453)class06202.Nq().T_4), class065842);
        if (this.applyOldHandLight) {
            irisItemLightProvider = this.applyOldHandLighting(class044532, irisItemLightProvider);
        }
        this.lightColor = irisItemLightProvider.getLightColor((class08036)((class04453)class06202.Nq().T_4), class065842);
    }

    private void invalidate() {
        this.intID = -1;
        this.lightValue = 0;
        this.lightColor = IrisItemLightProvider.DEFAULT_LIGHT_COLOR;
    }

    public Vector3f getLightColor() {
        return this.lightColor;
    }

    private IrisItemLightProvider applyOldHandLighting(class04453 class044532, IrisItemLightProvider irisItemLightProvider) {
        class06584 class065842 = class044532.method_5998(class07050.field_5810);
        if (class065842 == null) {
            return irisItemLightProvider;
        }
        class06581 class065812 = class065842.B();
        if (class065812 == null) {
            return irisItemLightProvider;
        }
        IrisItemLightProvider irisItemLightProvider2 = (IrisItemLightProvider)class065812;
        int n = irisItemLightProvider2.getLightEmission((class08036)((class04453)class06202.Nq().T_4), class065842);
        if (this.lightValue < n) {
            this.lightValue = n;
            return irisItemLightProvider2;
        }
        return irisItemLightProvider;
    }

    public int getLightValue() {
        return this.lightValue;
    }

    public int getIntID() {
        return this.intID;
    }
}

