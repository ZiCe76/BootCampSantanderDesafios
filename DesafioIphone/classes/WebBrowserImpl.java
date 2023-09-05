public class WebBrowserImpl implements WebBrowser {

    @Override
    public void displayPage(String search) {
        System.out.println("Exibindo página: https://www.google.com/search?q=" + search);
    }

    @Override
    public void addTab() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void updatePage() {
        System.out.println("Página atualizada.");
    }

}
