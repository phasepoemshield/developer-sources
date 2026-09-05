/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class02701
 *  minecraft.class02708
 *  minecraft.class02717
 *  minecraft.class02903
 *  minecraft.class02950
 *  minecraft.class03556
 *  minecraft.class03762
 *  minecraft.class04227
 *  minecraft.class06514
 *  minecraft.class06520
 *  minecraft.class06522
 *  minecraft.class06559
 *  minecraft.class06563
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06920
 *  minecraft.class07299
 */
package com.viaversion.viafabricplus.features.recipe;

import com.viaversion.viafabricplus.features.recipe.BannerPattern_1_13_2;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class01929;
import minecraft.class02484;
import minecraft.class02701;
import minecraft.class02708;
import minecraft.class02717;
import minecraft.class02903;
import minecraft.class02950;
import minecraft.class03556;
import minecraft.class03762;
import minecraft.class04227;
import minecraft.class06514;
import minecraft.class06520;
import minecraft.class06522;
import minecraft.class06559;
import minecraft.class06563;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06920;
import minecraft.class07299;

public final class AddBannerPatternRecipe
extends class06520 {
    public static final class06514<AddBannerPatternRecipe> SERIALIZER = new class06522(AddBannerPatternRecipe::new);

    public AddBannerPatternRecipe(class03762 class037622) {
        super(class037622);
    }

    public boolean matches(class02903 class029032, class07299 class072992) {
        boolean bl = false;
        for (int i = 0; i < class029032.N(); ++i) {
            class06584 class065842 = class029032.N(i);
            if (!(class065842.B() instanceof class06920)) continue;
            if (bl) {
                return false;
            }
            if (((class02708)class065842.a_(class02484.Nv, (Object)class02708.L)).y().size() >= 6) {
                return false;
            }
            bl = true;
        }
        return bl && AddBannerPatternRecipe.getBannerPattern(class029032) != null;
    }

    public class06514<AddBannerPatternRecipe> method_8119() {
        return SERIALIZER;
    }

    public /* synthetic */ boolean method_8115(class02950 class029502, class07299 class072992) {
        return this.matches((class02903)class029502, class072992);
    }

    public /* synthetic */ class06584 method_8116(class02950 class029502, class01929 class019292) {
        return this.assemble((class02903)class029502, class019292);
    }

    public class06584 assemble(class02903 class029032, class01929 class019292) {
        BannerPattern_1_13_2 bannerPattern_1_13_2;
        class06584 class065842;
        class06584 class065843 = class06584.E;
        for (int i = 0; i < class029032.N(); ++i) {
            class065842 = class029032.N(i);
            if (class065842.R() || !(class065842.B() instanceof class06920)) continue;
            class065843 = class065842.t();
            class065843.i(1);
            break;
        }
        if ((bannerPattern_1_13_2 = AddBannerPatternRecipe.getBannerPattern(class029032)) != null) {
            class065842 = class019292.y(class04227.NF).y(bannerPattern_1_13_2.getKey());
            class06563 class065632 = ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2) ? class06563.field_7963 : class06563.field_7952;
            for (int i = 0; i < class029032.N(); ++i) {
                class06581 class065812 = class029032.N(i).B();
                if (!(class065812 instanceof class06559)) continue;
                class06559 class065592 = (class06559)class065812;
                class065632 = class065592.N();
            }
            class02701 class027012 = new class02701();
            if (class065843.L(class02484.Nv)) {
                class027012.N((class02708)class065843.method_58694(class02484.Nv));
            }
            class027012.N(new class02717((class03556)class065842, class065632));
            class065843.N(class02484.Nv, (Object)class027012.N());
        }
        return class065843;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static BannerPattern_1_13_2 getBannerPattern(class02903 class029032) {
        BannerPattern_1_13_2[] bannerPattern_1_13_2Array = BannerPattern_1_13_2.values();
        int n = bannerPattern_1_13_2Array.length;
        int n2 = 0;
        while (true) {
            block12: {
                boolean bl;
                BannerPattern_1_13_2 bannerPattern_1_13_2;
                block17: {
                    int n3;
                    class06563 class065632;
                    int n4;
                    block16: {
                        boolean bl2;
                        block14: {
                            block15: {
                                block13: {
                                    if (n2 >= n) {
                                        return null;
                                    }
                                    bannerPattern_1_13_2 = bannerPattern_1_13_2Array[n2];
                                    if (!bannerPattern_1_13_2.isCraftable()) break block12;
                                    bl = true;
                                    if (!bannerPattern_1_13_2.hasBaseStack()) break block13;
                                    bl2 = false;
                                    n4 = 0;
                                    break block14;
                                }
                                if (class029032.N() != bannerPattern_1_13_2.getRecipePattern().length * bannerPattern_1_13_2.getRecipePattern()[0].length()) break block15;
                                class065632 = null;
                                break block16;
                            }
                            bl = false;
                            break block17;
                        }
                        for (n3 = 0; n3 < class029032.N(); ++n3) {
                            class06584 class065842 = class029032.N(n3);
                            if (class065842.R() || class065842.B() instanceof class06920) continue;
                            if (class065842.B() instanceof class06559) {
                                if (n4 != 0) {
                                    bl = false;
                                    break;
                                }
                                n4 = 1;
                                continue;
                            }
                            if (bl2 || !class06584.y((class06584)class065842, (class06584)bannerPattern_1_13_2.getBaseStack())) {
                                bl = false;
                                break;
                            }
                            bl2 = true;
                        }
                        if (bl2 && (n4 != 0 || !ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_10))) break block17;
                        bl = false;
                        break block17;
                    }
                    for (n4 = 0; n4 < class029032.N(); ++n4) {
                        n3 = n4 / 3;
                        int n5 = n4 % 3;
                        class06584 class065843 = class029032.N(n4);
                        class06581 class065812 = class065843.B();
                        if (!class065843.R() && !(class065812 instanceof class06920)) {
                            if (!(class065812 instanceof class06559)) {
                                bl = false;
                                break;
                            }
                            class06563 class065633 = ((class06559)class065812).N();
                            if (class065632 != null && class065633 != class065632) {
                                bl = false;
                                break;
                            }
                            if (bannerPattern_1_13_2.getRecipePattern()[n3].charAt(n5) == ' ') {
                                bl = false;
                                break;
                            }
                            class065632 = class065633;
                            continue;
                        }
                        if (bannerPattern_1_13_2.getRecipePattern()[n3].charAt(n5) == ' ') continue;
                        bl = false;
                        break;
                    }
                }
                if (bl) {
                    return bannerPattern_1_13_2;
                }
            }
            ++n2;
        }
    }
}

