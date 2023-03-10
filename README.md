# SendEmail

SendEmail est un programme Java simple qui permet d'envoyer des emails à l'aide d'un serveur SMTP. Le programme utilise la bibliothèque JavaMail pour créer et envoyer des messages électroniques.

## Configuration

Avant d'utiliser SendEmail, vous devez configurer les paramètres de votre serveur SMTP. Dans le code source, vous devez modifier les variables suivantes pour qu'elles correspondent aux paramètres de votre serveur :

     String to = "destinataire@example.com"; // Adresse e-mail du destinataire
     String from = "expediteur@example.com"; // Adresse e-mail de l'expéditeur
     String host = "smtp.manette.fr"; // Adresse du serveur SMTP
     final String username = "Issa"; // Nom d'utilisateur pour l'authentification SMTP
     final String password = "Password!!"; // Mot de passe pour l'authentification SMTP

Dans cet exemple, le programme est configuré pour utiliser le serveur SMTP smtp.manette.fr avec l'adresse e-mail de l'expéditeur expediteur@example.com et l'adresse e-mail du destinataire destinataire@example.com. Il utilise également l'authentification SMTP avec le nom d'utilisateur Issa et le mot de passe Password!!.

## Utilisation

Pour utiliser SendEmail, vous pouvez le compiler et l'exécuter dans votre environnement de développement Java. Le programme enverra alors un email de test à l'adresse spécifiée dans la variable to.

## License

Ce code est sous licence MIT. Vous pouvez donc l'utiliser et le modifier librement.
