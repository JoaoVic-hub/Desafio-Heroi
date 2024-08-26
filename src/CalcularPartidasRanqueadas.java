class CalcularPartidasRanqueadas{
    public static void main(String[] args) {
        qualRank(2000, 5);
    }
    public static void qualRank(int vitorias, int derrotas){
        int saldo = vitorias - derrotas;

        if(saldo < 10){
            System.out.println("O Herói tem de saldo de " + saldo + " está no nível de Ferro");
        }else if(saldo > 10 && saldo <= 20){
            System.out.println("O Herói tem de saldo de " + saldo + " está no nível de Bronze");
        }else if(saldo > 20 && saldo <= 50){
            System.out.println("O Herói tem de saldo de " + saldo + " está no nível de Prata");
        }else if(saldo > 50 && saldo <= 80){
            System.out.println("O Herói tem de saldo de " + saldo + " está no nível de Ouro");
        }else if(saldo > 80 && saldo <= 90){
            System.out.println("O Herói tem de saldo de " + saldo + " está no nível de Diamante");
        }else if(saldo > 90 && saldo <= 100){
            System.out.println("O Herói tem de saldo de " + saldo + " está no nível de Lendario");
        }else if(saldo > 100){
            System.out.println("O Herói tem de saldo de " + saldo + " está no nível de Imortal");
        }
    }
}