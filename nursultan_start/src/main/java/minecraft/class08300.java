/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00061
 *  minecraft.class00072
 *  minecraft.class00392
 *  minecraft.class02060
 *  minecraft.class02072
 *  minecraft.class02080
 *  minecraft.class02102
 *  minecraft.class02252
 *  minecraft.class03286
 *  minecraft.class04694
 *  minecraft.class04708
 *  minecraft.class04723
 *  minecraft.class04724
 *  minecraft.class04736
 *  minecraft.class04739
 *  minecraft.class04969
 *  minecraft.class04981
 *  minecraft.class04982
 *  minecraft.class05092
 *  minecraft.class05094
 *  minecraft.class05096
 *  minecraft.class05099
 *  minecraft.class05119
 *  minecraft.class05129
 *  minecraft.class05362
 *  minecraft.class05398
 *  minecraft.class06202
 *  minecraft.class08334
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import minecraft.class00061;
import minecraft.class00072;
import minecraft.class00392;
import minecraft.class02060;
import minecraft.class02072;
import minecraft.class02080;
import minecraft.class02102;
import minecraft.class02252;
import minecraft.class03286;
import minecraft.class04694;
import minecraft.class04708;
import minecraft.class04723;
import minecraft.class04724;
import minecraft.class04736;
import minecraft.class04739;
import minecraft.class04969;
import minecraft.class04981;
import minecraft.class04982;
import minecraft.class05092;
import minecraft.class05094;
import minecraft.class05096;
import minecraft.class05099;
import minecraft.class05119;
import minecraft.class05129;
import minecraft.class05362;
import minecraft.class05398;
import minecraft.class06202;
import minecraft.class08334;
import org.jspecify.annotations.Nullable;

class class08300
extends class03286
implements class00061 {
    static final class00392 N = class00392.L((String)"mco.configure.worlds.title");
    private final class05092 y;
    private final class06202 L;
    private class04981 u;
    private final class05362 i;
    private final class05362 R;
    private final class05362 M;
    private final List<class05099> B = Lists.newArrayList();

    private void L() {
        class04739 class047392 = new class04739((class00392)class00392.L((String)"mco.template.title.minigame"), this::N, class04969.field_19438, null, List.of(class00392.L((String)"mco.minigame.world.info.line1").y(-4539718), class00392.L((String)"mco.minigame.world.info.line2").y(-4539718)));
        this.L.N((class05096)class047392);
    }

    class08300(class05092 class050922, class06202 class062022, class04981 class049812) {
        super(N);
        this.y = class050922;
        this.L = class062022;
        this.u = class049812;
        class02080 class020802 = this.Z.L(20).u(1);
        class02080 class020803 = new class02060().L(16).u(4);
        this.B.clear();
        for (int i = 1; i < 5; ++i) {
            this.B.add((class05099)class020803.N((class02102)this.N(i), class02072.Z().R()));
        }
        class020802.N((class02102)class020803.N());
        class02080 class020804 = new class02060().L(8).u(1);
        this.i = (class05362)class020804.N((class02102)class05362.method_46430((class00392)class00392.L((String)"mco.configure.world.buttons.options"), class053622 -> class062022.N((class05096)new class04723(class050922, ((class00072)class049812.z.get(class049812.T)).N(), class049812.m, class049812.T))).N(0, 0, 150, 20).N());
        this.R = (class05362)class020804.N((class02102)class05362.method_46430((class00392)class00392.L((String)"mco.configure.world.backup"), class053622 -> class062022.N((class05096)new class05094(class050922, class049812.B(), class049812.T))).N(0, 0, 150, 20).N());
        this.M = (class05362)class020804.N((class02102)class05362.method_46430((class00392)class00392.i(), class053622 -> this.N()).N(0, 0, 150, 20).N());
        class020802.N((class02102)class020804.N(), class02072.Z().y());
        this.R.field_22763 = true;
        this.N(class049812);
    }

    private void y(int n, class04981 class049812) {
        this.L.N((class05096)class02252.N((class05096)this.y, (class00392)class00392.L((String)"mco.configure.world.slot.switch.question.line1"), class037232 -> {
            this.y.R();
            class04736 class047362 = class04736.N((class05096)this.y, (int)n, (class04981)class049812, () -> this.L.execute(() -> this.L.N((class05096)this.y.Z())));
            this.L.N((class05096)class047362);
        }));
    }

    public void y(class04981 class049812) {
        this.N(class049812);
    }

    private boolean y() {
        return this.u.z();
    }

    private void N() {
        if (this.y()) {
            this.L.N((class05096)new class04739((class00392)class00392.L((String)"mco.template.title.minigame"), this::N, class04969.field_19438, null));
        } else {
            this.L.N((class05096)class04736.N((class05096)this.y, (class04981)this.u.B(), () -> this.L.execute(() -> this.L.N((class05096)this.y.Z()))));
        }
    }

    public void N(class04981 class049812) {
        this.u = class049812;
        this.i.field_22763 = !class049812.U && !this.y();
        boolean bl = this.M.field_22763 = !class049812.U;
        if (this.y()) {
            this.M.method_25355((class00392)class00392.L((String)"mco.configure.world.buttons.switchminigame"));
        } else {
            boolean bl2;
            boolean bl3 = bl2 = class049812.z.containsKey(class049812.T) && ((class00072)class049812.z.get((Object)Integer.valueOf((int)class049812.T))).y.Z;
            if (bl2) {
                this.M.method_25355((class00392)class00392.L((String)"mco.configure.world.buttons.newworld"));
            } else {
                this.M.method_25355((class00392)class00392.L((String)"mco.configure.world.buttons.resetworld"));
            }
        }
        this.R.field_22763 = !this.y();
        for (class05099 class050992 : this.B) {
            if (class050992.N((class04981)class049812).z) {
                class050992.method_55445(80, 80);
                continue;
            }
            class050992.method_55445(50, 50);
        }
    }

    private void N(@Nullable class04982 class049822) {
        if (class049822 != null && class05398.field_19448 == class049822.Z()) {
            this.y.R();
            class05092 class050922 = this.y.Z();
            this.L.N((class05096)new class04708((class05096)class050922, new class05129[]{new class04694(this.u.y, class049822, class050922)}));
        } else {
            this.L.N((class05096)this.y);
        }
    }

    private class05099 N(int n) {
        return new class05099(0, 0, 80, 80, n, this.u, class053622 -> {
            class05119 class051192 = ((class05099)class053622).y();
            switch (class08334.N[class051192.B.ordinal()]) {
                case 1: {
                    break;
                }
                case 2: {
                    if (class051192.M) {
                        this.L();
                        break;
                    }
                    if (class051192.R) {
                        this.y(n, this.u);
                        break;
                    }
                    this.N(n, this.u);
                    break;
                }
                default: {
                    throw new IllegalStateException("Unknown action " + String.valueOf(class051192.B));
                }
            }
        });
    }

    private void N(int n, class04981 class049812) {
        this.L.N((class05096)class02252.N((class05096)this.y, (class00392)class00392.L((String)"mco.configure.world.slot.switch.question.line1"), class037232 -> {
            class05092 class050922 = this.y.Z();
            this.y.R();
            this.L.N((class05096)new class04708((class05096)class050922, new class05129[]{new class04724(class049812.y, n, () -> this.L.execute(() -> this.L.N((class05096)class050922)))}));
        }));
    }
}

