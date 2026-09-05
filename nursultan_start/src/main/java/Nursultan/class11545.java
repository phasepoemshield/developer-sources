/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AnarchyHelper
 *  Nursultan.class10990
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11888
 *  minecraft.class00381
 *  minecraft.class04459
 *  minecraft.class05216
 *  minecraft.class06541
 */
package Nursultan;

import Nursultan.AnarchyHelper;
import Nursultan.class10990;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11888;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class00381;
import minecraft.class04459;
import minecraft.class05216;
import minecraft.class06541;

public class class11545
extends class11888 {
    public Object N_0;
    public Object N_1;
    public Object N_2;

    private String M(String string) {
        return Character.toUpperCase(string.charAt(0)) + string.substring(1);
    }

    public class11545(AnarchyHelper anarchyHelper) {
        this.N();
        this.N_0 = Pattern.compile("\\[([^]]+)][.\\s]*?(-?\\d+)\\s+(-?\\d+)\\s+(-?\\d+)");
        this.N_1 = class11524.N((class11512)anarchyHelper, (String)"event-notification", (boolean)true);
        this.N_2 = (class11507)class11524.N((class11512)anarchyHelper, (String)"automatic-add-waypoint", (boolean)true).N(class115362 -> {
            this.N();
            return (Boolean)((class11507)this.N_1).i();
        });
    }

    private void N() {
    }

    private String N(class05216 class052162) {
        return class06541.N((String)class052162.getString()).toLowerCase().replace(";", "").replace("\n", "");
    }

    public void N(class10990 class109902) {
        class04459 class044592;
        block7: {
            block6: {
                this.N();
                class00381 var3 = class109902.u();
                if (!(var3 instanceof class04459)) break block6;
                class044592 = (class04459)var3;
                if (((Boolean)((class11507)this.N_1).i()).booleanValue()) break block7;
            }
            return;
        }
        String string = this.N(class044592.N().L());
        if (!string.contains("\u2554") || !string.contains("\u043f\u043e\u044f\u0432\u0438\u043b\u0441\u044f \u043d\u0430 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u0445")) {
            return;
        }
        Matcher matcher = ((Pattern)this.N_0).matcher(string);
        if (!matcher.find()) {
            return;
        }
        String string2 = matcher.group(1);
        if (string2.contains("\u0437\u0430\u0433\u0430\u0434\u043e\u0447\u043d\u044b\u0439 \u043c\u0430\u044f\u043a")) {
            return;
        }
        this.N(this.M(string2), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), (Boolean)((class11507)this.N_2).i());
    }
}

