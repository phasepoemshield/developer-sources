/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class08388
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.model.SpriteFinder
 *  net.fabricmc.fabric.api.renderer.v1.sprite.FabricStitchResult
 *  net.fabricmc.fabric.impl.renderer.SpriteFinderImpl
 *  net.fabricmc.fabric.impl.renderer.StitchResultExtension
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import minecraft.class01894;
import minecraft.class08388;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.model.SpriteFinder;
import net.fabricmc.fabric.api.renderer.v1.sprite.FabricStitchResult;
import net.fabricmc.fabric.impl.renderer.SpriteFinderImpl;
import net.fabricmc.fabric.impl.renderer.StitchResultExtension;
import org.jspecify.annotations.Nullable;

/*
 * Signature claims super is java.lang.Record, not java.lang.Object - discarding signature.
 */
@Environment(value=EnvType.CLIENT)
public final class class02008
implements FabricStitchResult,
StitchResultExtension {
    private int width;
    private int height;
    private int mipLevel;
    private class08388 missing;
    private Map<class01894, class08388> regions;
    private CompletableFuture<Void> readyForUpload;
    private volatile @Nullable SpriteFinder M;

    public int L() {
        return this.mipLevel;
    }

    public class02008(int n, int n2, int n3, class08388 class083882, Map<class01894, class08388> map, CompletableFuture<Void> completableFuture) {
        this.width = n;
        this.height = n2;
        this.mipLevel = n3;
        this.missing = class083882;
        this.regions = map;
        this.readyForUpload = completableFuture;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof class02008 && this.width == ((class02008)object).width && this.height == ((class02008)object).height && this.mipLevel == ((class02008)object).mipLevel && Objects.equals(this.missing, ((class02008)object).missing) && Objects.equals(this.regions, ((class02008)object).regions) && Objects.equals(this.readyForUpload, ((class02008)object).readyForUpload);
    }

    public final String toString() {
        return "class02008[width=" + Integer.toString(this.width) + ", height=" + Integer.toString(this.height) + ", mipLevel=" + Integer.toString(this.mipLevel) + ", missing=" + Objects.toString(this.missing) + ", regions=" + Objects.toString(this.regions) + ", readyForUpload=" + Objects.toString(this.readyForUpload) + "]";
    }

    public final int hashCode() {
        return (((((0 * 31 + Integer.hashCode(this.width)) * 31 + Integer.hashCode(this.height)) * 31 + Integer.hashCode(this.mipLevel)) * 31 + Objects.hashCode(this.missing)) * 31 + Objects.hashCode(this.regions)) * 31 + Objects.hashCode(this.readyForUpload);
    }

    public Map<class01894, class08388> i() {
        return this.regions;
    }

    public class08388 u() {
        return this.missing;
    }

    public int y() {
        return this.height;
    }

    public @Nullable class08388 N(class01894 class018942) {
        return this.regions.get(class018942);
    }

    public int N() {
        return this.width;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SpriteFinder spriteFinder() {
        SpriteFinder spriteFinder = this.M;
        if (spriteFinder == null) {
            class02008 class020082 = this;
            synchronized (class020082) {
                spriteFinder = this.M;
                if (spriteFinder == null) {
                    this.M = spriteFinder = new SpriteFinderImpl(this.regions, this.missing);
                }
            }
        }
        return spriteFinder;
    }

    public CompletableFuture<Void> R() {
        return this.readyForUpload;
    }

    public @Nullable SpriteFinder fabric_spriteFinderNullable() {
        return this.M;
    }
}

