package com.projetEbilleterie.ebilleterie.domain.exception;

import java.util.HashSet;
import java.util.Set;

public class MyAppTicketException extends RuntimeException {

    private Set<String> codeErreurs = new HashSet<>();
    public MyAppTicketException(String codeErreur) {
        this.codeErreurs.add(codeErreur);
    }
    public MyAppTicketException(Set<String> codeErreurs) {
        this.codeErreurs = codeErreurs;
    }
    public Set<String> getCodeErreurs() {
        return codeErreurs;
    }
}
