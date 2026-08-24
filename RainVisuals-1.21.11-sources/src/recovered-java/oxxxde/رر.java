/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.commons.lang3.StringUtils
 *  org.lwjgl.opengl.GL20
 */
package oxxxde;

import java.io.Closeable;
import java.util.HashMap;
import kotakbaz.rain.client.render.main.program.compile.A;
import kotakbaz.rain.client.render.main.program.uniform.a;
import lombok.Generated;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.opengl.GL20;
import oxxxde.\u062d\u0622;
import oxxxde.\u0634\u0647;
import oxxxde.\u0635\u062c;

public class \u0631\u0631
implements Closeable,
\u0634\u0647 {
    private final \u062d\u0622 shaderType;
    private final String content;
    private final HashMap<String, a<?>> extraUniforms;
    private final int id;
    private final String name;

    @Generated
    public \u062d\u0622 getShaderType() {
        return this.shaderType;
    }

    public \u0631\u0631(String name, String content, int id, HashMap<String, a<?>> extraUniforms, \u062d\u0622 shaderType) {
        this.name = name;
        this.content = content;
        this.id = id;
        this.extraUniforms = extraUniforms;
        this.shaderType = shaderType;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Override
    public void close() {
        GL20.glDeleteShader((int)this.getId());
        this.extraUniforms.clear();
    }

    @Generated
    public int getId() {
        return this.id;
    }

    @Generated
    public HashMap<String, a<?>> getExtraUniforms() {
        return this.extraUniforms;
    }

    @Override
    public A getCompileResult() {
        \u0635\u062c status;
        return new A(status, (status = \u0635\u062c.fromStatusId(GL20.glGetShaderi((int)this.getId(), (int)35713))) == \u0635\u062c.FAILURE ? StringUtils.trim((String)GL20.glGetShaderInfoLog((int)this.getId())) : "");
    }

    @Generated
    public String getContent() {
        return this.content;
    }
}

