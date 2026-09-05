/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09446
 *  com.google.common.collect.Lists
 *  minecraft.class01224
 *  minecraft.class01227
 *  minecraft.class01230
 *  minecraft.class01236
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09446;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import minecraft.class01197;
import minecraft.class01200;
import minecraft.class01207;
import minecraft.class01213;
import minecraft.class01216;
import minecraft.class01224;
import minecraft.class01227;
import minecraft.class01230;
import minecraft.class01236;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import org.jspecify.annotations.Nullable;

public class class01211 {
    private final class01224 N;
    private final class06069 y;
    private int L;
    private int u;

    private void L(List<class01230> list, class01200 class012002) {
        class012002.y = class012002.y.method_10079(class012002.N.N(class07211.field_11035), -1);
        list.add(new class01230(this.N, "wall_corner", class012002.y, class012002.N));
        class012002.y = class012002.y.method_10079(class012002.N.N(class07211.field_11035), -7);
        class012002.y = class012002.y.method_10079(class012002.N.N(class07211.field_11039), -6);
        class012002.N = class012002.N.N(class06993.field_11463);
    }

    public class01211(class01224 class012242, class06069 class060692) {
        this.N = class012242;
        this.y = class060692;
    }

    private void u(List<class01230> list, class01200 class012002) {
        class012002.y = class012002.y.method_10079(class012002.N.N(class07211.field_11035), 6);
        class012002.y = class012002.y.method_10079(class012002.N.N(class07211.field_11034), 8);
        class012002.N = class012002.N.N(class06993.field_11465);
    }

    private void y(List<class01230> list, class01200 class012002) {
        list.add(new class01230(this.N, class012002.L, class012002.y.method_10079(class012002.N.N(class07211.field_11034), 7), class012002.N));
        class012002.y = class012002.y.method_10079(class012002.N.N(class07211.field_11035), 8);
    }

    private void N(List<class01230> list, class07209 class072092, class06993 class069932, class07211 class072112, class01216 class012162) {
        class06993 class069933 = class06993.field_11467;
        String string = class012162.N(this.y);
        if (class072112 != class07211.field_11034) {
            if (class072112 == class07211.field_11043) {
                class069933 = class069933.N(class06993.field_11465);
            } else if (class072112 == class07211.field_11039) {
                class069933 = class069933.N(class06993.field_11464);
            } else if (class072112 == class07211.field_11035) {
                class069933 = class069933.N(class06993.field_11463);
            } else {
                string = class012162.y(this.y);
            }
        }
        class07209 class072093 = class01207.N(new class07209(1, 0, 0), class07111.field_11302, class069933, 7, 7);
        class069933 = class069933.N(class069932);
        class072093 = class072093.method_10070(class069932);
        class07209 class072094 = class072092.method_10069(class072093.method_10263(), 0, class072093.method_10260());
        list.add(new class01230(this.N, string, class072094, class069933));
    }

