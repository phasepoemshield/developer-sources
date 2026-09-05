/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.security.SecureRandom;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import ruhack.phobia.d;
import ruhack.phobia.hn;
import ruhack.phobia.hx;
import ruhack.phobia.ov;
import ruhack.phobia.ow;

public final class id
extends hx {
    private static int[] ftat = new int[427];
    private float sideSnapPitch;
    public static final boolean a;
    private static long[] ftbi;
    private static int[] ftau;
    public static final boolean c;
    private static long[] ftbh;
    private int sideSnapStage;
    private static final int SIDE_SNAP_EVERY_TICKS = 50;
    private static final float MAX_IDLE_FOV = 35.0f;
    private static final int ATTACK_SKIP_EVERY_TICKS = 6;
    private long sideSnapUntil;
    private float sideSnapStartYaw;
    private long sideSnapStartedAt;
    public static final int b;
    private static final float DIAGONAL_JITTER_DEGREES = 10.0f;
    private static final float RUNNING_TARGET_BLEND = 0.42f;
    private static final long SIDE_SNAP_DURATION_MS = 350L;
    private static final float RUNNING_TARGET_ATTACK_BLEND = 0.58f;
    private int lastTick;
    private final SecureRandom secureRandom;
    private static final long SIDE_SNAP_TURN_MS = 140L;
    private float sideSnapTargetYaw;
    private int tickCounter;
    static final long mx = -3032138613727625841L;
    private static final float SIDE_SNAP_ANGLE = 35.0f;

    private static /* synthetic */ void fuke() {
        id.ftbi[200] = 3458429362797257801L;
        id.ftbi[201] = 5942740606811258972L;
        id.ftbi[202] = 7347807566596881949L;
        id.ftbi[203] = 3300948958201048575L;
        id.ftbi[204] = 6467694519681707786L;
        id.ftbi[205] = -845244875405980969L;
        id.ftbi[206] = -2969451445453419842L;
        id.ftbi[207] = -4760451951902971632L;
        id.ftbi[208] = -4583823513759796643L;
        id.ftbi[209] = 1411670121824181775L;
        id.ftbi[210] = -2136297973382057238L;
        id.ftbi[211] = 7433573154499937424L;
        id.ftbi[212] = -1645843227190286334L;
        id.ftbi[213] = 3292930132258717807L;
        id.ftbi[214] = 9037600624508290883L;
        id.ftbi[215] = -6326191579460921080L;
        id.ftbi[216] = 4944813873423402482L;
        id.ftbi[217] = -1811184130838053456L;
        id.ftbi[218] = 5581371047449311295L;
        id.ftbi[219] = 5853933944296000939L;
        id.ftbi[220] = 3467376329126584082L;
        id.ftbi[221] = -3584049404616353115L;
        id.ftbi[222] = 2697019281255743296L;
        id.ftbi[223] = 833192327385162309L;
        id.ftbi[224] = 5238015772600222025L;
        id.ftbi[225] = -4418352935705957943L;
        id.ftbi[226] = -7644165555242651326L;
        id.ftbi[227] = -2131947292631612832L;
        id.ftbi[228] = -3335982360302834161L;
        id.ftbi[229] = 7787827993440691502L;
        id.ftbi[230] = 6396006022184152792L;
        id.ftbi[231] = 7920870866518379498L;
        id.ftbi[232] = 105661434795254808L;
        id.ftbi[233] = -8187958883507242511L;
        id.ftbi[234] = 7942712340751784496L;
        id.ftbi[235] = -3208173864079980210L;
        id.ftbi[236] = -1628059716267642776L;
        id.ftbi[237] = 6209347197268775676L;
        id.ftbi[238] = 2489657995133417743L;
        id.ftbi[239] = 97215584782596070L;
        id.ftbi[240] = -1760216214919633724L;
        id.ftbi[241] = -6088002370873056578L;
        id.ftbi[242] = 5338547498300278878L;
        id.ftbi[243] = 3008593798140856246L;
        id.ftbi[244] = -3028350246381629182L;
        id.ftbi[245] = 776360345397449845L;
        id.ftbi[246] = 7469490377538687976L;
        id.ftbi[247] = -1383472714864028462L;
        id.ftbi[248] = -989670774849983164L;
        id.ftbi[249] = 9088835194020625800L;
        id.ftbi[250] = 2844288692040048343L;
        id.ftbi[251] = 1921994690500072520L;
        id.ftbi[252] = -8531964143487727842L;
        id.ftbi[253] = -115741947961630149L;
        id.ftbi[254] = 2165434143522764655L;
        id.ftbi[255] = 7555593576868938833L;
        id.ftbi[256] = 4641142541373381154L;
        id.ftbi[257] = -246432899995717005L;
        id.ftbi[258] = -4900650962269045412L;
        id.ftbi[259] = -4974214086709998598L;
        id.ftbi[260] = -2143835837672998177L;
        id.ftbi[261] = -8070473461350102735L;
        id.ftbi[262] = 6656418439516599064L;
        id.ftbi[263] = -3126284562753990950L;
        id.ftbi[264] = 7369063004451327533L;
        id.ftbi[265] = -883782444137632639L;
        id.ftbi[266] = 8634234335735445590L;
        id.ftbi[267] = -6984984502974156473L;
        id.ftbi[268] = 7964186291258326072L;
        id.ftbi[269] = 3499765526502609922L;
        id.ftbi[270] = 2163939874521282659L;
        id.ftbi[271] = -424090766259613223L;
        id.ftbi[272] = 7351841437309114703L;
        id.ftbi[273] = 1220749056199985783L;
        id.ftbi[274] = -7425187830843867037L;
        id.ftbi[275] = 9155958731002360005L;
        id.ftbi[276] = 842626483369383048L;
        id.ftbi[277] = 3271704121832951958L;
        id.ftbi[278] = 4126226153929551884L;
        id.ftbi[279] = -5996606600702752467L;
    }

    private static /* synthetic */ double ftcm(int n2) {
        return Double.longBitsToDouble(ftbh[n2] ^ ftbi[n2]);
    }

    public static /* synthetic */ CallSite ftav(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void reset() {
        block109: {
            block108: {
                v0 /* !! */  = id.mx;
                if (true) ** GOTO lbl5
                block72: while (true) {
                    v0 /* !! */  = (long)(v1 - id.ftav("ftqb", ftbg(int ), (int)11));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -2122917779: {
                            v1 = id.ftav("ftqc", ftbg(int ), (int)12);
                            continue block72;
                        }
                        case -590636728: {
                            v1 = id.ftav("ftqd", ftbg(int ), (int)13);
                            continue block72;
                        }
                        case -351994481: {
                            break block72;
                        }
                        case 921914400: {
                            v1 = id.ftav("ftqe", ftbg(int ), (int)14);
                            continue block72;
                        }
                    }
                    break;
                }
                var3_1 = id.c;
                v2 /* !! */  = id.mx;
                if (true) ** GOTO lbl22
                block73: while (true) {
                    v2 /* !! */  = (long)(v3 - id.ftav("ftqf", ftbg(int ), (int)15));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1506360339: {
                            v3 = id.ftav("ftqg", ftbg(int ), (int)16);
                            continue block73;
                        }
                        case -1223016742: {
                            v3 = id.ftav("ftqh", ftbg(int ), (int)17);
                            continue block73;
                        }
                        case -1004368564: {
                            v3 = id.ftav("ftqi", ftbg(int ), (int)18);
                            continue block73;
                        }
                        case -351994481: {
                            break block73;
                        }
                    }
                    break;
                }
                var2_2 /* !! */  = id.b;
                v4 /* !! */  = id.mx;
                if (true) ** GOTO lbl39
                block74: while (true) {
                    v4 /* !! */  = (long)(v5 - id.ftav("ftqj", ftbg(int ), (int)19));
lbl39:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1122302203: {
                            v5 = id.ftav("ftqk", ftbg(int ), (int)20);
                            continue block74;
                        }
                        case -351994481: {
                            break block74;
                        }
                        case 793174168: {
                            v5 = id.ftav("ftql", ftbg(int ), (int)21);
                            continue block74;
                        }
                        case 1295005639: {
                            v5 = id.ftav("ftqm", ftbg(int ), (int)22);
                            continue block74;
                        }
                    }
                    break;
                }
                var1_3 = id.a;
                if (var3_1) {
                    throw null;
lbl54:
                    // 9 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl54
                v6 = id.ftav("ftqn", ftbg(int ), (int)23);
                v7 /* !! */  = id.mx;
                if (true) ** GOTO lbl62
                block76: while (true) {
                    v7 /* !! */  = (long)(v8 - id.ftav("ftqo", ftbg(int ), (int)24));
lbl62:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1792051185: {
                            v8 = id.ftav("ftqp", ftbg(int ), (int)25);
                            continue block76;
                        }
                        case -351994481: {
                            break block76;
                        }
                        case 676415388: {
                            v8 = id.ftav("ftqq", ftbg(int ), (int)26);
                            continue block76;
                        }
                    }
                    break;
                }
                this.sideSnapUntil = (long)v6;
                if (var1_3 || var1_3) ** GOTO lbl54
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_0 = id.mx - id.ftav("ftqr", ftbg(int ), (int)27)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == id.ftav("ftqs", ftas(int ), (int)188)) break;
                    v9 /* !! */  = (long)id.ftav("ftqt", ftas(int ), (int)189);
                }
                v10 /* !! */  = id.mx;
                if (true) ** GOTO lbl82
                block78: while (true) {
                    v10 /* !! */  = (long)(v11 - id.ftav("ftqu", ftbg(int ), (int)28));
lbl82:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -2103137915: {
                            v11 = id.ftav("ftqv", ftbg(int ), (int)29);
                            continue block78;
                        }
                        case -639983258: {
                            v11 = id.ftav("ftqw", ftbg(int ), (int)30);
                            continue block78;
                        }
                        case -351994481: {
                            break block78;
                        }
                    }
                    break;
                }
                if (id.mc.field_1724 == null) break block108;
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_1 = id.mx - id.ftav("ftqx", ftbg(int ), (int)31)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == id.ftav("ftqy", ftas(int ), (int)190)) break;
                    v12 /* !! */  = (long)id.ftav("ftqz", ftas(int ), (int)191);
                }
                v13 /* !! */  = id.mx;
                if (true) ** GOTO lbl101
                block80: while (true) {
                    v13 /* !! */  = (long)(v14 - id.ftav("ftra", ftbg(int ), (int)32));
lbl101:
                    // 2 sources

                    switch ((int)v13 /* !! */ ) {
                        case -933105286: {
                            v14 = id.ftav("ftrb", ftbg(int ), (int)33);
                            continue block80;
                        }
                        case -537063548: {
                            v14 = id.ftav("ftrc", ftbg(int ), (int)34);
                            continue block80;
                        }
                        case -351994481: {
                            break block80;
                        }
                        case 2135785429: {
                            v14 = id.ftav("ftrd", ftbg(int ), (int)35);
                            continue block80;
                        }
                    }
                    break;
                }
                v15 = id.mc.field_1724;
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_2 = id.mx - id.ftav("ftre", ftbg(int ), (int)36)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == id.ftav("ftrf", ftas(int ), (int)192)) break;
                    v16 /* !! */  = (long)id.ftav("ftrg", ftas(int ), (int)193);
                }
                v17 /* !! */  = (CallSite)v15.field_6012;
                if (var3_1) {
                    throw null;
                }
                break block109;
            }
            v17 /* !! */  = id.ftav("ftrh", ftas(int ), (int)194);
        }
        v18 /* !! */  = id.mx;
        if (true) ** GOTO lbl130
        block82: while (true) {
            v18 /* !! */  = (long)(id.ftav("ftrj", ftbg(int ), (int)38) - id.ftav("ftri", ftbg(int ), (int)37));
lbl130:
            // 2 sources

            switch ((int)v18 /* !! */ ) {
                case -351994481: {
                    break block82;
                }
                case 111728658: {
                    continue block82;
                }
            }
            break;
        }
        this.lastTick = (int)v17 /* !! */ ;
        if (var1_3 || var1_3) ** GOTO lbl54
        v19 = id.ftav("ftrk", ftas(int ), (int)195);
        v20 /* !! */  = id.mx;
        if (true) ** GOTO lbl142
        block83: while (true) {
            v20 /* !! */  = (long)(v21 - id.ftav("ftrl", ftbg(int ), (int)39));
lbl142:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case -1490177320: {
                    v21 = id.ftav("ftrm", ftbg(int ), (int)40);
                    continue block83;
                }
                case -351994481: {
                    break block83;
                }
                case 775792787: {
                    v21 = id.ftav("ftrn", ftbg(int ), (int)41);
                    continue block83;
                }
                case 983302339: {
                    v21 = id.ftav("ftro", ftbg(int ), (int)42);
                    continue block83;
                }
            }
            break;
        }
        this.tickCounter = (int)v19;
        if (var1_3 || var1_3) ** GOTO lbl54
        v22 = id.ftav("ftrp", ftas(int ), (int)196);
        while (true) {
            if ((v23 /* !! */  = (cfr_temp_3 = id.mx - id.ftav("ftrq", ftbg(int ), (int)43)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v23 /* !! */  == id.ftav("ftrr", ftas(int ), (int)197)) break;
            v23 /* !! */  = (long)id.ftav("ftrs", ftas(int ), (int)198);
        }
        this.sideSnapStage = (int)v22;
        if (var1_3 || var1_3) ** GOTO lbl54
        v24 = id.ftav("ftrt", ftbg(int ), (int)44);
        while (true) {
            if ((v25 /* !! */  = (cfr_temp_4 = id.mx - id.ftav("ftru", ftbg(int ), (int)45)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v25 /* !! */  == id.ftav("ftrv", ftas(int ), (int)199)) break;
            v25 /* !! */  = (long)id.ftav("ftrw", ftas(int ), (int)200);
        }
        this.sideSnapStartedAt = (long)v24;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl54
                v26 /* !! */  = id.mx;
                if (true) ** GOTO lbl179
                block86: while (true) {
                    v26 /* !! */  = (long)(v27 - id.ftav("ftrx", ftbg(int ), (int)46));
lbl179:
                    // 2 sources

                    switch ((int)v26 /* !! */ ) {
                        case -1958628576: {
                            v27 = id.ftav("ftry", ftbg(int ), (int)47);
                            continue block86;
                        }
                        case -1511507501: {
                            v27 = id.ftav("ftrz", ftbg(int ), (int)48);
                            continue block86;
                        }
                        case -551069320: {
                            v27 = id.ftav("ftsa", ftbg(int ), (int)49);
                            continue block86;
                        }
                        case -351994481: {
                            break block86;
                        }
                    }
                    break;
                }
                this.sideSnapStartYaw = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl54
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_5 = id.mx - id.ftav("ftsb", ftbg(int ), (int)50)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == id.ftav("ftsc", ftas(int ), (int)201)) break;
                    v28 /* !! */  = (long)id.ftav("ftsd", ftas(int ), (int)202);
                }
                this.sideSnapTargetYaw = 0.0f;
                if (var1_3 || var1_3) ** GOTO lbl54
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_6 = id.mx - id.ftav("ftse", ftbg(int ), (int)51)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == id.ftav("ftsf", ftas(int ), (int)203)) break;
                    v29 /* !! */  = (long)id.ftav("ftsg", ftas(int ), (int)204);
                }
                this.sideSnapPitch = 0.0f;
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl208:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)id.ftav("ftsh", ftas(int ), (int)205);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl223
            }
lbl213:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)id.ftav("ftsi", ftas(int ), (int)206);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl277
            }
            case 2: {
                var2_2 /* !! */  = (int)id.ftav("ftsj", ftas(int ), (int)207);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl264
            }
lbl223:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)id.ftav("ftsk", ftas(int ), (int)208);
                if (var3_1) {
                    throw null;
                }
            }
            case 4: {
                var2_2 /* !! */  = (int)id.ftav("ftsl", ftas(int ), (int)209);
                if (!var3_1) ** GOTO lbl223
                throw null;
            }
lbl231:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)id.ftav("ftsm", ftas(int ), (int)210);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl259
            }
            case 6: {
                var2_2 /* !! */  = (int)id.ftav("ftsn", ftas(int ), (int)211);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl259
            }
lbl241:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)id.ftav("ftso", ftas(int ), (int)212);
                if (!var3_1) ** GOTO lbl208
                throw null;
            }
            case 8: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)id.ftav("ftsp", ftas(int ), (int)213);
                    if (!var3_1) ** GOTO lbl208
                    throw null;
                }
            }
            case 9: {
                do {
                    var2_2 /* !! */  = (int)id.ftav("ftsq", ftas(int ), (int)214);
                } while (!var3_1);
                throw null;
            }
lbl255:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)id.ftav("ftsr", ftas(int ), (int)215);
                if (!var3_1) break;
                throw null;
            }
lbl259:
            // 3 sources

            case 11: {
                var2_2 /* !! */  = (int)id.ftav("ftss", ftas(int ), (int)216);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl285
            }
lbl264:
            // 2 sources

            case 12: {
                var2_2 /* !! */  = (int)id.ftav("ftst", ftas(int ), (int)217);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl273
            }
lbl269:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)id.ftav("ftsu", ftas(int ), (int)218);
                if (!var3_1) ** GOTO lbl255
                throw null;
            }
lbl273:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)id.ftav("ftsv", ftas(int ), (int)219);
                if (!var3_1) ** GOTO lbl269
                throw null;
            }
lbl277:
            // 2 sources

            case 15: {
                var2_2 /* !! */  = (int)id.ftav("ftsw", ftas(int ), (int)220);
                if (!var3_1) ** GOTO lbl231
                throw null;
            }
            case 16: {
                var2_2 /* !! */  = (int)id.ftav("ftsx", ftas(int ), (int)221);
                if (!var3_1) ** GOTO lbl213
                throw null;
            }
lbl285:
            // 2 sources

            case 17: {
                var2_2 /* !! */  = (int)id.ftav("ftsy", ftas(int ), (int)222);
                if (!var3_1) ** GOTO lbl241
                throw null;
            }
            case 18: {
                var2_2 /* !! */  = (int)id.ftav("ftsz", ftas(int ), (int)223);
                if (!var3_1) break;
                throw null;
            }
            case 19: 
        }
        var2_2 /* !! */  = (int)id.ftav("ftta", ftas(int ), (int)224);
        ** while (!var3_1)
lbl296:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public ov limitAngleChange(ov var1_1, ov var2_2, class_243 var3_3, class_1297 var4_4) {
        block313: {
            block308: {
                block312: {
                    block311: {
                        block310: {
                            block309: {
                                block307: {
                                    block306: {
                                        block305: {
                                            block304: {
                                                block303: {
                                                    block302: {
                                                        block301: {
                                                            var23_5 = id.c;
                                                            var22_6 /* !! */  = id.b;
                                                            var21_7 = id.a;
                                                            if (var23_5) {
                                                                throw null;
lbl6:
                                                                // 83 sources

                                                                return null;
                                                            }
                                                            if (var21_7 || var21_7) ** GOTO lbl6
                                                            if (id.mc.field_1724 == null) break block301;
                                                            if (var21_7) ** GOTO lbl6
                                                            if (var1_1 != null) break block302;
                                                            if (var21_7) ** GOTO lbl6
                                                        }
                                                        if (var21_7 || var21_7) ** GOTO lbl6
                                                        return var1_1;
                                                    }
                                                    if (var21_7 || var21_7) ** GOTO lbl6
                                                    var5_8 = hn.getInstance();
                                                    if (var21_7 || var21_7) ** GOTO lbl6
                                                    var6_9 = System.currentTimeMillis();
                                                    if (var21_7 || var21_7) ** GOTO lbl6
                                                    if (!(var4_4 instanceof class_1309)) break block303;
                                                    if (var21_7) ** GOTO lbl6
                                                    var9_10 = (class_1309)var4_4;
                                                    if (var21_7 || var21_7) ** GOTO lbl6
                                                    if (!var9_10.method_5805()) break block303;
                                                    if (var21_7) ** GOTO lbl6
                                                    v0 = var9_10;
                                                    if (var23_5) {
                                                        throw null;
                                                    }
                                                    break block304;
                                                }
                                                if (var21_7 || var21_7) ** GOTO lbl6
                                                v0 = var8_12 = null;
                                            }
                                            if (var21_7 || var21_7) ** GOTO lbl6
                                            if (var8_12 == null) break block305;
                                            if (var21_7) ** GOTO lbl6
                                            v1 = id.ftav("ftbc", ftas(int ), (int)6);
                                            if (var23_5) {
                                                throw null;
                                            }
                                            break block306;
                                        }
                                        if (var21_7 || var21_7) ** GOTO lbl6
                                        v1 = var9_11 = id.ftav("ftbd", ftas(int ), (int)7);
                                    }
                                    if (var21_7 || var21_7) ** GOTO lbl6
                                    if (id.mc.field_1724.field_6012 == this.lastTick) break block307;
                                    if (var21_7 || var21_7) ** GOTO lbl6
                                    this.lastTick = id.mc.field_1724.field_6012;
                                    if (var21_7 || var21_7) ** GOTO lbl6
                                    this.tickCounter += id.ftav("ftbe", ftas(int ), (int)8);
                                    if (var21_7) ** GOTO lbl6
                                }
                                if (var21_7 || var21_7) ** GOTO lbl6
                                if (this.tickCounter < id.ftav("ftbf", ftas(int ), (int)9)) break block308;
                                if (var21_7) ** GOTO lbl6
                                if (this.sideSnapUntil != id.ftav("ftbj", ftbg(int ), (int)0)) break block308;
                                if (var21_7 || var21_7) ** GOTO lbl6
                                this.sideSnapUntil = var6_9 + id.ftav("ftbk", ftbg(int ), (int)1);
                                if (var21_7 || var21_7) ** GOTO lbl6
                                this.tickCounter = (int)id.ftav("ftbl", ftas(int ), (int)10);
                                if (var21_7 || var21_7) ** GOTO lbl6
                                this.sideSnapStage = (int)id.ftav("ftbm", ftas(int ), (int)11);
                                if (var21_7 || var21_7) ** GOTO lbl6
                                this.sideSnapStartedAt = var6_9;
                                if (var21_7 || var21_7) ** GOTO lbl6
                                this.sideSnapStartYaw = var1_1.getYaw();
                                if (var21_7 || var21_7) ** GOTO lbl6
                                if (var9_11 == false) break block309;
                                if (var21_7 || var21_7) ** GOTO lbl6
                                v2 = ow.calculateAngle(this.getMovingTargetPoint(var8_12)).getYaw();
                                if (var23_5) {
                                    throw null;
                                }
                                break block310;
                            }
                            if (var21_7 || var21_7) ** GOTO lbl6
                            v2 = var10_13 = id.mc.field_1724.method_36454();
                        }
                        if (var21_7 || var21_7) ** GOTO lbl6
                        var11_17 = class_3532.method_15393((float)(var10_13 - var1_1.getYaw()));
                        if (var21_7 || var21_7) ** GOTO lbl6
                        if (!(var11_17 >= 0.0f)) break block311;
                        if (var21_7) ** GOTO lbl6
                        v3 /* !! */  = id.ftav("ftbo", ftbn(int ), (int)12);
                        if (var23_5) {
                            throw null;
                        }
                        break block312;
                    }
                    if (var21_7 || var21_7) ** GOTO lbl6
                    v3 /* !! */  = (CallSite)1.0f;
                }
                var12_18 /* !! */  = (float)v3 /* !! */ ;
                if (var21_7 || var21_7) ** GOTO lbl6
                this.sideSnapTargetYaw = this.sideSnapStartYaw + var12_18 /* !! */  * id.ftav("ftbp", ftbn(int ), (int)13);
                if (var21_7 || var21_7) ** GOTO lbl6
                this.sideSnapPitch = var1_1.getPitch();
                if (var21_7) ** GOTO lbl6
            }
            if (var21_7 || var21_7) ** GOTO lbl6
            if (this.sideSnapUntil == id.ftav("ftbq", ftbg(int ), (int)2)) ** GOTO lbl143
            if (var21_7 || var21_7) ** GOTO lbl6
            if (var6_9 >= this.sideSnapUntil) ** GOTO lbl140
            if (var21_7 || var21_7) ** GOTO lbl6
            var10_14 = var6_9 - (this.sideSnapUntil - id.ftav("ftbr", ftbg(int ), (int)3));
            if (var21_7 || var21_7) ** GOTO lbl6
            if (this.sideSnapStage != 0) break block313;
            if (var21_7) ** GOTO lbl6
            if (var10_14 < id.ftav("ftbs", ftbg(int ), (int)4)) break block313;
            if (var21_7 || var21_7) ** GOTO lbl6
            id.mc.field_1724.method_6104(class_1268.field_5808);
            if (var21_7 || var21_7) ** GOTO lbl6
            this.sideSnapStage = (int)id.ftav("ftbt", ftas(int ), (int)14);
            if (var21_7) ** GOTO lbl6
            if (var23_5) {
                throw null;
            }
            ** GOTO lbl132
        }
        if (var21_7 || var21_7) ** GOTO lbl6
        if (this.sideSnapStage != id.ftav("ftbu", ftas(int ), (int)15)) ** GOTO lbl132
        if (var21_7) ** GOTO lbl6
        if (var10_14 < id.ftav("ftbv", ftbg(int ), (int)5)) ** GOTO lbl132
        if (var21_7 || var21_7) ** GOTO lbl6
        id.mc.field_1724.method_6104(class_1268.field_5808);
        if (var21_7) ** GOTO lbl6
        if (var22_6 /* !! */  == 0) ** GOTO lbl-1000
        switch (var22_6 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var21_7) ** GOTO lbl6
                this.sideSnapStage = (int)id.ftav("ftbw", ftas(int ), (int)16);
                if (var21_7) ** GOTO lbl6
lbl132:
                // 4 sources

                if (var21_7 || var21_7) ** GOTO lbl6
                var12_18 /* !! */  = class_3532.method_15363((float)((float)(var6_9 - this.sideSnapStartedAt) / id.ftav("ftbx", ftbn(int ), (int)17)), (float)0.0f, (float)1.0f);
                if (var21_7 || var21_7) ** GOTO lbl6
                var12_18 /* !! */  = var12_18 /* !! */  * var12_18 /* !! */  * (id.ftav("ftby", ftbn(int ), (int)18) - 2.0f * var12_18 /* !! */ );
                if (var21_7 || var21_7) ** GOTO lbl6
                var13_19 = class_3532.method_15393((float)(this.sideSnapTargetYaw - this.sideSnapStartYaw));
                if (var21_7 || var21_7) ** GOTO lbl6
                return new ov(this.sideSnapStartYaw + var13_19 * var12_18 /* !! */ , class_3532.method_15363((float)this.sideSnapPitch, (float)id.ftav("ftbz", ftbn(int ), (int)19), (float)id.ftav("ftcb", ftbn(int ), (int)20)));
            }
