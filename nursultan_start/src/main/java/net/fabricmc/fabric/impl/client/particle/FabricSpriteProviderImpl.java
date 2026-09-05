/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00975
 *  minecraft.class06069
 *  minecraft.class06202
 *  minecraft.class08388
 *  minecraft.class08589
 *  minecraft.class08626
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.particle.v1.FabricSpriteProvider
 */
package net.fabricmc.fabric.impl.client.particle;

import java.util.List;
import minecraft.class00975;
import minecraft.class06069;
import minecraft.class06202;
import minecraft.class08388;
import minecraft.class08589;
import minecraft.class08626;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.FabricSpriteProvider;

@Environment(value=EnvType.CLIENT)
public record FabricSpriteProviderImpl(class00975 delegate) implements FabricSpriteProvider
{
    public class08388 method_18138(int n, int n2) {
        return this.delegate.method_18138(n, n2);
    }

    public class08388 method_74304() {
        return this.delegate.method_74304();
    }

    public class08388 method_18139(class06069 class060692) {
        return this.delegate.method_18139(class060692);
    }

    public List<class08388> getSprites() {
        return this.delegate.N;
    }

    public class08626 getAtlas() {
        return class06202.Nq().yW().N(class08589.U);
    }
}

