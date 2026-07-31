package pulse.gui.modules;

import java.util.List;
import net.minecraft.client.util.math.MatrixStack;
import pulse.gui.core.GuiLayerRegistry;
import pulse.client.MinecraftContext;
import pulse.module.ClientModule;
import pulse.gui.core.ClickGuiOverlay;
import pulse.gui.core.GuiEntry;
import pulse.gui.core.GuiEntrySource;
import pulse.gui.core.GuiInput;
import pulse.gui.core.PulseClickGuiScreen;
import pulse.gui.widgets.ScrollBar;
import pulse.render.Renderer2D;

public class ModuleGrid implements ClickGuiOverlay {
    private final GuiEntrySource a;
    private static final float b = 19.0f;
    private static final float c = 48.0f;
    private static final float d = 26.0f;
    private static final float e = 6.5f;
    private static final float f = 8.0f;
    private static final float g = 2.0f;
    private float k;
    private float l;
    private float m;
    private float n;
    private int o;
    private int p;
    private boolean q = false;
    private final ScrollBar h = new ScrollBar(6.0f, 25.0f);
    private final ModuleCardList i = new ModuleCardList();
    private final ModuleRowRenderer j = new ModuleRowRenderer();

    public ModuleGrid(GuiEntrySource guiEntrySource) {
        this.a = guiEntrySource;
    }

    public List<ModuleCard> a() {
        return this.i.a();
    }

    private float k() {
        int iF = this.a.f();
        float fD = PulseClickGuiScreen.d() - 38.0f;
        return iF == 1 ? fD - g : ((fD - e) / g) - 1.0f;
    }

    private float c(int i, int i2) {
        return (((int) Math.ceil(((double) i) / ((double) i2))) * 34.0f) - 8.0f;
    }

    @Override
    public void a(MatrixStack MatrixStackVar, Renderer2D renderer2D, float f2, float f3, int i, int i2) {
        this.k = f2;
        this.l = f3;
        this.o = i;
        this.p = i2;
        this.h.a();
        List<? extends GuiEntry> listE = this.a.e();
        if (listE == null || listE.isEmpty()) {
            return;
        }
        int iF = this.a.f();
        float fK = k();
        float f4 = f3 + c;
        float fE = (PulseClickGuiScreen.e() - c) - b;
        float fCeil = (((int) Math.ceil(((double) listE.size()) / ((double) iF))) * 34.0f) - 8.0f;
        if (fCeil < 0.0f) {
            fCeil = 0.0f;
        }
        float fMax = Math.max(0.0f, fCeil - fE);
        float fB = this.h.b();
        if (fB > fMax) {
            this.h.e(fMax);
            fB = fMax;
        }
        float f5 = f4 - fB;
        float f6 = f2 + b;
        float f7 = f4 + fE;
        GuiLayerRegistry.a().a(GuiLayerRegistry.Layer.CONTENT, f2, f4, PulseClickGuiScreen.d(), fE);
        renderer2D.b().a(f2, f4, PulseClickGuiScreen.d(), fE, MatrixStackVar);
        for (int i3 = 0; i3 < listE.size(); i3++) {
            GuiEntry guiEntry = listE.get(i3);
            int i4 = i3 % iF;
            float f8 = f6 + (i4 * (fK + e)) + 1.0f;
            float f9 = f5 + ((i3 / iF) * 34.0f) + 1.0f;
            if (f9 + d >= f4 && f9 <= f7) {
                this.j.a(MatrixStackVar, renderer2D, guiEntry, f8, f9, fK, d, i, i2, false, i4 != 0, false, false);
            }
        }
        renderer2D.b().a(MatrixStackVar);
        if (fCeil > fE + 1.0f) {
            this.h.a(MatrixStackVar, renderer2D, (f2 + PulseClickGuiScreen.d()) - 2.0f, f4, fE, fCeil, fE, i, i2, false);
        }
        this.i.b(MatrixStackVar, renderer2D, this.k, this.l, i, i2, this.m, this.n);
    }

    private void a(MatrixStack MatrixStackVar, Renderer2D renderer2D, List<? extends GuiEntry> list, float f2, float f3, float f4, int i, int i2) {
    }

