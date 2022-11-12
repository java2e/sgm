package com.sigorta;

import com.sigorta.model.Acenta;
import com.sigorta.service.AcentaService;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        AcentaService acentaService = new AcentaService();
        Acenta acenta = new Acenta();
        acenta.setAdres("Ankara");
        acenta.setEmail("test@gmail.com");
        acenta.setTelefon("12313123");
        acenta.setVkn("1111111");

        acenta = acentaService.kaydet(acenta);

        System.out.println(acenta);

        List<Acenta> liste = acentaService.getList();

        for(Acenta acenta1 : liste)
            System.out.println(acenta1);

    }
}
