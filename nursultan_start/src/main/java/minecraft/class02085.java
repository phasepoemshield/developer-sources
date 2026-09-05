/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class class02085 {
    @Nullable String N;
    private final List<String> y = Lists.newArrayList();

    class02085() {
    }

    public String toString() {
        if (this.N != null) {
            if (this.y.isEmpty()) {
                return this.N;
            }
            return this.N + " " + this.y();
        }
        if (this.y.isEmpty()) {
            return "(Unknown file)";
        }
        return "(Unknown file) " + this.y();
    }

    public String y() {
        return StringUtils.join(this.y, (String)"->");
    }

    void N(String string) {
        this.y.add(0, string);
    }

    public @Nullable String N() {
        return this.N;
    }
}

