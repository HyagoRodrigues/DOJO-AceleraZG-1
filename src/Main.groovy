static void main(String[] args) {
        println "Digite a Entrada: "
        //String entrada = "..P...O.....";
        String entrada = System.in.newReader().readLine();
        Portao.controle(entrada);
}