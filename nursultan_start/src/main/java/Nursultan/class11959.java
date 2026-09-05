/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09255
 *  Nursultan.class09256
 *  Nursultan.class09257
 *  Nursultan.class09266
 *  Nursultan.class09270
 *  Nursultan.class09271
 *  Nursultan.class09273
 *  Nursultan.class09274
 *  Nursultan.class09278
 *  Nursultan.class09280
 *  Nursultan.class09283
 *  Nursultan.class09286
 *  Nursultan.class09288
 *  Nursultan.class09289
 *  Nursultan.class09290
 *  Nursultan.class09296
 *  Nursultan.class09298
 *  Nursultan.class09299
 *  Nursultan.class09302
 *  io.netty.util.AttributeKey
 */
package Nursultan;

import Nursultan.class09255;
import Nursultan.class09256;
import Nursultan.class09257;
import Nursultan.class09266;
import Nursultan.class09270;
import Nursultan.class09271;
import Nursultan.class09273;
import Nursultan.class09274;
import Nursultan.class09278;
import Nursultan.class09280;
import Nursultan.class09283;
import Nursultan.class09286;
import Nursultan.class09288;
import Nursultan.class09289;
import Nursultan.class09290;
import Nursultan.class09296;
import Nursultan.class09298;
import Nursultan.class09299;
import Nursultan.class09302;
import Nursultan.class11943;
import Nursultan.class11945;
import Nursultan.class11947;
import Nursultan.class11948;
import Nursultan.class11951;
import Nursultan.class11953;
import Nursultan.class11954;
import Nursultan.class11955;
import Nursultan.class11957;
import Nursultan.class11958;
import Nursultan.class11963;
import Nursultan.class11964;
import Nursultan.class11967;
import Nursultan.class11968;
import Nursultan.class11971;
import Nursultan.class11974;
import Nursultan.class11975;
import Nursultan.class11977;
import Nursultan.class11978;
import Nursultan.class11983;
import Nursultan.class11984;
import Nursultan.class11986;
import Nursultan.class11987;
import io.netty.util.AttributeKey;
import java.util.HashMap;
import java.util.Map;

