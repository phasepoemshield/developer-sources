/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.engine.controls;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u0007\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u0007\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004\u00a2\u0006\u0004\b\u0017\u0010\u0015J\u0011\u0010\u0018\u001a\u00020\tH\u0096\u0080\u0004\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0002\u0010\u001aR\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u001b\u00a8\u0006\u001c"}, d2={"Lkotakbaz/rain/client/util/render/engine/controls/TextureSampler;", "", "batchKey", "Lkotlin/Function1;", "Lkotakbaz/rain/client/render/main/program/uniform/uniforms/sampler/SamplerUniform;", "", "applier", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "", "textureId", "(I)V", "Lkotakbaz/rain/client/render/texture/GlTex;", "glTex", "(Lkotakbaz/rain/client/render/texture/GlTex;)V", "uniform", "apply", "(Lkotakbaz/rain/client/render/main/program/uniform/uniforms/sampler/SamplerUniform;)V", "key", "", "hasKey", "(Ljava/lang/Object;)Z", "other", "equals", "hashCode", "()I", "Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "rain-visuals"})
public final class A {
    @NotNull
    private final Object a;
    @Nullable
    private final Function1<kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A, Unit> A;
    private static Object[] b;
    private static Object c;
    private static Object[] C;
    private static Object[] B;
    private static Object[] d;
    public static int[] D;

    private A(Object object, Function1<? super kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A, Unit> function1) {
        super();
        this.a = object;
        this.A = function1;
    }

    public A(int n) {
        int n2 = D[0];
        n2 ^= D[1];
        int n3 = D[3];
        n3 += D[4];
        Intrinsics.checkNotNull(n, (String)b[n2 += D[2]] + (String)b[n3 -= D[5]]);
        this(n, arg_0 -> A._init_$lambda$0(n, arg_0));
    }

    public A(@NotNull kotakbaz.rain.client.render.texture.A a2) {
        int n = D[6];
        n += D[7];
        Intrinsics.checkNotNullParameter(a2, (String)b[n -= D[8]]);
        this(a2, arg_0 -> A._init_$lambda$1(a2, arg_0));
    }

    public final void apply(@NotNull kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A a2) {
        block0: {
            int n = D[9];
            n += D[10];
            Intrinsics.checkNotNullParameter(a2, (String)b[n += D[11]]);
            Function1<kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A, Unit> function1 = this.A;
            if (function1 == null) break block0;
            function1.invoke(a2);
        }
    }

