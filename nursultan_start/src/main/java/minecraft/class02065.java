/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03380
 *  minecraft.class03409
 *  minecraft.class05096
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.time.Instant;
import java.util.UUID;
import minecraft.class03380;
import minecraft.class03409;
import minecraft.class05096;
import org.jspecify.annotations.Nullable;

public abstract class class02065 {
    protected final UUID y;
    protected final Instant L;
    protected final UUID u;
    protected String i = "";
    protected @Nullable class03380 R;
    protected boolean M;

    public class02065(UUID uUID, Instant instant, UUID uUID2) {
        this.y = uUID;
        this.L = instant;
        this.u = uUID2;
    }

    public abstract class02065 y();

    public boolean N(UUID uUID) {
        return uUID.equals(this.u);
    }

    public abstract class05096 N(class05096 var1, class03409 var2);
}

