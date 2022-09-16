class Portao{
    static void controle(entrada){
        String[] strArray = null;
        strArray = entrada.split("");
        boolean estadoPortao = false;
        boolean pausado = false;
        int contador = 0;

        for (int i = 0; i < strArray.length; i++) {
            switch (strArray[i]) {
                case ".":
                    if (pausado) {
                        contador;
                    } else if (estadoPortao && contador > 0 && contador < 5) {
                        contador++;
                    } else if (!estadoPortao && contador > 0 && contador < 5) {
                        contador--;
                    }
                    println contador;
                    break;
                case "P":
                    estadoPortao = !estadoPortao;
                    if (contador === 0 && estadoPortao) {
                        contador++;
                    } else if (contador === 5 && !estadoPortao) {
                        contador--;
                    } else if (contador !== 0 || contador !== 5) {
                        pausado = !pausado;
                        if (pausado) {
                            contador;
                        } else if (!pausado && estadoPortao) {
                            contador++
                        } else if (!pausado && !estadoPortao) {
                            contador--;
                        }
                    }
                    println contador;
                    break;
                case "O":
                    if (contador > 0 && contador < 5) {
                        contador++
                    }
                    estadoPortao = true;
                    println contador;
                    break;
                default:
                    println ""
            }
        }
    }
}

