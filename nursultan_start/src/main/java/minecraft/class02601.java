/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05913
 *  minecraft.class08388
 *  minecraft.class08512
 *  minecraft.class08838
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.sprite.FabricErrorCollectingSpriteGetter
 *  net.fabricmc.fabric.mixin.renderer.client.sprite.SpriteGetterMixin
 */
package minecraft;

import minecraft.class05913;
import minecraft.class08388;
import minecraft.class08512;
import minecraft.class08838;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.sprite.FabricErrorCollectingSpriteGetter;
import net.fabricmc.fabric.mixin.renderer.client.sprite.SpriteGetterMixin;

@Environment(value=EnvType.CLIENT)
public interface class02601
extends FabricErrorCollectingSpriteGetter,
SpriteGetterMixin {
    public class08388 N(class05913 var1, class08512 var2);

    public class08388 N(String var1, class08512 var2);

    default public class08388 N(class08838 class088382, String string, class08512 class085122) {
        class05913 class059132 = class088382.N(string);
        return class059132 != null ? this.N(class059132, class085122) : this.N(string, class085122);
    }
}

