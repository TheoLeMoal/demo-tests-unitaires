import org.junit.Test;
import static org.junit.Assert.*;
import fr.diginamic.enumerations.Saison;
public class SaisonTest {

    @Test
    public void testValueOfLibelle_NominalCase() {
        String libelle = "Printemps";
        Saison saison = Saison.valueOfLibelle(libelle);
        assertEquals(Saison.PRINTEMPS, saison);
    }

    @Test
    public void testValueOfLibelle_NonExistingLibelle() {
        String libelle = "Été";
        Saison saison = Saison.valueOfLibelle(libelle);
        assertNull(saison);
    }

    @Test
    public void testValueOfLibelle_NullLibelle() {
        String libelle = null;
        Saison saison = Saison.valueOfLibelle(libelle);
        assertNull(saison);
    }

    @Test
    public void testValueOfLibelle_EmptyLibelle() {
        String libelle = "";
        Saison saison = Saison.valueOfLibelle(libelle);
        assertNull(saison);
    }
}