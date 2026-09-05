/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 */
package ruhack.phobia;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import ruhack.phobia.dm;

public class al {
    public static final int b;
    private static al instance;
    private final Path configPath;
    private static int[] cczz;
    protected static final long fk = 3137824937409079511L;
    private static int[] cdab;
    private final Gson gson;
    private static long[] cdau;
    public static final boolean a;
    private static long[] cdat;
    public static final boolean c;

    private static /* synthetic */ void cedz() {
        al.cdab[100] = -2024101831;
        al.cdab[101] = 1998099182;
        al.cdab[102] = -924920485;
        al.cdab[103] = -1827195745;
        al.cdab[104] = -2122953479;
        al.cdab[105] = -1088021004;
        al.cdab[106] = 234916659;
        al.cdab[107] = 1518724035;
        al.cdab[108] = -1610422896;
        al.cdab[109] = -156112618;
        al.cdab[110] = -176854438;
        al.cdab[111] = 1006960082;
        al.cdab[112] = -1226499036;
        al.cdab[113] = -336883194;
        al.cdab[114] = -1788068520;
        al.cdab[115] = -1812867003;
        al.cdab[116] = 1244667037;
        al.cdab[117] = -380403430;
        al.cdab[118] = 435285294;
        al.cdab[119] = 2106462742;
        al.cdab[120] = 826732298;
    }

    /*
     * Exception decompiling
     */
    public void save() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 3[CASE]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ int cczx(int n2) {
        return cczz[n2] ^ cdab[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static al getInstance() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = al.fk - al.cdac("cdav", cdas(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == al.cdac("cdaw", cczx(int ), (int)8)) break;
            v0 /* !! */  = (long)al.cdac("cdax", cczx(int ), (int)9);
        }
        var2 = al.c;
        v1 /* !! */  = al.fk;
        if (true) ** GOTO lbl12
        block37: while (true) {
            v1 /* !! */  = (long)(v2 - al.cdac("cday", cdas(int ), (int)1));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1607792238: {
                    v2 = al.cdac("cdba", cdas(int ), (int)2);
                    continue block37;
                }
                case -1556574806: {
                    v2 = al.cdac("cdbc", cdas(int ), (int)3);
                    continue block37;
                }
                case -643733289: {
                    break block37;
                }
                case 1581440684: {
                    v2 = al.cdac("cdbg", cdas(int ), (int)4);
                    continue block37;
                }
            }
            break;
        }
        var1_1 /* !! */  = al.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = al.fk - al.cdac("cdbi", cdas(int ), (int)5)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == al.cdac("cdbj", cczx(int ), (int)10)) break;
            v3 /* !! */  = (long)al.cdac("cdbl", cczx(int ), (int)11);
        }
        var0_2 = al.a;
        if (var2) {
            throw null;
lbl34:
            // 5 sources

            return null;
        }
        if (var0_2) ** GOTO lbl34
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl34
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_2 = al.fk - al.cdac("cdbo", cdas(int ), (int)6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == al.cdac("cdbp", cczx(int ), (int)12)) break;
                    v4 /* !! */  = (long)al.cdac("cdbr", cczx(int ), (int)13);
                }
                if (al.instance != null) ** GOTO lbl83
                if (var0_2 || var0_2) ** GOTO lbl34
                v5 /* !! */  = al.fk;
                if (true) ** GOTO lbl53
                block41: while (true) {
                    v5 /* !! */  = (long)(al.cdac("cdbx", cdas(int ), (int)8) - al.cdac("cdbu", cdas(int ), (int)7));
lbl53:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -643733289: {
                            break block41;
                        }
                        case -275009957: {
                            continue block41;
                        }
                    }
                    break;
                }
                v6 /* !! */  = al.fk;
                if (true) ** GOTO lbl62
                block42: while (true) {
                    v6 /* !! */  = (long)(v7 - al.cdac("cdbz", cdas(int ), (int)9));
lbl62:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -758140412: {
                            v7 = al.cdac("cdca", cdas(int ), (int)10);
                            continue block42;
                        }
                        case -643733289: {
                            break block42;
                        }
                        case 534198788: {
                            v7 = al.cdac("cdcc", cdas(int ), (int)11);
                            continue block42;
                        }
                    }
                    break;
                }
                v8 = new al();
                v9 /* !! */  = al.fk;
                if (true) ** GOTO lbl76
                block43: while (true) {
                    v9 /* !! */  = (long)(al.cdac("cdcf", cdas(int ), (int)13) - al.cdac("cdce", cdas(int ), (int)12));
lbl76:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -685016183: {
                            continue block43;
                        }
                        case -643733289: {
                            break block43;
                        }
                    }
                    break;
                }
                al.instance = v8;
                if (var0_2) ** GOTO lbl34