public class class11959
extends Enum<class11959> {
    public static final /* enum */ class11959 AUTH;
    public static final /* enum */ class11959 PLAY;
    public static AttributeKey staticFields_0045a7f96127f3825b996192bc44fb844_2;
    public static AttributeKey staticFields_0045a7f96127f3825b996192bc44fb844_3;
    public static Map staticFields_0045a7f96127f3825b996192bc44fb844_4;
    private static final /* synthetic */ class11959[] $VALUES;
    public Map fields_0045a7f96127f3825b996192bc44fb844_0;

    private static void L() {
        AUTH = null;
        PLAY = null;
        staticFields_0045a7f96127f3825b996192bc44fb844_2 = null;
        staticFields_0045a7f96127f3825b996192bc44fb844_3 = null;
        staticFields_0045a7f96127f3825b996192bc44fb844_4 = null;
        $VALUES = null;
    }

    private class11959(class11977 class119772) {
        this.R();
        this.fields_0045a7f96127f3825b996192bc44fb844_0 = (Map)class119772.N_0;
    }

    static {
        class11959.N();
        class11977 class119772 = new class11977();
        class11943 class119432 = new class11943().N(0, class09288.class, class09288::new);
        class11977 class119773 = class119772.N(class11964.SERVER_TO_CLIENT, class119432.N(1, class09302.class, class09302::new));
        class11943 class119433 = new class11943();
        AUTH = new class11959(class119773.N(class11964.CLIENT_TO_SERVER, class119433.N(0, class11954.class, class11954::new)));
        class11977 class119774 = new class11977();
        class11943 class119434 = new class11943().N(0, class09270.class, class09270::new).N(1, class09280.class, class09280::new).N(2, class09298.class, class09298::new).N(3, class09271.class, class09271::new).N(4, class09255.class, class09255::new).N(5, class09273.class, class09273::new).N(6, class09289.class, class09289::new).N(7, class09266.class, class09266::new).N(8, class09278.class, class09278::new).N(9, class09286.class, class09286::new).N(10, class09257.class, class09257::new).N(11, class09290.class, class09290::new).N(12, class09296.class, class09296::new).N(13, class09274.class, class09274::new).N(14, class09283.class, class09283::new).N(15, class09256.class, class09256::new);
        class11977 class119775 = class119774.N(class11964.SERVER_TO_CLIENT, class119434.N(16, class09299.class, class09299::new, 16));
        class11943 class119435 = new class11943().N(0, class11958.class, class11958::new).N(1, class11986.class, class11986::new).N(2, class11975.class, class11975::new).N(3, class11974.class, class11974::new).N(4, class11978.class, class11978::new).N(5, class11984.class, class11984::new).N(6, class11945.class, class11945::new).N(7, class11968.class, class11968::new).N(8, class11987.class, class11987::new).N(9, class11983.class, class11983::new).N(10, class11953.class, class11953::new).N(11, class11955.class, class11955::new).N(12, class11971.class, class11971::new).N(13, class11963.class, class11963::new).N(14, class11967.class, class11967::new).N(15, class11948.class, class11948::new).N(16, class11957.class, class11957::new);
        PLAY = new class11959(class119775.N(class11964.CLIENT_TO_SERVER, class119435.N(17, class11947.class, class11947::new, 16)));
        $VALUES = class11959.y();
        staticFields_0045a7f96127f3825b996192bc44fb844_2 = AttributeKey.valueOf((String)"protocol");
        staticFields_0045a7f96127f3825b996192bc44fb844_3 = AttributeKey.valueOf((String)"protocolVersion");
        staticFields_0045a7f96127f3825b996192bc44fb844_4 = new HashMap();
        class11959[] class11959Array = class11959.values();
        class11959Array[0].fields_0045a7f96127f3825b996192bc44fb844_0.forEach((arg_0, arg_1) -> class11959.N(class11959Array[0], arg_0, arg_1));
        class11959Array[1].fields_0045a7f96127f3825b996192bc44fb844_0.forEach((arg_0, arg_1) -> class11959.N(class11959Array[1], arg_0, arg_1));
    }

    public static class11959[] values() {
        return (class11959[])$VALUES.clone();
    }

    public static class11959 valueOf(String string) {
        return Enum.valueOf(class11959.class, string);
    }

    private static /* synthetic */ class11959[] y() {
        return new class11959[]{AUTH, PLAY};
    }

    public Integer N(class11964 class119642, class11951<?> class119512) {
        return ((class11943)this.fields_0045a7f96127f3825b996192bc44fb844_0.get((Object)class119642)).N(class119512.getClass());
    }

    public boolean N(class11964 class119642, class11951<?> class119512, int n) {
        return ((class11943)this.fields_0045a7f96127f3825b996192bc44fb844_0.get((Object)class119642)).N(class119512.getClass(), n);
    }

    private static /* synthetic */ void N(class11959 class119592, class11964 class119642, class11943 class119432) {
        class119432.N().forEach(clazz -> {
            if (staticFields_0045a7f96127f3825b996192bc44fb844_4.containsKey(clazz) && staticFields_0045a7f96127f3825b996192bc44fb844_4.get(clazz) != class119592) {
                throw new IllegalStateException("Packet " + String.valueOf(clazz) + " is already assigned to protocol " + String.valueOf(staticFields_0045a7f96127f3825b996192bc44fb844_4.get(clazz)) + " - can't reassign to " + String.valueOf((Object)class119592));
            }
            staticFields_0045a7f96127f3825b996192bc44fb844_4.put(clazz, class119592);
        });
    }

    public static class11959 N(class11951<?> class119512) {
        return (class11959)((Object)staticFields_0045a7f96127f3825b996192bc44fb844_4.get(class119512.getClass()));
    }

    private static void N() {
    }

    public class11951<?> N(class11964 class119642, int n, int n2) {
        return ((class11943)this.fields_0045a7f96127f3825b996192bc44fb844_0.get((Object)class119642)).N(n, n2);
    }

    private void R() {
    }
}

