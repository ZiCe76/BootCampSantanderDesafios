import javax.swing.SwingUtilities;

public class AppleiPhone implements MusicPlayer, Phone, WebBrowser {

    public MusicPlayer player;
    private Phone phone;
    private WebBrowser browser;

    public AppleiPhone() {
        player = new MusicPlayerImpl();
        phone = new PhoneImpl();
        browser = new WebBrowserImpl();
    }

    public void selectMusic() {
        SwingUtilities.invokeLater(() -> {
            MusicPlayerApp musicPlayer = new MusicPlayerApp();
            musicPlayer.setVisible(true);
        });
    }

    public void startPhone() {
        System.out.println("Deseja:");
        System.out.println("1 - Fazer uma ligacao");
        System.out.println("2 - Atender uma ligacao");
        System.out.println("3 - Iniciar um correio de voz");
    }

    public void makeCall(String number) {
        phone.makeCall(number);
    }

    public void answerCall() {
        phone.answerCall();
    }

    public void startVoiceMail() {
        phone.startVoiceMail();
    }

    public void openChrome() {
        System.out.println("Deseja abrir uma nova aba ?");
        System.out.println("1 - Abrir nova aba");
        System.out.println("2 - Fechar app");
    }

    public void displayPage(String url) {
        browser.displayPage(url);
    }

    public void addTab() {
        browser.addTab();
    }

    public void updatePage() {
        browser.updatePage();
    }

    
}