lbl83:
                // 2 sources

                if (!var0_2 && !var0_2) ** break;
                ** continue;
                v10 /* !! */  = al.fk;
                if (true) ** GOTO lbl89
                block44: while (true) {
                    v10 /* !! */  = (long)(v11 - al.cdac("cdch", cdas(int ), (int)14));
lbl89:
                    // 2 sources

                    switch ((int)v10 /* !! */ ) {
                        case -2102465619: {
                            v11 = al.cdac("cdcj", cdas(int ), (int)15);
                            continue block44;
                        }
                        case -1553985317: {
                            v11 = al.cdac("cdcl", cdas(int ), (int)16);
                            continue block44;
                        }
                        case -643733289: {
                            break block44;
                        }
                        case 943300779: {
                            v11 = al.cdac("cdcn", cdas(int ), (int)17);
                            continue block44;
                        }
                    }
                    break;
                }
                return al.instance;
            }
lbl102:
            // 2 sources

            case 0: {
                do {
                    var1_1 /* !! */  = (int)al.cdac("cdcp", cczx(int ), (int)14);
                } while (!var2);
                throw null;
            }
            case 1: {
                var1_1 /* !! */  = (int)al.cdac("cdcq", cczx(int ), (int)15);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl129
            }
lbl112:
            // 3 sources

            case 2: {
                var1_1 /* !! */  = (int)al.cdac("cdcr", cczx(int ), (int)16);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl129
            }
            case 3: {
                var1_1 /* !! */  = (int)al.cdac("cdcs", cczx(int ), (int)17);
                if (!var2) break;
                throw null;
            }
            case 4: {
                var1_1 /* !! */  = (int)al.cdac("cdct", cczx(int ), (int)18);
                if (!var2) ** GOTO lbl112
                throw null;
            }
lbl125:
            // 2 sources

            case 5: {
                var1_1 /* !! */  = (int)al.cdac("cdcv", cczx(int ), (int)19);
                if (!var2) ** GOTO lbl112
                throw null;
            }
lbl129:
            // 3 sources

            case 6: {
                var1_1 /* !! */  = (int)al.cdac("cdcx", cczx(int ), (int)20);
                if (!var2) ** GOTO lbl125
                throw null;
            }
            case 7: {
                var1_1 /* !! */  = (int)al.cdac("cdcz", cczx(int ), (int)21);
                if (!var2) ** GOTO lbl102
                throw null;
            }
            case 8: 
        }
        do {
            var1_1 /* !! */  = (int)al.cdac("cddb", cczx(int ), (int)22);
        } while (!var2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private al() {
        var4_1 /* !! */  = al.b;
        super();
        if (var4_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var4_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.gson = new GsonBuilder().setPrettyPrinting().create();
                var1_2 = Paths.get("Phobia", new String[]{"configs"});
                try {
                    Files.createDirectories(var1_2, new FileAttribute[0]);
                }
                catch (IOException var2_3) {
                    // empty catch block
                }
                this.configPath = var1_2.resolve("macros.file");
                return;
            }
lbl16:
            // 3 sources

            case 0: {
                var4_1 /* !! */  = (int)al.cdac("cdae", cczx(int ), (int)0);
                ** GOTO lbl23
            }
lbl19:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var4_1 /* !! */  = (int)al.cdac("cdag", cczx(int ), (int)1);
                    ** GOTO lbl30
                    break;
                }
            }
lbl23:
            // 2 sources

            case 2: {
                var4_1 /* !! */  = (int)al.cdac("cdah", cczx(int ), (int)2);
                ** GOTO lbl16
            }
            case 3: {
                while (true) {
                    var4_1 /* !! */  = (int)al.cdac("cdaj", cczx(int ), (int)3);
                }
            }
lbl30:
            // 2 sources

            case 4: {
                var4_1 /* !! */  = (int)al.cdac("cdak", cczx(int ), (int)4);
                ** GOTO lbl16
            }
