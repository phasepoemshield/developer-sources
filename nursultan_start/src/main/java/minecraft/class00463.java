/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04770
 *  minecraft.class05623
 *  minecraft.class07398
 *  minecraft.class07403
 *  minecraft.class07932
 *  minecraft.class08036
 */
package minecraft;

import java.util.Collection;
import java.util.List;
import minecraft.class00392;
import minecraft.class04770;
import minecraft.class05623;
import minecraft.class07398;
import minecraft.class07403;
import minecraft.class07932;
import minecraft.class08036;

public class class00463
implements class07398 {
    private final class05623 N;
    private final class07932 y;

    public class00463(class05623 class056232, class07932 class079322) {
        this.N = class056232;
        this.y = class079322;
    }

    public void N(class00392 class003922, class07403 class074032) {
        this.y.N(class074032, "Send system message: '{}'", new Object[]{class003922.getString()});
        this.N.N(class003922);
    }

    public void N(class00392 class003922, boolean bl, Collection<class04770> collection, class07403 class074032) {
        List list = collection.stream().map(class08036::method_74861).toList();
        this.y.N(class074032, "Send system message to '{}' players (overlay: {}): '{}'", new Object[]{list.size(), bl, class003922.getString()});
        for (class04770 class047702 : collection) {
            if (bl) {
                class047702.method_43502(class003922, true);
                continue;
            }
            class047702.method_64398(class003922);
        }
    }

    public void N(class00392 class003922, boolean bl, class07403 class074032) {
        this.y.N(class074032, "Broadcast system message (overlay: {}): '{}'", new Object[]{bl, class003922.getString()});
        for (class04770 class047702 : this.N.Nm().v()) {
            if (bl) {
                class047702.method_43502(class003922, true);
                continue;
            }
            class047702.method_64398(class003922);
        }
    }

    public void N(boolean bl, class07403 class074032) {
        this.y.N(class074032, "Halt server. WaitForShutdown: {}", new Object[]{bl});
        this.N.y(bl);
    }

    public boolean N(boolean bl, boolean bl2, boolean bl3, class07403 class074032) {
        this.y.N(class074032, "Save everything. SuppressLogs: {}, flush: {}, force: {}", new Object[]{bl, bl2, bl3});
        return this.N.N(bl, bl2, bl3);
    }

    public boolean N() {
        return this.N.Np();
    }
}

