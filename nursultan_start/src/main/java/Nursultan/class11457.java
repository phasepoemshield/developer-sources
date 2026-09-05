/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09241
 *  Nursultan.class10938
 *  Nursultan.class11107
 *  Nursultan.class11165
 *  Nursultan.class11303
 *  Nursultan.class11646
 *  Nursultan.class11664
 *  Nursultan.class11882
 *  Nursultan.class11921
 *  Nursultan.class11938
 *  Nursultan.class12018
 *  minecraft.class00869
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class09241;
import Nursultan.class10938;
import Nursultan.class11107;
import Nursultan.class11165;
import Nursultan.class11303;
import Nursultan.class11646;
import Nursultan.class11664;
import Nursultan.class11882;
import Nursultan.class11921;
import Nursultan.class11938;
import Nursultan.class12018;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.stream.Stream;
import minecraft.class00869;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11457 {
    public Object N_0;
    public Object N_1;
    public static Object y_0;

    public Stream<class11882> L() {
        return ((Map)this.N_0).values().stream();
    }

    private static String M(String string) {
        return new class12018("autobuy.name").N(string).N();
    }

    public class11457() {
        this.R();
        this.N_0 = new LinkedHashMap();
        this.N_1 = new HashMap();
        class11938.L().y((Object)this);
        this.u();
        this.z();
        this.W();
        this.U();
    }

    static {
        class11457.i();
        y_0 = LogManager.getLogger(String.class);
    }

    private static void i() {
        y_0 = null;
    }

    private void U() {
        ((ExecutorService)class11938.L_1).submit(() -> {
            LinkedHashMap<class11882, class06584> linkedHashMap = new LinkedHashMap<class11882, class06584>();
            int n = 0;
            for (class11664 class116642 : class11107.y()) {
                class11882 class118822 = (class11882)((Map)this.N_0).get(class11457.M(class116642.u()));
                if (class118822 == null) continue;
                try {
                    linkedHashMap.put(class118822, class116642.N().t());
                }
                catch (Exception exception) {
                    linkedHashMap.put(class118822, class06570.y.E().t());
                    ++n;
                    ((Logger)y_0).error((Object)exception, (Throwable)exception);
                }
            }
            int n2 = n;
            class06202.Nq().execute(() -> {
                linkedHashMap.forEach((class118822, class065842) -> class118822.N(class065842));
                for (int i = 0; i < n2; ++i) {
                    class11303.y((Object)class11921.N((String)"error-please-report").N(class06541.field_1061));
                }
            });
        });
    }

    private void z() {
        this.N((class11882)new class09241(class06570.sT.E(), "elytra", "\u042d\u043b\u0438\u0442\u0440\u044b", class11165.OTHER));
        this.N((class11882)new class09241(class06570.la.E(), "totem-of-undying", "\u0422\u043e\u0442\u0435\u043c \u0431\u0435\u0441\u0441\u043c\u0435\u0440\u0442\u0438\u044f", class11165.OTHER));
        this.N(class06570.be, "enchanted-golden-apple", "\u0417\u0430\u0447\u0430\u0440\u043e\u0432\u0430\u043d\u043d\u043e\u0435 \u0437\u043e\u043b\u043e\u0442\u043e\u0435 \u044f\u0431\u043b\u043e\u043a\u043e");
        this.N(class06570.bV, "golden-apple", "\u0417\u043e\u043b\u043e\u0442\u043e\u0435 \u044f\u0431\u043b\u043e\u043a\u043e");
        this.N(class06570.sS, "apple", "\u042f\u0431\u043b\u043e\u043a\u043e");
        this.N(class06570.TE, "netherite-ingot", "\u041d\u0435\u0437\u0435\u0440\u0438\u0442\u043e\u0432\u044b\u0439 \u0441\u043b\u0438\u0442\u043e\u043a");
        this.N(class00869.Tz.B(), "ancient-debris", "\u0414\u0440\u0435\u0432\u043d\u0438\u0435 \u043e\u0431\u043b\u043e\u043c\u043a\u0438");
        this.N(class06570.GB, "experience-bottle", "\u041f\u0443\u0437\u044b\u0440\u0451\u043a \u043e\u043f\u044b\u0442\u0430");
        this.N(class06570.bN, "gunpowder", "\u041f\u043e\u0440\u043e\u0445");
        this.N(class06570.nU, "blaze-rod", "\u041e\u0433\u043d\u0435\u043d\u043d\u044b\u0439 \u0441\u0442\u0435\u0440\u0436\u0435\u043d\u044c");
        this.N(class06570.nz, "ender-pearl", "\u042d\u043d\u0434\u0435\u0440 \u0436\u0435\u043c\u0447\u0443\u0433");
        this.N(class06570.TN, "diamond", "\u0410\u043b\u043c\u0430\u0437");
        this.N(class06570.TU, "gold-ingot", "\u0417\u043e\u043b\u043e\u0442\u043e\u0439 \u0441\u043b\u0438\u0442\u043e\u043a");
        this.N(class06570.NX, "gold-block", "\u0417\u043e\u043b\u043e\u0442\u043e\u0439 \u0431\u043b\u043e\u043a");
        this.N(class06570.Nk.B(), "diamond-ore", "\u0410\u043b\u043c\u0430\u0437\u043d\u0430\u044f \u0440\u0443\u0434\u0430");
        this.N(class06570.NG.B(), "emerald-ore", "\u0418\u0437\u0443\u043c\u0440\u0443\u0434\u043d\u0430\u044f \u0440\u0443\u0434\u0430");
        this.N(class06570.Bw.B(), "beacon", "\u041c\u0430\u044f\u043a");
        this.N(class06570.tf, "blaze-spawn-egg", "\u042f\u0439\u0446\u043e \u043f\u0440\u0438\u0437\u044b\u0432\u0430 \u0432\u0441\u043f\u043e\u043b\u043e\u0445\u0430");
        this.N(class06570.tC, "ghast-spawn-egg", "\u042f\u0439\u0446\u043e \u043f\u0440\u0438\u0437\u044b\u0432\u0430 \u0433\u0430\u0441\u0442\u0430");
        this.N(class06570.Gi, "enderman-spawn-egg", "\u042f\u0439\u0446\u043e \u043f\u0440\u0438\u0437\u044b\u0432\u0430 \u044d\u043d\u0434\u0435\u0440\u043c\u0435\u043d\u0430");
        this.N(class06570.tJ, "creeper-spawn-egg", "\u042f\u0439\u0446\u043e \u043f\u0440\u0438\u0437\u044b\u0432\u0430 \u043f\u0438\u0433\u043b\u0438\u043d\u0430");
        this.N(class06570.nk, "pig-spawn-egg", "\u042f\u0439\u0446\u043e \u043f\u0440\u0438\u0437\u044b\u0432\u0430 \u0441\u0432\u0438\u043d\u044c\u0438");
        this.N(class06570.nY, "sheep-spawn-egg", "\u042f\u0439\u0446\u043e \u043f\u0440\u0438\u0437\u044b\u0432\u0430 \u043e\u0432\u0446\u044b");
        this.N(class06570.tW, "villager-spawn-egg", "\u042f\u0439\u0446\u043e \u043f\u0440\u0438\u0437\u044b\u0432\u0430 \u043a\u0440\u0435\u0441\u0442\u044c\u044f\u043d\u0438\u043d\u0430");
        this.N(class06570.nw, "cow-spawn-egg", "\u042f\u0439\u0446\u043e \u043f\u0440\u0438\u0437\u044b\u0432\u0430 \u043a\u043e\u0440\u043e\u0432\u044b");
        this.N(class06570.tY, "zombie-villager-spawn-egg", "\u042f\u0439\u0446\u043e \u043f\u0440\u0438\u0437\u044b\u0432\u0430 \u0437\u043e\u043c\u0431\u0438-\u043a\u0440\u0435\u0441\u0442\u044c\u044f\u043d\u0438\u043d\u0430");
        this.N(class06570.GQ, "dragon-head", "\u0413\u043e\u043b\u043e\u0432\u0430 \u0434\u0440\u0430\u043a\u043e\u043d\u0430");
        this.N(class06570.Gz, "wind-charge", "\u0417\u0430\u0440\u044f\u0434 \u0432\u0435\u0442\u0440\u0430");
        this.N(class06570.NK, "heavy-core", "\u041d\u0430\u0432\u0435\u0440\u0448\u0438\u0435 \u0431\u0443\u043b\u0430\u0432\u044b");
    }

    private void u() {
        for (class11664 class116642 : class11107.y()) {
            class10938 class109382 = new class10938(class116642.i().E(), class116642.u(), class116642.y(), class116642.L());
            this.N((class11882)class109382);
        }
    }

    public Map<String, class11882> y() {
        return (Map)this.N_0;
    }

    public Optional<class11882> N(String string) {
        class11882 class118822 = (class11882)((Map)this.N_0).get(string);
        if (class118822 == null) {
            class118822 = (class11882)((Map)this.N_1).get(string);
        }
        return Optional.ofNullable(class118822);
    }

    public Map<String, class11882> N() {
        return (Map)this.N_1;
    }

    private void N(class06581 class065812, String string, String string2) {
        class11882 class118822 = new class11882(class065812.E(), string, string2, class11165.OTHER);
        this.N(class118822);
    }

    private void N(class11882 class118822) {
        ((Map)this.N_0).put(class118822.L().N(), class118822);
        ((Map)this.N_1).put(class118822.R(), class118822);
    }

    private void W() {
        class11646 class116462 = new class11646(class06570.zS.E(), "shulker", "\u0428\u0430\u043b\u043a\u0435\u0440", class11165.OTHER);
        this.N((class11882)class116462);
    }

    private void R() {
    }
}

