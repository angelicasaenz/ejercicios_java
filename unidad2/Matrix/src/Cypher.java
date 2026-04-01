public class Cypher extends Personaje implements PuedePelear{

    @Override
    public void actuar(){
        System.out.println("Cypher actua como traidor de la tripulación...");
    }

    @Override 
    public void pelear(){
        System.out.println("Cypher hackea solo desde la nave");
    }

}
