# Matéria

 - A matéria de programação de computadores 2 - PC2 é lecionada a linguagem de programação Java.

# Materiais base

 - Listas disponibilizadas e aulas.
 
 # Descrição 
 
 ## Trabalho 1
 - Criar uma classe chamada Funcionario, com os atributos matricula (Integer), nome (String), dataDeNascimento (DataPadraoBrasil) e cargo (String).
 - Crie um construtor para a classe Funcionario para receber todos os seus atributos.
 - Crie (sobrescreva) o método toString para exibir a saída do funcionário formatada. 
 - Crie uma classe chamada CadastraFuncionario, com o método main, e use uma das forma de leitura dos dados para ler um funcionário e exibir seus dados na tela.
 
 ## Trabalho 2
 - Crie uma classe chamada Aluno, com os atributos matricula (Integer), nome (String) e data de nascimento. 
 - Crie uma classe chamada CadastraAluno, com o método main, essa classe deverá fazer o seguinte:
   - ler uma lista de aluno fornecida pelo usuário, este deverá digitar a matrícula e o nome do aluno, bem como a a data de nascimento (pode ser dia, mês e ano);
   - o usuário deverá ir digitando alunos e notas até que digite 0 para matrícula;
   - os alunos, fornecidos pelo usuário, deverão ser armazendos em um array;
   - a cada aluno digitado, os seus dados deverão ser mostrados na tela. e)no fim deverá ser mostrado o total de alunos digitados.
 
 ## Trabalho 3
 - Suponha a situação hipotética apresentada a seguir. A faculdade Aluno Feliz deseja automatizar o processo de folha de pagamento de seus professores, que atualmente é feito de forma manual, pois a instituição de ensino possui apenas 10 professores e um curso. A motivação para tal automatização se deve ao fato de que houve aprovação, pelo MEC, de mais 3 cursos, isso implicará na contratação de mais professores, o que dificultará o processo de elaboração da folha. 
 - Crie um programa em Java que resolva o problema acima levando em consideração as informações apresentadas a seguir. 
   - Deverá ser criada uma classe professor, com os seguintes atributos: ctps, nome e formação.
   - Deverá ser criada uma classe contra-cheque, com os seguintes atributos: valor da hora aula e quantidade de hora semanal. Nesta classe deverá ter também um método para calcular o desconto de INSS, outro para calcular o desconto de IRPF, outro para calcular o FGTS e outro para calculara o salário líquido. Para fazer tais métodos, deverá ser levado em consideração as seguintes informações:
     - A remuneração bruta (RB);
     - Calcula-se o desconto do INSS;
     - Calcula-se o desconto do IRPF;
     - A instituição cobra participação docente no pagamento do seguro de vida coletivo (SVC) que atualmente é de 0,2% do RB;
     - A instituição deve recolher, para o FGTS, 8% da RB, sem descontar do Professor;
     - O  salário líquido (SL).
   - Crie uma classe faculdade, executável, que deverá receber como entradas os seguintes dados: dados do professor; valor da hora aula; quantidade de horas por semana; quantidade de dependentes. Essas entradas deverão ser repetidas até que o usuário decida parar de digitar, os dados deverão ser gravados em um array. Ao fim da execução o programa deverá os seguintes dados, de cada ocorrência dentro do array, para o contra- cheque: 
     - Dados do professor;
     - Salário base (SB);
     - DSR (Descanso Semanal Remunerado);
     - ACT (Acordo Coletivo de Trabalho);
     - Adicional Noturno;
     - Desconto do INSS;
     - Desconto de IRPF;
     - Desconto de Seguro de Vida (SVC);
     - Salário Bruto;
     - Salário base para INSS;
     - Salário Base para FGTS;
     - Salário Base para IRPF;
     - Valor do FGTS;
     - Salário líquido.

 ## Trabalho 4
  - Implemente as classes do diagrama a seguir. Crie uma classe Teste, com o método main e, dentro dele, crie o pedido de um livro de forma que mostre o título do livro, o nome do cliente, a data do pedido, o nome do bolconista e o nome do cliente.
  
 ## Trabalho 5
  - Criar um programa que leia um Arquivo com a listagem dos alunos de uma turma e criar um Arquivo novo com as notas que obtiveram em Programação em Java. O programa deverá funcionar da seguinte forma:
    - Pedir ao usuário para introduzir via teclado os nomes do Arquivo de entrada e do Arquivo de saída.
    - Mostrar o conteúdo do Arquivo de entrada (linha a linha), pedindo a cada passo a nota da disciplina de Programação em Java obtida pelo aluno listado.
    - Adicionar a nova informação no Arquivo final.
  - Os arquivos deverão estar no formato apresentado a seguir.

     |Entrada             | Saída                     |
     |:------------------:| :-----------------------: |
     |123 Maria da Silva  | 123 Maria da Silva 8.9    |
     |345 Jõao Manoel     | 345 Jõao Manoel 6.5       |
     |789 Silvia Almeida  | 789 Silvia Almeida 7.2    |
     |...                 | ...                       |
     
  - Na terra do Alberto Alexandre (localmente conhecido por Auexande Aubeto), o dialeto local é semelhante ao português com duas exceções:
    - Não dizem os Rs;
    - Trocam os Ls por Us.
 
 ## Trabalho final
 
  - Criação de uma aplicação Java Desktop completa, usando formulários para entrada de dados, para
cadastrar dados das tabelas Cliente, Hospedagem e Chale.