    private boolean a(List<? extends GuiEntry> list, float f2, float f3, float f4, int i, int i2) {
        if (i2 < f3 || i2 > f3 + f4) {
            return false;
        }
        int iF = this.a.f();
        float fK = k();
        float fB = f3 - this.h.b();
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (GuiInput.a(f2 + ((i3 % iF) * (fK + e)) + 1.0f, fB + ((i3 / iF) * 34.0f) + 1.0f, fK, d, i, i2)) {
                return true;
            }
        }
        return false;
    }

    public void a(MatrixStack MatrixStackVar, Renderer2D renderer2D, int i, int i2) {
        this.i.b(MatrixStackVar, renderer2D, this.k, this.l, i, i2, this.m, this.n);
    }

    public void b() {
        this.i.b();
    }

    public void a(MatrixStack MatrixStackVar, Renderer2D renderer2D) {
    }

    @Override
    public void a(float f2, float f3, int i, int i2) {
        b(f2, f3, i, i2);
    }

    @Override
    public void b(float f2, float f3, int i, int i2) {
        List<? extends GuiEntry> listE;
        this.h.a();
        boolean z = (MinecraftContext.c.currentScreen instanceof PulseClickGuiScreen ? ((PulseClickGuiScreen) MinecraftContext.c.currentScreen).clickBtn : 0) == 1;
        if (this.i.hasOpenPanelAt(i, i2)) {
            if (z) {
                this.i.f();
                return;
            } else {
                this.i.c(i, i2);
                return;
            }
        }
        float f4 = f3 + c;
        float fE = (PulseClickGuiScreen.e() - c) - 5.0f;
        if (i2 < f4 || i2 > f4 + fE || (listE = this.a.e()) == null || listE.isEmpty()) {
            return;
        }
        int iF = this.a.f();
        float fK = k();
        float f5 = f2 + b;
        float fB = f4 - this.h.b();
        for (int i3 = 0; i3 < listE.size(); i3++) {
            GuiEntry guiEntry = listE.get(i3);
            int i4 = i3 % iF;
            float f6 = f5 + (i4 * (fK + e)) + 1.0f;
            float f7 = fB + ((i3 / iF) * 34.0f) + 1.0f;
            if (GuiInput.a(f6, f7, fK, d, i, i2)) {
                float fB2 = ((f6 + fK) - ModuleRowRenderer.b()) - ModuleRowRenderer.a();
                float fB3 = (f7 + 13.0f) - (ModuleRowRenderer.b() / g);
                float fD = (fB2 - ModuleRowRenderer.d()) - ModuleRowRenderer.c();
                float fC = (f7 + 13.0f) - (ModuleRowRenderer.c() / g);
                if (guiEntry.d() && guiEntry.g() && GuiInput.a(fD, fC, ModuleRowRenderer.c(), ModuleRowRenderer.c(), i, i2)) {
                    this.i.a(guiEntry, i3, i4 != 0, f6, f7, fK, d, fD, fC);
                    return;
                } else if (!z) {
                    guiEntry.a(!guiEntry.b());
                    return;
                } else {
                    if (guiEntry.g()) {
                        this.i.a(guiEntry, i3, i4 != 0, f6, f7);
                        return;
                    }
                    return;
                }
            }
        }
        if (z) {
            float fK2 = k();
            float f8 = f2 + b;
            float f9 = f3 + c;
            for (int i5 = 0; i5 < listE.size(); i5++) {
                GuiEntry guiEntry2 = listE.get(i5);
                int i6 = i5 % 2;
                float f10 = f8 + (i6 * (fK2 + e)) + 1.0f;
                float f11 = f9 + ((i5 / 2) * 34.0f) + 1.0f;
                if (GuiInput.a(f10, f11, fK2, d, i, i2)) {
                    if (guiEntry2.g()) {
                        this.i.a(guiEntry2, i5, i6 != 0, f10, f11);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public void c(float f2, float f3, int i, int i2) {
        this.h.d();
        this.i.e(i, i2);
    }

    public void a(float f2, float f3, int i, int i2, double d2, double d3) {
        this.i.a(i, i2, d2, d3);
        if (this.h.c()) {
            List<? extends GuiEntry> listE = this.a.e();
            this.h.a(i2, c(listE.size(), this.a.f()), (PulseClickGuiScreen.e() - c) - 18.0f);
        }
    }

    public void a(float f2) {
        try {
            if (this.i.hasOpenPanelAt(this.o, this.p)) {
                if (this.i.a(f2, this.o, this.p)) {
                    return;
                }
            }
        } catch (Throwable th) {
        }
        try {
            if (this.h.c()) {
                return;
            }
        } catch (Throwable th2) {
        }
        List<? extends GuiEntry> listE = this.a.e();
        if (listE == null || listE.isEmpty()) {
            return;
        }
        int iF = this.a.f();
        this.h.a(f2, c(listE.size(), iF), (PulseClickGuiScreen.e() - c) - b);
    }

    public void a(float f2, int i, int i2) {
        this.o = i;
        this.p = i2;
        a(f2);
    }

    public boolean a(int i, int i2, int i3) {
        return this.i.a(i, i2, i3);
    }

    public boolean a(char c2, int i) {
        return this.i.a(c2, i);
    }

    public boolean c() {
        return this.i.l();
    }

    public void d() {
        this.h.e();
        this.i.i();
    }

    public void e() {
        this.i.i();
    }

    public void f() {
        this.i.j();
    }

    public void g() {
        this.i.g();
    }

    public void h() {
        this.i.h();
    }

    public void i() {
        this.i.k();
    }

    public boolean j() {
        return this.i.c();
    }

    public boolean a(int i, int i2) {
        return this.i.b(i, i2);
    }

    public ModuleCard b(int i, int i2) {
        return this.i.a(i, i2);
    }

    public boolean hasOpenSettingsAt(int i, int i2) {
        return this.i.hasOpenPanelAt(i, i2);
    }

    public ModuleCard findCardByBounds(int i, int i2) {
        return this.i.findCardByBounds(i, i2);
    }

    public void a(ClientModule clientModule) {
        this.i.a(clientModule);
    }

    public static String b(String str, String str2, int i, int i2, int i3, int i4) {
        return null;
    }

    public boolean p() {
        return this.i.l();
    }
}
