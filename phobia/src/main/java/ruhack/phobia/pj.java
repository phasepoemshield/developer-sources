/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Structure
 */
package ruhack.phobia;

import com.sun.jna.Structure;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Arrays;
import java.util.List;

public class pj
extends Structure {
    static final long tk = -7652335349329466153L;
    public String largeImageKey;
    public String button_url_2;
    public int instance;
    public String button_label_1;
    private static long[] kynk;
    public long endTimestamp;
    public long startTimestamp;
    public String joinSecret;
    public int partySize;
    public String partyId;
    public String matchSecret;
    public String smallImageText;
    public String smallImageKey;
    private static int[] kynb;
    public String spectateSecret;
    public static final boolean a;
    public String state;
    public String largeImageText;
    public static final boolean c;
    private static int[] kync;
    public String partyPrivacy;
    public String details;
    public int partyMax;
    public String button_url_1;
    public String button_label_2;
    private static long[] kynj;
    public static final int b;

    static {
        kynb = new int[10];
        kync = new int[10];
        pj.kynz();
        pj.kyoa();
        kynj = new long[8];
        kynk = new long[8];
        pj.kyob();
        pj.kyoc();
    }

    private static /* synthetic */ void kyob() {
        pj.kynj[0] = 2257217824318639212L;
        pj.kynj[1] = 1732556276157934636L;
        pj.kynj[2] = 4773203481199688098L;
        pj.kynj[3] = 7984341016310937974L;
        pj.kynj[4] = 1272554075702823184L;
        pj.kynj[5] = 3645922988411019359L;
        pj.kynj[6] = -5734438134965248992L;
        pj.kynj[7] = -8916226612284245580L;
    }

    private static /* synthetic */ void kynz() {
        pj.kynb[0] = -1976939094;
        pj.kynb[1] = -909786915;
        pj.kynb[2] = -781233726;
        pj.kynb[3] = -880708386;
        pj.kynb[4] = -2019398298;
        pj.kynb[5] = 2020476463;
        pj.kynb[6] = -719085137;
        pj.kynb[7] = -1931345039;
        pj.kynb[8] = -261871575;
        pj.kynb[9] = 393187395;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public pj() {
        var2_1 /* !! */  = pj.b;
        super();
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.setStringEncoding("UTF-8");
                return;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)pj.kynd("kyne", kyna(int ), (int)0);
                    continue;
                    break;
                }
            }
            case 1: {
                while (true) {
                    var2_1 /* !! */  = (int)pj.kynd("kynf", kyna(int ), (int)1);
                }
            }
            case 2: {
                var2_1 /* !! */  = (int)pj.kynd("kyng", kyna(int ), (int)2);
            }
            case 3: 
        }
        var2_1 /* !! */  = (int)pj.kynd("kynh", kyna(int ), (int)3);
        ** while (true)
    }

    public static /* synthetic */ CallSite kynd(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ long kyni(int n2) {
        return kynj[n2] ^ kynk[n2];
    }

    private static /* synthetic */ void kyoa() {
        pj.kync[0] = -1976939096;
        pj.kync[1] = -909786914;
        pj.kync[2] = -781233728;
        pj.kync[3] = -880708386;
        pj.kync[4] = -2019398297;
        pj.kync[5] = 63482631;
        pj.kync[6] = -719085140;
        pj.kync[7] = -1931345038;
        pj.kync[8] = -261871573;
        pj.kync[9] = 393187393;
    }

    private static /* synthetic */ int kyna(int n2) {
        return kynb[n2] ^ kync[n2];
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    protected List<String> getFieldOrder() {
        Object object = tk;
        block13: while (true) {
            switch ((int)object) {
                case -1522069471: {
                    object = pj.kynd("kynm", kyni(int ), (int)1) - pj.kynd("kynl", kyni(int ), (int)0);
                    continue block13;
                }
                case 688745687: {
                    break block13;
                }
            }
            break;
        }
        boolean bl2 = c;
        Object object2 = tk;
        boolean bl3 = true;
        block14: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object2 = callSite - pj.kynd("kynn", kyni(int ), (int)2);
            }
            switch ((int)object2) {
                case -1326478116: {
                    callSite = pj.kynd("kyno", kyni(int ), (int)3);
                    continue block14;
                }
                case 176683468: {
                    callSite = pj.kynd("kynp", kyni(int ), (int)4);
                    continue block14;
                }
                case 688745687: {
                    break block14;
                }
            }
            break;
        }
        int n2 = b;
        Object object3 = tk;
        block15: while (true) {
            switch ((int)object3) {
                case -102142990: {
                    object3 = pj.kynd("kynr", kyni(int ), (int)6) - pj.kynd("kynq", kyni(int ), (int)5);
                    continue block15;
                }
                case 688745687: {
                    break block15;
                }
            }
            break;
        }
        boolean bl4 = a;
        if (bl2) {
            throw null;
        }
        if (bl4) return null;
        if (bl4) return null;
        String[] stringArray = new String[]{"state", "details", "startTimestamp", "endTimestamp", "largeImageKey", "largeImageText", "smallImageKey", "smallImageText", "partyId", "partySize", "partyMax", "partyPrivacy", "matchSecret", "joinSecret", "spectateSecret", "button_label_1", "button_url_1", "button_label_2", "button_url_2", "instance"};
        while (true) {
            long l2;
            Object object4;
            if ((object4 = (l2 = tk - pj.kynd("kyns", kyni(int ), (int)7)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object4 == pj.kynd("kynt", kyna(int ), (int)4)) {
                return Arrays.asList(stringArray);
            }
            object4 = pj.kynd("kynu", kyna(int ), (int)5);
        }
    }

    private static /* synthetic */ void kyoc() {
        pj.kynk[0] = -8248172633274622347L;
        pj.kynk[1] = -8516223280375779329L;
        pj.kynk[2] = 8718209866585189757L;
        pj.kynk[3] = 5347359019021089324L;
        pj.kynk[4] = -7888864165320408292L;
        pj.kynk[5] = 4042777634019323016L;
        pj.kynk[6] = -5845073046922247238L;
        pj.kynk[7] = 1100764165995171252L;
    }
}

