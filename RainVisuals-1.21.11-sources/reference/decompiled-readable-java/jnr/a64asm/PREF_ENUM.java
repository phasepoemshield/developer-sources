/*
 * Decompiled with CFR 0.152.
 */
package jnr.a64asm;

public final class PREF_ENUM
extends Enum<PREF_ENUM> {
    public static final /* enum */ PREF_ENUM PLIL1STRM;
    public static final /* enum */ PREF_ENUM PSTL3KEEP;
    public static final /* enum */ PREF_ENUM PLDL2STRM;
    public static final /* enum */ PREF_ENUM PSTL2KEEP;
    public static final /* enum */ PREF_ENUM PLIL3KEEP;
    public static final /* enum */ PREF_ENUM PSTL2STRM;
    public static final /* enum */ PREF_ENUM PLIL3STRM;
    public static final /* enum */ PREF_ENUM PLDL1STRM;
    public static final /* enum */ PREF_ENUM PLDL3KEEP;
    public static final /* enum */ PREF_ENUM PLDL2KEEP;
    public static final /* enum */ PREF_ENUM PSTL3STRM;
    public static final /* enum */ PREF_ENUM PLDL1KEEP;
    public static final /* enum */ PREF_ENUM PSTL1STRM;
    public static final /* enum */ PREF_ENUM PSTL1KEEP;
    public static final /* enum */ PREF_ENUM PLIL1KEEP;
    private static final /* synthetic */ PREF_ENUM[] $VALUES;
    public static final /* enum */ PREF_ENUM PLIL2KEEP;
    public static final /* enum */ PREF_ENUM PLDL3STRM;
    public static final /* enum */ PREF_ENUM PLIL2STRM;

    static {
        PLDL1KEEP = new PREF_ENUM();
        PLDL1STRM = new PREF_ENUM();
        PLDL2KEEP = new PREF_ENUM();
        PLDL2STRM = new PREF_ENUM();
        PLDL3KEEP = new PREF_ENUM();
        PLDL3STRM = new PREF_ENUM();
        PSTL1KEEP = new PREF_ENUM();
        PSTL1STRM = new PREF_ENUM();
        PSTL2KEEP = new PREF_ENUM();
        PSTL2STRM = new PREF_ENUM();
        PSTL3KEEP = new PREF_ENUM();
        PSTL3STRM = new PREF_ENUM();
        PLIL1KEEP = new PREF_ENUM();
        PLIL1STRM = new PREF_ENUM();
        PLIL2KEEP = new PREF_ENUM();
        PLIL2STRM = new PREF_ENUM();
        PLIL3KEEP = new PREF_ENUM();
        PLIL3STRM = new PREF_ENUM();
        PREF_ENUM[] pREF_ENUMArray = new PREF_ENUM[18];
        pREF_ENUMArray[0] = PLDL1KEEP;
        pREF_ENUMArray[1] = PLDL1STRM;
        pREF_ENUMArray[2] = PLDL2KEEP;
        pREF_ENUMArray[3] = PLDL2STRM;
        pREF_ENUMArray[4] = PLDL3KEEP;
        pREF_ENUMArray[5] = PLDL3STRM;
        pREF_ENUMArray[6] = PSTL1KEEP;
        pREF_ENUMArray[7] = PSTL1STRM;
        pREF_ENUMArray[8] = PSTL2KEEP;
        pREF_ENUMArray[9] = PSTL2STRM;
        pREF_ENUMArray[10] = PSTL3KEEP;
        pREF_ENUMArray[11] = PSTL3STRM;
        pREF_ENUMArray[12] = PLIL1KEEP;
        pREF_ENUMArray[13] = PLIL1STRM;
        pREF_ENUMArray[14] = PLIL2KEEP;
        pREF_ENUMArray[15] = PLIL2STRM;
        pREF_ENUMArray[16] = PLIL3KEEP;
        pREF_ENUMArray[17] = PLIL3STRM;
        $VALUES = pREF_ENUMArray;
    }

    public static PREF_ENUM[] values() {
        return (PREF_ENUM[])$VALUES.clone();
    }

    public static PREF_ENUM valueOf(String name) {
        return Enum.valueOf(PREF_ENUM.class, name);
    }
}

