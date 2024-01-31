package fr.diginamic.utils;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class DemoStringUtils {
	//TODO La classe semble fonctionne mais fonctionne t'elle si bien que ça ??
	//TODO Que se passe t'il si on lui passe des paramètres inattendus.
	//TODO Mettre en place des tests unitaires permettant de vérifier que la classe fonctionne
	//     dans tous les cas
	
    @Test
    public void testLevenshteinDistance() {
        // Test nominal cases
        assertEquals(2, StringUtils.levenshteinDistance("Chine", "Chien"));
        assertEquals(1, StringUtils.levenshteinDistance("Vienne", "Sienne"));
        
        // Test robustness with null parameters
        assertEquals(5, StringUtils.levenshteinDistance(null, "Chien"));
        assertEquals(6, StringUtils.levenshteinDistance("Vienne", null));
        assertEquals(0, StringUtils.levenshteinDistance(null, null));
    }
}
