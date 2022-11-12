package com.sigorta.service;

import com.sigorta.model.Musteri;

import java.util.ArrayList;
import java.util.List;

public class MusteriService implements Service<Musteri> {

    public List<Musteri> liste;

    public MusteriService() {
        liste = new ArrayList<>();
    }

    @Override
    public Musteri kaydet(Musteri model) {
        int size = liste.size();
        model.setId(size+1);
        liste.add(model);
        return model;
    }

    @Override
    public List<Musteri> getList() {
        return liste;
    }
}