    private void N(List<class01230> list, class07209 class072092, class06993 class069932, class07211 class072112, class07211 class072113, class01216 class012162, boolean bl) {
        if (class072113 == class07211.field_11034 && class072112 == class07211.field_11035) {
            class07209 class072093 = class072092.method_10079(class069932.N(class07211.field_11034), 1);
            list.add(new class01230(this.N, class012162.N(this.y, bl), class072093, class069932));
        } else if (class072113 == class07211.field_11034 && class072112 == class07211.field_11043) {
            class07209 class072094 = class072092.method_10079(class069932.N(class07211.field_11034), 1);
            class072094 = class072094.method_10079(class069932.N(class07211.field_11035), 6);
            list.add(new class01230(this.N, class012162.N(this.y, bl), class072094, class069932, class07111.field_11300));
        } else if (class072113 == class07211.field_11039 && class072112 == class07211.field_11043) {
            class07209 class072095 = class072092.method_10079(class069932.N(class07211.field_11034), 7);
            class072095 = class072095.method_10079(class069932.N(class07211.field_11035), 6);
            list.add(new class01230(this.N, class012162.N(this.y, bl), class072095, class069932.N(class06993.field_11464)));
        } else if (class072113 == class07211.field_11039 && class072112 == class07211.field_11035) {
            class07209 class072096 = class072092.method_10079(class069932.N(class07211.field_11034), 7);
            list.add(new class01230(this.N, class012162.N(this.y, bl), class072096, class069932, class07111.field_11301));
        } else if (class072113 == class07211.field_11035 && class072112 == class07211.field_11034) {
            class07209 class072097 = class072092.method_10079(class069932.N(class07211.field_11034), 1);
            list.add(new class01230(this.N, class012162.N(this.y, bl), class072097, class069932.N(class06993.field_11463), class07111.field_11300));
        } else if (class072113 == class07211.field_11035 && class072112 == class07211.field_11039) {
            class07209 class072098 = class072092.method_10079(class069932.N(class07211.field_11034), 7);
            list.add(new class01230(this.N, class012162.N(this.y, bl), class072098, class069932.N(class06993.field_11463)));
        } else if (class072113 == class07211.field_11043 && class072112 == class07211.field_11039) {
            class07209 class072099 = class072092.method_10079(class069932.N(class07211.field_11034), 7);
            class072099 = class072099.method_10079(class069932.N(class07211.field_11035), 6);
            list.add(new class01230(this.N, class012162.N(this.y, bl), class072099, class069932.N(class06993.field_11463), class07111.field_11301));
        } else if (class072113 == class07211.field_11043 && class072112 == class07211.field_11034) {
            class07209 class0720910 = class072092.method_10079(class069932.N(class07211.field_11034), 1);
            class0720910 = class0720910.method_10079(class069932.N(class07211.field_11035), 6);
            list.add(new class01230(this.N, class012162.N(this.y, bl), class0720910, class069932.N(class06993.field_11465)));
        } else if (class072113 == class07211.field_11035 && class072112 == class07211.field_11043) {
            class07209 class0720911 = class072092.method_10079(class069932.N(class07211.field_11034), 1);
            class0720911 = class0720911.method_10079(class069932.N(class07211.field_11043), 8);
            list.add(new class01230(this.N, class012162.y(this.y, bl), class0720911, class069932));
        } else if (class072113 == class07211.field_11043 && class072112 == class07211.field_11035) {
            class07209 class0720912 = class072092.method_10079(class069932.N(class07211.field_11034), 7);
            class0720912 = class0720912.method_10079(class069932.N(class07211.field_11035), 14);
            list.add(new class01230(this.N, class012162.y(this.y, bl), class0720912, class069932.N(class06993.field_11464)));
        } else if (class072113 == class07211.field_11039 && class072112 == class07211.field_11034) {
            class07209 class0720913 = class072092.method_10079(class069932.N(class07211.field_11034), 15);
            list.add(new class01230(this.N, class012162.y(this.y, bl), class0720913, class069932.N(class06993.field_11463)));
        } else if (class072113 == class07211.field_11034 && class072112 == class07211.field_11039) {
            class07209 class0720914 = class072092.method_10079(class069932.N(class07211.field_11039), 7);
            class0720914 = class0720914.method_10079(class069932.N(class07211.field_11035), 6);
            list.add(new class01230(this.N, class012162.y(this.y, bl), class0720914, class069932.N(class06993.field_11465)));
        } else if (class072113 == class07211.field_11036 && class072112 == class07211.field_11034) {
            class07209 class0720915 = class072092.method_10079(class069932.N(class07211.field_11034), 15);
            list.add(new class01230(this.N, class012162.L(this.y), class0720915, class069932.N(class06993.field_11463)));
        } else if (class072113 == class07211.field_11036 && class072112 == class07211.field_11035) {
            class07209 class0720916 = class072092.method_10079(class069932.N(class07211.field_11034), 1);
            class0720916 = class0720916.method_10079(class069932.N(class07211.field_11043), 0);
            list.add(new class01230(this.N, class012162.L(this.y), class0720916, class069932));
        }
    }

    private void N(List<class01230> list, class07209 class072092, class06993 class069932, class01216 class012162) {
        class07209 class072093 = class072092.method_10079(class069932.N(class07211.field_11034), 1);
        list.add(new class01230(this.N, class012162.i(this.y), class072093, class069932, class07111.field_11302));
    }

