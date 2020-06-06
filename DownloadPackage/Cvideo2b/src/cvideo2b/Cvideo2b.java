package cvideo2b;

public class Cvideo2b {

    public static void main(String[] args) {
       
        /*
        
       Caneta c1 = new Caneta();
       c1.modelo = "Bic";
       c1.cor = "Azul";
       c1.setPonta(0.5f); //c1.ponta = 0.5f; ERROR
       c1.carga = 5;    // NO ERROR because it is inside a class that uses "Caneta" class"
       c1.tampar();     // NO ERROR because "tampar()" is public //c1.tampada = false; ERROR because "tampada" is private
       c1.status();
       c1.rabiscar();
       
        System.out.println("------------------------------------------");
      
       Caneta c2 = new Caneta();
       c2.modelo = "Parker";
       c2.cor = "Vermelha";
       c2.setPonta(0.7f);
       c2.carga = 10;
       c2.destampar();
       c2.status();
       c2.rabiscar();
       
        System.out.println("------------------------------------------");
        
       Caneta c3 = new Caneta();  
       c3.modelo = "Tom Ford";
       c3.cor = "Preta";
       c3.setPonta(0.9f);
       c3.carga = 15;
       c3.destampar();
       c3.status();
       c3.rabiscar();
       
        System.out.println("-----------------------------------------");
        
        Caneta c4 = new Caneta("Mont Blanc", "Azul", 0.75f, 2);
        c4.status();
        
        System.out.println("-----------------------------------------");
        
        Caneta c5 = new Caneta();
        c5.setCor("Verde");
        c5.status();
        
        */
       //-----------------------------------------------------------------
       /*
       ContaBanco c1 = new ContaBanco(1, "Kevin");
       c1.abrirConta("cp");
       c1.printStatus();
       c1.depositar(20);
       c1.printStatus();
       //c1.setStatus(false);
       c1.sacar(100);
       c1.printStatus();
       */
      /* 
       ControleRemoto c1 = new ControleRemoto();
       c1.ligar();
       c1.maisVolume();
       c1.play();
       c1.abrirMenu();
       c1.fecharMenu();
    */
      
  /*  
      Lutador l[] = new Lutador[6];
              
      l[0]= new Lutador("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
//      l[0].apresentar();
//      l[0].status();
      l[1]= new Lutador("Putscript", "Brasil", 29, 1.68f, 58.8f, 14, 2, 3);
//      l[1].apresentar();
//      l[1].status();
      l[2]= new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
//     l[2].apresentar();
//      l[2].status();
      l[3]= new Lutador("DeadCode", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
//      l[3].apresentar();
//      l[3].status();
      l[4]= new Lutador("UF0Cobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
//      l[4].apresentar();
//      l[4].status();
      l[5]= new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
//      l[5].apresentar();
//      l[5].status();
      
      Luta UEC01 = new Luta();
      UEC01.marcarLuta(l[4], l[5]);
      UEC01.lutar();
      
      l[4].status();
      l[5].status();
      */
  
  /*
      Pessoa p[] = new Pessoa[2];
      Livro l[] = new Livro[3];
      
      p[0] = new Pessoa("Pedro", 22, "M");
      p[1] = new Pessoa("Maria", 25, "F");
      
      l[0] = new Livro("Aprendendo Java", "Jose da Silva", 300, p[0]);
      l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 500, p[1]);
      l[2] = new Livro("Java vancado", "Maria Candida", 800, p[0]);
      
      System.out.println(l[0].detalhes());
      
      
      p[0].fazerAniver();
      
      l[0].abrir();
      l[0].folhear(30);
      l[0].avancaPag();

      System.out.println(l[0].detalhes());
      
      System.out.println(l[2].detalhes());
*/
     
    //  Pessoa p1 = new Pessoa();
      Aluno p2 = new Aluno();
      Funcionario p3 = new Funcionario();
      Professor p4 = new Professor();
      
     /* 
      p1.setNome("Pedro");
      p1.setSexo("M");
      p1.setIdade(23);
    */  
     
     /*
      p2.setNome("Maria");
      p2.setSexo("F");
      p2.setIdade(22);
      p2.setCurrso("Informatica");
      p2.setMatr(2376483);
      
      p3.setNome("Claudio");
      p3.setSexo("M");
      p3.setIdade(24);
      p3.setSetor("Estoque");
      p3.setSetor("Diretor");
      p3.setTrabalhando(true);
         
      p4.setNome("Fabiana");
      p4.setSexo("F");
      p4.setIdade(25);
      p4.setSalario(2500.75f);
      p4.setEspecialidadde("Programacao");
      
            
    //    System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
      */
     
     
     /*
     //Animal n = new Animal();
     Mamifero m = new Mamifero();
     Reptil r; r = new Reptil();
     Peixe p;  p = new Peixe();
     Ave a = new Ave();
     
     m.alimentar();
     m.locomover();
     m.emitirSom();
        System.out.println("");
        
     r.alimentar();
     r.locomover();
     r.emitirSom();
        System.out.println("");
     
     p.alimentar();
     p.locomover();
     p.emitirSom();
        System.out.println("");
        
     a.alimentar();
     a.locomover();
     a.emitirSom();
     
        System.out.println("-------------------------------------------------");
     
     Kanguru ka = new Kanguru();
     Cachorro ca = new Cachorro();
     Aguia ag = new Aguia();
     Cobra co = new Cobra();
     GoldFish go = new GoldFish();
     Lobo lo = new Lobo();
     
        System.out.println("-------------- KANGURU -------------");
     ka.setIdade(3);
     ka.setMembros(4);
     ka.setPeso(20);
     ka.setCorPelo("Castanho");
     ka.locomover();
     ka.emitirSom();
     
        System.out.println("-------------- LOBO -------------");
     lo.setIdade(5);
     lo.setMembros(4);
     lo.setPeso(10);
     lo.setCorPelo("branco");
     lo.locomover();
     lo.emitirSom();
     
        System.out.println("----------- CACHORRO ------------");
     ca.setIdade(5);
     ca.setMembros(4);
//     ca.idade = 2;        works because its protected, if it was "private" (on animal class) -> wouldnt work
     ca.setPeso(12);
     ca.setCorPelo("Branco");
     ca.locomover();
     ca.emitirSom();
     ca.reagir("Ola");
     ca.reagir("Vai apanhar");
     ca.reagir(true);
     ca.reagir(false);
     ca.reagir(11,45);
     ca.reagir(21,00);
     ca.reagir(2, 12.5f);
     ca.reagir(17,4.5f);
     
        System.out.println("------------ AGUIA ------------");
     ag.setIdade(3);
     ag.setMembros(2);
     ag.setPeso(7);
     ag.setCorPena("Cinza");
     
        System.out.println("------------- COBRA -------------");
     co.setIdade(2);
     co.setMembros(0);
     co.setPeso(3);
     co.setCorEscama("Verde");
     
        System.out.println("------------- GOLDFISH -------------");
     go.setCorEscama("Laranja");
     go.setIdade(1);
     go.setMembros(0);
     go.setPeso(2);
     */
     
     Video [] v = new Video[3];
     v[0] = new Video("Aula 1 de POO");
     v[1] = new Video("Aula 2 de PHP");
     v[2] = new Video("Aula 3 de HTML5");
     
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
     
    Gafanhoto g[] = new Gafanhoto[2];
    g[0] = new Gafanhoto("Jubileu", 22, "M", "Juba");
    g[1] = new Gafanhoto("Creusa", 12, "F", "Creuzita");
    
        System.out.println("--------------------------------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        System.out.println("--------------------------------------------------");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());
        
    }
   
}
