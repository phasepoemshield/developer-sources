/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01079
 *  minecraft.class01283
 *  minecraft.class01592
 *  minecraft.class01622
 *  minecraft.class01894
 *  minecraft.class02267
 *  minecraft.class02298
 *  org.apache.commons.io.IOUtils
 */
package net.irisshaders.iris.pipeline.programs;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class01079;
import minecraft.class01283;
import minecraft.class01592;
import minecraft.class01622;
import minecraft.class01894;
import minecraft.class02267;
import minecraft.class02298;
import net.irisshaders.iris.platform.IrisPlatformHelpers;
import org.apache.commons.io.IOUtils;

class ShaderCreator$StringResource
extends class01079 {
    private final String content;

    ShaderCreator$StringResource(class01894 class018942, String string) {
        super((class01622)new class01592(new class02267("<iris shaderpack shaders>", (class00392)class00392.y((String)"iris"), class01283.L, Optional.of(new class02298("iris", "shader", "1.0"))), IrisPlatformHelpers.getInstance().getConfigDir()), () -> new ByteArrayInputStream(string.getBytes(StandardCharsets.UTF_8)));
        this.content = string;
    }

    public InputStream method_14482() {
        return IOUtils.toInputStream((String)this.content, (Charset)StandardCharsets.UTF_8);
    }
}

