public class PhoneImpl implements Phone {

    @Override
    public void answerCall() {
        // TODO Auto-generated method stub
        System.out.println("Um numero desconhecido esta te ligando...");
        System.out.println("Deseja atender ou dispensar ?");
        System.out.println("1 - Atender");
        System.out.println("2 - dispensar");
        
    }

    @Override
    public void makeCall(String number) {
        // TODO Auto-generated method stub
        System.out.println("Ligando para o numero: "+ number+"...");
        System.out.println("Chamada bem sucedida!");
        
    }

    @Override
    public void startVoiceMail() {
        // TODO Auto-generated method stub
        System.out.println("Correio de voz iniciado !");
        
    }

    
    
}
