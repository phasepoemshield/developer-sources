/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.commons.lang3.StringUtils
 *  org.lwjgl.opengl.GL20
 */
package kotakbaz.rain.client.render.main.program.shader;

import java.io.Closeable;
import java.util.HashMap;
import kotakbaz.rain.client.render.main.program.shader.a_0;
import lombok.Generated;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.opengl.GL20;

public class A
implements kotakbaz.rain.client.render.main.A,
Closeable {
    private final String a;
    private final String A;
    private final int b;
    private final HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a_0<?>> B;
    private final a_0 c;
    public static int[] d;

    public A(String string, String string2, int n, HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a_0<?>> hashMap, a_0 a_02) {
        super();
        this.a = string;
        this.A = string2;
        this.b = n;
        this.B = hashMap;
        this.c = a_02;
    }

    @Override
    public void close() {
        GL20.glDeleteShader((int)this.getId());
        this.B.clear();
    }

    @Override
    public kotakbaz.rain.client.render.main.program.compile.A getCompileResult() {
        kotakbaz.rain.client.render.main.program.compile.a_0 a_02;
        int n = d[0];
        n -= d[1];
        return new kotakbaz.rain.client.render.main.program.compile.A(a_02, (a_02 = kotakbaz.rain.client.render.main.program.compile.a_0.fromStatusId(GL20.glGetShaderi((int)this.getId(), (int)(n += d[2])))) == kotakbaz.rain.client.render.main.program.compile.a_0.A ? StringUtils.trim((String)GL20.glGetShaderInfoLog((int)this.getId())) : "");
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
    public HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a_0<?>> getExtraUniforms() {
        return this.B;
    }

    @Generated
    public a_0 getShaderType() {
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