    private void N(List<class01230> list, class07209 class072092, class06993 class069932, class07211 class072112, class07211 class072113, class01216 class012162) {
        int n = 0;
        int n2 = 0;
        class06993 class069933 = class069932;
        class07111 class071112 = class07111.field_11302;
        if (class072113 == class07211.field_11034 && class072112 == class07211.field_11035) {
            n = -7;
        } else if (class072113 == class07211.field_11034 && class072112 == class07211.field_11043) {
            n = -7;
            n2 = 6;
            class071112 = class07111.field_11300;
        } else if (class072113 == class07211.field_11043 && class072112 == class07211.field_11034) {
            n = 1;
            n2 = 14;
            class069933 = class069932.N(class06993.field_11465);
        } else if (class072113 == class07211.field_11043 && class072112 == class07211.field_11039) {
            n = 7;
            n2 = 14;
            class069933 = class069932.N(class06993.field_11465);
            class071112 = class07111.field_11300;
        } else if (class072113 == class07211.field_11035 && class072112 == class07211.field_11039) {
            n = 7;
            n2 = -8;
            class069933 = class069932.N(class06993.field_11463);
        } else if (class072113 == class07211.field_11035 && class072112 == class07211.field_11034) {
            n = 1;
            n2 = -8;
            class069933 = class069932.N(class06993.field_11463);
            class071112 = class07111.field_11300;
        } else if (class072113 == class07211.field_11039 && class072112 == class07211.field_11043) {
            n = 15;
            n2 = 6;
            class069933 = class069932.N(class06993.field_11464);
        } else if (class072113 == class07211.field_11039 && class072112 == class07211.field_11035) {
            n = 15;
            class071112 = class07111.field_11301;
        }
        class07209 class072093 = class072092.method_10079(class069932.N(class07211.field_11034), n);
        class072093 = class072093.method_10079(class069932.N(class07211.field_11035), n2);
        list.add(new class01230(this.N, class012162.u(this.y), class072093, class069933, class071112));
    }

