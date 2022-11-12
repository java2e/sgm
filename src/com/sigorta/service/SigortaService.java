package com.sigorta.service;

import com.sigorta.model.Sigorta;

import java.util.ArrayList;
import java.util.List;

public class SigortaService implements Service<Sigorta> {

    public List<Sigorta> liste;
    public SigortaService()
    {
        liste = new ArrayList<>();
    }
    @Override
    public Sigorta kaydet(Sigorta model) {

        int size = liste.size();
        model.setId(size+1);
        liste.add(model);
        return model;
    }

    @Override
    public List<Sigorta> getList() {
        return liste;

    }
}
