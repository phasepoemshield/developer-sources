/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class00502
 *  minecraft.class00518
 *  minecraft.class00816
 *  minecraft.class00836
 *  minecraft.class00838
 *  minecraft.class01766
 *  minecraft.class01788
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class03704
 *  minecraft.class03711
 *  minecraft.class04160
 *  minecraft.class04162
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04478
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05908
 *  minecraft.class05927
 *  minecraft.class05946
 *  minecraft.class05957
 *  minecraft.class06394
 *  minecraft.class06551
 *  minecraft.class06562
 *  minecraft.class06584
 *  minecraft.class06925
 *  minecraft.class07001
 *  minecraft.class07078
 *  minecraft.class07282
 *  minecraft.class07689
 *  minecraft.class07709
 *  minecraft.class07717
 *  minecraft.class07755
 *  minecraft.class08303
 *  minecraft.class08329
 *  net.fabricmc.fabric.mixin.command.EntitySelectorOptionsAccessor
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00502;
import minecraft.class00518;
import minecraft.class00816;
import minecraft.class00836;
import minecraft.class00838;
import minecraft.class01766;
import minecraft.class01788;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class03704;
import minecraft.class03711;
import minecraft.class04160;
import minecraft.class04162;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04478;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05908;
import minecraft.class05927;
import minecraft.class05946;
import minecraft.class05957;
import minecraft.class06394;
import minecraft.class06551;
import minecraft.class06562;
import minecraft.class06584;
import minecraft.class06790;
import minecraft.class06794;
import minecraft.class06798;
import minecraft.class06800;
import minecraft.class06925;
import minecraft.class07001;
import minecraft.class07078;
import minecraft.class07282;
import minecraft.class07689;
import minecraft.class07709;
import minecraft.class07717;
import minecraft.class07755;
import minecraft.class08303;
import minecraft.class08329;
import net.fabricmc.fabric.mixin.command.EntitySelectorOptionsAccessor;
import org.slf4j.Logger;

