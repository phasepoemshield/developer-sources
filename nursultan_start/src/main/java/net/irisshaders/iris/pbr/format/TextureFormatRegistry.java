/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.pbr.format;

import java.util.HashMap;
import java.util.Map;
import net.irisshaders.iris.pbr.format.LabPBRTextureFormat;
import net.irisshaders.iris.pbr.format.TextureFormat$Factory;

public class TextureFormatRegistry {
    public static final TextureFormatRegistry INSTANCE = new TextureFormatRegistry();
    private final Map<String, TextureFormat$Factory> factoryMap = new HashMap<String, TextureFormat$Factory>();

    static {
        INSTANCE.register("lab-pbr", LabPBRTextureFormat::new);
    }

    public TextureFormat$Factory getFactory(String string) {
        return this.factoryMap.get(string);
    }

    public void register(String string, TextureFormat$Factory textureFormat$Factory) {
        this.factoryMap.put(string, textureFormat$Factory);
    }
}

