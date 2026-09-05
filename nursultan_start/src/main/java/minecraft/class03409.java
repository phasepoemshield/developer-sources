/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.UserApiService
 *  minecraft.class00392
 *  minecraft.class02065
 *  minecraft.class05096
 *  minecraft.class05733
 *  minecraft.class06202
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.authlib.minecraft.UserApiService;
import java.util.Objects;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class02065;
import minecraft.class03407;
import minecraft.class03414;
import minecraft.class03415;
import minecraft.class05096;
import minecraft.class05733;
import minecraft.class06202;
import org.jspecify.annotations.Nullable;

public final class class03409 {
    private static final int N = 1024;
    private final class03414 y;
    private final class03415 L;
    private final class03407 u;
    private @Nullable class02065 i;

    public boolean L() {
        return this.i != null;
    }

    public class03409(class03414 class034142, class03415 class034152, class03407 class034072) {
        this.y = class034142;
        this.L = class034152;
        this.u = class034072;
    }

    public class03407 y() {
        return this.u;
    }

    public void N(@Nullable class02065 class020652) {
        this.i = class020652;
    }

    public boolean N(UUID uUID) {
        return this.L() && this.i.N(uUID);
    }

    public static class03409 N(class03415 class034152, UserApiService userApiService) {
        class03407 class034072 = new class03407(1024);
        class03414 class034142 = class03414.N(class034152, userApiService);
        return new class03409(class034142, class034152, class034072);
    }

    public void N(class06202 class062022, class05096 class050962, Runnable runnable, boolean bl2) {
        if (this.i != null) {
            class02065 class020652 = this.i.y();
            class062022.N((class05096)new class05733(bl -> {
                this.N((class02065)null);
                if (bl) {
                    class062022.N(class020652.N(class050962, this));
                } else {
                    runnable.run();
                }
            }, (class00392)class00392.L((String)(bl2 ? "gui.abuseReport.draft.quittotitle.title" : "gui.abuseReport.draft.title")), (class00392)class00392.L((String)(bl2 ? "gui.abuseReport.draft.quittotitle.content" : "gui.abuseReport.draft.content")), (class00392)class00392.L((String)"gui.abuseReport.draft.edit"), (class00392)class00392.L((String)"gui.abuseReport.draft.discard")));
        } else {
            runnable.run();
        }
    }

    public class03414 N() {
        return this.y;
    }

    public boolean N(class03415 class034152) {
        return Objects.equals((Object)this.L, (Object)class034152);
    }
}