lbl33:
            // 2 sources

            case 5: {
                var4_1 /* !! */  = (int)al.cdac("cdan", cczx(int ), (int)5);
                ** GOTO lbl19
            }
            case 6: {
                var4_1 /* !! */  = (int)al.cdac("cdao", cczx(int ), (int)6);
                ** GOTO lbl33
            }
            case 7: 
        }
        var4_1 /* !! */  = (int)al.cdac("cdaq", cczx(int ), (int)7);
        ** while (true)
    }

    private static /* synthetic */ void ceea() {
        al.cdat[0] = 8045592506797786670L;
        al.cdat[1] = -2174533920410977908L;
        al.cdat[2] = 7096430315943828724L;
        al.cdat[3] = -2587129611230684019L;
        al.cdat[4] = 6466893273527135889L;
        al.cdat[5] = 3055572207603383940L;
        al.cdat[6] = -883463112845020880L;
        al.cdat[7] = 2209719679646652587L;
        al.cdat[8] = -1870695896828185333L;
        al.cdat[9] = -2091662332869702293L;
        al.cdat[10] = 406772833981484940L;
        al.cdat[11] = 1163918668148929280L;
        al.cdat[12] = -4810570600841842934L;
        al.cdat[13] = 4232094598325413589L;
        al.cdat[14] = 528120284599752084L;
        al.cdat[15] = -319573752744598853L;
        al.cdat[16] = -4718118138311682107L;
        al.cdat[17] = 6648850291447630945L;
        al.cdat[18] = 7392047888774157013L;
        al.cdat[19] = -2891270243196096573L;
        al.cdat[20] = -4703435927188540079L;
        al.cdat[21] = -6342135341187970766L;
        al.cdat[22] = -3118190508963059251L;
        al.cdat[23] = -3747656984838111310L;
        al.cdat[24] = -3564273487311633003L;
        al.cdat[25] = -2530607014220101646L;
        al.cdat[26] = 7772509227784134400L;
        al.cdat[27] = 9123623004565803244L;
        al.cdat[28] = 3957151749291573863L;
        al.cdat[29] = -2022038539781204451L;
        al.cdat[30] = -3814261728212349959L;
        al.cdat[31] = -5492431424227230291L;
        al.cdat[32] = -1331602480311780841L;
        al.cdat[33] = 1137630839716078779L;
        al.cdat[34] = -8079584465788030333L;
        al.cdat[35] = 114945698157889807L;
        al.cdat[36] = -2097951370357880338L;
        al.cdat[37] = 4931674593765819199L;
        al.cdat[38] = -6803847819962332074L;
        al.cdat[39] = -3980022904802117756L;
        al.cdat[40] = -1894520106220754051L;
        al.cdat[41] = -5400259109880575335L;
        al.cdat[42] = 6425741230562586398L;
        al.cdat[43] = 2840780996976497814L;
        al.cdat[44] = -8531976136984532839L;
        al.cdat[45] = -3152333341869701113L;
        al.cdat[46] = 841467409639565176L;
        al.cdat[47] = 2316064828505441345L;
        al.cdat[48] = 8503002846508543891L;
        al.cdat[49] = 1761843895488999134L;
        al.cdat[50] = -253619364177566027L;
        al.cdat[51] = -3662156497328851039L;
        al.cdat[52] = -684414846160508260L;
        al.cdat[53] = -3880782655072985933L;
        al.cdat[54] = -7357541536918942406L;
        al.cdat[55] = -8221134502052978661L;
        al.cdat[56] = -3206611434563634957L;
        al.cdat[57] = 9029346715095882131L;
        al.cdat[58] = -7157988662231737416L;
        al.cdat[59] = 5810752702007844061L;
        al.cdat[60] = 889624966721119824L;
        al.cdat[61] = 7857791153158810777L;
        al.cdat[62] = 8516729724239326482L;
        al.cdat[63] = -6167028362007038843L;
        al.cdat[64] = -344541860834799471L;
        al.cdat[65] = 428229404982834342L;
        al.cdat[66] = -188313569218638765L;
        al.cdat[67] = 7442613187114920673L;
        al.cdat[68] = 2835354401525652084L;
        al.cdat[69] = -6339524548382695587L;
        al.cdat[70] = -3471980489137011964L;
        al.cdat[71] = 2439895627444484563L;
        al.cdat[72] = -6644098583204143289L;
        al.cdat[73] = 4085462386583336932L;
        al.cdat[74] = -734759032151530139L;
        al.cdat[75] = -9159101941607433849L;
        al.cdat[76] = 7799467827707919748L;
        al.cdat[77] = -4864904261421293402L;
        al.cdat[78] = -4026615133854001648L;
        al.cdat[79] = 4895226759299504528L;
        al.cdat[80] = 980105090323010001L;
        al.cdat[81] = 987005426874798631L;
        al.cdat[82] = -6319909065553793208L;
        al.cdat[83] = -4278373041931728048L;
        al.cdat[84] = -8964225800241273060L;
        al.cdat[85] = -5643183656936257812L;
        al.cdat[86] = 7665020729036887688L;
        al.cdat[87] = 1647845699701015158L;
    }

    private static /* synthetic */ void cedx() {
        al.cczz[100] = -2024101830;
        al.cczz[101] = -1998099183;
        al.cczz[102] = 1740843682;
        al.cczz[103] = -1827195746;
        al.cczz[104] = 1244002134;
        al.cczz[105] = -1088021003;
        al.cczz[106] = -895895766;
        al.cczz[107] = 1518724047;
        al.cczz[108] = -1610422894;
        al.cczz[109] = -156112623;
        al.cczz[110] = -176854439;
        al.cczz[111] = 1006960088;
        al.cczz[112] = -1226499033;
        al.cczz[113] = -336883187;
        al.cczz[114] = -1788068518;
        al.cczz[115] = -1812866993;
        al.cczz[116] = 1244667024;
        al.cczz[117] = -380403430;
        al.cczz[118] = 435285287;
        al.cczz[119] = 2106462737;
        al.cczz[120] = 826732298;
    }

    static {
        cczz = new int[121];
        cdab = new int[121];
        al.cedw();
        al.cedx();
        al.cedy();
        al.cedz();
        cdat = new long[88];
        cdau = new long[88];
        al.ceea();
        al.ceeb();
    }

    private static /* synthetic */ void ceeb() {
        al.cdau[0] = -7032647645533638319L;
        al.cdau[1] = 8230426276065762097L;
        al.cdau[2] = -1146176844677709302L;
        al.cdau[3] = 4255137598381420111L;
        al.cdau[4] = -1738437951537328641L;
        al.cdau[5] = 983463692407315770L;
        al.cdau[6] = 4187453323998721746L;
        al.cdau[7] = 8834651446457717752L;
        al.cdau[8] = -8802647763858993288L;
        al.cdau[9] = 801754337927081096L;
        al.cdau[10] = 9128946645051764554L;
        al.cdau[11] = -6235455288303270009L;
        al.cdau[12] = 4227337973017204542L;
        al.cdau[13] = -2891833718615721319L;
        al.cdau[14] = 8485226324829656142L;
        al.cdau[15] = -905804370287235915L;
        al.cdau[16] = -7378575711917879525L;
        al.cdau[17] = -1370762355339292645L;
        al.cdau[18] = 2392360786570636549L;
        al.cdau[19] = 7758578031366798812L;
        al.cdau[20] = -511320732373456161L;
        al.cdau[21] = -2492236630103838672L;
        al.cdau[22] = 2115566806698599428L;
        al.cdau[23] = -6887262176386317095L;
        al.cdau[24] = 4135074487636742969L;
        al.cdau[25] = 4432232351713371797L;
        al.cdau[26] = -5307653370508120307L;
        al.cdau[27] = 830993810379269689L;
        al.cdau[28] = -5651542276460577270L;
        al.cdau[29] = 762127566971652853L;
        al.cdau[30] = -808682840186828934L;
        al.cdau[31] = -5671956247574854097L;
        al.cdau[32] = 9153573919105297716L;
        al.cdau[33] = -532310253656110757L;
        al.cdau[34] = -8193629411059005427L;
        al.cdau[35] = -8294901783673898657L;
        al.cdau[36] = 6401693839510975581L;
        al.cdau[37] = 3841679168687362926L;
        al.cdau[38] = 1460903044845348430L;
        al.cdau[39] = -3280931815620721298L;
        al.cdau[40] = 3486433145627980558L;
        al.cdau[41] = 4766262631044546994L;
        al.cdau[42] = 8290486744470798279L;
        al.cdau[43] = 225277668808318496L;
        al.cdau[44] = -4837849980967902373L;
        al.cdau[45] = 4553710474742617504L;
        al.cdau[46] = -3405487325340517895L;
        al.cdau[47] = 8254710294997282780L;
        al.cdau[48] = -7692825422602147295L;
        al.cdau[49] = -5611774698999434388L;
        al.cdau[50] = -7415691406927104876L;
        al.cdau[51] = -5836456771203324319L;
        al.cdau[52] = 2197257048394357844L;
        al.cdau[53] = -6729272834398096113L;
        al.cdau[54] = 1582213013450370437L;
        al.cdau[55] = 8867207618284512261L;
        al.cdau[56] = -1515860686571183227L;
        al.cdau[57] = 8159377328105020460L;
        al.cdau[58] = 8995687049287790769L;
        al.cdau[59] = 7677872967957863221L;
        al.cdau[60] = 3773562298602669962L;
        al.cdau[61] = -2359788973759882489L;
        al.cdau[62] = -732933943876333030L;
        al.cdau[63] = -4038355324224301820L;
        al.cdau[64] = 2814341118512824220L;
        al.cdau[65] = 7046464039054194646L;
        al.cdau[66] = -2722344644379308929L;
        al.cdau[67] = 6699669244813285714L;
        al.cdau[68] = 4017241090708118430L;
        al.cdau[69] = 6700482228673807122L;
        al.cdau[70] = 4821369740792783599L;
        al.cdau[71] = 232957757748942568L;
        al.cdau[72] = -2641155610008838376L;
        al.cdau[73] = 2761680033617645374L;
        al.cdau[74] = 544683573608246689L;
        al.cdau[75] = -7864963448015325119L;
        al.cdau[76] = -3214430854971651260L;
        al.cdau[77] = 2228172551162880452L;
        al.cdau[78] = -7848942231908568474L;
        al.cdau[79] = -1146705778154910877L;
        al.cdau[80] = -8387804272903168539L;
        al.cdau[81] = -8919364533250838805L;
        al.cdau[82] = 1637919485799068692L;
        al.cdau[83] = -5874421233798308349L;
        al.cdau[84] = -2785102086603005984L;
        al.cdau[85] = -8495452717225521405L;
        al.cdau[86] = 4170206216317638864L;
        al.cdau[87] = -7218125226333847448L;
    }

    private static /* synthetic */ long cdas(int n2) {
        return cdat[n2] ^ cdau[n2];
    }

    public static /* synthetic */ CallSite cdac(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static /* synthetic */ void lambda$load$0(List var0, JsonElement var1_1) {
        v0 /* !! */  = al.fk;
        if (true) ** GOTO lbl5
        block63: while (true) {
            v0 /* !! */  = (long)(v1 - al.cdac("ceby", cdas(int ), (int)58));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1210469312: {
                    v1 = al.cdac("cebz", cdas(int ), (int)59);
                    continue block63;
                }
                case -643733289: {
                    break block63;
                }
                case -85085751: {
                    v1 = al.cdac("ceca", cdas(int ), (int)60);
                    continue block63;
                }
                case 2096836901: {
                    v1 = al.cdac("cecb", cdas(int ), (int)61);
                    continue block63;
                }
            }
            break;
        }
        var8_2 = al.c;
        v2 /* !! */  = al.fk;
        if (true) ** GOTO lbl22
        block64: while (true) {
            v2 /* !! */  = (long)(v3 - al.cdac("cecc", cdas(int ), (int)62));
lbl22:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -643733289: {
                    break block64;
                }
                case -174784159: {
                    v3 = al.cdac("cecd", cdas(int ), (int)63);
                    continue block64;
                }
                case 922444520: {
                    v3 = al.cdac("cece", cdas(int ), (int)64);
                    continue block64;
                }
            }
            break;
        }
        var7_3 /* !! */  = al.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = al.fk - al.cdac("cecf", cdas(int ), (int)65)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == al.cdac("cecg", cczx(int ), (int)101)) break;
            v4 /* !! */  = (long)al.cdac("cech", cczx(int ), (int)102);
        }
        var6_4 = al.a;
        if (var8_2) {
            throw null;
lbl40:
            // 6 sources

            return;
        }
        if (var6_4 || var6_4) ** GOTO lbl40
        v5 /* !! */  = al.fk;
        if (true) ** GOTO lbl47
        block67: while (true) {
            v5 /* !! */  = (long)(al.cdac("cecj", cdas(int ), (int)67) - al.cdac("ceci", cdas(int ), (int)66));
lbl47:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -659854363: {
                    continue block67;
                }
                case -643733289: {
                    break block67;
                }
            }
            break;
        }
        var2_5 = var1_1.getAsJsonObject();
        if (var6_4 || var6_4) ** GOTO lbl40
        v6 /* !! */  = al.fk;
        if (true) ** GOTO lbl58
        block68: while (true) {
            v6 /* !! */  = (long)(al.cdac("cecl", cdas(int ), (int)69) - al.cdac("ceck", cdas(int ), (int)68));
lbl58:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -643733289: {
                    break block68;
                }
                case -292821821: {
                    continue block68;
                }
            }
            break;
        }
        v7 = var2_5.get("name");
        v8 /* !! */  = al.fk;
        if (true) ** GOTO lbl68
        block69: while (true) {
            v8 /* !! */  = (long)(v9 - al.cdac("cecm", cdas(int ), (int)70));
lbl68:
            // 2 sources

            switch ((int)v8 /* !! */ ) {
                case -643733289: {
                    break block69;
                }
                case 1022516157: {
                    v9 = al.cdac("cecn", cdas(int ), (int)71);
                    continue block69;
                }
                case 1237627053: {
                    v9 = al.cdac("ceco", cdas(int ), (int)72);
                    continue block69;
                }
                case 2071508583: {
                    v9 = al.cdac("cecp", cdas(int ), (int)73);
                    continue block69;
                }
            }
            break;
        }
        var3_6 = v7.getAsString();
        if (var6_4 || var6_4) ** GOTO lbl40
        v10 /* !! */  = al.fk;
        if (true) ** GOTO lbl86
        block70: while (true) {
            v10 /* !! */  = (long)(al.cdac("cecr", cdas(int ), (int)75) - al.cdac("cecq", cdas(int ), (int)74));
lbl86:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -643733289: {
                    break block70;
                }
                case 2031832079: {
                    continue block70;
                }
            }
            break;
        }
        v11 = var2_5.get("message");
        v12 /* !! */  = al.fk;
        if (true) ** GOTO lbl96
        block71: while (true) {
            v12 /* !! */  = (long)(v13 - al.cdac("cecs", cdas(int ), (int)76));
lbl96:
            // 2 sources

            switch ((int)v12 /* !! */ ) {
                case -1555157406: {
                    v13 = al.cdac("cect", cdas(int ), (int)77);
                    continue block71;
                }
                case -659901117: {
                    v13 = al.cdac("cecu", cdas(int ), (int)78);
                    continue block71;
                }
                case -643733289: {
                    break block71;
                }
                case 1429532278: {
                    v13 = al.cdac("cecv", cdas(int ), (int)79);
                    continue block71;
                }
            }
            break;
        }
        var4_7 = v11.getAsString();
        if (var6_4 || var6_4) ** GOTO lbl40
        v14 /* !! */  = al.fk;
        if (true) ** GOTO lbl114
        block72: while (true) {
            v14 /* !! */  = (long)(al.cdac("cecx", cdas(int ), (int)81) - al.cdac("cecw", cdas(int ), (int)80));
lbl114:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1117013847: {
                    continue block72;
                }
                case -643733289: {
                    break block72;
                }
            }
            break;
        }
        v15 = var2_5.get("key");
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_1 = al.fk - al.cdac("cecy", cdas(int ), (int)82)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == al.cdac("cecz", cczx(int ), (int)103)) break;
            v16 /* !! */  = (long)al.cdac("ceda", cczx(int ), (int)104);
        }
        var5_8 = v15.getAsInt();
        if (var7_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var7_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var6_4 || var6_4) ** GOTO lbl40
                v17 /* !! */  = al.fk;
                if (true) ** GOTO lbl134
                block74: while (true) {
                    v17 /* !! */  = (long)(al.cdac("cedc", cdas(int ), (int)84) - al.cdac("cedb", cdas(int ), (int)83));
lbl134:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -643733289: {
                            break block74;
                        }
                        case 1096739884: {
                            continue block74;
                        }
                    }
                    break;
                }
                v18 /* !! */  = al.fk;
                if (true) ** GOTO lbl143
                block75: while (true) {
                    v18 /* !! */  = (long)(al.cdac("cede", cdas(int ), (int)86) - al.cdac("cedd", cdas(int ), (int)85));
lbl143:
                    // 2 sources

                    switch ((int)v18 /* !! */ ) {
                        case -643733289: {
                            break block75;
                        }
                        case -574470440: {
                            continue block75;
                        }
                    }
                    break;
                }
                v19 = new dm(var3_6, var4_7, var5_8);
                while (true) {
                    if ((v20 /* !! */  = (cfr_temp_2 = al.fk - al.cdac("cedf", cdas(int ), (int)87)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v20 /* !! */  == al.cdac("cedg", cczx(int ), (int)105)) break;
                    v20 /* !! */  = (long)al.cdac("cedh", cczx(int ), (int)106);
                }
                var0.add(v19);
                if (var6_4 || var6_4) ** continue;
                return;
            }
            case 0: {
                var7_3 /* !! */  = (int)al.cdac("cedi", cczx(int ), (int)107);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl177
            }
            case 1: {
                var7_3 /* !! */  = (int)al.cdac("cedj", cczx(int ), (int)108);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl167:
            // 2 sources

            case 2: {
                var7_3 /* !! */  = (int)al.cdac("cedk", cczx(int ), (int)109);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl204
            }
lbl172:
            // 2 sources

            case 3: {
                var7_3 /* !! */  = (int)al.cdac("cedl", cczx(int ), (int)110);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl213
            }
lbl177:
            // 2 sources

            case 4: {
                var7_3 /* !! */  = (int)al.cdac("cedm", cczx(int ), (int)111);
                if (var8_2) {
                    throw null;
                }
                ** GOTO lbl191
            }
            case 5: {
                do {
                    var7_3 /* !! */  = (int)al.cdac("cedn", cczx(int ), (int)112);
                } while (!var8_2);
                throw null;
            }
lbl187:
            // 3 sources

            case 6: {
                var7_3 /* !! */  = (int)al.cdac("cedo", cczx(int ), (int)113);
                if (!var8_2) ** GOTO lbl172
                throw null;
            }
lbl191:
            // 2 sources

            case 7: {
                var7_3 /* !! */  = (int)al.cdac("cedp", cczx(int ), (int)114);
                if (var8_2) {
                    throw null;
                }
            }
lbl195:
            // 4 sources

            case 8: {
                do {
                    var7_3 /* !! */  = (int)al.cdac("cedq", cczx(int ), (int)115);
                } while (!var8_2);
                throw null;
            }
            case 9: {
                var7_3 /* !! */  = (int)al.cdac("cedr", cczx(int ), (int)116);
                if (!var8_2) ** GOTO lbl187
                throw null;
            }
lbl204:
            // 2 sources

            case 10: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_3 /* !! */  = (int)al.cdac("ceds", cczx(int ), (int)117);
                    if (!var8_2) ** GOTO lbl195
                    throw null;
                }
            }
            case 11: {
                var7_3 /* !! */  = (int)al.cdac("cedt", cczx(int ), (int)118);
                if (!var8_2) ** GOTO lbl187
                throw null;
            }