    public final boolean hasKey(@NotNull Object object) {
        int n = D[12];
        n ^= D[13];
        Intrinsics.checkNotNullParameter(object, (String)b[n -= D[14]]);
        return Intrinsics.areEqual(this.a, object);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            boolean bl = D[15];
            bl -= D[16];
            return bl += D[17];
        }
        if (!(object instanceof A)) {
            boolean bl = D[18];
            bl += D[19];
            return bl += D[20];
        }
        return Intrinsics.areEqual(this.a, ((A)object).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    private static final Unit _init_$lambda$0(int n, kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A a2) {
        int n2 = D[21];
        n2 ^= D[22];
        Intrinsics.checkNotNullParameter(a2, (String)b[n2 ^= D[23]]);
        a2.set(n);
        return Unit.INSTANCE;
    }

    private static final Unit _init_$lambda$1(kotakbaz.rain.client.render.texture.A a2, kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A a3) {
        int n = D[24];
        n ^= D[25];
        Intrinsics.checkNotNullParameter(a3, (String)b[n ^= D[26]]);
        a3.set(a2);
        return Unit.INSTANCE;
    }

    static {
        kotakbaz.rain.client.util.render.engine.controls.A.b();
        long l = 7419768044363704266L;
        long l2 = -2106174768818242558L;
        long l3 = -2375515696595882492L;
        long l4 = 3727008106390934140L;
        long l5 = 8607124945466792358L;
        long l6 = -1565450073449625116L;
        long l7 = 2168051176990688203L;
        long l8 = 8073889016112888116L;
        long l9 = 791829033733435397L;
        long l10 = -2063347955842381101L;
        long l11 = 2323852252338861201L;
        long l12 = 7997955656277279202L;
        long l13 = -2179925681331686965L;
        long l14 = -6660390819406020395L;
        int n = D[27];
        n -= D[28];
        b = new Object[n ^= D[29]];
        long l15 = l14;
        int n2 = D[30];
        n2 ^= D[31];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 ^= D[32]);
        Object[] objectArray = new Object[D[33]];
        objectArray[kotakbaz.rain.client.util.render.engine.controls.A.D[34]] = B;
        objectArray[kotakbaz.rain.client.util.render.engine.controls.A.D[35]] = D[36];
        int n3 = D[37];
        Object object = kotakbaz.rain.client.util.render.engine.controls.A.A()[D[38]];
        if (object == null) {
            char[] cArray = "\uee61\uee9d\ueec9\uee63\uee59\uee80\uee97\uee5a\uee83\ueeec\ueea9\uee5e\uee95\uee82\uee65\uee84\ueeb2\ueeaf\ueea7\uee7a\ueec8\uee5c\uee7d\ueecf\ueea4\ueeb5\uee61\ueea8\uee5c\uee5b\ueeef\ueeb2\ueee8\uee87\uee7f\uee7b\uee67\ueeae\uee79\uee5c\ueeea\uee58\ueee8\ueeea\uee85\uee86\ueeee\uee7a\uee80\ueeea\ueeee\ueeaa\ueeaf\uee78\ueea1\uee9d\ueea7\ueeaf\ueeea\uee5b\ueeaa\ueeee\ueeee\ueee9\ueeeb\uee7b\uee62\ueeca\ueea4\ueeca\uee83\uee58\ueec8\uee7a\uee82\ueec9\uee5a\uee85\ueeab\uee62\ueecf\uee58\uee7a\uee5f\ueed2\uee59\uee63\uee61\ueeb5\uee7b\ueeac\uee5e\ueec9\uee61\uee79\uee7b\uee78\uee5c\uee95\ueeb2\ueea4\uee5c\uee79\ueec9\ueeb5\ueeb7\ueeaa\uee66\ueeef\ueec8\ueea8\uee84\ueeef\uee61\uee5d\uee7d\ueeee\uee61\ueecb\uee7b\uee67\uee81\uee5c\ueeac\uee81\uee62\uee95\uee79\ueeaf\uee79\uee60\uee65\ueecb\ueecb\ueeaa\uee58\uee5d\ueee9\uee5a\uee81\uee61\uee85\uee64\uee7a\ueeb2\ueea9\ueeaa\ueee8\uee64\uee87\ueef3\ueef3".toCharArray();
            for (int i = D[39]; i < D[40]; ++i) {
                int n4 = cArray[i];
                n4 += D[41];
                n4 -= D[42];
                n4 += D[43];
                n4 -= D[44];
                n4 -= D[45];
                n4 -= D[46];
                n4 ^= D[47];
                n4 -= D[48];
                n4 ^= D[49];
                n4 -= D[50];
                n4 -= D[51];
                n4 += D[52];
                n4 += D[53];
                cArray[i] = (char)(n4 ^= D[54]);
            }
            object = kotakbaz.rain.client.util.render.engine.controls.A.A()[kotakbaz.rain.client.util.render.engine.controls.A.D[55]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.util.render.engine.controls.A.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = D[56];
        n5 += D[57];
        l5 = l16 ^ (0x5000000000L ^ l16) & -1L << (n5 ^= D[58]);
        long l17 = l12;
        int n6 = D[59];
        n6 ^= D[60];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 += D[61]);
        while (true) {
            int n7 = D[62];
            n7 -= D[63];
            if ((int)l12 >= (int)(l5 >>> (n7 += D[64]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = D[65];
            n9 += D[66];
            int n10 = D[68];
            n10 ^= D[69];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= D[67])) & -1L >>> (n10 -= D[70]);
            long l19 = l8;
            int n11 = D[71];
            n11 ^= D[72];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= D[73]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = D[74];
            n13 ^= D[75];
            int n14 = D[77];
            n14 -= D[78];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 += D[76])) & -1L >>> (n14 -= D[79]);
            int n15 = D[80];
            n15 -= D[81];
            long l21 = l9;
            int n16 = D[83];
            n16 ^= D[84];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= D[82]) ^ l21) & -1L << (n16 -= D[85]);
            int n17 = D[86];
            n17 -= D[87];
            n17 ^= D[88];
            int n18 = D[89];
            n18 -= D[90];
            long l22 = l11;
            int n19 = D[92];
            n19 += D[93];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 ^= D[91]))) ^ l22) & -1L >>> (n19 += D[94]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = D[95];
            n20 ^= D[96];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 += D[97]);
            while (true) {
                int n21 = D[98];
                n21 += D[99];
                if ((int)(l13 >>> (n21 -= D[100])) >= (int)l11) break;
                int n22 = D[101];
                n22 -= D[102];
                int n23 = D[104];
                n23 ^= D[105];
                cArray2[(int)(l13 >>> (n22 += kotakbaz.rain.client.util.render.engine.controls.A.D[103]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= D[106]))];
                l13 += 0x100000000L;
            }
            int n24 = D[107];
            n24 -= D[108];
            int n25 = (int)(l14 >>> (n24 ^= D[109]));
            l14 += 0x100000000L;
            kotakbaz.rain.client.util.render.engine.controls.A.b[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = D[110];
            n26 ^= D[111];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 += D[112]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[D[113]];
        String string = (String)object[D[114]];
        object = object[D[115]];
        Object[] objectArray = C;
        if (C == null) {
            objectArray = C = new Object[D[116]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[D[117]];
                B = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[D[119] ^ D[120]];
                byArray[kotakbaz.rain.client.util.render.engine.controls.A.D[121] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[122]] = D[123] ^ D[124];
                byArray[kotakbaz.rain.client.util.render.engine.controls.A.D[125] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[126]] = D[127] ^ D[128];
                byArray[kotakbaz.rain.client.util.render.engine.controls.A.D[129] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[130]] = D[131] ^ D[132];
                byArray[kotakbaz.rain.client.util.render.engine.controls.A.D[133] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[134]] = D[135] ^ D[136];
                byArray[kotakbaz.rain.client.util.render.engine.controls.A.D[137] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[138]] = D[139] ^ D[140];
                byArray[kotakbaz.rain.client.util.render.engine.controls.A.D[141] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[142]] = D[143] ^ D[144];
                byArray[kotakbaz.rain.client.util.render.engine.controls.A.D[145] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[146]] = D[147] ^ D[148];
                byArray[kotakbaz.rain.client.util.render.engine.controls.A.D[149] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[150]] = D[151] ^ D[152];
                byArray[kotakbaz.rain.client.util.render.engine.controls.A.D[153] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[154]] = D[155] ^ D[156];
                byArray[kotakbaz.rain.client.util.render.engine.controls.A.D[157] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[158]] = D[159] ^ D[160];
                byArray[kotakbaz.rain.client.util.render.engine.controls.A.D[161] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[162]] = D[163] ^ D[164];
                byArray[kotakbaz.rain.client.util.render.engine.controls.A.D[165] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[166]] = D[167] ^ D[168];
                byArray[kotakbaz.rain.client.util.render.engine.controls.A.D[169] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[170]] = D[171] ^ D[172];
                byArray[kotakbaz.rain.client.util.render.engine.controls.A.D[173] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[174]] = D[175] ^ D[176];
                byArray[kotakbaz.rain.client.util.render.engine.controls.A.D[177] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[178]] = D[179] ^ D[180];
                byArray[kotakbaz.rain.client.util.render.engine.controls.A.D[181] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[182]] = D[183] ^ D[184];
                objectArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[118]] = byArray;
            }
            byte[] byArray = (byte[])object3[D[185]];
            if (c == null) {
                byte[] byArray2 = new byte[D[186] ^ D[187]];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[188] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[189]] = D[190] ^ D[191];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[192] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[193]] = D[194] ^ D[195];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[196] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[197]] = D[198] ^ D[199];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[200] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[201]] = D[202] ^ D[203];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[204] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[205]] = D[206] ^ D[207];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[208] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[209]] = D[210] ^ D[211];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[212] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[213]] = D[214] ^ D[215];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[216] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[217]] = D[218] ^ D[219];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[220] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[221]] = D[222] ^ D[223];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[224] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[225]] = D[226] ^ D[227];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[228] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[229]] = D[230] ^ D[231];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[232] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[233]] = D[234] ^ D[235];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[236] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[237]] = D[238] ^ D[239];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[240] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[241]] = D[242] ^ D[243];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[244] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[245]] = D[246] ^ D[247];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[248] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[249]] = D[250] ^ D[251];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[252] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[253]] = D[254] ^ D[255];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[256] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[257]] = D[258] ^ D[259];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[260] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[261]] = D[262] ^ D[263];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[264] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[265]] = D[266] ^ D[267];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[268] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[269]] = D[270] ^ D[271];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[272] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[273]] = D[274] ^ D[275];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[276] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[277]] = D[278] ^ D[279];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[280] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[281]] = D[282] ^ D[283];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[284] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[285]] = D[286] ^ D[287];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[288] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[289]] = D[290] ^ D[291];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[292] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[293]] = D[294] ^ D[295];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[296] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[297]] = D[298] ^ D[299];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[300] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[301]] = D[302] ^ D[303];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[304] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[305]] = D[306] ^ D[307];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[308] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[309]] = D[310] ^ D[311];
                byArray2[kotakbaz.rain.client.util.render.engine.controls.A.D[312] ^ kotakbaz.rain.client.util.render.engine.controls.A.D[313]] = D[314] ^ D[315];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, D[316], byArray3, D[317], byArray.length);
                System.arraycopy(byArray2, D[318], byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.util.render.engine.controls.A.A()[D[319]];
                if (object4 == null) {
                    char[] cArray = "\u945b\u9441\u9458\u9437\u943d\u9431\u944c\u9462\u92e7\u9463\u9443\u92ee\u92ea\u9460\u9450\u9443\u944a\u943a".toCharArray();
                    for (int i = D[320]; i < D[321]; ++i) {
                        int n2 = cArray[i];
                        n2 -= D[322];
                        n2 -= D[323];
                        n2 ^= D[324];
                        n2 -= D[325];
                        n2 += D[326];
                        n2 -= D[327];
                        n2 ^= D[328];
                        n2 += D[329];
                        n2 += D[330];
                        cArray[i] = (char)(n2 -= D[331]);
                    }
                    object4 = kotakbaz.rain.client.util.render.engine.controls.A.A()[kotakbaz.rain.client.util.render.engine.controls.A.D[332]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[D[333]];
                byArray4[kotakbaz.rain.client.util.render.engine.controls.A.D[334]] = D[335];
                byArray4[kotakbaz.rain.client.util.render.engine.controls.A.D[336]] = D[337];
                byArray4[kotakbaz.rain.client.util.render.engine.controls.A.D[338]] = D[339];
                byArray4[kotakbaz.rain.client.util.render.engine.controls.A.D[340]] = D[341];
                byArray4[kotakbaz.rain.client.util.render.engine.controls.A.D[342]] = D[343];
                byArray4[kotakbaz.rain.client.util.render.engine.controls.A.D[344]] = D[345];
                byArray4[kotakbaz.rain.client.util.render.engine.controls.A.D[346]] = D[347];
                byArray4[kotakbaz.rain.client.util.render.engine.controls.A.D[348]] = D[349];
                byArray4[kotakbaz.rain.client.util.render.engine.controls.A.D[350]] = D[351];
                byArray4[kotakbaz.rain.client.util.render.engine.controls.A.D[352]] = D[353];
                byArray4[kotakbaz.rain.client.util.render.engine.controls.A.D[354]] = D[355];
                byArray4[kotakbaz.rain.client.util.render.engine.controls.A.D[356]] = D[357];
                byArray4[kotakbaz.rain.client.util.render.engine.controls.A.D[358]] = D[359];
                byArray4[kotakbaz.rain.client.util.render.engine.controls.A.D[360]] = D[361];
                byArray4[kotakbaz.rain.client.util.render.engine.controls.A.D[362]] = D[363];
                byArray4[kotakbaz.rain.client.util.render.engine.controls.A.D[364]] = D[365];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, D[366], D[367]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.util.render.engine.controls.A.A()[D[368]];
                if (object5 == null) {
                    char[] cArray = "\uaa84\uaad0\uabf6".toCharArray();
                    for (int i = D[369]; i < D[370]; ++i) {
                        int n3 = cArray[i];
                        n3 ^= D[371];
                        n3 ^= D[372];
                        n3 -= D[373];
                        n3 += D[374];
                        n3 ^= D[375];
                        n3 ^= D[376];
                        n3 += D[377];
                        n3 += D[378];
                        n3 += D[379];
                        n3 ^= D[380];
                        n3 -= D[381];
                        cArray[i] = (char)(n3 ^= D[382]);
                    }
                    object5 = kotakbaz.rain.client.util.render.engine.controls.A.A()[kotakbaz.rain.client.util.render.engine.controls.A.D[383]] = new String(cArray);
                }
                c = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, D[384], D[385]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, D[386], byArray6.length);
            Object object6 = kotakbaz.rain.client.util.render.engine.controls.A.A()[D[387]];
            if (object6 == null) {
                char[] cArray = "\u3f37\u3f3b\u3ec5\u3c91\u3f35\u3f34\u3f35\u3c91\u3ec6\u3ecd\u3f35\u3ec5\u3cab\u3ec6\u3ed7\u3eda\u3eda\u3eef\u3ed0\u3ed9".toCharArray();
                for (int i = D[388]; i < D[389]; ++i) {
                    int n4 = cArray[i];
                    n4 ^= D[390];
                    n4 += D[391];
                    n4 -= D[392];
                    n4 -= D[393];
                    n4 += D[394];
                    n4 ^= D[395];
                    n4 ^= D[396];
                    n4 ^= D[397];
                    n4 += D[398];
                    n4 -= D[399];
                    n4 -= 60755;
                    n4 -= 23704;
                    n4 += 9913;
                    n4 ^= 0xA53A;
                    cArray[i] = (char)(n4 ^= 0xC07E);
                }
                object6 = kotakbaz.rain.client.util.render.engine.controls.A.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)c), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = d;
        if (d == null) {
            d = new Object[4];
            objectArray = d;
        }
        return objectArray;
    }

    public static void b() {
        D = new int[0x51BF ^ 0x502F];
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x9755 ^ 0x97DD] = 0x31D7 ^ 0x97DD;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x8424 ^ 0x8415] = 0x8007 ^ 0x8415;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x76E1 ^ 0x76A2] = 0x76C5 ^ 0x76A2;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xFD0E ^ 0xFD6E] = 0xFD6C ^ 0xFD6E;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x78D3 ^ 0x799D] = 0x7999 ^ 0x799D;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x6ED7 ^ 0x6F9C] = 0xDDA1 ^ 0x6F9C;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xB77 ^ 0xBB7] = 0x30CE ^ 0xBB7;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x522B ^ 0x53A1] = 0x442C ^ 0x53A1;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xB302 ^ 0xB31E] = 0xFFFF4CA1 ^ 0xB31E;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x10A5E ^ 0x10AC1] = 0x1E28B ^ 0x10AC1;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x6902 ^ 0x6924] = 0x6924 ^ 0x6924;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x4961 ^ 0x4862] = 0x6A5B ^ 0x4862;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xA83E ^ 0xA832] = 0xA849 ^ 0xA832;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x2B4C ^ 0x2BC5] = 0x109E ^ 0x2BC5;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x6C4C ^ 0x6C0C] = 0x6C64 ^ 0x6C0C;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xAE68 ^ 0xAE8F] = 0x1AAED ^ 0xAE8F;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x94C2 ^ 0x94EC] = 0xCD22 ^ 0x94EC;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xDDFC ^ 0xDCFE] = 0xFFFF016C ^ 0xDCFE;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xDF1 ^ 0xDD9] = 0xD41 ^ 0xDD9;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x3C3 ^ 0x385] = 0x3D6 ^ 0x385;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x9A00 ^ 0x9B29] = 0x65FC ^ 0x9B29;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x5995 ^ 0x58C4] = 0xFFFFA749 ^ 0x58C4;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xD224 ^ 0xD31B] = 0xD31A ^ 0xD31B;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x6FA9 ^ 0x6FD1] = 0xB06 ^ 0x6FD1;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x7672 ^ 0x7681] = 0x17A57 ^ 0x7681;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x8333 ^ 0x826F] = 0x8261 ^ 0x826F;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x9DAC ^ 0x9CDC] = 0x9CDE ^ 0x9CDC;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x76B4 ^ 0x77D3] = 0x77F2 ^ 0x77D3;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xFBE6 ^ 0xFB2F] = 0x27D0 ^ 0xFB2F;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xE230 ^ 0xE257] = 0xFFFF1DF2 ^ 0xE257;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xEA ^ 0x1A2] = 0x71A8 ^ 0x1A2;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x9C5D ^ 0x9C3C] = 0x9C3A ^ 0x9C3C;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xFB93 ^ 0xFB6B] = 0xCC ^ 0xFB6B;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xD1A9 ^ 0xD0BE] = 0xE15A ^ 0xD0BE;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xF06E ^ 0xF14E] = 0xA1ED ^ 0xF14E;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x495F ^ 0x4806] = 0xFFFFB7B0 ^ 0x4806;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xE8FA ^ 0xE825] = 0x122E ^ 0xE825;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x2374 ^ 0x2374] = 0x233D ^ 0x2374;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x14F6 ^ 0x15A4] = 0x15A1 ^ 0x15A4;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xEFE3 ^ 0xEEA6] = 0xECA3 ^ 0xEEA6;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x5C8 ^ 0x5D7] = 0xFFFFFA13 ^ 0x5D7;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xDAEF ^ 0xDB9A] = 0xDB49 ^ 0xDB9A;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x6CDA ^ 0x6CDF] = 0xFFFF930A ^ 0x6CDF;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x696A ^ 0x698E] = 0x16DE4 ^ 0x698E;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xABB ^ 0xBA7] = 0x7586 ^ 0xBA7;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x30D7 ^ 0x30F3] = 0x30F3 ^ 0x30F3;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x20E8 ^ 0x20FA] = 0xFFFFDF5C ^ 0x20FA;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xDCC9 ^ 0xDC93] = 0xDCFB ^ 0xDC93;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x38DA ^ 0x399B] = 0x3989 ^ 0x399B;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x5EBD ^ 0x5EA6] = 0xFFFFA199 ^ 0x5EA6;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x5FA1 ^ 0x5F74] = 0x8221 ^ 0x5F74;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x6AC1 ^ 0x6B43] = 0x6B53 ^ 0x6B43;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x256D ^ 0x2593] = 0xFFFF14EA ^ 0x2593;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x1844 ^ 0x19CF] = 0x8A40 ^ 0x19CF;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x6BE2 ^ 0x6B2A] = 0xB7C1 ^ 0x6B2A;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x3ABA ^ 0x3A06] = 0x5BF0 ^ 0x3A06;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xE2F1 ^ 0xE3E9] = 0x1B39 ^ 0xE3E9;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x5850 ^ 0x597D] = 0x3CD7 ^ 0x597D;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x5BD7 ^ 0x5BA0] = 0x3F67 ^ 0x5BA0;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x1C5A ^ 0x1DD7] = 0x5B66 ^ 0x1DD7;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x92BF ^ 0x9249] = 0xA6E2 ^ 0x9249;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x94C3 ^ 0x95E4] = 0x4F5B ^ 0x95E4;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xAB73 ^ 0xAA42] = 0xABEF ^ 0xAA42;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x9684 ^ 0x96C0] = 0x96B1 ^ 0x96C0;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x1F7E ^ 0x1F8E] = 0x11356 ^ 0x1F8E;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x6665 ^ 0x6668] = 0x666D ^ 0x6668;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xBBAB ^ 0xBAB2] = 0x4279 ^ 0xBAB2;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x4421 ^ 0x44CA] = 0x646C ^ 0x44CA;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x92CB ^ 0x9389] = 0x6759 ^ 0x9389;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xB7D4 ^ 0xB737] = 0x95CE ^ 0xB737;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x21E9 ^ 0x21B7] = 0xFFFFDE75 ^ 0x21B7;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x2B62 ^ 0x2BBB] = 0x125F ^ 0x2BBB;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xDCC4 ^ 0xDCB5] = 0xDCB4 ^ 0xDCB5;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x77B0 ^ 0x7775] = 0x17A90 ^ 0x7775;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xA505 ^ 0xA50E] = 0xA549 ^ 0xA50E;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x6000 ^ 0x60B2] = 0x1D2C ^ 0x60B2;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xADEF ^ 0xACF4] = 0x543F ^ 0xACF4;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x7366 ^ 0x73B6] = 0x2B59 ^ 0x73B6;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x10240 ^ 0x1034F] = 0x1C586 ^ 0x1034F;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xA842 ^ 0xA94E] = 0x6F98 ^ 0xA94E;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x3570 ^ 0x3437] = 0xBECF ^ 0x3437;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x88B1 ^ 0x8876] = 0x18593 ^ 0x8876;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x468B ^ 0x46A7] = 0xA983 ^ 0x46A7;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x5B56 ^ 0x5B2F] = 0xCC69 ^ 0x5B2F;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xFA6E ^ 0xFAF6] = 0x58E7 ^ 0xFAF6;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x89D4 ^ 0x8892] = 0x135 ^ 0x8892;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xF02D ^ 0xF157] = 0x39AD ^ 0xF157;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x75C3 ^ 0x7525] = 0x17163 ^ 0x7525;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x2963 ^ 0x2950] = 0x3D23 ^ 0x2950;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xE199 ^ 0xE0C3] = 0xE0C4 ^ 0xE0C3;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xEBED ^ 0xEBFE] = 0xEB84 ^ 0xEBFE;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x7E71 ^ 0x7E2D] = 0x7E59 ^ 0x7E2D;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x63DD ^ 0x63F6] = 0xB052 ^ 0x63F6;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xAB48 ^ 0xAB21] = 0xFFFF54DC ^ 0xAB21;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x4D57 ^ 0x4CD8] = 0x6CCA ^ 0x4CD8;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xBA21 ^ 0xBAB0] = 0x63A8 ^ 0xBAB0;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xB277 ^ 0xB304] = 0x63C6 ^ 0xB304;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x442B ^ 0x453E] = 0x74DA ^ 0x453E;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x409A ^ 0x40C3] = 0x4075 ^ 0x40C3;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x100E2 ^ 0x101A8] = 0x19AB5 ^ 0x101A8;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xE1F1 ^ 0xE147] = 0x36C2 ^ 0xE147;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x10C7B ^ 0x10CA6] = 0x1F6AD ^ 0x10CA6;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x9D4A ^ 0x9C34] = 0xE758 ^ 0x9C34;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xF9B3 ^ 0xF90E] = 0x98F8 ^ 0xF90E;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xDC1D ^ 0xDD52] = 0xFFFF2296 ^ 0xDD52;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xC478 ^ 0xC4F7] = 0xFFFF5E04 ^ 0xC4F7;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x2D4B ^ 0x2C4F] = 0x682E ^ 0x2C4F;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x9697 ^ 0x9604] = 0xFFFFB0FD ^ 0x9604;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xD3DD ^ 0xD36E] = 0xFFFF517B ^ 0xD36E;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x3E52 ^ 0x3E04] = 0x3E07 ^ 0x3E04;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xFAF6 ^ 0xFA41] = 0xFFFFD217 ^ 0xFA41;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x6E11 ^ 0x6E5B] = 0x6E66 ^ 0x6E5B;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x5AD8 ^ 0x5A12] = 0xFFFF7903 ^ 0x5A12;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x14F7 ^ 0x14D7] = 0x14F9 ^ 0x14D7;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x51A2 ^ 0x5081] = 0x26 ^ 0x5081;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x3A9C ^ 0x3ABF] = 0x3ABE ^ 0x3ABF;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xA63 ^ 0xB6D] = 0xFFFF3232 ^ 0xB6D;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x7FC4 ^ 0x7F48] = 0x4410 ^ 0x7F48;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x45F0 ^ 0x45B9] = 0x458E ^ 0x45B9;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xBB47 ^ 0xBAC4] = 0xBAC7 ^ 0xBAC4;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xE00A ^ 0xE074] = 0xF017 ^ 0xE074;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xC87D ^ 0xC80B] = 0xC80B ^ 0xC80B;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xDABA ^ 0xDBC2] = 0x87D4 ^ 0xDBC2;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x9671 ^ 0x961B] = 0xFFFF69F1 ^ 0x961B;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x159F ^ 0x1566] = 0xEEC2 ^ 0x1566;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xCF57 ^ 0xCF5F] = 0xCF45 ^ 0xCF5F;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x4333 ^ 0x43C9] = 0xB813 ^ 0x43C9;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x68F8 ^ 0x69F8] = 0x4BDB ^ 0x69F8;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xAC5E ^ 0xAC85] = 0x9561 ^ 0xAC85;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xDEBF ^ 0xDEA1] = 0xFFFF216B ^ 0xDEA1;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xCD09 ^ 0xCC61] = 0xCC60 ^ 0xCC61;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xBC24 ^ 0xBC66] = 0xFFFF43FB ^ 0xBC66;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xA5E3 ^ 0xA4D8] = 0x1FD0 ^ 0xA4D8;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x127E ^ 0x1232] = 0x1248 ^ 0x1232;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x167D ^ 0x163C] = 0x16F7 ^ 0x163C;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x648 ^ 0x696] = 0xFCEF ^ 0x696;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xD828 ^ 0xD929] = 0xFB10 ^ 0xD929;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xA0FB ^ 0xA006] = 0x6EBD ^ 0xA006;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x105D1 ^ 0x10482] = 0xFFFEFB16 ^ 0x10482;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x67E4 ^ 0x674A] = 0x292 ^ 0x674A;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xFD3B ^ 0xFC30] = 0x1FF57 ^ 0xFC30;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xC34F ^ 0xC346] = 0xFFFF3C3E ^ 0xC346;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xC74E ^ 0xC61E] = 0xC615 ^ 0xC61E;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xDC05 ^ 0xDCEC] = 0xFC4A ^ 0xDCEC;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x9D78 ^ 0x9C05] = 0xE749 ^ 0x9C05;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x8912 ^ 0x89F2] = 0xAB1C ^ 0x89F2;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xCDB7 ^ 0xCC87] = 0xCD2C ^ 0xCC87;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x7C76 ^ 0x7DF3] = 0x7DE7 ^ 0x7DF3;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xA2CA ^ 0xA39F] = 0xFFFF5C29 ^ 0xA39F;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xE65C ^ 0xE723] = 0xE721 ^ 0xE723;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x86B ^ 0x91A] = 0x91A ^ 0x91A;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x3531 ^ 0x3437] = 0xFFFF8FA5 ^ 0x3437;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xC531 ^ 0xC5FE] = 0x90A2 ^ 0xC5FE;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xF66D ^ 0xF6EB] = 0x50E1 ^ 0xF6EB;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xB6BE ^ 0xB73E] = 0xB73E ^ 0xB73E;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x8F22 ^ 0x8E32] = 0x2DE ^ 0x8E32;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xF567 ^ 0xF473] = 0xC581 ^ 0xF473;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xB98A ^ 0xB8C7] = 0xB8D7 ^ 0xB8C7;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x738D ^ 0x72E9] = 0x72E0 ^ 0x72E9;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xAD39 ^ 0xAD9F] = 0x1ADFC ^ 0xAD9F;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xF7BC ^ 0xF7E4] = 0xF7F9 ^ 0xF7E4;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xD8C2 ^ 0xD87A] = 0xFFF ^ 0xD87A;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xE263 ^ 0xE21C] = 0xFFFF0DBE ^ 0xE21C;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xF927 ^ 0xF919] = 0xFFFF06E7 ^ 0xF919;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x2806 ^ 0x2829] = 0xE1C6 ^ 0x2829;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xC13 ^ 0xC27] = 0xB812 ^ 0xC27;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xFAFF ^ 0xFAE8] = 0xFFFF0542 ^ 0xFAE8;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x492C ^ 0x49FB] = 0x94AE ^ 0x49FB;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xFA30 ^ 0xFA02] = 0xF890 ^ 0xFA02;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x858A ^ 0x84EA] = 0x84E8 ^ 0x84EA;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x73BA ^ 0x73A3] = 0x73A6 ^ 0x73A3;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xCA1 ^ 0xCFA] = 0xC94 ^ 0xCFA;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x2D86 ^ 0x2DF6] = 0xFFFFD224 ^ 0x2DF6;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xFC2B ^ 0xFD31] = 0x58E ^ 0xFD31;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x8307 ^ 0x83AE] = 0x72F7 ^ 0x83AE;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x4263 ^ 0x4226] = 0x4224 ^ 0x4226;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xAC87 ^ 0xADB4] = 0xAC19 ^ 0xADB4;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xA935 ^ 0xA841] = 0x89B2 ^ 0xA841;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xEB0F ^ 0xEA50] = 0xEA7D ^ 0xEA50;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xF1AB ^ 0xF1F9] = 0xFFFF0E55 ^ 0xF1F9;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xD420 ^ 0xD415] = 0xE8C8 ^ 0xD415;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xF521 ^ 0xF51A] = 0xFFFF0A88 ^ 0xF51A;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xE493 ^ 0xE4FD] = 0xFFFF1B7A ^ 0xE4FD;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xC06 ^ 0xCBC] = 0x8BD5 ^ 0xCBC;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x821C ^ 0x8280] = 0xC1D3 ^ 0x8280;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x4012 ^ 0x4035] = 0x4035 ^ 0x4035;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x3C96 ^ 0x3CCB] = 0xFFFFC321 ^ 0x3CCB;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xEDA1 ^ 0xED11] = 0x88C9 ^ 0xED11;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xA343 ^ 0xA3A9] = 0xFFFF7C96 ^ 0xA3A9;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xAE18 ^ 0xAF79] = 0xAF5E ^ 0xAF79;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x6545 ^ 0x647B] = 0x647B ^ 0x647B;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xE563 ^ 0xE530] = 0xFFFF1A94 ^ 0xE530;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x20F4 ^ 0x20C8] = 0xFFFFDF67 ^ 0x20C8;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x8DD0 ^ 0x8D55] = 0x2B5D ^ 0x8D55;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xD4D4 ^ 0xD44D] = 0x9716 ^ 0xD44D;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xB2F9 ^ 0xB28D] = 0xB28C ^ 0xB28D;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x6309 ^ 0x6285] = 0xFEB4 ^ 0x6285;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x927B ^ 0x9246] = 0xFFFF6DA5 ^ 0x9246;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x18A4 ^ 0x1990] = 0xF890 ^ 0x1990;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xE773 ^ 0xE679] = 0x1E549 ^ 0xE679;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xDC55 ^ 0xDCA0] = 0xE844 ^ 0xDCA0;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x9D25 ^ 0x9C33] = 0xFFFF5222 ^ 0x9C33;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x19BC ^ 0x1954] = 0x39E1 ^ 0x1954;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x46C9 ^ 0x47F5] = 0x47F5 ^ 0x47F5;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xBD23 ^ 0xBDDF] = 0x737D ^ 0xBDDF;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xF290 ^ 0xF3B4] = 0x290E ^ 0xF3B4;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xEB1C ^ 0xEBCF] = 0xB335 ^ 0xEBCF;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x2597 ^ 0x2563] = 0x118D ^ 0x2563;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x7305 ^ 0x7342] = 0x7341 ^ 0x7342;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x6CA9 ^ 0x6DD0] = 0xB818 ^ 0x6DD0;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x5DF6 ^ 0x5DCF] = 0x5DBF ^ 0x5DCF;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x8A79 ^ 0x8B40] = 0x3048 ^ 0x8B40;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x2057 ^ 0x2003] = 0xFFFFDFEE ^ 0x2003;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x68D7 ^ 0x69B5] = 0x69BF ^ 0x69B5;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x3966 ^ 0x3969] = 0xFFFFC6EF ^ 0x3969;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x10209 ^ 0x10294] = 0x1EAD5 ^ 0x10294;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x5D54 ^ 0x5C3B] = 0x5D3B ^ 0x5C3B;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x9618 ^ 0x9709] = 0x1BEA ^ 0x9709;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x158E ^ 0x15E2] = 0x15A3 ^ 0x15E2;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xE147 ^ 0xE1CC] = 0xFFFF2523 ^ 0xE1CC;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x75C3 ^ 0x7547] = 0x827B ^ 0x7547;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x154F ^ 0x140F] = 0x140F ^ 0x140F;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x8EA0 ^ 0x8E96] = 0xBA88 ^ 0x8E96;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x855C ^ 0x85D1] = 0xE0C7 ^ 0x85D1;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x7A7C ^ 0x7A9D] = 0x5864 ^ 0x7A9D;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x12D4 ^ 0x12BB] = 0xFFFFED72 ^ 0x12BB;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x9FF2 ^ 0x9FD0] = 0x9FD0 ^ 0x9FD0;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xA827 ^ 0xA938] = 0xD709 ^ 0xA938;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xC3E3 ^ 0xC3B2] = 0xC383 ^ 0xC3B2;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x573 ^ 0x5E8] = 0x46A4 ^ 0x5E8;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xD5A1 ^ 0xD5A2] = 0xFFFF2AD5 ^ 0xD5A2;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x2890 ^ 0x287D] = 0x95AA ^ 0x287D;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xADCB ^ 0xACE4] = 0xC94E ^ 0xACE4;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x8473 ^ 0x8477] = 0x8415 ^ 0x8477;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x7091 ^ 0x7034] = 0x17056 ^ 0x7034;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xD3C ^ 0xDFD] = 0x3685 ^ 0xDFD;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x10C45 ^ 0x10DC4] = 0x10DD4 ^ 0x10DC4;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xE85F ^ 0xE94C] = 0x65AF ^ 0xE94C;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x4C3 ^ 0x463] = 0xEC28 ^ 0x463;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x3FE1 ^ 0x3F5F] = 0x5EC5 ^ 0x3F5F;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xF725 ^ 0xF7E7] = 0xFFFF3314 ^ 0xF7E7;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x7787 ^ 0x76D1] = 0x76D7 ^ 0x76D1;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x10DAB ^ 0x10D07] = 0x1FC5E ^ 0x10D07;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x9B76 ^ 0x9BD4] = 0xFFB9 ^ 0x9BD4;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xB061 ^ 0xB10C] = 0xB170 ^ 0xB10C;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x1270 ^ 0x131B] = 0x131B ^ 0x131B;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xDC3E ^ 0xDCB4] = 0xE7EC ^ 0xDCB4;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xC8FA ^ 0xC9DC] = 0x1358 ^ 0xC9DC;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x7A7E ^ 0x7B73] = 0xBDBA ^ 0x7B73;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x4468 ^ 0x456D] = 0x11D ^ 0x456D;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x813F ^ 0x813D] = 0xFFFF7EDA ^ 0x813D;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x7C3 ^ 0x7EA] = 0x8D6A ^ 0x7EA;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x819A ^ 0x8121] = 0x668 ^ 0x8121;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xAA3D ^ 0xAAA7] = 0xE9F4 ^ 0xAAA7;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xD18A ^ 0xD190] = 0xFFFF2E00 ^ 0xD190;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xDE74 ^ 0xDE83] = 0xEA67 ^ 0xDE83;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x60A6 ^ 0x61C3] = 0x61EC ^ 0x61C3;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x28CC ^ 0x284B] = 0xFFFF71CB ^ 0x284B;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xE5AE ^ 0xE52F] = 0x121F ^ 0xE52F;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xC1C7 ^ 0xC1BB] = 0x56F2 ^ 0xC1BB;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x5B32 ^ 0x5A18] = 0xFFFF5B0E ^ 0x5A18;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x67E0 ^ 0x6712] = 0x16B81 ^ 0x6712;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x51C ^ 0x5CA] = 0xD8C4 ^ 0x5CA;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xEC15 ^ 0xECBD] = 0x1ECDE ^ 0xECBD;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xAC23 ^ 0xAD7D] = 0xAD7E ^ 0xAD7D;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x6870 ^ 0x6927] = 0x6914 ^ 0x6927;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x4F04 ^ 0x4FF5] = 0x14323 ^ 0x4FF5;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x54EC ^ 0x559B] = 0x1E1E ^ 0x559B;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xBE69 ^ 0xBE04] = 0xFFFF41F4 ^ 0xBE04;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x1A09 ^ 0x1A28] = 0x1A2B ^ 0x1A28;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xCB5F ^ 0xCB7A] = 0xCB78 ^ 0xCB7A;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xAC5E ^ 0xAD7F] = 0xFDD8 ^ 0xAD7F;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x10A57 ^ 0x10AB9] = 0xFFFE48BC ^ 0x10AB9;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x6B82 ^ 0x6A04] = 0xBC5 ^ 0x6A04;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x99CA ^ 0x99AF] = 0x990D ^ 0x99AF;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xABA8 ^ 0xAA84] = 0xCF32 ^ 0xAA84;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x7D81 ^ 0x7CB4] = 0x9DA6 ^ 0x7CB4;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x2E06 ^ 0x2EB9] = 0x4F4F ^ 0x2EB9;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x36F0 ^ 0x3698] = 0xFFFFC96F ^ 0x3698;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x3EF2 ^ 0x3EC5] = 0x3EC5 ^ 0x3EC5;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x1C7F ^ 0x1D45] = 0xA666 ^ 0x1D45;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x10401 ^ 0x1052F] = 0xFFFE9F71 ^ 0x1052F;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x1393 ^ 0x1307] = 0xCA11 ^ 0x1307;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xCF7B ^ 0xCE4D] = 0x2F09 ^ 0xCE4D;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x10D7F ^ 0x10D05] = 0x19A4C ^ 0x10D05;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x9EA8 ^ 0x9F83] = 0x6156 ^ 0x9F83;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x10838 ^ 0x108D4] = 0x1B501 ^ 0x108D4;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x30AB ^ 0x30CF] = 0x30E3 ^ 0x30CF;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xA76F ^ 0xA667] = 0x1A51E ^ 0xA667;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xBFA8 ^ 0xBFDD] = 0xBFDC ^ 0xBFDD;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xC962 ^ 0xC855] = 0x2947 ^ 0xC855;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x47C3 ^ 0x47C2] = 0x4794 ^ 0x47C2;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xD18F ^ 0xD19E] = 0xD1D6 ^ 0xD19E;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xEBC0 ^ 0xEAA3] = 0xEAA6 ^ 0xEAA3;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xFEB7 ^ 0xFE65] = 0xA6DB ^ 0xFE65;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x3B9D ^ 0x3B9A] = 0x3BC8 ^ 0x3B9A;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x5D52 ^ 0x5D9C] = 0xFFFFF73C ^ 0x5D9C;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x8B09 ^ 0x8BD8] = 0xD322 ^ 0x8BD8;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x82B1 ^ 0x826D] = 0x786B ^ 0x826D;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x564 ^ 0x463] = 0x4013 ^ 0x463;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x92A6 ^ 0x9272] = 0x4F20 ^ 0x9272;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x1530 ^ 0x1567] = 0xFFFFEA91 ^ 0x1567;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xAA ^ 0x6C] = 0xFFFEF263 ^ 0x6C;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x3E82 ^ 0x3FEE] = 0x3FEE ^ 0x3FEE;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xE542 ^ 0xE4CA] = 0x7E43 ^ 0xE4CA;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x56C6 ^ 0x56D0] = 0xFFFFA91D ^ 0x56D0;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x2882 ^ 0x28B2] = 0xD482 ^ 0x28B2;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x651C ^ 0x65BB] = 0x165F0 ^ 0x65BB;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xD4CD ^ 0xD45D] = 0xB14E ^ 0xD45D;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x1DC8 ^ 0x1DD5] = 0xFFFFE252 ^ 0x1DD5;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x549F ^ 0x543E] = 0x305E ^ 0x543E;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x21A2 ^ 0x21A8] = 0x21EA ^ 0x21A8;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x873B ^ 0x87B8] = 0xFFFF8F6B ^ 0x87B8;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x7FA3 ^ 0x7EE0] = 0xE734 ^ 0x7EE0;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x1AF6 ^ 0x1BB2] = 0x8EF7 ^ 0x1BB2;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xA4DD ^ 0xA45D] = 0xB43E ^ 0xA45D;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x9F28 ^ 0x9F53] = 0x84C ^ 0x9F53;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x66D0 ^ 0x6642] = 0xBF54 ^ 0x6642;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xAA18 ^ 0xAA55] = 0xFFFF55D3 ^ 0xAA55;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xB2A ^ 0xB2C] = 0xFFFFF4E4 ^ 0xB2C;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xFD9C ^ 0xFD57] = 0x21A8 ^ 0xFD57;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xF2F ^ 0xF44] = 0xF55 ^ 0xF44;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x8888 ^ 0x89FA] = 0x89F9 ^ 0x89FA;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x8BF4 ^ 0x8A88] = 0xA7F3 ^ 0x8A88;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x921D ^ 0x92A9] = 0xEF37 ^ 0x92A9;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x56BA ^ 0x56E5] = 0x56FD ^ 0x56E5;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x4730 ^ 0x4724] = 0xFFFFB8C4 ^ 0x4724;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x827E ^ 0x8356] = 0x7D9B ^ 0x8356;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x10708 ^ 0x1079E] = 0x1A58F ^ 0x1079E;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x9647 ^ 0x9765] = 0xFFFF3853 ^ 0x9765;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xF951 ^ 0xF99C] = 0xACC0 ^ 0xF99C;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x10EBC ^ 0x10E17] = 0x1FF37 ^ 0x10E17;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xADF7 ^ 0xAD2D] = 0x94F0 ^ 0xAD2D;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xCD46 ^ 0xCC7B] = 0xCC7B ^ 0xCC7B;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x5B98 ^ 0x5AFE] = 0x5AF1 ^ 0x5AFE;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x9124 ^ 0x9134] = 0xFFFF6EF9 ^ 0x9134;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xFF79 ^ 0xFE0F] = 0xFD4C ^ 0xFE0F;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xFA5D ^ 0xFB26] = 0x9AC ^ 0xFB26;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xFC6D ^ 0xFDE9] = 0xFDE9 ^ 0xFDE9;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x789 ^ 0x6E3] = 0x6EE ^ 0x6E3;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xD2F0 ^ 0xD2E8] = 0xFFFF2D78 ^ 0xD2E8;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xFFB0 ^ 0xFFD2] = 0xFFB5 ^ 0xFFD2;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xDD7D ^ 0xDD68] = 0xDD0D ^ 0xDD68;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xF06C ^ 0xF171] = 0x8F40 ^ 0xF171;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xE515 ^ 0xE448] = 0xFFFF1BDB ^ 0xE448;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xDE0F ^ 0xDEA2] = 0xBB7D ^ 0xDEA2;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x130B ^ 0x1368] = 0xFFFFEC8D ^ 0x1368;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x1C91 ^ 0x1CDE] = 0xFFFFE31F ^ 0x1CDE;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xF822 ^ 0xF96E] = 0xF96F ^ 0xF96E;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x10BC7 ^ 0x10B22] = 0xF40 ^ 0x10B22;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x10E45 ^ 0x10EE6] = 0x16A9A ^ 0x10EE6;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x8E3B ^ 0x8F1E] = 0x55A1 ^ 0x8F1E;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x8B25 ^ 0x8AA2] = 0xDF44 ^ 0x8AA2;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xCC86 ^ 0xCCB9] = 0xCCFF ^ 0xCCB9;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x2581 ^ 0x25AC] = 0x636B ^ 0x25AC;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xA514 ^ 0xA59A] = 0xC089 ^ 0xA59A;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xDF8A ^ 0xDF68] = 0xFFFF023B ^ 0xDF68;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x2F6D ^ 0x2FC9] = 0x4BA4 ^ 0x2FC9;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xF238 ^ 0xF3B6] = 0x827 ^ 0xF3B6;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x7D41 ^ 0x7DDF] = 0x9594 ^ 0x7DDF;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xA8DE ^ 0xA831] = 0x15E6 ^ 0xA831;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xF895 ^ 0xF8F3] = 0xF8D4 ^ 0xF8F3;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xA4D2 ^ 0xA445] = 0xFFFFF9A4 ^ 0xA445;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xE889 ^ 0xE876] = 0x26CD ^ 0xE876;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x4AAF ^ 0x4A6B] = 0x14793 ^ 0x4A6B;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xD274 ^ 0xD2C5] = 0xAF5D ^ 0xD2C5;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x8882 ^ 0x8990] = 0x54A ^ 0x8990;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x7F86 ^ 0x7EEF] = 0xFFFF8155 ^ 0x7EEF;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x3D2F ^ 0x3D05] = 0x1486 ^ 0x3D05;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xE22B ^ 0xE27B] = 0xFFFF1DC6 ^ 0xE27B;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x8F85 ^ 0x8F07] = 0x783B ^ 0x8F07;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x2A87 ^ 0x2ABF] = 0xFFFFD555 ^ 0x2ABF;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xAA7D ^ 0xAAB1] = 0xFFE4 ^ 0xAAB1;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x8F46 ^ 0x8F13] = 0x8F3A ^ 0x8F13;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xFEF7 ^ 0xFFFE] = 0x1FC99 ^ 0xFFFE;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x69AE ^ 0x6917] = 0x6917 ^ 0x6917;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x8EDF ^ 0x8F96] = 0x964C ^ 0x8F96;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xD0CD ^ 0xD1D3] = 0xAFF1 ^ 0xD1D3;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x5CAE ^ 0x5D9C] = 0x5C0B ^ 0x5D9C;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x8E1C ^ 0x8F44] = 0x8F4C ^ 0x8F44;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xBD2B ^ 0xBD65] = 0xFFFF42C0 ^ 0xBD65;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x5A87 ^ 0x5A28] = 0x3F8D ^ 0x5A28;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xB095 ^ 0xB0AF] = 0xB0D5 ^ 0xB0AF;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xAB78 ^ 0xAB0A] = 0xAB08 ^ 0xAB0A;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xB0AC ^ 0xB1C2] = 0xB1D8 ^ 0xB1C2;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x5DB4 ^ 0x5D6C] = 0x6484 ^ 0x5D6C;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x7A21 ^ 0x7A94] = 0xAD18 ^ 0x7A94;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x10945 ^ 0x109BE] = 0x1F21A ^ 0x109BE;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x83BE ^ 0x83CD] = 0x83CD ^ 0x83CD;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x7E6B ^ 0x7F30] = 0x7F34 ^ 0x7F30;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xD315 ^ 0xD3BF] = 0x22E6 ^ 0xD3BF;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xEF12 ^ 0xEF6F] = 0xFF08 ^ 0xEF6F;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x4679 ^ 0x4631] = 0x4665 ^ 0x4631;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xD1FE ^ 0xD13D] = 0xEA45 ^ 0xD13D;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x4C1E ^ 0x4C10] = 0x4C6B ^ 0x4C10;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x11B7 ^ 0x11FC] = 0xFFFFEE46 ^ 0x11FC;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x21B8 ^ 0x2031] = 0x6C18 ^ 0x2031;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x945E ^ 0x94CB] = 0x36D1 ^ 0x94CB;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0x6541 ^ 0x6479] = 0xDF7A ^ 0x6479;
        kotakbaz.rain.client.util.render.engine.controls.A.D[0xFECA ^ 0xFF9E] = 0xFF92 ^ 0xFF9E;
    }
}

