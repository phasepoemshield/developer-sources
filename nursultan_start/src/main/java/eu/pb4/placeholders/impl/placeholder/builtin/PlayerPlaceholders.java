/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  eu.pb4.placeholders.api.PlaceholderHandler
 *  eu.pb4.placeholders.api.PlaceholderResult
 *  eu.pb4.placeholders.api.Placeholders
 *  eu.pb4.placeholders.api.arguments.SimpleArguments
 *  minecraft.class00042
 *  minecraft.class00392
 *  minecraft.class00502
 *  minecraft.class00518
 *  minecraft.class00737
 *  minecraft.class00926
 *  minecraft.class01235
 *  minecraft.class01766
 *  minecraft.class01788
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class02689
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04782
 *  minecraft.class04907
 *  minecraft.class04922
 *  minecraft.class05946
 *  minecraft.class06394
 *  minecraft.class06541
 *  minecraft.class06584
 *  minecraft.class06609
 *  minecraft.class07049
 *  minecraft.class07085
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07212
 *  minecraft.class07376
 *  minecraft.class08044
 *  org.apache.commons.lang3.time.DurationFormatUtils
 */
package eu.pb4.placeholders.impl.placeholder.builtin;

import com.mojang.authlib.GameProfile;
import eu.pb4.placeholders.api.PlaceholderHandler;
import eu.pb4.placeholders.api.PlaceholderResult;
import eu.pb4.placeholders.api.Placeholders;
import eu.pb4.placeholders.api.arguments.SimpleArguments;
import eu.pb4.placeholders.impl.GeneralUtils;
import java.util.Locale;
import minecraft.class00042;
import minecraft.class00392;
import minecraft.class00502;
import minecraft.class00518;
import minecraft.class00737;
import minecraft.class00926;
import minecraft.class01235;
import minecraft.class01766;
import minecraft.class01788;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class02689;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04782;
import minecraft.class04907;
import minecraft.class04922;
import minecraft.class05946;
import minecraft.class06394;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class06609;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07212;
import minecraft.class07376;
import minecraft.class08044;
import org.apache.commons.lang3.time.DurationFormatUtils;

