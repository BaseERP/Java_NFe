package br.com.samuelweb.nfe.util.validators.impl;

import br.com.samuelweb.nfe.util.model.DI;
import br.com.samuelweb.nfe.util.validators.RetornoValidar;
import br.com.samuelweb.nfe.util.validators.ValidadorCampo;

public class ValidarDIRE implements ValidadorCampo<String, DI> {
    @Override
    public RetornoValidar validar(String valor, DI parent) {
        //todo implementar
        return new RetornoValidarImpl(true);
    }
}