public class class06767
implements EntitySelectorOptionsAccessor {
    private static final Logger Z = LogUtils.getLogger();
    private static final Map<String, class06800> z = Maps.newHashMap();
    public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.entity.options.unknown", (Object[])new Object[]{object}));
    public static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.entity.options.inapplicable", (Object[])new Object[]{object}));
    public static final SimpleCommandExceptionType L = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.entity.options.distance.negative"));
    public static final SimpleCommandExceptionType u = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.entity.options.level.negative"));
    public static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)class00392.L((String)"argument.entity.options.limit.toosmall"));
    public static final DynamicCommandExceptionType R = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.entity.options.sort.irreversible", (Object[])new Object[]{object}));
    public static final DynamicCommandExceptionType M = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.entity.options.mode.invalid", (Object[])new Object[]{object}));
    public static final DynamicCommandExceptionType B = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.entity.options.type.invalid", (Object[])new Object[]{object}));

    private static void y(String string, class06798 class067982, Predicate<class06790> predicate, class00392 class003922) {
        z.put(string, new class06800(class067982, predicate, class003922));
    }

    public static /* synthetic */ void N(String string, class06798 class067982, Predicate predicate, class00392 class003922) {
        class06767.y(string, class067982, predicate, class003922);
    }

    public static void N(class06790 class067902, SuggestionsBuilder suggestionsBuilder) {
        String string = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        for (Map.Entry<String, class06800> entry : z.entrySet()) {
            if (!entry.getValue().y().test(class067902) || !entry.getKey().toLowerCase(Locale.ROOT).startsWith(string)) continue;
            suggestionsBuilder.suggest(entry.getKey() + "=", (Message)entry.getValue().L());
        }
    }

    public static void N() {
        if (!z.isEmpty()) {
            return;
        }
        class06767.y("name", class067902 -> {
            int n = class067902.M().getCursor();
            boolean bl = class067902.i();
            String string = class067902.M().readString();
            if (class067902.G() && !bl) {
                class067902.M().setCursor(n);
                throw y.createWithContext((ImmutableStringReader)class067902.M(), (Object)"name");
            }
            if (bl) {
                class067902.L(true);
            } else {
                class067902.y(true);
            }
            class067902.N(class070492 -> class070492.method_74861().equals(string) != bl);
        }, class067902 -> !class067902.t(), (class00392)class00392.L((String)"argument.entity.options.name.description"));
        class06767.y("distance", class067902 -> {
            int n = class067902.M().getCursor();
            class00816 class008162 = class00816.N((StringReader)class067902.M());
            if (class008162.y().isPresent() && (Double)class008162.y().get() < 0.0 || class008162.L().isPresent() && (Double)class008162.L().get() < 0.0) {
                class067902.M().setCursor(n);
                throw L.createWithContext((ImmutableStringReader)class067902.M());
            }
            class067902.N(class008162);
            class067902.B();
        }, class067902 -> class067902.Z() == null, (class00392)class00392.L((String)"argument.entity.options.distance.description"));
        class06767.y("level", class067902 -> {
            int n = class067902.M().getCursor();
            class00836 class008362 = class00836.N((StringReader)class067902.M());
            if (class008362.y().isPresent() && (Integer)class008362.y().get() < 0 || class008362.L().isPresent() && (Integer)class008362.L().get() < 0) {
                class067902.M().setCursor(n);
                throw u.createWithContext((ImmutableStringReader)class067902.M());
            }
            class067902.N(class008362);
            class067902.N(false);
        }, class067902 -> class067902.z() == null, (class00392)class00392.L((String)"argument.entity.options.level.description"));
        class06767.y("x", class067902 -> {
            class067902.B();
            class067902.N(class067902.M().readDouble());
        }, class067902 -> class067902.W() == null, (class00392)class00392.L((String)"argument.entity.options.x.description"));
        class06767.y("y", class067902 -> {
            class067902.B();
            class067902.y(class067902.M().readDouble());
        }, class067902 -> class067902.m() == null, (class00392)class00392.L((String)"argument.entity.options.y.description"));
        class06767.y("z", class067902 -> {
            class067902.B();
            class067902.L(class067902.M().readDouble());
        }, class067902 -> class067902.P() == null, (class00392)class00392.L((String)"argument.entity.options.z.description"));
        class06767.y("dx", class067902 -> {
            class067902.B();
            class067902.u(class067902.M().readDouble());
        }, class067902 -> class067902.s() == null, (class00392)class00392.L((String)"argument.entity.options.dx.description"));
        class06767.y("dy", class067902 -> {
            class067902.B();
            class067902.i(class067902.M().readDouble());
        }, class067902 -> class067902.T() == null, (class00392)class00392.L((String)"argument.entity.options.dy.description"));
        class06767.y("dz", class067902 -> {
            class067902.B();
            class067902.R(class067902.M().readDouble());
        }, class067902 -> class067902.b() == null, (class00392)class00392.L((String)"argument.entity.options.dz.description"));
        class06767.y("x_rotation", class067902 -> class067902.N(class00838.N((StringReader)class067902.M())), class067902 -> class067902.U() == null, (class00392)class00392.L((String)"argument.entity.options.x_rotation.description"));
        class06767.y("y_rotation", class067902 -> class067902.y(class00838.N((StringReader)class067902.M())), class067902 -> class067902.E() == null, (class00392)class00392.L((String)"argument.entity.options.y_rotation.description"));
        class06767.y("limit", class067902 -> {
            int n = class067902.M().getCursor();
            int n2 = class067902.M().readInt();
            if (n2 < 1) {
                class067902.M().setCursor(n);
                throw i.createWithContext((ImmutableStringReader)class067902.M());
            }
            class067902.N(n2);
            class067902.u(true);
        }, class067902 -> !class067902.n() && !class067902.l(), (class00392)class00392.L((String)"argument.entity.options.limit.description"));
        class06767.y("sort", class067902 -> {
            int n = class067902.M().getCursor();
            String string = class067902.M().readUnquotedString();
            class067902.N_63((suggestionsBuilder, consumer) -> class07689.y(Arrays.asList("nearest", "furthest", "random", "arbitrary"), (SuggestionsBuilder)suggestionsBuilder));
            class067902.N(switch (string) {
                case "nearest" -> class06790.U;
                case "furthest" -> class06790.E;
                case "random" -> class06790.W;
                case "arbitrary" -> class06794.y;
                default -> {
                    class067902.M().setCursor(n);
                    throw R.createWithContext((ImmutableStringReader)class067902.M(), (Object)string);
                }
            });
            class067902.i(true);
        }, class067902 -> !class067902.n() && !class067902.d(), (class00392)class00392.L((String)"argument.entity.options.sort.description"));
        class06767.y("gamemode", class067902 -> {
            class067902.N_63((suggestionsBuilder, consumer) -> {
                String string = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
                boolean bl = !class067902.k();
                boolean bl2 = true;
                if (!string.isEmpty()) {
                    if (string.charAt(0) == '!') {
                        bl = false;
                        string = string.substring(1);
                    } else {
                        bl2 = false;
                    }
                }
                for (class07282 class072822 : class07282.values()) {
                    if (!class072822.y().toLowerCase(Locale.ROOT).startsWith(string)) continue;
                    if (bl2) {
                        suggestionsBuilder.suggest("!" + class072822.y());
                    }
                    if (!bl) continue;
                    suggestionsBuilder.suggest(class072822.y());
                }
                return suggestionsBuilder.buildFuture();
            });
            int n = class067902.M().getCursor();
            boolean bl = class067902.i();
            if (class067902.k() && !bl) {
                class067902.M().setCursor(n);
                throw y.createWithContext((ImmutableStringReader)class067902.M(), (Object)"gamemode");
            }
            String string = class067902.M().readUnquotedString();
            class07282 class072822 = class07282.N((String)string, null);
            if (class072822 == null) {
                class067902.M().setCursor(n);
                throw M.createWithContext((ImmutableStringReader)class067902.M(), (Object)string);
            }
            class067902.N(false);
            class067902.N(class070492 -> {
                if (class070492 instanceof class04770) {
                    return ((class04770)class070492).method_68876() == class072822 ^ bl;
                }
                return false;
            });
            if (bl) {
                class067902.M(true);
            } else {
                class067902.R(true);
            }
        }, class067902 -> !class067902.w(), (class00392)class00392.L((String)"argument.entity.options.gamemode.description"));
        class06767.y("team", class067902 -> {
            boolean bl = class067902.i();
            String string = class067902.M().readUnquotedString();
            class067902.N(class070492 -> {
                class00502 class005022 = class070492.method_5781();
                return (class005022 == null ? "" : class005022.L()).equals(string) != bl;
            });
            if (bl) {
                class067902.Z(true);
            } else {
                class067902.B(true);
            }
        }, class067902 -> !class067902.Y(), (class00392)class00392.L((String)"argument.entity.options.team.description"));
        class06767.y("type", class067902 -> {
            class067902.N_63((suggestionsBuilder, consumer) -> {
                class07689.N((Iterable)class04206.M.M(), (SuggestionsBuilder)suggestionsBuilder, (String)String.valueOf('!'));
                class07689.N(class04206.M.U().map(class035522 -> class035522.B().y()), (SuggestionsBuilder)suggestionsBuilder, (String)"!#");
                if (!class067902.I()) {
                    class07689.N((Iterable)class04206.M.M(), (SuggestionsBuilder)suggestionsBuilder);
                    class07689.N(class04206.M.U().map(class035522 -> class035522.B().y()), (SuggestionsBuilder)suggestionsBuilder, (String)String.valueOf('#'));
                }
                return suggestionsBuilder.buildFuture();
            });
            int n = class067902.M().getCursor();
            boolean bl = class067902.i();
            if (class067902.I() && !bl) {
                class067902.M().setCursor(n);
                throw y.createWithContext((ImmutableStringReader)class067902.M(), (Object)"type");
            }
            if (bl) {
                class067902.O();
            }
            if (class067902.R()) {
                class03530 class035302 = class03530.N((class05946)class04227.I, (class01894)class01894.N((StringReader)class067902.M()));
                class067902.N(class070492 -> class070492.method_5864().N(class035302) != bl);
            } else {
                class01894 class018942 = class01894.N((StringReader)class067902.M());
                class07078 var4 = (class07078)class04206.M.y(class018942).orElseThrow(() -> {
                    class067902.M().setCursor(n);
                    return B.createWithContext((ImmutableStringReader)class067902.M(), (Object)class018942.toString());
                });
                if (Objects.equals(class07078.Ly, var4) && !bl) {
                    class067902.N(false);
                }
                class067902.N(class070492 -> Objects.equals(var4, class070492.method_5864()) != bl);
                if (!bl) {
                    class067902.N(var4);
                }
            }
        }, class067902 -> !class067902.g(), (class00392)class00392.L((String)"argument.entity.options.type.description"));
        class06767.y("tag", class067902 -> {
            boolean bl = class067902.i();
            String string = class067902.M().readUnquotedString();
            class067902.N(class070492 -> {
                if ("".equals(string)) {
                    return class070492.method_5752().isEmpty() != bl;
                }
                return class070492.method_5752().contains(string) != bl;
            });
        }, class067902 -> true, (class00392)class00392.L((String)"argument.entity.options.tag.description"));
        class06767.y("nbt", class067902 -> {
            boolean bl = class067902.i();
            class07001 class070012 = class07755.L((StringReader)class067902.M());
            class067902.N(class070492 -> {
                try (class04495 class044952 = new class04495(class070492.method_71370(), Z);){
                    class04770 class047702;
                    class06584 class065842;
                    class08303 class083032 = class08303.N((class04490)class044952, (class01929)class070492.method_56673());
                    class070492.method_5647((class08329)class083032);
                    if (class070492 instanceof class04770 && !(class065842 = (class047702 = (class04770)class070492).method_31548().y()).R()) {
                        class083032.N("SelectedItem", class06584.y, (Object)class065842);
                    }
                    boolean bl2 = class07717.N((class07709)class070012, (class07709)class083032.y(), (boolean)true) != bl;
                    return bl2;
                }
            });
        }, class067902 -> true, (class00392)class00392.L((String)"argument.entity.options.nbt.description"));
        class06767.y("scores", class067902 -> {
            StringReader stringReader = class067902.M();
            HashMap hashMap = Maps.newHashMap();
            stringReader.expect('{');
            stringReader.skipWhitespace();
            while (stringReader.canRead() && stringReader.peek() != '}') {
                stringReader.skipWhitespace();
                String string = stringReader.readUnquotedString();
                stringReader.skipWhitespace();
                stringReader.expect('=');
                stringReader.skipWhitespace();
                class00836 class008362 = class00836.N((StringReader)stringReader);
                hashMap.put(string, class008362);
                stringReader.skipWhitespace();
                if (!stringReader.canRead() || stringReader.peek() != ',') continue;
                stringReader.skip();
            }
            stringReader.expect('}');
            if (!hashMap.isEmpty()) {
                class067902.N(class070492 -> {
                    class06394 class063942 = class070492.method_73183().method_8503().yB();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        class00518 class005182 = class063942.N((String)entry.getKey());
                        if (class005182 == null) {
                            return false;
                        }
                        class01788 class017882 = class063942.y((class01766)class070492, class005182);
                        if (class017882 == null) {
                            return false;
                        }
                        if (((class00836)entry.getValue()).u(class017882.y())) continue;
                        return false;
                    }
                    return true;
                });
            }
            class067902.z(true);
        }, class067902 -> !class067902.J(), (class00392)class00392.L((String)"argument.entity.options.scores.description"));
        class06767.y("advancements", class067902 -> {
            StringReader stringReader = class067902.M();
            HashMap hashMap = Maps.newHashMap();
            stringReader.expect('{');
            stringReader.skipWhitespace();
            while (stringReader.canRead() && stringReader.peek() != '}') {
                stringReader.skipWhitespace();
                class01894 class018942 = class01894.N((StringReader)stringReader);
                stringReader.skipWhitespace();
                stringReader.expect('=');
                stringReader.skipWhitespace();
                if (stringReader.canRead() && stringReader.peek() == '{') {
                    HashMap hashMap2 = Maps.newHashMap();
                    stringReader.skipWhitespace();
                    stringReader.expect('{');
                    stringReader.skipWhitespace();
                    while (stringReader.canRead() && stringReader.peek() != '}') {
                        stringReader.skipWhitespace();
                        String string = stringReader.readUnquotedString();
                        stringReader.skipWhitespace();
                        stringReader.expect('=');
                        stringReader.skipWhitespace();
                        boolean bl = stringReader.readBoolean();
                        hashMap2.put(string, class065622 -> class065622.N() == bl);
                        stringReader.skipWhitespace();
                        if (!stringReader.canRead() || stringReader.peek() != ',') continue;
                        stringReader.skip();
                    }
                    stringReader.skipWhitespace();
                    stringReader.expect('}');
                    stringReader.skipWhitespace();
                    hashMap.put(class018942, class080192 -> {
                        for (Map.Entry entry : hashMap2.entrySet()) {
                            class06562 class065622 = class080192.L((String)entry.getKey());
                            if (class065622 != null && ((Predicate)entry.getValue()).test(class065622)) continue;
                            return false;
                        }
                        return true;
                    });
                } else {
                    boolean bl = stringReader.readBoolean();
                    hashMap.put(class018942, class080192 -> class080192.N() == bl);
                }
                stringReader.skipWhitespace();
                if (!stringReader.canRead() || stringReader.peek() != ',') continue;
                stringReader.skip();
            }
            stringReader.expect('}');
            if (!hashMap.isEmpty()) {
                class067902.N(class070492 -> {
                    if (!(class070492 instanceof class04770)) {
                        return false;
                    }
                    class04770 class047702 = (class04770)class070492;
                    class03704 class037042 = class047702.method_14236();
                    class04478 class044782 = class047702.method_51469().method_8503().Nh();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        class03711 class037112 = class044782.N((class01894)entry.getKey());
                        if (class037112 != null && ((Predicate)entry.getValue()).test(class037042.y(class037112))) continue;
                        return false;
                    }
                    return true;
                });
                class067902.N(false);
            }
            class067902.U(true);
        }, class067902 -> !class067902.o(), (class00392)class00392.L((String)"argument.entity.options.advancements.description"));
        class06767.y("predicate", class067902 -> {
            boolean bl = class067902.i();
            class05946 class059462 = class05946.N((class05946)class04227.yq, (class01894)class01894.N((StringReader)class067902.M()));
            class067902.N(class070492 -> {
                Object object = class070492.method_73183();
                if (!(object instanceof class04782)) {
                    return false;
                }
                class04782 class047822 = (class04782)object;
                object = class047822.method_8503().yd().N().u(class059462).map(class03556::N);
                if (((Optional)object).isEmpty()) {
                    return false;
                }
                class04162 class041622 = new class04160(class047822).N(class06551.N, class070492).N(class06551.B, (Object)class070492.method_73189()).N(class06925.R);
                class05908 class059082 = new class05927(class041622).N(Optional.empty());
                class059082.y(class05908.N((class05957)((class05957)((Optional)object).get())));
                return bl ^ ((class05957)((Optional)object).get()).test((Object)class059082);
            });
        }, class067902 -> true, (class00392)class00392.L((String)"argument.entity.options.predicate.description"));
    }

    public static class06798 N(class06790 class067902, String string, int n) throws CommandSyntaxException {
        class06800 class068002 = z.get(string);
        if (class068002 != null) {
            if (class068002.y().test(class067902)) {
                return class068002.N();
            }
            throw y.createWithContext((ImmutableStringReader)class067902.M(), (Object)string);
        }
        class067902.M().setCursor(n);
        throw N.createWithContext((ImmutableStringReader)class067902.M(), (Object)string);
    }
}

