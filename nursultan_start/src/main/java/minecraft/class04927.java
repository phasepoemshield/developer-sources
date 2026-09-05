/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10477
 *  com.viaversion.viafabricplus.injection.access.base.IEditBox
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01883
 *  minecraft.class01894
 *  minecraft.class03428
 *  minecraft.class03457
 *  minecraft.class04995
 *  minecraft.class05018
 *  minecraft.class05216
 *  minecraft.class06197
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class06541
 *  minecraft.class06601
 *  minecraft.class06608
 *  minecraft.class06613
 *  minecraft.class06626
 *  minecraft.class07536
 *  minecraft.class08394
 *  minecraft.class09033
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10477;
import com.viaversion.viafabricplus.injection.access.base.IEditBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01883;
import minecraft.class01894;
import minecraft.class03428;
import minecraft.class03457;
import minecraft.class04995;
import minecraft.class05018;
import minecraft.class05216;
import minecraft.class06197;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class06541;
import minecraft.class06601;
import minecraft.class06608;
import minecraft.class06613;
import minecraft.class06626;
import minecraft.class07536;
import minecraft.class08394;
import minecraft.class09033;
import org.jspecify.annotations.Nullable;

public class class04927
extends class06478
implements IEditBox {
    private static final class01883 field_45914 = new class01883(class01894.y((String)"widget/text_field"), class01894.y((String)"widget/text_field_highlighted"));
    public static final int field_32194 = -1;
    public static final int field_32195 = 1;
    private static final int field_32197 = 1;
    private static final String field_32199 = "_";
    public static final int field_32196 = -2039584;
    public static final class00405 field_62465 = class00405.N.N(class06541.field_1063);
    public static final class00405 field_62466 = class00405.N.N(new class06541[]{class06541.field_1080, class06541.field_1056});
    private static final int field_45354 = 300;
    private final class01590 field_2105;
    private String field_2092 = "";
    private int field_2108 = 32;
    private boolean field_2095 = true;
    private boolean field_2096 = true;
    private boolean field_2094 = true;
    private boolean field_60437 = false;
    private boolean field_60438 = true;
    private boolean field_63506 = true;
    private int field_2103;
    private int field_2102;
    private int field_2101;
    private int field_2100 = -2039584;
    private int field_2098 = -9408400;
    private @Nullable String field_2106;
    private @Nullable Consumer<String> field_2088;
    private Predicate<String> field_2104 = Objects::nonNull;
    private final List<class10477> field_62008 = new ArrayList<class10477>();
    private @Nullable class00392 field_41100;
    private long field_45352 = class07536.L();
    private int field_60435;
    private int field_60436;
    private boolean viaFabricPlus$forbiddenCharactersUnlocked = false;

    public class04927(class01590 class015902, int n, int n2, int n3, int n4, @Nullable class04927 class049272, class00392 class003922) {
        super(n, n2, n3, n4, class003922);
        this.field_2105 = class015902;
        if (class049272 != null) {
            this.method_1852(class049272.method_1882());
        }
        this.method_71504();
    }

    public class04927(class01590 class015902, int n, int n2, int n3, int n4, class00392 class003922) {
        this(class015902, n, n2, n3, n4, null, class003922);
    }

    public class04927(class01590 class015902, int n, int n2, class00392 class003922) {
        this(class015902, 0, 0, n, n2, class003922);
    }

    public void viaFabricPlus$unlockForbiddenCharacters() {
        this.viaFabricPlus$forbiddenCharactersUnlocked = true;
    }

    public boolean method_25404(class06601 class066012) {
        if (!this.method_37303() || !this.method_25370()) {
            return false;
        }
        switch (class066012.v()) {
            case 263: {
                if (class066012.P()) {
                    this.method_1883(this.method_1853(-1), class066012.W());
                } else {
                    this.method_1855(-1, class066012.W());
                }
                return true;
            }
            case 262: {
                if (class066012.P()) {
                    this.method_1883(this.method_1853(1), class066012.W());
                } else {
                    this.method_1855(1, class066012.W());
                }
                return true;
            }
            case 259: {
                if (this.field_2094) {
                    this.method_16873(-1, class066012.P());
                }
                return true;
            }
            case 261: {
                if (this.field_2094) {
                    this.method_16873(1, class066012.P());
                }
                return true;
            }
            case 268: {
                this.method_1870(class066012.W());
                return true;
            }
            case 269: {
                this.method_1872(class066012.W());
                return true;
            }
        }
        if (class066012.s()) {
            this.method_1872(false);
            this.method_1884(0);
            return true;
        }
        if (class066012.T()) {
            ((class06197)class06202.Nq().L_3).N(this.method_1866());
            return true;
        }
        if (class066012.b()) {
            if (this.method_20316()) {
                this.method_1867(((class06197)class06202.Nq().L_3).N());
            }
            return true;
        }
        if (class066012.j()) {
            ((class06197)class06202.Nq().L_3).N(this.method_1866());
            if (this.method_20316()) {
                this.method_1867("");
            }
            return true;
        }
        return false;
    }

    public boolean method_25400(class06626 class066262) {
        if (!this.method_20315()) {
            return false;
        }
        class06626 class066263 = class066262;
        if (this.redirect$dbc000$viafabricplus$allowForbiddenCharacters(class066263)) {
            if (this.field_2094) {
                this.method_1867(class066262.N());
            }
            return true;
        }
        return false;
    }

    public void method_25365(boolean bl) {
        if (!this.field_2096 && !bl) {
            return;
        }
        super.method_25365(bl);
        if (bl) {
            this.field_45352 = class07536.L();
        }
    }

    public void method_46419(int n) {
        super.method_46419(n);
        this.method_71504();
    }

    public String method_1882() {
        return this.field_2092;
    }

    public void method_46421(int n) {
        super.method_46421(n);
        this.method_71504();
    }

    public void method_1852(String string) {
        if (!this.field_2104.test(string)) {
            return;
        }
        this.field_2092 = string.length() > this.field_2108 ? string.substring(0, this.field_2108) : string;
        this.method_1872(false);
        this.method_1884(this.field_2102);
        this.method_1874(string);
    }

    public void method_1880(int n) {
        this.field_2108 = n;
        if (this.field_2092.length() > n) {
            this.field_2092 = this.field_2092.substring(0, n);
            this.method_1874(this.field_2092);
        }
    }

    private boolean redirect$dbc000$viafabricplus$allowForbiddenCharacters(class06626 class066262) {
        return this.viaFabricPlus$forbiddenCharactersUnlocked || class066262.y();
    }

    private String redirect$dbc000$viafabricplus$allowForbiddenCharacters(String string) {
        if (this.viaFabricPlus$forbiddenCharactersUnlocked) {
            return string;
        }
        return class05018.M((String)string);
    }

    public void method_73210(class10477 class104772) {
        this.field_62008.add(class104772);
    }

    public void method_1890(Predicate<String> predicate) {
        this.field_2104 = predicate;
    }

    public void method_1858(boolean bl) {
        this.field_2095 = bl;
        this.method_71504();
    }

    public void method_1862(boolean bl) {
        this.field_22764 = bl;
    }

    public void method_1872(boolean bl) {
        this.method_1883(this.field_2092.length(), bl);
    }

    private void method_71504() {
        if (this.field_2105 == null) {
            return;
        }
        String string = this.field_2105.N(this.field_2092.substring(this.field_2103), this.method_1859());
        this.field_60435 = this.method_46426() + (this.method_71505() ? (this.method_25368() - this.field_2105.y(string)) / 2 : (this.field_2095 ? 4 : 0));
        this.field_60436 = this.field_2095 ? this.method_46427() + (this.field_22759 - 8) / 2 : this.method_46427();
    }

    public boolean method_20315() {
        return this.method_37303() && this.method_25370() && this.method_20316();
    }

    public void method_71502(boolean bl) {
        this.field_60437 = bl;
        this.method_71504();
    }

    private class01028 method_73211(String string, int n) {
        Iterator<class10477> var3 = this.field_62008.iterator();
        while (var3.hasNext()) {
            class01028 class010282 = var3.next().format(string, n);
            if (class010282 == null) continue;
            return class010282;
        }
        return class01028.a_((String)string, (class00405)class00405.N);
    }

    private boolean method_71505() {
        return this.field_60437;
    }

    public boolean method_1885() {
        return this.field_22764;
    }

    public boolean method_1851() {
        return this.field_2095;
    }

    public void method_1884(int n) {
        this.field_2101 = class04995.N((int)n, (int)0, (int)this.field_2092.length());
        this.method_52719(this.field_2101);
    }

    private boolean method_20316() {
        return this.field_2094;
    }

    private void method_52719(int n) {
        if (this.field_2105 == null) {
            return;
        }
        this.field_2103 = Math.min(this.field_2103, this.field_2092.length());
        int n2 = this.method_1859();
        int n3 = this.field_2105.N(this.field_2092.substring(this.field_2103), n2).length() + this.field_2103;
        if (n == this.field_2103) {
            this.field_2103 -= this.field_2105.N(this.field_2092, n2, true).length();
        }
        if (n > n3) {
            this.field_2103 += n - n3;
        } else if (n <= this.field_2103) {
            this.field_2103 -= this.field_2103 - n;
        }
        this.field_2103 = class04995.N((int)this.field_2103, (int)0, (int)this.field_2092.length());
    }

    public int method_1889(int n) {
        if (n > this.field_2092.length()) {
            return this.method_46426();
        }
        return this.method_46426() + this.field_2105.y(this.field_2092.substring(0, n));
    }

    private int method_1864(int n, int n2, boolean bl) {
        int n3 = n2;
        boolean bl2 = n < 0;
        int n4 = Math.abs(n);
        for (int i = 0; i < n4; ++i) {
            if (bl2) {
                while (bl && n3 > 0 && this.field_2092.charAt(n3 - 1) == ' ') {
                    --n3;
                }
                while (n3 > 0 && this.field_2092.charAt(n3 - 1) != ' ') {
                    --n3;
                }
                continue;
            }
            int n5 = this.field_2092.length();
            if ((n3 = this.field_2092.indexOf(32, n3)) == -1) {
                n3 = n5;
                continue;
            }
            while (bl && n3 < n5 && this.field_2092.charAt(n3) == ' ') {
                ++n3;
            }
        }
        return n3;
    }

    public void method_1867(String string) {
        String string2;
        int n = Math.min(this.field_2102, this.field_2101);
        int n2 = Math.max(this.field_2102, this.field_2101);
        int n3 = this.field_2108 - this.field_2092.length() - (n - n2);
        if (n3 <= 0) {
            return;
        }
        String string3 = string;
        String string4 = this.redirect$dbc000$viafabricplus$allowForbiddenCharacters(string3);
        int n4 = string4.length();
        if (n3 < n4) {
            if (Character.isHighSurrogate(string4.charAt(n3 - 1))) {
                --n3;
            }
            string4 = string4.substring(0, n3);
            n4 = n3;
        }
        if (!this.field_2104.test(string2 = new StringBuilder(this.field_2092).replace(n, n2, string4).toString())) {
            return;
        }
        this.field_2092 = string2;
        this.method_1875(n + n4);
        this.method_1884(this.field_2102);
        this.method_1874(this.field_2092);
    }

    public void method_1875(int n) {
        this.field_2102 = class04995.N((int)n, (int)0, (int)this.field_2092.length());
        this.method_52719(this.field_2102);
    }

    public int method_1853(int n) {
        return this.method_1869(n, this.method_1881());
    }

    public int method_1859() {
        return this.method_1851() ? this.field_22758 - 8 : this.field_22758;
    }

    public void method_1877(int n) {
        if (this.field_2092.isEmpty()) {
            return;
        }
        if (this.field_2101 != this.field_2102) {
            this.method_1867("");
            return;
        }
        this.method_55506(this.method_1853(n));
    }

    private int method_27537(int n) {
        return class07536.N((String)this.field_2092, (int)this.field_2102, (int)n);
    }

    private int method_74215(class06613 class066132) {
        int n = Math.min(class04995.N((double)class066132.n()) - this.field_60435, this.method_1859());
        String string = this.field_2092.substring(this.field_2103);
        return this.field_2103 + this.field_2105.N(string, n).length();
    }

    private void method_16873(int n, boolean bl) {
        if (bl) {
            this.method_1877(n);
        } else {
            this.method_1878(n);
        }
    }

    public void method_1860(int n) {
        this.field_2098 = n;
    }

    private int method_1869(int n, int n2) {
        return this.method_1864(n, n2, true);
    }

    public void method_1855(int n, boolean bl) {
        this.method_1883(this.method_27537(n), bl);
    }

    public void method_75351(boolean bl) {
        this.field_63506 = bl;
    }

    public void method_1870(boolean bl) {
        this.method_1883(0, bl);
    }

    public String method_1866() {
        int n = Math.min(this.field_2102, this.field_2101);
        int n2 = Math.max(this.field_2102, this.field_2101);
        return this.field_2092.substring(n, n2);
    }

    public void method_1883(int n, boolean bl) {
        this.method_1875(n);
        if (!bl) {
            this.method_1884(this.field_2102);
        }
        this.method_1874(this.field_2092);
    }

    private void method_74216(class06613 class066132) {
        int n = this.method_74215(class066132);
        int n2 = this.method_1869(-1, n);
        int n3 = this.method_1869(1, n);
        this.method_1883(n2, false);
        this.method_1883(n3, true);
    }

    public void method_1888(boolean bl) {
        this.field_2094 = bl;
    }

    public void method_1856(boolean bl) {
        this.field_2096 = bl;
    }

    public void method_1887(@Nullable String string) {
        this.field_2106 = string;
    }

    private void method_1874(String string) {
        if (this.field_2088 != null) {
            this.field_2088.accept(string);
        }
        this.method_71504();
    }

    public void method_55506(int n) {
        int n2;
        if (this.field_2092.isEmpty()) {
            return;
        }
        if (this.field_2101 != this.field_2102) {
            this.method_1867("");
            return;
        }
        int n3 = Math.min(n, this.field_2102);
        if (n3 == (n2 = Math.max(n, this.field_2102))) {
            return;
        }
        String string = new StringBuilder(this.field_2092).delete(n3, n2).toString();
        if (!this.field_2104.test(string)) {
            return;
        }
        this.field_2092 = string;
        this.method_1883(n3, false);
    }

    public void method_1878(int n) {
        this.method_55506(this.method_27537(n));
    }

    public int method_1881() {
        return this.field_2102;
    }

    public void method_71503(boolean bl) {
        this.field_60438 = bl;
    }

    public final int method_1861() {
        return this.field_2108;
    }

    public void method_1863(Consumer<String> consumer) {
        this.field_2088 = consumer;
    }

    public void method_1868(int n) {
        this.field_2100 = n;
    }

    public void method_25348(class06613 class066132, boolean bl) {
        if (bl) {
            this.method_74216(class066132);
        } else {
            this.method_1883(this.method_74215(class066132), class066132.W());
        }
    }

    public void method_47399(class03428 class034282) {
        class034282.N(class03457.field_33788, (class00392)this.method_25360());
    }

    protected void method_25349(class06613 class066132, double d, double d2) {
        this.method_1883(this.method_74215(class066132), true);
    }

    protected class05216 method_25360() {
        class00392 class003922 = this.method_25369();
        return class00392.N((String)"gui.narrate.editBox", (Object[])new Object[]{class003922, this.field_2092});
    }

    public void method_25354(class09033 class090332) {
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        if (!this.method_1885()) {
            return;
        }
        if (this.method_1851()) {
            class01894 class018942 = field_45914.N(this.method_37303(), this.method_25370());
            class010542.N(class08394.Na, class018942, this.method_46426(), this.method_46427(), this.method_25368(), this.method_25364());
        }
        int n3 = this.field_2094 ? this.field_2100 : this.field_2098;
        int n4 = this.field_2102 - this.field_2103;
        String string = this.field_2105.N(this.field_2092.substring(this.field_2103), this.method_1859());
        boolean bl = n4 >= 0 && n4 <= string.length();
        boolean bl2 = this.method_25370() && (class07536.L() - this.field_45352) / 300L % 2L == 0L && bl;
        int n5 = this.field_60435;
        int n6 = class04995.N((int)(this.field_2101 - this.field_2103), (int)0, (int)string.length());
        if (!string.isEmpty()) {
            String string2 = bl ? string.substring(0, n4) : string;
            class01028 class010282 = this.method_73211(string2, this.field_2103);
            class010542.N(this.field_2105, class010282, n5, this.field_60436, n3, this.field_60438);
            n5 += this.field_2105.N(class010282) + 1;
        }
        boolean bl3 = this.field_2102 < this.field_2092.length() || this.field_2092.length() >= this.method_1861();
        int n7 = n5;
        if (!bl) {
            n7 = n4 > 0 ? this.field_60435 + this.field_22758 : this.field_60435;
        } else if (bl3) {
            --n7;
            --n5;
        }
        if (!string.isEmpty() && bl && n4 < string.length()) {
            class010542.N(this.field_2105, this.method_73211(string.substring(n4), this.field_2102), n5, this.field_60436, n3, this.field_60438);
        }
        if (this.field_41100 != null && string.isEmpty() && !this.method_25370()) {
            class010542.y(this.field_2105, this.field_41100, n5, this.field_60436, n3);
        }
        if (!bl3 && this.field_2106 != null) {
            class010542.N(this.field_2105, this.field_2106, n7 - 1, this.field_60436, -8355712, this.field_60438);
        }
        if (n6 != n4) {
            int n8 = this.field_60435 + this.field_2105.y(string.substring(0, n6));
            int n9 = Math.min(n7, this.method_46426() + this.field_22758);
            int n10 = Math.min(n8 - 1, this.method_46426() + this.field_22758);
            Objects.requireNonNull(this.field_2105);
            class010542.N(n9, this.field_60436 - 1, n10, this.field_60436 + 1 + 9, this.field_63506);
        }
        if (bl2) {
            if (bl3) {
                Objects.requireNonNull(this.field_2105);
                class010542.N(n7, this.field_60436 - 1, n7 + 1, this.field_60436 + 1 + 9, n3);
            } else {
                class010542.N(this.field_2105, field_32199, n7, this.field_60436, n3, this.field_60438);
            }
        }
        if (this.method_49606()) {
            class010542.N(this.method_20316() ? class06608.y : class06608.B);
        }
    }

    public void method_47404(class00392 class003922) {
        boolean bl = class003922.method_10866().equals((Object)class00405.N);
        this.field_41100 = bl ? class003922.L().L(field_62465) : class003922;
    }
}

