import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class moneyConvertorTest {

    // Teste si la conversion d'un montant en euros en dollars retourne la valeur attendue
    @Test
    public void testConvertEuroToUsd() {
        // Création d'un objet moneyConvertor
        moneyConvertor converter = new moneyConvertor();

        // Conversion d'un montant en euros en dollars
        double convertedAmount = converter.convertEuroToUsd(10);

        // Vérification si la valeur convertie correspond à la valeur attendue
        assertEquals(10.535, convertedAmount, 1);
    }

    // Teste si la conversion d'un montant en dollars en euros retourne la valeur attendue
    @Test
    public void testConvertUsdToEuro() {
        // Création d'un objet moneyConvertor
        moneyConvertor converter = new moneyConvertor();

        // Conversion d'un montant en dollars en euros
        double convertedAmount = converter.convertUsdToEuro(10);

        // Vérification si la valeur convertie correspond à la valeur attendue
        assertEquals(9.49, convertedAmount, 1);
    }

    // Teste si la méthode convert() lève une exception si un montant négatif est fourni en entrée
    @Test
    public void testConvertWithNegativeAmount() {
        // Création d'un objet moneyConvertor
        moneyConvertor converter = new moneyConvertor();

        // Conversion d'un montant négatif en euros en dollars
        assertThrows(IllegalArgumentException.class, () -> converter.convertEuroToUsd(-10));

        // Conversion d'un montant négatif en dollars en euros
        assertThrows(IllegalArgumentException.class, () -> converter.convertUsdToEuro(-10));
    }
}
