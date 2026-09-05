/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09770
 *  Nursultan.class10021
 */
package Nursultan;

import Nursultan.class09770;
import Nursultan.class09895;
import Nursultan.class09896;
import Nursultan.class09927;
import Nursultan.class09935;
import Nursultan.class09936;
import Nursultan.class10021;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

final class class09890 {
    private static final Logger N = Logger.getLogger(class09890.class.getName());
    private final class09927 y = new class09927();

    class09890() {
    }

    private static String N(class10021 class100212) {
        String string = class100212.N();
        return string == null || string.isBlank() ? "<anonymous>" : string;
    }

    class09936 N(class10021 class100212, class09895 class098952, List<String> list, boolean bl) {
        if (!bl) {
            return class09936.N(class098952.N(), class098952.y(), list);
        }
        List<class09935> var5 = this.y.N(class100212);
        if (var5.isEmpty()) {
            return class09936.N(class098952.N(), class098952.y(), list);
        }
        ArrayList<class09935> arrayList = new ArrayList<class09935>(class098952.N().size() + var5.size());
        arrayList.addAll(class098952.N());
        arrayList.addAll(var5);
        return class09936.N(arrayList, class098952.y() + var5.size(), list);
    }

    void N(class10021 class100212, int n, class09896 class098962, class09770 class097702) {
        if (!(class097702 == null ? class09770.N : class097702).i() || class098962.L <= 0) {
            return;
        }
        N.info(() -> "Draw commands rebuilt for root='" + class09890.N(class100212) + "', drawCommandCount=" + n + ", rebuiltNodes=" + class098962.L + ", cacheHits=" + class098962.N + ", cacheMisses=" + class098962.y);
    }
}

