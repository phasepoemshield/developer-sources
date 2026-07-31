package sky.core.ui.gui.click.component;

public abstract class SettingElement extends GuiComponent {
    public abstract boolean isVisible();

    public float computeHeight(float width) {
        return this.height;
    }
}
