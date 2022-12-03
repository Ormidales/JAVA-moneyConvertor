import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class moneyConvertor {
	
	// Constantes pour les taux de conversion
    private static final double EURO_TO_USD = 1.0535;
    private static final double USD_TO_EURO = 0.949;

    public static void converter()
    {
    	// Création d'une fenêtre JFrame
        JFrame frame = new JFrame("Convertisseur Euro/Dollar et Dollar/Euro");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Création de deux étiquettes
        JLabel label1 = new JLabel("Euros :");
        label1.setBounds(20, 40, 60, 30);
        JLabel label2 = new JLabel("Dollars :");
        label2.setBounds(170, 40, 60, 30);

        // Initialisation des champs de texte avec des valeurs par défaut
        JTextField textField1 = new JTextField("0");
        textField1.setBounds(80, 40, 50, 30);
        JTextField textField2 = new JTextField("0");
        textField2.setBounds(240, 40, 50, 30);

        // Création de trois boutons
        JButton button1 = new JButton("Euro");
        button1.setBounds(50, 80, 60, 15);
        button1.setSize(new Dimension(80, 40));
        JButton button2 = new JButton("Dollar");
        button2.setBounds(190, 80, 60, 15);
        button2.setSize(new Dimension(80, 40));
        JButton button3 = new JButton("Fermer");
        button3.setBounds(150, 150, 60, 30);
        button3.setSize(new Dimension(80, 40));
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        // Définition de l'action à effectuer lorsque le bouton INR est cliqué
        button1.addActionListener(e -> {
            // Vérifie si la valeur entrée dans le champ des roupies est un nombre valide
            try {
                // Conversion en double
                double d = Double.parseDouble(textField1.getText());
                // Vérifie si la valeur entrée est positive
                if (d > 0) {
                    // Conversion des roupies en dollars
                    double d1 = (d * EURO_TO_USD);
                    // Formatage de la valeur calculée en chaîne de caractères
                    String str = String.format("%.2f", d1);
                    // Affichage de la valeur calculée dans le champ de texte des dollars
                    textField2.setText(str);
                }
            }
            catch (NumberFormatException ex) {
                // Affichage d'un message d'erreur si la valeur entrée n'est pas un nombre valide
                textField1.setText("ERREUR");
            }
        });

     // Définition de l'action à effectuer lorsque le bouton Dollar est cliqué
        button2.addActionListener(e -> {
            // Vérifie si la valeur entrée dans le champ des dollars est un nombre valide
            try {
                // Conversion en double
                double d2 = Double.parseDouble(textField2.getText());
                // Vérifie si la valeur entrée est positive
                if (d2 > 0) {
                    // Conversion des dollars en roupies
                    double d3 = (d2 * USD_TO_EURO);
                    // Formatage de la valeur calculée en chaîne de caractères
                    String str = String.format("%.2f", d3);
                    // Affichage de la valeur calculée dans le champ de texte des roupies
                    textField1.setText(str);
                }
            }
            catch (NumberFormatException ex) {
                // Affichage d'un message d'erreur si la valeur entrée n'est pas un nombre valide
                textField2.setText("ERREUR");
            }
        });

        // Définition de l'action à effectuer lorsque le bouton Fermer est cliqué
        button3.addActionListener(e -> frame.dispose());

        // Ajout des objets créés à la fenêtre
        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);

        // Configuration de la fenêtre
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        converter();
    }
}