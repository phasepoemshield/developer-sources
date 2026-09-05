/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10525
 *  Nursultan.class10528
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogQueues
 *  com.mojang.logging.LogUtils
 *  minecraft.class02796
 *  minecraft.class04784
 *  minecraft.class04788
 *  minecraft.class07980
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10525;
import Nursultan.class10528;
import com.google.common.collect.Lists;
import com.mojang.logging.LogQueues;
import com.mojang.logging.LogUtils;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.FocusListener;
import java.awt.event.WindowListener;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import minecraft.class02796;
import minecraft.class04784;
import minecraft.class04788;
import minecraft.class05623;
import minecraft.class07980;
import org.slf4j.Logger;

public class class05589
extends JComponent {
    private static final Font y = new Font("Monospaced", 0, 12);
    private static final Logger L = LogUtils.getLogger();
    private static final String u = "Minecraft server";
    private static final String i = "Minecraft server - shutting down!";
    private final class05623 R;
    private Thread M;
    private final Collection<Runnable> B = Lists.newArrayList();
    public final AtomicBoolean N = new AtomicBoolean();

    public void L() {
        this.B.forEach(Runnable::run);
    }

    private class05589(class05623 class056232) {
        this.R = class056232;
        this.setPreferredSize(new Dimension(854, 480));
        this.setLayout(new BorderLayout());
        try {
            this.add((Component)this.R(), "Center");
            this.add((Component)this.u(), "West");
        }
        catch (Exception exception) {
            L.error("Couldn't build server GUI", (Throwable)exception);
        }
    }

    private JComponent i() {
        class04788 class047882 = new class04788((class02796)this.R);
        JScrollPane jScrollPane = new JScrollPane((Component)class047882, 22, 30);
        jScrollPane.setBorder(new TitledBorder(new EtchedBorder(), "Players"));
        return jScrollPane;
    }

    private JComponent u() {
        JPanel jPanel = new JPanel(new BorderLayout());
        class04784 class047842 = new class04784((class02796)this.R);
        this.B.add(() -> ((class04784)class047842).N());
        jPanel.add((Component)class047842, "North");
        jPanel.add((Component)this.i(), "Center");
        jPanel.setBorder(new TitledBorder(new EtchedBorder(), "Stats"));
        return jPanel;
    }

    public void y() {
        if (!this.N.getAndSet(true)) {
            this.L();
        }
    }

    public void N(Runnable runnable) {
        this.B.add(runnable);
    }

    public static class05589 N(class05623 class056232) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception exception) {
            // empty catch block
        }
        JFrame jFrame = new JFrame(u);
        class05589 class055892 = new class05589(class056232);
        jFrame.setDefaultCloseOperation(2);
        jFrame.add(class055892);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.addWindowListener((WindowListener)new class10525(class055892, jFrame, class056232));
        class055892.N(jFrame::dispose);
        class055892.N();
        return class055892;
    }

    public void N(JTextArea jTextArea, JScrollPane jScrollPane, String string) {
        if (!SwingUtilities.isEventDispatchThread()) {
            SwingUtilities.invokeLater(() -> this.N(jTextArea, jScrollPane, string));
            return;
        }
        Document document = jTextArea.getDocument();
        JScrollBar jScrollBar = jScrollPane.getVerticalScrollBar();
        boolean bl = false;
        if (jScrollPane.getViewport().getView() == jTextArea) {
            bl = (double)jScrollBar.getValue() + jScrollBar.getSize().getHeight() + (double)(y.getSize() * 4) > (double)jScrollBar.getMaximum();
        }
        try {
            document.insertString(document.getLength(), string, null);
        }
        catch (BadLocationException badLocationException) {
            // empty catch block
        }
        if (bl) {
            jScrollBar.setValue(Integer.MAX_VALUE);
        }
    }

    public void N() {
        this.M.start();
    }

    private JComponent R() {
        JPanel jPanel = new JPanel(new BorderLayout());
        JTextArea jTextArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(jTextArea, 22, 30);
        jTextArea.setEditable(false);
        jTextArea.setFont(y);
        JTextField jTextField = new JTextField();
        jTextField.addActionListener(actionEvent -> {
            String string = jTextField.getText().trim();
            if (!string.isEmpty()) {
                this.R.N(string, this.R.yu());
            }
            jTextField.setText("");
        });
        jTextArea.addFocusListener((FocusListener)new class10528(this));
        jPanel.add((Component)jScrollPane, "Center");
        jPanel.add((Component)jTextField, "South");
        jPanel.setBorder(new TitledBorder(new EtchedBorder(), "Log and chat"));
        this.M = new Thread(() -> {
            String string;
            while ((string = LogQueues.getNextLogEvent((String)"ServerGuiConsole")) != null) {
                this.N(jTextArea, jScrollPane, string);
            }
        });
        this.M.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new class07980(L));
        this.M.setDaemon(true);
        return jPanel;
    }
}

