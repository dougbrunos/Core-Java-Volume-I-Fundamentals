**Exercício 1 – Classe BankAccount**
Implemente uma classe BankAccount com os seguintes requisitos:

- Atributos privados: balance (double).
- Construtor que recebe o saldo inicial.
- Métodos:
    - deposit(double amount) → adiciona ao saldo.
    - withdraw(double amount) → subtrai do saldo se houver fundos.
    - getBalance() → retorna o saldo atual.
- Crie um programa de teste (main) que:
    - Abra uma conta com saldo de 1000.
    - Faça um depósito de 500.
    - Retire 200.
    - Mostre o saldo final.

**Exercício 2 – Classe Employee**
Crie a classe Employee com:

- Atributos privados: name (String), salary (double), hireDay (LocalDate).
- Construtor que inicializa os atributos.
- Métodos:
    - raiseSalary(double byPercent) → aumenta o salário pela porcentagem.
    - getName(), getSalary(), getHireDay().
- Teste no main criando 2 funcionários, dê um aumento de 10% e exiba os dados.


**Exercício 3 – Classe Counter (static fields)**
Implemente a classe Counter:

- Cada objeto Counter possui um id único.
- Use um campo estático nextId para gerar ids sequenciais.
- Construtor deve atribuir automaticamente o id.
- Método getId().
- Método estático getNextId() que retorna o próximo id a ser atribuído.
- Crie 3 objetos e mostre os ids para verificar se funcionou.