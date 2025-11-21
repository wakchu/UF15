package com.azienda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testaDipendente(){
        Dipendente d1 = new Dipendente("Luca", "Rossi", Ruolo.DIPENDENTE, 25000);
        assertEquals("Luca", d1.getNome());
        d1.setNome("Giorgio");
        assertEquals("Giorgio", d1.getNome());
        assertEquals("Rossi", d1.getCognome());
        assertEquals(Ruolo.DIPENDENTE, d1.getRuolo());
        assertEquals(25000, d1.getRal());
    }

    @Test
    public void testaRuolo(){
        assertEquals(Ruolo.DIPENDENTE, Ruolo.valueOf("DIPENDENTE"));
        assertEquals(Ruolo.AMMINISTRATORE, Ruolo.valueOf("AMMINISTRATORE"));
    }
}
