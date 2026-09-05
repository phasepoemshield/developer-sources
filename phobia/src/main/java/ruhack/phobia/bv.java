/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.bc;

public class bv
extends bc {
    private int color;
    private static long[] dzsw;
    private static int[] dztc;
    private static long[] dzsv;
    public static final int b;
    public static final boolean c;
    private static int[] dztb;
    public static final boolean a;
    public static final long jw = 98092647795808807L;

    private static /* synthetic */ void dzuq() {
        bv.dzsv[0] = -8147729103284164732L;
        bv.dzsv[1] = -9156531775605048082L;
        bv.dzsv[2] = 635580012922892434L;
        bv.dzsv[3] = 5992843243554471057L;
        bv.dzsv[4] = 1695183065928129398L;
        bv.dzsv[5] = 6087724792075291890L;
        bv.dzsv[6] = 2644407464098856404L;
        bv.dzsv[7] = -1511970427698671763L;
        bv.dzsv[8] = -1216162848441006259L;
        bv.dzsv[9] = -6916540867905033583L;
        bv.dzsv[10] = 7035089456320534583L;
        bv.dzsv[11] = 7233179849264203449L;
        bv.dzsv[12] = -5771616131208964820L;
        bv.dzsv[13] = 1259407067411611418L;
        bv.dzsv[14] = 5846044291088253852L;
        bv.dzsv[15] = 8064984615361880639L;
        bv.dzsv[16] = 8232199617198655916L;
        bv.dzsv[17] = -1260446127844054013L;
        bv.dzsv[18] = -3382875927793761382L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int getColor() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = bv.jw - bv.dzsx("dzsy", dzsu(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == bv.dzsx("dztd", dzta(int ), (int)0)) break;
            v0 /* !! */  = (long)bv.dzsx("dzte", dzta(int ), (int)1);
        }
        var3_1 = bv.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = bv.jw - bv.dzsx("dztf", dzsu(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == bv.dzsx("dztg", dzta(int ), (int)2)) break;
            v1 /* !! */  = (long)bv.dzsx("dzth", dzta(int ), (int)3);
        }
        var2_2 /* !! */  = bv.b;
        v2 /* !! */  = bv.jw;
        if (true) ** GOTO lbl19
        block18: while (true) {
            v2 /* !! */  = (long)(bv.dzsx("dztj", dzsu(int ), (int)3) - bv.dzsx("dzti", dzsu(int ), (int)2));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -635401796: {
                    continue block18;
                }
                case 1391614503: {
                    break block18;
                }
            }
            break;
        }
        var1_3 = bv.a;
        if (!var3_1) ** GOTO lbl31
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (int)bv.dzsx("dztk", dzta(int ), (int)4);
                }
lbl31:
                // 1 sources

                if (var1_3 || var1_3) continue block19;
                v3 /* !! */  = bv.jw;
                if (true) ** GOTO lbl36
                block20: while (true) {
                    v3 /* !! */  = (long)(v4 - bv.dzsx("dztl", dzsu(int ), (int)4));
lbl36:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1855297649: {
                            v4 = bv.dzsx("dztm", dzsu(int ), (int)5);
                            continue block20;
                        }
                        case -1171498972: {
                            v4 = bv.dzsx("dztn", dzsu(int ), (int)6);
                            continue block20;
                        }
                        case 592393461: {
                            v4 = bv.dzsx("dzto", dzsu(int ), (int)7);
                            continue block20;
                        }
                        case 1391614503: {
                            break block20;
                        }
                    }
                    break;
                }
                return this.color;
