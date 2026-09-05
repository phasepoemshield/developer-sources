/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  minecraft.class00392
 *  minecraft.class01321
 *  minecraft.class01894
 *  minecraft.class03723
 *  minecraft.class03754
 *  minecraft.class04719
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class06202
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonObject;
import java.util.UUID;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01321;
import minecraft.class01894;
import minecraft.class03576;
import minecraft.class03588;
import minecraft.class03596;
import minecraft.class03723;
import minecraft.class03754;
import minecraft.class04719;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class06202;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public class class03580
extends class03576 {
    private static final String M = "title";
    private static final String B = "message";
    private static final String Z = "image";
    private static final String z = "urlButton";
    private final class03596 U;
    private final class03596 E;
    private final class01894 W;
    private final @Nullable class03588 m;

    private class03580(class03576 class035762, class03596 class035962, class03596 class035963, class01894 class018942, @Nullable class03588 class035882) {
        super(class035762.L, class035762.u, class035762.i, class035762.R);
        this.U = class035962;
        this.E = class035963;
        this.W = class018942;
        this.m = class035882;
    }

    public @Nullable class03723 N(class05096 class050962, Consumer<UUID> consumer) {
        class00392 class003922 = this.U.N();
        if (class003922 == null) {
            class03576.N.warn("Realms info popup had title with no available translation: {}", (Object)this.U);
            return null;
        }
        class03754 class037542 = new class03754(class050962, class003922).N(this.W).N(this.E.N(class05220.N));
        if (this.m != null) {
            class037542.N(this.m.y().N(class03576.y), (T class037232) -> {
                class06202 class062022 = class06202.Nq();
                class062022.N((class05096)new class01321(bl -> {
                    if (bl) {
                        class07536.m().N(this.m.N());
                        class062022.N(class050962);
                    } else {
                        class062022.N((class05096)class037232);
                    }
                }, this.m.N(), true));
                consumer.accept(this.L());
            });
        }
        class037542.N(class05220.B, (T class037232) -> {
            class037232.method_25419();
            consumer.accept(this.L());
        });
        class037542.N(() -> consumer.accept(this.L()));
        return class037542.N();
    }

    public static class03580 N(class03576 class035762, JsonObject jsonObject) {
        class03596 class035962 = (class03596)class04719.N((String)M, (JsonObject)jsonObject, class03596::N);
        class03596 class035963 = (class03596)class04719.N((String)B, (JsonObject)jsonObject, class03596::N);
        class01894 class018942 = class01894.N((String)class04719.N((String)Z, (JsonObject)jsonObject));
        class03588 class035882 = (class03588)((Object)class04719.y((String)z, (JsonObject)jsonObject, class03588::N));
        return new class03580(class035762, class035962, class035963, class018942, class035882);
    }
}

