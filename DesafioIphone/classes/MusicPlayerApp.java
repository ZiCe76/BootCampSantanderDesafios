import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.*;

public class MusicPlayerApp extends JFrame implements ActionListener {

    private JButton playButton;
    private JButton pauseButton;
    private JComboBox<String> songComboBox;
    private Clip currentClip;

    public MusicPlayerApp() {
        setTitle("Music Player");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Criando os botões e o ComboBox
        playButton = new JButton("Play");
        playButton.addActionListener(this);

        pauseButton = new JButton("Pause");
        pauseButton.addActionListener(this);

        String[] songOptions = {"fantasy", "40000k", "Song 3"};
        songComboBox = new JComboBox<>(songOptions);
        
        // Criando o painel de controle e adicionando componentes
        JPanel controlPanel = new JPanel();
        controlPanel.add(playButton);
        controlPanel.add(pauseButton);
        controlPanel.add(songComboBox);

        // Adicionando o painel de controle à janela
        add(controlPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == playButton) {
            playSelectedSong();
        } else if (e.getSource() == pauseButton) {
            pauseCurrentSong();
        }
    }

    private void playSelectedSong() {
        if (currentClip != null && currentClip.isRunning()) {
            currentClip.stop(); // Para a música em execução, se houver
        }

        String selectedSong = (String) songComboBox.getSelectedItem();

        try {
            File audioFile = new File("C:\\Users\\ZiCe\\Documents\\VisualCode Projetos\\java\\Curso java\\bootCampSantander\\DesafioIphone\\Testes\\" + selectedSong + ".wav"); // Coloque o caminho da pasta onde tem as musicas
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
            currentClip = AudioSystem.getClip(); // Cria um clip para tocar a musica
            currentClip.open(audioInputStream); // Abre a musica no clip
            currentClip.start(); // Inicia a musica
        } catch (Exception ex) {
            ex.printStackTrace(); // Imprime detalhes de erros se tiver algum
        }
    }

    private void pauseCurrentSong() {
        if (currentClip != null && currentClip.isRunning()) {
            currentClip.stop(); // Pausa a musica
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MusicPlayerApp musicPlayer = new MusicPlayerApp();
            musicPlayer.setVisible(true); // Torna o panel visivel
        });
    }
}
