/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class07211
 *  minecraft.class08871
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Collections;
import java.util.List;
import minecraft.class00394;
import minecraft.class07211;
import minecraft.class08728;
import minecraft.class08743;
import minecraft.class08871;
import org.jspecify.annotations.Nullable;

public interface class08744
extends AutoCloseable {
    default public boolean L() {
        return false;
    }

    @Override
    default public void close() {
    }

    default public boolean y(class08728 class087282) {
        return false;
    }

    default public @Nullable class08871 y(class08743 class087432) {
        return null;
    }

    default public List<class00394> y() {
        return Collections.emptyList();
    }

    public boolean N(class07211 var1, class07211 var2);

    default public boolean N(class08743 class087432) {
        return true;
    }

    default public boolean N() {
        return false;
    }
}

