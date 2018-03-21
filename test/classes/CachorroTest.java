package classes;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CachorroTest {
    
    public CachorroTest() {
    }
    
    @Test
    public void testCriarRacaInvalida() {
        Cachorro cachorro = new Cachorro("Rex", 2, "abc");
        
        assertNull("Campo raca deve ser nulo", cachorro.raca);
        assertNotNull("Campo nome nao deve ser nulo", cachorro.raca);
        assertTrue(cachorro.raca == null);
        assertFalse(cachorro.raca != null);
        assertNotEquals("abc", cachorro.raca);
    }
    
    @Test
    public void testCriarLabrador() {
        
    }
    
    @Test
    public void testDadosAoCriarCachorro() {
        Cachorro cachorro = new Cachorro("Rex", 2, "Pug");
        
        assertEquals("Nome do cachorro deve ser Rex", "Rex", cachorro.nome);
        assertEquals("O cachorro deve ter 2 anos", 2, cachorro.idade);
        assertEquals("Raca do cachorro deve ser Pug", "Pug", cachorro.raca);
    }
}
