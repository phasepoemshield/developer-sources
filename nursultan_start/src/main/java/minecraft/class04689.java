/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  minecraft.class02566
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.base.Preconditions;
import minecraft.class02566;
import minecraft.class04659;
import org.jspecify.annotations.Nullable;

public class class04689 {
    private static final @Nullable class04689[] NW = new class04689[64];
    public static final class04689 N = new class04689(0, 0);
    public static final class04689 y = new class04689(1, 8368696);
    public static final class04689 L = new class04689(2, 16247203);
    public static final class04689 u = new class04689(3, 0xC7C7C7);
    public static final class04689 i = new class04689(4, 0xFF0000);
    public static final class04689 R = new class04689(5, 0xA0A0FF);
    public static final class04689 M = new class04689(6, 0xA7A7A7);
    public static final class04689 B = new class04689(7, 31744);
    public static final class04689 Z = new class04689(8, 0xFFFFFF);
    public static final class04689 z = new class04689(9, 10791096);
    public static final class04689 U = new class04689(10, 9923917);
    public static final class04689 E = new class04689(11, 0x707070);
    public static final class04689 W = new class04689(12, 0x4040FF);
    public static final class04689 m = new class04689(13, 9402184);
    public static final class04689 P = new class04689(14, 0xFFFCF5);
    public static final class04689 s = new class04689(15, 14188339);
    public static final class04689 T = new class04689(16, 11685080);
    public static final class04689 b = new class04689(17, 6724056);
    public static final class04689 j = new class04689(18, 0xE5E533);
    public static final class04689 v = new class04689(19, 8375321);
    public static final class04689 n = new class04689(20, 15892389);
    public static final class04689 t = new class04689(21, 0x4C4C4C);
    public static final class04689 G = new class04689(22, 0x999999);
    public static final class04689 l = new class04689(23, 5013401);
    public static final class04689 d = new class04689(24, 8339378);
    public static final class04689 w = new class04689(25, 3361970);
    public static final class04689 k = new class04689(26, 6704179);
    public static final class04689 Y = new class04689(27, 6717235);
    public static final class04689 Q = new class04689(28, 0x993333);
    public static final class04689 O = new class04689(29, 0x191919);
    public static final class04689 g = new class04689(30, 16445005);
    public static final class04689 I = new class04689(31, 6085589);
    public static final class04689 J = new class04689(32, 4882687);
    public static final class04689 o = new class04689(33, 55610);
    public static final class04689 q = new class04689(34, 8476209);
    public static final class04689 K = new class04689(35, 0x700200);
    public static final class04689 V = new class04689(36, 13742497);
    public static final class04689 e = new class04689(37, 10441252);
    public static final class04689 H = new class04689(38, 9787244);
    public static final class04689 c = new class04689(39, 7367818);
    public static final class04689 X = new class04689(40, 12223780);
    public static final class04689 a = new class04689(41, 6780213);
    public static final class04689 p = new class04689(42, 10505550);
    public static final class04689 F = new class04689(43, 0x392923);
    public static final class04689 A = new class04689(44, 8874850);
    public static final class04689 f = new class04689(45, 0x575C5C);
    public static final class04689 C = new class04689(46, 8014168);
    public static final class04689 S = new class04689(47, 4996700);
    public static final class04689 x = new class04689(48, 4993571);
    public static final class04689 D = new class04689(49, 5001770);
    public static final class04689 h = new class04689(50, 9321518);
    public static final class04689 r = new class04689(51, 2430480);
    public static final class04689 NN = new class04689(52, 12398641);
    public static final class04689 Ny = new class04689(53, 9715553);
    public static final class04689 NL = new class04689(54, 6035741);
    public static final class04689 Nu = new class04689(55, 1474182);
    public static final class04689 Ni = new class04689(56, 3837580);
    public static final class04689 NR = new class04689(57, 5647422);
    public static final class04689 NM = new class04689(58, 1356933);
    public static final class04689 NB = new class04689(59, 0x646464);
    public static final class04689 NZ = new class04689(60, 14200723);
    public static final class04689 Nz = new class04689(61, 8365974);
    public final int NU;
    public final int NE;

    private static class04689 L(int n) {
        class04689 class046892 = NW[n];
        return class046892 != null ? class046892 : N;
    }

    private class04689(int n, int n2) {
        if (n < 0 || n > 63) {
            throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
        }
        this.NE = n;
        this.NU = n2;
        class04689.NW[n] = this;
    }

    public byte y(class04659 class046592) {
        return (byte)(this.NE << 2 | class046592.field_34763 & 3);
    }

    public static int y(int n) {
        int n2 = n & 0xFF;
        return class04689.L(n2 >> 2).N(class04659.y(n2 & 3));
    }

    public int N(class04659 class046592) {
        if (this == N) {
            return 0;
        }
        return class02566.u((int)class02566.M((int)this.NU), (int)class046592.field_34764);
    }

    public static class04689 N(int n) {
        Preconditions.checkPositionIndex((int)n, (int)NW.length, (String)"material id");
        return class04689.L(n);
    }
}

