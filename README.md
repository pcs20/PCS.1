# PCS.1
Projeto app

------------------------------------------------------//CLASSE RODADA//-------------------------------------------------------------------------------------
public class Rodada {

    //int SorteaEstadoPais[] = new int[255];

    public ArrayList<Integer> SorteaEstadoPais = new ArrayList<Integer>();//vai armazena um valor para ser jogado no vetor da classe Estados para gerar minha imagem do mapa
    public int randomNum;

    public boolean verificaLista(int verifica) {//verifica se o valor gerado pela função QuestRandInt já existe ou não na lista SorteaEstadoPais. Se não existir, ele inclui na lista
        if (SorteaEstadoPais.contains(verifica)) {
            return false;
        } else {
            SetList(verifica);
        }
        return true;
    }

    public void ClearList() {//apaga lista, pois, o usuário pode optar por jogar novamente e é preciso que a lista esteja vazia a cada rodada
        SorteaEstadoPais.clear();
    }

    public void SetList(int val) {//inclui valores na lista
        SorteaEstadoPais.add(val);
    }

    public boolean ListaCheia(int max) {//verifica se a lista está cheia
        if (SorteaEstadoPais.size() == max) {
            return true;
        } else {
            return false;
        }
    }

    public int QuestRandInt(int min, int max) {// gera um número aleatório entre 0 e 14 por exemplo para os estados que só existem 15 opções
        java.util.Random rand = new java.util.Random();
        randomNum = rand.nextInt((max - min) + 1) + min;

        while (!verificaLista(randomNum)) {
            randomNum = rand.nextInt((max - min) + 1) + min;
        }
        return randomNum;//vai retornar 2
    }
}

------------------------------------------------------//CLASSE QUESTAO//-------------------------------------------------------------------------------------
public class Questão {

    //int answer1, answer2, answer3, answer4, answer5, Resposta;
    public ArrayList<Integer> MyList = new ArrayList<Integer>();//lista responsável por armazenar os valores responsáveis pelas respostas geradas nas radio buttons
    public ArrayList<String> MyListErros = new ArrayList<String>();//lista que armazena o nome de um estado, por exemplo, que o usuário errou
    int acertos=0, erros=0;
    
    public boolean VerificaMyList(int averigua) {//verifica se o valor gerado pela função AnswerRandInt existe na lista MyList. Se não existir, inclui o valor na lista
        if (MyList.contains(averigua)) {
            return false;
        } else {
            SetList(averigua);
            return true;
        }
    }

    public int AnswerRandInt(int min, int max) {//gera um valor aleatorio para a lista de respostas possíveis 
        java.util.Random rand = new java.util.Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;

        while (!VerificaMyList(randomNum)) {
            randomNum = rand.nextInt((max - min) + 1) + min;
        }
        return randomNum;
    }

    public void SetListaErros(String estado) {
        MyListErros.add(estado);
    }
    
    public void SetList(int val) {
        MyList.add(val);
    }
    
    public void ClearMyList() {//se o jogador desejar jogar novamente ou mesmo em outro modo de jogo, é nessário que os valores dá lista estejam vazios
        MyList.clear();
    }

    public void GetListaErros() {
        System.out.println("Errados: " + MyListErros);//retornar o nome de estados, por exemplos, que o usuário errou
    }

    public int GetAcertos() {
        return acertos;
    }
    
    public int GetErros() {
        return erros;
    }

    public void SetAcertos(int valor) {
        this.acertos = valor;
    }

    public void SetErros(int val) {
        this.erros = val;
    }

}
