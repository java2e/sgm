package com.sigorta.service;

import com.sigorta.model.MusteriSigorta;

import java.util.ArrayList;
import java.util.List;

public class MusteriSigortaService implements Service<MusteriSigorta> {

    public List<MusteriSigorta> liste;

    public MusteriSigortaService(){
        liste =new ArrayList<>();
    }

    @Override
    public MusteriSigorta kaydet(MusteriSigorta model) {

        int size = liste.size();
        model.setId(size+1);
        liste.add(model);
        return model;
    }

    @Override
    public List<MusteriSigorta> getList() {
        return liste;
    }


}