lbl140:
            // 1 sources

            if (var21_7 || var21_7) ** GOTO lbl6
            this.sideSnapUntil = (long)id.ftav("ftcf", ftbg(int ), (int)6);
            if (var21_7) ** GOTO lbl6
lbl143:
            // 2 sources

            if (var21_7 || var21_7) ** GOTO lbl6
            if (var9_11 == false) ** GOTO lbl195
            if (var21_7 || var21_7) ** GOTO lbl6
            var10_15 = ow.calculateAngle(this.getMovingTargetPoint(var8_12));
            if (var21_7 || var21_7) ** GOTO lbl6
            var11_17 = class_3532.method_15393((float)(var10_15.getYaw() - var1_1.getYaw()));
            if (var21_7 || var21_7) ** GOTO lbl6
            var12_18 /* !! */  = var10_15.getPitch() - var1_1.getPitch();
            if (var21_7 || var21_7) ** GOTO lbl6
            var13_20 = this.isAttackReady(var5_8);
            if (var21_7 || var21_7) ** GOTO lbl6
            var14_22 = Math.hypot(var8_12.method_18798().field_1352, var8_12.method_18798().field_1350);
            if (var21_7 || var21_7) ** GOTO lbl6
            if (!(var14_22 > id.ftav("ftct", ftcm(int ), (int)7))) ** GOTO lbl162
            if (var21_7) ** GOTO lbl6
            v4 = id.ftav("ftcv", ftas(int ), (int)21);
            if (var23_5) {
                throw null;
            }
            ** GOTO lbl164
lbl162:
            // 1 sources

            if (var21_7 || var21_7) ** GOTO lbl6
            v4 = var16_23 = id.ftav("ftcw", ftas(int ), (int)22);
lbl164:
            // 2 sources

            if (var21_7 || var21_7) ** GOTO lbl6
            if (var16_23 == false) ** GOTO lbl178
            if (var21_7 || var21_7) ** GOTO lbl6
            if (!var13_20) ** GOTO lbl173
            if (var21_7) ** GOTO lbl6
            v5 /* !! */  = (float)id.ftav("ftda", ftbn(int ), (int)23);
            if (var23_5) {
                throw null;
            }
            ** GOTO lbl187
lbl173:
            // 1 sources

            if (var21_7 || var21_7) ** GOTO lbl6
            v5 /* !! */  = (float)id.ftav("ftdd", ftbn(int ), (int)24);
            if (var23_5) {
                throw null;
            }
            ** GOTO lbl187
lbl178:
            // 1 sources

            if (var21_7 || var21_7) ** GOTO lbl6
            if (!var13_20) ** GOTO lbl185
            if (var21_7) ** GOTO lbl6
            v5 /* !! */  = 1.0f;
            if (var23_5) {
                throw null;
            }
            ** GOTO lbl187
lbl185:
            // 1 sources

            if (var21_7 || var21_7) ** GOTO lbl6
            v5 /* !! */  = var17_24 /* !! */  = (float)id.ftav("ftdg", ftbn(int ), (int)25);
lbl187:
            // 4 sources

            if (var21_7 || var21_7) ** GOTO lbl6
            var18_25 = var1_1.getYaw() + var11_17 * var17_24 /* !! */ ;
            if (var21_7 || var21_7) ** GOTO lbl6
            var19_26 = var1_1.getPitch() + var12_18 /* !! */  * var17_24 /* !! */ ;
            if (var21_7 || var21_7) ** GOTO lbl6
            var20_27 = (float)Math.sin((double)var6_9 / id.ftav("ftdp", ftcm(int ), (int)8)) * id.ftav("ftdq", ftbn(int ), (int)26);
            if (var21_7 || var21_7) ** GOTO lbl6
            return new ov(var18_25 + var20_27, class_3532.method_15363((float)(var19_26 - var20_27), (float)id.ftav("ftdw", ftbn(int ), (int)27), (float)id.ftav("ftdx", ftbn(int ), (int)28)));
lbl195:
            // 1 sources

            if (var21_7 || var21_7) ** GOTO lbl6
            var10_16 = this.attackElapsedTime();
            if (var21_7 || var21_7) ** GOTO lbl6
            if (var10_16 > id.ftav("ftdy", ftbg(int ), (int)9)) ** GOTO lbl204
            if (var21_7) ** GOTO lbl6
            v6 /* !! */  = this.randomFloat((float)id.ftav("ftea", ftbn(int ), (int)29), 2.0f);
            if (var23_5) {
                throw null;
            }
            ** GOTO lbl206
lbl204:
            // 1 sources

            if (var21_7 || var21_7) ** GOTO lbl6
            v6 /* !! */  = var12_18 /* !! */  = this.randomFloat((float)id.ftav("fteh", ftbn(int ), (int)30), 1.0f);
lbl206:
            // 2 sources

            if (var21_7 || var21_7) ** GOTO lbl6
            if (var10_16 > id.ftav("fteo", ftbg(int ), (int)10)) ** GOTO lbl213
            if (var21_7) ** GOTO lbl6
            v7 = this.randomFloat((float)id.ftav("ftep", ftbn(int ), (int)31), 1.0f);
            if (var23_5) {
                throw null;
            }
            ** GOTO lbl215
lbl213:
            // 1 sources

            if (var21_7 || var21_7) ** GOTO lbl6
            v7 = var13_21 = this.randomFloat((float)id.ftav("ftes", ftbn(int ), (int)32), (float)id.ftav("ftet", ftbn(int ), (int)33));
lbl215:
            // 2 sources

            if (!var21_7 && !var21_7) ** break;
            ** continue;
            return this.clampToViewFov(id.mc.field_1724.method_36454() + var12_18 /* !! */ , id.mc.field_1724.method_36455() + var13_21);
            case 0: {
                var22_6 /* !! */  = (int)id.ftav("ftev", ftas(int ), (int)34);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl799
            }
            case 1: {
                var22_6 /* !! */  = (int)id.ftav("ftew", ftas(int ), (int)35);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl738
            }
            case 2: {
                var22_6 /* !! */  = (int)id.ftav("ftez", ftas(int ), (int)36);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl442
            }
lbl233:
            // 4 sources

            case 3: {
                var22_6 /* !! */  = (int)id.ftav("ftfa", ftas(int ), (int)37);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl762
            }
            case 4: {
                var22_6 /* !! */  = (int)id.ftav("ftfb", ftas(int ), (int)38);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl758
            }
lbl243:
            // 2 sources

            case 5: {
                var22_6 /* !! */  = (int)id.ftav("ftfd", ftas(int ), (int)39);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl362
            }
lbl248:
            // 2 sources

            case 6: {
                var22_6 /* !! */  = (int)id.ftav("ftfe", ftas(int ), (int)40);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl848
            }
lbl253:
            // 4 sources

            case 7: {
                var22_6 /* !! */  = (int)id.ftav("ftff", ftas(int ), (int)41);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl389
            }
lbl258:
            // 2 sources

            case 8: {
                var22_6 /* !! */  = (int)id.ftav("ftfh", ftas(int ), (int)42);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl569
            }
            case 9: {
                var22_6 /* !! */  = (int)id.ftav("ftfk", ftas(int ), (int)43);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl795
            }
            case 10: {
                var22_6 /* !! */  = (int)id.ftav("ftfn", ftas(int ), (int)44);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl399
            }
            case 11: {
                var22_6 /* !! */  = (int)id.ftav("ftfp", ftas(int ), (int)45);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl462
            }
lbl278:
            // 4 sources

            case 12: {
                var22_6 /* !! */  = (int)id.ftav("ftfs", ftas(int ), (int)46);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl526
            }
lbl283:
            // 2 sources

            case 13: {
                var22_6 /* !! */  = (int)id.ftav("ftfv", ftas(int ), (int)47);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl699
            }
lbl288:
            // 3 sources

            case 14: {
                var22_6 /* !! */  = (int)id.ftav("ftga", ftas(int ), (int)48);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl642
            }
lbl293:
            // 3 sources

            case 15: {
                var22_6 /* !! */  = (int)id.ftav("ftgd", ftas(int ), (int)49);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl864
            }
            case 16: {
                var22_6 /* !! */  = (int)id.ftav("ftge", ftas(int ), (int)50);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl884
            }
lbl303:
            // 4 sources

            case 17: {
                var22_6 /* !! */  = (int)id.ftav("ftgf", ftas(int ), (int)51);
                if (!var23_5) ** GOTO lbl253
                throw null;
            }
lbl307:
            // 2 sources

            case 18: {
                var22_6 /* !! */  = (int)id.ftav("ftgg", ftas(int ), (int)52);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl762
            }
lbl312:
            // 2 sources

            case 19: {
                var22_6 /* !! */  = (int)id.ftav("ftgj", ftas(int ), (int)53);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl408
            }
lbl317:
            // 2 sources

            case 20: {
                var22_6 /* !! */  = (int)id.ftav("ftgl", ftas(int ), (int)54);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl876
            }
lbl322:
            // 2 sources

            case 21: {
                var22_6 /* !! */  = (int)id.ftav("ftgq", ftas(int ), (int)55);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl733
            }
lbl327:
            // 3 sources

            case 22: {
                var22_6 /* !! */  = (int)id.ftav("ftgr", ftas(int ), (int)56);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl674
            }
lbl332:
            // 3 sources

            case 23: {
                var22_6 /* !! */  = (int)id.ftav("ftgt", ftas(int ), (int)57);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl565
            }
            case 24: {
                var22_6 /* !! */  = (int)id.ftav("ftgv", ftas(int ), (int)58);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl884
            }
            case 25: {
                var22_6 /* !! */  = (int)id.ftav("ftgy", ftas(int ), (int)59);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl593
            }
            case 26: {
                var22_6 /* !! */  = (int)id.ftav("ftha", ftas(int ), (int)60);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl733
            }
lbl352:
            // 2 sources

            case 27: {
                var22_6 /* !! */  = (int)id.ftav("fthc", ftas(int ), (int)61);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl811
            }
            case 28: {
                var22_6 /* !! */  = (int)id.ftav("fthf", ftas(int ), (int)62);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl521
            }
lbl362:
            // 2 sources

            case 29: {
                var22_6 /* !! */  = (int)id.ftav("fthi", ftas(int ), (int)63);
                if (!var23_5) ** GOTO lbl332
                throw null;
            }
            case 30: {
                var22_6 /* !! */  = (int)id.ftav("fthk", ftas(int ), (int)64);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl530
            }
lbl371:
            // 5 sources

            case 31: {
                var22_6 /* !! */  = (int)id.ftav("fthm", ftas(int ), (int)65);
                if (!var23_5) ** GOTO lbl233
                throw null;
            }
            case 32: {
                var22_6 /* !! */  = (int)id.ftav("ftho", ftas(int ), (int)66);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl754
            }
lbl380:
            // 2 sources

            case 33: {
                var22_6 /* !! */  = (int)id.ftav("fthp", ftas(int ), (int)67);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl413
            }
lbl385:
            // 2 sources

            case 34: {
                var22_6 /* !! */  = (int)id.ftav("fthq", ftas(int ), (int)68);
                if (!var23_5) ** GOTO lbl371
                throw null;
            }
lbl389:
            // 3 sources

            case 35: {
                var22_6 /* !! */  = (int)id.ftav("fthw", ftas(int ), (int)69);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl539
            }
            case 36: {
                var22_6 /* !! */  = (int)id.ftav("fthy", ftas(int ), (int)70);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl799
            }
lbl399:
            // 3 sources

            case 37: {
                var22_6 /* !! */  = (int)id.ftav("fthz", ftas(int ), (int)71);
                if (!var23_5) ** GOTO lbl283
                throw null;
            }
lbl403:
            // 3 sources

            case 38: {
                var22_6 /* !! */  = (int)id.ftav("ftib", ftas(int ), (int)72);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl422
            }
lbl408:
            // 2 sources

            case 39: {
                var22_6 /* !! */  = (int)id.ftav("ftid", ftas(int ), (int)73);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl670
            }
lbl413:
            // 4 sources

            case 40: {
                var22_6 /* !! */  = (int)id.ftav("ftif", ftas(int ), (int)74);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl462
            }
lbl418:
            // 3 sources

            case 41: {
                var22_6 /* !! */  = (int)id.ftav("ftik", ftas(int ), (int)75);
                if (!var23_5) ** GOTO lbl385
                throw null;
            }
lbl422:
            // 2 sources

            case 42: {
                var22_6 /* !! */  = (int)id.ftav("ftil", ftas(int ), (int)76);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl535
            }
lbl427:
            // 2 sources

            case 43: {
                var22_6 /* !! */  = (int)id.ftav("ftim", ftas(int ), (int)77);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl488
            }
lbl432:
            // 2 sources

            case 44: {
                var22_6 /* !! */  = (int)id.ftav("ftio", ftas(int ), (int)78);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl521
            }
lbl437:
            // 2 sources

            case 45: {
                var22_6 /* !! */  = (int)id.ftav("ftiq", ftas(int ), (int)79);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl872
            }
lbl442:
            // 3 sources

            case 46: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var22_6 /* !! */  = (int)id.ftav("ftis", ftas(int ), (int)80);
                    if (var23_5) {
                        throw null;
                    }
                    ** GOTO lbl758
                    break;
                }
            }
            case 47: {
                var22_6 /* !! */  = (int)id.ftav("ftiu", ftas(int ), (int)81);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl828
            }
            case 48: {
                var22_6 /* !! */  = (int)id.ftav("ftix", ftas(int ), (int)82);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl766
            }
lbl458:
            // 2 sources

            case 49: {
                var22_6 /* !! */  = (int)id.ftav("ftiy", ftas(int ), (int)83);
                if (!var23_5) ** GOTO lbl432
                throw null;
            }
lbl462:
            // 3 sources

            case 50: {
                var22_6 /* !! */  = (int)id.ftav("ftjb", ftas(int ), (int)84);
                if (!var23_5) ** GOTO lbl303
                throw null;
            }
lbl466:
            // 3 sources

            case 51: {
                var22_6 /* !! */  = (int)id.ftav("ftjc", ftas(int ), (int)85);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl638
            }
lbl471:
            // 2 sources

            case 52: {
                var22_6 /* !! */  = (int)id.ftav("ftjd", ftas(int ), (int)86);
                if (!var23_5) ** GOTO lbl312
                throw null;
            }
            case 53: {
                var22_6 /* !! */  = (int)id.ftav("ftje", ftas(int ), (int)87);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl721
            }
lbl480:
            // 2 sources

            case 54: {
                var22_6 /* !! */  = (int)id.ftav("ftjh", ftas(int ), (int)88);
                if (!var23_5) ** GOTO lbl322
                throw null;
            }
lbl484:
            // 2 sources

            case 55: {
                var22_6 /* !! */  = (int)id.ftav("ftjl", ftas(int ), (int)89);
                if (!var23_5) ** GOTO lbl293
                throw null;
            }
lbl488:
            // 3 sources

            case 56: {
                var22_6 /* !! */  = (int)id.ftav("ftjn", ftas(int ), (int)90);
                if (!var23_5) ** GOTO lbl278
                throw null;
            }
lbl492:
            // 2 sources

            case 57: {
                var22_6 /* !! */  = (int)id.ftav("ftjp", ftas(int ), (int)91);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl832
            }
            case 58: {
                var22_6 /* !! */  = (int)id.ftav("ftjr", ftas(int ), (int)92);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl521
            }
lbl502:
            // 2 sources

            case 59: {
                var22_6 /* !! */  = (int)id.ftav("ftjt", ftas(int ), (int)93);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl758
            }
lbl507:
            // 3 sources

            case 60: {
                var22_6 /* !! */  = (int)id.ftav("ftju", ftas(int ), (int)94);
                if (!var23_5) ** GOTO lbl332
                throw null;
            }
lbl511:
            // 2 sources

            case 61: {
                var22_6 /* !! */  = (int)id.ftav("ftjv", ftas(int ), (int)95);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl561
            }
            case 62: {
                var22_6 /* !! */  = (int)id.ftav("ftka", ftas(int ), (int)96);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl674
            }
lbl521:
            // 4 sources

            case 63: {
                var22_6 /* !! */  = (int)id.ftav("ftkc", ftas(int ), (int)97);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl778
            }
lbl526:
            // 2 sources

            case 64: {
                var22_6 /* !! */  = (int)id.ftav("ftke", ftas(int ), (int)98);
                if (!var23_5) ** GOTO lbl484
                throw null;
            }
lbl530:
            // 3 sources

            case 65: {
                var22_6 /* !! */  = (int)id.ftav("ftkg", ftas(int ), (int)99);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl683
            }
lbl535:
            // 2 sources

            case 66: {
                var22_6 /* !! */  = (int)id.ftav("ftkh", ftas(int ), (int)100);
                if (!var23_5) ** GOTO lbl413
                throw null;
            }
lbl539:
            // 2 sources

            case 67: {
                var22_6 /* !! */  = (int)id.ftav("ftki", ftas(int ), (int)101);
                if (!var23_5) ** GOTO lbl466
                throw null;
            }
lbl543:
            // 2 sources

            case 68: {
                var22_6 /* !! */  = (int)id.ftav("ftkm", ftas(int ), (int)102);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl832
            }
            case 69: {
                var22_6 /* !! */  = (int)id.ftav("ftkp", ftas(int ), (int)103);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl674
            }
            case 70: {
                var22_6 /* !! */  = (int)id.ftav("ftkq", ftas(int ), (int)104);
                if (!var23_5) ** GOTO lbl248
                throw null;
            }
            case 71: {
                var22_6 /* !! */  = (int)id.ftav("ftks", ftas(int ), (int)105);
                if (!var23_5) ** GOTO lbl327
                throw null;
            }
lbl561:
            // 2 sources

            case 72: {
                var22_6 /* !! */  = (int)id.ftav("ftkv", ftas(int ), (int)106);
                if (!var23_5) ** GOTO lbl288
                throw null;
            }
lbl565:
            // 2 sources

            case 73: {
                var22_6 /* !! */  = (int)id.ftav("ftky", ftas(int ), (int)107);
                if (!var23_5) ** GOTO lbl437
                throw null;
            }
lbl569:
            // 3 sources

            case 74: {
                var22_6 /* !! */  = (int)id.ftav("ftlb", ftas(int ), (int)108);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl674
            }
            case 75: {
                var22_6 /* !! */  = (int)id.ftav("ftle", ftas(int ), (int)109);
                if (!var23_5) ** GOTO lbl278
                throw null;
            }
lbl578:
            // 3 sources

            case 76: {
                var22_6 /* !! */  = (int)id.ftav("ftlh", ftas(int ), (int)110);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl864
            }
lbl583:
            // 2 sources

            case 77: {
                var22_6 /* !! */  = (int)id.ftav("ftlk", ftas(int ), (int)111);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl880
            }
lbl588:
            // 2 sources

            case 78: {
                var22_6 /* !! */  = (int)id.ftav("ftll", ftas(int ), (int)112);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl840
            }
lbl593:
            // 2 sources

            case 79: {
                var22_6 /* !! */  = (int)id.ftav("ftlm", ftas(int ), (int)113);
                if (!var23_5) ** GOTO lbl371
                throw null;
            }
            case 80: {
                var22_6 /* !! */  = (int)id.ftav("ftln", ftas(int ), (int)114);
                if (!var23_5) ** GOTO lbl530
                throw null;
            }
lbl601:
            // 2 sources

            case 81: {
                var22_6 /* !! */  = (int)id.ftav("ftlo", ftas(int ), (int)115);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl695
            }
