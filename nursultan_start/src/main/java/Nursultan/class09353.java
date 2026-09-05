/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.Set;

public class class09353
extends Enum<class09353> {
    public static final /* enum */ class09353 FLOAT;
    public static final /* enum */ class09353 FLOAT_ARRAY;
    public static final /* enum */ class09353 INT;
    public static final /* enum */ class09353 VEC2;
    public static final /* enum */ class09353 VEC3;
    public static final /* enum */ class09353 VEC4;
    public static final /* enum */ class09353 IVEC2;
    public static final /* enum */ class09353 IVEC3;
    public static final /* enum */ class09353 IVEC4;
    public static final /* enum */ class09353 MAT4;
    public static final /* enum */ class09353 SAMPLER_2D;
    private static final /* synthetic */ class09353[] $VALUES;
    public String fields_089430c2fab1a37ba83cabd41c73dd1db_0;
    public Set fields_089430c2fab1a37ba83cabd41c73dd1db_1;
    public Boolean fields_089430c2fab1a37ba83cabd41c73dd1db_2;
    public boolean fields_089430c2fab1a37ba83cabd41c73dd1db_init;

    private static void L() {
    }

    private void M() {
        if (!this.fields_089430c2fab1a37ba83cabd41c73dd1db_init) {
            this.fields_089430c2fab1a37ba83cabd41c73dd1db_init = true;
            this.fields_089430c2fab1a37ba83cabd41c73dd1db_2 = false;
        }
    }

    private class09353(String string2, Set<Integer> set, boolean bl) {
        this.M();
        this.fields_089430c2fab1a37ba83cabd41c73dd1db_0 = string2;
        this.fields_089430c2fab1a37ba83cabd41c73dd1db_1 = set;
        this.fields_089430c2fab1a37ba83cabd41c73dd1db_2 = bl;
    }

    static {
        class09353.L();
        FLOAT = new class09353("float", Set.of(Integer.valueOf(5126)), false);
        FLOAT_ARRAY = new class09353("float[]", Set.of(Integer.valueOf(5126)), true);
        Integer n = 5124;
        Integer n2 = 35670;
        INT = new class09353("int/bool/sampler2D", Set.of(n, n2, Integer.valueOf(35678)), false);
        VEC2 = new class09353("vec2", Set.of(Integer.valueOf(35664)), false);
        VEC3 = new class09353("vec3", Set.of(Integer.valueOf(35665)), false);
        VEC4 = new class09353("vec4", Set.of(Integer.valueOf(35666)), false);
        IVEC2 = new class09353("ivec2", Set.of(Integer.valueOf(35667)), false);
        IVEC3 = new class09353("ivec3", Set.of(Integer.valueOf(35668)), false);
        IVEC4 = new class09353("ivec4", Set.of(Integer.valueOf(35669)), false);
        MAT4 = new class09353("mat4", Set.of(Integer.valueOf(35676)), false);
        SAMPLER_2D = new class09353("sampler2D", Set.of(Integer.valueOf(35678)), false);
        $VALUES = class09353.i();
    }

    public static class09353[] values() {
        return (class09353[])$VALUES.clone();
    }

    public static class09353 valueOf(String string) {
        return Enum.valueOf(class09353.class, string);
    }

    private static /* synthetic */ class09353[] i() {
        return new class09353[]{FLOAT, FLOAT_ARRAY, INT, VEC2, VEC3, VEC4, IVEC2, IVEC3, IVEC4, MAT4, SAMPLER_2D};
    }

    public String N() {
        return this.fields_089430c2fab1a37ba83cabd41c73dd1db_0;
    }

    public boolean N(int n, int n2, boolean bl) {
        return this.fields_089430c2fab1a37ba83cabd41c73dd1db_1.contains(n) && (this.fields_089430c2fab1a37ba83cabd41c73dd1db_2 != false || bl || n2 == 1);
    }
}

