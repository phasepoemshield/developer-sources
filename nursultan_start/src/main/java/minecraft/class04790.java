/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00999
 *  minecraft.class01028
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01583
 *  minecraft.class01686
 *  minecraft.class02022
 *  minecraft.class03662
 *  minecraft.class05436
 *  minecraft.class06271
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class07311
 *  minecraft.class07937
 *  minecraft.class07942
 *  minecraft.class08141
 *  minecraft.class08388
 *  minecraft.class08453
 *  minecraft.class08800
 *  minecraft.class08804
 *  minecraft.class08887
 *  minecraft.class08915
 *  net.caffeinemc.mods.sodium.client.render.frapi.render.OrderedSubmitNodeCollectorExtension
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.MeshView
 *  net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter
 *  org.joml.Quaternionf
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap;
import java.util.List;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00999;
import minecraft.class01028;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01583;
import minecraft.class01686;
import minecraft.class02022;
import minecraft.class03662;
import minecraft.class05436;
import minecraft.class06271;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class07311;
import minecraft.class07937;
import minecraft.class07942;
import minecraft.class08141;
import minecraft.class08388;
import minecraft.class08453;
import minecraft.class08800;
import minecraft.class08804;
import minecraft.class08887;
import minecraft.class08915;
import net.caffeinemc.mods.sodium.client.render.frapi.render.OrderedSubmitNodeCollectorExtension;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.MeshView;
import net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter;
import org.joml.Quaternionf;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class class04790
implements class01237,
OrderedSubmitNodeCollectorExtension {
    private final Int2ObjectAVLTreeMap<class07937> N = new Int2ObjectAVLTreeMap();

    public Int2ObjectAVLTreeMap<class07937> L() {
        return this.N;
    }

    public void y() {
        this.N.values().removeIf(class079372 -> !class079372.m());
        this.N.values().forEach(class07937::s);
    }

    public class07937 N(int n2) {
        return (class07937)this.N.computeIfAbsent(n2, n -> new class07937(this));
    }

    public void N(class05436 class054362) {
        this.N(0).N(class054362);
    }

    public void N(class01421 class014212, class07311 class073112, class00999 class009992) {
        this.N(0).N(class014212, class073112, class009992);
    }

    public void N(class01421 class014212, class07311 class073112, class08887 class088872, float f, float f2, float f3, int n, int n2, int n3) {
        this.N(0).N(class014212, class073112, class088872, f, f2, f3, n, n2, n3);
    }

    public void N(class01421 class014212, class03662 class036622, int n, int n2, int n3, int[] nArray, List<class02022> list, class07311 class073112, class08915 class089152) {
        this.N(0).N(class014212, class036622, n, n2, n3, nArray, list, class073112, class089152);
    }

    public void N() {
        this.N.values().forEach(class07937::P);
    }

    public void N(class01421 class014212, class08804 class088042) {
        this.N(0).N(class014212, class088042);
    }

    public void N(class01421 class014212, class08800 class088002, Quaternionf quaternionf) {
        this.N(0).N(class014212, class088002, quaternionf);
    }

    public void N(class01421 class014212, float f, float f2, class01028 class010282, boolean bl, class01583 class015832, int n, int n2, int n3, int n4) {
        this.N(0).N(class014212, f, f2, class010282, bl, class015832, n, n2, n3, n4);
    }

    public void N(class01421 class014212, @Nullable class06889 class068892, int n, class00392 class003922, boolean bl, int n2, double d, class06959 class069592) {
        this.N(0).N(class014212, class068892, n, class003922, bl, n2, d, class069592);
    }

    public void N(class01421 class014212, float f, List<class08453> list) {
        this.N(0).N(class014212, f, list);
    }

    public void N(class01421 class014212, class07942 class079422) {
        this.N(0).N(class014212, class079422);
    }

    public void N(class01421 class014212, class00500 class005002, int n, int n2, int n3) {
        this.N(0).N(class014212, class005002, n, n2, n3);
    }

    public void N(class01686 class016862, class01421 class014212, class07311 class073112, int n, int n2, @Nullable class08388 class083882, boolean bl, boolean bl2, int n3, @Nullable class08141 class081412, int n4) {
        this.N(0).N(class016862, class014212, class073112, n, n2, class083882, bl, bl2, n3, class081412, n4);
    }

    public <S> void N(class06271<? super S> class062712, S s, class01421 class014212, class07311 class073112, int n, int n2, int n3, @Nullable class08388 class083882, int n4, @Nullable class08141 class081412) {
        this.N(0).N(class062712, s, class014212, class073112, n, n2, n3, class083882, n4, class081412);
    }

    public void fabric_submitItem(class01421 class014212, class03662 class036622, int n, int n2, int n3, int[] nArray, List list, class07311 class073112, class08915 class089152, MeshView meshView, ItemRenderTypeGetter itemRenderTypeGetter) {
        class07937 class079372 = this.N(0);
        if (class079372 instanceof OrderedSubmitNodeCollectorExtension) {
            ((OrderedSubmitNodeCollectorExtension)class079372).fabric_submitItem(class014212, class036622, n, n2, n3, nArray, list, class073112, class089152, meshView, itemRenderTypeGetter);
        } else {
            class079372.N(class014212, class036622, n, n2, n3, nArray, list, class073112, class089152);
        }
    }

    public void submitBlock(class01421 class014212, class00500 class005002, int n, int n2, int n3, class07295 class072952, class07209 class072092) {
        this.N(0).submitBlock(class014212, class005002, n, n2, n3, class072952, class072092);
    }

    public void submitBlockStateModel(class01421 class014212, Function function, class08887 class088872, float f, float f2, float f3, int n, int n2, int n3, class07295 class072952, class07209 class072092, class00500 class005002) {
        this.N(0).submitBlockStateModel(class014212, function, class088872, f, f2, f3, n, n2, n3, class072952, class072092, class005002);
    }
}

