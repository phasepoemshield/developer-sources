/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04836
 *  minecraft.class06995
 *  minecraft.class06997
 *  minecraft.class07001
 *  minecraft.class07009
 *  minecraft.class07019
 *  minecraft.class07029
 *  minecraft.class07037
 *  minecraft.class07707
 *  minecraft.class07709
 *  minecraft.class07720
 *  minecraft.class07729
 *  minecraft.class07730
 *  minecraft.class07741
 *  minecraft.class07757
 */
package minecraft;

import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
import minecraft.class04836;
import minecraft.class06995;
import minecraft.class06997;
import minecraft.class07001;
import minecraft.class07009;
import minecraft.class07019;
import minecraft.class07029;
import minecraft.class07037;
import minecraft.class07707;
import minecraft.class07709;
import minecraft.class07720;
import minecraft.class07729;
import minecraft.class07730;
import minecraft.class07741;
import minecraft.class07757;

public class class04818
implements class04836 {
    private static final Pattern N = Pattern.compile("[A-Za-z._]+[A-Za-z0-9._+-]*");
    private final StringBuilder y = new StringBuilder();

    public void N(class07741 class077412) {
        this.y.append('[');
        for (int i = 0; i < class077412.size(); ++i) {
            if (i != 0) {
                this.y.append(',');
            }
            class077412.get(i).N((class04836)this);
        }
        this.y.append(']');
    }

    public void N(class07757 class077572) {
        this.y.append("[L;");
        long[] lArray = class077572.M();
        for (int i = 0; i < lArray.length; ++i) {
            if (i != 0) {
                this.y.append(',');
            }
            this.y.append(lArray[i]).append('L');
        }
        this.y.append(']');
    }

    public void N(class06995 class069952) {
        this.y.append("[I;");
        int[] nArray = class069952.M();
        for (int i = 0; i < nArray.length; ++i) {
            if (i != 0) {
                this.y.append(',');
            }
            this.y.append(nArray[i]);
        }
        this.y.append(']');
    }

    public void N(class07029 class070292) {
        this.y.append("[B;");
        byte[] byArray = class070292.i();
        for (int i = 0; i < byArray.length; ++i) {
            if (i != 0) {
                this.y.append(',');
            }
            this.y.append(byArray[i]).append('B');
        }
        this.y.append(']');
    }

    public void N(class07019 class070192) {
        this.y.append(class070192.m()).append('d');
    }

    public void N(class06997 class069972) {
        this.y.append("END");
    }

    private void N(String string) {
        if (!string.equalsIgnoreCase("true") && !string.equalsIgnoreCase("false") && N.matcher(string).matches()) {
            this.y.append(string);
        } else {
            class07707.N((String)string, (StringBuilder)this.y);
        }
    }

    public void N(class07001 class070012) {
        this.y.append('{');
        ArrayList arrayList = new ArrayList(class070012.M());
        arrayList.sort(Map.Entry.comparingByKey());
        for (int i = 0; i < arrayList.size(); ++i) {
            Map.Entry entry = (Map.Entry)arrayList.get(i);
            if (i != 0) {
                this.y.append(',');
            }
            this.N((String)entry.getKey());
            this.y.append(':');
            ((class07709)entry.getValue()).N((class04836)this);
        }
        this.y.append('}');
    }

    public void N(class07720 class077202) {
        this.y.append(class077202.m());
    }

    public void N(class07730 class077302) {
        this.y.append(class077302.m()).append('s');
    }

    public void N(class07037 class070372) {
        this.y.append(class070372.m()).append('b');
    }

    public void N(class07707 class077072) {
        this.y.append(class07707.y((String)class077072.U()));
    }

    public void N(class07729 class077292) {
        this.y.append(class077292.m()).append('L');
    }

    public void N(class07009 class070092) {
        this.y.append(class070092.m()).append('f');
    }

    public String N() {
        return this.y.toString();
    }
}