    private void N(List<class01230> list, class07209 class072092, class06993 class069932, class01227 class012272, @Nullable class01227 class012273) {
        class07209 class072093;
        boolean bl;
        class07209 class072094;
        int n;
        int n2;
        for (n2 = 0; n2 < class012272.y; ++n2) {
            for (n = 0; n < class012272.N; ++n) {
                class072094 = class072092;
                class072094 = class072094.method_10079(class069932.N(class07211.field_11035), 8 + (n2 - this.u) * 8);
                class072094 = class072094.method_10079(class069932.N(class07211.field_11034), (n - this.L) * 8);
                boolean bl2 = bl = class012273 != null && class01236.N((class01227)class012273, (int)n, (int)n2);
                if (!class01236.N((class01227)class012272, (int)n, (int)n2) || bl) continue;
                list.add(new class01230(this.N, "roof", class072094.method_10086(3), class069932));
                if (!class01236.N((class01227)class012272, (int)(n + 1), (int)n2)) {
                    class072093 = class072094.method_10079(class069932.N(class07211.field_11034), 6);
                    list.add(new class01230(this.N, "roof_front", class072093, class069932));
                }
                if (!class01236.N((class01227)class012272, (int)(n - 1), (int)n2)) {
                    class072093 = class072094.method_10079(class069932.N(class07211.field_11034), 0);
                    class072093 = class072093.method_10079(class069932.N(class07211.field_11035), 7);
                    list.add(new class01230(this.N, "roof_front", class072093, class069932.N(class06993.field_11464)));
                }
                if (!class01236.N((class01227)class012272, (int)n, (int)(n2 - 1))) {
                    class072093 = class072094.method_10079(class069932.N(class07211.field_11039), 1);
                    list.add(new class01230(this.N, "roof_front", class072093, class069932.N(class06993.field_11465)));
                }
                if (class01236.N((class01227)class012272, (int)n, (int)(n2 + 1))) continue;
                class072093 = class072094.method_10079(class069932.N(class07211.field_11034), 6);
                class072093 = class072093.method_10079(class069932.N(class07211.field_11035), 6);
                list.add(new class01230(this.N, "roof_front", class072093, class069932.N(class06993.field_11463)));
            }
        }
        if (class012273 != null) {
            for (n2 = 0; n2 < class012272.y; ++n2) {
                for (n = 0; n < class012272.N; ++n) {
                    class072094 = class072092;
                    class072094 = class072094.method_10079(class069932.N(class07211.field_11035), 8 + (n2 - this.u) * 8);
                    class072094 = class072094.method_10079(class069932.N(class07211.field_11034), (n - this.L) * 8);
                    bl = class01236.N((class01227)class012273, (int)n, (int)n2);
                    if (!class01236.N((class01227)class012272, (int)n, (int)n2) || !bl) continue;
                    if (!class01236.N((class01227)class012272, (int)(n + 1), (int)n2)) {
                        class072093 = class072094.method_10079(class069932.N(class07211.field_11034), 7);
                        list.add(new class01230(this.N, "small_wall", class072093, class069932));
                    }
                    if (!class01236.N((class01227)class012272, (int)(n - 1), (int)n2)) {
                        class072093 = class072094.method_10079(class069932.N(class07211.field_11039), 1);
                        class072093 = class072093.method_10079(class069932.N(class07211.field_11035), 6);
                        list.add(new class01230(this.N, "small_wall", class072093, class069932.N(class06993.field_11464)));
                    }
                    if (!class01236.N((class01227)class012272, (int)n, (int)(n2 - 1))) {
                        class072093 = class072094.method_10079(class069932.N(class07211.field_11039), 0);
                        class072093 = class072093.method_10079(class069932.N(class07211.field_11043), 1);
                        list.add(new class01230(this.N, "small_wall", class072093, class069932.N(class06993.field_11465)));
                    }
                    if (!class01236.N((class01227)class012272, (int)n, (int)(n2 + 1))) {
                        class072093 = class072094.method_10079(class069932.N(class07211.field_11034), 6);
                        class072093 = class072093.method_10079(class069932.N(class07211.field_11035), 7);
                        list.add(new class01230(this.N, "small_wall", class072093, class069932.N(class06993.field_11463)));
                    }
                    if (!class01236.N((class01227)class012272, (int)(n + 1), (int)n2)) {
                        if (!class01236.N((class01227)class012272, (int)n, (int)(n2 - 1))) {
                            class072093 = class072094.method_10079(class069932.N(class07211.field_11034), 7);
                            class072093 = class072093.method_10079(class069932.N(class07211.field_11043), 2);
                            list.add(new class01230(this.N, "small_wall_corner", class072093, class069932));
                        }
                        if (!class01236.N((class01227)class012272, (int)n, (int)(n2 + 1))) {
                            class072093 = class072094.method_10079(class069932.N(class07211.field_11034), 8);
                            class072093 = class072093.method_10079(class069932.N(class07211.field_11035), 7);
                            list.add(new class01230(this.N, "small_wall_corner", class072093, class069932.N(class06993.field_11463)));
                        }
                    }
                    if (class01236.N((class01227)class012272, (int)(n - 1), (int)n2)) continue;
                    if (!class01236.N((class01227)class012272, (int)n, (int)(n2 - 1))) {
                        class072093 = class072094.method_10079(class069932.N(class07211.field_11039), 2);
                        class072093 = class072093.method_10079(class069932.N(class07211.field_11043), 1);
                        list.add(new class01230(this.N, "small_wall_corner", class072093, class069932.N(class06993.field_11465)));
                    }
                    if (class01236.N((class01227)class012272, (int)n, (int)(n2 + 1))) continue;
                    class072093 = class072094.method_10079(class069932.N(class07211.field_11039), 1);
                    class072093 = class072093.method_10079(class069932.N(class07211.field_11035), 8);
                    list.add(new class01230(this.N, "small_wall_corner", class072093, class069932.N(class06993.field_11464)));
                }
            }
        }
        for (n2 = 0; n2 < class012272.y; ++n2) {
            for (n = 0; n < class012272.N; ++n) {
                class07209 class072095;
                class072094 = class072092;
                class072094 = class072094.method_10079(class069932.N(class07211.field_11035), 8 + (n2 - this.u) * 8);
                class072094 = class072094.method_10079(class069932.N(class07211.field_11034), (n - this.L) * 8);
                boolean bl3 = bl = class012273 != null && class01236.N((class01227)class012273, (int)n, (int)n2);
                if (!class01236.N((class01227)class012272, (int)n, (int)n2) || bl) continue;
                if (!class01236.N((class01227)class012272, (int)(n + 1), (int)n2)) {
                    class072093 = class072094.method_10079(class069932.N(class07211.field_11034), 6);
                    if (!class01236.N((class01227)class012272, (int)n, (int)(n2 + 1))) {
                        class072095 = class072093.method_10079(class069932.N(class07211.field_11035), 6);
                        list.add(new class01230(this.N, "roof_corner", class072095, class069932));
                    } else if (class01236.N((class01227)class012272, (int)(n + 1), (int)(n2 + 1))) {
                        class072095 = class072093.method_10079(class069932.N(class07211.field_11035), 5);
                        list.add(new class01230(this.N, "roof_inner_corner", class072095, class069932));
                    }
                    if (!class01236.N((class01227)class012272, (int)n, (int)(n2 - 1))) {
                        list.add(new class01230(this.N, "roof_corner", class072093, class069932.N(class06993.field_11465)));
                    } else if (class01236.N((class01227)class012272, (int)(n + 1), (int)(n2 - 1))) {
                        class072095 = class072094.method_10079(class069932.N(class07211.field_11034), 9);
                        class072095 = class072095.method_10079(class069932.N(class07211.field_11043), 2);
                        list.add(new class01230(this.N, "roof_inner_corner", class072095, class069932.N(class06993.field_11463)));
                    }
                }
                if (class01236.N((class01227)class012272, (int)(n - 1), (int)n2)) continue;
                class072093 = class072094.method_10079(class069932.N(class07211.field_11034), 0);
                class072093 = class072093.method_10079(class069932.N(class07211.field_11035), 0);
                if (!class01236.N((class01227)class012272, (int)n, (int)(n2 + 1))) {
                    class072095 = class072093.method_10079(class069932.N(class07211.field_11035), 6);
                    list.add(new class01230(this.N, "roof_corner", class072095, class069932.N(class06993.field_11463)));
                } else if (class01236.N((class01227)class012272, (int)(n - 1), (int)(n2 + 1))) {
                    class072095 = class072093.method_10079(class069932.N(class07211.field_11035), 8);
                    class072095 = class072095.method_10079(class069932.N(class07211.field_11039), 3);
                    list.add(new class01230(this.N, "roof_inner_corner", class072095, class069932.N(class06993.field_11465)));
                }
                if (!class01236.N((class01227)class012272, (int)n, (int)(n2 - 1))) {
                    list.add(new class01230(this.N, "roof_corner", class072093, class069932.N(class06993.field_11464)));
                    continue;
                }
                if (!class01236.N((class01227)class012272, (int)(n - 1), (int)(n2 - 1))) continue;
                class072095 = class072093.method_10079(class069932.N(class07211.field_11035), 1);
                list.add(new class01230(this.N, "roof_inner_corner", class072095, class069932.N(class06993.field_11464)));
            }
        }
    }