lbl606:
            // 2 sources

            case 82: {
                var22_6 /* !! */  = (int)id.ftav("ftlp", ftas(int ), (int)116);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl670
            }
            case 83: {
                var22_6 /* !! */  = (int)id.ftav("ftls", ftas(int ), (int)117);
                if (!var23_5) ** GOTO lbl258
                throw null;
            }
lbl615:
            // 2 sources

            case 84: {
                do {
                    var22_6 /* !! */  = (int)id.ftav("ftlv", ftas(int ), (int)118);
                } while (!var23_5);
                throw null;
            }
            case 85: {
                var22_6 /* !! */  = (int)id.ftav("ftly", ftas(int ), (int)119);
                if (!var23_5) ** GOTO lbl492
                throw null;
            }
            case 86: {
                var22_6 /* !! */  = (int)id.ftav("ftlz", ftas(int ), (int)120);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl704
            }
lbl629:
            // 3 sources

            case 87: {
                var22_6 /* !! */  = (int)id.ftav("ftmg", ftas(int ), (int)121);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl811
            }
lbl634:
            // 2 sources

            case 88: {
                var22_6 /* !! */  = (int)id.ftav("ftmi", ftas(int ), (int)122);
                if (!var23_5) ** GOTO lbl418
                throw null;
            }
lbl638:
            // 3 sources

            case 89: {
                var22_6 /* !! */  = (int)id.ftav("ftmj", ftas(int ), (int)123);
                if (!var23_5) ** GOTO lbl488
                throw null;
            }
lbl642:
            // 2 sources

            case 90: {
                var22_6 /* !! */  = (int)id.ftav("ftmm", ftas(int ), (int)124);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl799
            }
lbl647:
            // 2 sources

            case 91: {
                var22_6 /* !! */  = (int)id.ftav("ftmq", ftas(int ), (int)125);
                if (!var23_5) ** GOTO lbl418
                throw null;
            }
            case 92: {
                var22_6 /* !! */  = (int)id.ftav("ftmt", ftas(int ), (int)126);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl774
            }
lbl656:
            // 2 sources

            case 93: {
                var22_6 /* !! */  = (int)id.ftav("ftmu", ftas(int ), (int)127);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl738
            }
lbl661:
            // 2 sources

            case 94: {
                var22_6 /* !! */  = (int)id.ftav("ftmx", ftas(int ), (int)128);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl868
            }
            case 95: {
                var22_6 /* !! */  = (int)id.ftav("ftmz", ftas(int ), (int)129);
                if (!var23_5) ** GOTO lbl543
                throw null;
            }
lbl670:
            // 3 sources

            case 96: {
                var22_6 /* !! */  = (int)id.ftav("ftnb", ftas(int ), (int)130);
                if (!var23_5) ** GOTO lbl588
                throw null;
            }
lbl674:
            // 5 sources

            case 97: {
                var22_6 /* !! */  = (int)id.ftav("ftnd", ftas(int ), (int)131);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl876
            }
            case 98: {
                var22_6 /* !! */  = (int)id.ftav("ftnf", ftas(int ), (int)132);
                if (!var23_5) ** GOTO lbl629
                throw null;
            }
lbl683:
            // 2 sources

            case 99: {
                var22_6 /* !! */  = (int)id.ftav("ftnh", ftas(int ), (int)133);
                if (!var23_5) ** GOTO lbl307
                throw null;
            }
            case 100: {
                var22_6 /* !! */  = (int)id.ftav("ftni", ftas(int ), (int)134);
                if (!var23_5) ** GOTO lbl317
                throw null;
            }
            case 101: {
                var22_6 /* !! */  = (int)id.ftav("ftnk", ftas(int ), (int)135);
                if (!var23_5) ** GOTO lbl442
                throw null;
            }
lbl695:
            // 2 sources

            case 102: {
                var22_6 /* !! */  = (int)id.ftav("ftnm", ftas(int ), (int)136);
                if (!var23_5) ** GOTO lbl303
                throw null;
            }
lbl699:
            // 2 sources

            case 103: {
                var22_6 /* !! */  = (int)id.ftav("ftno", ftas(int ), (int)137);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl848
            }
lbl704:
            // 2 sources

            case 104: {
                var22_6 /* !! */  = (int)id.ftav("ftnq", ftas(int ), (int)138);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl762
            }
            case 105: {
                var22_6 /* !! */  = (int)id.ftav("ftns", ftas(int ), (int)139);
                if (!var23_5) ** GOTO lbl507
                throw null;
            }
lbl713:
            // 2 sources

            case 106: {
                var22_6 /* !! */  = (int)id.ftav("ftnu", ftas(int ), (int)140);
                if (!var23_5) ** GOTO lbl371
                throw null;
            }
            case 107: {
                var22_6 /* !! */  = (int)id.ftav("ftnw", ftas(int ), (int)141);
                if (!var23_5) ** GOTO lbl629
                throw null;
            }
lbl721:
            // 2 sources

            case 108: {
                var22_6 /* !! */  = (int)id.ftav("ftnx", ftas(int ), (int)142);
                if (!var23_5) ** GOTO lbl615
                throw null;
            }
            case 109: {
                var22_6 /* !! */  = (int)id.ftav("ftoa", ftas(int ), (int)143);
                if (!var23_5) ** GOTO lbl606
                throw null;
            }
            case 110: {
                var22_6 /* !! */  = (int)id.ftav("ftoc", ftas(int ), (int)144);
                if (!var23_5) ** GOTO lbl403
                throw null;
            }
lbl733:
            // 4 sources

            case 111: {
                var22_6 /* !! */  = (int)id.ftav("ftoe", ftas(int ), (int)145);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl778
            }
lbl738:
            // 3 sources

            case 112: {
                var22_6 /* !! */  = (int)id.ftav("ftof", ftas(int ), (int)146);
                if (!var23_5) ** GOTO lbl647
                throw null;
            }
            case 113: {
                var22_6 /* !! */  = (int)id.ftav("ftoh", ftas(int ), (int)147);
                if (!var23_5) ** GOTO lbl371
                throw null;
            }
            case 114: {
                var22_6 /* !! */  = (int)id.ftav("ftoi", ftas(int ), (int)148);
                if (!var23_5) ** GOTO lbl389
                throw null;
            }
            case 115: {
                var22_6 /* !! */  = (int)id.ftav("ftoj", ftas(int ), (int)149);
                if (!var23_5) ** GOTO lbl583
                throw null;
            }
lbl754:
            // 2 sources

            case 116: {
                var22_6 /* !! */  = (int)id.ftav("ftok", ftas(int ), (int)150);
                if (!var23_5) ** GOTO lbl471
                throw null;
            }
lbl758:
            // 4 sources

            case 117: {
                var22_6 /* !! */  = (int)id.ftav("ftol", ftas(int ), (int)151);
                if (!var23_5) ** GOTO lbl327
                throw null;
            }
lbl762:
            // 4 sources

            case 118: {
                var22_6 /* !! */  = (int)id.ftav("ftom", ftas(int ), (int)152);
                if (!var23_5) ** GOTO lbl303
                throw null;
            }
lbl766:
            // 2 sources

            case 119: {
                var22_6 /* !! */  = (int)id.ftav("fton", ftas(int ), (int)153);
                if (!var23_5) ** GOTO lbl502
                throw null;
            }
            case 120: {
                var22_6 /* !! */  = (int)id.ftav("ftoo", ftas(int ), (int)154);
                if (!var23_5) ** GOTO lbl713
                throw null;
            }
lbl774:
            // 2 sources

            case 121: {
                var22_6 /* !! */  = (int)id.ftav("ftop", ftas(int ), (int)155);
                if (!var23_5) ** GOTO lbl458
                throw null;
            }
lbl778:
            // 4 sources

            case 122: {
                var22_6 /* !! */  = (int)id.ftav("ftoq", ftas(int ), (int)156);
                if (!var23_5) ** GOTO lbl243
                throw null;
            }
lbl782:
            // 2 sources

            case 123: {
                var22_6 /* !! */  = (int)id.ftav("ftor", ftas(int ), (int)157);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl876
            }
            case 124: {
                var22_6 /* !! */  = (int)id.ftav("ftot", ftas(int ), (int)158);
                if (!var23_5) ** GOTO lbl278
                throw null;
            }
            case 125: {
                var22_6 /* !! */  = (int)id.ftav("ftou", ftas(int ), (int)159);
                if (!var23_5) ** GOTO lbl413
                throw null;
            }
lbl795:
            // 2 sources

            case 126: {
                var22_6 /* !! */  = (int)id.ftav("ftov", ftas(int ), (int)160);
                if (!var23_5) ** GOTO lbl634
                throw null;
            }
lbl799:
            // 4 sources

            case 127: {
                var22_6 /* !! */  = (int)id.ftav("ftow", ftas(int ), (int)161);
                if (!var23_5) ** GOTO lbl403
                throw null;
            }
            case 128: {
                var22_6 /* !! */  = (int)id.ftav("ftoy", ftas(int ), (int)162);
                if (!var23_5) ** GOTO lbl399
                throw null;
            }
            case 129: {
                var22_6 /* !! */  = (int)id.ftav("ftoz", ftas(int ), (int)163);
                if (!var23_5) ** GOTO lbl511
                throw null;
            }
lbl811:
            // 3 sources

            case 130: {
                var22_6 /* !! */  = (int)id.ftav("ftpa", ftas(int ), (int)164);
                if (!var23_5) ** GOTO lbl578
                throw null;
            }
            case 131: {
                var22_6 /* !! */  = (int)id.ftav("ftpb", ftas(int ), (int)165);
                if (var23_5) {
                    throw null;
                }
                ** GOTO lbl880
            }
            case 132: {
                var22_6 /* !! */  = (int)id.ftav("ftpc", ftas(int ), (int)166);
                if (!var23_5) ** GOTO lbl253
                throw null;
            }
            case 133: {
                var22_6 /* !! */  = (int)id.ftav("ftpd", ftas(int ), (int)167);
                if (!var23_5) ** GOTO lbl380
                throw null;
            }
lbl828:
            // 2 sources

            case 134: {
                var22_6 /* !! */  = (int)id.ftav("ftpe", ftas(int ), (int)168);
                if (!var23_5) ** GOTO lbl427
                throw null;
            }
lbl832:
            // 3 sources

            case 135: {
                var22_6 /* !! */  = (int)id.ftav("ftpg", ftas(int ), (int)169);
                if (!var23_5) ** GOTO lbl578
                throw null;
            }
            case 136: {
                var22_6 /* !! */  = (int)id.ftav("ftph", ftas(int ), (int)170);
                if (!var23_5) ** GOTO lbl661
                throw null;
            }
lbl840:
            // 2 sources

            case 137: {
                var22_6 /* !! */  = (int)id.ftav("ftpi", ftas(int ), (int)171);
                if (!var23_5) ** GOTO lbl288
                throw null;
            }
            case 138: {
                var22_6 /* !! */  = (int)id.ftav("ftpj", ftas(int ), (int)172);
                if (!var23_5) ** GOTO lbl733
                throw null;
            }
lbl848:
            // 3 sources

            case 139: {
                var22_6 /* !! */  = (int)id.ftav("ftpk", ftas(int ), (int)173);
                if (!var23_5) ** GOTO lbl293
                throw null;
            }
            case 140: {
                var22_6 /* !! */  = (int)id.ftav("ftpm", ftas(int ), (int)174);
                if (!var23_5) ** GOTO lbl569
                throw null;
            }
            case 141: {
                var22_6 /* !! */  = (int)id.ftav("ftpo", ftas(int ), (int)175);
                if (!var23_5) ** GOTO lbl233
                throw null;
            }
            case 142: {
                var22_6 /* !! */  = (int)id.ftav("ftpp", ftas(int ), (int)176);
                if (!var23_5) ** GOTO lbl507
                throw null;
            }
lbl864:
            // 3 sources

            case 143: {
                var22_6 /* !! */  = (int)id.ftav("ftpq", ftas(int ), (int)177);
                if (!var23_5) ** GOTO lbl656
                throw null;
            }
lbl868:
            // 2 sources

            case 144: {
                var22_6 /* !! */  = (int)id.ftav("ftpr", ftas(int ), (int)178);
                if (!var23_5) ** GOTO lbl253
                throw null;
            }
lbl872:
            // 2 sources

            case 145: {
                var22_6 /* !! */  = (int)id.ftav("ftps", ftas(int ), (int)179);
                if (!var23_5) ** GOTO lbl352
                throw null;
            }
lbl876:
            // 4 sources

            case 146: {
                var22_6 /* !! */  = (int)id.ftav("ftpt", ftas(int ), (int)180);
                if (!var23_5) ** GOTO lbl638
                throw null;
            }
lbl880:
            // 3 sources

            case 147: {
                var22_6 /* !! */  = (int)id.ftav("ftpu", ftas(int ), (int)181);
                if (!var23_5) ** GOTO lbl466
                throw null;
            }
lbl884:
            // 3 sources

            case 148: {
                var22_6 /* !! */  = (int)id.ftav("ftpv", ftas(int ), (int)182);
                if (!var23_5) ** GOTO lbl233
                throw null;
            }
            case 149: {
                var22_6 /* !! */  = (int)id.ftav("ftpw", ftas(int ), (int)183);
                if (!var23_5) ** GOTO lbl778
                throw null;
            }
            case 150: {
                var22_6 /* !! */  = (int)id.ftav("ftpx", ftas(int ), (int)184);
                if (!var23_5) ** GOTO lbl782
                throw null;
            }
            case 151: {
                var22_6 /* !! */  = (int)id.ftav("ftpy", ftas(int ), (int)185);
                if (!var23_5) ** GOTO lbl480
                throw null;
            }
            case 152: {
                var22_6 /* !! */  = (int)id.ftav("ftpz", ftas(int ), (int)186);
                if (!var23_5) ** GOTO lbl601
                throw null;
            }
            case 153: 
        }
        var22_6 /* !! */  = (int)id.ftav("ftqa", ftas(int ), (int)187);
        ** while (!var23_5)
lbl907:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int ftas(int n2) {
        return ftat[n2] ^ ftau[n2];
    }

    private static /* synthetic */ void fujy() {
        id.ftau[400] = -1874878538;
        id.ftau[401] = -797183759;
        id.ftau[402] = -459156574;
        id.ftau[403] = 619994346;
        id.ftau[404] = 480920149;
        id.ftau[405] = -1279564269;
        id.ftau[406] = 1893009664;
        id.ftau[407] = 245564963;
        id.ftau[408] = 775551952;
        id.ftau[409] = 1279328797;
        id.ftau[410] = 1328435678;
        id.ftau[411] = -1293555438;
        id.ftau[412] = 1554482869;
        id.ftau[413] = 185293589;
        id.ftau[414] = 1616196000;
        id.ftau[415] = -1495065720;
        id.ftau[416] = -991374580;
        id.ftau[417] = -1075314826;
        id.ftau[418] = -189074385;
        id.ftau[419] = -1021048059;
        id.ftau[420] = -60744523;
        id.ftau[421] = -5166884;
        id.ftau[422] = -1158100791;
        id.ftau[423] = 1277984063;
        id.ftau[424] = -225235967;
        id.ftau[425] = 689875586;
        id.ftau[426] = 249624198;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private long attackElapsedTime() {
        v0 /* !! */  = id.mx;
        if (true) ** GOTO lbl5
        block43: while (true) {
            v0 /* !! */  = (long)(id.ftav("fuag", ftbg(int ), (int)144) - id.ftav("fuaf", ftbg(int ), (int)143));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -351994481: {
                    break block43;
                }
                case 1169759446: {
                    continue block43;
                }
            }
            break;
        }
        var3_1 = id.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_0 = id.mx - id.ftav("fuah", ftbg(int ), (int)145)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == id.ftav("fuai", ftas(int ), (int)320)) break;
            v1 /* !! */  = (long)id.ftav("fuaj", ftas(int ), (int)321);
        }
        var2_2 /* !! */  = id.b;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v2 /* !! */  = id.mx;
                if (true) ** GOTO lbl24
                block45: while (true) {
                    v2 /* !! */  = (long)(v3 - id.ftav("fuak", ftbg(int ), (int)146));
lbl24:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -351994481: {
                            break block45;
                        }
                        case 487543896: {
                            v3 = id.ftav("fual", ftbg(int ), (int)147);
                            continue block45;
                        }
                        case 1167385958: {
                            v3 = id.ftav("fuam", ftbg(int ), (int)148);
                            continue block45;
                        }
                        case 1197368740: {
                            v3 = id.ftav("fuan", ftbg(int ), (int)149);
                            continue block45;
                        }
                    }
                    break;
                }
                var1_3 = id.a;
                if (var3_1) {
                    throw null;
lbl39:
                    // 5 sources

                    return (long)id.ftav("fuao", ftbg(int ), (int)150);
                }
                if (var1_3 || var1_3) ** GOTO lbl39
                v4 /* !! */  = id.mx;
                if (true) ** GOTO lbl46
                block47: while (true) {
                    v4 /* !! */  = (long)(v5 - id.ftav("fuap", ftbg(int ), (int)151));
lbl46:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -926279466: {
                            v5 = id.ftav("fuaq", ftbg(int ), (int)152);
                            continue block47;
                        }
                        case -876683257: {
                            v5 = id.ftav("fuar", ftbg(int ), (int)153);
                            continue block47;
                        }
                        case -351994481: {
                            break block47;
                        }
                        case 859238847: {
                            v5 = id.ftav("fuas", ftbg(int ), (int)154);
                            continue block47;
                        }
                    }
                    break;
                }
                if (d.getInstance() == null) ** GOTO lbl88
                if (var1_3) ** GOTO lbl39
                v6 /* !! */  = id.mx;
                if (true) ** GOTO lbl64
                block48: while (true) {
                    v6 /* !! */  = (long)(v7 - id.ftav("fuat", ftbg(int ), (int)155));
lbl64:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1690384078: {
                            v7 = id.ftav("fuau", ftbg(int ), (int)156);
                            continue block48;
                        }
                        case -1188215004: {
                            v7 = id.ftav("fuav", ftbg(int ), (int)157);
                            continue block48;
                        }
                        case -351994481: {
                            break block48;
                        }
                        case -125801613: {
                            v7 = id.ftav("fuaw", ftbg(int ), (int)158);
                            continue block48;
                        }
                    }
                    break;
                }
                v8 = d.getInstance();
                v9 /* !! */  = id.mx;
                if (true) ** GOTO lbl81
                block49: while (true) {
                    v9 /* !! */  = (long)(id.ftav("fuay", ftbg(int ), (int)160) - id.ftav("fuax", ftbg(int ), (int)159));
lbl81:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -351994481: {
                            break block49;
                        }
                        case 829585047: {
                            continue block49;
                        }
                    }
                    break;
                }
                if (v8.getManager() != null) ** GOTO lbl90
                if (var1_3) ** GOTO lbl39
lbl88:
                // 2 sources

                if (var1_3 || var1_3) ** GOTO lbl39
                return (long)id.ftav("fuaz", ftbg(int ), (int)161);
lbl90:
                // 1 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_1 = id.mx - id.ftav("fuba", ftbg(int ), (int)162)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == id.ftav("fubb", ftas(int ), (int)322)) break;
                    v10 /* !! */  = (long)id.ftav("fubc", ftas(int ), (int)323);
                }
                v11 = d.getInstance();
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_2 = id.mx - id.ftav("fubd", ftbg(int ), (int)163)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == id.ftav("fube", ftas(int ), (int)324)) break;
                    v12 /* !! */  = (long)id.ftav("fubf", ftas(int ), (int)325);
                }
                v13 = v11.getManager();
                v14 /* !! */  = id.mx;
                if (true) ** GOTO lbl108
                block52: while (true) {
                    v14 /* !! */  = (long)(id.ftav("fubh", ftbg(int ), (int)165) - id.ftav("fubg", ftbg(int ), (int)164));
lbl108:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1332594646: {
                            continue block52;
                        }
                        case -351994481: {
                            break block52;
                        }
                    }
                    break;
                }
                v15 = v13.getAttackPerpetrator();
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_3 = id.mx - id.ftav("fubi", ftbg(int ), (int)166)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == id.ftav("fubj", ftas(int ), (int)326)) break;
                    v16 /* !! */  = (long)id.ftav("fubk", ftas(int ), (int)327);
                }
                v17 = v15.getAttackHandler();
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_4 = id.mx - id.ftav("fubl", ftbg(int ), (int)167)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == id.ftav("fubm", ftas(int ), (int)328)) break;
                    v18 /* !! */  = (long)id.ftav("fubn", ftas(int ), (int)329);
                }
                v19 = v17.getAttackTimer();
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_5 = id.mx - id.ftav("fubo", ftbg(int ), (int)168)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == id.ftav("fubp", ftas(int ), (int)330)) break;
                    v20 /* !! */  = (long)id.ftav("fubq", ftas(int ), (int)331);
                }
                return v19.elapsedTime();
            }
lbl132:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)id.ftav("fubr", ftas(int ), (int)332);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl173
            }
lbl137:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)id.ftav("fubs", ftas(int ), (int)333);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl169
            }
lbl142:
            // 2 sources

            case 2: {
                var2_2 /* !! */  = (int)id.ftav("fubt", ftas(int ), (int)334);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 3: {
                var2_2 /* !! */  = (int)id.ftav("fubu", ftas(int ), (int)335);
                if (!var3_1) ** GOTO lbl137
                throw null;
            }
lbl151:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)id.ftav("fubv", ftas(int ), (int)336);
                if (var3_1) {
                    throw null;
                }
            }
            case 5: {
                var2_2 /* !! */  = (int)id.ftav("fubw", ftas(int ), (int)337);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl173
            }
            case 6: {
                var2_2 /* !! */  = (int)id.ftav("fubx", ftas(int ), (int)338);
                if (!var3_1) ** GOTO lbl151
                throw null;
            }
            case 7: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)id.ftav("fuby", ftas(int ), (int)339);
                    if (!var3_1) break block4;
                    throw null;
                }
            }
lbl169:
            // 2 sources

            case 8: {
                var2_2 /* !! */  = (int)id.ftav("fubz", ftas(int ), (int)340);
                if (!var3_1) ** GOTO lbl132
                throw null;
            }
lbl173:
            // 4 sources

            case 9: {
                var2_2 /* !! */  = (int)id.ftav("fuca", ftas(int ), (int)341);
                if (!var3_1) ** GOTO lbl142
                throw null;
            }
            case 10: 
        }
        var2_2 /* !! */  = (int)id.ftav("fucb", ftas(int ), (int)342);
        ** while (!var3_1)
