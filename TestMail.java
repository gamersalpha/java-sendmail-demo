import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail {

    public static void main(String[] args) {

        String to = "destinataire@example.com"; // Adresse e-mail du destinataire
        String from = "expediteur@example.com"; // Adresse e-mail de l'expéditeur
        String host = "smtp.manette.fr"; // Adresse du serveur SMTP
        final String username = "Issa"; // Nom d'utilisateur pour l'authentification SMTP
        final String password = "Password!!"; // Mot de passe pour l'authentification SMTP

        // Paramètres de configuration pour le serveur SMTP
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        // Création d'une session SMTP avec authentification
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            // Création du message électronique
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("Test d'envoi de mail");
            message.setText("Ceci est un message de test envoyé depuis Java.");

            // Envoi du message
            Transport.send(message);

            System.out.println("Le message a été envoyé avec succès.");

        } catch (MessagingException e) {
            System.out.println("Erreur lors de l'envoi du message : " + e.getMessage());
        }
    }
}
