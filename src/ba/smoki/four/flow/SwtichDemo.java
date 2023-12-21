package ba.smoki.four.flow;

import javax.swing.*;

public class SwtichDemo {
    public static void main(String[] args) {
        String unos = JOptionPane.showInputDialog("Unesi redni broj dana u sedmici");
        int weekDayNumber = Integer.parseInt(unos);
        String weekDayName;

        switch (weekDayNumber) {
            case 1:
                weekDayName = "Lundi";
                break;
            case 2:
                weekDayName = "Mardi";
                break;
            case 3:
                weekDayName = "Mercredi";
                break;
            case 4:
                weekDayName = "Jeudi";
                break;
            case 5:
                weekDayName = "Vendredi";
                break;
            case 6:
                weekDayName = "Samedi";
                break;
            case 7:
                weekDayName = "Dimanche";
                break;
            default:
                weekDayName = "Non trouver";
        }
        JOptionPane.showMessageDialog(null, weekDayName);
    }
}
