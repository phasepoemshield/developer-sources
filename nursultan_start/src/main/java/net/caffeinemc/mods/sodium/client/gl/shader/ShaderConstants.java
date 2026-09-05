/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.shader;

import java.util.List;
import net.caffeinemc.mods.sodium.client.gl.shader.ShaderConstants$Builder;

public class ShaderConstants {
    private final List<String> defines;

    ShaderConstants(List<String> list) {
        this.defines = list;
    }

    public static ShaderConstants$Builder builder() {
        return new ShaderConstants$Builder();
    }

    public List<String> getDefineStrings() {
        return this.defines;
    }
}

