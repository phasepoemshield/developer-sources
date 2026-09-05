/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01079
 *  minecraft.class01894
 *  minecraft.class02857
 */
package net.irisshaders.iris.pipeline.programs;

import java.util.Optional;
import minecraft.class01079;
import minecraft.class01894;
import minecraft.class02857;
import net.irisshaders.iris.pipeline.programs.ShaderCreator$StringResource;

record ShaderCreator$IrisProgramResourceFactory(String json, String vertex, String geometry, String tessControl, String tessEval, String fragment) implements class02857
{
    public Optional<class01079> method_14486(class01894 class018942) {
        String string = class018942.N();
        if (string.endsWith("json")) {
            return Optional.of(new ShaderCreator$StringResource(class018942, this.json));
        }
        if (string.endsWith("vsh")) {
            return Optional.of(new ShaderCreator$StringResource(class018942, this.vertex));
        }
        if (string.endsWith("gsh")) {
            if (this.geometry == null) {
                return Optional.empty();
            }
            return Optional.of(new ShaderCreator$StringResource(class018942, this.geometry));
        }
        if (string.endsWith("tcs")) {
            if (this.tessControl == null) {
                return Optional.empty();
            }
            return Optional.of(new ShaderCreator$StringResource(class018942, this.tessControl));
        }
        if (string.endsWith("tes")) {
            if (this.tessEval == null) {
                return Optional.empty();
            }
            return Optional.of(new ShaderCreator$StringResource(class018942, this.tessEval));
        }
        if (string.endsWith("fsh")) {
            return Optional.of(new ShaderCreator$StringResource(class018942, this.fragment));
        }
        return Optional.empty();
    }
}

