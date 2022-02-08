package edu.poniperro.mollap.intercepting.clients;

import edu.poniperro.mollap.intercepting.administrador.ProgramadorTasques;

public class Mollapp implements Client {
    private ProgramadorTasques programador;

    @Override
    public void setProgramadorTasques(ProgramadorTasques programador) {
        this.programador = programador;
    }
    @Override
    public void enviarPeticio(String id) {
        programador.executarTasques(id);
    }
}
