/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.program;

import java.util.HashMap;
import kotakbaz.rain.client.render.main.builders.GlProgramBuilder;
import oxxxde.\u062d\u0622;

public record a(HashMap<\u062d\u0622, kotakbaz.rain.client.render.main.compile.a> shaders, HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a<?>> uniforms) {
    public <T> void applyTo(GlProgramBuilder<T> builder) {
        this.shaders.forEach((type, glslFileEntry) -> builder.shader((kotakbaz.rain.client.render.main.compile.a)glslFileEntry, (\u062d\u0622)((Object)type)));
        this.uniforms.forEach(builder::uniform);
    }
}

