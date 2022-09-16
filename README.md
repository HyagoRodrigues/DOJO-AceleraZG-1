# Desafio DOJO Acelera ZG - Aprimorar o controle de um portão 

  
 ## Para executar o projeto
  - Faça o clone do repositório;
  - Certifique-se que a SDK esteja devidamente configurada;
  - Execute o arquivo Main.Groovy que se encontra na pasta src/
  - o terminal pedirá para digitar a entrada de comandos do controle e então lhe retornará o resultado:
    ![image](https://user-images.githubusercontent.com/79982237/190728030-efdc9ab8-43d3-4f96-b1d6-9dfc66c54808.png)



## Especificações:
- O estado inicial da porta é sempre fechado;
- Controle: O controle remoto possui exatamente um botão, com o seguinte comportamento ao ser acionado:
  - Se a porta estiver fechada começa a abrir. Caso esteja aberta, começa a fechar;
  - O curso de abertura ou fechamento completo dura 5 segundos;
  - Durante o processo, acionar o botão pausa o movimento, acionar novamente retorna o movimento na mesma direção.
- Detector de obstáculos: por segurança, o portão foi equipado com tal dispositivo. O funcionamento é o seguinte:
  - Quando a porta detecta um obstáculo, ela deve imediatamente realizar a seguinte ação:
    - Inverter o sentido do movimento caso esteja fechando.
## Comandos de entrada:

#### A entrada do programa será uma String em que cada caractere representa o evento ocorrido em um segundo, sendo os seguintes possíveis caracteres:
  - ‘.’  nenhum evento
  - ‘P’ botão pressionado
  - ‘O’ Obstáculo detectado
  
Por exemplo, ‘..P....’ significa que nada aconteceu por 2 segundos, então O botão foi pressionado, o portão começou a se mover e não houve nenhum outro evento a seguir.

## Resultados a serem apresentados na Saída:
#### A saída do programa será uma string onde cada caractere representa a posição da porta em cada segundo do movimento, a regra é a seguinte:
- Uma contagem no intervalo 0 a 5:
  - 0 significa totalmente fechada;
  - 5 totalmente aberta;
- A porta começa a se mover assim que o botão é acionado;
- Exemplo: 
  - Entrada: ‘..P...O.....’
  - Saída: ‘001234555555’
  
  
  #### Hyago Rodrigues

