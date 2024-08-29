class ClasseHeroi{
    public String nome;
    public int idade;
    public String tipo;

    public ClasseHeroi(String nome, int idade, String tipo){
        this.idade = idade;
        this.nome = nome;
        this.tipo = tipo;
    }

    public static void main(String[] args) {
        ClasseHeroi heroi = new ClasseHeroi("Kleber", 30, "Mago");
        ClasseHeroi heroi2 = new ClasseHeroi("Klebilson", 30, "Guerreiro");
        ClasseHeroi heroi3 = new ClasseHeroi("Klebinho", 30, "Monge");
        ClasseHeroi heroi4 = new ClasseHeroi("Klebao", 30, "Ninja");

        if(heroi.tipo == "Mago"){
            System.out.println(heroi.tipo + " o atacou usando magia");
        }else if(heroi.tipo == "Guerreiro"){
            System.out.println(heroi.tipo + " o atacou usando espada");
        }else if(heroi.tipo == "Monge"){
            System.out.println(heroi.tipo + " o atacou usando artes marciais");
        }else if(heroi.tipo == "Ninja"){
            System.out.println(heroi.tipo + " o atacou usando shuriken");
        }

        if(heroi2.tipo == "Mago"){
            System.out.println(heroi2.tipo + " o atacou usando magia");
        }else if(heroi2.tipo == "Guerreiro"){
            System.out.println(heroi2.tipo + " o atacou usando espada");
        }else if(heroi2.tipo == "Monge"){
            System.out.println(heroi2.tipo + " o atacou usando artes marciais");
        }else if(heroi2.tipo == "Ninja"){
            System.out.println(heroi2.tipo + " o atacou usando shuriken");
        }

        if(heroi3.tipo == "Mago"){
            System.out.println(heroi3.tipo + " o atacou usando magia");
        }else if(heroi3.tipo == "Guerreiro"){
            System.out.println(heroi3.tipo + " o atacou usando espada");
        }else if(heroi3.tipo == "Monge"){
            System.out.println(heroi3.tipo + " o atacou usando artes marciais");
        }else if(heroi3.tipo == "Ninja"){
            System.out.println(heroi3.tipo + " o atacou usando shuriken");
        }

        if(heroi4.tipo == "Mago"){
            System.out.println(heroi4.tipo + " o atacou usando magia");
        }else if(heroi4.tipo == "Guerreiro"){
            System.out.println(heroi4.tipo + " o atacou usando espada");
        }else if(heroi4.tipo == "Monge"){
            System.out.println(heroi4.tipo + " o atacou usando artes marciais");
        }else if(heroi4.tipo == "Ninja"){
            System.out.println(heroi4.tipo + " o atacou usando shuriken");
        }
    }
}