    private void N(List<class01230> list, class01200 class012002) {
        class07211 class072112 = class012002.N.N(class07211.field_11039);
        list.add(new class01230(this.N, "entrance", class012002.y.method_10079(class072112, 9), class012002.N));
        class012002.y = class012002.y.method_10079(class012002.N.N(class07211.field_11035), 16);
    }

    public void N(class07209 class072092, class06993 class069932, List<class01230> list, class01236 class012362) {
        int n;
        class01200 class012002 = new class01200();
        class012002.y = class072092;
        class012002.N = class069932;
        class012002.L = "wall_flat";
        class01200 class012003 = new class01200();
        this.N(list, class012002);
        class012003.y = class012002.y.method_10086(8);
        class012003.N = class012002.N;
        class012003.L = "wall_window";
        if (!list.isEmpty()) {
            // empty if block
        }
        class01227 class012272 = class012362.N;
        class01227 class012273 = class012362.y;
        this.L = class012362.u + 1;
        this.u = class012362.i + 1;
        int n2 = class012362.u + 1;
        int n3 = class012362.i;
        this.N(list, class012002, class012272, class07211.field_11035, this.L, this.u, n2, n3);
        this.N(list, class012003, class012272, class07211.field_11035, this.L, this.u, n2, n3);
        class01200 class012004 = new class01200();
        class012004.y = class012002.y.method_10086(19);
        class012004.N = class012002.N;
        class012004.L = "wall_window";
        boolean bl = false;
        for (int i = 0; i < class012273.y && !bl; ++i) {
            for (n = class012273.N - 1; n >= 0 && !bl; --n) {
                if (!class01236.N((class01227)class012273, (int)n, (int)i)) continue;
                class012004.y = class012004.y.method_10079(class069932.N(class07211.field_11035), 8 + (i - this.u) * 8);
                class012004.y = class012004.y.method_10079(class069932.N(class07211.field_11034), (n - this.L) * 8);
                this.y(list, class012004);
                this.N(list, class012004, class012273, class07211.field_11035, n, i, n, i);
                bl = true;
            }
        }
        this.N(list, class072092.method_10086(16), class069932, class012272, class012273);
        this.N(list, class072092.method_10086(27), class069932, class012273, null);
        if (!list.isEmpty()) {
            // empty if block
        }
        class01216[] class01216Array = new class01216[]{new class01197(), new class01213(), new class09446()};
        for (n = 0; n < 3; ++n) {
            ArrayList arrayList;
            class07209 class072093 = class072092.method_10086(8 * n + (n == 2 ? 3 : 0));
            class01227 class012274 = class012362.L[n];
            class01227 class012275 = n == 2 ? class012273 : class012272;
            String string = n == 0 ? "carpet_south_1" : "carpet_south_2";
            String string2 = n == 0 ? "carpet_west_1" : "carpet_west_2";
            for (int i = 0; i < class012275.y; ++i) {
                for (int j = 0; j < class012275.N; ++j) {
                    if (class012275.N(j, i) != 1) continue;
                    arrayList = class072093.method_10079(class069932.N(class07211.field_11035), 8 + (i - this.u) * 8);
                    arrayList = arrayList.method_10079(class069932.N(class07211.field_11034), (j - this.L) * 8);
                    list.add(new class01230(this.N, "corridor_floor", (class07209)arrayList, class069932));
                    if (class012275.N(j, i - 1) == 1 || (class012274.N(j, i - 1) & 0x800000) == 0x800000) {
                        list.add(new class01230(this.N, "carpet_north", arrayList.method_10079(class069932.N(class07211.field_11034), 1).method_10084(), class069932));
                    }
                    if (class012275.N(j + 1, i) == 1 || (class012274.N(j + 1, i) & 0x800000) == 0x800000) {
                        list.add(new class01230(this.N, "carpet_east", arrayList.method_10079(class069932.N(class07211.field_11035), 1).method_10079(class069932.N(class07211.field_11034), 5).method_10084(), class069932));
                    }
                    if (class012275.N(j, i + 1) == 1 || (class012274.N(j, i + 1) & 0x800000) == 0x800000) {
                        list.add(new class01230(this.N, string, arrayList.method_10079(class069932.N(class07211.field_11035), 5).method_10079(class069932.N(class07211.field_11039), 1), class069932));
                    }
                    if (class012275.N(j - 1, i) != 1 && (class012274.N(j - 1, i) & 0x800000) != 0x800000) continue;
                    list.add(new class01230(this.N, string2, arrayList.method_10079(class069932.N(class07211.field_11039), 1).method_10079(class069932.N(class07211.field_11043), 1), class069932));
                }
            }
            String string3 = n == 0 ? "indoors_wall_1" : "indoors_wall_2";
            String string4 = n == 0 ? "indoors_door_1" : "indoors_door_2";
            arrayList = Lists.newArrayList();
            for (int i = 0; i < class012275.y; ++i) {
                for (int j = 0; j < class012275.N; ++j) {
                    class07209 class072094;
                    class07211 class0721122;
                    boolean bl2;
                    boolean bl3 = bl2 = n == 2 && class012275.N(j, i) == 3;
                    if (class012275.N(j, i) != 2 && !bl2) continue;
                    int n4 = class012274.N(j, i);
                    int n5 = n4 & 0xF0000;
                    int n6 = n4 & 0xFFFF;
                    bl2 = bl2 && (n4 & 0x800000) == 0x800000;
                    arrayList.clear();
                    if ((n4 & 0x200000) == 0x200000) {
                        for (class07211 class0721122 : class07221.field_11062) {
                            if (class012275.N(j + class0721122.P(), i + class0721122.T()) != 1) continue;
                            arrayList.add(class0721122);
                        }
                    }
                    class07211 class072113 = null;
                    if (!arrayList.isEmpty()) {
                        class072113 = (class07211)arrayList.get(this.y.y(arrayList.size()));
                    } else if ((n4 & 0x100000) == 0x100000) {
                        class072113 = class07211.field_11036;
                    }
                    class0721122 = class072093.method_10079(class069932.N(class07211.field_11035), 8 + (i - this.u) * 8);
                    class0721122 = class0721122.method_10079(class069932.N(class07211.field_11034), -1 + (j - this.L) * 8);
                    if (class01236.N((class01227)class012275, (int)(j - 1), (int)i) && !class012362.N(class012275, j - 1, i, n, n6)) {
                        list.add(new class01230(this.N, class072113 == class07211.field_11039 ? string4 : string3, (class07209)class0721122, class069932));
                    }
                    if (class012275.N(j + 1, i) == 1 && !bl2) {
                        class072094 = class0721122.method_10079(class069932.N(class07211.field_11034), 8);
                        list.add(new class01230(this.N, class072113 == class07211.field_11034 ? string4 : string3, class072094, class069932));
                    }
                    if (class01236.N((class01227)class012275, (int)j, (int)(i + 1)) && !class012362.N(class012275, j, i + 1, n, n6)) {
                        class072094 = class0721122.method_10079(class069932.N(class07211.field_11035), 7);
                        class072094 = class072094.method_10079(class069932.N(class07211.field_11034), 7);
                        list.add(new class01230(this.N, class072113 == class07211.field_11035 ? string4 : string3, class072094, class069932.N(class06993.field_11463)));
                    }
                    if (class012275.N(j, i - 1) == 1 && !bl2) {
                        class072094 = class0721122.method_10079(class069932.N(class07211.field_11043), 1);
                        class072094 = class072094.method_10079(class069932.N(class07211.field_11034), 7);
                        list.add(new class01230(this.N, class072113 == class07211.field_11043 ? string4 : string3, class072094, class069932.N(class06993.field_11463)));
                    }
                    if (n5 == 65536) {
                        this.N(list, (class07209)class0721122, class069932, class072113, class01216Array[n]);
                        continue;
                    }
                    if (n5 == 131072 && class072113 != null) {
                        class072094 = class012362.y(class012275, j, i, n, n6);
                        boolean bl4 = (n4 & 0x400000) == 0x400000;
                        this.N(list, (class07209)class0721122, class069932, (class07211)class072094, class072113, class01216Array[n], bl4);
                        continue;
                    }
                    if (n5 == 262144 && class072113 != null && class072113 != class07211.field_11036) {
                        class072094 = class072113.R();
                        if (!class012362.N(class012275, j + class072094.P(), i + class072094.T(), n, n6)) {
                            class072094 = class072094.b();
                        }
                        this.N(list, (class07209)class0721122, class069932, (class07211)class072094, class072113, class01216Array[n]);
                        continue;
                    }
                    if (n5 != 262144 || class072113 != class07211.field_11036) continue;
                    this.N(list, (class07209)class0721122, class069932, class01216Array[n]);
                }
            }
        }
    }

    private void N(List<class01230> list, class01200 class012002, class01227 class012272, class07211 class072112, int n, int n2, int n3, int n4) {
        int n5 = n;
        int n6 = n2;
        class07211 class072113 = class072112;
        do {
            if (!class01236.N((class01227)class012272, (int)(n5 + class072112.P()), (int)(n6 + class072112.T()))) {
                this.L(list, class012002);
                class072112 = class072112.R();
                if (n5 == n3 && n6 == n4 && class072113 == class072112) continue;
                this.y(list, class012002);
                continue;
            }
            if (class01236.N((class01227)class012272, (int)(n5 + class072112.P()), (int)(n6 + class072112.T())) && class01236.N((class01227)class012272, (int)(n5 + class072112.P() + class072112.M().P()), (int)(n6 + class072112.T() + class072112.M().T()))) {
                this.u(list, class012002);
                n5 += class072112.P();
                n6 += class072112.T();
                class072112 = class072112.M();
                continue;
            }
            if ((n5 += class072112.P()) == n3 && (n6 += class072112.T()) == n4 && class072113 == class072112) continue;
            this.y(list, class012002);
        } while (n5 != n3 || n6 != n4 || class072113 != class072112);
    }
}

