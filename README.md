---

# moneyConvertor

Ce code Java permet de créer une fenêtre d'application graphique contenant des champs de texte et des boutons pour convertir des euros en dollars et vice versa. Lorsque l'utilisateur entre une valeur dans l'un des champs de texte et clique sur l'un des boutons de conversion, le montant converti est affiché dans l'autre champ de texte. Le code utilise la classe JFrame pour créer la fenêtre, les classes JLabel, JTextField et JButton pour créer les étiquettes, les champs de texte et les boutons, respectivement, et la classe Dimension pour définir la taille de certains de ces éléments.

La classe `moneyConvertor` est une implémentation Java simple d'un convertisseur de devise. Elle permet de convertir des euros européens (EURO) en dollars américains (USD) et vice versa.

## Utilisation

Pour utiliser cette classe, vous devez d'abord l'inclure dans votre code Java en utilisant l'instruction `import` suivante :

```
import moneyConvertor;
```

Ensuite, vous pouvez créer une instance de la classe `moneyConvertor` en appelant son constructeur :

```
moneyConvertor converter = new moneyConvertor();
```

Pour afficher la fenêtre de l'application, appelez la méthode `converter()` sur l'instance créée :

```
converter.converter();
```

Vous pouvez ensuite utiliser l'application en entrant les valeurs à convertir dans les champs de texte, puis en cliquant sur les boutons "Euro" ou "Dollar" pour effectuer la conversion.

## Limitations

La classe moneyConvertor ne prend pas en charge la conversion d'autres devises que l'EURO et le USD. De plus, les taux de conversion sont hard-codés dans le code et ne peuvent pas être modifiés sans recompiler le programme.


---


# moneyConvertorTest

Ce projet contient une classe de test pour la classe `moneyConvertor`, qui permet de convertir des montants en euros en dollars et vice versa.

## Prérequis

- Java 8 ou une version ultérieure
- Un environnement de développement Java tel que Eclipse ou IntelliJ IDEA
- Le framework de test unitaire JUnit 5

## Exécution des tests

Pour exécuter les tests de la classe `moneyConvertorTest`, suivez les étapes ci-dessous :

1. Téléchargez ou clonez ce dépôt Git sur votre ordinateur.
2. Ouvrez le projet dans votre environnement de développement Java.
3. Assurez-vous que JUnit 5 est configuré dans votre projet.
4. Sélectionnez la classe de test `moneyConvertorTest` et cliquez sur l'option "Exécuter les tests".

Les résultats des tests s'afficheront dans la fenêtre "Sortie".

## Contribuer

Si vous souhaitez contribuer à ce projet, veuillez suivre les étapes ci-dessous :

1. Forkez ce dépôt sur votre compte GitHub.
2. Clonez le dépôt sur votre ordinateur.
3. Créez une nouvelle branche pour effectuer vos modifications.
4. Effectuez vos modifications et committez vos changements.
5. Poussez vos changements sur votre dépôt GitHub.
6. Créez une pull request pour soumettre vos modifications à ce dépôt.

---
