/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11170
 *  Nursultan.class11200
 *  Nursultan.class11210
 *  Nursultan.class11911
 *  Nursultan.class11993
 *  Nursultan.class12003
 *  Nursultan.class12004
 *  Nursultan.class12005
 *  Nursultan.class12009
 *  Nursultan.class12017
 *  Nursultan.class12026
 *  Nursultan.class12038
 *  Nursultan.class12042
 *  Nursultan.class12043
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class01079
 *  minecraft.class06202
 *  org.apache.commons.io.IOUtils
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL31
 */
package Nursultan;

import Nursultan.class09306;
import Nursultan.class09307;
import Nursultan.class09337;
import Nursultan.class09353;
import Nursultan.class11170;
import Nursultan.class11200;
import Nursultan.class11210;
import Nursultan.class11911;
import Nursultan.class11993;
import Nursultan.class12003;
import Nursultan.class12004;
import Nursultan.class12005;
import Nursultan.class12009;
import Nursultan.class12017;
import Nursultan.class12026;
import Nursultan.class12038;
import Nursultan.class12042;
import Nursultan.class12043;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.function.IntFunction;
import minecraft.class01079;
import minecraft.class06202;
import org.apache.commons.io.IOUtils;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL31;

public class class09322
extends class09306 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;

    public void L() {
        this.E();
        this.W();
        ((class09337)this.N_3).y();
        int n = 0;
        int n2 = 0;
        try {
            n = this.N(35633, (String)this.N_0);
            n2 = this.N(35632, (String)this.N_1);
            GL31.glAttachShader((int)((Integer)this.y_0), (int)n);
            GL31.glAttachShader((int)((Integer)this.y_0), (int)n2);
            GL31.glLinkProgram((int)((Integer)this.y_0));
            if (GL31.glGetProgrami((int)((Integer)this.y_0), (int)35714) == 0) {
                throw new IllegalStateException("Shader link failed: " + (String)this.N_0 + ", " + (String)this.N_1 + ". " + GL31.glGetProgramInfoLog((int)((Integer)this.y_0)));
            }
            this.N_4 = null;
            this.N_5 = null;
            this.N_6 = null;
        }
        finally {
            if (n != 0) {
                GL31.glDetachShader((int)((Integer)this.y_0), (int)n);
                GL31.glDeleteShader((int)n);
            }
            if (n2 != 0) {
                GL31.glDetachShader((int)((Integer)this.y_0), (int)n2);
                GL31.glDeleteShader((int)n2);
            }
        }
    }

    public class12003 L(String string) {
        return (class12003)this.N(string, class12003::new, class09353.INT);
    }

    public void M() {
        GL31.glUseProgram((int)((Integer)this.y_0));
    }

    public class12026 M(String string) {
        return (class12026)this.N(string, class12026::new, class09353.SAMPLER_2D);
    }

    public class09322(String string, String string2, class09337 class093372, String string3) {
        super(GL31.glCreateProgram());
        this.E();
        this.N_0 = string;
        this.N_1 = string2;
        this.N_3 = class093372;
        this.N_2 = string3;
        this.L();
    }

    public class09322(String string, String string2) {
        this(string, string2, class09337.N, "");
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof class09322)) {
            return false;
        }
        class09322 class093222 = (class09322)object;
        if (!class093222.N(this)) {
            return false;
        }
        String string = this.B();
        String string2 = class093222.B();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        String string3 = this.R();
        String string4 = class093222.R();
        if (string3 == null ? string4 != null : !string3.equals(string4)) {
            return false;
        }
        String string5 = this.i();
        String string6 = class093222.i();
        return !(string5 == null ? string6 != null : !string5.equals(string6));
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        String string = this.B();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        String string2 = this.R();
        n2 = n2 * 59 + (string2 == null ? 43 : string2.hashCode());
        String string3 = this.i();
        n2 = n2 * 59 + (string3 == null ? 43 : string3.hashCode());
        return n2;
    }

    public String B() {
        this.E();
        return (String)this.N_0;
    }

    public class11210 B(String string) {
        return this.N(string, class11210::new, class09353.IVEC2);
    }

    public Object2ObjectOpenHashMap<String, class12004> Z() {
        this.E();
        return (Object2ObjectOpenHashMap)this.N_4;
    }

    public class12042 Z(String string) {
        return this.N(string, class12042::new, class09353.IVEC4);
    }

    public class11200 i(String string) {
        return (class11200)this.N(string, class11200::new, class09353.FLOAT);
    }

    public String i() {
        this.E();
        return (String)this.N_2;
    }

    private Object2ObjectOpenHashMap<String, class09307> s() {
        this.E();
        if ((Object2ObjectOpenHashMap)this.N_5 != null) {
            return (Object2ObjectOpenHashMap)this.N_5;
        }
        this.N_5 = new Object2ObjectOpenHashMap();
        int n = GL31.glGetProgrami((int)((Integer)this.y_0), (int)35718);
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)1);
        IntBuffer intBuffer2 = BufferUtils.createIntBuffer((int)1);
        for (int i = 0; i < n; ++i) {
            intBuffer.clear();
            intBuffer2.clear();
            String string = GL31.glGetActiveUniform((int)((Integer)this.y_0), (int)i, (IntBuffer)intBuffer, (IntBuffer)intBuffer2);
            class09307 class093072 = new class09307(string, intBuffer2.get(0), intBuffer.get(0));
            ((Object2ObjectOpenHashMap)this.N_5).put((Object)class09322.Y(string), (Object)class093072);
            ((Object2ObjectOpenHashMap)this.N_5).put((Object)string, (Object)class093072);
        }
        return (Object2ObjectOpenHashMap)this.N_5;
    }

    private String m(String string) {
        String string2;
        block8: {
            class01079 class010792 = (class01079)class06202.Nq().Nm().method_14486(class11911.N((String)string)).orElseThrow(() -> new IllegalStateException("Shader resource was not found: " + string));
            InputStream inputStream = class010792.method_14482();
            try {
                string2 = IOUtils.toString((InputStream)inputStream, (Charset)StandardCharsets.UTF_8);
                if (inputStream == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException iOException) {
                    throw new IllegalStateException("Failed to read shader source: " + string, iOException);
                }
            }
            inputStream.close();
        }
        return string2;
    }

    public class12017 U(String string) {
        return (class12017)this.N(string, class12017::new, class09353.VEC3);
    }

    public class12038 z(String string) {
        return (class12038)this.N(string, class12038::new, class09353.MAT4);
    }

    public Object2ObjectOpenHashMap<String, class12009> u() {
        this.E();
        return (Object2ObjectOpenHashMap)this.N_6;
    }

    public class12005 u(String string) {
        return this.N(string, class12005::new, class09353.IVEC3);
    }

    public class11170 y(String string) {
        return (class11170)this.N(string, class11170::new, class09353.FLOAT_ARRAY);
    }

    private static String y(int n) {
        return switch (n) {
            case 5126 -> "float";
            case 35664 -> "vec2";
            case 35665 -> "vec3";
            case 35666 -> "vec4";
            case 5124 -> "int";
            case 35667 -> "ivec2";
            case 35668 -> "ivec3";
            case 35669 -> "ivec4";
            case 35670 -> "bool";
            case 35676 -> "mat4";
            case 35678 -> "sampler2D";
            default -> "0x" + Integer.toHexString(n);
        };
    }

    private void E() {
    }

    public class12009 N(String string, int n) {
        this.E();
        if ((Object2ObjectOpenHashMap)this.N_6 == null) {
            this.N_6 = new Object2ObjectOpenHashMap();
        } else {
            class12009 class120092 = (class12009)((Object2ObjectOpenHashMap)this.N_6).get((Object)string);
            if (class120092 != null) {
                return class120092;
            }
        }
        int n2 = GL31.glGetUniformBlockIndex((int)((Integer)this.y_0), (CharSequence)string);
        if (n2 == -1) {
            throw new IllegalArgumentException("Uniform block was not found or is inactive: " + string + " in " + (String)this.N_0 + ", " + (String)this.N_1);
        }
        GL31.glUniformBlockBinding((int)((Integer)this.y_0), (int)n2, (int)n);
        class12009 class120093 = new class12009(n2, n);
        ((Object2ObjectOpenHashMap)this.N_6).put((Object)string, (Object)class120093);
        return class120093;
    }

    public boolean N(Object object) {
        return object instanceof class09322;
    }

    private <T extends class12004> T N(String string, IntFunction<T> intFunction, class09353 class093532) {
        this.E();
        if ((Object2ObjectOpenHashMap)this.N_4 == null) {
            this.N_4 = new Object2ObjectOpenHashMap();
        } else {
            class12004 class120042 = (class12004)((Object2ObjectOpenHashMap)this.N_4).get((Object)string);
            if (class120042 != null) {
                return (T)class120042;
            }
        }
        int n = GL31.glGetUniformLocation((int)((Integer)this.y_0), (CharSequence)string);
        if (n < 0 && !string.endsWith("[0]")) {
            n = GL31.glGetUniformLocation((int)((Integer)this.y_0), (CharSequence)(string + "[0]"));
        }
        if (n < 0) {
            throw new IllegalArgumentException("Uniform was not found or is inactive: " + string + " in " + (String)this.N_0 + ", " + (String)this.N_1);
        }
        if (((class09337)this.N_3).N()) {
            this.N(string, class093532);
        }
        class12004 class120043 = (class12004)intFunction.apply(n);
        ((Object2ObjectOpenHashMap)this.N_4).put((Object)string, (Object)class120043);
        return (T)class120043;
    }

    private void N(String string, class09353 class093532) {
        this.E();
        class09307 class093072 = (class09307)((Object)this.s().get((Object)class09322.Y(string)));
        if (class093072 == null) {
            return;
        }
        if (!class093532.N(class093072.N(), class093072.y(), string.endsWith("]"))) {
            throw new IllegalArgumentException("Uniform type mismatch: " + string + " in " + (String)this.N_0 + ", " + (String)this.N_1 + ". Expected " + class093532.N() + ", actual " + class09322.y(class093072.N()) + (String)(class093072.y() > 1 ? "[" + class093072.y() + "]" : ""));
        }
    }

    private int N(int n, String string) {
        this.E();
        String string2 = ((class09337)this.N_3).N(n, string, this.m(string));
        int n2 = GL31.glCreateShader((int)n);
        GL31.glShaderSource((int)n2, (CharSequence)string2);
        GL31.glCompileShader((int)n2);
        if (GL31.glGetShaderi((int)n2, (int)35713) == 0) {
            String string3 = GL31.glGetShaderInfoLog((int)n2);
            GL31.glDeleteShader((int)n2);
            throw new IllegalStateException("Shader compile failed: " + string + ". " + string3);
        }
        return n2;
    }

    public class12043 N(String string) {
        return (class12043)this.N(string, class12043::new, class09353.VEC4);
    }

    public class09337 N() {
        this.E();
        return (class09337)this.N_3;
    }

    private void W() {
        int n = GL31.glGetProgrami((int)((Integer)this.y_0), (int)35717);
        if (n <= 0) {
            return;
        }
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)1);
        IntBuffer intBuffer2 = BufferUtils.createIntBuffer((int)n);
        GL31.glGetAttachedShaders((int)((Integer)this.y_0), (IntBuffer)intBuffer, (IntBuffer)intBuffer2);
        for (int i = 0; i < intBuffer.get(0); ++i) {
            GL31.glDetachShader((int)((Integer)this.y_0), (int)intBuffer2.get(i));
        }
    }

    public String R() {
        this.E();
        return (String)this.N_1;
    }

    public class11993 R(String string) {
        return (class11993)this.N(string, class11993::new, class09353.VEC2);
    }

    private static String Y(String string) {
        int n = string.indexOf(91);
        return n >= 0 ? string.substring(0, n) : string;
    }
}

