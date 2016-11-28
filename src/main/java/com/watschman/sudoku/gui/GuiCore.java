package main.java.com.watschman.sudoku.gui;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Created by Steve on 28.11.2016.
 */
public class GuiCore extends JPanel implements PropertyChangeListener{
    private GuiCore(){
        super(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(40, 160, 80, 160));
    }
    //Algorithmus zum erstellen des Fensters
    public static void createGui(String guiName){
        JFrame jFrame = new JFrame(guiName);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.add(new GuiCore());
        jFrame.setVisible(true);
        jFrame.pack();
    }
    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }
}