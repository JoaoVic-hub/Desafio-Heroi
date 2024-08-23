public class main{
    public static void main(String[] args) {
        int xp = 1000;
        String nomeHeroi = "Kleber";

        if(xp <= 1000){
            System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Ferro");
        }else if(xp > 1000 && xp <= 2000){
            System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Bronze");
        }else if(xp > 2000 && xp <= 5000){
            System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Prata");

        }else if(xp > 5000 && xp <= 7000){
            System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Ouro");

        }else if(xp > 7000 && xp <= 8000){
            System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Platina");

        }else if(xp > 8000 && xp <= 9000){
            System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Ascendente");

        }else if(xp > 9000 && xp <= 10000){
            System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Imortal");

        }else if(xp > 10000){
            System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Radiante");

        }
    }
}