/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.program.shader;

import java.io.Closeable;
import java.util.HashMap;
import kotakbaz.rain.client.render.main.a_0;
import kotakbaz.rain.client.render.main.program.uniform.a;
import lombok.Generated;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.opengl.GL20;

public class A
implements a_0,
Closeable {
    private final String a;
    private final String A;
    private final int b;
    private final HashMap<String, a<?>> B;
    private final kotakbaz.rain.client.render.main.program.shader.a_0 c;
    public static int[] d;

    public A(String name, String content, int id, HashMap<String, a<?>> extraUniforms, kotakbaz.rain.client.render.main.program.shader.a_0 shaderType) {
        this.a = name;
        this.A = content;
        this.b = id;
        this.B = extraUniforms;
        this.c = shaderType;
    }

    @Override
    public void close() {
        GL20.glDeleteShader((int)this.getId());
        this.B.clear();
    }

    @Override
    public kotakbaz.rain.client.render.main.program.compile.A getCompileResult() {
        kotakbaz.rain.client.render.main.program.compile.a_0 a_02;
        int n2 = d[0];
        n2 -= d[1];
        return new kotakbaz.rain.client.render.main.program.compile.A(a_02, (a_02 = kotakbaz.rain.client.render.main.program.compile.a_0.fromStatusId(GL20.glGetShaderi((int)this.getId(), (int)(n2 += d[2])))) == kotakbaz.rain.client.render.main.program.compile.a_0.A ? StringUtils.trim((String)GL20.glGetShaderInfoLog((int)this.getId())) : "");
    }

    @Generated
    public String getName() {
        return this.a;
    }

    @Generated
    public String getContent() {
        return this.A;
    }

    @Generated
    public int getId() {
        return this.b;
    }

    @Generated
    public HashMap<String, a<?>> getExtraUniforms() {
        return this.B;
    }

    @Generated
    public kotakbaz.rain.client.render.main.program.shader.a_0 getShaderType() {
        return this.c;
    }

    static {
        kotakbaz.rain.client.render.main.program.shader.A.a();
    }

    public static void a() {
        d = new int[0x49F4 ^ 0x49F7];
        kotakbaz.rain.client.render.main.program.shader.A.d[0xF55B ^ 0xF55B] = 0x7E54 ^ 0xF55B;
        kotakbaz.rain.client.render.main.program.shader.A.d[0x57FE ^ 0x57FC] = 0x57FD ^ 0x57FC;
        kotakbaz.rain.client.render.main.program.shader.A.d[0x67FD ^ 0x67FC] = 0xFFFF9873 ^ 0x67FC;
    }
}

