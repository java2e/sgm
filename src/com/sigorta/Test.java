package com.sigorta;

import com.sigorta.model.Acenta;
import com.sigorta.model.Musteri;
import com.sigorta.model.MusteriSigorta;
import com.sigorta.model.Sigorta;
import com.sigorta.service.AcentaService;
import com.sigorta.service.MusteriService;
import com.sigorta.service.MusteriSigortaService;
import com.sigorta.service.SigortaService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        AcentaService acentaService = new AcentaService();
        Acenta acenta = new Acenta();
        acenta.setAdres("Ankara");
        acenta.setEmail("test@gmail.com");
        acenta.setTelefon("12313123");
        acenta.setVkn("1111111");
        SigortaService sigortaService = new SigortaService();
        for(int i=0;i<5;i++) {
            Sigorta sigorta = new Sigorta();
            sigorta.setAdres("Ankara "+i);
            sigorta.setEmail(i+"sigorta@gmail.com");
            sigorta.setVkn("123112222");
            sigorta.setAdi(i+". Sigorta XX");
            sigorta.setTelefon("5555555555");
            List<String> tipler = new ArrayList<>();
            tipler.add("KASKO");
            tipler.add("TRAFIK");
            tipler.add("SAGLIK");
            sigorta.setSigortaTipleri(tipler);
            sigorta = sigortaService.kaydet(sigorta);
            System.out.println(sigorta);
        }

        acenta.setSigortaListesi(sigortaService.getList());
        acenta = acentaService.kaydet(acenta);

        System.out.println(acenta);

        List<Acenta> liste = acentaService.getList();

        for(Acenta acenta1 : liste)
            System.out.println(acenta1);

        Musteri musteri = new Musteri();
        musteri.setAdi("Java");
        musteri.setSoyadi("Developer");
        musteri.setAdres("İstanbul");
        musteri.setTelefon("055555555");

        MusteriSigorta musteriSigorta = new MusteriSigorta();
        musteriSigorta.setSigorta(sigortaService.getList().get(2));
        musteriSigorta.setAcenta(acenta);
        musteriSigorta.setBaslangicTarihi(new Date());
        musteriSigorta.setBitisTarihi(new Date());
        musteriSigorta.setUcret(5500);

        MusteriSigortaService musteriSigortaService = new MusteriSigortaService();
        musteriSigorta = musteriSigortaService.kaydet(musteriSigorta);

        musteri.setSigortaListesi(musteriSigortaService.getList());

        MusteriService musteriService = new MusteriService();
        musteriService.kaydet(musteri);

        for(Musteri musteri1: musteriService.getList())
            System.out.println(musteri1);

    }
}