lbl213:
            // 3 sources

            case 12: {
                var7_3 /* !! */  = (int)al.cdac("cedu", cczx(int ), (int)119);
                if (!var8_2) ** GOTO lbl167
                throw null;
            }
            case 13: 
        }
        var7_3 /* !! */  = (int)al.cdac("cedv", cczx(int ), (int)120);
        ** while (!var8_2)
lbl220:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void cedw() {
        al.cczz[0] = -1714155597;
        al.cczz[1] = 168230174;
        al.cczz[2] = 82816381;
        al.cczz[3] = -1514641344;
        al.cczz[4] = 170625282;
        al.cczz[5] = 683794427;
        al.cczz[6] = 1035380462;
        al.cczz[7] = 168479068;
        al.cczz[8] = -1288446806;
        al.cczz[9] = 668540183;
        al.cczz[10] = -2085176380;
        al.cczz[11] = -1190421221;
        al.cczz[12] = 1785443640;
        al.cczz[13] = -166088923;
        al.cczz[14] = -1570224693;
        al.cczz[15] = 1646942467;
        al.cczz[16] = 1751994209;
        al.cczz[17] = 940623751;
        al.cczz[18] = -87797665;
        al.cczz[19] = 637531748;
        al.cczz[20] = 665242289;
        al.cczz[21] = -188159334;
        al.cczz[22] = -318461570;
        al.cczz[23] = 2065447510;
        al.cczz[24] = 1793377390;
        al.cczz[25] = -1603789393;
        al.cczz[26] = 1805590424;
        al.cczz[27] = -1201535170;
        al.cczz[28] = 370550929;
        al.cczz[29] = -1558859628;
        al.cczz[30] = 953447411;
        al.cczz[31] = -602175200;
        al.cczz[32] = 809271870;
        al.cczz[33] = 732789003;
        al.cczz[34] = -1160381743;
        al.cczz[35] = -2029011653;
        al.cczz[36] = -1130622437;
        al.cczz[37] = -765617133;
        al.cczz[38] = 1256364562;
        al.cczz[39] = -191325868;
        al.cczz[40] = 84938075;
        al.cczz[41] = 2127755884;
        al.cczz[42] = 1842006376;
        al.cczz[43] = 1922739040;
        al.cczz[44] = 2109032852;
        al.cczz[45] = -2005715764;
        al.cczz[46] = -383682113;
        al.cczz[47] = -386384040;
        al.cczz[48] = 1149097887;
        al.cczz[49] = 2073983857;
        al.cczz[50] = -61209166;
        al.cczz[51] = -1759026272;
        al.cczz[52] = 2003063702;
        al.cczz[53] = 1742904178;
        al.cczz[54] = 1987154408;
        al.cczz[55] = 1583832328;
        al.cczz[56] = 1666795595;
        al.cczz[57] = -231546627;
        al.cczz[58] = 1609923119;
        al.cczz[59] = 2046821109;
        al.cczz[60] = 875522163;
        al.cczz[61] = 1615204678;
        al.cczz[62] = 696747723;
        al.cczz[63] = -1303929131;
        al.cczz[64] = 986142755;
        al.cczz[65] = 36025887;
        al.cczz[66] = 1785002725;
        al.cczz[67] = -1924517434;
        al.cczz[68] = -614130308;
        al.cczz[69] = -1800337583;
        al.cczz[70] = -1870250698;
        al.cczz[71] = -2113240370;
        al.cczz[72] = -889434210;
        al.cczz[73] = -406400559;
        al.cczz[74] = -1495017243;
        al.cczz[75] = -149658844;
        al.cczz[76] = -2061755345;
        al.cczz[77] = 1944607826;
        al.cczz[78] = 917461466;
        al.cczz[79] = 2039648309;
        al.cczz[80] = 897444020;
        al.cczz[81] = 564077161;
        al.cczz[82] = 323687635;
        al.cczz[83] = -1698453121;
        al.cczz[84] = -1663521659;
        al.cczz[85] = -1787435834;
        al.cczz[86] = -1361803533;
        al.cczz[87] = 552361177;
        al.cczz[88] = 1335829650;
        al.cczz[89] = -1014444597;
        al.cczz[90] = 1821078681;
        al.cczz[91] = -1955136093;
        al.cczz[92] = -1450059350;
        al.cczz[93] = -472466779;
        al.cczz[94] = -2077402244;
        al.cczz[95] = -1938221972;
        al.cczz[96] = -929495730;
        al.cczz[97] = 958378445;
        al.cczz[98] = -1984500727;
        al.cczz[99] = -1910879524;
    }

    /*
     * Exception decompiling
     */
    public void load() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 29[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void cedy() {
        al.cdab[0] = -1714155597;
        al.cdab[1] = 168230169;
        al.cdab[2] = 82816379;
        al.cdab[3] = -1514641344;
        al.cdab[4] = 170625285;
        al.cdab[5] = 683794424;
        al.cdab[6] = 1035380463;
        al.cdab[7] = 168479070;
        al.cdab[8] = -1288446805;
        al.cdab[9] = -1828341313;
        al.cdab[10] = -2085176379;
        al.cdab[11] = 209829067;
        al.cdab[12] = 1785443641;
        al.cdab[13] = 733192861;
        al.cdab[14] = -1570224690;
        al.cdab[15] = 1646942464;
        al.cdab[16] = 1751994217;
        al.cdab[17] = 940623748;
        al.cdab[18] = -87797672;
        al.cdab[19] = 637531748;
        al.cdab[20] = 665242295;
        al.cdab[21] = -188159333;
        al.cdab[22] = -318461574;
        al.cdab[23] = 2065447503;
        al.cdab[24] = 1793377392;
        al.cdab[25] = -1603789396;
        al.cdab[26] = 1805590421;
        al.cdab[27] = -1201535169;
        al.cdab[28] = 370550943;
        al.cdab[29] = -1558859622;
        al.cdab[30] = 953447406;
        al.cdab[31] = -602175172;
        al.cdab[32] = 809271871;
        al.cdab[33] = 732789014;
        al.cdab[34] = -1160381737;
        al.cdab[35] = -2029011670;
        al.cdab[36] = -1130622463;
        al.cdab[37] = -765617139;
        al.cdab[38] = 1256364560;
        al.cdab[39] = -191325859;
        al.cdab[40] = 84938059;
        al.cdab[41] = 2127755874;
        al.cdab[42] = 1842006378;
        al.cdab[43] = 1922739058;
        al.cdab[44] = 2109032836;
        al.cdab[45] = -2005715747;
        al.cdab[46] = -383682131;
        al.cdab[47] = -386384036;
        al.cdab[48] = 1149097870;
        al.cdab[49] = 2073983842;
        al.cdab[50] = -61209157;
        al.cdab[51] = -1759026243;
        al.cdab[52] = 2003063700;
        al.cdab[53] = 1742904165;
        al.cdab[54] = 1987154420;
        al.cdab[55] = -1583832329;
        al.cdab[56] = 1721158651;
        al.cdab[57] = -231546628;
        al.cdab[58] = -360295108;
        al.cdab[59] = 2046821108;
        al.cdab[60] = -731145891;
        al.cdab[61] = 1615204679;
        al.cdab[62] = 1979961675;
        al.cdab[63] = -1303929132;
        al.cdab[64] = 401424909;
        al.cdab[65] = 36025886;
        al.cdab[66] = -1232762521;
        al.cdab[67] = -1924517433;
        al.cdab[68] = -1942744517;
        al.cdab[69] = -1800337584;
        al.cdab[70] = 1860060338;
        al.cdab[71] = 2113240369;
        al.cdab[72] = -566581147;
        al.cdab[73] = 406400558;
        al.cdab[74] = -1843557621;
        al.cdab[75] = -149658829;
        al.cdab[76] = -2061755353;
        al.cdab[77] = 1944607838;
        al.cdab[78] = 917461458;
        al.cdab[79] = 2039648300;
        al.cdab[80] = 897444016;
        al.cdab[81] = 564077168;
        al.cdab[82] = 323687633;
        al.cdab[83] = -1698453131;
        al.cdab[84] = -1663521642;
        al.cdab[85] = -1787435839;
        al.cdab[86] = -1361803536;
        al.cdab[87] = 552361162;
        al.cdab[88] = 1335829642;
        al.cdab[89] = -1014444583;
        al.cdab[90] = 1821078664;
        al.cdab[91] = -1955136081;
        al.cdab[92] = -1450059336;
        al.cdab[93] = -472466774;
        al.cdab[94] = -2077402262;
        al.cdab[95] = -1938221953;
        al.cdab[96] = -929495731;
        al.cdab[97] = 958378432;
        al.cdab[98] = -1984500736;
        al.cdab[99] = -1910879548;
    }
}