lbl180:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fujt() {
        id.ftat[400] = -1874878537;
        id.ftat[401] = -797183756;
        id.ftat[402] = -459156576;
        id.ftat[403] = 619994348;
        id.ftat[404] = 480920157;
        id.ftat[405] = -1279564268;
        id.ftat[406] = 1893009673;
        id.ftat[407] = 245564965;
        id.ftat[408] = 775551937;
        id.ftat[409] = 1279328788;
        id.ftat[410] = 1328435669;
        id.ftat[411] = -1293555434;
        id.ftat[412] = 1554482864;
        id.ftat[413] = 185293589;
        id.ftat[414] = 1616196012;
        id.ftat[415] = -1495065719;
        id.ftat[416] = -516803471;
        id.ftat[417] = 1075314825;
        id.ftat[418] = -74612967;
        id.ftat[419] = -1021048060;
        id.ftat[420] = 203618147;
        id.ftat[421] = -5166884;
        id.ftat[422] = -1158100790;
        id.ftat[423] = 1277984059;
        id.ftat[424] = -225235968;
        id.ftat[425] = 689875585;
        id.ftat[426] = 249624197;
    }

    private static /* synthetic */ void fujv() {
        id.ftau[100] = 1868462639;
        id.ftau[101] = -1845227962;
        id.ftau[102] = 410983105;
        id.ftau[103] = -630620204;
        id.ftau[104] = -1702579583;
        id.ftau[105] = 802862022;
        id.ftau[106] = 108166793;
        id.ftau[107] = 187178906;
        id.ftau[108] = 278263066;
        id.ftau[109] = -334069118;
        id.ftau[110] = -1838731628;
        id.ftau[111] = 250443458;
        id.ftau[112] = -1247198834;
        id.ftau[113] = 1441436900;
        id.ftau[114] = -1331345393;
        id.ftau[115] = -2147021671;
        id.ftau[116] = 240105998;
        id.ftau[117] = 1896345659;
        id.ftau[118] = 759122316;
        id.ftau[119] = 554470225;
        id.ftau[120] = -587036913;
        id.ftau[121] = -1961047673;
        id.ftau[122] = 914938186;
        id.ftau[123] = 1178813168;
        id.ftau[124] = -1172778708;
        id.ftau[125] = 71484307;
        id.ftau[126] = 1379740601;
        id.ftau[127] = -1329436788;
        id.ftau[128] = 1644754251;
        id.ftau[129] = 2127198793;
        id.ftau[130] = -540619204;
        id.ftau[131] = 1809874613;
        id.ftau[132] = -867805441;
        id.ftau[133] = -1830555839;
        id.ftau[134] = 1492310576;
        id.ftau[135] = -653938639;
        id.ftau[136] = -1505790675;
        id.ftau[137] = -1299666022;
        id.ftau[138] = -1099574228;
        id.ftau[139] = 260435438;
        id.ftau[140] = -1877596943;
        id.ftau[141] = -1962562803;
        id.ftau[142] = 390642570;
        id.ftau[143] = 2028021556;
        id.ftau[144] = -1645865278;
        id.ftau[145] = 1624269887;
        id.ftau[146] = 1967722022;
        id.ftau[147] = -50922727;
        id.ftau[148] = -1223947821;
        id.ftau[149] = -1322024363;
        id.ftau[150] = 1726923877;
        id.ftau[151] = -1197564358;
        id.ftau[152] = -1490923076;
        id.ftau[153] = -1189796915;
        id.ftau[154] = 966232441;
        id.ftau[155] = -1561663577;
        id.ftau[156] = 680366681;
        id.ftau[157] = 1373745804;
        id.ftau[158] = -1844005918;
        id.ftau[159] = 1835907359;
        id.ftau[160] = 415159794;
        id.ftau[161] = 851683634;
        id.ftau[162] = 237879863;
        id.ftau[163] = -2125646212;
        id.ftau[164] = 16671132;
        id.ftau[165] = -301868619;
        id.ftau[166] = 1099522085;
        id.ftau[167] = 556826736;
        id.ftau[168] = 1843719134;
        id.ftau[169] = -1377629907;
        id.ftau[170] = 538654648;
        id.ftau[171] = 1177609841;
        id.ftau[172] = 1507793302;
        id.ftau[173] = -1961954068;
        id.ftau[174] = -160886055;
        id.ftau[175] = -816331791;
        id.ftau[176] = 2121360669;
        id.ftau[177] = 1968313553;
        id.ftau[178] = 1659769111;
        id.ftau[179] = -1895793453;
        id.ftau[180] = 1655755689;
        id.ftau[181] = -1070944547;
        id.ftau[182] = 1379071401;
        id.ftau[183] = -621196007;
        id.ftau[184] = -976806669;
        id.ftau[185] = -69529594;
        id.ftau[186] = 101634483;
        id.ftau[187] = -1430986783;
        id.ftau[188] = -1640648653;
        id.ftau[189] = 1906269452;
        id.ftau[190] = -358309520;
        id.ftau[191] = -525402322;
        id.ftau[192] = -1054685273;
        id.ftau[193] = 1119989461;
        id.ftau[194] = 980421267;
        id.ftau[195] = -1545083523;
        id.ftau[196] = 44070797;
        id.ftau[197] = -2109036535;
        id.ftau[198] = -929607582;
        id.ftau[199] = -109030004;
    }

    static {
        ftau = new int[427];
        id.fujp();
        id.fujq();
        id.fujr();
        id.fujs();
        id.fujt();
        id.fuju();
        id.fujv();
        id.fujw();
        id.fujx();
        id.fujy();
        ftbh = new long[280];
        ftbi = new long[280];
        id.fujz();
        id.fuka();
        id.fukb();
        id.fukc();
        id.fukd();
        id.fuke();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float randomFloat(float var1_1, float var2_2) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = id.mx - id.ftav("fucc", ftbg(int ), (int)169)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == id.ftav("fucd", ftas(int ), (int)343)) break;
            v0 /* !! */  = (long)id.ftav("fuce", ftas(int ), (int)344);
        }
        var5_3 = id.c;
        v1 /* !! */  = id.mx;
        if (true) ** GOTO lbl11
        block20: while (true) {
            v1 /* !! */  = (long)(v2 - id.ftav("fucf", ftbg(int ), (int)170));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1620932646: {
                    v2 = id.ftav("fucg", ftbg(int ), (int)171);
                    continue block20;
                }
                case -351994481: {
                    break block20;
                }
                case 797984832: {
                    v2 = id.ftav("fuch", ftbg(int ), (int)172);
                    continue block20;
                }
                case 1149184841: {
                    v2 = id.ftav("fuci", ftbg(int ), (int)173);
                    continue block20;
                }
            }
            break;
        }
        var4_4 = id.b;
        v3 /* !! */  = id.mx;
        if (true) ** GOTO lbl28
        block21: while (true) {
            v3 /* !! */  = (long)(id.ftav("fuck", ftbg(int ), (int)175) - id.ftav("fucj", ftbg(int ), (int)174));
lbl28:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -351994481: {
                    break block21;
                }
                case 459242075: {
                    continue block21;
                }
            }
            break;
        }
        var3_5 = id.a;
        if (var5_3) {
            throw null;
lbl36:
            // 1 sources

            return (float)id.ftav("fucl", ftbn(int ), (int)345);
        }
        ** while (var3_5 || var3_5)
lbl39:
        // 1 sources

        v4 /* !! */  = id.mx;
        if (true) ** GOTO lbl43
        block23: while (true) {
            v4 /* !! */  = (long)(v5 - id.ftav("fucm", ftbg(int ), (int)176));
lbl43:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -351994481: {
                    break block23;
                }
                case 868419414: {
                    v5 = id.ftav("fucn", ftbg(int ), (int)177);
                    continue block23;
                }
                case 2134733563: {
                    v5 = id.ftav("fuco", ftbg(int ), (int)178);
                    continue block23;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_1 = id.mx - id.ftav("fucp", ftbg(int ), (int)179)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == id.ftav("fucq", ftas(int ), (int)346)) break;
            v6 /* !! */  = (long)id.ftav("fucr", ftas(int ), (int)347);
        }
        v7 = this.secureRandom.nextFloat();
        v8 /* !! */  = id.mx;
        if (true) ** GOTO lbl62
        block25: while (true) {
            v8 /* !! */  = (long)(id.ftav("fuct", ftbg(int ), (int)181) - id.ftav("fucs", ftbg(int ), (int)180));
lbl62:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -2050852630: {
                    continue block25;
                }
                case -351994481: {
                    break block25;
                }
            }
            break;
        }
        return class_3532.method_16439((float)v7, (float)var1_1, (float)var2_2);
    }

    private static /* synthetic */ void fuka() {
        id.ftbh[100] = -7260636609683272787L;
        id.ftbh[101] = -6660195381379268185L;
        id.ftbh[102] = 2575621870988102740L;
        id.ftbh[103] = -1917523338822840990L;
        id.ftbh[104] = 3004544177387282439L;
        id.ftbh[105] = -5504064240942170713L;
        id.ftbh[106] = -966816797615576856L;
        id.ftbh[107] = -5881583058744503126L;
        id.ftbh[108] = -4263105953139113449L;
        id.ftbh[109] = -6952970151988628684L;
        id.ftbh[110] = -3363913311628042973L;
        id.ftbh[111] = 7400021284473272042L;
        id.ftbh[112] = 7385691816961778401L;
        id.ftbh[113] = -961757697306848529L;
        id.ftbh[114] = -2025944317751854510L;
        id.ftbh[115] = 7005899749405648299L;
        id.ftbh[116] = -7298413681511238183L;
        id.ftbh[117] = -193548900622450805L;
        id.ftbh[118] = 6339769385883988098L;
        id.ftbh[119] = 456515873913639419L;
        id.ftbh[120] = -6174451731350758341L;
        id.ftbh[121] = -2339655343090425973L;
        id.ftbh[122] = 1457837667750693736L;
        id.ftbh[123] = -5389844307816681789L;
        id.ftbh[124] = -2494141615629725373L;
        id.ftbh[125] = 8851141870529276303L;
        id.ftbh[126] = -4903911507737307507L;
        id.ftbh[127] = 6518104939171133094L;
        id.ftbh[128] = 4199444504662666958L;
        id.ftbh[129] = 4111051718224045311L;
        id.ftbh[130] = -3753939170188395143L;
        id.ftbh[131] = -3129025886464964584L;
        id.ftbh[132] = -7305865676035030035L;
        id.ftbh[133] = -3030878492217351344L;
        id.ftbh[134] = 3153071076037101405L;
        id.ftbh[135] = -4775042471184684932L;
        id.ftbh[136] = 6392623779189834423L;
        id.ftbh[137] = 1695440613662092943L;
        id.ftbh[138] = -6188711014766714136L;
        id.ftbh[139] = 2640073325101113842L;
        id.ftbh[140] = -280480703374202900L;
        id.ftbh[141] = -6910005516262321076L;
        id.ftbh[142] = 6129759679401878630L;
        id.ftbh[143] = 454647213182339363L;
        id.ftbh[144] = -3634564114794717046L;
        id.ftbh[145] = 6219875833096440482L;
        id.ftbh[146] = 159551925516094323L;
        id.ftbh[147] = 5773385619618432096L;
        id.ftbh[148] = 3274520345865912213L;
        id.ftbh[149] = 6657533389717095097L;
        id.ftbh[150] = -3363985625697406260L;
        id.ftbh[151] = 8494988592208952070L;
        id.ftbh[152] = 5340935614516912949L;
        id.ftbh[153] = -3145691444373125109L;
        id.ftbh[154] = -4370401757177538194L;
        id.ftbh[155] = -7147803726998273083L;
        id.ftbh[156] = -481125467538968095L;
        id.ftbh[157] = 2289489828230872298L;
        id.ftbh[158] = 5486123372847970087L;
        id.ftbh[159] = -6995286822068875889L;
        id.ftbh[160] = -4106309005219671869L;
        id.ftbh[161] = 3852216855225980691L;
        id.ftbh[162] = 7955807198015113982L;
        id.ftbh[163] = 9134749087768776595L;
        id.ftbh[164] = -5446049615393941212L;
        id.ftbh[165] = 479209244956961727L;
        id.ftbh[166] = 2625528220368025692L;
        id.ftbh[167] = -7767131803715213933L;
        id.ftbh[168] = -4349664911212975976L;
        id.ftbh[169] = 7575974406664231298L;
        id.ftbh[170] = 8704139184887607224L;
        id.ftbh[171] = 2335239699966256368L;
        id.ftbh[172] = -3353164471420606521L;
        id.ftbh[173] = -5854647622688824588L;
        id.ftbh[174] = 1039352936625577306L;
        id.ftbh[175] = -2526634484826806459L;
        id.ftbh[176] = 2391347920988338591L;
        id.ftbh[177] = -1395031882503898188L;
        id.ftbh[178] = -2803889599363218491L;
        id.ftbh[179] = -2922798232888057226L;
        id.ftbh[180] = -6259348188166199304L;
        id.ftbh[181] = -1916241278560779815L;
        id.ftbh[182] = -5686616183334309695L;
        id.ftbh[183] = -3933432970386323971L;
        id.ftbh[184] = -6469190830137861353L;
        id.ftbh[185] = -2856421127657185861L;
        id.ftbh[186] = 6454981009593835309L;
        id.ftbh[187] = 2064739354333959575L;
        id.ftbh[188] = 6942392597823939670L;
        id.ftbh[189] = -4186285817325970076L;
        id.ftbh[190] = -997062576951817871L;
        id.ftbh[191] = 1546846213479676222L;
        id.ftbh[192] = -2655055009594403875L;
        id.ftbh[193] = -2557578027872955124L;
        id.ftbh[194] = 5389844315498305188L;
        id.ftbh[195] = 1144791287046606121L;
        id.ftbh[196] = -3835672592319925192L;
        id.ftbh[197] = 5122511717251985487L;
        id.ftbh[198] = 181294481825944697L;
        id.ftbh[199] = 8366309338277787176L;
    }

    private static /* synthetic */ void fuju() {
        id.ftau[0] = -1991174805;
        id.ftau[1] = -1106530564;
        id.ftau[2] = 391905074;
        id.ftau[3] = 1870216053;
        id.ftau[4] = -1486615911;
        id.ftau[5] = -1149869873;
        id.ftau[6] = 2073163689;
        id.ftau[7] = 768290703;
        id.ftau[8] = 731897497;
        id.ftau[9] = 546025904;
        id.ftau[10] = -1911079654;
        id.ftau[11] = -796542012;
        id.ftau[12] = 857260904;
        id.ftau[13] = 568430097;
        id.ftau[14] = 1695985565;
        id.ftau[15] = -1489603338;
        id.ftau[16] = 1385592784;
        id.ftau[17] = 1552205431;
        id.ftau[18] = -523523503;
        id.ftau[19] = -114191185;
        id.ftau[20] = -288106434;
        id.ftau[21] = 1125950882;
        id.ftau[22] = -371726705;
        id.ftau[23] = 201564696;
        id.ftau[24] = -492298217;
        id.ftau[25] = -1790418467;
        id.ftau[26] = 1182039987;
        id.ftau[27] = -929493304;
        id.ftau[28] = 1665760753;
        id.ftau[29] = -445631155;
        id.ftau[30] = -473731643;
        id.ftau[31] = -256332158;
        id.ftau[32] = -1985062388;
        id.ftau[33] = -820495097;
        id.ftau[34] = 989513840;
        id.ftau[35] = 1265283866;
        id.ftau[36] = -1465944108;
        id.ftau[37] = -437702372;
        id.ftau[38] = -1434615719;
        id.ftau[39] = -1610813922;
        id.ftau[40] = 1341682971;
        id.ftau[41] = 2063000504;
        id.ftau[42] = -185877542;
        id.ftau[43] = 2143782621;
        id.ftau[44] = 234089913;
        id.ftau[45] = 1579026885;
        id.ftau[46] = 250298516;
        id.ftau[47] = -1187424735;
        id.ftau[48] = -1777743236;
        id.ftau[49] = -2018446279;
        id.ftau[50] = 1797270864;
        id.ftau[51] = 554613411;
        id.ftau[52] = 588770964;
        id.ftau[53] = -4113490;
        id.ftau[54] = 690094075;
        id.ftau[55] = -1212366656;
        id.ftau[56] = 1570625329;
        id.ftau[57] = -635432655;
        id.ftau[58] = 95188977;
        id.ftau[59] = 1748668779;
        id.ftau[60] = 1914704234;
        id.ftau[61] = -2133702567;
        id.ftau[62] = -242886530;
        id.ftau[63] = -243377051;
        id.ftau[64] = -1246582176;
        id.ftau[65] = -1124962661;
        id.ftau[66] = 1411927968;
        id.ftau[67] = 799158700;
        id.ftau[68] = -185074269;
        id.ftau[69] = 1120699356;
        id.ftau[70] = 466912529;
        id.ftau[71] = -268927440;
        id.ftau[72] = 919832020;
        id.ftau[73] = -828102584;
        id.ftau[74] = 579835269;
        id.ftau[75] = -1147199540;
        id.ftau[76] = 501650314;
        id.ftau[77] = 89084769;
        id.ftau[78] = -286327248;
        id.ftau[79] = -1181006733;
        id.ftau[80] = 350686841;
        id.ftau[81] = -1948456870;
        id.ftau[82] = 79248522;
        id.ftau[83] = -1820882775;
        id.ftau[84] = 1614718161;
        id.ftau[85] = -182469722;
        id.ftau[86] = 1820993110;
        id.ftau[87] = 2030111029;
        id.ftau[88] = -43840285;
        id.ftau[89] = -529801781;
        id.ftau[90] = -1357496865;
        id.ftau[91] = 1079467028;
        id.ftau[92] = -1136771830;
        id.ftau[93] = -1419952261;
        id.ftau[94] = -1734834555;
        id.ftau[95] = -1437686608;
        id.ftau[96] = 856145352;
        id.ftau[97] = 1985741540;
        id.ftau[98] = -676684425;
        id.ftau[99] = -144558254;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isAttackReady(hn var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = id.mx - id.ftav("ftxi", ftbg(int ), (int)113)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == id.ftav("ftxj", ftas(int ), (int)275)) break;
            v0 /* !! */  = (long)id.ftav("ftxk", ftas(int ), (int)276);
        }
        var4_2 = id.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = id.mx - id.ftav("ftxl", ftbg(int ), (int)114)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == id.ftav("ftxm", ftas(int ), (int)277)) break;
            v1 /* !! */  = (long)id.ftav("ftxn", ftas(int ), (int)278);
        }
        var3_3 /* !! */  = id.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = id.mx - id.ftav("ftxo", ftbg(int ), (int)115)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == id.ftav("ftxp", ftas(int ), (int)279)) break;
            v2 /* !! */  = (long)id.ftav("ftxq", ftas(int ), (int)280);
        }
        var2_4 = id.a;
        if (var4_2) {
            throw null;
lbl21:
            // 10 sources

            return (boolean)id.ftav("ftxr", ftas(int ), (int)281);
        }
        if (var2_4 || var2_4) ** GOTO lbl21
        if (var1_1 == null) ** GOTO lbl82
        if (var2_4) ** GOTO lbl21
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_3 = id.mx - id.ftav("ftxs", ftbg(int ), (int)116)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == id.ftav("ftxt", ftas(int ), (int)282)) break;
            v3 /* !! */  = (long)id.ftav("ftxu", ftas(int ), (int)283);
        }
        if (var1_1.getTarget() == null) ** GOTO lbl82
        if (var2_4) ** GOTO lbl21
        v4 /* !! */  = id.mx;
        if (true) ** GOTO lbl37
        block57: while (true) {
            v4 /* !! */  = (long)(id.ftav("ftxw", ftbg(int ), (int)118) - id.ftav("ftxv", ftbg(int ), (int)117));
lbl37:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1126884390: {
                    continue block57;
                }
                case -351994481: {
                    break block57;
                }
            }
            break;
        }
        if (d.getInstance() == null) ** GOTO lbl82
        if (var2_4 || var2_4) ** GOTO lbl21
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = id.mx;
                if (true) ** GOTO lbl51
                block58: while (true) {
                    v5 /* !! */  = (long)(v6 - id.ftav("ftxx", ftbg(int ), (int)119));
lbl51:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -1757955368: {
                            v6 = id.ftav("ftxy", ftbg(int ), (int)120);
                            continue block58;
                        }
                        case -504313007: {
                            v6 = id.ftav("ftxz", ftbg(int ), (int)121);
                            continue block58;
                        }
                        case -351994481: {
                            break block58;
                        }
                        case 1403359828: {
                            v6 = id.ftav("ftya", ftbg(int ), (int)122);
                            continue block58;
                        }
                    }
                    break;
                }
                v7 = d.getInstance();
                v8 /* !! */  = id.mx;
                if (true) ** GOTO lbl68
                block59: while (true) {
                    v8 /* !! */  = (long)(v9 - id.ftav("ftyb", ftbg(int ), (int)123));
lbl68:
                    // 2 sources

                    switch ((int)v8 /* !! */ ) {
                        case -1065912790: {
                            v9 = id.ftav("ftyc", ftbg(int ), (int)124);
                            continue block59;
                        }
                        case -351994481: {
                            break block59;
                        }
                        case 1215234554: {
                            v9 = id.ftav("ftyd", ftbg(int ), (int)125);
                            continue block59;
                        }
                        case 1889554978: {
                            v9 = id.ftav("ftye", ftbg(int ), (int)126);
                            continue block59;
                        }
                    }
                    break;
                }
                if (v7.getManager() != null) ** GOTO lbl84
                if (var2_4) ** GOTO lbl21
lbl82:
                // 4 sources

                if (var2_4 || var2_4) ** GOTO lbl21
                return (boolean)id.ftav("ftyf", ftas(int ), (int)284);
