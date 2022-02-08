package edu.poniperro.mollap.intercepting.administrador;

import edu.poniperro.mollap.intercepting.filtres.Filtre;
import edu.poniperro.mollap.intercepting.targets.*;
import edu.poniperro.mollap.intercepting.filtres.*;

public class ProgramadorTasques {

    private Tasques tasques;

    public ProgramadorTasques(Target target) {
        tasques = new Tasques();
        tasques.setTarget(target);
    }

    public Tasques getTasques() {
        return tasques;
    }

    public void setTasca(Filtre tasca) {
        getTasques().afegirTasca(tasca);
    }

    public void executarTasques(String missatge) {
        tasques.execucio(missatge);
    }
}