public class PlayerPlaceholders {
    public static void register() {
        Placeholders.register((class01894)class01894.N((String)"player", (String)"name"), (placeholderContext, string) -> {
            if (placeholderContext.hasEntity()) {
                return PlaceholderResult.value((class00392)placeholderContext.entity().method_5477());
            }
            if (placeholderContext.hasGameProfile()) {
                return PlaceholderResult.value((class00392)class00392.N((String)placeholderContext.gameProfile().name()));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"name_visual"), (placeholderContext, string) -> {
            if (placeholderContext.hasEntity()) {
                return PlaceholderResult.value((class00392)GeneralUtils.removeHoverAndClick(placeholderContext.entity().method_5477()));
            }
            if (placeholderContext.hasGameProfile()) {
                return PlaceholderResult.value((class00392)class00392.N((String)placeholderContext.gameProfile().name()));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"name_unformatted"), (placeholderContext, string) -> {
            if (placeholderContext.hasEntity()) {
                return PlaceholderResult.value((String)placeholderContext.entity().method_5477().getString());
            }
            if (placeholderContext.hasGameProfile()) {
                return PlaceholderResult.value((class00392)class00392.N((String)placeholderContext.gameProfile().name()));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"ping"), (placeholderContext, string) -> {
            if (placeholderContext.hasPlayer()) {
                return PlaceholderResult.value((String)String.valueOf(placeholderContext.player().field_13987.method_52405()));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"ping_colored"), (placeholderContext, string) -> {
            if (placeholderContext.hasPlayer()) {
                int n = placeholderContext.player().field_13987.method_52405();
                return PlaceholderResult.value((class00392)class00392.y((String)String.valueOf(n)).N(n < 100 ? class06541.field_1060 : (n < 200 ? class06541.field_1065 : class06541.field_1061)));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"displayname"), (placeholderContext, string) -> {
            if (placeholderContext.hasEntity()) {
                return PlaceholderResult.value((class00392)placeholderContext.entity().method_5476());
            }
            if (placeholderContext.hasGameProfile()) {
                return PlaceholderResult.value((class00392)class00392.N((String)placeholderContext.gameProfile().name()));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"display_name"), (PlaceholderHandler)((PlaceholderHandler)Placeholders.getPlaceholders().get((Object)class01894.N((String)"player", (String)"displayname"))));
        Placeholders.register((class01894)class01894.N((String)"player", (String)"displayname_visual"), (placeholderContext, string) -> {
            if (placeholderContext.hasEntity()) {
                return PlaceholderResult.value((class00392)GeneralUtils.removeHoverAndClick(placeholderContext.entity().method_5476()));
            }
            if (placeholderContext.hasGameProfile()) {
                return PlaceholderResult.value((class00392)class00392.N((String)placeholderContext.gameProfile().name()));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"display_name_visual"), (PlaceholderHandler)((PlaceholderHandler)Placeholders.getPlaceholders().get((Object)class01894.N((String)"player", (String)"displayname_visual"))));
        Placeholders.register((class01894)class01894.N((String)"player", (String)"displayname_unformatted"), (placeholderContext, string) -> {
            if (placeholderContext.hasEntity()) {
                return PlaceholderResult.value((class00392)class00392.y((String)placeholderContext.entity().method_5476().getString()));
            }
            if (placeholderContext.hasGameProfile()) {
                return PlaceholderResult.value((class00392)class00392.N((String)placeholderContext.gameProfile().name()));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"display_name_unformatted"), (PlaceholderHandler)((PlaceholderHandler)Placeholders.getPlaceholders().get((Object)class01894.N((String)"player", (String)"displayname_unformatted"))));
        Placeholders.register((class01894)class01894.N((String)"player", (String)"inventory_slot"), (placeholderContext, string) -> {
            if (placeholderContext.hasPlayer() && string != null) {
                try {
                    int n = Integer.parseInt(string);
                    class08044 class080442 = placeholderContext.player().method_31548();
                    if (n >= 0 && n < class080442.method_5439()) {
                        class06584 class065842 = class080442.method_5438(n);
                        return PlaceholderResult.value((class00392)GeneralUtils.getItemText(class065842, true));
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
                return PlaceholderResult.invalid((String)"Invalid argument");
            }
            return PlaceholderResult.invalid((String)"No player or invalid argument!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"inventory_slot_no_rarity"), (placeholderContext, string) -> {
            if (placeholderContext.hasPlayer() && string != null) {
                try {
                    int n = Integer.parseInt(string);
                    class08044 class080442 = placeholderContext.player().method_31548();
                    if (n >= 0 && n < class080442.method_5439()) {
                        class06584 class065842 = class080442.method_5438(n);
                        return PlaceholderResult.value((class00392)GeneralUtils.getItemText(class065842, false));
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
                return PlaceholderResult.invalid((String)"Invalid argument");
            }
            return PlaceholderResult.invalid((String)"No player or invalid argument!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"equipment_slot"), (placeholderContext, string) -> {
            if (placeholderContext.hasPlayer() && string != null) {
                try {
                    class07085 class070852 = class07085.N((String)string);
                    class06584 class065842 = placeholderContext.player().method_6118(class070852);
                    return PlaceholderResult.value((class00392)GeneralUtils.getItemText(class065842, true));
                }
                catch (Exception exception) {
                    return PlaceholderResult.invalid((String)"Invalid argument");
                }
            }
            return PlaceholderResult.invalid((String)"No player or invalid argument!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"equipment_slot_no_rarity"), (placeholderContext, string) -> {
            if (placeholderContext.hasPlayer() && string != null) {
                try {
                    class07085 class070852 = class07085.N((String)string);
                    class06584 class065842 = placeholderContext.player().method_6118(class070852);
                    return PlaceholderResult.value((class00392)GeneralUtils.getItemText(class065842, false));
                }
                catch (Exception exception) {
                    return PlaceholderResult.invalid((String)"Invalid argument");
                }
            }
            return PlaceholderResult.invalid((String)"No player or invalid argument!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"playtime"), (placeholderContext, string) -> {
            if (placeholderContext.hasPlayer()) {
                int n = placeholderContext.player().method_14248().N(class01235.Z.y((Object)class01235.U));
                return PlaceholderResult.value((String)(string != null ? DurationFormatUtils.formatDuration((long)((long)n * 50L), (String)string, (boolean)true) : GeneralUtils.durationToString((long)n / 20L)));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"statistic"), (placeholderContext, string) -> {
            if (placeholderContext.hasPlayer() && string != null) {
                try {
                    String[] stringArray = string.split(" ");
                    if (stringArray.length == 1) {
                        class01894 class018942 = class01894.L((String)stringArray[0]);
                        if (class018942 != null) {
                            class04907 class049072 = class01235.Z.y((Object)((class01894)class04206.E.N(class018942)));
                            int n = placeholderContext.player().method_14248().N(class049072);
                            return PlaceholderResult.value((String)class049072.N(n));
                        }
                    } else if (stringArray.length >= 2) {
                        Object object;
                        class04922 class049222;
                        class01894 class018943 = class01894.L((String)stringArray[0]);
                        class01894 class018944 = class01894.L((String)stringArray[1]);
                        if (class018943 != null && (class049222 = (class04922)class04206.G.N(class018943)) != null && (object = class049222.y().N(class018944)) != null) {
                            class04907 class049073 = class049222.y(object);
                            int n = placeholderContext.player().method_14248().N(class049073);
                            return PlaceholderResult.value((String)class049073.N(n));
                        }
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
                return PlaceholderResult.invalid((String)"Invalid statistic!");
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"statistic_raw"), (placeholderContext, string) -> {
            if (placeholderContext.hasPlayer() && string != null) {
                try {
                    String[] stringArray = string.split(" ");
                    if (stringArray.length == 1) {
                        class01894 class018942 = class01894.L((String)stringArray[0]);
                        if (class018942 != null) {
                            class04907 class049072 = class01235.Z.y((Object)((class01894)class04206.E.N(class018942)));
                            int n = placeholderContext.player().method_14248().N(class049072);
                            return PlaceholderResult.value((String)String.valueOf(n));
                        }
                    } else if (stringArray.length >= 2) {
                        Object object;
                        class04922 class049222;
                        class01894 class018943 = class01894.L((String)stringArray[0]);
                        class01894 class018944 = class01894.L((String)stringArray[1]);
                        if (class018943 != null && (class049222 = (class04922)class04206.G.N(class018943)) != null && (object = class049222.y().N(class018944)) != null) {
                            class04907 class049073 = class049222.y(object);
                            int n = placeholderContext.player().method_14248().N(class049073);
                            return PlaceholderResult.value((String)String.valueOf(n));
                        }
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
                return PlaceholderResult.invalid((String)"Invalid statistic!");
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"objective"), (placeholderContext, string) -> {
            if (placeholderContext.hasPlayer() && string != null) {
                try {
                    class06394 class063942 = placeholderContext.server().yB();
                    class00518 class005182 = class063942.N(string);
                    if (class005182 == null) {
                        return PlaceholderResult.invalid((String)"Invalid objective!");
                    }
                    class01788 class017882 = class063942.y((class01766)placeholderContext.player(), class005182);
                    return PlaceholderResult.value((String)String.valueOf(class017882.y()));
                }
                catch (Exception exception) {
                    return PlaceholderResult.invalid((String)"Invalid objective!");
                }
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"facing"), (placeholderContext, string) -> {
            if (placeholderContext.hasEntity()) {
                return PlaceholderResult.value((String)placeholderContext.entity().method_58149().method_15434());
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"facing_axis"), (placeholderContext, string) -> {
            if (placeholderContext.hasEntity()) {
                class07211 class072112 = placeholderContext.entity().method_58149();
                return PlaceholderResult.value((String)((class072112.i() == class07212.field_11060 ? "-" : "+") + class072112.z().method_15434().toUpperCase(Locale.ROOT)));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"horizontal_facing"), (placeholderContext, string) -> {
            if (placeholderContext.hasEntity()) {
                return PlaceholderResult.value((String)placeholderContext.entity().method_5735().method_15434());
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"horizontal_facing_axis"), (placeholderContext, string) -> {
            if (placeholderContext.hasEntity()) {
                class07211 class072112 = placeholderContext.entity().method_5735();
                return PlaceholderResult.value((String)((class072112.i() == class07212.field_11060 ? "-" : "+") + class072112.z().method_15434().toUpperCase(Locale.ROOT)));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"pos_x"), (placeholderContext, string) -> {
            if (placeholderContext.hasEntity()) {
                double d = placeholderContext.entity().method_23317();
                Object object = "%.2f";
                if (string != null) {
                    try {
                        int n = Integer.parseInt(string);
                        object = "%." + n + "f";
                    }
                    catch (Exception exception) {
                        object = "%.2f";
                    }
                }
                return PlaceholderResult.value((String)String.format((String)object, d));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"pos_y"), (placeholderContext, string) -> {
            if (placeholderContext.hasEntity()) {
                double d = placeholderContext.entity().method_23318();
                Object object = "%.2f";
                if (string != null) {
                    try {
                        int n = Integer.parseInt(string);
                        object = "%." + n + "f";
                    }
                    catch (Exception exception) {
                        object = "%.2f";
                    }
                }
                return PlaceholderResult.value((String)String.format((String)object, d));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"pos_z"), (placeholderContext, string) -> {
            if (placeholderContext.hasEntity()) {
                double d = placeholderContext.entity().method_23321();
                Object object = "%.2f";
                if (string != null) {
                    try {
                        int n = Integer.parseInt(string);
                        object = "%." + n + "f";
                    }
                    catch (Exception exception) {
                        object = "%.2f";
                    }
                }
                return PlaceholderResult.value((String)String.format((String)object, d));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"pos_x_scaled"), (placeholderContext, string) -> {
            if (placeholderContext.hasEntity()) {
                class01894 class018942;
                class04782 class047822 = null;
                if (string != null && (class018942 = class01894.L((String)string)) != null) {
                    class047822 = placeholderContext.server().N(class05946.N((class05946)class04227.yg, (class01894)class018942));
                }
                if (class047822 == null) {
                    class047822 = placeholderContext.server().NY();
                }
                double d = placeholderContext.entity().method_23317() * class07376.N((class07376)placeholderContext.entity().method_73183().method_8597(), (class07376)class047822.method_8597());
                Object object = "%.2f";
                if (string != null) {
                    try {
                        int n = Integer.parseInt(string);
                        object = "%." + n + "f";
                    }
                    catch (Exception exception) {
                        object = "%.2f";
                    }
                }
                return PlaceholderResult.value((String)String.format((String)object, d));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"pos_y_scaled"), (placeholderContext, string) -> {
            if (placeholderContext.hasEntity()) {
                class01894 class018942;
                class04782 class047822 = null;
                if (string != null && (class018942 = class01894.L((String)string)) != null) {
                    class047822 = placeholderContext.server().N(class05946.N((class05946)class04227.yg, (class01894)class018942));
                }
                if (class047822 == null) {
                    class047822 = placeholderContext.server().NY();
                }
                double d = placeholderContext.entity().method_23318() * class07376.N((class07376)placeholderContext.entity().method_73183().method_8597(), (class07376)class047822.method_8597());
                Object object = "%.2f";
                if (string != null) {
                    try {
                        int n = Integer.parseInt(string);
                        object = "%." + n + "f";
                    }
                    catch (Exception exception) {
                        object = "%.2f";
                    }
                }
                return PlaceholderResult.value((String)String.format((String)object, d));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"pos_z_scaled"), (placeholderContext, string) -> {
            if (placeholderContext.hasEntity()) {
                class01894 class018942;
                class04782 class047822 = null;
                if (string != null && (class018942 = class01894.L((String)string)) != null) {
                    class047822 = placeholderContext.server().N(class05946.N((class05946)class04227.yg, (class01894)class018942));
                }
                if (class047822 == null) {
                    class047822 = placeholderContext.server().NY();
                }
                double d = placeholderContext.entity().method_23321() * class07376.N((class07376)placeholderContext.entity().method_73183().method_8597(), (class07376)class047822.method_8597());
                Object object = "%.2f";
                if (string != null) {
                    try {
                        int n = Integer.parseInt(string);
                        object = "%." + n + "f";
                    }
                    catch (Exception exception) {
                        object = "%.2f";
                    }
                }
                return PlaceholderResult.value((String)String.format((String)object, d));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"uuid"), (placeholderContext, string) -> {
            if (placeholderContext.hasPlayer()) {
                return PlaceholderResult.value((String)placeholderContext.player().method_5845());
            }
            if (placeholderContext.hasGameProfile()) {
                return PlaceholderResult.value((class00392)class00392.N((String)String.valueOf(placeholderContext.gameProfile().id())));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"health"), (placeholderContext, string) -> {
            if (placeholderContext.hasPlayer()) {
                return PlaceholderResult.value((String)String.format("%.0f", Float.valueOf(placeholderContext.player().method_6032())));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"max_health"), (placeholderContext, string) -> {
            if (placeholderContext.hasPlayer()) {
                return PlaceholderResult.value((String)String.format("%.0f", Float.valueOf(placeholderContext.player().method_6063())));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"hunger"), (placeholderContext, string) -> {
            if (placeholderContext.hasPlayer()) {
                return PlaceholderResult.value((String)String.valueOf(placeholderContext.player().method_7344().N()));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"saturation"), (placeholderContext, string) -> {
            if (placeholderContext.hasPlayer()) {
                return PlaceholderResult.value((String)String.format("%.0f", Float.valueOf(placeholderContext.player().method_7344().u())));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"locator_color"), (placeholderContext, string) -> {
            class07049 class070492;
            if (placeholderContext.hasEntity() && (class070492 = placeholderContext.entity()) instanceof class00042) {
                class00042 class000422 = (class00042)class070492;
                int n = class000422.method_70675().i.orElseGet(() -> class02566.L((int)class02566.R((int)255, (int)placeholderContext.entity().method_5667().hashCode()), (float)0.9f)) & 0xFFFFFF;
                return PlaceholderResult.value((String)String.format(Locale.ROOT, "#%06X", n));
            }
            return string != null ? PlaceholderResult.value((class00392)class00392.N((String)string)) : PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"team_color"), (placeholderContext, string) -> {
            if (placeholderContext.hasEntity()) {
                class00502 class005022 = placeholderContext.entity().method_5781();
                return PlaceholderResult.value((class00392)(class005022 == null ? (string != null ? class00392.N((String)string) : class00392.N((String)"white")) : class00392.N((String)class005022.P().method_15434())));
            }
            return string != null ? PlaceholderResult.value((class00392)class00392.N((String)string)) : PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"team_name"), (placeholderContext, string) -> {
            if (placeholderContext.hasPlayer()) {
                class00502 class005022 = placeholderContext.player().method_5781();
                return PlaceholderResult.value((class00392)(class005022 == null ? class00392.i() : class00392.N((String)class005022.L())));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"team_displayname"), (placeholderContext, string) -> {
            if (placeholderContext.hasPlayer()) {
                class00502 class005022 = placeholderContext.player().method_5781();
                return PlaceholderResult.value((class00392)(class005022 == null ? class00392.i() : class005022.u()));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"team_displayname_formatted"), (placeholderContext, string) -> {
            if (placeholderContext.hasPlayer()) {
                class00502 class005022 = placeholderContext.player().method_5781();
                return PlaceholderResult.value((class00392)(class005022 == null ? class00392.i() : class005022.i()));
            }
            return PlaceholderResult.invalid((String)"No player!");
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"biome"), (placeholderContext, string) -> {
            class07209 class072092;
            Object object = placeholderContext.entity() != null ? placeholderContext.entity().method_73183() : placeholderContext.source().R();
            class03556 class035562 = object.i(class072092 = placeholderContext.entity() != null ? placeholderContext.entity().method_24515() : class07209.method_49638((class00737)placeholderContext.source().i()));
            if (class035562.i().isEmpty()) {
                return PlaceholderResult.invalid((String)"No biome key??");
            }
            return PlaceholderResult.value((class00392)class00392.N((String)((class05946)class035562.i().get()).N().B("biome"), (Object[])new Object[]{((class05946)class035562.i().get()).N().toString()}));
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"biome_raw"), (placeholderContext, string) -> {
            class07209 class072092;
            Object object = placeholderContext.entity() != null ? placeholderContext.entity().method_73183() : placeholderContext.source().R();
            class03556 class035562 = object.i(class072092 = placeholderContext.entity() != null ? placeholderContext.entity().method_24515() : class07209.method_49638((class00737)placeholderContext.source().i()));
            if (class035562.i().isEmpty()) {
                return PlaceholderResult.invalid((String)"No biome key??");
            }
            return PlaceholderResult.value((String)((class05946)class035562.i().get()).N().toString());
        });
        Placeholders.register((class01894)class01894.N((String)"player", (String)"head"), (placeholderContext, string) -> {
            if (!placeholderContext.hasGameProfile()) {
                return PlaceholderResult.invalid((String)"No Game Profile!");
            }
            return PlaceholderResult.value((class00392)class00392.N((class00926)new class06609(class02689.N((GameProfile)placeholderContext.gameProfile()), SimpleArguments.bool((String)string, (boolean)true))));
        });
    }
}