lbl49:
                // 2 sources

                case 0: {
                    var2_2 /* !! */  = (int)bv.dzsx("dztp", dzta(int ), (int)5);
                    if (!var3_1) break block19;
                    throw null;
                }
                case 1: {
                    var2_2 /* !! */  = (int)bv.dzsx("dztq", dzta(int ), (int)6);
                    if (!var3_1) ** GOTO lbl49
                    throw null;
                }
                case 2: {
                    var2_2 /* !! */  = (int)bv.dzsx("dztr", dzta(int ), (int)7);
                    if (!var3_1) break block19;
                    throw null;
                }
                case 3: 
            }
        }
        do {
            var2_2 /* !! */  = (int)bv.dzsx("dztt", dzta(int ), (int)8);
        } while (!var3_1);
        throw null;
    }

    private static /* synthetic */ int dzta(int n2) {
        return dztb[n2] ^ dztc[n2];
    }

    static {
        dztb = new int[17];
        dztc = new int[17];
        bv.dzuo();
        bv.dzup();
        dzsv = new long[19];
        dzsw = new long[19];
        bv.dzuq();
        bv.dzus();
    }

    private static /* synthetic */ void dzup() {
        bv.dztc[0] = -1953429478;
        bv.dztc[1] = -613337167;
        bv.dztc[2] = 1209414027;
        bv.dztc[3] = -360894196;
        bv.dztc[4] = -1491157143;
        bv.dztc[5] = -332221274;
        bv.dztc[6] = 2070582482;
        bv.dztc[7] = 734992398;
        bv.dztc[8] = -1915122745;
        bv.dztc[9] = -748163630;
        bv.dztc[10] = 1141934801;
        bv.dztc[11] = -1118031726;
        bv.dztc[12] = 1557332762;
        bv.dztc[13] = 638955966;
        bv.dztc[14] = 13648881;
        bv.dztc[15] = 1569906894;
        bv.dztc[16] = -916819849;
    }

    private static /* synthetic */ long dzsu(int n2) {
        return dzsv[n2] ^ dzsw[n2];
    }

    private static /* synthetic */ void dzuo() {
        bv.dztb[0] = 1953429477;
        bv.dztb[1] = -1306510267;
        bv.dztb[2] = 1209414026;
        bv.dztb[3] = -211560304;
        bv.dztb[4] = -2068985695;
        bv.dztb[5] = -332221276;
        bv.dztb[6] = 2070582482;
        bv.dztb[7] = 734992397;
        bv.dztb[8] = -1915122747;
        bv.dztb[9] = -748163631;
        bv.dztb[10] = 1141934803;
        bv.dztb[11] = -1118031725;
        bv.dztb[12] = 1557332762;
        bv.dztb[13] = 638955966;
        bv.dztb[14] = 13648883;
        bv.dztb[15] = 1569906895;
        bv.dztb[16] = -916819849;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public void setColor(int n2) {
        block31: {
            block30: {
                Object object = jw;
                block19: while (true) {
                    switch ((int)object) {
                        case 572086647: {
                            object = bv.dzsx("dztv", dzsu(int ), (int)9) - bv.dzsx("dztu", dzsu(int ), (int)8);
                            continue block19;
                        }
                        case 1391614503: {
                            break block19;
                        }
                    }
                    break;
                }
                boolean bl2 = c;
                Object object2 = jw;
                boolean bl3 = true;
                block20: while (true) {
                    CallSite callSite;
                    if (!bl3 || (bl3 = false) || !true) {
                        object2 = callSite - bv.dzsx("dztw", dzsu(int ), (int)10);
                    }
                    switch ((int)object2) {
                        case -1675176949: {
                            callSite = bv.dzsx("dztx", dzsu(int ), (int)11);
                            continue block20;
                        }
                        case -1358993721: {
                            callSite = bv.dzsx("dzty", dzsu(int ), (int)12);
                            continue block20;
                        }
                        case 1391614503: {
                            break block20;
                        }
                    }
                    break;
                }
                int n3 = b;
                Object object3 = jw;
                boolean bl4 = true;
                block21: while (true) {
                    CallSite callSite;
                    if (!bl4 || (bl4 = false) || !true) {
                        object3 = callSite - bv.dzsx("dztz", dzsu(int ), (int)13);
                    }
                    switch ((int)object3) {
                        case -154272476: {
                            callSite = bv.dzsx("dzua", dzsu(int ), (int)14);
                            continue block21;
                        }
                        case 431178261: {
                            callSite = bv.dzsx("dzub", dzsu(int ), (int)15);
                            continue block21;
                        }
                        case 640492935: {
                            callSite = bv.dzsx("dzuc", dzsu(int ), (int)16);
                            continue block21;
                        }
                        case 1391614503: {
                            break block21;
                        }
                    }
                    break;
                }
                boolean bl5 = a;
                if (bl2) {
                    throw null;
                }
                if (bl5 || bl5) break block30;
                Object object4 = jw;
                block22: while (true) {
                    switch ((int)object4) {
                        case -464190127: {
                            object4 = bv.dzsx("dzue", dzsu(int ), (int)18) - bv.dzsx("dzud", dzsu(int ), (int)17);
                            continue block22;
                        }
                        case 1391614503: {
                            break block22;
                        }
                    }
                    break;
                }
                this.color = n2;
                if (!bl5) break block31;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public bv(int var1_1) {
        var3_2 /* !! */  = bv.b;
        var2_3 = bv.a;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                super();
                this.color = var1_1;
                return;
            }
            case 0: {
                var3_2 /* !! */  = (int)bv.dzsx("dzul", dzta(int ), (int)14);
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)bv.dzsx("dzum", dzta(int ), (int)15);
                    continue;
                    break;
                }
            }
            case 2: 
        }
        var3_2 /* !! */  = (int)bv.dzsx("dzun", dzta(int ), (int)16);
        ** while (true)
    }

    private static /* synthetic */ void dzus() {
        bv.dzsw[0] = -7377114582447249991L;
        bv.dzsw[1] = 3180284867505090145L;
        bv.dzsw[2] = -910254274143954401L;
        bv.dzsw[3] = -4499176104513781824L;
        bv.dzsw[4] = 5921282327349556203L;
        bv.dzsw[5] = -6386212067375800056L;
        bv.dzsw[6] = -2624145132030131631L;
        bv.dzsw[7] = -7540211504361080827L;
        bv.dzsw[8] = -6057754482403344538L;
        bv.dzsw[9] = -1136382300224033223L;
        bv.dzsw[10] = -9100627176776415656L;
        bv.dzsw[11] = 8597139842201409724L;
        bv.dzsw[12] = -6334956320927562147L;
        bv.dzsw[13] = -8648475260949207969L;
        bv.dzsw[14] = 4258127830347303399L;
        bv.dzsw[15] = 5960630411022766413L;
        bv.dzsw[16] = -3457044120337735749L;
        bv.dzsw[17] = -121520231512616570L;
        bv.dzsw[18] = 5226155052505827009L;
    }

    public static /* synthetic */ CallSite dzsx(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}

