package edu.poniperro.mollap.intercepting.clients;

import edu.poniperro.mollap.intercepting.administrador.ProgramadorTasques;

public interface Client {
    public void setProgramadorTasques(ProgramadorTasques programador);

    public void enviarPeticio(String peticion);
}
