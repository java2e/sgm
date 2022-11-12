package com.sigorta.service;

import com.sigorta.model.Acenta;

import java.util.ArrayList;
import java.util.List;

public class AcentaService implements Service<Acenta> {

    public List<Acenta> liste;

    public AcentaService() {
        liste = new ArrayList<>();
    }

    @Override
    public Acenta kaydet(Acenta model) {
        int size = liste.size();
        model.setId(size+1);
        liste.add(model);
        return model;
    }

    @Override
    public List<Acenta> getList() {
        return liste;
    }

    // kaydet
    // listele   silme guncelleme
}
