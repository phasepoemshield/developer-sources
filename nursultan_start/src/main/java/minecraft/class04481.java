/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class00737
 *  minecraft.class02626
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05033
 *  minecraft.class05074
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07536
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;
import minecraft.class00737;
import minecraft.class02626;
import minecraft.class04479;
import minecraft.class04485;
import minecraft.class04513;
import minecraft.class04519;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05033;
import minecraft.class05074;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07536;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public final class class04481
extends Enum<class04481>
implements class05033 {
    public static final /* enum */ class04481 field_47383 = new class04481("inactive", 0, class04519.N, -1.0, false);
    public static final /* enum */ class04481 field_47384 = new class04481("waiting_for_players", 4, class04519.y, 200.0, true);
    public static final /* enum */ class04481 field_47385 = new class04481("active", 8, class04519.L, 1000.0, true);
    public static final /* enum */ class04481 field_47386 = new class04481("waiting_for_reward_ejection", 8, class04519.y, -1.0, false);
    public static final /* enum */ class04481 field_47387 = new class04481("ejecting_reward", 8, class04519.y, -1.0, false);
    public static final /* enum */ class04481 field_47388 = new class04481("cooldown", 0, class04519.u, -1.0, false);
    private static final float field_47389 = 40.0f;
    private static final int field_47390;
    private final String field_47391;
    private final int field_47392;
    private final double field_47393;
    private final class04519 field_47394;
    private final boolean field_47395;
    private static final /* synthetic */ class04481[] field_47396;

    public boolean L() {
        return this.field_47393 >= 0.0;
    }

    private class04481(String string2, int n2, class04519 class045192, double d, boolean bl) {
        this.field_47391 = string2;
        this.field_47392 = n2;
        this.field_47394 = class045192;
        this.field_47393 = d;
        this.field_47395 = bl;
    }

    public static class04481[] values() {
        return (class04481[])field_47396.clone();
    }

    public static class04481 valueOf(String string) {
        return Enum.valueOf(class04481.class, string);
    }

    private static /* synthetic */ class04481[] i() {
        return new class04481[]{field_47383, field_47384, field_47385, field_47386, field_47387, field_47388};
    }

    public boolean u() {
        return this.field_47395;
    }

    public double y() {
        return this.field_47393;
    }

    class04481 N(class07209 class072092, class04485 class044852, class04782 class047822) {
        class04479 class044792 = class044852.B();
        class04513 class045132 = class044852.N();
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                if (class044792.N(class044852, (class07299)class047822, field_47384) == null) {
                    yield this;
                }
                yield field_47384;
            }
            case 1 -> {
                if (!class044852.N(class047822)) {
                    class044792.L();
                    yield this;
                }
                if (!class044792.N(class044852, class047822.field_9229)) {
                    yield field_47383;
                }
                class044792.N(class047822, class072092, class044852);
                if (class044792.N.isEmpty()) {
                    yield this;
                }
                yield field_47385;
            }
            case 2 -> {
                if (!class044852.N(class047822)) {
                    class044792.L();
                    yield field_47384;
                }
                if (!class044792.N(class044852, class047822.field_9229)) {
                    yield field_47383;
                }
                int var6_6 = class044792.N(class072092);
                class044792.N(class047822, class072092, class044852);
                if (class044852.u()) {
                    this.N(class047822, class072092, class044852);
                }
                if (class044792.N(class045132, var6_6)) {
                    if (class044792.u()) {
                        class044792.L = class047822.N() + (long)class044852.i();
                        class044792.i = 0;
                        class044792.u = 0L;
                        yield field_47386;
                    }
                } else if (class044792.N(class047822, class045132, var6_6)) {
                    class044852.L(class047822, class072092).ifPresent(uUID -> {
                        class044792.y.add((UUID)uUID);
                        ++class044792.i;
                        class044792.u = class047822.N() + (long)class045132.B();
                        class045132.Z().N(class047822.method_8409()).ifPresent(class008082 -> {
                            class044792.R = Optional.of(class008082);
                            class044852.Z();
                        });
                    });
                }
                yield this;
            }
            case 3 -> {
                if (class044792.N(class047822, 40.0f, class044852.i())) {
                    class047822.N(null, class072092, class04909.Pi, class04911.field_15245);
                    yield field_47387;
                }
                yield this;
            }
            case 4 -> {
                if (!class044792.y(class047822, field_47390, class044852.i())) {
                    yield this;
                }
                if (class044792.N.isEmpty()) {
                    class047822.N(null, class072092, class04909.PR, class04911.field_15245);
                    class044792.M = Optional.empty();
                    yield field_47388;
                }
                if (class044792.M.isEmpty()) {
                    class044792.M = class045132.z().N(class047822.method_8409());
                }
                class044792.M.ifPresent(class059462 -> class044852.N(class047822, class072092, (class05946<class05074>)class059462));
                class044792.N.remove(class044792.N.iterator().next());
                yield this;
            }
            case 5 -> {
                class044792.N(class047822, class072092, class044852);
                if (!class044792.N.isEmpty()) {
                    class044792.i = 0;
                    class044792.u = 0L;
                    yield field_47385;
                }
                if (class044792.N(class047822)) {
                    class044852.y(class047822, class072092);
                    class044792.y();
                    yield field_47384;
                }
                yield this;
            }
        };
    }

    private boolean N(class04782 class047822, class04479 class044792) {
        return class047822.N() >= class044792.L;
    }

    private void N(class04782 class047822, class07209 class072092, class04485 class044852) {
        class04513 class045132;
        class04479 class044792 = class044852.B();
        class06584 class065842 = class044792.N(class047822, class045132 = class044852.N(), class072092).N(class047822.field_9229).orElse(class06584.E);
        if (class065842.R()) {
            return;
        }
        if (this.N(class047822, class044792)) {
            class04481.N(class047822, class072092, class044852, class044792).ifPresent(class068892 -> {
                class02626 class026262 = class02626.N((class07299)class047822, (class06584)class065842);
                class026262.method_29495(class068892);
                class047822.method_8649((class07049)class026262);
                float f = (class047822.method_8409().z() - class047822.method_8409().z()) * 0.2f + 1.0f;
                class047822.method_8396(null, class07209.method_49638((class00737)class068892), class04909.mr, class04911.field_15245, 1.0f, f);
                class044792.L = class047822.N() + class044852.L().N();
            });
        }
    }

    private static Optional<class06889> N(class07049 class070492, class04782 class047822) {
        class06889 class068892;
        class06889 class068893 = class070492.method_73189();
        class06889 class068894 = class047822.N(new class05862(class068893, class068892 = class068893.N(class07211.field_11036, (double)(class070492.method_17682() + 2.0f + (float)class047822.field_9229.y(4))), class05849.field_23142, class05835.field_1348, class06092.N())).u().method_46558().N(class07211.field_11033, 1.0);
        class07209 class072092 = class07209.method_49638((class00737)class068894);
        if (!class047822.method_8320(class072092).M((class07290)class047822, class072092).method_1110()) {
            return Optional.empty();
        }
        return Optional.of(class068894);
    }

    private static Optional<class06889> N(class04782 class047822, class07209 class072092, class04485 class044852, class04479 class044792) {
        List list = class044792.N.stream().map(arg_0 -> ((class04782)class047822).N(arg_0)).filter(Objects::nonNull).filter(class080362 -> !class080362.method_68878() && !class080362.method_7325() && class080362.method_5805() && class080362.method_5707(class072092.method_46558()) <= (double)class04995.Z((int)class044852.R())).toList();
        if (list.isEmpty()) {
            return Optional.empty();
        }
        class07049 class070492 = class04481.N(list, class044792.y, class044852, class072092, class047822);
        if (class070492 == null) {
            return Optional.empty();
        }
        return class04481.N(class070492, class047822);
    }

    private static @Nullable class07049 N(List<class08036> list, Set<UUID> set, class04485 class044852, class07209 class072092, class04782 class047822) {
        List list2;
        Stream<class07049> stream = set.stream().map(arg_0 -> ((class04782)class047822).method_66347(arg_0)).filter(Objects::nonNull).filter(class070492 -> class070492.method_5805() && class070492.method_5707(class072092.method_46558()) <= (double)class04995.Z((int)class044852.R()));
        List list3 = list2 = class047822.field_9229.Z() ? stream.toList() : list;
        if (list2.isEmpty()) {
            return null;
        }
        if (list2.size() == 1) {
            return (class07049)list2.getFirst();
        }
        return (class07049)class07536.N_77((List)list2, (class06069)class047822.field_9229);
    }

    public void N(class07299 class072992, class07209 class072092, boolean bl) {
        this.field_47394.emit(class072992, class072992.method_8409(), class072092, bl);
    }

    public int N() {
        return this.field_47392;
    }

    public String method_15434() {
        return this.field_47391;
    }

    static {
        field_47396 = class04481.i();
        field_47390 = class04995.y((float)30.0f);
    }
}

