package herenciaPorInterfaces;

public class MusicoEstudiante implements Musico, Estudiante {
    
        @Override
        public void hablar(){
            System.out.println("Estoy hablando");
        }

        @Override
        public void tocarMusica(){
            System.out.println("Estoy tocando musica");
        }

        @Override
        public void estudiar(){
            System.out.println("Estoy estudiando");
        }







}
