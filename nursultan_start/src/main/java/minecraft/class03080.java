/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class02083
 *  minecraft.class03926
 *  minecraft.class03934
 *  minecraft.class03954
 *  minecraft.class03962
 *  minecraft.class04469
 *  minecraft.class04470
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import minecraft.class02083;
import minecraft.class03045;
import minecraft.class03065;
import minecraft.class03073;
import minecraft.class03079;
import minecraft.class03926;
import minecraft.class03934;
import minecraft.class03954;
import minecraft.class03962;
import minecraft.class04469;
import minecraft.class04470;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03080 {
    static final Logger N = LogUtils.getLogger();
    @Nullable class02083 y;
    Instant L = Instant.EPOCH;

    public class03080(UUID uUID, UUID uUID2) {
        this.y = class02083.N((UUID)uUID, (UUID)uUID2);
    }

    public class03065 N(class03954 class039542) {
        return class030792 -> {
            class02083 class020832 = this.y;
            if (class020832 == null) {
                return null;
            }
            this.y = class020832.N();
            return new class04469(class039542.sign(class039342 -> class03926.N((class03934)class039342, (class02083)class020832, (class03079)class030792)));
        };
    }

    public class03073 N(class04470 class044702) {
        class03962 class039622 = class044702.N();
        return new class03045(this, class044702, class039622);
    }
}

