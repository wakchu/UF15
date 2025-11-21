package com.azienda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

            public interface Filtra<Dipendente> {
            boolean filtra(Dipendente d);
        }
    public static void main(String[] args) {

        List<Dipendente> dipendenti = Arrays.asList(
                new Dipendente("Mario", "Rossi", Ruolo.DIPENDENTE, 30000),
                new Dipendente("Luigi", "Verdi", Ruolo.AMMINISTRATORE, 50000),
                new Dipendente("Giovanni", "Bianchi", Ruolo.DIPENDENTE, 25000),
                new Dipendente("Anna", "Neri", Ruolo.AMMINISTRATORE, 60000)
        );
        Filtra<Dipendente> filtra30k = (d) -> d.getRal() > 30000;
        Filtra<Dipendente> filtraAmministratori = (d) -> d.getRuolo() == Ruolo.AMMINISTRATORE;
        Filtra<Dipendente> filtraDipendenti = (d) -> d.getRuolo() == Ruolo.DIPENDENTE;
        List<Dipendente> dipendentiFiltrati = dipendenti.stream()
                .filter(filtra30k::filtra)
                .sorted(Comparator.comparing(Dipendente::getRal))
                .toList();

        dipendentiFiltrati.forEach(d -> System.out.println(d.getNome() + " " + d.getCognome() + " " + d.getRal()));

       dipendenti.stream()
               .max(Comparator.comparing(Dipendente::getRal))
               .ifPresent(d -> System.out.println("Il dipendente con il RAL più alto è: " + d.getNome() + " " + d.getCognome() + " " + d.getRal()));
        dipendenti.stream()
                .filter(filtraAmministratori::filtra)
                .forEach(d -> System.out.println(d.getNome() + " " + d.getCognome() + " " + d.getRal()));
        dipendenti.stream()
                .filter(filtraDipendenti::filtra)
                .forEach(d -> System.out.println(d.getNome() + " " + d.getCognome() + " " + d.getRal()));
    }
}