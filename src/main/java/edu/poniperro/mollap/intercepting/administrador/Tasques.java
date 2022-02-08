package edu.poniperro.mollap.intercepting.administrador;

import edu.poniperro.mollap.intercepting.filtres.*;
import edu.poniperro.mollap.intercepting.targets.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Tasques {

    private List<Filtre> tasques = new ArrayList<>();
    private Optional<Target> target;

    public List<Filtre> getTasques() {
        return tasques;
    }

    public Optional<Target> getTarget() {
        return target;
    }

    public void afegirTasca(Filtre tasca) {
        getTasques().add(tasca);
    }

    public void execucio(String missatge) {
        getTasques().forEach(item -> item.execucio(missatge));
        if (getTarget().isPresent()) {
            getTarget().get().execucio(missatge);
        } else {
            // target sense afegir al sistema
        }
    }

    public void setTarget(Target target) {
        this.target = Optional.ofNullable(target);
    }
}
