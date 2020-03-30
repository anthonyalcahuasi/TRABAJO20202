package Graficador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(programa.grafbutton)) {
            programa.actualizargrafica();
        }

    }

}