lbl84:
                // 1 sources

                if (var2_4 || var2_4) ** GOTO lbl21
                v10 /* !! */  = id.mx;
                if (true) ** GOTO lbl89
                block60: while (true) {
                    v10 /* !! */  = (long)(v11 - id.ftav("ftyg", ftbg(int ), (int)127));
lbl89:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -1622663889: {
                            v11 = id.ftav("ftyh", ftbg(int ), (int)128);
                            continue block60;
                        }
                        case -907932499: {
                            v11 = id.ftav("ftyi", ftbg(int ), (int)129);
                            continue block60;
                        }
                        case -351994481: {
                            break block60;
                        }
                    }
                    break;
                }
                v12 = d.getInstance();
                while (true) {
                    if ((v13 /* !! */  = (cfr_temp_4 = id.mx - id.ftav("ftyj", ftbg(int ), (int)130)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v13 /* !! */  == id.ftav("ftyk", ftas(int ), (int)285)) break;
                    v13 /* !! */  = (long)id.ftav("ftyl", ftas(int ), (int)286);
                }
                v14 = v12.getManager();
                v15 /* !! */  = id.mx;
                if (true) ** GOTO lbl109
                block62: while (true) {
                    v15 /* !! */  = (long)(v16 - id.ftav("ftym", ftbg(int ), (int)131));
lbl109:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1539199369: {
                            v16 = id.ftav("ftyn", ftbg(int ), (int)132);
                            continue block62;
                        }
                        case -351994481: {
                            break block62;
                        }
                        case 1088843675: {
                            v16 = id.ftav("ftyo", ftbg(int ), (int)133);
                            continue block62;
                        }
                    }
                    break;
                }
                v17 = v14.getAttackPerpetrator();
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_5 = id.mx - id.ftav("ftyp", ftbg(int ), (int)134)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == id.ftav("ftyq", ftas(int ), (int)287)) break;
                    v18 /* !! */  = (long)id.ftav("ftyr", ftas(int ), (int)288);
                }
                v19 = v17.getAttackHandler();
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_6 = id.mx - id.ftav("ftys", ftbg(int ), (int)135)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == id.ftav("ftyt", ftas(int ), (int)289)) break;
                    v20 /* !! */  = (long)id.ftav("ftyu", ftas(int ), (int)290);
                }
                v21 = var1_1.getConfig();
                v22 = id.ftav("ftyv", ftas(int ), (int)291);
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_7 = id.mx - id.ftav("ftyw", ftbg(int ), (int)136)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == id.ftav("ftyx", ftas(int ), (int)292)) break;
                    v23 /* !! */  = (long)id.ftav("ftyy", ftas(int ), (int)293);
                }
                if (!v19.canAttack(v21, (int)v22)) ** GOTO lbl173
                if (var2_4) ** GOTO lbl21
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_8 = id.mx - id.ftav("ftyz", ftbg(int ), (int)137)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == id.ftav("ftza", ftas(int ), (int)294)) break;
                    v24 /* !! */  = (long)id.ftav("ftzb", ftas(int ), (int)295);
                }
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_9 = id.mx - id.ftav("ftzc", ftbg(int ), (int)138)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == id.ftav("ftzd", ftas(int ), (int)296)) break;
                    v25 /* !! */  = (long)id.ftav("ftze", ftas(int ), (int)297);
                }
                v26 = id.mc.field_1724;
                v27 = id.ftav("ftzf", ftbn(int ), (int)298);
                v28 /* !! */  = id.mx;
                if (true) ** GOTO lbl155
                block68: while (true) {
                    v28 /* !! */  = (long)(v29 - id.ftav("ftzg", ftbg(int ), (int)139));
lbl155:
                    // 2 sources

                    switch ((int)v28 /* !! */ ) {
                        case -783663051: {
                            v29 = id.ftav("ftzh", ftbg(int ), (int)140);
                            continue block68;
                        }
                        case -351994481: {
                            break block68;
                        }
                        case -270940208: {
                            v29 = id.ftav("ftzi", ftbg(int ), (int)141);
                            continue block68;
                        }
                        case 407320744: {
                            v29 = id.ftav("ftzj", ftbg(int ), (int)142);
                            continue block68;
                        }
                    }
                    break;
                }
                if (!(v26.method_7261((float)v27) >= id.ftav("ftzk", ftbn(int ), (int)299))) ** GOTO lbl173
                if (var2_4) ** GOTO lbl21
                v30 = id.ftav("ftzl", ftas(int ), (int)300);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl176
lbl173:
                // 2 sources

                if (!var2_4 && !var2_4) ** break;
                ** continue;
                v30 = id.ftav("ftzm", ftas(int ), (int)301);
lbl176:
                // 2 sources

                return (boolean)v30;
            }
lbl177:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)id.ftav("ftzn", ftas(int ), (int)302);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl233
            }
lbl182:
            // 2 sources

            case 1: {
                do {
                    var3_3 /* !! */  = (int)id.ftav("ftzo", ftas(int ), (int)303);
                } while (!var4_2);
                throw null;
            }
lbl187:
            // 2 sources

            case 2: {
                do {
                    var3_3 /* !! */  = (int)id.ftav("ftzp", ftas(int ), (int)304);
                } while (!var4_2);
                throw null;
            }
lbl192:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)id.ftav("ftzq", ftas(int ), (int)305);
                if (!var4_2) break;
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)id.ftav("ftzr", ftas(int ), (int)306);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl201:
            // 2 sources

            case 5: {
                var3_3 /* !! */  = (int)id.ftav("ftzs", ftas(int ), (int)307);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl245
            }
            case 6: {
                var3_3 /* !! */  = (int)id.ftav("ftzt", ftas(int ), (int)308);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl219
            }
lbl211:
            // 2 sources

            case 7: {
                var3_3 /* !! */  = (int)id.ftav("ftzu", ftas(int ), (int)309);
                if (!var4_2) ** GOTO lbl182
                throw null;
            }
            case 8: {
                var3_3 /* !! */  = (int)id.ftav("ftzv", ftas(int ), (int)310);
                if (var4_2) {
                    throw null;
                }
            }
lbl219:
            // 5 sources

            case 9: {
                var3_3 /* !! */  = (int)id.ftav("ftzw", ftas(int ), (int)311);
                if (!var4_2) ** GOTO lbl211
                throw null;
            }
            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)id.ftav("ftzx", ftas(int ), (int)312);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl245
                    break;
                }
            }
lbl229:
            // 2 sources

            case 11: {
                var3_3 /* !! */  = (int)id.ftav("ftzy", ftas(int ), (int)313);
                if (!var4_2) ** GOTO lbl192
                throw null;
            }
lbl233:
            // 2 sources

            case 12: {
                var3_3 /* !! */  = (int)id.ftav("ftzz", ftas(int ), (int)314);
                if (!var4_2) ** GOTO lbl201
                throw null;
            }
            case 13: {
                var3_3 /* !! */  = (int)id.ftav("fuaa", ftas(int ), (int)315);
                if (!var4_2) ** GOTO lbl229
                throw null;
            }
            case 14: {
                var3_3 /* !! */  = (int)id.ftav("fuab", ftas(int ), (int)316);
                if (!var4_2) ** GOTO lbl177
                throw null;
            }
lbl245:
            // 3 sources

            case 15: {
                do {
                    var3_3 /* !! */  = (int)id.ftav("fuac", ftas(int ), (int)317);
                } while (!var4_2);
                throw null;
            }
            case 16: {
                var3_3 /* !! */  = (int)id.ftav("fuad", ftas(int ), (int)318);
                if (!var4_2) ** GOTO lbl187
                throw null;
            }
            case 17: 
        }
        var3_3 /* !! */  = (int)id.ftav("fuae", ftas(int ), (int)319);
        ** while (!var4_2)
lbl257:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fujw() {
        id.ftau[200] = -440738645;
        id.ftau[201] = 1591152239;
        id.ftau[202] = 2031769468;
        id.ftau[203] = 393260357;
        id.ftau[204] = -1592841799;
        id.ftau[205] = 190857657;
        id.ftau[206] = -1721023343;
        id.ftau[207] = -1032608733;
        id.ftau[208] = 724730847;
        id.ftau[209] = 8518315;
        id.ftau[210] = -90763092;
        id.ftau[211] = -1338042269;
        id.ftau[212] = -1973680925;
        id.ftau[213] = 1965192031;
        id.ftau[214] = -2006346887;
        id.ftau[215] = 1602941191;
        id.ftau[216] = -1124125033;
        id.ftau[217] = 1192555378;
        id.ftau[218] = 710019804;
        id.ftau[219] = 737625032;
        id.ftau[220] = 1655502638;
        id.ftau[221] = -944559873;
        id.ftau[222] = 1395331767;
        id.ftau[223] = 712834927;
        id.ftau[224] = -1367116033;
        id.ftau[225] = -2115797949;
        id.ftau[226] = -578242752;
        id.ftau[227] = -605296178;
        id.ftau[228] = 436930092;
        id.ftau[229] = 1542654349;
        id.ftau[230] = -2088112831;
        id.ftau[231] = -1356943201;
        id.ftau[232] = 808890313;
        id.ftau[233] = -994340924;
        id.ftau[234] = 295707972;
        id.ftau[235] = -1922193156;
        id.ftau[236] = -775864848;
        id.ftau[237] = -1461815519;
        id.ftau[238] = -375958233;
        id.ftau[239] = -1465799;
        id.ftau[240] = -379677965;
        id.ftau[241] = 818359978;
        id.ftau[242] = 1734648797;
        id.ftau[243] = 697595189;
        id.ftau[244] = 1801258269;
        id.ftau[245] = -1638661579;
        id.ftau[246] = -1147975616;
        id.ftau[247] = 750456547;
        id.ftau[248] = -159385347;
        id.ftau[249] = 1076625012;
        id.ftau[250] = -378434206;
        id.ftau[251] = -1044196784;
        id.ftau[252] = -332109848;
        id.ftau[253] = -1689860135;
        id.ftau[254] = 1852612456;
        id.ftau[255] = -1399182936;
        id.ftau[256] = -1644927226;
        id.ftau[257] = -288413913;
        id.ftau[258] = 851452049;
        id.ftau[259] = -821260053;
        id.ftau[260] = -1835176467;
        id.ftau[261] = -1803127482;
        id.ftau[262] = 639339127;
        id.ftau[263] = 24024334;
        id.ftau[264] = 1952886721;
        id.ftau[265] = -606416284;
        id.ftau[266] = -297495351;
        id.ftau[267] = -2019681810;
        id.ftau[268] = 686156597;
        id.ftau[269] = -897268826;
        id.ftau[270] = 885796682;
        id.ftau[271] = -351631058;
        id.ftau[272] = 1671986239;
        id.ftau[273] = -265253480;
        id.ftau[274] = -66644988;
        id.ftau[275] = -1837231842;
        id.ftau[276] = 1111778433;
        id.ftau[277] = 2049124016;
        id.ftau[278] = 33630883;
        id.ftau[279] = 484507180;
        id.ftau[280] = -1293247000;
        id.ftau[281] = -732238848;
        id.ftau[282] = 912849134;
        id.ftau[283] = 1273662982;
        id.ftau[284] = 1634486021;
        id.ftau[285] = 283542058;
        id.ftau[286] = 1861732257;
        id.ftau[287] = -555790146;
        id.ftau[288] = 122153139;
        id.ftau[289] = -2147461180;
        id.ftau[290] = -599949556;
        id.ftau[291] = -1359962088;
        id.ftau[292] = 1790902777;
        id.ftau[293] = -961565100;
        id.ftau[294] = 1527072425;
        id.ftau[295] = 1232355327;
        id.ftau[296] = 2033941818;
        id.ftau[297] = -197038102;
        id.ftau[298] = -2110257832;
        id.ftau[299] = 1488502704;
    }

    private static /* synthetic */ float ftbn(int n2) {
        return Float.intBitsToFloat(ftat[n2] ^ ftau[n2]);
    }

    private static /* synthetic */ void fujs() {
        id.ftat[300] = -1078524897;
        id.ftat[301] = -929329045;
        id.ftat[302] = 1931080154;
        id.ftat[303] = -1647663777;
        id.ftat[304] = -462320435;
        id.ftat[305] = -1951902100;
        id.ftat[306] = 851887752;
        id.ftat[307] = -765410466;
        id.ftat[308] = 1574347284;
        id.ftat[309] = 34826717;
        id.ftat[310] = -1438200930;
        id.ftat[311] = -902947829;
        id.ftat[312] = -434389179;
        id.ftat[313] = 1386478574;
        id.ftat[314] = -703096274;
        id.ftat[315] = 1736449029;
        id.ftat[316] = 913928194;
        id.ftat[317] = -95073773;
        id.ftat[318] = 401921819;
        id.ftat[319] = 1005696769;
        id.ftat[320] = 1074266630;
        id.ftat[321] = -2109970542;
        id.ftat[322] = 259957451;
        id.ftat[323] = 750318320;
        id.ftat[324] = -193789647;
        id.ftat[325] = -1727982176;
        id.ftat[326] = -1987040150;
        id.ftat[327] = -1423482095;
        id.ftat[328] = -1571807616;
        id.ftat[329] = -827191849;
        id.ftat[330] = 221737957;
        id.ftat[331] = 1401982022;
        id.ftat[332] = -25733103;
        id.ftat[333] = -473251275;
        id.ftat[334] = -421803793;
        id.ftat[335] = -238992805;
        id.ftat[336] = 1463933266;
        id.ftat[337] = 1786443854;
        id.ftat[338] = 485127551;
        id.ftat[339] = 1281089747;
        id.ftat[340] = 1379222607;
        id.ftat[341] = 2125911049;
        id.ftat[342] = -1157717336;
        id.ftat[343] = -1630635603;
        id.ftat[344] = -1586398919;
        id.ftat[345] = 1854087971;
        id.ftat[346] = -755028774;
        id.ftat[347] = -1935655804;
        id.ftat[348] = 268265855;
        id.ftat[349] = -2034715114;
        id.ftat[350] = -1070408875;
        id.ftat[351] = 6452461;
        id.ftat[352] = 1108537032;
        id.ftat[353] = 509674783;
        id.ftat[354] = -1858406555;
        id.ftat[355] = -238295460;
        id.ftat[356] = -1224156008;
        id.ftat[357] = -1299604470;
        id.ftat[358] = -1646742806;
        id.ftat[359] = 1256999946;
        id.ftat[360] = -5931864;
        id.ftat[361] = 1871895685;
        id.ftat[362] = 202606771;
        id.ftat[363] = 1375271085;
        id.ftat[364] = -303505048;
        id.ftat[365] = -2016087622;
        id.ftat[366] = -940044880;
        id.ftat[367] = -1500709985;
        id.ftat[368] = 705421530;
        id.ftat[369] = -1251545580;
        id.ftat[370] = -2114325292;
        id.ftat[371] = 1934085066;
        id.ftat[372] = -1285695263;
        id.ftat[373] = -491833720;
        id.ftat[374] = 250209130;
        id.ftat[375] = 1875456096;
        id.ftat[376] = -2108120056;
        id.ftat[377] = -1539887563;
        id.ftat[378] = 1418763872;
        id.ftat[379] = 2080739176;
        id.ftat[380] = -1722314530;
        id.ftat[381] = -144855130;
        id.ftat[382] = 1150018218;
        id.ftat[383] = -1390326107;
        id.ftat[384] = -1412033596;
        id.ftat[385] = -1569277234;
        id.ftat[386] = 1299901747;
        id.ftat[387] = 2103365852;
        id.ftat[388] = -2030928094;
        id.ftat[389] = -1082571647;
        id.ftat[390] = -409742125;
        id.ftat[391] = 245927482;
        id.ftat[392] = -1520008788;
        id.ftat[393] = -1685233989;
        id.ftat[394] = 445791526;
        id.ftat[395] = 744585607;
        id.ftat[396] = -703380760;
        id.ftat[397] = 1813793653;
        id.ftat[398] = 1706893335;
        id.ftat[399] = -321620646;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isSideSnapActive() {
        v0 /* !! */  = id.mx;
        if (true) ** GOTO lbl5
        block42: while (true) {
            v0 /* !! */  = (long)(v1 - id.ftav("ftwc", ftbg(int ), (int)93));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -869811779: {
                    v1 = id.ftav("ftwd", ftbg(int ), (int)94);
                    continue block42;
                }
                case -351994481: {
                    break block42;
                }
                case 1806320488: {
                    v1 = id.ftav("ftwe", ftbg(int ), (int)95);
                    continue block42;
                }
            }
            break;
        }
        var3_1 = id.c;
        v2 /* !! */  = id.mx;
        if (true) ** GOTO lbl19
        block43: while (true) {
            v2 /* !! */  = (long)(id.ftav("ftwg", ftbg(int ), (int)97) - id.ftav("ftwf", ftbg(int ), (int)96));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -351994481: {
                    break block43;
                }
                case 1427806935: {
                    continue block43;
                }
            }
            break;
        }
        var2_2 /* !! */  = id.b;
        v3 /* !! */  = id.mx;
        if (true) ** GOTO lbl29
        block44: while (true) {
            v3 /* !! */  = (long)(v4 - id.ftav("ftwh", ftbg(int ), (int)98));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -520586151: {
                    v4 = id.ftav("ftwi", ftbg(int ), (int)99);
                    continue block44;
                }
                case -351994481: {
                    break block44;
                }
                case -133283182: {
                    v4 = id.ftav("ftwj", ftbg(int ), (int)100);
                    continue block44;
                }
                case -126211152: {
                    v4 = id.ftav("ftwk", ftbg(int ), (int)101);
                    continue block44;
                }
            }
            break;
        }
        var1_3 = id.a;
        if (var3_1) {
            throw null;
lbl44:
            // 4 sources

            return (boolean)id.ftav("ftwl", ftas(int ), (int)263);
        }
        if (var1_3 || var1_3) ** GOTO lbl44
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v5 /* !! */  = id.mx;
                if (true) ** GOTO lbl54
                block46: while (true) {
                    v5 /* !! */  = (long)(v6 - id.ftav("ftwm", ftbg(int ), (int)102));
lbl54:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -406286126: {
                            v6 = id.ftav("ftwn", ftbg(int ), (int)103);
                            continue block46;
                        }
                        case -355386124: {
                            v6 = id.ftav("ftwo", ftbg(int ), (int)104);
                            continue block46;
                        }
                        case -351994481: {
                            break block46;
                        }
                    }
                    break;
                }
                if (this.sideSnapUntil == id.ftav("ftwp", ftbg(int ), (int)105)) ** GOTO lbl101
                if (var1_3) ** GOTO lbl44
                v7 /* !! */  = id.mx;
                if (true) ** GOTO lbl69
                block47: while (true) {
                    v7 /* !! */  = (long)(v8 - id.ftav("ftwq", ftbg(int ), (int)106));
lbl69:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -1443132854: {
                            v8 = id.ftav("ftwr", ftbg(int ), (int)107);
                            continue block47;
                        }
                        case -451309485: {
                            v8 = id.ftav("ftws", ftbg(int ), (int)108);
                            continue block47;
                        }
                        case -351994481: {
                            break block47;
                        }
                        case 1989253836: {
                            v8 = id.ftav("ftwt", ftbg(int ), (int)109);
                            continue block47;
                        }
                    }
                    break;
                }
                v9 = System.currentTimeMillis();
                v10 /* !! */  = id.mx;
                if (true) ** GOTO lbl86
                block48: while (true) {
                    v10 /* !! */  = (long)(v11 - id.ftav("ftwu", ftbg(int ), (int)110));
lbl86:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -351994481: {
                            break block48;
                        }
                        case 1041314762: {
                            v11 = id.ftav("ftwv", ftbg(int ), (int)111);
                            continue block48;
                        }
                        case 1565293372: {
                            v11 = id.ftav("ftww", ftbg(int ), (int)112);
                            continue block48;
                        }
                    }
                    break;
                }
                if (v9 >= this.sideSnapUntil) ** GOTO lbl101
                if (var1_3) ** GOTO lbl44
                v12 = id.ftav("ftwx", ftas(int ), (int)264);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl104
lbl101:
                // 2 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                v12 = id.ftav("ftwy", ftas(int ), (int)265);
lbl104:
                // 2 sources

                return (boolean)v12;
            }
lbl105:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)id.ftav("ftwz", ftas(int ), (int)266);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl122
            }
            case 1: {
                var2_2 /* !! */  = (int)id.ftav("ftxa", ftas(int ), (int)267);
                if (var3_1) {
                    throw null;
                }
            }
lbl114:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)id.ftav("ftxb", ftas(int ), (int)268);
                if (!var3_1) ** GOTO lbl105
                throw null;
            }
lbl118:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)id.ftav("ftxc", ftas(int ), (int)269);
                if (!var3_1) ** GOTO lbl114
                throw null;
            }
lbl122:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)id.ftav("ftxd", ftas(int ), (int)270);
                if (!var3_1) break;
                throw null;
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)id.ftav("ftxe", ftas(int ), (int)271);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl136
                    break;
                }
            }
            case 6: {
                var2_2 /* !! */  = (int)id.ftav("ftxf", ftas(int ), (int)272);
                if (!var3_1) break;
                throw null;
            }
lbl136:
            // 2 sources

            case 7: {
                var2_2 /* !! */  = (int)id.ftav("ftxg", ftas(int ), (int)273);
                if (!var3_1) ** GOTO lbl118
                throw null;
            }
            case 8: 
        }
        var2_2 /* !! */  = (int)id.ftav("ftxh", ftas(int ), (int)274);
        ** while (!var3_1)
lbl143:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private class_243 getMovingTargetPoint(class_1309 var1_1) {
        block65: {
            v0 /* !! */  = id.mx;
            if (true) ** GOTO lbl5
            block46: while (true) {
                v0 /* !! */  = (long)(v1 - id.ftav("fucy", ftbg(int ), (int)182));
lbl5:
                // 2 sources

                switch ((int)v0 /* !! */ ) {
                    case -2135287647: {
                        v1 = id.ftav("fucz", ftbg(int ), (int)183);
                        continue block46;
                    }
                    case -351994481: {
                        break block46;
                    }
                    case 2116024639: {
                        v1 = id.ftav("fuda", ftbg(int ), (int)184);
                        continue block46;
                    }
                }
                break;
            }
            var8_2 = id.c;
            v2 /* !! */  = id.mx;
            if (true) ** GOTO lbl19
            block47: while (true) {
                v2 /* !! */  = (long)(v3 - id.ftav("fudb", ftbg(int ), (int)185));
lbl19:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -351994481: {
                        break block47;
                    }
                    case 524703532: {
                        v3 = id.ftav("fudc", ftbg(int ), (int)186);
                        continue block47;
                    }
                    case 1019134195: {
                        v3 = id.ftav("fudd", ftbg(int ), (int)187);
                        continue block47;
                    }
                    case 1267381312: {
                        v3 = id.ftav("fude", ftbg(int ), (int)188);
                        continue block47;
                    }
                }
                break;
            }
            var7_3 = id.b;
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_0 = id.mx - id.ftav("fudf", ftbg(int ), (int)189)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                    continue;
                }
                if (v4 /* !! */  == id.ftav("fudg", ftas(int ), (int)352)) break;
                v4 /* !! */  = (long)id.ftav("fudh", ftas(int ), (int)353);
            }
            var6_4 = id.a;
            if (var8_2) {
                throw null;
lbl41:
                // 6 sources

                return null;
            }
            if (var6_4 || var6_4) ** GOTO lbl41
            v5 /* !! */  = id.mx;
            if (true) ** GOTO lbl48
            block50: while (true) {
                v5 /* !! */  = (long)(id.ftav("fudj", ftbg(int ), (int)191) - id.ftav("fudi", ftbg(int ), (int)190));
lbl48:
                // 2 sources

                switch ((int)v5 /* !! */ ) {
                    case -2127839028: {
                        continue block50;
                    }
                    case -351994481: {
                        break block50;
                    }
                }
                break;
            }
            v6 = var1_1.method_5829();
            v7 /* !! */  = id.mx;
            if (true) ** GOTO lbl58
            block51: while (true) {
                v7 /* !! */  = (long)(v8 - id.ftav("fudk", ftbg(int ), (int)192));
lbl58:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -351994481: {
                        break block51;
                    }
                    case -277839071: {
                        v8 = id.ftav("fudl", ftbg(int ), (int)193);
                        continue block51;
                    }
                    case 620762753: {
                        v8 = id.ftav("fudm", ftbg(int ), (int)194);
                        continue block51;
                    }
                    case 697039907: {
                        v8 = id.ftav("fudn", ftbg(int ), (int)195);
                        continue block51;
                    }
                }
                break;
            }
            var2_5 = v6.method_1005();
            if (var6_4 || var6_4) ** GOTO lbl41
            v9 /* !! */  = id.mx;
            if (true) ** GOTO lbl76
            block52: while (true) {
                v9 /* !! */  = (long)(v10 - id.ftav("fudo", ftbg(int ), (int)196));
lbl76:
                // 2 sources

                switch ((int)v9 /* !! */ ) {
                    case -1799675227: {
                        v10 = id.ftav("fudp", ftbg(int ), (int)197);
                        continue block52;
                    }
                    case -351994481: {
                        break block52;
                    }
                    case 54111434: {
                        v10 = id.ftav("fudq", ftbg(int ), (int)198);
                        continue block52;
                    }
                    case 645412361: {
                        v10 = id.ftav("fudr", ftbg(int ), (int)199);
                        continue block52;
                    }
                }
                break;
            }
            var3_6 = var1_1.method_18798();
            if (var6_4 || var6_4) ** GOTO lbl41
            v11 /* !! */  = id.mx;
            if (true) ** GOTO lbl94
            block53: while (true) {
                v11 /* !! */  = (long)(v12 - id.ftav("fuds", ftbg(int ), (int)200));
lbl94:
                // 2 sources

                switch ((int)v11 /* !! */ ) {
                    case -351994481: {
                        break block53;
                    }
                    case -330218331: {
                        v12 = id.ftav("fudt", ftbg(int ), (int)201);
                        continue block53;
                    }
                    case 903126533: {
                        v12 = id.ftav("fudu", ftbg(int ), (int)202);
                        continue block53;
                    }
                }
                break;
            }
            v13 = var3_6.field_1352;
            v14 /* !! */  = id.mx;
            if (true) ** GOTO lbl108
            block54: while (true) {
                v14 /* !! */  = (long)(id.ftav("fudw", ftbg(int ), (int)204) - id.ftav("fudv", ftbg(int ), (int)203));
lbl108:
                // 2 sources

                switch ((int)v14 /* !! */ ) {
                    case -351994481: {
                        break block54;
                    }
                    case 1968198648: {
                        continue block54;
                    }
                }
                break;
            }
            v15 = var3_6.field_1350;
            v16 /* !! */  = id.mx;
            if (true) ** GOTO lbl118
            block55: while (true) {
                v16 /* !! */  = (long)(v17 - id.ftav("fudx", ftbg(int ), (int)205));
lbl118:
                // 2 sources

                switch ((int)v16 /* !! */ ) {
                    case -1014111103: {
                        v17 = id.ftav("fudy", ftbg(int ), (int)206);
                        continue block55;
                    }
                    case -351994481: {
                        break block55;
                    }
                    case 0x3DDDD232: {
                        v17 = id.ftav("fudz", ftbg(int ), (int)207);
                        continue block55;
                    }
                }
                break;
            }
            var4_7 = Math.hypot(v13, v15);
            if (var6_4 || var6_4) ** GOTO lbl41
            if (!(var4_7 < id.ftav("fuea", ftcm(int ), (int)208))) break block65;
            if (var6_4 || var6_4) ** GOTO lbl41
            return var2_5;
        }
        ** while (var6_4 || var6_4)
