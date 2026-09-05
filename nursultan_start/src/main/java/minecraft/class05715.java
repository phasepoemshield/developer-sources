/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10535
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class06962
 *  minecraft.class07001
 *  minecraft.class07529
 *  minecraft.class07713
 */
package minecraft;

import Nursultan.class10535;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Set;
import minecraft.class06962;
import minecraft.class07001;
import minecraft.class07529;
import minecraft.class07713;

public final class class05715
extends Enum<class05715> {
    public static final /* enum */ class05715 field_19212 = new class05715(class06962.N);
    public static final /* enum */ class05715 field_59995 = new class05715(class06962.y);
    public static final /* enum */ class05715 field_19213 = new class05715(class06962.L);
    public static final /* enum */ class05715 field_19214 = new class05715(class06962.u);
    public static final /* enum */ class05715 field_19215 = new class05715(class06962.i);
    public static final /* enum */ class05715 field_19216 = new class05715(class06962.R);
    public static final /* enum */ class05715 field_19217 = new class05715(class06962.M);
    public static final /* enum */ class05715 field_19218 = new class05715(class06962.B);
    public static final /* enum */ class05715 field_45077 = new class05715(class06962.Z);
    public static final /* enum */ class05715 field_45078 = new class05715(class06962.z);
    public static final /* enum */ class05715 field_45079 = new class05715(class06962.U);
    public static final /* enum */ class05715 field_45080 = new class05715(class06962.E);
    public static final /* enum */ class05715 field_45081 = new class05715(class06962.W);
    public static final /* enum */ class05715 field_45082 = new class05715(class06962.m);
    public static final /* enum */ class05715 field_45083 = new class05715(class06962.P);
    public static final /* enum */ class05715 field_63265 = new class05715(class06962.s);
    public static final /* enum */ class05715 field_45084 = new class05715(class06962.T);
    public static final /* enum */ class05715 field_62507 = new class05715(class06962.b);
    public static final /* enum */ class05715 field_19220 = new class05715(class06962.j);
    public static final /* enum */ class05715 field_19221 = new class05715(class06962.v);
    public static final /* enum */ class05715 field_24640 = new class05715(class06962.A);
    public static final /* enum */ class05715 field_26990 = new class05715(class06962.n);
    public static final /* enum */ class05715 field_63266 = new class05715(class06962.t);
    public static final Set<DSL.TypeReference> field_42975;
    private final DSL.TypeReference field_19222;
    private static final /* synthetic */ class05715[] field_19223;

    private class05715(DSL.TypeReference typeReference) {
        this.field_19222 = typeReference;
    }

    public static class05715[] values() {
        return (class05715[])field_19223.clone();
    }

    public static class05715 valueOf(String string) {
        return Enum.valueOf(class05715.class, string);
    }

    private static /* synthetic */ class05715[] y() {
        return new class05715[]{field_19212, field_59995, field_19213, field_19214, field_19215, field_19216, field_19217, field_19218, field_45077, field_45078, field_45079, field_45080, field_45081, field_45082, field_45083, field_63265, field_45084, field_62507, field_19220, field_19221, field_24640, field_26990, field_63266};
    }

    public class07001 N(DataFixer dataFixer, class07001 class070012, int n) {
        return this.N(dataFixer, class070012, n, class05715.N());
    }

    public class07001 N(DataFixer dataFixer, class07001 class070012, int n, int n2) {
        return (class07001)this.N(dataFixer, new Dynamic((DynamicOps)class07713.N, (Object)class070012), n, n2).getValue();
    }

    public <T> Dynamic<T> N(DataFixer dataFixer, Dynamic<T> dynamic, int n, int n2) {
        return dataFixer.update(this.field_19222, dynamic, n, n2);
    }

    public <T> Dynamic<T> N(DataFixer dataFixer, Dynamic<T> dynamic, int n) {
        return this.N(dataFixer, dynamic, n, class05715.N());
    }

    public <A> Codec<A> N(Codec<A> codec, DataFixer dataFixer, int n) {
        return new class10535(this, codec, n, dataFixer);
    }

    public static int N() {
        return class07529.y().comp_4026().y();
    }

    static {
        field_19223 = class05715.y();
        field_42975 = Set.of(class05715.field_59995.field_19222);
    }
}

