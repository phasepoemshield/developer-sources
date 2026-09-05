/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntArraySet
 *  it.unimi.dsi.fastutil.ints.IntIterator
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  minecraft.class01894
 *  minecraft.class03609
 *  minecraft.class06202
 *  minecraft.class08918
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.state.StateUpdateNotifiers
 *  net.irisshaders.iris.mixin.GlStateManagerAccessor
 *  net.irisshaders.iris.targets.backed.NativeImageBackedSingleColorTexture
 */
package net.irisshaders.iris.pbr.texture;

import com.mojang.blaze3d.opengl.GlStateManager;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.IOException;
import java.nio.file.Path;
import minecraft.class01894;
import minecraft.class03609;
import minecraft.class06202;
import minecraft.class08918;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.state.StateUpdateNotifiers;
import net.irisshaders.iris.mixin.GlStateManagerAccessor;
import net.irisshaders.iris.pbr.TextureTracker;
import net.irisshaders.iris.pbr.loader.PBRTextureLoader;
import net.irisshaders.iris.pbr.loader.PBRTextureLoaderRegistry;
import net.irisshaders.iris.pbr.texture.PBRDumpable;
import net.irisshaders.iris.pbr.texture.PBRTextureHolder;
import net.irisshaders.iris.pbr.texture.PBRTextureManager$1;
import net.irisshaders.iris.pbr.texture.PBRTextureManager$PBRTextureConsumerImpl;
import net.irisshaders.iris.pbr.texture.PBRType;
import net.irisshaders.iris.targets.backed.NativeImageBackedSingleColorTexture;

public class PBRTextureManager {
    public static final PBRTextureManager INSTANCE = new PBRTextureManager();
    private static Runnable normalTextureChangeListener;
    private static Runnable specularTextureChangeListener;
    private final IntSet toLoadNextFrame = new IntArraySet();
    private final Int2ObjectMap<PBRTextureHolder> holders = new Int2ObjectOpenHashMap();
    private final PBRTextureManager$PBRTextureConsumerImpl consumer = new PBRTextureManager$PBRTextureConsumerImpl(this);
    NativeImageBackedSingleColorTexture defaultNormalTexture;
    NativeImageBackedSingleColorTexture defaultSpecularTexture;
    final PBRTextureHolder defaultHolder = new PBRTextureManager$1(this);

    private PBRTextureManager() {
    }

    public void clear() {
        for (PBRTextureHolder pBRTextureHolder : this.holders.values()) {
            if (pBRTextureHolder == this.defaultHolder) continue;
            this.closeHolder(pBRTextureHolder);
        }
        this.holders.clear();
    }

    public void init() {
        this.defaultNormalTexture = new NativeImageBackedSingleColorTexture(PBRType.NORMAL.getDefaultValue());
        this.defaultSpecularTexture = new NativeImageBackedSingleColorTexture(PBRType.SPECULAR.getDefaultValue());
    }

    public void close() {
        this.clear();
        this.defaultNormalTexture.close();
        this.defaultSpecularTexture.close();
    }

    public void dumpTextures(Path path) {
        for (PBRTextureHolder pBRTextureHolder : this.holders.values()) {
            if (pBRTextureHolder == this.defaultHolder) continue;
            this.dumpHolder(pBRTextureHolder, path);
        }
    }

    public void onDeleteTexture(int n) {
        PBRTextureHolder pBRTextureHolder = (PBRTextureHolder)this.holders.remove(n);
        if (pBRTextureHolder != null) {
            this.closeHolder(pBRTextureHolder);
        }
    }

    private void closeHolder(PBRTextureHolder pBRTextureHolder) {
        class08918 class089182 = pBRTextureHolder.normalTexture();
        class08918 class089183 = pBRTextureHolder.specularTexture();
        if (class089182 != this.defaultNormalTexture) {
            PBRTextureManager.closeTexture(class089182);
        }
        if (class089183 != this.defaultSpecularTexture) {
            PBRTextureManager.closeTexture(class089183);
        }
    }

