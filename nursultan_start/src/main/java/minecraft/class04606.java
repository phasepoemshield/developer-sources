/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10459
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02088
 *  minecraft.class03334
 *  minecraft.class05001
 *  minecraft.class05075
 *  minecraft.class05096
 *  minecraft.class05153
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05936
 *  minecraft.class06069
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06601
 *  minecraft.class08188
 *  minecraft.class08394
 *  minecraft.class08627
 *  minecraft.class08679
 *  minecraft.class08918
 *  minecraft.class09002
 *  org.apache.commons.lang3.StringUtils
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10459;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02088;
import minecraft.class03334;
import minecraft.class05001;
import minecraft.class05075;
import minecraft.class05096;
import minecraft.class05153;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05936;
import minecraft.class06069;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06601;
import minecraft.class08188;
import minecraft.class08394;
import minecraft.class08627;
import minecraft.class08679;
import minecraft.class08918;
import minecraft.class09002;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class class04606
extends class05096 {
    private static final class01894 N = class01894.y((String)"textures/misc/credits_vignette.png");
    private static final Logger y = LogUtils.getLogger();
    private static final class00392 L = class00392.y((String)"============").N(class06541.field_1068);
    private static final String u = "           ";
    private static final String i = String.valueOf(class06541.field_1068) + String.valueOf(class06541.field_1051) + String.valueOf(class06541.field_1060) + String.valueOf(class06541.field_1075);
    private static final float R = 5.0f;
    private static final float M = 15.0f;
    private static final class01894 B = class01894.y((String)"texts/end.txt");
    private static final class01894 Z = class01894.y((String)"texts/credits.json");
    private static final class01894 z = class01894.y((String)"texts/postcredits.txt");
    private final boolean U;
    private final Runnable E;
    private float W;
    private List<class01028> m;
    private List<class00392> P;
    private IntSet s;
    private int T;
    private boolean b;
    private final IntSet j = new IntOpenHashSet();
    private float v;
    private final float n;
    private int t;
    private final class02088 G = new class02088(false);

    private void L() {
        this.m.add(class01028.N);
        this.P.add(class05220.N);
    }

    public class04606(boolean bl, Runnable runnable) {
        super(class05153.N);
        this.U = bl;
        this.E = runnable;
        this.n = !bl ? 0.75f : 0.5f;
        this.t = 1;
        this.v = this.n;
    }

    private void y(Reader reader) {
        Iterator var3 = class05001.y((Reader)reader).iterator();
        while (var3.hasNext()) {
            JsonObject jsonObject = ((JsonElement)var3.next()).getAsJsonObject();
            String string = jsonObject.get("section").getAsString();
            this.N(L, true, false);
            this.N((class00392)class00392.y((String)string).N(class06541.field_1054), true, true);
            this.N(L, true, false);
            this.L();
            this.L();
            Iterator var8 = jsonObject.getAsJsonArray("disciplines").iterator();
            while (var8.hasNext()) {
                JsonObject jsonObject2 = ((JsonElement)var8.next()).getAsJsonObject();
                String string2 = jsonObject2.get("discipline").getAsString();
                if (StringUtils.isNotEmpty((CharSequence)string2)) {
                    this.N((class00392)class00392.y((String)string2).N(class06541.field_1054), true, true);
                    this.L();
                    this.L();
                }
                Iterator var13 = jsonObject2.getAsJsonArray("titles").iterator();
                while (var13.hasNext()) {
                    JsonObject jsonObject3 = ((JsonElement)var13.next()).getAsJsonObject();
                    String string3 = jsonObject3.get("title").getAsString();
                    JsonArray jsonArray = jsonObject3.getAsJsonArray("names");
                    this.N((class00392)class00392.y((String)string3).N(class06541.field_1080), false, true);
                    Iterator var18 = jsonArray.iterator();
                    while (var18.hasNext()) {
                        String string4 = ((JsonElement)var18.next()).getAsString();
                        this.N((class00392)class00392.y((String)u).i(string4).N(class06541.field_1068), false, true);
                    }
                    this.L();
                    this.L();
                }
            }
        }
    }

    private void y() {
        this.E.run();
    }

    private void N(Reader reader) throws IOException {
        int n;
        Object object;
        BufferedReader bufferedReader = new BufferedReader(reader);
        class06069 class060692 = class06069.y((long)8124371L);
        while ((object = bufferedReader.readLine()) != null) {
            object = ((String)object).replaceAll("PLAYERNAME", this.field_22787.Ny().L());
            while ((n = ((String)object).indexOf(i)) != -1) {
                String string = ((String)object).substring(0, n);
                String string2 = ((String)object).substring(n + i.length());
                object = string + String.valueOf(class06541.field_1068) + String.valueOf(class06541.field_1051) + "XXXXXXXX".substring(0, class060692.y(4) + 3) + string2;
            }
            this.N((String)object);
            this.L();
        }
        for (n = 0; n < 8; ++n) {
            this.L();
        }
    }

    private float N() {
        if (this.b) {
            return this.n * (5.0f + (float)this.j.size() * 15.0f) * (float)this.t;
        }
        return this.n * (float)this.t;
    }

    private void N(String string) {
        class05216 class052162 = class00392.y((String)string);
        this.m.addAll(((class01590)this.field_22787.i_3).L((class05936)class052162, 256));
        this.P.add((class00392)class052162);
    }

    private void N(class01054 class010542) {
        class010542.N(class08394.NS, N, 0, 0, 0.0f, 0.0f, this.field_22789, this.field_22790, this.field_22789, this.field_22790);
    }

    private void N(class00392 class003922, boolean bl, boolean bl2) {
        if (bl) {
            this.s.add(this.m.size());
        }
        this.m.add(class003922.method_30937());
        if (bl2) {
            this.P.add(class003922);
        }
    }

    private void N(class01894 class018942, class10459 class104592) {
        try (BufferedReader bufferedReader = this.field_22787.Nm().i(class018942);){
            class104592.read((Reader)bufferedReader);
        }
        catch (Exception exception) {
            y.error("Couldn't load credits from file {}", (Object)class018942, (Object)exception);
        }
    }

    public class05075 method_50024() {
        return class09002.L;
    }

    public void method_25426() {
        if (this.m != null) {
            return;
        }
        this.m = Lists.newArrayList();
        this.P = Lists.newArrayList();
        this.s = new IntOpenHashSet();
        if (this.U) {
            this.N(B, this::N);
        }
        this.N(Z, this::y);
        if (this.U) {
            this.N(z, this::N);
        }
        this.T = this.m.size() * 12;
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.B()) {
            this.t = -1;
        } else if (class066012.v() == 341 || class066012.v() == 345) {
            this.j.add(class066012.v());
        } else if (class066012.v() == 32) {
            this.b = true;
        }
        this.v = this.N();
        return super.method_25404(class066012);
    }

    public void method_25393() {
        this.field_22787.A().N();
        this.field_22787.Nr().N(false);
        float f = this.T + this.field_22790 + this.field_22790 + 24;
        if (this.W > f) {
            this.y();
        }
    }

    public void method_25432() {
        this.field_22787.A().y(class09002.L);
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
        if (this.U) {
            class08627 class086272 = class06202.Nq().NO();
            class08918 class089182 = class086272.y(class03334.N);
            class08918 class089183 = class086272.y(class03334.y);
            class08679 class086792 = class08679.N((GpuTextureView)class089182.method_71659(), (class08188)class089182.method_75484(), (GpuTextureView)class089183.method_71659(), (class08188)class089183.method_75484());
            class010542.N(class08394.Nb, class086792, 0, 0, this.field_22789, this.field_22790);
        } else {
            super.method_25420(class010542, n, n2, f);
        }
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.N(class010542);
        this.W = Math.max(0.0f, this.W + f * this.v);
        int n3 = this.field_22789 / 2 - 128;
        int n4 = this.field_22790 + 50;
        float f2 = -this.W;
        class010542.i().pushMatrix();
        class010542.i().translate(0.0f, f2);
        class010542.L();
        this.G.N(class010542, this.field_22789, 1.0f, n4);
        int n5 = n4 + 100;
        for (int i = 0; i < this.m.size(); ++i) {
            float f3;
            if (i == this.m.size() - 1 && (f3 = (float)n5 + f2 - (float)(this.field_22790 / 2 - 6)) < 0.0f) {
                class010542.i().translate(0.0f, -f3);
            }
            if ((float)n5 + f2 + 12.0f + 8.0f > 0.0f && (float)n5 + f2 < (float)this.field_22790) {
                class01028 class010282 = this.m.get(i);
                if (this.s.contains(i)) {
                    class010542.N(this.field_22793, class010282, n3 + 128, n5, -1);
                } else {
                    class010542.y(this.field_22793, class010282, n3, n5, -1);
                }
            }
            n5 += 12;
        }
        class010542.i().popMatrix();
    }

    public void method_25419() {
        this.y();
    }

    public boolean method_25421() {
        return !this.U;
    }

    protected void method_57736(class01054 class010542, int n, int n2, int n3, int n4) {
        float f = this.W * 0.5f;
        class05096.method_57737((class01054)class010542, (class01894)class05096.field_49511, (int)0, (int)0, (float)0.0f, (float)f, (int)n3, (int)n4);
    }

    public boolean method_73217() {
        return true;
    }

    public boolean method_16803(class06601 class066012) {
        if (class066012.B()) {
            this.t = 1;
        }
        if (class066012.v() == 32) {
            this.b = false;
        } else if (class066012.v() == 341 || class066012.v() == 345) {
            this.j.remove(class066012.v());
        }
        this.v = this.N();
        return super.method_16803(class066012);
    }

    public class00392 method_25435() {
        return class05220.N((class00392[])((class00392[])this.P.toArray(class00392[]::new)));
    }
}

