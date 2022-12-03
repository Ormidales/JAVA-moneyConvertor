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