lbl134:
        // 1 sources

        while (true) {
            if ((v18 /* !! */  = (cfr_temp_1 = id.mx - id.ftav("fueb", ftbg(int ), (int)209)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v18 /* !! */  == id.ftav("fuec", ftas(int ), (int)354)) break;
            v18 /* !! */  = (long)id.ftav("fued", ftas(int ), (int)355);
        }
        v19 = var3_6.field_1352 * id.ftav("fuee", ftcm(int ), (int)210);
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_2 = id.mx - id.ftav("fuef", ftbg(int ), (int)211)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v20 /* !! */  == id.ftav("fueg", ftas(int ), (int)356)) break;
            v20 /* !! */  = (long)id.ftav("fueh", ftas(int ), (int)357);
        }
        v21 = var3_6.field_1351 * id.ftav("fuei", ftcm(int ), (int)212);
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_3 = id.mx - id.ftav("fuej", ftbg(int ), (int)213)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v22 /* !! */  == id.ftav("fuek", ftas(int ), (int)358)) break;
            v22 /* !! */  = (long)id.ftav("fuel", ftas(int ), (int)359);
        }
        v23 = var3_6.field_1350 * id.ftav("fuem", ftcm(int ), (int)214);
        v24 /* !! */  = id.mx;
        if (true) ** GOTO lbl159
        block59: while (true) {
            v24 /* !! */  = (long)(v25 - id.ftav("fuen", ftbg(int ), (int)215));
lbl159:
            // 2 sources

            switch ((int)v24 /* !! */ ) {
                case -535865371: {
                    v25 = id.ftav("fueo", ftbg(int ), (int)216);
                    continue block59;
                }
                case -351994481: {
                    break block59;
                }
                case 1408883322: {
                    v25 = id.ftav("fuep", ftbg(int ), (int)217);
                    continue block59;
                }
            }
            break;
        }
        return var2_5.method_1031(v19, v21, v23);
    }

    private static /* synthetic */ void fujx() {
        id.ftau[300] = -1078524898;
        id.ftau[301] = -929329045;
        id.ftau[302] = 1931080155;
        id.ftau[303] = -1647663789;
        id.ftau[304] = -462320435;
        id.ftau[305] = -1951902107;
        id.ftau[306] = 851887744;
        id.ftau[307] = -765410480;
        id.ftau[308] = 1574347290;
        id.ftau[309] = 34826719;
        id.ftau[310] = -1438200946;
        id.ftau[311] = -902947836;
        id.ftau[312] = -434389178;
        id.ftau[313] = 1386478573;
        id.ftau[314] = -703096284;
        id.ftau[315] = 1736449039;
        id.ftau[316] = 913928193;
        id.ftau[317] = -95073772;
        id.ftau[318] = 401921818;
        id.ftau[319] = 1005696770;
        id.ftau[320] = -1074266631;
        id.ftau[321] = -579063391;
        id.ftau[322] = -259957452;
        id.ftau[323] = -1381607744;
        id.ftau[324] = 193789646;
        id.ftau[325] = 1468050590;
        id.ftau[326] = -1987040149;
        id.ftau[327] = -1288077019;
        id.ftau[328] = -1571807615;
        id.ftau[329] = 290924722;
        id.ftau[330] = -221737958;
        id.ftau[331] = -1615476675;
        id.ftau[332] = -25733097;
        id.ftau[333] = -473251268;
        id.ftau[334] = -421803794;
        id.ftau[335] = -238992813;
        id.ftau[336] = 1463933271;
        id.ftau[337] = 1786443848;
        id.ftau[338] = 485127541;
        id.ftau[339] = 1281089755;
        id.ftau[340] = 1379222598;
        id.ftau[341] = 2125911053;
        id.ftau[342] = -1157717332;
        id.ftau[343] = 1630635602;
        id.ftau[344] = 1520365080;
        id.ftau[345] = 1375563783;
        id.ftau[346] = 755028773;
        id.ftau[347] = -625784164;
        id.ftau[348] = 268265854;
        id.ftau[349] = -2034715116;
        id.ftau[350] = -1070408874;
        id.ftau[351] = 6452463;
        id.ftau[352] = -1108537033;
        id.ftau[353] = -1972971777;
        id.ftau[354] = 1858406554;
        id.ftau[355] = 1944103645;
        id.ftau[356] = -1224156007;
        id.ftau[357] = 1074898970;
        id.ftau[358] = 1646742805;
        id.ftau[359] = 1105599492;
        id.ftau[360] = -5931857;
        id.ftau[361] = 1871895689;
        id.ftau[362] = 202606768;
        id.ftau[363] = 1375271072;
        id.ftau[364] = -303505055;
        id.ftau[365] = -2016087620;
        id.ftau[366] = -940044873;
        id.ftau[367] = -1500709989;
        id.ftau[368] = 705421530;
        id.ftau[369] = -1251545571;
        id.ftau[370] = -2114325291;
        id.ftau[371] = 1934085069;
        id.ftau[372] = -1285695264;
        id.ftau[373] = -491833717;
        id.ftau[374] = 250209127;
        id.ftau[375] = 1875456097;
        id.ftau[376] = 1541715998;
        id.ftau[377] = -1539887564;
        id.ftau[378] = -1429797460;
        id.ftau[379] = 2080739177;
        id.ftau[380] = 929575851;
        id.ftau[381] = 144855129;
        id.ftau[382] = -284012221;
        id.ftau[383] = -282243419;
        id.ftau[384] = -1856699989;
        id.ftau[385] = -1569277233;
        id.ftau[386] = -1099584386;
        id.ftau[387] = 1062392028;
        id.ftau[388] = 2030928093;
        id.ftau[389] = 1355656104;
        id.ftau[390] = 409742124;
        id.ftau[391] = 1302202280;
        id.ftau[392] = -1520008787;
        id.ftau[393] = 2070344404;
        id.ftau[394] = -445791527;
        id.ftau[395] = 843075491;
        id.ftau[396] = -703380758;
        id.ftau[397] = 1813793663;
        id.ftau[398] = 1706893340;
        id.ftau[399] = -321620655;
    }

    private static /* synthetic */ long ftbg(int n2) {
        return ftbh[n2] ^ ftbi[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isAirSwingTick() {
        block87: {
            block86: {
                block85: {
                    block84: {
                        v0 /* !! */  = id.mx;
                        if (true) ** GOTO lbl5
                        block57: while (true) {
                            v0 /* !! */  = (long)(v1 - id.ftav("fttb", ftbg(int ), (int)52));
lbl5:
                            // 2 sources

                            switch ((int)v0 /* !! */ ) {
                                case -1340487814: {
                                    v1 = id.ftav("fttc", ftbg(int ), (int)53);
                                    continue block57;
                                }
                                case -1202717783: {
                                    v1 = id.ftav("fttd", ftbg(int ), (int)54);
                                    continue block57;
                                }
                                case -951205115: {
                                    v1 = id.ftav("ftte", ftbg(int ), (int)55);
                                    continue block57;
                                }
                                case -351994481: {
                                    break block57;
                                }
                            }
                            break;
                        }
                        var4 = id.c;
                        v2 /* !! */  = id.mx;
                        if (true) ** GOTO lbl22
                        block58: while (true) {
                            v2 /* !! */  = (long)(v3 - id.ftav("fttf", ftbg(int ), (int)56));
lbl22:
                            // 2 sources

                            switch ((int)v2 /* !! */ ) {
                                case -351994481: {
                                    break block58;
                                }
                                case 1483854134: {
                                    v3 = id.ftav("fttg", ftbg(int ), (int)57);
                                    continue block58;
                                }
                                case 2022920280: {
                                    v3 = id.ftav("ftth", ftbg(int ), (int)58);
                                    continue block58;
                                }
                            }
                            break;
                        }
                        var3_1 = id.b;
                        while (true) {
                            if ((v4 /* !! */  = (cfr_temp_0 = id.mx - id.ftav("ftti", ftbg(int ), (int)59)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v4 /* !! */  == id.ftav("fttj", ftas(int ), (int)225)) break;
                            v4 /* !! */  = (long)id.ftav("fttk", ftas(int ), (int)226);
                        }
                        var2_2 = id.a;
                        if (var4) {
                            throw null;
lbl41:
                            // 14 sources

                            return (boolean)id.ftav("fttl", ftas(int ), (int)227);
                        }
                        if (var2_2 || var2_2) ** GOTO lbl41
                        v5 /* !! */  = id.mx;
                        if (true) ** GOTO lbl48
                        block61: while (true) {
                            v5 /* !! */  = (long)(v6 - id.ftav("fttm", ftbg(int ), (int)60));
lbl48:
                            // 2 sources

                            switch ((int)v5 /* !! */ ) {
                                case -351994481: {
                                    break block61;
                                }
                                case -35703225: {
                                    v6 = id.ftav("fttn", ftbg(int ), (int)61);
                                    continue block61;
                                }
                                case 732784918: {
                                    v6 = id.ftav("ftto", ftbg(int ), (int)62);
                                    continue block61;
                                }
                                case 784060712: {
                                    v6 = id.ftav("fttp", ftbg(int ), (int)63);
                                    continue block61;
                                }
                            }
                            break;
                        }
                        var0_3 = hn.getInstance();
                        if (var2_2 || var2_2) ** GOTO lbl41
                        if (var0_3 != null) break block84;
                        if (var2_2) ** GOTO lbl41
                        v7 = null;
                        if (var4) {
                            throw null;
                        }
                        break block85;
                    }
                    if (var2_2 || var2_2) ** GOTO lbl41
                    v8 /* !! */  = id.mx;
                    if (true) ** GOTO lbl74
                    block62: while (true) {
                        v8 /* !! */  = (long)(v9 - id.ftav("fttq", ftbg(int ), (int)64));
lbl74:
                        // 2 sources

                        switch ((int)v8 /* !! */ ) {
                            case -1045436121: {
                                v9 = id.ftav("fttr", ftbg(int ), (int)65);
                                continue block62;
                            }
                            case -351994481: {
                                break block62;
                            }
                            case 1504700259: {
                                v9 = id.ftav("ftts", ftbg(int ), (int)66);
                                continue block62;
                            }
                            case 2070792584: {
                                v9 = id.ftav("fttt", ftbg(int ), (int)67);
                                continue block62;
                            }
                        }
                        break;
                    }
                    v7 = var1_4 = var0_3.getTarget();
                }
                if (var2_2 || var2_2) ** GOTO lbl41
                if (var0_3 == null) break block86;
                if (var2_2) ** GOTO lbl41
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_1 = id.mx - id.ftav("fttu", ftbg(int ), (int)68)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v10 /* !! */  == id.ftav("fttv", ftas(int ), (int)228)) break;
                    v10 /* !! */  = (long)id.ftav("fttw", ftas(int ), (int)229);
                }
                if (!var0_3.isState()) break block86;
                if (var2_2) ** GOTO lbl41
                v11 /* !! */  = id.mx;
                if (true) ** GOTO lbl103
                block64: while (true) {
                    v11 /* !! */  = (long)(v12 - id.ftav("fttx", ftbg(int ), (int)69));
lbl103:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1599027442: {
                            v12 = id.ftav("ftty", ftbg(int ), (int)70);
                            continue block64;
                        }
                        case -351994481: {
                            break block64;
                        }
                        case 942974376: {
                            v12 = id.ftav("fttz", ftbg(int ), (int)71);
                            continue block64;
                        }
                    }
                    break;
                }
                v13 = var0_3.getAimType();
                v14 /* !! */  = id.mx;
                if (true) ** GOTO lbl117
                block65: while (true) {
                    v14 /* !! */  = (long)(v15 - id.ftav("ftua", ftbg(int ), (int)72));
lbl117:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -899582147: {
                            v15 = id.ftav("ftub", ftbg(int ), (int)73);
                            continue block65;
                        }
                        case -351994481: {
                            break block65;
                        }
                        case 1323464095: {
                            v15 = id.ftav("ftuc", ftbg(int ), (int)74);
                            continue block65;
                        }
                    }
                    break;
                }
                if (!v13.isSelected("FuntimeTest")) break block86;
                if (var2_2) ** GOTO lbl41
                if (var1_4 == null) break block86;
                if (var2_2) ** GOTO lbl41
                v16 /* !! */  = id.mx;
                if (true) ** GOTO lbl134
                block66: while (true) {
                    v16 /* !! */  = (long)(v17 - id.ftav("ftud", ftbg(int ), (int)75));
lbl134:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -351994481: {
                            break block66;
                        }
                        case 711126106: {
                            v17 = id.ftav("ftue", ftbg(int ), (int)76);
                            continue block66;
                        }
                        case 1205925394: {
                            v17 = id.ftav("ftuf", ftbg(int ), (int)77);
                            continue block66;
                        }
                        case 1949775233: {
                            v17 = id.ftav("ftug", ftbg(int ), (int)78);
                            continue block66;
                        }
                    }
                    break;
                }
                if (!var1_4.method_5805()) break block86;
                if (var2_2) ** GOTO lbl41
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_2 = id.mx - id.ftav("ftuh", ftbg(int ), (int)79)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v18 /* !! */  == id.ftav("ftui", ftas(int ), (int)230)) break;
                    v18 /* !! */  = (long)id.ftav("ftuj", ftas(int ), (int)231);
                }
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_3 = id.mx - id.ftav("ftuk", ftbg(int ), (int)80)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v19 /* !! */  == id.ftav("ftul", ftas(int ), (int)232)) break;
                    v19 /* !! */  = (long)id.ftav("ftum", ftas(int ), (int)233);
                }
                if (id.mc.field_1724 == null) break block86;
                if (var2_2) ** GOTO lbl41
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_4 = id.mx - id.ftav("ftun", ftbg(int ), (int)81)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v20 /* !! */  == id.ftav("ftuo", ftas(int ), (int)234)) break;
                    v20 /* !! */  = (long)id.ftav("ftup", ftas(int ), (int)235);
                }
                v21 /* !! */  = id.mx;
                if (true) ** GOTO lbl172
                block70: while (true) {
                    v21 /* !! */  = (long)(v22 - id.ftav("ftuq", ftbg(int ), (int)82));
lbl172:
                    // 2 sources

                    switch ((int)v21 /* !! */ ) {
                        case -1663132914: {
                            v22 = id.ftav("ftur", ftbg(int ), (int)83);
                            continue block70;
                        }
                        case -409890131: {
                            v22 = id.ftav("ftus", ftbg(int ), (int)84);
                            continue block70;
                        }
                        case -351994481: {
                            break block70;
                        }
                    }
                    break;
                }
                v23 = id.mc.field_1724;
                v24 /* !! */  = id.mx;
                if (true) ** GOTO lbl186
                block71: while (true) {
                    v24 /* !! */  = (long)(v25 - id.ftav("ftut", ftbg(int ), (int)85));
lbl186:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -1618251124: {
                            v25 = id.ftav("ftuu", ftbg(int ), (int)86);
                            continue block71;
                        }
                        case -351994481: {
                            break block71;
                        }
                        case 2074349900: {
                            v25 = id.ftav("ftuv", ftbg(int ), (int)87);
                            continue block71;
                        }
                    }
                    break;
                }
                if (v23.field_6012 <= 0) break block86;
                if (var2_2) ** GOTO lbl41
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_5 = id.mx - id.ftav("ftuw", ftbg(int ), (int)88)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v26 /* !! */  == id.ftav("ftux", ftas(int ), (int)236)) break;
                    v26 /* !! */  = (long)id.ftav("ftuy", ftas(int ), (int)237);
                }
                v27 /* !! */  = id.mx;
                if (true) ** GOTO lbl207
                block73: while (true) {
                    v27 /* !! */  = (long)(id.ftav("ftva", ftbg(int ), (int)90) - id.ftav("ftuz", ftbg(int ), (int)89));
lbl207:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case -351994481: {
                            break block73;
                        }
                        case -203491436: {
                            continue block73;
                        }
                    }
                    break;
                }
                v28 = id.mc.field_1724;
                v29 /* !! */  = id.mx;
                if (true) ** GOTO lbl217
                block74: while (true) {
                    v29 /* !! */  = (long)(id.ftav("ftvc", ftbg(int ), (int)92) - id.ftav("ftvb", ftbg(int ), (int)91));
lbl217:
                    // 2 sources

                    switch ((int)v29 /* !! */ ) {
                        case -1008138080: {
                            continue block74;
                        }
                        case -351994481: {
                            break block74;
                        }
                    }
                    break;
                }
                if (v28.field_6012 % id.ftav("ftvd", ftas(int ), (int)238) != 0) break block86;
                if (var2_2) ** GOTO lbl41
                v30 = id.ftav("ftve", ftas(int ), (int)239);
                if (var4) {
                    throw null;
                }
                break block87;
            }
            if (!var2_2 && !var2_2) ** break;
            ** while (true)
            v30 = id.ftav("ftvf", ftas(int ), (int)240);
        }
        return (boolean)v30;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public class_243 randomValue() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = id.mx - id.ftav("fuil", ftbg(int ), (int)262)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == id.ftav("fuim", ftas(int ), (int)415)) break;
            v0 /* !! */  = (long)id.ftav("fuin", ftas(int ), (int)416);
        }
        var5_1 = id.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = id.mx - id.ftav("fuio", ftbg(int ), (int)263)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == id.ftav("fuip", ftas(int ), (int)417)) break;
            v1 /* !! */  = (long)id.ftav("fuiq", ftas(int ), (int)418);
        }
        var4_2 /* !! */  = id.b;
        v2 /* !! */  = id.mx;
        if (true) ** GOTO lbl19
        block34: while (true) {
            v2 /* !! */  = (long)(id.ftav("fuis", ftbg(int ), (int)265) - id.ftav("fuir", ftbg(int ), (int)264));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -351994481: {
                    break block34;
                }
                case 1887400032: {
                    continue block34;
                }
            }
            break;
        }
        var3_3 = id.a;
        if (var5_1) {
            throw null;
lbl27:
            // 3 sources

            return null;
        }
        if (var3_3) ** GOTO lbl27
        if (var4_2 /* !! */  == 0) ** GOTO lbl-1000
        block4 : switch (var4_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_3) ** GOTO lbl27
                var1_4 = id.ftav("fuit", ftcm(int ), (int)266);
                if (!var3_3 && !var3_3) ** break;
                ** continue;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = id.mx - id.ftav("fuiu", ftbg(int ), (int)267)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == id.ftav("fuiv", ftas(int ), (int)419)) break;
                    v3 /* !! */  = (long)id.ftav("fuiw", ftas(int ), (int)420);
                }
                v4 = (float)(-var1_4);
                v5 = (float)var1_4;
                v6 /* !! */  = id.mx;
                if (true) ** GOTO lbl49
                block37: while (true) {
                    v6 /* !! */  = (long)(id.ftav("fuiy", ftbg(int ), (int)269) - id.ftav("fuix", ftbg(int ), (int)268));
lbl49:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1446631204: {
                            continue block37;
                        }
                        case -351994481: {
                            break block37;
                        }
                    }
                    break;
                }
                v7 = this.randomFloat(v4, v5);
                v8 = (float)(-var1_4);
                v9 = (float)var1_4;
                v10 /* !! */  = id.mx;
                if (true) ** GOTO lbl61
                block38: while (true) {
                    v10 /* !! */  = (long)(id.ftav("fuja", ftbg(int ), (int)271) - id.ftav("fuiz", ftbg(int ), (int)270));
lbl61:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -351994481: {
                            break block38;
                        }
                        case 1735853343: {
                            continue block38;
                        }
                    }
                    break;
                }
                v11 = this.randomFloat(v8, v9);
                v12 = (float)(-var1_4);
                v13 = (float)var1_4;
                v14 /* !! */  = id.mx;
                if (true) ** GOTO lbl73
                block39: while (true) {
                    v14 /* !! */  = (long)(v15 - id.ftav("fujb", ftbg(int ), (int)272));
lbl73:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -351994481: {
                            break block39;
                        }
                        case 382245594: {
                            v15 = id.ftav("fujc", ftbg(int ), (int)273);
                            continue block39;
                        }
                        case 541314408: {
                            v15 = id.ftav("fujd", ftbg(int ), (int)274);
                            continue block39;
                        }
                        case 995359911: {
                            v15 = id.ftav("fuje", ftbg(int ), (int)275);
                            continue block39;
                        }
                    }
                    break;
                }
                v16 = this.randomFloat(v12, v13);
                v17 /* !! */  = id.mx;
                if (true) ** GOTO lbl90
                block40: while (true) {
                    v17 /* !! */  = (long)(v18 - id.ftav("fujf", ftbg(int ), (int)276));
lbl90:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -351994481: {
                            break block40;
                        }
                        case -288104123: {
                            v18 = id.ftav("fujg", ftbg(int ), (int)277);
                            continue block40;
                        }
                        case -146812736: {
                            v18 = id.ftav("fujh", ftbg(int ), (int)278);
                            continue block40;
                        }
                        case 610532918: {
                            v18 = id.ftav("fuji", ftbg(int ), (int)279);
                            continue block40;
                        }
                    }
                    break;
                }
                return new class_243(v7, v11, v16);
            }
