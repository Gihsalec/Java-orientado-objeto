package audio.de.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao()>=9){
            System.out.println(audio.getTitulo()+" é considerado um sucesso e preferido por todos");
        } else{ System.out.println(audio.getTitulo()+" é considerado uma ótima opção");}
    }
}
