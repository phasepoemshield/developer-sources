/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.minecraft.class_10868
 *  net.minecraft.class_11391
 *  org.lwjgl.opengl.GL11
 */
package kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiConsumer;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A;
import net.minecraft.class_10868;
import net.minecraft.class_11391;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.a
 */
public final class a_0<T>
extends Record {
    private final BiConsumer<A, T> a;
    public static final a_0<kotakbaz.rain.client.render.texture.A> A;
    public static final a_0<class_11391> b;
    public static final a_0<class_10868> B;
    public static final a_0<Integer> c;
    public static int[] d;

    public a_0(BiConsumer<A, T> biConsumer) {
        super();
        this.a = biConsumer;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{a_0.class, "uploadConsumer", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a_0.class, "uploadConsumer", "a"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a_0.class, "uploadConsumer", "a"}, this, object);
    }

    public BiConsumer<A, T> uploadConsumer() {
        return this.a;
    }

    static {
        a_0.a();
        A = new a_0<kotakbaz.rain.client.render.texture.A>((a2, a3) -> {
            int n = d[44];
            n -= d[45];
            GlStateManager._activeTexture((int)((n ^= d[46]) + a2.getSamplerId()));
            GlStateManager._bindTexture((int)a3.getTexId());
        });
        b = new a_0<class_11391>((a2, class_113912) -> {
            long l = 5565153773608434254L;
            long l2 = -8263066329797786230L;
            int n = d[15];
            GlStateManager._activeTexture((int)((n += d[16]) + a2.getSamplerId()));
            class_10868 class_108682 = class_113912.method_71638();
            int n2 = d[17];
            n2 += d[18];
            if ((class_108682.usage() & (n2 -= d[19])) != 0) {
                long l3 = l2;
                int n3 = d[20];
                n3 += d[21];
                l2 = l3 ^ (0x851300000000L ^ l3) & -1L << (n3 -= d[22]);
                int n4 = d[23];
                n4 -= d[24];
                GL11.glBindTexture((int)(n4 -= d[25]), (int)class_108682.method_68427());
            } else {
                long l4 = l2;
                int n5 = d[26];
                n5 += d[27];
                l2 = l4 ^ (0xDE100000000L ^ l4) & -1L << (n5 -= d[28]);
                GlStateManager._bindTexture((int)class_108682.method_68427());
            }
            int n6 = d[29];
            n6 ^= d[30];
            int n7 = d[32];
            n7 -= d[33];
            GlStateManager._texParameter((int)((int)(l2 >>> (n6 += d[31]))), (int)(n7 ^= d[34]), (int)class_113912.baseMipLevel());
            int n8 = d[35];
            n8 ^= d[36];
            int n9 = d[38];
            n9 += d[39];
            int n10 = d[41];
            n10 += d[42];
            GlStateManager._texParameter((int)((int)(l2 >>> (n8 -= d[37]))), (int)(n9 += d[40]), (int)(class_113912.baseMipLevel() + class_113912.mipLevels() - (n10 += d[43])));
        });
        B = new a_0<class_10868>((a2, class_108682) -> {
            long l = -1461356406190411436L;
            int n = d[3];
            n += d[4];
            GlStateManager._activeTexture((int)((n ^= d[5]) + a2.getSamplerId()));
            int n2 = d[6];
            n2 ^= d[7];
            if ((class_108682.usage() & (n2 ^= d[8])) != 0) {
                long l2 = l;
                int n3 = d[9];
                n3 -= d[10];
                l = l2 ^ (0x851300000000L ^ l2) & -1L << (n3 -= d[11]);
                int n4 = d[12];
                n4 ^= d[13];
                GL11.glBindTexture((int)((int)(l >>> (n4 += d[14]))), (int)class_108682.method_68427());
            } else {
                GlStateManager._bindTexture((int)class_108682.method_68427());
            }
        });
        c = new a_0<Integer>((a2, n) -> {
            int n2 = d[0];
            n2 ^= d[1];
            GlStateManager._activeTexture((int)((n2 += d[2]) + a2.getSamplerId()));
            GlStateManager._bindTexture((int)n);
        });
    }

    public static void a() {
        d = new int[0x4B31 ^ 0x4B1E];
        a_0.d[0x5614 ^ 0x560A] = 0xFFFFA9F5 ^ 0x560A;
        a_0.d[0xB300 ^ 0xB320] = 0xFFFFCDB2 ^ 0xB320;
        a_0.d[0x7369 ^ 0x734B] = 0xFFFF8CE1 ^ 0x734B;
        a_0.d[0xE697 ^ 0xE6BB] = 0x623F ^ 0xE6BB;
        a_0.d[0x9C71 ^ 0x9C6A] = 0xFFFF63C5 ^ 0x9C6A;
        a_0.d[0x3092 ^ 0x3091] = 0xFFFF4BDC ^ 0x3091;
        a_0.d[0x1C52 ^ 0x1C42] = 0xFFFFE395 ^ 0x1C42;
        a_0.d[0x9E8B ^ 0x9EA5] = 0x9ED9 ^ 0x9EA5;
        a_0.d[0x26A7 ^ 0x268F] = 0xFFFFD975 ^ 0x268F;
        a_0.d[0xC436 ^ 0xC43A] = 0xC447 ^ 0xC43A;
        a_0.d[0x3C66 ^ 0x3C67] = 0xFFFFC3BB ^ 0x3C67;
        a_0.d[0x8AD9 ^ 0x8AD6] = 0xE3F ^ 0x8AD6;
        a_0.d[0x8904 ^ 0x8919] = 0x8912 ^ 0x8919;
        a_0.d[0x2739 ^ 0x271C] = 0xFFFFD88C ^ 0x271C;
        a_0.d[0x4F0E ^ 0x4F08] = 0xFFFFB0BA ^ 0x4F08;
        a_0.d[0xA4F4 ^ 0xA4EB] = 0xA4C7 ^ 0xA4EB;
        a_0.d[0xF7EE ^ 0xF7E0] = 0xF7FB ^ 0xF7E0;
        a_0.d[0xA5D7 ^ 0xA5F4] = 0xA5DC ^ 0xA5F4;
        a_0.d[0x862A ^ 0x862F] = 0xFFFF79FF ^ 0x862F;
        a_0.d[0xE994 ^ 0xE983] = 0x6CD6 ^ 0xE983;
        a_0.d[0x183A ^ 0x181C] = 0x9944 ^ 0x181C;
        a_0.d[0x7881 ^ 0x7888] = 0xFFFF8765 ^ 0x7888;
        a_0.d[0x10E44 ^ 0x10E57] = 0xFFFEF1DF ^ 0x10E57;
        a_0.d[0x9B79 ^ 0x9B79] = 0xFFFFE071 ^ 0x9B79;
        a_0.d[0x6821 ^ 0x680B] = 0x6828 ^ 0x680B;
        a_0.d[0x5491 ^ 0x5496] = 0xFFFFAB2B ^ 0x5496;
        a_0.d[0x3D9E ^ 0x3D8A] = 0xFFFFC275 ^ 0x3D8A;
        a_0.d[0x612B ^ 0x610C] = 0xFFFF9EE7 ^ 0x610C;
        a_0.d[0x4A4E ^ 0x4A5B] = 0xFFFFB588 ^ 0x4A5B;
        a_0.d[0xF7AB ^ 0xF7AF] = 0xFFFF086C ^ 0xF7AF;
        a_0.d[0x50AA ^ 0x50BC] = 0xFFFFAF0E ^ 0x50BC;
        a_0.d[0x8919 ^ 0x8905] = 0x8970 ^ 0x8905;
        a_0.d[0x10AC ^ 0x1081] = 0xFFFFEF49 ^ 0x1081;
        a_0.d[0x8AEA ^ 0x8AE0] = 0x8ACA ^ 0x8AE0;
        a_0.d[0xA63 ^ 0xA7B] = 0xA7B ^ 0xA7B;
        a_0.d[0x8D64 ^ 0x8D6F] = 0xFFFF72CC ^ 0x8D6F;
        a_0.d[0x9613 ^ 0x9637] = 0xFFFF69AF ^ 0x9637;
        a_0.d[0x72B6 ^ 0x72AC] = 0x724A ^ 0x72AC;
        a_0.d[0x6C99 ^ 0x6C9B] = 0xFFFF9377 ^ 0x6C9B;
        a_0.d[0xC363 ^ 0xC342] = 0xFFFF3CBE ^ 0xC342;
        a_0.d[0x3C72 ^ 0x3C7A] = 0x3C65 ^ 0x3C7A;
        a_0.d[0xB921 ^ 0xB930] = 0xFFFF4607 ^ 0xB930;
        a_0.d[0x39EC ^ 0x39C5] = 0xFFFFC66E ^ 0x39C5;
        a_0.d[0x102C ^ 0x1035] = 0x1077 ^ 0x1035;
        a_0.d[0xD0F9 ^ 0xD0D2] = 0xD0E1 ^ 0xD0D2;
        a_0.d[0x101B2 ^ 0x101A0] = 0x101C1 ^ 0x101A0;
        a_0.d[0xF631 ^ 0xF63C] = 0xF644 ^ 0xF63C;
    }
}

