public class Neo extends Personaje implements PuedeHackear, PuedePelear{

    @Override
    public void actuar(){
        System.out.println("Neo actua en la Matrix...");
    }
    @Override
    public void hackearSistema(){
        System.out.println("Neo puede hackear desde cualquier parte de la Matrix y fuera de ella");
    }
    @Override
    public void pelear(){
        System.out.println("Neo pelea con distintas técnicas de combate");
    }
    public void volar(){
        System.out.println("Neo está volando");
    }
}
