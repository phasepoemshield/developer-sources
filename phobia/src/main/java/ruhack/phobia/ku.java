/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class ku {
    public final float advance;
    public final float u1;
    public final float v0;
    public final float x;
    static final long nr = -8040260160486775184L;
    public final int codepoint;
    public final float bearingY;
    public final float v1;
    public final float bearingX;
    static public final int b;
    public final float height;
    static private int[] gxsn;
    public final float y;
    static private int[] gxsm;
    public final float width;
    public final float u0;

    private static void gxtf() {
        ku.gxsm[0] = -2032342933;
        ku.gxsm[1] = -2023732514;
        ku.gxsm[2] = 998570933;
        ku.gxsm[3] = 655256548;
        ku.gxsm[4] = -1392882119;
        ku.gxsm[5] = -1971174129;
        ku.gxsm[6] = 801699272;
        ku.gxsm[7] = 678472405;
        ku.gxsm[8] = -932244739;
        ku.gxsm[9] = -1923859874;
        ku.gxsm[10] = 804473538;
        ku.gxsm[11] = -681829836;
        ku.gxsm[12] = -521435918;
        ku.gxsm[13] = 1686175367;
        ku.gxsm[14] = -1105547312;
    }

    private static void gxtg() {
        ku.gxsn[0] = -2032342937;
        ku.gxsn[1] = -2023732520;
        ku.gxsn[2] = 998570929;
        ku.gxsn[3] = 655256553;
        ku.gxsn[4] = -1392882123;
        ku.gxsn[5] = -1971174138;
        ku.gxsn[6] = 801699275;
        ku.gxsn[7] = 678472405;
        ku.gxsn[8] = -932244747;
        ku.gxsn[9] = -1923859875;
        ku.gxsn[10] = 804473538;
        ku.gxsn[11] = -681829833;
        ku.gxsn[12] = -521435913;
        ku.gxsn[13] = 1686175360;
        ku.gxsn[14] = -1105547312;
    }

    private static int gxsl(int n2) {
        return gxsm[n2] ^ gxsn[n2];
    }

    static {
        gxsm = new int[15];
        gxsn = new int[15];
        ku.gxtf();
        ku.gxtg();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ku(int var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9, float var10_10, float var11_11, float var12_12) {
        var14_13 /* !! */  = ku.b;
        super();
        this.codepoint = var1_1;
        this.advance = var2_2;
        this.x = var3_3;
        this.y = var4_4;
        this.width = var5_5;
        this.height = var6_6;
        this.u0 = var7_7;
        this.v0 = var8_8;
        this.u1 = var9_9;
        if (var14_13 /* !! */  == 0) ** GOTO lbl-1000
        switch (var14_13 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.v1 = var10_10;
                this.bearingX = var11_11;
                this.bearingY = var12_12;
                return;
            }
            case 0: {
                var14_13 /* !! */  = (int)ku.gxso("gxsp", gxsl(int ), (int)0);
                ** GOTO lbl58
            }
lbl22:
            // 4 sources

            case 1: {
                var14_13 /* !! */  = (int)ku.gxso("gxsq", gxsl(int ), (int)1);
            }
            case 2: {
                var14_13 /* !! */  = (int)ku.gxso("gxsr", gxsl(int ), (int)2);
                ** GOTO lbl58
            }
            case 3: {
                var14_13 /* !! */  = (int)ku.gxso("gxss", gxsl(int ), (int)3);
                ** GOTO lbl39
            }
            case 4: {
                var14_13 /* !! */  = (int)ku.gxso("gxst", gxsl(int ), (int)4);
                ** GOTO lbl55
            }
lbl33:
            // 4 sources

            case 5: {
                var14_13 /* !! */  = (int)ku.gxso("gxsu", gxsl(int ), (int)5);
                ** GOTO lbl22
            }
            case 6: {
                var14_13 /* !! */  = (int)ku.gxso("gxsv", gxsl(int ), (int)6);
                ** GOTO lbl48
            }
lbl39:
            // 3 sources

            case 7: {
                var14_13 /* !! */  = (int)ku.gxso("gxsx", gxsl(int ), (int)7);
                ** GOTO lbl33
            }
            case 8: {
                var14_13 /* !! */  = (int)ku.gxso("gxsy", gxsl(int ), (int)8);
                ** GOTO lbl39
            }
            case 9: {
                var14_13 /* !! */  = (int)ku.gxso("gxsz", gxsl(int ), (int)9);
                ** GOTO lbl22
            }
lbl48:
            // 2 sources

            case 10: {
                var14_13 /* !! */  = (int)ku.gxso("gxta", gxsl(int ), (int)10);
                ** GOTO lbl33
            }
            case 11: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var14_13 /* !! */  = (int)ku.gxso("gxtb", gxsl(int ), (int)11);
                    ** GOTO lbl33
                    break;
                }
            }
lbl55:
            // 2 sources

            case 12: {
                var14_13 /* !! */  = (int)ku.gxso("gxtc", gxsl(int ), (int)12);
                break;
            }
lbl58:
            // 3 sources

            case 13: {
                var14_13 /* !! */  = (int)ku.gxso("gxtd", gxsl(int ), (int)13);
                ** GOTO lbl22
            }
            case 14: 
        }
        var14_13 /* !! */  = (int)ku.gxso("gxte", gxsl(int ), (int)14);
        ** while (true)
    }

    public static CallSite gxso(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