lbl103:
            // 2 sources

            case 0: {
                var4_2 /* !! */  = (int)id.ftav("fujj", ftas(int ), (int)421);
                if (var5_1) {
                    throw null;
                }
            }
            case 1: {
                var4_2 /* !! */  = (int)id.ftav("fujk", ftas(int ), (int)422);
                if (var5_1) {
                    throw null;
                }
                ** GOTO lbl122
            }
            case 2: {
                do {
                    var4_2 /* !! */  = (int)id.ftav("fujl", ftas(int ), (int)423);
                } while (!var5_1);
                throw null;
            }
            case 3: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_2 /* !! */  = (int)id.ftav("fujm", ftas(int ), (int)424);
                    if (!var5_1) break block4;
                    throw null;
                }
            }
lbl122:
            // 2 sources

            case 4: {
                var4_2 /* !! */  = (int)id.ftav("fujn", ftas(int ), (int)425);
                if (!var5_1) ** GOTO lbl103
                throw null;
            }
            case 5: 
        }
        var4_2 /* !! */  = (int)id.ftav("fujo", ftas(int ), (int)426);
        ** while (!var5_1)
lbl129:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void fujz() {
        id.ftbh[0] = 3452049781472860662L;
        id.ftbh[1] = -416492024269765256L;
        id.ftbh[2] = -1743361916795490980L;
        id.ftbh[3] = 958781660994072448L;
        id.ftbh[4] = -1447186258996608627L;
        id.ftbh[5] = 6501758844235778985L;
        id.ftbh[6] = -1276522944267561698L;
        id.ftbh[7] = -997514800899518142L;
        id.ftbh[8] = 3090982068468276075L;
        id.ftbh[9] = 3350933557957594813L;
        id.ftbh[10] = -7226566256770827434L;
        id.ftbh[11] = -8768575082679559285L;
        id.ftbh[12] = -9119607284729118764L;
        id.ftbh[13] = -3263262915332921143L;
        id.ftbh[14] = 1783713625664449456L;
        id.ftbh[15] = 3449461535371698219L;
        id.ftbh[16] = -4443498658453159416L;
        id.ftbh[17] = 6500505688039597351L;
        id.ftbh[18] = -3133568403306273445L;
        id.ftbh[19] = 556058498310134290L;
        id.ftbh[20] = -3448216713653020523L;
        id.ftbh[21] = -1950212072719466665L;
        id.ftbh[22] = -1343573423805523104L;
        id.ftbh[23] = 2448193584275277499L;
        id.ftbh[24] = 5096599003157310934L;
        id.ftbh[25] = 2817933118370138067L;
        id.ftbh[26] = 524736963615375L;
        id.ftbh[27] = -7634840488513116042L;
        id.ftbh[28] = -4165830201075529489L;
        id.ftbh[29] = 5947215824179692727L;
        id.ftbh[30] = -5673303716997562830L;
        id.ftbh[31] = -2764871875037092937L;
        id.ftbh[32] = -4987803612210791155L;
        id.ftbh[33] = 3704560513787658571L;
        id.ftbh[34] = -2176914391727322696L;
        id.ftbh[35] = 3132988791381534671L;
        id.ftbh[36] = 6713864545512874831L;
        id.ftbh[37] = -9220181273683709810L;
        id.ftbh[38] = 4043268491183141539L;
        id.ftbh[39] = -2955251745410445726L;
        id.ftbh[40] = 8332935090882136263L;
        id.ftbh[41] = -8241084534720980021L;
        id.ftbh[42] = -7964257308468367949L;
        id.ftbh[43] = -71579637791546210L;
        id.ftbh[44] = 2285205636690345627L;
        id.ftbh[45] = 5282314859434792230L;
        id.ftbh[46] = -4559748012310785543L;
        id.ftbh[47] = -1242454947937183603L;
        id.ftbh[48] = 2457765167950870019L;
        id.ftbh[49] = -1518978646174962715L;
        id.ftbh[50] = -5283660866938417097L;
        id.ftbh[51] = 2045173518512667428L;
        id.ftbh[52] = 6468561259128291454L;
        id.ftbh[53] = 2166116467481390701L;
        id.ftbh[54] = 6876226617576848825L;
        id.ftbh[55] = 7512168130117038805L;
        id.ftbh[56] = 3237414856826932945L;
        id.ftbh[57] = -139073299197393720L;
        id.ftbh[58] = -5288945836432783822L;
        id.ftbh[59] = 533238832052085322L;
        id.ftbh[60] = -8367070046142840727L;
        id.ftbh[61] = -2656087008156482794L;
        id.ftbh[62] = 7162721998852392910L;
        id.ftbh[63] = -6147815882784243503L;
        id.ftbh[64] = 3282708501449371716L;
        id.ftbh[65] = 4517495141202056579L;
        id.ftbh[66] = 3620715679058747840L;
        id.ftbh[67] = 1722785269139855120L;
        id.ftbh[68] = 2419354386598764825L;
        id.ftbh[69] = -7941694070017533918L;
        id.ftbh[70] = 1301176310457795873L;
        id.ftbh[71] = 8233124750723007332L;
        id.ftbh[72] = 1571460227925349396L;
        id.ftbh[73] = -3410630294009681611L;
        id.ftbh[74] = 1827017366540632879L;
        id.ftbh[75] = 9217789693729133981L;
        id.ftbh[76] = 826848564185675591L;
        id.ftbh[77] = -7586081879486780479L;
        id.ftbh[78] = -7304057229873464889L;
        id.ftbh[79] = -1109964922063536858L;
        id.ftbh[80] = -3039057131078540265L;
        id.ftbh[81] = -1843283932274302663L;
        id.ftbh[82] = 5908345422812937568L;
        id.ftbh[83] = 7034250519687688574L;
        id.ftbh[84] = 5522833924693641423L;
        id.ftbh[85] = -254695353377221990L;
        id.ftbh[86] = -4295203961723089528L;
        id.ftbh[87] = 26007032278665964L;
        id.ftbh[88] = 5711997222685509940L;
        id.ftbh[89] = 8596707028754335410L;
        id.ftbh[90] = -2212360996808845923L;
        id.ftbh[91] = -2754955827941092869L;
        id.ftbh[92] = -8055935097933486666L;
        id.ftbh[93] = 2516426419317869820L;
        id.ftbh[94] = 5822915197179124662L;
        id.ftbh[95] = 4106956795247903704L;
        id.ftbh[96] = 3776253558250339912L;
        id.ftbh[97] = -1012888665122803808L;
        id.ftbh[98] = -7568188953728602290L;
        id.ftbh[99] = 915675171229411510L;
    }

    private static /* synthetic */ void fujq() {
        id.ftat[100] = 1868462612;
        id.ftat[101] = -1845227820;
        id.ftat[102] = 410983085;
        id.ftat[103] = -630620255;
        id.ftat[104] = -1702579523;
        id.ftat[105] = 802861967;
        id.ftat[106] = 108166793;
        id.ftat[107] = 187178949;
        id.ftat[108] = 278263179;
        id.ftat[109] = -334069087;
        id.ftat[110] = -1838731557;
        id.ftat[111] = 250443420;
        id.ftat[112] = -1247198951;
        id.ftat[113] = 1441436834;
        id.ftat[114] = -1331345300;
        id.ftat[115] = -2147021670;
        id.ftat[116] = 240106015;
        id.ftat[117] = 1896345784;
        id.ftat[118] = 759122362;
        id.ftat[119] = 554470353;
        id.ftat[120] = -587036786;
        id.ftat[121] = -1961047558;
        id.ftat[122] = 914938200;
        id.ftat[123] = 1178813121;
        id.ftat[124] = -1172778699;
        id.ftat[125] = 71484342;
        id.ftat[126] = 1379740585;
        id.ftat[127] = -1329436675;
        id.ftat[128] = 1644754370;
        id.ftat[129] = 2127198915;
        id.ftat[130] = -540619202;
        id.ftat[131] = 1809874484;
        id.ftat[132] = -867805445;
        id.ftat[133] = -1830555707;
        id.ftat[134] = 1492310608;
        id.ftat[135] = -653938630;
        id.ftat[136] = -1505790658;
        id.ftat[137] = -1299665943;
        id.ftat[138] = -1099574161;
        id.ftat[139] = 260435412;
        id.ftat[140] = -1877597086;
        id.ftat[141] = -1962562711;
        id.ftat[142] = 390642666;
        id.ftat[143] = 2028021605;
        id.ftat[144] = -1645865338;
        id.ftat[145] = 1624269876;
        id.ftat[146] = 1967722092;
        id.ftat[147] = -50922656;
        id.ftat[148] = -1223947854;
        id.ftat[149] = -1322024385;
        id.ftat[150] = 1726923805;
        id.ftat[151] = -1197564364;
        id.ftat[152] = -1490923095;
        id.ftat[153] = -1189796892;
        id.ftat[154] = 966232332;
        id.ftat[155] = -1561663532;
        id.ftat[156] = 680366802;
        id.ftat[157] = 1373745852;
        id.ftat[158] = -1844005891;
        id.ftat[159] = 1835907467;
        id.ftat[160] = 415159776;
        id.ftat[161] = 851683684;
        id.ftat[162] = 237879826;
        id.ftat[163] = -2125646270;
        id.ftat[164] = 16671171;
        id.ftat[165] = -301868585;
        id.ftat[166] = 1099522140;
        id.ftat[167] = 556826716;
        id.ftat[168] = 1843718983;
        id.ftat[169] = -1377629791;
        id.ftat[170] = 538654661;
        id.ftat[171] = 1177609791;
        id.ftat[172] = 1507793370;
        id.ftat[173] = -1961954174;
        id.ftat[174] = -160886095;
        id.ftat[175] = -816331804;
        id.ftat[176] = 2121360682;
        id.ftat[177] = 1968313518;
        id.ftat[178] = 1659769222;
        id.ftat[179] = -1895793474;
        id.ftat[180] = 1655755577;
        id.ftat[181] = -1070944699;
        id.ftat[182] = 1379071475;
        id.ftat[183] = -621195979;
        id.ftat[184] = -976806677;
        id.ftat[185] = -69529583;
        id.ftat[186] = 101634466;
        id.ftat[187] = -1430986880;
        id.ftat[188] = 1640648652;
        id.ftat[189] = 95316066;
        id.ftat[190] = -358309519;
        id.ftat[191] = 357955104;
        id.ftat[192] = -1054685274;
        id.ftat[193] = 1319402215;
        id.ftat[194] = -980421268;
        id.ftat[195] = -1545083523;
        id.ftat[196] = 44070797;
        id.ftat[197] = -2109036536;
        id.ftat[198] = -304457755;
        id.ftat[199] = -109030003;
    }

    private static /* synthetic */ void fujp() {
        id.ftat[0] = 1991174804;
        id.ftat[1] = -1106530561;
        id.ftat[2] = 391905078;
        id.ftat[3] = 1870216052;
        id.ftat[4] = -1486615907;
        id.ftat[5] = -1149869876;
        id.ftat[6] = 2073163688;
        id.ftat[7] = 768290703;
        id.ftat[8] = 731897496;
        id.ftat[9] = 546025858;
        id.ftat[10] = -1911079654;
        id.ftat[11] = -796542012;
        id.ftat[12] = -1936145560;
        id.ftat[13] = 1676512785;
        id.ftat[14] = 1695985564;
        id.ftat[15] = -1489603337;
        id.ftat[16] = 1385592786;
        id.ftat[17] = 529057399;
        id.ftat[18] = -1601459631;
        id.ftat[19] = 998610095;
        id.ftat[20] = -1402480578;
        id.ftat[21] = 1125950883;
        id.ftat[22] = -371726705;
        id.ftat[23] = 857200889;
        id.ftat[24] = -595645910;
        id.ftat[25] = -1439823941;
        id.ftat[26] = 122978227;
        id.ftat[27] = 170725064;
        id.ftat[28] = 570260977;
        id.ftat[29] = 628110669;
        id.ftat[30] = 1547922885;
        id.ftat[31] = 1329114754;
        id.ftat[32] = 917395980;
        id.ftat[33] = -266846969;
        id.ftat[34] = 989513834;
        id.ftat[35] = 1265283926;
        id.ftat[36] = -1465944071;
        id.ftat[37] = -437702371;
        id.ftat[38] = -1434615585;
        id.ftat[39] = -1610813851;
        id.ftat[40] = 1341683004;
        id.ftat[41] = 2063000377;
        id.ftat[42] = -185877601;
        id.ftat[43] = 2143782588;
        id.ftat[44] = 234089789;
        id.ftat[45] = 1579026768;
        id.ftat[46] = 250298567;
        id.ftat[47] = -1187424732;
        id.ftat[48] = -1777743282;
        id.ftat[49] = -2018446146;
        id.ftat[50] = 1797271005;
        id.ftat[51] = 554613402;
        id.ftat[52] = 588771016;
        id.ftat[53] = -4113508;
        id.ftat[54] = 690094048;
        id.ftat[55] = -1212366603;
        id.ftat[56] = 1570625460;
        id.ftat[57] = -635432675;
        id.ftat[58] = 95188879;
        id.ftat[59] = 1748668726;
        id.ftat[60] = 1914704168;
        id.ftat[61] = -2133702448;
        id.ftat[62] = -242886598;
        id.ftat[63] = -243377029;
        id.ftat[64] = -1246582194;
        id.ftat[65] = -1124962663;
        id.ftat[66] = 1411927865;
        id.ftat[67] = 799158673;
        id.ftat[68] = -185074247;
        id.ftat[69] = 1120699374;
        id.ftat[70] = 466912656;
        id.ftat[71] = -268927423;
        id.ftat[72] = 919832001;
        id.ftat[73] = -828102435;
        id.ftat[74] = 579835267;
        id.ftat[75] = -1147199524;
        id.ftat[76] = 501650186;
        id.ftat[77] = 89084763;
        id.ftat[78] = -286327214;
        id.ftat[79] = -1181006593;
        id.ftat[80] = 350686973;
        id.ftat[81] = -1948456904;
        id.ftat[82] = 79248530;
        id.ftat[83] = -1820882912;
        id.ftat[84] = 1614718085;
        id.ftat[85] = -182469850;
        id.ftat[86] = 1820993242;
        id.ftat[87] = 2030110987;
        id.ftat[88] = -43840265;
        id.ftat[89] = -529801828;
        id.ftat[90] = -1357496910;
        id.ftat[91] = 1079467155;
        id.ftat[92] = -1136771712;
        id.ftat[93] = -1419952339;
        id.ftat[94] = -1734834676;
        id.ftat[95] = -1437686551;
        id.ftat[96] = 856145335;
        id.ftat[97] = 1985741532;
        id.ftat[98] = -676684539;
        id.ftat[99] = -144558229;
    }

    private static /* synthetic */ void fujr() {
        id.ftat[200] = -691083135;
        id.ftat[201] = -1591152240;
        id.ftat[202] = 43492728;
        id.ftat[203] = -393260358;
        id.ftat[204] = 1383654491;
        id.ftat[205] = 190857648;
        id.ftat[206] = -1721023338;
        id.ftat[207] = -1032608730;
        id.ftat[208] = 724730829;
        id.ftat[209] = 8518310;
        id.ftat[210] = -90763099;
        id.ftat[211] = -1338042255;
        id.ftat[212] = -1973680919;
        id.ftat[213] = 1965192030;
        id.ftat[214] = -2006346882;
        id.ftat[215] = 1602941197;
        id.ftat[216] = -1124125031;
        id.ftat[217] = 1192555376;
        id.ftat[218] = 710019796;
        id.ftat[219] = 737625030;
        id.ftat[220] = 1655502654;
        id.ftat[221] = -944559892;
        id.ftat[222] = 1395331768;
        id.ftat[223] = 712834924;
        id.ftat[224] = -1367116051;
        id.ftat[225] = 2115797948;
        id.ftat[226] = -95315915;
        id.ftat[227] = -605296177;
        id.ftat[228] = -436930093;
        id.ftat[229] = 332972120;
        id.ftat[230] = 2088112830;
        id.ftat[231] = -895349163;
        id.ftat[232] = -808890314;
        id.ftat[233] = -483460676;
        id.ftat[234] = 295707973;
        id.ftat[235] = -291564674;
        id.ftat[236] = 775864847;
        id.ftat[237] = -471056317;
        id.ftat[238] = -375958239;
        id.ftat[239] = -1465800;
        id.ftat[240] = -379677965;
        id.ftat[241] = 818359993;
        id.ftat[242] = 1734648789;
        id.ftat[243] = 697595187;
        id.ftat[244] = 1801258258;
        id.ftat[245] = -1638661575;
        id.ftat[246] = -1147975609;
        id.ftat[247] = 750456547;
        id.ftat[248] = -159385358;
        id.ftat[249] = 1076625011;
        id.ftat[250] = -378434200;
        id.ftat[251] = -1044196780;
        id.ftat[252] = -332109856;
        id.ftat[253] = -1689860137;
        id.ftat[254] = 1852612474;
        id.ftat[255] = -1399182931;
        id.ftat[256] = -1644927225;
        id.ftat[257] = -288413912;
        id.ftat[258] = 851452049;
        id.ftat[259] = -821260040;
        id.ftat[260] = -1835176455;
        id.ftat[261] = -1803127478;
        id.ftat[262] = 639339126;
        id.ftat[263] = 24024334;
        id.ftat[264] = 1952886720;
        id.ftat[265] = -606416284;
        id.ftat[266] = -297495359;
        id.ftat[267] = -2019681813;
        id.ftat[268] = 686156593;
        id.ftat[269] = -897268829;
        id.ftat[270] = 885796680;
        id.ftat[271] = -351631057;
        id.ftat[272] = 1671986232;
        id.ftat[273] = -265253474;
        id.ftat[274] = -66644992;
        id.ftat[275] = 1837231841;
        id.ftat[276] = 1587584319;
        id.ftat[277] = -2049124017;
        id.ftat[278] = 1164325453;
        id.ftat[279] = 484507181;
        id.ftat[280] = 791958962;
        id.ftat[281] = -732238848;
        id.ftat[282] = -912849135;
        id.ftat[283] = 699677741;
        id.ftat[284] = 1634486021;
        id.ftat[285] = -283542059;
        id.ftat[286] = -717973906;
        id.ftat[287] = 555790145;
        id.ftat[288] = 702181572;
        id.ftat[289] = -2147461179;
        id.ftat[290] = 1132156182;
        id.ftat[291] = -1359962087;
        id.ftat[292] = -1790902778;
        id.ftat[293] = -1500591490;
        id.ftat[294] = -1527072426;
        id.ftat[295] = 1524574130;
        id.ftat[296] = 2033941819;
        id.ftat[297] = -2041221327;
        id.ftat[298] = -1120402088;
        id.ftat[299] = 1742808618;
    }

    private static /* synthetic */ void fukc() {
        id.ftbi[0] = 3452049781472860662L;
        id.ftbi[1] = -416492024269765594L;
        id.ftbi[2] = -1743361916795490980L;
        id.ftbi[3] = 958781660994072286L;
        id.ftbi[4] = -1447186258996608577L;
        id.ftbi[5] = 6501758844235778845L;
        id.ftbi[6] = -1276522944267561698L;
        id.ftbi[7] = -3623526592401797126L;
        id.ftbi[8] = 7680079720014633835L;
        id.ftbi[9] = 3350933557957594167L;
        id.ftbi[10] = -7226566256770827812L;
        id.ftbi[11] = -3990425555544179125L;
        id.ftbi[12] = 8057378199556448657L;
        id.ftbi[13] = 6071143412098643976L;
        id.ftbi[14] = 2390881093010915665L;
        id.ftbi[15] = 7580344929160729739L;
        id.ftbi[16] = 6400263136781604281L;
        id.ftbi[17] = -6222329144871511578L;
        id.ftbi[18] = 141457066010106059L;
        id.ftbi[19] = -3274489036556821498L;
        id.ftbi[20] = 3607425396541026083L;
        id.ftbi[21] = 7007363149317454084L;
        id.ftbi[22] = -2777428864574017940L;
        id.ftbi[23] = 2448193584275277499L;
        id.ftbi[24] = 1397593769062913814L;
        id.ftbi[25] = 5365542779815626138L;
        id.ftbi[26] = 2586888360438773061L;
        id.ftbi[27] = 7473479435004587194L;
        id.ftbi[28] = 4834714022036841266L;
        id.ftbi[29] = 713337781536093658L;
        id.ftbi[30] = -3067186252182553942L;
        id.ftbi[31] = 5685027921255745844L;
        id.ftbi[32] = 2747197590611462308L;
        id.ftbi[33] = -6725387805797322684L;
        id.ftbi[34] = 3858014372047650545L;
        id.ftbi[35] = 1172481175568430911L;
        id.ftbi[36] = -8140913117442989937L;
        id.ftbi[37] = -6117525086420883171L;
        id.ftbi[38] = -7568492761927414931L;
        id.ftbi[39] = 3524046294918879168L;
        id.ftbi[40] = 5996701147773000630L;
        id.ftbi[41] = 2927547618997353240L;
        id.ftbi[42] = 249510232110833344L;
        id.ftbi[43] = 7773911121319425281L;
        id.ftbi[44] = 2285205636690345627L;
        id.ftbi[45] = -3242400812418035283L;
        id.ftbi[46] = 5035162378910476653L;
        id.ftbi[47] = -5481503160960476714L;
        id.ftbi[48] = -5765777527357676321L;
        id.ftbi[49] = -7339495113726312504L;
        id.ftbi[50] = -3194181295301722592L;
        id.ftbi[51] = 61328760484323350L;
        id.ftbi[52] = 8951551935275819591L;
        id.ftbi[53] = -1256953576300097911L;
        id.ftbi[54] = -6597321215461131315L;
        id.ftbi[55] = -5148964020132220745L;
        id.ftbi[56] = 3536470310510801520L;
        id.ftbi[57] = -3164500903688405660L;
        id.ftbi[58] = -7159976587589309855L;
        id.ftbi[59] = 2310723441115019296L;
        id.ftbi[60] = 3420808495562596447L;
        id.ftbi[61] = -4909279020708207511L;
        id.ftbi[62] = 6448203465736354231L;
        id.ftbi[63] = -8700262329642498336L;
        id.ftbi[64] = -421441767192071280L;
        id.ftbi[65] = 3959583609847855667L;
        id.ftbi[66] = -112563147251520324L;
        id.ftbi[67] = -7050720094886491L;
        id.ftbi[68] = 6306351867659065684L;
        id.ftbi[69] = 6718999448249486243L;
        id.ftbi[70] = 6563716098637525870L;
        id.ftbi[71] = -3840146945546889116L;
        id.ftbi[72] = -2422712828082020539L;
        id.ftbi[73] = -167471809949595088L;
        id.ftbi[74] = -7740965586847786462L;
        id.ftbi[75] = 8680425204951537713L;
        id.ftbi[76] = 6499752232944171514L;
        id.ftbi[77] = -4054523039507590117L;
        id.ftbi[78] = -77370267721662789L;
        id.ftbi[79] = -3802529303225269411L;
        id.ftbi[80] = -5923614082360502381L;
        id.ftbi[81] = 5630563632303389245L;
        id.ftbi[82] = 8328048313988308918L;
        id.ftbi[83] = -2262130436178893854L;
        id.ftbi[84] = 7479886824218023262L;
        id.ftbi[85] = 8010119252784356909L;
        id.ftbi[86] = -5343477402441285863L;
        id.ftbi[87] = -1352444498307553208L;
        id.ftbi[88] = 2730160227354703869L;
        id.ftbi[89] = 2528535392962513478L;
        id.ftbi[90] = -595252151561937087L;
        id.ftbi[91] = -7288542330666700147L;
        id.ftbi[92] = -5391406262946632420L;
        id.ftbi[93] = 1387134934016189324L;
        id.ftbi[94] = 6976762306099535765L;
        id.ftbi[95] = 5995574551900853578L;
        id.ftbi[96] = 1237027620920258824L;
        id.ftbi[97] = -2671807375622079378L;
        id.ftbi[98] = 9015396371302300825L;
        id.ftbi[99] = 1253677876390360512L;
    }

    private static /* synthetic */ void fukb() {
        id.ftbh[200] = 8084748077342380024L;
        id.ftbh[201] = -7831050155420403408L;
        id.ftbh[202] = 7824697686105321477L;
        id.ftbh[203] = -477202825389971559L;
        id.ftbh[204] = -7227525705904858390L;
        id.ftbh[205] = -8879576569876294626L;
        id.ftbh[206] = 4315801514850942469L;
        id.ftbh[207] = -2311956351900543856L;
        id.ftbh[208] = -7170818829343194L;
        id.ftbh[209] = -608700874249273768L;
        id.ftbh[210] = -2472076536352620071L;
        id.ftbh[211] = -5810615586303666831L;
        id.ftbh[212] = -2954735015944958364L;
        id.ftbh[213] = 5099160140968670681L;
        id.ftbh[214] = 4793856202907415664L;
        id.ftbh[215] = 7652441442206899735L;
        id.ftbh[216] = 6540038916804158627L;
        id.ftbh[217] = -468073819819757767L;
        id.ftbh[218] = 4840223366947918983L;
        id.ftbh[219] = -2250112897515563151L;
        id.ftbh[220] = -1189153190135471132L;
        id.ftbh[221] = 1930071411390579962L;
        id.ftbh[222] = 6660763539887849940L;
        id.ftbh[223] = 2749149657887282130L;
        id.ftbh[224] = 7486830996229292005L;
        id.ftbh[225] = -3334566526436510980L;
        id.ftbh[226] = 366186816206740186L;
        id.ftbh[227] = 2723591210905408083L;
        id.ftbh[228] = -1716368180639623434L;
        id.ftbh[229] = 8659333472558052428L;
        id.ftbh[230] = 1758061600827110623L;
        id.ftbh[231] = -8896760516903141935L;
        id.ftbh[232] = 1763095486669001191L;
        id.ftbh[233] = -8992563447643426299L;
        id.ftbh[234] = -1675467885343930650L;
        id.ftbh[235] = -4444296101427156312L;
        id.ftbh[236] = 3627698392803911177L;
        id.ftbh[237] = -2756921927612924929L;
        id.ftbh[238] = -8533782876684369026L;
        id.ftbh[239] = 5062022190125523427L;
        id.ftbh[240] = -3840422112804987454L;
        id.ftbh[241] = 7425856278293790119L;
        id.ftbh[242] = 2280403845368719380L;
        id.ftbh[243] = -4136231627272907554L;
        id.ftbh[244] = 4986372129614515837L;
        id.ftbh[245] = -4876768224307514593L;
        id.ftbh[246] = -3152149559397421216L;
        id.ftbh[247] = -5242142477447916047L;
        id.ftbh[248] = -4766587315698542351L;
        id.ftbh[249] = -2563152200755757521L;
        id.ftbh[250] = 8193076224543968274L;
        id.ftbh[251] = -1565043987204803206L;
        id.ftbh[252] = -657264375517461837L;
        id.ftbh[253] = -570756915961428441L;
        id.ftbh[254] = 7648983782524715991L;
        id.ftbh[255] = 8875778047682733351L;
        id.ftbh[256] = -4482485977754483774L;
        id.ftbh[257] = -1047607058915981308L;
        id.ftbh[258] = 8722931654783926095L;
        id.ftbh[259] = -2970426050940489521L;
        id.ftbh[260] = -7263710131800288613L;
        id.ftbh[261] = -9137400049937893462L;
        id.ftbh[262] = -7206307214305557140L;
        id.ftbh[263] = -7272011408789455267L;
        id.ftbh[264] = 3809366454060287064L;
        id.ftbh[265] = 5025634152061218533L;
        id.ftbh[266] = 5225308508538618513L;
        id.ftbh[267] = 4494987196829419216L;
        id.ftbh[268] = 8224488666069619204L;
        id.ftbh[269] = -9172637395750773754L;
        id.ftbh[270] = -6814801978267373162L;
        id.ftbh[271] = 8232135598438418195L;
        id.ftbh[272] = -8221672224580655156L;
        id.ftbh[273] = 2201439503962838511L;
        id.ftbh[274] = 1985570685606030641L;
        id.ftbh[275] = -204490325555478692L;
        id.ftbh[276] = -2993463765002289129L;
        id.ftbh[277] = 501631150903282518L;
        id.ftbh[278] = 3448235456167005711L;
        id.ftbh[279] = -4960327325839196624L;
    }

    private static /* synthetic */ void fukd() {
        id.ftbi[100] = 3635206036297459451L;
        id.ftbi[101] = 6922893349925343089L;
        id.ftbi[102] = 6494355932809017185L;
        id.ftbi[103] = 3808304992726738097L;
        id.ftbi[104] = 4444825169946725507L;
        id.ftbi[105] = -5504064240942170713L;
        id.ftbi[106] = -3254760655179159518L;
        id.ftbi[107] = -7908826478424563246L;
        id.ftbi[108] = 8932494941353995409L;
        id.ftbi[109] = 5008017475632811503L;
        id.ftbi[110] = -2791470715576165446L;
        id.ftbi[111] = -2449493718872554010L;
        id.ftbi[112] = -6230498859028353639L;
        id.ftbi[113] = -4080788228293799430L;
        id.ftbi[114] = -5520113164332200050L;
        id.ftbi[115] = -2517522309433321767L;
        id.ftbi[116] = 4797628052501637095L;
        id.ftbi[117] = 5601865583334628100L;
        id.ftbi[118] = 2360910095747521443L;
        id.ftbi[119] = 5171491873007619337L;
        id.ftbi[120] = 5311911320711329279L;
        id.ftbi[121] = 3965838948800671406L;
        id.ftbi[122] = 8459462644832770972L;
        id.ftbi[123] = 753948249113928184L;
        id.ftbi[124] = -5111974507577876861L;
        id.ftbi[125] = 8953010060715736454L;
        id.ftbi[126] = -4439838542324840001L;
        id.ftbi[127] = -9101509679316526090L;
        id.ftbi[128] = -4105055186734596137L;
        id.ftbi[129] = 6842902683720886012L;
        id.ftbi[130] = 1360348592515467744L;
        id.ftbi[131] = -1714797965137936849L;
        id.ftbi[132] = 1440843821695816217L;
        id.ftbi[133] = 3442724963922671121L;
        id.ftbi[134] = -758249525120294238L;
        id.ftbi[135] = 8929891635711552965L;
        id.ftbi[136] = 283815678035358948L;
        id.ftbi[137] = -3745967045786014351L;
        id.ftbi[138] = 4072491224376582932L;
        id.ftbi[139] = 5508673904577070500L;
        id.ftbi[140] = -4201870960677700084L;
        id.ftbi[141] = -3532791533091836202L;
        id.ftbi[142] = 4370913555096604979L;
        id.ftbi[143] = -1357763767715468257L;
        id.ftbi[144] = -397075132689474729L;
        id.ftbi[145] = 5235882197432183602L;
        id.ftbi[146] = -8463231222079703521L;
        id.ftbi[147] = 6007756606500985604L;
        id.ftbi[148] = 305490659997402872L;
        id.ftbi[149] = -5186682603080178970L;
        id.ftbi[150] = 31364494816120292L;
        id.ftbi[151] = -2630016487985195034L;
        id.ftbi[152] = -4496222305722895050L;
        id.ftbi[153] = 1702415799489740812L;
        id.ftbi[154] = -6626993909156867397L;
        id.ftbi[155] = -2110507502636377022L;
        id.ftbi[156] = 8532360406053280339L;
        id.ftbi[157] = 5500098536993484547L;
        id.ftbi[158] = 5829805618111079874L;
        id.ftbi[159] = 6888074251328666193L;
        id.ftbi[160] = 9132223448417428935L;
        id.ftbi[161] = 5371155181628795116L;
        id.ftbi[162] = 8884600240118861934L;
        id.ftbi[163] = 30003099132141730L;
        id.ftbi[164] = -4511142432784303354L;
        id.ftbi[165] = 3724053970125357871L;
        id.ftbi[166] = -6583882027939116028L;
        id.ftbi[167] = 3864640033650881317L;
        id.ftbi[168] = 2444814610345185187L;
        id.ftbi[169] = -7201634532121513929L;
        id.ftbi[170] = -3114281313405555998L;
        id.ftbi[171] = 7626966024929729035L;
        id.ftbi[172] = -6336662727313320892L;
        id.ftbi[173] = 4444925498056893989L;
        id.ftbi[174] = 5811388944353580227L;
        id.ftbi[175] = 2482874908651236381L;
        id.ftbi[176] = 1233020461315824876L;
        id.ftbi[177] = 3565589495970821081L;
        id.ftbi[178] = -6151139320981112077L;
        id.ftbi[179] = -8331526017174647037L;
        id.ftbi[180] = 4865722222575191958L;
        id.ftbi[181] = 4327151488772570981L;
        id.ftbi[182] = -5461282720874760927L;
        id.ftbi[183] = -5928915303121156145L;
        id.ftbi[184] = -6620254869840193415L;
        id.ftbi[185] = -2220472064832575578L;
        id.ftbi[186] = 6560072421472984868L;
        id.ftbi[187] = -6001127257989433746L;
        id.ftbi[188] = 4479399063054095592L;
        id.ftbi[189] = -6735132080595515114L;
        id.ftbi[190] = -5718193600253371055L;
        id.ftbi[191] = 7813060592732499978L;
        id.ftbi[192] = 433810979779795115L;
        id.ftbi[193] = 4998586932969307973L;
        id.ftbi[194] = -1956177291216886563L;
        id.ftbi[195] = 9176708703402745595L;
        id.ftbi[196] = 5085474983540129121L;
        id.ftbi[197] = 588485242424852027L;
        id.ftbi[198] = 9129940019060752967L;
        id.ftbi[199] = -6804837512572329525L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ov clampToViewFov(float var1_1, float var2_2) {
        block83: {
            block82: {
                v0 /* !! */  = id.mx;
                if (true) ** GOTO lbl5
                block59: while (true) {
                    v0 /* !! */  = (long)(v1 - id.ftav("fuff", ftbg(int ), (int)218));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -351994481: {
                            break block59;
                        }
                        case 786576387: {
                            v1 = id.ftav("fufg", ftbg(int ), (int)219);
                            continue block59;
                        }
                        case 1121514608: {
                            v1 = id.ftav("fufh", ftbg(int ), (int)220);
                            continue block59;
                        }
                        case 1746451398: {
                            v1 = id.ftav("fufi", ftbg(int ), (int)221);
                            continue block59;
                        }
                    }
                    break;
                }
                var9_3 = id.c;
                v2 /* !! */  = id.mx;
                if (true) ** GOTO lbl22
                block60: while (true) {
                    v2 /* !! */  = (long)(v3 - id.ftav("fufj", ftbg(int ), (int)222));
lbl22:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -351994481: {
                            break block60;
                        }
                        case 1842118914: {
                            v3 = id.ftav("fufk", ftbg(int ), (int)223);
                            continue block60;
                        }
                        case 1853160832: {
                            v3 = id.ftav("fufl", ftbg(int ), (int)224);
                            continue block60;
                        }
                    }
                    break;
                }
                var8_4 = id.b;
                v4 /* !! */  = id.mx;
                if (true) ** GOTO lbl36
                block61: while (true) {
                    v4 /* !! */  = (long)(id.ftav("fufn", ftbg(int ), (int)226) - id.ftav("fufm", ftbg(int ), (int)225));
lbl36:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -351994481: {
                            break block61;
                        }
                        case 1467387049: {
                            continue block61;
                        }
                    }
                    break;
                }
                var7_5 = id.a;
                if (var9_3) {
                    throw null;
lbl44:
                    // 9 sources

                    return null;
                }
                if (var7_5 || var7_5) ** GOTO lbl44
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = id.mx - id.ftav("fufo", ftbg(int ), (int)227)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == id.ftav("fufp", ftas(int ), (int)375)) break;
                    v5 /* !! */  = (long)id.ftav("fufq", ftas(int ), (int)376);
                }
                v6 /* !! */  = id.mx;
                if (true) ** GOTO lbl56
                block64: while (true) {
                    v6 /* !! */  = (long)(v7 - id.ftav("fufr", ftbg(int ), (int)228));
lbl56:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -613122726: {
                            v7 = id.ftav("fufs", ftbg(int ), (int)229);
                            continue block64;
                        }
                        case -540136377: {
                            v7 = id.ftav("fuft", ftbg(int ), (int)230);
                            continue block64;
                        }
                        case -351994481: {
                            break block64;
                        }
                    }
                    break;
                }
                v8 = id.mc.field_1724;
                v9 /* !! */  = id.mx;
                if (true) ** GOTO lbl70
                block65: while (true) {
                    v9 /* !! */  = (long)(v10 - id.ftav("fufu", ftbg(int ), (int)231));
lbl70:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1033249859: {
                            v10 = id.ftav("fufv", ftbg(int ), (int)232);
                            continue block65;
                        }
                        case -351994481: {
                            break block65;
                        }
                        case 299556806: {
                            v10 = id.ftav("fufw", ftbg(int ), (int)233);
                            continue block65;
                        }
                        case 397463877: {
                            v10 = id.ftav("fufx", ftbg(int ), (int)234);
                            continue block65;
                        }
                    }
                    break;
                }
                v11 = var1_1 - v8.method_36454();
                v12 /* !! */  = id.mx;
                if (true) ** GOTO lbl87
                block66: while (true) {
                    v12 /* !! */  = (long)(v13 - id.ftav("fufy", ftbg(int ), (int)235));
lbl87:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1231436502: {
                            v13 = id.ftav("fufz", ftbg(int ), (int)236);
                            continue block66;
                        }
                        case -824989034: {
                            v13 = id.ftav("fuga", ftbg(int ), (int)237);
                            continue block66;
                        }
                        case -351994481: {
                            break block66;
                        }
                    }
                    break;
                }
                var3_6 = class_3532.method_15393((float)v11);
                if (var7_5 || var7_5) ** GOTO lbl44
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_1 = id.mx - id.ftav("fugb", ftbg(int ), (int)238)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == id.ftav("fugc", ftas(int ), (int)377)) break;
                    v14 /* !! */  = (long)id.ftav("fugd", ftas(int ), (int)378);
                }
                v15 /* !! */  = id.mx;
                if (true) ** GOTO lbl107
                block68: while (true) {
                    v15 /* !! */  = (long)(id.ftav("fugf", ftbg(int ), (int)240) - id.ftav("fuge", ftbg(int ), (int)239));
lbl107:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -903373145: {
                            continue block68;
                        }
                        case -351994481: {
                            break block68;
                        }
                    }
                    break;
                }
                v16 = id.mc.field_1724;
                while (true) {
                    if ((v17 /* !! */  = (cfr_temp_2 = id.mx - id.ftav("fugg", ftbg(int ), (int)241)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v17 /* !! */  == id.ftav("fugh", ftas(int ), (int)379)) break;
                    v17 /* !! */  = (long)id.ftav("fugi", ftas(int ), (int)380);
                }
                var4_7 = var2_2 - v16.method_36455();
                if (var7_5 || var7_5) ** GOTO lbl44
                v18 = var3_6;
                v19 = var4_7;
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_3 = id.mx - id.ftav("fugj", ftbg(int ), (int)242)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == id.ftav("fugk", ftas(int ), (int)381)) break;
                    v20 /* !! */  = (long)id.ftav("fugl", ftas(int ), (int)382);
                }
                var5_8 = (float)Math.hypot(v18, v19);
                if (var7_5 || var7_5) ** GOTO lbl44
                if (var5_8 <= id.ftav("fugm", ftbn(int ), (int)383)) break block82;
                if (var7_5) ** GOTO lbl44
                if (!(var5_8 < id.ftav("fugn", ftbn(int ), (int)384))) break block83;
                if (var7_5) ** GOTO lbl44
            }
            if (var7_5 || var7_5) ** GOTO lbl44
            v21 /* !! */  = id.mx;
            if (true) ** GOTO lbl139
            block71: while (true) {
                v21 /* !! */  = (long)(v22 - id.ftav("fugo", ftbg(int ), (int)243));
lbl139:
                // 2 sources

                switch ((int)v21 /* !! */ ) {
                    case -1469319978: {
                        v22 = id.ftav("fugp", ftbg(int ), (int)244);
                        continue block71;
                    }
                    case -397112987: {
                        v22 = id.ftav("fugq", ftbg(int ), (int)245);
                        continue block71;
                    }
                    case -351994481: {
                        break block71;
                    }
                }
                break;
            }
            while (true) {
                if ((v23 /* !! */  = (cfr_temp_4 = id.mx - id.ftav("fugr", ftbg(int ), (int)246)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v23 /* !! */  == id.ftav("fugs", ftas(int ), (int)385)) break;
                v23 /* !! */  = (long)id.ftav("fugt", ftas(int ), (int)386);
            }
            return new ov(var1_1, var2_2);
        }
        if (var7_5 || var7_5) ** GOTO lbl44
        var6_9 = id.ftav("fugu", ftbn(int ), (int)387) / var5_8;
        if (!var7_5 && !var7_5) ** break;
        ** while (true)
        while (true) {
            if ((v24 /* !! */  = (cfr_temp_5 = id.mx - id.ftav("fugv", ftbg(int ), (int)247)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v24 /* !! */  == id.ftav("fugw", ftas(int ), (int)388)) break;
            v24 /* !! */  = (long)id.ftav("fugx", ftas(int ), (int)389);
        }
        v25 /* !! */  = id.mx;
        if (true) ** GOTO lbl168
        block74: while (true) {
            v25 /* !! */  = (long)(v26 - id.ftav("fugy", ftbg(int ), (int)248));
lbl168:
            // 2 sources

            switch ((int)v25 /* !! */ ) {
                case -2080182909: {
                    v26 = id.ftav("fugz", ftbg(int ), (int)249);
                    continue block74;
                }
                case -1535642770: {
                    v26 = id.ftav("fuha", ftbg(int ), (int)250);
                    continue block74;
                }
                case -351994481: {
                    break block74;
                }
            }
            break;
        }
        v27 /* !! */  = id.mx;
        if (true) ** GOTO lbl181
        block75: while (true) {
            v27 /* !! */  = (long)(id.ftav("fuhc", ftbg(int ), (int)252) - id.ftav("fuhb", ftbg(int ), (int)251));
lbl181:
            // 2 sources

            switch ((int)v27 /* !! */ ) {
                case -351994481: {
                    break block75;
                }
                case 161634923: {
                    continue block75;
                }
            }
            break;
        }
        v28 = id.mc.field_1724;
        while (true) {
            if ((v29 /* !! */  = (cfr_temp_6 = id.mx - id.ftav("fuhd", ftbg(int ), (int)253)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v29 /* !! */  == id.ftav("fuhe", ftas(int ), (int)390)) break;
            v29 /* !! */  = (long)id.ftav("fuhf", ftas(int ), (int)391);
        }
        v30 = v28.method_36454() + var3_6 * var6_9;
        v31 /* !! */  = id.mx;
        if (true) ** GOTO lbl197
        block77: while (true) {
            v31 /* !! */  = (long)(id.ftav("fuhh", ftbg(int ), (int)255) - id.ftav("fuhg", ftbg(int ), (int)254));
lbl197:
            // 2 sources

            switch ((int)v31 /* !! */ ) {
                case -794143143: {
                    continue block77;
                }
                case -351994481: {
                    break block77;
                }
            }
            break;
        }
        while (true) {
            if ((v32 /* !! */  = (cfr_temp_7 = id.mx - id.ftav("fuhi", ftbg(int ), (int)256)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v32 /* !! */  == id.ftav("fuhj", ftas(int ), (int)392)) break;
            v32 /* !! */  = (long)id.ftav("fuhk", ftas(int ), (int)393);
        }
        v33 = id.mc.field_1724;
        while (true) {
            if ((v34 /* !! */  = (cfr_temp_8 = id.mx - id.ftav("fuhl", ftbg(int ), (int)257)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v34 /* !! */  == id.ftav("fuhm", ftas(int ), (int)394)) break;
            v34 /* !! */  = (long)id.ftav("fuhn", ftas(int ), (int)395);
        }
        v35 = v33.method_36455() + var4_7 * var6_9;
        v36 /* !! */  = id.mx;
        if (true) ** GOTO lbl218
        block80: while (true) {
            v36 /* !! */  = (long)(v37 - id.ftav("fuho", ftbg(int ), (int)258));
lbl218:
            // 2 sources

            switch ((int)v36 /* !! */ ) {
                case -1835413630: {
                    v37 = id.ftav("fuhp", ftbg(int ), (int)259);
                    continue block80;
                }
                case -1030249759: {
                    v37 = id.ftav("fuhq", ftbg(int ), (int)260);
                    continue block80;
                }
                case -351994481: {
                    break block80;
                }
                case 215194877: {
                    v37 = id.ftav("fuhr", ftbg(int ), (int)261);
                    continue block80;
                }
            }
            break;
        }
        return new ov(v30, v35);
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public id() {
        int n2 = b;
        super("FuntimeTest");
        this.secureRandom = new SecureRandom();
        this.lastTick = (int)id.ftav("ftaw", ftas(int ), (int)0);
        if (n2 == 0) return;
        int n3 = Integer.MIN_VALUE;
        block7: do {
            switch (n3 == Integer.MIN_VALUE ? n2 : n3) {
                default: {
                    return;
                }
                case 1: {
                    break;
                }
                case 2: {
                    CallSite callSite = id.ftav("ftaz", ftas(int ), (int)3);
                    n3 = 0;
                    continue block7;
                }
                case 3: {
                    CallSite callSite = id.ftav("ftba", ftas(int ), (int)4);
                }
                case 0: {
                    while (true) {
                        CallSite callSite = id.ftav("ftax", ftas(int ), (int)1);
                    }
                }
                case 4: {
                    CallSite callSite = id.ftav("ftbb", ftas(int ), (int)5);
                }
            }
            break;
        } while (true);
        while (true) {
            CallSite callSite = id.ftav("ftay", ftas(int ), (int)2);
        }
    }
}