    private static void dumpTexture(class03609 class036092, class01894 class018942, Path path) {
        try {
            class036092.method_49712(class018942, path);
        }
        catch (IOException iOException) {
            Iris.logger.error("Failed to dump texture {}", new Object[]{class018942, iOException});
        }
    }

    public PBRTextureHolder getOrLoadHolder(int n) {
        PBRTextureHolder pBRTextureHolder = (PBRTextureHolder)this.holders.get(n);
        if (pBRTextureHolder == null) {
            this.toLoadNextFrame.add(n);
            return this.defaultHolder;
        }
        return pBRTextureHolder;
    }

    private static void closeTexture(class08918 class089182) {
        try {
            class089182.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void onNewFrame() {
        if (!this.toLoadNextFrame.isEmpty()) {
            IntIterator intIterator = this.toLoadNextFrame.iterator();
            while (intIterator.hasNext()) {
                int n = intIterator.nextInt();
                PBRTextureHolder pBRTextureHolder = this.loadHolder(n);
                this.holders.put(n, (Object)pBRTextureHolder);
            }
            this.toLoadNextFrame.clear();
        }
    }

    public PBRTextureHolder getHolder(int n) {
        PBRTextureHolder pBRTextureHolder = (PBRTextureHolder)this.holders.get(n);
        if (pBRTextureHolder == null) {
            return this.defaultHolder;
        }
        return pBRTextureHolder;
    }

    public static void notifyPBRTexturesChanged() {
        if (normalTextureChangeListener != null) {
            normalTextureChangeListener.run();
        }
        if (specularTextureChangeListener != null) {
            specularTextureChangeListener.run();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private PBRTextureHolder loadHolder(int n) {
        Class<?> clazz;
        PBRTextureLoader<?> pBRTextureLoader;
        class08918 class089182 = TextureTracker.INSTANCE.getTexture(n);
        if (class089182 != null && (pBRTextureLoader = PBRTextureLoaderRegistry.INSTANCE.getLoader(clazz = class089182.getClass())) != null) {
            int n2 = GlStateManagerAccessor.getTEXTURES()[GlStateManagerAccessor.getActiveTexture()].field_5167;
            this.consumer.clear();
            try {
                pBRTextureLoader.load(class089182, class06202.Nq().Nm(), this.consumer);
                PBRTextureHolder pBRTextureHolder = this.consumer.toHolder();
                return pBRTextureHolder;
            }
            catch (Exception exception) {
                Iris.logger.warn("Failed to load PBR textures for texture " + n, (Throwable)exception);
            }
            finally {
                GlStateManager._bindTexture((int)n2);
            }
        }
        return this.defaultHolder;
    }

    private void dumpHolder(PBRTextureHolder pBRTextureHolder, Path path) {
        PBRDumpable pBRDumpable;
        class08918 class089182 = pBRTextureHolder.normalTexture();
        class08918 class089183 = pBRTextureHolder.specularTexture();
        if (class089182 != this.defaultNormalTexture && class089182 instanceof PBRDumpable) {
            pBRDumpable = (PBRDumpable)class089182;
            PBRTextureManager.dumpTexture(pBRDumpable, pBRDumpable.getDefaultDumpLocation(), path);
        }
        if (class089183 != this.defaultSpecularTexture && class089183 instanceof PBRDumpable) {
            pBRDumpable = (PBRDumpable)class089183;
            PBRTextureManager.dumpTexture(pBRDumpable, pBRDumpable.getDefaultDumpLocation(), path);
        }
    }

    static {
        StateUpdateNotifiers.normalTextureChangeNotifier = runnable -> {
            normalTextureChangeListener = runnable;
        };
        StateUpdateNotifiers.specularTextureChangeNotifier = runnable -> {
            specularTextureChangeListener = runnable;
        };
    }
}

